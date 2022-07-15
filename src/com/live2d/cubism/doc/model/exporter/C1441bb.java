package com.live2d.cubism.doc.model.exporter;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

import java.util.List;


/* renamed from: com.live2d.cubism.doc.model.exporter.bb */
/* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/bb.class */
final class C1441bb extends Lambda implements Function1<EmMoc3Source, List<Float>> {

    /* renamed from: a */
    public static final C1441bb f3748a = new C1441bb();


    C1441bb() {
        super();
    }

    /* renamed from: a */
    public List<Float> invoke(EmMoc3Source receiver) {
        //Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        type = Float.TYPE;
        count = receiver.getEmModelSource().getEmCountInfo().getCounts().get(15);
        return receiver.getEmModelSource().getEmUvSources().getXY();
    }
}
