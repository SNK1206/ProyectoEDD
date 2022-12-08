import javax.swing.JOptionPane;

public class Programa_Ordenamiento_Y_Busqueda{
    public static void main(String[] args){
        int tam;
        do{
            tam=Integer.parseInt(JOptionPane.showInputDialog("Tamaño del vector"));
            if(tam<=0){
                JOptionPane.showMessageDialog(null,"El tamaño debe ser mayor a 0");
            }
        }while(tam<=0);
        Vector objetoVector=new Vector(tam);
        Metodo_Burbuja VectorMB=new Metodo_Burbuja();
        Metodo_QuickSort VectorQ=new Metodo_QuickSort();
        Metodo_ShellShort VectorSS=new Metodo_ShellShort();
        Metodo_Radix VectorR=new Metodo_Radix();
        BusquedaSecuencial VectorBS=new BusquedaSecuencial();
        BusquedaBinaria VectorBB=new BusquedaBinaria();
        
        /*ANUNCIO:
        Tamaño de la matriz y Mostrar de la matriz normal que
        se va a utilizar para ver y tomar tiempo de cada metodo
        */
        System.out.println(objetoVector.Mostrar()+"-Matriz Normal");
        System.out.println("/-----------------------------------/");
        //Metodo Burbuja
        System.out.println(VectorMB.MostrarMeBur(objetoVector.Vector)+"-Metodo Burbuja");
        System.out.println(VectorMB.MostrarTiempoMebur(objetoVector.Vector));
        System.out.println("/-----------------------------------/");
        //Metodo Quicksort
        System.out.println(VectorQ.MostrarQuicksort(objetoVector.Vector)+"-Metodo Quicksort");
        System.out.println(VectorQ.MostrarTiempoQuicksort(objetoVector.Vector));
        System.out.println("/-----------------------------------/");
        //Metodo ShellShort
        System.out.println(VectorSS.MostrarShellShort(objetoVector.Vector)+"-Metodo ShellShort");
        System.out.println(VectorSS.MostrarTiempoShellShort(objetoVector.Vector));
        System.out.println("/-----------------------------------/");
        //Metodo Radix
        System.out.println(VectorR.MostrarRadix(objetoVector.Vector)+"-Metodo Radix");
        System.out.println(VectorR.MostrarTiempoRadix(objetoVector.Vector));
        System.out.println("/-----------------------------------/");
        int datoBuscar=Integer.parseInt(JOptionPane.showInputDialog("Valor que quieres Buscar"));
        //Busqueda Secuencial
        System.out.println(VectorBS.MostrarBuQue(objetoVector.Vector,datoBuscar)+"/"+"-Busqueda Secuencial");
        System.out.println("/-----------------------------------/");
        //Busqueda Binaria
        System.out.println(VectorBB.MostrarBi(objetoVector.Vector,datoBuscar)+"/"+"-Busqueda Binario");
    }
}