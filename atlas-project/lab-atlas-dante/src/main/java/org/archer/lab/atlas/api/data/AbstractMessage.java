/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package org.archer.lab.atlas.api.data;

/**
 *
 * @param <H> message header
 * @param <D>
 * @author suwei3
 */
public class AbstractMessage<H extends MessageHeader, D> implements Message<H, D> {
    private H header;
    private D data;


    @Override
    public H getHeader() {
        return header;
    }

    @Override
    public D getData() {
        return data;
    }

    public void setData(D data) {
        this.data = data;
    }
}
