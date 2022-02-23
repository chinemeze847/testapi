package com.test.testapi.model;


import javax.persistence.*;

import lombok.*;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User 
{
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  
  private String fullName;
  private String username;
  private String email;
  private String password;
  private String location;

}
