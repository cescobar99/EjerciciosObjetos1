/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase;

/**
 *
 * @author Camilo_Escobar
 */
public class Fracciones {

    private int Numerador;
    private int Denominador;

    public Fracciones(int Numero, int Denominador, int Mixto) throws DenominadorCeroException {
        this.Numerador = Numero;
        this.Denominador = Denominador;
        if (Denominador == 0) {
            throw new DenominadorCeroException();

        }

    }

    public int getDenominador() {
        return Denominador;
    }

    public void setDenominador(int Denominador) {
        this.Denominador = Denominador;
    }

    public int getNumerador() {
        return Numerador;
    }

    public void setNumerador(int Numerador) {
        this.Numerador = Numerador;
    }

    public Fracciones Sumar(Fracciones f2) throws DenominadorCeroException {
        Fracciones f;
        int Numerador, Denominador;

        Numerador = this.Numerador * f2.Denominador + this.Denominador * f2.Numerador;
        Denominador = this.Denominador * f2.Denominador;
        f = new Fracciones(Numerador, Denominador, 1);
        return f;
    }

    public Fracciones Restar(Fracciones f2) throws DenominadorCeroException {
        Fracciones f;
        int Numerador, Denominador;

        Numerador = this.Numerador * f2.Denominador - this.Denominador * f2.Numerador;
        Denominador = this.Denominador * f2.Denominador;
        f = new Fracciones(Numerador, Denominador, 1);
        return f;
    }

    public Fracciones Multiplicar(Fracciones f2) throws DenominadorCeroException {
        Fracciones f;
        int Numerador, Denominador;

        Numerador = this.Numerador * f2.Numerador;
        Denominador = this.Denominador * f2.Denominador;
        f = new Fracciones(Numerador, Denominador, 1);
        return f;
    }

    public Fracciones Dividir(Fracciones f2) throws DenominadorCeroException {
        Fracciones f;
        int Numerador, Denominador;

        Numerador = this.Numerador * f2.Denominador;
        Denominador = this.Denominador * f2.Numerador;
        f = new Fracciones(Numerador, Denominador, 1);
        return f;
    }

}
