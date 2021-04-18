/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class Modelo {
    private int lavadoBasico=0;
    private int lavadoEspecial=0;
    private int desinfeccionBasica=0;
    private int desinfeccionAvanzada=0;
    private int combo1=0;
    private int combo2=0;
    private int combo3=0;
    private String nombreFuncionario;
    private int produccionDelFuncionario;
    private String fecha;

    
    private int resultadoLavadoBasico;
    private int resultadoLavadoEspecial;
    private int resultadoDesinfeccionBasica;
    private int resultadoDesinfeccionAvanzada;
    private int resultadoCombo1;
    private int resultadoCombo2;
    private int resultadoCombo3;
    public int getLavadoBasico() {
        return lavadoBasico;
    }

    public void setLavadoBasico(int lavadoBasico) {
        this.lavadoBasico = lavadoBasico;
    }

    public int getLavadoEspecial() {
        return lavadoEspecial;
    }

    public void setLavadoEspecial(int lavadoEspecial) {
        this.lavadoEspecial = lavadoEspecial;
    }

    public int getDesinfeccionBasica() {
        return desinfeccionBasica;
    }

    public void setDesinfeccionBasica(int desinfeccionBasica) {
        this.desinfeccionBasica = desinfeccionBasica;
    }

    public int getDesinfeccionAvanzada() {
        return desinfeccionAvanzada;
    }

    public void setDesinfeccionAvanzada(int desinfeccionAvanzada) {
        this.desinfeccionAvanzada = desinfeccionAvanzada;
    }

    public int getCombo1() {
        return combo1;
    }

    public void setCombo1(int combo1) {
        this.combo1 = combo1;
    }

    public int getCombo2() {
        return combo2;
    }

    public void setCombo2(int combo2) {
        this.combo2 = combo2;
    }

    public int getCombo3() {
        return combo3;
    }

    public void setCombo3(int combo3) {
        this.combo3 = combo3;
    }

    public String getNombreFuncionario() {
        return nombreFuncionario;
    }

    public void setNombreFuncionario(String nombreFuncionario) {
        this.nombreFuncionario = nombreFuncionario;
    }

    public int getProduccionDelFuncionario() {
        return produccionDelFuncionario;
    }

    public void setProduccionDelFuncionario(int produccionDelFuncionario) {
        this.produccionDelFuncionario = produccionDelFuncionario;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getResultadoLavadoBasico() {
        return resultadoLavadoBasico;
    }

    public void setResultadoLavadoBasico(int resultadoLavadoBasico) {
        this.resultadoLavadoBasico = resultadoLavadoBasico;
    }

    public int getResultadoLavadoEspecial() {
        return resultadoLavadoEspecial;
    }

    public void setResultadoLavadoEspecial(int resultadoLavadoEspecial) {
        this.resultadoLavadoEspecial = resultadoLavadoEspecial;
    }

    public int getResultadoDesinfeccionBasica() {
        return resultadoDesinfeccionBasica;
    }

    public void setResultadoDesinfeccionBasica(int resultadoDesinfeccionBasica) {
        this.resultadoDesinfeccionBasica = resultadoDesinfeccionBasica;
    }

    public int getResultadoDesinfeccionAvanzada() {
        return resultadoDesinfeccionAvanzada;
    }

    public void setResultadoDesinfeccionAvanzada(int resultadoDesinfeccionAvanzada) {
        this.resultadoDesinfeccionAvanzada = resultadoDesinfeccionAvanzada;
    }

    public int getResultadoCombo1() {
        return resultadoCombo1;
    }

    public void setResultadoCombo1(int resultadoCombo1) {
        this.resultadoCombo1 = resultadoCombo1;
    }

    public int getResultadoCombo2() {
        return resultadoCombo2;
    }

    public void setResultadoCombo2(int resultadoCombo2) {
        this.resultadoCombo2 = resultadoCombo2;
    }

    public int getResultadoCombo3() {
        return resultadoCombo3;
    }

    public void setResultadoCombo3(int resultadoCombo3) {
        this.resultadoCombo3 = resultadoCombo3;
    }
    
    public int calculaLavadoBasicoAutomovil(){
        this.resultadoLavadoBasico = this.lavadoBasico*1000;
        return this.resultadoLavadoBasico;
        }
    public int calculaLavadoBasicoCamioneta(){
        this.resultadoLavadoBasico = this.lavadoBasico*2000;
        return this.resultadoLavadoBasico;
        } 
    public int calculaLavadoEspecialAutomovil(){
        this.resultadoLavadoEspecial = this.lavadoEspecial*1000;
        return this.resultadoLavadoEspecial;
    }
    public int calculaLavadoEspecialCamioneta(){
        this.resultadoLavadoEspecial = this.lavadoEspecial*2000;
        return this.resultadoLavadoEspecial;
    }
    public int calculaDesinfeccionBasicaAutomovil(){
        this.resultadoDesinfeccionBasica = this.desinfeccionBasica*1000;
        return this.resultadoDesinfeccionBasica;
    }
    public int calculaDesinfeccionBasicaCamioneta(){
        this.resultadoDesinfeccionBasica = this.desinfeccionBasica*2000;
        return this.resultadoDesinfeccionBasica;
    }
     public int calculaDesinfeccionAvanzadaAutomovil(){
        this.resultadoDesinfeccionAvanzada = this.desinfeccionAvanzada*1000;
        return this.resultadoDesinfeccionAvanzada;
    }
    public int calculaDesinfeccionAvanzadaCamioneta(){
        this.resultadoDesinfeccionAvanzada = this.desinfeccionAvanzada*2000;
        return this.resultadoDesinfeccionAvanzada;
    }
    public int calculaCombo1Automovil(){
        this.resultadoCombo1 = this.combo1*1000;
        return this.resultadoCombo1;
    }
    public int calculaCombo1Camioneta(){
        this.resultadoCombo1 = this.combo1*2000;
        return this.resultadoCombo1;
    }
    public int calculaCombo2Automovil(){
        this.resultadoCombo2 = this.combo2*1000;
        return this.resultadoCombo2;
    }
    public int calculaCombo2Camioneta(){
        this.resultadoCombo2 = this.combo2*2000;
        return this.resultadoCombo2;
    }
    public int calculaCombo3Automovil(){
        this.resultadoCombo3 = this.combo3*1000;
        return this.resultadoCombo3;
    }
    public int calculaCombo3Camioneta(){
        this.resultadoCombo3 = this.combo3*2000;
        return this.resultadoCombo3;
    }
    public int produccionFuncionario(){
        this.produccionDelFuncionario = this.resultadoLavadoBasico+this.resultadoLavadoEspecial+this.resultadoDesinfeccionBasica+
                this.resultadoDesinfeccionAvanzada+this.resultadoCombo1+this.resultadoCombo2+this.resultadoCombo3;
                
        return produccionDelFuncionario;
    }
}
