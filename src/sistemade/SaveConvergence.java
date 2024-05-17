package sistemade;

/**
 * @author <b>Abimelec Perez-Flores</b><br>
 * <a href="https://github.com/celemibe" target="_blank">JMetaDE on
 * GitHub</a><br>
 * <a href="mailto:abimelecpf@hotmail.com">abimelecpf@hotmail.com</a><br>
 * @version 1.0
 */
import com.abimelecperez.metaheuristics.de.Problem;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SaveConvergence {

    Problem problem;

    public SaveConvergence(Problem problem) {
        this.problem = problem;
        this.convergenceMatrix();
    }

    public static void guardarMatrizCSV(double[][] matriz, String name) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setSelectedFile(new File(name));
        fileChooser.setDialogTitle("Save File");
        fileChooser.setFileFilter(new FileNameExtensionFilter("Archivos CSV (*.csv)", "csv"));

        int userSelection = fileChooser.showSaveDialog(null);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter(fileToSave));
                for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz[i].length; j++) {
                        writer.append(String.valueOf(matriz[i][j]));
                        if (j < matriz[i].length - 1) {
                            writer.append(",");
                        }
                    }
                    writer.append("\n");
                }
                writer.close();
                JOptionPane.showMessageDialog(null, "Saved file");
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "File not saved: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public void convergenceMatrix() {
        // Obtener la fecha y hora actual
        LocalDateTime currentDateTime = LocalDateTime.now();

        // Formatear la fecha y hora actual con minutos y segundos
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH_mm_ss");
        String formattedDateTime = currentDateTime.format(formatter);

        String name = "Convergence matrix " + this.problem.getNameProblem() + " "+ formattedDateTime + ".csv";
        guardarMatrizCSV(this.problem.getConvergenceMedia(), name);
    }

}
