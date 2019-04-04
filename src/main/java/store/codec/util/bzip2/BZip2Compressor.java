package store.codec.util.bzip2;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.apache.tools.bzip2.CBZip2OutputStream;

public class BZip2Compressor {

	public static final byte[] compress(byte[] data) {
		ByteArrayOutputStream compressedBytes = new ByteArrayOutputStream();
		try {
			CBZip2OutputStream var3 = new CBZip2OutputStream(compressedBytes);
			var3.write(data);
			var3.close();
			return compressedBytes.toByteArray();
		} catch (IOException var31) {
			var31.printStackTrace();
			return null;
		}
	}
}
