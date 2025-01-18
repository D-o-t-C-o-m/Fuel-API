package org.example.fuel;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.time.Instant;

@Entity
@Table(name = "FuelPrices")
public class FuelPrice {
@Id
@Column(name = "Guid", nullable = false, length = 36)
private String guid;

@Column(name = "StationId", length = 100)
private String stationId;

@Column(name = "FuelTypeName", nullable = false, length = 1000)
private String fuelTypeName;

@Column(name = "FuelTypeCode", length = 100)
private String fuelTypeCode;

@Column(name = "Price", precision = 4, scale = 3)
private BigDecimal price;

@Column(name = "EffectiveDateTime")
private Instant effectiveDateTime;

@Column(name = "UpdatedDateTime")
private Instant updatedDateTime;

public String getGuid() {
	return guid;
}

public void setGuid(String guid) {
	this.guid = guid;
}

public String getStationId() {
	return stationId;
}

public void setStationId(String stationId) {
	this.stationId = stationId;
}

public String getFuelTypeName() {
	return fuelTypeName;
}

public void setFuelTypeName(String fuelTypeName) {
	this.fuelTypeName = fuelTypeName;
}

public String getFuelTypeCode() {
	return fuelTypeCode;
}

public void setFuelTypeCode(String fuelTypeCode) {
	this.fuelTypeCode = fuelTypeCode;
}

public BigDecimal getPrice() {
	return price;
}

public void setPrice(BigDecimal price) {
	this.price = price;
}

public Instant getEffectiveDateTime() {
	return effectiveDateTime;
}

public void setEffectiveDateTime(Instant effectiveDateTime) {
	this.effectiveDateTime = effectiveDateTime;
}

public Instant getUpdatedDateTime() {
	return updatedDateTime;
}

public void setUpdatedDateTime(Instant updatedDateTime) {
	this.updatedDateTime = updatedDateTime;
}

}