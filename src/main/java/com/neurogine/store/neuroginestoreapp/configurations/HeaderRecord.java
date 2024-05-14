package com.neurogine.store.neuroginestoreapp.configurations;

import org.beanio.annotation.Field;

public class HeaderRecord {

    @Field(at = 1, length = 1, required = true)
    private String recordType;

    @Field(at = 14, length = 15, required = true)
    private String fileType;

    public String getRecordType() {
        return recordType;
    }

    public void setRecordType(String recordType) {
        this.recordType = recordType;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }
}


