package org.epay.action;

import org.epay.http.HOpCode;
import org.epay.protobuf.http.PCErrorProto.PCError;
import org.epay.protobuf.http.PCErrorProto.PCErrorCode;

public class PCErrorPack {
	public static PCError create(PCErrorCode pcErrorCode, String errorHOpCode) {
		PCError.Builder errorBuilder = PCError.newBuilder();
		errorBuilder.setHOpCode(HOpCode.PC_ERROR);
		errorBuilder.setErrorCode(pcErrorCode);
		errorBuilder.setErrorHOpCode(errorHOpCode);
		return errorBuilder.build();
	}
}
