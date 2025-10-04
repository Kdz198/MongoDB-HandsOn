package hoangtugio.org.mongodbhandson;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "student")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {

    @Id
    private String id;
    private String name;
}
