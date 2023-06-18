package com.hpmaker.hpmaker.domain.sites;

import com.hpmaker.hpmaker.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Sites extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // pk

    @Column(columnDefinition = "TEXT", nullable = false)
    private String title;
    private String modifiedTarget;
    private int isDelete; // 기본값 : 0, 삭제 시 : 1

    @Builder
    public Sites ( Long id, String title, int isDelete, String modifiedTarget){
        this.id = id;
        this.title = title;
        this.isDelete = isDelete;
        this.modifiedTarget = modifiedTarget;
    }
}
