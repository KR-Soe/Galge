/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personajes;

import javax.swing.JOptionPane;

/**
 *
 * @author Soe
 */
public class PlayerCharacter {
    private String name;
    private int sexo=0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        if(sexo==1){
        ///SEXO MASCULINO///
        this.sexo = sexo;
        JOptionPane.showMessageDialog(null,"Personaje Masculino");
        }else{
            ///SEXO FEMENINO///
            if(sexo==2){
                this.sexo = sexo;
            }else{
                JOptionPane.showMessageDialog(null, "Debe escoger un sexo");
            }
        }
    }
}
