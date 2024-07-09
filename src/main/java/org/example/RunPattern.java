package org.example;


public class RunPattern {
    public static void main(String[] args) {
        System.out.println("Example showing use of Template Method Pattern");
        System.out.println("---- ---- ---- ---- ----");
        System.out.println("Creating Tasks - Deliverables");
        Task primaryTask = new Task("Putting  staJVM on the Moon", "Lunar Mission as part of JavaSpace Program", 240.0, 100.0);
        primaryTask.addProjectItem(new Task("Establish Ground Control", "", 1000.0, 10.0));
        primaryTask.addProjectItem(new Task("Train Javanauts", "", 80.0, 30.0));
        Deliverable deliverableOne = new Deliverable("Lunar Landing Module", "Modify existing vehicle for Project", 2800, 40.0, 35.0);
        System.out.println("Calculating cost estimate using Template Method - getCostEstimate()");
        System.out.println();
        System.out.println("Total Cost Estimate for " + primaryTask);
        System.out.println("\t" + primaryTask.getCostEstimate());
        System.out.println();
        System.out.println("Total Cost Estimate for " + deliverableOne);
        System.out.println("\t" + deliverableOne.getCostEstimate());
        System.out.println("---- ---- ---- ---- ----");
    }
}