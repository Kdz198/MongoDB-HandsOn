package hoangtugio.org.mongodbhandson;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Address {


    private String street;

    private String city;

    List< NumberDB> numberDB;
}
