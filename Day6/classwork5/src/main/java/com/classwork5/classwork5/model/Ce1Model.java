package com.classwork5.classwork5.model;

import org.springframework.web.bind.annotation.SessionAttributes;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Ce1Model {
    @Id
    int babyId;
    String babyFirstName;
    String babyLastName;
    String fatherName;
    String motherName;
    String address;
}
