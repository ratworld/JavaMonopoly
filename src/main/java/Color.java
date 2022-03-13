import java.io.Serializable;
import java.util.Map;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jay
 */
public class Color extends Property implements Serializable {
	public enum colorGroupKeys {
        unspecified,
        brown,
        lightBlue,
        magenta,
        orange,
        red,
        yellow,
        green,
        darkBlue
	}
	colorGroupKeys colorGroup;
	
	int houseCount, hotelCount;
	
	Color(Map<String, Integer> propertyAttributes, int inputSpaceID, String inputFriendlyName) {
		super(null);
		
		colorGroup = colorGroupKeys.unspecified;
		id = inputSpaceID;
		friendlyName = inputFriendlyName;
		
		houseCount = 0;
		hotelCount = 0;
		
		rentBase = propertyAttributes.get("rentBase");
		rentHouse1 = propertyAttributes.get("rentHouse1");
		rentHouse2 = propertyAttributes.get("rentHouse2");
		rentHouse3 = propertyAttributes.get("rentHouse3");
		rentHouse4 = propertyAttributes.get("rentHouse4");
		rentHotel = propertyAttributes.get("rentHotel");
		
		purchaseCost = propertyAttributes.get("purchaseCost");
		mortgageValue = propertyAttributes.get("mortgageValue");
		houseCost = propertyAttributes.get("houseCost");
		hotelCost = propertyAttributes.get("hotelCost");
	}
	
	// <editor-fold defaultstate="collapsed" desc="Setters and getters">
	public colorGroupKeys getColorGroup() {
		return colorGroup;
	}
	
	public void setColorGroup(colorGroupKeys inputColorGroup) {
        colorGroup = inputColorGroup;
    }
    
    public int getHouseCount() {
        return houseCount;
    }
    
    public void setHouseCount(int inputHouseCount) {
        houseCount = inputHouseCount;
    }
	// </editor-fold>
	
	@Override
	public int calculateRent() {
		return 0;
	}
}
