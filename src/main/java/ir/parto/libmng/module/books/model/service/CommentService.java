package ir.parto.libmng.module.books.model.service;

import ir.parto.libmng.module.books.model.entity.Comments;
import ir.parto.libmng.module.books.model.repository.CommentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {
    private CommentsRepository commentsRepository;

    @Autowired
    public CommentService(CommentsRepository commentsRepository) {
        this.commentsRepository = commentsRepository;
    }

    public Comments addComments(Comments comments){
        return this.commentsRepository.save(comments);
    }

    public Comments updateComments(Comments comments){
        return this.commentsRepository.save(comments);
    }

    public void deleteComments(Comments comments){
        this.commentsRepository.delete(comments);
    }

    public List<Comments> findAllComments(){
        return this.commentsRepository.findAll();
    }

    public Comments findOneComments(Long id){
        return this.commentsRepository.getOne(id);
    }
}
