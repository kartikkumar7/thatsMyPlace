package Business.Role;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.ThatsMyPlaceSystem;
import Business.UserAccount.UserAccount;
import Interface.StudentRole.StudentHomePageJPanel;
import javax.swing.JPanel;

/**
 *
 * @author bboysticker
 */
public class StudentRole extends Role{

    public StudentRole() {
        super(Role.RoleType.Student.getValue());
    }
    
    @Override
    public JPanel createWorkArea(
            JPanel rightPanel, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            ThatsMyPlaceSystem business) 
    {
        return new StudentHomePageJPanel(rightPanel, account, enterprise, business);
    }
    
}
