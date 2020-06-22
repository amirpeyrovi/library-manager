package ir.parto.libmng.module.users.model.service;

import ir.parto.libmng.module.users.model.entity.Users;
import ir.parto.libmng.module.users.model.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService {
    private UsersRepository usersRepository;

    @Autowired
    public UsersService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public Users addUsers(Users users){
        return this.usersRepository.save(users);
    }

    public Users updateUsers(Users users){
        return this.usersRepository.save(users);
    }

    public void deleteUsers(Users users){
        this.usersRepository.delete(users);
    }

    public List<Users> findAllUsers(){
        return this.usersRepository.findAll();
    }

    public Users findOneUsers(Long id){
        return this.usersRepository.getOne(id);
    }
}
