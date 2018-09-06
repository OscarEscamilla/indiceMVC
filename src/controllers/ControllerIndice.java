/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import models.ModelIndice;
import views.ViewIndice;

/**
 *
 * @author Oscar
 */
public class ControllerIndice implements ActionListener{
    
    private final ViewIndice viewindice;
    private final ModelIndice modelindice;
    
    public ControllerIndice(ViewIndice viewindice, ModelIndice modelindice){
        this.viewindice = viewindice;
        this.modelindice = modelindice;
        viewindice.jb_calcular.addActionListener(this);
        initComponents();
       
    }
     @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==viewindice.jb_calcular){
            calcularIndice();
        }
       
    }
    private void calcularIndice(){
        
        
        
        modelindice.setPeso(Float.parseFloat(viewindice.jtf_peso.getText()));
        modelindice.setEstatura(Float.parseFloat(viewindice.jtf_estatura.getText()));
        System.out.println(modelindice.getEstatura());
        System.out.println(modelindice.getPeso());
        modelindice.setMasa(modelindice.getPeso() / (modelindice.getEstatura() * modelindice.getEstatura())) ;
        
        
        
         if( modelindice.getMasa() <= 16.4){
                modelindice.setMensaje("Delgadez");
            }else if (modelindice.getMasa() >= 16.5 && modelindice.getMasa() <= 22.9){
                modelindice.setMensaje("Peso Saludable");
            }else if (modelindice.getMasa() >= 23 && modelindice.getMasa() <= 27.9){
                modelindice.setMensaje("Sobrepeso");
            }else if (modelindice.getMasa() >= 28 && modelindice.getMasa() <=32.9){
                modelindice.setMensaje("Obesidad Moderada");
            }else if (modelindice.getMasa() >= 33 && modelindice.getMasa() <= 37.9){
                modelindice.setMensaje("Obesidad Severa");
            }else if (modelindice.getMasa() >= 38){
                modelindice.setMensaje("Obesidad muy severa");
            }
        
        JOptionPane.showMessageDialog(null, modelindice.getMensaje() + " " + modelindice.getMasa());
        viewindice.jtf_estatura.setText(" ");
        viewindice.jtf_peso.setText(" ");
        
       
        
    }
    public final void initComponents(){
        //viewindice.jlMessage.setText(modelMessage.getMessage());
        viewindice.setVisible(true);
    }
    
    
    
}
  