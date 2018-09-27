/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package org.archer.lab.atlas.api.data;

public class MessageBody<D> {
    private D data;
    public D getMessageData() {
        return data;
    }
}
