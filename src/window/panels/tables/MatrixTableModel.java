package window.panels.tables;

import java.util.HashSet;
import java.util.Set;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

/**
 * Table model for cost matrix and shipping matrix. Used in 
 * CostTable and SolutionTable. Contains two-dimension 
 * Object array for matrix. Column headers named as
 * <����������� i>, where i is column serial number.
 * public void setEditable(boolean) used to set 
 * cells editability.
 */
public class MatrixTableModel implements TableModel {

	public MatrixTableModel(int mines, int factories) {
		this.rowCount = mines;
		this.columnCount = factories;
		
		this.data = new Object[mines][factories];
	}
	
	public void addTableModelListener(TableModelListener l) {
		listeners.add(l);
	}

	public Class<?> getColumnClass(int columnIndex) {
		return Integer.class;			
	}

	public int getColumnCount() {
		return columnCount;
	}

	public String getColumnName(int columnIndex) {
		return new String("����������� " + (columnIndex + 1));
	}

	public int getRowCount() {
		return rowCount;
	}

	public Object getValueAt(int row, int column) {
		return data[row][column];
	}

	public boolean isCellEditable(int row, int column) {
		return this.editable;
	}

	public void removeTableModelListener(TableModelListener l) {
		listeners.remove(l);
	}

	public void setValueAt(Object aValue, int row, int column) {
		data[row][column] = aValue;
	}
	
	public boolean isEditable() {
		return editable;
	}
	
	public void setEditable(boolean editable) {
		this.editable = editable;
	}

	private int rowCount;
	private int columnCount;
	private boolean editable;
	private Set<TableModelListener> listeners = new HashSet<TableModelListener>();
	private Object[][] data;
}
