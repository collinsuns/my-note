package src.main.java.com.itcast.tsc.login.dao.impl;

import org.springframework.stereotype.Service;

import src.main.java.com.itcast.tsc.login.dao.LoginDao;
import src.main.java.com.itcast.tsc.util.RedisTools;
import src.main.java.com.itcast.tsc.util.constants.Constants;

@Service("loginDaoImpl")
public class LoginDaoImpl implements LoginDao {

	@Override
	public boolean getLoginInfo(String userName, String password) throws Exception {
		boolean flag = false;
		String userInfo = RedisTools.get(userName);
		if (userInfo!=null) {
			String[] split = userInfo.split("\\"+Constants.STRING_SEPARATOR);
			if (password.equals(split[0])) {
				flag=true;
			}
		}
		return flag;
	}

}
