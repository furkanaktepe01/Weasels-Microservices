package com.weasels.portal.api.users.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.weasels.portal.api.users.entity.Team;

public interface TeamsRepository extends JpaRepository<Team, Long> {

}
