package com.example.demo.domain;

import jakarta.persistence.*;

@Entity
public class Post {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String text;
	private String title;

	private boolean active;

	//외래키 설정
	@ManyToOne(fetch = FetchType.LAZY)
	private Member member;

	//이 객체를 만들 때 mapping
	public Post(String text, String title, Member member) {
		this.text = text;
		this.title = title;
		this.member = member;
		this.active = true;
	}

	public void delete() {
		this.active = false;
		//조회할 때 active가 false인 걸 제외시킴 (DB에 남아있긴 함)
	}

	public Long getId() {
		return id;
	}

	public String getText() {
		return text;
	}

	public String getTitle() {
		return title;
	}

	public void setText(String text) {
		this.text = text;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	protected Post() {
	}
}
