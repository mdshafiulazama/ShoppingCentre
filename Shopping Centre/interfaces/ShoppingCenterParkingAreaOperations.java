package interfaces;
import java.lang.*;
import classes.ParkingArea;

public interface ShoppingCenterParkingAreaOperations
{
	boolean inseretParkingArea(ParkingArea pa);
	boolean removeParkingArea(ParkingArea pa);
	ParkingArea searchParkingArea(String areaNo);
	void showAllParkingAreas();
}