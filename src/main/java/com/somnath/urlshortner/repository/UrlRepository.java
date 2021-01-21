package com.somnath.urlshortner.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.somnath.urlshortner.model.Url;

@Repository
public interface UrlRepository extends JpaRepository<Url, Long> {
}
