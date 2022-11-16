
package hihi.View;

import hihi.DomainModels.CuaHang;
import hihi.Services.CuaHangService;
import hihi.Services.impl.CuaHangServiceImpl;
import hihi.ViewModels.QLCuaHang;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class QlCuaHangView extends javax.swing.JFrame {

    private DefaultTableModel model;
    private CuaHangService cuaHangService = new CuaHangServiceImpl();
    
    public QlCuaHangView() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public void loadData(ArrayList<QLCuaHang> list){
        model = (DefaultTableModel) tblCuaHang.getModel();
        model.setColumnIdentifiers(new String[]{"Mã","Tên","Địa chỉ","Thành phố","Quốc gia","Địa chỉ đầy đủ"});
        model.setRowCount(0);
        for(QLCuaHang qLCuaHang : list){
            model.addRow(new Object[]{qLCuaHang.getMa(),qLCuaHang.getTen(),qLCuaHang.getDiaChi(),
                qLCuaHang.getThanhPho(),qLCuaHang.getQuocGia(),qLCuaHang.getQuocGia()+","+qLCuaHang.getThanhPho()+","+qLCuaHang.getDiaChi()});
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMa = new javax.swing.JTextField();
        txtTen = new javax.swing.JTextField();
        txtDiaCHi = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtThanhPho = new javax.swing.JTextField();
        txtQuocGia = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnHienTHi = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtTim = new javax.swing.JTextField();
        btnTIm = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCuaHang = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Quản lý Cửa Hàng");

        jLabel2.setText("Mã cửa hàng");

        jLabel3.setText("Tên cửa hàng");

        jLabel4.setText("Địa chỉ");

        jLabel5.setText("Thành phố");

        jLabel6.setText("Quốc Gia");

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnHienTHi.setText("Hiển thị");
        btnHienTHi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHienTHiActionPerformed(evt);
            }
        });

        jLabel7.setText("Search");

        btnTIm.setText("Tìm");
        btnTIm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTImActionPerformed(evt);
            }
        });

        tblCuaHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblCuaHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCuaHangMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblCuaHang);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(btnThem)
                        .addGap(65, 65, 65)
                        .addComponent(btnSua)
                        .addGap(71, 71, 71)
                        .addComponent(btnXoa)
                        .addGap(82, 82, 82)
                        .addComponent(btnHienTHi)
                        .addGap(89, 89, 89))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(40, 40, 40)
                                        .addComponent(txtTim, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel3)
                                                .addComponent(jLabel4))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtTen, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                                                .addComponent(txtDiaCHi)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtMa))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtThanhPho))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addGap(26, 26, 26)
                                                .addComponent(txtQuocGia))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addComponent(btnTIm)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtTim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTIm))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(txtThanhPho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(txtQuocGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDiaCHi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnSua)
                    .addComponent(btnXoa)
                    .addComponent(btnHienTHi))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void btnHienTHiActionPerformed(java.awt.event.ActionEvent evt) {                                           
        loadData(cuaHangService.getList());
    }                                          

    private void tblCuaHangMouseClicked(java.awt.event.MouseEvent evt) {                                        
        int row = tblCuaHang.getSelectedRow();
        txtMa.setText(tblCuaHang.getValueAt(row, 0).toString());
        txtTen.setText(tblCuaHang.getValueAt(row, 1).toString());
        txtDiaCHi.setText(tblCuaHang.getValueAt(row, 2).toString());
        txtThanhPho.setText(tblCuaHang.getValueAt(row, 3).toString());
        txtQuocGia.setText(tblCuaHang.getValueAt(row, 4).toString());
    }                                       

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {                                        
        CuaHang ch = new CuaHang();
        ch.setMa(txtMa.getText());
        ch.setTen(txtMa.getText());
        ch.setDiaChi(txtMa.getText());
        ch.setThanhPho(txtMa.getText());
        ch.setQuocGia(txtMa.getText());
        
        if(cuaHangService.them(ch)){
            JOptionPane.showMessageDialog(this, "Thêm thành công");
            loadData(cuaHangService.getList());
        }
    }                                       

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {                                       
        CuaHang ch = new CuaHang();
        ch.setMa(txtMa.getText());
        ch.setTen(txtTen.getText());
        ch.setDiaChi(txtDiaCHi.getText());
        ch.setThanhPho(txtThanhPho.getText());
        ch.setQuocGia(txtQuocGia.getText());
        
        int index = tblCuaHang.getSelectedRow();
        String ma = tblCuaHang.getValueAt(index, 0).toString();
        
        
        if(cuaHangService.sua(ma, ch)){
            JOptionPane.showMessageDialog(this, "Sửa thành công");
            System.out.println(ma);
            loadData(cuaHangService.getList());
        }
    }                                      

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {                                       
        String ma = txtMa.getText();
        if(cuaHangService.xoa(ma)){
            JOptionPane.showMessageDialog(this, "Xóa thành công");
            loadData(cuaHangService.getList());
        }
    }                                      

    private void btnTImActionPerformed(java.awt.event.ActionEvent evt) {                                       
        String diaChi = txtTim.getText();
        ArrayList<QLCuaHang> listTk = cuaHangService.tim(diaChi);
        loadData(listTk);
    }                                      

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
            java.util.logging.Logger.getLogger(QlCuaHangView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QlCuaHangView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QlCuaHangView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QlCuaHangView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QlCuaHangView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnHienTHi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnTIm;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblCuaHang;
    private javax.swing.JTextField txtDiaCHi;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtQuocGia;
    private javax.swing.JTextField txtTen;
    private javax.swing.JTextField txtThanhPho;
    private javax.swing.JTextField txtTim;
    // End of variables declaration                   
}
