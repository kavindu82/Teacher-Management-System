package Teacher.Management.System.Service;

import Teacher.Management.System.Entity.Teacher;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface TeacherService {

    List<Teacher> getAllTeacher();
    Teacher saveteacher (Teacher teacher);
    Teacher getTeacherById(Long id);
    Teacher updateTeacher(Teacher teacher);

    void deleteTeacherById(Long id);
}
