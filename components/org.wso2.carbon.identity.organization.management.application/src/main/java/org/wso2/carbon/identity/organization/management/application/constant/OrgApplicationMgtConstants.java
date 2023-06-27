/*
 * Copyright (c) 2022, WSO2 Inc. (http://www.wso2.com).
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.organization.management.application.constant;

/**
 * Contains constants related to organization application management.
 */
public class OrgApplicationMgtConstants {

    public static final String TENANT = "TENANT";
    public static final String AUTH_TYPE_OAUTH_2 = "oauth2";
    public static final String IS_FRAGMENT_APP = "isFragmentApp";
    public static final String SHARE_WITH_ALL_CHILDREN = "shareWithAllChildren";

    public static final String ORGANIZATION_LOGIN_AUTHENTICATOR = "OrganizationAuthenticator";
    public static final String DELETE_FRAGMENT_APPLICATION = "deleteFragmentApplication";
    public static final String DELETE_MAIN_APPLICATION = "deleteMainApplication";
    public static final String UPDATE_SP_METADATA_SHARE_WITH_ALL_CHILDREN = "updateShareWithAllChildren";
    public static final String DELETE_SHARE_FOR_MAIN_APPLICATION = "deleteShareForMainApp";

    public static final String USER_ORGANIZATION_CLAIM_URI = "http://wso2.org/claims/runtime/user_organization";
    public static final String APP_ROLES_CLAIM_URI = "http://wso2.org/claims/applicationRoles";
    public static final String USER_ORGANIZATION_CLAIM = "user_organization";
    public static final String OIDC_CLAIM_DIALECT_URI = "http://wso2.org/oidc/claim";
    public static final String OIDC_LOGOUT_URL = "OIDCLogoutEPUrl";
    public static final String ORG_QUALIFIED_OIDC_LOGOUT_URL = "/o/{organization_id}/oidc/logout";

    // Event constants related to shared application management.
    public static final String EVENT_PROP_PARENT_ORGANIZATION_ID = "PARENT_ORGANIZATION_ID";
    public static final String EVENT_PROP_SHARED_ORGANIZATION_ID = "SHARED_ORGANIZATION_ID";
    public static final String EVENT_PROP_PARENT_APPLICATION_ID = "PARENT_APPLICATION_ID";
    public static final String EVENT_PROP_SHARED_APPLICATION_ID = "SHARED_APPLICATION_ID";
    public static final String EVENT_PROP_SHARED_APPLICATIONS_DATA = "SHARED_APPLICATIONS_DATA";
    public static final String EVENT_PROP_SHARE_WITH_ALL_CHILDREN = "SHARE_WITH_ALL_CHILDREN";
    public static final String EVENT_PROP_SHARED_ORGANIZATIONS = "SHARED_ORGANIZATIONS";
    public static final String EVENT_PRE_SHARE_APPLICATION = "PRE_SHARE_APPLICATION";
    public static final String EVENT_POST_SHARE_APPLICATION = "POST_SHARE_APPLICATION";
    public static final String EVENT_PRE_DELETE_SHARED_APPLICATION = "PRE_DELETE_SHARED_APPLICATION";
    public static final String EVENT_POST_DELETE_SHARED_APPLICATION = "POST_DELETE_SHARED_APPLICATION";
    public static final String EVENT_PRE_DELETE_ALL_SHARED_APPLICATIONS = "PRE_DELETE_ALL_SHARED_APPLICATIONS";
    public static final String EVENT_POST_DELETE_ALL_SHARED_APPLICATIONS = "POST_DELETE_ALL_SHARED_APPLICATIONS";
    public static final String EVENT_PRE_GET_APPLICATION_SHARED_ORGANIZATIONS =
            "PRE_GET_APPLICATION_SHARED_ORGANIZATIONS";
    public static final String EVENT_POST_GET_APPLICATION_SHARED_ORGANIZATIONS =
            "POST_GET_APPLICATION_SHARED_ORGANIZATIONS";
    public static final String EVENT_PRE_GET_SHARED_APPLICATIONS = "PRE_GET_SHARED_APPLICATIONS";
    public static final String EVENT_POST_GET_SHARED_APPLICATIONS = "POST_GET_SHARED_APPLICATIONS";
}
