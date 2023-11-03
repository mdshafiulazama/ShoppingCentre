package interfaces;
import java.lang.*;
import classes.Shop;

public interface ShoppingCenterShopOperations{

	boolean insertShop(Shop s);
	boolean removeShop(Shop s);
	Shop searchShop(int shopNumber);
	void showAllShops();
}