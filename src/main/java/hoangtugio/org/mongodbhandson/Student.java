package hoangtugio.org.mongodbhandson;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.annotation.processing.Generated;
import java.util.List;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @Id
    private String id;

    private String name;

    private int age;

    private String major;

    List<Address> address;
}
