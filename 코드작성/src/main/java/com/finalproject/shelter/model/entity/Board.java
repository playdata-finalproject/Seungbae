package com.finalproject.shelter.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString(exclude = "answerList")
@Accessors(chain = true)
@EntityListeners(AuditingEntityListener.class)
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String nickname;

    @Column(columnDefinition = "Text")
    private String contents;

    private int viewBoard;

    private int goodBoard;

    private int hateBoard;

    @CreatedDate
    private LocalDate registeredAt;

    private LocalDate unregisteredAt;

    @LastModifiedDate
    private LocalDate updatedAt;

    @LastModifiedBy
    private String updatedBy;

    @ManyToOne
    private Category category;

    @ManyToOne
    private User user;

    @OneToMany(mappedBy = "board",fetch = FetchType.LAZY )
    @JsonIgnore
    private List<Answer> answerList;
}
