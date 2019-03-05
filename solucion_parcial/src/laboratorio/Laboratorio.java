// programa del examen variante A
// programa que muestra 10 productos y su existencia en la tienda, precio 



package laboratorio;
public class Laboratorio {

    
    public static void main(String[] args) {
       
        String stgNombreProducto[] = new String [10];{ // vector que muestra el nombre producto producto 
        stgNombreProducto[0]= "pan       ";
        stgNombreProducto[1]= "leche    ";
        stgNombreProducto[2]= "cereales";
        stgNombreProducto[3]= "huevos    ";
        stgNombreProducto[4]= "bananos    ";
        stgNombreProducto[5]= "manzanas";
        stgNombreProducto[6]= "frijoles";
        stgNombreProducto[7]= "lechuga    ";
        stgNombreProducto[8]= "queso    ";
        stgNombreProducto[9]= "jugo naranja";}
        
        int iDatosProducto [][] = new int[10][2];{                // crea aleatoriamente los datos de producto
        for(int icantidad=0; icantidad<10; icantidad++){
        //for(int fltprecio=0; fltprecio<10; fltprecio++)   {
        iDatosProducto[icantidad][0]=(int) (Math.random()*5+94);    // se crea random la cantidad de producto en existencia 
        iDatosProducto[icantidad][1]=(int) (Math.random()*100+20);}// se crea random el precio del producto
    }
        int iTotalAso[]=new int [10];{
        for(int k=0; k<10; k++)
        iTotalAso[k]= iDatosProducto[k][0]*iDatosProducto[k][1] ;}
     
    
    System.out.println("producto: "+"\t"+"\t"+"cantidad"+"\t"+"precio"+"\t"+"\t"+"total asociado");
      for (int i=0; i<10; i++){
      System.out.println(stgNombreProducto[i] +"\t\t"+iDatosProducto[i][0] +"\t\t"+iDatosProducto[i][1] +"\t"+"\t" +iTotalAso[i]);
      }
      System.out.print("El Total General es:" );
        }
}


