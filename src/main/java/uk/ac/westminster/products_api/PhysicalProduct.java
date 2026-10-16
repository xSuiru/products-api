package uk.ac.westminster.products_api;

public class PhysicalProduct extends Product{

    private double weightKg;
    private String dimention;

    public double getWeightKg() {
        return weightKg;
    }

    public void setWeightKg(double weightKg) {
        this.weightKg = weightKg;
    }

    public String getDimention() {
        return dimention;
    }

    public void SetDimention(String dimention) {
        this.dimention = dimention;
    }

}
