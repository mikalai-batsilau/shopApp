package com.epam.controller.actions;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.transform.Templates;

import com.epam.controller.Action;
import com.epam.util.HTMLWriter;
import com.epam.util.TemplatesHolder;

public class SubcategoriesListAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		PrintWriter resultWriter = response.getWriter();

		Templates subcatListTemp = TemplatesHolder
				.getTemplates("subcategoriesList");
		InputStream catalog = SubcategoriesListAction.class
				.getResourceAsStream("/catalog.xml");
		String name = request.getParameter("name");
		Map<String, String> paramsMap = new HashMap<String, String>();
		paramsMap.put("name", name);
		HTMLWriter.write(subcatListTemp, catalog, resultWriter, paramsMap);

	}

}
