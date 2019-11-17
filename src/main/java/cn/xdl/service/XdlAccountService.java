package cn.xdl.service;

import cn.xdl.bean.et_admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import cn.xdl.mapper.AccountDao;

@Service("bankservice")
public class XdlAccountService {
	@Autowired
	private AccountDao dao;

	public et_admin login(String name, String password) {
		return dao.selectByidaccnoandaccpassword(name, password);
	}
}


