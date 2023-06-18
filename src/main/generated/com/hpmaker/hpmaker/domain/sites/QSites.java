package com.hpmaker.hpmaker.domain.sites;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QSites is a Querydsl query type for Sites
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QSites extends EntityPathBase<Sites> {

    private static final long serialVersionUID = 188220625L;

    public static final QSites sites = new QSites("sites");

    public final com.hpmaker.hpmaker.domain.QBaseTimeEntity _super = new com.hpmaker.hpmaker.domain.QBaseTimeEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Integer> isDelete = createNumber("isDelete", Integer.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedDate = _super.modifiedDate;

    public final StringPath title = createString("title");

    public QSites(String variable) {
        super(Sites.class, forVariable(variable));
    }

    public QSites(Path<? extends Sites> path) {
        super(path.getType(), path.getMetadata());
    }

    public QSites(PathMetadata metadata) {
        super(Sites.class, metadata);
    }

}

