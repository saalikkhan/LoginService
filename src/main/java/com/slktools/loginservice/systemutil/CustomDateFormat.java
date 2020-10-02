package com.slktools.loginservice.systemutil;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

public class CustomDateFormat extends JsonDeserializer<Date> {

	private SimpleDateFormat simpleDateFormat;

	@Override
	public Date deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
		String unFormattedDate = p.getText().trim();
		try {
			simpleDateFormat = new SimpleDateFormat("DD/MM/YYYY");
			return simpleDateFormat.parse(unFormattedDate);
		} catch (ParseException E) {
			E.printStackTrace();
		}
		return ctxt.parseDate(unFormattedDate);
	}

	public boolean isValidDate(String date) {
		try {
			simpleDateFormat = new SimpleDateFormat("DD/MM/YYYY");
		} catch (Exception E) {
			E.printStackTrace();
			return false;
		}
		return true;
	}

	public boolean isValidDate(String date, String format) {
		try {
			simpleDateFormat = new SimpleDateFormat(format);
		} catch (Exception E) {
			E.printStackTrace();
			return false;
		}
		return true;
	}

	public Date getDate(String date, String format) {
		simpleDateFormat = new SimpleDateFormat(format);
		try {
			return simpleDateFormat.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}

}
