package kl.dao.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import kl.dao.BaseDaoI;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("baseDao")
public class BaseDaoImpl<T> implements BaseDaoI<T> {

	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public Serializable save(T o) {
		return this.sessionFactory.getCurrentSession().save(o);
	}

	@Override
	public T get(String hql, Map<String, Object> param) {
		Query query = this.sessionFactory.getCurrentSession().createQuery(hql);
		if (param != null && !param.isEmpty()) {
			for (String key : param.keySet()) {
				query.setParameter(key, param.get(key));
			}

			List<T> list = query.list();
			if (list != null && list.size() > 0) {
				return list.get(0);
			}
		}

		return null;
	}
}
