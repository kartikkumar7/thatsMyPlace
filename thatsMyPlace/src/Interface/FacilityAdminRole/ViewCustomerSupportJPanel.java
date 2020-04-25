package Interface.FacilityAdminRole;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Role.CustomerSupportRole;
import Business.ThatsMyPlaceSystem;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author bboysticker
 */
public class ViewCustomerSupportJPanel extends javax.swing.JPanel {

    private JPanel rightPanel;
    private UserAccount userAccount;
    private Enterprise enterprise;
    private ThatsMyPlaceSystem business;
    
    public ViewCustomerSupportJPanel(JPanel rightPanel, 
            UserAccount ua, 
            Enterprise enterprise, 
            ThatsMyPlaceSystem business) 
    {
        initComponents();
        this.rightPanel = rightPanel;
        this.userAccount = ua;
        this.enterprise = enterprise;
        this.business = business;
        
        if (userAccount == null) {
            // add new employee
            idTextField.setEnabled(false);
            nameTextField.setEnabled(true);
            nameTextField.setText("");
            usernameTextField.setEnabled(true);
            usernameTextField.setText("");
            passwordField.setEnabled(true);
            passwordField.setText("");
        }
        else {//update view
            populate();
        } 
    }

    private void populate() {
        nameTextField.setText(userAccount.getEmployee().getName());
        idTextField.setText(Integer.toString(userAccount.getEmployee().getId()));
        usernameTextField.setText(userAccount.getUsername());
        passwordField.setEchoChar('*');
        
        idTextField.setEnabled(false);
        nameTextField.setEnabled(true);
        usernameTextField.setEnabled(true);
        passwordField.setEnabled(true);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        usernameTextField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        backBtn = new javax.swing.JButton();
        btn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        idTextField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1000, 700));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(45, 118, 232));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Customer Support Details");

        lblName.setBackground(new java.awt.Color(255, 255, 255));
        lblName.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        lblName.setForeground(new java.awt.Color(45, 118, 232));
        lblName.setText("Name:");

        lblUsername.setBackground(new java.awt.Color(255, 255, 255));
        lblUsername.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(45, 118, 232));
        lblUsername.setText("Username:");

        lblPassword.setBackground(new java.awt.Color(255, 255, 255));
        lblPassword.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(45, 118, 232));
        lblPassword.setText("Password:");

        nameTextField.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N

        usernameTextField.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N

        passwordField.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N

        backBtn.setBackground(new java.awt.Color(255, 255, 255));
        backBtn.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        backBtn.setForeground(new java.awt.Color(45, 118, 232));
        backBtn.setText("Back");
        backBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(45, 118, 232)));
        backBtn.setContentAreaFilled(false);
        backBtn.setPreferredSize(new java.awt.Dimension(100, 40));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        btn.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        btn.setForeground(new java.awt.Color(45, 118, 232));
        btn.setText("Add/Update");
        btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(45, 118, 232)));
        btn.setContentAreaFilled(false);
        btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(45, 118, 232));
        jLabel5.setText("ID:");

        idTextField.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        idTextField.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 395, Short.MAX_VALUE)
                .addComponent(btn, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(352, 352, 352))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPassword, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(179, 179, 179)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(usernameTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(nameTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passwordField)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername)
                    .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(92, 92, 92)
                .addComponent(btn, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        rightPanel.remove(this);
        CardLayout layout = (CardLayout) rightPanel.getLayout();
        Component[] comps = this.rightPanel.getComponents();
        for (Component comp : comps) {
            if (comp instanceof ManageCustomerSupportJPanel) {
                ManageCustomerSupportJPanel panel = (ManageCustomerSupportJPanel) comp;
                panel.populate();
            }
        }
        layout.previous(rightPanel);
    }//GEN-LAST:event_backBtnActionPerformed

    private void btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActionPerformed
        String name = nameTextField.getText();
        String username = usernameTextField.getText();
        String password = String.valueOf(passwordField.getPassword());
        
        if(name.isEmpty()||name.equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null, "Employee Name cannot be empty! Enter a name!");
            nameTextField.setBorder(BorderFactory.createLineBorder(Color.RED));
            lblName.setForeground(Color.RED);
            return;
        }
        
        if(username.isEmpty()||username.equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null, "Username cannot be empty! Enter a username!");
            usernameTextField.setBorder(BorderFactory.createLineBorder(Color.RED));
            lblUsername.setForeground(Color.RED);
            return;
        }
        if(password.isEmpty()||password.equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null, "Password cannot be empty! Enter a password!");
            passwordField.setBorder(BorderFactory.createLineBorder(Color.RED));
            lblPassword.setForeground(Color.RED);
            return;
        }
        
        if (userAccount == null) {
            
            for(UserAccount ua: business.getUserAccountDirectory().getUserAccounts()){
                if(ua.getEmployee().getName().equalsIgnoreCase(name)){
                    JOptionPane.showMessageDialog(null, "Employee Name exists! Enter a new unique name!");
                    nameTextField.setBorder(BorderFactory.createLineBorder(Color.RED));
                    lblName.setForeground(Color.RED);
                    return;
                }
                if(ua.getUsername().equalsIgnoreCase(username)){
                    JOptionPane.showMessageDialog(null, "Username exists! Enter a new unique username!");
                    usernameTextField.setBorder(BorderFactory.createLineBorder(Color.RED));
                    lblUsername.setForeground(Color.RED);
                    return;
                }
                
            }
            
            Employee newEmployee = business.getEmployeeDirectory().createEmployee(name);
            CustomerSupportRole role = new CustomerSupportRole();
            business.getUserAccountDirectory().createUserAccount(username, password, newEmployee, role);
        }
        else {
            for(UserAccount ua: business.getUserAccountDirectory().getUserAccounts()){
                if(ua.getEmployee().equals(userAccount.getEmployee())){
                continue;
                }
                if(ua.getEmployee().getName().equalsIgnoreCase(name)){
                    JOptionPane.showMessageDialog(null, "Employee Name exists! Enter a new unique name!");
                    nameTextField.setBorder(BorderFactory.createLineBorder(Color.RED));
                    lblName.setForeground(Color.RED);
                    return;
                }
                if(ua.getUsername().equalsIgnoreCase(username)){
                    JOptionPane.showMessageDialog(null, "Username exists! Enter a new unique username!");
                    usernameTextField.setBorder(BorderFactory.createLineBorder(Color.RED));
                    lblUsername.setForeground(Color.RED);
                    return;
                }

            }
            userAccount.getEmployee().setName(name);
            userAccount.setUsername(username);
            userAccount.setPassword(password);
            
        }
        
        btn.setEnabled(false);
        JOptionPane.showMessageDialog(null, "Action Successfully Completed!");
        nameTextField.setEnabled(false);
        usernameTextField.setEnabled(false);
        passwordField.setEnabled(false);
        nameTextField.setBorder(BorderFactory.createLineBorder(new Color(45,118,232)));
        lblName.setForeground(new Color(45,118,232));
        usernameTextField.setBorder(BorderFactory.createLineBorder(new Color(45,118,232)));
        lblUsername.setForeground(new Color(45,118,232));
        passwordField.setBorder(BorderFactory.createLineBorder(new Color(45,118,232)));
        lblPassword.setForeground(new Color(45,118,232));
    }//GEN-LAST:event_btnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton btn;
    private javax.swing.JTextField idTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables
}
