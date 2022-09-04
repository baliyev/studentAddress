package az.company.demo.controller;

import az.company.demo.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping("/users")
    public ResponseEntity getStudents(){
        return ResponseEntity.ok(studentService.getStudents());
    }

//    @GetMapping("/users/{studentId}")
//    public ResponseEntity getStudent(@PathVariable("studentId") Integer studentId){
//        return ResponseEntity.ok(studentService.getStudent(studentId));
//    }

}
