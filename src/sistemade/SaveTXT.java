package sistemade;

import com.abimelecperez.metaheuristics.de.Problem;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author abim-
 */
public class SaveTXT {

    Problem problem;

    public SaveTXT(Problem problem) {
        this.problem = problem;
        this.convergenceMatrix();
    }

    public static void saveMatrixToFile(double[][] matrix) {
        // Crear un objeto JFileChooser
        JFileChooser fileChooser = new JFileChooser();

        // Sugiere un nombre predeterminado al archivo
        fileChooser.setSelectedFile(new File("matriz.txt"));

        // Mostrar el cuadro de diálogo para guardar archivo
        int result = fileChooser.showSaveDialog(null);

        // Si el usuario selecciona un archivo y hace clic en "Guardar"
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();

            try {
                // Crear un BufferedWriter para escribir en el archivo
                BufferedWriter writer = new BufferedWriter(new FileWriter(selectedFile));

                // Escribir la matriz en el archivo
                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix[i].length; j++) {
                        writer.write(matrix[i][j] + "\t");
                    }
                    writer.newLine();
                }

                // Cerrar el BufferedWriter
                writer.close();

                // Mostrar mensaje de éxito
                JOptionPane.showMessageDialog(null, "Matriz guardada exitosamente en " + selectedFile.getAbsolutePath());

            } catch (IOException e) {
                // Mostrar mensaje de error si ocurre una excepción de E/S
                JOptionPane.showMessageDialog(null, "Error al guardar el archivo: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public void convergenceMatrix() {

        saveMatrixToFile(this.problem.getConvergenceMedia());
    }
}
