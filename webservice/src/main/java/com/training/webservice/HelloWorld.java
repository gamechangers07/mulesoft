/**
 * 
 */
package com.training.webservice;

import javax.jws.WebService;

/**
 * @author pbalwani
 *
 */
@WebService
public interface HelloWorld {
    String sayHi(String text);
}