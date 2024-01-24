package mk.dians.dians.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ExampleController {

    @GetMapping("site.mk")
    public String getDefaultPage()
    {
        return ("HomePage");
    }

    @GetMapping("signup")
    public String getSignUpPage()
    {
        return ("SignUp");
    }

    @PostMapping("/signup")
    public String handleSignUpForm(@RequestParam("form3Example1") String firstName,
                                   @RequestParam("form3Example2") String lastName,
                                   @RequestParam("form3Example3") String email,
                                   @RequestParam("form3Example4") String password,
                                   RedirectAttributes redirectAttributes) {
        // Redirect to the login page upon successful signup
        redirectAttributes.addFlashAttribute("validEmail", true);
        return "redirect:/login";
    }

    @GetMapping("login")
    public String getLogInPage()
    {
        return("LogIn");
    }

    @GetMapping("profile")
    public String getProfilePage()
    {
        return ("Profile");
    }

    @GetMapping("search")
    public String getSearchPage(){
        return ("Search");
    }

    @GetMapping("help")
    public String getHelpPage(){
        return ("Help");
    }
}