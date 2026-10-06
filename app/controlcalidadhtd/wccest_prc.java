package app.controlcalidadhtd ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wccest_prc extends GXProcedure
{
   public wccest_prc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wccest_prc.class ), "" );
   }

   public wccest_prc( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             byte[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             int[] aP7 ,
                             int[] aP8 ,
                             int[] aP9 ,
                             int[] aP10 ,
                             java.util.Date[] aP11 ,
                             java.util.Date[] aP12 ,
                             String[] aP13 ,
                             String[] aP14 ,
                             String[] aP15 ,
                             String[] aP16 ,
                             String[] aP17 ,
                             String[] aP18 ,
                             String[] aP19 ,
                             int[] aP20 ,
                             int[] aP21 )
   {
      wccest_prc.this.aP22 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21, aP22);
      return aP22[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        byte[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        int[] aP7 ,
                        int[] aP8 ,
                        int[] aP9 ,
                        int[] aP10 ,
                        java.util.Date[] aP11 ,
                        java.util.Date[] aP12 ,
                        String[] aP13 ,
                        String[] aP14 ,
                        String[] aP15 ,
                        String[] aP16 ,
                        String[] aP17 ,
                        String[] aP18 ,
                        String[] aP19 ,
                        int[] aP20 ,
                        int[] aP21 ,
                        String[] aP22 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21, aP22);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             byte[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             int[] aP7 ,
                             int[] aP8 ,
                             int[] aP9 ,
                             int[] aP10 ,
                             java.util.Date[] aP11 ,
                             java.util.Date[] aP12 ,
                             String[] aP13 ,
                             String[] aP14 ,
                             String[] aP15 ,
                             String[] aP16 ,
                             String[] aP17 ,
                             String[] aP18 ,
                             String[] aP19 ,
                             int[] aP20 ,
                             int[] aP21 ,
                             String[] aP22 )
   {
      wccest_prc.this.AV8EmprCod = aP0[0];
      this.aP0 = aP0;
      wccest_prc.this.AV14BarIni = aP1[0];
      this.aP1 = aP1;
      wccest_prc.this.AV13BarFin = aP2[0];
      this.aP2 = aP2;
      wccest_prc.this.AV28ReoIni = aP3[0];
      this.aP3 = aP3;
      wccest_prc.this.AV27ReoFin = aP4[0];
      this.aP4 = aP4;
      wccest_prc.this.AV26ParIni = aP5[0];
      this.aP5 = aP5;
      wccest_prc.this.AV25ParFin = aP6[0];
      this.aP6 = aP6;
      wccest_prc.this.AV20CliIni = aP7[0];
      this.aP7 = aP7;
      wccest_prc.this.AV19CliFin = aP8[0];
      this.aP8 = aP8;
      wccest_prc.this.AV18CCTIni = aP9[0];
      this.aP9 = aP9;
      wccest_prc.this.AV17CCTFin = aP10[0];
      this.aP10 = aP10;
      wccest_prc.this.AV22FchIni = aP11[0];
      this.aP11 = aP11;
      wccest_prc.this.AV21FchFin = aP12[0];
      this.aP12 = aP12;
      wccest_prc.this.AV24NivIni = aP13[0];
      this.aP13 = aP13;
      wccest_prc.this.AV23NivFin = aP14[0];
      this.aP14 = aP14;
      wccest_prc.this.AV29TipoCtr = aP15[0];
      this.aP15 = aP15;
      wccest_prc.this.AV16Barseri = aP16[0];
      this.aP16 = aP16;
      wccest_prc.this.AV15barserf = aP17[0];
      this.aP17 = aP17;
      wccest_prc.this.AV9Barcolnom = aP18[0];
      this.aP18 = aP18;
      wccest_prc.this.AV10Barcolnomf = aP19[0];
      this.aP19 = aP19;
      wccest_prc.this.AV11Barcolnum = aP20[0];
      this.aP20 = aP20;
      wccest_prc.this.AV12Barcolnumf = aP21[0];
      this.aP21 = aP21;
      wccest_prc.this.aP22 = aP22;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV30wCCEst_SDT.clear();
      AV37Wccest_json = "" ;
      /* Using cursor P0ANP2 */
      pr_default.execute(0, new Object[] {AV8EmprCod, Integer.valueOf(AV14BarIni), Integer.valueOf(AV14BarIni), Integer.valueOf(AV13BarFin), Integer.valueOf(AV13BarFin), Byte.valueOf(AV28ReoIni), Byte.valueOf(AV28ReoIni), Byte.valueOf(AV27ReoFin), Byte.valueOf(AV27ReoFin), AV26ParIni, AV26ParIni, AV25ParFin, AV25ParFin, Integer.valueOf(AV20CliIni), Integer.valueOf(AV20CliIni), Integer.valueOf(AV19CliFin), Integer.valueOf(AV19CliFin), AV16Barseri, AV16Barseri, AV15barserf, AV15barserf, AV9Barcolnom, AV9Barcolnom, AV10Barcolnomf, AV10Barcolnomf, Integer.valueOf(AV11Barcolnum), Integer.valueOf(AV11Barcolnum), Integer.valueOf(AV12Barcolnumf), Integer.valueOf(AV12Barcolnumf), Integer.valueOf(AV18CCTIni), Integer.valueOf(AV18CCTIni), Integer.valueOf(AV17CCTFin), Integer.valueOf(AV17CCTFin), AV22FchIni, AV22FchIni, AV21FchFin, AV21FchFin, AV29TipoCtr});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A135BarColNom = P0ANP2_A135BarColNom[0] ;
         A136BarColNum = P0ANP2_A136BarColNum[0] ;
         A212BarSer = P0ANP2_A212BarSer[0] ;
         A1652BarSerDsc = P0ANP2_A1652BarSerDsc[0] ;
         A4036CCTDsc = P0ANP2_A4036CCTDsc[0] ;
         A279CliNom = P0ANP2_A279CliNom[0] ;
         A194BarOrdLin = P0ANP2_A194BarOrdLin[0] ;
         A4031CCTCod = P0ANP2_A4031CCTCod[0] ;
         A758ProCod = P0ANP2_A758ProCod[0] ;
         A396EmprCod = P0ANP2_A396EmprCod[0] ;
         A4037CCTTpoCtr = P0ANP2_A4037CCTTpoCtr[0] ;
         A4033CCFch = P0ANP2_A4033CCFch[0] ;
         n4033CCFch = P0ANP2_n4033CCFch[0] ;
         A252CliCod = P0ANP2_A252CliCod[0] ;
         n252CliCod = P0ANP2_n252CliCod[0] ;
         A7691CCFchUti = P0ANP2_A7691CCFchUti[0] ;
         n7691CCFchUti = P0ANP2_n7691CCFchUti[0] ;
         A3281CcObs = P0ANP2_A3281CcObs[0] ;
         n3281CcObs = P0ANP2_n3281CcObs[0] ;
         A4032CCOpeCod = P0ANP2_A4032CCOpeCod[0] ;
         n4032CCOpeCod = P0ANP2_n4032CCOpeCod[0] ;
         A457FasCod = P0ANP2_A457FasCod[0] ;
         A130BarCodPar = P0ANP2_A130BarCodPar[0] ;
         A132BarCodReo = P0ANP2_A132BarCodReo[0] ;
         A129BarCod = P0ANP2_A129BarCod[0] ;
         A4036CCTDsc = P0ANP2_A4036CCTDsc[0] ;
         A4037CCTTpoCtr = P0ANP2_A4037CCTTpoCtr[0] ;
         A135BarColNom = P0ANP2_A135BarColNom[0] ;
         A136BarColNum = P0ANP2_A136BarColNum[0] ;
         A212BarSer = P0ANP2_A212BarSer[0] ;
         A1652BarSerDsc = P0ANP2_A1652BarSerDsc[0] ;
         A252CliCod = P0ANP2_A252CliCod[0] ;
         n252CliCod = P0ANP2_n252CliCod[0] ;
         A279CliNom = P0ANP2_A279CliNom[0] ;
         A457FasCod = P0ANP2_A457FasCod[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         AV32Ccobs = A3281CcObs ;
         AV38Ccfch = A4033CCFch ;
         AV39Ccopecod = A4032CCOpeCod ;
         GXv_char1[0] = AV34Openom ;
         new app.popenom(remoteHandle, context).execute( A396EmprCod, A4032CCOpeCod, GXv_char1) ;
         wccest_prc.this.AV34Openom = GXv_char1[0] ;
         AV35Nlin = (short)(GXutil.gxmlines( AV32Ccobs, (short)(100))) ;
         AV36Obs = GXutil.gxgetmli( AV32Ccobs, (short)(1), (short)(100)) ;
         GXv_char1[0] = AV33fasDsc ;
         new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A457FasCod, GXv_char1) ;
         wccest_prc.this.AV33fasDsc = GXv_char1[0] ;
         AV41Fascod = A457FasCod ;
         /* Using cursor P0ANP3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod), AV24NivIni, AV24NivIni, AV23NivFin, AV23NivFin});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A4035CCVal = P0ANP3_A4035CCVal[0] ;
            A12750CCOkLin = P0ANP3_A12750CCOkLin[0] ;
            A4043CCTLinDsc = P0ANP3_A4043CCTLinDsc[0] ;
            A4034CCTLin = P0ANP3_A4034CCTLin[0] ;
            A4043CCTLinDsc = P0ANP3_A4043CCTLinDsc[0] ;
            AV31wCCEst_SDTItem = (app.controlcalidadhtd.SdtwCCEst_SDT_Item)new app.controlcalidadhtd.SdtwCCEst_SDT_Item(remoteHandle, context);
            AV31wCCEst_SDTItem.setgxTv_SdtwCCEst_SDT_Item_Barcolnom( A135BarColNom );
            AV31wCCEst_SDTItem.setgxTv_SdtwCCEst_SDT_Item_Barcolnum( A136BarColNum );
            AV31wCCEst_SDTItem.setgxTv_SdtwCCEst_SDT_Item_Barnhdr( A13696BarNHdr );
            AV31wCCEst_SDTItem.setgxTv_SdtwCCEst_SDT_Item_Barser( A212BarSer );
            AV31wCCEst_SDTItem.setgxTv_SdtwCCEst_SDT_Item_Barserdsc( A1652BarSerDsc );
            AV31wCCEst_SDTItem.setgxTv_SdtwCCEst_SDT_Item_Ccfch( AV38Ccfch );
            AV31wCCEst_SDTItem.setgxTv_SdtwCCEst_SDT_Item_Ccopecod( AV39Ccopecod );
            AV31wCCEst_SDTItem.setgxTv_SdtwCCEst_SDT_Item_Cctcod( A4031CCTCod );
            AV31wCCEst_SDTItem.setgxTv_SdtwCCEst_SDT_Item_Cctdsc( A4036CCTDsc );
            AV31wCCEst_SDTItem.setgxTv_SdtwCCEst_SDT_Item_Cctlin( A4034CCTLin );
            AV31wCCEst_SDTItem.setgxTv_SdtwCCEst_SDT_Item_Cctlindsc( A4043CCTLinDsc );
            AV31wCCEst_SDTItem.setgxTv_SdtwCCEst_SDT_Item_Cctval( A4035CCVal );
            AV31wCCEst_SDTItem.setgxTv_SdtwCCEst_SDT_Item_Clinom( A279CliNom );
            AV31wCCEst_SDTItem.setgxTv_SdtwCCEst_SDT_Item_Fascod( AV41Fascod );
            AV31wCCEst_SDTItem.setgxTv_SdtwCCEst_SDT_Item_Fasdsc( AV33fasDsc );
            AV31wCCEst_SDTItem.setgxTv_SdtwCCEst_SDT_Item_Openom( AV34Openom );
            AV31wCCEst_SDTItem.setgxTv_SdtwCCEst_SDT_Item_Procod( A758ProCod );
            AV31wCCEst_SDTItem.setgxTv_SdtwCCEst_SDT_Item_Obs( AV36Obs );
            AV30wCCEst_SDT.add(AV31wCCEst_SDTItem, 0);
            pr_default.readNext(1);
         }
         pr_default.close(1);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV37Wccest_json = AV30wCCEst_SDT.toJSonString(false) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = wccest_prc.this.AV8EmprCod;
      this.aP1[0] = wccest_prc.this.AV14BarIni;
      this.aP2[0] = wccest_prc.this.AV13BarFin;
      this.aP3[0] = wccest_prc.this.AV28ReoIni;
      this.aP4[0] = wccest_prc.this.AV27ReoFin;
      this.aP5[0] = wccest_prc.this.AV26ParIni;
      this.aP6[0] = wccest_prc.this.AV25ParFin;
      this.aP7[0] = wccest_prc.this.AV20CliIni;
      this.aP8[0] = wccest_prc.this.AV19CliFin;
      this.aP9[0] = wccest_prc.this.AV18CCTIni;
      this.aP10[0] = wccest_prc.this.AV17CCTFin;
      this.aP11[0] = wccest_prc.this.AV22FchIni;
      this.aP12[0] = wccest_prc.this.AV21FchFin;
      this.aP13[0] = wccest_prc.this.AV24NivIni;
      this.aP14[0] = wccest_prc.this.AV23NivFin;
      this.aP15[0] = wccest_prc.this.AV29TipoCtr;
      this.aP16[0] = wccest_prc.this.AV16Barseri;
      this.aP17[0] = wccest_prc.this.AV15barserf;
      this.aP18[0] = wccest_prc.this.AV9Barcolnom;
      this.aP19[0] = wccest_prc.this.AV10Barcolnomf;
      this.aP20[0] = wccest_prc.this.AV11Barcolnum;
      this.aP21[0] = wccest_prc.this.AV12Barcolnumf;
      this.aP22[0] = wccest_prc.this.AV37Wccest_json;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV37Wccest_json = "" ;
      AV30wCCEst_SDT = new GXBaseCollection<app.controlcalidadhtd.SdtwCCEst_SDT_Item>(app.controlcalidadhtd.SdtwCCEst_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      P0ANP2_A135BarColNom = new String[] {""} ;
      P0ANP2_A136BarColNum = new int[1] ;
      P0ANP2_A212BarSer = new String[] {""} ;
      P0ANP2_A1652BarSerDsc = new String[] {""} ;
      P0ANP2_A4036CCTDsc = new String[] {""} ;
      P0ANP2_A279CliNom = new String[] {""} ;
      P0ANP2_A194BarOrdLin = new short[1] ;
      P0ANP2_A4031CCTCod = new int[1] ;
      P0ANP2_A758ProCod = new String[] {""} ;
      P0ANP2_A396EmprCod = new String[] {""} ;
      P0ANP2_A4037CCTTpoCtr = new String[] {""} ;
      P0ANP2_A4033CCFch = new java.util.Date[] {GXutil.nullDate()} ;
      P0ANP2_n4033CCFch = new boolean[] {false} ;
      P0ANP2_A252CliCod = new int[1] ;
      P0ANP2_n252CliCod = new boolean[] {false} ;
      P0ANP2_A7691CCFchUti = new java.util.Date[] {GXutil.nullDate()} ;
      P0ANP2_n7691CCFchUti = new boolean[] {false} ;
      P0ANP2_A3281CcObs = new String[] {""} ;
      P0ANP2_n3281CcObs = new boolean[] {false} ;
      P0ANP2_A4032CCOpeCod = new int[1] ;
      P0ANP2_n4032CCOpeCod = new boolean[] {false} ;
      P0ANP2_A457FasCod = new String[] {""} ;
      P0ANP2_A130BarCodPar = new String[] {""} ;
      P0ANP2_A132BarCodReo = new byte[1] ;
      P0ANP2_A129BarCod = new int[1] ;
      A135BarColNom = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A4036CCTDsc = "" ;
      A279CliNom = "" ;
      A758ProCod = "" ;
      A396EmprCod = "" ;
      A4037CCTTpoCtr = "" ;
      A4033CCFch = GXutil.nullDate() ;
      A7691CCFchUti = GXutil.nullDate() ;
      A3281CcObs = "" ;
      A457FasCod = "" ;
      A130BarCodPar = "" ;
      A13696BarNHdr = "" ;
      AV32Ccobs = "" ;
      AV38Ccfch = GXutil.nullDate() ;
      AV34Openom = "" ;
      AV36Obs = "" ;
      AV33fasDsc = "" ;
      GXv_char1 = new String[1] ;
      AV41Fascod = "" ;
      P0ANP3_A396EmprCod = new String[] {""} ;
      P0ANP3_A129BarCod = new int[1] ;
      P0ANP3_A132BarCodReo = new byte[1] ;
      P0ANP3_A130BarCodPar = new String[] {""} ;
      P0ANP3_A758ProCod = new String[] {""} ;
      P0ANP3_A194BarOrdLin = new short[1] ;
      P0ANP3_A4031CCTCod = new int[1] ;
      P0ANP3_A4035CCVal = new String[] {""} ;
      P0ANP3_A12750CCOkLin = new byte[1] ;
      P0ANP3_A4043CCTLinDsc = new String[] {""} ;
      P0ANP3_A4034CCTLin = new short[1] ;
      A4035CCVal = "" ;
      A4043CCTLinDsc = "" ;
      AV31wCCEst_SDTItem = new app.controlcalidadhtd.SdtwCCEst_SDT_Item(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.wccest_prc__default(),
         new Object[] {
             new Object[] {
            P0ANP2_A135BarColNom, P0ANP2_A136BarColNum, P0ANP2_A212BarSer, P0ANP2_A1652BarSerDsc, P0ANP2_A4036CCTDsc, P0ANP2_A279CliNom, P0ANP2_A194BarOrdLin, P0ANP2_A4031CCTCod, P0ANP2_A758ProCod, P0ANP2_A396EmprCod,
            P0ANP2_A4037CCTTpoCtr, P0ANP2_A4033CCFch, P0ANP2_n4033CCFch, P0ANP2_A252CliCod, P0ANP2_n252CliCod, P0ANP2_A7691CCFchUti, P0ANP2_n7691CCFchUti, P0ANP2_A3281CcObs, P0ANP2_n3281CcObs, P0ANP2_A4032CCOpeCod,
            P0ANP2_n4032CCOpeCod, P0ANP2_A457FasCod, P0ANP2_A130BarCodPar, P0ANP2_A132BarCodReo, P0ANP2_A129BarCod
            }
            , new Object[] {
            P0ANP3_A396EmprCod, P0ANP3_A129BarCod, P0ANP3_A132BarCodReo, P0ANP3_A130BarCodPar, P0ANP3_A758ProCod, P0ANP3_A194BarOrdLin, P0ANP3_A4031CCTCod, P0ANP3_A4035CCVal, P0ANP3_A12750CCOkLin, P0ANP3_A4043CCTLinDsc,
            P0ANP3_A4034CCTLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV28ReoIni ;
   private byte AV27ReoFin ;
   private byte A132BarCodReo ;
   private byte A12750CCOkLin ;
   private short A194BarOrdLin ;
   private short AV35Nlin ;
   private short A4034CCTLin ;
   private short Gx_err ;
   private int AV14BarIni ;
   private int AV13BarFin ;
   private int AV20CliIni ;
   private int AV19CliFin ;
   private int AV18CCTIni ;
   private int AV17CCTFin ;
   private int AV11Barcolnum ;
   private int AV12Barcolnumf ;
   private int A136BarColNum ;
   private int A4031CCTCod ;
   private int A252CliCod ;
   private int A4032CCOpeCod ;
   private int A129BarCod ;
   private int AV39Ccopecod ;
   private String AV8EmprCod ;
   private String AV26ParIni ;
   private String AV25ParFin ;
   private String AV24NivIni ;
   private String AV23NivFin ;
   private String AV29TipoCtr ;
   private String AV16Barseri ;
   private String AV15barserf ;
   private String AV9Barcolnom ;
   private String AV10Barcolnomf ;
   private String scmdbuf ;
   private String A135BarColNom ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A4036CCTDsc ;
   private String A279CliNom ;
   private String A758ProCod ;
   private String A396EmprCod ;
   private String A4037CCTTpoCtr ;
   private String A457FasCod ;
   private String A130BarCodPar ;
   private String A13696BarNHdr ;
   private String AV34Openom ;
   private String AV33fasDsc ;
   private String GXv_char1[] ;
   private String AV41Fascod ;
   private String A4035CCVal ;
   private String A4043CCTLinDsc ;
   private java.util.Date AV22FchIni ;
   private java.util.Date AV21FchFin ;
   private java.util.Date A4033CCFch ;
   private java.util.Date A7691CCFchUti ;
   private java.util.Date AV38Ccfch ;
   private boolean n4033CCFch ;
   private boolean n252CliCod ;
   private boolean n7691CCFchUti ;
   private boolean n3281CcObs ;
   private boolean n4032CCOpeCod ;
   private String AV37Wccest_json ;
   private String A3281CcObs ;
   private String AV32Ccobs ;
   private String AV36Obs ;
   private String[] aP22 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private byte[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private int[] aP7 ;
   private int[] aP8 ;
   private int[] aP9 ;
   private int[] aP10 ;
   private java.util.Date[] aP11 ;
   private java.util.Date[] aP12 ;
   private String[] aP13 ;
   private String[] aP14 ;
   private String[] aP15 ;
   private String[] aP16 ;
   private String[] aP17 ;
   private String[] aP18 ;
   private String[] aP19 ;
   private int[] aP20 ;
   private int[] aP21 ;
   private IDataStoreProvider pr_default ;
   private String[] P0ANP2_A135BarColNom ;
   private int[] P0ANP2_A136BarColNum ;
   private String[] P0ANP2_A212BarSer ;
   private String[] P0ANP2_A1652BarSerDsc ;
   private String[] P0ANP2_A4036CCTDsc ;
   private String[] P0ANP2_A279CliNom ;
   private short[] P0ANP2_A194BarOrdLin ;
   private int[] P0ANP2_A4031CCTCod ;
   private String[] P0ANP2_A758ProCod ;
   private String[] P0ANP2_A396EmprCod ;
   private String[] P0ANP2_A4037CCTTpoCtr ;
   private java.util.Date[] P0ANP2_A4033CCFch ;
   private boolean[] P0ANP2_n4033CCFch ;
   private int[] P0ANP2_A252CliCod ;
   private boolean[] P0ANP2_n252CliCod ;
   private java.util.Date[] P0ANP2_A7691CCFchUti ;
   private boolean[] P0ANP2_n7691CCFchUti ;
   private String[] P0ANP2_A3281CcObs ;
   private boolean[] P0ANP2_n3281CcObs ;
   private int[] P0ANP2_A4032CCOpeCod ;
   private boolean[] P0ANP2_n4032CCOpeCod ;
   private String[] P0ANP2_A457FasCod ;
   private String[] P0ANP2_A130BarCodPar ;
   private byte[] P0ANP2_A132BarCodReo ;
   private int[] P0ANP2_A129BarCod ;
   private String[] P0ANP3_A396EmprCod ;
   private int[] P0ANP3_A129BarCod ;
   private byte[] P0ANP3_A132BarCodReo ;
   private String[] P0ANP3_A130BarCodPar ;
   private String[] P0ANP3_A758ProCod ;
   private short[] P0ANP3_A194BarOrdLin ;
   private int[] P0ANP3_A4031CCTCod ;
   private String[] P0ANP3_A4035CCVal ;
   private byte[] P0ANP3_A12750CCOkLin ;
   private String[] P0ANP3_A4043CCTLinDsc ;
   private short[] P0ANP3_A4034CCTLin ;
   private GXBaseCollection<app.controlcalidadhtd.SdtwCCEst_SDT_Item> AV30wCCEst_SDT ;
   private app.controlcalidadhtd.SdtwCCEst_SDT_Item AV31wCCEst_SDTItem ;
}

final  class wccest_prc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ANP2", "SELECT T3.BarColNom, T3.BarColNum, T3.BarSer, T3.BarSerDsc, T2.CCTDsc, T4.CliNom, T1.BarOrdLin, T1.CCTCod, T1.ProCod, T1.EmprCod, T2.CCTTpoCtr, T1.CCFch, T3.CliCod, T1.CCFchUti, T1.CcObs, T1.CCOpeCod, T5.FasCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod FROM ((((TXPCC T1 INNER JOIN TXPCCDef T2 ON T2.EmprCod = T1.EmprCod AND T2.CCTCod = T1.CCTCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T3.CliCod) INNER JOIN TXPBARFAS T5 ON T5.EmprCod = T1.EmprCod AND T5.BarCod = T1.BarCod AND T5.BarCodReo = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar AND T5.ProCod = T1.ProCod AND T5.BarOrdLin = T1.BarOrdLin) WHERE (T1.EmprCod = ?) AND (T1.BarCod >= ? or ( (? = 0))) AND (T1.BarCod <= ? or ( (? = 0))) AND (T1.BarCodReo >= ? or ( (? = 0))) AND (T1.BarCodReo <= ? or ( (? = 0))) AND (T1.BarCodPar >= ? or ( (rtrim(?) IS NULL))) AND (T1.BarCodPar <= ? or ( (rtrim(?) IS NULL))) AND (T3.CliCod >= ? or ( (? = 0))) AND (T3.CliCod <= ? or ( (? = 0))) AND (T3.BarSer >= ? or (rtrim(?) IS NULL)) AND (T3.BarSer <= ? or (rtrim(?) IS NULL)) AND (T3.BarColNom >= ? or (rtrim(?) IS NULL)) AND (T3.BarColNom <= ? or (rtrim(?) IS NULL)) AND (T3.BarColNum >= ? or (? = 0)) AND (T3.BarColNum <= ? or (? = 0)) AND (T1.CCTCod >= ? or ( (? = 0))) AND (T1.CCTCod <= ? or ( (? = 0))) AND (T1.CCFch >= ? or ( (? = TO_DATE('0001-01-01', 'YYYY-MM-DD')))) AND (T1.CCFch <= ? or ( (? = TO_DATE('0001-01-01', 'YYYY-MM-DD')))) AND (T2.CCTTpoCtr = ?) ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin, T1.CCTCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0ANP3", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin, T1.CCTCod, T1.CCVal, T1.CCOkLin, T2.CCTLinDsc, T1.CCTLin FROM (TXPCC1 T1 INNER JOIN TXPCCDef1 T2 ON T2.EmprCod = T1.EmprCod AND T2.CCTCod = T1.CCTCod AND T2.CCTLin = T1.CCTLin) WHERE (T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.ProCod = ? and T1.BarOrdLin = ? and T1.CCTCod = ?) AND (RTRIM(LTRIM(T1.CCVal)) >= ? or ( (rtrim(?) IS NULL))) AND (RTRIM(LTRIM(T1.CCVal)) <= ? or ( (rtrim(?) IS NULL))) ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin, T1.CCTCod, T1.CCTLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 13);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 8);
               ((String[]) buf[9])[0] = rslt.getString(10, 3);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(12);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(13);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(14);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(15);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((int[]) buf[19])[0] = rslt.getInt(16);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(17, 8);
               ((String[]) buf[22])[0] = rslt.getString(18, 1);
               ((byte[]) buf[23])[0] = rslt.getByte(19);
               ((int[]) buf[24])[0] = rslt.getInt(20);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 40);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 30);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               stmt.setString(10, (String)parms[9], 1);
               stmt.setString(11, (String)parms[10], 1);
               stmt.setString(12, (String)parms[11], 1);
               stmt.setString(13, (String)parms[12], 1);
               stmt.setInt(14, ((Number) parms[13]).intValue());
               stmt.setInt(15, ((Number) parms[14]).intValue());
               stmt.setInt(16, ((Number) parms[15]).intValue());
               stmt.setInt(17, ((Number) parms[16]).intValue());
               stmt.setString(18, (String)parms[17], 16);
               stmt.setString(19, (String)parms[18], 16);
               stmt.setString(20, (String)parms[19], 16);
               stmt.setString(21, (String)parms[20], 16);
               stmt.setString(22, (String)parms[21], 13);
               stmt.setString(23, (String)parms[22], 13);
               stmt.setString(24, (String)parms[23], 13);
               stmt.setString(25, (String)parms[24], 13);
               stmt.setInt(26, ((Number) parms[25]).intValue());
               stmt.setInt(27, ((Number) parms[26]).intValue());
               stmt.setInt(28, ((Number) parms[27]).intValue());
               stmt.setInt(29, ((Number) parms[28]).intValue());
               stmt.setInt(30, ((Number) parms[29]).intValue());
               stmt.setInt(31, ((Number) parms[30]).intValue());
               stmt.setInt(32, ((Number) parms[31]).intValue());
               stmt.setInt(33, ((Number) parms[32]).intValue());
               stmt.setDate(34, (java.util.Date)parms[33]);
               stmt.setDate(35, (java.util.Date)parms[34]);
               stmt.setDate(36, (java.util.Date)parms[35]);
               stmt.setDate(37, (java.util.Date)parms[36]);
               stmt.setString(38, (String)parms[37], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setString(8, (String)parms[7], 1);
               stmt.setString(9, (String)parms[8], 1);
               stmt.setString(10, (String)parms[9], 1);
               stmt.setString(11, (String)parms[10], 1);
               return;
      }
   }

}

