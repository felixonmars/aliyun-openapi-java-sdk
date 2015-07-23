/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.ecs.model.v20140526;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20140526.DescribeInstanceStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeInstanceStatusResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<InstanceStatus> instanceStatuses;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<InstanceStatus> getInstanceStatuses() {
		return this.instanceStatuses;
	}

	public void setInstanceStatuses(List<InstanceStatus> instanceStatuses) {
		this.instanceStatuses = instanceStatuses;
	}

	public static class InstanceStatus {

		private String instanceId;

		private Status status;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public Status getStatus() {
			return this.status;
		}

		public void setStatus(Status status) {
			this.status = status;
		}

		public enum Status {
		
			DELETED("Deleted"),
			STOPPED("Stopped"),
			TRANSFERRING("Transferring"),
			RUNNING("Running"),
			RESETTING("Resetting"),
			STARTING("Starting"),
			STOPPING("Stopping"),;
			
		    private String stringValue;
		
			Status(String stringValue) {
		        setStringValue(stringValue);
		    }
		
		    public String getStringValue() {
		        return stringValue;
		    }
		
		    public void setStringValue(String stringValue) {
		        this.stringValue = stringValue;
		    }
		    
		    public static Status getEnum(String stringValue){
		    	if(null == stringValue){
		    		return null;
		    	}
		    	
		    	for (Status status : Status.values()) {
					if(status.getStringValue().equals(stringValue)){
						return status;
					}
				}
		    	return null;
		    }
		}
	}

	@Override
	public DescribeInstanceStatusResponse getInstance(UnmarshallerContext context) {
		return	DescribeInstanceStatusResponseUnmarshaller.unmarshall(this, context);
	}
}