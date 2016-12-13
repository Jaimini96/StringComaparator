package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author Abhishek Jaimini
 *
 */
@Controller
public class StringController {

	String temp;
	/**
	 * 
	 * @param model
	 * @return
	 */
    @GetMapping("/api/v1/compare/first")
    public String getStrings(Model model) {
        model.addAttribute("strings", new Strings());
        return "strings";
    }

    /**
     * 
     * @param strings
     * @return
     */
    @PostMapping("/api/v1/compare/second")
    public String getString2(@ModelAttribute Strings strings) {

    	temp= strings.getString1();
    	return "strings2";
    }
    /**
     * 
     * @param strings
     * @param model
     * @return
     */
    @PostMapping("/api/v1/compare/")
    public String postDifference(@ModelAttribute Strings strings, Model model) {
    	model.addAttribute("strings",new Strings(temp,strings.getString2()));
        return "result";
    }
}