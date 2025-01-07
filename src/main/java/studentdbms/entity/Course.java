/**
 * The Course class represents a course entity with properties such as id, name, reviews, and students in a student database management system.
 * @author PUSHKAR D
 * @version 1.0
 */
package studentdbms.entity;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity
public class Course {
	@Id
	@GeneratedValue
	private int id;

	@Column(unique = true)
	private String name;

	@OneToMany(mappedBy = "course")
	@JsonIgnore
	private List<Review> reviews = new ArrayList<>();

	@ManyToMany(mappedBy = "courses")
	@JsonIgnore
	private List<Student> students = new ArrayList<>();

	public Course() {
	}

	public Course(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public List<Review> getReviews() {
		return reviews;
	}

	public void addReview(Review review) {
		this.reviews.add(review);
	}

	public void removeReview(Review review) {
		this.reviews.remove(review);
	}

	public List<Student> getStudents() {
		return students;
	}

	public void addStudent(Student student) {
		this.students.add(student);
	}

	public void removeStudent(Student student) {
		this.students.remove(student);
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + "]";
	}

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

}
