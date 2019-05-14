/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.azure.storage.blob;

import com.azure.storage.blob.models.AccessTier;
import com.azure.storage.blob.models.BlobHTTPHeaders;
import com.azure.storage.blob.models.BlobsAbortCopyFromURLResponse;
import com.azure.storage.blob.models.BlobsAcquireLeaseResponse;
import com.azure.storage.blob.models.BlobsBreakLeaseResponse;
import com.azure.storage.blob.models.BlobsChangeLeaseResponse;
import com.azure.storage.blob.models.BlobsCreateSnapshotResponse;
import com.azure.storage.blob.models.BlobsDeleteResponse;
import com.azure.storage.blob.models.BlobsDownloadResponse;
import com.azure.storage.blob.models.BlobsGetAccountInfoResponse;
import com.azure.storage.blob.models.BlobsGetPropertiesResponse;
import com.azure.storage.blob.models.BlobsReleaseLeaseResponse;
import com.azure.storage.blob.models.BlobsRenewLeaseResponse;
import com.azure.storage.blob.models.BlobsSetHTTPHeadersResponse;
import com.azure.storage.blob.models.BlobsSetMetadataResponse;
import com.azure.storage.blob.models.BlobsSetTierResponse;
import com.azure.storage.blob.models.BlobsStartCopyFromURLResponse;
import com.azure.storage.blob.models.BlobsUndeleteResponse;
import com.azure.storage.blob.models.DeleteSnapshotsOptionType;
import com.azure.storage.blob.models.LeaseAccessConditions;
import com.azure.storage.blob.models.ModifiedAccessConditions;
import com.azure.storage.blob.models.SourceModifiedAccessConditions;
import com.azure.storage.blob.models.StorageErrorException;
import java.net.URL;
import java.util.Map;
import reactor.core.publisher.Mono;
import reactor.util.annotation.NonNull;

/**
 * An instance of this class provides access to all the operations defined in
 * Blobs.
 */
