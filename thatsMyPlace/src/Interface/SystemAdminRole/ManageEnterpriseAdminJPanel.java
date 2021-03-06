package Interface.SystemAdminRole;

import Business.ThatsMyPlaceSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Role.FacilityAdminRole;
import Business.Role.Role;
import Business.Role.UniversityAdminRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author bboysticker
 */
public class ManageEnterpriseAdminJPanel extends javax.swing.JPanel {

    private JPanel rightPanel;
    private ThatsMyPlaceSystem business;

    /**
     * Creates new form ManageEnterpriseJPanel
     */
    public ManageEnterpriseAdminJPanel(JPanel rightPanel, ThatsMyPlaceSystem business) {
        initComponents();

        this.rightPanel = rightPanel;
        this.business = business;

        populateTable();
        populateNetworkComboBox();
    }

    private void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) enterpriseJTable.getModel();
        dtm.setRowCount(0);

        for (Network network: business.getNetworkList()) {
            System.out.println(network);
            
            for (Enterprise enterprise: network.getEnterpriseDirectory().getEnterpriseList()) {
                System.out.println(enterprise);
                
                for (UserAccount ua: enterprise.getUserAccountDirectory().getUserAccounts()) {
                    System.out.println(ua);
                    System.out.println(ua.getRole().getName());
                    
                    if (ua.getRole().getName().equals("University Admin") || ua.getRole().getName().equals("Facility Admin")) {
                        Object[] row = new Object[dtm.getColumnCount()];
                        
                        row[0] = enterprise;
                        row[1] = network;
                        row[2] = ua;
                        
                        System.out.println("row 1 " + row[0]);
                        System.out.println("row 2 " + row[1]);
                        System.out.println("row 3 " + row[2]);
                        
                        dtm.addRow(row);
                    }
                }
            }
        }
    }
    
    private void populateTable(Network network) {
        DefaultTableModel dtm = (DefaultTableModel) enterpriseJTable.getModel();
        dtm.setRowCount(0);

        for(Enterprise enterprise: network.getEnterpriseDirectory().getEnterpriseList()){
            for (UserAccount ua: enterprise.getUserAccountDirectory().getUserAccounts()){
                if (ua.getRole().getName().equals("University Admin") || ua.getRole().getName().equals("Facility Admin")) {
                    Object[] row = new Object[3];
                    
                    row[0] = enterprise;
                    row[1] = network;
                    row[2] = ua;
                    
                    dtm.addRow(row);
                }
            }
        }
    }

    private void populateNetworkComboBox(){
        networkJComboBox.removeAllItems();
        
        for (Network network : business.getNetworkList()){
            networkJComboBox.addItem(network);
        }
    }
    
    private void populateEnterpriseComboBox(Network network){
        enterpriseJComboBox.removeAllItems();
        
        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
            enterpriseJComboBox.addItem(enterprise);
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        enterpriseJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        networkJComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        usernameJTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        enterpriseJComboBox = new javax.swing.JComboBox();
        submitJButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        passwordJPasswordField = new javax.swing.JPasswordField();
        backJButton = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1000, 700));

        enterpriseJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Enterprise Name", "Network", "Username"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(enterpriseJTable);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(45, 118, 232));
        jLabel1.setText("Network");

        networkJComboBox.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        networkJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkJComboBoxActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(45, 118, 232));
        jLabel2.setText("Username");

        usernameJTextField.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        usernameJTextField.setForeground(new java.awt.Color(45, 118, 232));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(45, 118, 232));
        jLabel3.setText("Enterprise");

        enterpriseJComboBox.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N

        submitJButton.setBackground(new java.awt.Color(255, 255, 255));
        submitJButton.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        submitJButton.setForeground(new java.awt.Color(45, 118, 232));
        submitJButton.setText("Submit");
        submitJButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(45, 118, 232)));
        submitJButton.setContentAreaFilled(false);
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(45, 118, 232));
        jLabel4.setText("Password");

        nameJTextField.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        nameJTextField.setForeground(new java.awt.Color(45, 118, 232));

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(45, 118, 232));
        jLabel5.setText("Name");

        passwordJPasswordField.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        passwordJPasswordField.setForeground(new java.awt.Color(45, 118, 232));

        backJButton.setBackground(new java.awt.Color(255, 255, 255));
        backJButton.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        backJButton.setForeground(new java.awt.Color(45, 118, 232));
        backJButton.setText("Back");
        backJButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(45, 118, 232)));
        backJButton.setContentAreaFilled(false);
        backJButton.setPreferredSize(new java.awt.Dimension(100, 40));
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        btndelete.setBackground(new java.awt.Color(255, 255, 255));
        btndelete.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        btndelete.setForeground(new java.awt.Color(45, 118, 232));
        btndelete.setText("Delete");
        btndelete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(45, 118, 232)));
        btndelete.setContentAreaFilled(false);
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 741, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel3))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel5)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(submitJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(173, 173, 173)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(passwordJPasswordField)
                                        .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(usernameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(networkJComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(enterpriseJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(110, 110, 110)))))
                .addContainerGap(138, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(enterpriseJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(usernameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(passwordJPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(networkJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(submitJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(76, 76, 76))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void networkJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkJComboBoxActionPerformed
        Network network = (Network) networkJComboBox.getSelectedItem();
        if (network != null){
            populateTable(network);
            populateEnterpriseComboBox(network);
        }
    }//GEN-LAST:event_networkJComboBoxActionPerformed

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        Network network = (Network) networkJComboBox.getSelectedItem();
        Enterprise enterprise = (Enterprise) enterpriseJComboBox.getSelectedItem();

        String username = usernameJTextField.getText();
        String password = String.valueOf(passwordJPasswordField.getPassword());
        String name = nameJTextField.getText();
        
  
        if(name.length() == 0){
            JOptionPane.showMessageDialog(null, "please input a name");
            return;
        }
        if(username.length() == 0){
            JOptionPane.showMessageDialog(null, "please input a username");
            return;
        }
        if(password.length() == 0){
            JOptionPane.showMessageDialog(null, "please input a password");
            return;
        }
        
//        List<Employee> employeeList = business.getEmployeeDirectory().getEmployeeList();
//        for(Employee em : employeeList){
//            if(em.getName().equals(name)){
//                JOptionPane.showMessageDialog(null, "you already have this employee");
//                usernameJTextField.setText("");
//                passwordJPasswordField.setEchoChar('*');
//                nameJTextField.setText("");
//                passwordJPasswordField.setText("");
//                return;
//            }
//        }
        
        for (UserAccount ua: business.getUserAccountDirectory().getUserAccounts()) {
            if (ua.getUsername().equals(username)) {
                JOptionPane.showMessageDialog(null, "you already have this ");
                
                return;
            }
        }
        
        
//        for(UserAccount ua: business.getUserAccountDirectory().getUserAccounts()){
//                if(ua.getEmployee().equals(userAccount.getEmployee())){
//                continue;
//                }
//                if(ua.getEmployee().getName().equalsIgnoreCase(name)){
//                    JOptionPane.showMessageDialog(null, "Student Name already exists in system! Enter a unique name!");
//                    txtName.setBorder(BorderFactory.createLineBorder(Color.RED));
//                    lblStudentName.setForeground(Color.RED);
//                    return;
//                }
//               
//                if(ua.getUsername().equalsIgnoreCase(username)){
//                    JOptionPane.showMessageDialog(null, "Username already exists! Enter a unique username!");
//                    txtUserName.setBorder(BorderFactory.createLineBorder(Color.RED));
//                    lblUserName.setForeground(Color.RED);
//                    return;
//                }
//            
//            }
        
        
        Employee employee = business.getEmployeeDirectory().createEmployee(name);
        
        Role role = null;
        if (enterprise.getEnterpriseType().equals(Enterprise.EnterpriseType.University)) {
            role = new UniversityAdminRole();
        }
        if (enterprise.getEnterpriseType().equals(Enterprise.EnterpriseType.Facility)) {
            role = new FacilityAdminRole();
        }
        
        // Put user account into master user account directory
        business.getUserAccountDirectory().createUserAccount(username, password, employee, role);
        
        // Put user account into specific network's enterprise user directory
        enterprise.getUserAccountDirectory().createUserAccount(username, password, employee, role);
        
        System.out.println(business.getName());
        System.out.println(network);
        System.out.println(enterprise);
        
        usernameJTextField.setText("");
        passwordJPasswordField.setEchoChar('*');
        nameJTextField.setText("");
        passwordJPasswordField.setText("");
        populateTable(network);
    }//GEN-LAST:event_submitJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        rightPanel.remove(this);
        CardLayout layout = (CardLayout) rightPanel.getLayout();
        Component[] comps = this.rightPanel.getComponents();
        for (Component comp : comps) {
            if (comp instanceof SystemAdminWorkAreaJPanel) {
                SystemAdminWorkAreaJPanel panel = (SystemAdminWorkAreaJPanel) comp;
                panel.populateTree();
            }
        }
        layout.previous(rightPanel);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        int selectedRow = enterpriseJTable.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row to delete!", "Information", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        Enterprise selectedEnterprise = (Enterprise) enterpriseJTable.getValueAt(selectedRow, 0);
        UserAccount selectedUserAccount =(UserAccount) enterpriseJTable.getValueAt(selectedRow, 2);
        
        // Delete the user account in master directory
        for (UserAccount ua: business.getUserAccountDirectory().getUserAccounts()) {
            if (ua.getUsername().equals(selectedUserAccount.getUsername())) {
                business.getUserAccountDirectory().getUserAccounts().remove(ua);
                break;
            }
        }
        
        Network selectedNetwork = (Network) networkJComboBox.getSelectedItem();
        
        for (UserAccount ua: selectedEnterprise.getUserAccountDirectory().getUserAccounts()) {
            if (ua.getUsername().equals(selectedUserAccount.getUsername())) {
                selectedEnterprise.getUserAccountDirectory().getUserAccounts().remove(ua);
                break;
            }
        }
        
        // Delete employee in business.employeeDirectory()
        for (Employee e: business.getEmployeeDirectory().getEmployeeList()) {
            if (e.getName().equals(selectedUserAccount.getEmployee().getName())) {
                business.getEmployeeDirectory().getEmployeeList().remove(e);
                break;
            }
        }
        
        populateTable();
        JOptionPane.showMessageDialog(null, "delete successfully", "Information", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btndeleteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btndelete;
    private javax.swing.JComboBox enterpriseJComboBox;
    private javax.swing.JTable enterpriseJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JComboBox networkJComboBox;
    private javax.swing.JPasswordField passwordJPasswordField;
    private javax.swing.JButton submitJButton;
    private javax.swing.JTextField usernameJTextField;
    // End of variables declaration//GEN-END:variables
}
