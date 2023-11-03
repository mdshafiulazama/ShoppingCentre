package interfaces;
import java.lang.*;
import classes.ComputerParts;


public interface ShopOperations
{
	boolean insertComputerParts(ComputerParts cp);
	boolean removeComputerParts(ComputerParts cp);
	ComputerParts searchComputerParts(int productSN);
	void showAllComputerParts();
}