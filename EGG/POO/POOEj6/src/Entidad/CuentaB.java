package Entidad;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author santi
 */
public class CuentaB {

    private int numC;
    private long dni;
    private double saldoAc;

    public CuentaB() {
    }

    public CuentaB(int numC, long dni, double saldoAc) {
        this.numC = numC;
        this.dni = dni;
        this.saldoAc = saldoAc;
    }

    public CuentaB(double saldoAc) {
        this.saldoAc = saldoAc;
    }

    public int getNumC() {
        return numC;
    }

    public void setNumC(int numC) {
        this.numC = numC;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public double getSaldoAc() {
        return saldoAc;
    }

    public void setSaldoAc(double saldoAc) {
        this.saldoAc = saldoAc;
    }

    @Override
    public String toString() {
        return "Número de ceunta=" + numC + ", DNI=" + dni + ", Saldo=" + saldoAc;
    }

}
