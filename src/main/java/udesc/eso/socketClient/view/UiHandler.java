package udesc.eso.socketClient.view;

import javax.swing.*;

public class UiHandler {
    public static void clearFields(JTextField... fields) {
        for(JTextField field: fields) {
            field.setText("");
        }
    }

    public static void setButtonsVisibility(boolean visible, JRadioButton... optionButtons) {
        for (JRadioButton optionButton : optionButtons) {
            optionButton.setVisible(visible);
        }
    }

    public static void setFieldsVisibility(boolean visible, JTextField... fields) {
        for (JTextField field : fields) {
            field.setVisible(visible);
        }
    }

    public static void setLabelsVisibility(boolean visible, JLabel... labels) {
        for (JLabel label : labels) {
            label.setVisible(visible);
        }
    }
}
