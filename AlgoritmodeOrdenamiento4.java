
package metodoburbuja;

public class AlgoritmodeOrdenamiento4 {
int i,j, temporal,pasadas;
public AlgoritmodeOrdenamiento4(){
this.i=0;
this.j=0;
this.temporal=0;
     }

public void burbuja(int[] arreglo){
   pasadas=0;
    for(i=1;i<arreglo.length;i++){
   for(j=0;j<arreglo.length-1;j++){
   if(arreglo[j]>arreglo[j+1]){
   temporal=arreglo[j];
   arreglo[j]=arreglo[j+1];
   arreglo[j+1]=temporal;
   
     }
  pasadas++;
   }
    
  }
    System.out.println("Termino en " + pasadas + " pasadas" );
 }

   public void mostrarArreglo(int[] arreglo){
   
       int k;
   for(k=0; k<arreglo.length;k++){
   System.out.print("[" + arreglo[k] + "]");
 
   }
     System.out.println();
   }
    
    
}
