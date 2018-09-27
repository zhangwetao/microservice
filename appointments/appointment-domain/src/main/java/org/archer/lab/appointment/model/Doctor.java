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
public class Doctor {
    public static final String JP_DOCTORID = "doctorId";
    public static final String JP_NAME = "name";
    public static final String JP_POSTED = "posted";

    private String doctorId;
    private String name;
    private Date posted;

    public Doctor() {
    }

    public Doctor(String doctorId, String name, Date posted) {
        this.doctorId = doctorId;
        this.name = name;
        this.posted = posted;
    }

    @JsonProperty(JP_DOCTORID)
    public String getDoctorId() {
        return doctorId;
    }

    @JsonProperty(JP_NAME)
    public String getName() {
        return name;
    }

    @JsonProperty(JP_POSTED)
    @JsonSerialize(using = CustomDateToStringSerializer.class)
    public Date getPosted() {
        return posted;
    }
}
