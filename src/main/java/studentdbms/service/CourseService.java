/**
 * The CourseService class in a Java Spring application provides methods to interact with Course entities in the database.
 * @author PUSHKAR D
 * @version 1.0
 */
package studentdbms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import studentdbms.entity.Course;
import studentdbms.repository.CourseRepository;

@Service
public class CourseService 
{
	@Autowired
	private CourseRepository courseRepository;
	
	public List<Course> findAll() {
		return courseRepository.findAll();
	}
	
	public Course findById(int id) {
		return courseRepository.findById(id).get();
	}
	
	@Transactional
	public Course save(Course course) {
		return courseRepository.save(course);
	}
}
