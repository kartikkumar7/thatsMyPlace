package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author bboysticker
 */
public class EnterpriseDirectory {
    
    private ArrayList<Enterprise> enterpriseList;
    
    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }
    
    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public EnterpriseDirectory() {
        enterpriseList = new ArrayList<>();
    }
    
    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type) {
        
        Enterprise enterprise = null;
        
        if (type == Enterprise.EnterpriseType.Facility) {
            enterprise = new FacilityEnterprise(name);
        }
        if (type == Enterprise.EnterpriseType.University) {
            enterprise = new UniversityEnterprise(name);
        }
        
        enterpriseList.add(enterprise);

        return enterprise;
    }
    
}
