package personas;

import javax.swing.*;

public class Application {
    public static void main(String[] args) {
        try{
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        }catch(Exception ex){}

        View view = new View();//tocar sobre la clase y darle import
        JFrame window = new JFrame();
        window.setSize(500,300);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setTitle("Personas");
        window.setContentPane(view.getPanel());
        window.setVisible(true);

        //MainView mainView  = new MainView();
        //ver como hacer para una sola selección en el radioButton
        //Entonces el view form genera un archivo XML con las propiedades
    }
}
