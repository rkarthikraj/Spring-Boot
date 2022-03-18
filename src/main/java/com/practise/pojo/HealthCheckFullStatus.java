package com.practise.pojo;

public class HealthCheckFullStatus extends HealthCheckShortStatus {
    private String currentTimestamp;

    public HealthCheckFullStatus() {

    }

    public HealthCheckFullStatus(String status) {
        super(status);
    }

    public HealthCheckFullStatus(String status, String currentTimestamp) {
        super(status);
        this.currentTimestamp = currentTimestamp;
    }

    public String getCurrentTimestamp() {
        return currentTimestamp;
    }

    public void setCurrentTimestamp(String currentTimestamp) {
        this.currentTimestamp = currentTimestamp;
    }
}
