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
package com.aliyuncs.cdn.transform.v20141111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cdn.model.v20141111.DescribeDomainFlowDataResponse;
import com.aliyuncs.cdn.model.v20141111.DescribeDomainFlowDataResponse.DataModule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainFlowDataResponseUnmarshaller {

	public static DescribeDomainFlowDataResponse unmarshall(DescribeDomainFlowDataResponse describeDomainFlowDataResponse, UnmarshallerContext context) {
		
		describeDomainFlowDataResponse.setRequestId(context.stringValue("DescribeDomainFlowDataResponse.RequestId"));
		describeDomainFlowDataResponse.setDomainName(context.stringValue("DescribeDomainFlowDataResponse.DomainName"));
		describeDomainFlowDataResponse.setDataInterval(context.stringValue("DescribeDomainFlowDataResponse.DataInterval"));
		describeDomainFlowDataResponse.setStartTime(context.stringValue("DescribeDomainFlowDataResponse.StartTime"));
		describeDomainFlowDataResponse.setEndTime(context.stringValue("DescribeDomainFlowDataResponse.EndTime"));

		List<DataModule> flowDataPerInterval = new ArrayList<DataModule>();
		for (int i = 0; i < context.lengthValue("DescribeDomainFlowDataResponse.FlowDataPerInterval.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setTimeStamp(context.stringValue("DescribeDomainFlowDataResponse.FlowDataPerInterval["+ i +"].TimeStamp"));
			dataModule.setValue(context.stringValue("DescribeDomainFlowDataResponse.FlowDataPerInterval["+ i +"].Value"));

			flowDataPerInterval.add(dataModule);
		}
		describeDomainFlowDataResponse.setFlowDataPerInterval(flowDataPerInterval);
	 
	 	return describeDomainFlowDataResponse;
	}
}