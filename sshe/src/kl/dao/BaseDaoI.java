package kl.dao;

import java.io.Serializable;
import java.util.Map;

public interface BaseDaoI<T> {
	
	public Serializable save(T o);
	
	public T get(String hql,Map<String,Object> parm);
}
