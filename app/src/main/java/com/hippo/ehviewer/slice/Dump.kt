/*
 * Copyright 2017 Hippo Seven
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

package com.hippo.ehviewer.slice

import com.hippo.ehviewer.mvp.GroupPaper
import com.hippo.ehviewer.mvp.GroupPen
import com.hippo.ehviewer.mvp.MvpLogic
import com.hippo.ehviewer.mvp.MvpUi
import com.hippo.viewstate.GenerateViewState
import com.hippo.viewstate.ViewState

/*
 * Created by Hippo on 2017/7/24.
 */

@GenerateViewState
interface DumpUi : MvpUi

interface DumpLogic : MvpLogic<DumpUi>

open class DumpPaper(logic: DumpLogic) : GroupPaper<DumpUi>(logic), DumpUi

open class DumpPen : GroupPen<DumpUi>(), DumpLogic {
  override fun createViewState(): ViewState<DumpUi> = DumpUiState()
}
