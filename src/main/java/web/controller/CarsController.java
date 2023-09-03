package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImpl;

@Controller
public class CarsController {
    private final CarService cars;

    public CarsController(CarService cars) {
        this.cars = cars;
    }

    @RequestMapping(value = "/cars")
    public String showCars(@RequestParam(value = "count", defaultValue = "-1") int a, Model model) {
//        cars = new CarServiceImpl();
        model.addAttribute("cars", cars.getCars(a));
           return "cars";
    }

}
