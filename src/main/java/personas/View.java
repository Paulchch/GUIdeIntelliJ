package personas;

import javax.swing.*;

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

    public JPanel getPanel() {
        return panel;
    }

    //comment file->settings->GUI Designer->Java source code para ver el codigo que genera el View.form

}
