package sistemade;

import com.abimelecperez.metaheuristics.de.Configurator;
import com.abimelecperez.metaheuristics.de.Problem;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.text.NumberFormat;
import java.util.Arrays;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Results extends javax.swing.JDialog {

    private Problem problem;
    private Configurator configurator;

    public Results(java.awt.Frame parent, boolean modal, Problem problem, Configurator configurator) {
        super(parent, modal);
        initComponents();
        this.setSize(this.getParent().getSize());
        this.problem = problem;
        this.configurator = configurator;
        this.showResultsOne();
        this.showResultsTwo();
        this.showResultsThree();
        this.showResultsTable();
        SetImageLabel(jLabel3, "src/img/JMETA.png");
        inicializar();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txtPopulation = new javax.swing.JTextField();
        txtCR = new javax.swing.JTextField();
        txtF = new javax.swing.JTextField();
        txtNumeroEvaluaciones = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        txtIteratios = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtRuntime = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        txtBest = new javax.swing.JTextField();
        txtAverage = new javax.swing.JTextField();
        txtMedian = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        txtFeasibleRate = new javax.swing.JTextField();
        txtWorst = new javax.swing.JTextField();
        txtStd = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        txtSuccessRate = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        txtSuccessPerformance = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableResults = new javax.swing.JTable();
        textInformation = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();
        txtValorConocido = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Results");

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "DE Parameters", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Montserrat", 0, 16))); // NOI18N

        jLabel19.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel19.setText("Population");

        jLabel20.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel20.setText("Crossover (CR)");

        jLabel21.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel21.setText("Mutation (F)");

        jLabel25.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel25.setText("Evaluations");

        txtPopulation.setEditable(false);
        txtPopulation.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        txtPopulation.setForeground(new java.awt.Color(36, 160, 95));
        txtPopulation.setBorder(null);
        txtPopulation.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPopulationKeyTyped(evt);
            }
        });

        txtCR.setEditable(false);
        txtCR.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        txtCR.setForeground(new java.awt.Color(36, 160, 95));
        txtCR.setBorder(null);
        txtCR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCRActionPerformed(evt);
            }
        });
        txtCR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCRKeyTyped(evt);
            }
        });

        txtF.setEditable(false);
        txtF.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        txtF.setForeground(new java.awt.Color(36, 160, 95));
        txtF.setBorder(null);
        txtF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFKeyTyped(evt);
            }
        });

        txtNumeroEvaluaciones.setEditable(false);
        txtNumeroEvaluaciones.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        txtNumeroEvaluaciones.setForeground(new java.awt.Color(36, 160, 95));
        txtNumeroEvaluaciones.setBorder(null);
        txtNumeroEvaluaciones.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroEvaluacionesKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21))
                .addGap(59, 59, 59)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPopulation, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                    .addComponent(txtCR, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtF, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNumeroEvaluaciones, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txtPopulation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(txtCR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(txtF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtNumeroEvaluaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Execution time", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Montserrat", 0, 16))); // NOI18N

        jLabel26.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel26.setText("Iterations");

        jLabel28.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel28.setText("Total time");

        txtIteratios.setEditable(false);
        txtIteratios.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        txtIteratios.setForeground(new java.awt.Color(36, 160, 95));
        txtIteratios.setBorder(null);
        txtIteratios.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIteratiosKeyTyped(evt);
            }
        });

        txtName.setEditable(false);
        txtName.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        txtName.setBorder(null);
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNameKeyTyped(evt);
            }
        });

        txtRuntime.setEditable(false);
        txtRuntime.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        txtRuntime.setForeground(new java.awt.Color(36, 160, 95));
        txtRuntime.setBorder(null);
        txtRuntime.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRuntimeKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtName)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIteratios)
                            .addComponent(txtRuntime))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(txtIteratios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(txtRuntime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Statistics", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Montserrat", 0, 16))); // NOI18N

        jLabel29.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel29.setText("Best");

        jLabel30.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel30.setText("Average");

        jLabel31.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel31.setText("Median");

        txtBest.setEditable(false);
        txtBest.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        txtBest.setForeground(new java.awt.Color(36, 160, 95));
        txtBest.setBorder(null);
        txtBest.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBestKeyTyped(evt);
            }
        });

        txtAverage.setEditable(false);
        txtAverage.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        txtAverage.setForeground(new java.awt.Color(36, 160, 95));
        txtAverage.setBorder(null);
        txtAverage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAverageKeyTyped(evt);
            }
        });

        txtMedian.setEditable(false);
        txtMedian.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        txtMedian.setForeground(new java.awt.Color(36, 160, 95));
        txtMedian.setBorder(null);
        txtMedian.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMedianKeyTyped(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel32.setText("St.d");

        txtFeasibleRate.setEditable(false);
        txtFeasibleRate.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        txtFeasibleRate.setForeground(new java.awt.Color(36, 160, 95));
        txtFeasibleRate.setBorder(null);
        txtFeasibleRate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFeasibleRateKeyTyped(evt);
            }
        });

        txtWorst.setEditable(false);
        txtWorst.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        txtWorst.setForeground(new java.awt.Color(36, 160, 95));
        txtWorst.setBorder(null);
        txtWorst.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtWorstKeyTyped(evt);
            }
        });

        txtStd.setEditable(false);
        txtStd.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        txtStd.setForeground(new java.awt.Color(36, 160, 95));
        txtStd.setBorder(null);
        txtStd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtStdKeyTyped(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel33.setText("Worst");

        jLabel34.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel34.setText("Feasible rate");

        txtSuccessRate.setEditable(false);
        txtSuccessRate.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        txtSuccessRate.setForeground(new java.awt.Color(36, 160, 95));
        txtSuccessRate.setBorder(null);
        txtSuccessRate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSuccessRateKeyTyped(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel35.setText("Success rate");

        jLabel36.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel36.setText("Success performance");

        txtSuccessPerformance.setEditable(false);
        txtSuccessPerformance.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        txtSuccessPerformance.setForeground(new java.awt.Color(36, 160, 95));
        txtSuccessPerformance.setBorder(null);
        txtSuccessPerformance.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSuccessPerformanceKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel34)
                            .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel36))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtFeasibleRate, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                            .addComponent(txtSuccessRate)
                            .addComponent(txtSuccessPerformance)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel30)
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31)
                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel33))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtWorst)
                            .addComponent(txtStd)
                            .addComponent(txtMedian)
                            .addComponent(txtBest)
                            .addComponent(txtAverage))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(txtBest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(txtAverage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(txtMedian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(txtStd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(txtWorst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(txtFeasibleRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSuccessRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSuccessPerformance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Explore test results", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Montserrat", 1, 14))); // NOI18N
        jScrollPane3.setForeground(new java.awt.Color(240, 240, 240));
        jScrollPane3.setWheelScrollingEnabled(false);

        tableResults.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        tableResults.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableResults.setToolTipText("");
        tableResults.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tableResults.setGridColor(new java.awt.Color(153, 208, 249));
        jScrollPane3.setViewportView(tableResults);

        textInformation.setEditable(false);
        textInformation.setBackground(new java.awt.Color(240, 240, 240));
        textInformation.setColumns(20);
        textInformation.setFont(new java.awt.Font("Montserrat", 1, 16)); // NOI18N
        textInformation.setForeground(new java.awt.Color(0, 0, 153));
        textInformation.setLineWrap(true);
        textInformation.setRows(5);
        textInformation.setText("Best value: \nWorst value:");
        textInformation.setWrapStyleWord(true);

        jLabel14.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel14.setLabelFor(txtValorConocido);
        jLabel14.setText("Best known value");

        txtValorConocido.setEditable(false);
        txtValorConocido.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        txtValorConocido.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtValorConocido.setBorder(null);
        txtValorConocido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorConocidoActionPerformed(evt);
            }
        });

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(171, 235, 198));

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(210, 180, 222));

        jButton3.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/grafica32.png"))); // NOI18N
        jButton3.setText("Show graphic");
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setFocusable(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel2.setFont(new java.awt.Font("Montserrat", 0, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Results viewer");

        jButton2.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exportar32.png"))); // NOI18N
        jButton2.setText("Export table");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/export32.png"))); // NOI18N
        jButton1.setText("Export Convergence");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(8, 8, 8)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addContainerGap())))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2)
                        .addComponent(jButton1)))
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 65)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 153));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("METAheuristic with Differential Evolution For Optimization Problems UI");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(textInformation, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1052, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtValorConocido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtValorConocido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textInformation, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.getAccessibleContext().setAccessibleName("jmeta");

        jScrollPane1.setViewportView(jPanel1);

        jMenu1.setText("File");
        jMenu1.setFont(new java.awt.Font("Montserrat", 0, 16)); // NOI18N

        jMenuItem2.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exportar.png"))); // NOI18N
        jMenuItem2.setText("Export");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem5.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/grafica24.png"))); // NOI18N
        jMenuItem5.setText("Show graphic");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem3.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar.png"))); // NOI18N
        jMenuItem3.setText("Exit");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Help");
        jMenu2.setFont(new java.awt.Font("Montserrat", 0, 16)); // NOI18N

        jMenuItem4.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/acd24.png"))); // NOI18N
        jMenuItem4.setText("About");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 676, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        private void inicializar() {
        ImageIcon icono = new ImageIcon("src/img/icon.png");
        this.setIconImage(icono.getImage());
    }

    private void SetImageLabel(JLabel labelName, String root) {
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_SMOOTH));
        labelName.setIcon(icon);
        this.repaint();
    }
    private void txtPopulationKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPopulationKeyTyped

    }//GEN-LAST:event_txtPopulationKeyTyped

    private void txtCRKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCRKeyTyped

    }//GEN-LAST:event_txtCRKeyTyped

    private void txtFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFKeyTyped

    }//GEN-LAST:event_txtFKeyTyped

    private void txtNumeroEvaluacionesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroEvaluacionesKeyTyped

    }//GEN-LAST:event_txtNumeroEvaluacionesKeyTyped

    private void txtIteratiosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIteratiosKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIteratiosKeyTyped

    private void txtRuntimeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRuntimeKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRuntimeKeyTyped

    private void txtBestKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBestKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBestKeyTyped

    private void txtAverageKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAverageKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAverageKeyTyped

    private void txtMedianKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMedianKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMedianKeyTyped

    private void txtFeasibleRateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFeasibleRateKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFeasibleRateKeyTyped

    private void txtWorstKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtWorstKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWorstKeyTyped

    private void txtStdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStdKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStdKeyTyped

    private void txtSuccessRateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSuccessRateKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSuccessRateKeyTyped

    private void txtSuccessPerformanceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSuccessPerformanceKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSuccessPerformanceKeyTyped

    private void txtNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameKeyTyped

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed


    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        About about = new About(new JFrame(), true);
        about.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void txtValorConocidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorConocidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorConocidoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        GraphicsGUI gp = new GraphicsGUI(new JFrame(), true, this.problem);
        gp.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        SaveConvergence sc=new SaveConvergence(this.problem);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtCRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCRActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        SaveResult sc=new SaveResult(this.problem, this.configurator);
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCleaner;
    private javax.swing.JButton btnCleaner1;
    private javax.swing.JButton btnCleaner2;
    private javax.swing.JButton btnResults;
    private javax.swing.JButton btnResults1;
    private javax.swing.JButton btnResults2;
    private javax.swing.JButton btnStart;
    private javax.swing.JButton btnStart1;
    private javax.swing.JButton btnStart2;
    private javax.swing.JButton btnStop;
    private javax.swing.JButton btnStop1;
    private javax.swing.JButton btnStop2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lblRunning;
    private javax.swing.JLabel lblRunning1;
    private javax.swing.JLabel lblRunning2;
    private javax.swing.JProgressBar progreso;
    private javax.swing.JProgressBar progreso1;
    private javax.swing.JProgressBar progreso2;
    private javax.swing.JTable tableResults;
    private javax.swing.JTextArea textInformation;
    private javax.swing.JTextField txtAverage;
    private javax.swing.JTextField txtBest;
    private javax.swing.JTextField txtCR;
    private javax.swing.JTextField txtF;
    private javax.swing.JTextField txtFeasibleRate;
    private javax.swing.JTextField txtIteratios;
    private javax.swing.JTextField txtMedian;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNumeroEvaluaciones;
    private javax.swing.JTextField txtPopulation;
    private javax.swing.JTextField txtRuntime;
    private javax.swing.JTextField txtStd;
    private javax.swing.JTextField txtSuccessPerformance;
    private javax.swing.JTextField txtSuccessRate;
    private javax.swing.JTextField txtValorConocido;
    private javax.swing.JTextField txtWorst;
    // End of variables declaration//GEN-END:variables

    private void showResultsOne() {
        this.txtName.setText(this.problem.getNameProblem());
        this.txtIteratios.setText("" + this.problem.getExecutions());
        this.txtRuntime.setText("" + this.problem.getTimeSeconds() + " seconds");
        this.txtValorConocido.setText("" + this.problem.getBestKnownValue());
    }

    private void showResultsTwo() {

        NumberFormat nf = NumberFormat.getInstance();
        nf.setMinimumFractionDigits(20);

        this.txtBest.setText("" + this.problem.getStatistic()[0]);
        this.txtAverage.setText("" + this.problem.getStatistic()[1]);
        this.txtMedian.setText("" + this.problem.getStatistic()[2]);
        this.txtStd.setText("" + nf.format(this.problem.getStatistic()[3]));
        this.txtWorst.setText("" + this.problem.getStatistic()[4]);
        this.txtFeasibleRate.setText("" + this.problem.getStatistic()[5]);
        this.txtSuccessRate.setText("" + this.problem.getStatistic()[6]);
        this.txtSuccessPerformance.setText("" + this.problem.getStatistic()[7]);
    }

    private void showResultsThree() {
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMinimumFractionDigits(1);

        this.txtPopulation.setText("" + this.configurator.getSb());
        this.txtCR.setText("" + nf.format(this.configurator.getCr()));
        this.txtF.setText("" + this.configurator.getMutationFactor());
        this.txtNumeroEvaluaciones.setText("" + this.configurator.getEvaluations());
    }

    public void showResultsTable() {
        int size = this.problem.getBestResults()[0].length + 1;
        String[] column = new String[size];
        column[0] = "#";

        for (int i = 1; i < size - 2; i++) {
            column[i] = this.problem.getOrderVariables()[i - 1];
        }
        column[size - 2] = "OF";
        column[size - 1] = "CVS";

        Double[][] inverse = Arrays.stream(this.problem.getBestResults())
                .map(d -> Arrays.stream(d).boxed().toArray(Double[]::new))
                .toArray(Double[][]::new);

        Double[][] newData = new Double[inverse.length][column.length];
        for (int i = 0; i < inverse.length; i++) {
            newData[i][0] = new Double(1 + i);
            System.arraycopy(inverse[i], 0, newData[i], 1, inverse[i].length);
        }

        this.tableResults.setModel(new DefaultTableModel(newData, column));

        this.tableResults.getTableHeader().setOpaque(false);
        // cambia el tipo de letra del encabezado de la tabla
        this.tableResults.getTableHeader().setFont(new Font("Montserrat", 0, 18));
        this.tableResults.getTableHeader().setBackground(new Color(153, 208, 249));
        this.tableResults.getTableHeader().setForeground(Color.white);
        ((DefaultTableCellRenderer) this.tableResults.getTableHeader().getDefaultRenderer())
                .setHorizontalAlignment(SwingConstants.CENTER);

        this.tableResults.setDefaultRenderer(this.tableResults.getColumnClass(0),
                new TableFormat(this.problem.getStatistic()[0], this.problem.getStatistic()[4])
        );

        this.tableResults.getColumnModel().getColumn(0).setPreferredWidth(50);
        this.tableResults.setRowHeight(30);
        for (int i = 1; i < size - 1; i++) {
            this.tableResults.getColumnModel().getColumn(i).setPreferredWidth(200);
        }
        this.tableResults.getColumnModel().getColumn(size - 1).setPreferredWidth(100);

    }
}
