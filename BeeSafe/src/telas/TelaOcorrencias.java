/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import dominio.BaseDeDados;
import dominio.Ocorrencia;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Clark
 */
public class TelaOcorrencias extends javax.swing.JPanel {

    private BaseDeDados bd;
    private DefaultListModel lista = new DefaultListModel(); 
    private DefaultComboBoxModel model = new DefaultComboBoxModel();
    /**
     * Creates new form TelaOcorrencias
     */
    public TelaOcorrencias(BaseDeDados base) {
        this.bd = base;
        initComponents();
        
        atualizarListaOcorrencias();
        
        //Centraliza a tela
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((tela.width - this.getSize().width) / 2, (tela.height - this.getSize().height) / 2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        lblRua = new javax.swing.JLabel();
        lblNumero = new javax.swing.JLabel();
        lblBairro = new javax.swing.JLabel();
        lblTipoOcorrencia = new javax.swing.JLabel();
        txtData = new javax.swing.JTextField();
        txtRua = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        comboBairros = new javax.swing.JComboBox();
        comboTipoOcorrencia = new javax.swing.JComboBox();
        btnCriarOcorrencia = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaOcorrencias = new javax.swing.JList();
        btnVoltar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescricao = new javax.swing.JTextArea();

        lblTitulo.setText("OCORRÊNCIAS");

        lblData.setText("Data:");

        lblRua.setText("Rua:");

        lblNumero.setText("Número:");

        lblBairro.setText("Bairro:");

        lblTipoOcorrencia.setText("Tipo de Ocorrência:");

        comboBairros.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        comboTipoOcorrencia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnCriarOcorrencia.setText("Criar");
        btnCriarOcorrencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriarOcorrenciaActionPerformed(evt);
            }
        });

        listaOcorrencias.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listaOcorrencias);

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        txtDescricao.setColumns(20);
        txtDescricao.setRows(5);
        jScrollPane2.setViewportView(txtDescricao);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(lblTitulo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblData)
                            .addComponent(lblRua)
                            .addComponent(lblNumero)
                            .addComponent(lblBairro))
                        .addGap(68, 68, 68)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtData)
                            .addComponent(txtRua)
                            .addComponent(txtNumero)
                            .addComponent(comboBairros, 0, 150, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(128, 128, 128)
                            .addComponent(btnVoltar))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(lblTipoOcorrencia)
                            .addGap(18, 18, 18)
                            .addComponent(comboTipoOcorrencia, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(128, 128, 128)
                            .addComponent(btnCriarOcorrencia))))
                .addGap(0, 58, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblData)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblRua))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNumero)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBairro)
                    .addComponent(comboBairros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipoOcorrencia)
                    .addComponent(comboTipoOcorrencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCriarOcorrencia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVoltar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCriarOcorrenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarOcorrenciaActionPerformed
        if (txtData.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Você deve informar a Data.", "Atenção!", JOptionPane.WARNING_MESSAGE);
            return;
        } 
        else if (txtRua.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Você deve informar a Rua.", "Atenção!", JOptionPane.WARNING_MESSAGE);
            return;
        } 
        else if (txtNumero.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Você deve informar o Número.", "Atenção!", JOptionPane.WARNING_MESSAGE);
            return;
        } 
        else if (comboBairros.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(this, "Você deve selecionar o Bairro!", "Atenção!", JOptionPane.WARNING_MESSAGE);
            return;
        }
        else if (comboTipoOcorrencia.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(this, "Você deve selecionar o Tipo de Ocorrência!", "Atenção!", JOptionPane.WARNING_MESSAGE);
            return;
        }
        else{
            //String rua, int numero, String nomeBairro, String nomeUsuario, String email, String senha, String descricao, String tipoDeViolencia, Date data
            String mensagem = bd.criarOcorrencia(txtRua.getText(), txtNumero.getText(), comboBairros.getSelectedItem().toString(), "user", "email", "senha", txtDescricao.getText(), comboTipoOcorrencia.getSelectedItem().toString(), new Date());
            if(!mensagem.equals("OK")){
                JOptionPane.showMessageDialog(this, mensagem, "Atenção!", JOptionPane.WARNING_MESSAGE);
            }
            else{
                txtRua.setText("");
                txtNumero.setText("");
                txtDescricao.setText("");
                comboBairros.setSelectedIndex(-1);
                atualizarListaOcorrencias();
            }
        }
    }//GEN-LAST:event_btnCriarOcorrenciaActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.setVisible(false);
        new TelaInicial(bd).setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void atualizarListaOcorrencias(){
        //A lista está ficando duplicada
        List<Ocorrencia> ocorrencias = bd.getOcorrencias();
        for(Ocorrencia o : ocorrencias){
            lista.addElement(o);
        }
        this.listaOcorrencias.setModel(lista);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCriarOcorrencia;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox comboBairros;
    private javax.swing.JComboBox comboTipoOcorrencia;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblRua;
    private javax.swing.JLabel lblTipoOcorrencia;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JList listaOcorrencias;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextArea txtDescricao;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtRua;
    // End of variables declaration//GEN-END:variables
}
