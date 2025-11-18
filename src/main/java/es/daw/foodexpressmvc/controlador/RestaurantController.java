package es.daw.foodexpressmvc.controlador;

import es.daw.foodexpressmvc.dto.RestaurantDTO;
import es.daw.foodexpressmvc.service.RestaurantService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
@RequiredArgsConstructor
public class RestaurantController {

    // Pendiente inyectar servicio

    private final RestaurantService restaurantService;

    @GetMapping("/restaurants")
    public String listRestaurants(Model model) {

        // pendiente obtener del servicio los restaurantes
        List<RestaurantDTO> restaurants = new ArrayList<>();

        model.addAttribute("restaurants",restaurants);
        return "restaurants";
    }
}
