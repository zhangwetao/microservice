/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package org.archer.lab.cash.domain;

public class Account<ID> {
    ID id;
    String name;
    protected Account(ID id) {
        this.id = id;
    }

    public ID getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
