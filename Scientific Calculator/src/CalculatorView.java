
import java.awt.Toolkit;
import java.text.DecimalFormat;

public class CalculatorView extends javax.swing.JFrame {

    public CalculatorView() {
        initComponents();
        this.setLocationRelativeTo(null);
        jRadioButton1.setSelected(true);
        display.setText("0");
        SetIcon();

    }

    CalculatorModel model = new CalculatorModel();
    String operand = "";

    public void getOperand(javax.swing.JButton button) {
        operand += button.getText();
        model.setOperand(operand);
        display.setText(operand);
    }

    private void getOperator(int opt) {
        model.setOperator(opt);
        operand = "";
    }

    private void process() {
        DecimalFormat df = new DecimalFormat("#,###.########");
        model.process();
        operand = "";
        display.setText(df.format(model.getResult()) + "");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        display = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        b7 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        bdot = new javax.swing.JButton();
        b0 = new javax.swing.JButton();
        bc = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        bsin = new javax.swing.JButton();
        bsum = new javax.swing.JButton();
        bequal = new javax.swing.JButton();
        bdiv = new javax.swing.JButton();
        buttonAC = new javax.swing.JButton();
        bmul = new javax.swing.JButton();
        bsub = new javax.swing.JButton();
        bonebyX = new javax.swing.JButton();
        bmod = new javax.swing.JButton();
        bxy = new javax.swing.JButton();
        Braised3 = new javax.swing.JButton();
        blog = new javax.swing.JButton();
        bdeg = new javax.swing.JButton();
        bcos = new javax.swing.JButton();
        btan = new javax.swing.JButton();
        bXraisedToY = new javax.swing.JButton();
        exp = new javax.swing.JButton();
        bsinh = new javax.swing.JButton();
        bcosh = new javax.swing.JButton();
        btanh = new javax.swing.JButton();
        bsqrt = new javax.swing.JButton();
        bpai = new javax.swing.JButton();
        Braised2 = new javax.swing.JButton();
        bHEX = new javax.swing.JButton();
        bfact = new javax.swing.JButton();
        bOCT = new javax.swing.JButton();
        bplusMinus = new javax.swing.JButton();
        bBIN = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setBackground(new java.awt.Color(153, 153, 153));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        display.setEditable(false);
        display.setBackground(new java.awt.Color(255, 255, 255));
        display.setFont(new java.awt.Font("Tahoma", 0, 34)); // NOI18N
        display.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        display.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(display, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(display)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        b7.setText("7");
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });

