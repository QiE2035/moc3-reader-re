package com.live2d.cubism.doc.model.exporter;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

import java.util.List;


/* renamed from: com.live2d.cubism.doc.model.exporter.aj */
/* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/aj.class */
final class C1403aj extends Lambda implements Function1<EmMoc3Source, List<Boolean>> {

    /* renamed from: a */
    public static final C1403aj f3577a = new C1403aj();


    C1403aj() {
        super();
    }

    /* renamed from: a */
    public List<Boolean> invoke(EmMoc3Source receiver) {

        type = Boolean.TYPE;
        count = receiver.getEmModelSource().getEmCountInfo().getCounts().get(4);
        return receiver.getEmModelSource().getEmArtMeshSources().getEnable();
    }
}
