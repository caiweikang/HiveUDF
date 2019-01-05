package com.vip.udf;

import org.apache.hadoop.hive.ql.exec.UDF;

public class MyUdf extends UDF{
	
	public String evaluate(String str) {
		return str.toUpperCase();
	}
}
