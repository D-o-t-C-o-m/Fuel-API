package org.example.fuel;


import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
@Entity
@Table(name = "FuelPrices")
public class FuelData {

@Id
@Column(name = "Guid", length = 36)
private String Guid;

@Column(name = "StationId", length = 36)
private String StationId;

@Column(name = "FuelTypeName", length = 1000)
private String FuelTypeName;

@Column(name = "FuelTypeCode", length = 100)
private String FuelTypeCode;

@Column(name = "Price", precision = 4, scale = 3)
private BigDecimal Price;

@Column(name = "EffectiveDateTime")
private LocalDateTime EffectiveDateTime;

@Column(name = "UpdatedDateTime")
private LocalDateTime UpdatedDateTime;

public String getGuid() {
	return Guid;
}

public void setGuid(String guid) {
	Guid = guid;
}

public String getStationId() {
	return StationId;
}

public void setStationId(String stationId) {
	StationId = stationId;
}

public String getFuelTypeName() {
	return FuelTypeName;
}

public void setFuelTypeName(String fuelTypeName) {
	FuelTypeName = fuelTypeName;
}

public String getFuelTypeCode() {
	return FuelTypeCode;
}

public void setFuelTypeCode(String fuelTypeCode) {
	FuelTypeCode = fuelTypeCode;
}

public BigDecimal getPrice() {
	return Price;
}

public void setPrice(BigDecimal price) {
	Price = price;
}

public LocalDateTime getEffectiveDateTime() {
	return EffectiveDateTime;
}

public void setEffectiveDateTime(LocalDateTime effectiveDateTime) {
	EffectiveDateTime = effectiveDateTime;
}

public LocalDateTime getUpdatedDateTime() {
	return UpdatedDateTime;
}

public void setUpdatedDateTime(LocalDateTime updatedDateTime) {
	UpdatedDateTime = updatedDateTime;
}
}
