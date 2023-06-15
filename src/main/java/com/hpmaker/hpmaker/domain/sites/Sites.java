//package com.hpmaker.hpmaker.domain.sites;
//
//import lombok.Builder;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//
//import javax.persistence.*;
//import java.time.LocalDateTime;
//
//@Getter
//@NoArgsConstructor
//@Entity
//public class Sites {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id; // pk
//
//    private String title;
//    private LocalDateTime createdate;
//    private LocalDateTime modifieddate;
//
//    @Builder
//    public Sites ( Long id, String title, LocalDateTime createdate, LocalDateTime modifieddate){
//        this.id = id;
//        this.title = title;
//        this.createdate = createdate;
//        this.modifieddate = modifieddate;
//    }
//}
