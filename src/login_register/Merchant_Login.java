/*
 * Management_view.java
 *
 * Created on __DATE__, __TIME__
 */

package login_register;

import java.io.IOException;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import model.Merchant;
import model.User;
import server.Client;
import view.main_view;
import view.merchant_view;

/**
 *
 * @author  __USER__
 */
public class Merchant_Login extends javax.swing.JFrame {

	/** Creates new form Management_view */
	public Merchant_Login() {
		initComponents();
		this.setLocationRelativeTo(null);
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jSeparator2 = new javax.swing.JSeparator();
		jLabel3 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jSeparator1 = new javax.swing.JSeparator();
		jLabel1 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jButton3 = new javax.swing.JButton();
		jButton4 = new javax.swing.JButton();
		jPasswordField1 = new javax.swing.JPasswordField();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jPanel1.setBackground(new java.awt.Color(41, 45, 51));

		jSeparator2.setBackground(new java.awt.Color(0, 51, 255));

		jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jLabel3.setForeground(new java.awt.Color(255, 255, 255));
		jLabel3
				.setText("\u56e0\u60a8\u7684\u521b\u9020\u800c\u66f4\u52a0\u5b8c\u7f8e");

		jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/image/图标.png"))); // NOI18N

		jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jLabel1.setForeground(new java.awt.Color(204, 204, 204));
		jLabel1.setText("\u5546\u5e97\u540d\u79f0");

		jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jLabel4.setForeground(new java.awt.Color(204, 204, 204));
		jLabel4.setText("\u5bc6\u7801");

		jTextField1.setBackground(new java.awt.Color(51, 51, 51));
		jTextField1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jTextField1.setForeground(new java.awt.Color(204, 204, 204));
		jTextField1.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(153, 153, 153)));

		jButton1.setBackground(new java.awt.Color(102, 102, 102));
		jButton1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jButton1.setForeground(new java.awt.Color(204, 204, 204));
		jButton1.setText("\u767b\u9646");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					jButton1ActionPerformed(evt);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		jButton2.setBackground(new java.awt.Color(102, 102, 102));
		jButton2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jButton2.setForeground(new java.awt.Color(204, 204, 204));
		jButton2.setText("\u53d6\u6d88");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jLabel5.setForeground(new java.awt.Color(153, 153, 153));
		jLabel5
				.setText("\u767b\u5f55\u65f6\u9700\u8981\u5e2e\u52a9\u5417\uff1f");

		jLabel6.setForeground(new java.awt.Color(153, 153, 153));
		jLabel6.setText("\u8fd8\u6ca1\u6709F4\u5e97\u94fa");

		jButton3.setBackground(new java.awt.Color(102, 102, 102));
		jButton3.setForeground(new java.awt.Color(204, 204, 204));
		jButton3.setText("\u6211\u65e0\u6cd5\u767b\u5f55...");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		jButton4.setBackground(new java.awt.Color(102, 102, 102));
		jButton4.setForeground(new java.awt.Color(204, 204, 204));
		jButton4.setText("\u521b\u5efa\u4e00\u4e2aF4\u65b0\u8d26\u6237..");
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});

		jPasswordField1.setBackground(new java.awt.Color(51, 51, 51));
		jPasswordField1.setFont(new java.awt.Font("宋体", 0, 18));
		jPasswordField1.setForeground(new java.awt.Color(204, 204, 204));
		jPasswordField1.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(153, 153, 153)));

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout
				.setHorizontalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel2)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jSeparator2,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								271,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								jLabel3)))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGap(
																				36,
																				36,
																				36)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addGroup(
																								jPanel1Layout
																										.createSequentialGroup()
																										.addGap(
																												107,
																												107,
																												107)
																										.addGroup(
																												jPanel1Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.LEADING,
																																false)
																														.addGroup(
																																jPanel1Layout
																																		.createSequentialGroup()
																																		.addComponent(
																																				jButton1,
																																				javax.swing.GroupLayout.PREFERRED_SIZE,
																																				192,
																																				javax.swing.GroupLayout.PREFERRED_SIZE)
																																		.addGap(
																																				18,
																																				18,
																																				18)
																																		.addComponent(
																																				jButton2,
																																				javax.swing.GroupLayout.DEFAULT_SIZE,
																																				javax.swing.GroupLayout.DEFAULT_SIZE,
																																				Short.MAX_VALUE))
																														.addGroup(
																																jPanel1Layout
																																		.createSequentialGroup()
																																		.addGroup(
																																				jPanel1Layout
																																						.createParallelGroup(
																																								javax.swing.GroupLayout.Alignment.LEADING)
																																						.addComponent(
																																								jLabel1)
																																						.addComponent(
																																								jLabel4))
																																		.addPreferredGap(
																																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																		.addGroup(
																																				jPanel1Layout
																																						.createParallelGroup(
																																								javax.swing.GroupLayout.Alignment.LEADING,
																																								false)
																																						.addComponent(
																																								jPasswordField1)
																																						.addComponent(
																																								jTextField1,
																																								javax.swing.GroupLayout.DEFAULT_SIZE,
																																								293,
																																								Short.MAX_VALUE)))))
																						.addGroup(
																								jPanel1Layout
																										.createSequentialGroup()
																										.addGap(
																												107,
																												107,
																												107)
																										.addGroup(
																												jPanel1Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.TRAILING)
																														.addGroup(
																																jPanel1Layout
																																		.createSequentialGroup()
																																		.addComponent(
																																				jLabel6)
																																		.addGap(
																																				49,
																																				49,
																																				49))
																														.addGroup(
																																jPanel1Layout
																																		.createSequentialGroup()
																																		.addComponent(
																																				jLabel5)
																																		.addPreferredGap(
																																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
																										.addGroup(
																												jPanel1Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.LEADING,
																																false)
																														.addComponent(
																																jButton3,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																250,
																																Short.MAX_VALUE)
																														.addComponent(
																																jButton4,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																Short.MAX_VALUE)))
																						.addGroup(
																								jPanel1Layout
																										.createSequentialGroup()
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addComponent(
																												jSeparator1,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												586,
																												javax.swing.GroupLayout.PREFERRED_SIZE)))))
										.addContainerGap(36, Short.MAX_VALUE)));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																jLabel2,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																150,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGap(
																				59,
																				59,
																				59)
																		.addComponent(
																				jLabel3)
																		.addGap(
																				5,
																				5,
																				5)
																		.addComponent(
																				jSeparator2,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				10,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel1)
														.addComponent(
																jTextField1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel4)
														.addComponent(
																jPasswordField1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(29, 29, 29)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jButton1)
														.addComponent(jButton2))
										.addGap(28, 28, 28)
										.addComponent(
												jSeparator1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												10,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel5)
														.addComponent(jButton3))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel6)
														.addComponent(jButton4))
										.addContainerGap(38, Short.MAX_VALUE)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.PREFERRED_SIZE));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		this.dispose();
		new Problem(2).setVisible(true);
	}

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		this.dispose();
		new Merchant_Register_view().setVisible(true);
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		this.dispose();
	}

	@SuppressWarnings("deprecation")
	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)
			throws SQLException, ClassNotFoundException, IOException {
		// TODO add your handling code here:
		/*Merchant m = Merchant.login(this.jTextField1.getText(),
				this.jTextField2.getText());
		if (m != null) {
			JOptionPane.showMessageDialog(this, "登录成功！");
			this.dispose();
			new merchant_view(m).setVisible(true);
		} else {
			JOptionPane.showMessageDialog(this, "登录失败");
		}*/
		if (this.jTextField1.getText().equals("")
				|| this.jPasswordField1.getText().equals("")) {
			JOptionPane.showMessageDialog(this, "登录商店名称和登录密码必填!");
		} else {
			Client c = new Client();
			Merchant m = c.merchant_login(this.jTextField1.getText(),
					this.jPasswordField1.getText());
			
			if (m == null)
				JOptionPane.showMessageDialog(this, "登录失败");
			else {
				if(m.getMstate() == null || m.getMstate().equals("1")){
					JOptionPane.showMessageDialog(this, "登录成功");
					this.dispose();
					new merchant_view(m).setVisible(true);
				}
				else{
					JOptionPane.showMessageDialog(this,
					"该商店存在非法行为，正处禁止登录状态，如需解禁请联系客服10086！");
				}
			}
		}
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				//new Merchant_Login().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPasswordField jPasswordField1;
	private javax.swing.JSeparator jSeparator1;
	private javax.swing.JSeparator jSeparator2;
	private javax.swing.JTextField jTextField1;
	// End of variables declaration//GEN-END:variables

}