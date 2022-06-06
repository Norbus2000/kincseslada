package nezet;

import adatok.Ladak;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import lada.Lada;

public class gui extends javax.swing.JFrame {

    String nemTalalt = " Nem talált";
    String talalt = " Talált";

    List<Lada> ladak = new ArrayList<>();

    Lada aranyLada;
    Lada ezustLada;
    Lada bronzLada;

    public gui() {
        initComponents();
        setResizable(false);

        aranyLada = new Lada("Arany", Ladak.ARANY, false);
        ezustLada = new Lada("Ezust", Ladak.ARANY, true);
        bronzLada = new Lada("Bronz", Ladak.BRONZ, false);

        ladak.add(aranyLada);
        ladak.add(ezustLada);
        ladak.add(bronzLada);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        szovegLbl = new javax.swing.JLabel();
        visszaJelzesLb = new javax.swing.JLabel();
        kerdesLbl = new javax.swing.JLabel();
        aranyszovegLbl = new javax.swing.JLabel();
        ezustszoveglbl = new javax.swing.JLabel();
        bronzSzovegLbl = new javax.swing.JLabel();
        aranyLbl = new javax.swing.JLabel();
        ezustlbl = new javax.swing.JLabel();
        bronzLbl = new javax.swing.JLabel();
        visszaJelzLbl = new javax.swing.JLabel();
        gombokPanel = new javax.swing.JPanel();
        bronzBtn = new javax.swing.JButton();
        ezustBtn = new javax.swing.JButton();
        aranyBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kincsesláda játék");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        szovegLbl.setText("3 láda közül az egyik rejti a kincset. Mindegyiken van egy felirat (ami nem változtatható, mert belevésték a ládába), de csak az egyik láda állítása igaz! ");

        kerdesLbl.setText("Ki rejti a kincset ?");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(szovegLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 828, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(visszaJelzesLb)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(kerdesLbl)
                .addGap(378, 378, 378))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(visszaJelzesLb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(szovegLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(kerdesLbl))
        );

        aranyszovegLbl.setText(Ladak.ARANY.toString());

        ezustszoveglbl.setText(Ladak.EZÜST.toString());

        bronzSzovegLbl.setText(Ladak.BRONZ.toString());

        aranyLbl.setText(Ladak.ARANY.name());

        ezustlbl.setText(Ladak.EZÜST.name());

        bronzLbl.setText(Ladak.BRONZ.name());

        gombokPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                none(evt);
            }
        });

        bronzBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/alap.png"))); // NOI18N
        bronzBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                none(evt);
            }
        });
        bronzBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bronzBtnActionPerformed(evt);
            }
        });

        ezustBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/alap.png"))); // NOI18N
        ezustBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                none(evt);
            }
        });
        ezustBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ezustBtnActionPerformed(evt);
            }
        });

        aranyBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/alap.png"))); // NOI18N
        aranyBtn.setMaximumSize(new java.awt.Dimension(919, 865));
        aranyBtn.setPreferredSize(new java.awt.Dimension(919, 865));
        aranyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aranyBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout gombokPanelLayout = new javax.swing.GroupLayout(gombokPanel);
        gombokPanel.setLayout(gombokPanelLayout);
        gombokPanelLayout.setHorizontalGroup(
            gombokPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gombokPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(aranyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ezustBtn)
                .addGap(107, 107, 107)
                .addComponent(bronzBtn)
                .addContainerGap())
        );
        gombokPanelLayout.setVerticalGroup(
            gombokPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gombokPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gombokPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(aranyBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(ezustBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bronzBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(gombokPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(aranyLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(aranyszovegLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(108, 108, 108)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(visszaJelzLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ezustszoveglbl, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ezustlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bronzSzovegLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bronzLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(visszaJelzLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aranyLbl)
                    .addComponent(ezustlbl)
                    .addComponent(bronzLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aranyszovegLbl)
                    .addComponent(ezustszoveglbl)
                    .addComponent(bronzSzovegLbl))
                .addGap(18, 18, 18)
                .addComponent(gombokPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void none(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_none

    }//GEN-LAST:event_none

    private void aranyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aranyBtnActionPerformed
        kepetAllit(visszajelzes(0), aranyBtn);
    }//GEN-LAST:event_aranyBtnActionPerformed

    private void ezustBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ezustBtnActionPerformed
        kepetAllit(visszajelzes(1), ezustBtn);
    }//GEN-LAST:event_ezustBtnActionPerformed

    private void bronzBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bronzBtnActionPerformed
       kepetAllit(visszajelzes(2), bronzBtn);
    }//GEN-LAST:event_bronzBtnActionPerformed

    private void kisablak(String uzenet) {
        JOptionPane.showMessageDialog(null, uzenet);
    }

    public boolean visszajelzes(int hanyadikElem) {

        if (ladak.get(hanyadikElem).isBenneVan()) {
            visszaJelzLbl.setText(talalt);
            visszaJelzLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
            kisablak(talalt);
            return true;
        } else {
            visszaJelzLbl.setText(nemTalalt);
            visszaJelzLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
            kisablak(nemTalalt);
            return false;
        }

    }
    
    private void kepetAllit (boolean BenneVan, JButton gomb) {
        if (BenneVan) {
            gomb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/kincses.png")));
            
        } else {
            gomb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/UresLada.png")));
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aranyBtn;
    private javax.swing.JLabel aranyLbl;
    private javax.swing.JLabel aranyszovegLbl;
    private javax.swing.JButton bronzBtn;
    private javax.swing.JLabel bronzLbl;
    private javax.swing.JLabel bronzSzovegLbl;
    private javax.swing.JButton ezustBtn;
    private javax.swing.JLabel ezustlbl;
    private javax.swing.JLabel ezustszoveglbl;
    private javax.swing.JPanel gombokPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel kerdesLbl;
    private javax.swing.JLabel szovegLbl;
    private javax.swing.JLabel visszaJelzLbl;
    private javax.swing.JLabel visszaJelzesLb;
    // End of variables declaration//GEN-END:variables
}
