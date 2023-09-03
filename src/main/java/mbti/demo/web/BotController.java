package mbti.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class BotController {


@GetMapping("/bot")
public String chatBot(Model model, HttpServletRequest request) {
    HttpSession session = request.getSession(false);
        String login = "";
        if(session == null){
            login = "header.html";
        }

        else {
            login="header_login.html";
        }
        model.addAttribute("login", login);
    return "bot";
}


}
