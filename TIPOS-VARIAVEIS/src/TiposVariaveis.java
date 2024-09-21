public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; //um numero short nao pode receber um int p pde passar de 32mil num ue comporta
        final double PI= 3.14;
        PI=10;
        System.out.println(PI);
    }
}
