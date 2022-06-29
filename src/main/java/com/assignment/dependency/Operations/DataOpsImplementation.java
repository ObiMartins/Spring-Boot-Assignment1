package com.assignment.dependency.Operations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.dependency.Data.DataInput;

@Service
public class DataOpsImplementation implements DataOps {

	@Autowired
	private DataInput input;

	public DataInput getInput() {
		return input;
	}

	public void setInput(DataInput input) {
		this.input = input;
	}

	
}
