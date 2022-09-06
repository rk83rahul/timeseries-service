package com.yara;

public class Tag {
	
	private String name;
	private String description;
	private String units;
	private Enum types;
	
	
	
	public Tag(String name, String description, String units, Enum types) {
		super();
		this.name = name;
		this.description = description;
		this.units = units;
		this.types = types;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getUnits() {
		return units;
	}
	public void setUnits(String units) {
		this.units = units;
	}
	public Enum getTypes() {
		return types;
	}
	public void setTypes(Enum types) {
		this.types = types;
	}
	@Override
	public String toString() {
		return "Tag [name=" + name + ", description=" + description + ", units=" + units + ", types=" + types + "]";
	}
	
	

}
