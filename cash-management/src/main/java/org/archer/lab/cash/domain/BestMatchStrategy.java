/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package org.archer.lab.cash.domain;

public interface BestMatchStrategy<P, E, R> {
    public R route(P parameter, E entity);
}
