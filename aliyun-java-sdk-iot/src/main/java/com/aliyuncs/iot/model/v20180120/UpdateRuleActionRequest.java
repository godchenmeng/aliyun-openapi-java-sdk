/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.iot.model.v20180120;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class UpdateRuleActionRequest extends RpcAcsRequest<UpdateRuleActionResponse> {
	
	public UpdateRuleActionRequest() {
		super("Iot", "2018-01-20", "UpdateRuleAction");
	}

	private String configuration;

	private Long actionId;

	private String type;

	public String getConfiguration() {
		return this.configuration;
	}

	public void setConfiguration(String configuration) {
		this.configuration = configuration;
		if(configuration != null){
			putQueryParameter("Configuration", configuration);
		}
	}

	public Long getActionId() {
		return this.actionId;
	}

	public void setActionId(Long actionId) {
		this.actionId = actionId;
		if(actionId != null){
			putQueryParameter("ActionId", actionId.toString());
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type);
		}
	}

	@Override
	public Class<UpdateRuleActionResponse> getResponseClass() {
		return UpdateRuleActionResponse.class;
	}

}
