package App;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Aplicacion {
    private JPanel root;
    private JPanel Cabecera;
    private JPanel Botonera;
    private JButton btnReset;
    private JButton a7Button;
    private JButton a4Button;
    private JButton a1Button;
    private JButton btnPunto;
    private JButton a8Button;
    private JButton a9Button;
    private JButton btnDivision;
    private JButton a5Button;
    private JButton a6Button;
    private JButton btnMultiplicacion;
    private JButton a2Button;
    private JButton a3Button;
    private JButton btnResta;
    private JButton a0Button;
    private JButton btnIgual;
    private JButton btnSuma;
    private JLabel lblDisplay;

    public App() {
        btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("");
                lblDisplay.setText("");
            }
        });
        ActionListener listenerDigitos = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String texto = lblDisplay.getText() + ((JButton)e. getSource()).getText();
                lblDisplay.setText(texto);
            }
        };
        a7Button.addActionListener(listenerDigitos);
        a4Button.addActionListener(listenerDigitos);
        a1Button.addActionListener(listenerDigitos);
        btnPunto.addActionListener(listenerDigitos);
        a8Button.addActionListener(listenerDigitos);
        a9Button.addActionListener(listenerDigitos);
        a5Button.addActionListener(listenerDigitos);
        a6Button.addActionListener(listenerDigitos);
        a2Button.addActionListener(listenerDigitos);
        a3Button.addActionListener(listenerDigitos);
        a0Button.addActionListener(listenerDigitos);
}
