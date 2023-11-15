package com.stevekung.springbootdockermongodb.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.stevekung.springbootdockermongodb.model.Book;

public interface BookRepository extends MongoRepository<Book, Long>
{

}