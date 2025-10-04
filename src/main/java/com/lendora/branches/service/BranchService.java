package com.lendora.branches.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lendora.branches.dto.BranchResponseDTO;
import com.lendora.branches.entity.Branch;
import com.lendora.branches.repository.BranchRepository;

@Service
public class BranchService {
    @Autowired private BranchRepository repo;

    public List<BranchResponseDTO> list(){
        return repo.findAll().stream().map(this::toDto).toList();
    }

    public BranchResponseDTO toDto (Branch branch){
        if(branch == null) return null;
        return new BranchResponseDTO(
            branch.getId(),
            branch.getName(),
            branch.getAddress()
        );
    }
}
