/*
 * Copyright (c) 2022-present Charles7c Authors. All Rights Reserved.
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

package top.continew.admin.common.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import top.continew.admin.common.constant.UiConstants;
import top.continew.starter.core.enums.BaseEnum;

/**
 * 成功/失败状态枚举
 *
 * @author Charles7c
 * @since 2023/2/26 21:35
 */
@Getter
@RequiredArgsConstructor
public enum SuccessFailureStatusEnum implements BaseEnum<Integer> {

    /**
     * 成功
     */
    SUCCESS(1, "成功", UiConstants.COLOR_SUCCESS),

    /**
     * 失败
     */
    FAILURE(2, "失败", UiConstants.COLOR_ERROR),;

    private final Integer value;
    private final String description;
    private final String color;

    @Override
    public String toString() {
        return "%s: %s".formatted(this.value, this.description);
    }
}
