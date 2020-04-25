/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.UniversityAdminRole;
import Business.Role.FacilityAdminRole;
import java.util.ArrayList;

/**
 *
 * @author bboysticker
 */
public class ThatsMyPlaceSystem extends Organization{
    
    private static ThatsMyPlaceSystem business;
    private ArrayList<Network> networkList;
    
    public static ThatsMyPlaceSystem getInstance() {
        if (business == null) 
            business = new ThatsMyPlaceSystem();
        return business;
    }

    public ThatsMyPlaceSystem() {
        super(null);
        networkList = new ArrayList<>();
    }
    
    public Network createAndAddNetwork(){
        Network network = new Network();
        networkList.add(network);
        return network;
    }
    
    @Override
    public Role.RoleType getRole() {
        return null;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(new UniversityAdminRole());
        roleList.add(new FacilityAdminRole());
        return roleList;
    }
    
    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }
    
    public boolean checkIfUserIsUnique(String userName){
        if(!this.getUserAccountDirectory().checkUsername(userName)){
            return false;
        }
//        for(Network network: networkList){
//            
//        }
        return true;
    }

    
}
