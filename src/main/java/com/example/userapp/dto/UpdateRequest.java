package com.example.userapp.dto;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UpdateRequest {
    private String firstName;
    private String lastName;
    private String address;
    private Date createdTime;
    private Date updatedTime;
}
