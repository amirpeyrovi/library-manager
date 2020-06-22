package ir.parto.libmng.module.admins.model.service;

import ir.parto.libmng.module.admins.model.entity.Admins;
import ir.parto.libmng.module.admins.model.repository.AdminsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminsService {
    private AdminsRepository adminsRepository;

    @Autowired
    public AdminsService(AdminsRepository adminsRepository) {
        this.adminsRepository = adminsRepository;
    }

    public Admins addAdmins(Admins admins){
        return this.adminsRepository.save(admins);
    }

    public Admins updateAdmins(Admins admins){
        return this.adminsRepository.save(admins);
    }

    public void deleteAdmins(Admins admins){
        this.adminsRepository.delete(admins);
    }

    public List<Admins> findAllAdmins(){
        return this.adminsRepository.findAll();
    }

    public Admins findOneAdmins(Long id){
        return this.adminsRepository.getOne(id);
    }
}
