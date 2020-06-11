package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import service.CarService;

@Controller
@RequestMapping("/")
public class CarController {

    @RequestMapping(value = "cars", method = RequestMethod.GET)
    public String getCars(ModelMap model) {
        model.addAttribute("cars", CarService.getCars());
        return "cars";
    }
}
