/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package org.archer.lab.appointment.model;

import java.util.Date;

import lombok.Data;

@Data
public class Appointment {
    private String appoinmentId;
    private String doctorId;
    private String patientId;
    private Date start;
    private Date end;
    private Doctor doctor;
    private Patient patient;

    public Appointment(String appoinmentId, String doctorId, String patientId, Date start, Date end) {
        this.appoinmentId = appoinmentId;
        this.doctorId = doctorId;
        this.patientId = patientId;
        this.start = start;
        this.end = end;
    }


}
