package com.example.dynamic_design;

public class Vet {
    private String vetName;
    private String petName;
    private String appointmentHour;
    private String AppointmentDate;
    private String SicknessDescription;
    private static int counter = 0;
    private int vetId;

    public Vet() {
    }

    public String getVetName() {
        return this.vetName;
    }

    public void setVetName(String vetName) {
        this.vetName = vetName;
    }

    public String getPetName() {
        return this.petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getAppointmentHour() {
        return this.appointmentHour;
    }

    public void setAppointmentHour(String appointmentHour) {
        this.appointmentHour = appointmentHour;
    }

    public String getAppointmentDate() {
        return this.AppointmentDate;
    }

    public void setAppointmentDate(String appointmentDate) {
        this.AppointmentDate = appointmentDate;
    }

    public String getSicknessDescription() {
        return this.SicknessDescription;
    }

    public void setSicknessDescription(String sicknessDescription) {
        this.SicknessDescription = sicknessDescription;
    }
}
