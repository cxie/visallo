package org.visallo.web.clientapi.codegen;

import org.json.JSONObject;
import org.visallo.web.clientapi.CategoryBase;
import org.visallo.web.clientapi.VisalloApi;
import org.visallo.web.clientapi.model.*;
import org.visallo.web.clientapi.util.*;

import java.util.ArrayList;
import java.util.List;
import java.io.InputStream;

public abstract class EdgeBase extends CategoryBase {
    public EdgeBase(VisalloApi visalloApi) {
        super(visalloApi);
    }

    /**
     * @param graphEdgeId REQUIRED
     * @param propertyKey REQUIRED
     * @param propertyName REQUIRED
     * @param startTime OPTIONAL
     * @param endTime OPTIONAL
     */
    public ClientApiHistoricalPropertyValues getPropertyHistory(
        @Required(name = "graphEdgeId") String graphEdgeId,
        @Required(name = "propertyKey") String propertyKey,
        @Required(name = "propertyName") String propertyName,
        @Optional(name = "startTime") Long startTime,
        @Optional(name = "endTime") Long endTime
    ) {
        List<VisalloApiBase.Parameter> parameters = new ArrayList<VisalloApiBase.Parameter>();
        parameters.add(new VisalloApiBase.Parameter("graphEdgeId", graphEdgeId));
        parameters.add(new VisalloApiBase.Parameter("propertyKey", propertyKey));
        parameters.add(new VisalloApiBase.Parameter("propertyName", propertyName));
        parameters.add(new VisalloApiBase.Parameter("startTime", startTime));
        parameters.add(new VisalloApiBase.Parameter("endTime", endTime));
        return getVisalloApi().execute("GET", "/edge/property/history", parameters, ClientApiHistoricalPropertyValues.class);
    }

    /**
     * @param edgeIds REQUIRED
     */
    public ClientApiEdgesExistsResponse getExists(
        @Required(name = "edgeIds[]") String[] edgeIds
    ) {
        List<VisalloApiBase.Parameter> parameters = new ArrayList<VisalloApiBase.Parameter>();
        parameters.add(new VisalloApiBase.Parameter("edgeIds[]", edgeIds));
        return getVisalloApi().execute("GET", "/edge/exists", parameters, ClientApiEdgesExistsResponse.class);
    }

    /**
     * @param graphEdgeId REQUIRED
     */
    public ClientApiEdge getProperties(
        @Required(name = "graphEdgeId") String graphEdgeId
    ) {
        List<VisalloApiBase.Parameter> parameters = new ArrayList<VisalloApiBase.Parameter>();
        parameters.add(new VisalloApiBase.Parameter("graphEdgeId", graphEdgeId));
        return getVisalloApi().execute("GET", "/edge/properties", parameters, ClientApiEdge.class);
    }

    /**
     * @param edgeId REQUIRED
     * @param propertyKey OPTIONAL
     * @param propertyName REQUIRED
     * @param visibilitySource REQUIRED
     */
    public ClientApiEdgePropertyDetails getPropertyDetails(
        @Required(name = "edgeId") String edgeId,
        @Optional(name = "propertyKey") String propertyKey,
        @Required(name = "propertyName") String propertyName,
        @Required(name = "visibilitySource") String visibilitySource
    ) {
        List<VisalloApiBase.Parameter> parameters = new ArrayList<VisalloApiBase.Parameter>();
        parameters.add(new VisalloApiBase.Parameter("edgeId", edgeId));
        parameters.add(new VisalloApiBase.Parameter("propertyKey", propertyKey));
        parameters.add(new VisalloApiBase.Parameter("propertyName", propertyName));
        parameters.add(new VisalloApiBase.Parameter("visibilitySource", visibilitySource));
        return getVisalloApi().execute("GET", "/edge/property/details", parameters, ClientApiEdgePropertyDetails.class);
    }

    /**
     * @param edgeId REQUIRED
     */
    public ClientApiEdgeDetails getDetails(
        @Required(name = "edgeId") String edgeId
    ) {
        List<VisalloApiBase.Parameter> parameters = new ArrayList<VisalloApiBase.Parameter>();
        parameters.add(new VisalloApiBase.Parameter("edgeId", edgeId));
        return getVisalloApi().execute("GET", "/edge/details", parameters, ClientApiEdgeDetails.class);
    }

