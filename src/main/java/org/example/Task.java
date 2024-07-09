package org.example;

import java.util.ArrayList;
import java.util.Iterator;

/*
    Task Class - Represents a job that can consist of any number of subtasks or deliverables.
 */
public class Task extends ProjectItem {
    private ArrayList projectItems = new ArrayList();
    private double taskTimeRequired;

    public Task() {}
    public Task(String name, String description, double taskTimeRequired, double rate) {
        super(name, description, rate);
        this.taskTimeRequired = taskTimeRequired;
    }

    public void setTaskTimeRequired(double taskTimeRequired) {
        this.taskTimeRequired = taskTimeRequired;
    }

    public void addProjectItem(ProjectItem element) {
        if(!projectItems.contains(element)) {
            projectItems.add(element);
        }
    }

    public void removeProjectItem(ProjectItem element) {
        projectItems.remove(element);
    }

    public double getTaskTimeRequired() {
        return taskTimeRequired;
    }

    public Iterator getProjectItemIterator() {
        return projectItems.iterator();
    }

    public double getTimeRequired() {
        double totalTime = taskTimeRequired;
        Iterator items = getProjectItemIterator();
        while (items.hasNext()) {
            totalTime += ((ProjectItem) items.next()).getTimeRequired();
        }
        return totalTime;
    }

    public double getMaterialsCost() {
        double totalCost = 0;
        Iterator items = getProjectItemIterator();
        while (items.hasNext()) {
            totalCost += ((ProjectItem) items.next()).getMaterialsCost();
        }
        return totalCost;
    }
}
