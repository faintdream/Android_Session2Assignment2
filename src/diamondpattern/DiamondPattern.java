/*
 * Program to display characters in diamond shape 
 */

package diamondpattern;

public class DiamondPattern {
    String [] alphabet= new String []{"","a","b","c","",""};
    int row,col,display,odd=1,size=4,space=2,counter;
    
    void pattern(){       
        for (row=1;row<size;row++){        
            display=0;
            for(col=1;col<=odd;col++){               
                if(col>row){
                    display=display-1;
                }
                 else{
                    display=display+1;
                }
                  for(counter=0;counter<space;counter++){
                      System.out.print(" ");
                  }
//                  System.out.print("");
//                  System.out.print(display);
                System.out.print(alphabet[display]);                  
                  space--;
            }
            odd=odd+2;
            System.out.println("");
        }
     
        odd=5;
        col=odd;
        size=0;
        space=0;
        int counter=0;        
    for(row=4;row>size;row--){        
       for(int i=0;i<space;i++){
                      System.out.print(" ");
             }          
        for(;col>counter;col--){
                
               
            System.out.print(col);
//            System.out.print(alphabet[col]);
        }
   
        System.out.println();
        odd-=2;
        col=odd;
        space++;
        
        
        
    }
   
    }
    
    public static void main(String[] args) {
        DiamondPattern objDP =new DiamondPattern();
        objDP.pattern();
    }
    
}
