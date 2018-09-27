/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package org.archer.lab.atlas.api;

import org.archer.lab.atlas.api.data.Request;
import org.archer.lab.atlas.api.data.Response;

public abstract class AbstractAPIController<I, R> implements APIController<I, R> {
    @Override
    public Response<R> execute(Request<I> request) {
        I data = request.getData();
        R resultData = execute(data);
        Response<R> result = new Response<>();
        result.setData(resultData);
        return result;
    }

    protected abstract R execute(I data);
}
