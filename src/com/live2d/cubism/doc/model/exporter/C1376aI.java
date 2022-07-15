package com.live2d.cubism.doc.model.exporter;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

import java.util.List;


/* renamed from: com.live2d.cubism.doc.model.exporter.aI */
/* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/aI.class */
final class C1376aI extends Lambda implements Function1<EmMoc3Source, List<Boolean>> {

    /* renamed from: a */
    public static final C1376aI INSTANCE = new C1376aI();


    C1376aI() {
        super();
    }

    /* renamed from: a */
    public List<Boolean> invoke(EmMoc3Source receiver) {

        type = Boolean.TYPE;
        count = receiver.getEmModelSource().getEmCountInfo().getCounts().get(0);
        return receiver.getEmModelSource().getEmPartSources().getVisible();
    }
}
