package prosky.skyprospringcalculator2.services;

import org.springframework.stereotype.Service;
import prosky.skyprospringcalculator2.exceptions.NotAllParametersAreGivenException;

@Service
public class Calculator2ServiceImpl implements Calculator2Service {

    public String hello(){
        return "Welcome to the Calculator!";
    }

    public String plus(String num1, String num2){
        if ((num1.isEmpty()) || (num2.isEmpty())) {
            throw new NotAllParametersAreGivenException("Not all parameters are given");
        } else return num1+" + "+num2+ " = " + (Integer.parseInt(num1) + Integer.parseInt(num2));
    }

    public String minus(String num1, String num2){
        if ((num1.isEmpty()) || (num2.isEmpty())) {
            throw new NotAllParametersAreGivenException("Not all parameters are given");
        } else return num1+" - "+num2+ " = " + (Integer.parseInt(num1) - Integer.parseInt(num2));
    }

    public String multiply(String num1, String num2){
        if ((num1.isEmpty()) || (num2.isEmpty())) {
            throw new NotAllParametersAreGivenException("Not all parameters are given");
        } else return num1+" * "+num2+ " = " + (Integer.parseInt(num1) * Integer.parseInt(num2));
    }

    public String divide(String num1, String num2) {
        if ((num1.isEmpty()) || (num2.isEmpty())) {
            throw new NotAllParametersAreGivenException("Not all parameters are given");
        } else {
            if (Integer.parseInt(num2) == 0) {
                throw new IllegalArgumentException("Division by zero");
            } else return num1 + " / " + num2 + " = " + (Integer.parseInt(num1) / Integer.parseInt(num2));
        }
    }
}
