package com.altimetrik.ticketmanagementsystem.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.altimetrik.ticketmanagementsystem.domain.TicketInfo;

public interface TicketRepository extends JpaRepository<TicketInfo, Integer> {

}
