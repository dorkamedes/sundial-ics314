/*
 * Copyright (c) 2013, Amy, Reginald, Bryce
 * All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 * 
 * 		Redistributions of source code must retain the above copyright notice, this
 * 		list of conditions and the following disclaimer.
 * 		
 * 		Redistributions in binary form must reproduce the above copyright
 * 		notice, this list of conditions and the following disclaimer in the
 * 		documentation and/or other materials provided with the distribution.
 * 		
 * 		Neither the name of the University of Hawaii, ICS Dept, nor the names
 * 		of its contributors	may be used to endorse or promote products derived
 * 		from this software without specific prior written permission.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */


package sundial;

import java.awt.Graphics2D;

/**
 * Sundial GUI main class. Draws out the sundial ONLY AFTER input has been
 * validated.
 * 
 * @author Amy
 * @author Reginald
 * @author briceorbryce
 */
public class SunDialFrame extends javax.swing.JFrame {
	/**SerialVersionUID*/
	private static final long serialVersionUID = 1L;

	/**Latitude*/
	private double latitude;
	/**Longitude*/
	private double longitude;
	/**Tooltip string*/
	private static final String popupLat = "Degrees-Minutes-Seconds"; //$NON-NLS-1$
	/**Tooltip string*/
	private static final String format = "Format: [Degrees][Minutes][Seconds]"; //$NON-NLS-1$

	/**
	 * Creates new form SunDialFrame
	 */
	public SunDialFrame() {
		initComponents();

		// Sets the location to the middle of the screen
		setLocationRelativeTo(null);
	}

