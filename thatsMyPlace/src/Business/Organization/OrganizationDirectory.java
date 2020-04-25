/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;

/**
 *
 * @author bboysticker
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Organization.Type type){
        
        Organization organization = null;
        if (type.getValue().equals(Organization.Type.CustomerSupport.getValue())){
            organization = new CustomerSupportOrganization();
        }
        else if (type.getValue().equals(Organization.Type.FacilityAdmin.getValue())){
            organization = new FacilityAdminOrganization();
        }
        else if (type.getValue().equals(Organization.Type.Student.getValue())){
            organization = new StudentOrganization();
        }
        else if (type.getValue().equals(Organization.Type.UniversityAdmin.getValue())){
            organization = new UniversityAdminOrganization();
        }
        else if (type.getValue().equals(Organization.Type.Maintanence.getValue())) {
            organization = new MaintanceOrganization();
        }
        
        organizationList.add(organization);
        return organization;
    }
    
}
