

/**
 * 广播/扇出模式
 * 一个生产者发送一条消息，可以同时被多个消费者所收到。
 * 一个消息会被发送到所有绑定到该交换机的队列
 * 忽略路由键(routing key)
 * 使用 @QueueBinding 将队列绑定到交换机
 */
@Slf4j
@Component
public class FanoutCustomer {

    @RabbitListener(
            bindings = @QueueBinding(
                    value = @Queue(value = "fanoutCustomer"),
                    exchange = @Exchange(
                            value = "fanoutExchange",
                            type = ExchangeTypes.FANOUT
                    )
            )
    )
    public void listener(String msg) {
        log.info("接收消息【广播模式】：{}", msg);
    }

}
