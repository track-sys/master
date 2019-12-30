package com.altimetrik.ticketmanagementsystem.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.altimetrik.ticketmanagementsystem.model.TicketInfo;
import com.altimetrik.ticketmanagementsystem.service.TicketService;

@RestController
public class TicketController {

	@Autowired
	TicketService ticketService;
	

	@PostMapping("/saveTicketDetails")
	public void saveTicketInfo() {
		TicketInfo obj = new TicketInfo(1, 6812, "ticketsInfo", "Bug", "save functionality not working", false, new Date(), "1.1",
				"inProgress", new Date());
		ticketService.save(obj);
		System.out.println("saved");
	}
}
