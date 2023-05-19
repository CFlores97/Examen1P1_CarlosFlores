
package examen1p1_carlosflores;
import java.util.Scanner;

public class Examen1P1_CarlosFlores {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;
        
        while (running){
            System.out.println("1. Sumador Binario");
            System.out.println("2. Estrella de David");
            System.out.println("3. Salir");
            
            int opcion = sc.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println("Ingrese un numero binario: ");
                    String num1 = sc.next();
                    System.out.println("Ingrese su segundo numero binario: ");
                    String num2 = sc.next();
                    boolean equal = true;
                    
                    // Validacion
                    
                    for (int i = 0; i < num1.length() - 1; i++)
                    {
                        char digit_num1 = num1.charAt(i);
                        
                        if (digit_num1 < 48 || digit_num1 > 49){
                            System.out.println("Nuevamente, ingrese un numero binario!");
                            break;
                        }
                    }
                    
                    for (int j = 0; j < num2.length() -1; j++)
                    {
                        char digit_num2 = num2.charAt(j);
                        
                        if (digit_num2 < 48 || digit_num2 > 49)
                        {
                            System.out.println("Nuevamente, ingrese un numero binario! Solo es permitido 0 y 1");
                            break;
                        }
                    }
                    
                    if (num1.length() != num2.length())
                    {
                        System.out.println("Ambos numeros tienen que ser de la misma longitud. ");
                        equal = false;
                    }
                    
                    while (equal)
                    {
                        //TODO: Suma de binarios
                        equal = false;
                    }
      
                    break;
                    
                case 2:
                    System.out.println("Ingrese un tamaño: ");
                    int size = sc.nextInt();
                    boolean draw = true;
                    
                    if (size < 9 || size % 2 == 0){
                        System.out.println("¡ERROR! SOLO NUMEROS IMPARES Y MAYORES QUE 9!");
                        draw = false;
                    }
                    
                    while (draw)
                    {
                        // Imprime la parte superior de la estrella
                        for (int c = 1; c <= size / 2 + 1; c++)
                        {
                            if (c != size / 2 + 1){
                                System.out.print(" ");
                            }
                            else{
                                System.out.print("+");
                            }
                            
                        }
                        
                        // Logica de la parte interior de la estrella
                        System.out.println();
                        for (int i =1; i <= size / 2; i++)
                        {
                            for (int g = 1; g <= size / 2; g++)
                            {
                                if(i == g && i != 1){
                                    System.out.print("*");
                                }
                                else if(g == size / 2 - i || i == size / 2){
                                    System.out.print("+");
                                }
                                else if(i == 1){
                                    System.out.print("*");
                                }
                                else{
                                    System.out.print(" ");
                                }
                                
                            }
                            System.out.print("");
                            for (int g = 1; g <= size / 2; g++)
                            {
                                if(i == g && i != 1){
                                    System.out.print("+");
                                }
                                else if(g == size / 2 - i || i == size / 2){
                                    System.out.print("+");
                                }
                                else if(i == 1){
                                    System.out.print("*");
                                }
                                else{
                                    System.out.print(" ");
                                }

                            }
                            System.out.println();
                        }
                        
                        // Imprime parte inferior de la estrella
                        for (int c = 1; c <= size / 2 + 1; c++)
                        {
                            if (c != size / 2 + 1){
                                System.out.print(" ");
                            }
                            else{
                                System.out.print("*");
                            }
                            
                        }
                        System.out.println();
                        
                        draw = false;
                    }
                    
                    
                    
                    break;
                    
                case 3:
                    running = false;
                    break;
                    
                default:
                    break;
            }
        }
        
    }
    
}
