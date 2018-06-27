package com.thinkxfactor.zomatoplus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thinkxfactor.zomatoplus.models.Items;
import com.thinkxfactor.zomatoplus.repository.ItemsRepository;

@RestController
@RequestMapping("/item")
public class ItemController {
	@Autowired
	private ItemsRepository itemRepository;
	
	@PostMapping("/add")
	public Items addItems(@RequestBody Items items)
	{
		Items persistedItems=itemRepository.save(items);
		return persistedItems;
	}
	
	@GetMapping("/getAll")
	public List<Items> getAll()
	{
		List<Items> listofitems=itemRepository.findAll();
		return listofitems;
	}

}
