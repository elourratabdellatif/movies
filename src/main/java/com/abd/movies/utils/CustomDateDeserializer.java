package com.abd.movies.utils;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import org.joda.time.DateTime;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class CustomDateDeserializer extends StdDeserializer<DateTime> {

    private SimpleDateFormat formatter =
            new SimpleDateFormat("dd/MM/yyyy");

    public CustomDateDeserializer() {
        this(null);
    }

    public CustomDateDeserializer(Class<?> vc) {
        super(vc);
    }

    @Override
    public DateTime deserialize(JsonParser jsonparser, DeserializationContext context)
            throws IOException, JsonProcessingException {
        String date = jsonparser.getText();
        try {
            return new DateTime(formatter.parse(date));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
