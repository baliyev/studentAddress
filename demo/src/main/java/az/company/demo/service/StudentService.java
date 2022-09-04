package az.company.demo.service;

import az.company.demo.repository.StudentRepository;
import az.company.demo.entity.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;

    public Student getStudent(Integer studentId){
        return studentRepository.getById(studentId);
    }
    public List<Student> getStudents(){
        return studentRepository.findAll();
    }

}
