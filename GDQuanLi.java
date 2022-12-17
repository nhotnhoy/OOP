package OOP;

import java.awt.Color;
import java.io.File;
import java.io.FileOutputStream;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;
import static org.apache.commons.math3.stat.inference.TestUtils.g;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Admin
 */
public class GDQuanLi extends javax.swing.JFrame {

    /**
     * Creates new form ADMIN
     */
    public GDQuanLi(String ten) {
        initComponents();
        ShowCBP();
        ShowCBA();
        ShowCBE();
        load();
        jLabel18.setText(ten);
    }
    public GDQuanLi() {
        initComponents();
    }
    ArrayList<Account> list = new ArrayList<>();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel24 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        Cb = new javax.swing.JComboBox<>();
        jTextField8 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jTextField9 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton14 = new javax.swing.JButton();
        jTextField10 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton15 = new javax.swing.JButton();
        jTextField11 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable8 = new javax.swing.JTable();
        jPanel11 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable9 = new javax.swing.JTable();
        jTextField15 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jTextField21 = new javax.swing.JTextField();
        jButton19 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTable10 = new javax.swing.JTable();
        jPanel15 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel16 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jTextField20 = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jTextField22 = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jButton20 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPanel17 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jTextField23 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jTextField26 = new javax.swing.JTextField();
        jButton22 = new javax.swing.JButton();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();

