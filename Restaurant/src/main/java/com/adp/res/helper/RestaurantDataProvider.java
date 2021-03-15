package com.adp.res.helper;

import java.math.BigDecimal;

import java.util.ArrayList;
import java.util.List;

import com.adp.res.domain.Appetizer;
import com.adp.res.domain.Beverages;
import com.adp.res.domain.Entree;

public class RestaurantDataProvider {

	public static List<Appetizer> getAppetizerList() {
		List<Appetizer> listAppetizer = new ArrayList<>();
		listAppetizer.add(new Appetizer(11l, "IDLY", "Steamed rice and lentil patties", new BigDecimal("5")));
		listAppetizer.add(new Appetizer(12l, "VADA PAV (2 PCS)", "Potato dumpling made with chickpea flour",
				new BigDecimal("8")));
		listAppetizer.add(new Appetizer(13l, "VEGETABLE CUTLET", "Mixed vegetables with spices", new BigDecimal("6")));
		return listAppetizer;
	}

	public static List<Entree> getEntreeList() {
		List<Entree> listAppetizer = new ArrayList<>();
		listAppetizer.add(new Entree(21l, "VEGETABLE CURRY", "VEGETABLE CURRY", new BigDecimal("15")));
		listAppetizer.add(new Entree(22l, "PALAK PANEER", "PALAK PANEER", new BigDecimal("18")));
		listAppetizer.add(new Entree(23l, "DUM ALOO", "DUM ALOO", new BigDecimal("16")));
		return listAppetizer;
	}

	public static List<Beverages> getBeveragesList() {
		List<Beverages> listAppetizer = new ArrayList<>();
		listAppetizer.add(new Beverages(31l, "MASALA TEA", "MASALA TEA", new BigDecimal("2")));
		listAppetizer.add(new Beverages(32l, "SWEET LASSI", "SWEET LASSI", new BigDecimal("4")));
		listAppetizer.add(new Beverages(33l, "WATER BOTTLE", "WATER BOTTLE", new BigDecimal("2")));

		return listAppetizer;
	}
	
}
