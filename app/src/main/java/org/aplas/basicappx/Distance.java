package org.aplas.basicappx;

public class Distance {
    private double meter;

    public Distance() {
    }

    public void setMeter(double meter) {
        this.meter = meter;
    }

    public double getMeter() {
        return this.meter;
    }

    public void setInch(double inch){
        this.meter = inch/39.3701;
    }

    public double getInch(){
        return (this.meter*39.3701);
    }

    public void setMile(double mile){
        this.meter = mile/0.000621371;
    }

    public double getMile(){
        return (this.meter*0.000621371);
    }

    public void setFoot(double feet){
        this.meter = feet/3.28084;
    }

    public double getFoot(){
        return (this.meter*3.28084);
    }

    public double convert(String oriUnit, String convUnit, double value){
        if (oriUnit.equals("Mtr")){
            switch (convUnit){
                case "Mtr":
                    setMeter(value);
                    value = getMeter();
                    break;
                case "Inc":
                    setInch(value);
                    value = getInch();
                    break;
                case "Mil":
                    setMile(value);
                    value = getMile();
                    break;
                case "Ft":
                    setFoot(value);
                    value = getFoot();
                    break;
            }
        }else if(oriUnit.equals("Inc")){
            switch (convUnit){
                case "Mtr":
                    setMeter(value);
                    value = getMeter();
                    break;
                case "Inc":
                    setInch(value);
                    value = getInch();
                    break;
                case "Mil":
                    setMile(value);
                    value = getMile();
                    break;
                case "Ft":
                    setFoot(value);
                    value = getFoot();
                    break;
            }

        }else if(oriUnit.equals("Mil")){
            switch (convUnit){
                case "Mtr":
                    setMeter(value);
                    value = getMeter();
                    break;
                case "Inc":
                    setInch(value);
                    value = getInch();
                    break;
                case "Mil":
                    setMile(value);
                    value = getMile();
                    break;
                case "Ft":
                    setFoot(value);
                    value = getFoot();
                    break;
            }
        }else if(oriUnit.equals("Ft")){
            switch (convUnit){
                case "Mtr":
                    setMeter(value);
                    value = getMeter();
                    break;
                case "Inc":
                    setInch(value);
                    value = getInch();
                    break;
                case "Mil":
                    setMile(value);
                    value = getMile();
                    break;
                case "Ft":
                    setFoot(value);
                    value = getFoot();
                    break;
            }
        }
        return value;
    }
}