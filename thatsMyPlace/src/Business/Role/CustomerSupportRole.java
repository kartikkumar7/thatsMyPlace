/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import javax.swing.JPanel;
import Business.ThatsMyPlaceSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Interface.CustomerSupportRole.CustomerSupportHomePageJPanel;

/**
 *
 * @author bboysticker
 */
public class CustomerSupportRole extends Role{
    
    public CustomerSupportRole() {
        super(Role.RoleType.CustomerSupport.getValue());
    }
    
    @Override
    public JPanel createWorkArea(
            JPanel rightPanel,
            UserAccount account,
            Organization organization,
            Enterprise enterprise,
            ThatsMyPlaceSystem business
        )
    {
         return new CustomerSupportHomePageJPanel(rightPanel, enterprise, business);
    }
    
}
