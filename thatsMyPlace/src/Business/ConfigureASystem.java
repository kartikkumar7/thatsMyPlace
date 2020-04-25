package Business;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Enterprise.UniversityEnterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.FacilityAdminRole;
import Business.Role.Role;
import Business.Role.SystemRole;
import Business.Role.UniversityAdminRole;
import Business.Student.Student;
import Business.UserAccount.UserAccount;

/**
 * 
 * @author bboysticker
 */
public class ConfigureASystem {
    
    public static ThatsMyPlaceSystem configure() {
        
        ThatsMyPlaceSystem system = ThatsMyPlaceSystem.getInstance();
        system.setName("ThatsMyPlace");
        
//        // Create a network
//        Network network = system.createAndAddNetwork();
//        network.setName("Network 1");
//        
//        // Create enterprises
//        Enterprise facility = network.getEnterpriseDirectory().createAndAddEnterprise("Facility Enterprise", Enterprise.EnterpriseType.Facility);
//        Enterprise university = network.getEnterpriseDirectory().createAndAddEnterprise("University Enterprise", Enterprise.EnterpriseType.University);
//        
//        // Initialize some organizations
//        // Facility side
//        Organization facilityAdminOrganization = facility.getOrganizationDirectory().createOrganization(Organization.Type.FacilityAdmin);
//        Organization customerSupportOrganization = facility.getOrganizationDirectory().createOrganization(Organization.Type.CustomerSupport);
//        Organization maintanenceOrganization = facility.getOrganizationDirectory().createOrganization(Organization.Type.Maintanence);
//
//        // University side
//        Organization studentOrganization = university.getOrganizationDirectory().createOrganization(Organization.Type.Student);
//        Organization universityAdminOrganization = university.getOrganizationDirectory().createOrganization(Organization.Type.UniversityAdmin);
//        
//        // Create employees
//        Employee uAdmin = system.getEmployeeDirectory().createEmployee("universityadmin");
//        Employee fAdmin = system.getEmployeeDirectory().createEmployee("facilityadmin");
//        
//        Employee cs = system.getEmployeeDirectory().createEmployee("customersupport");
//        
//        UniversityEnterprise universityEnterprise = (UniversityEnterprise) university;
//        Student student1 = universityEnterprise.getEmployeeDirectory().createStudent("student name1", "zhang.xinyu3@husky.neu.edu");
//        Student student2 = universityEnterprise.getEmployeeDirectory().createStudent("student name2", "zhang.xinyu3@husky.neu.edu");
//        Student student3 = universityEnterprise.getEmployeeDirectory().createStudent("student name3", "zhang.xinyu3@husky.neu.edu");
//        Student student4 = universityEnterprise.getEmployeeDirectory().createStudent("student name4", "zhang.xinyu3@husky.neu.edu");
//        Student student5 = universityEnterprise.getEmployeeDirectory().createStudent("student name5", "zhang.xinyu3@husky.neu.edu");
//        Student student6 = universityEnterprise.getEmployeeDirectory().createStudent("student name6", "zhang.xinyu3@husky.neu.edu");
//        Student student7 = universityEnterprise.getEmployeeDirectory().createStudent("student name7", "zhang.xinyu3@husky.neu.edu");
//        Student student8 = universityEnterprise.getEmployeeDirectory().createStudent("student name8", "zhang.xinyu3@husky.neu.edu");
//        Student student9 = universityEnterprise.getEmployeeDirectory().createStudent("student name9", "zhang.xinyu3@husky.neu.edu");
//        Student student10 = universityEnterprise.getEmployeeDirectory().createStudent("student name10", "zhang.xinyu3@husky.neu.edu");
//        
//        Employee maintanence = system.getEmployeeDirectory().createEmployee("maintanence");
//        
//        // Create user accounts
//        Role universityAdminRole = new UniversityAdminRole();
//        // Add user account to master ua directory
//        system.getUserAccountDirectory().createUserAccount("universityadmin", "universityadmin", uAdmin, universityAdminRole);
//        // Add user account to network1's ua directory
//        university.getUserAccountDirectory().createUserAccount("universityadmin", "universityadmin", uAdmin, universityAdminRole);
//        
//        Role facilityAdminRole = new FacilityAdminRole();
//        // Add user account to master ua directory
//        system.getUserAccountDirectory().createUserAccount("facilityadmin", "facilityadmin", fAdmin, facilityAdminRole);
//        // Add user account to network1's ua directory
//        facility.getUserAccountDirectory().createUserAccount("facilityadmin", "facilityadmin", fAdmin, facilityAdminRole);
//        
//        Role customerSupportRole = customerSupportOrganization.getSupportedRole().get(0);
//        UserAccount csAccount = system.getUserAccountDirectory().createUserAccount("customersupport", "customersupport", cs, customerSupportRole);
//        
//        Role studentRole = studentOrganization.getSupportedRole().get(0);
//        UserAccount stuAccount1 = system.getUserAccountDirectory().createUserAccount("student1", "student1", student1, studentRole);
//        UserAccount stuAccount2 = system.getUserAccountDirectory().createUserAccount("student2", "student2", student2, studentRole);
//        UserAccount stuAccount3 = system.getUserAccountDirectory().createUserAccount("student3", "student3", student3, studentRole);
//        UserAccount stuAccount4 = system.getUserAccountDirectory().createUserAccount("student4", "student4", student4, studentRole);
//        UserAccount stuAccount5 = system.getUserAccountDirectory().createUserAccount("student5", "student5", student5, studentRole);
//        UserAccount stuAccount6 = system.getUserAccountDirectory().createUserAccount("student6", "student6", student6, studentRole);
//        UserAccount stuAccount7 = system.getUserAccountDirectory().createUserAccount("student7", "student7", student7, studentRole);
//        UserAccount stuAccount8 = system.getUserAccountDirectory().createUserAccount("student8", "student8", student8, studentRole);
//        UserAccount stuAccount9 = system.getUserAccountDirectory().createUserAccount("student9", "student9", student9, studentRole);
//        UserAccount stuAccount10 = system.getUserAccountDirectory().createUserAccount("student10", "student10", student10, studentRole);
//        
//        Role maintanenceRole = maintanenceOrganization.getSupportedRole().get(0);
//        UserAccount maintanenceAccount = system.getUserAccountDirectory().createUserAccount("maintanence", "maintanence", maintanence, maintanenceRole);
        
        Employee employee = system.getEmployeeDirectory().createEmployee("sysadmin");
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemRole());
        
        
        return system;
    }
    
}
