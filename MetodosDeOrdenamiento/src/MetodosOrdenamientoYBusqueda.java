import java.util.ArrayList;
import java.util.Arrays;

public class MetodosOrdenamientoYBusqueda {
    int Vector[];
    
    public MetodosOrdenamientoYBusqueda(int tamano){
        Vector=new int[tamano];
    }
    private void valAleVector(){
        for(int ren=0;ren<Vector.length;ren++){
            Vector[ren]=(int)(long)(Math.random()*20000);
        }
    }
    public String Mostrar(){
        valAleVector();
        String cad="";
        for(int i=0;i<Vector.length;i++){
            cad+=Vector[i]+" ";
        }
        return cad;
    }
    //Metodo Burbuja
    private void MetodoBurbuja(){
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
    public String MostrarMeBur(){
        MetodoBurbuja();
        String cad="";
        for(int i=0;i<Vector.length;i++){
            cad+=Vector[i]+" ";
        }
        return cad;
    }
    //Metodo Quicksort
    private void Quicksort(int primero,int ultimo){
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
            Quicksort(primero,j);
        }
        if(i<ultimo){
            Quicksort(i,ultimo);
        }
    }
    
    public String MostrarQuicksort(){
        Quicksort(0,Vector.length-1);
        String cad="";
        for(int i=0;i<Vector.length;i++){
            cad+=Vector[i]+" ";
        }
        return cad;
    }
    //Metodo ShellShort
    private void ShellShort(){
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
    public String MostrarShellShort(){
        ShellShort();
        String cad="";
        for(int i=0;i<Vector.length;i++){
            cad+=Vector[i]+" ";
        }
        return cad;
    }
    //Metodo Radix
    private void Radix(){
        /*int[][] np=new int [Vector.length][2];
        int[] q=new int[0x100];
        int i,j,k,l,f=0;
        for(k=0;k<4;k++){
            for(i=0;i<(np.length-1);i++)
                np[i][1]=i+1;
            np[i][1]=-1;
            for(i=0;i<q.length;i++)
                q[i]=-1;
            for(f=i=0;i<Vector.length;i++){
                j=((0xFF<<(k<<3))&Vector[i])>>(k<<3);
                if(q[j]==-1)
                    l=q[j]=f;
                else{
                    l=q[j];
                    while(np[l][1]!=-1)
                        l=np[l][1];
                    np[l][1]=f;
                    l=np[l][1];
                }
                f=np[f][1];
                np[l][0]=Vector[i];
                np[l][1]=-1;
            }
            for(l=q[i=j=0];i<0x100;i++)
                for(l=q[i];l!=-1;l=np[l][1])
                    Vector[j++]=np[l][0];
        }*/
        int digito = maximoDeDigitos(Vector);
        for(int i=0; i==digito;i++){
           CrearYOrdenarEspacios(Vector,i); 
        }
    }
    private int maximoDeDigitos(int[] vector){
        int digito=1,base=10;
        for (int i:Vector){
            while(i>base){
                digito++;
                base*=10;
            }
        }
        return digito;
    }
    private void CrearYOrdenarEspacios(int[] vector,int digito){
        int base=(int)Math.pow(10,digito);
        ArrayList<ArrayList<Integer>>espacios=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<10;i++) {
            espacios.add(new ArrayList<Integer>());
        }
        for (int i:vector){
            int indice=i/base%10;
            espacios.get(indice).add(i);
        }
        int indice=0;
        for(ArrayList<Integer>espacio:espacios){
            for(int i:vector){
                vector[indice+1]=i;
            }
        }
                
    }
    public String MostrarRadix(){
        Radix();
        String cad="";
        for(int i=0;i<Vector.length;i++){
            cad+=Vector[i]+" ";
        }
        return cad;
    }
    //Metodo De Busqueda Secuencial
    public boolean BusquedaSecuencial(int datoBuscar){
        for(int pos=0;pos<Vector.length-1;pos++){
            if(Vector[pos]==datoBuscar){
                System.out.print(Vector[pos]+"/-");
                return true;
            }
        }
        return false;
        //Do-While
        /*int pos=0;
        do{
            if(Vector[pos]==dato){
                return true;
            }
            pos++;
        }while(pos<Vector.length-1);
        return false;
        //While
        int pos=0;
        while(pos<Vector.length-1){
            if(Vector[pos]==dato){
                return true;
            }
            pos++;
        }
        return false;*/
    }
    //Busqueda Binaria
    public boolean BusquedaBinaria(int datoBuscar){
        return BusquedaBinaria(Vector,datoBuscar);
    }
    private boolean BusquedaBinaria(int[] vector,int datoBuscar){
        /*MetodoBurbuja();
        int centro,primero,ultimo,valorCentro;
        primero=0;
        ultimo=Vector.length-1;
        while(primero<=ultimo){
            centro=(primero+ultimo)/2;
            valorCentro=Vector[centro];
            if(datoBuscar==valorCentro){
                return true;
            }else if(datoBuscar<valorCentro){
                ultimo=centro-1;
            }else{
                primero=centro+1;
            }
        }
        return false;*///Sin recursividad
        Arrays.sort(Vector);
        int tam=vector.length;
        int mitad=tam/2;
        if(vector[mitad]==datoBuscar){
            System.out.print(vector[mitad]+"/-");
            return true;
        }
        if(tam<=1)return false;
        if(vector[mitad]>datoBuscar){
            return BusquedaBinaria(Arrays.copyOfRange(vector,0, mitad),datoBuscar);
        }else{
            return BusquedaBinaria(Arrays.copyOfRange(vector,mitad++, tam),datoBuscar);
        }//Con recursividad
    }
}