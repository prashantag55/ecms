package com.ecms.eipl.pdf;

import java.io.FileOutputStream;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ecms.eipl.data.ClientsData;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class ECMSPdfBuilder extends AbstractITextPdfView {
	private static String FILE = "C:\\ECMS\\log/";

	@Override
	protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		// get data model which is passed by the Spring container
		List<ClientsData> listClient = (List<ClientsData>) model.get("listBooks");

		document.addHeader("HOTEL SWING", "Hotel Swing Booking confirmation");
		PdfWriter writer1 = PdfWriter.getInstance(document, new FileOutputStream(FILE + "Booking.pdf "));
		writer1.setViewerPreferences(PdfWriter.PageModeUseOC);
		writer1.setPdfVersion(PdfWriter.VERSION_1_7);
		document.open();

		document.add(new Paragraph("Recommended books for Spring framework"));

		PdfPTable table = new PdfPTable(5);
		table.setWidthPercentage(100.0f);
		table.setWidths(new float[] { 3.0f, 2.0f, 2.0f, 2.0f, 1.0f });
		table.setSpacingBefore(10);

		// define font for table header row
		Font font = FontFactory.getFont(FontFactory.HELVETICA);
		font.setColor(BaseColor.WHITE);

		// define table header cell
		PdfPCell cell = new PdfPCell();
		cell.setBackgroundColor(BaseColor.GRAY);
		cell.setPadding(5);

		// write table header
		cell.setColspan(11);
		cell.setPhrase(new Phrase("TAX INVOICE", font));
		table.addCell(cell);
		font.setColor(BaseColor.BLACK);
		cell.setBackgroundColor(BaseColor.WHITE);
		cell.setColspan(4);
		cell.setPhrase(new Phrase("ECMS TECHNOLOGIES PVT. LTD. 			\r\n"
				+ "WP21/C-282, Basement, Sec.-71, Noida-201307			\r\n"
				+ "Near Kailash Hospital & Neuro Institute		\r\n" + "GSTIN	09-AAGCE0116N1ZM		\r\n"
				+ "PAN A/C	AAGCE0116N		\r\n" + "State Name 	Uttar Pradesh		\r\n"
				+ "State Code 	09		\r\n" + "Contact	9971070616		\r\n" + "", font));
		table.addCell(cell);

		cell.setPhrase(new Phrase("ISBN", font));
		table.addCell(cell);

		cell.setPhrase(new Phrase("Published Date", font));
		table.addCell(cell);

		cell.setPhrase(new Phrase("Price", font));
		table.addCell(cell);

		/*
		 * // write table row data for (ClientsData clientsData : listClient) {
		 * table.addCell(aBook.getTitle()); table.addCell(aBook.getAuthor());
		 * table.addCell(aBook.getIsbn()); table.addCell(aBook.getPublishedDate());
		 * table.addCell(String.valueOf(aBook.getPrice())); }
		 */

		document.add(table);

		document.close();

	}

}
