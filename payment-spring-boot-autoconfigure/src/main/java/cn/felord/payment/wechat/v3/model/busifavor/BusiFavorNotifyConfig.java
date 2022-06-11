/*
 *  Copyright 2019-2022 felord.cn
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       https://www.apache.org/licenses/LICENSE-2.0
 *  Website:
 *       https://felord.cn
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package cn.felord.payment.wechat.v3.model.busifavor;

import lombok.Data;

/**
 * 事件通知配置
 *
 * @author felord.cn
 * @since 1.0.4.RELEASE
 */
@Data
public class BusiFavorNotifyConfig {

    /**
     * 事件通知appid
     * <p>
     * 用于回调通知时，计算返回操作用户的openid（诸如领券用户），支持小程序or公众号的APPID；
     * 如该字段不填写，则回调通知中涉及到用户身份信息的openid与unionid都将为空。
     */
    private String notifyAppid;
}
