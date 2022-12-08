public class BusquedaSecuencial {
    private boolean BusquedaSecuencial(int[] Vector,int datoBuscar){
        for(int pos=0;pos<Vector.length-1;pos++){
            if(Vector[pos]==datoBuscar){
                return true;
            }
        }
        return false;
    }
    public String MostrarBuQue(int[] Vector,int datoBuscar){
       long starTime=System.nanoTime();
        if(BusquedaSecuencial(Vector,datoBuscar)==true){
             long endTime=System.nanoTime();
            long timeElapsed=endTime-starTime;
            return "Tiempo="+timeElapsed+" NanoSegundos"+"/Si, se encontro "+datoBuscar;
        }
        long endTime=System.nanoTime();
        long timeElapsed=endTime-starTime;
        return "Tiempo="+timeElapsed+" NanoSegundos"+"/No, se encontro "+datoBuscar;
    }
}