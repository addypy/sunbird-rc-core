To create a middleware based on the provided code blocks, you can follow these steps:

1. Define a Middleware interface:

```java
public interface Middleware {
    void handleRequest(Request request, Response response);
}
```

2. Implement the middleware:

Create a class that implements the `Middleware` interface. In this example, I'll create a middleware that logs audit records using the `AuditServiceImpl` class.

```java
import dev.sunbirdrc.pojos.AuditRecord;
import dev.sunbirdrc.registry.service.impl.AuditServiceImpl;
import dev.sunbirdrc.registry.service.AuditService;

public class AuditLoggingMiddleware implements Middleware {
    private AuditService auditService;

    public AuditLoggingMiddleware(AuditService auditService) {
        this.auditService = auditService;
    }

    @Override
    public void handleRequest(Request request, Response response) {
        // Extract necessary information from the request and response
        String action = request.getAction();
        String entityType = request.getEntityType();
        String entityId = request.getEntityId();
        JsonNode inputNode = request.getInputNode();

        // Create an AuditRecord instance
        AuditRecord auditRecord = new AuditRecord()
            .setAction(action)
            .setEntityType(entityType)
            .setUserId(request.getUserId());

        // Perform the audit
        auditService.doAudit(auditRecord, inputNode, null);

        // Log the audit record
        System.out.println("Audit record: " + auditRecord);
    }
}
```

3. Use the middleware in your application:

You can now use the `AuditLoggingMiddleware` in your application. When a request comes in, pass it through the middleware before processing it further.

```java
public class MyApplication {
    private AuditService auditService;
    private Middleware auditMiddleware;

    public MyApplication() {
        auditService = new AuditServiceImpl();
        auditMiddleware = new AuditLoggingMiddleware(auditService);
    }

    public void handleRequest(Request request, Response response) {
        // Pass the request through the middleware
        auditMiddleware.handleRequest(request, response);

        // Continue processing the request
        // ...
    }
}
```

This example demonstrates how to create a simple middleware for auditing purposes using the provided code blocks. You can create more complex middleware by implementing the `Middleware` interface and handling the request and response data as needed.