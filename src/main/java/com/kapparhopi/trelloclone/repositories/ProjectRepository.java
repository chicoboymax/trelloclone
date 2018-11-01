package com.kapparhopi.trelloclone.repositories;


import com.kapparhopi.trelloclone.domain.Project;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Long> {
}
