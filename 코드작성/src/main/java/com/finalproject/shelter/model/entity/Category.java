package com.finalproject.shelter.model.entity;

import lombok.*;
import lombok.experimental.Accessors;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@ToString(exclude = {"boardList"})
@Accessors(chain = true)
@EntityListeners(AuditingEntityListener.class)
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private LocalDateTime updatedAt;

    private String updatedBy;

    private LocalDateTime createdAt;

    private LocalDateTime uncreatedAt;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "category")
    private List<Board> boardList;

    @ManyToOne
    private AdminUser adminUserCategory;

    @ManyToOne
    private Categorytable categorytable;
}