	/**
	 * This is message is automatically generated by netbeans
	 * 
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	private void initComponents() {

		this.jPanelInfo = new javax.swing.JPanel();
		this.jComboBoxFractionOrDegArcSec = new javax.swing.JComboBox();
		this.jLabelLongitude = new javax.swing.JLabel();
		this.jLabelLatitude = new javax.swing.JLabel();
		this.jLabelLongDeg = new javax.swing.JLabel();
		this.jTextFieldLongitude = new javax.swing.JTextField();
		this.jTextFieldLatitude = new javax.swing.JTextField();
		this.jLabelDate = new javax.swing.JLabel();
		this.jLabelLatiDeg = new javax.swing.JLabel();
		this.jComboBoxMonth = new javax.swing.JComboBox();
		this.jComboBoxDay = new javax.swing.JComboBox();
		this.jButtonSearch = new javax.swing.JButton();
		this.jPanelSundial = new javax.swing.JPanel();
		this.jMenuBar = new javax.swing.JMenuBar();
		this.jMenuFile = new javax.swing.JMenu();
		this.jMenuItemPrint = new javax.swing.JMenuItem();
		this.jMenuHelp = new javax.swing.JMenu();
		this.jMenuItemAbout = new javax.swing.JMenuItem();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setResizable(false);

		this.jPanelInfo.setBackground(java.awt.Color.orange);

		this.jComboBoxFractionOrDegArcSec.setModel(new javax.swing.DefaultComboBoxModel(new String[] { SunDialFrame.popupLat, "Fractional Degrees" })); //$NON-NLS-1$
		this.jComboBoxFractionOrDegArcSec.setPreferredSize(new java.awt.Dimension(185, 20));

		this.jLabelLongitude.setText("Longitude:"); //$NON-NLS-1$

		this.jLabelLatitude.setText("Latitude:"); //$NON-NLS-1$

		this.jLabelLongDeg.setText("Degrees"); //$NON-NLS-1$

		this.jTextFieldLongitude.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				tooltipLongEnter(evt);
			}
			@Override
			public void mouseExited(java.awt.event.MouseEvent evt) {
				tooltipLongExit(evt);
			}
		});

		this.jTextFieldLatitude.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				tooltiplatitudeEnter(evt);
			}
			@Override
			public void mouseExited(java.awt.event.MouseEvent evt) {
				tooltipLatExit(evt);
			}
		});

		this.jLabelDate.setText("Date:"); //$NON-NLS-1$

		this.jLabelLatiDeg.setText("Degrees"); //$NON-NLS-1$

		this.jComboBoxMonth.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Month", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" })); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ //$NON-NLS-7$ //$NON-NLS-8$ //$NON-NLS-9$ //$NON-NLS-10$ //$NON-NLS-11$ //$NON-NLS-12$ //$NON-NLS-13$

		this.jComboBoxDay.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" })); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ //$NON-NLS-7$ //$NON-NLS-8$ //$NON-NLS-9$ //$NON-NLS-10$ //$NON-NLS-11$ //$NON-NLS-12$ //$NON-NLS-13$ //$NON-NLS-14$ //$NON-NLS-15$ //$NON-NLS-16$ //$NON-NLS-17$ //$NON-NLS-18$ //$NON-NLS-19$ //$NON-NLS-20$ //$NON-NLS-21$ //$NON-NLS-22$ //$NON-NLS-23$ //$NON-NLS-24$ //$NON-NLS-25$ //$NON-NLS-26$ //$NON-NLS-27$ //$NON-NLS-28$ //$NON-NLS-29$ //$NON-NLS-30$ //$NON-NLS-31$ //$NON-NLS-32$

		this.jButtonSearch.setText("Search"); //$NON-NLS-1$
		this.jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonSearchActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(this.jPanelSundial);
		this.jPanelSundial.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(
				jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 0, Short.MAX_VALUE)
				);
		jPanel2Layout.setVerticalGroup(
				jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 348, Short.MAX_VALUE)
				);

		javax.swing.GroupLayout jPanelInfoLayout = new javax.swing.GroupLayout(this.jPanelInfo);
		this.jPanelInfo.setLayout(jPanelInfoLayout);
		jPanelInfoLayout.setHorizontalGroup(
				jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInfoLayout.createSequentialGroup()
						.addContainerGap(171, Short.MAX_VALUE)
						.addGroup(jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(this.jLabelLatitude, javax.swing.GroupLayout.Alignment.TRAILING)
										.addComponent(this.jLabelLongitude, javax.swing.GroupLayout.Alignment.TRAILING))
										.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInfoLayout.createSequentialGroup()
												.addGap(24, 24, 24)
												.addComponent(this.jLabelDate)))
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addGroup(jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(this.jButtonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGroup(jPanelInfoLayout.createSequentialGroup()
																.addComponent(this.jTextFieldLatitude, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(this.jLabelLatiDeg)
																.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(this.jComboBoxFractionOrDegArcSec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
																.addGroup(jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
																		.addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelInfoLayout.createSequentialGroup()
																				.addComponent(this.jComboBoxMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																				.addComponent(this.jComboBoxDay, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
																				.addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelInfoLayout.createSequentialGroup()
																						.addComponent(this.jTextFieldLongitude, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(this.jLabelLongDeg))))
																						.addGap(120, 120, 120))
																						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInfoLayout.createSequentialGroup()
																								.addContainerGap()
																								.addComponent(this.jPanelSundial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
																								.addContainerGap())
				);
		jPanelInfoLayout.setVerticalGroup(
				jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanelInfoLayout.createSequentialGroup()
						.addContainerGap()
						.addGroup(jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(this.jLabelLatitude)
								.addComponent(this.jTextFieldLatitude, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(this.jLabelLatiDeg)
								.addComponent(this.jComboBoxFractionOrDegArcSec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(this.jTextFieldLongitude, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(this.jLabelLongitude)
										.addComponent(this.jLabelLongDeg))
										.addGap(18, 18, 18)
										.addGroup(jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(this.jLabelDate)
												.addComponent(this.jComboBoxMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(this.jComboBoxDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGap(18, 18, 18)
												.addComponent(this.jButtonSearch)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(this.jPanelSundial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addContainerGap())
				);

		this.jMenuFile.setText("File"); //$NON-NLS-1$

		this.jMenuItemPrint.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
		this.jMenuItemPrint.setText("Print"); //$NON-NLS-1$
		this.jMenuItemPrint.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItemPrintActionPerformed(evt);
			}
		});
		this.jMenuFile.add(this.jMenuItemPrint);

		this.jMenuBar.add(this.jMenuFile);

		this.jMenuHelp.setText("Help"); //$NON-NLS-1$

		this.jMenuItemAbout.setText("About"); //$NON-NLS-1$
		this.jMenuItemAbout.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItemAboutActionPerformed(evt);
			}
		});
		this.jMenuHelp.add(this.jMenuItemAbout);

		this.jMenuBar.add(this.jMenuHelp);

		setJMenuBar(this.jMenuBar);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(this.jPanelInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				);
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(this.jPanelInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				);

		pack();
	}

	/**
	 * Opens the about page.
	 * 
	 * @param evt clicked the about page
	 */
	public void jMenuItemAboutActionPerformed(java.awt.event.ActionEvent evt) {
		new AboutPage(this, this.rootPaneCheckingEnabled).setVisible(true);
	}

