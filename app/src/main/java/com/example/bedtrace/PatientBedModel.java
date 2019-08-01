package com.example.bedtrace;

public class PatientBedModel {

    String id;
    String patientName;
    String registrationNo;
    String ward;
    String bed;
    String bedStatus;

    public PatientBedModel() {}

    public PatientBedModel(String id, String patientName, String registrationNo, String ward, String bed, String bedStatus) {
        this.id = id;
        this.patientName = patientName;
        this.registrationNo = registrationNo;
        this.ward = ward;
        this.bed = bed;
        this.bedStatus = bedStatus;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getRegistrationNo() {
        return registrationNo;
    }

    public void setRegistrationNo(String registrationNo) {
        this.registrationNo = registrationNo;
    }

    public String getWard() {
        return ward;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }

    public String getBed() {
        return bed;
    }

    public void setBed(String bed) {
        this.bed = bed;
    }

    public String getBedStatus() {
        return bedStatus;
    }

    public void setBedStatus(String bedStatus) {
        this.bedStatus = bedStatus;
    }
}
