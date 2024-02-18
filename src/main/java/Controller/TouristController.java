/**
 * author: Xuan Loc Lam
 */


package Controller;

import Model.TouristAttraction;
import Service.TouristService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.HttpStatus;

import java.util.List;

@Controller
@RequestMapping("attractions")
public class TouristController {
    TouristService touristService = new TouristService();

    @GetMapping("/all")
    public ResponseEntity<List<TouristAttraction>> getAttractions(){
        return new ResponseEntity<>(touristService.readAttractions(), HttpStatus.OK);
    }

}
