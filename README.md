# springcloudzq-hystrixdashboard 断路器监控

一. bus总线和远程配置文件以及断路器hystrix <br>
1. 访问http://127.0.0.1:8012/students查看数据 <br>
2. 更改https://github.com/deadzq/config-server-properties/blob/master/test1/product-view-service-feign-dev.properties数据,如version改变 <br>
3. 点击http://127.0.0.1:8012/students上"刷新远程Config配置文件"按钮,等待几秒,等待返回信息,数据更新到页面 <br>
4. 关闭数据服务ProductDataServiceApplication,再查看页面http://127.0.0.1:8012/students,数据中显示"数据微服务不可用" <br>
5. 再次更改https://github.com/deadzq/config-server-properties/blob/master/test1/product-view-service-feign-dev.properties数据,点击页面刷新Config,查看页面更新 <br>


二. 断路器监控hystrix-dashboard <br>
1. 启动HystrixDashboardApplication,访问http://localhost:8020/hystrix <br>
2. 路径填入视图服务:8012端口的端点http://localhost:8012/actuator/hystrix.stream <br>
3. 点击Monitor Stream,查看断路器监控 <br>
