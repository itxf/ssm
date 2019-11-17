package cn.xdl.contrller;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.xdl.bean.et_admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sun.xml.internal.messaging.saaj.packaging.mime.util.QEncoderStream;


import cn.xdl.service.XdlAccountService;

@Controller
public class MyController {
	@Autowired
	private XdlAccountService bankservice;
	
	@RequestMapping("/toLogin.do")
    public String login() {
		return "login";
	}
	
	@RequestMapping("/tomain.do")
	public String tomain() {	
		return "main";
	}
	
	@RequestMapping("/tologin1.do")
	public String login1(HttpServletRequest request) throws Exception{
		request.setCharacterEncoding("utf-8");
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		System.out.println(name+":"+password);
		et_admin account=bankservice.login(name, password);
		if(account != null) {
		    request.getSession().setAttribute("account", account);
		    return  "redirect:tomain.do";
		}
		 request.setAttribute("msg", "登录失败");
		return "login";
	}
}
