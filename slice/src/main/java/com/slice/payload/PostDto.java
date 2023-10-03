package com.slice.payload;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
public class PostDto {
    private long id;
    @NotEmpty
    @Size(min = 2,message = "Title should be more then 2 charecters")
    private String title;
    @NotEmpty
    @Size(min = 5,message = "Description shoulde be more then 5 charecters")
    private String description;
    @NotEmpty
    @Size(min = 10,message = "Content shoulde be more then 10 charecters")
    private String content;
}
