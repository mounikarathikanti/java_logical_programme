 import java.io.*;   
  
class Unique{   

    public static void main (String[] args)    
    {   
        int arrayWithDuplicates[] = { 10, 3, 5, 3, 9, 22, 4, 3, 1, 5, 6 };  
          

        int len = arrayWithDuplicates.length;   
          
            
        int[] distinctArray = new int[20];  
          
        
        int index = 0;  
          
           for (int i = 0; i < len; i++)   
        {   
            int flag = 0;  
            
            for (int j = 0; j < i; j++){  
                if (arrayWithDuplicates[i] == arrayWithDuplicates[j]){   
                    flag = 1;  
                    break;   
                }  
            }  
            
            if (flag == 0){   
                distinctArray[index] = arrayWithDuplicates[i];  
                index++;    //increment index value  
            }  
        }  
   
        for(int i = 0; i < index; i++)  
            System.out.print( distinctArray[i] + " ");   
    }         
      
}   
