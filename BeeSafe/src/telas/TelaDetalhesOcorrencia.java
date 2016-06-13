/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import dominio.BaseDeDados;
import dominio.Comentario;
import dominio.Ocorrencia;
import dominio.Usuario;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author ccouto
 */
public class TelaDetalhesOcorrencia extends javax.swing.JFrame {

    private BaseDeDados bd;
    private Usuario usuario;
    private Ocorrencia ocorrencia;
    private DefaultTableModel tabela;
    private SimpleDateFormat formataData;
    /**
     * Creates new form TelaDetalhesOcorrencia
     */
    public TelaDetalhesOcorrencia(BaseDeDados base, Usuario user, Ocorrencia ocorrencia) {
        super("Detalhes Ocorrência");
        this.bd = base;
        this.usuario = user;
        this.ocorrencia = ocorrencia;
        initComponents();
        
        preencherCampos();   
        desabilitarEdicoes();
        atualizarTabelaComentarios();
        
        //Centraliza a tela
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((tela.width - this.getSize().width) / 2, (tela.height - this.getSize().height) / 2);
        
        //Encerrar a aplicação quando fechar a tela 
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescricao = new javax.swing.JTextArea();
        lblDescricao = new javax.swing.JLabel();
        lblTipoOcorrencia = new javax.swing.JLabel();
        lblBairro = new javax.swing.JLabel();
        lblNumero = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        txtRua = new javax.swing.JTextField();
        txtData = new javax.swing.JTextField();
        lblData = new javax.swing.JLabel();
        lblRua = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblComentarios = new javax.swing.JLabel();
        btnDetalhes = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        txtBairro = new javax.swing.JTextField();
        txtTipoViolencia = new javax.swing.JTextField();
        lblTituloOcorrencia = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        btnComentar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelaComentarios = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setMaximumSize(new java.awt.Dimension(600, 600));
        jPanel1.setMinimumSize(new java.awt.Dimension(600, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 600));

        txtDescricao.setColumns(20);
        txtDescricao.setRows(5);
        jScrollPane2.setViewportView(txtDescricao);

        lblDescricao.setText("Descrição:");

        lblTipoOcorrencia.setText("Tipo de Ocorrência:");

        lblBairro.setText("Bairro:");

        lblNumero.setText("Número:");

        txtNumero.setMaximumSize(new java.awt.Dimension(210, 25));
        txtNumero.setMinimumSize(new java.awt.Dimension(210, 25));
        txtNumero.setPreferredSize(new java.awt.Dimension(210, 25));

        txtRua.setMaximumSize(new java.awt.Dimension(210, 25));
        txtRua.setMinimumSize(new java.awt.Dimension(210, 25));
        txtRua.setPreferredSize(new java.awt.Dimension(210, 25));

        txtData.setMaximumSize(new java.awt.Dimension(210, 25));
        txtData.setMinimumSize(new java.awt.Dimension(210, 25));
        txtData.setPreferredSize(new java.awt.Dimension(210, 25));

        lblData.setText("Data:");

        lblRua.setText("Rua:");

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTitulo.setText("Ocorrências");

        lblComentarios.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblComentarios.setText("Comentários Anteriores");

        btnDetalhes.setText("Detalhes");
        btnDetalhes.setMaximumSize(new java.awt.Dimension(100, 30));
        btnDetalhes.setMinimumSize(new java.awt.Dimension(100, 30));
        btnDetalhes.setPreferredSize(new java.awt.Dimension(100, 30));
        btnDetalhes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetalhesActionPerformed(evt);
            }
        });

        btnVoltar.setText("Voltar");
        btnVoltar.setMaximumSize(new java.awt.Dimension(100, 30));
        btnVoltar.setMinimumSize(new java.awt.Dimension(100, 30));
        btnVoltar.setPreferredSize(new java.awt.Dimension(100, 30));
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        txtBairro.setMaximumSize(new java.awt.Dimension(210, 25));
        txtBairro.setMinimumSize(new java.awt.Dimension(210, 25));
        txtBairro.setPreferredSize(new java.awt.Dimension(210, 25));

        txtTipoViolencia.setMaximumSize(new java.awt.Dimension(210, 25));
        txtTipoViolencia.setMinimumSize(new java.awt.Dimension(210, 25));
        txtTipoViolencia.setPreferredSize(new java.awt.Dimension(210, 25));

        lblTituloOcorrencia.setText("Título:");

        txtTitulo.setMaximumSize(new java.awt.Dimension(210, 25));
        txtTitulo.setMinimumSize(new java.awt.Dimension(210, 25));
        txtTitulo.setPreferredSize(new java.awt.Dimension(210, 25));

        btnComentar.setText("Comentar");
        btnComentar.setMaximumSize(new java.awt.Dimension(100, 30));
        btnComentar.setMinimumSize(new java.awt.Dimension(100, 30));
        btnComentar.setPreferredSize(new java.awt.Dimension(100, 30));
        btnComentar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComentarActionPerformed(evt);
            }
        });

        tabelaComentarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Data", "Usuário", "Título"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tabelaComentarios);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblBairro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(lblRua)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblData)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTipoOcorrencia, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNumero)
                            .addComponent(lblTituloOcorrencia))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTipoViolencia, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtNumero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblComentarios))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblTitulo)))
                        .addGap(0, 435, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnComentar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDescricao)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDetalhes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(176, 176, 176))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTipoViolencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblData, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTipoOcorrencia))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRua)
                    .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumero))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBairro)
                    .addComponent(lblTituloOcorrencia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblDescricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnComentar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(lblComentarios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDetalhes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDetalhesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetalhesActionPerformed
        //Verifica se um comentario foi selecionado, caso nao tenha, retorna um erro
        if(tabelaComentarios.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(this, "Nenhum Comentário selecionado!", "Atenção!", JOptionPane.WARNING_MESSAGE);
        }
        //caso tenha, abre a tela de detalhes da ocorrencia
        else{
            Object tituloComentario = tabelaComentarios.getValueAt(tabelaComentarios.getSelectedRow(), 2);
            Comentario comentario = ocorrencia.getComentario((String)tituloComentario);
            this.setVisible(false);
            new TelaDetalhesComentario(bd, usuario, ocorrencia, comentario).setVisible(true);
        }
    }//GEN-LAST:event_btnDetalhesActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.setVisible(false);
        new TelaPesquisar(bd, usuario).setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnComentarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComentarActionPerformed
        this.setVisible(false);
        new TelaComentar(bd, usuario, ocorrencia).setVisible(true);
    }//GEN-LAST:event_btnComentarActionPerformed

    private String formatarData(Date data){
        formataData = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormatada = "";
        try{
            dataFormatada = formataData.format(data);
        }
        catch(Exception e){}
        return dataFormatada;
    }
    
    //Preenche os campos com os dados da ocorrencia 
    private void preencherCampos(){
        txtData.setText(formatarData(ocorrencia.getData()));
        txtTipoViolencia.setText(ocorrencia.getTipoViolencia());
        txtBairro.setText(ocorrencia.getBairro().getNome());
        txtRua.setText(ocorrencia.getEndereco().getRua());
        txtNumero.setText(ocorrencia.getEndereco().getNumero()+"");
        txtTitulo.setText(ocorrencia.getTitulo());
        txtDescricao.setText(ocorrencia.getDescricao());
    }
    
    //Desabilita a edição dos campos de acordo com o usuario atual
    private void desabilitarEdicoes(){
        if(!usuario.equals(ocorrencia.getUsuario())){
            txtData.setEnabled(false);
            txtTipoViolencia.setEnabled(false);
            txtBairro.setEnabled(false);
            txtRua.setEnabled(false);
            txtNumero.setEnabled(false);
            txtTitulo.setEnabled(false);
            txtDescricao.setEnabled(false);
        }
    }
    
    private void atualizarTabelaComentarios(){
        TableRowSorter<TableModel> sorter = new TableRowSorter<>(tabelaComentarios.getModel());
        tabelaComentarios.setRowSorter(sorter);	
        tabela = (DefaultTableModel) tabelaComentarios.getModel();
        //Verifica se te algum dado anterior e exclui
        while (tabela.getRowCount() > 0) {
            tabela.removeRow(0);
        }
        List<Comentario> comentarios = ocorrencia.getListaComentarios();
        //Adiciona as ocorrencias na tabela
        for (Comentario c : comentarios) {
            tabela.addRow(new Object[] { formatarData(c.getData()), c.getUsuario().getNome(), c.getTitulo() });
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComentar;
    private javax.swing.JButton btnDetalhes;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblComentarios;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblRua;
    private javax.swing.JLabel lblTipoOcorrencia;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTituloOcorrencia;
    private javax.swing.JTable tabelaComentarios;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextArea txtDescricao;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtRua;
    private javax.swing.JTextField txtTipoViolencia;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
