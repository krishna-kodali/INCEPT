package com.ccs.ems.action;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

//import org.meruvian.inca.struts2.rest.annotation.Action;
//import org.meruvian.inca.struts2.rest.annotation.Action.HttpMethod;

/*import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Results;*/
/*import org.apache.struts2.rest.DefaultHttpHeaders;
import org.apache.struts2.rest.HttpHeaders;*/

import com.ccs.ems.model.User;
import com.ccs.ems.svc.UserSVC;
import com.ccs.ems.svc.UserSVCImpl;
import com.opensymphony.xwork2.ActionSupport;
/*import com.opensymphony.xwork2.ModelDriven;*/

/*@Action(results={Result(name="success",  
type="redirectAction" , 
params = {"actionName" , "book"})})*/
@Namespace("/Pages")
@ResultPath(value="/")
public class Controller extends ActionSupport /*implements ModelDriven<Object>*/{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
	
	@Action(value="getUserById", results={
			@Result(name="getUserById",location="/Pages/HelloWorld.jsp")
		})
	public String execute(){
		
		user = userSVC.getUserByID(user.getUserId());
		return "getUserById";	
	}
	
	/*public HttpHeaders destroy() {
		return new DefaultHttpHeaders("destroy");
	}*/
	
	//@Action(name = "/createUser", method = HttpMethod.POST)
	@Action(value="createUser", results={
			@Result(name="createSuccess",location="/Pages/CreateUserSuccess.jsp")
		})
	public String createUser(){
		//String FirstName = user.getUserFirstName();
		//String LastName = user.getUserLastName();
		user = userSVC.createUser(user);
		return "createSuccess";
		
	}
	
	@Action(value="get", results={
			@Result(name="success",location="/Pages/user-users.jsp")
		})
	public String getAllUsers() throws Exception {

		try{ 
	  
			users=userSVC.getAllUsers();
			return SUCCESS;
		}
	   catch(Exception e)
	   {
		   e.printStackTrace();
	   }
	   return SUCCESS;
	}

	/*@Override
	public Object getModel() {
		// TODO Auto-generated method stub
		return (users != null ? users : user);
	}*/
		
}
