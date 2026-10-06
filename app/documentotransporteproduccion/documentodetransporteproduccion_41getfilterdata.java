package app.documentotransporteproduccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class documentodetransporteproduccion_41getfilterdata extends GXProcedure
{
   public documentodetransporteproduccion_41getfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( documentodetransporteproduccion_41getfilterdata.class ), "" );
   }

   public documentodetransporteproduccion_41getfilterdata( int remoteHandle ,
                                                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      documentodetransporteproduccion_41getfilterdata.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      documentodetransporteproduccion_41getfilterdata.this.AV25DDOName = aP0;
      documentodetransporteproduccion_41getfilterdata.this.AV26SearchTxt = aP1;
      documentodetransporteproduccion_41getfilterdata.this.AV27SearchTxtTo = aP2;
      documentodetransporteproduccion_41getfilterdata.this.aP3 = aP3;
      documentodetransporteproduccion_41getfilterdata.this.aP4 = aP4;
      documentodetransporteproduccion_41getfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV15Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV17OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV18OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
      GXv_SdtWWPContext1[0] = AV9WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext1) ;
      AV9WWPContext = GXv_SdtWWPContext1[0] ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      if ( GXutil.strcmp(GXutil.upper( AV25DDOName), "DDO_ALBHDROBS") == 0 )
      {
         /* Execute user subroutine: 'LOADALBHDROBSOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV28OptionsJson = AV15Options.toJSonString(false) ;
      AV29OptionsDescJson = AV17OptionsDesc.toJSonString(false) ;
      AV30OptionIndexesJson = AV18OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV20Session.getValue("DocumentoTransporteProduccion.DocumentodeTransporteProduccion_41GridState"), "") == 0 )
      {
         AV22GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "DocumentoTransporteProduccion.DocumentodeTransporteProduccion_41GridState"), null, null);
      }
      else
      {
         AV22GridState.fromxml(AV20Session.getValue("DocumentoTransporteProduccion.DocumentodeTransporteProduccion_41GridState"), null, null);
      }
      AV47GXV1 = 1 ;
      while ( AV47GXV1 <= AV22GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV23GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV22GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV47GXV1));
         if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBHDROBS") == 0 )
         {
            AV10TFAlbHdrObs = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBHDROBS_SEL") == 0 )
         {
            AV11TFAlbHdrObs_Sel = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIPCOR_SEL") == 0 )
         {
            AV12TFBarTipCor_Sel = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV31Emprcod = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBPROCOD") == 0 )
         {
            AV32AlbProcod = GXutil.lval( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&GUIREMCLI") == 0 )
         {
            AV33Guiremcli = (int)(GXutil.lval( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&GUIREMCLN") == 0 )
         {
            AV34GuiRemCln = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBPROFCH") == 0 )
         {
            AV35AlbProFch = localUtil.ctod( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBSEC") == 0 )
         {
            AV36AlbSec = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBPROPRI") == 0 )
         {
            AV37AlbPropri = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBENVFTP") == 0 )
         {
            AV38AlbEnvFtp = (byte)(GXutil.lval( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBLIC") == 0 )
         {
            AV39AlbLic = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBHHFM") == 0 )
         {
            AV40AlbHhfm = localUtil.ctot( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBPROEST") == 0 )
         {
            AV41AlbProEst = (byte)(GXutil.lval( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARALBKGME") == 0 )
         {
            AV42BarAlbKgmE = CommonUtil.decimalVal( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARALBMTRE") == 0 )
         {
            AV43BarAlbMtrE = CommonUtil.decimalVal( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBMARCA") == 0 )
         {
            AV44AlbMarca = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV47GXV1 = (int)(AV47GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADALBHDROBSOPTIONS' Routine */
      returnInSub = false ;
      AV10TFAlbHdrObs = AV26SearchTxt ;
      AV11TFAlbHdrObs_Sel = "" ;
      AV49Documentotransporteproduccion_documentodetransporteproduccion_41ds_1_tfalbhdrobs = AV10TFAlbHdrObs ;
      AV50Documentotransporteproduccion_documentodetransporteproduccion_41ds_2_tfalbhdrobs_sel = AV11TFAlbHdrObs_Sel ;
      AV51Documentotransporteproduccion_documentodetransporteproduccion_41ds_3_tfbartipcor_sel = AV12TFBarTipCor_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV50Documentotransporteproduccion_documentodetransporteproduccion_41ds_2_tfalbhdrobs_sel ,
                                           AV49Documentotransporteproduccion_documentodetransporteproduccion_41ds_1_tfalbhdrobs ,
                                           AV51Documentotransporteproduccion_documentodetransporteproduccion_41ds_3_tfbartipcor_sel ,
                                           A2441AlbHdrObs ,
                                           A5291BarTipCor ,
                                           A396EmprCod ,
                                           AV31Emprcod ,
                                           Long.valueOf(A30AlbProCod) ,
                                           Long.valueOf(AV32AlbProcod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG
                                           }
      });
      lV49Documentotransporteproduccion_documentodetransporteproduccion_41ds_1_tfalbhdrobs = GXutil.padr( GXutil.rtrim( AV49Documentotransporteproduccion_documentodetransporteproduccion_41ds_1_tfalbhdrobs), 60, "%") ;
      /* Using cursor P0AL42 */
      pr_default.execute(0, new Object[] {AV31Emprcod, Long.valueOf(AV32AlbProcod), lV49Documentotransporteproduccion_documentodetransporteproduccion_41ds_1_tfalbhdrobs, AV50Documentotransporteproduccion_documentodetransporteproduccion_41ds_2_tfalbhdrobs_sel, AV51Documentotransporteproduccion_documentodetransporteproduccion_41ds_3_tfbartipcor_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkAL42 = false ;
         A129BarCod = P0AL42_A129BarCod[0] ;
         A132BarCodReo = P0AL42_A132BarCodReo[0] ;
         A130BarCodPar = P0AL42_A130BarCodPar[0] ;
         A396EmprCod = P0AL42_A396EmprCod[0] ;
         A30AlbProCod = P0AL42_A30AlbProCod[0] ;
         A2441AlbHdrObs = P0AL42_A2441AlbHdrObs[0] ;
         A5291BarTipCor = P0AL42_A5291BarTipCor[0] ;
         A5291BarTipCor = P0AL42_A5291BarTipCor[0] ;
         AV19count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0AL42_A2441AlbHdrObs[0], A2441AlbHdrObs) == 0 ) )
         {
            brkAL42 = false ;
            A129BarCod = P0AL42_A129BarCod[0] ;
            A132BarCodReo = P0AL42_A132BarCodReo[0] ;
            A130BarCodPar = P0AL42_A130BarCodPar[0] ;
            A396EmprCod = P0AL42_A396EmprCod[0] ;
            A30AlbProCod = P0AL42_A30AlbProCod[0] ;
            AV19count = (long)(AV19count+1) ;
            brkAL42 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A2441AlbHdrObs)==0) )
         {
            AV14Option = A2441AlbHdrObs ;
            AV15Options.add(AV14Option, 0);
            AV18OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV19count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV15Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAL42 )
         {
            brkAL42 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP3[0] = documentodetransporteproduccion_41getfilterdata.this.AV28OptionsJson;
      this.aP4[0] = documentodetransporteproduccion_41getfilterdata.this.AV29OptionsDescJson;
      this.aP5[0] = documentodetransporteproduccion_41getfilterdata.this.AV30OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV28OptionsJson = "" ;
      AV29OptionsDescJson = "" ;
      AV30OptionIndexesJson = "" ;
      AV15Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV17OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV18OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV20Session = httpContext.getWebSession();
      AV22GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV23GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV10TFAlbHdrObs = "" ;
      AV11TFAlbHdrObs_Sel = "" ;
      AV12TFBarTipCor_Sel = "" ;
      AV31Emprcod = "" ;
      AV34GuiRemCln = "" ;
      AV35AlbProFch = GXutil.nullDate() ;
      AV36AlbSec = "" ;
      AV37AlbPropri = "" ;
      AV39AlbLic = "" ;
      AV40AlbHhfm = GXutil.resetTime( GXutil.nullDate() );
      AV42BarAlbKgmE = DecimalUtil.ZERO ;
      AV43BarAlbMtrE = DecimalUtil.ZERO ;
      AV44AlbMarca = "" ;
      A2441AlbHdrObs = "" ;
      AV49Documentotransporteproduccion_documentodetransporteproduccion_41ds_1_tfalbhdrobs = "" ;
      AV50Documentotransporteproduccion_documentodetransporteproduccion_41ds_2_tfalbhdrobs_sel = "" ;
      AV51Documentotransporteproduccion_documentodetransporteproduccion_41ds_3_tfbartipcor_sel = "" ;
      scmdbuf = "" ;
      lV49Documentotransporteproduccion_documentodetransporteproduccion_41ds_1_tfalbhdrobs = "" ;
      A5291BarTipCor = "" ;
      A396EmprCod = "" ;
      P0AL42_A129BarCod = new int[1] ;
      P0AL42_A132BarCodReo = new byte[1] ;
      P0AL42_A130BarCodPar = new String[] {""} ;
      P0AL42_A396EmprCod = new String[] {""} ;
      P0AL42_A30AlbProCod = new long[1] ;
      P0AL42_A2441AlbHdrObs = new String[] {""} ;
      P0AL42_A5291BarTipCor = new String[] {""} ;
      A130BarCodPar = "" ;
      AV14Option = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.documentotransporteproduccion.documentodetransporteproduccion_41getfilterdata__default(),
         new Object[] {
             new Object[] {
            P0AL42_A129BarCod, P0AL42_A132BarCodReo, P0AL42_A130BarCodPar, P0AL42_A396EmprCod, P0AL42_A30AlbProCod, P0AL42_A2441AlbHdrObs, P0AL42_A5291BarTipCor
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV38AlbEnvFtp ;
   private byte AV41AlbProEst ;
   private byte A132BarCodReo ;
   private short Gx_err ;
   private int AV47GXV1 ;
   private int AV33Guiremcli ;
   private int A129BarCod ;
   private long AV32AlbProcod ;
   private long A30AlbProCod ;
   private long AV19count ;
   private java.math.BigDecimal AV42BarAlbKgmE ;
   private java.math.BigDecimal AV43BarAlbMtrE ;
   private String AV10TFAlbHdrObs ;
   private String AV11TFAlbHdrObs_Sel ;
   private String AV12TFBarTipCor_Sel ;
   private String AV31Emprcod ;
   private String AV34GuiRemCln ;
   private String AV36AlbSec ;
   private String AV37AlbPropri ;
   private String AV39AlbLic ;
   private String AV44AlbMarca ;
   private String A2441AlbHdrObs ;
   private String AV49Documentotransporteproduccion_documentodetransporteproduccion_41ds_1_tfalbhdrobs ;
   private String AV50Documentotransporteproduccion_documentodetransporteproduccion_41ds_2_tfalbhdrobs_sel ;
   private String AV51Documentotransporteproduccion_documentodetransporteproduccion_41ds_3_tfbartipcor_sel ;
   private String scmdbuf ;
   private String lV49Documentotransporteproduccion_documentodetransporteproduccion_41ds_1_tfalbhdrobs ;
   private String A5291BarTipCor ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private java.util.Date AV40AlbHhfm ;
   private java.util.Date AV35AlbProFch ;
   private boolean returnInSub ;
   private boolean brkAL42 ;
   private String AV28OptionsJson ;
   private String AV29OptionsDescJson ;
   private String AV30OptionIndexesJson ;
   private String AV25DDOName ;
   private String AV26SearchTxt ;
   private String AV27SearchTxtTo ;
   private String AV14Option ;
   private com.genexus.webpanels.WebSession AV20Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private int[] P0AL42_A129BarCod ;
   private byte[] P0AL42_A132BarCodReo ;
   private String[] P0AL42_A130BarCodPar ;
   private String[] P0AL42_A396EmprCod ;
   private long[] P0AL42_A30AlbProCod ;
   private String[] P0AL42_A2441AlbHdrObs ;
   private String[] P0AL42_A5291BarTipCor ;
   private GXSimpleCollection<String> AV15Options ;
   private GXSimpleCollection<String> AV17OptionsDesc ;
   private GXSimpleCollection<String> AV18OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV22GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV23GridStateFilterValue ;
}

final  class documentodetransporteproduccion_41getfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0AL42( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV50Documentotransporteproduccion_documentodetransporteproduccion_41ds_2_tfalbhdrobs_sel ,
                                          String AV49Documentotransporteproduccion_documentodetransporteproduccion_41ds_1_tfalbhdrobs ,
                                          String AV51Documentotransporteproduccion_documentodetransporteproduccion_41ds_3_tfbartipcor_sel ,
                                          String A2441AlbHdrObs ,
                                          String A5291BarTipCor ,
                                          String A396EmprCod ,
                                          String AV31Emprcod ,
                                          long A30AlbProCod ,
                                          long AV32AlbProcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[5];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.EmprCod, T1.AlbProCod, T1.AlbHdrObs, T2.BarTipCor FROM (TXPALBBAR T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.AlbProCod = ?)");
      if ( (GXutil.strcmp("", AV50Documentotransporteproduccion_documentodetransporteproduccion_41ds_2_tfalbhdrobs_sel)==0) && ( ! (GXutil.strcmp("", AV49Documentotransporteproduccion_documentodetransporteproduccion_41ds_1_tfalbhdrobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbHdrObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV50Documentotransporteproduccion_documentodetransporteproduccion_41ds_2_tfalbhdrobs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbHdrObs = ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51Documentotransporteproduccion_documentodetransporteproduccion_41ds_3_tfbartipcor_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarTipCor = ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.AlbHdrObs" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
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
                  return conditional_P0AL42(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).longValue() , ((Number) dynConstraints[8]).longValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AL42", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((long[]) buf[4])[0] = rslt.getLong(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 60);
               ((String[]) buf[6])[0] = rslt.getString(7, 2);
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
                  stmt.setString(sIdx, (String)parms[5], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[6]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[7], 60);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 60);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 2);
               }
               return;
      }
   }

}

