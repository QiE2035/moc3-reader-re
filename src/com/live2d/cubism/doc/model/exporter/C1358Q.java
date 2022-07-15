package com.live2d.cubism.doc.model.exporter;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

import java.util.List;


/* renamed from: com.live2d.cubism.doc.model.exporter.Q */
/* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/Q.class */
final class C1358Q extends Lambda implements Function1<EmMoc3Source, List<String>> {

    /* renamed from: a */
    public static final C1358Q INSTANCE = new C1358Q();


    C1358Q() {
        super();
    }

    /* renamed from: a */
    public List<String> invoke(EmMoc3Source receiver) {
        //Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        count = receiver.getEmModelSource().getEmCountInfo().getCounts().get(0);
        return receiver.getEmModelSource().getEmPartSources().getID();
    }
}
