package src.main.java.com.itcast.tsc.login.service.impl;


import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import src.main.java.com.itcast.tsc.login.dao.LoginDao;
import src.main.java.com.itcast.tsc.login.service.LoginService;
@Service
public class LoginServiceImpl implements LoginService{

	@Resource(name="loginDaoImpl")
	private LoginDao loginDao;
	
	@Override
	public boolean login(String userName, String password) throws Exception{
		return loginDao.getLoginInfo(userName,password);
		
	}
}
