
/**
 * 基本模式
 */
@Slf4j
@Component
public class Customer {

    /**
     * queuesToDeclare：支持多个队列，将队列绑定到默认交换机上，routeKey为队列名称。
     * @RabbitListener 注解声明这是一个 RabbitMQ 消息监听器
     * queuesToDeclare 会自动声明队列，如果队列不存在则创建
     * 发送消息时直接指定队列名 testQueue
     *  最简单的队列模式
     *  一个生产者对应一个消费者
     *  使用默认的direct交换机
     * @param msg 接收到的消息
     */
    @RabbitListener(queuesToDeclare = @Queue(value = "testQueue"))
    public void listener(String msg) {
        log.info("接收消息：{}", msg);
//        throw new RuntimeException("Err");
    }

}
