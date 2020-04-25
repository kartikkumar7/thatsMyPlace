package Interface.StudentRole;

import Business.Enterprise.Enterprise;
import Business.Enterprise.FacilityEnterprise;
import Business.Facility.Basketball.BasketballCourtAvailDirectory;
import Business.Facility.Basketball.BasketballCourtAvailability;
import Business.ThatsMyPlaceSystem;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author bochao
 */
public class StudentBookingJPanel extends javax.swing.JPanel {
    
    private JPanel rightPanel;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private LocalDate selectedDate;
    private ThatsMyPlaceSystem business;
    private FacilityEnterprise newFacility;
    private List<BasketballCourtAvailability> basketCourtlist;
    private List<BasketballCourtAvailability> searchList;
    private BasketballCourtAvailDirectory courtAvailDir;
    
    /**
     * Creates new form StudentBookingJPanel
     */
    public StudentBookingJPanel(JPanel rightPanel,
            UserAccount userAccount, 
            Enterprise enterprise, 
            ThatsMyPlaceSystem business,
            LocalDate selectedDate) 
    {
        initComponents();
        this.rightPanel = rightPanel;
        this.userAccount  = userAccount;
        this.enterprise = enterprise;
        this.business = business;
        this.selectedDate = selectedDate;
        this.newFacility = (FacilityEnterprise) business.getNetworkList()
                                                        .get(0)
                                                        .getEnterpriseDirectory()
                                                        .getEnterpriseList()
                                                        .get(0);
        populate();
        setColor(new Color(45,118,232));
    }
    
    public void populate() {
        basketCourtlist = newFacility.getBasketballCourtAvailDirectory().getList();
        DefaultTableModel dtm = (DefaultTableModel)tblAvailCourts.getModel();
        dtm.setRowCount(0);

        for (BasketballCourtAvailability bca : basketCourtlist) {
            if (bca.getDate().equals(selectedDate)) {
                Object[] row = new Object[dtm.getColumnCount()];
                row[0] = bca.getCourtNo();
                row[1] = bca.getDate();
                row[2] = bca; // begin time
                row[3] = bca.getEndTime();
                row[4] = (bca.isIsAvailability()?"Available":"Booked");
                dtm.addRow(row); 
            }
        }
    }
    
