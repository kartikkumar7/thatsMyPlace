/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Booking.MasterBookingList;
import Business.Facility.Basketball.BasketballCourtAvailDirectory;
import Business.Facility.Basketball.BasketballCourtDirectory;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author bboysticker
 * @author bochao
 */
public class FacilityEnterprise extends Enterprise{
    
    private BasketballCourtDirectory basketballCourtDirectory;
    private BasketballCourtAvailDirectory basketballCourtAvailDirectory;
    private MasterBookingList masterBookingList;
    
    public FacilityEnterprise(String name) {
        super(name, EnterpriseType.Facility);
        basketballCourtDirectory = new BasketballCourtDirectory();
        basketballCourtAvailDirectory = new BasketballCourtAvailDirectory();
        masterBookingList = new MasterBookingList();
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
    public BasketballCourtDirectory getBasketballCourtDirectory(){
        return basketballCourtDirectory;
    }
    
    public boolean isBasketballCourtDirectoryNull (){
        return basketballCourtDirectory == null ? true: false;
    }

    public BasketballCourtAvailDirectory getBasketballCourtAvailDirectory() {
        return basketballCourtAvailDirectory;
    }

    public MasterBookingList getMasterBookingList() {
        return masterBookingList;
    }
    
    
    
}
