
function Login()
{
	
      return username() && password() && user();
      
      function username()
      {
    	  var username=document.getElementById("username").value;
            document.getElementById("error1").innerHTML="";
            if(username==null || username=="")
            {
            document.getElementById("error1").innerHTML="username can not be blank";
            document.getElementById("username").focus();
            return false;
            }
            
            return true;	     
      }
      
      function password()
      {    	  var password=document.getElementById("password").value;
          document.getElementById("error2").innerHTML="";
          var reg=/^[A-Za-z0-9\s]{6,30}$/;
          if(password==null || password=="")
          {
          document.getElementById("error2").innerHTML="Password cannot be blank";
          document.getElementById("password").focus();
          return false;
          }     
          return true;
      }
      
      function user() {
        		var username=document.getElementById("username").value;
        	    var password=document.getElementById("password").value;
        	    
        	    
        	    var string={ 
        	    		"username" : username,"password" : password
        	    };
        	    jQuery.ajax({
        	        type: "POST",
        	        url: "http://localhost:8080/userlogin",
        	        data:JSON.stringify(string),
        	        contentType: "application/json; charset=utf-8",
        	        dataType: "json",
        	        success: function (data, status, jqXHR) {
        	             
        	             alert(status);
        	             window.location.href="/success"
        	        },
        	    
        	        error: function (jqXHR, status, textStatus) {            
        	             // error handler
        	        	 
        	             alert("error " + status + " Text" + textStatus);
        	             window.location.href="/Error"
        	        }

        	    });

        	}
}