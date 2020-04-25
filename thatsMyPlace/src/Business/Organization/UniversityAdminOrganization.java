/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.UniversityAdminRole;
import java.util.ArrayList;

/**
 *
 * @author bboysticker
 */
public class UniversityAdminOrganization extends Organization{
    
    private static Role.RoleType role = Role.RoleType.UniversityAdmin;
    
    public UniversityAdminOrganization() {
        super(Type.UniversityAdmin.getValue());
    }
    
    @Override
    public Role.RoleType getRole() {
        return role;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new UniversityAdminRole());
        return roles;
    }
}
