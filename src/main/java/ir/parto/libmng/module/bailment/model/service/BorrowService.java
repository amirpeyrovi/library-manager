package ir.parto.libmng.module.bailment.model.service;

import ir.parto.libmng.module.bailment.model.entity.Borrows;
import ir.parto.libmng.module.bailment.model.repository.BorrowsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BorrowService {
    private BorrowsRepository borrowsRepository;

    @Autowired
    public BorrowService(BorrowsRepository borrowsRepository) {
        this.borrowsRepository = borrowsRepository;
    }

    public Borrows addBorrows(Borrows borrows){
        return this.borrowsRepository.save(borrows);
    }

    public Borrows updateBorrows(Borrows borrows){
        return this.borrowsRepository.save(borrows);
    }

    public void deleteBorrows(Borrows borrows){
        this.borrowsRepository.delete(borrows);
    }

    public List<Borrows> findAllBorrows(){
        return this.borrowsRepository.findAll();
    }

    public Borrows findOneBorrows(Long id){
        return this.borrowsRepository.getOne(id);
    }

}
