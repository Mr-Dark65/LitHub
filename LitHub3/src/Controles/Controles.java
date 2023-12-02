/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controles;

import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JTextField;

public class Controles {

    public boolean validarCedula(String cedula) {
        if (!cedula.matches("[0-9]{10}")) {
            return false;
        }
        int tercerdigito = Integer.parseInt(cedula.substring(2, 3));
        if (!(tercerdigito < 6)) {
            return false;
        }
        int[] coefValCedula = {2, 1, 2, 1, 2, 1, 2, 1, 2};
        int verificador = Integer.parseInt(cedula.substring(9, 10));
        int suma = 0;
        int digito;

        for (int i = 0; i < (cedula.length() - 1); i++) {
            digito = Integer.parseInt(cedula.substring(i, i + 1)) * coefValCedula[i];
            suma += ((digito % 10) + (digito / 10));
        }

        if (suma % 10 != 0 || suma % 10 != verificador && 10 - (suma % 10) != verificador) {
            return false;
        }

        return true;
    }
    
    public void txtNotSpecialCharacters(java.awt.event.KeyEvent evt) {
        if (!Character.isLetterOrDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }

    public void txtOnlyLetters(java.awt.event.KeyEvent evt) {
        if (!Character.isAlphabetic(evt.getKeyChar())) {
            evt.consume();
        }
    }

    public void txtOnlyLettersSpaces(java.awt.event.KeyEvent evt) {
        if (!(Character.isAlphabetic(evt.getKeyChar()) || evt.getKeyChar() == ' ')) {
            evt.consume();
        }
    }

    public boolean txtOnlyNumbers(java.awt.event.KeyEvent evt) {
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
            return false;
        }
        return true;
    }

  

   
   
    

    

    
    
    

}
