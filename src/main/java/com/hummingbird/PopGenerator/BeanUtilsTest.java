/**
 * 
 */
package com.hummingbird.PopGenerator;

import java.io.File;

/**
 * @author hongten<br>
 * @date 2013-3-10
 */
public class BeanUtilsTest{
	public static void main(String[] args) throws Exception{
		BeanModel bm = new BeanModel();
		bm.setName("A");
		PopGenertorUtils beanUtils = new PopGenertorUtils(bm);
        beanUtils.createSuite(new File("e:"));
    }
    
}
