package az.company.demo.entity;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
@Table(name = "abb_phone_numbers")
public class PhoneNumber {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "phone_id", nullable = false)
    private Integer id;

    @Column(name = "phone_number", length = 45)
    private String phoneNumber;
}