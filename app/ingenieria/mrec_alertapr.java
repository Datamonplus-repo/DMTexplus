package app.ingenieria ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class mrec_alertapr extends GXProcedure
{
   public mrec_alertapr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( mrec_alertapr.class ), "" );
   }

   public mrec_alertapr( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.ingenieria.SdtMRec_AlertaSDT_Item> executeUdp( String aP0 ,
                                                                              String aP1 ,
                                                                              int aP2 ,
                                                                              GXSimpleCollection<String> aP3 ,
                                                                              GXSimpleCollection<String> aP4 ,
                                                                              GXSimpleCollection<String> aP5 ,
                                                                              GXSimpleCollection<Short> aP6 ,
                                                                              boolean aP7 ,
                                                                              java.util.Date aP8 ,
                                                                              java.util.Date aP9 ,
                                                                              String aP10 ,
                                                                              String aP11 ,
                                                                              java.util.Date aP12 ,
                                                                              String aP13 )
   {
      mrec_alertapr.this.aP14 = new GXBaseCollection[] {new GXBaseCollection<app.ingenieria.SdtMRec_AlertaSDT_Item>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14);
      return aP14[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        int aP2 ,
                        GXSimpleCollection<String> aP3 ,
                        GXSimpleCollection<String> aP4 ,
                        GXSimpleCollection<String> aP5 ,
                        GXSimpleCollection<Short> aP6 ,
                        boolean aP7 ,
                        java.util.Date aP8 ,
                        java.util.Date aP9 ,
                        String aP10 ,
                        String aP11 ,
                        java.util.Date aP12 ,
                        String aP13 ,
                        GXBaseCollection<app.ingenieria.SdtMRec_AlertaSDT_Item>[] aP14 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             int aP2 ,
                             GXSimpleCollection<String> aP3 ,
                             GXSimpleCollection<String> aP4 ,
                             GXSimpleCollection<String> aP5 ,
                             GXSimpleCollection<Short> aP6 ,
                             boolean aP7 ,
                             java.util.Date aP8 ,
                             java.util.Date aP9 ,
                             String aP10 ,
                             String aP11 ,
                             java.util.Date aP12 ,
                             String aP13 ,
                             GXBaseCollection<app.ingenieria.SdtMRec_AlertaSDT_Item>[] aP14 )
   {
      mrec_alertapr.this.AV19EmprCod = aP0;
      mrec_alertapr.this.AV15ContCod = aP1;
      mrec_alertapr.this.AV30Segundos = aP2;
      mrec_alertapr.this.AV32MaqCod = aP3;
      mrec_alertapr.this.AV34FasCod = aP4;
      mrec_alertapr.this.AV40Hdr = aP5;
      mrec_alertapr.this.AV28ParFasCod = aP6;
      mrec_alertapr.this.AV33FueraRango = aP7;
      mrec_alertapr.this.AV18Desde = aP8;
      mrec_alertapr.this.AV20Hasta = aP9;
      mrec_alertapr.this.AV39UsurCod = aP10;
      mrec_alertapr.this.AV38Ip = aP11;
      mrec_alertapr.this.AV27Now = aP12;
      mrec_alertapr.this.AV42MTkn = aP13;
      mrec_alertapr.this.aP14 = aP14;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "validando Hdr. Armar SDT Alerta: &EmprCod:%1, &ContCod:%2, &Segundos:%3, &MaqCod:%4, &FasCod:%5, &Hdr:%6, &ParFasCod:%7, %8.", ""), AV19EmprCod, AV15ContCod, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30Segundos), 6, 0), AV32MaqCod.toJSonString(false), AV34FasCod.toJSonString(false), AV40Hdr.toJSonString(false), AV28ParFasCod.toJSonString(false), GXutil.format( httpContext.getMessage( " &FueraRango=%1, &Desde=%2, &Hasta=%3, &UsurCod=%4, &Ip:%5, &Now:%6, &MTkn:%7", ""), GXutil.booltostr( AV33FueraRango), localUtil.ttoc( AV18Desde, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.ttoc( AV20Hasta, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), AV39UsurCod, AV38Ip, localUtil.ttoc( AV27Now, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), AV42MTkn, "", ""), ""), AV48Pgmname) ;
      if ( GXutil.strcmp(AV15ContCod, "TEST") == 0 )
      {
         new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "ingreso por grafica:%1 con HDR:%2.", ""), AV15ContCod, AV40Hdr.toJSonString(false), "", "", "", "", "", "", "")) ;
      }
      AV45PrimerRegistro = false ;
      AV17Datos.clear();
      AV49GXLvl13 = (byte)(0) ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A14724MAleMaqCod ,
                                           AV32MaqCod ,
                                           A14725MAleFasCod ,
                                           AV34FasCod ,
                                           A14739MAleHdr ,
                                           AV40Hdr ,
                                           Short.valueOf(A14726MAleParCod) ,
                                           AV28ParFasCod ,
                                           Integer.valueOf(AV32MaqCod.size()) ,
                                           Integer.valueOf(AV34FasCod.size()) ,
                                           Integer.valueOf(AV40Hdr.size()) ,
                                           Integer.valueOf(AV28ParFasCod.size()) ,
                                           Boolean.valueOf(AV33FueraRango) ,
                                           Boolean.valueOf(A14727MAleEr) ,
                                           A14731MAleReg ,
                                           AV27Now ,
                                           A14732MAleEmprCo ,
                                           AV19EmprCod ,
                                           A14729MAleUsu ,
                                           AV39UsurCod ,
                                           A14730MAleIp ,
                                           AV38Ip ,
                                           A14735MAleTkn ,
                                           AV42MTkn ,
                                           AV18Desde ,
                                           A14678MAleFec ,
                                           AV20Hasta } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BOOLEAN,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE
                                           }
      });
      /* Using cursor P09SD2 */
      pr_default.execute(0, new Object[] {AV18Desde, AV27Now, AV19EmprCod, AV39UsurCod, AV38Ip, AV42MTkn, AV20Hasta});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A14735MAleTkn = P09SD2_A14735MAleTkn[0] ;
         A14731MAleReg = P09SD2_A14731MAleReg[0] ;
         A14730MAleIp = P09SD2_A14730MAleIp[0] ;
         A14729MAleUsu = P09SD2_A14729MAleUsu[0] ;
         A14727MAleEr = P09SD2_A14727MAleEr[0] ;
         A14726MAleParCod = P09SD2_A14726MAleParCod[0] ;
         A14739MAleHdr = P09SD2_A14739MAleHdr[0] ;
         A14725MAleFasCod = P09SD2_A14725MAleFasCod[0] ;
         A14724MAleMaqCod = P09SD2_A14724MAleMaqCod[0] ;
         A14678MAleFec = P09SD2_A14678MAleFec[0] ;
         A14732MAleEmprCo = P09SD2_A14732MAleEmprCo[0] ;
         A14677MAleId = P09SD2_A14677MAleId[0] ;
         A14742MAleLin = P09SD2_A14742MAleLin[0] ;
         A14741MAleOrd = P09SD2_A14741MAleOrd[0] ;
         A14747MAleBarPar = P09SD2_A14747MAleBarPar[0] ;
         A14746MAleBarReo = P09SD2_A14746MAleBarReo[0] ;
         A14745MAleBarCod = P09SD2_A14745MAleBarCod[0] ;
         A14743MAlePLC = P09SD2_A14743MAlePLC[0] ;
         A14733MAleValMin = P09SD2_A14733MAleValMin[0] ;
         A14728MAleVal = P09SD2_A14728MAleVal[0] ;
         A14734MAleValMax = P09SD2_A14734MAleValMax[0] ;
         A14744MAleFecEv = P09SD2_A14744MAleFecEv[0] ;
         A14737MAleMaqDsc = P09SD2_A14737MAleMaqDsc[0] ;
         A14738MAleFasDsc = P09SD2_A14738MAleFasDsc[0] ;
         A14740MAleParDsc = P09SD2_A14740MAleParDsc[0] ;
         AV49GXLvl13 = (byte)(1) ;
         AV44MAleHdrVarchar = GXutil.trim( A14739MAleHdr) + " " ;
         if ( ! AV45PrimerRegistro )
         {
            AV45PrimerRegistro = true ;
            new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "Primer Registro Hdr:%1%2%3, Hdr:%7, &MAleHdrVarchar:%8, Orden:%4, Linea:%5, Id:%6.", ""), GXutil.ltrimstr( DecimalUtil.doubleToDec(A14745MAleBarCod), 8, 0), GXutil.str( A14746MAleBarReo, 1, 0), A14747MAleBarPar, GXutil.ltrimstr( DecimalUtil.doubleToDec(A14741MAleOrd), 4, 0), GXutil.ltrimstr( DecimalUtil.doubleToDec(A14742MAleLin), 12, 0), GXutil.ltrimstr( DecimalUtil.doubleToDec(A14677MAleId), 10, 0), A14739MAleHdr, AV44MAleHdrVarchar, ""), AV48Pgmname) ;
         }
         AV16Dato = (app.ingenieria.SdtMRec_AlertaSDT_Item)new app.ingenieria.SdtMRec_AlertaSDT_Item(remoteHandle, context);
         AV16Dato.setgxTv_SdtMRec_AlertaSDT_Item_Emprcod( A14732MAleEmprCo );
         AV16Dato.setgxTv_SdtMRec_AlertaSDT_Item_Barcod( A14745MAleBarCod );
         AV16Dato.setgxTv_SdtMRec_AlertaSDT_Item_Barcodreo( A14746MAleBarReo );
         AV16Dato.setgxTv_SdtMRec_AlertaSDT_Item_Barcodpar( A14747MAleBarPar );
         AV16Dato.setgxTv_SdtMRec_AlertaSDT_Item_Menvord( A14741MAleOrd );
         AV16Dato.setgxTv_SdtMRec_AlertaSDT_Item_Mreclin( A14742MAleLin );
         AV16Dato.setgxTv_SdtMRec_AlertaSDT_Item_Mprecplc( A14743MAlePLC );
         AV16Dato.setgxTv_SdtMRec_AlertaSDT_Item_Mprecvalmn( CommonUtil.decimalVal( A14733MAleValMin, ".") );
         AV16Dato.setgxTv_SdtMRec_AlertaSDT_Item_Mprecval( CommonUtil.decimalVal( A14728MAleVal, ".") );
         AV16Dato.setgxTv_SdtMRec_AlertaSDT_Item_Mprecvalmx( CommonUtil.decimalVal( A14734MAleValMax, ".") );
         AV16Dato.setgxTv_SdtMRec_AlertaSDT_Item_Mprecfec( A14678MAleFec );
         AV16Dato.setgxTv_SdtMRec_AlertaSDT_Item_Mprecer( A14727MAleEr );
         AV16Dato.setgxTv_SdtMRec_AlertaSDT_Item_Mprecfecev( A14744MAleFecEv );
         AV16Dato.setgxTv_SdtMRec_AlertaSDT_Item_Maqcod( A14724MAleMaqCod );
         AV16Dato.setgxTv_SdtMRec_AlertaSDT_Item_Maqdsc( A14737MAleMaqDsc );
         AV16Dato.setgxTv_SdtMRec_AlertaSDT_Item_Fascod( A14725MAleFasCod );
         AV16Dato.setgxTv_SdtMRec_AlertaSDT_Item_Fasdsc( A14738MAleFasDsc );
         AV16Dato.setgxTv_SdtMRec_AlertaSDT_Item_Parfascod( A14726MAleParCod );
         AV16Dato.setgxTv_SdtMRec_AlertaSDT_Item_Parfasdsc( A14740MAleParDsc );
         AV17Datos.add(AV16Dato, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV49GXLvl13 == 0 )
      {
         new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "No encuentra registros:%1.", ""), AV15ContCod, "", "", "", "", "", "", "", ""), AV48Pgmname) ;
      }
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "Datos Alerta: Tipo:%1, Registros:%2, datos:%3.", ""), AV15ContCod, GXutil.ltrimstr( AV17Datos.size(), 9, 0), AV17Datos.toJSonString(false), "", "", "", "", "", ""), AV48Pgmname) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP14[0] = mrec_alertapr.this.AV17Datos;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV17Datos = new GXBaseCollection<app.ingenieria.SdtMRec_AlertaSDT_Item>(app.ingenieria.SdtMRec_AlertaSDT_Item.class, "Item", "TexplusNET", remoteHandle);
      AV48Pgmname = "" ;
      scmdbuf = "" ;
      A14724MAleMaqCod = "" ;
      A14725MAleFasCod = "" ;
      A14739MAleHdr = "" ;
      A14731MAleReg = GXutil.resetTime( GXutil.nullDate() );
      A14732MAleEmprCo = "" ;
      A14729MAleUsu = "" ;
      A14730MAleIp = "" ;
      A14735MAleTkn = "" ;
      A14678MAleFec = GXutil.resetTime( GXutil.nullDate() );
      P09SD2_A14735MAleTkn = new String[] {""} ;
      P09SD2_A14731MAleReg = new java.util.Date[] {GXutil.nullDate()} ;
      P09SD2_A14730MAleIp = new String[] {""} ;
      P09SD2_A14729MAleUsu = new String[] {""} ;
      P09SD2_A14727MAleEr = new boolean[] {false} ;
      P09SD2_A14726MAleParCod = new short[1] ;
      P09SD2_A14739MAleHdr = new String[] {""} ;
      P09SD2_A14725MAleFasCod = new String[] {""} ;
      P09SD2_A14724MAleMaqCod = new String[] {""} ;
      P09SD2_A14678MAleFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09SD2_A14732MAleEmprCo = new String[] {""} ;
      P09SD2_A14677MAleId = new long[1] ;
      P09SD2_A14742MAleLin = new long[1] ;
      P09SD2_A14741MAleOrd = new short[1] ;
      P09SD2_A14747MAleBarPar = new String[] {""} ;
      P09SD2_A14746MAleBarReo = new byte[1] ;
      P09SD2_A14745MAleBarCod = new int[1] ;
      P09SD2_A14743MAlePLC = new String[] {""} ;
      P09SD2_A14733MAleValMin = new String[] {""} ;
      P09SD2_A14728MAleVal = new String[] {""} ;
      P09SD2_A14734MAleValMax = new String[] {""} ;
      P09SD2_A14744MAleFecEv = new java.util.Date[] {GXutil.nullDate()} ;
      P09SD2_A14737MAleMaqDsc = new String[] {""} ;
      P09SD2_A14738MAleFasDsc = new String[] {""} ;
      P09SD2_A14740MAleParDsc = new String[] {""} ;
      A14747MAleBarPar = "" ;
      A14743MAlePLC = "" ;
      A14733MAleValMin = "" ;
      A14728MAleVal = "" ;
      A14734MAleValMax = "" ;
      A14744MAleFecEv = GXutil.resetTime( GXutil.nullDate() );
      A14737MAleMaqDsc = "" ;
      A14738MAleFasDsc = "" ;
      A14740MAleParDsc = "" ;
      AV44MAleHdrVarchar = "" ;
      AV16Dato = new app.ingenieria.SdtMRec_AlertaSDT_Item(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ingenieria.mrec_alertapr__default(),
         new Object[] {
             new Object[] {
            P09SD2_A14735MAleTkn, P09SD2_A14731MAleReg, P09SD2_A14730MAleIp, P09SD2_A14729MAleUsu, P09SD2_A14727MAleEr, P09SD2_A14726MAleParCod, P09SD2_A14739MAleHdr, P09SD2_A14725MAleFasCod, P09SD2_A14724MAleMaqCod, P09SD2_A14678MAleFec,
            P09SD2_A14732MAleEmprCo, P09SD2_A14677MAleId, P09SD2_A14742MAleLin, P09SD2_A14741MAleOrd, P09SD2_A14747MAleBarPar, P09SD2_A14746MAleBarReo, P09SD2_A14745MAleBarCod, P09SD2_A14743MAlePLC, P09SD2_A14733MAleValMin, P09SD2_A14728MAleVal,
            P09SD2_A14734MAleValMax, P09SD2_A14744MAleFecEv, P09SD2_A14737MAleMaqDsc, P09SD2_A14738MAleFasDsc, P09SD2_A14740MAleParDsc
            }
         }
      );
      AV48Pgmname = "Ingenieria.MRec_AlertaPR" ;
      /* GeneXus formulas. */
      AV48Pgmname = "Ingenieria.MRec_AlertaPR" ;
      Gx_err = (short)(0) ;
   }

   private byte AV49GXLvl13 ;
   private byte A14746MAleBarReo ;
   private short A14726MAleParCod ;
   private short A14741MAleOrd ;
   private short Gx_err ;
   private int AV30Segundos ;
   private int AV32MaqCod_size ;
   private int AV34FasCod_size ;
   private int AV40Hdr_size ;
   private int AV28ParFasCod_size ;
   private int A14745MAleBarCod ;
   private long A14677MAleId ;
   private long A14742MAleLin ;
   private String AV19EmprCod ;
   private String AV15ContCod ;
   private String AV39UsurCod ;
   private String AV48Pgmname ;
   private String scmdbuf ;
   private String A14724MAleMaqCod ;
   private String A14725MAleFasCod ;
   private String A14739MAleHdr ;
   private String A14732MAleEmprCo ;
   private String A14729MAleUsu ;
   private String A14747MAleBarPar ;
   private String A14733MAleValMin ;
   private String A14728MAleVal ;
   private String A14734MAleValMax ;
   private java.util.Date AV18Desde ;
   private java.util.Date AV20Hasta ;
   private java.util.Date AV27Now ;
   private java.util.Date A14731MAleReg ;
   private java.util.Date A14678MAleFec ;
   private java.util.Date A14744MAleFecEv ;
   private boolean AV33FueraRango ;
   private boolean AV45PrimerRegistro ;
   private boolean A14727MAleEr ;
   private String AV38Ip ;
   private String AV42MTkn ;
   private String A14730MAleIp ;
   private String A14735MAleTkn ;
   private String A14743MAlePLC ;
   private String A14737MAleMaqDsc ;
   private String A14738MAleFasDsc ;
   private String A14740MAleParDsc ;
   private String AV44MAleHdrVarchar ;
   private GXSimpleCollection<Short> AV28ParFasCod ;
   private GXBaseCollection<app.ingenieria.SdtMRec_AlertaSDT_Item>[] aP14 ;
   private IDataStoreProvider pr_default ;
   private String[] P09SD2_A14735MAleTkn ;
   private java.util.Date[] P09SD2_A14731MAleReg ;
   private String[] P09SD2_A14730MAleIp ;
   private String[] P09SD2_A14729MAleUsu ;
   private boolean[] P09SD2_A14727MAleEr ;
   private short[] P09SD2_A14726MAleParCod ;
   private String[] P09SD2_A14739MAleHdr ;
   private String[] P09SD2_A14725MAleFasCod ;
   private String[] P09SD2_A14724MAleMaqCod ;
   private java.util.Date[] P09SD2_A14678MAleFec ;
   private String[] P09SD2_A14732MAleEmprCo ;
   private long[] P09SD2_A14677MAleId ;
   private long[] P09SD2_A14742MAleLin ;
   private short[] P09SD2_A14741MAleOrd ;
   private String[] P09SD2_A14747MAleBarPar ;
   private byte[] P09SD2_A14746MAleBarReo ;
   private int[] P09SD2_A14745MAleBarCod ;
   private String[] P09SD2_A14743MAlePLC ;
   private String[] P09SD2_A14733MAleValMin ;
   private String[] P09SD2_A14728MAleVal ;
   private String[] P09SD2_A14734MAleValMax ;
   private java.util.Date[] P09SD2_A14744MAleFecEv ;
   private String[] P09SD2_A14737MAleMaqDsc ;
   private String[] P09SD2_A14738MAleFasDsc ;
   private String[] P09SD2_A14740MAleParDsc ;
   private GXSimpleCollection<String> AV32MaqCod ;
   private GXSimpleCollection<String> AV34FasCod ;
   private GXSimpleCollection<String> AV40Hdr ;
   private GXBaseCollection<app.ingenieria.SdtMRec_AlertaSDT_Item> AV17Datos ;
   private app.ingenieria.SdtMRec_AlertaSDT_Item AV16Dato ;
}

