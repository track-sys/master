package com.altimetrik.ticketmanagementsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.altimetrik.ticketmanagementsystem.model.TicketInfo;
import com.altimetrik.ticketmanagementsystem.repo.TicketRepository;

@Service
public class TicketServiceImpl implements TicketService {

	@Autowired
	TicketRepository ticketRepo;

	@Override
	public void save(TicketInfo ticket) {
		ticketRepo.save(ticket);

	}

}
