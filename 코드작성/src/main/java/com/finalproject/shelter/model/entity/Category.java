package com.finalproject.shelter.model.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@ToString(exclude = {"boardList"})
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @ManyToOne
    private User usercategory;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "category")
    private List<Board> boardList;
}
