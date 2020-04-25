/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.CustomerSupportRole;
import Business.Role.Role;
import Business.Role.Role.RoleType;
import java.util.ArrayList;

/**
 *
 * @author bboysticker
 */
public class CustomerSupportOrganization extends Organization{
    
    private static RoleType supportedRole = RoleType.CustomerSupport;
    
    public CustomerSupportOrganization() {
        super(Type.CustomerSupport.getValue());
    }
    
    @Override
    public RoleType getRole() {
        return supportedRole;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new CustomerSupportRole());
        return roles;
    }
}
