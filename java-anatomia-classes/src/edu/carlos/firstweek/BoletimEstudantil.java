package edu.carlos.firstweek;
public class BoletimEstudantil {
    public static void main(String[] args) {
        // arquivo BoletimEstudantil.java

        int mediaFinal = 7;
        if (mediaFinal < 6)
            System.out.println("REPROVADO");
        else if (mediaFinal == 6)
            System.out.println("PROVA MINERVA");
        else
            System.out.println("APROVADO");
    }
}
