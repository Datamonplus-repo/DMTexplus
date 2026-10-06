package app.controlcalidadhtd ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wccaud_dp extends GXProcedure
{
   public wccaud_dp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wccaud_dp.class ), "" );
   }

   public wccaud_dp( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.controlcalidadhtd.SdtWccaud_SDT_Item> executeUdp( String aP0 ,
                                                                                 int aP1 ,
                                                                                 int aP2 ,
                                                                                 String aP3 ,
                                                                                 short aP4 ,
                                                                                 short aP5 ,
                                                                                 int aP6 ,
                                                                                 int aP7 ,
                                                                                 String aP8 ,
                                                                                 java.util.Date aP9 ,
                                                                                 java.util.Date aP10 ,
                                                                                 String aP11 ,
                                                                                 String aP12 ,
                                                                                 byte aP13 ,
                                                                                 byte aP14 ,
                                                                                 byte aP15 )
   {
      wccaud_dp.this.aP16 = new GXBaseCollection[] {new GXBaseCollection<app.controlcalidadhtd.SdtWccaud_SDT_Item>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16);
      return aP16[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        int aP2 ,
                        String aP3 ,
                        short aP4 ,
                        short aP5 ,
                        int aP6 ,
                        int aP7 ,
                        String aP8 ,
                        java.util.Date aP9 ,
                        java.util.Date aP10 ,
                        String aP11 ,
                        String aP12 ,
                        byte aP13 ,
                        byte aP14 ,
                        byte aP15 ,
                        GXBaseCollection<app.controlcalidadhtd.SdtWccaud_SDT_Item>[] aP16 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             int aP2 ,
                             String aP3 ,
                             short aP4 ,
                             short aP5 ,
                             int aP6 ,
                             int aP7 ,
                             String aP8 ,
                             java.util.Date aP9 ,
                             java.util.Date aP10 ,
                             String aP11 ,
                             String aP12 ,
                             byte aP13 ,
                             byte aP14 ,
                             byte aP15 ,
                             GXBaseCollection<app.controlcalidadhtd.SdtWccaud_SDT_Item>[] aP16 )
   {
      wccaud_dp.this.A396EmprCod = aP0;
      wccaud_dp.this.AV5BarFin = aP1;
      wccaud_dp.this.AV6BarIni = aP2;
      wccaud_dp.this.AV7BarSer = aP3;
      wccaud_dp.this.AV8Cctfin = aP4;
      wccaud_dp.this.AV9Cctini = aP5;
      wccaud_dp.this.AV10CliFin = aP6;
      wccaud_dp.this.AV11CliIni = aP7;
      wccaud_dp.this.AV12Det = aP8;
      wccaud_dp.this.AV13FchFin = aP9;
      wccaud_dp.this.AV14FchIni = aP10;
      wccaud_dp.this.AV15ParFin = aP11;
      wccaud_dp.this.AV16ParIni = aP12;
      wccaud_dp.this.AV17Rea = aP13;
      wccaud_dp.this.AV18ReoFin = aP14;
      wccaud_dp.this.AV19ReoIni = aP15;
      wccaud_dp.this.aP16 = aP16;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV13FchFin ,
                                           AV14FchIni ,
                                           Short.valueOf(AV8Cctfin) ,
                                           Short.valueOf(AV9Cctini) ,
                                           Integer.valueOf(AV10CliFin) ,
                                           Integer.valueOf(AV11CliIni) ,
                                           AV15ParFin ,
                                           AV16ParIni ,
                                           Byte.valueOf(AV18ReoFin) ,
                                           Byte.valueOf(AV19ReoIni) ,
                                           Integer.valueOf(AV5BarFin) ,
                                           Integer.valueOf(AV6BarIni) ,
                                           A4033CCFch ,
                                           Integer.valueOf(A4031CCTCod) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A130BarCodPar ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(AV17Rea) ,
                                           Byte.valueOf(A14418CCfOk) ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      /* Using cursor P004S2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV13FchFin, AV14FchIni, Short.valueOf(AV8Cctfin), Short.valueOf(AV9Cctini), Integer.valueOf(AV10CliFin), Integer.valueOf(AV11CliIni), AV15ParFin, AV16ParIni, Byte.valueOf(AV18ReoFin), Byte.valueOf(AV19ReoIni), Integer.valueOf(AV5BarFin), Integer.valueOf(AV6BarIni)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A252CliCod = P004S2_A252CliCod[0] ;
         n252CliCod = P004S2_n252CliCod[0] ;
         A4033CCFch = P004S2_A4033CCFch[0] ;
         n4033CCFch = P004S2_n4033CCFch[0] ;
         A759ProDsc = P004S2_A759ProDsc[0] ;
         A457FasCod = P004S2_A457FasCod[0] ;
         A460FasDsc = P004S2_A460FasDsc[0] ;
         A4036CCTDsc = P004S2_A4036CCTDsc[0] ;
         A4032CCOpeCod = P004S2_A4032CCOpeCod[0] ;
         n4032CCOpeCod = P004S2_n4032CCOpeCod[0] ;
         A212BarSer = P004S2_A212BarSer[0] ;
         A135BarColNom = P004S2_A135BarColNom[0] ;
         A4812BarEncCli = P004S2_A4812BarEncCli[0] ;
         A217BarTipArt = P004S2_A217BarTipArt[0] ;
         n217BarTipArt = P004S2_n217BarTipArt[0] ;
         A1909BarGraAca = P004S2_A1909BarGraAca[0] ;
         A125BarAncAca1 = P004S2_A125BarAncAca1[0] ;
         A4031CCTCod = P004S2_A4031CCTCod[0] ;
         A194BarOrdLin = P004S2_A194BarOrdLin[0] ;
         A758ProCod = P004S2_A758ProCod[0] ;
         A130BarCodPar = P004S2_A130BarCodPar[0] ;
         A132BarCodReo = P004S2_A132BarCodReo[0] ;
         A129BarCod = P004S2_A129BarCod[0] ;
         A252CliCod = P004S2_A252CliCod[0] ;
         n252CliCod = P004S2_n252CliCod[0] ;
         A212BarSer = P004S2_A212BarSer[0] ;
         A135BarColNom = P004S2_A135BarColNom[0] ;
         A4812BarEncCli = P004S2_A4812BarEncCli[0] ;
         A217BarTipArt = P004S2_A217BarTipArt[0] ;
         n217BarTipArt = P004S2_n217BarTipArt[0] ;
         A1909BarGraAca = P004S2_A1909BarGraAca[0] ;
         A125BarAncAca1 = P004S2_A125BarAncAca1[0] ;
         A759ProDsc = P004S2_A759ProDsc[0] ;
         A457FasCod = P004S2_A457FasCod[0] ;
         A460FasDsc = P004S2_A460FasDsc[0] ;
         A4036CCTDsc = P004S2_A4036CCTDsc[0] ;
         GXt_int1 = A14418CCfOk ;
         GXv_char2[0] = A396EmprCod ;
         GXv_int3[0] = A129BarCod ;
         GXv_int4[0] = A132BarCodReo ;
         GXv_char5[0] = A130BarCodPar ;
         GXv_char6[0] = A758ProCod ;
         GXv_int7[0] = A194BarOrdLin ;
         GXv_int8[0] = A4031CCTCod ;
         GXv_int9[0] = GXt_int1 ;
         new app.controlcalidadhtd.pccend(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_int4, GXv_char5, GXv_char6, GXv_int7, GXv_int8, GXv_int9) ;
         wccaud_dp.this.A396EmprCod = GXv_char2[0] ;
         wccaud_dp.this.A129BarCod = GXv_int3[0] ;
         wccaud_dp.this.A132BarCodReo = GXv_int4[0] ;
         wccaud_dp.this.A130BarCodPar = GXv_char5[0] ;
         wccaud_dp.this.A758ProCod = GXv_char6[0] ;
         wccaud_dp.this.A194BarOrdLin = GXv_int7[0] ;
         wccaud_dp.this.A4031CCTCod = GXv_int8[0] ;
         wccaud_dp.this.GXt_int1 = GXv_int9[0] ;
         A14418CCfOk = GXt_int1 ;
         if ( ( ( AV17Rea == 1 ) && ( A14418CCfOk == 1 ) ) || ( ( AV17Rea == 2 ) && ( A14418CCfOk == 0 ) ) || ( ( AV17Rea == 0 ) ) )
         {
            Gxm1wccaud_sdt = (app.controlcalidadhtd.SdtWccaud_SDT_Item)new app.controlcalidadhtd.SdtWccaud_SDT_Item(remoteHandle, context);
            Gxm2rootcol.add(Gxm1wccaud_sdt, 0);
            Gxm1wccaud_sdt.setgxTv_SdtWccaud_SDT_Item_Seleccionar( false );
            Gxm1wccaud_sdt.setgxTv_SdtWccaud_SDT_Item_Barcod( A129BarCod );
            Gxm1wccaud_sdt.setgxTv_SdtWccaud_SDT_Item_Barcodreo( A132BarCodReo );
            Gxm1wccaud_sdt.setgxTv_SdtWccaud_SDT_Item_Barcodpar( A130BarCodPar );
            Gxm1wccaud_sdt.setgxTv_SdtWccaud_SDT_Item_Procod( A758ProCod );
            Gxm1wccaud_sdt.setgxTv_SdtWccaud_SDT_Item_Prodsc( A759ProDsc );
            Gxm1wccaud_sdt.setgxTv_SdtWccaud_SDT_Item_Barordlin( A194BarOrdLin );
            Gxm1wccaud_sdt.setgxTv_SdtWccaud_SDT_Item_Fascod( A457FasCod );
            Gxm1wccaud_sdt.setgxTv_SdtWccaud_SDT_Item_Fasdsc( A460FasDsc );
            Gxm1wccaud_sdt.setgxTv_SdtWccaud_SDT_Item_Ccfch( A4033CCFch );
            Gxm1wccaud_sdt.setgxTv_SdtWccaud_SDT_Item_Cctcod( A4031CCTCod );
            Gxm1wccaud_sdt.setgxTv_SdtWccaud_SDT_Item_Cctdsc( A4036CCTDsc );
            Gxm1wccaud_sdt.setgxTv_SdtWccaud_SDT_Item_Ccopecod( A4032CCOpeCod );
            GXt_char10 = "" ;
            GXv_char6[0] = A396EmprCod ;
            GXv_int8[0] = A4032CCOpeCod ;
            GXv_char5[0] = GXt_char10 ;
            new app.pnrcope(remoteHandle, context).execute( GXv_char6, GXv_int8, GXv_char5) ;
            wccaud_dp.this.A396EmprCod = GXv_char6[0] ;
            wccaud_dp.this.A4032CCOpeCod = GXv_int8[0] ;
            wccaud_dp.this.GXt_char10 = GXv_char5[0] ;
            Gxm1wccaud_sdt.setgxTv_SdtWccaud_SDT_Item_Openom( GXt_char10 );
            Gxm1wccaud_sdt.setgxTv_SdtWccaud_SDT_Item_Barser( A212BarSer );
            Gxm1wccaud_sdt.setgxTv_SdtWccaud_SDT_Item_Barcolnom( A135BarColNom );
            Gxm1wccaud_sdt.setgxTv_SdtWccaud_SDT_Item_Barenccli( A4812BarEncCli );
            Gxm1wccaud_sdt.setgxTv_SdtWccaud_SDT_Item_Bartipart( A217BarTipArt );
            Gxm1wccaud_sdt.setgxTv_SdtWccaud_SDT_Item_Bargraaca( A1909BarGraAca );
            Gxm1wccaud_sdt.setgxTv_SdtWccaud_SDT_Item_Barancaca1( A125BarAncAca1 );
            Gxm1wccaud_sdt.setgxTv_SdtWccaud_SDT_Item_Ccfok( A14418CCfOk );
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP16[0] = wccaud_dp.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<app.controlcalidadhtd.SdtWccaud_SDT_Item>(app.controlcalidadhtd.SdtWccaud_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      A4033CCFch = GXutil.nullDate() ;
      A130BarCodPar = "" ;
      P004S2_A252CliCod = new int[1] ;
      P004S2_n252CliCod = new boolean[] {false} ;
      P004S2_A4033CCFch = new java.util.Date[] {GXutil.nullDate()} ;
      P004S2_n4033CCFch = new boolean[] {false} ;
      P004S2_A759ProDsc = new String[] {""} ;
      P004S2_A457FasCod = new String[] {""} ;
      P004S2_A460FasDsc = new String[] {""} ;
      P004S2_A4036CCTDsc = new String[] {""} ;
      P004S2_A4032CCOpeCod = new int[1] ;
      P004S2_n4032CCOpeCod = new boolean[] {false} ;
      P004S2_A212BarSer = new String[] {""} ;
      P004S2_A135BarColNom = new String[] {""} ;
      P004S2_A4812BarEncCli = new String[] {""} ;
      P004S2_A217BarTipArt = new short[1] ;
      P004S2_n217BarTipArt = new boolean[] {false} ;
      P004S2_A1909BarGraAca = new short[1] ;
      P004S2_A125BarAncAca1 = new short[1] ;
      P004S2_A396EmprCod = new String[] {""} ;
      P004S2_A4031CCTCod = new int[1] ;
      P004S2_A194BarOrdLin = new short[1] ;
      P004S2_A758ProCod = new String[] {""} ;
      P004S2_A130BarCodPar = new String[] {""} ;
      P004S2_A132BarCodReo = new byte[1] ;
      P004S2_A129BarCod = new int[1] ;
      A759ProDsc = "" ;
      A457FasCod = "" ;
      A460FasDsc = "" ;
      A4036CCTDsc = "" ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A4812BarEncCli = "" ;
      A758ProCod = "" ;
      GXv_char2 = new String[1] ;
      GXv_int3 = new int[1] ;
      GXv_int4 = new byte[1] ;
      GXv_int7 = new short[1] ;
      GXv_int9 = new byte[1] ;
      Gxm1wccaud_sdt = new app.controlcalidadhtd.SdtWccaud_SDT_Item(remoteHandle, context);
      GXt_char10 = "" ;
      GXv_char6 = new String[1] ;
      GXv_int8 = new int[1] ;
      GXv_char5 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.wccaud_dp__default(),
         new Object[] {
             new Object[] {
            P004S2_A252CliCod, P004S2_n252CliCod, P004S2_A4033CCFch, P004S2_n4033CCFch, P004S2_A759ProDsc, P004S2_A457FasCod, P004S2_A460FasDsc, P004S2_A4036CCTDsc, P004S2_A4032CCOpeCod, P004S2_n4032CCOpeCod,
            P004S2_A212BarSer, P004S2_A135BarColNom, P004S2_A4812BarEncCli, P004S2_A217BarTipArt, P004S2_n217BarTipArt, P004S2_A1909BarGraAca, P004S2_A125BarAncAca1, P004S2_A396EmprCod, P004S2_A4031CCTCod, P004S2_A194BarOrdLin,
            P004S2_A758ProCod, P004S2_A130BarCodPar, P004S2_A132BarCodReo, P004S2_A129BarCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17Rea ;
   private byte AV18ReoFin ;
   private byte AV19ReoIni ;
   private byte A132BarCodReo ;
   private byte A14418CCfOk ;
   private byte GXt_int1 ;
   private byte GXv_int4[] ;
   private byte GXv_int9[] ;
   private short AV8Cctfin ;
   private short AV9Cctini ;
   private short A217BarTipArt ;
   private short A1909BarGraAca ;
   private short A125BarAncAca1 ;
   private short A194BarOrdLin ;
   private short GXv_int7[] ;
   private short Gx_err ;
   private int AV5BarFin ;
   private int AV6BarIni ;
   private int AV10CliFin ;
   private int AV11CliIni ;
   private int A4031CCTCod ;
   private int A252CliCod ;
   private int A129BarCod ;
   private int A4032CCOpeCod ;
   private int GXv_int3[] ;
   private int GXv_int8[] ;
   private String A396EmprCod ;
   private String AV7BarSer ;
   private String AV12Det ;
   private String AV15ParFin ;
   private String AV16ParIni ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A759ProDsc ;
   private String A457FasCod ;
   private String A460FasDsc ;
   private String A4036CCTDsc ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String A4812BarEncCli ;
   private String A758ProCod ;
   private String GXv_char2[] ;
   private String GXt_char10 ;
   private String GXv_char6[] ;
   private String GXv_char5[] ;
   private java.util.Date AV13FchFin ;
   private java.util.Date AV14FchIni ;
   private java.util.Date A4033CCFch ;
   private boolean n252CliCod ;
   private boolean n4033CCFch ;
   private boolean n4032CCOpeCod ;
   private boolean n217BarTipArt ;
   private GXBaseCollection<app.controlcalidadhtd.SdtWccaud_SDT_Item>[] aP16 ;
   private IDataStoreProvider pr_default ;
   private int[] P004S2_A252CliCod ;
   private boolean[] P004S2_n252CliCod ;
   private java.util.Date[] P004S2_A4033CCFch ;
   private boolean[] P004S2_n4033CCFch ;
   private String[] P004S2_A759ProDsc ;
   private String[] P004S2_A457FasCod ;
   private String[] P004S2_A460FasDsc ;
   private String[] P004S2_A4036CCTDsc ;
   private int[] P004S2_A4032CCOpeCod ;
   private boolean[] P004S2_n4032CCOpeCod ;
   private String[] P004S2_A212BarSer ;
   private String[] P004S2_A135BarColNom ;
   private String[] P004S2_A4812BarEncCli ;
   private short[] P004S2_A217BarTipArt ;
   private boolean[] P004S2_n217BarTipArt ;
   private short[] P004S2_A1909BarGraAca ;
   private short[] P004S2_A125BarAncAca1 ;
   private String[] P004S2_A396EmprCod ;
   private int[] P004S2_A4031CCTCod ;
   private short[] P004S2_A194BarOrdLin ;
   private String[] P004S2_A758ProCod ;
   private String[] P004S2_A130BarCodPar ;
   private byte[] P004S2_A132BarCodReo ;
   private int[] P004S2_A129BarCod ;
   private GXBaseCollection<app.controlcalidadhtd.SdtWccaud_SDT_Item> Gxm2rootcol ;
   private app.controlcalidadhtd.SdtWccaud_SDT_Item Gxm1wccaud_sdt ;
}

final  class wccaud_dp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P004S2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV13FchFin ,
                                          java.util.Date AV14FchIni ,
                                          short AV8Cctfin ,
                                          short AV9Cctini ,
                                          int AV10CliFin ,
                                          int AV11CliIni ,
                                          String AV15ParFin ,
                                          String AV16ParIni ,
                                          byte AV18ReoFin ,
                                          byte AV19ReoIni ,
                                          int AV5BarFin ,
                                          int AV6BarIni ,
                                          java.util.Date A4033CCFch ,
                                          int A4031CCTCod ,
                                          int A252CliCod ,
                                          String A130BarCodPar ,
                                          byte A132BarCodReo ,
                                          int A129BarCod ,
                                          byte AV17Rea ,
                                          byte A14418CCfOk ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int11 = new byte[13];
      Object[] GXv_Object12 = new Object[2];
      scmdbuf = "SELECT T2.CliCod, T1.CCFch, T3.ProDsc, T4.FasCod, T5.FasDsc, T6.CCTDsc, T1.CCOpeCod, T2.BarSer, T2.BarColNom, T2.BarEncCli, T2.BarTipArt, T2.BarGraAca, T2.BarAncAca1," ;
      scmdbuf += " T1.EmprCod, T1.CCTCod, T1.BarOrdLin, T1.ProCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod FROM (((((TXPCC T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND" ;
      scmdbuf += " T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) INNER JOIN TXPPROCES T3 ON T3.EmprCod = T1.EmprCod AND T3.ProCod = T1.ProCod)" ;
      scmdbuf += " INNER JOIN TXPBARFAS T4 ON T4.EmprCod = T1.EmprCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar AND T4.ProCod = T1.ProCod" ;
      scmdbuf += " AND T4.BarOrdLin = T1.BarOrdLin) LEFT JOIN TXPFASPRO T5 ON T5.EmprCod = T1.EmprCod AND T5.FasCod = T4.FasCod) INNER JOIN TXPCCDef T6 ON T6.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T6.CCTCod = T1.CCTCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV13FchFin)) ) )
      {
         addWhere(sWhereString, "(T1.CCFch <= ?)");
      }
      else
      {
         GXv_int11[1] = (byte)(1) ;
      }
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV14FchIni)) ) )
      {
         addWhere(sWhereString, "(T1.CCFch >= ?)");
      }
      else
      {
         GXv_int11[2] = (byte)(1) ;
      }
      if ( ! ( (0==AV8Cctfin) ) )
      {
         addWhere(sWhereString, "(T1.CCTCod <= ?)");
      }
      else
      {
         GXv_int11[3] = (byte)(1) ;
      }
      if ( ! ( (0==AV9Cctini) ) )
      {
         addWhere(sWhereString, "(T1.CCTCod >= ?)");
      }
      else
      {
         GXv_int11[4] = (byte)(1) ;
      }
      if ( ! ( (0==AV10CliFin) ) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int11[5] = (byte)(1) ;
      }
      if ( ! ( (0==AV11CliIni) ) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int11[6] = (byte)(1) ;
      }
      if ( ! ( (GXutil.strcmp("", AV15ParFin)==0) ) )
      {
         addWhere(sWhereString, "(T1.BarCodPar <= ?)");
      }
      else
      {
         GXv_int11[7] = (byte)(1) ;
      }
      if ( ! ( (GXutil.strcmp("", AV16ParIni)==0) ) )
      {
         addWhere(sWhereString, "(T1.BarCodPar >= ?)");
      }
      else
      {
         GXv_int11[8] = (byte)(1) ;
      }
      if ( ! ( (0==AV18ReoFin) ) )
      {
         addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      }
      else
      {
         GXv_int11[9] = (byte)(1) ;
      }
      if ( ! ( (0==AV19ReoIni) ) )
      {
         addWhere(sWhereString, "(T1.BarCodReo >= ?)");
      }
      else
      {
         GXv_int11[10] = (byte)(1) ;
      }
      if ( ! ( (0==AV5BarFin) ) )
      {
         addWhere(sWhereString, "(T1.BarCod <= ?)");
      }
      else
      {
         GXv_int11[11] = (byte)(1) ;
      }
      if ( ! ( (0==AV6BarIni) ) )
      {
         addWhere(sWhereString, "(T1.BarCod >= ?)");
      }
      else
      {
         GXv_int11[12] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin, T1.CCTCod" ;
      GXv_Object12[0] = scmdbuf ;
      GXv_Object12[1] = GXv_int11 ;
      return GXv_Object12 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.IHttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 0 :
                  return conditional_P004S2(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).shortValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).byteValue() , ((Number) dynConstraints[9]).byteValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (java.util.Date)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , ((Number) dynConstraints[16]).byteValue() , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).byteValue() , (String)dynConstraints[20] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P004S2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 40);
               ((String[]) buf[5])[0] = rslt.getString(4, 8);
               ((String[]) buf[6])[0] = rslt.getString(5, 28);
               ((String[]) buf[7])[0] = rslt.getString(6, 30);
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 16);
               ((String[]) buf[11])[0] = rslt.getString(9, 13);
               ((String[]) buf[12])[0] = rslt.getString(10, 20);
               ((short[]) buf[13])[0] = rslt.getShort(11);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(12);
               ((short[]) buf[16])[0] = rslt.getShort(13);
               ((String[]) buf[17])[0] = rslt.getString(14, 3);
               ((int[]) buf[18])[0] = rslt.getInt(15);
               ((short[]) buf[19])[0] = rslt.getShort(16);
               ((String[]) buf[20])[0] = rslt.getString(17, 8);
               ((String[]) buf[21])[0] = rslt.getString(18, 1);
               ((byte[]) buf[22])[0] = rslt.getByte(19);
               ((int[]) buf[23])[0] = rslt.getInt(20);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      short sIdx;
      switch ( cursor )
      {
            case 0 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[14]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[15]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[16]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[17]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[19]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 1);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 1);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[22]).byteValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[23]).byteValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               return;
      }
   }

}

