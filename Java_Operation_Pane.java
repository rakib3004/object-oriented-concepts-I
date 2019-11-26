import java.util.Scanner;
import javax.swing.JOptionPane;


public class MainClass {
    
    
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        NumberProcessing processing_unit_1;
        int result;
  
        int input_number_from_user=0;       
        
         processing_unit_1 =new NumberProcessing();
        
        String input_as_string ;
        
        input_as_string = JOptionPane.showInputDialog("Enter Number");
        
        input_number_from_user =Integer.parseInt(input_as_string);
        
           result=processing_unit_1.getSumofOdd(input_number_from_user);         
 
           JOptionPane.showMessageDialog(null, "The result of Odd number Summation : "+result);
         
        result=processing_unit_1.getSumofPrime(input_number_from_user); 
         
    JOptionPane.showMessageDialog(null,"The result of Prime number Summation : " +result);   
      
     }    
}

public class NumberProcessing {          
    public NumberProcess()
    
    {
          
    }
        
  public int   getSumofOdd(int  targetNumber)
  {     
    int sumOfOdd =0;
      
    int   firstOdd=1;
    
    int iterator;
    for(iterator=firstOdd;iterator<=targetNumber;iterator=iterator+2)
    {
       sumOfOdd=sumOfOdd+iterator;
              
    }
    
    return sumOfOdd;
    
  } 
  
 public int   getSumofPrime(int  targetNumber)
  {
      int putPrime=0;
 
      int sumOfPrime =0;
      
  int firstNumber=2;
    
    int iterator,iterator_2;
    for(iterator=firstNumber;iterator<=targetNumber;iterator++)
    {
          putPrime= iterator;
        for(iterator_2=2;iterator_2<=(iterator/2);iterator_2++)
            
        {
        
            if(iterator%iterator_2==0)
                
            {
             putPrime=0;
             break;
             
            }
            
            }
       sumOfPrime=sumOfPrime+putPrime;
        }
       
    return sumOfPrime;
      
  }
}

