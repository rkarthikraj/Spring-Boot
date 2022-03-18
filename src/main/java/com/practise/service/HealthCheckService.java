package com.practise.service;

import com.practise.pojo.HealthCheckFullStatus;
import com.practise.pojo.HealthCheckShortStatus;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class HealthCheckService {
    public HealthCheckShortStatus getShortStatus() {
        HealthCheckShortStatus objShortStatus = new HealthCheckShortStatus("ACTIVE");
        return objShortStatus;
    }

    public HealthCheckFullStatus getFullStatus() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        HealthCheckFullStatus objFullStatus = new HealthCheckFullStatus("ACTIVE", formatter.format(date));
        return objFullStatus;
    }
}
