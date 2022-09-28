package com.javaworld;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Item {

	Integer itemid;
	String itemName;
	
	
	public Item(Integer itemid, String itemName) {
		super();
		this.itemid = itemid;
		this.itemName = itemName;
	}

	public Integer getItemid() {
		return itemid;
	}

	public void setItemid(Integer itemid) {
		this.itemid = itemid;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	@Override
	public String toString() {
		return "Item [itemid=" + itemid + ", itemName=" + itemName + "]";
	}

	public static void main(String[] args) {

		Item item1=new Item(1, "Pencil");
		Item item2=new Item(2, "Book");
		Item item3=new Item(3, "noteBook");
		Item item4=new Item(4, "Mouse");
		Item item5=new Item(5, "desktop");
		Item item6=new Item(6, "laptop");
		Item item7=new Item(7, "keyboard");
		HashMap<Item, String> map=new HashMap<>();
		map.put(item1, "A");
		map.put(item2, "B");
		map.put(item3, "C");
		map.put(item4, "D");
		map.put(item5, "E");
		map.put(item6, "F");
		map.put(item7, "G");
		Comparator<Item> byName= (i1, i2)-> i1.getItemName().compareTo(i2.getItemName());
		Map<Item, String> m=map.entrySet().stream()
		              .sorted(Map.Entry.<Item,String>comparingByKey(byName))
		              .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
		            		  (e1,e2)-> e1, LinkedHashMap::new));
		m.forEach((k, v) -> System.out.println(k));
	}

}
