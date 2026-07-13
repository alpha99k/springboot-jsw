package net.likelion.bebc25.spring.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.xml.transform.Source;

@Component
public class Driver {
    @Autowired
    private Car car;

    public  void driveCar(int maxSpeed){
        car.startEngine();
        car.drive();
        car.stopEngine();
    }
}
