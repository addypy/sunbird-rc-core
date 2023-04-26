# FAQ

## 1. How to generate an admin token?

To generate an admin token, you can use the KeycloakService class. The `getToken()` method in the KeycloakService class returns a Promise that resolves with the Keycloak authentication token. Here's an example of how to use the KeycloakService class:

```javascript
import { KeycloakService } from 'path/to/keycloak.service';

const keycloakService = new KeycloakService(keycloakInstance);

keycloakService.getToken()
  .then(token => {
    console.log('Admin token:', token);
  })
  .catch(error => {
    console.error('Error:', error);
  });
```

In this example, you need to replace `path/to/keycloak.service` with the correct path to the `keycloak.service.js` file in your project, and `keycloakInstance` with your Keycloak instance. The `getToken()` method will automatically refresh the token if it's about to expire and resolve with the valid token [deps/keycloak/themes/keycloak.v2/account/resources/keycloak-service/keycloak.service.js](https://github.com/Sunbird-RC/sunbird-rc-core/blob/main/deps/keycloak/themes/keycloak.v2/account/resources/keycloak-service/keycloak.service.js).

---



## 2. What is the Education Ecosystem?

The Education Ecosystem is an initiative aimed at improving access to learning opportunities for every child. It was co-founded by Nandan Nilekani, Rohini Nilekani, and Shankar Maruwada as a not-for-profit initiative called EkStep. The goal is to gather partners on a universal, collaborative platform to reimagine learning opportunities for children, improve the education system, identify skills and demand for the country's future, and help create self-sustaining, self-run communities [angular-ui/src/app/components/landingpage/landingpage.component.html](https://github.com/Sunbird-RC/sunbird-rc-core/blob/main/ui-sample/angular-ui/src/app/components/landingpage/landingpage.component.html), [alpacaJs/home.html](https://github.com/Sunbird-RC/sunbird-rc-core/blob/main/ui-sample/alpacaJs/home.html).

---



## 3. How to use the API?

To use the Sunbird RC API, you need to make HTTP requests to the API endpoints. The API is hosted at `https://ndear.xiv.in` and follows the Swagger 2.0 specification. It consumes and produces JSON data.

Here is an example of how you can make a request to the API using the health check endpoint:

1. Send a GET request to the `/health` endpoint.

```http
GET https://ndear.xiv.in/health
```

2. The API will return a JSON response with the health status. The response will have an HTTP status code of 200 if successful.

For making API calls, you can use the `RequestParam` interface in the Angular UI to define the parameters for the API calls. The interface has the following properties:

- `url`: The API endpoint URL.
- `param`: HTTP query parameters (optional).
- `header`: HTTP headers (optional).
- `data`: HTTP request body data (optional).

Here's an example of how to use the `RequestParam` interface in TypeScript:

```typescript
import { RequestParam } from './services/interfaces/requestParam.ts';

const request: RequestParam = {
  url: 'https://ndear.xiv.in/health',
  header: {
    'Content-Type': 'application/json',
  },
};

// Use the request object to make the API call
```

