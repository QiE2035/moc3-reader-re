package com.live2d.cubism.doc.model.exporter;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

import java.util.List;


/* renamed from: com.live2d.cubism.doc.model.exporter.aJ */
/* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/aJ.class */
final class C1377aJ extends Lambda implements Function1<EmMoc3Source, List<Float>> {

    /* renamed from: a */
    public static final C1377aJ f3551a = new C1377aJ();


    C1377aJ() {
        super();
    }

    /* renamed from: a */
    public List<Float> invoke(EmMoc3Source receiver) {

        type = Float.TYPE;
        count = receiver.getEmModelSource().getEmCountInfo().getCounts().get(8);
        return receiver.getEmModelSource().getEmRotationDeformerKeyformSources().getOpacity();
    }
}
