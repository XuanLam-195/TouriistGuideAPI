/**
 * author: Xuan Loc Lam
 */


package Model;

import java.util.Objects;

public class TouristAttraction {
    private String name;
    private String description;

    public TouristAttraction(String name, String description){
        this.name = name;
        this.description = description;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public String getName(){
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public boolean equals(Object object){
        if(this == object)
            return true;
        if(object == null || getClass() != object.getClass())
            return false;
        TouristAttraction that = (TouristAttraction) object;
        return Objects.equals(name, that.name) && Objects.equals(description, that.description);
   }
   @Override
    public int hashCode(){
        return Objects.hash(name, description);
   }

}
