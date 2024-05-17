package sistemade;

/**
 * @author <b>Abimelec Perez-Flores</b><br>
 * <a href="https://github.com/celemibe" target="_blank">JMetaDE on
 * GitHub</a><br>
 * <a href="mailto:abimelecpf@hotmail.com">abimelecpf@hotmail.com</a><br>
 * @version 1.0
 */
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileOutputStream;
import com.abimelecperez.metaheuristics.de.*;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SaveResult {

    Problem problem;
    Configurator configurator;

    public SaveResult(Problem problem, Configurator configurator) {
        this.problem = problem;
        this.configurator = configurator;
        this.resultsMatrix();
    }

    public void guardarMatrizExcel(double[][] matriz, String name) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setSelectedFile(new File(name));
        fileChooser.setDialogTitle("Save File");
        fileChooser.setFileFilter(new FileNameExtensionFilter("Archivos Excel (*.xlsx)", "xlsx"));
        int userSelection = fileChooser.showSaveDialog(null);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();
            if (!fileToSave.getName().endsWith(".xlsx")) {
                fileToSave = new File(fileToSave.getAbsolutePath() + ".xlsx");
            }

            Workbook libro = new XSSFWorkbook();
            Sheet hoja = libro.createSheet("Results");
            String[] var = {"OF", "CVS", "No. Execcution"};
            String[] header = new String[problem.getNumberVariableOF() + 3];
            System.arraycopy(problem.getOrderVariables(), 0, header, 0, problem.getNumberVariableOF());
            System.arraycopy(var, 0, header, problem.getNumberVariableOF(), 3);
            int rowNum = 0;
            Row filaEncabezado = hoja.createRow(0);
            for (int colNum = 0; colNum < header.length; colNum++) {
                filaEncabezado.createCell(colNum).setCellValue(header[colNum]);
            }
            for (int filaNum = 0; filaNum < matriz.length; filaNum++) {
                rowNum++;
                Row fila = hoja.createRow(rowNum);
                for (int colNum = 0; colNum < matriz[filaNum].length; colNum++) {
                    fila.createCell(colNum).setCellValue(matriz[filaNum][colNum]);
                }
            }

            try (FileOutputStream fileOut = new FileOutputStream(fileToSave)) {
                libro.write(fileOut);
                JOptionPane.showMessageDialog(null, "Saved file");
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "File not saved: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            } finally {
                try {
                    libro.close();
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(null, "Error closing Excel workbook: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }

    public void resultsMatrix() {
        // Obtener la fecha y hora actual
        LocalDateTime currentDateTime = LocalDateTime.now();

        // Formatear la fecha y hora actual con minutos y segundos
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH_mm_ss");
        String formattedDateTime = currentDateTime.format(formatter);

        String name1 = this.problem.getNameProblem() + " " + formattedDateTime + ".xlsx";
        guardarMatrizExcel(this.problem.getMatix(), name1);
    }
}
