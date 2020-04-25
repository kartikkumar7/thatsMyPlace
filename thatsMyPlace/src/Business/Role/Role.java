/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.ThatsMyPlaceSystem;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author bboysticker
 */
public abstract class Role {
    
    private String name;
    
    public enum RoleType {
        UniversityAdmin("University Admin"),
        FacilityAdmin("Facility Admin"),
        CustomerSupport("Customer Support"),
        Student("Student"),
        Maintanence("Maintanence"),
        SystemAdmin("System Admin");
        
        private String value;
        
        private RoleType(String value) {
            this.value = value;
        }
        
        public String getValue() {
            return value;
        }
        
        @Override
        public String toString() {
            return value;
        }
    }
    
    public Role(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer,
            UserAccount account,
            Organization organization,
            Enterprise enterprise,
            ThatsMyPlaceSystem business);
    
    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
}
