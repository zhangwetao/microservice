/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package org.archer.lab.appointment.facade;

import org.archer.lab.appointment.model.Doctor;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "doctor-webservice", fallback = HystrixClientFallback.class)
public interface DoctorService {

    @RequestMapping("/doctors/{doctorId}")
    Doctor getDoctorForAppointment(@PathVariable("doctorId") String doctorId);
}
