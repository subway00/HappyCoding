
package HW;


public class BMIModel {
    private double height;
    private double weight;
    private double bmi;
    
    public void setHeight(int height) {
        this.height = height;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
   
    public double getBmi() {                        //can not declare getBMI
        
        bmi = weight /( (height/100)*(height/100) ); 
        return bmi;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }
    
}
