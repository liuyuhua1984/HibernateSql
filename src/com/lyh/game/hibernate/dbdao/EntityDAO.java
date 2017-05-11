package com.lyh.game.hibernate.dbdao;

import java.util.List;

import org.slf4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lyh.game.lib.sql.DbEntity;
import com.lyh.game.utils.log.LogUtils;

/**
 * 数据保存
 * 
 * @author lyh
 */
@Component
public class EntityDAO extends DbDao<DbEntity> {
	
	protected Logger log = LogUtils.getLog(this.getClass());
	
	// /** 更新数据库线程池 **/
	// private Map<Long, DbEntity> updateDbList = new ConcurrentHashMap<Long, DbEntity>();
	//
	// /** 删除数据容器 **/
	// private Map<Long, DbEntity> deleteDbList = new ConcurrentHashMap<Long, DbEntity>();
	
	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public Long save(final DbEntity transientInstance) {
		log.debug("saving tbActor instance");
		long id = 0;
		try {
			id = (Long) getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (Exception re) {
			re.printStackTrace();
			log.error("save failed" + transientInstance, re);
		}
		
		return id;
	}
	
	
	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void delete(final DbEntity db) {
		try {
			if (db != null) {
				getHibernateTemplate().delete(db);
			}
			log.debug("delete successful");
		} catch (Exception re) {
			re.printStackTrace();
			log.error("delete failed" + db, re);
		}
		
	}

	
	// @Override
	// public void saveOrUpdate(DbEntity instance) {
	// log.debug("attaching dirty tbActor instance");
	// try {
	// getHibernateTemplate().saveOrUpdate(instance);
	// log.debug("attach successful");
	// } catch (RuntimeException re) {
	// log.error("attach failed" + instance, re);
	// re.printStackTrace();
	// }
	// }
	
	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void updateFinal(final DbEntity db) {
		try {
			
			if (db != null) {

				getHibernateTemplate().update(db);
			}
			log.debug("attach successful" + db);
		} catch (Exception re) {
			log.error("attach failed" + db, re);
			re.printStackTrace();
		}
	}
	

	
	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = true)
	public <T> T findById(Class<T> entity, long id) {
		log.debug("finding instance with id: " + id);
		try {

			T t = getHibernateTemplate().get(entity, Long.valueOf(id));
	
			return t;
		} catch (Exception re) {
			log.error("find by property name failed", re);
			return null;
		}
	}
	
	
	@Override
	@SuppressWarnings("unchecked")
	@Transactional(propagation = Propagation.REQUIRED, readOnly = true)
	public <T> List<T> findAll(Class<T> c) {
		log.debug("finding all from " + c.getName());
		try {
			String queryString = "from " + c.getName();
			return (List<T>) getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			re.printStackTrace();
			throw re;
		}
	}
	
	@Override
	@SuppressWarnings("unchecked")
	@Transactional(propagation = Propagation.REQUIRED, readOnly = true)
	public <T> List<T> findByProperty(Class<T> c, String propertyName, Object value) {
		log.debug("finding instance with property: " + propertyName + ", value: " + value);
		try {
			
			List<T> t = null;
			String queryString = "from " + c.getName() + " as model where model." + propertyName + "= :" + propertyName;
//			Query queryObject = getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery(queryString);
//			if (value != null) {
//				// for (int i = 0; i < value.length; i++) {
//				queryObject.setParameter(propertyName, value);
//				// }
//			}
//			t = queryObject.list();
			 t = (List<T>) getHibernateTemplate().find(queryString, value);
	
			return t;
		} catch (Exception re) {
			log.error("find by property name failed", re);
			re.printStackTrace();
			return null;
		}
	}
	
	
	@Override
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Transactional(propagation = Propagation.REQUIRED, readOnly = true)
	public <T> List<T> findByProperties(Class<T> c, List<String> propertyName, List<Object> value) {
		// log.debug("finding instance with properties: " +
		// propertyName.toString() + ", value: " + value.toString());
		try {
			List<T> t = null;
			String queryString = "from " + c.getName() + " as model ";
			for (int i = 0; i < propertyName.size(); i++) {
				if (i == 0) {
					queryString = queryString + " where model." + propertyName.get(i) + "= :" + propertyName.get(i);
				} else {
					queryString = queryString + " and model." + propertyName.get(i)+ "= :" + propertyName.get(i);
				}
			}
			
//			Query queryObject = this.getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery(queryString);
//			if (value != null) {
//				for (int i = 0; i < value.length; i++) {
//					queryObject.setParameter(propertyName[i], value[i]);
//				}
//			}
//			t = (List<T>) queryObject.list();
			t = (List<T>) getHibernateTemplate().find(queryString, value);
		
			return t;
		} catch (Exception re) {
			log.error("find by property name failed", re);
			re.printStackTrace();
			return null;
		}
	}
	
	
	@Override
	@SuppressWarnings("unchecked")
	@Transactional(propagation = Propagation.REQUIRED, readOnly = true)
	public <T> List<T> findByHql(String hql) {
		log.debug("finding instance with hql: " + hql);
		try {
			return (List<T>) getHibernateTemplate().find(hql);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			re.printStackTrace();
			throw re;
		}
	}
	
}
