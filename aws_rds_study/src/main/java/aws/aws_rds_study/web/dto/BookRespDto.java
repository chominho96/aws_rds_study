package aws.aws_rds_study.web.dto;

import aws.aws_rds_study.domain.Book;
import lombok.Builder;
import lombok.Getter;

@Getter
public class BookRespDto {
    private Long id;
    private String title;
    private String content;
    private String author;

    @Builder
    public BookRespDto(Long id, String title, String content, String author) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public BookRespDto(Book bookEntity) {
        this.id = bookEntity.getId();
        this.title = bookEntity.getTitle();
        this.content = bookEntity.getContent();
        this.author = bookEntity.getAuthor();
    }
}