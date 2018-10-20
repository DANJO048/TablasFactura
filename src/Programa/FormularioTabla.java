package Programa;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
//import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormularioTabla extends javax.swing.JFrame 
{
 
    //ArrayList<Persona> lista = new ArrayList <Persona>();
    Vector Persona = new Vector();
    Persona xPersona = new Persona();
    DefaultTableModel mdlTabla;
    Vector vCabecera = new Vector();
    public FormularioTabla() {
        initComponents();
        deshabilitarBTN();
        deshabilitarTXT();
        vCabecera.addElement("NOMBRE");
        vCabecera.addElement("APELLIDO");
        vCabecera.addElement("EDAD");
        mdlTabla = new DefaultTableModel(vCabecera,0);
        Tabla.setModel(mdlTabla);
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
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        bGuardar = new javax.swing.JButton();
        bNuevo = new javax.swing.JButton();
        bActualizar = new javax.swing.JButton();
        bCancelar = new javax.swing.JButton();
        bCambiar = new javax.swing.JButton();
        bEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("Formulario Datos Personales");

        jLabel2.setText("Nombre");

        jLabel3.setText("Apellido");

        jLabel4.setText("Edad");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtApellido)
                            .addComponent(txtEdad))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        bGuardar.setText("Guardar");
        bGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGuardarActionPerformed(evt);
            }
        });

        bNuevo.setText("Nuevo");
        bNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNuevoActionPerformed(evt);
            }
        });

        bActualizar.setText("Actualizar");

        bCancelar.setText("Cancelar");
        bCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarActionPerformed(evt);
            }
        });

        bCambiar.setText("Cambiar");

        bEliminar.setText("Eliminar");
        bEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEliminarActionPerformed(evt);
            }
        });

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellido", "Edad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Tabla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bCambiar)
                        .addGap(18, 18, 18)
                        .addComponent(bEliminar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(71, 71, 71))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bActualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bCancelar))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bCambiar)
                    .addComponent(bEliminar))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGuardarActionPerformed
        // Boton Guardar
        /*Persona persona = new Persona(txtNombre.getText(),txtApellido.getText(),txtEdad.getText());
        lista.add(persona);
        
        mostrar();*/
        mdlTabla = new DefaultTableModel();
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();        
        String edad = txtEdad.getText();
        
        xPersona.setNombre(nombre);
        xPersona.setApellido(apellido);
        xPersona.setEdad(edad);
        
        guardar(xPersona);
        guardarArchivo(xPersona);
        
        //Mostrando
        
        Tabla.setModel(mdlTabla);
        
        txtNombre.setText("");
        txtApellido.setText("");
        txtEdad.setText("");
        
        deshabilitarTXT();
        deshabilitarBTN();
        bNuevo.setEnabled(true);
    }//GEN-LAST:event_bGuardarActionPerformed

    private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed
        // Boton cancelar - solo limpia y bloquea botones y textboxs
        txtNombre.setText("");
        txtApellido.setText("");
        txtEdad.setText("");
        
        deshabilitarTXT();
        deshabilitarBTN();
        bNuevo.setEnabled(true);
    }//GEN-LAST:event_bCancelarActionPerformed

    private void bNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNuevoActionPerformed
        // Boton Nuevo -Habilita Botones y TextBoxs-
        habilitarTXT();
        habilitarBTN();
        bNuevo.setEnabled(false);
    }//GEN-LAST:event_bNuevoActionPerformed

    private void bEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEliminarActionPerformed
        // TODO add your handling code here:
        
        
        int row = this.Tabla.getSelectedRow();
        
        if(row>=0)
        {
            int confirmar = JOptionPane.showConfirmDialog(null,"Desea eliminar este registro","",JOptionPane.YES_NO_OPTION);
            if(confirmar==0)
            {
                mdlTabla.removeRow(row);
                JOptionPane.showMessageDialog(null,"Registro eliminado");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Por favor seleccione un registro para eliminar");
        }
        
        
    }//GEN-LAST:event_bEliminarActionPerformed

    //Guardar en vector
    public void guardar(Persona uPersona)
    {
        Persona.addElement(uPersona);
    }
    public void guardarArchivo(Persona persona)
    {
        try
        {
            FileWriter fw = new FileWriter("Persona.txt",true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.print(persona.getNombre());
            pw.print("|" + persona.getApellido());
            pw.println("|" + persona.getEdad());
            pw.close();
        }catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
    //MOSTRAR DATOS
    public DefaultTableModel Tabla()
    {
        Vector cabeceras = new Vector();
        cabeceras.addElement("Nombre");
        cabeceras.addElement("Apellido");
        cabeceras.addElement("Edad");
        //CREAMOS UN VECTOR QUE CONTENGA NOMBRE APELLIDO Y EDAD
        //CREAMOS UN MODELO DE TABLA PARA AGREGAR EL VECTOR, EN LA UBICACION 0
        DefaultTableModel mdlTable = new DefaultTableModel(cabeceras,0);
        try
        {
            FileReader fr = new FileReader ("Persona.txt");
            BufferedReader br = new BufferedReader(fr);
            String d;
            while((d=br.readLine())!=null)
            {
                StringTokenizer dato = new StringTokenizer(d,"|");
                Vector x = new Vector();
                while(dato.hasMoreTokens())
                {
                    x.addElement(dato.nextToken());
                }
                mdlTable.addRow(x);
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
                
        return mdlTable;
        
    }
    
    
    /*public void mostrar()//Se encarga de mostrar la matriz
    {
        String matriz[][]=new String[lista.size()][4];
        
        for(int i=0;i<lista.size();i++)
        {
            matriz[i][0]=lista.get(i).getNombre();
            matriz[i][1]=lista.get(i).getApellido();
            matriz[i][2]=lista.get(i).getEdad();
            
        }
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            matriz,
            new String [] {
                "Nombre", "Apellido", "Edad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
    }*/
    
    public void habilitarTXT()
    {
        txtNombre.setEnabled(true);
        txtApellido.setEnabled(true);
        txtEdad.setEnabled(true);
    }
    
    public void deshabilitarTXT()
    {
        txtNombre.setEnabled(false);
        txtApellido.setEnabled(false);
        txtEdad.setEnabled(false);
    }
    
     public void habilitarBTN()
    {
        bGuardar.setEnabled(true);
        bActualizar.setEnabled(true);
        bCancelar.setEnabled(true);
    }
    
    public void deshabilitarBTN()
    {
        bGuardar.setEnabled(false);
        bActualizar.setEnabled(false);
        bCancelar.setEnabled(false);
    }
   
    public static void main(String args[]) {
   
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormularioTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioTabla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JButton bActualizar;
    private javax.swing.JButton bCambiar;
    private javax.swing.JButton bCancelar;
    private javax.swing.JButton bEliminar;
    private javax.swing.JButton bGuardar;
    private javax.swing.JButton bNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
