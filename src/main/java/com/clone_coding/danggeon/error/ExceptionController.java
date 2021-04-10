package com.clone_coding.danggeon.error;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.util.Objects;

@Slf4j
@ControllerAdvice
public class ExceptionController {
    /**
     * @Valid 유효성 체크에 통과되지 못하면 MethodArgumentNotValidException이 발생한다.
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ValidMessageResponse> methodValidException(MethodArgumentNotValidException e, HttpServletRequest request) {
        log.warn("MethodArgumentNotValidException 발생!! url:{}, trace:{}",request.getRequestURI(), e.getStackTrace());
        ValidMessageResponse errorResponse = makeErrorResponse(e.getBindingResult());
        return new ResponseEntity<ValidMessageResponse>(errorResponse, HttpStatus.BAD_REQUEST);
    }

    private ValidMessageResponse makeErrorResponse(BindingResult bindingResult) {
        String code = "";
        String description = "";
        String detail = "";

        //에러가 있다면
        if (bindingResult.hasErrors()) {
            //DTO에 설정한 message값을 가져온다.
            detail = bindingResult.getFieldError().getDefaultMessage();

            //DTO에 유효성체크를 걸어놓은 어노테이션명을 가져온다.
            String bindResultCode = bindingResult.getFieldError().getCode();

            switch (Objects.requireNonNull(bindResultCode)) {
                case "NotNull" :
                    code = ErrorCode.NOT_NULL.getCode();
                    description = ErrorCode.NOT_NULL.getDescription();
                    break;
                case "NotBlank":
                    code = ErrorCode.NOT_BLANK.getCode();
                    description = ErrorCode.NOT_NULL.getDescription();
                    break;
                case "Pattern":
                    code = ErrorCode.PATTERN.getCode();
                    description = ErrorCode.PATTERN.getDescription();
                    break;
                case "Email":
                    code = ErrorCode.EMAIL.getCode();
                    description = ErrorCode.EMAIL.getDescription();
                    break;
            }
        }
        return new ValidMessageResponse(code,description,detail);
    }

    //Valid에러 메세지를 제외한 다름 메세지
    public ResponseEntity<CustomMessageResponse> error(String errorMessage) {
        HttpStatus status = HttpStatus.BAD_REQUEST;
        CustomMessageResponse errors = new CustomMessageResponse(errorMessage,status.value());
        return ResponseEntity
                .status(status)
                .body(errors);
    }

    public ResponseEntity<CustomMessageResponse> ok(String okMessage) {
        HttpStatus status = HttpStatus.OK;
        CustomMessageResponse errors = new CustomMessageResponse(okMessage,status.value());
        return ResponseEntity
                .status(status)
                .body(errors);
    }
}
