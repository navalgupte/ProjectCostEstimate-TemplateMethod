package org.example;

import java.io.Serializable;

/*
    ProjectItem - Abstract class that defines Template Method getCostEstimate().
    getCostEstimate() relies on abstract methods getTimeRequired() and getMaterialsCost().
    Subclasses are required to override these methods providing a customized way to calculate these values.
 */
public abstract class ProjectItem implements Serializable {
    private String name;
    private String description;
    private double rate;

    public ProjectItem() {}
    public ProjectItem(String name, String description, double rate) {
        this.name = name;
        this.description = description;
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getRate() {
        return rate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    // Template Method
    public final double getCostEstimate() {
        return getTimeRequired() * getRate() + getMaterialsCost();
    }

    @Override
    public String toString() {
        return getName();
    }

    public abstract double getTimeRequired();
    public abstract double getMaterialsCost();
}