final  class mrec_alertapr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09SD2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A14724MAleMaqCod ,
                                          GXSimpleCollection<String> AV32MaqCod ,
                                          String A14725MAleFasCod ,
                                          GXSimpleCollection<String> AV34FasCod ,
                                          String A14739MAleHdr ,
                                          GXSimpleCollection<String> AV40Hdr ,
                                          short A14726MAleParCod ,
                                          GXSimpleCollection<Short> AV28ParFasCod ,
                                          int AV32MaqCod_size ,
                                          int AV34FasCod_size ,
                                          int AV40Hdr_size ,
                                          int AV28ParFasCod_size ,
                                          boolean AV33FueraRango ,
                                          boolean A14727MAleEr ,
                                          java.util.Date A14731MAleReg ,
                                          java.util.Date AV27Now ,
                                          String A14732MAleEmprCo ,
                                          String AV19EmprCod ,
                                          String A14729MAleUsu ,
                                          String AV39UsurCod ,
                                          String A14730MAleIp ,
                                          String AV38Ip ,
                                          String A14735MAleTkn ,
                                          String AV42MTkn ,
                                          java.util.Date AV18Desde ,
                                          java.util.Date A14678MAleFec ,
                                          java.util.Date AV20Hasta )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int1 = new byte[7];
      Object[] GXv_Object2 = new Object[2];
      scmdbuf = "SELECT MAleTkn, MAleReg, MAleIp, MAleUsu, MAleEr, MAleParCod, MAleHdr, MAleFasCod, MAleMaqCod, MAleFec, MAleEmprCo, MAleId, MAleLin, MAleOrd, MAleBarPar, MAleBarReo," ;
      scmdbuf += " MAleBarCod, MAlePLC, MAleValMin, MAleVal, MAleValMax, MAleFecEv, MAleMaqDsc, MAleFasDsc, MAleParDsc FROM MAle" ;
      addWhere(sWhereString, "(MAleFec >= ?)");
      addWhere(sWhereString, "(MAleReg >= ?)");
      addWhere(sWhereString, "(MAleEmprCo = ?)");
      addWhere(sWhereString, "(MAleUsu = ?)");
      addWhere(sWhereString, "(MAleIp = ?)");
      addWhere(sWhereString, "(MAleTkn = ?)");
      addWhere(sWhereString, "(MAleFec <= ?)");
      if ( AV32MaqCod_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV32MaqCod, "MAleMaqCod IN (", ")")+")");
      }
      if ( AV34FasCod_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV34FasCod, "MAleFasCod IN (", ")")+")");
      }
      if ( AV40Hdr_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV40Hdr, "MAleHdr IN (", ")")+")");
      }
      if ( AV28ParFasCod_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV28ParFasCod, "MAleParCod IN (", ")")+")");
      }
      if ( AV33FueraRango )
      {
         addWhere(sWhereString, "(MAleEr = 1)");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY MAleFec" ;
      GXv_Object2[0] = scmdbuf ;
      GXv_Object2[1] = GXv_int1 ;
      return GXv_Object2 ;
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
                  return conditional_P09SD2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (String)dynConstraints[4] , (GXSimpleCollection<String>)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , (GXSimpleCollection<Short>)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , ((Boolean) dynConstraints[12]).booleanValue() , ((Boolean) dynConstraints[13]).booleanValue() , (java.util.Date)dynConstraints[14] , (java.util.Date)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (java.util.Date)dynConstraints[24] , (java.util.Date)dynConstraints[25] , (java.util.Date)dynConstraints[26] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09SD2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2, true);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((boolean[]) buf[4])[0] = rslt.getBoolean(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 10);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
               ((String[]) buf[8])[0] = rslt.getString(9, 6);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(10, true);
               ((String[]) buf[10])[0] = rslt.getString(11, 3);
               ((long[]) buf[11])[0] = rslt.getLong(12);
               ((long[]) buf[12])[0] = rslt.getLong(13);
               ((short[]) buf[13])[0] = rslt.getShort(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 1);
               ((byte[]) buf[15])[0] = rslt.getByte(16);
               ((int[]) buf[16])[0] = rslt.getInt(17);
               ((String[]) buf[17])[0] = rslt.getVarchar(18);
               ((String[]) buf[18])[0] = rslt.getString(19, 12);
               ((String[]) buf[19])[0] = rslt.getString(20, 12);
               ((String[]) buf[20])[0] = rslt.getString(21, 12);
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDateTime(22, true);
               ((String[]) buf[22])[0] = rslt.getVarchar(23);
               ((String[]) buf[23])[0] = rslt.getVarchar(24);
               ((String[]) buf[24])[0] = rslt.getVarchar(25);
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
                  stmt.setDateTime(sIdx, (java.util.Date)parms[7], false, true);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[8], false, true);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 3);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[11], 20);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[12], 256);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[13], false, true);
               }
               return;
      }
   }

}

