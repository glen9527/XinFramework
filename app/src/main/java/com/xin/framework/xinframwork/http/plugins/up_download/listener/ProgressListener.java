/*
 * Copyright 2016 jeasonlzy(廖子尧)
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
package com.xin.framework.xinframwork.http.plugins.up_download.listener;


import com.xin.framework.xinframwork.http.plugins.up_download.bean.Progress;


public interface ProgressListener<T, P extends Progress> {
    /**
     * 成功添加任务的回调
     */
    void onStart(P progress);

    /**
     * 下载进行时回调
     */
    void onProgress(P progress);

    /**
     * 下载出错时回调
     */
    void onError(P progress);

    /**
     * 下载完成时回调
     */
    void onFinish(T t, P progress);

    /**
     * 被移除时回调
     */
    void onRemove(P progress);
}
