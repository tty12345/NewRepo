package sg.edu.iss.caps.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import sg.edu.iss.caps.domain.Course;

import sg.edu.iss.caps.domain.Lecturer;
//import sg.edu.iss.caps.domain.Student;
import sg.edu.iss.caps.domain.Student;


public interface CourseRepository extends JpaRepository<Course, Integer> {
	
	@Query("select c from Course c where c.name like %?1%")
	public List<Course> findCoursesByName(String name);
//check this	
	@Query("select c from Course c where c.code = ?1")
	public Course findCourseByCode(String name);
	
	public List<Course> findCoursesByLecturer(Lecturer lecturer);
	
	public List<Course> findCoursesByStudent(Student Student);
	
	public List<Course> findCoursesByCode(String code);
	
	@Query("select c from Course c where c.student.id = :n")
	public List<Course> findCoursesByStudentId(@Param("n") int n);
	
	@Query("select count(c) from Course c where c.code =?1 group by c.code")
	public int getCount(String code);
	
	@Query("delete from Course c where c.code = :code")
	public void deleteCourseByCode(@Param("code") String code);
	
	@Query("select c from Course c where c.lecturer.id = :n")
	public List<Course> findCoursesByLecturerId(@Param("n") int n);

	
}
