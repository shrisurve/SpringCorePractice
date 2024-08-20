package com.springcore.injection.property.reference;

public class Address
{
	private String apartmentName;
	private int flatNo;
	private int floorNo;
	public String getApartmentName() {
		return apartmentName;
	}
	public void setApartmentName(String apartmentName) {
		this.apartmentName = apartmentName;
	}
	public int getFlatNo() {
		return flatNo;
	}
	public void setFlatNo(int flatNo) {
		this.flatNo = flatNo;
	}
	public int getFloorNo() {
		return floorNo;
	}
	public void setFloorNo(int floorNo) {
		this.floorNo = floorNo;
	}
	@Override
	public String toString() {
		return "Address [apartmentName=" + apartmentName + ", flatNo=" + flatNo + ", floorNo=" + floorNo + "]";
	}
	
	
}
