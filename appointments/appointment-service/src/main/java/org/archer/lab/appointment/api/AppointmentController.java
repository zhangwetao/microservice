/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package org.archer.lab.appointment.api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;

import org.archer.lab.appointment.facade.DoctorService;
import org.archer.lab.appointment.facade.PatientService;
import org.archer.lab.appointment.model.Appointment;
import org.archer.lab.appointment.model.Doctor;
import org.archer.lab.appointment.model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class AppointmentController {
    private SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm");

    @Autowired
    private DoctorService doctorService;

    @Autowired
    private PatientService patientService;

    private List<Appointment> appointments = Arrays.asList(
            new Appointment("a001", "d001", "p001", formatter.parse("2017-05-01 14:00"), formatter.parse
                    ("2017-05-01 15:00")),
            new Appointment("a001", "d001", "p001", formatter.parse("2017-05-01 14:00"), formatter.parse
                    ("2017-05-01 15:00")));

    public AppointmentController() throws ParseException {
    }

    @RequestMapping(value = "{appointmentId}", method = RequestMethod.GET, headers = "Accept=application/json")
    public Appointment getTaskByTaskId(@PathVariable("appointmentId") String appointmentId)
    {
        Appointment result = null;
        for (Appointment currentTask : appointments)
        {
            if (currentTask.getAppoinmentId().equalsIgnoreCase(appointmentId))
            {
                result = currentTask;
                break;
            }
        }

        if (result == null) {
            Doctor doctor = doctorService.getDoctorForAppointment(result.getDoctorId());
            result.setDoctor(doctor);
            Patient patient = patientService.getPatientForAppointment(result.getPatientId());
            result.setPatient(patient);
        }
        return result;
    }

    @RequestMapping(value = "patients/{patientId}", method = RequestMethod.GET, headers = "Accept=application/json")
    public Patient getPatientById(@PathVariable("patientId") String patientId)
    {
        return patientService.getPatientForAppointment(patientId);
    }
}
