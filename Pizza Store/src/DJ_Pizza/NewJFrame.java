
package DJ_Pizza;

import java.awt.CardLayout;
import java.text.DecimalFormat;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import javax.swing.DefaultComboBoxModel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



/**
 *
 * @author Dwi
 */
public class NewJFrame extends javax.swing.JFrame {

    public NewJFrame() {
        
        initComponents();
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(30);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(200);
        
              
    }

  public void addtable(int id ,String Name, int Qty ,Double Price){
  
      DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
      
      Vector v = new Vector() ;
      
      v.add(id);
      v.add(Name);
      v.add(Qty);
      v.add(Price);
      
      dt.addRow(v);
      
      
      
      
  
  }

    
    public void addtables(String nmCustomer ,String Name,int Qty ,double Price){
    
        DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
        
       DecimalFormat df = new DecimalFormat("00.00") ;       
       double totPrice = Price * Double.valueOf(Qty) ;
       
       String TotalPrice = df.format(totPrice);
        
        for (int row = 0; row < jTable1.getRowCount(); row++) {
            
            if (Name == jTable1.getValueAt(row, 1)) {
                
                dt.removeRow(jTable1.convertRowIndexToModel(row));
                
            } 
        }
        
        Vector v = new Vector();
        
        v.add(nmCustomer);
        v.add(Name);
        v.add(Qty);
        v.add(TotalPrice); // total price
        
        dt.addRow(v);
        
    
    }
    
