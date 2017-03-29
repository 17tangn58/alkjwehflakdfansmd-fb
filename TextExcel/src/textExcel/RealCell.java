package textExcel;

public abstract class RealCell implements Cell {
	//Abstract because an instance of Real Cell is never created
	private String input;
	public RealCell(String value){
		input=value;
	}
	
	public String abbreviatedCellText() {
 
		return "";
	}
	public String getString(){
		return input;
	}
	
	public String fullCellText() {
		return input;
	}
	public double getDoubleValue(){
		return 0.0;
	}

}
