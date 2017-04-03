package com.gmail.blueboxware.libgdxplugin.filetypes.atlas.editor

import com.gmail.blueboxware.libgdxplugin.filetypes.atlas.psi.AtlasRegion
import com.intellij.lang.findUsages.FindUsagesProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiNamedElement

/*
 * Copyright 2017 Blue Box Ware
 *
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
class AtlasFindUsagesProvider : FindUsagesProvider {

  override fun getType(element: PsiElement) = when(element) {
    is AtlasRegion    -> "atlas region"
    else              -> ""
  }

  override fun getNodeText(element: PsiElement, useFullName: Boolean) = (element as? PsiNamedElement)?.name ?: ""

  override fun getDescriptiveName(element: PsiElement) = (element as? PsiNamedElement)?.name ?: ""

  override fun getHelpId(psiElement: PsiElement) = null

  override fun canFindUsagesFor(psiElement: PsiElement) = psiElement is AtlasRegion

  override fun getWordsScanner() = null

}