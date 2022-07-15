package com.live2d.cubism.doc.model.exporter;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

import java.util.List;


/* renamed from: com.live2d.cubism.doc.model.exporter.bo */
/* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/bo.class */
final class C1454bo extends Lambda implements Function1<EmMoc3Source, List<String>> {

    /* renamed from: a */
    public static final C1454bo f3761a = new C1454bo();


    C1454bo() {
        super();
    }

    /* renamed from: a */
    public List<String> invoke(EmMoc3Source receiver) {
        //Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        count = receiver.getEmModelSource().getEmCountInfo().getCounts().get(20);
        return receiver.getEmModelSource().getEmGlueSources().getID();
    }
}
