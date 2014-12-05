import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

<<<<<<< HEAD
import facebook4j.FacebookException;
import syncdata.FBDBController;

=======
>>>>>>> 952d5dd83e003ed5a0d141636b6b330b8eda3aed
@Controller
@RequestMapping("/")
public class MvCController {

	@RequestMapping(value="/pik-a-place",method=RequestMethod.GET)
    public String index() {
    	System.out.println("Reached mainpage");
        return "Login";
    }
	
	@RequestMapping(value="/signup",method=RequestMethod.GET)
    public String indexJsp() {
<<<<<<< HEAD
    	System.out.println("Reached signup controller page");
=======
    	System.out.println("Reached here signup");
>>>>>>> 952d5dd83e003ed5a0d141636b6b330b8eda3aed
        return "index";
    }
	
	@RequestMapping(value="/success",method=RequestMethod.GET)
    public String successJsp() {
<<<<<<< HEAD
		
    	System.out.println("Reached success controller page");
=======
    	System.out.println("Reached here success");
>>>>>>> 952d5dd83e003ed5a0d141636b6b330b8eda3aed
        return "Success";
    }
	
	@RequestMapping(value="/Error",method=RequestMethod.GET)
	public String Errorjsp(){
<<<<<<< HEAD
		System.out.println("Reached Error controller page");
		return "Error";
	}
	@RequestMapping(value="/maps",method=RequestMethod.GET)
    public String MapsJsp() {
		
    	System.out.println("Reached maps controller page");
        return "Maps";
    }
	
	@RequestMapping(value="/Recommendation",method=RequestMethod.GET)
    public String RecommendationJsp() {
		
    	System.out.println("Reached Recommendation controller page");
        return "Recommendation";
    }
	@RequestMapping(value="/Logout",method=RequestMethod.GET)
    public String LogoutJsp() {
		
    	System.out.println("Reached Recommendation controller page");
        return "Logout";
    }
	
	
	
=======
		System.out.println("Reached Error");
		return "Error";
	}
>>>>>>> 952d5dd83e003ed5a0d141636b6b330b8eda3aed
}