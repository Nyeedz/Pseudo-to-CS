package principal;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {
    public int testaCampo = 1;
    public int abrir = 0;
    public int traduzir = 0;
    public int compilar = 0;
    

    public Principal() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelPseudo = new javax.swing.JLabel();
        labelCsharp = new javax.swing.JLabel();
        scrollPseudo = new javax.swing.JScrollPane();
        textPseudo = new javax.swing.JTextArea();
        scrollCsharp = new javax.swing.JScrollPane();
        textCsharp = new javax.swing.JTextArea();
        btVerificarP = new javax.swing.JButton();
        btTraduzirP = new javax.swing.JButton();
        btLimparP = new javax.swing.JButton();
        btExecutarF = new javax.swing.JButton();
        btFechar = new javax.swing.JButton();
        btLimparF = new javax.swing.JButton();
        BCompilarF = new javax.swing.JButton();
        btAbrirP = new javax.swing.JButton();
        btVerificarF = new javax.swing.JButton();
        labelCsharp1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(162, 177, 195));
        jPanel1.setForeground(new java.awt.Color(22, 33, 153));

        labelPseudo.setBackground(new java.awt.Color(22, 18, 14));
        labelPseudo.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        labelPseudo.setForeground(new java.awt.Color(250, 234, 234));
        labelPseudo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/1480002964_laptop_64.png"))); // NOI18N
        labelPseudo.setText("Sistema de Conversão, Execução e Verificação de Pseudocódigos");

        labelCsharp.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        labelCsharp.setForeground(new java.awt.Color(241, 234, 234));
        labelCsharp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/1480001977_Coding_Icons_-_SOLID-14.png"))); // NOI18N

        textPseudo.setColumns(20);
        textPseudo.setRows(5);
        scrollPseudo.setViewportView(textPseudo);

        textCsharp.setColumns(20);
        textCsharp.setRows(5);
        scrollCsharp.setViewportView(textCsharp);

        btVerificarP.setText("Verificar");
        btVerificarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVerificarPActionPerformed(evt);
            }
        });

        btTraduzirP.setText("Traduzir");
        btTraduzirP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTraduzirPActionPerformed(evt);
            }
        });

        btLimparP.setText("Limpar");
        btLimparP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparPActionPerformed(evt);
            }
        });

        btExecutarF.setText("Executar");
        btExecutarF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExecutarFActionPerformed(evt);
            }
        });

        btFechar.setText("Fechar");
        btFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFecharActionPerformed(evt);
            }
        });

        btLimparF.setText("Limpar");
        btLimparF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparFActionPerformed(evt);
            }
        });

        BCompilarF.setText("Compilar");
        BCompilarF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCompilarFActionPerformed(evt);
            }
        });

        btAbrirP.setText("Abrir");
        btAbrirP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAbrirPActionPerformed(evt);
            }
        });

        btVerificarF.setText("Verificar");
        btVerificarF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVerificarFActionPerformed(evt);
            }
        });

        labelCsharp1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        labelCsharp1.setForeground(new java.awt.Color(241, 234, 234));
        labelCsharp1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/1480002358_Technology_Mix_-_Final-15.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btLimparP, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btTraduzirP, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btVerificarP, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btAbrirP, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(scrollPseudo)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(labelCsharp1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(labelCsharp, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(172, 172, 172))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btVerificarF, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btLimparF, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BCompilarF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(scrollCsharp, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btExecutarF, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(38, 38, 38))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(labelPseudo, javax.swing.GroupLayout.PREFERRED_SIZE, 753, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(labelPseudo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCsharp1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCsharp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollCsharp, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scrollPseudo, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btVerificarP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btAbrirP)
                    .addComponent(btExecutarF)
                    .addComponent(btFechar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btLimparP)
                    .addComponent(btTraduzirP)
                    .addComponent(btLimparF)
                    .addComponent(BCompilarF))
                .addGap(18, 18, 18)
                .addComponent(btVerificarF)
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btVerificarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVerificarPActionPerformed
         if (abrir == 0){
            JOptionPane.showMessageDialog(null, "Abra algum arquivo!");
        }else{
                    
        final Terminal shell = new Terminal();
        String retorno;

        try {
            
            String path = new File("").getAbsolutePath();
            path += "/../../io/entrada.txt";
            BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
            buffWrite.write(textPseudo.getText());
            buffWrite.close();
            //Executando o script do analisador
            retorno = shell.executeCommand("./../../scripts/verificar.sh");
            System.out.println(retorno);
            if (retorno.equalsIgnoreCase("0")) {
                JOptionPane.showMessageDialog(null, "O pseudocodigo esta correto!");
            } else {
                JOptionPane.showMessageDialog(null, "O pseudocodigo esta incorreto!");
            }
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
         }
    }//GEN-LAST:event_btVerificarPActionPerformed

    private void btTraduzirPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTraduzirPActionPerformed
       traduzir=1;
        if (abrir == 0){
            JOptionPane.showMessageDialog(null, "Abra algum arquivo!");
        }else{
        String path = new File("").getAbsolutePath();
        String texto = "", linha = "";
        path += "/../../io/saida.txt";
        try {
            BufferedReader buffRead = new BufferedReader(new FileReader(path));
            while (true) {
                if (linha != null) {
                    texto+=linha;
                    texto+="\n";

                } else {
                    break;
                }
                linha = buffRead.readLine();
            }
            textCsharp.setText(texto);
            buffRead.close();
            

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
       
    }//GEN-LAST:event_btTraduzirPActionPerformed

    private void btLimparPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparPActionPerformed
        textPseudo.setText("");
    }//GEN-LAST:event_btLimparPActionPerformed

    private void btExecutarFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExecutarFActionPerformed
        if (compilar == 0){
            JOptionPane.showMessageDialog(null, "Compile seu arquivo primeiro!");
        }else{            
    //só abre o terminal, nao abre direto o shell
            OutputStream out = null;
            InputStream in = null;
            final ArrayList comandos = new ArrayList();
            comandos.add("xterm");
            comandos.add("-hold");
            comandos.add("-e");
            comandos.add("./../../scripts/testSharpExec.sh");
            try {
                Process proc = new ProcessBuilder(comandos).start();
              } catch (IOException e1) {
                e1.printStackTrace();
            }
            finally {
                if (out != null) {
                    try {
                        out.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }//GEN-LAST:event_btExecutarFActionPerformed

    private void btFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFecharActionPerformed
      System.exit(0);
    }//GEN-LAST:event_btFecharActionPerformed

    private void btLimparFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparFActionPerformed
        textCsharp.setText("");
    }//GEN-LAST:event_btLimparFActionPerformed

    private void BCompilarFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCompilarFActionPerformed
        compilar=1;
         if (traduzir == 0){
            JOptionPane.showMessageDialog(null, "Traduza algum arquivo!");
        }else{
        final Terminal shell = new Terminal();
        String retorno;
        
        String path = new File("").getAbsolutePath();
        path += "/../../io/executar.cs";
        try {
            BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
            buffWrite.write(textCsharp.getText());
            buffWrite.close();
            
             //Executando o script do analisador
            retorno = shell.executeCommand("./../../scripts/testSharp.sh");
            System.out.println(retorno);
            if (retorno.equalsIgnoreCase("0")) {
                JOptionPane.showMessageDialog(null, "O codigo esta correto!");
            } else {
                JOptionPane.showMessageDialog(null, "O codigo esta incorreto!");
            }
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }  
         }
    }//GEN-LAST:event_BCompilarFActionPerformed

    private void btAbrirPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAbrirPActionPerformed
        abrir =1;
        JFileChooser chooserArquivo = new JFileChooser();
        chooserArquivo.showOpenDialog(this);
        File file = chooserArquivo.getSelectedFile();
        
        try {
            Path path = Paths.get(file.getAbsolutePath());
            String retorno = new String (Files.readAllBytes(path));
            textPseudo.setText(retorno);
            testaCampo = 0;
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Não foi possivel abrir o arquivo");
           
        }
    }//GEN-LAST:event_btAbrirPActionPerformed

    private void btVerificarFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVerificarFActionPerformed
         if (traduzir == 0){
            JOptionPane.showMessageDialog(null, "Traduza algum arquivo!");
        }else{
            
             final Terminal shell = new Terminal();
             String retorno;

        try {
            String path = new File("").getAbsolutePath();
            path += "/../../io/saida.txt";
            BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
            buffWrite.write(textCsharp.getText());
            buffWrite.close();
            //Executando o script do analisador
            retorno = shell.executeCommand("./../../scripts/compileV.sh");
            System.out.println(retorno);
            if (retorno.equalsIgnoreCase("0")) {
                JOptionPane.showMessageDialog(null, "O codigo esta correto!");
            } else {
                JOptionPane.showMessageDialog(null, "O codigo esta incorreto!");
            }
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         } 
        
    }//GEN-LAST:event_btVerificarFActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BCompilarF;
    private javax.swing.JButton btAbrirP;
    private javax.swing.JButton btExecutarF;
    private javax.swing.JButton btFechar;
    private javax.swing.JButton btLimparF;
    private javax.swing.JButton btLimparP;
    private javax.swing.JButton btTraduzirP;
    private javax.swing.JButton btVerificarF;
    private javax.swing.JButton btVerificarP;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelCsharp;
    private javax.swing.JLabel labelCsharp1;
    private javax.swing.JLabel labelPseudo;
    private javax.swing.JScrollPane scrollCsharp;
    private javax.swing.JScrollPane scrollPseudo;
    private javax.swing.JTextArea textCsharp;
    private javax.swing.JTextArea textPseudo;
    // End of variables declaration//GEN-END:variables
}