    /**
     */
    public ClientApiVertexCount getCount(
        
    ) {
        List<VisalloApiBase.Parameter> parameters = new ArrayList<VisalloApiBase.Parameter>();
        return getVisalloApi().execute("GET", "/edge/count", parameters, ClientApiVertexCount.class);
    }

    /**
     */
    public ClientApiElementSearchResponse getSearch(
        
    ) {
        List<VisalloApiBase.Parameter> parameters = new ArrayList<VisalloApiBase.Parameter>();
        return getVisalloApi().execute("GET", "/edge/search", parameters, ClientApiElementSearchResponse.class);
    }

    /**
     * @param edgeId REQUIRED
     * @param propertyKey OPTIONAL
     * @param propertyName REQUIRED
     * @param value REQUIRED
     * @param visibilitySource REQUIRED
     * @param sourceInfo OPTIONAL
     * @param metadata OPTIONAL
     * @param justificationText OPTIONAL
     */
    public void postProperty(
        @Required(name = "edgeId") String edgeId,
        @Optional(name = "propertyKey") String propertyKey,
        @Required(name = "propertyName") String propertyName,
        @Required(name = "value") String value,
        @Required(name = "visibilitySource") String visibilitySource,
        @Optional(name = "sourceInfo") String sourceInfo,
        @Optional(name = "metadata") String metadata,
        @Optional(name = "justificationText") String justificationText
    ) {
        List<VisalloApiBase.Parameter> parameters = new ArrayList<VisalloApiBase.Parameter>();
        parameters.add(new VisalloApiBase.Parameter("edgeId", edgeId));
        parameters.add(new VisalloApiBase.Parameter("propertyKey", propertyKey));
        parameters.add(new VisalloApiBase.Parameter("propertyName", propertyName));
        parameters.add(new VisalloApiBase.Parameter("value", value));
        parameters.add(new VisalloApiBase.Parameter("visibilitySource", visibilitySource));
        parameters.add(new VisalloApiBase.Parameter("sourceInfo", sourceInfo));
        parameters.add(new VisalloApiBase.Parameter("metadata", metadata));
        parameters.add(new VisalloApiBase.Parameter("justificationText", justificationText));
        getVisalloApi().execute("POST", "/edge/property", parameters, null);
    }

    /**
     * @param edgeId REQUIRED
     * @param propertyKey OPTIONAL
     * @param propertyName REQUIRED
     * @param value REQUIRED
     * @param visibilitySource REQUIRED
     * @param sourceInfo OPTIONAL
     * @param metadata OPTIONAL
     * @param justificationText OPTIONAL
     */
    public void postComment(
        @Required(name = "edgeId") String edgeId,
        @Optional(name = "propertyKey") String propertyKey,
        @Required(name = "propertyName") String propertyName,
        @Required(name = "value") String value,
        @Required(name = "visibilitySource") String visibilitySource,
        @Optional(name = "sourceInfo") String sourceInfo,
        @Optional(name = "metadata") String metadata,
        @Optional(name = "justificationText") String justificationText
    ) {
        List<VisalloApiBase.Parameter> parameters = new ArrayList<VisalloApiBase.Parameter>();
        parameters.add(new VisalloApiBase.Parameter("edgeId", edgeId));
        parameters.add(new VisalloApiBase.Parameter("propertyKey", propertyKey));
        parameters.add(new VisalloApiBase.Parameter("propertyName", propertyName));
        parameters.add(new VisalloApiBase.Parameter("value", value));
        parameters.add(new VisalloApiBase.Parameter("visibilitySource", visibilitySource));
        parameters.add(new VisalloApiBase.Parameter("sourceInfo", sourceInfo));
        parameters.add(new VisalloApiBase.Parameter("metadata", metadata));
        parameters.add(new VisalloApiBase.Parameter("justificationText", justificationText));
        getVisalloApi().execute("POST", "/edge/comment", parameters, null);
    }

    /**
     * @param edgeIds REQUIRED
     */
    public ClientApiEdgesExistsResponse postExists(
        @Required(name = "edgeIds[]") String[] edgeIds
    ) {
        List<VisalloApiBase.Parameter> parameters = new ArrayList<VisalloApiBase.Parameter>();
        parameters.add(new VisalloApiBase.Parameter("edgeIds[]", edgeIds));
        return getVisalloApi().execute("POST", "/edge/exists", parameters, ClientApiEdgesExistsResponse.class);
    }