   public void cal(){
    //cal total table values
   
   int numOfRow = jTable1.getRowCount() ;
   double tot = 0.0 ;
   
       for (int i = 0; i < numOfRow; i++) {
           
           double value = Double.valueOf(jTable1.getValueAt(i, 3).toString());
          
           tot += value ;
           
       }
       
       DecimalFormat df = new DecimalFormat("00.00") ;
       
       total.setText(df.format(tot));
    
   
   
   } 
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel32 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        mainMenu = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        yukOrder = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        b = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        nmCustomer = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jenisPizza = new javax.swing.JComboBox<>();
        jPanel9 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jumlahPizza = new javax.swing.JSpinner();
        ukuranPesanan = new javax.swing.JPanel();
        sizeLarge = new javax.swing.JRadioButton();
        sizeMedium = new javax.swing.JRadioButton();
        sizeSmall = new javax.swing.JRadioButton();
        jLabel17 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        cancelOrder = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        bal = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pay = new javax.swing.JTextField();
        total = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/dd1ss5s-41562388-42d3-442c-96cc-70df95a097aa.gif"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/dd1ss5s-41562388-42d3-442c-96cc-70df95a097aa.gif"))); // NOI18N

        yukOrder.setFont(new java.awt.Font("OCR A Std", 1, 24)); // NOI18N
        yukOrder.setText("ORDER HERE!!!");
        yukOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yukOrderActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Trajan Pro", 0, 55)); // NOI18N
        jLabel4.setText("DJ Pizza");

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/dd1ss5s-41562388-42d3-442c-96cc-70df95a097aa.gif"))); // NOI18N

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/dd1ss5s-41562388-42d3-442c-96cc-70df95a097aa.gif"))); // NOI18N

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/dd1ss5s-41562388-42d3-442c-96cc-70df95a097aa.gif"))); // NOI18N

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/dd1ss5s-41562388-42d3-442c-96cc-70df95a097aa.gif"))); // NOI18N

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/dd1ss5s-41562388-42d3-442c-96cc-70df95a097aa.gif"))); // NOI18N

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/dd1ss5s-41562388-42d3-442c-96cc-70df95a097aa.gif"))); // NOI18N

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/dd1ss5s-41562388-42d3-442c-96cc-70df95a097aa.gif"))); // NOI18N

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/dd1ss5s-41562388-42d3-442c-96cc-70df95a097aa.gif"))); // NOI18N

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/dd1ss5s-41562388-42d3-442c-96cc-70df95a097aa.gif"))); // NOI18N

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/dd1ss5s-41562388-42d3-442c-96cc-70df95a097aa.gif"))); // NOI18N

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/dd1ss5s-41562388-42d3-442c-96cc-70df95a097aa.gif"))); // NOI18N

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/dd1ss5s-41562388-42d3-442c-96cc-70df95a097aa.gif"))); // NOI18N

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/dd1ss5s-41562388-42d3-442c-96cc-70df95a097aa.gif"))); // NOI18N

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/dd1ss5s-41562388-42d3-442c-96cc-70df95a097aa.gif"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/pizza-png-from-pngfre-32.png"))); // NOI18N

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/dd1ss5s-41562388-42d3-442c-96cc-70df95a097aa.gif"))); // NOI18N

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/dd1ss5s-41562388-42d3-442c-96cc-70df95a097aa.gif"))); // NOI18N

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/dd1ss5s-41562388-42d3-442c-96cc-70df95a097aa.gif"))); // NOI18N

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/dd1ss5s-41562388-42d3-442c-96cc-70df95a097aa.gif"))); // NOI18N

        javax.swing.GroupLayout mainMenuLayout = new javax.swing.GroupLayout(mainMenu);
        mainMenu.setLayout(mainMenuLayout);
        mainMenuLayout.setHorizontalGroup(
            mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainMenuLayout.createSequentialGroup()
                        .addGroup(mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainMenuLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel29)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel35)
                                .addGap(35, 35, 35)
                                .addComponent(jLabel19)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel36))
                            .addGroup(mainMenuLayout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(mainMenuLayout.createSequentialGroup()
                                        .addComponent(jLabel24)
                                        .addGap(24, 24, 24)
                                        .addComponent(jLabel20)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel23)
                                        .addGap(19, 19, 19)
                                        .addComponent(jLabel22)
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel33)
                                        .addGap(62, 62, 62)
                                        .addComponent(jLabel27)
                                        .addGap(74, 74, 74)
                                        .addComponent(jLabel28)
                                        .addGap(71, 71, 71)
                                        .addComponent(jLabel21))))
                            .addGroup(mainMenuLayout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(31, 31, 31)
                                .addComponent(yukOrder)))
                        .addGap(244, 244, 244))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainMenuLayout.createSequentialGroup()
                        .addComponent(jLabel37)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel31)
                        .addGap(288, 288, 288))))
            .addGroup(mainMenuLayout.createSequentialGroup()
                .addGap(371, 371, 371)
                .addGroup(mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel25)
                    .addGroup(mainMenuLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGroup(mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainMenuLayout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jLabel30))
                            .addGroup(mainMenuLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel18)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainMenuLayout.createSequentialGroup()
                    .addContainerGap(483, Short.MAX_VALUE)
                    .addComponent(jLabel39)
                    .addGap(436, 436, 436)))
        );
        mainMenuLayout.setVerticalGroup(
            mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainMenuLayout.createSequentialGroup()
                .addGroup(mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(mainMenuLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainMenuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel37)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainMenuLayout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainMenuLayout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jLabel18)
                        .addGap(78, 78, 78)
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel30)))
                .addGroup(mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainMenuLayout.createSequentialGroup()
                        .addGroup(mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainMenuLayout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel33)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel23))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainMenuLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGroup(mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainMenuLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel29)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainMenuLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                                .addComponent(yukOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel35)
                                    .addComponent(jLabel36))
                                .addContainerGap(15, Short.MAX_VALUE))))
                    .addGroup(mainMenuLayout.createSequentialGroup()
                        .addGroup(mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainMenuLayout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(jLabel28))
                            .addGroup(mainMenuLayout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel27))))
                        .addContainerGap())))
            .addGroup(mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainMenuLayout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jLabel39)
                    .addContainerGap(573, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Menu utama", mainMenu);

        b.setColumns(20);
        b.setRows(5);
        jScrollPane2.setViewportView(b);

        jTable1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order name", "Item", "Qty", "Price"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel4.setBackground(new java.awt.Color(255, 255, 51));
        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel7.setFont(new java.awt.Font("Footlight MT Light", 1, 36)); // NOI18N
        jLabel7.setText("Pesanan pizza");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(433, 433, 433))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel8.setText("Order Name");

        nmCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nmCustomerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nmCustomer)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nmCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jPanel8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel13.setText("Pizza Menu");

        jenisPizza.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pizza Goyang", "Pizza Pargoy", "Pizza Doyong", "Pizza Djchees" }));
        jenisPizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jenisPizzaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jenisPizza, 0, 267, Short.MAX_VALUE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jenisPizza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel16.setText("Qty");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jumlahPizza, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jumlahPizza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ukuranPesanan.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        sizeLarge.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        sizeLarge.setText("Large");
        sizeLarge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sizeLargeActionPerformed(evt);
            }
        });

        sizeMedium.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        sizeMedium.setText("Medium");
        sizeMedium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sizeMediumActionPerformed(evt);
            }
        });

        sizeSmall.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        sizeSmall.setText("Small");

        jLabel17.setText("Size");

        javax.swing.GroupLayout ukuranPesananLayout = new javax.swing.GroupLayout(ukuranPesanan);
        ukuranPesanan.setLayout(ukuranPesananLayout);
        ukuranPesananLayout.setHorizontalGroup(
            ukuranPesananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ukuranPesananLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ukuranPesananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sizeLarge)
                    .addComponent(sizeMedium)
                    .addComponent(sizeSmall)
                    .addComponent(jLabel17))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ukuranPesananLayout.setVerticalGroup(
            ukuranPesananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ukuranPesananLayout.createSequentialGroup()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(sizeLarge)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sizeMedium)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sizeSmall)
                .addContainerGap())
        );

        jButton7.setText("Order");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        cancelOrder.setText("Cancel");
        cancelOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelOrderActionPerformed(evt);
            }
        });

        jButton9.setText("Print");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        clearButton.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        jButton11.setText("Pay");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        bal.setText("0");

        jLabel3.setText("Kembalian        : ");

        jLabel2.setText("Cash                 :");

        total.setText("0");

        jLabel1.setText("Total Order      :");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ukuranPesanan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cancelOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(pay, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(bal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(total, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(clearButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(241, 241, 241))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clearButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addGap(236, 236, 236))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(ukuranPesanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cancelOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(total))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pay))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(bal))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(68, Short.MAX_VALUE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );

        jTabbedPane1.addTab("Pesan pizza", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 969, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPane1StateChanged

    private void yukOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yukOrderActionPerformed
        // Menggunakan nama jTabbedPane1 sesuai dengan nama variabel Anda
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_yukOrderActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // pat btn
        double tot = Double.valueOf(total.getText());
        double paid = Double.valueOf(pay.getText());
        double balance = paid - tot ;

        DecimalFormat df = new DecimalFormat("00.00") ;

        bal.setText(String.valueOf(df.format(balance)));
    }//GEN-LAST:event_jButton11ActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        // TODO add your handling code here:
        b.setText("");
        nmCustomer.setText("");
        jumlahPizza.setValue(0);
        total.setText("");
        pay.setText("");
        bal.setText("");

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
    }//GEN-LAST:event_clearButtonActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        // bill print

        try {

            b.setText("                         DJ PIZZA \n");
            b.setText(b.getText() + "                         no23/ Buah Batu, \n");
            b.setText(b.getText() + "                         Bandung, Jawa Barat, \n");
            b.setText(b.getText() + "                         +62 895 5323 5323, \n");
            b.setText(b.getText() + "---------------------------------------------------------------------\n");
            b.setText(b.getText() + "  Item \t\tQty \tHarga" +"\n");
            b.setText(b.getText() + "---------------------------------------------------------------------\n");

            DefaultTableModel df = (DefaultTableModel) jTable1.getModel();

            // get table Product details

            for (int i = 0; i < jTable1.getRowCount(); i++) {

                String Name = df.getValueAt(i, 1).toString();
                String Qty = df.getValueAt(i, 2).toString();
                String Price = df.getValueAt(i, 3).toString();

                b.setText(b.getText() +"  "+ Name+"\t"+Qty +"\t Rp. "+Price + "\n");
            }

            b.setText(b.getText() + "---------------------------------------------------------------------\n");
            b.setText(b.getText() + "Nama Pesanan : " + nmCustomer.getText() +"\n");
            b.setText(b.getText() + "Sub Total    : Rp." + total.getText() +"\n");
            b.setText(b.getText() + "Cash         : Rp." + pay.getText() +"\n");
            b.setText(b.getText() + "Kembalian    : Rp." + bal.getText() +"\n");
            b.setText(b.getText() + "---------------------------------------------------------------------\n");
            b.setText(b.getText() + "                     Terimkasih sudah order...!"+"\n");
            b.setText(b.getText() + "---------------------------------------------------------------------\n");

//            b.print(); //print

        } catch (Exception e) {

            System.out.println(e);

        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void cancelOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelOrderActionPerformed
        // TODO add your handling code here:

        DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();

        String r = dt.getValueAt(jTable1.getSelectedRow(), 0).toString();

        //remove product
        int rw = jTable1.getSelectedRow();
        dt.removeRow(rw);
    }//GEN-LAST:event_cancelOrderActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        //        int i = Integer.valueOf(q1.getText());
        //        ++i;

        //        q1.setText(String.valueOf(i));

        //        String jenisPizza = (String) jenisPizza.getSelectedItem();
        int jmlPizza = (int) jumlahPizza.getValue();

        if(jenisPizza.getSelectedItem() == "Pizza Goyang"){
            if(sizeLarge.isSelected()){
                addtables(nmCustomer.getText(), "Pizza Goyang - L", jmlPizza, 35000);
            } else if(sizeMedium.isSelected()){
                addtables(nmCustomer.getText(), "Pizza Goyang - M", jmlPizza, 25000);
            } else if(sizeSmall.isSelected()){
                addtables(nmCustomer.getText(), "Pizza Goyang - S", jmlPizza, 15000);
            }
        } else if(jenisPizza.getSelectedItem() == "Pizza Pargoy"){
            if(sizeLarge.isSelected()){
                addtables(nmCustomer.getText(), "Pizza Pargoy - L", jmlPizza, 38000);
            } else if(sizeMedium.isSelected()){
                addtables(nmCustomer.getText(), "Pizza Pargoy - M", jmlPizza, 28000);
            } else if(sizeSmall.isSelected()){
                addtables(nmCustomer.getText(), "Pizza Pargoy - S", jmlPizza, 18000);
            }
        } else if(jenisPizza.getSelectedItem() == "Pizza Doyong"){
            if(sizeLarge.isSelected()){
                addtables(nmCustomer.getText(), "Pizza Doyong - L", jmlPizza, 32000);
            } else if(sizeMedium.isSelected()){
                addtables(nmCustomer.getText(), "Pizza Doyong - M", jmlPizza, 22000);
            } else if(sizeSmall.isSelected()){
                addtables(nmCustomer.getText(), "Pizza Doyong - S", jmlPizza, 12000);
            }
        } else if(jenisPizza.getSelectedItem() == "Pizza Djchees"){
            if(sizeLarge.isSelected()){
                addtables(nmCustomer.getText(), "Pizza Djchees - L", jmlPizza, 36000);
            } else if(sizeMedium.isSelected()){
                addtables(nmCustomer.getText(), "Pizza Djchees - M", jmlPizza, 26000);
            } else if(sizeSmall.isSelected()){
                addtables(nmCustomer.getText(), "Pizza Djchees - S", jmlPizza, 16000);
            }
        }

        cal();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void sizeMediumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sizeMediumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sizeMediumActionPerformed

    private void sizeLargeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sizeLargeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sizeLargeActionPerformed

    private void jenisPizzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jenisPizzaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jenisPizzaActionPerformed

    private void nmCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nmCustomerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nmCustomerActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea b;
    private javax.swing.JLabel bal;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cancelOrder;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> jenisPizza;
    private javax.swing.JSpinner jumlahPizza;
    private javax.swing.JPanel mainMenu;
    private javax.swing.JTextField nmCustomer;
    private javax.swing.JTextField pay;
    private javax.swing.JRadioButton sizeLarge;
    private javax.swing.JRadioButton sizeMedium;
    private javax.swing.JRadioButton sizeSmall;
    private javax.swing.JLabel total;
    private javax.swing.JPanel ukuranPesanan;
    private javax.swing.JButton yukOrder;
    // End of variables declaration//GEN-END:variables
}