For more information on the available API endpoints, refer to the [baseSwagger.json](https://github.com/Sunbird-RC/sunbird-rc-core/blob/main/java/registry/src/main/resources/baseSwagger.json) file in the repository.

---



## 4. How to implement SSO with existing systems?

To implement Single Sign-On (SSO) with existing systems, you can use an identity provider like Keycloak. Sunbird RC can be integrated with Keycloak for authentication and authorization purposes.

In the given code blocks, there is an example of a Keycloak configuration file for identity providers. This file can be used to configure the identity providers supported by Keycloak, such as Google, GitHub, Facebook, and Twitter.

To integrate SSO with existing systems:

1. Set up and configure Keycloak as your identity provider.
2. Configure the identity providers you want to support in Keycloak using the provided configuration file [deps/keycloak/themes/base/admin/resources/partials/realm-identity-provider.html](https://github.com/Sunbird-RC/sunbird-rc-core/blob/main/deps/keycloak/themes/base/admin/resources/partials/realm-identity-provider.html).
3. Integrate Sunbird RC with Keycloak for authentication and authorization.

By following these steps, you can enable SSO with existing systems using Keycloak and Sunbird RC.

---



## 5. How to leverage data stores?

To leverage data stores in Sunbird RC, you can use Data Access Object (DAO) classes for interacting with the underlying data storage. These classes help keep your application code modular and maintainable. By using a DAO, you can separate the data access logic from the business logic in your application, making it easier to maintain and update as needed.

In the Sunbird RC framework, you can find the following DAO classes:

1. `IRegistryDao.java`: Interface for the registry DAO.
2. `RegistryDaoImpl.java`: Implementation of the registry DAO.
3. `SearchDao.java`: Interface for search functionality.
4. `SearchDaoImpl.java`: Implementation of search functionality.

For example, in your application, you can create an instance of the `EntityDao` class and use it to access and manipulate data:

```java
public class MyApplication {
    private EntityDao entityDao;
    public MyApplication(EntityDao entityDao) {
        this.entityDao = entityDao;
    }
    // Use the entityDao to access and manipulate data
}
```

This approach allows you to efficiently store and retrieve data while keeping your application code modular and maintainable [java/registry/src/main/java/dev/sunbirdrc/registry/README.md](https://github.com/Sunbird-RC/sunbird-rc-core/blob/main/java/registry/src/main/java/dev/sunbirdrc/registry/README.md).

---



## 6. What is Swagger JSON API?

Swagger JSON API is a JSON representation of an API using the Swagger (now known as OpenAPI) specification. It provides a standardized way to describe the structure, endpoints, and data types of an API, making it easier for developers to understand and interact with the API. In the Sunbird RC project, the Swagger JSON API is used to define the Sunbird Registry and Credential API, as seen in the `baseSwagger.json` file:

```json
{
  "consumes": [
    "application/json"
  ],
  "produces": [
    "application/json"
  ],
  "schemes": [
    "https"
  ],
  "swagger": "2.0",
  "info": {
    "description": "Sunbird registry and credential api (SunbirdRC)",
    "title": "Sunbird Registry and Credential",
    "version": "1.0.0"
  },
  "host": "ndear.xiv.in",
  "basePath": "/"
}
```

This file specifies that the API consumes and produces JSON data, uses HTTPS, and provides information about the API, such as its description, title, and version. The API is hosted at `ndear.xiv.in` with a base path of `/` [baseSwagger.json](https://github.com/Sunbird-RC/sunbird-rc-core/blob/main/java/registry/src/main/resources/baseSwagger.json).

---



## 7. How to use the Admin Portal?

To use the Admin Portal, you can follow these steps:

1. Access the Admin Portal by navigating to the appropriate URL in your browser.
2. Log in using your admin credentials.
3. You will be presented with various tabs and options to manage your realm, clients, and users.

The provided code block is a part of the Admin Portal's user interface, specifically for managing client registration policies. This HTML template displays two sections: Anonymous Policies and Authenticated Policies. Each section allows you to add, edit, or delete policies for client registrations.

To manage client registration policies in the Admin Portal:

1. Navigate to the appropriate tab or section for client registration policies.
2. Use the "Add Provider" dropdown to add a new policy.
3. Click on the policy name to edit an existing policy.
4. Click on the "Delete" action to remove a policy.

Please note that the exact navigation and options may vary depending on your specific implementation and configuration of the Sunbird RC software.

Relevant code block: [client-reg-policies.html](https://github.com/Sunbird-RC/sunbird-rc-core/blob/main/deps/keycloak/themes/base/admin/resources/partials/client-reg-policies.html)

---



## 8. How to get a schema?

To get a schema, you can refer to the JSON schema file in the Sunbird RC repository. For example, the Schema.json file contains a schema structure that defines the data and metadata about a user or entity in the registry. You can find the schema structure in the "definitions" section of the JSON file:

```json
{
  "definitions": {
    "Schema": {
      "$id": "#/properties/Schema",
      "type": "object",
      "title": "Schema",
      "required": [
      ],
      "properties": {
        "name": {
          "type": "string"
        },
        "description": {
          "type": "string"
        },
        "schema": {
          "type": "string"
        },
        "status": {
          "type": "string",
          "enum": ["DRAFT", "PUBLISHED"],
          "default": "DRAFT"
        }
      }
    }
  }
}
```

You can find more schema files in the `_schemas` folder in the Sunbird RC repository [here](https://github.com/Sunbird-RC/sunbird-rc-core/tree/main/java/registry/src/main/resources/internal/_schemas).

---



## 9. How to get all uploaded files?

To get all uploaded files, you can use the `_getFilesDataArray` function from the `FileAPI.min.js` file. This function is used to get an array of file data objects from the provided input. Here's the relevant code snippet:

```javascript
_getFilesDataArray: function(b) {
  var d = [],
    a = {};
  if (L.test(b && b.tagName)) {
    var c = h.getFiles(b);
    a[b.name || "file"] = null !== b.getAttribute("multiple") ? c : c[0];
  } else l(b) && L.test(b[0] && b[0].tagName) ? g(b, function(b) {
    a[b.name || "file"] = h.getFiles(b);
  }) : a = b;
  g(a, function B(b, a) {
    l(b) ? g(b, function(b) {
      B(b, a);
    }) : b && b.name && d.push({
      name: a,
      file: b,
      size: b.size,
      total: b.size,
      loaded: 0
    });
  });
  d.length || d.push({
    file: {
      name: h.expando
    }
  });
  return d;
},
```

To use this function, you need to provide an input element containing the uploaded files. The function will return an array of file data objects.

Note: This code is part of the `FileAPI.min.js` file in the repository. [deps/keycloak/themes/keycloak/common/resources/lib/fileupload/FileAPI.min.js](https://github.com/Sunbird-RC/sunbird-rc-core/blob/main/deps/keycloak/themes/keycloak/common/resources/lib/fileupload/FileAPI.min.js)

---



## 10. What is Sunbird RC?

Sunbird RC is an open-source software framework for rapidly building electronic registries, enabling attestation capabilities, and building verifiable credentialing with minimal effort. It allows data owners to provide authorized access to other users/entities in a controlled manner for digital verification and usage. The framework consists of various components, such as controller classes for providing a clean and organized API, and a core component like `FrameContext.java` for managing the context of a frame in the registry [sunbird-rc-core/java/registry/src/main/java/dev/sunbirdrc/registry/frame](https://github.com/Sunbird-RC/sunbird-rc-core/blob/main/java/registry/src/main/java/dev/sunbirdrc/registry/frame/README.md).

---



## 11. What are the benefits of electronic registries?

Electronic registries provide several benefits, such as:

1. They enable authorized data repositories to publish data and metadata about a user or entity in a digitally signed form. This ensures the authenticity and integrity of the data stored in the registry [README.md](https://github.com/Sunbird-RC/sunbird-rc-core/blob/main/README.md).

2. Electronic registries allow data owners to provide authorized access to other users or entities in a controlled manner for digital verification and usage [README.md](https://github.com/Sunbird-RC/sunbird-rc-core/blob/main/README.md).

3. They offer APIs for creating, updating, deleting, and querying entities in the registry, making it easy to manage and access the data [what is sunbird rc_.md](https://github.com/Sunbird-RC/sunbird-rc-core/blob/main/questions/what%20is%20sunbird%20rc_.md).

4. Electronic registries support extensible plugins and integrations with external systems and services, allowing for seamless connections with various platforms [what is sunbird rc_.md](https://github.com/Sunbird-RC/sunbird-rc-core/blob/main/questions/what%20is%20sunbird%20rc_.md).

5. They ensure data validity by checking for required fields and verifying the data before adding the entity to the registry [README.md (consumers)](https://github.com/Sunbird-RC/sunbird-rc-core/blob/main/java/registry/src/main/java/dev/sunbirdrc/registry/consumers/README.md).

6. Electronic registries facilitate easy search and retrieval of specific entities by indexing the data stored in the registry [README.md (model)](https://github.com/Sunbird-RC/sunbird-rc-core/blob/main/java/registry/src/main/java/dev/sunbirdrc/registry/model/README.md).

---



## 12. What are the key roles in Verifiable Credentials?

In Verifiable Credentials, the key roles are:

1. Issuer: The entity that creates and issues the verifiable credential to the user or entity.
2. Holder: The user or entity that holds the verifiable credential and presents it when required.
3. Verifier: The entity that verifies the authenticity of the verifiable credential.

These roles interact with each other to create, hold, and verify credentials in a secure and trusted manner. In Sunbird RC, the `VerificationRequest` class represents a request to verify signed credentials, which is used when a user or entity wants to verify the authenticity of the credentials they have received [java/registry/src/main/java/dev/sunbirdrc/registry/entities/README.md](https://github.com/Sunbird-RC/sunbird-rc-core/blob/main/java/registry/src/main/java/dev/sunbirdrc/registry/entities/README.md).

---


## 13. What are digital credentials vs verifiable credentials?

Digital credentials are electronic documents or data that provide information about a user or entity, such as their identity, qualifications, or achievements. They are used to prove the authenticity and validity of the information they contain.

Verifiable credentials, on the other hand, are a type of digital credentials that come with additional security features, such as digital signatures and cryptographic operations. These features ensure the integrity and authenticity of the data contained within the credential, making it more difficult to forge or tamper with. In the Sunbird RC framework, the `VerificationRequest` class represents a request to verify signed credentials, which is used when a user or entity wants to verify the authenticity of the credentials they have received [java/registry/src/main/java/dev/sunbirdrc/registry/entities/README.md](https://github.com/Sunbird-RC/sunbird-rc-core/blob/main/java/registry/src/main/java/dev/sunbirdrc/registry/entities/README.md).

Sunbird RC enables users to build electronic registries, attestation capabilities, and verifiable credentialing with minimal effort [README.md](https://github.com/Sunbird-RC/sunbird-rc-core/blob/main/README.md).

---


## 14. What are attestation workflows?

Attestation workflows are processes involved in verifying and confirming the authenticity of data or information in a registry. There are two types of attestation available in the Sunbird RC system: Manual and Automated. Manual attestation requires human intervention to verify and attest the data, while Automated attestation uses algorithms and predefined rules to verify and attest the data [AttestationType.java](https://github.com/Sunbird-RC/sunbird-rc-core/blob/main/java/registry/src/main/java/dev/sunbirdrc/registry/entities/AttestationType.java).

The attestation process in Sunbird RC involves components like Attestor Plugins, which help in the attestation process [AttestorPluginType.java](https://github.com/Sunbird-RC/sunbird-rc-core/blob/main/java/registry/src/main/java/dev/sunbirdrc/registry/entities/README.md). Attestation workflows also include handling attestation requests, which are used when a user or entity wants to attest or verify the data in a registry [AttestationRequest.md](https://github.com/Sunbird-RC/sunbird-rc-core/blob/main/java/registry/src/main/java/dev/sunbirdrc/registry/model/dto/README.md).

The attestation package in the registry model contains Java classes that define the attestation process, like `AttestationPath.java` for defining the attestation path and `EntityPropertyURI.java` for managing property URIs [attestation/](https://github.com/Sunbird-RC/sunbird-rc-core/blob/main/java/registry/src/main/java/dev/sunbirdrc/registry/model/README.md).

---



## 15. How to upload a file?

To upload a file using Sunbird RC, you can use the AngularJS file upload directive provided in the `angular-file-upload.js` file. Here's how you can do it:

1. Include the `angular-file-upload.js` script in your HTML file.
2. Add the 'angularFileUpload' module as a dependency to your AngularJS application.

```javascript
var myApp = angular.module('myApp', ['angularFileUpload']);
```

3. Use the `$upload` service to upload the file. You can do this by injecting the `$upload` service into your controller and calling the `upload()` method with the necessary configuration.

```javascript
myApp.controller('MyController', ['$scope', '$upload', function($scope, $upload) {
  $scope.onFileSelect = function($files) {
    for (var i = 0; i < $files.length; i++) {
      var file = $files[i];
      $upload.upload({
        url: 'your/upload/url', // The URL to upload the file to
        file: file
      }).progress(function(evt) {
        console.log('percent: ' + parseInt(100.0 * evt.loaded / evt.total));
      }).success(function(data, status, headers, config) {
        console.log('file uploaded successfully');
      });
    }
  };
}]);
```

4. Add the `ng-file-select` directive to your file input element in your HTML file.

```html
<input type="file" ng-file-select="onFileSelect($files)" multiple>
```

This will upload the selected file(s) to the specified URL when the user selects a file. You can also handle the progress and success events as shown in the example.

For more information, refer to the [angular-file-upload.js](https://github.com/Sunbird-RC/sunbird-rc-core/blob/main/deps/keycloak/themes/keycloak/common/resources/lib/fileupload/angular-file-upload.js) file.

---



## 16. What is the contribution guidebook?

The contribution guidebook for the `registry-cli` can be found in the `contributing.md` file. You can contribute in the following ways:

1. Reporting bugs
2. Improving documentation
3. Fixing bugs
4. Adding new features

To report bugs, open an issue using the `Bug Report` template [here](https://github.com/sunbird-rc/community/issues/new/choose). For improving documentation, edit the markdown files in the `docs` directory of the repository. To fix bugs or add new features, work with the CLI, which is written in TypeScript.

For more details, refer to the [contributing.md](https://github.com/Sunbird-RC/sunbird-rc-core/blob/main/tools/cli/contributing.md) file.

---



## 17. What is the education section about?

The education section is about improving the education system, identifying skills and demand for the country's future, and helping create self-sustaining, self-run communities. The platform aims to provide access to learning opportunities for every child and reimagine learning opportunities for them.

Relevant code blocks:

1. [ui-sample/alpacaJs/lang/stringData-en.json](https://github.com/Sunbird-RC/sunbird-rc-core/blob/main/ui-sample/alpacaJs/lang/stringData-en.json)
2. [ui-sample/angular-ui/src/app/components/landingpage/landingpage.component.html](https://github.com/Sunbird-RC/sunbird-rc-core/blob/main/ui-sample/angular-ui/src/app/components/landingpage/landingpage.component.html)
3. [ui-sample/alpacaJs/home.html](https://github.com/Sunbird-RC/sunbird-rc-core/blob/main/ui-sample/alpacaJs/home.html)


---

## 18. How to create a middleware?

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


---

## 19. How to create a registry?

To create a registry using Sunbird RC, follow these steps:

1. **Clone the Sunbird RC repository**: Clone the [Sunbird RC Github repository](https://github.com/Sunbird-RC/sunbird-rc-core) to your local machine by running the following command:

```sh
$ git clone https://github.com/Sunbird-RC/sunbird-rc-core.git
```

2. **Install dependencies**: Navigate to the `sunbird-rc-core` directory and install the required dependencies. For example, if you are using Maven, run:

```sh
$ cd sunbird-rc-core
$ mvn clean install
```

3. **Configure the registry**: Configure the registry by updating the configuration files located in the `src/main/resources` directory. You may need to set up database connections, authentication settings, and other configurations specific to your use case.

4. **Run the application**: Run the Sunbird RC application using your preferred method (e.g., running it as a standalone Java application or deploying it to a web server like Tomcat).

5. **Interact with the registry**: You can interact with the registry using the provided APIs or by using the [Registry CLI](https://github.com/Sunbird-RC/sunbird-rc-core/blob/main/tools/cli/readme.md). The CLI allows you to create and manage registry instances, entities, and relationships.

Here's an example of how to use the Registry CLI:

```sh
$ cd sunbird-rc/core/tools/cli
```

Then, follow the [getting started guide](https://docs.sunbirdrc.dev/developer-documentation/installation-guide) to learn how to use the CLI.

By following these steps, you can create and manage a registry using the Sunbird RC framework. For more information and detailed instructions, refer to the [Sunbird RC documentation](https://docs.sunbirdrc.dev/).

---


## 20. What is a DAO?

A DAO (Data Access Object) is a design pattern in software development that provides an abstraction layer for accessing and manipulating data from various data sources, such as databases, file systems, or API endpoints. It is used to separate the application's data access logic from the business logic, making the code more modular and easier to maintain.

In the context of the Sunbird RC framework, a DAO would be responsible for handling data access and manipulation for specific entities, such as users, organizations, or credentials. It would provide methods for creating, updating, deleting, and retrieving these entities from the underlying data source.

The provided code blocks do not contain a specific example of a DAO class, but you can create one by following these general steps:

1. Define an interface for the DAO:

```java
public interface EntityDao {
    Entity create(Entity entity);
    Entity update(Entity entity);
    Entity delete(String id);
    Entity getById(String id);
    List<Entity> getAll();
}
```

2. Implement the interface for a specific data source:

Create a class that implements the `EntityDao` interface and provides the necessary logic for accessing and manipulating data from the specific data source. For example, if you want to implement a DAO that works with a relational database:

```java
public class EntityDaoImpl implements EntityDao {
    // Implementation for accessing and manipulating data from a relational database
}
```

3. Use the DAO in your application:

In your application, use the DAO to handle data access and manipulation for the specific entity. This will help keep your application code modular and maintainable.

```java
public class MyApplication {
    private EntityDao entityDao;

    public MyApplication(EntityDao entityDao) {
        this.entityDao = entityDao;
    }

    // Use the entityDao to access and manipulate data
}
```

By using a DAO, you can separate the data access logic from the business logic in your application, making it easier to maintain and update as needed.

---

## 21. What is a sunbird actor?

A Sunbird actor is a specialized class in the Sunbird RC framework that extends the `BaseActor` class and is responsible for handling specific tasks within the system. Actors are used to process incoming messages and perform operations in a concurrent and distributed manner.

In the provided code blocks, the `OSActor` class is an example of a Sunbird actor. It extends the `BaseActor` class and overrides the `onReceive` method to handle incoming messages:

```java
public class OSActor extends BaseActor {
    private boolean elasticSearchEnabled;
    public ObjectMapper objectMapper;

    @Override
    protected void onReceive(MessageProtos.Message message) throws Throwable {
        // ...
    }
}
```

The `onReceive` method is responsible for processing the incoming messages and performing the required actions. In the case of the `OSActor`, it processes the `OSEvent` and sends messages to Elasticsearch if enabled.

To create a Sunbird actor, you need to extend the `BaseActor` class and override the `onReceive` method to handle the specific tasks you want the actor to perform. You can also override other methods like `onSuccess` and `onFailure` if needed.

For example, if you want to create a new actor to handle document uploads, you can create a class like this:

```java
public class DocumentUploadActor extends BaseActor {
    @Override
    public void onReceive(MessageProtos.Message request) throws Throwable {
        // Handle document upload requests here
    }
}
```

Then, implement the logic for handling document uploads inside the `onReceive` method.

You can find more examples of Sunbird actors in the provided code blocks, such as the `Indexer` class and the `DocumentUploadActor` class in the `plugins/sample-external-plugin-2` directory.

---

## 22. What is an entity in sunbird-rc?


An entity in Sunbird RC is a representation of a real-world object or concept, such as a person, organization, or credential. Entities in Sunbird RC are stored in the registry and can have attributes, relationships, and metadata associated with them. They can be created, updated, and retrieved using the provided APIs and tools.

Entities in Sunbird RC are represented by the `EntityDto` class, which can be found in the [EntityDto.java](https://github.com/Sunbird-RC/sunbird-rc-core/blob/main/java/registry/src/main/java/dev/sunbirdrc/registry/model/dto/EntityDto.java) file:

```java
package dev.sunbirdrc.registry.model.dto;

public class EntityDto {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
```

This class provides a simple data structure for storing an entity's ID. In practice, entities can have additional attributes, relationships, and metadata depending on the specific use case and registry configuration.

---

## 23. What is sunbird rc?


Sunbird RC (Registry Core) is an open-source software framework for rapidly building electronic registries, enabling attestation capabilities, and building verifiable credentialing with minimal effort. It provides a shared digital infrastructure that allows authorized data repositories to publish appropriate data and metadata about a user or entity, along with a link to the repository, in a digitally signed form. Sunbird RC enables data owners to provide authorized access to other users or entities in a controlled manner for digital verification and usage.

The Sunbird RC framework is designed to be modular and extensible, allowing developers to create custom plugins and integrations for various use cases. It provides a set of core components and APIs for building electronic registries, managing attestations, and generating verifiable credentials. Some key features of Sunbird RC include:

1. A flexible data model for defining and storing entities and their relationships.
2. Support for digital signatures and cryptographic operations to ensure data integrity and authenticity.
3. APIs for creating, updating, deleting, and querying entities in the registry.
4. Support for extensible plugins and integrations with external systems and services.
5. A sample UI for demonstrating the capabilities of the Sunbird RC APIs.

You can find more information and resources related to Sunbird RC in the [sunbird-rc-core Github repository](https://github.com/Sunbird-RC/sunbird-rc-core).