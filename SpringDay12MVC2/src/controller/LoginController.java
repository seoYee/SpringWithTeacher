package controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	
	@RequestMapping("/loginForm.do")
	public String loginForm(){
		//컨트롤러 메소드의 반환형이 String인 경우에는 반환값이 view의 이름이 됨.
		//지금은 login_form.jsp파일이 선택될 것임.
		return "login_form";
	}
	
//	Get, Post 방식 지정 가능
	@RequestMapping(value="/login.do", method=RequestMethod.POST)
//	form의 name과 파라미터 이름을 다르게 하고 싶을 때 , defaultValue도 설정 가능.
//	parameter은 원래 무조건 String이어야 하지만 숫자형태의 parameter도 가능.
	public ModelAndView login(@RequestParam(value="userId",defaultValue="noname") String id, @RequestParam("userPw") String pw, int num){
		
		System.out.println(num+1);
		
		ModelAndView mv = new ModelAndView();
		if(id.equals(pw)){
			mv.setViewName("login_success");
			mv.addObject("msg", "로그인 성공입니다.!");
			mv.addObject("loginId", id);
			
		}else{
			mv.setViewName("login_error");
		}
		return mv;
	}
//	
	
//	public ModelAndView login(String userId, String userPw){
//		ModelAndView mv = new ModelAndView();
//		if(userId.equals(userPw)){
//			mv.setViewName("login_success");
//			mv.addObject("msg", "로그인 성공입니다.!");
//			mv.addObject("loginId", userId);
//			
//		}else{
//			mv.setViewName("login_error");
//		}
//		return mv;
//	}
}