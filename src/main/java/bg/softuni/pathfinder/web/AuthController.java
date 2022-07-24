package bg.softuni.pathfinder.web;

import bg.softuni.pathfinder.model.dto.UserRegistrationDTO;
import bg.softuni.pathfinder.model.entity.User;
import bg.softuni.pathfinder.model.views.UserProfileView;
import bg.softuni.pathfinder.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.security.Principal;

@Controller
@RequestMapping("/users")
public class AuthController {
    private final AuthService authService;

    @Autowired
    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @ModelAttribute("userRegistrationDTO")
    public UserRegistrationDTO initForm() {
        return new UserRegistrationDTO();
    }

    @GetMapping("/register")
    public String register() {

        return "register";
    }

    @PostMapping("/register")
    public String doRegister(@Valid UserRegistrationDTO userRegistrationDTO,
                             BindingResult bindingResult,
                             RedirectAttributes redirectAttributes) {

        if (bindingResult.hasErrors()) {
            redirectAttributes.addFlashAttribute("org.springframework.validation.BindingResult.userRegistrationDTO", bindingResult);
            redirectAttributes.addFlashAttribute("userRegistrationDTO", userRegistrationDTO);
            return "redirect:/register";
        }

        this.authService.register(userRegistrationDTO);
        return "redirect:/users/login";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/profile")
    public String profile(Principal principal, Model model) {
        String username = principal.getName();
        User user = authService.getUser(username);

        UserProfileView userProfileView = new UserProfileView(
                username,
                user.getEmail(),
                user.getFullName(),
                user.getAge(),
                user.getLevel() != null ? user.getLevel().name() : "BEGINNER"
        );

        model.addAttribute("user", userProfileView);

        return "profile";
    }
}
