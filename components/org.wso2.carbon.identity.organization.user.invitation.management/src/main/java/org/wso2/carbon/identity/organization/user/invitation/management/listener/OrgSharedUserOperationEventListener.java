/*
 * Copyright (c) 2023, WSO2 LLC. (http://www.wso2.com).
 *
 * WSO2 LLC. licenses this file to you under the Apache License,
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

package org.wso2.carbon.identity.organization.user.invitation.management.listener;

import org.wso2.carbon.identity.core.AbstractIdentityUserOperationEventListener;
import org.wso2.carbon.identity.organization.user.invitation.management.InvitationCoreService;
import org.wso2.carbon.identity.organization.user.invitation.management.InvitationCoreServiceImpl;
import org.wso2.carbon.identity.organization.user.invitation.management.exception.UserInvitationMgtException;
import org.wso2.carbon.user.core.UserStoreException;
import org.wso2.carbon.user.core.UserStoreManager;

import static org.wso2.carbon.identity.organization.user.invitation.management.constant.UserInvitationMgtConstants.ErrorMessage.ERROR_CODE_DELETE_INVITED_USER_ASSOCIATION;

/**
 * Organization shared user operation event listener.
 */
public class OrgSharedUserOperationEventListener extends AbstractIdentityUserOperationEventListener {

    @Override
    public int getExecutionOrderId() {

        return 160;
    }

    @Override
    public boolean doPreDeleteUserWithID(String userID, UserStoreManager userStoreManager) throws UserStoreException {

        if (!isEnable() || userStoreManager == null) {
            return true;
        }

        InvitationCoreService invitationCoreService = new InvitationCoreServiceImpl();
        try {
            return invitationCoreService.deleteInvitedUserAssociation(userID, userStoreManager);
        } catch (UserInvitationMgtException e) {
            throw new UserStoreException(String.format(ERROR_CODE_DELETE_INVITED_USER_ASSOCIATION.getDescription(),
                    userID), ERROR_CODE_DELETE_INVITED_USER_ASSOCIATION.getCode(), e);
        }
    }
}
