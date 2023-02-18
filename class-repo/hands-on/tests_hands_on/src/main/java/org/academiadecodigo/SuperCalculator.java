package org.academiadecodigo;

public class SuperCalculator {

    private Brain brain;
    private Display display;
    private int battery;

    public SuperCalculator(Brain brain, Display display){
        this.brain = brain;
        this.display = display;
        this.battery = 100;
    }

    public void add(){
        if(this.battery <= 0){
            display.showError("No battery left for the operation! Please Recharge.");
            return;
        }

        decrementBattery();

        int firstOperand = display.getUserInput();
        int secondOperand = display.getUserInput();

        display.showResult(brain.sum(firstOperand, secondOperand));
    }

    public void recharge(){
        this.battery = 100;
    }

    public int getBattery(){
        return this.battery;
    }

    private void decrementBattery(){
        if(this.battery <= 10){
            this.battery = 0;
            return;
        }

        this.battery -= 10;
    }
}
