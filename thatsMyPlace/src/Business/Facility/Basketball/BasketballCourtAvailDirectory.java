/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Facility.Basketball;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bochao
 */

// this class is in FacilityEnterprisel.java
public class BasketballCourtAvailDirectory {
    private List<BasketballCourtAvailability> availList;
    LocalDate localDate;
    
//    public BasketballCourtAvailDirectory (){
//        availList = new ArrayList<>();
//        localDate = LocalDate.now();
//        
//        int numOfAdvancedDay = 7;
//        int numOfCourt = 10;
//        for(int i = 1; i <=numOfAdvancedDay ;i++){
//            for(int j =1; j <= numOfCourt; j++){
//                availList.add(new BasketballCourtAvailability(localDate.plus(i, ChronoUnit.DAYS), j) );
//            }
//        }
//    }
    
    public BasketballCourtAvailDirectory (){
        availList = new ArrayList<>();
        localDate = LocalDate.now();
        
        int numOfAdvancedDay = 10;
        int numOfCourt = 10;
        int numOfTime = 23;

        for(int courtId = 1; courtId <= numOfCourt ; courtId++){
            for(int days = 1; days <= numOfAdvancedDay ; days++){
                for(int starTime = 1; starTime <= numOfTime; starTime++ ){
                    BasketballCourtAvailability b;
                    b = new BasketballCourtAvailability(courtId, localDate.plus(days, ChronoUnit.DAYS), starTime, starTime+1 , true);
                    availList.add(b);
                    
                }
            } 
        }
    }
    
    //BasketballCourtAvailability(int courtNo, LocalDate date, int starTime, int endTime, boolean isAvailability)
    
    
    public List<BasketballCourtAvailability> getList(){
        return availList;
    }
    public void add(BasketballCourtAvailability b){
        availList.add(b);
    }
    
   
    
}
