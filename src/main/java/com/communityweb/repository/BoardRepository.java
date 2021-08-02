package com.communityweb.repository;

import com.communityweb.domain.User;
import com.communityweb.domain.Board;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BoardRepository extends JpaRepository<Board, Long> {
    Board findByUser(User user);
}
