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

public class InstanceStatus  extends AbstractModel{

    /**
    * 实例`ID`。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * [实例状态](/document/api/213/9452#INSTANCE_STATE)。
    */
    @SerializedName("InstanceState")
    @Expose
    private String InstanceState;

    /**
     * 获取实例`ID`。
     * @return InstanceId 实例`ID`。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置实例`ID`。
     * @param InstanceId 实例`ID`。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 获取[实例状态](/document/api/213/9452#INSTANCE_STATE)。
     * @return InstanceState [实例状态](/document/api/213/9452#INSTANCE_STATE)。
     */
    public String getInstanceState() {
        return this.InstanceState;
    }

    /**
     * 设置[实例状态](/document/api/213/9452#INSTANCE_STATE)。
     * @param InstanceState [实例状态](/document/api/213/9452#INSTANCE_STATE)。
     */
    public void setInstanceState(String InstanceState) {
        this.InstanceState = InstanceState;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceState", this.InstanceState);

    }
}

