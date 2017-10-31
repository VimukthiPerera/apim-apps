/*
 *  Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package org.wso2.carbon.apimgt.rest.api.store;

import org.wso2.carbon.apimgt.rest.api.store.dto.ApplicationDTO;
import org.wso2.carbon.apimgt.rest.api.store.dto.ApplicationKeyDTO;
import org.wso2.carbon.apimgt.rest.api.store.dto.ApplicationKeyGenerateRequestDTO;

import javax.ws.rs.core.Response;

public abstract class ApplicationsApiService {
    public abstract Response applicationsApplicationIdDelete(String applicationId,String ifMatch,String ifUnmodifiedSince);
    public abstract Response applicationsApplicationIdGet(String applicationId,String accept,String ifNoneMatch,String ifModifiedSince);
    public abstract Response applicationsApplicationIdKeysKeyTypeGet(String applicationId,String keyType,String groupId,String accept);
    public abstract Response applicationsApplicationIdKeysKeyTypePut(String applicationId,String keyType,ApplicationKeyDTO body);
    public abstract Response applicationsApplicationIdPut(String applicationId,ApplicationDTO body,String contentType,String ifMatch,String ifUnmodifiedSince);
    public abstract Response applicationsGenerateKeysPost(String applicationId,ApplicationKeyGenerateRequestDTO body,String contentType,String ifMatch,String ifUnmodifiedSince);
    public abstract Response applicationsGet(String groupId,String query,Integer limit,Integer offset,String accept,String ifNoneMatch);
    public abstract Response applicationsPost(ApplicationDTO body,String contentType);

    public abstract String applicationsApplicationIdDeleteGetLastUpdatedTime(String applicationId,String ifMatch,String ifUnmodifiedSince);
    public abstract String applicationsApplicationIdGetGetLastUpdatedTime(String applicationId,String accept,String ifNoneMatch,String ifModifiedSince);
    public abstract String applicationsApplicationIdKeysKeyTypeGetGetLastUpdatedTime(String applicationId,String keyType,String groupId,String accept);
    public abstract String applicationsApplicationIdKeysKeyTypePutGetLastUpdatedTime(String applicationId,String keyType,ApplicationKeyDTO body);
    public abstract String applicationsApplicationIdPutGetLastUpdatedTime(String applicationId,ApplicationDTO body,String contentType,String ifMatch,String ifUnmodifiedSince);
    public abstract String applicationsGenerateKeysPostGetLastUpdatedTime(String applicationId,ApplicationKeyGenerateRequestDTO body,String contentType,String ifMatch,String ifUnmodifiedSince);
    public abstract String applicationsGetGetLastUpdatedTime(String groupId,String query,Integer limit,Integer offset,String accept,String ifNoneMatch);
    public abstract String applicationsPostGetLastUpdatedTime(ApplicationDTO body,String contentType);

    public abstract Response applicationsApplicationScopesGet(String applicationId, boolean filterByUserRoles,
            String accept,String ifNoneMatch, String ifModifiedSince);
}

