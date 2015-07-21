package serviceImpl;

import org.hibernate.Session;
import org.hibernate.Transaction;

import service.UserManager;
import beans.User;
import dao.BaseDao;
import daoImpl.HibernateSessionFactory;
import daoImpl.UserDao;
import forms.UserForm;

public class UserManagerImpl implements UserManager {  
	  
	private BaseDao dao;  
	  
    private Session session;  
  
    public UserManagerImpl() {  
        dao = new UserDao();  
    }
    
    @Override  
    public void regUser(UserForm userForm) {  
    	session = HibernateSessionFactory.currentSession();  
        dao.setSession(session);  
        // ��ȡ����  
        Transaction ts = session.beginTransaction();  
        // ����User����  
        User user = new User();  
        user.setUsername(userForm.getUsername());  
        user.setPassword(userForm.getPassword());  
        user.setGender(userForm.getGender());  
        // ����User����  
        dao.saveObject(user);  
        // �ύ����  
        ts.commit();  
        // �ر�Session  
        HibernateSessionFactory.closeSession();  
    }  
  
}
