/*package com.ccs.ems.action;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;
import org.apache.struts2.rest.DefaultHttpHeaders;
import org.apache.struts2.rest.HttpHeaders;
 
import com.ccs.ems.model.User;
import com.ccs.ems.svc.UserSVC;
import com.ccs.ems.svc.UserSVCImpl;
import com.opensymphony.xwork2.ActionSupport;
 
@Namespace("/User")
@ResultPath(value="/")
public class RestController extends ActionSupport{
 
	UserSVC userSVC = new UserSVCImpl();
	
	private User user;
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	private List<User> users=new ArrayList<User>();
	
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	
	@Action(value="get", results={
			@Result(name="users",location="/user-users.jsp")
		})
	public HttpHeaders index() throws Exception{
		try{
			users = userSVC.getAllUsers();
			return new DefaultHttpHeaders("users")   
            .disableCaching();
		}
		catch(Exception e)
		   {
			   e.printStackTrace();
		   }
		   return null;
	}
	
	@Action(value="get", results={
		@Result(name="success",location="/user-users.jsp")
	})
	public String execute() {
		users = userSVC.getAllUsers();
		return SUCCESS;
 
	}
}*/