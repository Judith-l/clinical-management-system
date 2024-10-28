//The Controller layer handles incoming requests, processes them, and returns responses.
package com.example.clinicalmanagement.controller;

import com.example.clinicalmanagement.model.Patient;
import com.example.clinicalmanagement.repository.PatientRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/patients")
public class PatientController {

    private final PatientRepository patientRepository;

    public PatientController(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @GetMapping
    public String listPatients(Model model) {
        List<Patient> patients = patientRepository.findAll();
        model.addAttribute("patients", patients);
        return "patients"; // Ensure 'patients.html' exists in templates
    }

    @GetMapping("/new")
    public String newPatientForm(Model model) {
        model.addAttribute("patient", new Patient());
        return "patient_form"; // Ensure 'patient_form.html' exists in templates
    }

    @PostMapping
    public String savePatient(@ModelAttribute Patient patient) {
        patientRepository.save(patient); // Ensure 'patient' is properly populated
        return "redirect:/patients"; // Redirect after POST
    }
}




