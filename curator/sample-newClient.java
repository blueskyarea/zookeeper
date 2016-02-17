import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;

public class sampleNewClient {
  // ExponentialBackoffRetry(int baseSleepTimeMs, int maxRetries)
  private static final RetryPolicy RETRY_POLICY = new ExponentialBackoffRetry(500, 5);
  private final CuratorFramework curator;

  public sampleNewClient() {
    // newClient(String connectString, int sessionTimeoutMs, int connectionTimeoutMs, RetryPolicy retryPolicy)
    this.curator = CuratorFrameworkFactory.newClient("localhost", 10000, 5000, RETRY_POLICY);
  }

  public static void main(String[] args) {
    new sampleNewClient();
  }
}

