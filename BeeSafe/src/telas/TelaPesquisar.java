/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import dominio.Bairro;
import dominio.BaseDeDados;
import dominio.Ocorrencia;
import dominio.Regiao;
import dominio.TipoViolencia;
import dominio.Usuario;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author ccouto
 */
public class TelaPesquisar extends javax.swing.JFrame {

    private BaseDeDados bd;
    private DefaultListModel lista;
    private DefaultComboBoxModel model;
    private List<Ocorrencia> ocorrencias;
    private SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yyyy");
    private Usuario usuario;

    /**
     * Creates new form TelaPesquisar
     */
    public TelaPesquisar(BaseDeDados base, Usuario user) {
        super("Pesquisas");
        this.bd = base;
        this.usuario = user;
        ocorrencias = new ArrayList<>();
        initComponents();
        
        preencherComboBairros();
        preencherComboRegioes();
        preencherComboTiposViolencia();
        atualizarListaOcorrencias(ocorrencias);

        //Centraliza a tela
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((tela.width - this.getSize().width) / 2, (tela.height - this.getSize().height) / 2);

        //Encerrar a aplicação quando fechar a tela 
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        lblTiposViolencia = new javax.swing.JLabel();
        lblRegiao = new javax.swing.JLabel();
        lblBairro = new javax.swing.JLabel();
        lblRua = new javax.swing.JLabel();
        txtDataInicial = new javax.swing.JTextField();
        comboTiposViolencia = new javax.swing.JComboBox<>();
        comboRegioes = new javax.swing.JComboBox<>();
        comboBairros = new javax.swing.JComboBox<>();
        txtRua = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaOcorrencias = new javax.swing.JList<>();
        btnVoltar = new javax.swing.JButton();
        txtDataFinal = new javax.swing.JTextField();
        lblDataFinal = new javax.swing.JLabel();
        btnDetalhes = new javax.swing.JButton();
        txtTitulo = new javax.swing.JTextField();
        lblTituloOcorrencia = new javax.swing.JLabel();
        btnLimpar = new javax.swing.JButton();
        btnPercentual = new javax.swing.JButton();
        btnQuantidade = new javax.swing.JButton();
        lblEstatisticas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setText("PESQUISAR");

        lblData.setText("Data Inicial:");

        lblTiposViolencia.setText("Tipo de Violência:");

        lblRegiao.setText("Região:");

        lblBairro.setText("Bairro:");

        lblRua.setText("Rua:");

        comboTiposViolencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        comboRegioes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        comboBairros.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        listaOcorrencias.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listaOcorrencias);

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        lblDataFinal.setText("Data Final:");

