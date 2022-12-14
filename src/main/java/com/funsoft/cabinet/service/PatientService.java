package com.funsoft.cabinet.service;

import com.funsoft.cabinet.entities.Patient;

import java.util.List;
import java.util.Map;

public interface PatientService {
    public Patient save(Patient patient);
    public List<Patient> getPatient();
    public Patient getPatient(Long id);
    public Map<String,Boolean> delete(Long id);
    public Patient update(Long id, Patient patient);
    public Patient findByPhone(String phone);

}
