package com.live2d.cubism.doc.model.exporter;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

import java.util.List;


/* renamed from: com.live2d.cubism.doc.model.exporter.bw */
/* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/bw.class */
final class C1462bw extends Lambda implements Function1<EmMoc3Source, List<Integer>> {

    /* renamed from: a */
    public static final C1462bw f3769a = new C1462bw();


    C1462bw() {
        super();
    }

    /* renamed from: a */
    public List<Integer> invoke(EmMoc3Source receiver) {
        //Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        count = receiver.getEmModelSource().getEmCountInfo().getCounts().get(20);
        return receiver.getEmModelSource().getEmGlueSources().getGlueInfoSourcesBeginIndex();
    }
}
