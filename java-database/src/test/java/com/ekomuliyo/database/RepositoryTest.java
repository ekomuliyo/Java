package com.ekomuliyo.database;

import com.ekomuliyo.database.entity.Comment;
import com.ekomuliyo.database.repository.CommentRepository;
import com.ekomuliyo.database.repository.CommentRepositoryImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class RepositoryTest {

    private CommentRepository commentRepository;

    @BeforeEach
    void setUp() {
        commentRepository = new CommentRepositoryImpl();
    }

    @Test
    void testInsert() {
        Comment comment = new Comment("eko123@gmail.com", "hi");
        commentRepository.insert(comment);

        Assertions.assertNotNull(comment.getId());
        System.out.println(comment.getId());
    }

    @Test
    void testFindById() {
        Comment comment = commentRepository.findById(3208);
        Assertions.assertNotNull(comment);

        System.out.println(comment.getId());
        System.out.println(comment.getEmail());
        System.out.println(comment.getComment());

        Comment notFound = commentRepository.findById(1000000);
        Assertions.assertNull(notFound);
    }

    @Test
    void testFindAll() {
        List<Comment> comments = commentRepository.findAll();
        System.out.println(comments.size());
    }

    @Test
    void testFindBydEmail() {
        List<Comment> comments = commentRepository.findAllByEmail("eko123@gmail.com");
        System.out.println(comments.size());
    }
}
