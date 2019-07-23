package com.library.essay.web;

import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextArea;
import org.apache.wicket.markup.html.panel.Panel;

public class RichTextPanel extends Panel {

  private TextArea<String> contentField;

  public RichTextPanel(String id, Form form) {
    super(id);

    contentField = new TextArea<String>("content");
    contentField.setRequired(true);
    contentField.setOutputMarkupId(true);

    add(contentField);
  }

  public TextArea<String> getContentField() {
    return contentField;
  }

  public void setContentField(TextArea<String> contentField) {
    this.contentField = contentField;
  }



}
