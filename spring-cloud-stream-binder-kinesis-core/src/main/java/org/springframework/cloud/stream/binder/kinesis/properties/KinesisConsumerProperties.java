/*
 * Copyright 2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.cloud.stream.binder.kinesis.properties;

import org.springframework.integration.aws.inbound.kinesis.CheckpointMode;
import org.springframework.integration.aws.inbound.kinesis.ListenerMode;

/**
 * 
 * @author Peter Oates
 * @author Jacob Severson
 *
 */
public class KinesisConsumerProperties {

	private int startTimeout = 60000;

	private ListenerMode listenerMode = ListenerMode.record;

	private CheckpointMode checkpointMode = CheckpointMode.batch;

	private int recordsLimit = 10000;

	private int idleBetweenPolls = 1000;

	private int consumerBackoff = 1000;

	public int getStartTimeout() {
		return this.startTimeout;
	}

	public void setStartTimeout(int startTimeout) {
		this.startTimeout = startTimeout;
	}

	public ListenerMode getListenerMode() {
		return this.listenerMode;
	}

	public void setListenerMode(ListenerMode listenerMode) {
		this.listenerMode = listenerMode;
	}

	public CheckpointMode getCheckpointMode() {
		return this.checkpointMode;
	}

	public void setCheckpointMode(CheckpointMode checkpointMode) {
		this.checkpointMode = checkpointMode;
	}

	public int getRecordsLimit() {
		return this.recordsLimit;
	}

	public void setRecordsLimit(int recordsLimit) {
		this.recordsLimit = recordsLimit;
	}

	public int getIdleBetweenPolls() {
		return this.idleBetweenPolls;
	}

	public void setIdleBetweenPolls(int idleBetweenPolls) {
		this.idleBetweenPolls = idleBetweenPolls;
	}

	public int getConsumerBackoff() {
		return this.consumerBackoff;
	}

	public void setConsumerBackoff(int consumerBackoff) {
		this.consumerBackoff = consumerBackoff;
	}
}
