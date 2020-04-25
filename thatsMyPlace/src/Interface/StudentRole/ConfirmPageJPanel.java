package Interface.StudentRole;

import Business.Booking.Booking;
import Business.Booking.BookingHistory;
import Business.Booking.MasterBookingList;
import Business.EmailUtil.EmailUtil;
import Business.Facility.Basketball.BasketballCourtAvailability;
import Business.Student.Student;
import Business.ThatsMyPlaceSystem;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.time.LocalDate;
import java.util.TimerTask;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author bochao
 */
public class ConfirmPageJPanel extends javax.swing.JPanel {
    
    private JPanel rightPanel;
    private UserAccount userAccount;
    private MasterBookingList masterBookingList;
    private BasketballCourtAvailability basketCourtDirAvil;
    private ThatsMyPlaceSystem business;

    /**
     * Creates new form ConfirmPageJPanel
     */
    public ConfirmPageJPanel(JPanel rightPanel,
            UserAccount userAccount,
            BasketballCourtAvailability basketCourtDirAvil ,
            MasterBookingList masterBookingList,
            ThatsMyPlaceSystem business) 
    {
        initComponents();
        this.rightPanel = rightPanel;
        this.userAccount = userAccount;
        this.basketCourtDirAvil = basketCourtDirAvil;
        this.masterBookingList = masterBookingList;
        this.business = business;
        
        populate();
        txtCourtId.setEnabled(false);
        txtDate.setEnabled(false);
        txtEndTime.setEnabled(false);
        txtStartTime.setEnabled(false);
    }
    
    private void populate() {
        txtCourtId.setText(Integer.toString(basketCourtDirAvil.getCourtNo()));
        txtDate.setText(basketCourtDirAvil.getDate().toString());
        txtStartTime.setText(Integer.toString(basketCourtDirAvil.getStarTime()));
        txtEndTime.setText( Integer.toString(basketCourtDirAvil.getEndTime()));
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loadingJPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblFrom = new javax.swing.JLabel();
        lblTo = new javax.swing.JLabel();
        lblPNR = new javax.swing.JLabel();
        lblDep = new javax.swing.JLabel();
        txtCourtId = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        txtStartTime = new javax.swing.JTextField();
        txtEndTime = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        loadingJPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(0, 153, 153));
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LOADING...");

        javax.swing.GroupLayout loadingJPanelLayout = new javax.swing.GroupLayout(loadingJPanel);
        loadingJPanel.setLayout(loadingJPanelLayout);
        loadingJPanelLayout.setHorizontalGroup(
            loadingJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loadingJPanelLayout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(191, Short.MAX_VALUE))
        );
        loadingJPanelLayout.setVerticalGroup(
            loadingJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loadingJPanelLayout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(160, Short.MAX_VALUE))
        );

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1000, 700));

        lblFrom.setBackground(new java.awt.Color(255, 255, 255));
        lblFrom.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblFrom.setForeground(new java.awt.Color(45, 118, 232));
        lblFrom.setText("CourtId");

        lblTo.setBackground(new java.awt.Color(255, 255, 255));
        lblTo.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblTo.setForeground(new java.awt.Color(45, 118, 232));
        lblTo.setText("Date");

        lblPNR.setBackground(new java.awt.Color(255, 255, 255));
        lblPNR.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblPNR.setForeground(new java.awt.Color(45, 118, 232));
        lblPNR.setText("StartTime");

        lblDep.setBackground(new java.awt.Color(255, 255, 255));
        lblDep.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblDep.setForeground(new java.awt.Color(45, 118, 232));
        lblDep.setText("EndTime");

        txtCourtId.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        txtCourtId.setDisabledTextColor(new java.awt.Color(204, 204, 204));

        txtDate.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        txtDate.setDisabledTextColor(new java.awt.Color(204, 204, 204));

        txtStartTime.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        txtStartTime.setDisabledTextColor(new java.awt.Color(204, 204, 204));

        txtEndTime.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        txtEndTime.setDisabledTextColor(new java.awt.Color(204, 204, 204));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(45, 118, 232));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Confirm booking info");

        btnSubmit.setBackground(new java.awt.Color(255, 255, 255));
        btnSubmit.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(45, 118, 232));
        btnSubmit.setText("Submit");
        btnSubmit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(45, 118, 232)));
        btnSubmit.setContentAreaFilled(false);
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(406, 406, 406))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(338, 338, 338)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(351, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(292, 292, 292)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPNR)
                    .addComponent(lblFrom)
                    .addComponent(lblTo)
                    .addComponent(lblDep))
                .addGap(126, 126, 126)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCourtId, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(txtStartTime)
                    .addComponent(txtEndTime)
                    .addComponent(txtDate))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFrom)
                    .addComponent(txtCourtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTo)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPNR)
                    .addComponent(txtStartTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDep)
                    .addComponent(txtEndTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        int courtId = basketCourtDirAvil.getCourtNo();
        int beginTime = basketCourtDirAvil.getStarTime();
        int endTime = basketCourtDirAvil.getEndTime();
        LocalDate localDate = basketCourtDirAvil.getDate();
        
        Student student = (Student) userAccount.getEmployee();
        BookingHistory bookingHistory = student.getBookingHistory();
        
        // Create the booking
        Booking booking = new Booking(student, courtId, localDate, beginTime, endTime);
        // Put the new booking into masterBookingList and UserAccount's bookingHistory
        masterBookingList.addBooking(booking);
        bookingHistory.addBooking(booking);
        // Ture the availibility to false
        basketCourtDirAvil.change(false);
        
        btnSubmit.setEnabled(false);
        JOptionPane.showMessageDialog(null, "Booking Confirmed!", "Information", JOptionPane.INFORMATION_MESSAGE);
        
        new java.util.Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Email Sending ... Successfully booked ...");
                EmailUtil.GmailSender(
                        student.getEmail(), 
                        "Booked Successfully! - ThatsMyPlace", 
                        "You have booked a court!\n" + "Court Info: \n" +"\t\tDate: "+ localDate +"\t\tCourt Id: " + courtId + "\t\tTime Section: " + beginTime + " - " + endTime
                );
            }
        }, 200);
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        rightPanel.remove(this);
        CardLayout layout = (CardLayout) rightPanel.getLayout();
        Component[] comps = this.rightPanel.getComponents();
        for (Component comp : comps) {
            if (comp instanceof StudentBookingJPanel) {
                StudentBookingJPanel panel = (StudentBookingJPanel) comp;
                panel.populate();
            }
        }
        layout.previous(rightPanel);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblDep;
    private javax.swing.JLabel lblFrom;
    private javax.swing.JLabel lblPNR;
    private javax.swing.JLabel lblTo;
    private javax.swing.JPanel loadingJPanel;
    private javax.swing.JTextField txtCourtId;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtEndTime;
    private javax.swing.JTextField txtStartTime;
    // End of variables declaration//GEN-END:variables
}