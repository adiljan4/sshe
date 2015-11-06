package kl.action;

import kl.model.Lduser;
import kl.pageModel.PLDuser;
import kl.service.UserServiceI;
import kl.util.RepJSON;

import org.apache.log4j.Logger;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ModelDriven;

@Namespace("/")
@Action(value = "userAction")
public class UserAction extends BaseAction implements ModelDriven<PLDuser> {

	private PLDuser pLDuser = new PLDuser();

	@Override
	public PLDuser getModel() {
		return pLDuser;
	}

	public UserServiceI getUserServiceI() {
		return userServiceI;
	}

	@Autowired
	public void setUserServiceI(UserServiceI userServiceI) {
		this.userServiceI = userServiceI;
	}

	private static final Logger logger = Logger.getLogger(UserAction.class);

	private UserServiceI userServiceI;

	/**
	 * 用户注册
	 */
	public void userReg() {

		RepJSON rj = new RepJSON();
		try {
			userServiceI.save(pLDuser);
			rj.setSuccess(true);
			rj.setMsg("注册成功！");
		} catch (Exception e) {
			e.printStackTrace();
			rj.setMsg("注册失败！"+e.getMessage());
		}
		// 往前台返回信息
		super.writeJson(rj);
	}

	/**
	 * 用户登录
	 */
	public void userLogin() {
		Lduser lduser = userServiceI.login(pLDuser);
		RepJSON rj = new RepJSON();
		if (lduser != null) {
			rj.setSuccess(true);
			rj.setMsg("登陆成功！");
		} else {
			rj.setMsg("用户名或密码不正确！");
		}
		// 往前台返回信息
		super.writeJson(rj);
	}

}
