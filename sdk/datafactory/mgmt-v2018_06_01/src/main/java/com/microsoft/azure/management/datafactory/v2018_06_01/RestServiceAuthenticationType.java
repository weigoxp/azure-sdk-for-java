/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for RestServiceAuthenticationType.
 */
public final class RestServiceAuthenticationType extends ExpandableStringEnum<RestServiceAuthenticationType> {
    /** Static value Anonymous for RestServiceAuthenticationType. */
    public static final RestServiceAuthenticationType ANONYMOUS = fromString("Anonymous");

    /** Static value Basic for RestServiceAuthenticationType. */
    public static final RestServiceAuthenticationType BASIC = fromString("Basic");

    /** Static value AadServicePrincipal for RestServiceAuthenticationType. */
    public static final RestServiceAuthenticationType AAD_SERVICE_PRINCIPAL = fromString("AadServicePrincipal");

    /** Static value ManagedServiceIdentity for RestServiceAuthenticationType. */
    public static final RestServiceAuthenticationType MANAGED_SERVICE_IDENTITY = fromString("ManagedServiceIdentity");

    /**
     * Creates or finds a RestServiceAuthenticationType from its string representation.
     * @param name a name to look for
     * @return the corresponding RestServiceAuthenticationType
     */
    @JsonCreator
    public static RestServiceAuthenticationType fromString(String name) {
        return fromString(name, RestServiceAuthenticationType.class);
    }

    /**
     * @return known RestServiceAuthenticationType values
     */
    public static Collection<RestServiceAuthenticationType> values() {
        return values(RestServiceAuthenticationType.class);
    }
}