        b4.setText("4");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        b1.setText("1");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        bdot.setText(".");
        bdot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdotActionPerformed(evt);
            }
        });

        b0.setText("0");
        b0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b0ActionPerformed(evt);
            }
        });

        bc.setText("Back");
        bc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcActionPerformed(evt);
            }
        });

        b2.setText("2");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b3.setText("3");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        b5.setText("5");
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        b6.setText("6");
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        b8.setText("8");
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });

        b9.setText("9");
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });

        bsin.setText("sin");
        bsin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsinActionPerformed(evt);
            }
        });

        bsum.setText("+");
        bsum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsumActionPerformed(evt);
            }
        });

        bequal.setText("=");
        bequal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bequalActionPerformed(evt);
            }
        });

        bdiv.setText("/");
        bdiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdivActionPerformed(evt);
            }
        });

        buttonAC.setText("AC");
        buttonAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonACActionPerformed(evt);
            }
        });

        bmul.setText("*");
        bmul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmulActionPerformed(evt);
            }
        });

        bsub.setText("-");
        bsub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsubActionPerformed(evt);
            }
        });

        bonebyX.setText("1/x");
        bonebyX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bonebyXActionPerformed(evt);
            }
        });

        bmod.setText("%");
        bmod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmodActionPerformed(evt);
            }
        });

        bxy.setText("y√x");
        bxy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bxyActionPerformed(evt);
            }
        });

        Braised3.setText("x^3");
        Braised3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Braised3ActionPerformed(evt);
            }
        });

        blog.setText("log");
        blog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blogActionPerformed(evt);
            }
        });

        bdeg.setText("deg");
        bdeg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdegActionPerformed(evt);
            }
        });

        bcos.setText("cos");
        bcos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcosActionPerformed(evt);
            }
        });

        btan.setText("tan");
        btan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btanActionPerformed(evt);
            }
        });

        bXraisedToY.setText("x^y");
        bXraisedToY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bXraisedToYActionPerformed(evt);
            }
        });

        exp.setText("EXP");
        exp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expActionPerformed(evt);
            }
        });

        bsinh.setText("sinh");
        bsinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsinhActionPerformed(evt);
            }
        });

        bcosh.setText("cosh");
        bcosh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcoshActionPerformed(evt);
            }
        });

        btanh.setText("tanh");
        btanh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btanhActionPerformed(evt);
            }
        });

        bsqrt.setText("√");
        bsqrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsqrtActionPerformed(evt);
            }
        });

        bpai.setText("π");
        bpai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bpaiActionPerformed(evt);
            }
        });

        Braised2.setText("x^2");
        Braised2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Braised2ActionPerformed(evt);
            }
        });

        bHEX.setText("HEX");
        bHEX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bHEXActionPerformed(evt);
            }
        });

        bfact.setText("n!");
        bfact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bfactActionPerformed(evt);
            }
        });

        bOCT.setText("OCT");
        bOCT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bOCTActionPerformed(evt);
            }
        });

        bplusMinus.setText("±");
        bplusMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bplusMinusActionPerformed(evt);
            }
        });

        bBIN.setText("BIN");
        bBIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBINActionPerformed(evt);
            }
        });

        jRadioButton1.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("ON");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(bdeg, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(bsin, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(bcos, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(btan, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(bmod, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(bdiv, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(bXraisedToY, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(exp, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(bsinh, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(bcosh, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(btanh, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(bmul, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(bsqrt, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(bpai, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(bsub, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(bplusMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bBIN, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(Braised2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(7, 7, 7)
                                        .addComponent(bHEX, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(7, 7, 7)
                                        .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(bfact, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bOCT, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(7, 7, 7)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(b2, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                                    .addComponent(b5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(bsum, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(b3, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                                    .addComponent(bdot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bequal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(bxy, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(bonebyX, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(Braised3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(blog, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(buttonAC, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(bc, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bxy, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bc, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bonebyX, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Braised3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(blog, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonAC, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bdeg, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bsin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bcos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bmod, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bdiv, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bXraisedToY, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exp, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bsinh, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bcosh, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btanh, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(bmul, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bsqrt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bpai, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(bsub, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Braised2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bHEX, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bsum, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bfact, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bOCT, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bplusMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bBIN, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b0, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bdot, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(bequal, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        menuFile.setText("File");
        jMenuBar1.add(menuFile);

        jMenu1.setText("Edit");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Help");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        getOperand(b1);
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        getOperand(b2);
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        getOperand(b3);
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        getOperand(b4);
    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        getOperand(b5);
    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        getOperand(b6);
    }//GEN-LAST:event_b6ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        getOperand(b7);
    }//GEN-LAST:event_b7ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        getOperand(b8);
    }//GEN-LAST:event_b8ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        getOperand(b9);
    }//GEN-LAST:event_b9ActionPerformed

    private void bsumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsumActionPerformed
            try {
            if (!display.getText().equals("0")) {
                 getOperator(1);
            }

        } catch (NumberFormatException e) {
            display.setText("");
        }
    }//GEN-LAST:event_bsumActionPerformed

    private void bsubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsubActionPerformed
            try {
            if (!display.getText().equals("0")) {
                 getOperator(2);
            }

        } catch (NumberFormatException e) {
            display.setText("");
        }
    }//GEN-LAST:event_bsubActionPerformed

    private void bmulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmulActionPerformed
            try {
            if (!display.getText().equals("0")) {
                 getOperator(3);
            }

        } catch (NumberFormatException e) {
            display.setText("");
        }
    }//GEN-LAST:event_bmulActionPerformed

    private void bdivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdivActionPerformed
            try {
            if (!display.getText().equals("0")) {
                 getOperator(4);
            }

        } catch (NumberFormatException e) {
            display.setText("");
        }
    }//GEN-LAST:event_bdivActionPerformed

    private void bmodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmodActionPerformed
            try {
            if (!display.getText().equals("0")) {
                 getOperator(5);
            }

        } catch (NumberFormatException e) {
            display.setText("");
        }
    }//GEN-LAST:event_bmodActionPerformed

    private void bonebyXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bonebyXActionPerformed
        try {
            if (!display.getText().equals("0")) {
                getOperator(6);
            }

        } catch (NumberFormatException e) {
            display.setText("");
        }

    }//GEN-LAST:event_bonebyXActionPerformed

    private void bequalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bequalActionPerformed
            try {
            if (!display.getText().equals("0")) {
                  process();
            }

        } catch (NumberFormatException e) {
            display.setText("");
        }
    }//GEN-LAST:event_bequalActionPerformed

    private void b0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b0ActionPerformed
        getOperand(b0);
    }//GEN-LAST:event_b0ActionPerformed

    private void bdotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdotActionPerformed
        try {
            if (!display.getText().equals("0")) {
                getOperand(bdot);
            }

        } catch (NumberFormatException e) {
            display.setText("");
        }

    }//GEN-LAST:event_bdotActionPerformed

    private void bcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcActionPerformed
        if (operand.length() > 1) {
            operand = operand.substring(0, operand.length() - 1);
            model.setOperand(operand);
            display.setText(operand);
        } else {
            operand = "";
            model.setOperand(operand);
            display.setText("0");
        }
    }//GEN-LAST:event_bcActionPerformed

    private void buttonACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonACActionPerformed
        operand = "";
        model.setOperator(0);
        model.setResult(0);
        display.setText("0");
    }//GEN-LAST:event_buttonACActionPerformed

    private void bsinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsinActionPerformed
        try {
            if (!display.getText().equals("0")) {
                 getOperator(7);
            }

        } catch (NumberFormatException e) {
            display.setText("");
        }
       
    }//GEN-LAST:event_bsinActionPerformed

    private void bxyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bxyActionPerformed
        try {
            if (!display.getText().equals("0")) {
                getOperator(8);
            }

        } catch (NumberFormatException e) {
            display.setText("");
        }
    }//GEN-LAST:event_bxyActionPerformed

    private void Braised3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Braised3ActionPerformed
        try {
            if (!display.getText().equals("0")) {
                getOperator(9);
            }

        } catch (NumberFormatException e) {
            display.setText("");
        }
    }//GEN-LAST:event_Braised3ActionPerformed

    private void blogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blogActionPerformed
        try {
            if (!display.getText().equals("0")) {
                getOperator(9);
            }

        } catch (NumberFormatException e) {
            display.setText("");
        }
    }//GEN-LAST:event_blogActionPerformed

    private void bdegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdegActionPerformed
        try {
            if (!display.getText().equals("0")) {
                getOperator(11);
            }

        } catch (NumberFormatException e) {
            display.setText("");
        }
    }//GEN-LAST:event_bdegActionPerformed

    private void bcosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcosActionPerformed
        try {
            if (!display.getText().equals("0")) {
                getOperator(12);
            }

        } catch (NumberFormatException e) {
            display.setText("");
        }
    }//GEN-LAST:event_bcosActionPerformed

    private void btanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btanActionPerformed
        try {
            if (!display.getText().equals("0")) {
                getOperator(13);
            }

        } catch (NumberFormatException e) {
            display.setText("");
        }
    }//GEN-LAST:event_btanActionPerformed

    private void bXraisedToYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bXraisedToYActionPerformed
        try {
            if (!display.getText().equals("0")) {
                getOperator(14);
            }

        } catch (NumberFormatException e) {
            display.setText("");
        }
    }//GEN-LAST:event_bXraisedToYActionPerformed

    private void expActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expActionPerformed
        try {
            if (!display.getText().equals("0")) {
                getOperator(15);
            }

        } catch (NumberFormatException e) {
            display.setText("");
        }
    }//GEN-LAST:event_expActionPerformed

    private void bsinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsinhActionPerformed
        try {
            if (!display.getText().equals("0")) {
                getOperator(16);
            }

        } catch (NumberFormatException e) {
            display.setText("");
        }
    }//GEN-LAST:event_bsinhActionPerformed

    private void bcoshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcoshActionPerformed
        try {
            if (!display.getText().equals("0")) {
                getOperator(17);
            }

        } catch (NumberFormatException e) {
            display.setText("");
        }
    }//GEN-LAST:event_bcoshActionPerformed

    private void btanhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btanhActionPerformed
        try {
            if (!display.getText().equals("0")) {
                getOperator(18);
            }

        } catch (NumberFormatException e) {
            display.setText("");
        }
    }//GEN-LAST:event_btanhActionPerformed

    private void bsqrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsqrtActionPerformed
        try {
            if (!display.getText().equals("0")) {
                getOperator(19);
            }

        } catch (NumberFormatException e) {
            display.setText("");
        }
    }//GEN-LAST:event_bsqrtActionPerformed

    private void bpaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bpaiActionPerformed
        getOperator(20);
    }//GEN-LAST:event_bpaiActionPerformed

    private void Braised2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Braised2ActionPerformed
      try {
            if (!display.getText().equals("0")) {
                 getOperator(21);
            }

        } catch (NumberFormatException e) {
            display.setText("");
        }
    }//GEN-LAST:event_Braised2ActionPerformed

    private void bHEXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHEXActionPerformed
        try {
            if (display.getText() != null) {
                int hex = Integer.parseInt(display.getText());
                display.setText(Integer.toString(hex, 16));
            }

        } catch (NumberFormatException e) {
            display.setText("");
        }
    }//GEN-LAST:event_bHEXActionPerformed

    private void bfactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bfactActionPerformed
           try {
            if (!display.getText().equals("0")) {
                 getOperator(23);
            }

        } catch (NumberFormatException e) {
            display.setText("");
        }
    }//GEN-LAST:event_bfactActionPerformed

    private void bOCTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bOCTActionPerformed
        try {
            if (display.getText() != null) {
                int oct = Integer.parseInt(display.getText());
                display.setText(Integer.toString(oct, 8));
            }

        } catch (NumberFormatException e) {
            display.setText("");
        }
    }//GEN-LAST:event_bOCTActionPerformed

    private void bplusMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bplusMinusActionPerformed
        try {
            if (display.getText() != null) {
                double a = Double.parseDouble(String.valueOf(display.getText()));
                a = a * (-1);
                display.setText(String.valueOf(a));
            }
        } catch (NumberFormatException e) {
            display.setText("");
        }
    }//GEN-LAST:event_bplusMinusActionPerformed

    private void bBINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBINActionPerformed
        try {
            if (display.getText() != null) {
                int bin = Integer.parseInt(display.getText());
                display.setText(Integer.toString(bin, 2));
            }

        } catch (NumberFormatException e) {
            display.setText("");
        }
    }//GEN-LAST:event_bBINActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        if (jRadioButton1.isSelected()) {
            jRadioButton1.setText("ON");
             display.setText("0");
            b0.setEnabled(true);
            b1.setEnabled(true);
            b2.setEnabled(true);
            b3.setEnabled(true);
            b4.setEnabled(true);
            b5.setEnabled(true);
            b6.setEnabled(true);
            b7.setEnabled(true);
            b8.setEnabled(true);
            b9.setEnabled(true);
            bsum.setEnabled(true);
            bsub.setEnabled(true);
            bmul.setEnabled(true);
            bdiv.setEnabled(true);
            bmod.setEnabled(true);
            bXraisedToY.setEnabled(true);
            bequal.setEnabled(true);
            bpai.setEnabled(true);
            bsqrt.setEnabled(true);
            blog.setEnabled(true);
            bsin.setEnabled(true);
            bcos.setEnabled(true);
            btan.setEnabled(true);
            bonebyX.setEnabled(true);
            Braised3.setEnabled(true);
            bdot.setEnabled(true);
            buttonAC.setEnabled(true);
            bc.setEnabled(true);
            bdeg.setEnabled(true);
            Braised2.setEnabled(true);
            bplusMinus.setEnabled(true);
            bfact.setEnabled(true);
            exp.setEnabled(true);
            bsinh.setEnabled(true);
            bcosh.setEnabled(true);
            btanh.setEnabled(true);
            bBIN.setEnabled(true);
            bOCT.setEnabled(true);
            bHEX.setEnabled(true);
            bxy.setEnabled(true);
        } else {
            jRadioButton1.setText("OFF");
            display.setText("");
            b0.setEnabled(false);
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
            bsum.setEnabled(false);
            bsub.setEnabled(false);
            bmul.setEnabled(false);
            bdiv.setEnabled(false);
            bmod.setEnabled(false);
            bXraisedToY.setEnabled(false);
            bequal.setEnabled(false);
            bpai.setEnabled(false);
            bsqrt.setEnabled(false);
            blog.setEnabled(false);
            bsin.setEnabled(false);
            bcos.setEnabled(false);
            btan.setEnabled(false);
            bonebyX.setEnabled(false);
            Braised3.setEnabled(false);
            bdot.setEnabled(false);
            buttonAC.setEnabled(false);
            bc.setEnabled(false);
            bdeg.setEnabled(false);
            Braised2.setEnabled(false);
            bplusMinus.setEnabled(false);
            bfact.setEnabled(false);
            exp.setEnabled(false);
            bsinh.setEnabled(false);
            bcosh.setEnabled(false);
            btanh.setEnabled(false);
            bBIN.setEnabled(false);
            bOCT.setEnabled(false);
            bHEX.setEnabled(false);
            bxy.setEnabled(false);
        }

    }//GEN-LAST:event_jRadioButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Braised2;
    private javax.swing.JButton Braised3;
    private javax.swing.JButton b0;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton bBIN;
    private javax.swing.JButton bHEX;
    private javax.swing.JButton bOCT;
    private javax.swing.JButton bXraisedToY;
    private javax.swing.JButton bc;
    private javax.swing.JButton bcos;
    private javax.swing.JButton bcosh;
    private javax.swing.JButton bdeg;
    private javax.swing.JButton bdiv;
    private javax.swing.JButton bdot;
    private javax.swing.JButton bequal;
    private javax.swing.JButton bfact;
    private javax.swing.JButton blog;
    private javax.swing.JButton bmod;
    private javax.swing.JButton bmul;
    private javax.swing.JButton bonebyX;
    private javax.swing.JButton bpai;
    private javax.swing.JButton bplusMinus;
    private javax.swing.JButton bsin;
    private javax.swing.JButton bsinh;
    private javax.swing.JButton bsqrt;
    private javax.swing.JButton bsub;
    private javax.swing.JButton bsum;
    private javax.swing.JButton btan;
    private javax.swing.JButton btanh;
    private javax.swing.JButton buttonAC;
    private javax.swing.JButton bxy;
    private javax.swing.JTextField display;
    private javax.swing.JButton exp;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JMenu menuFile;
    // End of variables declaration//GEN-END:variables

    private void SetIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("standerd.png")));
    }
}
