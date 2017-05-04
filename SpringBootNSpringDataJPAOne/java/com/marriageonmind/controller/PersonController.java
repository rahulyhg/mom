
package com.marriageonmind.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.marriageonmind.model.User;
import com.marriageonmind.model.UserDao;

@Controller
public class PersonController {

  /**
   * Create a new user with an auto-generated id and email and name as passed 
   * values.
   */
  @RequestMapping(value="/")
  
  public String one() {
     
    return "index";
  }
  
  @RequestMapping(value="/create")
  public String create(Map<String,List>map,String email, String name) {
	    try {
	      User user = new User(email, name);
	      userDao.create(user);
	    }
	    catch (Exception ex) {
	      return "Error creating the user: " + ex.toString();
	    }
	    List userList=userDao.getAll();
	    map.put("users",userList);
	    return "userList";
	  }
	    
  /**
   * Delete the user with the passed id.
   */
  @RequestMapping(value="/delete")
  
  public String delete(Long id) {
    try {
      User user = new User(id);
      userDao.delete(user);
    }
    catch (Exception ex) {
      return "Error deleting the user: " + ex.toString();
    }
    return "deleted";
  }
  
  /**
   * Retrieve the id for the user with the passed email address.
   */
  @RequestMapping(value="/get-by-email")
  @ResponseBody
  public String getByEmail(String email) {
    String userId;
    try {
      User user = userDao.getByEmail(email);
      userId = String.valueOf(user.getId());
    }
    catch (Exception ex) {
      return "User not found: " + ex.toString();
    }
    return "The user id is: " + userId;
  }
  
  /**
   * Update the email and the name for the user indentified by the passed id.
   */
  @RequestMapping(value="/update")
  @ResponseBody
  public String updateName(long id, String email, String name) {
    try {
      User user = userDao.getById(id);
      user.setEmail(email);
      user.setName(name);
      userDao.update(user);
    }
    catch (Exception ex) {
      return "Error updating the user: " + ex.toString();
    }
    return "User succesfully updated!";
  } 


  // Private fields
  
  // Wire the UserDao used inside this controller.
  @Autowired
  private UserDao userDao;
  
}