package com.juceliodev.eventsmicroservice.repositories;

import com.juceliodev.eventsmicroservice.domain.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubscriptionRepository extends JpaRepository<Subscription, Long> {

}