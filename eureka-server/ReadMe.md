简单的restful API


		当服务过载或者是已经服务响应时候直接通过断路由的方式减少对接口的访问，或者访问其他的接口。及cloud中Hystrix的断路由模式。
		
断路由测试
1、启动cloud-simple6
2、启动cloud-simple6-1（启动普通服务）
3、启动cloud-simple6-2（启动Hystrix服务）
4、测试接口是否可用后，停止2项目
5、查看返回正确的error结果
