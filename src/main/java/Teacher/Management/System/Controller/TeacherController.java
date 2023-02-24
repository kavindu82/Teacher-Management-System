package Teacher.Management.System.Controller;

import Teacher.Management.System.Entity.Teacher;
import Teacher.Management.System.Service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class TeacherController {

    @Autowired
    private TeacherService teacherService;



    // handler method to handle list  and return mode and view
    @GetMapping("/teachers")
    public String listTeachers(Model model) {
        model.addAttribute("teachers", teacherService.getAllTeacher());
        return "teachers";
    }

    @GetMapping("/teachers/new")
    public String createStudentForm(Model model) {

        // create student object to hold student form data
        Teacher teacher = new Teacher();
        model.addAttribute("teacher", teacher);
        return "create_teacher";

    }
    @PostMapping("/teachers")
    public String saveTeachers(@ModelAttribute("teacher") Teacher teacher){
        teacherService.saveteacher(teacher);
        return "redirect:/teachers";
    }
    @GetMapping("/teachers/edit/{id}")
    public String editTeacherForm(@PathVariable Long id, Model model) {
        model.addAttribute("teacher",teacherService.getTeacherById(id));
        return "edit_student";
    }
    @PostMapping("/teachers/{id}")
    public String updateTeacher(@PathVariable Long id, @ModelAttribute("teacher") Teacher teacher, Model model) {

        // get teacher from database by id
        Teacher existingTeacher = teacherService.getTeacherById(id);
        existingTeacher.setId(id);
        existingTeacher.setName(teacher.getName());
        existingTeacher.setAge(teacher.getAge());
        existingTeacher.setLocation(teacher.getLocation());

        // save updated teacher object
        teacherService.updateTeacher(existingTeacher);
        return "redirect:/teachers";
    }
    @GetMapping ("/teachers/{id}")
    public String deleteTeacher(@PathVariable Long id) {
        teacherService.deleteTeacherById(id);
        return "redirect:/teachers";
    }
}
