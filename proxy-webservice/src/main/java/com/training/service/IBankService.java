/**
 * 
 */
package com.training.service;

import javax.jws.WebService;

import com.training.MoneyRequest;
import com.training.MoneyResponse;

/**
 * @author pbalwani
 *
 */
@WebService
public interface IBankService {
	MoneyResponse sendMoney(MoneyRequest request);
}