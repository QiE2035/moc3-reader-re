package com.live2d.cubism.doc.model.exporter;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

import java.util.List;


/* renamed from: com.live2d.cubism.doc.model.exporter.aB */
/* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/aB.class */
final class C1369aB extends Lambda implements Function1<EmMoc3Source, List<Boolean>> {

    /* renamed from: a */
    public static final C1369aB f3543a = new C1369aB();


    C1369aB() {
        super();
    }

    /* renamed from: a */
    public List<Boolean> invoke(EmMoc3Source receiver) {

        count = receiver.getEmModelSource().getEmCountInfo().getCounts().get(5);
        type = Boolean.TYPE;
        return receiver.getEmModelSource().getEmParameterSources().getRepeat();
    }
}
