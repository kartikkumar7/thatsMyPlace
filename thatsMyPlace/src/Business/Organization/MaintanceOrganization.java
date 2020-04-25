/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.MaintanenceRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author bboysticker
 */
public class MaintanceOrganization extends Organization{
    
    private static Role.RoleType supportedRole = Role.RoleType.Maintanence;
    
    public MaintanceOrganization() {
        super(Organization.Type.Maintanence.getValue());
    }
    
    @Override
    public Role.RoleType getRole() {
        return supportedRole;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new MaintanenceRole());
        return roles;
    }
}
