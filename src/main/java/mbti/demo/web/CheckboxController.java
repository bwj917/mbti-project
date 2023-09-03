package mbti.demo.web;

import mbti.demo.domain.CheckBoxInfo;
import mbti.demo.repository.CheckboxInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CheckboxController {
    @Autowired
    private CheckboxInfoRepository checkboxInfoRepository;

    @GetMapping("/checkbox")
    public String showCheckboxPage(Model model) {
        model.addAttribute("checkboxInfo", new CheckBoxInfo());
        return "checkboxPage";
    }

    @PostMapping("/checkbox")
    public String handleCheckboxSubmit(@ModelAttribute CheckBoxInfo checkboxInfo) {
        checkboxInfoRepository.save(checkboxInfo);
        return "redirect:/checkbox";
    }
}