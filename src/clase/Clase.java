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
public class Clase {

    private int Numerador;
    private int Denominador;

    public Clase(int Nume, int Deno, int Mix) throws DenominadorCeroException {
        this.Numerador = Nume;
        this.Denominador = Deno;
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

    public Clase Sumar(Clase f2) throws DenominadorCeroException {
        Clase f;
        int Nume, Deno;

        Nume = this.Numerador * f2.Denominador + this.Denominador * f2.Numerador;
        Deno = this.Denominador * f2.Denominador;
        f = new Clase(Nume, Deno, 1);
        return f;
    }

    public Clase Restar(Clase f2) throws DenominadorCeroException {
        Clase f;
        int Nume, Deno;

        Nume = this.Numerador * f2.Denominador - this.Denominador * f2.Numerador;
        Deno = this.Denominador * f2.Denominador;
        f = new Clase(Nume, Deno, 1);
        return f;
    }

    public Clase Multiplicar(Clase f2) throws DenominadorCeroException {
        Clase f;
        int Nume, Deno;

        Nume = this.Numerador * f2.Numerador;
        Deno = this.Denominador * f2.Denominador;
        f = new Clase(Nume, Deno, 1);
        return f;
    }

    public Clase Dividir(Clase f2) throws DenominadorCeroException {
        Clase f;
        int Nume, Deno;

        Nume = this.Numerador * f2.Denominador;
        Deno = this.Denominador * f2.Numerador;
        f = new Clase(Nume, Deno, 1);
        return f;
    }

}
