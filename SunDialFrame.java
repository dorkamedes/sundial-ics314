package sundial;

/**
<<<<<<< HEAD
 * <( X_X <)
=======
>>>>>>> 8300f5cded35ca70e54ad61e2a67b23909ded4e2
 * check me amy
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

		this.jLabelLatitude = new javax.swing.JLabel();
		this.jLabelLongitude = new javax.swing.JLabel();
		this.jLabelDate = new javax.swing.JLabel();
		this.jTextFieldLatitude = new javax.swing.JTextField();
		this.jTextFieldDate = new javax.swing.JTextField();
		this.jTextFieldLongitude = new javax.swing.JTextField();
		this.jButtonSearch = new javax.swing.JButton();
		this.jLabelLatiDeg = new javax.swing.JLabel();
		this.jLabelLongDeg = new javax.swing.JLabel();
		this.jLabelDateMDY = new javax.swing.JLabel();
		this.jComboBoxFractionOrDegArcSec = new javax.swing.JComboBox();
		this.jMenuBar = new javax.swing.JMenuBar();
		this.jMenuFile = new javax.swing.JMenu();
		this.jMenuItemPrint = new javax.swing.JMenuItem();
		this.jMenuHelp = new javax.swing.JMenu();
		this.jMenuItemAbout = new javax.swing.JMenuItem();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setResizable(false);

		this.jLabelLatitude.setText("Latitude:"); //$NON-NLS-1$

		this.jLabelLongitude.setText("Longitude:"); //$NON-NLS-1$

		this.jLabelDate.setText("Date:"); //$NON-NLS-1$

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

		this.jButtonSearch.setText("Search"); //$NON-NLS-1$

		this.jLabelLatiDeg.setText("Degrees"); //$NON-NLS-1$

		this.jLabelLongDeg.setText("Degrees"); //$NON-NLS-1$

		this.jLabelDateMDY.setText("mm/dd/yyyy"); //$NON-NLS-1$

		this.jComboBoxFractionOrDegArcSec.setModel(new javax.swing.DefaultComboBoxModel(new String[] { SunDialFrame.popupLat, "Fractional Degrees" })); //$NON-NLS-1$
		this.jComboBoxFractionOrDegArcSec.setPreferredSize(new java.awt.Dimension(185, 20));

		this.jMenuFile.setText("File"); //$NON-NLS-1$

		this.jMenuItemPrint.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
		this.jMenuItemPrint.setText("Print"); //$NON-NLS-1$
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
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
						.addGap(172, 172, 172)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(this.jLabelLatitude, javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(this.jLabelLongitude, javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(this.jLabelDate, javax.swing.GroupLayout.Alignment.TRAILING))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(layout.createSequentialGroup()
												.addComponent(this.jTextFieldLatitude, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(this.jLabelLatiDeg)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(this.jComboBoxFractionOrDegArcSec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
												.addComponent(this.jButtonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGroup(layout.createSequentialGroup()
														.addComponent(this.jTextFieldLongitude, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(this.jLabelLongDeg))
														.addGroup(layout.createSequentialGroup()
																.addComponent(this.jTextFieldDate, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(this.jLabelDateMDY)))
																.addContainerGap(119, Short.MAX_VALUE))
				);
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addContainerGap()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(this.jLabelLatitude)
								.addComponent(this.jTextFieldLatitude, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(this.jLabelLatiDeg)
								.addComponent(this.jComboBoxFractionOrDegArcSec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(this.jTextFieldLongitude, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(this.jLabelLongitude)
										.addComponent(this.jLabelLongDeg))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(this.jLabelDate)
												.addComponent(this.jTextFieldDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(this.jLabelDateMDY))
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(this.jButtonSearch)
												.addContainerGap(400, Short.MAX_VALUE))
				);

		pack();
	}

	/**
	 * @param evt clicked the about page
	 */
	public void jMenuItemAboutActionPerformed(java.awt.event.ActionEvent evt) {
		new AboutPage(this, this.rootPaneCheckingEnabled).setVisible(true);
	}

	/**
	 * @param evt enters textbox
	 */
	public void tooltiplatitudeEnter(java.awt.event.MouseEvent evt) {
		if (this.jComboBoxFractionOrDegArcSec.getSelectedItem().equals(SunDialFrame.popupLat)) {
			this.jTextFieldLatitude.setToolTipText(SunDialFrame.format);
		}
	}

	/**
	 * @param evt exits textbox
	 */
	public void tooltipLatExit(java.awt.event.MouseEvent evt) {
		if (this.jComboBoxFractionOrDegArcSec.getSelectedItem().equals(SunDialFrame.popupLat)) {
			this.jTextFieldLatitude.setToolTipText(null);
		}
	}

	/**
	 * @param evt enters textbox
	 */
	public void tooltipLongEnter(java.awt.event.MouseEvent evt) {
		if (this.jComboBoxFractionOrDegArcSec.getSelectedItem().equals(SunDialFrame.popupLat)) {
			this.jTextFieldLongitude.setToolTipText(SunDialFrame.format);
		}
	}

	/**
	 * @param evt leaves textbox
	 */
	public void tooltipLongExit(java.awt.event.MouseEvent evt) {
		if (this.jComboBoxFractionOrDegArcSec.getSelectedItem().equals(SunDialFrame.popupLat)) {
			this.jTextFieldLongitude.setToolTipText(null);
		}
	}

	/**
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
	private javax.swing.JComboBox jComboBoxFractionOrDegArcSec;
	private javax.swing.JLabel jLabelDate;
	private javax.swing.JLabel jLabelDateMDY;
	private javax.swing.JLabel jLabelLatiDeg;
	private javax.swing.JLabel jLabelLatitude;
	private javax.swing.JLabel jLabelLongDeg;
	private javax.swing.JLabel jLabelLongitude;
	private javax.swing.JMenuBar jMenuBar;
	private javax.swing.JMenu jMenuFile;
	private javax.swing.JMenu jMenuHelp;
	private javax.swing.JMenuItem jMenuItemAbout;
	private javax.swing.JMenuItem jMenuItemPrint;
	private javax.swing.JTextField jTextFieldDate;
	private javax.swing.JTextField jTextFieldLatitude;
	private javax.swing.JTextField jTextFieldLongitude;
	// End of variables declaration//GEN-END:variables
}
