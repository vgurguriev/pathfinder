package bg.softuni.pathfinder.web;

import bg.softuni.pathfinder.model.entity.Route;
import bg.softuni.pathfinder.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {
    private RouteService routeService;

    @Autowired
    public HomeController(RouteService routeService) {
        this.routeService = routeService;
    }

    @GetMapping("/")
    public String home(Model model) {

        List<Route> route = routeService.getMostCommented();

        model.addAttribute("mostCommented", route.get(0));

        return "index";
    }
}
