/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DisassociateSecurityGroupsRequest  extends AbstractModel{

    /**
    * 要解绑的`安全组ID`，类似sg-efil73jd，支持解绑多个安全组。
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * 被解绑的`实例ID`，类似ins-lesecurk 。
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
     * 获取要解绑的`安全组ID`，类似sg-efil73jd，支持解绑多个安全组。
     * @return SecurityGroupIds 要解绑的`安全组ID`，类似sg-efil73jd，支持解绑多个安全组。
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * 设置要解绑的`安全组ID`，类似sg-efil73jd，支持解绑多个安全组。
     * @param SecurityGroupIds 要解绑的`安全组ID`，类似sg-efil73jd，支持解绑多个安全组。
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * 获取被解绑的`实例ID`，类似ins-lesecurk 。
     * @return InstanceIds 被解绑的`实例ID`，类似ins-lesecurk 。
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * 设置被解绑的`实例ID`，类似ins-lesecurk 。
     * @param InstanceIds 被解绑的`实例ID`，类似ins-lesecurk 。
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);

    }
}

