public class Task2 {

    public static void main(String[] args) {
        double precio = obtenerPrecio(16500);
        System.out.println("El precio con Iva incluido es: ");
        System.out.println(precio);

    }

    static double obtenerPrecio(double valor){
        return valor + (valor*0.16);

    }
}
