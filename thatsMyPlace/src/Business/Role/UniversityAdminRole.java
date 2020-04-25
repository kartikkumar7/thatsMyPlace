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
import Interface.UniversityAdminRole.UniversityAdminHomePageJPanel;
import javax.swing.JPanel;

/**
 *
 * @author bboysticker
 */
public class UniversityAdminRole extends Role{

    public UniversityAdminRole() {
        super(Role.RoleType.UniversityAdmin.getValue());
    }
    
    @Override
    public JPanel createWorkArea(JPanel rightJPanel,
            UserAccount account,
            Organization organization,
            Enterprise enterprise,
            ThatsMyPlaceSystem business) {
        
        // TODO:
        
        return new UniversityAdminHomePageJPanel(rightJPanel, enterprise, business);
    }
    
}
