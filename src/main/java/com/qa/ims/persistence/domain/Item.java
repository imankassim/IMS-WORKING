package com.qa.ims.persistence.domain;

import java.util.Objects;

public class Item {
	
	private Long id;
	private String item;
	private Long inventory;
	
	public Item(String item, Long inventory) {
		this.setItem(item);
		this.setInventory(inventory);
	}
	
	public Item(Long id, String item, Long inventory) {
		this.setId(id);
		this.setItem(item);
		this.setInventory(inventory);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public Long getInventory() {
		return inventory;
	}

	public void setInventory(Long inventory) {
		this.inventory = inventory;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", item=" + item + ", inventory=" + inventory + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, inventory, item);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (getItem() == null) {
			if(other.getItem() != null)
				return false;
		} else if (!getItem().equals(other.getItem()))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (inventory == null) {
			if(other.inventory != null)
				return false;
		} else if (!inventory.equals(other.inventory))
			return false;
		return true;
	}
	
	
	
	
	
	
	

}
