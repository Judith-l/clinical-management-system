//Definition: The Repository layer is responsible for data access. 
//It interacts with the database to perform CRUD (Create, Read, Update, Delete) operations.//
package com.example.clinicalmanagement.repository;

import com.example.clinicalmanagement.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
    // Additional query methods can be defined here if needed
}
