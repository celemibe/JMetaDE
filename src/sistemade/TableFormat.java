/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sistemade;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;


/**
 * 
 * @author 
 */
public class TableFormat extends DefaultTableCellRenderer{
    private final double valueBest;
    private final double valueWorst;
    
    private double value1;
    public TableFormat(double valueBest, double valueWorst) {
        this.valueBest = valueBest;
        this.valueWorst = valueWorst;
    }
            
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); //To change body of generated methods, choose Tools | Templates.                                
       
        setFont(new Font("Montserrat", 0, 14));
        
        setBackground(new Color(0xFFFFFF));
        setHorizontalAlignment(SwingConstants.RIGHT);
        value1 = Double.parseDouble(table.getValueAt(row, table.getColumnCount()-1).toString());
                
        if (value1 > 0) {            
            setBackground(new Color(0xFE899B));            
        }
        
        value1 = Double.parseDouble(table.getValueAt(row, table.getColumnCount()-2).toString());
        
        if (valueWorst == value1) {                     
            setBackground(new Color(0xD2B4DE));            
        } 
        
        if(valueBest == value1){                      
            setBackground(new Color(0xABEBC6));            
        }
        
                                                        
        
        if (isSelected) {
            setForeground(new Color(0x000000));
            setBackground(new Color(0xF4F6F6));            
        }         
        
        return this;
    }  
}
