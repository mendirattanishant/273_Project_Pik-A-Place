import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import facebook4j.FacebookException;
import syncdata.FBDBController;

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
    	System.out.println("Reached signup controller page");
        return "index";
    }
	
	@RequestMapping(value="/success",method=RequestMethod.GET)
    public String successJsp() {
		
    	System.out.println("Reached success controller page");
        return "Success";
    }
	
	@RequestMapping(value="/Error",method=RequestMethod.GET)
	public String Errorjsp(){
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
	
	
	
}