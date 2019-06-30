import java.util.Scanner;
class transporteMaritimo{
  public static void main(String[] args) {
    int kilogramos;
    int destino;
    int tipoCarga;
    String descCarga;
    
    
   
    Scanner leer = new Scanner(System.in);
    System.out.println("Bienvenido al sistema de transporte maritimo");
    System.out.println("Cuantos Kilogramos desea transportar?");
    kilogramos = leer.nextInt();
    System.out.println("Que tipo de carga desea transportar? 1=Carga Normal / 2=Carga Refrigerada");
    tipoCarga = leer.nextInt ();
    
    //if del tipo de carga
     
    if (tipoCarga == 1){
      descCarga = "Carga Normal"; 
    }else if (tipoCarga == 2) {  
      descCarga = "Carga Refrigerada";
    }
    // fin del if
    descCarga = leer.next();
    System.out.println("Cual es el destino de su carga? 1 = Asia / 2 = Norte America / 3 = Europa / 4 = Australia");
    destino = leer.nextInt();
    System.out.println("Usted va a enviar "+kilogramos+" kilogramos, en tipo de carga "+descCarga+" y el destino de su carga es "+destino);
    leer.close(); 
    
   
                         
  
 }//fin del main
}//fin transporteMaritimo