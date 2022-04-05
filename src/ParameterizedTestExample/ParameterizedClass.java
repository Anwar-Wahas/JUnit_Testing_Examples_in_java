package ParameterizedTestExample;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Created by Dell on 04/05/2022.
 */
public class ParameterizedClass {
    public boolean checkIfOddNumber(int n){
        if(n%2==0)
            return  false;
        else return true;
    }

    public static void main(String[] args) {
        Result result= JUnitCore.runClasses(ParameterizedTest.class);
        for(Failure failure :result .getFailures()){
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }

}
