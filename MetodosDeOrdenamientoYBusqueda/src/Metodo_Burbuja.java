public class Metodo_Burbuja {
    private void MetodoBurbuja(int[] Vector){
        int aux;
        for(int i=0;i<Vector.length;i++){
            for(int j=0;j<Vector.length-1;j++){
                if(Vector[j]>Vector[j+1]){
                    aux=Vector[j];
                    Vector[j]=Vector[j+1];
                    Vector[j+1]=aux;
                }
            }
        }
    }
    public String MostrarMeBur(int[] Vector){
        MetodoBurbuja(Vector);
        String cad="";
        for(int i=0;i<Vector.length;i++){
            cad+=Vector[i]+" ";
        }
        return cad;
    }
    public String MostrarTiempoMebur(int[] Vector){
        long starTime=System.nanoTime();
        MetodoBurbuja(Vector);
        long endTime=System.nanoTime();
        long timeElapsed=endTime-starTime;
        return "El Metodo Burbuja tardo {"+timeElapsed+" NanoSegundos}";
    }
}