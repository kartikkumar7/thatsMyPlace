/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Facility.Basketball;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bochao
 */
public class BasketballCourtDirectory {
    private List<BasketballCourt>  courtList;
    
    public BasketballCourtDirectory(){
        courtList = new ArrayList<>();
    }
    
    
    public void add(BasketballCourt court){
        this.courtList.add(court);
    }
    
    public int getNum(){
        return courtList.size();
    }
    
    public List<BasketballCourt> getCourtList(){
        return courtList;
    }
    
    public BasketballCourt getBasketCourtById(int courtId){
        for(BasketballCourt b : courtList){
            if(b.courtNo == courtId){
                return b;
            }
        }
        return null;
    }
    
    
}
