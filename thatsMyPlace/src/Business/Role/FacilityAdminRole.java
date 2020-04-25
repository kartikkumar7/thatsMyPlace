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
import Interface.FacilityAdminRole.FacilityAdminHomePageJPanel;
import javax.swing.JPanel;

/**
 *
 * @author bboysticker
 */
public class FacilityAdminRole extends Role{

    public FacilityAdminRole() {
        super(Role.RoleType.FacilityAdmin.getValue());
    }
    
    @Override
    public JPanel createWorkArea(JPanel rightPanel, 
            UserAccount account,
            Organization organization,
            Enterprise enterprise,
            ThatsMyPlaceSystem business) 
    {
        return new FacilityAdminHomePageJPanel(rightPanel, enterprise, business);
    }
    
}
