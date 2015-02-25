package miniYahtzee;

/* Halldór Reynir Tryggvason
 * hrt9@hi.is
 * miniYahtzee er tölvuleikur sem er einfölduð útgáfa af yahtzee.
 * Forritið var þýtt og þjappað í netbeans.
 */

import java.util.List;
import java.util.ArrayList;
import javax.swing.JButton;

// YahtzeeUtlit heldur utan um viðmót leiksins miniYahtzee

public class YahtzeeUtlit extends javax.swing.JFrame {
    
    // YahtzeeUtlit smidar nyjan hlut af tagi YahtzeeUtlit
    public YahtzeeUtlit() {
        initComponents();
        listCreator();
    }
    
    public YahtzeeLeikur leikur = new YahtzeeLeikur();
    // leikur er nyr vinnsluhluti leiksins miniYahtzee.
    public boolean buidAdKasta; 
    // buidAdKasta styrir því hvort hægt sé að kasta eða skrá stig.
    public int fullirReitir = 0;
    // fullirReitir stjórnar hvenær leikLokid skjárinn birtist.
    public List<JButton> jButtonList = new ArrayList<JButton>();
    // JButtonLIst Heldur utan um alla JButton sem viðmótið breytir.
    public List<javax.swing.JTextField> jTextFieldList = new ArrayList<javax.swing.JTextField>();
    // JTextFieldList Heldur utan um öll JTextField sem viðmótið breytir.
    public List<javax.swing.JLabel> jLabelList = new ArrayList<javax.swing.JLabel>();
    // JLabelList Heldur utan um öll JLabel sem viðmótið breytir.
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        skraStigVidvorun = new javax.swing.JDialog();
        skraStigVidvorunPanel = new javax.swing.JPanel();
        skraStig_Texti1 = new javax.swing.JLabel();
        skraStig_Texti2 = new javax.swing.JLabel();
        skraStigTakki = new javax.swing.JButton();
        kastaTeningumVidvorun = new javax.swing.JDialog();
        kastaTeningumVidvorunPanel = new javax.swing.JPanel();
        kastaTeningTexti1 = new javax.swing.JLabel();
        KastaTeningTexti2 = new javax.swing.JLabel();
        KastaTeningTakki = new javax.swing.JButton();
        leikLokidGluggi = new javax.swing.JDialog();
        leikLokidFlugeldurVinstri = new javax.swing.JLabel();
        leikLokidTilHamingju = new javax.swing.JLabel();
        leikLokidStigafjoldi = new javax.swing.JLabel();
        leikLokidFlugeldurHaegri = new javax.swing.JLabel();
        nyrLeikurTakki2 = new javax.swing.JButton();
        background = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        titillHeaderLabel = new javax.swing.JLabel();
        headerIconRight = new javax.swing.JLabel();
        headerIconLeft = new javax.swing.JLabel();
        TeningarPanel = new javax.swing.JPanel();
        kastaTakki = new javax.swing.JButton();
        teningur1 = new javax.swing.JLabel();
        teningur2 = new javax.swing.JLabel();
        teningur3 = new javax.swing.JLabel();
        skraStigTakkarPanel = new javax.swing.JPanel();
        skraStig2 = new javax.swing.JButton();
        skraStig2.setName("skraStig2");
        skraStig3 = new javax.swing.JButton();
        skraStig3.setName("skraStig3");
        skraStig1 = new javax.swing.JButton();
        skraStig1.setName("skraStig1");
        skraStig4 = new javax.swing.JButton();
        skraStig4.setName("skraStig4");
        skraStig5 = new javax.swing.JButton();
        skraStig5.setName("skraStig5");
        skraStig6 = new javax.swing.JButton();
        skraStig6.setName("skraStig6");
        skraStig8 = new javax.swing.JButton();
        skraStig7 = new javax.swing.JButton();
        skraStig7.setName("skraStig7");
        stigPanel = new javax.swing.JPanel();
        reiturStig1 = new javax.swing.JTextField();
        reiturStig2 = new javax.swing.JTextField();
        reiturStig3 = new javax.swing.JTextField();
        reiturStig4 = new javax.swing.JTextField();
        reiturStig5 = new javax.swing.JTextField();
        reiturStig6 = new javax.swing.JTextField();
        reiturStigSens = new javax.swing.JTextField();
        reiturStigYahtzee = new javax.swing.JTextField();
        nyrLeikurTakki1 = new javax.swing.JButton();
        reiturNidurstada = new javax.swing.JTextField();
        nidurstadaLabel = new javax.swing.JLabel();

