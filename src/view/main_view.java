/*
 * mian_view.java
 *
 * Created on __DATE__, __TIME__
 */

package view;

import java.awt.Image;
import java.io.IOException;
import java.net.UnknownHostException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

import model.User;

/**
 *
 * @author  __USER__
 */
public class main_view extends javax.swing.JFrame implements Runnable {

	Thread myt = new Thread(this);

	private User u;

	/** Creates new form mian_view 
	 * @param u */
	public main_view(User u) {
		this.u = u;
		initComponents();
		this.setLocationRelativeTo(null);
		//按钮下显示
		Store();
		Library();
		Community();
		//轮播图
		imgrote();
		myt.start();
		//获取id
		getid();
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jScrollPane1 = new javax.swing.JScrollPane();
		jPanel2 = new javax.swing.JPanel();
		jPanel3 = new javax.swing.JPanel();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jButton47 = new javax.swing.JButton();
		jPanel4 = new javax.swing.JPanel();
		jLabel2 = new javax.swing.JLabel();
		jPanel5 = new javax.swing.JPanel();
		jLabel3 = new javax.swing.JLabel();
		jSeparator1 = new javax.swing.JSeparator();
		jLabel4 = new javax.swing.JLabel();
		jButton4 = new javax.swing.JButton();
		jLabel5 = new javax.swing.JLabel();
		jButton5 = new javax.swing.JButton();
		jButton6 = new javax.swing.JButton();
		jButton7 = new javax.swing.JButton();
		jLabel6 = new javax.swing.JLabel();
		jButton8 = new javax.swing.JButton();
		jButton9 = new javax.swing.JButton();
		jLabel7 = new javax.swing.JLabel();
		jButton10 = new javax.swing.JButton();
		jButton11 = new javax.swing.JButton();
		jButton12 = new javax.swing.JButton();
		jButton13 = new javax.swing.JButton();
		jButton14 = new javax.swing.JButton();
		jButton15 = new javax.swing.JButton();
		jButton16 = new javax.swing.JButton();
		jPanel6 = new javax.swing.JPanel();
		jButton18 = new javax.swing.JButton();
		jButton19 = new javax.swing.JButton();
		jLabel8 = new javax.swing.JLabel();
		jButton17 = new javax.swing.JButton();
		jLabel40 = new javax.swing.JLabel();
		jButton43 = new javax.swing.JButton();
		jButton44 = new javax.swing.JButton();
		jButton45 = new javax.swing.JButton();
		jButton46 = new javax.swing.JButton();
		jLabel41 = new javax.swing.JLabel();
		jPanel7 = new javax.swing.JPanel();
		jButton20 = new javax.swing.JButton();
		jButton21 = new javax.swing.JButton();
		jLabel9 = new javax.swing.JLabel();
		jButton22 = new javax.swing.JButton();
		jButton23 = new javax.swing.JButton();
		jPanel8 = new javax.swing.JPanel();
		jLabel10 = new javax.swing.JLabel();
		jButton24 = new javax.swing.JButton();
		jButton25 = new javax.swing.JButton();
		jButton26 = new javax.swing.JButton();
		jButton27 = new javax.swing.JButton();
		jPanel9 = new javax.swing.JPanel();
		jLabel11 = new javax.swing.JLabel();
		jButton28 = new javax.swing.JButton();
		jLabel12 = new javax.swing.JLabel();
		jLabel13 = new javax.swing.JLabel();
		jLabel14 = new javax.swing.JLabel();
		jLabel15 = new javax.swing.JLabel();
		jButton29 = new javax.swing.JButton();
		jLabel16 = new javax.swing.JLabel();
		jLabel17 = new javax.swing.JLabel();
		jLabel18 = new javax.swing.JLabel();
		jButton30 = new javax.swing.JButton();
		jLabel19 = new javax.swing.JLabel();
		jLabel20 = new javax.swing.JLabel();
		jLabel21 = new javax.swing.JLabel();
		jButton31 = new javax.swing.JButton();
		jLabel22 = new javax.swing.JLabel();
		jLabel23 = new javax.swing.JLabel();
		jLabel24 = new javax.swing.JLabel();
		jButton32 = new javax.swing.JButton();
		jLabel25 = new javax.swing.JLabel();
		jLabel26 = new javax.swing.JLabel();
		jLabel27 = new javax.swing.JLabel();
		jButton33 = new javax.swing.JButton();
		jLabel28 = new javax.swing.JLabel();
		jLabel29 = new javax.swing.JLabel();
		jLabel30 = new javax.swing.JLabel();
		jButton34 = new javax.swing.JButton();
		jLabel31 = new javax.swing.JLabel();
		jLabel32 = new javax.swing.JLabel();
		jLabel33 = new javax.swing.JLabel();
		jButton35 = new javax.swing.JButton();
		jLabel34 = new javax.swing.JLabel();
		jLabel35 = new javax.swing.JLabel();
		jLabel36 = new javax.swing.JLabel();
		jButton36 = new javax.swing.JButton();
		jLabel37 = new javax.swing.JLabel();
		jLabel38 = new javax.swing.JLabel();
		jLabel39 = new javax.swing.JLabel();
		jPanel10 = new javax.swing.JPanel();
		jButton37 = new javax.swing.JButton();
		jButton38 = new javax.swing.JButton();
		jButton39 = new javax.swing.JButton();
		jButton40 = new javax.swing.JButton();
		jButton41 = new javax.swing.JButton();
		jButton42 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jPanel1.setBackground(new java.awt.Color(0, 0, 0));

		jScrollPane1.setBackground(new java.awt.Color(0, 0, 0));

		jPanel2.setBackground(new java.awt.Color(0, 0, 0));

		jPanel3.setBackground(new java.awt.Color(0, 0, 0));

		jButton1.setBackground(new java.awt.Color(0, 0, 0));
		jButton1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 26));
		jButton1.setForeground(new java.awt.Color(255, 255, 255));
		jButton1.setText("   \u5546\u5e97  ");
		jButton1.setBorder(null);
		jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				jButton1MouseEntered(evt);
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				jButton1MouseExited(evt);
			}
		});

		jButton2.setBackground(new java.awt.Color(0, 0, 0));
		jButton2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 26));
		jButton2.setForeground(new java.awt.Color(255, 255, 255));
		jButton2.setText("  \u5e93  ");
		jButton2.setBorder(null);
		jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				jButton2MouseEntered(evt);
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				jButton2MouseExited(evt);
			}
		});

		jButton3.setBackground(new java.awt.Color(0, 0, 0));
		jButton3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 26));
		jButton3.setForeground(new java.awt.Color(255, 255, 255));
		jButton3.setText("  \u793e\u533a  ");
		jButton3.setBorder(null);
		jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				jButton3MouseEntered(evt);
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				jButton3MouseExited(evt);
			}
		});

		jButton47.setBackground(new java.awt.Color(0, 0, 0));
		jButton47.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jButton47.setForeground(new java.awt.Color(255, 255, 255));
		jButton47.setText("jButton47");
		jButton47.setBorder(null);
		jButton47.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					jButton47ActionPerformed(evt);
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

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(
				jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout
				.setHorizontalGroup(jPanel3Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel3Layout
										.createSequentialGroup()
										.addComponent(jButton1)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(jButton2)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(jButton3)
										.addGap(18, 18, 18)
										.addComponent(
												jButton47,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												307, Short.MAX_VALUE)
										.addContainerGap()));
		jPanel3Layout
				.setVerticalGroup(jPanel3Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel3Layout
										.createSequentialGroup()
										.addGroup(
												jPanel3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(
																jButton47,
																javax.swing.GroupLayout.Alignment.LEADING,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																43,
																Short.MAX_VALUE)
														.addGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																jPanel3Layout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																		.addComponent(
																				jButton1)
																		.addComponent(
																				jButton2)
																		.addComponent(
																				jButton3)))
										.addContainerGap()));

		jPanel4.setBackground(new java.awt.Color(0, 0, 0));

		jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/image2/背景.png"))); // NOI18N

		javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(
				jPanel4);
		jPanel4.setLayout(jPanel4Layout);
		jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel4Layout.createSequentialGroup().addContainerGap()
						.addComponent(jLabel2).addContainerGap(
								javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)));
		jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel4Layout.createSequentialGroup().addContainerGap()
						.addComponent(jLabel2).addContainerGap(17,
								Short.MAX_VALUE)));

		jPanel5.setBackground(new java.awt.Color(0, 0, 0));

		jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/image/图标.png"))); // NOI18N

		jLabel4.setForeground(new java.awt.Color(204, 204, 204));
		jLabel4.setText("\u793c\u7269\u5355");

		jButton4.setBackground(new java.awt.Color(0, 0, 0));
		jButton4.setForeground(new java.awt.Color(0, 153, 255));
		jButton4.setText("\u73b0\u5df2\u5728F4\u4e0a\u63a8\u51fa");
		jButton4.setBorder(null);

		jLabel5.setForeground(new java.awt.Color(204, 204, 204));
		jLabel5.setText("\u63a8\u8350");

		jButton5.setBackground(new java.awt.Color(0, 0, 0));
		jButton5.setForeground(new java.awt.Color(0, 153, 255));
		jButton5.setText("\u7531\u597d\u53cb\u63a8\u8350");
		jButton5.setBorder(null);

		jButton6.setBackground(new java.awt.Color(0, 0, 0));
		jButton6.setForeground(new java.awt.Color(0, 153, 255));
		jButton6.setText("\u7531\u9274\u8d4f\u5bb6\u63a8\u8350");
		jButton6.setBorder(null);

		jButton7.setBackground(new java.awt.Color(0, 0, 0));
		jButton7.setForeground(new java.awt.Color(0, 153, 255));
		jButton7.setText("\u6807\u7b7e");
		jButton7.setBorder(null);

		jLabel6.setForeground(new java.awt.Color(204, 204, 204));
		jLabel6.setText("\u63a2\u7d22\u961f\u5217");

		jButton8.setBackground(new java.awt.Color(0, 0, 0));
		jButton8.setForeground(new java.awt.Color(0, 153, 255));
		jButton8.setText("\u63a8\u8350");
		jButton8.setBorder(null);

		jButton9.setBackground(new java.awt.Color(0, 0, 0));
		jButton9.setForeground(new java.awt.Color(0, 153, 255));
		jButton9.setText("\u65b0\u54c1");
		jButton9.setBorder(null);

		jLabel7.setForeground(new java.awt.Color(204, 204, 204));
		jLabel7.setText("\u6d4f\u89c8\u5206\u7c7b");

		jButton10.setBackground(new java.awt.Color(0, 0, 0));
		jButton10.setForeground(new java.awt.Color(0, 153, 255));
		jButton10.setText("\u70ed\u641c\u5546\u54c1");
		jButton10.setBorder(null);

		jButton11.setBackground(new java.awt.Color(0, 0, 0));
		jButton11.setForeground(new java.awt.Color(0, 153, 255));
		jButton11.setText("\u6700\u8fd1\u66f4\u65b0");
		jButton11.setBorder(null);

		jButton12.setBackground(new java.awt.Color(0, 0, 0));
		jButton12.setForeground(new java.awt.Color(0, 153, 255));
		jButton12.setText("\u65b0\u54c1");
		jButton12.setBorder(null);

		jButton13.setBackground(new java.awt.Color(0, 0, 0));
		jButton13.setForeground(new java.awt.Color(0, 153, 255));
		jButton13.setText("\u5373\u5c06\u63a8\u51fa");
		jButton13.setBorder(null);

		jButton14.setBackground(new java.awt.Color(0, 0, 0));
		jButton14.setForeground(new java.awt.Color(0, 153, 255));
		jButton14.setText("\u4f18\u60e0");
		jButton14.setBorder(null);

		jButton15.setBackground(new java.awt.Color(0, 0, 0));
		jButton15.setForeground(new java.awt.Color(0, 153, 255));
		jButton15.setText("\u865a\u62df\u73b0\u5b9e");
		jButton15.setBorder(null);

		jButton16.setBackground(new java.awt.Color(0, 0, 0));
		jButton16.setForeground(new java.awt.Color(0, 153, 255));
		jButton16.setText("\u652f\u6301F4\u63a7\u5236\u5668");
		jButton16.setBorder(null);

		javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(
				jPanel5);
		jPanel5.setLayout(jPanel5Layout);
		jPanel5Layout.setHorizontalGroup(jPanel5Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel5Layout.createSequentialGroup().addContainerGap()
						.addComponent(jLabel3).addContainerGap(
								javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)).addComponent(jSeparator1,
				javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
				.addGroup(
						jPanel5Layout.createSequentialGroup().addComponent(
								jLabel4).addContainerGap()).addGroup(
						jPanel5Layout.createSequentialGroup().addComponent(
								jButton4).addContainerGap()).addGroup(
						jPanel5Layout.createSequentialGroup().addComponent(
								jLabel5).addContainerGap()).addGroup(
						jPanel5Layout.createSequentialGroup().addComponent(
								jButton5).addContainerGap()).addGroup(
						jPanel5Layout.createSequentialGroup().addComponent(
								jButton6).addContainerGap()).addGroup(
						jPanel5Layout.createSequentialGroup().addComponent(
								jButton7).addContainerGap()).addGroup(
						jPanel5Layout.createSequentialGroup().addComponent(
								jLabel6).addContainerGap()).addGroup(
						jPanel5Layout.createSequentialGroup().addComponent(
								jButton8).addContainerGap()).addGroup(
						jPanel5Layout.createSequentialGroup().addComponent(
								jButton9).addContainerGap()).addGroup(
						jPanel5Layout.createSequentialGroup().addComponent(
								jLabel7).addContainerGap()).addGroup(
						jPanel5Layout.createSequentialGroup().addComponent(
								jButton10).addContainerGap()).addGroup(
						jPanel5Layout.createSequentialGroup().addComponent(
								jButton11).addContainerGap()).addGroup(
						jPanel5Layout.createSequentialGroup().addComponent(
								jButton12).addContainerGap()).addGroup(
						jPanel5Layout.createSequentialGroup().addComponent(
								jButton13).addContainerGap()).addGroup(
						jPanel5Layout.createSequentialGroup().addComponent(
								jButton14).addContainerGap()).addGroup(
						jPanel5Layout.createSequentialGroup().addComponent(
								jButton15).addContainerGap()).addGroup(
						jPanel5Layout.createSequentialGroup().addComponent(
								jButton16).addContainerGap()));
		jPanel5Layout
				.setVerticalGroup(jPanel5Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel5Layout
										.createSequentialGroup()
										.addComponent(jLabel3)
										.addGap(1, 1, 1)
										.addComponent(
												jSeparator1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												10,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jLabel4)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jButton4)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jLabel5)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jButton5)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jButton6)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jButton7)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jLabel6)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jButton8)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jButton9)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jLabel7)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jButton10)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jButton11)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jButton12)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jButton13)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jButton14)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jButton15)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jButton16)
										.addContainerGap(215, Short.MAX_VALUE)));

		jPanel6.setBackground(new java.awt.Color(0, 0, 0));

		jButton18.setBackground(new java.awt.Color(0, 0, 0));
		jButton18.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 48));
		jButton18.setForeground(new java.awt.Color(255, 255, 255));
		jButton18.setText("<");
		jButton18.setBorder(null);
		jButton18.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton18ActionPerformed(evt);
			}
		});

		jButton19.setBackground(new java.awt.Color(0, 0, 0));
		jButton19.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 48));
		jButton19.setForeground(new java.awt.Color(255, 255, 255));
		jButton19.setText(">");
		jButton19.setBorder(null);
		jButton19.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton19ActionPerformed(evt);
			}
		});

		jLabel8.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jLabel8.setForeground(new java.awt.Color(255, 255, 255));
		jLabel8.setText("\u7cbe\u9009\u548c\u63a8\u8350");

		jButton17.setIcon(new javax.swing.ImageIcon(
				"C:\\Users\\VX50IU9830\\Desktop\\steam\\轮播图\\轮播图1.png")); // NOI18N
		jButton17.setBorder(null);
		jButton17.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					jButton17ActionPerformed(evt);
				} catch (UnknownHostException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		jLabel40.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 22));
		jLabel40.setForeground(new java.awt.Color(255, 255, 255));
		jLabel40.setText("\u6e38\u620f\u622a\u56fe\uff1a");

		jButton43.setIcon(new javax.swing.ImageIcon(
				"C:\\Users\\VX50IU9830\\Desktop\\steam\\新建文件夹\\轮播1.png")); // NOI18N
		jButton43.setBorder(null);
		jButton43.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				jButton43MouseEntered(evt);
			}
		});

		jButton44.setIcon(new javax.swing.ImageIcon(
				"C:\\Users\\VX50IU9830\\Desktop\\steam\\新建文件夹\\轮播1.png")); // NOI18N
		jButton44.setBorder(null);
		jButton44.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				jButton44MouseEntered(evt);
			}
		});

		jButton45.setIcon(new javax.swing.ImageIcon(
				"C:\\Users\\VX50IU9830\\Desktop\\steam\\新建文件夹\\轮播2.png")); // NOI18N
		jButton45.setBorder(null);
		jButton45.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				jButton45MouseEntered(evt);
			}
		});

		jButton46.setIcon(new javax.swing.ImageIcon(
				"C:\\Users\\VX50IU9830\\Desktop\\steam\\新建文件夹\\轮播2.png")); // NOI18N
		jButton46.setBorder(null);
		jButton46.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				jButton46MouseEntered(evt);
			}
		});

		jLabel41.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 22));
		jLabel41.setForeground(new java.awt.Color(255, 255, 255));
		jLabel41
				.setText("\u56e0\u60a8\u73a9\u7c7b\u4f3c\u7684\u6e38\u620f\u800c\u63a8\u8350");

		javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(
				jPanel6);
		jPanel6.setLayout(jPanel6Layout);
		jPanel6Layout
				.setHorizontalGroup(jPanel6Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel6Layout
										.createSequentialGroup()
										.addGap(70, 70, 70)
										.addComponent(jButton18)
										.addGap(1, 1, 1)
										.addGroup(
												jPanel6Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jLabel8)
														.addGroup(
																jPanel6Layout
																		.createSequentialGroup()
																		.addComponent(
																				jButton17,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				768,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(
																				18,
																				18,
																				18)
																		.addGroup(
																				jPanel6Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jLabel41)
																						.addGroup(
																								jPanel6Layout
																										.createSequentialGroup()
																										.addGroup(
																												jPanel6Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.LEADING)
																														.addComponent(
																																jButton43,
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																174,
																																javax.swing.GroupLayout.PREFERRED_SIZE)
																														.addComponent(
																																jButton44,
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																174,
																																javax.swing.GroupLayout.PREFERRED_SIZE))
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addGroup(
																												jPanel6Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.LEADING)
																														.addComponent(
																																jButton45,
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																199,
																																javax.swing.GroupLayout.PREFERRED_SIZE)
																														.addComponent(
																																jButton46,
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																199,
																																javax.swing.GroupLayout.PREFERRED_SIZE))
																										.addGap(
																												6,
																												6,
																												6)
																										.addComponent(
																												jButton19))
																						.addComponent(
																								jLabel40))))
										.addContainerGap(24, Short.MAX_VALUE)));
		jPanel6Layout
				.setVerticalGroup(jPanel6Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel6Layout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(jLabel8)
										.addGroup(
												jPanel6Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel6Layout
																		.createSequentialGroup()
																		.addGap(
																				137,
																				137,
																				137)
																		.addComponent(
																				jButton18,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				209,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																jPanel6Layout
																		.createSequentialGroup()
																		.addGap(
																				28,
																				28,
																				28)
																		.addComponent(
																				jButton17,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				434,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addContainerGap(93, Short.MAX_VALUE))
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel6Layout
										.createSequentialGroup()
										.addContainerGap(131, Short.MAX_VALUE)
										.addComponent(jLabel40)
										.addGap(26, 26, 26)
										.addGroup(
												jPanel6Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																false)
														.addComponent(
																jButton45,
																javax.swing.GroupLayout.Alignment.LEADING,
																0, 0,
																Short.MAX_VALUE)
														.addComponent(
																jButton43,
																javax.swing.GroupLayout.Alignment.LEADING,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																84,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(37, 37, 37)
										.addGroup(
												jPanel6Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addComponent(
																jButton46, 0,
																0,
																Short.MAX_VALUE)
														.addComponent(
																jButton44,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																84,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(37, 37, 37).addComponent(
												jLabel41).addGap(146, 146, 146))
						.addGroup(
								jPanel6Layout.createSequentialGroup().addGap(
										169, 169, 169).addComponent(jButton19,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										209,
										javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(225, Short.MAX_VALUE)));

		jPanel7.setBackground(new java.awt.Color(0, 0, 0));

		jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/view/image/优惠1.png"))); // NOI18N

		jButton21.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/view/image/优惠2.png"))); // NOI18N

		jLabel9.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jLabel9.setForeground(new java.awt.Color(255, 255, 255));
		jLabel9.setText("\u7279\u522b\u4f18\u60e0");

		jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/view/image/优惠3.png"))); // NOI18N

		jButton23.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/view/image/优惠4.png"))); // NOI18N

		javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(
				jPanel7);
		jPanel7.setLayout(jPanel7Layout);
		jPanel7Layout
				.setHorizontalGroup(jPanel7Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel7Layout
										.createSequentialGroup()
										.addGap(109, 109, 109)
										.addGroup(
												jPanel7Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel7Layout
																		.createSequentialGroup()
																		.addComponent(
																				jButton20,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				376,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(
																				27,
																				27,
																				27)
																		.addComponent(
																				jButton21,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				376,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(
																				9,
																				9,
																				9)
																		.addGroup(
																				jPanel7Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jButton22,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								383,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								jButton23,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								383,
																								javax.swing.GroupLayout.PREFERRED_SIZE)))
														.addComponent(jLabel9))
										.addContainerGap(121, Short.MAX_VALUE)));
		jPanel7Layout
				.setVerticalGroup(jPanel7Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel7Layout
										.createSequentialGroup()
										.addGap(53, 53, 53)
										.addComponent(jLabel9)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel7Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																false)
														.addGroup(
																jPanel7Layout
																		.createSequentialGroup()
																		.addComponent(
																				jButton22,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				229,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addComponent(
																				jButton23,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				229,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																jPanel7Layout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																		.addComponent(
																				jButton21,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				478,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				jButton20,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				478,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addContainerGap(43, Short.MAX_VALUE)));

		jPanel8.setBackground(new java.awt.Color(0, 0, 0));

		jLabel10.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jLabel10.setForeground(new java.awt.Color(255, 255, 255));
		jLabel10.setText("\u6d4f\u89c8 F4");

		jButton24.setBackground(new java.awt.Color(36, 106, 145));
		jButton24.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jButton24.setForeground(new java.awt.Color(255, 255, 255));
		jButton24.setText("\u65b0\u54c1");

		jButton25.setBackground(new java.awt.Color(36, 106, 145));
		jButton25.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jButton25.setForeground(new java.awt.Color(255, 255, 255));
		jButton25.setText("\u65b0\u54c1");

		jButton26.setBackground(new java.awt.Color(36, 106, 145));
		jButton26.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jButton26.setForeground(new java.awt.Color(255, 255, 255));
		jButton26.setText("\u65b0\u54c1");

		jButton27.setBackground(new java.awt.Color(36, 106, 145));
		jButton27.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jButton27.setForeground(new java.awt.Color(255, 255, 255));
		jButton27.setText("\u65b0\u54c1");

		javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(
				jPanel8);
		jPanel8.setLayout(jPanel8Layout);
		jPanel8Layout
				.setHorizontalGroup(jPanel8Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel8Layout
										.createSequentialGroup()
										.addGap(110, 110, 110)
										.addGroup(
												jPanel8Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel8Layout
																		.createSequentialGroup()
																		.addComponent(
																				jButton24,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				264,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(
																				18,
																				18,
																				18)
																		.addComponent(
																				jButton25,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				264,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(
																				18,
																				18,
																				18)
																		.addComponent(
																				jButton26,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				264,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(
																				18,
																				18,
																				18)
																		.addComponent(
																				jButton27,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				264,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addComponent(jLabel10))
										.addContainerGap(181, Short.MAX_VALUE)));
		jPanel8Layout
				.setVerticalGroup(jPanel8Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel8Layout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(jLabel10)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel8Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jButton24,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																71,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jButton25,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																71,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jButton26,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																71,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jButton27,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																71,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addContainerGap(25, Short.MAX_VALUE)));

		jPanel9.setBackground(new java.awt.Color(0, 0, 0));

		jLabel11.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jLabel11.setForeground(new java.awt.Color(255, 255, 255));
		jLabel11.setText("\u65b0\u54c1\u4e0e\u70ed\u95e8\u5546\u54c1");

		jButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/image/新品1.png"))); // NOI18N
		jButton28.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				jButton28MouseEntered(evt);
			}
		});

		jLabel12.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jLabel12.setForeground(new java.awt.Color(255, 255, 255));
		jLabel12.setText("MUSYNX");

		jLabel13.setForeground(new java.awt.Color(255, 255, 255));
		jLabel13.setText("\u72ec\u7acb \u6a21\u62df \u8282\u594f \u97f3\u4e50");

		jLabel14.setForeground(new java.awt.Color(255, 255, 255));
		jLabel14.setText("\u00a5 10");

		jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/image/推1.png"))); // NOI18N

		jButton29.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/image/新品2.png"))); // NOI18N
		jButton29.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				jButton29MouseEntered(evt);
			}
		});

		jLabel16.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jLabel16.setForeground(new java.awt.Color(255, 255, 255));
		jLabel16.setText("MUSYNX");

		jLabel17.setForeground(new java.awt.Color(255, 255, 255));
		jLabel17.setText("\u72ec\u7acb \u6a21\u62df \u8282\u594f \u97f3\u4e50");

		jLabel18.setForeground(new java.awt.Color(255, 255, 255));
		jLabel18.setText("\u00a5 10");

		jButton30.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/image/新品3.png"))); // NOI18N
		jButton30.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				jButton30MouseEntered(evt);
			}
		});

		jLabel19.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jLabel19.setForeground(new java.awt.Color(255, 255, 255));
		jLabel19.setText("MUSYNX");

		jLabel20.setForeground(new java.awt.Color(255, 255, 255));
		jLabel20.setText("\u72ec\u7acb \u6a21\u62df \u8282\u594f \u97f3\u4e50");

		jLabel21.setForeground(new java.awt.Color(255, 255, 255));
		jLabel21.setText("\u00a5 10");

		jButton31.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/image/新品4.png"))); // NOI18N
		jButton31.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				jButton31MouseEntered(evt);
			}
		});

		jLabel22.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jLabel22.setForeground(new java.awt.Color(255, 255, 255));
		jLabel22.setText("MUSYNX");

		jLabel23.setForeground(new java.awt.Color(255, 255, 255));
		jLabel23.setText("\u72ec\u7acb \u6a21\u62df \u8282\u594f \u97f3\u4e50");

		jLabel24.setForeground(new java.awt.Color(255, 255, 255));
		jLabel24.setText("\u00a5 10");

		jButton32.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/image/新品5.png"))); // NOI18N
		jButton32.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				jButton32MouseEntered(evt);
			}
		});

		jLabel25.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jLabel25.setForeground(new java.awt.Color(255, 255, 255));
		jLabel25.setText("MUSYNX");

		jLabel26.setForeground(new java.awt.Color(255, 255, 255));
		jLabel26.setText("\u72ec\u7acb \u6a21\u62df \u8282\u594f \u97f3\u4e50");

		jLabel27.setForeground(new java.awt.Color(255, 255, 255));
		jLabel27.setText("\u00a5 10");

		jButton33.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/image/新品6.png"))); // NOI18N
		jButton33.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				jButton33MouseEntered(evt);
			}
		});

		jLabel28.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jLabel28.setForeground(new java.awt.Color(255, 255, 255));
		jLabel28.setText("MUSYNX");

		jLabel29.setForeground(new java.awt.Color(255, 255, 255));
		jLabel29.setText("\u72ec\u7acb \u6a21\u62df \u8282\u594f \u97f3\u4e50");

		jLabel30.setForeground(new java.awt.Color(255, 255, 255));
		jLabel30.setText("\u00a5 10");

		jButton34.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/image/新品7.png"))); // NOI18N
		jButton34.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				jButton34MouseEntered(evt);
			}
		});

		jLabel31.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jLabel31.setForeground(new java.awt.Color(255, 255, 255));
		jLabel31.setText("MUSYNX");

		jLabel32.setForeground(new java.awt.Color(255, 255, 255));
		jLabel32.setText("\u72ec\u7acb \u6a21\u62df \u8282\u594f \u97f3\u4e50");

		jLabel33.setForeground(new java.awt.Color(255, 255, 255));
		jLabel33.setText("\u00a5 10");

		jButton35.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/image/推8.png"))); // NOI18N
		jButton35.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				jButton35MouseEntered(evt);
			}
		});

		jLabel34.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jLabel34.setForeground(new java.awt.Color(255, 255, 255));
		jLabel34.setText("MUSYNX");

		jLabel35.setForeground(new java.awt.Color(255, 255, 255));
		jLabel35.setText("\u72ec\u7acb \u6a21\u62df \u8282\u594f \u97f3\u4e50");

		jLabel36.setForeground(new java.awt.Color(255, 255, 255));
		jLabel36.setText("\u00a5 10");

		jButton36.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/image/新品9.png"))); // NOI18N
		jButton36.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				jButton36MouseEntered(evt);
			}
		});

		jLabel37.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jLabel37.setForeground(new java.awt.Color(255, 255, 255));
		jLabel37.setText("MUSYNX");

		jLabel38.setForeground(new java.awt.Color(255, 255, 255));
		jLabel38.setText("\u72ec\u7acb \u6a21\u62df \u8282\u594f \u97f3\u4e50");

		jLabel39.setForeground(new java.awt.Color(255, 255, 255));
		jLabel39.setText("\u00a5 10");

		javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(
				jPanel9);
		jPanel9.setLayout(jPanel9Layout);
		jPanel9Layout
				.setHorizontalGroup(jPanel9Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel9Layout
										.createSequentialGroup()
										.addGap(113, 113, 113)
										.addGroup(
												jPanel9Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel9Layout
																		.createSequentialGroup()
																		.addComponent(
																				jButton28,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				231,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				jPanel9Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jLabel12)
																						.addComponent(
																								jLabel13)))
														.addGroup(
																jPanel9Layout
																		.createSequentialGroup()
																		.addComponent(
																				jButton29,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				231,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGroup(
																				jPanel9Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addGroup(
																								jPanel9Layout
																										.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.LEADING)
																										.addGroup(
																												jPanel9Layout
																														.createSequentialGroup()
																														.addPreferredGap(
																																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																														.addComponent(
																																jLabel17))
																										.addGroup(
																												javax.swing.GroupLayout.Alignment.TRAILING,
																												jPanel9Layout
																														.createSequentialGroup()
																														.addPreferredGap(
																																javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																																119,
																																Short.MAX_VALUE)
																														.addGroup(
																																jPanel9Layout
																																		.createParallelGroup(
																																				javax.swing.GroupLayout.Alignment.LEADING)
																																		.addComponent(
																																				jLabel14)
																																		.addComponent(
																																				jLabel18))))
																						.addGroup(
																								jPanel9Layout
																										.createSequentialGroup()
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addComponent(
																												jLabel16))))
														.addGroup(
																jPanel9Layout
																		.createSequentialGroup()
																		.addComponent(
																				jButton30,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				231,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGroup(
																				jPanel9Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addGroup(
																								jPanel9Layout
																										.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.LEADING)
																										.addGroup(
																												jPanel9Layout
																														.createSequentialGroup()
																														.addPreferredGap(
																																javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																																119,
																																Short.MAX_VALUE)
																														.addComponent(
																																jLabel21))
																										.addGroup(
																												jPanel9Layout
																														.createSequentialGroup()
																														.addPreferredGap(
																																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																														.addComponent(
																																jLabel20)))
																						.addGroup(
																								jPanel9Layout
																										.createSequentialGroup()
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addComponent(
																												jLabel19))))
														.addGroup(
																jPanel9Layout
																		.createSequentialGroup()
																		.addComponent(
																				jButton31,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				231,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGroup(
																				jPanel9Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addGroup(
																								jPanel9Layout
																										.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.LEADING)
																										.addGroup(
																												jPanel9Layout
																														.createSequentialGroup()
																														.addPreferredGap(
																																javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																																119,
																																Short.MAX_VALUE)
																														.addComponent(
																																jLabel24))
																										.addGroup(
																												jPanel9Layout
																														.createSequentialGroup()
																														.addPreferredGap(
																																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																														.addComponent(
																																jLabel23)))
																						.addGroup(
																								jPanel9Layout
																										.createSequentialGroup()
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addComponent(
																												jLabel22))))
														.addGroup(
																jPanel9Layout
																		.createSequentialGroup()
																		.addComponent(
																				jButton32,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				231,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGroup(
																				jPanel9Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addGroup(
																								jPanel9Layout
																										.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.LEADING)
																										.addGroup(
																												jPanel9Layout
																														.createSequentialGroup()
																														.addPreferredGap(
																																javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																																119,
																																Short.MAX_VALUE)
																														.addComponent(
																																jLabel27))
																										.addGroup(
																												jPanel9Layout
																														.createSequentialGroup()
																														.addPreferredGap(
																																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																														.addComponent(
																																jLabel26)))
																						.addGroup(
																								jPanel9Layout
																										.createSequentialGroup()
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addComponent(
																												jLabel25))))
														.addGroup(
																jPanel9Layout
																		.createSequentialGroup()
																		.addComponent(
																				jButton33,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				231,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGroup(
																				jPanel9Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addGroup(
																								jPanel9Layout
																										.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.LEADING)
																										.addGroup(
																												jPanel9Layout
																														.createSequentialGroup()
																														.addPreferredGap(
																																javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																																119,
																																Short.MAX_VALUE)
																														.addComponent(
																																jLabel30))
																										.addGroup(
																												jPanel9Layout
																														.createSequentialGroup()
																														.addPreferredGap(
																																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																														.addComponent(
																																jLabel29)))
																						.addGroup(
																								jPanel9Layout
																										.createSequentialGroup()
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addComponent(
																												jLabel28))))
														.addGroup(
																jPanel9Layout
																		.createSequentialGroup()
																		.addComponent(
																				jButton34,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				231,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGroup(
																				jPanel9Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addGroup(
																								jPanel9Layout
																										.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.LEADING)
																										.addGroup(
																												jPanel9Layout
																														.createSequentialGroup()
																														.addPreferredGap(
																																javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																																119,
																																Short.MAX_VALUE)
																														.addComponent(
																																jLabel33))
																										.addGroup(
																												jPanel9Layout
																														.createSequentialGroup()
																														.addPreferredGap(
																																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																														.addComponent(
																																jLabel32)))
																						.addGroup(
																								jPanel9Layout
																										.createSequentialGroup()
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addComponent(
																												jLabel31))))
														.addGroup(
																jPanel9Layout
																		.createSequentialGroup()
																		.addComponent(
																				jButton35,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				231,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGroup(
																				jPanel9Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addGroup(
																								jPanel9Layout
																										.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.LEADING)
																										.addGroup(
																												jPanel9Layout
																														.createSequentialGroup()
																														.addPreferredGap(
																																javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																																119,
																																Short.MAX_VALUE)
																														.addComponent(
																																jLabel36))
																										.addGroup(
																												jPanel9Layout
																														.createSequentialGroup()
																														.addPreferredGap(
																																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																														.addComponent(
																																jLabel35)))
																						.addGroup(
																								jPanel9Layout
																										.createSequentialGroup()
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addComponent(
																												jLabel34))))
														.addGroup(
																jPanel9Layout
																		.createSequentialGroup()
																		.addComponent(
																				jButton36,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				231,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGroup(
																				jPanel9Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addGroup(
																								jPanel9Layout
																										.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.LEADING)
																										.addGroup(
																												jPanel9Layout
																														.createSequentialGroup()
																														.addPreferredGap(
																																javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																																119,
																																Short.MAX_VALUE)
																														.addComponent(
																																jLabel39))
																										.addGroup(
																												jPanel9Layout
																														.createSequentialGroup()
																														.addPreferredGap(
																																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																														.addComponent(
																																jLabel38)))
																						.addGroup(
																								jPanel9Layout
																										.createSequentialGroup()
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addComponent(
																												jLabel37))))
														.addComponent(jLabel11))
										.addGap(401, 401, 401).addComponent(
												jLabel15).addGap(121, 121, 121)));
		jPanel9Layout
				.setVerticalGroup(jPanel9Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel9Layout
										.createSequentialGroup()
										.addGroup(
												jPanel9Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel9Layout
																		.createSequentialGroup()
																		.addGap(
																				22,
																				22,
																				22)
																		.addComponent(
																				jLabel11)
																		.addGap(
																				18,
																				18,
																				18)
																		.addGroup(
																				jPanel9Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING,
																								false)
																						.addGroup(
																								javax.swing.GroupLayout.Alignment.LEADING,
																								jPanel9Layout
																										.createSequentialGroup()
																										.addComponent(
																												jLabel12)
																										.addGap(
																												10,
																												10,
																												10)
																										.addComponent(
																												jLabel14)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												Short.MAX_VALUE)
																										.addComponent(
																												jLabel13))
																						.addComponent(
																								jButton28,
																								javax.swing.GroupLayout.Alignment.LEADING,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								88,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				jPanel9Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING,
																								false)
																						.addGroup(
																								javax.swing.GroupLayout.Alignment.LEADING,
																								jPanel9Layout
																										.createSequentialGroup()
																										.addComponent(
																												jLabel16)
																										.addGap(
																												6,
																												6,
																												6)
																										.addComponent(
																												jLabel18)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												Short.MAX_VALUE)
																										.addComponent(
																												jLabel17))
																						.addComponent(
																								jButton29,
																								javax.swing.GroupLayout.Alignment.LEADING,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								88,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				jPanel9Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING,
																								false)
																						.addGroup(
																								javax.swing.GroupLayout.Alignment.LEADING,
																								jPanel9Layout
																										.createSequentialGroup()
																										.addComponent(
																												jLabel19)
																										.addGap(
																												6,
																												6,
																												6)
																										.addComponent(
																												jLabel21)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												Short.MAX_VALUE)
																										.addComponent(
																												jLabel20))
																						.addComponent(
																								jButton30,
																								javax.swing.GroupLayout.Alignment.LEADING,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								88,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				jPanel9Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING,
																								false)
																						.addGroup(
																								javax.swing.GroupLayout.Alignment.LEADING,
																								jPanel9Layout
																										.createSequentialGroup()
																										.addComponent(
																												jLabel22)
																										.addGap(
																												6,
																												6,
																												6)
																										.addComponent(
																												jLabel24)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												Short.MAX_VALUE)
																										.addComponent(
																												jLabel23))
																						.addComponent(
																								jButton31,
																								javax.swing.GroupLayout.Alignment.LEADING,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								88,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				jPanel9Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING,
																								false)
																						.addGroup(
																								javax.swing.GroupLayout.Alignment.LEADING,
																								jPanel9Layout
																										.createSequentialGroup()
																										.addComponent(
																												jLabel25)
																										.addGap(
																												6,
																												6,
																												6)
																										.addComponent(
																												jLabel27)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												Short.MAX_VALUE)
																										.addComponent(
																												jLabel26))
																						.addComponent(
																								jButton32,
																								javax.swing.GroupLayout.Alignment.LEADING,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								88,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				jPanel9Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING,
																								false)
																						.addGroup(
																								javax.swing.GroupLayout.Alignment.LEADING,
																								jPanel9Layout
																										.createSequentialGroup()
																										.addComponent(
																												jLabel28)
																										.addGap(
																												6,
																												6,
																												6)
																										.addComponent(
																												jLabel30)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												Short.MAX_VALUE)
																										.addComponent(
																												jLabel29))
																						.addComponent(
																								jButton33,
																								javax.swing.GroupLayout.Alignment.LEADING,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								88,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				jPanel9Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING,
																								false)
																						.addGroup(
																								javax.swing.GroupLayout.Alignment.LEADING,
																								jPanel9Layout
																										.createSequentialGroup()
																										.addComponent(
																												jLabel31)
																										.addGap(
																												6,
																												6,
																												6)
																										.addComponent(
																												jLabel33)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												Short.MAX_VALUE)
																										.addComponent(
																												jLabel32))
																						.addComponent(
																								jButton34,
																								javax.swing.GroupLayout.Alignment.LEADING,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								88,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				jPanel9Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING,
																								false)
																						.addGroup(
																								javax.swing.GroupLayout.Alignment.LEADING,
																								jPanel9Layout
																										.createSequentialGroup()
																										.addComponent(
																												jLabel34)
																										.addGap(
																												6,
																												6,
																												6)
																										.addComponent(
																												jLabel36)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												Short.MAX_VALUE)
																										.addComponent(
																												jLabel35))
																						.addComponent(
																								jButton35,
																								javax.swing.GroupLayout.Alignment.LEADING,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								88,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				jPanel9Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING,
																								false)
																						.addGroup(
																								javax.swing.GroupLayout.Alignment.LEADING,
																								jPanel9Layout
																										.createSequentialGroup()
																										.addComponent(
																												jLabel37)
																										.addGap(
																												6,
																												6,
																												6)
																										.addComponent(
																												jLabel39)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												Short.MAX_VALUE)
																										.addComponent(
																												jLabel38))
																						.addComponent(
																								jButton36,
																								javax.swing.GroupLayout.Alignment.LEADING,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								88,
																								javax.swing.GroupLayout.PREFERRED_SIZE)))
														.addGroup(
																jPanel9Layout
																		.createSequentialGroup()
																		.addContainerGap()
																		.addComponent(
																				jLabel15)))
										.addContainerGap(71, Short.MAX_VALUE)));

		jPanel10.setBackground(new java.awt.Color(0, 0, 0));
		jPanel10.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(102, 102, 102)));

		jButton37.setBackground(new java.awt.Color(51, 51, 51));
		jButton37.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 22));
		jButton37.setForeground(new java.awt.Color(255, 255, 255));
		jButton37.setText("  \u60a8\u7684\u5546\u5e97 V  ");
		jButton37.setBorder(null);

		jButton38.setBackground(new java.awt.Color(51, 51, 51));
		jButton38.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 22));
		jButton38.setForeground(new java.awt.Color(255, 255, 255));
		jButton38.setText("  \u6e38\u620f V  ");
		jButton38.setBorder(null);

		jButton39.setBackground(new java.awt.Color(51, 51, 51));
		jButton39.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 22));
		jButton39.setForeground(new java.awt.Color(255, 255, 255));
		jButton39.setText("  \u8f6f\u4ef6 V  ");
		jButton39.setBorder(null);

		jButton40.setBackground(new java.awt.Color(51, 51, 51));
		jButton40.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 22));
		jButton40.setForeground(new java.awt.Color(255, 255, 255));
		jButton40.setText("  \u786c\u4ef6 V  ");
		jButton40.setBorder(null);

		jButton41.setBackground(new java.awt.Color(51, 51, 51));
		jButton41.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 22));
		jButton41.setForeground(new java.awt.Color(255, 255, 255));
		jButton41.setText("\u89c6\u9891 V ");
		jButton41.setBorder(null);

		jButton42.setBackground(new java.awt.Color(51, 51, 51));
		jButton42.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 22));
		jButton42.setForeground(new java.awt.Color(255, 255, 255));
		jButton42.setText(" \u65b0\u95fb V ");
		jButton42.setBorder(null);

		javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(
				jPanel10);
		jPanel10.setLayout(jPanel10Layout);
		jPanel10Layout
				.setHorizontalGroup(jPanel10Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel10Layout
										.createSequentialGroup()
										.addComponent(jButton37)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(jButton38)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jButton39)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(jButton40)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jButton41)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jButton42)));
		jPanel10Layout.setVerticalGroup(jPanel10Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel10Layout.createParallelGroup(
						javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(jButton37).addComponent(jButton38)
						.addComponent(jButton39).addComponent(jButton40)
						.addComponent(jButton41).addComponent(jButton42)));

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(
				jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout
				.setHorizontalGroup(jPanel2Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel2Layout
										.createSequentialGroup()
										.addGap(128, 128, 128)
										.addComponent(
												jPanel5,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																jPanel6,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGroup(
																jPanel2Layout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.TRAILING,
																				false)
																		.addComponent(
																				jPanel8,
																				javax.swing.GroupLayout.Alignment.LEADING,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addComponent(
																				jPanel9,
																				javax.swing.GroupLayout.Alignment.LEADING,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addComponent(
																				jPanel7,
																				javax.swing.GroupLayout.Alignment.LEADING,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE))))
						.addComponent(jPanel4,
								javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel2Layout
										.createSequentialGroup()
										.addContainerGap(896, Short.MAX_VALUE)
										.addComponent(
												jPanel10,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(237, 237, 237))
						.addGroup(
								jPanel2Layout
										.createSequentialGroup()
										.addComponent(
												jPanel3,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(1259, Short.MAX_VALUE)));
		jPanel2Layout
				.setVerticalGroup(jPanel2Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel2Layout
										.createSequentialGroup()
										.addComponent(
												jPanel3,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jPanel4,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(61, 61, 61)
										.addComponent(
												jPanel10,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																jPanel5,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addComponent(
																				jPanel6,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jPanel7,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(
												jPanel8,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jPanel9,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(93, 93, 93)));

		jScrollPane1.setViewportView(jPanel2);

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1985,
				Short.MAX_VALUE));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 996,
				Short.MAX_VALUE));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton17ActionPerformed(java.awt.event.ActionEvent evt)
			throws UnknownHostException, IOException, ClassNotFoundException,
			SQLException {
		// TODO add your handling code here:
		this.dispose();
		new game_view(u, i + 1).setVisible(true);
	}

	//获取id
	private void getid() {
		this.jButton47.setText(u.getId());
	}

	private void jButton47ActionPerformed(java.awt.event.ActionEvent evt)
			throws SQLException, ClassNotFoundException, IOException {
		// TODO add your handling code here:
		this.dispose();
		new person_view(u).setVisible(true);
	}

	private void jButton36MouseEntered(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
		this.jLabel15.setIcon(new javax.swing.ImageIcon("image\\推9.png"));
	}

	private void jButton35MouseEntered(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
		this.jLabel15.setIcon(new javax.swing.ImageIcon("image\\推8.png"));
	}

	private void jButton34MouseEntered(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
		this.jLabel15.setIcon(new javax.swing.ImageIcon("image\\推7.png"));
	}

	private void jButton33MouseEntered(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
		this.jLabel15.setIcon(new javax.swing.ImageIcon("image\\推6.png"));
	}

	private void jButton32MouseEntered(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
		this.jLabel15.setIcon(new javax.swing.ImageIcon("image\\推5.png"));
	}

	private void jButton31MouseEntered(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
		this.jLabel15.setIcon(new javax.swing.ImageIcon("image\\推4.png"));
	}

	private void jButton30MouseEntered(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
		this.jLabel15.setIcon(new javax.swing.ImageIcon("image\\推3.png"));
	}

	private void jButton29MouseEntered(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
		this.jLabel15.setIcon(new javax.swing.ImageIcon("image\\推2.png"));
	}

	private void jButton28MouseEntered(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
		this.jLabel15.setIcon(new javax.swing.ImageIcon("image\\推1.png"));
	}

	//轮播图
	private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		if (i == 2) {
			i = 0;
		} else {
			int j = i;
			i = j + 1;
		}
		this.jButton17.setIcon(new ImageIcon(img1.get(i)));
		this.jButton43.setIcon(new ImageIcon(img2.get(i)));
		this.jButton44.setIcon(new ImageIcon(img6.get(i)));
		this.jButton45.setIcon(new ImageIcon(img4.get(i)));
		this.jButton46.setIcon(new ImageIcon(img8.get(i)));
	}

	private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:	
		if (i == 0) {
			i = 2;
		} else {
			int j = i;
			i = j - 1;
		}
		this.jButton17.setIcon(new ImageIcon(img1.get(i)));
		this.jButton43.setIcon(new ImageIcon(img2.get(i)));
		this.jButton44.setIcon(new ImageIcon(img6.get(i)));
		this.jButton45.setIcon(new ImageIcon(img4.get(i)));
		this.jButton46.setIcon(new ImageIcon(img8.get(i)));
	}

	private void jButton46MouseEntered(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
		this.jButton17.setIcon(new ImageIcon(img9.get(i)));
	}

	private void jButton44MouseEntered(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
		this.jButton17.setIcon(new ImageIcon(img7.get(i)));
	}

	private void jButton45MouseEntered(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
		this.jButton17.setIcon(new ImageIcon(img5.get(i)));
	}

	private void jButton43MouseEntered(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
		this.jButton17.setIcon(new ImageIcon(img3.get(i)));
	}

	//社区按钮下显示
	private void jButton3MouseExited(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
		this.Community.setVisible(false);
	}

	private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
		Community.show(evt.getComponent(), this.jButton3.getX() - 165, jButton3
				.getY() + 35);
	}

	//库按钮下显示
	private void jButton2MouseExited(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
		this.Library.setVisible(false);
	}

	private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
		Library.show(evt.getComponent(), this.jButton2.getX() - 105, jButton2
				.getY() + 35);
	}

	//商店按钮下显示
	private void jButton1MouseExited(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
		this.Store.setVisible(false);
	}

	private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
		Store.show(evt.getComponent(), this.jButton1.getX() + 15, jButton1
				.getY() + 35);
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				//new main_view(null).setVisible(true);
			}
		});
	}

	//商店按钮下显示
	final JPopupMenu Store = new JPopupMenu();

	private void Store() {
		JMenuItem menuItem1 = new JMenuItem("  精选  ");
		JMenuItem menuItem2 = new JMenuItem("  浏览  ");
		JMenuItem menuItem3 = new JMenuItem("  新闻  ");

		Store.add(menuItem1);
		Store.add(menuItem2);
		Store.add(menuItem3);
	}

	//库钮下显示
	final JPopupMenu Library = new JPopupMenu();

	private void Library() {
		JMenuItem menuItem1 = new JMenuItem("  游戏  ");
		JMenuItem menuItem2 = new JMenuItem("  软件  ");
		JMenuItem menuItem3 = new JMenuItem("  下载  ");

		Library.add(menuItem1);
		Library.add(menuItem2);
		Library.add(menuItem3);
	}

	//社区钮下显示
	final JPopupMenu Community = new JPopupMenu();

	private void Community() {
		JMenuItem menuItem1 = new JMenuItem("  讨论  ");
		JMenuItem menuItem2 = new JMenuItem("  市场  ");
		JMenuItem menuItem3 = new JMenuItem("  视频  ");

		Community.add(menuItem1);
		Community.add(menuItem2);
		Community.add(menuItem3);
	}

	//轮播图
	int i;
	ArrayList<Image> img1 = new ArrayList<Image>();
	ArrayList<Image> img2 = new ArrayList<Image>();
	ArrayList<Image> img3 = new ArrayList<Image>();
	ArrayList<Image> img4 = new ArrayList<Image>();
	ArrayList<Image> img5 = new ArrayList<Image>();
	ArrayList<Image> img6 = new ArrayList<Image>();
	ArrayList<Image> img7 = new ArrayList<Image>();
	ArrayList<Image> img8 = new ArrayList<Image>();
	ArrayList<Image> img9 = new ArrayList<Image>();

	private void imgrote() {
		for (int i = 1; i <= 3; i++) {
			Image img22 = new ImageIcon("image\\主" + i + ".png").getImage()
					.getScaledInstance(this.jButton17.getWidth(),
							this.jButton17.getHeight(), Image.SCALE_SMOOTH);
			img1.add(img22);
		}
		for (int i = 1; i <= 3; i++) {
			Image img44 = new ImageIcon("image\\次a" + i + ".png").getImage()
					.getScaledInstance(this.jButton43.getWidth(),
							this.jButton43.getHeight(), Image.SCALE_SMOOTH);
			img2.add(img44);
			Image img55 = new ImageIcon("image\\次a" + i + ".png").getImage()
					.getScaledInstance(this.jButton17.getWidth(),
							this.jButton17.getHeight(), Image.SCALE_SMOOTH);
			img3.add(img55);
		}
		for (int i = 1; i <= 3; i++) {
			Image img66 = new ImageIcon("image\\次b" + i + ".png").getImage()
					.getScaledInstance(this.jButton45.getWidth(),
							this.jButton45.getHeight(), Image.SCALE_SMOOTH);
			img4.add(img66);
			Image img77 = new ImageIcon("image\\次b" + i + ".png").getImage()
					.getScaledInstance(this.jButton17.getWidth(),
							this.jButton17.getHeight(), Image.SCALE_SMOOTH);
			img5.add(img77);
		}
		for (int i = 1; i <= 3; i++) {
			Image img88 = new ImageIcon("image\\次c" + i + ".png").getImage()
					.getScaledInstance(this.jButton44.getWidth(),
							this.jButton44.getHeight(), Image.SCALE_SMOOTH);
			img6.add(img88);
			Image img99 = new ImageIcon("image\\次c" + i + ".png").getImage()
					.getScaledInstance(this.jButton17.getWidth(),
							this.jButton17.getHeight(), Image.SCALE_SMOOTH);
			img7.add(img99);
		}
		for (int i = 1; i <= 3; i++) {
			Image img10 = new ImageIcon("image\\次d" + i + ".png").getImage()
					.getScaledInstance(this.jButton46.getWidth(),
							this.jButton46.getHeight(), Image.SCALE_SMOOTH);
			img8.add(img10);
			Image img111 = new ImageIcon("image\\次d" + i + ".png").getImage()
					.getScaledInstance(this.jButton17.getWidth(),
							this.jButton17.getHeight(), Image.SCALE_SMOOTH);
			img9.add(img111);
		}
		this.jButton17.setIcon(new ImageIcon(img1.get(0)));
		this.jButton43.setIcon(new ImageIcon(img2.get(0)));
		this.jButton44.setIcon(new ImageIcon(img6.get(0)));
		this.jButton45.setIcon(new ImageIcon(img4.get(0)));
		this.jButton46.setIcon(new ImageIcon(img8.get(0)));
	}

	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			if (i == 3)
				i = 0;
			this.jButton17.setIcon(new ImageIcon(img1.get(i)));
			this.jButton43.setIcon(new ImageIcon(img2.get(i)));
			this.jButton44.setIcon(new ImageIcon(img6.get(i)));
			this.jButton45.setIcon(new ImageIcon(img4.get(i)));
			this.jButton46.setIcon(new ImageIcon(img8.get(i)));
			System.out.println(i);

			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			i++;
		}

	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
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
	private javax.swing.JButton jButton23;
	private javax.swing.JButton jButton24;
	private javax.swing.JButton jButton25;
	private javax.swing.JButton jButton26;
	private javax.swing.JButton jButton27;
	private javax.swing.JButton jButton28;
	private javax.swing.JButton jButton29;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton30;
	private javax.swing.JButton jButton31;
	private javax.swing.JButton jButton32;
	private javax.swing.JButton jButton33;
	private javax.swing.JButton jButton34;
	private javax.swing.JButton jButton35;
	private javax.swing.JButton jButton36;
	private javax.swing.JButton jButton37;
	private javax.swing.JButton jButton38;
	private javax.swing.JButton jButton39;
	private javax.swing.JButton jButton4;
	private javax.swing.JButton jButton40;
	private javax.swing.JButton jButton41;
	private javax.swing.JButton jButton42;
	private javax.swing.JButton jButton43;
	private javax.swing.JButton jButton44;
	private javax.swing.JButton jButton45;
	private javax.swing.JButton jButton46;
	private javax.swing.JButton jButton47;
	private javax.swing.JButton jButton5;
	private javax.swing.JButton jButton6;
	private javax.swing.JButton jButton7;
	private javax.swing.JButton jButton8;
	private javax.swing.JButton jButton9;
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
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel10;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JPanel jPanel4;
	private javax.swing.JPanel jPanel5;
	private javax.swing.JPanel jPanel6;
	private javax.swing.JPanel jPanel7;
	private javax.swing.JPanel jPanel8;
	private javax.swing.JPanel jPanel9;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JSeparator jSeparator1;
	// End of variables declaration//GEN-END:variables

}