package ir.parto.libmng.module.books.model.service;

import ir.parto.libmng.module.books.model.entity.Books;
import ir.parto.libmng.module.books.model.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BooksService {
    private BooksRepository booksRepository;

    @Autowired
    public BooksService(BooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }

    public Books addBooks(Books books){
        return this.booksRepository.save(books);
    }

    public Books updateBooks(Books books){
        return this.booksRepository.save(books);
    }

    public void deleteBooks(Books books){
        this.booksRepository.delete(books);
    }

    public List<Books> findAllBooks(){
        return this.booksRepository.findAll();
    }

    public Books findOneBooks(Long id){
        return this.booksRepository.getOne(id);
    }
}
