package com.hpmaker.hpmaker.domain.sites;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.stream.Stream;

//public interface SitesRepository extends JpaRepository< Sites, Long>, QuerydslPredicateExecutor {
public interface SitesRepository extends JpaRepository< Sites, Long> {
    Stream< Sites> findByIsDelete( int isDelete);
}
