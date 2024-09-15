//package backend.greatjourney.domain.mail.controller;
//
//import backend.greatjourney.domain.mail.dto.EmailAuthRequest;
//import backend.greatjourney.domain.mail.dto.EmailCheckRequest;
//import backend.greatjourney.domain.mail.service.EmailService;
//import backend.greatjourney.domain.mail.service.EmailServiceImpl;
//import backend.greatjourney.global.exception.BaseResponse;
//import backend.greatjourney.global.exception.BaseResponseService;
//import backend.greatjourney.global.exception.CustomExceptionHandler;
//import lombok.RequiredArgsConstructor;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//
//@RestController
//@RequestMapping("/api/mail/auth")
//@RequiredArgsConstructor
//
//public class MailController {
//
//    private final EmailService emailService;
//
//    private final BaseResponseService baseResponseService;
//
//    private final CustomExceptionHandler customExceptionHandler;
//
//
//    // 회원가입 - (3) 유저 이메일로 인증번호 전송
//    @PostMapping("/signup/emailCheck")
//    public BaseResponse<Object> emailConfirm(@RequestBody EmailCheckRequest emailCheckRequest) throws Exception {
//        String confirm;
//        confirm = emailService.sendSimpleMessage(emailCheckRequest.getEmail());
//        if (confirm.isEmpty()) {
//            return BaseResponse.<Object>builder()
//                    .code(2103)
//                    .isSuccess(false)
//                    .message("인증번호 전송 실패")
//                    .build();
//        } else {
//            return BaseResponse.<Object>builder()
//                    .code(2002)
//                    .isSuccess(true)
//                    .message("인증번호 전송 성공")
//                    .build();
//
//        }
//    }
//
//    // 회원가입 - (4) 유저가 받은 인증번호 일치 확인
//    @PostMapping("/signup/emailAuthentication")
//    public BaseResponse<Object> emailAuthentication(@RequestBody EmailAuthRequest emailAuthRequest) {
//        if (emailAuthRequest.getCertificationNum().equals(EmailServiceImpl.ePw)){
//            return BaseResponse.<Object>builder()
//                    .code(2003)
//                    .isSuccess(true)
//                    .message("인증번호 일치합니다.")
//                    .build();
//        } else {
//            return BaseResponse.<Object>builder()
//                    .code(2104)
//                    .isSuccess(false)
//                    .message("인증번호가 틀렸습니다.")
//                    .build();
//        }
//    }
//}
