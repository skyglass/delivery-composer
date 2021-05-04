package skyglass.composer.location.persistence;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "location")
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class LocationEntity {

	@Id
	private String uuid;

	private String city;

	private String postalCode;

	private String street;

	private String street2;

	private String street3;

	private String addressName;

	@NotNull
	private double latitude;

	@NotNull
	private double longitude;

	private String todayOpen;

	private String todayClose;

	private String complexNumber;

	private boolean showWarningMessage;

	private String locationType;

	private boolean collectionPoint;

	private String sapStoreID;

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof LocationEntity) {
			LocationEntity other = (LocationEntity) obj;
			return Objects.equals(this.uuid, other.uuid);
		}

		return false;
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(this.uuid);
	}
}
