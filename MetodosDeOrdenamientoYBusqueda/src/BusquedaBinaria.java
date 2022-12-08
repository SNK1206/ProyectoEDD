import java.util.Arrays;

public class BusquedaBinaria {
    private boolean BusquedaBinaria(int[] Vector,int datoBuscar){
        Arrays.sort(Vector);
        int tam=Vector.length;
        int mitad=tam/2;
        if(Vector[mitad]==datoBuscar){
            return true;
        }
        if(tam<=1){
            return false;
        }
        if(Vector[mitad]>datoBuscar){
            return BusquedaBinaria(Arrays.copyOfRange(Vector,0, mitad),datoBuscar);
        }else{
            return BusquedaBinaria(Arrays.copyOfRange(Vector,mitad++, tam),datoBuscar);
        }
    }
    
    public String MostrarBi(int[] Vector,int datoBuscar){
        long starTime=System.nanoTime();
        if(BusquedaBinaria(Vector,datoBuscar)==true){
             long endTime=System.nanoTime();
            long timeElapsed=endTime-starTime;
            return "Tiempo="+timeElapsed+" NanoSegundos"+"/Si, se encontro "+datoBuscar;
        }
        long endTime=System.nanoTime();
        long timeElapsed=endTime-starTime;
        return "Tiempo="+timeElapsed+" NanoSegundos"+"/No, se encontro "+datoBuscar;
    }
}