package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wccaud_datos_wcexportcsv_impl extends GXWebProcedure
{
   public wccaud_datos_wcexportcsv_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public void webExecute( )
   {
      if ( (GXutil.strcmp("", httpContext.getCookie( "GX_SESSION_ID"))==0) )
      {
         gxcookieaux = httpContext.setCookie( "GX_SESSION_ID", httpContext.encrypt64( com.genexus.util.Encryption.getNewKey( ), context.getServerKey( )), "", GXutil.nullDate(), "", (short)(httpContext.getHttpSecure( ))) ;
      }
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      entryPointCalled = false ;
      gxfirstwebparm = httpContext.GetNextPar( ) ;
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( toggleJsOutput )
      {
      }
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_SdtWWPContext1[0] = AV9WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext1) ;
      AV9WWPContext = GXv_SdtWWPContext1[0] ;
      /* Execute user subroutine: 'OPENDOCUMENT' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S181 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITECOLUMNTITLES' */
      S131 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITEDATA' */
      S141 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'CLOSEDOCUMENT' */
      S171 ();
      if ( returnInSub )
      {
      }
      if ( httpContext.willRedirect( ) )
      {
         httpContext.redirect( httpContext.wjLoc );
         httpContext.wjLoc = "" ;
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'OPENDOCUMENT' Routine */
      returnInSub = false ;
      AV13Random = (int)(GXutil.random( )*10000) ;
      AV11Filename = "./PrivateTempStorage/" + "Wccaud_Datos_WCExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
      AV10TextFile.setSource( AV11Filename );
      AV10TextFile.create();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      AV10TextFile.openWrite("");
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
   }

   public void S131( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV14TextFileLine = "" ;
      AV14TextFileLine += "#" ;
      AV14TextFileLine += ";" ;
      AV14TextFileLine += httpContext.getMessage( "Descripción", "") ;
      AV14TextFileLine += ";" ;
      AV14TextFileLine += httpContext.getMessage( "Valor", "") ;
      AV14TextFileLine += ";" ;
      AV14TextFileLine += httpContext.getMessage( "Standar", "") ;
      AV10TextFile.writeLine(AV14TextFileLine);
   }

   public void S141( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV52Controlcalidadhtd_wccaud_datos_wcds_1_tfcctlin = AV34TFCCTLin ;
      AV53Controlcalidadhtd_wccaud_datos_wcds_2_tfcctlin_to = AV35TFCCTLin_To ;
      AV54Controlcalidadhtd_wccaud_datos_wcds_3_tfcctlindsc = AV36TFCCTLinDsc ;
      AV55Controlcalidadhtd_wccaud_datos_wcds_4_tfcctlindsc_sel = AV37TFCCTLinDsc_Sel ;
      AV56Controlcalidadhtd_wccaud_datos_wcds_5_tfccval = AV38TFCCVal ;
      AV57Controlcalidadhtd_wccaud_datos_wcds_6_tfccval_sel = AV39TFCCVal_Sel ;
      AV58Controlcalidadhtd_wccaud_datos_wcds_7_tfccfvalstd = AV47TFCCfValStd ;
      AV59Controlcalidadhtd_wccaud_datos_wcds_8_tfccfvalstd_sel = AV48TFCCfValStd_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Short.valueOf(AV52Controlcalidadhtd_wccaud_datos_wcds_1_tfcctlin) ,
                                           Short.valueOf(AV53Controlcalidadhtd_wccaud_datos_wcds_2_tfcctlin_to) ,
                                           AV55Controlcalidadhtd_wccaud_datos_wcds_4_tfcctlindsc_sel ,
                                           AV54Controlcalidadhtd_wccaud_datos_wcds_3_tfcctlindsc ,
                                           AV57Controlcalidadhtd_wccaud_datos_wcds_6_tfccval_sel ,
                                           AV56Controlcalidadhtd_wccaud_datos_wcds_5_tfccval ,
                                           Short.valueOf(A4034CCTLin) ,
                                           A4043CCTLinDsc ,
                                           A4035CCVal ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) ,
                                           AV59Controlcalidadhtd_wccaud_datos_wcds_8_tfccfvalstd_sel ,
                                           AV58Controlcalidadhtd_wccaud_datos_wcds_7_tfccfvalstd ,
                                           A14419CCfValStd } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV54Controlcalidadhtd_wccaud_datos_wcds_3_tfcctlindsc = GXutil.padr( GXutil.rtrim( AV54Controlcalidadhtd_wccaud_datos_wcds_3_tfcctlindsc), 30, "%") ;
      lV56Controlcalidadhtd_wccaud_datos_wcds_5_tfccval = GXutil.padr( GXutil.rtrim( AV56Controlcalidadhtd_wccaud_datos_wcds_5_tfccval), 40, "%") ;
      /* Using cursor P0ANT2 */
      pr_default.execute(0, new Object[] {Short.valueOf(AV52Controlcalidadhtd_wccaud_datos_wcds_1_tfcctlin), Short.valueOf(AV53Controlcalidadhtd_wccaud_datos_wcds_2_tfcctlin_to), lV54Controlcalidadhtd_wccaud_datos_wcds_3_tfcctlindsc, AV55Controlcalidadhtd_wccaud_datos_wcds_4_tfcctlindsc_sel, lV56Controlcalidadhtd_wccaud_datos_wcds_5_tfccval, AV57Controlcalidadhtd_wccaud_datos_wcds_6_tfccval_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4035CCVal = P0ANT2_A4035CCVal[0] ;
         A4043CCTLinDsc = P0ANT2_A4043CCTLinDsc[0] ;
         A194BarOrdLin = P0ANT2_A194BarOrdLin[0] ;
         A758ProCod = P0ANT2_A758ProCod[0] ;
         A130BarCodPar = P0ANT2_A130BarCodPar[0] ;
         A132BarCodReo = P0ANT2_A132BarCodReo[0] ;
         A129BarCod = P0ANT2_A129BarCod[0] ;
         A136BarColNum = P0ANT2_A136BarColNum[0] ;
         A135BarColNom = P0ANT2_A135BarColNom[0] ;
         A4034CCTLin = P0ANT2_A4034CCTLin[0] ;
         A4031CCTCod = P0ANT2_A4031CCTCod[0] ;
         A212BarSer = P0ANT2_A212BarSer[0] ;
         A252CliCod = P0ANT2_A252CliCod[0] ;
         n252CliCod = P0ANT2_n252CliCod[0] ;
         A396EmprCod = P0ANT2_A396EmprCod[0] ;
         A136BarColNum = P0ANT2_A136BarColNum[0] ;
         A135BarColNom = P0ANT2_A135BarColNom[0] ;
         A212BarSer = P0ANT2_A212BarSer[0] ;
         A252CliCod = P0ANT2_A252CliCod[0] ;
         n252CliCod = P0ANT2_n252CliCod[0] ;
         A4043CCTLinDsc = P0ANT2_A4043CCTLinDsc[0] ;
         GXt_char2 = A14419CCfValStd ;
         GXv_char3[0] = GXt_char2 ;
         new app.controlcalidadhtd.pccstdval(remoteHandle, context).execute( A396EmprCod, A252CliCod, A212BarSer, A135BarColNom, A136BarColNum, A4031CCTCod, A4034CCTLin, GXv_char3) ;
         wccaud_datos_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
         A14419CCfValStd = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV59Controlcalidadhtd_wccaud_datos_wcds_8_tfccfvalstd_sel)==0) && ( ! (GXutil.strcmp("", AV58Controlcalidadhtd_wccaud_datos_wcds_7_tfccfvalstd)==0) ) ) || ( GXutil.like( GXutil.upper( A14419CCfValStd) , GXutil.padr( "%" + GXutil.upper( AV58Controlcalidadhtd_wccaud_datos_wcds_7_tfccfvalstd) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV59Controlcalidadhtd_wccaud_datos_wcds_8_tfccfvalstd_sel)==0) || ( ( GXutil.strcmp(A14419CCfValStd, AV59Controlcalidadhtd_wccaud_datos_wcds_8_tfccfvalstd_sel) == 0 ) ) )
            {
               AV14TextFileLine = "" ;
               /* Execute user subroutine: 'BEFOREWRITELINE' */
               S152 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
               AV14TextFileLine += GXutil.str( A4034CCTLin, 4, 0) ;
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A4043CCTLinDsc, ";", ","), GXv_char3) ;
               wccaud_datos_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A4035CCVal, ";", ","), GXv_char3) ;
               wccaud_datos_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A14419CCfValStd, ";", ","), GXv_char3) ;
               wccaud_datos_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
               /* Execute user subroutine: 'AFTERWRITELINE' */
               S162 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
               AV10TextFile.writeLine(AV14TextFileLine);
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S171( )
   {
      /* 'CLOSEDOCUMENT' Routine */
      returnInSub = false ;
      AV10TextFile.close();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      if ( AV10TextFile.getErrCode() == 0 )
      {
         if ( ! httpContext.isAjaxRequest( ) )
         {
            AV27HttpResponse.addHeader("Content-Type", "text/csv");
         }
         if ( ! httpContext.isAjaxRequest( ) )
         {
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=Wccaud_Datos_WCExportCSV.csv");
         }
         AV27HttpResponse.addFile(AV10TextFile.getAbsoluteName());
      }
   }

   public void S121( )
   {
      /* 'CHECKSTATUS' Routine */
      returnInSub = false ;
      if ( AV10TextFile.getErrCode() != 0 )
      {
         AV11Filename = "" ;
         AV12ErrorMessage = AV10TextFile.getErrDescription() ;
         AV10TextFile.close();
         AV27HttpResponse.addString(AV12ErrorMessage);
         httpContext.nUserReturn = (byte)(1) ;
         if ( httpContext.willRedirect( ) )
         {
            httpContext.redirect( httpContext.wjLoc );
            httpContext.wjLoc = "" ;
         }
         returnInSub = true;
         if (true) return;
      }
   }

   public void S181( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue("ControlCalidadHTD.Wccaud_Datos_WCGridState"), "") == 0 )
      {
         AV32GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "ControlCalidadHTD.Wccaud_Datos_WCGridState"), null, null);
      }
      else
      {
         AV32GridState.fromxml(AV19Session.getValue("ControlCalidadHTD.Wccaud_Datos_WCGridState"), null, null);
      }
      AV28OrderedBy = AV32GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV32GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV60GXV1 = 1 ;
      while ( AV60GXV1 <= AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV60GXV1));
         if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTLIN") == 0 )
         {
            AV34TFCCTLin = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV35TFCCTLin_To = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTLINDSC") == 0 )
         {
            AV36TFCCTLinDsc = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTLINDSC_SEL") == 0 )
         {
            AV37TFCCTLinDsc_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCVAL") == 0 )
         {
            AV38TFCCVal = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCVAL_SEL") == 0 )
         {
            AV39TFCCVal_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCFVALSTD") == 0 )
         {
            AV47TFCCfValStd = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCFVALSTD_SEL") == 0 )
         {
            AV48TFCCfValStd_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV60GXV1 = (int)(AV60GXV1+1) ;
      }
   }

   public void S152( )
   {
      /* 'BEFOREWRITELINE' Routine */
      returnInSub = false ;
   }

   public void S162( )
   {
      /* 'AFTERWRITELINE' Routine */
      returnInSub = false ;
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

   protected String EncryptURLParameters( )
   {
      return "NO";
   }

   protected void cleanup( )
   {
      CloseOpenCursors();
      super.cleanup();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXKey = "" ;
      gxfirstwebparm = "" ;
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV11Filename = "" ;
      AV10TextFile = new com.genexus.util.GXFile();
      AV14TextFileLine = "" ;
      A4043CCTLinDsc = "" ;
      A4035CCVal = "" ;
      A14419CCfValStd = "" ;
      AV54Controlcalidadhtd_wccaud_datos_wcds_3_tfcctlindsc = "" ;
      AV36TFCCTLinDsc = "" ;
      AV55Controlcalidadhtd_wccaud_datos_wcds_4_tfcctlindsc_sel = "" ;
      AV37TFCCTLinDsc_Sel = "" ;
      AV56Controlcalidadhtd_wccaud_datos_wcds_5_tfccval = "" ;
      AV38TFCCVal = "" ;
      AV57Controlcalidadhtd_wccaud_datos_wcds_6_tfccval_sel = "" ;
      AV39TFCCVal_Sel = "" ;
      AV58Controlcalidadhtd_wccaud_datos_wcds_7_tfccfvalstd = "" ;
      AV47TFCCfValStd = "" ;
      AV59Controlcalidadhtd_wccaud_datos_wcds_8_tfccfvalstd_sel = "" ;
      AV48TFCCfValStd_Sel = "" ;
      scmdbuf = "" ;
      lV54Controlcalidadhtd_wccaud_datos_wcds_3_tfcctlindsc = "" ;
      lV56Controlcalidadhtd_wccaud_datos_wcds_5_tfccval = "" ;
      P0ANT2_A4035CCVal = new String[] {""} ;
      P0ANT2_A4043CCTLinDsc = new String[] {""} ;
      P0ANT2_A194BarOrdLin = new short[1] ;
      P0ANT2_A758ProCod = new String[] {""} ;
      P0ANT2_A130BarCodPar = new String[] {""} ;
      P0ANT2_A132BarCodReo = new byte[1] ;
      P0ANT2_A129BarCod = new int[1] ;
      P0ANT2_A136BarColNum = new int[1] ;
      P0ANT2_A135BarColNom = new String[] {""} ;
      P0ANT2_A4034CCTLin = new short[1] ;
      P0ANT2_A4031CCTCod = new int[1] ;
      P0ANT2_A212BarSer = new String[] {""} ;
      P0ANT2_A252CliCod = new int[1] ;
      P0ANT2_n252CliCod = new boolean[] {false} ;
      P0ANT2_A396EmprCod = new String[] {""} ;
      A758ProCod = "" ;
      A130BarCodPar = "" ;
      A135BarColNom = "" ;
      A212BarSer = "" ;
      A396EmprCod = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV19Session = httpContext.getWebSession();
      AV32GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV33GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.wccaud_datos_wcexportcsv__default(),
         new Object[] {
             new Object[] {
            P0ANT2_A4035CCVal, P0ANT2_A4043CCTLinDsc, P0ANT2_A194BarOrdLin, P0ANT2_A758ProCod, P0ANT2_A130BarCodPar, P0ANT2_A132BarCodReo, P0ANT2_A129BarCod, P0ANT2_A136BarColNum, P0ANT2_A135BarColNom, P0ANT2_A4034CCTLin,
            P0ANT2_A4031CCTCod, P0ANT2_A212BarSer, P0ANT2_A252CliCod, P0ANT2_n252CliCod, P0ANT2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short gxcookieaux ;
   private short A4034CCTLin ;
   private short AV52Controlcalidadhtd_wccaud_datos_wcds_1_tfcctlin ;
   private short AV34TFCCTLin ;
   private short AV53Controlcalidadhtd_wccaud_datos_wcds_2_tfcctlin_to ;
   private short AV35TFCCTLin_To ;
   private short AV28OrderedBy ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int AV13Random ;
   private int A129BarCod ;
   private int A136BarColNum ;
   private int A4031CCTCod ;
   private int A252CliCod ;
   private int AV60GXV1 ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A4043CCTLinDsc ;
   private String A4035CCVal ;
   private String A14419CCfValStd ;
   private String AV54Controlcalidadhtd_wccaud_datos_wcds_3_tfcctlindsc ;
   private String AV36TFCCTLinDsc ;
   private String AV55Controlcalidadhtd_wccaud_datos_wcds_4_tfcctlindsc_sel ;
   private String AV37TFCCTLinDsc_Sel ;
   private String AV56Controlcalidadhtd_wccaud_datos_wcds_5_tfccval ;
   private String AV38TFCCVal ;
   private String AV57Controlcalidadhtd_wccaud_datos_wcds_6_tfccval_sel ;
   private String AV39TFCCVal_Sel ;
   private String AV58Controlcalidadhtd_wccaud_datos_wcds_7_tfccfvalstd ;
   private String AV47TFCCfValStd ;
   private String AV59Controlcalidadhtd_wccaud_datos_wcds_8_tfccfvalstd_sel ;
   private String AV48TFCCfValStd_Sel ;
   private String scmdbuf ;
   private String lV54Controlcalidadhtd_wccaud_datos_wcds_3_tfcctlindsc ;
   private String lV56Controlcalidadhtd_wccaud_datos_wcds_5_tfccval ;
   private String A758ProCod ;
   private String A130BarCodPar ;
   private String A135BarColNom ;
   private String A212BarSer ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean n252CliCod ;
   private String AV14TextFileLine ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private String[] P0ANT2_A4035CCVal ;
   private String[] P0ANT2_A4043CCTLinDsc ;
   private short[] P0ANT2_A194BarOrdLin ;
   private String[] P0ANT2_A758ProCod ;
   private String[] P0ANT2_A130BarCodPar ;
   private byte[] P0ANT2_A132BarCodReo ;
   private int[] P0ANT2_A129BarCod ;
   private int[] P0ANT2_A136BarColNum ;
   private String[] P0ANT2_A135BarColNom ;
   private short[] P0ANT2_A4034CCTLin ;
   private int[] P0ANT2_A4031CCTCod ;
   private String[] P0ANT2_A212BarSer ;
   private int[] P0ANT2_A252CliCod ;
   private boolean[] P0ANT2_n252CliCod ;
   private String[] P0ANT2_A396EmprCod ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV32GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV33GridStateFilterValue ;
}

final  class wccaud_datos_wcexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0ANT2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV52Controlcalidadhtd_wccaud_datos_wcds_1_tfcctlin ,
                                          short AV53Controlcalidadhtd_wccaud_datos_wcds_2_tfcctlin_to ,
                                          String AV55Controlcalidadhtd_wccaud_datos_wcds_4_tfcctlindsc_sel ,
                                          String AV54Controlcalidadhtd_wccaud_datos_wcds_3_tfcctlindsc ,
                                          String AV57Controlcalidadhtd_wccaud_datos_wcds_6_tfccval_sel ,
                                          String AV56Controlcalidadhtd_wccaud_datos_wcds_5_tfccval ,
                                          short A4034CCTLin ,
                                          String A4043CCTLinDsc ,
                                          String A4035CCVal ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc ,
                                          String AV59Controlcalidadhtd_wccaud_datos_wcds_8_tfccfvalstd_sel ,
                                          String AV58Controlcalidadhtd_wccaud_datos_wcds_7_tfccfvalstd ,
                                          String A14419CCfValStd )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[6];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.CCVal, T3.CCTLinDsc, T1.BarOrdLin, T1.ProCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T2.BarColNum, T2.BarColNom, T1.CCTLin, T1.CCTCod, T2.BarSer, T2.CliCod," ;
      scmdbuf += " T1.EmprCod FROM ((TXPCC1 T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      scmdbuf += " INNER JOIN TXPCCDef1 T3 ON T3.EmprCod = T1.EmprCod AND T3.CCTCod = T1.CCTCod AND T3.CCTLin = T1.CCTLin)" ;
      if ( ! (0==AV52Controlcalidadhtd_wccaud_datos_wcds_1_tfcctlin) )
      {
         addWhere(sWhereString, "(T1.CCTLin >= ?)");
      }
      else
      {
         GXv_int4[0] = (byte)(1) ;
      }
      if ( ! (0==AV53Controlcalidadhtd_wccaud_datos_wcds_2_tfcctlin_to) )
      {
         addWhere(sWhereString, "(T1.CCTLin <= ?)");
      }
      else
      {
         GXv_int4[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55Controlcalidadhtd_wccaud_datos_wcds_4_tfcctlindsc_sel)==0) && ( ! (GXutil.strcmp("", AV54Controlcalidadhtd_wccaud_datos_wcds_3_tfcctlindsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CCTLinDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Controlcalidadhtd_wccaud_datos_wcds_4_tfcctlindsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CCTLinDsc = ?)");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Controlcalidadhtd_wccaud_datos_wcds_6_tfccval_sel)==0) && ( ! (GXutil.strcmp("", AV56Controlcalidadhtd_wccaud_datos_wcds_5_tfccval)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCVal) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Controlcalidadhtd_wccaud_datos_wcds_6_tfccval_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCVal = ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV28OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin, T1.CCTCod" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CCTLin" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CCTLin DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.CCTLinDsc" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.CCTLinDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CCVal" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CCVal DESC" ;
      }
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
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
                  return conditional_P0ANT2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).shortValue() , ((Boolean) dynConstraints[10]).booleanValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ANT2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 13);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 16);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(14, 3);
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
                  stmt.setShort(sIdx, ((Number) parms[6]).shortValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[7]).shortValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 40);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 40);
               }
               return;
      }
   }

}

