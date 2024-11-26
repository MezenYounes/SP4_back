package com.mezen.users.service.registre;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VerificationTokenRepository extends JpaRepository<VerificationToken, Long> {
 VerificationToken findByToken(String token);
}
