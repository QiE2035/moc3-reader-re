package com.live2d.cubism.doc.model.exporter;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

import java.util.List;


/* renamed from: com.live2d.cubism.doc.model.exporter.aT */
/* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/aT.class */
final class C1387aT extends Lambda implements Function1<EmMoc3Source, List<Boolean>> {

    /* renamed from: a */
    public static final C1387aT INSTANCE = new C1387aT();


    C1387aT() {
        super();
    }

    /* renamed from: a */
    public List<Boolean> invoke(EmMoc3Source receiver) {

        type = Boolean.TYPE;
        count = receiver.getEmModelSource().getEmCountInfo().getCounts().get(0);
        return receiver.getEmModelSource().getEmPartSources().getEnable();
    }
}
