package kl.service.impl;

import java.util.HashMap;
import java.util.Map;

import kl.dao.BaseDaoI;
import kl.model.Lduser;
import kl.pageModel.PLDuser;
import kl.service.UserServiceI;
import kl.util.PubFun;
import kl.util.PwdFun;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserServiceI {

	private static final Logger logger = Logger.getLogger(UserServiceImpl.class);

	private BaseDaoI<Lduser> userDao;

	public BaseDaoI<Lduser> getUserDao() {
		return userDao;
	}

	@Autowired
	public void setUserDao(BaseDaoI<Lduser> userDao) {
		this.userDao = userDao;
	}

	@Override
	public void save(PLDuser plduser) {
		Lduser u = new Lduser();
		// BeanUtils.copyProperties(u, plduser,new String[]{"PASSWORD"});
		u.setUsercode("BB" + PubFun.getCurrentTime4());// 用户编码
		u.setUsername(plduser.getUsername());
		u.setPassword(PwdFun.e(plduser.getPassword()));
		u.setComcode("8611");
		u.setOperator("adil");
		u.setMakedate(PubFun.getDate());
		u.setMaketime(PubFun.getCurrentTime());

		userDao.save(u);
	}

	@Override
	public Lduser login(PLDuser pLDuser) {
		Map<String,Object> param = new HashMap<String, Object>();
		param.put("username", pLDuser.getUsername());
		param.put("password", PwdFun.e(pLDuser.getPassword()));
		Lduser lduser = userDao.get("from Lduser where username = :username and password = :password ",param);
		if (lduser != null ) {
			return lduser;
		}
		return null;
	}

}
