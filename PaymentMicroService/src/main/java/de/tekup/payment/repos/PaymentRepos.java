package de.tekup.payment.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import de.tekup.payment.entities.PaymentEntity;

public interface PaymentRepos extends JpaRepository<PaymentEntity, Long>{

}
