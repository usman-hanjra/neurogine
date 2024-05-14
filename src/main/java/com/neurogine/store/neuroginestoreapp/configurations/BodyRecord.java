package com.neurogine.store.neuroginestoreapp.configurations;

import org.beanio.annotation.Field;

public class BodyRecord {

    @Field(at = 1, length = 1, required = true)
    private String recordType;

    @Field(at = 20, length = 15, required = true)
    private String referenceNo;

    @Field(at = 40, length = 16, required = true)
    private String amount;

    public String getRecordType() {
        return recordType;
    }

    public void setRecordType(String recordType) {
        this.recordType = recordType;
    }

    public String getReferenceNo() {
        return referenceNo;
    }

    public void setReferenceNo(String referenceNo) {
        this.referenceNo = referenceNo;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}
