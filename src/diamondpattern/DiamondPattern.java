/*
 * Program to display characters in diamond shape 
 */

package diamondpattern;

public class DiamondPattern {
    String [] alphabet= new String []{"a","b","c"};     // represents alphabet list of characters to be printed
    int row;                                           //represents row
    int col;                                          //represents coloumn
    int size=3;                                      //represents total rows 
    int space=3;                                    //represents variable used for space printing
    int reverse;                                   //represents variable used to iterate  in decreasing order
    int counter;                                  // represents a counter used for iterating through various loops

    void pattern(){       
        
        for (row=0;row<size;row++){                              // iterates through row
          for (counter=0;counter<space;counter++){              //print spaces to imitate top half of diamond pattern
              System.out.print(" ");
          }
          space--;                                             //remember to decrease space count for next iteration
            for(col=0;col<row;col++){                         // iterates through coloumn while it is less then row
                System.out.print(alphabet[col]);             //print alphabet at index 'col'
            }                   
            reverse=col;                                    //store the coloumn count to reverse
            while(reverse >= 0){                           // move backwords/descending order
                System.out.print(alphabet[reverse]);      //print alphabet at index 'reverse'
                reverse--;
            }
            System.out.println(" ");                     // go to next line
        }
                                                                
        space=2;                                        // reinitialize space because this time order of spaceing is 2 in first line and 
                                                       // 3 in consecutive line
        for (row=0;row<size;row++){                   //now we are wokring on second half of diamond pattern
                                                     // iterate through row
            
         for (counter=0;counter<space;counter++){              
              System.out.print(" ");
         }
         space++;
            for(counter=0;counter<col;counter++){     //iterate through colomn
                System.out.print(alphabet[counter]); // print alphabet at index 'col'
            }
            col--;
            for(reverse=0;reverse<col;reverse++){      // now we are just reusing the reverse variable, there is no backword movement
                System.out.print(alphabet[reverse]);  // iterate through coloumn and  pring alpabet array at index 'reverse'
            }
            System.out.println("");                  // go to next line 
        }
        
        
        
    }      
    public static void main(String[] args) {
        DiamondPattern objDP =new DiamondPattern();          //  declare object for DiamondPattern and initialize using default Constructor
        objDP.pattern();                                     
    }
    
}
