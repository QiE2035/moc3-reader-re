package com.live2d.cubism.doc.model.exporter;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

import java.util.List;


/* renamed from: com.live2d.cubism.doc.model.exporter.aQ */
/* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/aQ.class */
final class C1384aQ extends Lambda implements Function1<EmMoc3Source, List<Float>> {

    /* renamed from: a */
    public static final C1384aQ f3558a = new C1384aQ();


    C1384aQ() {
        super();
    }

    /* renamed from: a */
    public List<Float> invoke(EmMoc3Source receiver) {
        //Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        type = Float.TYPE;
        count = receiver.getEmModelSource().getEmCountInfo().getCounts().get(9);
        return receiver.getEmModelSource().getEmArtMeshKeyformSources().getOpacity();
    }
}
