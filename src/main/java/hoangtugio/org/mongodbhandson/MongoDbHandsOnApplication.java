package hoangtugio.org.mongodbhandson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class MongoDbHandsOnApplication implements CommandLineRunner {


    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private TeacherRepository teacherRepository;

    public static void main(String[] args) {
        SpringApplication.run(MongoDbHandsOnApplication.class, args);
    }

//    @Bean
//    CommandLineRunner runner(StudentRepository repository) {
//        return args -> {
//            // Xóa tất cả dữ liệu cũ
//            repository.deleteAll();
//
//            System.out.println("Database reset and seeded with new data.");
//        };
//    }

    @Override
    public void run(String... args) throws Exception {


        Address address1 = new Address( "123 Main St", "HCM");
        Address address2 = new Address( "456 Elm St", "SG");
        Address address3 = new Address( "789 Main St", "HN");

        List< Address> addressList1 = List.of(address1, address2);
        List< Address> addressList2 = List.of(address2, address3);
        List< Address> addressList3 = List.of(address1, address3);

       studentRepository.save(new Student("001", "John", 15,"Computer Science", addressList1 ) );
       studentRepository.save(new Student("002", "Jane", 14,"Information Technology", addressList2) );
       studentRepository.save(new Student("003", "Jack", 16,"Software Engineering", addressList3) );
       teacherRepository.save(new Teacher("T001", "Mr. Smith"));
       teacherRepository.save(new Teacher("T002", "Mr. John"));

        System.out.println("List of students in the database:");
        studentRepository.findAll().forEach(System.out::println);
        Student student = studentRepository.findById("002").orElse(null);
        System.out.println(student.getName() + " is majoring in " + student.getMajor());
        System.out.println(student.getAddress().get(0));


    }
}
