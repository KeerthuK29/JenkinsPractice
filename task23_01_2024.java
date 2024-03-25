import java.util.Scanner;

public class task23_01_2024 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    System.out.println(input);
    char charArray[] = input.toCharArray();
    String inputC = sc.nextLine();
    System.out.println(inputC);
        switch(inputC){  
            
            case "even": 
                for (int i = 0; i < charArray.length; i++) {
            if(charArray[i]%2 == 0){
                
                System.out.println(charArray[i]);
            }
              
        }
        System.out.println();
        break;

            case "odd": 
            for (int i = 0; i < charArray.length; i++) {
            if(charArray[i]%2 != 0){
                
                System.out.println(charArray[i]);
            }  
             
        }
        System.out.println();
        break;
          default:
                System.out.println("Invalid input");  
                return;
            }  
        
        
    }
}
    
