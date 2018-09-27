/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package org.archer.lab.cash.domain;

public class User extends Account<Long> {
    private String nickName;
    private String password;

    private User(Long id) {
        super(id);

    }

}
