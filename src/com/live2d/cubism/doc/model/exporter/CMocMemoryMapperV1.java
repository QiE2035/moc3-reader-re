package com.live2d.cubism.doc.model.exporter;

import com.live2d.util.binary.CBinaryReader;
import com.live2d.util.binary.CBinaryWriter;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


/* renamed from: com.live2d.cubism.doc.model.exporter.D  reason: from Kotlin metadata */
/* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/D.class */
public final class CMocMemoryMapperV1 {
    /* renamed from: c */
    private static final int DEFAULT_OFFSET = 1984;
    /* renamed from: b */
    private final List<ACMocMemoryMapEntry> mModelSourceMemoryMap = new ArrayList<>();
    // 1984

    /* renamed from: a */
    private void initializeMemoryMap(CMocExportFormat cMocExportFormat) {
        this.mModelSourceMemoryMap.clear();
        List<ACMocMemoryMapEntry> list = this.mModelSourceMemoryMap;
        // list.add
        list.add(new MocMemoryMapCountInfoEntry());
        list.add(new MocMemoryCanvasInfoEntry());
        // EmPartSources
        list.add(new MocMemoryMapRuntimeSpaceEntry(8, 0, C1346E.INSTANCE, 2));
        list.add(new MocMemoryMapIdEntry(C1358Q.INSTANCE));
        list.add(new MocMemoryMapArrayDataEntry(0, C1395ab.INSTANCE, 1));
        list.add(new MocMemoryMapArrayDataEntry(0, C1406am.INSTANCE, 1));
        list.add(new MocMemoryMapArrayDataEntry(0, C1417ax.INSTANCE, 1));
        list.add(new MocMemoryMapArrayDataEntry(0, C1376aI.INSTANCE, 1));
        list.add(new MocMemoryMapArrayDataEntry(0, C1387aT.INSTANCE, 1));
        list.add(new MocMemoryMapArrayDataEntry(0, C1444be.INSTANCE, 1));
        // EmDeformerSources
        list.add(new MocMemoryMapRuntimeSpaceEntry(8, 0, C1455bp.INSTANCE, 2));
        list.add(new MocMemoryMapIdEntry(C1347F.f3518a));
        list.add(new MocMemoryMapArrayDataEntry(0, C1349H.f3520a, 1));
        list.add(new MocMemoryMapArrayDataEntry(0, C1350I.f3521a, 1));
        list.add(new MocMemoryMapArrayDataEntry(0, C1351J.f3522a, 1));
        list.add(new MocMemoryMapArrayDataEntry(0, C1352K.f3523a, 1));
        list.add(new MocMemoryMapArrayDataEntry(0, C1353L.f3524a, 1));
        list.add(new MocMemoryMapArrayDataEntry(0, C1354M.f3525a, 1));
        list.add(new MocMemoryMapArrayDataEntry(0, C1355N.f3526a, 1));
        // EmWarpDeformerSpecificSources
        list.add(new MocMemoryMapArrayDataEntry(0, C1356O.f3527a, 1));
        list.add(new MocMemoryMapArrayDataEntry(0, C1357P.f3528a, 1));
        list.add(new MocMemoryMapArrayDataEntry(0, C1359R.f3530a, 1));
        list.add(new MocMemoryMapArrayDataEntry(0, C1360S.f3531a, 1));
        list.add(new MocMemoryMapArrayDataEntry(0, C1361T.f3532a, 1));
        list.add(new MocMemoryMapArrayDataEntry(0, C1362U.f3533a, 1));
        // EmRotationDeformerSpecificSources
        list.add(new MocMemoryMapArrayDataEntry(0, C1363V.f3534a, 1));
        list.add(new MocMemoryMapArrayDataEntry(0, C1364W.f3535a, 1));
        list.add(new MocMemoryMapArrayDataEntry(0, C1365X.f3536a, 1));
        list.add(new MocMemoryMapArrayDataEntry(0, C1366Y.f3537a, 1));
        // EmArtMeshSources
        list.add(new MocMemoryMapRuntimeSpaceEntry(8, 0, C1367Z.f3538a, 2));
        list.add(new MocMemoryMapRuntimeSpaceEntry(8, 0, C1394aa.f3568a, 2));
        list.add(new MocMemoryMapRuntimeSpaceEntry(8, 0, C1396ac.f3570a, 2));
        list.add(new MocMemoryMapRuntimeSpaceEntry(8, 0, C1397ad.f3571a, 2));
        list.add(new MocMemoryMapIdEntry(C1398ae.f3572a));
        list.add(new MocMemoryMapArrayDataEntry(0, C1399af.INSTANCE, 1));
        list.add(new MocMemoryMapArrayDataEntry(0, C1400ag.f3574a, 1));
        list.add(new MocMemoryMapArrayDataEntry(0, C1401ah.f3575a, 1));
        list.add(new MocMemoryMapArrayDataEntry(0, C1402ai.f3576a, 1));
        list.add(new MocMemoryMapArrayDataEntry(0, C1403aj.f3577a, 1));
        list.add(new MocMemoryMapArrayDataEntry(0, C1404ak.f3578a, 1));
        list.add(new MocMemoryMapArrayDataEntry(0, C1405al.f3579a, 1));
        list.add(new MocMemoryMapArrayDataEntry(0, C1407an.f3581a, 1));
        list.add(new MocMemoryMapArrayDataEntry(0, C1408ao.f3582a, 1));
        list.add(new MocMemoryMapArrayDataEntry(0, C1409ap.f3583a, 1));
        list.add(new MocMemoryMapArrayDataEntry(0, C1410aq.f3584a, 1));
        list.add(new MocMemoryMapArrayDataEntry(0, C1411ar.f3585a, 1));
        list.add(new MocMemoryMapArrayDataEntry(0, C1412as.f3586a, 1));
        list.add(new MocMemoryMapArrayDataEntry(0, C1413at.f3587a, 1));
        list.add(new MocMemoryMapArrayDataEntry(0, C1414au.f3588a, 1));
        // EmParameterSources
        list.add(new MocMemoryMapRuntimeSpaceEntry(8, 0, C1415av.f3589a, 2));
        list.add(new MocMemoryMapIdEntry(C1416aw.f3590a));
        list.add(new MocMemoryMapArrayDataEntry(0, C1418ay.f3592a, 1));
        list.add(new MocMemoryMapArrayDataEntry(0, C1419az.f3593a, 1));
        list.add(new MocMemoryMapArrayDataEntry(0, C1368aA.f3542a, 1));
        list.add(new MocMemoryMapArrayDataEntry(0, C1369aB.f3543a, 1));
        list.add(new MocMemoryMapArrayDataEntry(0, C1370aC.f3544a, 1));
        list.add(new MocMemoryMapArrayDataEntry(0, C1371aD.f3545a, 1));
        list.add(new MocMemoryMapArrayDataEntry(0, C1372aE.f3546a, 1));
        // EmPartKeyformSources
        list.add(new MocMemoryMapArrayDataEntry(0, C1373aF.f3547a, 1));
        // EmWarpDeformerKeyformSources
        list.add(new MocMemoryMapArrayDataEntry(0, C1374aG.f3548a, 1));
        list.add(new MocMemoryMapArrayDataEntry(0, C1375aH.f3549a, 1));
        // EmRotationDeformerKeyformSources
        list.add(new MocMemoryMapArrayDataEntry(0, C1377aJ.f3551a, 1));
        list.add(new MocMemoryMapArrayDataEntry(0, C1378aK.f3552a, 1));
        list.add(new MocMemoryMapArrayDataEntry(0, C1379aL.f3553a, 1));
        list.add(new MocMemoryMapArrayDataEntry(0, C1380aM.f3554a, 1));
        list.add(new MocMemoryMapArrayDataEntry(0, C1381aN.f3555a, 1));
        list.add(new MocMemoryMapArrayDataEntry(0, C1382aO.f3556a, 1));
        list.add(new MocMemoryMapArrayDataEntry(0, C1383aP.f3557a, 1));
        // EmArtMeshKeyformSources
        list.add(new MocMemoryMapArrayDataEntry(0, C1384aQ.f3558a, 1));
        list.add(new MocMemoryMapArrayDataEntry(0, C1385aR.f3559a, 1));
        list.add(new MocMemoryMapArrayDataEntry(0, C1386aS.f3560a, 1));
        // EmKeyformPositionSources
        list.add(new MocMemoryMapArrayDataEntry(0, C1388aU.f3562a, 1));
        // EmKeyformBindingIndexSources
        list.add(new MocMemoryMapArrayDataEntry(0, C1389aV.f3563a, 1));
        // EmKeyformBindingBandSources
        list.add(new MocMemoryMapArrayDataEntry(0, C1390aW.f3564a, 1));
        list.add(new MocMemoryMapArrayDataEntry(0, C1391aX.f3565a, 1));
        // EmKeyformBindingBandSources
        list.add(new MocMemoryMapArrayDataEntry(0, C1392aY.f3566a, 1));
        list.add(new MocMemoryMapArrayDataEntry(0, C1393aZ.f3567a, 1));
        // EmKeysSources
        list.add(new MocMemoryMapArrayDataEntry(0, C1440ba.f3747a, 1));
        // EmUvSources
        list.add(new MocMemoryMapArrayDataEntry(0, C1441bb.f3748a, 1));
        // EmCountInfo
        list.add(new MocMemoryMapArrayDataEntry(0, C1442bc.f3749a, 1));
        // EmDrawableMaskSources
        list.add(new MocMemoryMapArrayDataEntry(0, C1443bd.f3750a, 1));
        // EmDrawOrderGroupSources
        list.add(new MocMemoryMapArrayDataEntry(0, C1445bf.f3752a, 1));
        list.add(new MocMemoryMapArrayDataEntry(0, C1446bg.f3753a, 1));
        list.add(new MocMemoryMapArrayDataEntry(0, C1447bh.f3754a, 1));
        list.add(new MocMemoryMapArrayDataEntry(0, C1448bi.f3755a, 1));
        list.add(new MocMemoryMapArrayDataEntry(0, C1449bj.f3756a, 1));
        // EmDrawOrderGroupObjectSources
        list.add(new MocMemoryMapArrayDataEntry(0, C1450bk.f3757a, 1));
        list.add(new MocMemoryMapArrayDataEntry(0, C1451bl.f3758a, 1));
        list.add(new MocMemoryMapArrayDataEntry(0, C1452bm.f3759a, 1));
        // EmGlueSources
        list.add(new MocMemoryMapRuntimeSpaceEntry(8, 0, C1453bn.f3760a, 2));
        list.add(new MocMemoryMapIdEntry(C1454bo.f3761a));
        list.add(new MocMemoryMapArrayDataEntry(0, C1456bq.f3763a, 1));
        list.add(new MocMemoryMapArrayDataEntry(0, C1457br.f3764a, 1));
        list.add(new MocMemoryMapArrayDataEntry(0, C1458bs.f3765a, 1));
        list.add(new MocMemoryMapArrayDataEntry(0, C1459bt.f3766a, 1));
        list.add(new MocMemoryMapArrayDataEntry(0, C1460bu.f3767a, 1));
        list.add(new MocMemoryMapArrayDataEntry(0, C1461bv.f3768a, 1));
        list.add(new MocMemoryMapArrayDataEntry(0, C1462bw.f3769a, 1));
        // EmGlueInfoSources
        list.add(new MocMemoryMapArrayDataEntry(0, C1463bx.f3770a, 1));
        list.add(new MocMemoryMapArrayDataEntry(0, C1464by.f3771a, 1));
        // EmGlueKeyformSources
        list.add(new MocMemoryMapArrayDataEntry(0, C1465bz.f3772a, 1));
        // EmAdditional33Sources
        if (cMocExportFormat.getSDKVersion() >= CMocExportFormat.V3_03_00.getSDKVersion()) {
            list.add(new MocMemoryMapArrayDataEntry(0, C1348G.f3519a, 1));
        }
    }

