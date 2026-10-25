package com.rishi.electrohub.repositories;



import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.rishi.electrohub.entities.Order;
import com.rishi.electrohub.entities.User;

public interface OrderRepository extends JpaRepository<Order, String>{
	
	Page<Order> findAllByUser(Pageable pageable, User user);

}
