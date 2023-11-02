package udemy.poo.inicio;

import udemy.poo.codigo.Persona;

import javax.swing.*;

public class Inicio {
  public static void main(String[] args) {
    Persona persona = new Persona("Samuel", "Mendez", "Perez", "1014255632");
    Persona persona1 = new Persona();
    JOptionPane.showMessageDialog(null, persona.getNombre());
    JOptionPane.showMessageDialog(null, persona1.getNombre());

  }
}
