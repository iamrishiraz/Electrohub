package com.rishi.electrohub.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rishi.electrohub.entities.Cart;
import com.rishi.electrohub.entities.User;

public interface CartRepository extends JpaRepository<Cart, String>{

	Optional<Cart> findByUser(User user);
}
