package com.library.essay.web;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.Link;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HomePage extends WebPage {

	private static final long serialVersionUID = -7665112860696096485L;
	private static final Logger log = LoggerFactory.getLogger(HomePage.class);

	public HomePage() {

		addEssayListLink("essayListLink");
		add(new Label("message", "Welcome to Essay Library!"));

	}

	private void addEssayListLink(String id) {
		Link<Void> link = new Link<Void>(id) {

			private static final long serialVersionUID = 1L;

			@Override
			public void onClick() {
				setResponsePage(EssayListPage.class);
			}
		};

		add(link);
	}

}
