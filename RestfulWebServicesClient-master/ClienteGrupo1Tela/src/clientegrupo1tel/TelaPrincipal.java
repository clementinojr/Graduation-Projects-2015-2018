/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientegrupo1tel;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import org.Cliente;

/**
 *
 * @author junin
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btTelaCadastro = new javax.swing.JButton();
        btTelaEditar = new javax.swing.JButton();
        btTelaDeletar = new javax.swing.JButton();
        btListarCliente = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ordem de Servico - Cliente");

        btTelaCadastro.setText("Cadastrar");
        btTelaCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTelaCadastroActionPerformed(evt);
            }
        });

        btTelaEditar.setText("Editar");
        btTelaEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTelaEditarActionPerformed(evt);
            }
        });

        btTelaDeletar.setText("Deletar");
        btTelaDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTelaDeletarActionPerformed(evt);
            }
        });

        btListarCliente.setText("Listar Clientes");
        btListarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListarClienteActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(jList1);

        jLabel2.setText("ID");

        jLabel3.setText("Nome");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btTelaDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btTelaEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btTelaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(82, 82, 82)
                        .addComponent(jLabel3)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btListarCliente)
                .addGap(90, 90, 90))
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(btTelaCadastro)
                        .addGap(18, 18, 18)
                        .addComponent(btTelaEditar)
                        .addGap(18, 18, 18)
                        .addComponent(btTelaDeletar))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btListarCliente)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btTelaCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTelaCadastroActionPerformed
        // TODO add your handling code here:
        TelaCadastro2  telaCadastro = new TelaCadastro2();
        telaCadastro.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btTelaCadastroActionPerformed

    private void btTelaEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTelaEditarActionPerformed
        // TODO add your handling code here:
       if(jList1.isSelectionEmpty()){
           JOptionPane.showMessageDialog(null, "Selecione Algum usuario");
       }
       else{
       String codigo ="";
       String id= "";
       codigo=jList1.getSelectedValue();
       codigo = codigo.substring(0,4);
       
     
       
        id = codigo.trim();
         int i = Integer.parseInt(id);
         
     
         
         
          Cliente a = new Cliente();
          String  idCliente1 = "http://localhost:48910/ClienteGrupo1/webresources/cliente/consultar/";
        String idCLienteFinal = idCliente1.concat(id);
       
        Client c = Client.create();
        WebResource wr = c.resource(idCLienteFinal);
        String response = wr.get(String.class);  
        Gson gson = new Gson();
        a = gson.fromJson(response, Cliente.class );
        
        
        
                
    
        TelaEditar tela = new TelaEditar();
        tela.enviaID(a);
        tela.setVisible(true);
        this.dispose();
        
       }
         
    }//GEN-LAST:event_btTelaEditarActionPerformed

    private void btListarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListarClienteActionPerformed
        // TODO add your handling code here:
         DefaultListModel listModel = new DefaultListModel();
         
        List<Cliente> lista = new ArrayList();
        java.lang.reflect.Type listType = new TypeToken<ArrayList<Cliente>>(){}.getType();
        
        Client c = Client.create();
        WebResource wr = c.resource("http://localhost:48910/ClienteGrupo1/webresources/cliente/listaCliente");
        String response = wr.get(String.class);  
        Gson gson = new Gson();
        lista = gson.fromJson(response, listType );
        String s= "";
                
        for (int i = 0; i < lista.size();i++)
        {
            s+=+lista.get(i).getId()+lista.get(i).getNome()+"\n";
            listModel.addElement(lista.get(i).getId()+"                        "+lista.get(i).getNome());
        }
        
        jList1.setModel(listModel);
       
       
    }//GEN-LAST:event_btListarClienteActionPerformed

    private void btTelaDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTelaDeletarActionPerformed
        // TODO add your handling code here:
         if(jList1.isSelectionEmpty()){
           JOptionPane.showMessageDialog(null, "Selecione Algum usuario");
       }
         else{
       String codigo_delete ="";
       String id_delete= "";
       codigo_delete=jList1.getSelectedValue();
       codigo_delete = codigo_delete.substring(0,4);
       id_delete = codigo_delete.trim();
       
       
       String Delete = "http://localhost:48910/ClienteGrupo1/webresources/cliente/remove/";
       String idDeletar = Delete+id_delete;
       
       
       Client c = Client.create();
        WebResource wr = c.resource(idDeletar);
        String response = wr.delete(String.class);  
                
        System.out.println(response);
        if(response.equals("deu bom")){
             JOptionPane.showMessageDialog(null, "Usu??rio Deletado com Sucesso");
             btListarClienteActionPerformed(evt);
        }
         }
    }//GEN-LAST:event_btTelaDeletarActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
                
            }
        });
    }
TelaEditar telaEditar = new TelaEditar();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btListarCliente;
    private javax.swing.JButton btTelaCadastro;
    private javax.swing.JButton btTelaDeletar;
    private javax.swing.JButton btTelaEditar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
