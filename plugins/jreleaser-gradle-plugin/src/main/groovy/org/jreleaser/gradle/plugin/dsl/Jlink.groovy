/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * Copyright 2020-2021 Andres Almiray.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jreleaser.gradle.plugin.dsl

import groovy.transform.CompileStatic
import org.gradle.api.Action
import org.gradle.api.provider.ListProperty
import org.gradle.api.provider.Property
import org.gradle.api.provider.SetProperty

/**
 *
 * @author Andres Almiray
 * @since 0.2.0
 */
@CompileStatic
interface Jlink extends Assembler {
    Property<String> getImageName()

    Property<String> getModuleName()

    SetProperty<String> getModuleNames()

    ListProperty<String> getArgs()

    void addArg(String arg)

    void jdk(Action<? super Artifact> action)

    void mainJar(Action<? super Artifact> action)

    void targetJdk(Action<? super Artifact> action)

    void jars(Action<? super Glob> action)
}