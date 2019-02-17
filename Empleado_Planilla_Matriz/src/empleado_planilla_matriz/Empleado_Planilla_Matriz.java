
package empleado_planilla_matriz;

import java.util.Scanner;


public class Empleado_Planilla_Matriz {

   
    public static void main(String[] args) {
      Scanner entrada=new Scanner(System.in);
       String [] nombre_empleado = new String[10];
       for (int i=0; i<10; i++)
       { System.out.print(i+1 +")ingrese el nombre del empleado  ");
          nombre_empleado[i]=entrada.next();
        } 
       int planilla [][]=new int[10][7];
       for(int i=0; i<10; i++){
       //for(int j=0; j<7; j++){
       planilla[i][0]=(int)(Math.random()*10+0);// codigo
       }
       for (int i=0; i<10; i++){
       planilla[i][1]=(int)(Math.random()*2900+2100); // sueldo base
       }
       for (int i=0; i<10; i++){
       planilla[i][2]=(int)(Math.random()*0+250); // bonificacion
       }
       for(int i=0; i<10; i++){
       planilla[i][3]=(int)(Math.random()*300+200);// comiciones
       }
       for(int i=0; i<10; i++){ 
       double b =0.0483; //iggs
       planilla[i][4]=(int) (planilla[i][1]*b);
       }
       for(int i=0; i<10; i++){
       planilla[i][5]=(int)(Math.random()*400+100);//descuento judicial 
       }
       for(int i=0; i<10; i++){ 
           planilla[i][6]=(int)(Math.random()*300+0); } // Isr
                                
       //planilla[10][7]=(int)(Math.random()*9+3);//sueldo liquido \***/
           System.out.print("codigo      nombre            sueldo base     bonificacion    comiciones    iggs     desceuntos jud      Isr      SUeldo liquido" );
            for(int i=0; i<10; i++){
                System.out.println();
           System.out.print(planilla[i][0] +"            "+nombre_empleado[i]+"                "+planilla[i][1] +   "            "+planilla[i][2] +"            "+planilla[i][3] +"         "+planilla[i][4] +"           "+planilla[i][5]); }
       }}
    

