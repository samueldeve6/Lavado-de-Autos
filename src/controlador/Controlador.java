/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Modelo;
import vista.Vista;


/**
 *
 * @author Usuario
 */
public class Controlador implements ActionListener {
    private Modelo model;
    private Vista view;
    
    public Controlador(Vista view,Modelo model) {
        this.view = view;
        this.model = model;
        this.view.btnCalcularProduccion.addActionListener(this);
        
    }
    public void iniciarVista(){
       
       view.comboTipoAuto.addItem("Automóvil");
       view.comboTipoAuto.addItem("Camioneta");
       
       view.setLocationRelativeTo(null);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        String m;
        m = (String) view.comboTipoAuto.getSelectedItem();
       
        
        if("Automóvil".equals(m)){
          model.setLavadoBasico(Integer.parseInt(view.textLavadoBasico.getText()));
          model.setLavadoEspecial(Integer.parseInt(view.textLavadoEspecial.getText()));
          model.setDesinfeccionBasica(Integer.parseInt(view.textDesinfeccionBasica.getText()));
          model.setDesinfeccionAvanzada(Integer.parseInt(view.textDesinfeccionAvanzada.getText()));
          model.setCombo1(Integer.parseInt(view.textCombo1.getText()));
          model.setCombo2(Integer.parseInt(view.textCombo2.getText()));
          model.setCombo3(Integer.parseInt(view.textCombo3.getText()));
          model.setNombreFuncionario(String.valueOf(view.textNombre.getText()));
          model.setFecha(String.valueOf(view.textFecha.getText()));
          
          model.calculaLavadoBasicoAutomovil();
          view.textProduccionLavadoBasico.setText(String.valueOf(model.getResultadoLavadoBasico()));
          model.calculaLavadoEspecialAutomovil();
          view.textProduccionLavadoEspecial.setText(String.valueOf(model.getResultadoLavadoEspecial()));
          model.calculaDesinfeccionBasicaAutomovil();
          view.textProduccionDesinfeccionBasica.setText(String.valueOf(model.getResultadoDesinfeccionBasica()));
          model.calculaDesinfeccionAvanzadaAutomovil();
          view.textProduccionDesinfeccionAvanzada.setText(String.valueOf(model.getResultadoDesinfeccionAvanzada()));
          model.calculaCombo1Automovil();
          view.textProduccionCombo1.setText(String.valueOf(model.getResultadoCombo1()));
          model.calculaCombo2Automovil();
          view.textProduccionCombo2.setText(String.valueOf(model.getResultadoCombo2()));
          model.calculaCombo3Automovil();  
          view.textProduccionCombo3.setText(String.valueOf(model.getResultadoCombo3()));
          model.produccionFuncionario(); 
          view.textProduccionFuncionario.setText(String.valueOf(model.getProduccionDelFuncionario()));
         }
        if("Camioneta".equals(m)){
          model.setLavadoBasico(Integer.parseInt(view.textLavadoBasico.getText()));
          model.setLavadoEspecial(Integer.parseInt(view.textLavadoEspecial.getText()));
          model.setDesinfeccionBasica(Integer.parseInt(view.textDesinfeccionBasica.getText()));
          model.setDesinfeccionAvanzada(Integer.parseInt(view.textDesinfeccionAvanzada.getText()));
          model.setCombo1(Integer.parseInt(view.textCombo1.getText()));
          model.setCombo2(Integer.parseInt(view.textCombo2.getText()));
          model.setCombo3(Integer.parseInt(view.textCombo3.getText()));
          model.setNombreFuncionario(String.valueOf(view.textNombre.getText()));
          model.setFecha(String.valueOf(view.textFecha.getText()));
          
          model.calculaLavadoBasicoCamioneta();
          view.textProduccionLavadoBasico.setText(String.valueOf(model.getResultadoLavadoBasico()));
          model.calculaLavadoEspecialCamioneta();
          view.textProduccionLavadoEspecial.setText(String.valueOf(model.getResultadoLavadoEspecial()));
          model.calculaDesinfeccionBasicaCamioneta();
          view.textProduccionDesinfeccionBasica.setText(String.valueOf(model.getResultadoDesinfeccionBasica()));
          model.calculaDesinfeccionAvanzadaCamioneta();
          view.textProduccionDesinfeccionAvanzada.setText(String.valueOf(model.getResultadoDesinfeccionAvanzada()));
          model.calculaCombo1Camioneta();
          view.textProduccionCombo1.setText(String.valueOf(model.getResultadoCombo1()));
          model.calculaCombo2Camioneta();
          view.textProduccionCombo2.setText(String.valueOf(model.getResultadoCombo2()));
          model.calculaCombo3Camioneta();  
          view.textProduccionCombo3.setText(String.valueOf(model.getResultadoCombo3()));
          model.produccionFuncionario(); 
          view.textProduccionFuncionario.setText(String.valueOf(model.getProduccionDelFuncionario()));
        }
        
       
}
   

   
    
}
