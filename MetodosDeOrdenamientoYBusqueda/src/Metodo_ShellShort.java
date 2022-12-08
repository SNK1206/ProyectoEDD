public class Metodo_ShellShort {
    private void ShellShort(int[] Vector){
        for(int salto=Vector.length/2;salto!=0;salto/=2){
            boolean cambios=true;
            while(cambios){
                cambios=false;
                for(int i=salto;i<Vector.length;i++){
                    if(Vector[i-salto]>Vector[i]){
                        int aux=Vector[i];
                        Vector[i]=Vector[i-salto];
                        Vector[i-salto]=aux;
                        cambios=true;
                    }
                }
            }
        }
    }
    public String MostrarShellShort(int[] Vector){
        ShellShort(Vector);
        String cad="";
        for(int i=0;i<Vector.length;i++){
            cad+=Vector[i]+" ";
        }
        return cad;
    }
    public String MostrarTiempoShellShort(int[] Vector){
        long starTime=System.nanoTime();
        ShellShort(Vector);
        long endTime=System.nanoTime();
        long timeElapsed=endTime-starTime;
        return "El Metodo ShellShort tardo {"+timeElapsed+" NanoSegundos}";
    }
}