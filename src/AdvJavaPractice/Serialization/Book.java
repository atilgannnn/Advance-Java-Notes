package AdvJavaPractice.Serialization;

import java.io.Serializable;

public class Book implements Serializable {


        private String name;
        private String author;
        private Integer publishDate;

        public Book(String name, String author, Integer publishDate) {
            this.name = name;
            this.author = author;
            this.publishDate = publishDate;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public Integer getPublishDate() {
            return publishDate;
        }

        public void setPublishDate(Integer publishDate) {
            this.publishDate = publishDate;
        }

        @Override
        public String toString() {
            return "Book{" +
                    "name='" + name + '\'' +
                    ", author='" + author + '\'' +
                    ", publishDate=" + publishDate +
                    '}';
        }
    }







