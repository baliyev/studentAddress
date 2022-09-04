package az.company.demo.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "abb_students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id", nullable = false)
    private Integer id;

    @Column(name = "student_name", length = 25)
    private String studentName;

    @Column(name = "student_email", nullable = false, length = 45)
    private String studentEmail;

    @Column(name = "student_password", nullable = false)
    private byte[] studentPassword;

    @Column(name = "student_role", length = 45)
    private String studentRole;

    @OneToMany(mappedBy = "student")
    private List<Address> addressList;
}