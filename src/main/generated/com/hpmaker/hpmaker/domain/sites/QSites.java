//package com.hpmaker.hpmaker.domain.sites;
//
//import static com.querydsl.core.types.PathMetadataFactory.*;
//
//import com.querydsl.core.types.dsl.*;
//
//import com.querydsl.core.types.PathMetadata;
//import javax.annotation.Generated;
//import com.querydsl.core.types.Path;
//
//
///**
// * QSites is a Querydsl query type for Sites
// */
//@Generated("com.querydsl.codegen.EntitySerializer")
//public class QSites extends EntityPathBase<Sites> {
//
//    private static final long serialVersionUID = 188220625L;
//
//    public static final QSites sites = new QSites("sites");
//
//    public final DateTimePath<java.time.LocalDateTime> createdate = createDateTime("createdate", java.time.LocalDateTime.class);
//
//    public final NumberPath<Long> id = createNumber("id", Long.class);
//
//    public final DateTimePath<java.time.LocalDateTime> modifieddate = createDateTime("modifieddate", java.time.LocalDateTime.class);
//
//    public final StringPath title = createString("title");
//
//    public QSites(String variable) {
//        super(Sites.class, forVariable(variable));
//    }
//
//    public QSites(Path<? extends Sites> path) {
//        super(path.getType(), path.getMetadata());
//    }
//
//    public QSites(PathMetadata metadata) {
//        super(Sites.class, metadata);
//    }
//
//}
//
