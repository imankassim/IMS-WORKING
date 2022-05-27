package com.qa.ims.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.qa.ims.persistence.dao.ItemDAO;
import com.qa.ims.persistence.domain.Item;
import com.qa.ims.utils.Utils;

public class ItemController implements CrudController<Item> {
	
	public static final Logger LOGGER = LogManager.getLogger();
	
	private ItemDAO itemDAO;
	private Utils utils;
	
	
	public ItemController(ItemDAO itemDAO, Utils utils) {
		super();
		this.itemDAO = itemDAO;
		this.utils = utils;
	}
	
	@Override
	public List<Item> readAll() {
		List<Item> items = itemDAO.readAll();
		for (Item i : items) {
			LOGGER.info(i);
		}
		return items;
	}
	@Override
	public Item create() {
		LOGGER.info("Please enter an item name");
		String item = utils.getString();
		LOGGER.info("Please enter a stock level");
		Long inventory = utils.getLong();
		Item i = itemDAO.create(new Item(item, inventory));
		LOGGER.info("Item created");
		return i;
	}
	
	
	@Override
	public Item update() {
		LOGGER.info("Please enter the id of the item you'd like to update");
		Long id = utils.getLong();
		LOGGER.info("Please enter an item name");
		String item = utils.getString();
		LOGGER.info("Please enter a stock level");
		Long inventory = utils.getLong();
		Item i = itemDAO.update(new Item(id, item, inventory));
		LOGGER.info("Item Updated");
		return i;
	}
	@Override
	public int delete() {
		LOGGER.info("Please enter the id of the item you would like to remove");
		Long id = utils.getLong();
		return itemDAO.delete(id);
	}
	

}
