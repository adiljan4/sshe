package kl.service;

import kl.model.Lduser;
import kl.pageModel.PLDuser;



public interface UserServiceI {
	
	public void save(PLDuser u);

	public Lduser login(PLDuser pLDuser);
}
