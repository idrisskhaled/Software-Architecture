package com.directi.training.lsp.exercice_refactored;

public class ElectronicDuck extends Duck
{
    private boolean _on = false;

    @Override
    public void quack()
    {
        this.turnOn();
        System.out.println("Electronic duck is now on...");
        System.out.println("Electronic duck quack...");
        this.turnOff();
        System.out.println("Electronic duck is now off...");
    }

    @Override
    public void swim()
    {
        this.turnOn();
        System.out.println("Electronic duck is now on...");
        System.out.println("Electronic duck swim");
        this.turnOff();
        System.out.println("Electronic duck is now off...");

    }

    public void turnOn()
    {
        _on = true;
    }

    public void turnOff()
    {
        _on = false;
    }
}
