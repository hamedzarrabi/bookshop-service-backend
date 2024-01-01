package com.service.backend.bookshop.bookservice.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ApiModel("Book")
public class BookDto {
    @ApiModelProperty("Book id")
    private UUID bookId;
    @ApiModelProperty("Book title")
    private String title;
    @ApiModelProperty("Book author")
    private String author;
    @ApiModelProperty("Book publisher")
    private String publisher;
    @ApiModelProperty("Book Small description under title")
    private String smallDescription;
    @ApiModelProperty("Book long description from book")
    private String LongDescription;
    @ApiModelProperty("Book ISBN")
    private String ISBN;
    @ApiModelProperty("Book date write ")
    private Date year;
    @ApiModelProperty("Book images")
    private String images;
}
