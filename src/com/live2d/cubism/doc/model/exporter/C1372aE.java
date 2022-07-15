package com.live2d.cubism.doc.model.exporter;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

import java.util.List;


/* renamed from: com.live2d.cubism.doc.model.exporter.aE */
/* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/aE.class */
final class C1372aE extends Lambda implements Function1<EmMoc3Source, List<Integer>> {

    /* renamed from: a */
    public static final C1372aE f3546a = new C1372aE();


    C1372aE() {
        super();
    }

    /* renamed from: a */
    public List<Integer> invoke(EmMoc3Source receiver) {

        count = receiver.getEmModelSource().getEmCountInfo().getCounts().get(5);
        return receiver.getEmModelSource().getEmParameterSources().getKeyformBindingSourcesCount();
    }
}
