/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package org.archer.lab.appointment.facade;

import org.archer.lab.appointment.model.Patient;

public interface PatientService {
    Patient getPatientForAppointment(String patientId);
}
