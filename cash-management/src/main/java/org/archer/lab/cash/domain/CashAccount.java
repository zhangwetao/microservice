/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package org.archer.lab.cash.domain;

import java.util.List;

public class CashAccount extends Account<String> {
    private Long balance;
    private Currency currency;
    private List<SubAccount> subAccounts;
    public CashAccount(String id) {
        super(id);
    }

}
