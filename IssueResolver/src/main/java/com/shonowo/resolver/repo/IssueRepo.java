package com.shonowo.resolver.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shonowo.resolver.model.Issue;

@Repository
public interface IssueRepo extends JpaRepository<Issue, Long> {

}