        btnDetalhes.setText("Detalhes");
        btnDetalhes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetalhesActionPerformed(evt);
            }
        });

        lblTituloOcorrencia.setText("Título:");

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnPercentual.setText("Percentual");
        btnPercentual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPercentualActionPerformed(evt);
            }
        });

        btnQuantidade.setText("Quantidade");
        btnQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuantidadeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(lblTitulo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblData)
                        .addGap(44, 44, 44)
                        .addComponent(txtDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTiposViolencia)
                            .addComponent(lblDataFinal)
                            .addComponent(lblRegiao)
                            .addComponent(lblBairro)
                            .addComponent(lblRua)
                            .addComponent(lblTituloOcorrencia))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(comboRegioes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(comboBairros, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(comboTiposViolencia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(btnPesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnQuantidade)
                            .addComponent(btnDetalhes))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPercentual)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblEstatisticas)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lblTitulo)
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblData)
                    .addComponent(txtDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDataFinal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTiposViolencia)
                    .addComponent(comboTiposViolencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(comboRegioes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboBairros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblRegiao)
                        .addGap(12, 12, 12)
                        .addComponent(lblBairro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblRua)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblTituloOcorrencia)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPesquisar)
                    .addComponent(btnLimpar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPercentual)
                    .addComponent(btnQuantidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(lblEstatisticas)
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltar)
                    .addComponent(btnDetalhes))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        txtDataInicial.setText("");
        txtDataFinal.setText("");
        txtRua.setText("");
        comboBairros.setSelectedIndex(0);
        comboRegioes.setSelectedIndex(0);
        comboTiposViolencia.setSelectedIndex(0);
        lblEstatisticas.setText("");
        atualizarListaOcorrencias(new ArrayList<>());
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnDetalhesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetalhesActionPerformed
        //Verifica se um ocorrencia foi selecionada, caso nao tenha, retorna um erro
        if(listaOcorrencias.getSelectedIndex() == -1){
            JOptionPane.showMessageDialog(this, "Nenhuma Ocorrência selecionada!", "Atenção!", JOptionPane.WARNING_MESSAGE);
        }
        //caso tenha, abre a tela de detalhes da ocorrencia
        else{
            Object selecionado = listaOcorrencias.getModel().getElementAt(listaOcorrencias.getSelectedIndex());
            Ocorrencia ocorrencia = (Ocorrencia)selecionado;
            this.setVisible(false);
            new TelaDetalhesOcorrencia(bd, usuario, ocorrencia).setVisible(true);
        }
    }//GEN-LAST:event_btnDetalhesActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.setVisible(false);
        new TelaPrincipal(bd, usuario).setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        Calendar dataInicial = null;
        Calendar dataFinal = null;
        String tipoViolencia = "";
        String regiao = "";
        Bairro bairro = null;
        String rua = "";
        lblEstatisticas.setText("");
        boolean ok = true;
        //Verifica se a data inicial foi preenchida e se e uma data valida
        if(!txtDataInicial.getText().equals("")){
            dataInicial = converterData(txtDataInicial.getText());
            if(dataInicial == null){
                JOptionPane.showMessageDialog(this, "Data Inicial Inválida!", "Atenção!", JOptionPane.WARNING_MESSAGE);
                txtDataInicial.setText("");
                ok = false;
            }
        }
        //Verifica se a data final foi preenchida e se e uma data valida
        if(!txtDataFinal.getText().equals("")){
            dataFinal = converterData(txtDataFinal.getText());
            if(dataFinal == null){
                JOptionPane.showMessageDialog(this, "Data Final Inválida!", "Atenção!", JOptionPane.WARNING_MESSAGE);
                txtDataFinal.setText("");
                ok = false;
            }
        }
        //se as datas sao validas continua a filtrar os resultados
        if(ok){
            if(comboTiposViolencia.getSelectedIndex() != -1 && comboTiposViolencia.getSelectedIndex() != 0){
                tipoViolencia = comboTiposViolencia.getSelectedItem().toString();
            }
            if(comboRegioes.getSelectedIndex() != -1 && comboRegioes.getSelectedIndex() != 0){
                regiao = comboRegioes.getSelectedItem().toString();
            }
            if(comboBairros.getSelectedIndex() != -1 && comboBairros.getSelectedIndex() != 0){
                bairro = (Bairro)comboBairros.getSelectedItem();
            }

            List<Object> parametros = new ArrayList<>();
            parametros.add(dataInicial);
            parametros.add(dataFinal);
            parametros.add(tipoViolencia);
            parametros.add(regiao);
            parametros.add(bairro);
            parametros.add(rua);

            ocorrencias = bd.pesquisar(parametros);
            atualizarListaOcorrencias(ocorrencias);
            if (ocorrencias.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Nenhuma Ocorrência encontrada!", "Atenção!", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuantidadeActionPerformed
        lblEstatisticas.setText("Foram encontradas " + ocorrencias.size() + " ocorrências!");
    }//GEN-LAST:event_btnQuantidadeActionPerformed

    private void btnPercentualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPercentualActionPerformed
        double totalOcorrencias = bd.getOcorrencias().size();
        double ocorrenciasFiltradas = ocorrencias.size();
        double percentual = (ocorrenciasFiltradas/totalOcorrencias)*100.0;
        lblEstatisticas.setText("Estas ocorrências correspondem a " + percentual + "% do total!");
    }//GEN-LAST:event_btnPercentualActionPerformed

    //Converte a string digitada em uma Data
    private Calendar converterData(String data){
        Calendar c = Calendar.getInstance();
        try {
            c.setTime(formataData.parse(data));
            return c;
        }
        catch (Exception e) {
            return null;
        }
    }
    
    private void atualizarListaOcorrencias(List<Ocorrencia> listaOcorrencias){
        lista = new DefaultListModel();
        ocorrencias = listaOcorrencias;
        for(Ocorrencia o : ocorrencias){
            lista.addElement(o);
        }
        this.listaOcorrencias.setModel(lista);
    }
    
    private void preencherComboBairros() {
        model = new DefaultComboBoxModel();
        model.addElement("--Selecione--");
        List<Bairro> bairros = bd.getBairros();
        for (Bairro b : bairros) {
            model.addElement(b);
        }
        comboBairros.setModel(model);
    }

    private void preencherComboRegioes() {
        model = new DefaultComboBoxModel();
        model.addElement("--Selecione--");
        List<Regiao> regioes = bd.getRegioes();
        for (Regiao r : regioes) {
            model.addElement(r);
        }
        comboRegioes.setModel(model);
    }

    private void preencherComboTiposViolencia() {
        model = new DefaultComboBoxModel();
        model.addElement("--Selecione--");
        List<TipoViolencia> tipos = bd.getTiposViolencia();
        for (TipoViolencia t : tipos) {
            model.addElement(t);
        }
        comboTiposViolencia.setModel(model);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDetalhes;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnPercentual;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnQuantidade;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> comboBairros;
    private javax.swing.JComboBox<String> comboRegioes;
    private javax.swing.JComboBox<String> comboTiposViolencia;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblDataFinal;
    private javax.swing.JLabel lblEstatisticas;
    private javax.swing.JLabel lblRegiao;
    private javax.swing.JLabel lblRua;
    private javax.swing.JLabel lblTiposViolencia;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTituloOcorrencia;
    private javax.swing.JList<String> listaOcorrencias;
    private javax.swing.JTextField txtDataFinal;
    private javax.swing.JTextField txtDataInicial;
    private javax.swing.JTextField txtRua;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