        jLabel24.setBackground(new java.awt.Color(7, 138, 68));
        jLabel24.setText("jLabel24");
        jLabel24.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel24.setOpaque(true);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(300, 150));
        setMinimumSize(new java.awt.Dimension(970, 550));
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setMaximumSize(new java.awt.Dimension(970, 550));
        jPanel1.setMinimumSize(new java.awt.Dimension(970, 550));
        jPanel1.setPreferredSize(new java.awt.Dimension(970, 550));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(7, 138, 68));
        jPanel2.setMaximumSize(new java.awt.Dimension(160, 530));
        jPanel2.setMinimumSize(new java.awt.Dimension(160, 530));
        jPanel2.setPreferredSize(new java.awt.Dimension(160, 530));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel46.setBackground(new java.awt.Color(7, 138, 68));
        jLabel46.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel46.setText("Thông tin tài khoản");
        jLabel46.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel46.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel46.setOpaque(true);
        jLabel46.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel46MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 160, 32));

        jLabel1.setBackground(new java.awt.Color(7, 138, 68));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Quản lí NCC");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.setOpaque(true);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 334, 160, 32));

        jLabel7.setBackground(new java.awt.Color(7, 138, 68));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Quản lí nhân viên");
        jLabel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.setOpaque(true);
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 302, 160, 32));

        jLabel15.setBackground(new java.awt.Color(7, 138, 68));
        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("D/s phiếu xuất");
        jLabel15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel15.setOpaque(true);
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 160, 32));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("jLabel18");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 100, 32));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("   Hello,");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, 32));

        jLabel22.setBackground(new java.awt.Color(7, 138, 68));
        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Xuất hàng");
        jLabel22.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel22.setOpaque(true);
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 238, 160, 32));

        jLabel23.setBackground(new java.awt.Color(7, 138, 68));
        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("D/s phiếu nhâp");
        jLabel23.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel23.setOpaque(true);
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 206, 160, 32));

        jLabel25.setBackground(new java.awt.Color(7, 138, 68));
        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Nhập hàng");
        jLabel25.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel25.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel25.setOpaque(true);
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel25MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 174, 160, 32));

        jLabel26.setBackground(new java.awt.Color(7, 138, 68));
        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Quản lí sản phẩm");
        jLabel26.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel26.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel26.setOpaque(true);
        jLabel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel26MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 142, 160, 32));

        jLabel27.setBackground(new java.awt.Color(7, 138, 68));
        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Quản lí tài khoản");
        jLabel27.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel27.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel27.setOpaque(true);
        jLabel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel27MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 160, 32));

        jLabel28.setBackground(new java.awt.Color(7, 138, 68));
        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Đăng xuất");
        jLabel28.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel28.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel28.setOpaque(true);
        jLabel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel28MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 160, 32));

        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_phonelink_setup_24px_1.png"))); // NOI18N
        jPanel2.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 550));

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 970, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 970, 10));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.setMaximumSize(new java.awt.Dimension(810, 32));
        jPanel3.setMinimumSize(new java.awt.Dimension(810, 32));
        jPanel3.setPreferredSize(new java.awt.Dimension(810, 32));
        jPanel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel3MouseDragged(evt);
            }
        });
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel3MousePressed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(7, 138, 68));
        jLabel9.setText("-");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(7, 138, 68));
        jLabel4.setText("X");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(916, 916, 916)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(16, 16, 16))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel4))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 2, 970, 30));

        jPanel4.setMaximumSize(new java.awt.Dimension(810, 500));
        jPanel4.setMinimumSize(new java.awt.Dimension(810, 500));

        jPanel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel5.setMaximumSize(new java.awt.Dimension(810, 500));
        jPanel5.setMinimumSize(new java.awt.Dimension(810, 500));
        jPanel5.setPreferredSize(new java.awt.Dimension(810, 500));
        jPanel5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel5MouseDragged(evt);
            }
        });
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel5MousePressed(evt);
            }
        });
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(7, 138, 68));
        jLabel3.setText("Id nhân viên");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, 32));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(7, 138, 68));
        jLabel2.setText("Mật khẩu");
        jLabel2.setMaximumSize(new java.awt.Dimension(64, 16));
        jLabel2.setMinimumSize(new java.awt.Dimension(64, 16));
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 170, 70, 32));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(7, 138, 68));
        jLabel5.setText("Tài khoản");
        jLabel5.setMaximumSize(new java.awt.Dimension(64, 16));
        jLabel5.setMinimumSize(new java.awt.Dimension(64, 16));
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 110, 70, 32));

        jTextField3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(7, 138, 68));
        jTextField3.setMaximumSize(new java.awt.Dimension(210, 25));
        jTextField3.setMinimumSize(new java.awt.Dimension(150, 20));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 180, 32));

        jTextField2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(7, 138, 68));
        jTextField2.setMaximumSize(new java.awt.Dimension(210, 25));
        jTextField2.setMinimumSize(new java.awt.Dimension(150, 20));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 180, 32));

        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(7, 138, 68));
        jTextField1.setMaximumSize(new java.awt.Dimension(210, 25));
        jTextField1.setMinimumSize(new java.awt.Dimension(150, 20));
        jPanel5.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 180, 32));

        jButton1.setBackground(new java.awt.Color(7, 138, 68));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_add_user_male_24px.png"))); // NOI18N
        jButton1.setText("Thêm");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 120, 32));

        jButton2.setBackground(new java.awt.Color(7, 138, 68));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_writer_male_24px.png"))); // NOI18N
        jButton2.setText("Sửa");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 120, 32));

        jButton3.setBackground(new java.awt.Color(7, 138, 68));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_delete_user_male_24px.png"))); // NOI18N
        jButton3.setText("Xóa");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 120, 32));

        jTable1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(7, 138, 68));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tài khoản", "Mật khẩu", "Id nhân viên"
            }
        ));
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.setMaximumSize(new java.awt.Dimension(225, 0));
        jTable1.setMinimumSize(new java.awt.Dimension(225, 0));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        jTable1.getAccessibleContext().setAccessibleDescription("");

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 501, 397));

        jTextField4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(7, 138, 68));
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField4KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField4KeyReleased(evt);
            }
        });
        jPanel5.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 700, 32));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_find_user_male_30px.png"))); // NOI18N
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 30, 30));

        jPanel6.setForeground(new java.awt.Color(7, 138, 68));
        jPanel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel6.setMaximumSize(new java.awt.Dimension(810, 500));
        jPanel6.setMinimumSize(new java.awt.Dimension(810, 500));
        jPanel6.setPreferredSize(new java.awt.Dimension(810, 500));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(7, 138, 68));
        jLabel8.setText("Số lượng");
        jPanel6.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, 32));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(7, 138, 68));
        jLabel10.setText("ID sản phẩm");
        jPanel6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, 32));

        jTextField5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(7, 138, 68));
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jPanel6.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 180, 32));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(7, 138, 68));
        jLabel11.setText("Tên");
        jPanel6.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, 32));

        jTextField6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(7, 138, 68));
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jPanel6.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 180, 32));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(7, 138, 68));
        jLabel12.setText("Giá");
        jPanel6.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, 32));

        jTextField7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(7, 138, 68));
        jPanel6.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 180, 32));

        Cb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cb.setForeground(new java.awt.Color(7, 138, 68));
        Cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbActionPerformed(evt);
            }
        });
        jPanel6.add(Cb, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 180, 32));

        jTextField8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(7, 138, 68));
        jPanel6.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 180, 32));

        jButton4.setBackground(new java.awt.Color(7, 138, 68));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Sửa");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, 70, 32));

        jTextField9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField9.setForeground(new java.awt.Color(7, 138, 68));
        jTextField9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField9KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField9KeyReleased(evt);
            }
        });
        jPanel6.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 690, 32));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(7, 138, 68));
        jLabel13.setText("NCC");
        jPanel6.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, 32));

        jButton5.setBackground(new java.awt.Color(7, 138, 68));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Thêm");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 70, 32));

        jButton6.setBackground(new java.awt.Color(7, 138, 68));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Xóa");
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, 70, 32));

        jButton7.setBackground(new java.awt.Color(7, 138, 68));
        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Xuất Excel");
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 460, 110, 32));

        jTable3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTable3.setForeground(new java.awt.Color(7, 138, 68));
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jTable3.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jTable3ComponentShown(evt);
            }
        });
        jScrollPane4.setViewportView(jTable3);

        jPanel6.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, -1, 380));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_package_search_32px.png"))); // NOI18N
        jPanel6.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jPanel7.setMaximumSize(new java.awt.Dimension(810, 500));
        jPanel7.setMinimumSize(new java.awt.Dimension(810, 500));
        jPanel7.setPreferredSize(new java.awt.Dimension(810, 500));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(7, 138, 68));
        jLabel16.setText("Số lượng");
        jPanel7.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, 69, 32));

        jTable2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTable2.setForeground(new java.awt.Color(7, 138, 68));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID sản phẩm", "Tên sản phẩm", "Số lượng", "Giá", "Thành tiền"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jPanel7.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 750, 250));

        jButton8.setBackground(new java.awt.Color(7, 138, 68));
        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Sửa");
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 130, 60, 32));

        jButton9.setBackground(new java.awt.Color(7, 138, 68));
        jButton9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("Xóa");
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 130, 60, 32));

        jButton10.setBackground(new java.awt.Color(7, 138, 68));
        jButton10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("Thêm");
        jButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 130, 70, 32));

        jComboBox1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(7, 138, 68));
        jPanel7.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 230, 32));

        jButton14.setBackground(new java.awt.Color(7, 138, 68));
        jButton14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton14.setForeground(new java.awt.Color(255, 255, 255));
        jButton14.setText("Nhập Hàng");
        jButton14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 110, 32));

        jTextField10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextField10.setForeground(new java.awt.Color(7, 138, 68));
        jPanel7.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, 230, 32));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(7, 138, 68));
        jLabel17.setText("Tên sản phẩm");
        jPanel7.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 100, 32));

        jPanel8.setMaximumSize(new java.awt.Dimension(810, 500));
        jPanel8.setMinimumSize(new java.awt.Dimension(810, 500));
        jPanel8.setPreferredSize(new java.awt.Dimension(810, 500));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(7, 138, 68));
        jLabel20.setText("Số lượng");
        jPanel8.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, 69, 32));

        jTable4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTable4.setForeground(new java.awt.Color(7, 138, 68));
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID sản phẩm", "Tên sản phẩm", "Số lượng", "Giá", "Thành tiền"
            }
        ));
        jTable4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable4MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable4);

        jPanel8.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 750, 250));

        jButton11.setBackground(new java.awt.Color(7, 138, 68));
        jButton11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setText("Sửa");
        jButton11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 130, 60, 32));

        jButton12.setBackground(new java.awt.Color(7, 138, 68));
        jButton12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setText("Xóa");
        jButton12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 130, 60, 32));

        jButton13.setBackground(new java.awt.Color(7, 138, 68));
        jButton13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton13.setForeground(new java.awt.Color(255, 255, 255));
        jButton13.setText("Thêm");
        jButton13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 130, 70, 32));

        jComboBox2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(7, 138, 68));
        jPanel8.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 230, 32));

        jButton15.setBackground(new java.awt.Color(7, 138, 68));
        jButton15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton15.setForeground(new java.awt.Color(255, 255, 255));
        jButton15.setText("Xuất Hàng");
        jButton15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 110, 32));

        jTextField11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField11.setForeground(new java.awt.Color(7, 138, 68));
        jPanel8.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, 230, 32));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(7, 138, 68));
        jLabel21.setText("Tên sản phẩm");
        jPanel8.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 100, 32));

        jTable5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTable5.setForeground(new java.awt.Color(7, 138, 68));
        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Date Import", "Staff"
            }
        ));
        jTable5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable5MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jTable5);

        jTable6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTable6.setForeground(new java.awt.Color(7, 138, 68));
        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ProID", "ProName", "Quantity", "Total"
            }
        ));
        jScrollPane6.setViewportView(jTable6);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jTable7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTable7.setForeground(new java.awt.Color(7, 138, 68));
        jTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Date Import", "Staff"
            }
        ));
        jTable7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable7MouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(jTable7);

        jTable8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTable8.setForeground(new java.awt.Color(7, 138, 68));
        jTable8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ProID", "ProName", "Quantity", "Total"
            }
        ));
        jScrollPane8.setViewportView(jTable8);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel11.setMaximumSize(new java.awt.Dimension(810, 500));
        jPanel11.setMinimumSize(new java.awt.Dimension(810, 500));
        jPanel11.setPreferredSize(new java.awt.Dimension(810, 500));
        jPanel11.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel11MouseDragged(evt);
            }
        });
        jPanel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel11MousePressed(evt);
            }
        });
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(7, 138, 68));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel29.setText("Địa chỉ");
        jPanel11.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 80, 32));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(7, 138, 68));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel30.setText("Ngày sịnh");
        jLabel30.setMaximumSize(new java.awt.Dimension(64, 16));
        jLabel30.setMinimumSize(new java.awt.Dimension(64, 16));
        jPanel11.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 80, 32));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(7, 138, 68));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel31.setText("ID nhân viên");
        jLabel31.setMaximumSize(new java.awt.Dimension(64, 16));
        jLabel31.setMinimumSize(new java.awt.Dimension(64, 16));
        jPanel11.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 120, 32));

        jTextField12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField12.setForeground(new java.awt.Color(7, 138, 68));
        jTextField12.setMaximumSize(new java.awt.Dimension(210, 25));
        jTextField12.setMinimumSize(new java.awt.Dimension(150, 20));
        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });
        jPanel11.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, 150, 32));

        jTextField13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField13.setForeground(new java.awt.Color(7, 138, 68));
        jTextField13.setMaximumSize(new java.awt.Dimension(210, 25));
        jTextField13.setMinimumSize(new java.awt.Dimension(150, 20));
        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });
        jPanel11.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 150, 32));

        jTextField14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField14.setForeground(new java.awt.Color(7, 138, 68));
        jTextField14.setMaximumSize(new java.awt.Dimension(210, 25));
        jTextField14.setMinimumSize(new java.awt.Dimension(150, 20));
        jPanel11.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 150, 32));

        jButton16.setBackground(new java.awt.Color(7, 138, 68));
        jButton16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton16.setForeground(new java.awt.Color(255, 255, 255));
        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_add_user_male_24px.png"))); // NOI18N
        jButton16.setText("THÊM");
        jButton16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 120, 32));

        jButton17.setBackground(new java.awt.Color(7, 138, 68));
        jButton17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton17.setForeground(new java.awt.Color(255, 255, 255));
        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_writer_male_24px.png"))); // NOI18N
        jButton17.setText("SỬA");
        jButton17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, 120, 32));

        jButton18.setBackground(new java.awt.Color(7, 138, 68));
        jButton18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton18.setForeground(new java.awt.Color(255, 255, 255));
        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_delete_user_male_24px.png"))); // NOI18N
        jButton18.setText("XÓA");
        jButton18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 120, 120, 32));

        jTable9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTable9.setForeground(new java.awt.Color(7, 138, 68));
        jTable9.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tài khoản", "Mật khẩu", "Id nhân viên", "Title 4", "Title 5", "Title 6"
            }
        ));
        jTable9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable9.setMaximumSize(new java.awt.Dimension(225, 0));
        jTable9.setMinimumSize(new java.awt.Dimension(225, 0));
        jTable9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable9MouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(jTable9);
        if (jTable9.getColumnModel().getColumnCount() > 0) {
            jTable9.getColumnModel().getColumn(0).setHeaderValue("Tài khoản");
            jTable9.getColumnModel().getColumn(1).setHeaderValue("Mật khẩu");
            jTable9.getColumnModel().getColumn(2).setHeaderValue("Id nhân viên");
            jTable9.getColumnModel().getColumn(3).setHeaderValue("Title 4");
            jTable9.getColumnModel().getColumn(4).setHeaderValue("Title 5");
            jTable9.getColumnModel().getColumn(5).setHeaderValue("Title 6");
        }

        jPanel11.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 740, 270));

        jTextField15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField15.setForeground(new java.awt.Color(7, 138, 68));
        jTextField15.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField15KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField15KeyReleased(evt);
            }
        });
        jPanel11.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 700, 32));

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_find_user_male_30px.png"))); // NOI18N
        jPanel11.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 30, 30));

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(7, 138, 68));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel33.setText("Họ tên nhân viên");
        jLabel33.setMaximumSize(new java.awt.Dimension(64, 16));
        jLabel33.setMinimumSize(new java.awt.Dimension(64, 16));
        jPanel11.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 120, 32));

        jTextField16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField16.setForeground(new java.awt.Color(7, 138, 68));
        jTextField16.setMaximumSize(new java.awt.Dimension(210, 25));
        jTextField16.setMinimumSize(new java.awt.Dimension(150, 20));
        jTextField16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField16ActionPerformed(evt);
            }
        });
        jPanel11.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 150, 32));

        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(7, 138, 68));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel34.setText("SĐT");
        jLabel34.setMaximumSize(new java.awt.Dimension(64, 16));
        jLabel34.setMinimumSize(new java.awt.Dimension(64, 16));
        jPanel11.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, 60, 32));

        jTextField17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField17.setForeground(new java.awt.Color(7, 138, 68));
        jTextField17.setMaximumSize(new java.awt.Dimension(210, 25));
        jTextField17.setMinimumSize(new java.awt.Dimension(150, 20));
        jTextField17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField17ActionPerformed(evt);
            }
        });
        jPanel11.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 40, 150, 32));

        jTextField18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField18.setForeground(new java.awt.Color(7, 138, 68));
        jTextField18.setMaximumSize(new java.awt.Dimension(210, 25));
        jTextField18.setMinimumSize(new java.awt.Dimension(150, 20));
        jTextField18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField18ActionPerformed(evt);
            }
        });
        jPanel11.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 80, 150, 32));

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(7, 138, 68));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel35.setText("Chức vụ");
        jLabel35.setMaximumSize(new java.awt.Dimension(64, 16));
        jLabel35.setMinimumSize(new java.awt.Dimension(64, 16));
        jPanel11.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, 60, 32));

        jPanel13.setMaximumSize(new java.awt.Dimension(810, 500));
        jPanel13.setMinimumSize(new java.awt.Dimension(810, 500));
        jPanel13.setPreferredSize(new java.awt.Dimension(810, 500));
        jPanel13.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel13MouseDragged(evt);
            }
        });
        jPanel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel13MousePressed(evt);
            }
        });
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel38.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(7, 138, 68));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel38.setText("Tên nhà cung cấp");
        jLabel38.setMaximumSize(new java.awt.Dimension(64, 16));
        jLabel38.setMinimumSize(new java.awt.Dimension(64, 16));
        jPanel13.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 140, 32));

        jTextField21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField21.setForeground(new java.awt.Color(7, 138, 68));
        jTextField21.setMaximumSize(new java.awt.Dimension(210, 25));
        jTextField21.setMinimumSize(new java.awt.Dimension(150, 20));
        jPanel13.add(jTextField21, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 260, 32));

        jButton19.setBackground(new java.awt.Color(7, 138, 68));
        jButton19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton19.setForeground(new java.awt.Color(255, 255, 255));
        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_add_user_male_24px.png"))); // NOI18N
        jButton19.setText("THÊM");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanel13.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, 120, 32));

        jButton21.setBackground(new java.awt.Color(7, 138, 68));
        jButton21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton21.setForeground(new java.awt.Color(255, 255, 255));
        jButton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_delete_user_male_24px.png"))); // NOI18N
        jButton21.setText("XÓA");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jPanel13.add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 160, 120, 32));

        jTable10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTable10.setForeground(new java.awt.Color(7, 138, 68));
        jTable10.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1"
            }
        ));
        jTable10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable10.setMaximumSize(new java.awt.Dimension(225, 0));
        jTable10.setMinimumSize(new java.awt.Dimension(225, 0));
        jTable10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable10MouseClicked(evt);
            }
        });
        jScrollPane10.setViewportView(jTable10);

        jPanel13.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 760, 270));

        jTabbedPane1.setForeground(new java.awt.Color(7, 138, 68));

        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(7, 138, 68));
        jLabel36.setText("jLabel36");
        jLabel36.setPreferredSize(new java.awt.Dimension(180, 32));

        jTextField20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField20.setForeground(new java.awt.Color(7, 138, 68));
        jTextField20.setMaximumSize(new java.awt.Dimension(180, 32));
        jTextField20.setMinimumSize(new java.awt.Dimension(180, 32));
        jTextField20.setPreferredSize(new java.awt.Dimension(180, 32));

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(7, 138, 68));
        jLabel37.setText("Tài khản");
        jLabel37.setMaximumSize(new java.awt.Dimension(180, 32));
        jLabel37.setMinimumSize(new java.awt.Dimension(180, 32));
        jLabel37.setPreferredSize(new java.awt.Dimension(180, 32));

        jTextField22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField22.setForeground(new java.awt.Color(7, 138, 68));
        jTextField22.setMaximumSize(new java.awt.Dimension(180, 32));
        jTextField22.setMinimumSize(new java.awt.Dimension(180, 32));
        jTextField22.setPreferredSize(new java.awt.Dimension(180, 32));

        jLabel39.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(7, 138, 68));
        jLabel39.setText("Mật khẩu hiện tại");

        jLabel40.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(7, 138, 68));
        jLabel40.setText("Mật khẩu mới");

        jLabel41.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(7, 138, 68));
        jLabel41.setText("Xác nhận mật khẩu");

        jButton20.setBackground(new java.awt.Color(7, 138, 68));
        jButton20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton20.setForeground(new java.awt.Color(255, 255, 255));
        jButton20.setText("Xác nhận");
        jButton20.setMaximumSize(new java.awt.Dimension(100, 32));
        jButton20.setMinimumSize(new java.awt.Dimension(100, 32));
        jButton20.setPreferredSize(new java.awt.Dimension(100, 32));
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPasswordField1)))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(318, 318, 318)
                        .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(281, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(146, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Đổi mật khẩu", jPanel16);

        jLabel42.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(7, 138, 68));
        jLabel42.setText("Họ và tên");
        jLabel42.setMaximumSize(new java.awt.Dimension(100, 32));
        jLabel42.setMinimumSize(new java.awt.Dimension(100, 32));
        jLabel42.setPreferredSize(new java.awt.Dimension(100, 32));

        jLabel43.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(7, 138, 68));
        jLabel43.setText("Ngày sinh");
        jLabel43.setMaximumSize(new java.awt.Dimension(100, 32));
        jLabel43.setMinimumSize(new java.awt.Dimension(100, 32));
        jLabel43.setPreferredSize(new java.awt.Dimension(100, 32));

        jLabel44.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(7, 138, 68));
        jLabel44.setText("Địa chỉ");
        jLabel44.setMaximumSize(new java.awt.Dimension(100, 32));
        jLabel44.setMinimumSize(new java.awt.Dimension(100, 32));
        jLabel44.setPreferredSize(new java.awt.Dimension(100, 32));

        jLabel45.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(7, 138, 68));
        jLabel45.setText("Số điện thoại");
        jLabel45.setMaximumSize(new java.awt.Dimension(100, 32));
        jLabel45.setMinimumSize(new java.awt.Dimension(100, 32));
        jLabel45.setPreferredSize(new java.awt.Dimension(100, 32));

        jTextField23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField23.setForeground(new java.awt.Color(7, 138, 68));
        jTextField23.setMaximumSize(new java.awt.Dimension(200, 32));
        jTextField23.setMinimumSize(new java.awt.Dimension(200, 32));
        jTextField23.setPreferredSize(new java.awt.Dimension(200, 32));

        jTextField24.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField24.setForeground(new java.awt.Color(7, 138, 68));
        jTextField24.setMaximumSize(new java.awt.Dimension(200, 32));
        jTextField24.setMinimumSize(new java.awt.Dimension(200, 32));
        jTextField24.setPreferredSize(new java.awt.Dimension(200, 32));

        jTextField25.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField25.setForeground(new java.awt.Color(7, 138, 68));
        jTextField25.setMaximumSize(new java.awt.Dimension(200, 32));
        jTextField25.setMinimumSize(new java.awt.Dimension(200, 32));
        jTextField25.setPreferredSize(new java.awt.Dimension(200, 32));

        jTextField26.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField26.setForeground(new java.awt.Color(7, 138, 68));
        jTextField26.setMaximumSize(new java.awt.Dimension(200, 32));
        jTextField26.setMinimumSize(new java.awt.Dimension(200, 32));
        jTextField26.setPreferredSize(new java.awt.Dimension(200, 32));

        jButton22.setBackground(new java.awt.Color(7, 138, 68));
        jButton22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton22.setForeground(new java.awt.Color(255, 255, 255));
        jButton22.setText("Xác nhận");
        jButton22.setMaximumSize(new java.awt.Dimension(100, 32));
        jButton22.setMinimumSize(new java.awt.Dimension(100, 32));
        jButton22.setPreferredSize(new java.awt.Dimension(100, 32));
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jLabel48.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(7, 138, 68));
        jLabel48.setText("ID");

        jLabel49.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(7, 138, 68));
        jLabel49.setText("jLabel49");

        jLabel50.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(7, 138, 68));
        jLabel50.setText("Chức vụ");

        jLabel51.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(7, 138, 68));
        jLabel51.setText("jLabel51");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel48, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(332, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 1, Short.MAX_VALUE))
                    .addComponent(jLabel51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        jTabbedPane1.addTab("Thông tiên cá nhân", jPanel17);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(6, 6, 6)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(6, 6, 6)))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 810, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        setState(javax.swing.JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "Bạn có muốn thoát ứng dụng?", "Thoát", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel4MouseClicked
    int X, Y;
    private void jPanel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseDragged
        // TODO add your handling code here:
        setLocation(evt.getXOnScreen() - X, evt.getYOnScreen() - Y);
    }//GEN-LAST:event_jPanel3MouseDragged

    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed
        // TODO add your handling code here:
        X = evt.getX();
        Y = evt.getY();
    }//GEN-LAST:event_jPanel3MousePressed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed
    public void LoadDataAc() {
        Connection con = DBConnect.getJDBCConnection();
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM account;");
            list.clear();
            while (rs.next()) {
                String name = rs.getString(1);
                String pass = rs.getString(2);
                String id = rs.getString(3);
                Account sv = new Account(name, pass, id);
                list.add(sv);
            }
            con.close();
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
            for (Account o : list) {
                model.addRow(new Object[]{o.getUsename(), o.getPassword(), o.getIdnv()});
            }
            model.setColumnIdentifiers(new Object[]{
                "Tài khoản", "Mật Khẩu", "ID nhân viên"});
        } catch (SQLException ex) {
            Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void SearchAc() {
        Connection con = DBConnect.getJDBCConnection();
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM account where idnv like N'%" + jTextField4.getText() + "%' "
                    + "or usename like  N'%" + jTextField4.getText()+ "%';");
            list.clear();
            while (rs.next()) {
                String name = rs.getString(1);
                String pass = rs.getString(2);
                String id = rs.getString(3);
                Account sv = new Account(name, pass, id);
                list.add(sv);
            }
            con.close();
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
            for (Account o : list) {
                model.addRow(new Object[]{o.getUsename(), o.getPassword(), o.getIdnv()});
            }
            model.setColumnIdentifiers(new Object[]{
                "Tài khoản", "Mật Khẩu", "ID nhân viên"});
        } catch (SQLException ex) {
            Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void ShowCBP() {
        ArrayList<String> list2 = new ArrayList<>();
        Connection con = DBConnect.getJDBCConnection();
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM ncc;");
            list2.clear();
            while (rs.next()) {
                String namencc = rs.getString(1);
                list2.add(namencc);
            }
            con.close();
            for (String o : list2) {
                Cb.addItem(o);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Thông tin chưa chính xác!!!");
        }
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "Bạn có muốn thêm tài khoản?", "Thêm tài khoản", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            if (jTextField1.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Mời nhập lại thông tin!!!");
                return;
            }
            Connection con = DBConnect.getJDBCConnection();
            try {
                PreparedStatement st = con.prepareStatement("INSERT INTO account VALUES (?, ?, ?);");
                st.setString(1, jTextField1.getText());
                st.setString(2, jTextField2.getText());
                st.setInt(3, Integer.parseInt(jTextField3.getText()));
                st.executeUpdate();
                JOptionPane.showMessageDialog(this, "Thêm thành công!");
                con.close();
                LoadDataAc();
            } catch (SQLException ex) {
                Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "ID nhân viên chưa có!!!");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "Bạn có muốn sửa thông tin tài khoản?", "Sửa thông tin tài khoản", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            if (jTextField1.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Mời nhập lại thông tin!!!");
                return;
            }
            Connection con = DBConnect.getJDBCConnection();
            try {
                PreparedStatement st = con.prepareStatement("UPDATE account SET password=?,idnv=? WHERE usename=?;");
                st.setString(3, jTextField1.getText());
                st.setString(1, jTextField2.getText());
                st.setInt(2, Integer.parseInt(jTextField3.getText()));
                st.executeUpdate();
                JOptionPane.showMessageDialog(this, "Sửa thành công!");
                con.close();
                LoadDataAc();

            } catch (SQLException ex) {
                Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "Thông tin chưa chính xác!!!");
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "Bạn có muốn xóa tài khoản?", "Xóa tài khoản", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            if (jTextField1.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Mời nhập lại thông tin!!!");
                return;
            }
            Connection con = DBConnect.getJDBCConnection();
            try {
                PreparedStatement st = con.prepareStatement("DELETE FROM account WHERE usename = ?;");
                st.setString(1, jTextField1.getText());
                st.executeUpdate();
                JOptionPane.showMessageDialog(this, "Xóa thành công!");
                con.close();
                LoadDataAc();
            } catch (SQLException ex) {
                Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "Thông tin chưa chính xác!!!");
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int index = jTable1.getSelectedRow();
        TableModel model = jTable1.getModel();
        jTextField1.setText(model.getValueAt(index, 0).toString());
        jTextField2.setText(model.getValueAt(index, 1).toString());
        jTextField3.setText(model.getValueAt(index, 2).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTextField4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyPressed

    }//GEN-LAST:event_jTextField4KeyPressed

    private void jTextField4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyReleased
        // TODO add your handling code here:
        if (jTextField4.getText().equals("")) {
            LoadDataAc();
        } else {
            SearchAc();
        }
    }//GEN-LAST:event_jTextField4KeyReleased

    private void jPanel5MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseDragged
        // TODO add your handling code here:
        setLocation(evt.getXOnScreen() - X, evt.getYOnScreen() - Y);
    }//GEN-LAST:event_jPanel5MouseDragged

    private void jPanel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MousePressed
        // TODO add your handling code here:
        X = evt.getX();
        Y = evt.getY();
    }//GEN-LAST:event_jPanel5MousePressed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        LoadDataLA();
        LoadDataP();
        LoadDataAc();
        LoadDataLE();
        LoadDataU();
        LoadDataN();
        LoadDataT();
    }//GEN-LAST:event_formComponentShown

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void CbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CbActionPerformed
    ArrayList<Products> list1 = new ArrayList<>();

    public void LoadDataP() {
        Connection con = DBConnect.getJDBCConnection();
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM product;");
            list1.clear();
            while (rs.next()) {
                String id = rs.getString(1);
                String name = rs.getString(2);
                String sl = rs.getString(3);
                String gia = rs.getString(4);
                String ncc = rs.getString(5);
                Products pr = new Products(name, ncc, id, sl, gia);
                list1.add(pr);
            }
            con.close();
            DefaultTableModel model = (DefaultTableModel) jTable3.getModel();
            model.setRowCount(0);
            for (Products o : list1) {
                model.addRow(new Object[]{o.getIdsp(), o.getTensp(), o.getSlsp(), o.getGiasp(), o.getNccsp()});
            }
            model.setColumnIdentifiers(new Object[]{
                "ID sản phẩm", "Tên", "Số lượng", "Giá", "NCC"});
        } catch (SQLException ex) {
            Logger.getLogger(Products.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void SearchP() {
        Connection con = DBConnect.getJDBCConnection();
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM product where id like N'%" + jTextField9.getText() + "%' "
                    + "or proname like  N'%" + jTextField9.getText() + "%' or sl like N'%" + jTextField9.getText()
                    + "%' or gia like N'%" + jTextField9.getText() + "%' or ncc like N'%" + jTextField9.getText() + "%';");
            list1.clear();
            while (rs.next()) {
                String id = rs.getString(1);
                String name = rs.getString(2);
                String sl = rs.getString(3);
                String gia = rs.getString(4);
                String ncc = rs.getString(5);
                Products pr = new Products(name, ncc, id, sl, gia);
                list1.add(pr);
            }
            con.close();
            DefaultTableModel model = (DefaultTableModel) jTable3.getModel();
            model.setRowCount(0);
            for (Products o : list1) {
                model.addRow(new Object[]{o.getIdsp(), o.getTensp(), o.getSlsp(), o.getGiasp(), o.getNccsp()});
            }
            model.setColumnIdentifiers(new Object[]{
                "ID sản phẩm", "Tên", "Số lượng", "Giá", "NCC"});
        } catch (SQLException ex) {
            Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "Bạn có muốn sửa thông tin sản phẩm?", "Sửa thông tin sản phẩm", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            if (jTextField6.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Mời nhập lại thông tin!!!");
                return;
            }
            Connection con = DBConnect.getJDBCConnection();
            try {
                PreparedStatement st = con.prepareStatement("UPDATE product SET proname=?,sl=?,gia=?,ncc=? WHERE id=?;");
                st.setString(1, jTextField6.getText());
                st.setInt(5, Integer.parseInt(jTextField5.getText()));
                st.setInt(2, Integer.parseInt(jTextField7.getText()));
                st.setInt(3, Integer.parseInt(jTextField8.getText()));
                st.setString(4, (String) Cb.getSelectedItem());
                st.executeUpdate();
                JOptionPane.showMessageDialog(this, "Sửa thành công!");
                con.close();
                LoadDataP();

            } catch (SQLException ex) {
                Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "Thông tin chưa chính xác!!!");
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField9KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9KeyPressed

    }//GEN-LAST:event_jTextField9KeyPressed

    private void jTextField9KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9KeyReleased
        // TODO add your handling code here:
        if (jTextField6.getText().equals("")) {
            LoadDataP();
        } else {
            SearchP();
        }
    }//GEN-LAST:event_jTextField9KeyReleased

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "Bạn có muốn thêm sản phẩm?", "Thêm sản phẩm", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            if (jTextField5.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Mời nhập lại thông tin!!!");
                return;
            }
            Connection con = DBConnect.getJDBCConnection();
            try {
                PreparedStatement st = con.prepareStatement("INSERT INTO product VALUES (?, ?, ?, ?, ?);");
                st.setString(2, jTextField6.getText());
                st.setInt(1, Integer.parseInt(jTextField5.getText()));
                st.setInt(3, Integer.parseInt(jTextField7.getText()));
                st.setInt(4, Integer.parseInt(jTextField8.getText()));
                st.setString(5, (String) Cb.getSelectedItem());
                st.executeUpdate();
                JOptionPane.showMessageDialog(this, "Thêm thành công!");
                con.close();
                LoadDataP();
            } catch (SQLException ex) {
                Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "Sai thông tin!!!");
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "Bạn có muốn xóa sản phẩm?", "Xóa sản phẩm", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            if (jTextField5.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Mời nhập lại thông tin!!!");
                return;
            }
            Connection con = DBConnect.getJDBCConnection();
            try {
                PreparedStatement st = con.prepareStatement("DELETE FROM product WHERE id = ?;");
                st.setInt(1, Integer.parseInt(jTextField5.getText()));
                st.executeUpdate();
                JOptionPane.showMessageDialog(this, "Xóa thành công!");
                con.close();
                LoadDataP();
            } catch (SQLException ex) {
                Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "Thông tin chưa chính xác!!!");
            }
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here
        try {
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet spreadsheet = workbook.createSheet("Sản phẩm");

            XSSFRow row = null;
            Cell cell = null;

            row = spreadsheet.createRow((short) 2);
            row.setHeight((short) 500);
            cell = row.createCell(0, CellType.STRING);
            cell.setCellValue("DANH SÁCH SẢN PHẨM");

            row = spreadsheet.createRow((short) 3);
            row.setHeight((short) 500);
            cell = row.createCell(0, CellType.STRING);
            cell.setCellValue("STT");
            cell = row.createCell(1, CellType.STRING);
            cell.setCellValue("ID sản phẩm");
            cell = row.createCell(2, CellType.STRING);
            cell.setCellValue("Tên sản phẩm");
            cell = row.createCell(3, CellType.STRING);
            cell.setCellValue("Số lượng");
            cell = row.createCell(4, CellType.STRING);
            cell.setCellValue("Giá");
            cell = row.createCell(5, CellType.STRING);
            cell.setCellValue("NCC");

            for (int i = 0; i < list1.size(); i++) {
                Products p = list1.get(i);
                row = spreadsheet.createRow((short) 4 + i);
                row.setHeight((short) 400);
                row.createCell(0).setCellValue(i + 1);
                row.createCell(1).setCellValue(p.getIdsp());
                row.createCell(2).setCellValue(p.getTensp());
                row.createCell(3).setCellValue(p.getSlsp());
                row.createCell(4).setCellValue(p.getGiasp());
                row.createCell(5).setCellValue(p.getNccsp());
            }

            FileOutputStream out = new FileOutputStream(new File("D:/sp.xlsx"));
            workbook.write(out);
            out.close();
            JOptionPane.showMessageDialog(this, "Xuất Excel thành công!!!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton7ActionPerformed
    void load() {
        jLabel27.setBackground(new Color(7, 204, 68));
        try {
            jPanel4.removeAll();
            jPanel4.repaint();
            jPanel4.revalidate();
            //adding a pannel 
            jPanel4.add(jPanel5);
            jPanel4.repaint();
            jPanel4.revalidate();
        } catch (Exception e) {

        }
    }
    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        jLabel1.setBackground(new Color(7, 204, 68));
        jLabel15.setBackground(new Color(7, 138, 68));
        jLabel27.setBackground(new Color(7, 138, 68));
        jLabel7.setBackground(new Color(7, 138, 68));
        jLabel23.setBackground(new Color(7, 138, 68));
        jLabel25.setBackground(new Color(7, 138, 68));
        jLabel26.setBackground(new Color(7, 138, 68));
        jLabel22.setBackground(new Color(7, 138, 68));
        jLabel46.setBackground(new Color(7, 138, 68));
        try {
            //clearing
            jPanel4.removeAll();
            jPanel4.repaint();
            jPanel4.revalidate();
            //adding a pannel 
            jPanel4.add(jPanel13);
            jPanel4.repaint();
            jPanel4.revalidate();
        } catch (Exception e) {

        }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        jLabel1.setBackground(new Color(7, 138, 68));
        jLabel15.setBackground(new Color(7, 138, 68));
        jLabel27.setBackground(new Color(7, 138, 68));
        jLabel7.setBackground(new Color(7, 204, 68));
        jLabel23.setBackground(new Color(7, 138, 68));
        jLabel25.setBackground(new Color(7, 138, 68));
        jLabel26.setBackground(new Color(7, 138, 68));
        jLabel22.setBackground(new Color(7, 138, 68));
        jLabel46.setBackground(new Color(7, 138, 68));
        try {
            //clearing
            jPanel4.removeAll();
            jPanel4.repaint();
            jPanel4.revalidate();
            //adding a pannel 
            jPanel4.add(jPanel11);
            jPanel4.repaint();
            jPanel4.revalidate();
        } catch (Exception e) {

        }
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        // TODO add your handling code here:
        int index = jTable3.getSelectedRow();
        TableModel model = jTable3.getModel();
        jTextField5.setText(model.getValueAt(index, 0).toString());
        jTextField6.setText(model.getValueAt(index, 1).toString());
        jTextField7.setText(model.getValueAt(index, 2).toString());
        jTextField8.setText(model.getValueAt(index, 3).toString());
        Cb.setSelectedItem(model.getValueAt(index, 4).toString());
    }//GEN-LAST:event_jTable3MouseClicked

    private void jTable3ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTable3ComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable3ComponentShown

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        // TODO add your handling code here:
        LoadDataLE();
        jLabel1.setBackground(new Color(7, 138, 68));
        jLabel15.setBackground(new Color(7, 204, 68));
        jLabel27.setBackground(new Color(7, 138, 68));
        jLabel7.setBackground(new Color(7, 138, 68));
        jLabel23.setBackground(new Color(7, 138, 68));
        jLabel25.setBackground(new Color(7, 138, 68));
        jLabel26.setBackground(new Color(7, 138, 68));
        jLabel22.setBackground(new Color(7, 138, 68));
        jLabel46.setBackground(new Color(7, 138, 68));
        try {
            //clearing
            jPanel4.removeAll();
            jPanel4.repaint();
            jPanel4.revalidate();
            //adding a pannel 
            jPanel4.add(jPanel10);
            jPanel4.repaint();
            jPanel4.revalidate();
        } catch (Exception e) {

        }

    }//GEN-LAST:event_jLabel15MouseClicked

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
        int index = jTable2.getSelectedRow();
        TableModel model = jTable2.getModel();
        jTextField10.setText(model.getValueAt(index, 2).toString());
        jComboBox1.setSelectedItem(model.getValueAt(index, 1).toString());
    }//GEN-LAST:event_jTable2MouseClicked
    ArrayList<Add> list3 = new ArrayList<>();
    ArrayList<Products> list4 = new ArrayList<>();

    public void ShowCBA() {
        Connection con = DBConnect.getJDBCConnection();
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM product;");
            list4.clear();
            while (rs.next()) {
                String idp = rs.getString(1);
                String name = rs.getString(2);
                String slp = rs.getString(3);
                String giap = rs.getString(4);
                String ncc = rs.getString(5);
                Products pr = new Products(name, ncc, idp, slp, giap);
                list4.add(pr);
            }
            for (Products o : list4) {
                jComboBox1.addItem(o.tensp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Thông tin chưa chính xác!!!");
        }
    }

    public void LoadDataA() {
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        model.setRowCount(0);
        for (Add o : list3) {
            model.addRow(new Object[]{o.getId(), o.getTen(), o.getSl(), o.getGia(), o.getThanhtien()});
        }
        model.setColumnIdentifiers(new Object[]{
            "ID sản phẩm", "Tên sản phẩm", "Số lượng", "Giá", "Thành tiền"});
    }
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        for (Add h : list3) {
            if (h.getTen() == jComboBox1.getSelectedItem()) {
                h.sl = jTextField10.getText();
            }
        }
        LoadDataA();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        int index = jTable2.getSelectedRow();
        list3.remove(index);
        LoadDataA();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        model.setRowCount(0);
        for (Products o : list4) {
            mo:
            {
                if (o.getTensp() == jComboBox1.getSelectedItem()) {
                    for (Add h : list3) {
                        if (h.getTen() == jComboBox1.getSelectedItem()) {
                            h.sl = String.valueOf(Integer.parseInt(jTextField10.getText()) + Integer.parseInt(h.sl));
                            break mo;
                        }
                    }
                    int d = Integer.parseInt(jTextField10.getText()) * Integer.parseInt(o.getGiasp());
                    Add a = new Add(o.getIdsp(), o.getTensp(), jTextField10.getText(), o.getGiasp(), String.valueOf(d));
                    list3.add(a);
                }
            }
        }
        LoadDataA();
    }//GEN-LAST:event_jButton10ActionPerformed
    public int layid() {
        int d = 0;
        Connection con = DBConnect.getJDBCConnection();
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM import;");
            while (rs.next()) {
                d++;
            }
            return d + 1;
        } catch (SQLException ex) {
            Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Thông tin chưa chính xác!!!");
            return 0;
        }
    }

    private void tao(int n) {
        Connection con = DBConnect.getJDBCConnection();
        try {
            DateNow k = new DateNow();
            PreparedStatement st = con.prepareStatement("INSERT INTO import VALUES (?,?,?);");
            st.setInt(1, n);
            st.setString(2, k.sdf.format(k.date));
            st.setString(3, jLabel18.getText());
            st.executeUpdate();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Thông tin chưa chính xác!!!");
        }
    }

    private void tao1(int n) {
        Connection con = DBConnect.getJDBCConnection();
        try {
            PreparedStatement st = con.prepareStatement("INSERT INTO nhaphang VALUES (?,?,?,?,?);");
            for (Add list5 : list3) {
                st.setInt(1, n);
                st.setInt(2, Integer.parseInt(list5.getId()));
                st.setString(3, list5.getTen());
                st.setInt(4, Integer.parseInt(list5.getSl()));
                st.setInt(5, Integer.parseInt(list5.getThanhtien()));
                st.executeUpdate();
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Thông tin chưa chính xác!!!");
        }
    }
    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "Bạn có muốn nhập hàng?", "Nhập hàng", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            int n = layid();
            Connection con = DBConnect.getJDBCConnection();
            tao(n);
            tao1(n);
            try {
                PreparedStatement st = con.prepareStatement("UPDATE product SET sl=sl + ? WHERE id=?;");
                for (Add list5 : list3) {
                    st.setInt(1, Integer.parseInt(list5.getSl()));
                    st.setInt(2, Integer.parseInt(list5.getId()));
                    st.executeUpdate();
                }
                JOptionPane.showMessageDialog(this, "Đã nhập hàng thành công!");
                con.close();
                list3.clear();
                LoadDataA();
            } catch (SQLException ex) {
                Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "Thông tin chưa chính xác!!!");
            }
        }
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jTable4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable4MouseClicked
        // TODO add your handling code here:
        int index = jTable4.getSelectedRow();
        TableModel model = jTable4.getModel();
        jTextField11.setText(model.getValueAt(index, 2).toString());
        jComboBox2.setSelectedItem(model.getValueAt(index, 1).toString());
    }//GEN-LAST:event_jTable4MouseClicked

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        for (Add h : list6) {
            if (h.getTen() == jComboBox2.getSelectedItem()) {
                h.sl = jTextField11.getText();
            }
        }
        LoadDataE();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        int index = jTable4.getSelectedRow();
        list6.remove(index);
        LoadDataE();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable4.getModel();
        model.setRowCount(0);
        for (Products o : list7) {
            mo:
            {
                if (o.getTensp() == jComboBox2.getSelectedItem()) {
                    for (Add h : list6) {
                        if (h.getTen() == jComboBox2.getSelectedItem()) {
                            h.sl = String.valueOf(Integer.parseInt(jTextField11.getText()) + Integer.parseInt(h.sl));
                            break mo;
                        }
                    }
                    int d = Integer.parseInt(jTextField11.getText()) * Integer.parseInt(o.getGiasp());
                    Add a = new Add(o.getIdsp(), o.getTensp(), jTextField11.getText(), o.getGiasp(), String.valueOf(d));
                    list6.add(a);
                }
            }
        }
        LoadDataE();
    }//GEN-LAST:event_jButton13ActionPerformed
    ArrayList<Add> list6 = new ArrayList<>();
    ArrayList<Products> list7 = new ArrayList<>();

    public void ShowCBE() {
        Connection con = DBConnect.getJDBCConnection();
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM product;");
            list7.clear();
            while (rs.next()) {
                String idp = rs.getString(1);
                String name = rs.getString(2);
                String slp = rs.getString(3);
                String giap = rs.getString(4);
                String ncc = rs.getString(5);
                Products pr = new Products(name, ncc, idp, slp, giap);
                list7.add(pr);
            }
            for (Products o : list7) {
                jComboBox2.addItem(o.tensp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Thông tin chưa chính xác!!!");
        }
    }

    public void LoadDataE() {
        DefaultTableModel model = (DefaultTableModel) jTable4.getModel();
        model.setRowCount(0);
        for (Add o : list6) {
            model.addRow(new Object[]{o.getId(), o.getTen(), o.getSl(), o.getGia(), o.getThanhtien()});
        }
        model.setColumnIdentifiers(new Object[]{
            "ID sản phẩm", "Tên sản phẩm", "Số lượng", "Giá", "Thành tiền"});
    }

    private void tao2(int n) {
        Connection con = DBConnect.getJDBCConnection();
        try {
            DateNow k = new DateNow();
            PreparedStatement st = con.prepareStatement("INSERT INTO export VALUES (?,?,?);");
            st.setInt(1, n);
            st.setString(2, k.sdf.format(k.date));
            st.setString(3, jLabel18.getText());
            st.executeUpdate();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Y!!!");
        }
    }

    private void tao3(int n) {
        Connection con = DBConnect.getJDBCConnection();
        try {
            PreparedStatement st = con.prepareStatement("INSERT INTO xuathang VALUES (?,?,?,?,?);");
            for (Add list8 : list6) {
                st.setInt(1, n);
                st.setInt(2, Integer.parseInt(list8.getId()));
                st.setString(3, list8.getTen());
                st.setInt(4, Integer.parseInt(list8.getSl()));
                st.setInt(5, Integer.parseInt(list8.getThanhtien()));
                st.executeUpdate();
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "X!!");
        }
    }

    public int layid1() {
        int d = 0;
        Connection con = DBConnect.getJDBCConnection();
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM export;");
            while (rs.next()) {
                d++;
            }
            return d + 1;
        } catch (SQLException ex) {
            Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Thông tin chưa chính xác!!!");
            return 0;
        }
    }
    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "Bạn có muốn xuất hàng?", "Xuất hàng", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            int r = list6.size();
            for (Add s : list6) {
                for (Products f : list1) {
                    if (s.getId().equals(f.getIdsp())) {
                        if (Integer.parseInt(f.getSlsp()) - Integer.parseInt(s.getSl()) >= 0) {
                            r--;
                        }
                    }
                }
            }
            if (r == 0) {
                int n = layid1();
                Connection con = DBConnect.getJDBCConnection();
                tao2(n);
                tao3(n);
                try {
                    PreparedStatement st = con.prepareStatement("UPDATE product SET sl=sl - ? WHERE id=?;");
                    for (Add list8 : list6) {
                        st.setInt(1, Integer.parseInt(list8.getSl()));
                        st.setInt(2, Integer.parseInt(list8.getId()));
                        st.executeUpdate();
                    }
                    JOptionPane.showMessageDialog(this, "Đã xuất hàng thành công!");
                    con.close();
                    list6.clear();
                    LoadDataE();
                } catch (SQLException ex) {
                    Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(this, "Thông tin chưa chính xác!!!");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Không đủ số lượng để xuất");
            }
        }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        // TODO add your handling code here:
        jLabel1.setBackground(new Color(7, 138, 68));
        jLabel15.setBackground(new Color(7, 138, 68));
        jLabel27.setBackground(new Color(7, 138, 68));
        jLabel7.setBackground(new Color(7, 138, 68));
        jLabel23.setBackground(new Color(7, 138, 68));
        jLabel25.setBackground(new Color(7, 138, 68));
        jLabel26.setBackground(new Color(7, 138, 68));
        jLabel22.setBackground(new Color(7, 204, 68));
        jLabel46.setBackground(new Color(7, 138, 68));
        try {
            //clearing
            jPanel4.removeAll();
            jPanel4.repaint();
            jPanel4.revalidate();
            //adding a pannel 
            jPanel4.add(jPanel8);
            jPanel4.repaint();
            jPanel4.revalidate();
        } catch (Exception e) {

        }
    }//GEN-LAST:event_jLabel22MouseClicked

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        // TODO add your handling code here:
        LoadDataLA();
        jLabel1.setBackground(new Color(7, 138, 68));
        jLabel15.setBackground(new Color(7, 138, 68));
        jLabel27.setBackground(new Color(7, 138, 68));
        jLabel7.setBackground(new Color(7, 138, 68));
        jLabel23.setBackground(new Color(7, 204, 68));
        jLabel25.setBackground(new Color(7, 138, 68));
        jLabel26.setBackground(new Color(7, 138, 68));
        jLabel22.setBackground(new Color(7, 138, 68));
        jLabel46.setBackground(new Color(7, 138, 68));
        try {
            //clearing
            jPanel4.removeAll();
            jPanel4.repaint();
            jPanel4.revalidate();
            //adding a pannel 
            jPanel4.add(jPanel9);
            jPanel4.repaint();
            jPanel4.revalidate();
        } catch (Exception e) {

        }
    }//GEN-LAST:event_jLabel23MouseClicked

    private void jLabel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseClicked
        // TODO add your handling code here:
        jLabel1.setBackground(new Color(7, 138, 68));
        jLabel15.setBackground(new Color(7, 138, 68));
        jLabel27.setBackground(new Color(7, 138, 68));
        jLabel7.setBackground(new Color(7, 138, 68));
        jLabel23.setBackground(new Color(7, 138, 68));
        jLabel25.setBackground(new Color(7, 204, 68));
        jLabel26.setBackground(new Color(7, 138, 68));
        jLabel22.setBackground(new Color(7, 138, 68));
        jLabel46.setBackground(new Color(7, 138, 68));
        try {
            //clearing
            jPanel4.removeAll();
            jPanel4.repaint();
            jPanel4.revalidate();
            //adding a pannel 
            jPanel4.add(jPanel7);
            jPanel4.repaint();
            jPanel4.revalidate();
        } catch (Exception e) {

        }
    }//GEN-LAST:event_jLabel25MouseClicked

    private void jLabel26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseClicked
        // TODO add your handling code here:
        LoadDataP();
        jLabel1.setBackground(new Color(7, 138, 68));
        jLabel15.setBackground(new Color(7, 138, 68));
        jLabel27.setBackground(new Color(7, 138, 68));
        jLabel7.setBackground(new Color(7, 138, 68));
        jLabel23.setBackground(new Color(7, 138, 68));
        jLabel25.setBackground(new Color(7, 138, 68));
        jLabel26.setBackground(new Color(7, 204, 68));
        jLabel22.setBackground(new Color(7, 138, 68));
        jLabel46.setBackground(new Color(7, 138, 68));
        try {
            //clearing
            jPanel4.removeAll();
            jPanel4.repaint();
            jPanel4.revalidate();
            //adding a pannel 
            jPanel4.add(jPanel6);
            jPanel4.repaint();
            jPanel4.revalidate();
        } catch (Exception e) {

        }
    }//GEN-LAST:event_jLabel26MouseClicked

    private void jLabel27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseClicked
        // TODO add your handling code here:
        jLabel1.setBackground(new Color(7, 138, 68));
        jLabel15.setBackground(new Color(7, 138, 68));
        jLabel27.setBackground(new Color(7, 204, 68));
        jLabel7.setBackground(new Color(7, 138, 68));
        jLabel23.setBackground(new Color(7, 138, 68));
        jLabel25.setBackground(new Color(7, 138, 68));
        jLabel26.setBackground(new Color(7, 138, 68));
        jLabel22.setBackground(new Color(7, 138, 68));
        jLabel46.setBackground(new Color(7, 138, 68));
        try {
            //clearing
            jPanel4.removeAll();
            jPanel4.repaint();
            jPanel4.revalidate();
            //adding a pannel 
            jPanel4.add(jPanel5);
            jPanel4.repaint();
            jPanel4.revalidate();
        } catch (Exception e) {

        }
    }//GEN-LAST:event_jLabel27MouseClicked

    private void jLabel28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseClicked
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "Bạn có muốn đăng xuất?", "Đăng xuất", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            setVisible(false);
            new DangNhap().setVisible(true);
        }
    }//GEN-LAST:event_jLabel28MouseClicked
    ArrayList<ListN> list9 = new ArrayList<>();
    ArrayList<Add> list10 = new ArrayList<>();

    public void LoadDataLA() {
        Connection con = DBConnect.getJDBCConnection();
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM import;");
            list9.clear();
            while (rs.next()) {
                String ngay, ten;
                int id = rs.getInt(1);
                ngay = rs.getString(2);
                ten = rs.getString(3);
                ListN v = new ListN(id, ngay, ten);
                list9.add(v);
            }
            con.close();
            DefaultTableModel model = (DefaultTableModel) jTable5.getModel();
            model.setRowCount(0);
            for (ListN o : list9) {
                model.addRow(new Object[]{o.getId(), o.getNgaynhap(), o.getNguoinhap()});
            }
            model.setColumnIdentifiers(new Object[]{
                "ID", "Ngày nhập", "Người nhập"});
        } catch (SQLException ex) {
            Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void LoadDataLA1(String a) {
        Connection con = DBConnect.getJDBCConnection();
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM oop.nhaphang WHERE id= " + a + ";");
            list10.clear();
            while (rs.next()) {
                String id, ten, sl, gia, thanhtien;
                id = rs.getString(2);
                ten = rs.getString(3);
                sl = rs.getString(4);
                thanhtien = rs.getString(5);
                Add v = new Add(id, ten, sl, null, thanhtien);
                list10.add(v);
            }
            con.close();
            DefaultTableModel model = (DefaultTableModel) jTable6.getModel();
            model.setRowCount(0);
            for (Add o : list10) {
                model.addRow(new Object[]{o.getId(), o.getTen(), o.getSl(), o.getThanhtien()});
            }
            model.setColumnIdentifiers(new Object[]{
                "ID sản phẩm", "Tên sản phẩm", "Số lượng","Thành tiền"});
        } catch (SQLException ex) {
            Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void jTable5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable5MouseClicked
        // TODO add your handling code here:
        int index = jTable5.getSelectedRow();
        TableModel model = jTable5.getModel();
        LoadDataLA1(model.getValueAt(index, 0).toString());
    }//GEN-LAST:event_jTable5MouseClicked
    ArrayList<ListN> list11 = new ArrayList<>();
    ArrayList<Add> list12 = new ArrayList<>();

    public void LoadDataLE() {
        Connection con = DBConnect.getJDBCConnection();
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM export;");
            list11.clear();
            while (rs.next()) {
                String ngay, ten;
                int id = rs.getInt(1);
                ngay = rs.getString(2);
                ten = rs.getString(3);
                ListN v = new ListN(id, ngay, ten);
                list11.add(v);
            }
            con.close();
            DefaultTableModel model = (DefaultTableModel) jTable7.getModel();
            model.setRowCount(0);
            for (ListN o : list11) {
                model.addRow(new Object[]{o.getId(), o.getNgaynhap(), o.getNguoinhap()});
            }
            model.setColumnIdentifiers(new Object[]{
                "ID", "Ngày nhập", "Người nhập"});
        } catch (SQLException ex) {
            Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void LoadDataLE1(String a) {
        Connection con = DBConnect.getJDBCConnection();
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM oop.xuathang WHERE id= " + a + ";");
            list12.clear();
            while (rs.next()) {
                String id, ten, sl, gia, thanhtien;
                id = rs.getString(2);
                ten = rs.getString(3);
                sl = rs.getString(4);
                thanhtien = rs.getString(5);
                Add v = new Add(id, ten, sl, null, thanhtien);
                list12.add(v);
            }
            con.close();
            DefaultTableModel model = (DefaultTableModel) jTable8.getModel();
            model.setRowCount(0);
            for (Add o : list12) {
                model.addRow(new Object[]{o.getId(), o.getTen(), o.getSl(), o.getThanhtien()});
            }
            model.setColumnIdentifiers(new Object[]{
                "ID sản phẩm", "Tên sản phẩm", "Số lượng", "Thành tiền"});
        } catch (SQLException ex) {
            Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void jTable7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable7MouseClicked
        // TODO add your handling code here:
        int index = jTable7.getSelectedRow();
        TableModel model = jTable7.getModel();
        LoadDataLE1(model.getValueAt(index, 0).toString());
    }//GEN-LAST:event_jTable7MouseClicked
    ArrayList<ListX> listU = new ArrayList<>();

    public void LoadDataU() {
        Connection con = DBConnect.getJDBCConnection();
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM nhanvien;");
            listU.clear();
            while (rs.next()) {
                String name = rs.getString(2);
                String ngaysinh = rs.getString(3);
                String diachi = rs.getString(4);
                String id = rs.getString(1);
                String sdt = rs.getString(5);
                String cv = rs.getString(6);
                ListX sv = new ListX(id, name, diachi, sdt, cv, ngaysinh);
                listU.add(sv);
            }
            con.close();
            DefaultTableModel model = (DefaultTableModel) jTable9.getModel();
            model.setRowCount(0);
            for (ListX o : listU) {
                model.addRow(new Object[]{o.getId(), o.getTen(), o.getNgaysinh(), o.getDiachi(), o.getSdt(), o.getCv()});
            }
            model.setColumnIdentifiers(new Object[]{
                "ID nhân viên", "Họ tên nhân viên", "Ngày sinh", "Địa chỉ", "SĐT", "Chức vụ"});
        } catch (SQLException ex) {
            Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void SearchU() {
        Connection con = DBConnect.getJDBCConnection();
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM nhanvien where idnv like N'%" + jTextField15.getText() + "%' "
                    + "or hoten like  N'%" + jTextField15.getText() + "%' or diachi like N'%" + jTextField15.getText()
                    + "%' or sdt like N'%" + jTextField15.getText() + "%' or chucvu like N'%" + jTextField15.getText()
                    + "%' or ngaysinh like  N'%" + jTextField15.getText() + "%';");
            listU.clear();
            while (rs.next()) {
                String name = rs.getString(2);
                String ngaysinh = rs.getString(3);
                String id = rs.getString(1);
                String diachi = rs.getString(4);
                String sdt = rs.getString(5);
                String cv = rs.getString(6);
                ListX sv = new ListX(id, name, diachi, sdt, cv, ngaysinh);
                listU.add(sv);
            }
            con.close();
            DefaultTableModel model = (DefaultTableModel) jTable9.getModel();
            model.setRowCount(0);
            for (ListX o : listU) {
                model.addRow(new Object[]{o.getId(), o.getTen(), o.getNgaysinh(), o.getDiachi(), o.getSdt(), o.getCv()});
            }
            model.setColumnIdentifiers(new Object[]{
                "ID nhân viên", "Họ tên nhân viên", "Ngày sinh", "Địa chỉ", "SĐT", "Chức vụ"});
        } catch (SQLException ex) {
            Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "Bạn có muốn thêm nhân viên?", "Thêm nhân viên", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            if (jTextField1.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Mời nhập lại thông tin!!!");
                return;
            }
            Connection con = DBConnect.getJDBCConnection();
            try {
                PreparedStatement st = con.prepareStatement("INSERT INTO nhanvien VALUES (?, ?, ?,?,?,?);");
                st.setInt(1, Integer.parseInt(jTextField14.getText()));
                st.setString(2, jTextField16.getText());
                st.setString(3, jTextField13.getText());
                st.setString(4, jTextField12.getText());
                st.setString(5, jTextField17.getText());
                st.setString(6, jTextField18.getText());
                st.executeUpdate();
                JOptionPane.showMessageDialog(this, "Thêm thành công!");
                con.close();
                LoadDataU();
            } catch (SQLException ex) {
                Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "ID nhân viên đã tồn tại!!");
            }
        }
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:

        int a = JOptionPane.showConfirmDialog(null, "Bạn có muốn sửa thông tin nhân viên?", "Sửa thông tin nhân viên", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            if (jTextField14.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Mời nhập lại thông tin!!!");
                return;
            }
            Connection con = DBConnect.getJDBCConnection();
            try {
                PreparedStatement st = con.prepareStatement("UPDATE nhanvien SET hoten=?,ngaysinh=?,diachi=?,sdt=?,chucvu=? WHERE idnv=?;");
                st.setInt(6, Integer.parseInt(jTextField14.getText()));
                st.setString(1, jTextField16.getText());
                st.setString(2, jTextField13.getText());
                st.setString(3, jTextField12.getText());
                st.setString(4, jTextField17.getText());
                st.setString(5, jTextField18.getText());
                st.executeUpdate();
                JOptionPane.showMessageDialog(this, "Sửa thành công!");
                con.close();
                LoadDataU();

            } catch (SQLException ex) {
                Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "Thông tin chưa chính xác!!!");
            }
        }
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "Bạn có muốn xóa nhân viên?", "Xóa nhân viên", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            if (jTextField1.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Mời nhập lại thông tin!!!");
                return;
            }
            Connection con = DBConnect.getJDBCConnection();
            try {
                PreparedStatement st = con.prepareStatement("DELETE FROM nhanvien WHERE idnv = ?;");
                st.setInt(1, Integer.parseInt(jTextField14.getText()));
                st.executeUpdate();
                JOptionPane.showMessageDialog(this, "Xóa thành công!");
                con.close();
                LoadDataU();
            } catch (SQLException ex) {
                Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "Thông tin chưa chính xác!!!");
            }
        }
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jTable9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable9MouseClicked
        // TODO add your handling code here:
        int index = jTable9.getSelectedRow();
        TableModel model = jTable9.getModel();
        jTextField14.setText(model.getValueAt(index, 0).toString());
        jTextField16.setText(model.getValueAt(index, 1).toString());
        jTextField13.setText(model.getValueAt(index, 2).toString());
        jTextField12.setText(model.getValueAt(index, 3).toString());
        jTextField17.setText(model.getValueAt(index, 4).toString());
        jTextField18.setText(model.getValueAt(index, 5).toString());
    }//GEN-LAST:event_jTable9MouseClicked

    private void jTextField15KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField15KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField15KeyPressed

    private void jTextField15KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField15KeyReleased
        // TODO add your handling code here:
        if (jTextField15.getText().equals("")) {
            LoadDataU();
        } else {
            SearchU();
        }
    }//GEN-LAST:event_jTextField15KeyReleased
    ArrayList<String> listN = new ArrayList<>();

    public void LoadDataN() {
        Connection con = DBConnect.getJDBCConnection();
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM ncc;");
            listN.clear();
            while (rs.next()) {
                String ten = rs.getString(1);
                listN.add(ten);
            }
            con.close();
            DefaultTableModel model = (DefaultTableModel) jTable10.getModel();
            model.setRowCount(0);
            for (String o : listN) {
                model.addRow(new Object[]{o});
            }
            model.setColumnIdentifiers(new Object[]{
                "Nhà cung cấp"});
        } catch (SQLException ex) {
            Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void jPanel11MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel11MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel11MouseDragged

    private void jPanel11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel11MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel11MousePressed

    private void jTextField16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField16ActionPerformed

    private void jTextField17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField17ActionPerformed

    private void jTextField18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField18ActionPerformed

    private void jPanel13MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel13MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel13MousePressed

    private void jPanel13MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel13MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel13MouseDragged

    private void jTable10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable10MouseClicked

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "Bạn có muốn xóa nhà cung cấp?", "Xóa nhà cung cấp", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            if (jTextField1.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Mời nhập lại thông tin!!!");
                return;
            }
            Connection con = DBConnect.getJDBCConnection();
            try {
                PreparedStatement st = con.prepareStatement("DELETE FROM namencc WHERE name = ?;");
                st.setString(1, jTextField21.getText());
                st.executeUpdate();
                JOptionPane.showMessageDialog(this, "Xóa thành công!");
                con.close();
                LoadDataN();
            } catch (SQLException ex) {
                Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "Thông tin chưa chính xác!!!");
            }
        }
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "Bạn có muốn thêm nhà cung cấp?", "Thêm nhà cung cấp", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            if (jTextField1.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Mời nhập lại thông tin!!!");
                return;
            }
            Connection con = DBConnect.getJDBCConnection();
            try {
                PreparedStatement st = con.prepareStatement("INSERT INTO ncc VALUES (?);");
                st.setString(1, jTextField21.getText());
                st.executeUpdate();
                JOptionPane.showMessageDialog(this, "Thêm thành công!");
                con.close();
                LoadDataN();
            } catch (SQLException ex) {
                Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "Nhà cung cấp đã tồn tại!!");
            }
        }
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jLabel46MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel46MouseClicked
        // TODO add your handling code here:
        jLabel1.setBackground(new Color(7, 138, 68));
        jLabel15.setBackground(new Color(7, 138, 68));
        jLabel27.setBackground(new Color(7, 138, 68));
        jLabel7.setBackground(new Color(7, 138, 68));
        jLabel23.setBackground(new Color(7, 138, 68));
        jLabel25.setBackground(new Color(7, 138, 68));
        jLabel26.setBackground(new Color(7, 138, 68));
        jLabel22.setBackground(new Color(7, 138, 68));
        jLabel46.setBackground(new Color(7, 204, 68));
        try {
            //clearing
            jPanel4.removeAll();
            jPanel4.repaint();
            jPanel4.revalidate();
            //adding a pannel 
            jPanel4.add(jPanel15);
            jPanel4.repaint();
            jPanel4.revalidate();
        } catch (Exception e) {

        }
    }//GEN-LAST:event_jLabel46MouseClicked

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        int a = JOptionPane.showConfirmDialog(null, "Bạn có đổi mật khẩu?", "Đổi mật khẩu", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            Connection con = DBConnect.getJDBCConnection();
            PreparedStatement ps, ps1;
            try {
                ps = con.prepareStatement("SELECT * FROM oop.account WHERE usename=? AND password=?");
                ps.setString(1, jLabel36.getText());
                ps.setString(2, jPasswordField1.getText());
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    ps1 = con.prepareStatement("select * from oop.account,oop.nhanvien where oop.account.idnv=oop.nhanvien.idnv and usename=?");
                    ps1.setString(1, jLabel36.getText());
                    ResultSet rs1 = ps1.executeQuery();
                    rs1.next();
                    if (!jTextField20.getText().equals(jTextField22.getText())) {
                        JOptionPane.showMessageDialog(this, "Mật khẩu xác nhận không đúng!?!");
                        return;
                    }
                    PreparedStatement st = con.prepareStatement("UPDATE account SET password=? WHERE usename=?;");
                    st.setString(2, jLabel36.getText());
                    st.setString(1, jTextField20.getText());
                    st.executeUpdate();
                    JOptionPane.showMessageDialog(this, "Thành Công!!");
                    con.close();
                } else {
                    JOptionPane.showMessageDialog(null, "Mật khẩu không đúng", null, JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException ex) {
                Logger.getLogger(DangNhap.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "Bạn có muốn đổi thông tin?", "Đổi thông tin cá nhân", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            Connection con = DBConnect.getJDBCConnection();
            try {
                PreparedStatement st = con.prepareStatement("UPDATE nhanvien SET hoten=?,ngaysinh=?,diachi=?,sdt=?,chucvu=? WHERE idnv=?;");
                st.setInt(6, Integer.parseInt(jLabel49.getText()));
                st.setString(1, jTextField23.getText());
                st.setString(2, jTextField24.getText());
                st.setString(3, jTextField25.getText());
                st.setString(4, jTextField26.getText());
                st.setString(5, jLabel51.getText());
                st.executeUpdate();
                JOptionPane.showMessageDialog(this, "Sửa thành công!");
                con.close();
                LoadDataU();

            } catch (SQLException ex) {
                Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "Thông tin chưa chính xác!!!");
            }
        }
    }//GEN-LAST:event_jButton22ActionPerformed
    public void LoadDataT() {
        Connection con = DBConnect.getJDBCConnection();
        try {
            PreparedStatement ps = con.prepareStatement("select * from oop.account,oop.nhanvien where oop.account.idnv=oop.nhanvien.idnv and hoten=?");
            ps.setString(1, jLabel18.getText());
            ResultSet rs = ps.executeQuery();
            rs.next();
            jLabel49.setText(rs.getString("idnv"));
            jLabel36.setText(rs.getString("usename"));
            jTextField23.setText(rs.getString("hoten"));
            jTextField24.setText(rs.getString("ngaysinh"));
            jTextField25.setText(rs.getString("diachi"));
            jTextField26.setText(rs.getString("sdt"));
            jLabel51.setText(rs.getString("chucvu"));
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
        }
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
            java.util.logging.Logger.getLogger(GDQuanLi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GDQuanLi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GDQuanLi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GDQuanLi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GDQuanLi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Cb;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable10;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTable jTable7;
    private javax.swing.JTable jTable8;
    private javax.swing.JTable jTable9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
