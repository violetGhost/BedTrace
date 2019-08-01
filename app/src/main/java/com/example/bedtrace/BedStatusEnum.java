package com.example.bedtrace;

public enum BedStatusEnum {

    PATIENTIN("Admitted"),
    DISCHARGE("Discharge");

    private String stingValue;

    BedStatusEnum(String stingValue) {
        this.stingValue = stingValue;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public String getStingValue() {
        return stingValue;
    }

    public void setStingValue(String stingValue) {
        this.stingValue = stingValue;
    }
}
