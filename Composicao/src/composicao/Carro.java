/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composicao;

/**
 *
 * @author Suporte
 */
public class Carro {
    private Motor motor;
    private Direcao direcao;
    
    public Carro(){
        motor= new Motor();
                
    }
    
    public void ImprimeDados(){
        System.out.println("potencia do motor"
                +""+motor.getPotencia);
    }
    public void LigarCarro(int potencia){
    motor = new Motor (potencia);
    }
    
    public Carro(int potencia){
        motor= new Motor(potencia);
    }
    
    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Direcao getDirecao() {
        return direcao;
    }

    public void setDirecao(Direcao direcao) {
        this.direcao = direcao;
    }
}
