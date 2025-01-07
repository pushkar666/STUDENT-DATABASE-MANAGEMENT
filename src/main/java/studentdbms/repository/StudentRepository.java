// This code snippet is defining a Java interface called `StudentRepository` in the `studentdbms.repository` package. The interface extends `JpaRepository` from the Spring Data JPA framework, specifying that it works with entities of type `Student` and uses `Integer` as the type for the entity's primary key.
package studentdbms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import studentdbms.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>
{

}
