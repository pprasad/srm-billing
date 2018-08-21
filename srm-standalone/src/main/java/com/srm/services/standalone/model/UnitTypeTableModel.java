package com.srm.services.standalone.model;
import com.srm.services.modal.UnitType;
import com.srm.services.standalone.utils.TableUtils;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author umprasad
 */
public class UnitTypeTableModel  extends  AbstractTableModel{
   
    private String [] columnNames={TableUtils.TABLE_UNIT_MNEMONIC,TableUtils.TABLE_UNIT_DESC};
    
    private final List<UnitType> unitTypes;
    
    private final List<UnitType> tempType;

    public UnitTypeTableModel() {
        this.unitTypes =new ArrayList<>();
        this.tempType=new ArrayList<>();
    }
    @Override
    public int getRowCount() {
       return unitTypes.size();
    }

    @Override
    public int getColumnCount() {
        return this.columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object value=null;
        UnitType unitType=this.unitTypes.get(rowIndex);
        if(columnIndex==0){
            value=unitType.getUnitId();
        }else{
            value=unitType.getDescription();
        }
        return value;
    }

    @Override
    public String getColumnName(int column) {
       return this.columnNames[column];
    }
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        UnitType unitType=this.unitTypes.get(rowIndex);
       if(columnIndex==0){
           unitType.setUnitId(aValue.toString());
       }else{
           unitType.setDescription(aValue.toString());
       }
    }
    
    public void addRow(final UnitType unitType){
        this.tempType.add(unitType);
        this.unitTypes.add(unitType);
        fireTableDataChanged();
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }
    
    public List<UnitType> getNewRows(){
        return this.tempType;
    }
    
    public void removeAll(){
         this.unitTypes.clear();
         this.tempType.clear();
         fireTableDataChanged();
    }
 
    public UnitType getRow(int row){
        return this.unitTypes.get(row);
    }
    public void removeRow(int row){
        this.unitTypes.remove(row);
        fireTableDataChanged();
    }
    public void addRows(List<UnitType> unitTypes){
        this.unitTypes.addAll(unitTypes);
    }
}
