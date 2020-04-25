/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Facility.Basketball;

import Business.Facility.Facility;

/**
 *
 * @author Karti
 * @author bochao
 */

public class BasketballCourt extends Facility{
    
    int courtNo;
    
    int capacity = 10;
    int rings = 2;
    int nets = 2;
    boolean paintMarking;
    int numberOfBasketballs;
    
    public BasketballCourt (int courtNo){
        this.courtNo = courtNo;
        this.paintMarking = true;
    }

    public int getCourtNo() {
        return courtNo;
    }

    public void setCourtNo(int courtNo) {
        this.courtNo = courtNo;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getRings() {
        return rings;
    }

    public int getNets() {
        return nets;
    }

    public boolean isPaintMarking() {
        return paintMarking;
    }

    public void setPaintMarking(boolean paintMarking) {
        this.paintMarking = paintMarking;
    }

    public int getNumberOfBasketballs() {
        return numberOfBasketballs;
    }

    public void setNumberOfBasketballs(int numberOfBasketballs) {
        this.numberOfBasketballs = numberOfBasketballs;
    }
    
    
    
}
