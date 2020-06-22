package ir.parto.libmng.module.users.model.service;

import ir.parto.libmng.module.users.model.entity.Group;
import ir.parto.libmng.module.users.model.repository.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupService {
    private GroupRepository groupRepository;

    @Autowired
    public GroupService(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }

    public Group addGroup(Group group){
        return this.groupRepository.save(group);
    }

    public Group updateGroup(Group group){
        return this.groupRepository.save(group);
    }

    public void deleteGroup(Group group){
        this.groupRepository.save(group);
    }

    public List<Group> findAllGroup(){
        return this.groupRepository.findAll();
    }

    public Group findOneGroup(Long id){
        return this.groupRepository.getOne(id);
    }
}
