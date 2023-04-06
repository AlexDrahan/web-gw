package com.example.webgw.model.enums;

import com.example.webgw.model.LiftGateDetails;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarData {
    String carId;
    CarType carType;
    String carDims; //temp solution
    String carModel;
    String carYear;
    String payload;
    boolean dockHigh;
    boolean airRide;
    LiftGateDetails liftGateDetails;
}
