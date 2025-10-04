package com.lendora.branches.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lendora.branches.entity.Branch;

@Repository
public interface BranchRepository extends JpaRepository<Branch, Long> {
}