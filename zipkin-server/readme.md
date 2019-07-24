因为视图服务进行了改造,支持了rabbitMQ, 那么在默认情况下, 它的信息就不会进入Zipkin了. <br>
在Zipkin里看不到视图服务的资料了. <br>
为了解决这个问题,在启动Zipkin的时候带一个参数就好了: <br>
java -jar zipkin-server-2.10.1-exec.jar --zipkin.collector.rabbitmq.addresses=localhost <br>
运行成功后访问 http://127.0.0.1:8012/students 刷新两次 <br>
再访问http://localhost:9411/zipkin/dependency/查看zipkin依赖 <br>

bus消息总线
之前的config-server, 也把视图服务改造成了配置客户端,但是当需要刷新配置信息的时候,不得不既重启config-server,又重启微服务,<br>
这样体验是不太好的,我们希望一旦git上的配置信息修改之后,就可以自动地刷新到微服务里,而不是需要手动启动才可以. <br>
这里使用bus及product-view-service-feign中FreshConfigController来解决这个问题.<br>
springCloud 通过 rabbitMQ 来进行消息广播，以达到有配置信息发生改变的时候，广播给多个微服务的效果。<br>
所以需要先安装 rabbitMQ 服务器。<br>