package com.clovisgargione.kafka.deserializer;

import org.apache.kafka.common.serialization.Deserializer;

import com.clovisgargione.kafka.model.Venda;
import com.fasterxml.jackson.databind.ObjectMapper;

public class VendaDeserializer implements Deserializer<Venda> {

	@Override
	public Venda deserialize(String topic, byte[] data) {
		
		try {
			return new ObjectMapper().readValue(data, Venda.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null; 
	}

}
