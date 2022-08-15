package com.nagarro.interf;

import java.io.IOException;
import java.util.List;

import com.nagarro.tshirtFactory.model.Tshirt;

public interface CSVScanners {
	List<Tshirt> getTshirts() throws IOException;

	List<Tshirt> getAvailableTshirts(Tshirt fs) throws IOException;
}
