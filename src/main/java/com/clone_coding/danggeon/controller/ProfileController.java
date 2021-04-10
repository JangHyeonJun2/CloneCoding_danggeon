package com.clone_coding.danggeon.controller;

import com.clone_coding.danggeon.dto.UserProfileUpdateDto;
import com.clone_coding.danggeon.error.CustomMessageResponse;
import com.clone_coding.danggeon.models.User;
import com.clone_coding.danggeon.service.S3Service;
import com.clone_coding.danggeon.service.UserImageService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.IOException;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@Transactional(readOnly = true)
public class ProfileController {
    private final UserImageService userImageService;
    private final S3Service s3Service;
    private final String IMAGEPATH = "src/main/resources/static/images/profile/";

    public ProfileController(UserImageService userImageService, S3Service s3Service) {
        this.userImageService = userImageService;
        this.s3Service = s3Service;
    }

    @GetMapping("/api/profile")
    public Object getUserFromToken(HttpServletRequest request) {
        String username = (String) request.getAttribute("username");
        User user = userImageService.findByName(username);
        return user;
    }

    @PostMapping("/api/profile/update")
    @Transactional
    public Object updateUserProfile(HttpServletRequest request, @Valid @ModelAttribute UserProfileUpdateDto userProfileUpdateDto) throws IOException { //프론트에서 토큰을 받아서 사용자 객체 알아야합니다.


        //request요청으로 들어온걸 토큰 인터셉터로 처리를하고 난 다음에 결과물이다.
        String username = (String) request.getAttribute("username");
        User user = userImageService.findByName(username);

        MultipartFile multipartFile = userProfileUpdateDto.getProfile_img();
        String fileName = multipartFile.getOriginalFilename();
        String url = s3Service.upload(multipartFile);


        System.out.println("url = " + url);
        user.setProfile_img(url);
        user.setUsername(userProfileUpdateDto.getUsername());
        user.setEmail(userProfileUpdateDto.getEmail());

        return user;
    }
}

