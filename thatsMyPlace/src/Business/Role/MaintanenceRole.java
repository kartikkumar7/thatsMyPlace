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
import Interface.MaintanenceRole.MaintanenceHomePageJPanel;
import javax.swing.JPanel;

/**
 *
 * @author bboysticker
 */
public class MaintanenceRole extends Role{
    public MaintanenceRole() {
        super(Role.RoleType.Maintanence.getValue());
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
         return new MaintanenceHomePageJPanel(rightPanel, enterprise);
    }
    

}
