# ๐ฅCloneCoding_danggeon 2021.04.09 ~ 2021.04.15

<p align="center">
  ๋น๊ทผ๋ง์ผ ํด๋ก ์ฝ๋ฉ<br>
  <img src="https://img.shields.io/badge/Java-007396?style=flat-square&logo=Java&logoColor=white"/>
  <img src="https://img.shields.io/badge/SpringBoot-6DB33F?style=flat-square&logo=Spring&logoColor=white"/>
  <img src="https://img.shields.io/badge/React-61DAFB?style=flat-square&logo=react&logoColor=white"/>
  <img src="https://img.shields.io/badge/MySQL-4479A1?style=flat-square&logo=MySQL&logoColor=white"/>
  <img src="https://img.shields.io/badge/Json_Web_Tokens-000000?style=flat-square&logo=Json-Web-Tokens&logoColor=white"/>
  <img src="https://img.shields.io/badge/AmazonS3-569A31?style=flat-square&logo=amazon-s3&logoColor=white"/>
  <img src="https://img.shields.io/badge/aws-232F3E?style=flat-square&logo=amazon-aws&logoColor=white"/>
  <img src="https://img.shields.io/badge/Selenium-orenge?style=flat-square&logo=Selenium&logoColor=white"/>
</p>


## ๐์๊ฐ

- ๋น๊ทผ๋ง์ผ์ ๋ฒค์น๋งํนํ์ฌ ํด๋ก ์ฝ๋ฉ์ ์งํํ์ต๋๋ค.
- ๊ฒ์๊ธ ๋ฐ์ดํฐ๋ ํฌ๋กค๋ง์ผ๋ก ๋น๊ทผ๋ง์ผ์์ ๊ฐ์ ธ์ค๊ณ  ์์ต๋๋ค.
- S3๋ฅผ ์ด์ฉํ์ฌ ์ฌ์ง์ ๊ฒ์ํ  ์ ์์ต๋๋ค.
- ๋ก๊ทธ์ธ์ ๊ฒ์๊ธ ์์ฑ, ์์ , ํ๋กํ์ ๋ณผ ์ ์์ต๋๋ค.

## ์์

[์๋์์](https://www.youtube.com/watch?v=sBLoFiOKxzo)



## ๋๋ ํ ๋ฆฌ ๊ตฌ์กฐ

```tree
โโโ build
โย ย  โโโ bootJarMainClassName
โย ย  โโโ classes
โย ย  โย ย  โโโ java
โย ย  โย ย      โโโ main
โย ย  โย ย      โย ย  โโโ com
โย ย  โย ย      โย ย      โโโ clone_coding
โย ย  โย ย      โย ย          โโโ danggeon
โย ย  โย ย      โย ย              โโโ DanggeonApplication.class
โย ย  โย ย      โย ย              โโโ bcrypt
โย ย  โย ย      โย ย              โย ย  โโโ BcryptImpl.class
โย ย  โย ย      โย ย              โย ย  โโโ EncryptHelper.class
โย ย  โย ย      โย ย              โโโ config
โย ย  โย ย      โย ย              โย ย  โโโ AuthorizationExtractor.class
โย ย  โย ย      โย ย              โย ย  โโโ BearerAuthInterceptor.class
โย ย  โย ย      โย ย              โย ย  โโโ WebMVCConfig.class
โย ย  โย ย      โย ย              โย ย  โโโ WebSocketConfig.class
โย ย  โย ย      โย ย              โโโ controller
โย ย  โย ย      โย ย              โย ย  โโโ BoardsController.class
โย ย  โย ย      โย ย              โย ย  โโโ ChatsController.class
โย ย  โย ย      โย ย              โย ย  โโโ ProfileController.class
โย ย  โย ย      โย ย              โย ย  โโโ UserLoginController.class
โย ย  โย ย      โย ย              โย ย  โโโ UserSignupController.class
โย ย  โย ย      โย ย              โย ย  โโโ UsernameFindingController.class
โย ย  โย ย      โย ย              โโโ dto
โย ย  โย ย      โย ย              โย ย  โโโ BoardsRequestDto.class
โย ย  โย ย      โย ย              โย ย  โโโ PasswordFindingDto.class
โย ย  โย ย      โย ย              โย ย  โโโ UserCheckNameDto.class
โย ย  โย ย      โย ย              โย ย  โโโ UserLoginRequestDto.class
โย ย  โย ย      โย ย              โย ย  โโโ UserProfileUpdateDto.class
โย ย  โย ย      โย ย              โย ย  โโโ UserSignupRequestDto.class
โย ย  โย ย      โย ย              โย ย  โโโ UsernameFindingDto.class
โย ย  โย ย      โย ย              โโโ handler
โย ย  โย ย      โย ย              โย ย  โโโ CreateError.class
โย ย  โย ย      โย ย              โย ย  โโโ CustomMessageResponse.class
โย ย  โย ย      โย ย              โย ย  โโโ JwtTokenProvider.class
โย ย  โย ย      โย ย              โย ย  โโโ SocketHandler.class
โย ย  โย ย      โย ย              โโโ models
โย ย  โย ย      โย ย              โย ย  โโโ Boards.class
โย ย  โย ย      โย ย              โย ย  โโโ Timestamped.class
โย ย  โย ย      โย ย              โย ย  โโโ User.class
โย ย  โย ย      โย ย              โโโ repository
โย ย  โย ย      โย ย              โย ย  โโโ BoardsRepository.class
โย ย  โย ย      โย ย              โย ย  โโโ UserRepository.class
โย ย  โย ย      โย ย              โโโ response
โย ย  โย ย      โย ย              โย ย  โโโ TokenResponse.class
โย ย  โย ย      โย ย              โโโ service
โย ย  โย ย      โย ย              โย ย  โโโ BoardsService.class
โย ย  โย ย      โย ย              โย ย  โโโ S3Service.class
โย ย  โย ย      โย ย              โย ย  โโโ UserImageService.class
โย ย  โย ย      โย ย              โย ย  โโโ UserService.class
โย ย  โย ย      โย ย              โโโ utils
โย ย  โย ย      โย ย                  โโโ CORSFilter.class
โย ย  โย ย      โย ย                  โโโ GetBoards.class
โย ย  โย ย      โย ย                  โโโ MailUtil.class
โย ย  โย ย      โโโ test
โย ย  โย ย          โโโ com
โย ย  โย ย              โโโ clone_coding
โย ย  โย ย                  โโโ danggeon
โย ย  โย ย                      โโโ DanggeonApplicationTests.class
โย ย  โย ย                      โโโ controller
โย ย  โย ย                      โย ย  โโโ UserLoginControllerTest.class
โย ย  โย ย                      โโโ service
โย ย  โย ย                          โโโ UserServiceTest.class

```


## ๊ฐ๋ฐํ๊ฒฝ

- Java: JDK 1.8.0
- IDE: IntelliJ IDEA 2020.3.3 x64
- Build Management: Gradle
- Framework: SpringBoot

## ๐[๊ธฐ์  ๋ฐ ๋ผ์ ์ ๋ฆฌ - WIKI](https://github.com/JangHyeonJun2/CloneCoding_danggeon/wiki)







