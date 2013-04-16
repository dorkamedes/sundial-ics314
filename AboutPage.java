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

/**
 * @author Amy
 * @author Reginald
 * @author briceorbryce
 */
public class AboutPage extends javax.swing.JDialog {

	/**SerialVersionUID*/
	private static final long serialVersionUID = 1L;


	/**
	 * Creates new form AboutPage
	 * 
	 * @param parent is SunDialFrame
	 * @param modal Automatically generated by Netbeans
	 */
	public AboutPage(java.awt.Frame parent, boolean modal) {
		super(parent, modal);
		initComponents();

		// Sets the location to the middle of the screen
		setLocationRelativeTo(null);
	}

	/**
	 * Initializes the components.
	 * 
	 * This is message is automatically generated by netbeans
	 * 
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	private void initComponents() {

		this.jPanelAll = new javax.swing.JPanel();
		this.jLabelAbout = new javax.swing.JLabel();
		this.jScrollPane1 = new javax.swing.JScrollPane();
		this.jTextArea1 = new javax.swing.JTextArea();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setResizable(false);
		addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				dispose(evt);
			}
		});

		this.jPanelAll.setBackground(new java.awt.Color(0, 0, 255));

		this.jLabelAbout.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N //$NON-NLS-1$
		this.jLabelAbout.setForeground(new java.awt.Color(240, 240, 240));
		this.jLabelAbout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		this.jLabelAbout.setText("About"); //$NON-NLS-1$

		this.jScrollPane1.setBorder(null);

		this.jTextArea1.setEditable(false);
		this.jTextArea1.setBackground(new java.awt.Color(0, 0, 255));
		this.jTextArea1.setColumns(20);
		this.jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
		this.jTextArea1.setLineWrap(true);
		this.jTextArea1.setRows(5);
		this.jTextArea1.setText("This ICS project is brought to you by Amy, Bryce, and Reginald."); //$NON-NLS-1$
		this.jTextArea1.setWrapStyleWord(true);
		this.jTextArea1.setBorder(null);
		this.jTextArea1.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				dispose(evt);
			}
		});
		this.jScrollPane1.setViewportView(this.jTextArea1);

		javax.swing.GroupLayout jPanelAllLayout = new javax.swing.GroupLayout(this.jPanelAll);
		this.jPanelAll.setLayout(jPanelAllLayout);
		jPanelAllLayout.setHorizontalGroup(
				jPanelAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(this.jLabelAbout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAllLayout.createSequentialGroup()
						.addContainerGap(75, Short.MAX_VALUE)
						.addComponent(this.jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap())
				);
		jPanelAllLayout.setVerticalGroup(
				jPanelAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanelAllLayout.createSequentialGroup()
						.addContainerGap()
						.addComponent(this.jLabelAbout)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(this.jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE))
				);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(this.jPanelAll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				);
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(this.jPanelAll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				);

		pack();
	}

	/**
	 * @param evt when the user clicks any part of the JDialog
	 */
	public void dispose(java.awt.event.MouseEvent evt) {
		// Closes the window when user clicks on it
		this.dispose();
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JLabel jLabelAbout;
	private javax.swing.JPanel jPanelAll;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTextArea jTextArea1;
	// End of variables declaration//GEN-END:variables
}
