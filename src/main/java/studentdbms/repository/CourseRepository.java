// This code snippet is defining a Java interface called `CourseRepository` in the `studentdbms.repository` package. This interface extends the `JpaRepository` interface provided by Spring Data JPA, which allows for easy interaction with a database using JPA (Java Persistence API). The `CourseRepository` interface is specifically designed to work with entities of type `Course` and uses `Integer` as the type for the entity's primary key. The `@Repository` annotation indicates that this interface is a Spring-managed repository component.
package studentdbms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import studentdbms.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {

}
