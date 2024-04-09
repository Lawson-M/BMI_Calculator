/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2;
/**
 *Finds the BMI
 * @author ltmer
 */


public class BMICalculator {
    private int ft;
    private int in;
    private int lbs;
    
    public BMICalculator(int feet, int inch, int pound){
        this.ft=feet;
        this.in=inch;
        this.lbs=pound;
    }
    public String Calc(){
        double height = this.ft*12+this.in;  //finding height in inches
        double weight = this.lbs;  //converting weight to double
        double ans =(weight * 703)/(height*height);//finding bmi
        
        String bmi = Double.toString(ans);
        bmi = bmi.substring(0, bmi.indexOf(".")+ 3);
        return bmi;   
    }

}
