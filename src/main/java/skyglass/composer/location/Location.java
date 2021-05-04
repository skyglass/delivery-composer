package skyglass.composer.location;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Location {

	private String uuid;

	private String city;

	private String postalCode;

	private String street;

	private String street2;

	private String street3;

	private String addressName;

	private double latitude;

	private double longitude;

	private String todayOpen;

	private String todayClose;

	private String complexNumber;

	private boolean showWarningMessage;

	private String locationType;

	private boolean collectionPoint;

	private String sapStoreID;

}
