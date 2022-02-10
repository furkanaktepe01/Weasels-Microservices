package com.weasels.portal.api.users.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.weasels.portal.api.users.entity.Department;

public interface DepartmentsRepository extends JpaRepository<Department, Long> {

}
