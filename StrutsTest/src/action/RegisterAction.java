package action;

import service.UserManager;
import serviceImpl.UserManagerImpl;

import com.opensymphony.xwork2.ActionSupport;

import forms.UserForm;

public class RegisterAction extends ActionSupport {  
	  
    private static final long serialVersionUID = 1L;  
  
    private UserForm userForm;  
  
    private UserManager userManager;  
  
    public UserForm getUserForm() {  
        return userForm;  
    }  
  
    public void setUser(UserForm userForm) {  
        this.userForm = userForm;  
    }  
  
    public UserManager getUserManager() {  
        return userManager;  
    }  
  
    public void setUserManager(UserManager userManager) {  
        this.userManager = userManager;  
    }  
  
    public String execute() {  
        try {  
            this.setUserManager(new UserManagerImpl());  
            userManager.regUser(userForm);  
            return SUCCESS;  
  
        } catch (Exception e) {  
            e.printStackTrace();  
            return ERROR;  
        }  
    }  
  
}
