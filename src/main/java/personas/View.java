package personas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View {
    private JPanel panel;
    private JLabel id_lbl;
    private JTextField id_fld;
    private JLabel nombre_lbl;
    private JTextField nombre_fld;
    private JLabel Sexo;
    private JRadioButton masculino_fld;
    private JRadioButton Femenino_fld;
    private JLabel estado_lbl;
    private JComboBox combo_fld;
    private JLabel pasatiempos_lbl;
    private JCheckBox musica_fld;
    private JCheckBox cine_fld;
    private JCheckBox videos_fld;
    private JCheckBox cocina_fld;
    private JButton guardar_fld;
    private JButton cancelar_fld;

    public View() {
        guardar_fld.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(nombre_fld.getText());
                if(masculino_fld.isSelected())
                    System.out.println('M');
                if(Femenino_fld.isSelected())
                    System.out.println('F');
                System.out.println(combo_fld.getSelectedItem());
            }
        });
    }

    public JPanel getPanel() {
        return panel;
    }

    //comment file->settings->GUI Designer->Java source code para ver el codigo que genera el View.form

}