        skraStigVidvorun.setAlwaysOnTop(true);
        skraStigVidvorun.setMinimumSize(new java.awt.Dimension(240, 120));
        skraStigVidvorun.setModal(true);
        skraStigVidvorun.setResizable(false);

        skraStig_Texti1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        skraStig_Texti1.setText("Úps");

        skraStig_Texti2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        skraStig_Texti2.setText("Skráðu stig fyrst");

        skraStigTakki.setText("Ok");
        skraStigTakki.setMaximumSize(new java.awt.Dimension(74, 29));
        skraStigTakki.setMinimumSize(new java.awt.Dimension(74, 29));
        skraStigTakki.setPreferredSize(new java.awt.Dimension(74, 29));
        skraStigTakki.setSize(new java.awt.Dimension(74, 29));
        skraStigTakki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skraStigVidvorunTakki(evt);
            }
        });

        javax.swing.GroupLayout skraStigVidvorunPanelLayout = new javax.swing.GroupLayout(skraStigVidvorunPanel);
        skraStigVidvorunPanel.setLayout(skraStigVidvorunPanelLayout);
        skraStigVidvorunPanelLayout.setHorizontalGroup(
            skraStigVidvorunPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(skraStig_Texti1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(skraStigVidvorunPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(skraStig_Texti2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(skraStigVidvorunPanelLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(skraStigTakki, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );
        skraStigVidvorunPanelLayout.setVerticalGroup(
            skraStigVidvorunPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, skraStigVidvorunPanelLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(skraStig_Texti1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(skraStig_Texti2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(skraStigTakki, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout skraStigVidvorunLayout = new javax.swing.GroupLayout(skraStigVidvorun.getContentPane());
        skraStigVidvorun.getContentPane().setLayout(skraStigVidvorunLayout);
        skraStigVidvorunLayout.setHorizontalGroup(
            skraStigVidvorunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(skraStigVidvorunLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(skraStigVidvorunPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        skraStigVidvorunLayout.setVerticalGroup(
            skraStigVidvorunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(skraStigVidvorunPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        kastaTeningumVidvorun.setAlwaysOnTop(true);
        kastaTeningumVidvorun.setMinimumSize(new java.awt.Dimension(240, 120));
        kastaTeningumVidvorun.setModal(true);
        kastaTeningumVidvorun.setResizable(false);

        kastaTeningumVidvorunPanel.setSize(new java.awt.Dimension(256, 108));

        kastaTeningTexti1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kastaTeningTexti1.setText("Úps");

        KastaTeningTexti2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        KastaTeningTexti2.setText("Kastaðu áður en þú skráir stig");
        KastaTeningTexti2.setSize(new java.awt.Dimension(240, 120));

        KastaTeningTakki.setText("Ok");
        KastaTeningTakki.setMaximumSize(new java.awt.Dimension(74, 29));
        KastaTeningTakki.setMinimumSize(new java.awt.Dimension(74, 29));
        KastaTeningTakki.setPreferredSize(new java.awt.Dimension(74, 29));
        KastaTeningTakki.setSize(new java.awt.Dimension(74, 29));
        KastaTeningTakki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kastaTeningVidvorunTakki(evt);
            }
        });

        javax.swing.GroupLayout kastaTeningumVidvorunPanelLayout = new javax.swing.GroupLayout(kastaTeningumVidvorunPanel);
        kastaTeningumVidvorunPanel.setLayout(kastaTeningumVidvorunPanelLayout);
        kastaTeningumVidvorunPanelLayout.setHorizontalGroup(
            kastaTeningumVidvorunPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kastaTeningumVidvorunPanelLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(KastaTeningTakki, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(kastaTeningTexti1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(KastaTeningTexti2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
        );
        kastaTeningumVidvorunPanelLayout.setVerticalGroup(
            kastaTeningumVidvorunPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kastaTeningumVidvorunPanelLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(kastaTeningTexti1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(KastaTeningTexti2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(KastaTeningTakki, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout kastaTeningumVidvorunLayout = new javax.swing.GroupLayout(kastaTeningumVidvorun.getContentPane());
        kastaTeningumVidvorun.getContentPane().setLayout(kastaTeningumVidvorunLayout);
        kastaTeningumVidvorunLayout.setHorizontalGroup(
            kastaTeningumVidvorunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kastaTeningumVidvorunPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        kastaTeningumVidvorunLayout.setVerticalGroup(
            kastaTeningumVidvorunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kastaTeningumVidvorunPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        leikLokidGluggi.setAlwaysOnTop(true);
        leikLokidGluggi.setMinimumSize(new java.awt.Dimension(466, 225));
        leikLokidGluggi.setModal(true);
        leikLokidGluggi.setResizable(false);

        leikLokidFlugeldurVinstri.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniYahtzee/fire.gif"))); // NOI18N

        leikLokidTilHamingju.setFont(new java.awt.Font("Phosphate", 0, 21)); // NOI18N
        leikLokidTilHamingju.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        leikLokidTilHamingju.setText("Til hamingju!");

        leikLokidStigafjoldi.setFont(new java.awt.Font("Phosphate", 0, 18)); // NOI18N
        leikLokidStigafjoldi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        leikLokidStigafjoldi.setText("þú fékkst 1 stig!");

        leikLokidFlugeldurHaegri.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniYahtzee/fire.gif"))); // NOI18N

        nyrLeikurTakki2.setText("Nýr Leikur");
        nyrLeikurTakki2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nyrLeikur(evt);
            }
        });

        javax.swing.GroupLayout leikLokidGluggiLayout = new javax.swing.GroupLayout(leikLokidGluggi.getContentPane());
        leikLokidGluggi.getContentPane().setLayout(leikLokidGluggiLayout);
        leikLokidGluggiLayout.setHorizontalGroup(
            leikLokidGluggiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leikLokidGluggiLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(leikLokidFlugeldurVinstri)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(leikLokidGluggiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(leikLokidStigafjoldi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(leikLokidTilHamingju, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(leikLokidFlugeldurHaegri)
                .addGap(25, 25, 25))
            .addGroup(leikLokidGluggiLayout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(nyrLeikurTakki2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        leikLokidGluggiLayout.setVerticalGroup(
            leikLokidGluggiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leikLokidGluggiLayout.createSequentialGroup()
                .addGroup(leikLokidGluggiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(leikLokidGluggiLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(leikLokidTilHamingju)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(leikLokidStigafjoldi))
                    .addGroup(leikLokidGluggiLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(leikLokidGluggiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(leikLokidFlugeldurHaegri)
                            .addComponent(leikLokidFlugeldurVinstri))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(nyrLeikurTakki2)
                .addGap(31, 31, 31))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setResizable(false);
        setSize(new java.awt.Dimension(638, 543));

        header.setPreferredSize(new java.awt.Dimension(638, 112));

        titillHeaderLabel.setFont(new java.awt.Font("Phosphate", 0, 36)); // NOI18N
        titillHeaderLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titillHeaderLabel.setText("Mini Yahtzee");

        headerIconRight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniYahtzee/miniYahtzeeHeader.png"))); // NOI18N

        headerIconLeft.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniYahtzee/miniYahtzeeHeader.png"))); // NOI18N
        headerIconLeft.setText("jLabel2");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(headerIconLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(headerIconRight, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(titillHeaderLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(headerIconLeft)
                    .addComponent(headerIconRight))
                .addContainerGap(11, Short.MAX_VALUE))
            .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(titillHeaderLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        TeningarPanel.setMaximumSize(new java.awt.Dimension(152, 262));
        TeningarPanel.setSize(new java.awt.Dimension(152, 262));

        kastaTakki.setText("Kasta");
        kastaTakki.setSize(new java.awt.Dimension(78, 29));
        kastaTakki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kastaTeningum(evt);
            }
        });

        teningur1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        teningur1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniYahtzee/oneDice.jpg"))); // NOI18N

        teningur2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        teningur2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniYahtzee/oneDice.jpg"))); // NOI18N

        teningur3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        teningur3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniYahtzee/oneDice.jpg"))); // NOI18N

        javax.swing.GroupLayout TeningarPanelLayout = new javax.swing.GroupLayout(TeningarPanel);
        TeningarPanel.setLayout(TeningarPanelLayout);
        TeningarPanelLayout.setHorizontalGroup(
            TeningarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(teningur1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(teningur2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(teningur3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(kastaTakki, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
        );
        TeningarPanelLayout.setVerticalGroup(
            TeningarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TeningarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kastaTakki)
                .addGap(35, 35, 35)
                .addComponent(teningur1)
                .addGap(18, 18, 18)
                .addComponent(teningur2)
                .addGap(18, 18, 18)
                .addComponent(teningur3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        skraStig2.setText("Tvistar");
        skraStig2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skraStig(evt);
            }
        });

        skraStig3.setText("Þristar");
        skraStig3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skraStig(evt);
            }
        });

        skraStig1.setText("Ásar");
        skraStig1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skraStig(evt);
            }
        });

        skraStig4.setText("Fjarkar");
        skraStig4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skraStig(evt);
            }
        });

        skraStig5.setText("Fimmur");
        skraStig5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skraStig(evt);
            }
        });

        skraStig6.setText("Sexur");
        skraStig6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skraStig(evt);
            }
        });

        skraStig8.setName("skraStig8");
        skraStig8.setText("Yahtzee");
        skraStig8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skraStig(evt);
            }
        });

        skraStig7.setText("Taka sénsinn");
        skraStig7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skraStig(evt);
            }
        });

        javax.swing.GroupLayout skraStigTakkarPanelLayout = new javax.swing.GroupLayout(skraStigTakkarPanel);
        skraStigTakkarPanel.setLayout(skraStigTakkarPanelLayout);
        skraStigTakkarPanelLayout.setHorizontalGroup(
            skraStigTakkarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 205, Short.MAX_VALUE)
            .addGroup(skraStigTakkarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(skraStigTakkarPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(skraStigTakkarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(skraStig8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(skraStig7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(skraStig6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(skraStig5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(skraStig4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(skraStig3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                        .addComponent(skraStig2, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                        .addComponent(skraStig1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        skraStigTakkarPanelLayout.setVerticalGroup(
            skraStigTakkarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 286, Short.MAX_VALUE)
            .addGroup(skraStigTakkarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(skraStigTakkarPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(skraStig1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(skraStig2)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(skraStig3)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(skraStig4)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(skraStig5)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(skraStig6)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(skraStig7)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(skraStig8)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        reiturStig1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        reiturStig1.setText("0");
        reiturStig1.setFocusable(false);

        reiturStig2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        reiturStig2.setText("0");
        reiturStig2.setFocusable(false);

        reiturStig3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        reiturStig3.setText("0");
        reiturStig3.setFocusable(false);

        reiturStig4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        reiturStig4.setText("0");
        reiturStig4.setFocusable(false);

        reiturStig5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        reiturStig5.setText("0");
        reiturStig5.setFocusable(false);

        reiturStig6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        reiturStig6.setText("0");
        reiturStig6.setFocusable(false);

        reiturStigSens.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        reiturStigSens.setText("0");
        reiturStigSens.setFocusable(false);

        reiturStigYahtzee.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        reiturStigYahtzee.setText("0");
        reiturStigYahtzee.setFocusable(false);

        javax.swing.GroupLayout stigPanelLayout = new javax.swing.GroupLayout(stigPanel);
        stigPanel.setLayout(stigPanelLayout);
        stigPanelLayout.setHorizontalGroup(
            stigPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, stigPanelLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(stigPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(reiturStigYahtzee, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(reiturStig3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(reiturStig4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(reiturStig2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(reiturStig5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(reiturStig6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(reiturStig1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(reiturStigSens, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        stigPanelLayout.setVerticalGroup(
            stigPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stigPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(reiturStig1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reiturStig2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reiturStig3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reiturStig4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reiturStig5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reiturStig6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reiturStigSens, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reiturStigYahtzee, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        nyrLeikurTakki1.setText("Nýr Leikur");
        nyrLeikurTakki1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nyrLeikur(evt);
            }
        });

        reiturNidurstada.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        reiturNidurstada.setText("0");
        reiturNidurstada.setFocusable(false);

        nidurstadaLabel.setFont(new java.awt.Font("Phosphate", 1, 24)); // NOI18N
        nidurstadaLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nidurstadaLabel.setText("Heildarstig");
        nidurstadaLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(TeningarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(stigPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(skraStigTakkarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(nyrLeikurTakki1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(reiturNidurstada, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nidurstadaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37))
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(skraStigTakkarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TeningarPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stigPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nidurstadaLabel)
                    .addComponent(reiturNidurstada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nyrLeikurTakki1))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    // Lokar Viðvörunargluggann skraStigVidvorun.
    private void skraStigVidvorunTakki(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skraStigVidvorunTakki
        // TODO add your handling code here:
        skraStigVidvorun.setVisible(false);
    }//GEN-LAST:event_skraStigVidvorunTakki

    // Sýnir gildi teninga með því að breyta JLabel icons í viðeigandi mynd.
    private void synaKast() {   
        for (int i = 0; i< leikur.teningar.length; i++) {
            int val = leikur.teningar[i].lesaGildi();
            
        
            switch(val) {
                case 1: jLabelList.get(i).setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniYahtzee/oneDice.jpg")));
                    break;
                case 2: jLabelList.get(i).setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniYahtzee/twoDice.jpg")));
                    break;
                case 3: jLabelList.get(i).setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniYahtzee/threeDice.jpg")));
                    break;
                case 4: jLabelList.get(i).setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniYahtzee/fourDice.jpg")));
                    break;
                case 5: jLabelList.get(i).setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniYahtzee/fiveDice.jpg")));
                    break;
                case 6: jLabelList.get(i).setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniYahtzee/sixDice.jpg")));
                    break;
            }        
        }
    }  
    
    // Ræsir leikLokid gluggann og skráir lokastig.
    private void leikLokid() {
        int lokastig = leikur.yahtzeeBlad.nidurstada();
        reiturNidurstada.setText(Integer.toString(lokastig));
        leikLokidStigafjoldi.setText("þú fékkst " + Integer.toString(lokastig) + " stig!");
        leikLokidGluggi.setLocationRelativeTo(null);
        leikLokidGluggi.setVisible(true);
    }
    
    // Greinir hvaða reit er verið að reyna að skrá í.
    private String greinaTakka(java.awt.event.ActionEvent evt) {
        JButton CurrentButton = (JButton) evt.getSource();
        String tempString = CurrentButton.getName();
        String ret = tempString.substring(8);
        CurrentButton.setEnabled(false);
        return ret;
    } 
    
    // Lokar glugganum kastaTeningVidvorun
    private void kastaTeningVidvorunTakki(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kastaTeningVidvorunTakki
        // TODO add your handling code here:
        kastaTeningumVidvorun.setVisible(false);
    }//GEN-LAST:event_kastaTeningVidvorunTakki
    
    // Skrair stig í stigareiti viðmótsins
    private void skraStig(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skraStig
        // TODO add your handling code here:
        if(buidAdKasta) {
            String x = greinaTakka(evt);
            int sum = 0;
            fullirReitir += 1;
            if (x.equals("7")) {
                sum = leikur.takaSensinnStig();
            } else if (x.equals("8")) {
                sum = leikur.yahtzeeStig();
            } else {
                sum = leikur.stigFyrirGildi(Integer.parseInt(x));
            }
            
            jTextFieldList.get(Integer.parseInt(x)-1).setText(Integer.toString(sum));
            leikur.yahtzeeBlad.setjaToluIReit(Integer.parseInt(x) - 1, sum);
            reiturNidurstada.setText(Integer.toString(leikur.yahtzeeBlad.nidurstada()));
            buidAdKasta = false;
        }
        else {
            kastaTeningumVidvorun.setLocationRelativeTo(null);
            kastaTeningumVidvorun.setVisible(true);
        }
        if(fullirReitir == 8) leikLokid();
    }//GEN-LAST:event_skraStig
    
    // Kastar neningum og kallar á fall sem sýnir kastið.
    private void kastaTeningum(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kastaTeningum
        // TODO add your handling code here:
        if (!buidAdKasta) {
            leikur.kastaTeningum();
            synaKast();
            buidAdKasta = true;
        }
        else {
            skraStigVidvorun.setLocationRelativeTo(null);
            skraStigVidvorun.setVisible(true);
        }
    }//GEN-LAST:event_kastaTeningum
    
 
    
    
    
    
    
    
    
    
    
    
    // Gerir Lista með öllum components í viðmótinu sem þarf að vinna með
    // eftir að forritið hefur verið ræst.
    private  void listCreator() {
        jButtonList.add(skraStig1);
        jButtonList.add(skraStig2);
        jButtonList.add(skraStig3);
        jButtonList.add(skraStig4);
        jButtonList.add(skraStig5);
        jButtonList.add(skraStig6);
        jButtonList.add(skraStig8);
        jButtonList.add(skraStig7);
        jTextFieldList.add(reiturStig1);
        jTextFieldList.add(reiturStig2);
        jTextFieldList.add(reiturStig3);
        jTextFieldList.add(reiturStig4);
        jTextFieldList.add(reiturStig5);
        jTextFieldList.add(reiturStig6);
        jTextFieldList.add(reiturStigSens);
        jTextFieldList.add(reiturStigYahtzee);
        jTextFieldList.add(reiturNidurstada);
        jLabelList.add(teningur1);
        jLabelList.add(teningur2);
        jLabelList.add(teningur3);
    }
    
    // Hefur nýjan leik
    private void nyrLeikur(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nyrLeikur
        // TODO add your handling code here:
        leikLokidGluggi.setVisible(false);
        leikur.nyrLeikur();
        buidAdKasta = false;
        fullirReitir = 0;
        for(int i = 0; i < jButtonList.size() ; i++){
            jButtonList.get(i).setEnabled(true);
        }
        
        for(int i = 0; i < jTextFieldList.size() ; i++){
            jTextFieldList.get(i).setText("0");
        }
        
        for(int i = 0; i < jLabelList.size() ; i++){
            jLabelList.get(i).setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniYahtzee/oneDice.jpg")));
        }
    }//GEN-LAST:event_nyrLeikur

    // Birtir gluggann YahtzeeUtlit
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
            java.util.logging.Logger.getLogger(YahtzeeUtlit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(YahtzeeUtlit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(YahtzeeUtlit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(YahtzeeUtlit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new YahtzeeUtlit().setVisible(true);
            }
        });
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton KastaTeningTakki;
    private javax.swing.JLabel KastaTeningTexti2;
    private javax.swing.JPanel TeningarPanel;
    private javax.swing.JPanel background;
    private javax.swing.JPanel header;
    private javax.swing.JLabel headerIconLeft;
    private javax.swing.JLabel headerIconRight;
    private javax.swing.JButton kastaTakki;
    private javax.swing.JLabel kastaTeningTexti1;
    private javax.swing.JDialog kastaTeningumVidvorun;
    private javax.swing.JPanel kastaTeningumVidvorunPanel;
    private javax.swing.JLabel leikLokidFlugeldurHaegri;
    private javax.swing.JLabel leikLokidFlugeldurVinstri;
    private javax.swing.JDialog leikLokidGluggi;
    private javax.swing.JLabel leikLokidStigafjoldi;
    private javax.swing.JLabel leikLokidTilHamingju;
    private javax.swing.JLabel nidurstadaLabel;
    private javax.swing.JButton nyrLeikurTakki1;
    private javax.swing.JButton nyrLeikurTakki2;
    private javax.swing.JTextField reiturNidurstada;
    private javax.swing.JTextField reiturStig1;
    private javax.swing.JTextField reiturStig2;
    private javax.swing.JTextField reiturStig3;
    private javax.swing.JTextField reiturStig4;
    private javax.swing.JTextField reiturStig5;
    private javax.swing.JTextField reiturStig6;
    private javax.swing.JTextField reiturStigSens;
    private javax.swing.JTextField reiturStigYahtzee;
    private javax.swing.JButton skraStig1;
    private javax.swing.JButton skraStig2;
    private javax.swing.JButton skraStig3;
    private javax.swing.JButton skraStig4;
    private javax.swing.JButton skraStig5;
    private javax.swing.JButton skraStig6;
    private javax.swing.JButton skraStig7;
    private javax.swing.JButton skraStig8;
    private javax.swing.JPanel skraStigTakkarPanel;
    private javax.swing.JButton skraStigTakki;
    private javax.swing.JDialog skraStigVidvorun;
    private javax.swing.JPanel skraStigVidvorunPanel;
    private javax.swing.JLabel skraStig_Texti1;
    private javax.swing.JLabel skraStig_Texti2;
    private javax.swing.JPanel stigPanel;
    private javax.swing.JLabel teningur1;
    private javax.swing.JLabel teningur2;
    private javax.swing.JLabel teningur3;
    private javax.swing.JLabel titillHeaderLabel;
    // End of variables declaration//GEN-END:variables
}