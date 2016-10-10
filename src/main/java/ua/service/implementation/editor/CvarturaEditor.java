package ua.service.implementation.editor;

import java.beans.PropertyEditorSupport;


import ua.entity.Cvartura;
import ua.service.CvarturaService;


public class CvarturaEditor extends PropertyEditorSupport{

	private final CvarturaService cvarturaService;

	public CvarturaEditor(CvarturaService cvarturaService) {
		this.cvarturaService = cvarturaService;
	}

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		Cvartura cvartura = cvarturaService.findOne(Integer.valueOf(text));
		setValue(cvartura);
	}
}