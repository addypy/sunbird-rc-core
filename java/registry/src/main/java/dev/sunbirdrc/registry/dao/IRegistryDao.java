package dev.sunbirdrc.registry.dao;

import com.fasterxml.jackson.databind.JsonNode;
import dev.sunbirdrc.registry.util.ReadConfigurator;
import org.apache.tinkerpop.gremlin.structure.Graph;
import org.apache.tinkerpop.gremlin.structure.Vertex;

// Interface for the Registry Data Access Object (DAO) which defines the methods for interacting with the registry data
public interface IRegistryDao {
    // Method to add a new entity to the graph database
    String addEntity(Graph graph, JsonNode rootNode);

    // Method to retrieve an entity from the graph database using its entityType and uuid
    JsonNode getEntity(Graph graph, String entityType, String uuid, ReadConfigurator readConfigurator) throws Exception;

    // Method to retrieve an entity from the graph database using its vertex, with options to expand internal properties
    JsonNode getEntity(Graph graph, Vertex vertex, ReadConfigurator readConfigurator, boolean expandInternal) throws Exception;

    // Method to update an existing vertex in the graph database with new data from inputJsonNode
    void updateVertex(Graph graph, Vertex rootVertex, JsonNode inputJsonNode, String parentName) throws Exception;

    // Method to delete an entity from the graph database using its vertex
    void deleteEntity(Vertex uuid);
}