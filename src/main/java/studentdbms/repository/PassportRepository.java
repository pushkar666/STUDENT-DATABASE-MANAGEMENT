// This code snippet is defining a Java interface called `PassportRepository` in the `studentdbms.repository` package. The interface extends `JpaRepository<Passport, Integer>`, which is provided by Spring Data JPA. This interface will be used to interact with the database table/entity representing passport information. The `@Repository` annotation marks this interface as a Spring Data repository, allowing it to be automatically detected and instantiated by Spring framework components.
package studentdbms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import studentdbms.entity.Passport;

@Repository
public interface PassportRepository extends JpaRepository<Passport, Integer>
{

}