public interface Blobs {
    /**
     * The Download operation reads or downloads a blob from the system, including its metadata and properties. You can also call Download to read a snapshot.
     *
     * @param containerName The container name.
     * @param blob The blob name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<BlobsDownloadResponse> downloadWithRestResponseAsync(@NonNull String containerName, @NonNull String blob);

    /**
     * The Download operation reads or downloads a blob from the system, including its metadata and properties. You can also call Download to read a snapshot.
     *
     * @param containerName The container name.
     * @param blob The blob name.
     * @param snapshot The snapshot parameter is an opaque DateTime value that, when present, specifies the blob snapshot to retrieve. For more information on working with blob snapshots, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/creating-a-snapshot-of-a-blob"&gt;Creating a Snapshot of a Blob.&lt;/a&gt;.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param range Return only the bytes of the blob in the specified range.
     * @param rangeGetContentMD5 When set to true and specified together with the Range, the service returns the MD5 hash for the range, as long as the range is less than or equal to 4 MB in size.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @param leaseAccessConditions Additional parameters for the operation.
     * @param modifiedAccessConditions Additional parameters for the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<BlobsDownloadResponse> downloadWithRestResponseAsync(@NonNull String containerName, @NonNull String blob, String snapshot, Integer timeout, String range, Boolean rangeGetContentMD5, String requestId, LeaseAccessConditions leaseAccessConditions, ModifiedAccessConditions modifiedAccessConditions);

    /**
     * The Get Properties operation returns all user-defined metadata, standard HTTP properties, and system properties for the blob. It does not return the content of the blob.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<BlobsGetPropertiesResponse> getPropertiesWithRestResponseAsync();

    /**
     * The Get Properties operation returns all user-defined metadata, standard HTTP properties, and system properties for the blob. It does not return the content of the blob.
     *
     * @param snapshot The snapshot parameter is an opaque DateTime value that, when present, specifies the blob snapshot to retrieve. For more information on working with blob snapshots, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/creating-a-snapshot-of-a-blob"&gt;Creating a Snapshot of a Blob.&lt;/a&gt;.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @param leaseAccessConditions Additional parameters for the operation.
     * @param modifiedAccessConditions Additional parameters for the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<BlobsGetPropertiesResponse> getPropertiesWithRestResponseAsync(String snapshot, Integer timeout, String requestId, LeaseAccessConditions leaseAccessConditions, ModifiedAccessConditions modifiedAccessConditions);

    /**
     * If the storage account's soft delete feature is disabled then, when a blob is deleted, it is permanently removed from the storage account. If the storage account's soft delete feature is enabled, then, when a blob is deleted, it is marked for deletion and becomes inaccessible immediately. However, the blob service retains the blob or snapshot for the number of days specified by the DeleteRetentionPolicy section of [Storage service properties] (Set-Blob-Service-Properties.md). After the specified number of days has passed, the blob's data is permanently removed from the storage account. Note that you continue to be charged for the soft-deleted blob's storage until it is permanently removed. Use the List Blobs API and specify the "include=deleted" query parameter to discover which blobs and snapshots have been soft deleted. You can then use the Undelete Blob API to restore a soft-deleted blob. All other operations on a soft-deleted blob or snapshot causes the service to return an HTTP status code of 404 (ResourceNotFound).
     *
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<BlobsDeleteResponse> deleteWithRestResponseAsync();

    /**
     * If the storage account's soft delete feature is disabled then, when a blob is deleted, it is permanently removed from the storage account. If the storage account's soft delete feature is enabled, then, when a blob is deleted, it is marked for deletion and becomes inaccessible immediately. However, the blob service retains the blob or snapshot for the number of days specified by the DeleteRetentionPolicy section of [Storage service properties] (Set-Blob-Service-Properties.md). After the specified number of days has passed, the blob's data is permanently removed from the storage account. Note that you continue to be charged for the soft-deleted blob's storage until it is permanently removed. Use the List Blobs API and specify the "include=deleted" query parameter to discover which blobs and snapshots have been soft deleted. You can then use the Undelete Blob API to restore a soft-deleted blob. All other operations on a soft-deleted blob or snapshot causes the service to return an HTTP status code of 404 (ResourceNotFound).
     *
     * @param snapshot The snapshot parameter is an opaque DateTime value that, when present, specifies the blob snapshot to retrieve. For more information on working with blob snapshots, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/creating-a-snapshot-of-a-blob"&gt;Creating a Snapshot of a Blob.&lt;/a&gt;.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param deleteSnapshots Required if the blob has associated snapshots. Specify one of the following two options: include: Delete the base blob and all of its snapshots. only: Delete only the blob's snapshots and not the blob itself. Possible values include: 'include', 'only'.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @param leaseAccessConditions Additional parameters for the operation.
     * @param modifiedAccessConditions Additional parameters for the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<BlobsDeleteResponse> deleteWithRestResponseAsync(String snapshot, Integer timeout, DeleteSnapshotsOptionType deleteSnapshots, String requestId, LeaseAccessConditions leaseAccessConditions, ModifiedAccessConditions modifiedAccessConditions);

    /**
     * Undelete a blob that was previously soft deleted.
     *
     * @param containerName The container name.
     * @param blob The blob name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<BlobsUndeleteResponse> undeleteWithRestResponseAsync(@NonNull String containerName, @NonNull String blob);

    /**
     * Undelete a blob that was previously soft deleted.
     *
     * @param containerName The container name.
     * @param blob The blob name.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<BlobsUndeleteResponse> undeleteWithRestResponseAsync(@NonNull String containerName, @NonNull String blob, Integer timeout, String requestId);

    /**
     * The Set HTTP Headers operation sets system properties on the blob.
     *
     * @param containerName The container name.
     * @param blob The blob name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<BlobsSetHTTPHeadersResponse> setHTTPHeadersWithRestResponseAsync(@NonNull String containerName, @NonNull String blob);

    /**
     * The Set HTTP Headers operation sets system properties on the blob.
     *
     * @param containerName The container name.
     * @param blob The blob name.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @param blobHTTPHeaders Additional parameters for the operation.
     * @param leaseAccessConditions Additional parameters for the operation.
     * @param modifiedAccessConditions Additional parameters for the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<BlobsSetHTTPHeadersResponse> setHTTPHeadersWithRestResponseAsync(@NonNull String containerName, @NonNull String blob, Integer timeout, String requestId, BlobHTTPHeaders blobHTTPHeaders, LeaseAccessConditions leaseAccessConditions, ModifiedAccessConditions modifiedAccessConditions);

    /**
     * The Set Blob Metadata operation sets user-defined metadata for the specified blob as one or more name-value pairs.
     *
     * @param containerName The container name.
     * @param blob The blob name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<BlobsSetMetadataResponse> setMetadataWithRestResponseAsync(@NonNull String containerName, @NonNull String blob);

    /**
     * The Set Blob Metadata operation sets user-defined metadata for the specified blob as one or more name-value pairs.
     *
     * @param containerName The container name.
     * @param blob The blob name.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param metadata Optional. Specifies a user-defined name-value pair associated with the blob. If no name-value pairs are specified, the operation will copy the metadata from the source blob or file to the destination blob. If one or more name-value pairs are specified, the destination blob is created with the specified metadata, and metadata is not copied from the source blob or file. Note that beginning with version 2009-09-19, metadata names must adhere to the naming rules for C# identifiers. See Naming and Referencing Containers, Blobs, and Metadata for more information.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @param leaseAccessConditions Additional parameters for the operation.
     * @param modifiedAccessConditions Additional parameters for the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<BlobsSetMetadataResponse> setMetadataWithRestResponseAsync(@NonNull String containerName, @NonNull String blob, Integer timeout, Map<String, String> metadata, String requestId, LeaseAccessConditions leaseAccessConditions, ModifiedAccessConditions modifiedAccessConditions);

    /**
     * [Update] The Lease Blob operation establishes and manages a lock on a blob for write and delete operations.
     *
     * @param containerName The container name.
     * @param blob The blob name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<BlobsAcquireLeaseResponse> acquireLeaseWithRestResponseAsync(@NonNull String containerName, @NonNull String blob);

    /**
     * [Update] The Lease Blob operation establishes and manages a lock on a blob for write and delete operations.
     *
     * @param containerName The container name.
     * @param blob The blob name.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param duration Specifies the duration of the lease, in seconds, or negative one (-1) for a lease that never expires. A non-infinite lease can be between 15 and 60 seconds. A lease duration cannot be changed using renew or change.
     * @param proposedLeaseId Proposed lease ID, in a GUID string format. The Blob service returns 400 (Invalid request) if the proposed lease ID is not in the correct format. See Guid Constructor (String) for a list of valid GUID string formats.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @param modifiedAccessConditions Additional parameters for the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<BlobsAcquireLeaseResponse> acquireLeaseWithRestResponseAsync(@NonNull String containerName, @NonNull String blob, Integer timeout, Integer duration, String proposedLeaseId, String requestId, ModifiedAccessConditions modifiedAccessConditions);

    /**
     * [Update] The Lease Blob operation establishes and manages a lock on a blob for write and delete operations.
     *
     * @param containerName The container name.
     * @param blob The blob name.
     * @param leaseId Specifies the current lease ID on the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<BlobsReleaseLeaseResponse> releaseLeaseWithRestResponseAsync(@NonNull String containerName, @NonNull String blob, @NonNull String leaseId);

    /**
     * [Update] The Lease Blob operation establishes and manages a lock on a blob for write and delete operations.
     *
     * @param containerName The container name.
     * @param blob The blob name.
     * @param leaseId Specifies the current lease ID on the resource.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @param modifiedAccessConditions Additional parameters for the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<BlobsReleaseLeaseResponse> releaseLeaseWithRestResponseAsync(@NonNull String containerName, @NonNull String blob, @NonNull String leaseId, Integer timeout, String requestId, ModifiedAccessConditions modifiedAccessConditions);

    /**
     * [Update] The Lease Blob operation establishes and manages a lock on a blob for write and delete operations.
     *
     * @param containerName The container name.
     * @param blob The blob name.
     * @param leaseId Specifies the current lease ID on the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<BlobsRenewLeaseResponse> renewLeaseWithRestResponseAsync(@NonNull String containerName, @NonNull String blob, @NonNull String leaseId);

    /**
     * [Update] The Lease Blob operation establishes and manages a lock on a blob for write and delete operations.
     *
     * @param containerName The container name.
     * @param blob The blob name.
     * @param leaseId Specifies the current lease ID on the resource.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @param modifiedAccessConditions Additional parameters for the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<BlobsRenewLeaseResponse> renewLeaseWithRestResponseAsync(@NonNull String containerName, @NonNull String blob, @NonNull String leaseId, Integer timeout, String requestId, ModifiedAccessConditions modifiedAccessConditions);

    /**
     * [Update] The Lease Blob operation establishes and manages a lock on a blob for write and delete operations.
     *
     * @param containerName The container name.
     * @param blob The blob name.
     * @param leaseId Specifies the current lease ID on the resource.
     * @param proposedLeaseId Proposed lease ID, in a GUID string format. The Blob service returns 400 (Invalid request) if the proposed lease ID is not in the correct format. See Guid Constructor (String) for a list of valid GUID string formats.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<BlobsChangeLeaseResponse> changeLeaseWithRestResponseAsync(@NonNull String containerName, @NonNull String blob, @NonNull String leaseId, @NonNull String proposedLeaseId);

    /**
     * [Update] The Lease Blob operation establishes and manages a lock on a blob for write and delete operations.
     *
     * @param containerName The container name.
     * @param blob The blob name.
     * @param leaseId Specifies the current lease ID on the resource.
     * @param proposedLeaseId Proposed lease ID, in a GUID string format. The Blob service returns 400 (Invalid request) if the proposed lease ID is not in the correct format. See Guid Constructor (String) for a list of valid GUID string formats.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @param modifiedAccessConditions Additional parameters for the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<BlobsChangeLeaseResponse> changeLeaseWithRestResponseAsync(@NonNull String containerName, @NonNull String blob, @NonNull String leaseId, @NonNull String proposedLeaseId, Integer timeout, String requestId, ModifiedAccessConditions modifiedAccessConditions);

    /**
     * [Update] The Lease Blob operation establishes and manages a lock on a blob for write and delete operations.
     *
     * @param containerName The container name.
     * @param blob The blob name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<BlobsBreakLeaseResponse> breakLeaseWithRestResponseAsync(@NonNull String containerName, @NonNull String blob);

    /**
     * [Update] The Lease Blob operation establishes and manages a lock on a blob for write and delete operations.
     *
     * @param containerName The container name.
     * @param blob The blob name.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param breakPeriod For a break operation, proposed duration the lease should continue before it is broken, in seconds, between 0 and 60. This break period is only used if it is shorter than the time remaining on the lease. If longer, the time remaining on the lease is used. A new lease will not be available before the break period has expired, but the lease may be held for longer than the break period. If this header does not appear with a break operation, a fixed-duration lease breaks after the remaining lease period elapses, and an infinite lease breaks immediately.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @param modifiedAccessConditions Additional parameters for the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<BlobsBreakLeaseResponse> breakLeaseWithRestResponseAsync(@NonNull String containerName, @NonNull String blob, Integer timeout, Integer breakPeriod, String requestId, ModifiedAccessConditions modifiedAccessConditions);

    /**
     * The Create Snapshot operation creates a read-only snapshot of a blob.
     *
     * @param containerName The container name.
     * @param blob The blob name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<BlobsCreateSnapshotResponse> createSnapshotWithRestResponseAsync(@NonNull String containerName, @NonNull String blob);

    /**
     * The Create Snapshot operation creates a read-only snapshot of a blob.
     *
     * @param containerName The container name.
     * @param blob The blob name.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param metadata Optional. Specifies a user-defined name-value pair associated with the blob. If no name-value pairs are specified, the operation will copy the metadata from the source blob or file to the destination blob. If one or more name-value pairs are specified, the destination blob is created with the specified metadata, and metadata is not copied from the source blob or file. Note that beginning with version 2009-09-19, metadata names must adhere to the naming rules for C# identifiers. See Naming and Referencing Containers, Blobs, and Metadata for more information.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @param modifiedAccessConditions Additional parameters for the operation.
     * @param leaseAccessConditions Additional parameters for the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<BlobsCreateSnapshotResponse> createSnapshotWithRestResponseAsync(@NonNull String containerName, @NonNull String blob, Integer timeout, Map<String, String> metadata, String requestId, ModifiedAccessConditions modifiedAccessConditions, LeaseAccessConditions leaseAccessConditions);

    /**
     * The Start Copy From URL operation copies a blob or an internet resource to a new blob.
     *
     * @param containerName The container name.
     * @param blob The blob name.
     * @param copySource Specifies the name of the source page blob snapshot. This value is a URL of up to 2 KB in length that specifies a page blob snapshot. The value should be URL-encoded as it would appear in a request URI. The source blob must either be public or must be authenticated via a shared access signature.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<BlobsStartCopyFromURLResponse> startCopyFromURLWithRestResponseAsync(@NonNull String containerName, @NonNull String blob, @NonNull URL copySource);

    /**
     * The Start Copy From URL operation copies a blob or an internet resource to a new blob.
     *
     * @param containerName The container name.
     * @param blob The blob name.
     * @param copySource Specifies the name of the source page blob snapshot. This value is a URL of up to 2 KB in length that specifies a page blob snapshot. The value should be URL-encoded as it would appear in a request URI. The source blob must either be public or must be authenticated via a shared access signature.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param metadata Optional. Specifies a user-defined name-value pair associated with the blob. If no name-value pairs are specified, the operation will copy the metadata from the source blob or file to the destination blob. If one or more name-value pairs are specified, the destination blob is created with the specified metadata, and metadata is not copied from the source blob or file. Note that beginning with version 2009-09-19, metadata names must adhere to the naming rules for C# identifiers. See Naming and Referencing Containers, Blobs, and Metadata for more information.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @param sourceModifiedAccessConditions Additional parameters for the operation.
     * @param modifiedAccessConditions Additional parameters for the operation.
     * @param leaseAccessConditions Additional parameters for the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<BlobsStartCopyFromURLResponse> startCopyFromURLWithRestResponseAsync(@NonNull String containerName, @NonNull String blob, @NonNull URL copySource, Integer timeout, Map<String, String> metadata, String requestId, SourceModifiedAccessConditions sourceModifiedAccessConditions, ModifiedAccessConditions modifiedAccessConditions, LeaseAccessConditions leaseAccessConditions);

    /**
     * The Abort Copy From URL operation aborts a pending Copy From URL operation, and leaves a destination blob with zero length and full metadata.
     *
     * @param containerName The container name.
     * @param blob The blob name.
     * @param copyId The copy identifier provided in the x-ms-copy-id header of the original Copy Blob operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<BlobsAbortCopyFromURLResponse> abortCopyFromURLWithRestResponseAsync(@NonNull String containerName, @NonNull String blob, @NonNull String copyId);

    /**
     * The Abort Copy From URL operation aborts a pending Copy From URL operation, and leaves a destination blob with zero length and full metadata.
     *
     * @param containerName The container name.
     * @param blob The blob name.
     * @param copyId The copy identifier provided in the x-ms-copy-id header of the original Copy Blob operation.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @param leaseAccessConditions Additional parameters for the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<BlobsAbortCopyFromURLResponse> abortCopyFromURLWithRestResponseAsync(@NonNull String containerName, @NonNull String blob, @NonNull String copyId, Integer timeout, String requestId, LeaseAccessConditions leaseAccessConditions);

    /**
     * The Set Tier operation sets the tier on a blob. The operation is allowed on a page blob in a premium storage account and on a block blob in a blob storage account (locally redundant storage only). A premium page blob's tier determines the allowed size, IOPS, and bandwidth of the blob. A block blob's tier determines Hot/Cool/Archive storage type. This operation does not update the blob's ETag.
     *
     * @param containerName The container name.
     * @param blob The blob name.
     * @param tier Indicates the tier to be set on the blob. Possible values include: 'P4', 'P6', 'P10', 'P20', 'P30', 'P40', 'P50', 'Hot', 'Cool', 'Archive'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<BlobsSetTierResponse> setTierWithRestResponseAsync(@NonNull String containerName, @NonNull String blob, @NonNull AccessTier tier);

    /**
     * The Set Tier operation sets the tier on a blob. The operation is allowed on a page blob in a premium storage account and on a block blob in a blob storage account (locally redundant storage only). A premium page blob's tier determines the allowed size, IOPS, and bandwidth of the blob. A block blob's tier determines Hot/Cool/Archive storage type. This operation does not update the blob's ETag.
     *
     * @param containerName The container name.
     * @param blob The blob name.
     * @param tier Indicates the tier to be set on the blob. Possible values include: 'P4', 'P6', 'P10', 'P20', 'P30', 'P40', 'P50', 'Hot', 'Cool', 'Archive'.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @param leaseAccessConditions Additional parameters for the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<BlobsSetTierResponse> setTierWithRestResponseAsync(@NonNull String containerName, @NonNull String blob, @NonNull AccessTier tier, Integer timeout, String requestId, LeaseAccessConditions leaseAccessConditions);

    /**
     * Returns the sku name and account kind.
     *
     * @param containerName The container name.
     * @param blob The blob name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<BlobsGetAccountInfoResponse> getAccountInfoWithRestResponseAsync(@NonNull String containerName, @NonNull String blob);
}
