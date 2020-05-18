/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author user
 */
public class YearRange {
    
            int divisor1=14;
        int divisor2=20;
    
     public void setRangeType1(int startYear,int endYear){

        for(int i=startYear;i<=endYear;i++)
        {
            if(i%divisor1==0&&i%divisor2==0){
            System.out.println("The year "+i+" is divisible by 14 and 20");
            }
            
        }
    }
     public int getFirstDivisor(){
     return divisor1;
     }
     
     public int getSecondDivisor(){
      return divisor2;
     }    
     
     public int getFirstYear(int startYear1){
     return startYear1;
     }
     
     public int getSecondYear(int endYear1){
     return endYear1;
     }
    
     
     
    
    
        public void setRangeType2(int startYear1,int endYear1){
        
             for(int i=startYear1;i<=endYear1;i++)
        {
           if(i%4==0){
               
            System.out.println(i);
            }}}
            
    
    
    
        public void setRangeType3(int startYear2,int endYear2){
        
             for(int i=startYear2;i<=endYear2;i++)
        {
           if(i%3==0){
            System.out.println("The year "+i+" is an olympic year");
            }}}
        
        

       
    
    
//    
//   public void getFirstDivisor(){
//              int[]divisonarray;
//              int firstYear=1970;
//  int j=0;
//        for(int i=2;j<1;i++){
//            int remainder=firstYear%i;
//       if(remainder==0){
//            j++;
//            System.out.println("\n \n The first divisor is ["+i+"]");
//
//                        
//    }
//        
//}
//       
//}
//   
//     public void getSecondDivisor(){
//        
//                int firstYear=1970;
//        int j=0;
//        for(int i=3;j<1;i++){
//        int remainder=firstYear%i;
//        if(remainder==0){
//            j++;
//            System.out.println(" The second divisor is ["+i+"]");
//        
//           }
//        
//}
//       
//}

}