/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.simplesystemsmanagement.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.simplesystemsmanagement.model.*;

import com.amazonaws.protocol.json.*;

/**
 * MaintenanceWindowExecutionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MaintenanceWindowExecutionJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(MaintenanceWindowExecution maintenanceWindowExecution, StructuredJsonGenerator jsonGenerator) {

        if (maintenanceWindowExecution == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (maintenanceWindowExecution.getWindowId() != null) {
                jsonGenerator.writeFieldName("WindowId").writeValue(maintenanceWindowExecution.getWindowId());
            }
            if (maintenanceWindowExecution.getWindowExecutionId() != null) {
                jsonGenerator.writeFieldName("WindowExecutionId").writeValue(maintenanceWindowExecution.getWindowExecutionId());
            }
            if (maintenanceWindowExecution.getStatus() != null) {
                jsonGenerator.writeFieldName("Status").writeValue(maintenanceWindowExecution.getStatus());
            }
            if (maintenanceWindowExecution.getStatusDetails() != null) {
                jsonGenerator.writeFieldName("StatusDetails").writeValue(maintenanceWindowExecution.getStatusDetails());
            }
            if (maintenanceWindowExecution.getStartTime() != null) {
                jsonGenerator.writeFieldName("StartTime").writeValue(maintenanceWindowExecution.getStartTime());
            }
            if (maintenanceWindowExecution.getEndTime() != null) {
                jsonGenerator.writeFieldName("EndTime").writeValue(maintenanceWindowExecution.getEndTime());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static MaintenanceWindowExecutionJsonMarshaller instance;

    public static MaintenanceWindowExecutionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MaintenanceWindowExecutionJsonMarshaller();
        return instance;
    }

}
