package sistemade;

/**
 * @author <b>Abimelec Perez-Flores</b><br>
 * <a href="https://github.com/celemibe" target="_blank">JMetaDE on
 * GitHub</a><br>
 * <a href="mailto:abimelecpf@hotmail.com">abimelecpf@hotmail.com</a><br>
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        Start start = new Start();
        start.setVisible(true);

//        String origen[] = {"Avila","Burgos","León","Palencia","Salamanca", "Segovia","Soria","Valladolid","Zamora"};	   
//        String[] destino = new String[10];
//        
//        System.arraycopy(origen,0,destino,1,origen.length);
//        System.out.println(Arrays.toString(destino));
        //Problem problema = new Problem();
//        Configurator configurar = problema.getRecommendedSetting();
//        problema.setExecutions(2);
//        
//        RunTsmbfoa run = new RunTsmbfoa();
//        run.run(problema, configurar, true, true);
//        
    }
}