    public EmMoc3Source read(File file) {
        CBinaryReader reader = CBinaryReader.newFromFile(file);
        EmMoc3Source moc3Source = new EmMoc3Source();
        new MocMemoryMapHeaderEntry().doReadToMemory(moc3Source, reader);
        new MocMemoryMapSectionOffsetEntry().doReadToMemory(moc3Source, reader);
        reader.setPosition(DEFAULT_OFFSET);
        initializeMemoryMap(CMocExportFormat.fromSDKVersion(moc3Source.getEmHeader().getFormatVersion()));
        List<Integer> offsets = moc3Source.getEmSectionOffset().getOffsets();
        for (int i = 0; i < mModelSourceMemoryMap.size(); i++) {
            int offset = offsets.get(i + 1);
            mModelSourceMemoryMap.get(i).doReadToMemory(moc3Source, reader);
            if (reader.getPosition() < offset) {
                reader.setPosition(offset);
            }
        }
        return moc3Source;
    }

    /* renamed from: a */
    public List<Byte> write(EmModelSourcePack pack) {
        EmMoc3Source moc3Source = pack.getEmMoc3Source();
        CBinaryWriter writer = new CBinaryWriter();
        writer.addwriteFunction(EmDeformerType.class, EmDeformerTypeWriter.INSTANCE);
        writer.addwriteFunction(EmDrawOrderGroupItemType.class, EmDrawOrderGroupItemTypeWriter.INSTANCE);
        initializeMemoryMap(pack.getCMocExportFormat());
        for (ACMocMemoryMapEntry mocMemoryMapEntry : this.mModelSourceMemoryMap) {
            mocMemoryMapEntry.writeToMemory(moc3Source, writer);
            moc3Source.getEmSectionOffset().getOffsets().add(DEFAULT_OFFSET + mocMemoryMapEntry.getBeginOffset());
        }
        CBinaryWriter writer2 = new CBinaryWriter();
        new MocMemoryMapHeaderEntry().writeToMemory(moc3Source, writer2);
        new MocMemoryMapSectionOffsetEntry().writeToMemory(moc3Source, writer2);
        writer2.fill((byte) 0, DEFAULT_OFFSET - writer2.getBytePosition());
        if (!(writer2.getBytePosition() == DEFAULT_OFFSET)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        writer2.writeArrayU1(writer.toByteArray());
        writer2.padding(64);
        return writer2.toList();
    }
}
