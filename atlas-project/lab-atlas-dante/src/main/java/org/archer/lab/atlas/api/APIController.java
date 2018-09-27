/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package org.archer.lab.atlas.api;

import org.archer.lab.atlas.api.data.Request;
import org.archer.lab.atlas.api.data.Response;

public interface APIController<I, R> {

    Response<R> execute(Request<I> request);
}
