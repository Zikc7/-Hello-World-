/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author santi
 */
public class Cafetera {
    private int capacidadMax;
    private int cantidadAct;

    public Cafetera() {
    }

    public Cafetera(int capacidadMax, int cantidadAct) {
        this.capacidadMax = capacidadMax;
        this.cantidadAct = cantidadAct;
    }

    public int getCapacidadMax() {
        return capacidadMax;
    }

    public void setCapacidadMax(int capacidadMax) {
        this.capacidadMax = capacidadMax;
    }

    public int getCantidadAct() {
        return cantidadAct;
    }

    public void setCantidadAct(int cantidadAct) {
        this.cantidadAct = cantidadAct;
    }

    @Override
    public String toString() {
        return "Cafetera{" + "capacidadMax=" + capacidadMax + ", cantidadAct=" + cantidadAct + '}';
    }
    
    
}
