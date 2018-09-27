/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package org.archer.lab.atlas.api.data;

/**
 *
 */
public interface Message<H extends MessageHeader, D> {
    H getHeader();
    D getData();
}
