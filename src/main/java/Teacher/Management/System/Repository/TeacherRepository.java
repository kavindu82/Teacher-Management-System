package Teacher.Management.System.Repository;

import Teacher.Management.System.Entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher ,Long> {
}
