package Interface.MaintanenceRole;

import Business.Enterprise.Enterprise;
import Business.Organization.MaintanceOrganization;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.WorkQueue.FeedbackWorkRequest;
import Business.WorkQueue.WorkQueue;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.text.DateFormat;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author bboysticker
 * @author bochao
 */
public class MaintanenceHomePageJPanel extends javax.swing.JPanel {

    /**
     * Creates new form MaintanenceHomePageJPanel
     */
    private JPanel rightPanel;
    private Enterprise enterprise;
    private DateFormat dateFormat;
    
    
    public MaintanenceHomePageJPanel(JPanel rightPanel, Enterprise enterprise) {
        initComponents();
        this.rightPanel = rightPanel;
        this.enterprise = enterprise;
        this.dateFormat = DateFormat.getDateInstance();
        populate();
    }
    
    public void populate() {
        DefaultTableModel dtm = (DefaultTableModel) requestJTable.getModel();
        dtm.setRowCount(0);
        
        MaintanceOrganization maintanceOrganization = null;
        for (Organization o: enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (o.getRole().equals(Role.RoleType.Maintanence)) {
                maintanceOrganization = (MaintanceOrganization) o;
                break;
            }
        }
        
        WorkQueue workQueue = maintanceOrganization.getWorkQueue();
        
        for (WorkRequest workRequest: workQueue.getWorkRequestList()) {
            Object[] row = new Object[dtm.getColumnCount()];
            
            row[0] = workRequest;
            row[1] = workRequest.getSender().getEmployee().getName();
            row[2] = dateFormat.format(workRequest.getRequestDate());
                    
                    workRequest.getRequestDate().toString();
            row[3] = workRequest.getStatus().toString();
            
            FeedbackWorkRequest feedback = (FeedbackWorkRequest) workRequest;
            row[4] = feedback.getMessage();
            dtm.addRow(row);
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
        requestJTable = new javax.swing.JTable();
        lblRequestList = new javax.swing.JLabel();
        btnManage = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1000, 900));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(45, 118, 232)));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(800, 400));

        requestJTable.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        requestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Sender", "Request Date", "Status", "Customer Notes"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(requestJTable);

        lblRequestList.setBackground(new java.awt.Color(255, 255, 255));
        lblRequestList.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        lblRequestList.setForeground(new java.awt.Color(45, 118, 232));
        lblRequestList.setText("Request List");

        btnManage.setBackground(new java.awt.Color(255, 255, 255));
        btnManage.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnManage.setForeground(new java.awt.Color(45, 118, 232));
        btnManage.setText("Manage");
        btnManage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(45, 118, 232)));
        btnManage.setContentAreaFilled(false);
        btnManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnManage, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblRequestList, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(596, 596, 596)))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lblRequestList)
                .addGap(61, 61, 61)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(btnManage, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageActionPerformed
        // TODO add your handling code here:
        int selectedRow = requestJTable.getSelectedRow();
        if (selectedRow >= 0) {
            WorkRequest request = (WorkRequest) requestJTable.getValueAt(selectedRow, 0);

            ViewRequestJPanel panel = new ViewRequestJPanel(rightPanel, enterprise, request);
            rightPanel.add("ViewRequestJPanel", panel);
            CardLayout layout = (CardLayout) rightPanel.getLayout();
            layout.next(rightPanel);
        }
        else {
            JOptionPane.showMessageDialog(null, "Please select any row", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnManageActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManage;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblRequestList;
    private javax.swing.JTable requestJTable;
    // End of variables declaration//GEN-END:variables
}
