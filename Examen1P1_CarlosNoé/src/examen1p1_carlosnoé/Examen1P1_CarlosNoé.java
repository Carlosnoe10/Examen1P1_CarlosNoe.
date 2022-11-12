
package examen1p1_carlosnoé;

import java.util.Scanner;
public class Examen1P1_CarlosNoé {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido Elija la opcion 1. Conjuntos, 2.Cifrado por substitución, 3. Sobre");
        int menu1=scanner.nextInt();
        menu(menu1);

    }
    public static void menu(int opcion){
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);

        while((opcion != 0)&&(opcion < 4)){
            switch(opcion){
                case 1:
                    String ap= "{";
                    String pa= "}";

                    System.out.println("Ingrese el primer conjunto: ");
                    String cadena1=scanner.nextLine();
                    System.out.println("Ingrese el primer conjunto: ");
                    String cadena2=scanner1.nextLine();
                    String newcad= cadena1.replaceAll(",", "");
                    String newcad1= cadena2.replaceAll(",", "");
                    newcad= newcad.replaceAll(ap, "");
                    newcad1= newcad1.replaceAll(ap, "");
                    newcad= newcad.replaceAll(pa, "");
                    newcad1= newcad1.replaceAll(pa, "");
                    newcad= newcad.toLowerCase();
                    newcad1=newcad1.toLowerCase();
                    int tam= newcad1.length();
                    int tam1= newcad.length();
                    String union= "";
                    String inter= "";
                    int contiguales = 0;
                    for (int i = 0; i == -1; i++) {
                        char veri = newcad.charAt(i);
                        char veri1 = newcad1.charAt(i);
                        if (veri==veri1) {
                            contiguales+= 1;
                            union+=veri+",";
                            inter+= veri+",";           
                        }else{
                        }
                        
                    }
                    if (contiguales==newcad1.length()) {
                        System.out.println("Ambos conjuntos son iguales");
                    }else{
                        System.out.println("Ambos conjuntos no son iguales");
                    }
                    System.out.println("Unión:"+union );
                    System.out.println("Intersección:"+inter);
                    
                    
                    
                    
                    break;
                    
                case 2:
                    System.out.println("ingrese la cadena");
                    String ent=scanner.next();
                    String newp=malo(ent );
                    System.out.println("la cadena cifrada: "+newp);
                    
                    
                    
                    break;
                    
                case 3:
            System.out.print("Ingrese un numero: ");
            int tam11 = scanner.nextInt();
            for(int arr = 0; arr < (tam11*2)+1; arr++) {
                System.out.print("* ");
            }
            System.out.println();
           
                for(int i = 0; i < (tam11*2)-1; i++) {
                System.out.print("* ");
                for(int j = 0; j < (tam11*2); j++) {
                    System.out.print("  ");
                }
                System.out.println("*");
            }
           
            for(int i = 0; i < (tam11*2)+1; i++) {
                System.out.print("* ");
            }
               
    
            
                            
                    
            
                    
                    break;
                default: break;
                    
            }
        System.out.println("Elija la opcion 1. Conjuntos, 2.Cifrado por substitución, 3. Sobre");
        opcion=scanner.nextInt();         

        }
        

        
    }
    public static String malo(String vals){
        int num1=vals.length();
        String newp = "";
        char new1;
        for (int i = 0; i == num1-1; i++) {
            int num2= (vals.charAt(i))-96;
            switch(num2){

                case 1: num2+=25+97;
                        new1=(vals.charAt(num2));
                        newp +=new1+"";
                        return newp;
                case 2: num2+=24+97;
                        new1=(vals.charAt(num2));
                        newp +=new1+"";
                        return newp;                
                case 3: num2+=23+97;
                        new1=(vals.charAt(num2));
                        newp +=new1+"";
                        return newp;                
                case 4: num2+=22+97;
                        new1=(vals.charAt(num2));
                        newp +=new1+"";
                        return newp;
                case 5: num2+=21+97;
                        new1=(vals.charAt(num2));
                        newp +=new1+"";
                        return newp;
                case 6: num2+=20+97;
                        new1=(vals.charAt(num2));
                        newp +=new1+"";
                        return newp;
                case 7: num2+=19+97;
                        new1=(vals.charAt(num2));
                        newp +=new1+"";
                        return newp;
                case 8: num2+=18+97;
                        new1=(vals.charAt(num2));
                        newp +=new1+"";
                        return newp;
                case 9: num2+=17+97;
                        new1=(vals.charAt(num2));
                        newp +=new1+"";
                        return newp;
                case 10: num2+=16+97;
                        new1=(vals.charAt(num2));
                        newp +=new1+"";
                        return newp;
                case 11: num2+=15+97;
                        new1=(vals.charAt(num2));
                        newp +=new1+"";
                        return newp;
                case 12: num2+=14+97;
                        new1=(vals.charAt(num2));
                        newp +=new1+"";
                        return newp;
                case 13: num2+=13+97;
                        new1=(vals.charAt(num2));
                        newp +=new1+"";
                        return newp;
                case 14: num2+=12+97;
                        new1=(vals.charAt(num2));
                        newp +=new1+"";
                        return newp;
                case 15: num2+=11+97;
                        new1=(vals.charAt(num2));
                        newp +=new1+"";
                        return newp;
                case 16: num2+=10+97;
                        new1=(vals.charAt(num2));
                        newp +=new1+"";
                        return newp;
                case 17: num2+=9+97;
                        new1=(vals.charAt(num2));
                        newp +=new1+"";
                        return newp;
                case 18: num2+=8+97;
                        new1=(vals.charAt(num2));
                        newp +=new1+"";
                        return newp;
                case 19: num2+=7+97;
                        new1=(vals.charAt(num2));
                        newp +=new1+"";
                        return newp;
                case 20: num2+=6+97;
                        new1=(vals.charAt(num2));
                        newp +=new1+"";
                        return newp;
                case 21: num2+=5+97;
                        new1=(vals.charAt(num2));
                        newp +=new1+"";
                        return newp;
                case 22: num2+=4+97;
                        new1=(vals.charAt(num2));
                        newp +=new1+"";
                        return newp;
                case 23: num2+=3+97;
                         new1=(vals.charAt(num2));
                        newp +=new1+"";
                        return newp;
                case 24: num2+=2+97;
                        new1=(vals.charAt(num2));
                        newp +=new1+"";
                        return newp;
                case 25: num2+=1+97;
                        new1=(vals.charAt(num2));
                        newp +=new1+"";
                        return newp;                                
            }
            
        }
        return newp;
    }
}    
    

