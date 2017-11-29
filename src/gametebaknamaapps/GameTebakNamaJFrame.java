
package gametebaknamaapps;

import com.sun.corba.se.impl.orb.ParserTable;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class GameTebakNamaJFrame extends javax.swing.JFrame {

    String namaAcak;
    String Soal;
    int kesempatan;
    int nilai;
    NamaGenerator gen = new NamaGenerator();
    WordModel wordmodel = new WordModel();
    int hint;
    /**
     * Creates new form GameTebakNama
     */
    public GameTebakNamaJFrame() {
        initComponents();
        JawabanTextField.setEnabled(false);
        TesButton.setEnabled(false);
        kesempatan=5;
        nilai = 0;
        hint = 3;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        MulaiButton = new javax.swing.JButton();
        SoalLabel = new javax.swing.JLabel();
        JawabanTextField = new javax.swing.JTextField();
        PetunjukLabel = new javax.swing.JLabel();
        TesButton = new javax.swing.JButton();
        KesempatanLabel = new javax.swing.JLabel();
        HintButton = new javax.swing.JButton();
        HintLabel = new javax.swing.JLabel();
        JumlahHintLabel = new javax.swing.JLabel();
        KategoriCombo = new javax.swing.JComboBox<>();
        NilaiLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 255, 102));

        jLabel1.setIcon(new javax.swing.ImageIcon("E:\\Untitled1.png")); // NOI18N

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        MulaiButton.setBackground(new java.awt.Color(255, 51, 51));
        MulaiButton.setForeground(new java.awt.Color(255, 255, 255));
        MulaiButton.setText("Mulai");
        MulaiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MulaiButtonActionPerformed(evt);
            }
        });

        SoalLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SoalLabel.setText("Soal");

        JawabanTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JawabanTextField.setEnabled(false);

        PetunjukLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        TesButton.setBackground(new java.awt.Color(255, 51, 51));
        TesButton.setForeground(new java.awt.Color(255, 255, 255));
        TesButton.setText("Jawab");
        TesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TesButtonActionPerformed(evt);
            }
        });

        KesempatanLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        KesempatanLabel.setText("Kesempatan : ");

        HintButton.setText("Hint");
        HintButton.setEnabled(false);
        HintButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HintButtonActionPerformed(evt);
            }
        });

        HintLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HintLabel.setText("Hint");

        JumlahHintLabel.setText("Hint");

        KategoriCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pemain Bola","Anime","Negara" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(KesempatanLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(SoalLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(JawabanTextField)
                            .addComponent(PetunjukLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(TesButton)
                        .addGap(81, 81, 81)
                        .addComponent(HintButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(HintLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(MulaiButton)
                        .addGap(179, 179, 179))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(KategoriCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(195, 195, 195)))
                .addComponent(JumlahHintLabel)
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(KategoriCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MulaiButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JumlahHintLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SoalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JawabanTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(PetunjukLabel)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TesButton)
                    .addComponent(HintButton))
                .addGap(18, 18, 18)
                .addComponent(KesempatanLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(HintLabel)
                .addContainerGap())
        );

        NilaiLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NilaiLabel.setText("Nilai : ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(NilaiLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NilaiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MulaiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MulaiButtonActionPerformed
        ArrayList<WordModel> kategori =new ArrayList<>();
        
        switch(KategoriCombo.getSelectedIndex()){
            case 0:
                kategori = gen.scanBankSoal1();
                break;
            case 1:
                kategori = gen.scanBankSoal2();
                break;
            case 2:
                kategori = gen.scanBankSoal3();
                break;
        }
                
        
        int soalIndex = (int) Math.floor(Math.random() * kategori.size());
        
        wordmodel = kategori.get(soalIndex); //bankSoal[soalIndex];
        
        
        SoalLabel.setText(wordmodel.acakhuruf());
        TesButton.setEnabled(true);
        MulaiButton.setEnabled(false);
        HintButton.setEnabled(true);
        JawabanTextField.setEnabled(true);
        hint = 3;
        kesempatan = 5;
        JumlahHintLabel.setText("Hint: "+hint);
        
        
        
        
        

    }//GEN-LAST:event_MulaiButtonActionPerformed

    private void TesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TesButtonActionPerformed
        String jawaban = JawabanTextField.getText().trim();
        wordmodel.setJawaban(jawaban);
        
        if (wordmodel.cekjawaban()==true) {
            JOptionPane.showMessageDialog(rootPane, "Anda benar nilai + 100");
            nilai =+ 100;
            MulaiButton.setEnabled(true);
            
             ArrayList<WordModel> kategori =new ArrayList<>();
        
        switch(KategoriCombo.getSelectedIndex()){
            case 0:
                kategori = gen.scanBankSoal1();
                break;
            case 1:
                kategori = gen.scanBankSoal2();
                break;
            case 2:
                kategori = gen.scanBankSoal3();
                break;
        }
                
        
        int soalIndex = (int) Math.floor(Math.random() * kategori.size());
        
        wordmodel = kategori.get(soalIndex); //bankSoal[soalIndex];
        
        
        SoalLabel.setText(wordmodel.acakhuruf());
        TesButton.setEnabled(true);
        HintButton.setEnabled(true);
        JawabanTextField.setEnabled(true);
        JumlahHintLabel.setText("Hint: "+hint);
        
           
        }else {
            JOptionPane.showMessageDialog(rootPane, "salah coba lagi");
            kesempatan --;
            
            
        }
        if(kesempatan == 0){
            JOptionPane.showMessageDialog(rootPane, "Anda Bodoh");
            MulaiButton.setEnabled(true);
            HintButton.setEnabled(false);
            JawabanTextField.setEnabled(false);
            TesButton.setEnabled(false);
            
            
        }
        KesempatanLabel.setText("Kesempatan Jawab: "+kesempatan);
        JumlahHintLabel.setText("Hint: "+hint);
        NilaiLabel.setText("Nilai: "+nilai);
    }//GEN-LAST:event_TesButtonActionPerformed

    private void HintButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HintButtonActionPerformed
        PetunjukLabel.setText(wordmodel.getHint());
        hint--;
        if (hint==0) {
            HintButton.setEnabled(false);
        }
        JumlahHintLabel.setText("Hint: "+hint);

    }//GEN-LAST:event_HintButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameTebakNamaJFrame().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton HintButton;
    private javax.swing.JLabel HintLabel;
    private javax.swing.JTextField JawabanTextField;
    private javax.swing.JLabel JumlahHintLabel;
    private javax.swing.JComboBox<String> KategoriCombo;
    private javax.swing.JLabel KesempatanLabel;
    private javax.swing.JButton MulaiButton;
    private javax.swing.JLabel NilaiLabel;
    private javax.swing.JLabel PetunjukLabel;
    private javax.swing.JLabel SoalLabel;
    private javax.swing.JButton TesButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
