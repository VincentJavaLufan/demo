package com.jedis;

import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class RedisUtils {

	private static JedisPool pool;
	
	public static JedisPool open(String host, int port) {
		if(pool == null) {
			JedisPoolConfig config = new JedisPoolConfig();
			config.setMaxTotal(100); // 设置最大线程数量
			config.setMaxIdle(2);
			config.setTestOnBorrow(true); // 设置检查项为true，避免null的情况。
			
			pool = new JedisPool(config, host, port ,6000 ,"111111");
			
		}
		return pool;
	}
	
	// 关闭线程池的方法，在整个程序结束的时候执行
	public static void close() {
		if(pool != null) {
			pool.close();
		}
	}
	
}
