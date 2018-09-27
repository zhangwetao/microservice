/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package org.archer.lab.cash.domain;

public class DeductStrategy implements BestMatchStrategy<AccountEntry, Customer, CashUnit> {

    @Override
    public CashUnit route(AccountEntry entry, Customer customer) {
        return null;
    }
}
