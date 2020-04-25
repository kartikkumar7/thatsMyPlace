/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.FacilityAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author bboysticker
 */
public class FacilityAdminOrganization extends Organization{
    
    private static Role.RoleType role = Role.RoleType.FacilityAdmin;
    
    public FacilityAdminOrganization() {
        super(Type.FacilityAdmin.getValue());
    }
    
    @Override
    public Role.RoleType getRole() {
        return role;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new FacilityAdminRole());
        return roles;
    }
}
