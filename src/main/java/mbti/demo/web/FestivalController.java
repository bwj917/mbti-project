package mbti.demo.web;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import mbti.demo.domain.Festival;
import mbti.demo.repository.FestivalRepository;
import mbti.demo.service.FestivalServi;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
@Slf4j
@Controller
@RequiredArgsConstructor
public class FestivalController {

  private final FestivalServi festivalServi;
//    @GetMapping("/ka.html")
//    public String showKaPage(Model model) {
//        List<Festival> festivals = festivalServi.getAllFestivals();
//        model.addAttribute("festivals", festivals);
//        return "ka";
//    }
@GetMapping("/ka.html")
public String showMarkers(Model model) {
    List<Festival> x = festivalServi.getX();
    List<Festival> y = festivalServi.getY();

    model.addAttribute("x", x);
    model.addAttribute("y", y);

    return "ka";
}


}