package com.mulesoft.training;

import java.util.List;

import org.mule.api.MuleContext;
import org.mule.api.MuleEvent;
import org.mule.api.MuleException;
import org.mule.api.endpoint.ImmutableEndpoint;
import org.mule.api.lifecycle.InitialisationException;
import org.mule.api.transformer.DataType;
import org.mule.api.transformer.Transformer;
import org.mule.api.transformer.TransformerException;
public class FlightTransformer implements Transformer  {

	@Override
	public MuleEvent process(MuleEvent event) throws MuleException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void initialise() throws InitialisationException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setMuleContext(MuleContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setEndpoint(ImmutableEndpoint ep) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isSourceTypeSupported(Class<?> aClass) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isSourceDataTypeSupported(DataType<?> dataType) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Class<?>> getSourceTypes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DataType<?>> getSourceDataTypes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isAcceptNull() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isIgnoreBadInput() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object transform(Object src) throws TransformerException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object transform(Object src, String encoding)
			throws TransformerException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setReturnClass(Class<?> theClass) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Class<?> getReturnClass() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setReturnDataType(DataType<?> type) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public DataType<?> getReturnDataType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getMimeType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getEncoding() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ImmutableEndpoint getEndpoint() {
		// TODO Auto-generated method stub
		return null;
	}

}
