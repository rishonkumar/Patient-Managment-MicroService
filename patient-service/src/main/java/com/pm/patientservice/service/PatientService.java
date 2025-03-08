package com.pm.patientservice.service;

import com.pm.patientservice.dto.PatientRequestDTO;
import com.pm.patientservice.dto.PatientResponseDTO;
import com.pm.patientservice.mapper.PatientMapper;
import com.pm.patientservice.model.Patient;
import com.pm.patientservice.repository.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    private PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public List<PatientResponseDTO>getPatient() {
        List<Patient> patients = patientRepository.findAll();

        List<PatientResponseDTO>patientResponseDTOS = patients.stream().map(PatientMapper::toDTO).toList();
        return patientResponseDTOS;
    }

    public PatientResponseDTO createPatient(PatientRequestDTO patientRequestDTO) {
        Patient newPatient = patientRepository.save(PatientMapper.toModel(patientRequestDTO));

        return PatientMapper.toDTO(newPatient);
    }


}
