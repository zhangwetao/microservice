/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package org.archer.lab.atlas.api.data;

import lombok.Data;

@Data
public class ResponseHeader implements MessageHeader {
    private String status;
    private String returnCode;
    private String returnMsg;

}
