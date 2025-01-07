/**
 * The `StudentDBMSApplication` class in a Spring Boot application for a student database management system.
 * @author PUSHKAR D
 * @version 1.0
 */
package studentdbms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentDBMSApplication
//  implements CommandLineRunner
{
	// @Autowired
	// private StudentService studentService;
	
	// @Autowired
	// private CourseService courseService;
	
	public static void main(String[] args) {
		SpringApplication.run(StudentDBMSApplication.class, args);
	}

	// @Override
	// public void run(String... args) throws Exception 
	// {
	// 	Student student = new Student("D PUSHKAR");
	// 	studentService.save(student);
	// 	Course course = new Course("Spring Boot");
	// 	courseService.save(course);
	// 	student.addCourse(course);
	// 	studentService.save(student);
	// 	course.addStudent(student);
	// 	courseService.save(course);
	// }

}
