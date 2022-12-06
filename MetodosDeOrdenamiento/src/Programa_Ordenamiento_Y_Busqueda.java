import javax.swing.JOptionPane;

public class Programa_Ordenamiento_Y_Busqueda{
    public static void main(String[] args){
        MetodosOrdenamientoYBusqueda Vector=new MetodosOrdenamientoYBusqueda(11);
        System.out.println(Vector.Mostrar()+"-Matriz Normal");
        System.out.println(Vector.MostrarMeBur()+"-Metodo Burbuja");
        System.out.println(Vector.MostrarQuicksort()+"-Metodo Quicksort");
        System.out.println(Vector.MostrarShellShort()+"-Metodo ShellShort");
        System.out.println(Vector.MostrarRadix()+"-Metodo Radix");
        int N=Integer.parseInt(JOptionPane.showInputDialog("Valor que quieres Buscar"));
        System.out.println(Vector.BusquedaSecuencial(N)+"/"+"-Busqueda Secuencial");
        System.out.println(Vector.BusquedaBinaria(N)+"/"+"-Busqueda Binario");
    }
}