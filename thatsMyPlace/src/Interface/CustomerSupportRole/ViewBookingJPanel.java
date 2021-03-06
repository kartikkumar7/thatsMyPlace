package Interface.CustomerSupportRole;

import Business.Booking.Booking;
import Business.Booking.MasterBookingList;
import Business.EmailUtil.EmailUtil;
import Business.Enterprise.Enterprise;
import Business.Enterprise.FacilityEnterprise;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.TimerTask;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author bboysticker
 * @author bochao
 */
public class ViewBookingJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CustomerSupportViewRequestJPanel
     */
    private JPanel rightPanel;
    private Enterprise enterprise;
    private Booking booking;
    
    public ViewBookingJPanel(JPanel rightPanel, Enterprise enterprise, Booking b) {
        initComponents();
        this.rightPanel = rightPanel;
        this.enterprise = enterprise;
        this.booking = b;
        
        populate();
    }
    
    private void populate(){
        txtBookingDate.setText(booking.getDate().toString());
        FacilityEnterprise facilityEnterprise = (FacilityEnterprise) enterprise;
        txtBookingID.setText(String.valueOf(facilityEnterprise.getMasterBookingList().getMasterBookingList().indexOf(booking)+1));
        txtCourtNo.setText(Integer.toString(booking.getCourtId()));
        txtEndTime.setText(Integer.toString(booking.getEndTime()));
        txtStartTime.setText(Integer.toString(booking.getBeginTime()));
        txtUserId.setText(Integer.toString(booking.getRegistrant().getId()));
        txtUserName.setText(booking.getRegistrant().getName());
        
        cbStatus.addItem("---ALL---");
        cbStatus.addItem(String.valueOf(Booking.Status.Closed));
        cbStatus.addItem(String.valueOf(Booking.Status.NoShow));
        
        if(booking.getStatus().getValue().equals("Confirmed")) cbStatus.setSelectedIndex(0);
        else if(booking.getStatus().getValue().equals("Closed")) cbStatus.setSelectedIndex(1);
        else if(booking.getStatus().getValue().equals("NoShow")) cbStatus.setSelectedIndex(2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblBookingDetails = new javax.swing.JLabel();
        lblBookingID = new javax.swing.JLabel();
        lblStartTime = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        lblBookingDate = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        txtBookingID = new javax.swing.JTextField();
        txtUserId = new javax.swing.JTextField();
        txtBookingDate = new javax.swing.JTextField();
        txtStartTime = new javax.swing.JTextField();
        cbStatus = new javax.swing.JComboBox<>();
        btnUpdate = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        lblEndTime = new javax.swing.JLabel();
        txtEndTime = new javax.swing.JTextField();
        lblCourtNo = new javax.swing.JLabel();
        txtCourtNo = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1000, 700));

        lblBookingDetails.setBackground(new java.awt.Color(255, 255, 255));
        lblBookingDetails.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        lblBookingDetails.setForeground(new java.awt.Color(45, 118, 232));
        lblBookingDetails.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBookingDetails.setText("Booking Details");

        lblBookingID.setBackground(new java.awt.Color(255, 255, 255));
        lblBookingID.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblBookingID.setForeground(new java.awt.Color(45, 118, 232));
        lblBookingID.setText("Booking ID:");
        lblBookingID.setPreferredSize(new java.awt.Dimension(120, 30));

        lblStartTime.setBackground(new java.awt.Color(255, 255, 255));
        lblStartTime.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblStartTime.setForeground(new java.awt.Color(45, 118, 232));
        lblStartTime.setText("Start Time:");
        lblStartTime.setPreferredSize(new java.awt.Dimension(120, 30));

        lblUserName.setBackground(new java.awt.Color(255, 255, 255));
        lblUserName.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblUserName.setForeground(new java.awt.Color(45, 118, 232));
        lblUserName.setText("User Id:");
        lblUserName.setPreferredSize(new java.awt.Dimension(120, 30));

        lblBookingDate.setBackground(new java.awt.Color(255, 255, 255));
        lblBookingDate.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblBookingDate.setForeground(new java.awt.Color(45, 118, 232));
        lblBookingDate.setText("Booking Date:");
        lblBookingDate.setPreferredSize(new java.awt.Dimension(120, 30));

        lblStatus.setBackground(new java.awt.Color(255, 255, 255));
        lblStatus.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblStatus.setForeground(new java.awt.Color(45, 118, 232));
        lblStatus.setText("Status:");
        lblStatus.setPreferredSize(new java.awt.Dimension(120, 30));

        txtBookingID.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        txtBookingID.setForeground(new java.awt.Color(45, 118, 232));
        txtBookingID.setEnabled(false);

        txtUserId.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        txtUserId.setForeground(new java.awt.Color(45, 118, 232));
        txtUserId.setEnabled(false);

        txtBookingDate.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        txtBookingDate.setForeground(new java.awt.Color(45, 118, 232));
        txtBookingDate.setEnabled(false);

        txtStartTime.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        txtStartTime.setForeground(new java.awt.Color(45, 118, 232));
        txtStartTime.setEnabled(false);

        cbStatus.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        cbStatus.setEnabled(false);
        cbStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbStatusActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(255, 255, 255));
        btnUpdate.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(45, 118, 232));
        btnUpdate.setText("Update");
        btnUpdate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(45, 118, 232)));
        btnUpdate.setContentAreaFilled(false);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnSave.setBackground(new java.awt.Color(255, 255, 255));
        btnSave.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        btnSave.setForeground(new java.awt.Color(45, 118, 232));
        btnSave.setText("Save");
        btnSave.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(45, 118, 232)));
        btnSave.setContentAreaFilled(false);
        btnSave.setEnabled(false);
        btnSave.setPreferredSize(new java.awt.Dimension(105, 30));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        lblEndTime.setBackground(new java.awt.Color(255, 255, 255));
        lblEndTime.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblEndTime.setForeground(new java.awt.Color(45, 118, 232));
        lblEndTime.setText("End Time:");
        lblEndTime.setPreferredSize(new java.awt.Dimension(120, 30));

        txtEndTime.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        txtEndTime.setForeground(new java.awt.Color(45, 118, 232));
        txtEndTime.setEnabled(false);

        lblCourtNo.setBackground(new java.awt.Color(255, 255, 255));
        lblCourtNo.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblCourtNo.setForeground(new java.awt.Color(45, 118, 232));
        lblCourtNo.setText("Court No:");
        lblCourtNo.setPreferredSize(new java.awt.Dimension(120, 30));

        txtCourtNo.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        txtCourtNo.setForeground(new java.awt.Color(45, 118, 232));
        txtCourtNo.setEnabled(false);

        btnBack.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(45, 118, 232));
        btnBack.setText("Back");
        btnBack.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(45, 118, 232)));
        btnBack.setContentAreaFilled(false);
        btnBack.setPreferredSize(new java.awt.Dimension(100, 40));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(45, 118, 232));
        jLabel1.setText("User Name: ");
        jLabel1.setPreferredSize(new java.awt.Dimension(120, 30));

        txtUserName.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        txtUserName.setForeground(new java.awt.Color(45, 118, 232));
        txtUserName.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBookingDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(180, 180, 180)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 293, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblBookingID, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStartTime, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEndTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCourtNo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBookingDate, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(131, 131, 131)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtBookingID)
                    .addComponent(txtUserId)
                    .addComponent(txtUserName)
                    .addComponent(txtBookingDate)
                    .addComponent(txtStartTime)
                    .addComponent(txtEndTime)
                    .addComponent(txtCourtNo)
                    .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(278, 278, 278))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblBookingDetails)
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBookingID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBookingID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUserId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBookingDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBookingDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStartTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStartTime, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEndTime, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEndTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCourtNo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCourtNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(77, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if (booking.getStatus().equals(Booking.Status.Closed)) {
            JOptionPane.showMessageDialog(null, "Booking Is Closed, Cannot Change Status",  "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        btnUpdate.setEnabled(false);
        btnSave.setEnabled(true);
        cbStatus.setEnabled(true);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        rightPanel.remove(this);
        CardLayout layout = (CardLayout) rightPanel.getLayout();
        Component[] comps = this.rightPanel.getComponents();
        for (Component comp : comps) {
            if (comp instanceof CustomerSupportHomePageJPanel) {
                CustomerSupportHomePageJPanel panel = (CustomerSupportHomePageJPanel) comp;
                panel.populate();
            }
        }
        layout.previous(rightPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        btnUpdate.setEnabled(true);
        btnSave.setEnabled(false);
        cbStatus.setEnabled(false);
        
        int index = cbStatus.getSelectedIndex();
        if(index == 1) {
            booking.setStatus(Booking.Status.Closed);
            
            // When CS close a booking, send email to student
            new java.util.Timer().schedule(new TimerTask() {
                @Override
                public void run() {
                    System.out.println("Email Sending ... Booking been closed ...");
                    EmailUtil.GmailSender(
                            booking.getRegistrant().getEmail(), 
                            "ThatsMyPlace - You Booking Has Been Closed", 
                            "Your booking has been closed!"
                    );
                }
           }, 200);
        }
        else if(index == 0) booking.setStatus(Booking.Status.Confirmed);
        else if(index == 2) booking.setStatus(Booking.Status.NoShow);
        System.out.println(index);
    }//GEN-LAST:event_btnSaveActionPerformed

    private void cbStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbStatusActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblBookingDate;
    private javax.swing.JLabel lblBookingDetails;
    private javax.swing.JLabel lblBookingID;
    private javax.swing.JLabel lblCourtNo;
    private javax.swing.JLabel lblEndTime;
    private javax.swing.JLabel lblStartTime;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JTextField txtBookingDate;
    private javax.swing.JTextField txtBookingID;
    private javax.swing.JTextField txtCourtNo;
    private javax.swing.JTextField txtEndTime;
    private javax.swing.JTextField txtStartTime;
    private javax.swing.JTextField txtUserId;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
