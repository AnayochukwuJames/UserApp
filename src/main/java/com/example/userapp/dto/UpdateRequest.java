package com.example.userapp.dto;

import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UpdateRequest {
    @NotBlank(message = "first name must not be null")
    @Size(min = 3, message = "first name must not be minimum of 3 characters")
    private String firstName;
    @NotBlank(message = "first name must not be null")
    @Size(min = 3, message = "last name must not be minimum of 3 characters")
    private String lastName;
    @NotBlank(message = "first name must not be null")
    @Size(min = 3, message = "address must not be minimum of 3 characters")
    private String address;
    private Date createdTime;
    private Date updatedTime;
}