    public void populate(List<BasketballCourtAvailability> list){
        DefaultTableModel dtm = (DefaultTableModel)tblAvailCourts.getModel();
        dtm.setRowCount(0);

        for(BasketballCourtAvailability bca : list){
            Object[] row = new Object[dtm.getColumnCount()];
            row[0] = bca.getCourtNo();
            row[1] = bca.getDate();
            row[2] = bca;  // begin time;
            row[3] = bca.getEndTime();  //end time;
            row[4] = (bca.isIsAvailability()?"Available":"Booked");
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

        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAvailCourts = new javax.swing.JTable();
        txtCourtNo = new javax.swing.JTextField();
        txtStartTime = new javax.swing.JTextField();
        lblCourtNo = new javax.swing.JLabel();
        lblStartTime = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        btnBook = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1000, 700));

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

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(45, 118, 232)));
        jScrollPane1.setForeground(new java.awt.Color(45, 118, 232));

        tblAvailCourts.setForeground(new java.awt.Color(45, 118, 232));
        tblAvailCourts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CourtId", "Date", "BeginTime (24hr format)", "EndTime (24hr format)", "Availability Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAvailCourts.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblAvailCourts);
        if (tblAvailCourts.getColumnModel().getColumnCount() > 0) {
            tblAvailCourts.getColumnModel().getColumn(0).setResizable(false);
            tblAvailCourts.getColumnModel().getColumn(1).setResizable(false);
            tblAvailCourts.getColumnModel().getColumn(2).setResizable(false);
            tblAvailCourts.getColumnModel().getColumn(3).setResizable(false);
            tblAvailCourts.getColumnModel().getColumn(4).setResizable(false);
        }

        txtCourtNo.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        txtCourtNo.setForeground(new java.awt.Color(45, 118, 232));
        txtCourtNo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(45, 118, 232)));
        txtCourtNo.setCaretColor(new java.awt.Color(45, 118, 232));

        txtStartTime.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        txtStartTime.setForeground(new java.awt.Color(45, 118, 232));
        txtStartTime.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(45, 118, 232)));
        txtStartTime.setCaretColor(new java.awt.Color(45, 118, 232));

        lblCourtNo.setBackground(new java.awt.Color(255, 255, 255));
        lblCourtNo.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblCourtNo.setForeground(new java.awt.Color(45, 118, 232));
        lblCourtNo.setText("Court No:");

        lblStartTime.setBackground(new java.awt.Color(255, 255, 255));
        lblStartTime.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblStartTime.setForeground(new java.awt.Color(45, 118, 232));
        lblStartTime.setText("Start Time:");

        btnSearch.setBackground(new java.awt.Color(255, 255, 255));
        btnSearch.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(45, 118, 232));
        btnSearch.setText("Search");
        btnSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(45, 118, 232)));
        btnSearch.setContentAreaFilled(false);
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnBook.setBackground(new java.awt.Color(255, 255, 255));
        btnBook.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnBook.setForeground(new java.awt.Color(45, 118, 232));
        btnBook.setText("Book Now!");
        btnBook.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(45, 118, 232)));
        btnBook.setContentAreaFilled(false);
        btnBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(45, 118, 232));
        jLabel1.setText("Basketball Court Availabilities");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(92, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblCourtNo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtCourtNo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(28, 28, 28)
                            .addComponent(lblStartTime)
                            .addGap(18, 18, 18)
                            .addComponent(txtStartTime, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(31, 31, 31)
                            .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBook, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 818, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(90, 90, 90))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCourtNo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCourtNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStartTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStartTime, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBook, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        rightPanel.remove(this);
        CardLayout layout = (CardLayout)rightPanel.getLayout();
        layout.previous(rightPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        searchList = new ArrayList<>();
        boolean CourtIdBool =  true;
        boolean DateBool =  true;
        boolean StarTimeBool =  true;
        
       if((txtCourtNo.getText().isEmpty()||txtCourtNo.getText().equalsIgnoreCase(""))&&(txtStartTime.getText().isEmpty()||txtStartTime.getText().equalsIgnoreCase(""))){
           JOptionPane.showMessageDialog(null, "Enter a parameter to base search on!");
           txtCourtNo.setBorder(BorderFactory.createLineBorder(Color.RED));
           lblCourtNo.setForeground(Color.RED);
           txtStartTime.setBorder(BorderFactory.createLineBorder(Color.RED));
           lblStartTime.setForeground(Color.RED);
           return;
       }
     
        for(BasketballCourtAvailability bca : basketCourtlist){
            if(txtCourtNo.getText().length() != 0){
                try{
                    Integer.parseInt(txtCourtNo.getText());
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, "Court Number must be integer only! Try again with only integer value.");
                    txtCourtNo.setBorder(BorderFactory.createLineBorder(Color.RED));
                    lblCourtNo.setForeground(Color.RED);
                    return;
                }
                CourtIdBool = Integer.parseInt(txtCourtNo.getText()) == bca.getCourtNo();
            }
            
            if(txtStartTime.getText().length() != 0){
                try{
                    Integer.parseInt(txtStartTime.getText());
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, "StartTime must be integer only! Try again with only integer value.");
                    txtStartTime.setBorder(BorderFactory.createLineBorder(Color.RED));
                    lblStartTime.setForeground(Color.RED);
                    return;
                }
                StarTimeBool = Integer.parseInt(txtStartTime.getText()) == bca.getStarTime() ;
            }
            
            if(  CourtIdBool && StarTimeBool) {              
                searchList.add(bca);
            }
        }
        
        populate(searchList);
        resetColor();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookActionPerformed
        int selectedRow = tblAvailCourts.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row to make booking!", "Information", JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            BasketballCourtAvailability bca = (BasketballCourtAvailability) tblAvailCourts.getValueAt(selectedRow, 2);
            if(!bca.isIsAvailability()){
                JOptionPane.showMessageDialog(null, "Court is already booked! Please select an available slot!");
                return;
            }
            ConfirmPageJPanel panel = new ConfirmPageJPanel(rightPanel, userAccount, bca, newFacility.getMasterBookingList(), business);
            rightPanel.add("ConfirmPageJPanel", panel);
            CardLayout layout = (CardLayout) rightPanel.getLayout();
            layout.next(rightPanel);
        }
    }//GEN-LAST:event_btnBookActionPerformed

    private void setColor(Color color) {
        txtCourtNo.setBorder(BorderFactory.createLineBorder(color));
        lblCourtNo.setForeground(color);
        txtStartTime.setBorder(BorderFactory.createLineBorder(color));
        lblStartTime.setForeground(color);
    }
    
    private void resetColor() {
        txtCourtNo.setBorder(BorderFactory.createLineBorder(new Color(45,118,232)));
        lblCourtNo.setForeground(new Color(45,118,232));
        txtStartTime.setBorder(BorderFactory.createLineBorder(new Color(45,118,232)));
        lblStartTime.setForeground(new Color(45,118,232));
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBook;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCourtNo;
    private javax.swing.JLabel lblStartTime;
    private javax.swing.JTable tblAvailCourts;
    private javax.swing.JTextField txtCourtNo;
    private javax.swing.JTextField txtStartTime;
    // End of variables declaration//GEN-END:variables
}