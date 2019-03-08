/**
 * 
 */
package io.mosip.kernel.uingenerator.service;

import io.mosip.kernel.uingenerator.dto.UinResponseDto;
import io.vertx.core.json.JsonObject;

/**
 * @author Dharmesh Khandelwal
 * @author Megha Tanga
 * @since 1.0.0
 *
 */
public interface UinGeneratorService {

	/**
	 * Gets a uin from database
	 * 
	 * @return UinResponseDto
	 */
	UinResponseDto getUin();

	/**
	 * Upodate the status of the Uin from ISSUED to ASSIGNED
	 * 
	 * @return
	 */
	UinResponseDto updateUinStatus(JsonObject uin);

}