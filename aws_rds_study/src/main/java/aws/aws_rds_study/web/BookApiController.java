package aws.aws_rds_study.web;

import aws.aws_rds_study.service.BookService;
import aws.aws_rds_study.web.dto.BookRespDto;
import aws.aws_rds_study.web.dto.BookSaveReqDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class BookApiController {

    private final BookService bookService;

    @GetMapping("/")
    public String home() {
        return "<h1>aws-v4</h1>";
    }

    @PostMapping("/api/book")
    public ResponseEntity<?> bookSave(@RequestBody BookSaveReqDto reqDto) {
        BookRespDto respDto = bookService.책등록(reqDto);
        return new ResponseEntity<>(respDto, HttpStatus.CREATED);
    }

    @GetMapping("/api/book")
    public ResponseEntity<?> bookList() {
        List<BookRespDto> respDtos = bookService.책목록보기();
        return new ResponseEntity<>(respDtos, HttpStatus.OK);
    }
}
