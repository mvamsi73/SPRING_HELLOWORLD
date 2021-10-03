package BasePackage;

import javax.servlet.http.HttpServlet;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

public class ClientController 
{
	@RequestMapping("/dispatcher")
	public ModelAndView handleRequest(HttpServlet req,HttpServlet res)
	{
		ModelAndView modelandview=new ModelAndView("display","message","HelloWorld");
		return modelandview;
	}

}
