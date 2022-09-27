package com.nest.Bill;

import java.awt.print.PrinterGraphics;

public class FoodItems {
    Integer Tea,Shakes,Cake,Freshjuice,Icecream;

    public Integer getTea() {
        return Tea;
    }

    public void setTea(Integer tea) {
        Tea = tea;
    }

    public Integer getShakes() {
        return Shakes;
    }

    public void setShakes(Integer shakes) {
        Shakes = shakes;
    }

    public Integer getCake() {
        return Cake;
    }

    public void setCake(Integer cake) {
        Cake = cake;
    }

    public Integer getFreshjuice() {
        return Freshjuice;
    }

    public void setFreshjuice(Integer freshjuice) {
        Freshjuice = freshjuice;
    }

    public Integer getIcecream() {
        return Icecream;
    }

    public void setIcecream(Integer icecream) {
        Icecream = icecream;
    }

    public FoodItems(Integer tea, Integer shakes, Integer cake, Integer freshjuice, Integer icecream) {
        Tea = tea;
        Shakes = shakes;
        Cake = cake;
        Freshjuice = freshjuice;
        Icecream = icecream;
    }
}
