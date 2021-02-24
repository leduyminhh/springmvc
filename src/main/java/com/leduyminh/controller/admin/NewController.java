package com.leduyminh.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.leduyminh.dto.NewDTO;
import com.leduyminh.service.INewService;

@Controller
@RequestMapping("/admin/bai-viet")
public class NewController {
	@Autowired
	private INewService newService;
	
	@GetMapping("/danh-sach")
	public ModelAndView showList(@RequestParam("page") int page,@RequestParam("limit") int limit) {
		NewDTO newDTO = new NewDTO(); 
		newDTO.setPage(page);
		newDTO.setLimit(limit);
		Pageable pageable = new PageRequest(page-1, limit);
		newDTO.setLst(newService.findAll(pageable));
		newDTO.setTotalItem(newService.getTotalItem());
		newDTO.setTotalPage((int) Math.ceil((double) newDTO.getTotalItem() / newDTO.getLimit()));
		ModelAndView mav = new ModelAndView("/admin/new/list");
		mav.addObject("model",newDTO);
		return mav;
	}
	
}
