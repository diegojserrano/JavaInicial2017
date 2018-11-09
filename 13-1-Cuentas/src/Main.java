public class Main {

    public static void main(String[] args) {

        Cuenta c1 = new CajaAhorro(11);
        Cuenta c2 = new CuentaCorriente(22, 1000);

        c1.depositar(2000);
        c2.depositar(2000);

        extraerImporte(c1,500);
        extraerImporte(c2,500);

        extraerImporte(c1,1800);
        extraerImporte(c2,1800);

        System.out.println(c1);
        System.out.println(c2);
    }
    
    public static void extraerImporte(Cuenta c, float importe) {
        c.extraer(importe); // Llamada polimórfica
    }

}
