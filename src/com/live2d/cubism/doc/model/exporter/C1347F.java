package com.live2d.cubism.doc.model.exporter;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

import java.util.List;


/* renamed from: com.live2d.cubism.doc.model.exporter.F */
/* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/F.class */
final class C1347F extends Lambda implements Function1<EmMoc3Source, List<String>> {

    /* renamed from: a */
    public static final C1347F f3518a = new C1347F();


    C1347F() {
        super();
    }

    /* renamed from: a */
    public List<String> invoke(EmMoc3Source receiver) {
        //Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        count = receiver.getEmModelSource().getEmCountInfo().getCounts().get(1);
        return receiver.getEmModelSource().getEmDeformerSources().getId();
    }
}
