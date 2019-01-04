/*
 * person_view.java
 *
 * Created on __DATE__, __TIME__
 */

package view;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.net.UnknownHostException;
import java.sql.Array;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import server.Client;

import model.Management;
import model.User;

/**
 *
 * @author  __USER__
 */
public class person_view extends javax.swing.JFrame {

	/** Creates new form person_view 
	 * @throws ClassNotFoundException 
	 * @throws SQLException */
	private User u;

	public person_view(User u) throws SQLException, ClassNotFoundException,
			IOException {
		this.u = u;
		initComponents();
		this.setLocationRelativeTo(null);
		this.jLabel6.setText(u.getUsername());
		//联动
		jCon(china);
		jCon1(city1);
		//查看个人信息
		datail();
		//头像
		//head_picture();
		loadImg();
		//用户已购游戏
		persongame_view();
		//排行榜
		list_view();
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jPanel2 = new javax.swing.JPanel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jButton3 = new javax.swing.JButton();
		jSeparator1 = new javax.swing.JSeparator();
		jTabbedPane1 = new javax.swing.JTabbedPane();
		jPanel3 = new javax.swing.JPanel();
		jLabel8 = new javax.swing.JLabel();
		jLabel9 = new javax.swing.JLabel();
		jSeparator2 = new javax.swing.JSeparator();
		jLabel10 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jLabel11 = new javax.swing.JLabel();
		jLabel12 = new javax.swing.JLabel();
		jLabel13 = new javax.swing.JLabel();
		jLabel14 = new javax.swing.JLabel();
		jLabel15 = new javax.swing.JLabel();
		jLabel16 = new javax.swing.JLabel();
		jLabel17 = new javax.swing.JLabel();
		jComboBox1 = new javax.swing.JComboBox();
		jLabel18 = new javax.swing.JLabel();
		jComboBox2 = new javax.swing.JComboBox();
		jLabel19 = new javax.swing.JLabel();
		jComboBox3 = new javax.swing.JComboBox();
		jLabel20 = new javax.swing.JLabel();
		jSeparator3 = new javax.swing.JSeparator();
		jLabel21 = new javax.swing.JLabel();
		jScrollPane2 = new javax.swing.JScrollPane();
		jTable2 = new javax.swing.JTable();
		jButton1 = new javax.swing.JButton();
		jLabel22 = new javax.swing.JLabel();
		jButton2 = new javax.swing.JButton();
		jPanel4 = new javax.swing.JPanel();
		jLabel23 = new javax.swing.JLabel();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();
		jPanel5 = new javax.swing.JPanel();
		jLabel24 = new javax.swing.JLabel();
		jLabel1 = new javax.swing.JLabel();
		jLabel25 = new javax.swing.JLabel();
		jLabel26 = new javax.swing.JLabel();
		jTextField2 = new javax.swing.JTextField();
		jSeparator4 = new javax.swing.JSeparator();
		jLabel27 = new javax.swing.JLabel();
		jButton4 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jPanel1.setBackground(new java.awt.Color(41, 45, 51));

		jPanel2.setBackground(new java.awt.Color(41, 45, 51));

		jLabel2.setFont(new java.awt.Font("Bauhaus 93", 3, 24));
		jLabel2.setForeground(new java.awt.Color(255, 255, 255));
		jLabel2.setText("Because of your creation and more perfect");

		jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 36));
		jLabel3.setForeground(new java.awt.Color(255, 255, 255));
		jLabel3
				.setText("\u56e0\u60a8\u7684\u521b\u9020\u800c\u66f4\u52a0\u5b8c\u7f8e");

		jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/view/image/建议头像.png"))); // NOI18N

		jLabel5.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jLabel5.setForeground(new java.awt.Color(51, 102, 255));
		jLabel5.setText("\u6b22\u8fce\u60a8\uff1a");

		jLabel6.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 20));
		jLabel6.setForeground(new java.awt.Color(255, 255, 255));
		jLabel6
				.setText("\u611f\u89c9\u4eba\u751f\u8fbe\u5230\u4e86\u5dc5\u5cf0");

		jLabel7.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jLabel7.setForeground(new java.awt.Color(0, 102, 255));
		jLabel7.setText("\u7528\u6237");

		jButton3.setBackground(new java.awt.Color(41, 45, 51));
		jButton3.setForeground(new java.awt.Color(41, 45, 51));
		jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/image/图标.png"))); // NOI18N
		jButton3.setBorder(null);
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

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
										.addComponent(jButton3)
										.addGap(8, 8, 8)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jLabel3)
														.addComponent(
																jLabel2,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																523,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												794, Short.MAX_VALUE)
										.addComponent(jLabel4)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel6,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				188,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jLabel7))
														.addComponent(jLabel5))
										.addGap(68, 68, 68)).addGroup(
								jPanel2Layout.createSequentialGroup().addGap(
										10, 10, 10).addComponent(jSeparator1,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										1898, Short.MAX_VALUE)
										.addContainerGap()));
		jPanel2Layout
				.setVerticalGroup(jPanel2Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel2Layout
										.createSequentialGroup()
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addGap(
																				47,
																				47,
																				47)
																		.addComponent(
																				jLabel3)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jLabel2))
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addGap(
																				39,
																				39,
																				39)
																		.addGroup(
																				jPanel2Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING,
																								false)
																						.addGroup(
																								jPanel2Layout
																										.createSequentialGroup()
																										.addComponent(
																												jLabel5)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												Short.MAX_VALUE)
																										.addGroup(
																												jPanel2Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.BASELINE)
																														.addComponent(
																																jLabel6)
																														.addComponent(
																																jLabel7)))
																						.addComponent(
																								jLabel4)))
														.addComponent(
																jButton3,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																177,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jSeparator1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												10,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)));

		jTabbedPane1.setBackground(new java.awt.Color(0, 204, 255));
		jTabbedPane1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));

		jPanel3.setBackground(new java.awt.Color(51, 51, 51));

		jLabel8.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 26));
		jLabel8.setForeground(new java.awt.Color(255, 255, 255));
		jLabel8.setText("123456");

		jLabel9.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 26));
		jLabel9.setForeground(new java.awt.Color(255, 255, 255));
		jLabel9.setText("ID\uff1a");

		jLabel10.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jLabel10.setForeground(new java.awt.Color(255, 255, 255));
		jLabel10.setText("\u771f\u5b9e\u59d3\u540d\uff1a");

		jTextField1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));

		jLabel11.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jLabel11.setForeground(new java.awt.Color(255, 255, 0));
		jLabel11.setText("\u5c0f\u91d1\u5e93\uff1a");

		jLabel12.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jLabel12.setForeground(new java.awt.Color(255, 255, 255));
		jLabel12.setText("12");

		jLabel13.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jLabel13.setForeground(new java.awt.Color(255, 255, 255));
		jLabel13.setText("\u5143");

		jLabel14.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jLabel14.setForeground(new java.awt.Color(255, 255, 255));
		jLabel14.setText("\u7528\u6237\u540d\uff1a");

		jLabel15.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jLabel15.setForeground(new java.awt.Color(255, 255, 255));
		jLabel15.setText("jLabel15");

		jLabel16.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jLabel16.setForeground(new java.awt.Color(255, 255, 255));
		jLabel16.setText("Email\uff1a");

		jLabel17.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jLabel17.setForeground(new java.awt.Color(255, 255, 255));
		jLabel17.setText("jLabel17");

		jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(
				new String[] { "中国" }));
		jComboBox1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jComboBox1ActionPerformed(evt);
			}
		});

		jLabel18.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jLabel18.setForeground(new java.awt.Color(255, 255, 255));
		jLabel18.setText("\u56fd\u5bb6\uff1a");

		jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"Item 1", "Item 2", "Item 3", "Item 4" }));
		jComboBox2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jComboBox2ActionPerformed(evt);
			}
		});

		jLabel19.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jLabel19.setForeground(new java.awt.Color(255, 255, 255));
		jLabel19.setText("\u7701\uff1a");

		jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"Item 1", "Item 2", "Item 3", "Item 4" }));

		jLabel20.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jLabel20.setForeground(new java.awt.Color(255, 255, 255));
		jLabel20.setText("\u5e02\uff1a");

		jLabel21.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jLabel21.setForeground(new java.awt.Color(255, 255, 255));
		jLabel21.setText("\u5df2\u8d2d\u4e70\u6e38\u620f\uff1a");

		jTable2.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null },
						{ null, null, null, null } }, new String[] { "Title 1",
						"Title 2", "Title 3", "Title 4" }));
		jScrollPane2.setViewportView(jTable2);

		jButton1.setBackground(new java.awt.Color(102, 102, 102));
		jButton1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jButton1.setForeground(new java.awt.Color(204, 204, 204));
		jButton1.setText("\u786e\u8ba4\u4fee\u6539");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					jButton1ActionPerformed(evt);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		jLabel22.setBackground(new java.awt.Color(255, 255, 255));

		jButton2.setBackground(new java.awt.Color(51, 51, 51));
		jButton2.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(153, 153, 153)));
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					jButton2ActionPerformed(evt);
				} catch (UnknownHostException e) {
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
										.addGap(156, 156, 156)
										.addGroup(
												jPanel3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addGroup(
																jPanel3Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel21)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jLabel22,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				279,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																jPanel3Layout
																		.createSequentialGroup()
																		.addComponent(
																				jScrollPane2,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				939,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(
																				328,
																				328,
																				328))
														.addGroup(
																jPanel3Layout
																		.createSequentialGroup()
																		.addGroup(
																				jPanel3Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addGroup(
																								jPanel3Layout
																										.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.LEADING,
																												false)
																										.addGroup(
																												jPanel3Layout
																														.createSequentialGroup()
																														.addComponent(
																																jLabel18)
																														.addPreferredGap(
																																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																														.addComponent(
																																jComboBox1,
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																javax.swing.GroupLayout.PREFERRED_SIZE)
																														.addGap(
																																126,
																																126,
																																126)
																														.addComponent(
																																jLabel19)
																														.addPreferredGap(
																																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																														.addComponent(
																																jComboBox2,
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																javax.swing.GroupLayout.PREFERRED_SIZE))
																										.addGroup(
																												jPanel3Layout
																														.createSequentialGroup()
																														.addComponent(
																																jLabel9)
																														.addPreferredGap(
																																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																														.addComponent(
																																jLabel8))
																										.addGroup(
																												jPanel3Layout
																														.createSequentialGroup()
																														.addGroup(
																																jPanel3Layout
																																		.createParallelGroup(
																																				javax.swing.GroupLayout.Alignment.LEADING)
																																		.addGroup(
																																				jPanel3Layout
																																						.createSequentialGroup()
																																						.addComponent(
																																								jLabel14)
																																						.addGap(
																																								27,
																																								27,
																																								27)
																																						.addComponent(
																																								jLabel15))
																																		.addGroup(
																																				jPanel3Layout
																																						.createSequentialGroup()
																																						.addComponent(
																																								jLabel10)
																																						.addPreferredGap(
																																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																						.addComponent(
																																								jTextField1,
																																								javax.swing.GroupLayout.PREFERRED_SIZE,
																																								228,
																																								javax.swing.GroupLayout.PREFERRED_SIZE)))
																														.addGap(
																																186,
																																186,
																																186)
																														.addGroup(
																																jPanel3Layout
																																		.createParallelGroup(
																																				javax.swing.GroupLayout.Alignment.LEADING)
																																		.addGroup(
																																				jPanel3Layout
																																						.createSequentialGroup()
																																						.addComponent(
																																								jLabel11)
																																						.addPreferredGap(
																																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																						.addComponent(
																																								jLabel12,
																																								javax.swing.GroupLayout.PREFERRED_SIZE,
																																								58,
																																								javax.swing.GroupLayout.PREFERRED_SIZE)
																																						.addPreferredGap(
																																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																						.addComponent(
																																								jLabel13))
																																		.addGroup(
																																				jPanel3Layout
																																						.createSequentialGroup()
																																						.addComponent(
																																								jLabel16)
																																						.addPreferredGap(
																																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																						.addComponent(
																																								jLabel17,
																																								javax.swing.GroupLayout.PREFERRED_SIZE,
																																								213,
																																								javax.swing.GroupLayout.PREFERRED_SIZE))
																																		.addGroup(
																																				jPanel3Layout
																																						.createSequentialGroup()
																																						.addComponent(
																																								jLabel20)
																																						.addPreferredGap(
																																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																						.addComponent(
																																								jComboBox3,
																																								javax.swing.GroupLayout.PREFERRED_SIZE,
																																								190,
																																								javax.swing.GroupLayout.PREFERRED_SIZE))))
																										.addComponent(
																												jSeparator3,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												923,
																												Short.MAX_VALUE)
																										.addComponent(
																												jSeparator2))
																						.addGroup(
																								jPanel3Layout
																										.createSequentialGroup()
																										.addGap(
																												752,
																												752,
																												752)
																										.addComponent(
																												jButton1)))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addComponent(
																				jButton2,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				270,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(
																				32,
																				32,
																				32)))
										.addContainerGap(82, Short.MAX_VALUE)));
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
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel3Layout
																		.createSequentialGroup()
																		.addGap(
																				86,
																				86,
																				86)
																		.addGroup(
																				jPanel3Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								jLabel9)
																						.addComponent(
																								jLabel8))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jSeparator2,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				10,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(
																				65,
																				65,
																				65)
																		.addGroup(
																				jPanel3Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jLabel14)
																						.addGroup(
																								jPanel3Layout
																										.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.BASELINE)
																										.addComponent(
																												jLabel15)
																										.addComponent(
																												jLabel16)
																										.addComponent(
																												jLabel17)))
																		.addGroup(
																				jPanel3Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addGroup(
																								jPanel3Layout
																										.createSequentialGroup()
																										.addGap(
																												38,
																												38,
																												38)
																										.addGroup(
																												jPanel3Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.BASELINE)
																														.addComponent(
																																jLabel10)
																														.addComponent(
																																jTextField1,
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																javax.swing.GroupLayout.PREFERRED_SIZE)))
																						.addGroup(
																								jPanel3Layout
																										.createSequentialGroup()
																										.addGap(
																												30,
																												30,
																												30)
																										.addGroup(
																												jPanel3Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.BASELINE)
																														.addComponent(
																																jLabel11)
																														.addComponent(
																																jLabel12,
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																35,
																																javax.swing.GroupLayout.PREFERRED_SIZE)
																														.addComponent(
																																jLabel13))))
																		.addGap(
																				39,
																				39,
																				39)
																		.addGroup(
																				jPanel3Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								jComboBox1,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								jLabel18)
																						.addComponent(
																								jComboBox2,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								jLabel19)
																						.addComponent(
																								jLabel20)
																						.addComponent(
																								jComboBox3,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addGap(
																				35,
																				35,
																				35)
																		.addComponent(
																				jButton1)
																		.addGap(
																				18,
																				18,
																				18)
																		.addComponent(
																				jSeparator3,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				10,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(
																				27,
																				27,
																				27)
																		.addComponent(
																				jLabel21))
														.addGroup(
																jPanel3Layout
																		.createSequentialGroup()
																		.addGap(
																				39,
																				39,
																				39)
																		.addComponent(
																				jLabel22,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				26,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(
																				74,
																				74,
																				74)
																		.addComponent(
																				jButton2,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				300,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addGap(30, 30, 30)
										.addComponent(
												jScrollPane2,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												92,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(50, Short.MAX_VALUE)));

		jTabbedPane1.addTab(" \u4e2a\u4eba\u4fe1\u606f ", jPanel3);

		jPanel4.setBackground(new java.awt.Color(51, 51, 51));

		jLabel23.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jLabel23.setForeground(new java.awt.Color(255, 255, 255));
		jLabel23.setText("\u6e38\u620f\u6392\u884c\u699c\uff1a");

		jTable1.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null },
						{ null, null, null, null } }, new String[] { "Title 1",
						"Title 2", "Title 3", "Title 4" }));
		jScrollPane1.setViewportView(jTable1);

		javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(
				jPanel4);
		jPanel4.setLayout(jPanel4Layout);
		jPanel4Layout
				.setHorizontalGroup(jPanel4Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel4Layout
										.createSequentialGroup()
										.addGap(82, 82, 82)
										.addGroup(
												jPanel4Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																jScrollPane1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																1345,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel23))
										.addContainerGap(78, Short.MAX_VALUE)));
		jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel4Layout.createSequentialGroup().addGap(59, 59, 59)
						.addComponent(jLabel23).addGap(35, 35, 35)
						.addComponent(jScrollPane1,
								javax.swing.GroupLayout.PREFERRED_SIZE, 482,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(80, Short.MAX_VALUE)));

		jTabbedPane1.addTab(" \u6392\u884c\u699c ", jPanel4);

		jPanel5.setBackground(new java.awt.Color(51, 51, 51));

		jLabel24.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 36));
		jLabel24.setForeground(new java.awt.Color(255, 255, 255));
		jLabel24.setText("\u5145\u503c\uff1a");

		jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/image/二维码.png"))); // NOI18N

		jLabel25.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jLabel25.setForeground(new java.awt.Color(255, 255, 0));
		jLabel25.setText("\u5145\u503c\u91d1\u989d\uff1a");

		jLabel26.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jLabel26.setForeground(new java.awt.Color(255, 255, 255));
		jLabel26.setText("\u5143");

		jTextField2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));

		jLabel27.setForeground(new java.awt.Color(153, 153, 153));
		jLabel27
				.setText("\u5982\u679c\u6709\u7591\u95ee\uff0c\u8bf7\u54a8\u8be2F4\u5ba2\u670d\uff01");

		jButton4.setBackground(new java.awt.Color(0, 102, 255));
		jButton4.setForeground(new java.awt.Color(255, 255, 255));
		jButton4.setText("\u786e\u8ba4\u5145\u503c");
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					jButton4ActionPerformed(evt);
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

		javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(
				jPanel5);
		jPanel5.setLayout(jPanel5Layout);
		jPanel5Layout
				.setHorizontalGroup(jPanel5Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel5Layout.createSequentialGroup().addGap(
										135, 135, 135).addComponent(jLabel24)
										.addContainerGap(1262, Short.MAX_VALUE))
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel5Layout
										.createSequentialGroup()
										.addContainerGap(233, Short.MAX_VALUE)
										.addComponent(jLabel1)
										.addGroup(
												jPanel5Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel5Layout
																		.createSequentialGroup()
																		.addGroup(
																				jPanel5Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addGroup(
																								jPanel5Layout
																										.createSequentialGroup()
																										.addGap(
																												142,
																												142,
																												142)
																										.addGroup(
																												jPanel5Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.LEADING)
																														.addComponent(
																																jSeparator4,
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																505,
																																javax.swing.GroupLayout.PREFERRED_SIZE)
																														.addComponent(
																																jLabel25)
																														.addComponent(
																																jLabel27)))
																						.addGroup(
																								jPanel5Layout
																										.createSequentialGroup()
																										.addGap(
																												208,
																												208,
																												208)
																										.addComponent(
																												jButton4,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												348,
																												javax.swing.GroupLayout.PREFERRED_SIZE)))
																		.addGap(
																				329,
																				329,
																				329))
														.addGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																jPanel5Layout
																		.createSequentialGroup()
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																				479,
																				Short.MAX_VALUE)
																		.addComponent(
																				jTextField2,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				101,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(
																				33,
																				33,
																				33)
																		.addComponent(
																				jLabel26)
																		.addGap(
																				339,
																				339,
																				339)))));
		jPanel5Layout
				.setVerticalGroup(jPanel5Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel5Layout
										.createSequentialGroup()
										.addGap(90, 90, 90)
										.addComponent(jLabel24)
										.addGap(107, 107, 107)
										.addGroup(
												jPanel5Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addGroup(
																jPanel5Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel25)
																		.addGap(
																				34,
																				34,
																				34)
																		.addGroup(
																				jPanel5Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								jTextField2,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								jLabel26))
																		.addGap(
																				48,
																				48,
																				48)
																		.addComponent(
																				jSeparator4,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				10,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jButton4,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				47,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addComponent(
																				jLabel27))
														.addComponent(jLabel1))
										.addContainerGap(147, Short.MAX_VALUE)));

		jTabbedPane1.addTab(" \u5145\u503c ", jPanel5);

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel2, javax.swing.GroupLayout.Alignment.TRAILING,
				javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addGroup(
						javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel1Layout.createSequentialGroup().addContainerGap(
								212, Short.MAX_VALUE).addComponent(
								jTabbedPane1,
								javax.swing.GroupLayout.PREFERRED_SIZE, 1510,
								javax.swing.GroupLayout.PREFERRED_SIZE).addGap(
								201, 201, 201)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel1Layout.createSequentialGroup().addComponent(jPanel2,
						javax.swing.GroupLayout.PREFERRED_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.PREFERRED_SIZE).addGap(18, 18,
						18).addComponent(jTabbedPane1,
						javax.swing.GroupLayout.PREFERRED_SIZE, 734,
						javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)));

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

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt)
			throws UnknownHostException, IOException, ClassNotFoundException, SQLException {
		// TODO add your handling code here:
		Client c = new Client();
		String[] message = c.person_massage(u.getId());
		int money = Integer.parseInt(message[5]);
		int newmoney = money + Integer.parseInt(this.jTextField2.getText());
		Client c2 = new Client();
		c2.buy(u.getId(), String.valueOf(newmoney));
		datail();
		JOptionPane.showMessageDialog(this, "充值成功！");
	}

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		this.dispose();
		new main_view(u).setVisible(true);
	}

	//排行榜
	private void list_view() throws UnknownHostException, IOException,
			ClassNotFoundException {
		Client c = new Client();
		String[][] message = c.messagegame();
		int i, j;
		String[] min;
		for (i = 0; i < message.length - 1; i++) {
			for (j = 0; j < message.length - 1 - i; j++) {
				if (Integer.valueOf(message[j][9]).intValue() < Integer
						.valueOf(message[j + 1][9]).intValue()) {
					min = message[j];
					message[j] = message[j + 1];
					message[j + 1] = min;
				}
			}
		}
		String[] tableString = { "id", "游戏名", "价格", "游戏地址", "游戏介绍", "状态",
				"上传时间", "发布商家", "下载量", "收藏度" };
		this.jTable1.setModel(new DefaultTableModel(message, tableString));
		DefaultTableCellRenderer cr = new DefaultTableCellRenderer();
		cr.setHorizontalAlignment(JLabel.CENTER);
		this.jTable1.setDefaultRenderer(Object.class, cr);

	}

	//修改个人信息
	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)
			throws IOException {
		// TODO add your handling code here:
		Client c = new Client();
		String realname = this.jTextField1.getText();
		String countrie = (String) this.jComboBox1.getSelectedItem();
		String priovince = (String) this.jComboBox2.getSelectedItem();
		String city = (String) this.jComboBox3.getSelectedItem();
		c.modify(u.getId(), realname, countrie, priovince, city);
		JOptionPane.showMessageDialog(this, "修改个人信息成功！");
	}

	//查看已购买游戏
	private void persongame_view() throws UnknownHostException, IOException,
			ClassNotFoundException, SQLException {
		Client c = new Client();
		Object[][] data = (Object[][]) c.persongame(u.getId());
		String[] tableString = { "id", "账号名称", "所购买的游戏", "购买时间" };
		this.jTable2.setModel(new DefaultTableModel(data, tableString));
		DefaultTableCellRenderer cr = new DefaultTableCellRenderer();
		cr.setHorizontalAlignment(JLabel.CENTER);
		this.jTable2.setDefaultRenderer(Object.class, cr);
	}

	//上传头像
	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt)
			throws UnknownHostException, IOException {
		// TODO add your handling code here:
		JFileChooser jfc = new JFileChooser();
		jfc.showOpenDialog(null);
		File f = jfc.getSelectedFile();
		if (!f.exists())
			JOptionPane.showMessageDialog(this, "img no exists");
		else if (f.getAbsolutePath().endsWith(".jpg")) {
			ImageIcon image = new ImageIcon(f.getAbsolutePath());
			// image.setImage(image.getImage().getScaledInstance(width, height,Image.SCALE_DEFAULT));
			Image img = image.getImage();
			img = img.getScaledInstance(this.jButton2.getWidth(), this.jButton2
					.getHeight(), Image.SCALE_DEFAULT);
			image.setImage(img);
			this.jButton2.setIcon(image);
			JOptionPane.showMessageDialog(this, "上传头像成功！");
		} else {
			JOptionPane.showMessageDialog(this, "img format not allow");
		}
		Client c;
		c = new Client();
		c.uploadFile(u.getUsername(), f);
	}

	//获取头像
	private void loadImg() throws UnknownHostException, IOException {

		ImageIcon image = new ImageIcon("image\\头像.png");
		// image.setImage(image.getImage().getScaledInstance(width, height,Image.SCALE_DEFAULT));
		Image img = image.getImage();
		img = img.getScaledInstance(this.jButton2.getWidth(), this.jButton2
				.getHeight(), Image.SCALE_DEFAULT);
		image.setImage(img);
		this.jButton2.setIcon(image);

		File f = new File("c:\\F4\\"
				+ u.getUsername() + ".jpg");
		if (!f.exists() || f.length() == 0) {
			Client c = new Client();
			f = new File("c:\\F4\\"
					+ u.getUsername() + ".jpg");
			c.loadFile(u.getUsername(), f);
		}
		if (f.exists() && f.length() != 0) {
			ImageIcon image1 = new ImageIcon(f.getAbsolutePath());
			// image.setImage(image.getImage().getScaledInstance(width, height,Image.SCALE_DEFAULT));
			Image img1 = image1.getImage();
			img1 = img1.getScaledInstance(this.jButton2.getWidth(),
					this.jButton2.getHeight(), Image.SCALE_DEFAULT);
			image1.setImage(img1);
			this.jButton2.setIcon(image1);
		}
	}

	/*//获取个人头像
	private void head_picture() throws SQLException, ClassNotFoundException {
		String Head = User.getHead(u.getId());
		if (Head != null) {
			ImageIcon image = new ImageIcon("image\\头像.png");
			// image.setImage(image.getImage().getScaledInstance(width, height,Image.SCALE_DEFAULT));
			Image img = image.getImage();
			img = img.getScaledInstance(this.jButton2.getWidth(), this.jButton2
					.getHeight(), Image.SCALE_DEFAULT);
			image.setImage(img);
			this.jButton2.setIcon(image);
		} else {
			ImageIcon image = new ImageIcon(Head);
			// image.setImage(image.getImage().getScaledInstance(width, height,Image.SCALE_DEFAULT));
			Image img = image.getImage();
			img = img.getScaledInstance(this.jButton2.getWidth(), this.jButton2
					.getHeight(), Image.SCALE_DEFAULT);
			image.setImage(img);
			this.jButton2.setIcon(image);
		}
	}*/

	//查看个人信息
	private void datail() throws SQLException, ClassNotFoundException,
			IOException {
		//String[] massage = User.view_information(u.getId());
		Client a = new Client();
		String[] massage = a.person_massage(u.getId());
		this.jLabel8.setText(massage[0]);
		this.jLabel15.setText(massage[1]);
		this.jLabel17.setText(massage[2]);
		this.jTextField1.setText(massage[3]);
		this.jLabel12.setText(massage[5]);
		int c = 0;
		for (int i = 0; i < china.length; i++) {
			if (china[i].equals(massage[6])) {
				this.jComboBox2.setSelectedIndex(i);
				c = i + 1;
			}
		}
		if (c == 1) {
			for (int i = 0; i < city1.length; i++) {
				if (city1[i].equals(massage[7])) {
					this.jComboBox3.setSelectedIndex(i);
				}
			}
		}
		if (c == 2) {
			for (int i = 0; i < city2.length; i++) {
				if (city2[i].equals(massage[7])) {
					this.jComboBox3.setSelectedIndex(i);
				}
			}
		}
		if (c == 3) {
			for (int i = 0; i < city3.length; i++) {
				if (city3[i].equals(massage[7])) {
					this.jComboBox3.setSelectedIndex(i);
				}
			}
		}
		if (c == 4) {
			for (int i = 0; i < city4.length; i++) {
				if (city4[i].equals(massage[7])) {
					this.jComboBox3.setSelectedIndex(i);
				}
			}
		}
	}

	//联动
	private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		int item = this.jComboBox2.getSelectedIndex();
		switch (item) {
		case 0:
			jCon1(city1);
			break;
		case 1:
			jCon1(city2);
			break;
		case 2:
			jCon1(city3);
			break;
		case 3:
			jCon1(city4);
			break;
		}
	}

	private String[] china = { "广东省", "福建省", "湖南省", "浙江省" };
	private String[] city1 = { "广州市", "深圳市", "珠海市", "汕头市", "佛山市", "韶关市", "湛江市",
			"肇庆市", "江门市", "茂名市", "惠州市", "梅州市", "汕尾市", "河源市", "阳江市", "清远市",
			"东莞市", "中山市", "潮州市", "揭阳市", "云浮市" };
	private String[] city2 = { "福州市", "厦门市", "泉州市", "漳州市", "龙岩市", "三明市", "莆田市",
			"宁德市", "南平市" };
	private String[] city3 = { "长沙市", "株洲市", "湘潭市", "衡阳市", "邵阳市", "岳阳市", "常德市",
			"张家界市", "益阳市", "娄底市", "郴州市", "永州市", "怀化市", "湘西土家族苗族自治州" };
	private String[] city4 = { "杭州市", "宁波市", "温州市", "绍兴市", "湖州市", "嘉兴市", "金华市",
			"衢州市", "台州市", "丽水市", "舟山市" };

	private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		int item = this.jComboBox1.getSelectedIndex();
		switch (item) {
		case 0:
			jCon(china);
			break;
		}
	}

	private void jCon(String count[]) {
		this.jComboBox2.removeAllItems();
		for (int i = 0; i < china.length; i++) {
			this.jComboBox2.addItem(count[i]);
		}
	}

	private void jCon1(String count[]) {
		this.jComboBox3.removeAllItems();
		for (int i = 0; i < count.length; i++) {
			this.jComboBox3.addItem(count[i]);
		}
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JComboBox jComboBox1;
	private javax.swing.JComboBox jComboBox2;
	private javax.swing.JComboBox jComboBox3;
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
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JPanel jPanel4;
	private javax.swing.JPanel jPanel5;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JSeparator jSeparator1;
	private javax.swing.JSeparator jSeparator2;
	private javax.swing.JSeparator jSeparator3;
	private javax.swing.JSeparator jSeparator4;
	private javax.swing.JTabbedPane jTabbedPane1;
	private javax.swing.JTable jTable1;
	private javax.swing.JTable jTable2;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	// End of variables declaration//GEN-END:variables

}