package mainpackage;

import mainpackage.ImageGenerator;

import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class AppIconResizer extends JFrame{
    private JTextField fileNameField;
    private JButton selectFileButton;
    private JPanel mainform;
    private JCheckBox iOSCheckBox;
    private JCheckBox androidCheckBox;
    private JButton generateButton;
    private JLabel errorField;
    private JProgressBar progressBar1;

    private File appIcon;

    public AppIconResizer(){
        super("Icon Resizer");
        pack();
        setContentPane(mainform);
        //UIManagzer.setLookAndFeel();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        getContentPane();

        setupFilePicker();
        setupGenerateButton();

    }

    private void setupFilePicker(){
        selectFileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JFileChooser filePicker = new JFileChooser();
                FileFilter filter = new FileNameExtensionFilter("PNG file", "png");
                filePicker.addChoosableFileFilter(filter);
                int result = filePicker.showOpenDialog(getParent());
                if(result == JFileChooser.APPROVE_OPTION){
                    appIcon = filePicker.getSelectedFile();
                    fileNameField.setText(appIcon.getAbsolutePath().toString());
                }
            }
        });
    }

    private void setupGenerateButton(){
        generateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                generateButton.setEnabled(false); //prevent multiple preasses
                if(validateSettings()){
                   ImageGenerator generator = new ImageGenerator(appIcon, progressBar1);
                    if(iOSCheckBox.isSelected())
                        generator.generateIOS();
                    if(androidCheckBox.isSelected())
                        generator.generateAndroid();

                    success();
                }
                generateButton.setEnabled(true);
            }
        });
    }
    private boolean validateSettings(){
        if(!iOSCheckBox.isSelected() && !androidCheckBox.isSelected()){
            errorField.setText("Error: Select at least one platform");
            return false;
        }
        if(appIcon == null){ //check if user typed the file path instead of selecting file
            appIcon = new File(fileNameField.getText());
        }
        if(!appIcon.exists()){
            errorField.setText("Error: Select a valid .png file");
            return false;
        }
        errorField.setText("");
        return true;

    }

    private void success(){
        JOptionPane.showMessageDialog(this, "Generated icons are in your original image directory");
    }

}
