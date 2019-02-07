
package quicksort;
/*Orden 4 números usando el método de ordenación QuickSort. */

import java.util.Scanner;
public class algoritmo_8_metodo_ordenamiento_QuickSort {
    public static void main (String [] args){
    Scanner teclado= new Scanner(System.in);
    
        System.out.print("Ingrese la dimension del vector: ");
        int tam=teclado.nextInt();
        int arreglo[]= new int[tam];
      
        //Ingresando valores al arreglo
        for(int i=0; i<arreglo.length; i++){
            System.out.print(i+1+":   ");
            arreglo[i]=teclado.nextInt();
        }

        quicksort(arreglo,0,tam-1);
      
        //Imprimiendo el arreglo ordenado
        System.out.println(" vector Ordenado ");
        for(int i =0; i<arreglo.length;i++){
         System.out.print("\t"+arreglo[i]+"\n");
     }
        System.out.println("digite el numero a buscar:");
        
    }
  
    //Metodo de ordenamineto Quick Sort
    static void quicksort(int arreglo[],int primero,int ultimo){
 int central,i,j;
 int pivote;
 central=(primero+ultimo)/2;
 pivote=arreglo[central];
 i=primero;
 j=ultimo;
 do{
   while(arreglo[i]<pivote) i++;
   while(arreglo[j]>pivote) j--;
   if(i<=j){
    int temp;
    temp=arreglo[i];
    arreglo[i]=arreglo[j]; /*intercambia A[i] con A[j] */
    arreglo[j]=temp;
    i++;
    j--;
   }
  }
 
 while(i<=j);
 if(primero<j)
  quicksort(arreglo,primero,j); /*mismo proceso con sublista izquierda*/
 if(i<ultimo)
  quicksort(arreglo,i,ultimo); /*mismo proceso con sublista derecha*/
}
  
  
}