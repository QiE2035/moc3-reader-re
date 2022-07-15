package com.live2d.cubism.doc.model.exporter;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

import java.util.List;


/* renamed from: com.live2d.cubism.doc.model.exporter.I */
/* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/I.class */
final class C1350I extends Lambda implements Function1<EmMoc3Source, List<Boolean>> {

    /* renamed from: a */
    public static final C1350I f3521a = new C1350I();


    C1350I() {
        super();
    }

    /* renamed from: a */
    public List<Boolean> invoke(EmMoc3Source receiver) {

        type = Boolean.TYPE;
        count = receiver.getEmModelSource().getEmCountInfo().getCounts().get(1);
        return receiver.getEmModelSource().getEmDeformerSources().getVisible();
    }
}
