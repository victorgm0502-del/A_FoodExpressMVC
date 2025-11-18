package es.daw.foodexpressmvc.service;

import es.daw.foodexpressmvc.dto.RestaurantDTO;
import es.daw.foodexpressmvc.exception.ConnectApiRestException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.net.ConnectException;
import java.util.List;

@Service
@RequiredArgsConstructor
public class RestaurantService {

    private final WebClient webClient;
    public List<RestaurantDTO> getRestaurants() throws ConnectException {

    RestaurantDTO [] restaurants;
    try {
        restaurants = webClient
                .get()
                .uri("/restaurants")
                .retrieve()
                .bodyToMono(RestaurantDTO[].class)
                .block();
        // Pendiente usar WebClient para hacer la petición al endpoint GET http://localhost:8082/api/restaurants
        // Obtendremos un json la la lista de objetos RestaurantDTO
    }catch (Exception e){
        throw  new ConnectApiRestException("Could not connect to FoodExpress API");
    }
        return null;

    }
}
