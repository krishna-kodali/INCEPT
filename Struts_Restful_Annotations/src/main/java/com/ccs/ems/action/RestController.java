package com.ccs.ems.action;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;
//import org.apache.struts2.rest.DefaultHttpHeaders;
//import org.apache.struts2.rest.HttpHeaders;
 
import com.ccs.ems.model.User;
import com.ccs.ems.svc.UserSVC;
import com.ccs.ems.svc.UserSVCImpl;
import com.opensymphony.xwork2.ActionSupport;
 
@Namespace("/Pages")
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
	
	@Action(value="getUserByFirstName", results={
			@Result(name="getSuccess",location="/Pages/GetUserByFirstNameSuccess.jsp")
		})
	public String getUserByFirstName(){
		//String FirstName = user.getUserFirstName();
		//String LastName = user.getUserLastName();
		user = userSVC.getUserByFirstName(user.getUserFirstName());
		return "getSuccess";
		
	}
	
	@Action(value="deleteUser", results={
			@Result(name="deleteSuccess",location="/Pages/DeleteUserSuccess.jsp")
		})
	public String deleteUserByFirstName(){
		//String FirstName = user.getUserFirstName();
		//String LastName = user.getUserLastName();
		User u1 = new User();
		u1 = userSVC.getUserByID(user.getUserId());
		
		if((u1.getUserFirstName().equals(user.getUserFirstName())) && (u1.getUserLastName().equals(user.getUserLastName()))){
				userSVC.deleteUserByID(user.getUserId());
				return "deleteSuccess";
		}else{
			return null;
		}
	}
	
	
	/*@Action(value="get", results={
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
 
	}*/
}