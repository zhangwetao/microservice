/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package org.archer.lab.atlas.api.data;

import lombok.Data;

@Data
public class RequestHeader implements MessageHeader {
    private String productCode;

}
