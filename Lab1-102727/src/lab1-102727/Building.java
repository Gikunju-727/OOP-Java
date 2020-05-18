/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Building {
    
    public void setInformation(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("\nEnter the \n > name of the building 1\n > number of floors \n > number of rooms per floor \n > colour respectively ");
        String buildingName=input.next();
        int NoOfFloors=input.nextInt();
        int NoRoomsPerFloor=input.nextInt();
        String roomColour=input.next();
        
        int noRooms=NoOfFloors*NoRoomsPerFloor;
        
//                ={buildingName,"NoOfFloors","NoRoomsPerFloor",roomColour}; 
        
        
        System.out.println("Enter the \n > name of the building 2 \n > number of floors \n > number of rooms per floor \n > colour respectively ");
        String buildingName1=input.next();
        int NoOfFloors1=input.nextInt();
        int NoRoomsPerFloor1=input.nextInt();
        String roomColour1=input.next();
        
            int noRooms1=NoOfFloors1*NoRoomsPerFloor1;
//         String[]building1={buildingName1,"NoOfFloors1","NoRoomsPerFloor1",roomColour1}; 
        
        
        System.out.println("Enter the \n > name of the building 3\n > number of floors \n > number of rooms per floor \n > colour respectively ");
        String buildingName2=input.next();
        int NoOfFloors2=input.nextInt();
        int NoRoomsPerFloor2=input.nextInt();
        String roomColour2=input.next();
        
            int noRooms2=NoOfFloors2*NoRoomsPerFloor2;
//        String[]building2={buildingName2,"NoOfFloors2","NoRoomsPerFloor2",roomColour2};
        
        System.out.println("Enter the \n > name of the building 4\n > number of floors \n > number of rooms per floor \n > colour respectively ");
        String buildingName3=input.next();
        int NoOfFloors3=input.nextInt();
        int NoRoomsPerFloor3=input.nextInt();
        String roomColour3=input.next();
        
            int noRooms3=NoOfFloors3*NoRoomsPerFloor3;
//       String[]building3={buildingName3,"NoOfFloors3","NoRoomsPerFloor3",roomColour3};
        
        System.out.println("Enter the \n > name of the building 5\n > number of floors \n > number of rooms per floor \n > colour respectively ");
        String buildingName4=input.next();
        int NoOfFloors4=input.nextInt();
        int NoRoomsPerFloor4=input.nextInt();
        String roomColour4=input.next();
        
            int noRooms4=NoOfFloors4*NoRoomsPerFloor4;
//        String[]building4={buildingName4,"NoOfFloors4","NoRoomsPerFloor4",roomColour4};
        
        
        String[][]myBuildings={{buildingName,buildingName1,buildingName2,buildingName3,buildingName4},{roomColour,roomColour1,roomColour2,roomColour3,roomColour4}};      
        int[]roomsArray={noRooms,noRooms1,noRooms2,noRooms3,noRooms4};
        
        for(int i=0;i<=4;i++)
        {
            System.out.println(myBuildings[0][i]+" is a "+myBuildings[1][i]+" building and has "+roomsArray[i]+" rooms");
        }
        
    }
}
