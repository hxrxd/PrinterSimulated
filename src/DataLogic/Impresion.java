/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataLogic;

import Stadistic.Triangular;

/**
 *
 * @author Usuario
 */
public abstract class Impresion {
    int min;
    int max;
    int medium;

    public Impresion(int min, int max, int medium) {
        this.min = min;
        this.max = max;
        this.medium = medium;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMedium() {
        return medium;
    }

    public void setMedium(int medium) {
        this.medium = medium;
    }
    
    public abstract void recalcularValores();
}
