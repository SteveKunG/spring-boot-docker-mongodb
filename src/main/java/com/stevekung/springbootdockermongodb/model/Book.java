package com.stevekung.springbootdockermongodb.model;

import java.util.Objects;

import org.springframework.core.style.ToStringCreator;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "books")
public class Book
{
    @Id
    private Long id;
    private String name;
    private String author;

    public Book()
    {

    }

    public Book(String name, String author)
    {
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString()
    {
        return new ToStringCreator(this)
                .append("id", this.id)
                .append("name", this.name)
                .append("author", this.author)
                .toString();
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (!(obj instanceof Book o))
        {
            return false;
        }
        return Objects.equals(this.id, o.id) && Objects.equals(this.name, o.name) && Objects.equals(this.author, o.author);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(this.id, this.name, this.author);
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getAuthor()
    {
        return author;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

}