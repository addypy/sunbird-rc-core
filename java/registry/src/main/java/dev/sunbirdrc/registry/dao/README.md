# sunbird-rc-core/java/registry/src/main/java/dev/sunbirdrc/registry/dao

This directory contains the Data Access Object (DAO) classes and interfaces for the Sunbird RC Core registry. These classes are responsible for reading and writing data to and from the graph database used to store registry information.

## IRegistryDao.java

`IRegistryDao.java` is an interface that defines the basic operations for interacting with the Sunbird RC registry's graph database. This includes methods for adding, updating, and searching for entities in the database. Classes that implement this interface are responsible for providing the actual implementation of these operations.

## NotFoundException.java

`NotFoundException.java` is a custom exception class for handling "Not Found" scenarios in the Sunbird RC application. It is used when a record of a specific entity type and unique identifier (osid) is not found in the system. For more details, refer to the provided [description](#notfoundexceptionjava).

## RegistryDaoImpl.java

`RegistryDaoImpl.java` is a class that implements the `IRegistryDao` interface, providing the actual implementation of the operations for interacting with the Sunbird RC registry's graph database. This includes methods for adding, updating, and searching for entities in the database.

## SearchDao.java

`SearchDao.java` is an interface that provides a method for searching entities in a graph database. For more details and an example, refer to the provided [description](#searchdaojava).

## SearchDaoImpl.java

`SearchDaoImpl.java` is a class that implements the `SearchDao` interface, providing the actual implementation of the `search` method for searching entities in a graph database.

## ValueType.java

`ValueType.java` is an enum class that represents the different value types that can be stored in the Sunbird RC registry's graph database. This includes types such as `String`, `Integer`, `Boolean`, `Date`, `DateTime`, `Time`, `List`, `Map`, and `Json`.

## VertexReader.java

`VertexReader.java` is a class responsible for reading and converting graph vertices from the graph database into Java objects. It provides methods for reading vertices and their properties, as well as for converting property values into the appropriate Java type.

## VertexWriter.java

`VertexWriter.java` is a class responsible for writing Java objects to the graph database as graph vertices. It provides methods for creating new vertices, updating existing vertices, and setting vertex properties with the appropriate value type.