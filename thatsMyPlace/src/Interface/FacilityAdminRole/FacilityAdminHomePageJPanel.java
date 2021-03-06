package Interface.FacilityAdminRole;

import Business.Enterprise.Enterprise;
import Business.Enterprise.FacilityEnterprise;
import Business.Facility.Basketball.BasketballCourtAvailability;
import Business.ThatsMyPlaceSystem;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;

/**
 *
 * @author bochao
 */
public class FacilityAdminHomePageJPanel extends javax.swing.JPanel {
    
    private JPanel rightPanel;
    private Enterprise enterprise;
    private ThatsMyPlaceSystem business;
    private FacilityEnterprise newFacility;
    /**
     * Creates new form FacilityAdminJPanel
     */
    public FacilityAdminHomePageJPanel(JPanel rightPanel, Enterprise enterprise, ThatsMyPlaceSystem business) {
        initComponents();
        this.rightPanel = rightPanel;
        this.enterprise = enterprise;
        this.business = business;
        this.newFacility = (FacilityEnterprise) business.getNetworkList()
                                                                .get(0)
                                                                .getEnterpriseDirectory()
                                                                .getEnterpriseList()
                                                                .get(0);
        populate();
    }
    
    public void populate() {
        // Populate the TextFields based on 1) MasterBookingList 2) EmployeeDirectory 3) FeedbackDirectory
        txtTotalBookings.setText(String.valueOf(newFacility.getMasterBookingList().getMasterBookingList().size()));
        int availSlot = 0;  
        for(BasketballCourtAvailability bca : newFacility.getBasketballCourtAvailDirectory().getList()){
            if(bca.isIsAvailability()){
                availSlot++;
            }
        }
        txtEmptySlots.setText(String.valueOf(availSlot));
        
        txtFrom.setText(String.valueOf(newFacility.getBasketballCourtAvailDirectory().getList().get(0).getDate()));
        int size = newFacility.getBasketballCourtAvailDirectory().getList().size();
        txtTo.setText(String.valueOf(newFacility.getBasketballCourtAvailDirectory().getList().get(size-1).getDate()));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFacilityAdmin = new javax.swing.JLabel();
        btnManageCustomerSupport = new javax.swing.JButton();
        lblTotalBookings = new javax.swing.JLabel();
        lblTotalEmpty = new javax.swing.JLabel();
        txtTotalBookings = new javax.swing.JTextField();
        txtEmptySlots = new javax.swing.JTextField();
        lblFromDate = new javax.swing.JLabel();
        txtFrom = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtTo = new javax.swing.JTextField();
        btnManageFacility = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1000, 700));

        lblFacilityAdmin.setBackground(new java.awt.Color(255, 255, 255));
        lblFacilityAdmin.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        lblFacilityAdmin.setForeground(new java.awt.Color(45, 118, 232));
        lblFacilityAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFacilityAdmin.setText("Facility Admin");

        btnManageCustomerSupport.setBackground(new java.awt.Color(255, 255, 255));
        btnManageCustomerSupport.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        btnManageCustomerSupport.setForeground(new java.awt.Color(45, 118, 232));
        btnManageCustomerSupport.setText("Manage Customer Support");
        btnManageCustomerSupport.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(45, 118, 232)));
        btnManageCustomerSupport.setContentAreaFilled(false);
        btnManageCustomerSupport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageCustomerSupportActionPerformed(evt);
            }
        });

        lblTotalBookings.setBackground(new java.awt.Color(255, 255, 255));
        lblTotalBookings.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblTotalBookings.setForeground(new java.awt.Color(45, 118, 232));
        lblTotalBookings.setText("TOTAL NUMBER OF BOOKINGS:");

        lblTotalEmpty.setBackground(new java.awt.Color(255, 255, 255));
        lblTotalEmpty.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblTotalEmpty.setForeground(new java.awt.Color(45, 118, 232));
        lblTotalEmpty.setText("TOTAL NUMBER OF EMPTY SLOTS:");

        txtTotalBookings.setEnabled(false);

        txtEmptySlots.setEnabled(false);

        lblFromDate.setBackground(new java.awt.Color(255, 255, 255));
        lblFromDate.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblFromDate.setForeground(new java.awt.Color(45, 118, 232));
        lblFromDate.setText("From:");

        txtFrom.setEnabled(false);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(45, 118, 232));
        jLabel1.setText("To:");

        txtTo.setEnabled(false);

        btnManageFacility.setBackground(new java.awt.Color(255, 255, 255));
        btnManageFacility.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        btnManageFacility.setForeground(new java.awt.Color(45, 118, 232));
        btnManageFacility.setText("Manage Facility");
        btnManageFacility.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(45, 118, 232)));
        btnManageFacility.setContentAreaFilled(false);
        btnManageFacility.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageFacilityActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 1, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblTotalBookings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTotalEmpty, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE))
                        .addGap(108, 108, 108)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTotalBookings, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(txtEmptySlots))
                        .addGap(151, 151, 151))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(lblFromDate, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(145, 145, 145)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtTo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addComponent(lblFacilityAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(278, 278, 278)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnManageFacility, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnManageCustomerSupport, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblFacilityAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtFrom)
                    .addComponent(lblFromDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotalBookings, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTotalBookings, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtEmptySlots)
                    .addComponent(lblTotalEmpty, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(144, 144, 144)
                .addComponent(btnManageCustomerSupport, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnManageFacility, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageCustomerSupportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageCustomerSupportActionPerformed
        ManageCustomerSupportJPanel panel = new ManageCustomerSupportJPanel(rightPanel, enterprise, business);
        rightPanel.add("ManageCustomerSupportJPanel", panel);
        CardLayout layout = (CardLayout) rightPanel.getLayout();
        layout.next(rightPanel);
    }//GEN-LAST:event_btnManageCustomerSupportActionPerformed

    private void btnManageFacilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageFacilityActionPerformed
        ManageFacilityJPanel panel = new ManageFacilityJPanel(rightPanel, newFacility, business);
        rightPanel.add("ManageFacilityJPanel", panel);
        CardLayout layout = (CardLayout) rightPanel.getLayout();
        layout.next(rightPanel);
    }//GEN-LAST:event_btnManageFacilityActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageCustomerSupport;
    private javax.swing.JButton btnManageFacility;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblFacilityAdmin;
    private javax.swing.JLabel lblFromDate;
    private javax.swing.JLabel lblTotalBookings;
    private javax.swing.JLabel lblTotalEmpty;
    private javax.swing.JTextField txtEmptySlots;
    private javax.swing.JTextField txtFrom;
    private javax.swing.JTextField txtTo;
    private javax.swing.JTextField txtTotalBookings;
    // End of variables declaration//GEN-END:variables
}
