package hoangtugio.org.mongodbhandson;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository  extends MongoRepository<Student, String> {
}
