/*
 * Copyright 2019 Netflix, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.mantisrx.runtime.executor;

import io.mantisrx.runtime.common.MachineDefinition;


public class MachineDefinitions {

    public static MachineDefinition micro() {
        return new MachineDefinition(2f, 2014, 128.0, 1024, 1); // 2 cores, 2GB RAM, 500MB disk
    }

    public static MachineDefinition fromValues(double cpuCores, double memory, double disk) {
        return new MachineDefinition(cpuCores, memory, 128.0, disk, 1);
    }

    public static MachineDefinition fromValues(double cpuCores, double memory, double network, double disk) {
        return new MachineDefinition(cpuCores, memory, network, disk, 1);
    }
}
