package org.dami.common.io;

import java.io.IOException;

public interface DataReader<T> {
	
	public void open() throws IOException;
	public void close() throws IOException;
	
	public void next(T sample) throws IOException;
}
