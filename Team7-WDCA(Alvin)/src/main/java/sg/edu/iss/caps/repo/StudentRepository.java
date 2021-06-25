package sg.edu.iss.caps.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import sg.edu.iss.caps.domain.Course;
import sg.edu.iss.caps.domain.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
	
	public Student findStudentById(int id);
	
	@Query("select s from Student s where s.firstName like %?1%")
	public List<Student> findStudentByName(String firstName);
	
	@Modifying
	@Transactional
	@Query("update Student s set s.major = :major where s.id = :studentId")
	public void setMajor(@Param("studentId")int id, @Param("major")String major);
	
//	@Modifying
//	@Transactional
//	@Query("update Student s set s.coursesTaken = :pastcourses where s.id = :studentId")
//	public void setCourses(@Param("studentId")int id, @Param("pastcourse")Course course);
}
