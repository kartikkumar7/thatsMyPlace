package Business.Role;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.ThatsMyPlaceSystem;
import Business.UserAccount.UserAccount;
import Interface.SystemAdminRole.SystemAdminWorkAreaJPanel;
import javax.swing.JPanel;


/**
 *
 * @author bboysticker
 */
public class SystemRole extends Role{
    public SystemRole() {
        super(Role.RoleType.SystemAdmin.getValue());
    }
    
    @Override
    public JPanel createWorkArea(
            JPanel rightPanel, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            ThatsMyPlaceSystem business) 
    {
        return new SystemAdminWorkAreaJPanel(rightPanel, business);
    }
    
}
