package br.com.wepudim.controller;

import br.com.wepudim.model.Pudding;
import br.com.wepudim.service.PdfService;
import java.util.List;

public class ReadyDeliveryController {
	
	private PdfService pdfService;
	
	public ReadyDeliveryController (PdfService pdfService) {
		this.pdfService = pdfService;
	}
	
	public void generatePdf(List <Pudding> medium, List <Pudding> family) {
		pdfService.generateReadyDeliveryPdf(medium, family);
	}

}
