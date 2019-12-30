package com.altimetrik.ticketmanagementsystem.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.altimetrik.ticketmanagementsystem.model.TicketInfo;

public interface TicketRepository extends JpaRepository<TicketInfo, Integer> {

}