    /**
     * @param edgeIds REQUIRED
     */
    public ClientApiEdgeMultipleResponse postMultiple(
        @Required(name = "edgeIds[]") String[] edgeIds
    ) {
        List<VisalloApiBase.Parameter> parameters = new ArrayList<VisalloApiBase.Parameter>();
        parameters.add(new VisalloApiBase.Parameter("edgeIds[]", edgeIds));
        return getVisalloApi().execute("POST", "/edge/multiple", parameters, ClientApiEdgeMultipleResponse.class);
    }

    /**
     * @param edgeId OPTIONAL
     * @param outVertexId REQUIRED
     * @param inVertexId REQUIRED
     * @param predicateLabel REQUIRED
     * @param visibilitySource REQUIRED
     * @param justificationText OPTIONAL
     */
    public ClientApiElement postCreate(
        @Optional(name = "edgeId") String edgeId,
        @Required(name = "outVertexId") String outVertexId,
        @Required(name = "inVertexId") String inVertexId,
        @Required(name = "predicateLabel") String predicateLabel,
        @Required(name = "visibilitySource") String visibilitySource,
        @Optional(name = "justificationText") String justificationText
    ) {
        List<VisalloApiBase.Parameter> parameters = new ArrayList<VisalloApiBase.Parameter>();
        parameters.add(new VisalloApiBase.Parameter("edgeId", edgeId));
        parameters.add(new VisalloApiBase.Parameter("outVertexId", outVertexId));
        parameters.add(new VisalloApiBase.Parameter("inVertexId", inVertexId));
        parameters.add(new VisalloApiBase.Parameter("predicateLabel", predicateLabel));
        parameters.add(new VisalloApiBase.Parameter("visibilitySource", visibilitySource));
        parameters.add(new VisalloApiBase.Parameter("justificationText", justificationText));
        return getVisalloApi().execute("POST", "/edge/create", parameters, ClientApiElement.class);
    }

    /**
     * @param graphEdgeId REQUIRED
     * @param visibilitySource REQUIRED
     */
    public ClientApiElement postVisibility(
        @Required(name = "graphEdgeId") String graphEdgeId,
        @Required(name = "visibilitySource") String visibilitySource
    ) {
        List<VisalloApiBase.Parameter> parameters = new ArrayList<VisalloApiBase.Parameter>();
        parameters.add(new VisalloApiBase.Parameter("graphEdgeId", graphEdgeId));
        parameters.add(new VisalloApiBase.Parameter("visibilitySource", visibilitySource));
        return getVisalloApi().execute("POST", "/edge/visibility", parameters, ClientApiElement.class);
    }

    /**
     */
    public ClientApiElementSearchResponse postSearch(
        
    ) {
        List<VisalloApiBase.Parameter> parameters = new ArrayList<VisalloApiBase.Parameter>();
        return getVisalloApi().execute("POST", "/edge/search", parameters, ClientApiElementSearchResponse.class);
    }

    /**
     * @param edgeId REQUIRED
     */
    public void delete(
        @Required(name = "edgeId") String edgeId
    ) {
        List<VisalloApiBase.Parameter> parameters = new ArrayList<VisalloApiBase.Parameter>();
        parameters.add(new VisalloApiBase.Parameter("edgeId", edgeId));
        getVisalloApi().execute("DELETE", "/edge", parameters, null);
    }

    /**
     * @param edgeId REQUIRED
     * @param propertyKey REQUIRED
     * @param propertyName REQUIRED
     */
    public void deleteProperty(
        @Required(name = "edgeId") String edgeId,
        @Required(name = "propertyKey") String propertyKey,
        @Required(name = "propertyName") String propertyName
    ) {
        List<VisalloApiBase.Parameter> parameters = new ArrayList<VisalloApiBase.Parameter>();
        parameters.add(new VisalloApiBase.Parameter("edgeId", edgeId));
        parameters.add(new VisalloApiBase.Parameter("propertyKey", propertyKey));
        parameters.add(new VisalloApiBase.Parameter("propertyName", propertyName));
        getVisalloApi().execute("DELETE", "/edge/property", parameters, null);
    }

}