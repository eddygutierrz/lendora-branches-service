package com.lendora.branches.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lendora.branches.dto.BranchResponseDTO;
import com.lendora.branches.service.BranchService;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/branches")
public class BranchController {
    private final BranchService branchService;
    public BranchController(BranchService branchService) {
        this.branchService = branchService;
    }

    @GetMapping
    public List<BranchResponseDTO> list() {
        return branchService.list();
    }
    
}