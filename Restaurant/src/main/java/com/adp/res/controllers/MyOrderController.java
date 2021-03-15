package com.adp.res.controllers;

import javax.validation.Valid;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.beans.factory.annotation.Autowired;

import com.adp.res.domain.MyOrder;
import com.adp.res.helper.RestaurantDataProvider;
import com.adp.res.commands.MyOrderForm;
import com.adp.res.services.MyOrderService;

@Controller
public class MyOrderController {
	
	@Autowired
	private MyOrderService myOrderService;

    
	@GetMapping("/")
	public String redirToList() {
		
		return "redirect:/myorder/list";
	}

	@GetMapping({ "/myorder/list", "/restaurant" })
	public String listMenuItems(Model model) {
		model.addAttribute("appetizers", RestaurantDataProvider.getAppetizerList());
		model.addAttribute("entrees", RestaurantDataProvider.getEntreeList());
		model.addAttribute("beverages", RestaurantDataProvider.getBeveragesList());
		model.addAttribute("myorders", myOrderService.listAll());
		model.addAttribute("myOrderForm", new MyOrderForm());
		return "myorder/list";
	}

	@GetMapping("/myorder/new")
	public String createMyOrder(Model model) {
		model.addAttribute("appetizers", RestaurantDataProvider.getAppetizerList());
		model.addAttribute("entrees", RestaurantDataProvider.getEntreeList());
		model.addAttribute("beverages", RestaurantDataProvider.getBeveragesList());
		model.addAttribute("myOrderForm", new MyOrderForm());
		return "myorder/myorderform";
	}

	@PostMapping(value = "/myorder")
	public String saveOrUpdateProduct(@Valid MyOrderForm myOrderForm, BindingResult bindingResult, RedirectAttributes redirAttrs) {

		if (bindingResult.hasErrors()) {
	        redirAttrs.addFlashAttribute("error", "Error occurred. Please try again.");
			return "myorder/myorderform";
		}

		MyOrder savedProduct = myOrderService.saveOrUpdateOrderForm(myOrderForm);

	    redirAttrs.addFlashAttribute("success", "Order submitted successfully.");
		return "redirect:/myorder/show/" + savedProduct.getId();
	}

	@GetMapping("/myorder/show/{id}")
	public String getMyOrder(@PathVariable String id, Model model) {
		model.addAttribute("myorder", myOrderService.getById(Long.valueOf(id)));
		return "myorder/show";
	}

	@GetMapping("/myorder/delete/{id}")
	public String delete(@PathVariable String id) {
		myOrderService.delete(Long.valueOf(id));
		return "redirect:/myorder/list";
	}
}
