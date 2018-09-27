/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package org.archer.lab.appointment.facade;

import java.util.Date;

import org.archer.lab.appointment.model.Doctor;

public class HystrixClientFallback implements DoctorService
{
    @Override
    public Doctor getDoctorForAppointment(String doctorId) {
        return new Doctor("default", "default doctor", new Date());
    }
}
