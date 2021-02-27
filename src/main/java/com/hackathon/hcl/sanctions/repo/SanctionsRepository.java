package com.hackathon.hcl.sanctions.repo;

import com.hackathon.hcl.sanctions.entity.Sanctions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SanctionsRepository extends JpaRepository<Sanctions, Integer> {
}
