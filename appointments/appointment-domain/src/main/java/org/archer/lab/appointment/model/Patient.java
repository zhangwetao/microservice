/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package org.archer.lab.appointment.model;

import java.util.Date;

import org.archer.lab.appointment.common.CustomDateToStringSerializer;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import lombok.Data;

@Data
public class Patient {
    public static final String JP_DOCTORID = "patientId";
    public static final String JP_NAME = "name";
    public static final String JP_POSTED = "posted";

    private String patientId;
    private String name;
    private Date posted;

    public Patient(String patientId, String name, Date posted) {
        this.patientId = patientId;
        this.name = name;
        this.posted = posted;
    }

    public String getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public Date getPosted() {
        return posted;
    }
}
