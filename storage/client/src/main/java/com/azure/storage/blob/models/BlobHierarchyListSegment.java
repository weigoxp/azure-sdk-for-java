/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.azure.storage.blob.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * The BlobHierarchyListSegment model.
 */
@JacksonXmlRootElement(localName = "Blobs")
public final class BlobHierarchyListSegment {
    /**
     * The blobPrefixes property.
     */
    @JsonProperty("BlobPrefix")
    private List<BlobPrefix> blobPrefixes = new ArrayList<>();

    /**
     * The blobItems property.
     */
    @JsonProperty("Blob")
    private List<BlobItem> blobItems = new ArrayList<>();

    /**
     * Get the blobPrefixes property: The blobPrefixes property.
     *
     * @return the blobPrefixes value.
     */
    public List<BlobPrefix> blobPrefixes() {
        return this.blobPrefixes;
    }

    /**
     * Set the blobPrefixes property: The blobPrefixes property.
     *
     * @param blobPrefixes the blobPrefixes value to set.
     * @return the BlobHierarchyListSegment object itself.
     */
    public BlobHierarchyListSegment withBlobPrefixes(List<BlobPrefix> blobPrefixes) {
        this.blobPrefixes = blobPrefixes;
        return this;
    }

    /**
     * Get the blobItems property: The blobItems property.
     *
     * @return the blobItems value.
     */
    public List<BlobItem> blobItems() {
        return this.blobItems;
    }

    /**
     * Set the blobItems property: The blobItems property.
     *
     * @param blobItems the blobItems value to set.
     * @return the BlobHierarchyListSegment object itself.
     */
    public BlobHierarchyListSegment withBlobItems(List<BlobItem> blobItems) {
        this.blobItems = blobItems;
        return this;
    }
}
