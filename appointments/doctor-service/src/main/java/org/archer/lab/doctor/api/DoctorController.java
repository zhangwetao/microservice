/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package org.archer.lab.doctor.api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import javax.print.Doc;

import org.archer.lab.appointment.model.Doctor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/doctors")
public class DoctorController {
    private SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

    private List<Doctor> doctors;

    public DoctorController() throws ParseException{
        this.doctors = Arrays.asList(
                new Doctor("d001", "Li Shizhen", formatter.parse("2015-04-23")),
                new Doctor("d002", "Hua Tuo", formatter.parse("2015-05-12")),
                new Doctor("d002", "Hua Tuo", formatter.parse("2015-04-27")));
    }

    @GetMapping
    public List<Doctor> getCommentsByTaskId() {
        return doctors;
    }

    @RequestMapping(value = "/{doctorId}", method = RequestMethod.GET, headers = "Accept=application/json")
    public Doctor getDoctorByDoctorId(final String doctorId) {
        Optional<Doctor> doctor = doctors.stream().filter(c -> Objects.equals(c.getDoctorId(), doctorId)).findAny();
        return doctor.isPresent() ? doctor.get() : null;
    }
}
