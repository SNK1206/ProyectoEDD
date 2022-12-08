public class Metodo_QuickSort {
    private void Quicksort(int[] Vector,int primero,int ultimo){
        int i,j,pivote,aux;
        i=primero;
        j=ultimo;
        pivote=Vector[(primero+ultimo)/2];
        do{
            while(Vector[i]<pivote){
                i++;
            }
            while(Vector[j]>pivote){
                j--;
            }
            if(i<=j){
                aux=Vector[i];
                Vector[i]=Vector[j];
                Vector[j]=aux;
                i++;
                j--;
            }
        }while(i<=j);
        if(primero<j){
            Quicksort(Vector,primero,j);
        }
        if(i<ultimo){
            Quicksort(Vector,i,ultimo);
        }
    }
    
    public String MostrarQuicksort(int[] Vector){
        Quicksort(Vector,0,Vector.length-1);
        String cad="";
        for(int i=0;i<Vector.length;i++){
            cad+=Vector[i]+" ";
        }
        return cad;
    }
    public String MostrarTiempoQuicksort(int[] Vector){
        long starTime=System.nanoTime();
        Quicksort(Vector,0,Vector.length-1);
        long endTime=System.nanoTime();
        long timeElapsed=endTime-starTime;
        return "El Metodo Quicksort tardo {"+timeElapsed+" NanoSegundos}";
    }
}