	/**
	 * When you mouse over the latitude text field, the tooltip is shown if
	 * degree/arc/sec is selected in the dropdown menu.
	 * 
	 * @param evt enters textbox
	 */
	public void tooltiplatitudeEnter(java.awt.event.MouseEvent evt) {
		if (this.jComboBoxFractionOrDegArcSec.getSelectedItem().equals(SunDialFrame.popupLat)) {
			this.jTextFieldLatitude.setToolTipText(SunDialFrame.format);
		}
	}

	/**
	 * When you move the mouse outside of the text field, set tooltip to null.
	 * 
	 * @param evt exits textbox
	 */
	public void tooltipLatExit(java.awt.event.MouseEvent evt) {
		if (this.jComboBoxFractionOrDegArcSec.getSelectedItem().equals(SunDialFrame.popupLat)) {
			this.jTextFieldLatitude.setToolTipText(null);
		}
	}

	/**
	 * Prints the gnomon.
	 * 
	 * @param evt print
	 */
	private static void jMenuItemPrintActionPerformed(java.awt.event.ActionEvent evt) {
		System.out.println("Can we print? =]"); //$NON-NLS-1$
	}

	/**
	 * When you mouse over the longitude text field, the tooltip is shown if
	 * degree/arc/sec is selected in the dropdown menu.
	 * 
	 * @param evt enters textbox
	 */
	public void tooltipLongEnter(java.awt.event.MouseEvent evt) {
		if (this.jComboBoxFractionOrDegArcSec.getSelectedItem().equals(SunDialFrame.popupLat)) {
			this.jTextFieldLongitude.setToolTipText(SunDialFrame.format);
		}
	}

	/**
	 * When you move the mouse outside of the text field, set tooltip to null.
	 * 
	 * @param evt leaves textbox
	 */
	public void tooltipLongExit(java.awt.event.MouseEvent evt) {
		if (this.jComboBoxFractionOrDegArcSec.getSelectedItem().equals(SunDialFrame.popupLat)) {
			this.jTextFieldLongitude.setToolTipText(null);
		}
	}

	/**
	 * User has hit search.
	 * 
	 * @param evt User hits search
	 */
	private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {
		//TODO error checking on months and days
		this.draw();
	}
	
	/**
	 * Draws out the sundial.
	 * 
	 */
	private void draw() {
		System.out.println("Edit me Amy"); //$NON-NLS-1$
		Graphics2D gfx = (Graphics2D)this.jPanelSundial.getGraphics();
		gfx.drawLine(0, 0, 100, 100);
	}

	/**
	 * Main method.
	 * 
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		/* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
		 * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) { //$NON-NLS-1$
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(SunDialFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(SunDialFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(SunDialFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(SunDialFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				new SunDialFrame().setVisible(true);
			}
		});
	}
	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton jButtonSearch;
	private javax.swing.JComboBox jComboBoxDay;
	private javax.swing.JComboBox jComboBoxFractionOrDegArcSec;
	private javax.swing.JComboBox jComboBoxMonth;
	private javax.swing.JLabel jLabelDate;
	private javax.swing.JLabel jLabelLatiDeg;
	private javax.swing.JLabel jLabelLatitude;
	private javax.swing.JLabel jLabelLongDeg;
	private javax.swing.JLabel jLabelLongitude;
	private javax.swing.JMenuBar jMenuBar;
	private javax.swing.JMenu jMenuFile;
	private javax.swing.JMenu jMenuHelp;
	private javax.swing.JMenuItem jMenuItemAbout;
	private javax.swing.JMenuItem jMenuItemPrint;
	private javax.swing.JPanel jPanelInfo;
	private javax.swing.JPanel jPanelSundial;
	private javax.swing.JTextField jTextFieldLatitude;
	private javax.swing.JTextField jTextFieldLongitude;
	// End of variables declaration//GEN-END:variables
}
