/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import OBJ.NhanVien;
import Utils.RandomUtils;
import Utils.SendMail;
import Utils.ValidateData;
import java.awt.Color;
import java.awt.Cursor;
import java.util.ArrayList;
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Admin
 */
public class frmLogin extends javax.swing.JFrame {

    /**
     * Creates new form frmLogin
     */
    public frmLogin() {
        initComponents();
        setSize(450, 450); //Set kích thước cho frame
        setResizable(false); //Set size ko cho kéo rộng ra
        this.setLocationRelativeTo(null); //Set vị trí ở giữa screen cho frame

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_Username = new javax.swing.JTextField();
        btn_Cancel = new javax.swing.JButton();
        btn_Signin = new javax.swing.JButton();
        cb_rememberPass = new javax.swing.JCheckBox();
        lbl_forgetpass = new javax.swing.JLabel();
        txt_Password = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN SYSTEM");
        setUndecorated(true);
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/secrecy-icon.png"))); // NOI18N
        jLabel3.setText("Password");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(80, 250, 120, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/User-icon.png"))); // NOI18N
        jLabel4.setText("Username");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(80, 200, 120, 32);
        getContentPane().add(txt_Username);
        txt_Username.setBounds(190, 200, 180, 30);

        btn_Cancel.setBackground(new java.awt.Color(255, 255, 255));
        btn_Cancel.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btn_Cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Home-icon.png"))); // NOI18N
        btn_Cancel.setText("Cancel");
        btn_Cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_CancelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_CancelMouseExited(evt);
            }
        });
        btn_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Cancel);
        btn_Cancel.setBounds(160, 330, 100, 30);

        btn_Signin.setBackground(new java.awt.Color(255, 255, 255));
        btn_Signin.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btn_Signin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Login-icon.png"))); // NOI18N
        btn_Signin.setText("Sign In");
        btn_Signin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_SigninMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_SigninMouseEntered(evt);
            }
        });
        btn_Signin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SigninActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Signin);
        btn_Signin.setBounds(270, 330, 100, 30);

        cb_rememberPass.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        cb_rememberPass.setText("Remember password");
        cb_rememberPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_rememberPassActionPerformed(evt);
            }
        });
        getContentPane().add(cb_rememberPass);
        cb_rememberPass.setBounds(190, 290, 160, 23);

        lbl_forgetpass.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_forgetpass.setForeground(new java.awt.Color(51, 0, 255));
        lbl_forgetpass.setText("Forget Password ?");
        lbl_forgetpass.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lbl_forgetpassMouseMoved(evt);
            }
        });
        lbl_forgetpass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_forgetpassMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_forgetpassMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_forgetpassMouseEntered(evt);
            }
        });
        getContentPane().add(lbl_forgetpass);
        lbl_forgetpass.setBounds(280, 370, 110, 30);
        getContentPane().add(txt_Password);
        txt_Password.setBounds(190, 250, 180, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 450, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cb_rememberPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_rememberPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_rememberPassActionPerformed

    private void btn_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelActionPerformed
        Integer confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn thoát không?", "Thoát", 2);
        if (confirm == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btn_CancelActionPerformed

    private void lbl_forgetpassMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_forgetpassMouseMoved

    }//GEN-LAST:event_lbl_forgetpassMouseMoved

    private void lbl_forgetpassMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_forgetpassMouseEntered
        lbl_forgetpass.setForeground(Color.red);
        lbl_forgetpass.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_lbl_forgetpassMouseEntered

    private void lbl_forgetpassMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_forgetpassMouseExited
        lbl_forgetpass.setForeground(Color.blue);
    }//GEN-LAST:event_lbl_forgetpassMouseExited

    private void btn_SigninMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SigninMouseEntered
        btn_Signin.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn_Signin.setBackground(new Color(241, 101, 46));
        btn_Signin.setForeground(Color.white);

    }//GEN-LAST:event_btn_SigninMouseEntered

    private void btn_SigninMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SigninMouseExited
        btn_Signin.setBackground(Color.white);
        btn_Signin.setForeground(Color.black);
    }//GEN-LAST:event_btn_SigninMouseExited

    private void btn_CancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CancelMouseExited
        btn_Cancel.setBackground(Color.white);
        btn_Cancel.setForeground(Color.black);
    }//GEN-LAST:event_btn_CancelMouseExited

    private void btn_CancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CancelMouseEntered
        btn_Cancel.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn_Cancel.setBackground(new Color(241, 101, 46));
        btn_Cancel.setForeground(Color.white);
    }//GEN-LAST:event_btn_CancelMouseEntered
    static String nameLogin;
    static String maNVLogin;
    private void btn_SigninActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SigninActionPerformed
        frmMain main = new frmMain();
        ValidateData validate = new ValidateData();
        String username = txt_Username.getText();
        String password = validate.md5(txt_Password.getText());
        frmNhanVien frm_nv = new frmNhanVien();
        frm_nv.loadFile();
        int dem = 0;

        for (int i = 0; i < frm_nv.listNV.size(); i++) {
            if (username.equals(frm_nv.listNV.get(i).getMaNhanVien()) && password.equals(frm_nv.listNV.get(i).getMatKhau())) {
                if (frm_nv.listNV.get(i).getTrangThai()==0) {
                     JOptionPane.showMessageDialog(this, "Tài khoản này đã bị vô hiệu hóa !");
                     dem++;
                     break;
                }
                JOptionPane.showMessageDialog(this, "Đăng nhập thành công !");
                main.setVisible(true);
                nameLogin = frm_nv.listNV.get(i).getHoTen();
                maNVLogin = frm_nv.listNV.get(i).getMaNhanVien();
                this.dispose();
                dem++;
                break;
            }
        }
        if (dem == 0) {
            JOptionPane.showMessageDialog(this, "Đăng nhập thất bại !");
        }

    }//GEN-LAST:event_btn_SigninActionPerformed

    private void lbl_forgetpassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_forgetpassMouseClicked
        JTextField txt_maNV = new JTextField(10);
        JTextField txt_email = new JTextField(10);

        JPanel myPanel = new JPanel();
        myPanel.add(new JLabel("Mã NV:"));
        myPanel.add(txt_maNV);
        myPanel.add(Box.createHorizontalStrut(10)); // a spacer
        myPanel.add(new JLabel("Email:"));
        myPanel.add(txt_email);
        frmNhanVien frm_nv = new frmNhanVien();
        frm_nv.loadFile();
        int result = JOptionPane.showConfirmDialog(null, myPanel,
                "Quên mật khẩu", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            String maNV = txt_maNV.getText();
            String email = txt_email.getText();
            if(maNV.equals("")||email.equals("")){
                JOptionPane.showMessageDialog(this, "Mã nhân viên hoặc email không được để trống !");
            }else if(new ValidateData().kiemTraEmail(email)==false){
                 JOptionPane.showMessageDialog(this, "Email chưa đúng định dạng !");
            }else if(checkAccountExist(frm_nv.listNV, maNV, email)==false){
                JOptionPane.showMessageDialog(this, "Tài khoản này không tồn tại !");
            }else if(checkAccountExist(frm_nv.listNV, maNV, email)){
                int password = new RandomUtils().rand(100000, 999999);
                String content = "Chào bạn,\n Mật khẩu mới của bạn là: "+password+"\n Trân trọng,";
                JOptionPane.showMessageDialog(this, "Vui lòng chờ trong giây lát...");
                if(new SendMail().sendMail("QUÊN MẬT KHẨU",email,content)){
                    NhanVien nv = frm_nv.listNV.get(index);
                    nv.setMatKhau(new ValidateData().md5(String.valueOf(password)));
                    frm_nv.saveFile();
                    JOptionPane.showMessageDialog(this, "Vui lòng kiểm tra email và đăng nhập lại");
                }else{
                     JOptionPane.showMessageDialog(this, "Lỗi gửi email ! Quên mật khẩu thất bại");
                }
            }
            
        }
    }//GEN-LAST:event_lbl_forgetpassMouseClicked
    int index;
    public boolean checkAccountExist(ArrayList<NhanVien> listNV, String maNV, String email){
        for (int i = 0; i <listNV.size(); i++) {
            if(maNV.equals(listNV.get(i).getMaNhanVien())&&email.equals(listNV.get(i).getEmail())){
                index = i;
                return true;
            }
        }
        return false;
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
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Cancel;
    private javax.swing.JButton btn_Signin;
    private javax.swing.JCheckBox cb_rememberPass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbl_forgetpass;
    private javax.swing.JPasswordField txt_Password;
    private javax.swing.JTextField txt_Username;
    // End of variables declaration//GEN-END:variables
}