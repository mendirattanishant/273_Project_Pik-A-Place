package com.cmpe.project.controller;
<<<<<<< HEAD
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

=======
>>>>>>> 952d5dd83e003ed5a0d141636b6b330b8eda3aed
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

<<<<<<< HEAD
import syncdata.FBDBController;

=======
>>>>>>> 952d5dd83e003ed5a0d141636b6b330b8eda3aed
import com.SpringConfig;
import com.cmpe.project.to.LoginTO;
import com.cmpe.project.to.RegistrationBean;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;

<<<<<<< HEAD
import facebook4j.FacebookException;

=======
>>>>>>> 952d5dd83e003ed5a0d141636b6b330b8eda3aed
@RestController
public class LoginController
{
	
	
	ApplicationContext applicationctx = 
        new AnnotationConfigApplicationContext(SpringConfig.class);
MongoOperations mongoOperation = 
        (MongoOperations) applicationctx.getBean("mongoTemplate");


	
	@RequestMapping(value="/LoginController1", method=RequestMethod.POST)
	@ResponseBody
<<<<<<< HEAD
	public RegistrationBean createUser(@RequestBody RegistrationBean RBean) throws NoSuchAlgorithmException{
		
		
		System.out.println("in controller");
		String password=RBean.getPassword();
		MessageDigest md=MessageDigest.getInstance("MD5");
        md.update(password.getBytes());
        byte[] bytes=md.digest();
       StringBuilder sb=new StringBuilder();
       for (int i = 0; i < bytes.length; i++) {
              sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
       }
       RBean.setPassword(sb.toString());
       System.out.println(RBean.getPassword());
=======
	public RegistrationBean createUser(@RequestBody RegistrationBean RBean){
		
		
		System.out.println("in controller");
>>>>>>> 952d5dd83e003ed5a0d141636b6b330b8eda3aed
		mongoOperation.save(RBean);
		
		return RBean;
	}
	
	
	@RequestMapping(value="/userlogin",method=RequestMethod.POST)
	@ResponseBody
<<<<<<< HEAD
	public Object loginuser(@RequestBody LoginTO user) throws NoSuchAlgorithmException{
=======
	public Object loginuser(@RequestBody LoginTO user){
>>>>>>> 952d5dd83e003ed5a0d141636b6b330b8eda3aed
		/*System.out.println("here in post post of user");
		String user_name=user.getUsername();
		System.out.println(user_name);
	//	String pass=user.getPassword();
		LoginTO user1=(LoginTO) mongoOperation.find(new Query(Criteria.where("username").is(user_name)),LoginTO.class);
		System.out.println("after Query");
		if(user1!=null) 
		{System.out.println(user.getUsername());
		}
<<<<<<< HEAD
		return user*/
		RegistrationBean RBean=new RegistrationBean();
		String user_name=user.getUsername();
		String password=user.getPassword();
		MessageDigest md=MessageDigest.getInstance("MD5");
        md.update(password.getBytes());
        byte[] bytes=md.digest();
       StringBuilder sb=new StringBuilder();
       for (int i = 0; i < bytes.length; i++) {
              sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
       }		
=======
		return user*/;
		String user_name=user.getUsername();
>>>>>>> 952d5dd83e003ed5a0d141636b6b330b8eda3aed
		/*Query query = new Query(Criteria.where("username").is(user_name));
		System.out.println(user_name);
		//query.addCriteria(Criteria.where("user_id").is(user_name));
		Object idcardlistdisplay = mongoOperation. findOne(query,LoginTO.class);
		if(idcardlistdisplay!=null)
		{
			System.out.println("in if");
			return idcardlistdisplay;
		}
		else
		{
			System.out.println("else");
			return "else";
		}
		*/
		
		DBCollection dbcUser = SpringConfig.db.getCollection("registrationBean");
		
		BasicDBObject query = null;
<<<<<<< HEAD
		query = new BasicDBObject("username", user_name).append("password", sb.toString());
=======
		query = new BasicDBObject("username", user_name);
>>>>>>> 952d5dd83e003ed5a0d141636b6b330b8eda3aed
	System.out.println("in post");
		DBCursor cursor = dbcUser.find(query);
		//boolean flag = false;
		if(cursor.hasNext()){
		return user;
		}
		else
		{
<<<<<<< HEAD
			return "";
		}
		
	}
=======
			return "Incorrect";
		}
		
	}

	
	
>>>>>>> 952d5dd83e003ed5a0d141636b6b330b8eda3aed
	/*@RequestMapping(value="/LoginController",method=RequestMethod.POST)
	public String login(@ModelAttribute("userForm") LoginTO user)
	{
		System.out.println("in login controller");
		try
		{
			System.out.println(user.getUsername());
		
		LoginBO bo=new LoginBO();
		bo.validateLogin(user);

		
		}
		catch(BusinessException e)
		{
			//System.out.println("33");
//			req.setAttribute("errorMessage", e.getMessage());
//			RequestDispatcher dispatch=req.getRequestDispatcher("Login.jsp");
//			dispatch.forward(req, resp);
			e.printStackTrace();
		}
		return "Success";
	}*/
	
<<<<<<< HEAD

	@RequestMapping(value="/mainapp",method=RequestMethod.POST)
	@ResponseBody
	public Object FBDB(@RequestBody String accesstoken){
		try {
			FBDBController.SyncFBDB(accesstoken.replaceAll("\"",""));
		} catch (FacebookException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}
	
	@RequestMapping(value="/maplogin",method=RequestMethod.POST)
	@ResponseBody
	public Object FBDB1(@RequestBody String accesstoken){
		//System.out.println(accesstoken.replaceAll("\"",""));
		System.out.println("maplogin");
		/*try {
			FBDBController.SyncFBDB(accesstoken.replaceAll("\"",""));
		} catch (FacebookException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		return "";
	}
=======
	
	
>>>>>>> 952d5dd83e003ed5a0d141636b6b330b8eda3aed
}
