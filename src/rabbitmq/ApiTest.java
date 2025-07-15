@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiTest {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Test
    public void test_product() throws InterruptedException {
        // 发送消息
        rabbitTemplate.convertAndSend("testQueue", "基本消息");
        // 等待
        new CountDownLatch(1).await();
    }

    @Test
    public void test_product_fanout() throws InterruptedException {
        rabbitTemplate.convertAndSend("fanoutExchange", "", "广播消息");
        // 等待
        new CountDownLatch(1).await();
    }

    @Test
    public void test_product_route() throws InterruptedException {
        rabbitTemplate.convertAndSend("routeExchange", "routeKey1", "路由模式，消息1");
        rabbitTemplate.convertAndSend("routeExchange", "routeKey2", "路由模式，消息2");
        // 等待
        new CountDownLatch(1).await();
    }

    @Test
    public void test_product_topic() throws InterruptedException {
        rabbitTemplate.convertAndSend("topicExchange", "topic.x", "通配符模式，消息1");
        rabbitTemplate.convertAndSend("topicExchange", "topic.y.z", "通配符模式，消息2");
        // 等待
        new CountDownLatch(1).await();
    }

}
