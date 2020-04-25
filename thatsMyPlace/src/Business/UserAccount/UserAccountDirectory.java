/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author bboysticker
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccountList;
    
    public UserAccountDirectory() {
        userAccountList = new ArrayList<>();
    }
    
    public ArrayList<UserAccount> getUserAccounts() {
        return userAccountList;
    }
    
    /**
     * Check whether the password matches the user's real password
     * 
     * @param username
     * @param password
     * @return UserAccount
     */
    public UserAccount authenticateUser(String username, String password) {
        for (UserAccount ua: userAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)) {
                return ua;
            }
        return null;
    }
    
    /**
     * Create and return a new UserAccount, and add it into UserAccountList
     * 
     * @param username
     * @param password
     * @param employee
     * @param role
     * @return UserAccount
     */
    public UserAccount createUserAccount(String username, 
            String password,
            Employee employee,
            Role role) 
    {
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        
        userAccountList.add(userAccount);
        
        return userAccount;
    }
    
    /**
     * Check if the username is unique
     * 
     * @param username
     * @return boolean
     */
    public boolean checkUsername(String username) {
        for (UserAccount ua: userAccountList)
            if (ua.getUsername().equals(username))
                return false;
        
        return true;
    }
}
