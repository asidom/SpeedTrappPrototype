/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package speedtrappprototype;

/**
 *
 * @author modis
 */
public class ReportDetails {
    
    private String[] idNum;
    private String[] driverName;
    private String[] licencePlate;
    private int[] speed;
    private String[] infringementDescription;
    private String[] date;
    private double[] fee;
    

    public ReportDetails(String[] id, String[] driverName, String[] licencePlate, int[] speed, String[] infringementDescription, String[] date, double[] fee) {
        this.idNum = id;
        this.driverName = driverName;
        this.licencePlate = licencePlate;
        this.speed = speed;
        this.infringementDescription = infringementDescription;
        this.date = date;
        this.fee = fee;
    }

    public String[] getIdNum() {
        return idNum;
    }

    public void setIdNum(String[] idNum) {
        this.idNum = idNum;
    }
    

    public String[] getDriverName() {
        return driverName;
    }

    public void setDriverName(String[] driverName) {
        this.driverName = driverName;
    }

    public String[] getLicencePlate() {
        return licencePlate;
    }

    public void setLicencePlate(String[] licencePlate) {
        this.licencePlate = licencePlate;
    }

    public int[] getSpeed() {
        return speed;
    }

    public void setSpeed(int[] speed) {
        this.speed = speed;
    }

    public String[] getInfringementDescription() {
        return infringementDescription;
    }

    public void setInfringementDescription(String[] infringementDescription) {
        this.infringementDescription = infringementDescription;
    }

    public String[] getDate() {
        return date;
    }

    public void setDate(String[] date) {
        this.date = date;
    }

    public double[] getFee() {
        return fee;
    }

    public void setFee(double[] fee) {
        this.fee = fee;
    }
    
    
    
}
