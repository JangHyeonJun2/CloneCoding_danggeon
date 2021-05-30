# 🥕CloneCoding_danggeon

<p align="center">
  당근마켓 클론코딩<br>
  <img src="https://img.shields.io/badge/Java-007396?style=flat-square&logo=Java&logoColor=white"/>
  <img src="https://img.shields.io/badge/SpringBoot-6DB33F?style=flat-square&logo=Spring&logoColor=white"/>
  <img src="https://img.shields.io/badge/React-61DAFB?style=flat-square&logo=react&logoColor=white"/>
  <img src="https://img.shields.io/badge/MySQL-4479A1?style=flat-square&logo=MySQL&logoColor=white"/>
  <img src="https://img.shields.io/badge/Json_Web_Tokens-000000?style=flat-square&logo=Json-Web-Tokens&logoColor=white"/>
  <img src="https://img.shields.io/badge/AmazonS3-569A31?style=flat-square&logo=amazon-s3&logoColor=white"/>
  <img src="https://img.shields.io/badge/aws-232F3E?style=flat-square&logo=amazon-aws&logoColor=white"/>
  <img src="https://img.shields.io/badge/Selenium-orenge?style=flat-square&logo=Selenium&logoColor=white"/>
</p>


## 소개

- 당근마켓을 벤치마킹하여 클론코딩을 진행했습니다.
- 게시글 데이터는 크롤링으로 당근마켓에서 가져오고 있습니다.
- S3를 이용하여 사진을 게시할 수 있습니다.
- 로그인시 게시글 작성, 수정, 프로필을 볼 수 있습니다.

## 영상

[작동영상]: https://hanghae99.spartacodingclub.kr/exhibitions/clone	15조 



## 디렉토리 구조

```tree
├── build
│   ├── bootJarMainClassName
│   ├── classes
│   │   └── java
│   │       ├── main
│   │       │   └── com
│   │       │       └── clone_coding
│   │       │           └── danggeon
│   │       │               ├── DanggeonApplication.class
│   │       │               ├── bcrypt
│   │       │               │   ├── BcryptImpl.class
│   │       │               │   └── EncryptHelper.class
│   │       │               ├── config
│   │       │               │   ├── AuthorizationExtractor.class
│   │       │               │   ├── BearerAuthInterceptor.class
│   │       │               │   ├── WebMVCConfig.class
│   │       │               │   └── WebSocketConfig.class
│   │       │               ├── controller
│   │       │               │   ├── BoardsController.class
│   │       │               │   ├── ChatsController.class
│   │       │               │   ├── ProfileController.class
│   │       │               │   ├── UserLoginController.class
│   │       │               │   ├── UserSignupController.class
│   │       │               │   └── UsernameFindingController.class
│   │       │               ├── dto
│   │       │               │   ├── BoardsRequestDto.class
│   │       │               │   ├── PasswordFindingDto.class
│   │       │               │   ├── UserCheckNameDto.class
│   │       │               │   ├── UserLoginRequestDto.class
│   │       │               │   ├── UserProfileUpdateDto.class
│   │       │               │   ├── UserSignupRequestDto.class
│   │       │               │   └── UsernameFindingDto.class
│   │       │               ├── handler
│   │       │               │   ├── CreateError.class
│   │       │               │   ├── CustomMessageResponse.class
│   │       │               │   ├── JwtTokenProvider.class
│   │       │               │   └── SocketHandler.class
│   │       │               ├── models
│   │       │               │   ├── Boards.class
│   │       │               │   ├── Timestamped.class
│   │       │               │   └── User.class
│   │       │               ├── repository
│   │       │               │   ├── BoardsRepository.class
│   │       │               │   └── UserRepository.class
│   │       │               ├── response
│   │       │               │   └── TokenResponse.class
│   │       │               ├── service
│   │       │               │   ├── BoardsService.class
│   │       │               │   ├── S3Service.class
│   │       │               │   ├── UserImageService.class
│   │       │               │   └── UserService.class
│   │       │               └── utils
│   │       │                   ├── CORSFilter.class
│   │       │                   ├── GetBoards.class
│   │       │                   └── MailUtil.class
│   │       └── test
│   │           └── com
│   │               └── clone_coding
│   │                   └── danggeon
│   │                       ├── DanggeonApplicationTests.class
│   │                       ├── controller
│   │                       │   └── UserLoginControllerTest.class
│   │                       └── service
│   │                           └── UserServiceTest.class

```







