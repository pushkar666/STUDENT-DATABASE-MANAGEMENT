// This code snippet is defining a Java interface called `ReviewRepository` in the `studentdbms.repository` package. The interface extends `JpaRepository` from Spring Data JPA framework, specifying that it will work with entities of type `Review` and primary key of type `Integer`. The `@Repository` annotation is used to indicate that this interface is a Spring Data repository component. This interface will provide methods for performing CRUD operations on the `Review` entity in the database.
package studentdbms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import studentdbms.entity.Review;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Integer>
{

}
