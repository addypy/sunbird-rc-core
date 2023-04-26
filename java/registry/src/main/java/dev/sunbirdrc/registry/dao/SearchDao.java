package dev.sunbirdrc.registry.dao;

import com.fasterxml.jackson.databind.JsonNode;
import dev.sunbirdrc.pojos.SearchQuery;
import org.apache.tinkerpop.gremlin.structure.Graph;

/**
 * SearchDao interface provides a method for searching entities in the graph database.
 */
public interface SearchDao {

    /**
     * Searches for entities in the graph database based on the provided search query.
     *
     * @param graphFromStore The graph database instance to perform the search on.
     * @param searchQuery    The search query containing the search criteria.
     * @param expandInternal A boolean flag to indicate whether to expand internal properties or not.
     * @return A JsonNode containing the search results.
     */
    JsonNode search(Graph graphFromStore, SearchQuery searchQuery, boolean expandInternal);
}