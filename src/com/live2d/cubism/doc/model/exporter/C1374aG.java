package com.live2d.cubism.doc.model.exporter;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

import java.util.List;


/* renamed from: com.live2d.cubism.doc.model.exporter.aG */
/* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/aG.class */
final class C1374aG extends Lambda implements Function1<EmMoc3Source, List<Float>> {

    /* renamed from: a */
    public static final C1374aG f3548a = new C1374aG();


    C1374aG() {
        super();
    }

    /* renamed from: a */
    public List<Float> invoke(EmMoc3Source receiver) {
        //Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        count = receiver.getEmModelSource().getEmCountInfo().getCounts().get(7);
        type = Float.TYPE;
        return receiver.getEmModelSource().getEmWarpDeformerKeyformSources().getOpacity();
    }
}
