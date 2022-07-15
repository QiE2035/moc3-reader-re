package com.live2d.cubism.doc.model.exporter;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

import java.util.List;


/* renamed from: com.live2d.cubism.doc.model.exporter.aR */
/* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/aR.class */
final class C1385aR extends Lambda implements Function1<EmMoc3Source, List<Float>> {

    /* renamed from: a */
    public static final C1385aR f3559a = new C1385aR();


    C1385aR() {
        super();
    }

    /* renamed from: a */
    public List<Float> invoke(EmMoc3Source receiver) {

        type = Float.TYPE;
        count = receiver.getEmModelSource().getEmCountInfo().getCounts().get(9);
        return receiver.getEmModelSource().getEmArtMeshKeyformSources().getDrawOrder();
    }
}
