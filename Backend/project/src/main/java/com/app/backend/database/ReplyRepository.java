package com.app.backend.database;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.backend.model.Reply;

public interface ReplyRepository  extends JpaRepository<Reply,Integer> {

    Reply findReplyByRepliedbyAndQidAndTimestamp(String user, Integer qid, String timestamp);
}