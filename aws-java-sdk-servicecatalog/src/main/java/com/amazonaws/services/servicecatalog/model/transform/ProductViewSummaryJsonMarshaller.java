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
package com.amazonaws.services.servicecatalog.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.servicecatalog.model.*;

import com.amazonaws.protocol.json.*;

/**
 * ProductViewSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProductViewSummaryJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(ProductViewSummary productViewSummary, StructuredJsonGenerator jsonGenerator) {

        if (productViewSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (productViewSummary.getId() != null) {
                jsonGenerator.writeFieldName("Id").writeValue(productViewSummary.getId());
            }
            if (productViewSummary.getProductId() != null) {
                jsonGenerator.writeFieldName("ProductId").writeValue(productViewSummary.getProductId());
            }
            if (productViewSummary.getName() != null) {
                jsonGenerator.writeFieldName("Name").writeValue(productViewSummary.getName());
            }
            if (productViewSummary.getOwner() != null) {
                jsonGenerator.writeFieldName("Owner").writeValue(productViewSummary.getOwner());
            }
            if (productViewSummary.getShortDescription() != null) {
                jsonGenerator.writeFieldName("ShortDescription").writeValue(productViewSummary.getShortDescription());
            }
            if (productViewSummary.getType() != null) {
                jsonGenerator.writeFieldName("Type").writeValue(productViewSummary.getType());
            }
            if (productViewSummary.getDistributor() != null) {
                jsonGenerator.writeFieldName("Distributor").writeValue(productViewSummary.getDistributor());
            }
            if (productViewSummary.getHasDefaultPath() != null) {
                jsonGenerator.writeFieldName("HasDefaultPath").writeValue(productViewSummary.getHasDefaultPath());
            }
            if (productViewSummary.getSupportEmail() != null) {
                jsonGenerator.writeFieldName("SupportEmail").writeValue(productViewSummary.getSupportEmail());
            }
            if (productViewSummary.getSupportDescription() != null) {
                jsonGenerator.writeFieldName("SupportDescription").writeValue(productViewSummary.getSupportDescription());
            }
            if (productViewSummary.getSupportUrl() != null) {
                jsonGenerator.writeFieldName("SupportUrl").writeValue(productViewSummary.getSupportUrl());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ProductViewSummaryJsonMarshaller instance;

    public static ProductViewSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ProductViewSummaryJsonMarshaller();
        return instance;
    }

}
