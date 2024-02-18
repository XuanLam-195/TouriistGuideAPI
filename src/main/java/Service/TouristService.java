/**
 * author: Xuan Loc Lam
 */


package Service;

import Model.TouristAttraction;
import Repository.TouristRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TouristService {

    TouristRepository touristRepository = new TouristRepository();

    public void update(TouristAttraction touristAttraction){
        touristRepository.updateAttraction(touristAttraction);
    }
    public void create(TouristAttraction touristAttraction){
        touristRepository.createAttraction(touristAttraction);
    }
    public List<TouristAttraction> readAttractions(){
        return touristRepository.readfile();
    }
    public void delete(TouristAttraction touristAttraction){
        touristRepository.deleteAttraction(touristAttraction);
    }
}
