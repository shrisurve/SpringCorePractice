package com.springcore.autowiring.xml;

public class Pune 
{
	private Narhe narhe;

	public Narhe getNarhe() {
		return narhe;
	}

	public void setNarhe(Narhe narhe) {
		this.narhe = narhe;
	}

	@Override
	public String toString() {
		return "Pune [narhe=" + narhe + "]";
	}
	
	
}
