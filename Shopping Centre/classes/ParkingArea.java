package classes;
import java.lang.*;

public class ParkingArea{

	private String areaNo;
	private int availableSlots;

	public void setAreaNo(String areaNo){
		this.areaNo = areaNo;
	}
	public void setAvailableSlots(int availableSlots){
		this.availableSlots = availableSlots;
	}
	public String getAreaNo(){
		return areaNo;
	}
	public int getAvailableSlots(){
		return availableSlots;
	}
}