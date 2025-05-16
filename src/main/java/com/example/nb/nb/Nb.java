package com.example.nb.nb;

import jakarta.persistence.*;
import lombok.*;

@Table(name= "nb")
@Entity(name = "nb")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Nb {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String image;
    private Integer price;
}
