package com.weasels.portal.api.users.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.weasels.portal.api.users.entity.Mission;

public interface MissionRepository extends JpaRepository<Mission, Long> {

}
