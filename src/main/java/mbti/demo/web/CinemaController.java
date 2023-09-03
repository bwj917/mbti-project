package mbti.demo.web;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import mbti.demo.domain.Cafe;
import mbti.demo.domain.Cinema;
import mbti.demo.service.CafeService;
import mbti.demo.service.CinemaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Slf4j
@Controller
@RequiredArgsConstructor
public class CinemaController {

    private final CinemaService cinemaService;

    @GetMapping("/getAllCinemas")
    public String getAllCinemas(Model model) {
        List<Cinema> cinemaInfo = cinemaService.getAllCinemas();
        model.addAttribute("cinemaInfo", cinemaInfo);
        return "kaka"; // Render kaka.html template
    }
}