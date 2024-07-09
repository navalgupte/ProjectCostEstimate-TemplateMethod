package org.example;

public class Deliverable extends ProjectItem {
    private double materialsCost;
    private double productionTime;

    public Deliverable() {}
    public Deliverable(String name, String description, double materialsCost, double productionTime, double rate) {
        super(name, description, rate);
        this.materialsCost = materialsCost;
        this.productionTime = productionTime;
    }

    public void setMaterialsCost(double materialsCost) {
        this.materialsCost = materialsCost;
    }

    public void setProductionTime(double productionTime) {
        this.productionTime = productionTime;
    }

    public double getMaterialsCost() {
        return materialsCost;
    }

    public double getTimeRequired() {
        return productionTime;
    }
}
