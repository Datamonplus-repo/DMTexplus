package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class consultadeproduccion_albaranesproduccionexportcsv_impl extends GXWebProcedure
{
   public consultadeproduccion_albaranesproduccionexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV40Var_Hdr = AV41WebSession.getValue("&Var_Hdr") ;
      AV34EmprCod = GXutil.substring( AV40Var_Hdr, 1, 3) ;
      AV35BarCod = (int)(GXutil.lval( GXutil.substring( AV40Var_Hdr, 4, 8))) ;
      AV36BarCodReo = (byte)(GXutil.lval( GXutil.substring( AV40Var_Hdr, 12, 1))) ;
      AV37BarCodPar = GXutil.substring( AV40Var_Hdr, 13, 1) ;
      AV41WebSession.remove("&Var_Hdr");
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
      AV11Filename = "./PrivateTempStorage/" + "ConsultadeProduccion_AlbaranesProduccionExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      AV14TextFileLine += httpContext.getMessage( "Nº Documento", "") ;
      AV14TextFileLine += ";" ;
      AV14TextFileLine += httpContext.getMessage( "Fecha", "") ;
      AV14TextFileLine += ";" ;
      AV14TextFileLine += httpContext.getMessage( "Kilos Ent", "") ;
      AV14TextFileLine += ";" ;
      AV14TextFileLine += httpContext.getMessage( "Metros Ent", "") ;
      AV14TextFileLine += ";" ;
      AV14TextFileLine += httpContext.getMessage( "Piezas Ent", "") ;
      AV10TextFile.writeLine(AV14TextFileLine);
   }

   public void S141( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV52Consultadeproduccion_albaranesproduccionds_1_emprcod = AV34EmprCod ;
      AV53Consultadeproduccion_albaranesproduccionds_2_barcod = AV35BarCod ;
      AV54Consultadeproduccion_albaranesproduccionds_3_barcodreo = AV36BarCodReo ;
      AV55Consultadeproduccion_albaranesproduccionds_4_barcodpar = AV37BarCodPar ;
      AV56Consultadeproduccion_albaranesproduccionds_5_tfalbprocod = AV22TFAlbProCod ;
      AV57Consultadeproduccion_albaranesproduccionds_6_tfalbprocod_to = AV23TFAlbProCod_To ;
      AV58Consultadeproduccion_albaranesproduccionds_7_tfalbprofch = AV24TFAlbProfch ;
      AV59Consultadeproduccion_albaranesproduccionds_8_tfbaralbkgme = AV28TFBarAlbKgmE ;
      AV60Consultadeproduccion_albaranesproduccionds_9_tfbaralbkgme_to = AV29TFBarAlbKgmE_To ;
      AV61Consultadeproduccion_albaranesproduccionds_10_tfbaralbmtre = AV30TFBarAlbMtrE ;
      AV62Consultadeproduccion_albaranesproduccionds_11_tfbaralbmtre_to = AV31TFBarAlbMtrE_To ;
      AV63Consultadeproduccion_albaranesproduccionds_12_tfbaralbpie = AV32TFBarAlbPie ;
      AV64Consultadeproduccion_albaranesproduccionds_13_tfbaralbpie_to = AV33TFBarAlbPie_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Long.valueOf(AV56Consultadeproduccion_albaranesproduccionds_5_tfalbprocod) ,
                                           Long.valueOf(AV57Consultadeproduccion_albaranesproduccionds_6_tfalbprocod_to) ,
                                           AV58Consultadeproduccion_albaranesproduccionds_7_tfalbprofch ,
                                           AV59Consultadeproduccion_albaranesproduccionds_8_tfbaralbkgme ,
                                           AV60Consultadeproduccion_albaranesproduccionds_9_tfbaralbkgme_to ,
                                           AV61Consultadeproduccion_albaranesproduccionds_10_tfbaralbmtre ,
                                           AV62Consultadeproduccion_albaranesproduccionds_11_tfbaralbmtre_to ,
                                           Integer.valueOf(AV63Consultadeproduccion_albaranesproduccionds_12_tfbaralbpie) ,
                                           Integer.valueOf(AV64Consultadeproduccion_albaranesproduccionds_13_tfbaralbpie_to) ,
                                           Long.valueOf(A30AlbProCod) ,
                                           A34AlbProfch ,
                                           A1261BarAlbKgmE ,
                                           A1263BarAlbMtrE ,
                                           Integer.valueOf(A1265BarAlbPie) ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           A396EmprCod ,
                                           AV34EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV35BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV36BarCodReo) ,
                                           A130BarCodPar ,
                                           AV37BarCodPar ,
                                           AV52Consultadeproduccion_albaranesproduccionds_1_emprcod ,
                                           Integer.valueOf(AV53Consultadeproduccion_albaranesproduccionds_2_barcod) ,
                                           Byte.valueOf(AV54Consultadeproduccion_albaranesproduccionds_3_barcodreo) ,
                                           AV55Consultadeproduccion_albaranesproduccionds_4_barcodpar } ,
                                           new int[]{
                                           TypeConstants.LONG, TypeConstants.LONG, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.LONG,
                                           TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      /* Using cursor P09WY2 */
      pr_default.execute(0, new Object[] {AV52Consultadeproduccion_albaranesproduccionds_1_emprcod, Integer.valueOf(AV53Consultadeproduccion_albaranesproduccionds_2_barcod), Byte.valueOf(AV54Consultadeproduccion_albaranesproduccionds_3_barcodreo), AV55Consultadeproduccion_albaranesproduccionds_4_barcodpar, AV34EmprCod, Integer.valueOf(AV35BarCod), Byte.valueOf(AV36BarCodReo), AV37BarCodPar, Long.valueOf(AV56Consultadeproduccion_albaranesproduccionds_5_tfalbprocod), Long.valueOf(AV57Consultadeproduccion_albaranesproduccionds_6_tfalbprocod_to), AV58Consultadeproduccion_albaranesproduccionds_7_tfalbprofch, AV59Consultadeproduccion_albaranesproduccionds_8_tfbaralbkgme, AV60Consultadeproduccion_albaranesproduccionds_9_tfbaralbkgme_to, AV61Consultadeproduccion_albaranesproduccionds_10_tfbaralbmtre, AV62Consultadeproduccion_albaranesproduccionds_11_tfbaralbmtre_to, Integer.valueOf(AV63Consultadeproduccion_albaranesproduccionds_12_tfbaralbpie), Integer.valueOf(AV64Consultadeproduccion_albaranesproduccionds_13_tfbaralbpie_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1265BarAlbPie = P09WY2_A1265BarAlbPie[0] ;
         A1263BarAlbMtrE = P09WY2_A1263BarAlbMtrE[0] ;
         A1261BarAlbKgmE = P09WY2_A1261BarAlbKgmE[0] ;
         A34AlbProfch = P09WY2_A34AlbProfch[0] ;
         A30AlbProCod = P09WY2_A30AlbProCod[0] ;
         A130BarCodPar = P09WY2_A130BarCodPar[0] ;
         A132BarCodReo = P09WY2_A132BarCodReo[0] ;
         A129BarCod = P09WY2_A129BarCod[0] ;
         A396EmprCod = P09WY2_A396EmprCod[0] ;
         A34AlbProfch = P09WY2_A34AlbProfch[0] ;
         AV14TextFileLine = "" ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S152 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         AV14TextFileLine += GXutil.str( A30AlbProCod, 10, 0) ;
         AV14TextFileLine += ";" ;
         AV14TextFileLine += localUtil.dtoc( A34AlbProfch, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
         AV14TextFileLine += ";" ;
         AV14TextFileLine += GXutil.str( A1261BarAlbKgmE, 9, 2) ;
         AV14TextFileLine += ";" ;
         AV14TextFileLine += GXutil.str( A1263BarAlbMtrE, 9, 2) ;
         AV14TextFileLine += ";" ;
         AV14TextFileLine += GXutil.str( A1265BarAlbPie, 6, 0) ;
         /* Execute user subroutine: 'AFTERWRITELINE' */
         S162 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         AV10TextFile.writeLine(AV14TextFileLine);
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
            AV15HttpResponse.addHeader("Content-Type", "text/csv");
         }
         if ( ! httpContext.isAjaxRequest( ) )
         {
            AV15HttpResponse.addHeader("Content-Disposition", "attachment;filename=ConsultadeProduccion_AlbaranesProduccionExportCSV.csv");
         }
         AV15HttpResponse.addFile(AV10TextFile.getAbsoluteName());
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
         AV15HttpResponse.addString(AV12ErrorMessage);
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
      if ( GXutil.strcmp(AV18Session.getValue("ConsultadeProduccion_AlbaranesProduccionGridState"), "") == 0 )
      {
         AV20GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "ConsultadeProduccion_AlbaranesProduccionGridState"), null, null);
      }
      else
      {
         AV20GridState.fromxml(AV18Session.getValue("ConsultadeProduccion_AlbaranesProduccionGridState"), null, null);
      }
      AV16OrderedBy = AV20GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV20GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV65GXV1 = 1 ;
      while ( AV65GXV1 <= AV20GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV21GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV20GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV65GXV1));
         if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROCOD") == 0 )
         {
            AV22TFAlbProCod = GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            AV23TFAlbProCod_To = GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROFCH") == 0 )
         {
            AV24TFAlbProfch = localUtil.ctod( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARALBKGME") == 0 )
         {
            AV28TFBarAlbKgmE = CommonUtil.decimalVal( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV29TFBarAlbKgmE_To = CommonUtil.decimalVal( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARALBMTRE") == 0 )
         {
            AV30TFBarAlbMtrE = CommonUtil.decimalVal( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV31TFBarAlbMtrE_To = CommonUtil.decimalVal( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARALBPIE") == 0 )
         {
            AV32TFBarAlbPie = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV33TFBarAlbPie_To = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV34EmprCod = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOD") == 0 )
         {
            AV35BarCod = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODREO") == 0 )
         {
            AV36BarCodReo = (byte)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODPAR") == 0 )
         {
            AV37BarCodPar = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD") == 0 )
         {
            AV42Clicod = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLINOM") == 0 )
         {
            AV43CliNom = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PEDIDOCLIENTE") == 0 )
         {
            AV44PedidoCliente = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARSER") == 0 )
         {
            AV45Barser = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARSERDSC") == 0 )
         {
            AV46BarSerDsc = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOLNOM") == 0 )
         {
            AV47Barcolnom = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOLNUM") == 0 )
         {
            AV48Barcolnum = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARKGM") == 0 )
         {
            AV38BarKgm = CommonUtil.decimalVal( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARMTR") == 0 )
         {
            AV39BarMtr = CommonUtil.decimalVal( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
         }
         AV65GXV1 = (int)(AV65GXV1+1) ;
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
      AV40Var_Hdr = "" ;
      AV41WebSession = httpContext.getWebSession();
      AV34EmprCod = "" ;
      AV37BarCodPar = "" ;
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV11Filename = "" ;
      AV10TextFile = new com.genexus.util.GXFile();
      AV14TextFileLine = "" ;
      A34AlbProfch = GXutil.nullDate() ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      AV52Consultadeproduccion_albaranesproduccionds_1_emprcod = "" ;
      AV55Consultadeproduccion_albaranesproduccionds_4_barcodpar = "" ;
      AV58Consultadeproduccion_albaranesproduccionds_7_tfalbprofch = GXutil.nullDate() ;
      AV24TFAlbProfch = GXutil.nullDate() ;
      AV59Consultadeproduccion_albaranesproduccionds_8_tfbaralbkgme = DecimalUtil.ZERO ;
      AV28TFBarAlbKgmE = DecimalUtil.ZERO ;
      AV60Consultadeproduccion_albaranesproduccionds_9_tfbaralbkgme_to = DecimalUtil.ZERO ;
      AV29TFBarAlbKgmE_To = DecimalUtil.ZERO ;
      AV61Consultadeproduccion_albaranesproduccionds_10_tfbaralbmtre = DecimalUtil.ZERO ;
      AV30TFBarAlbMtrE = DecimalUtil.ZERO ;
      AV62Consultadeproduccion_albaranesproduccionds_11_tfbaralbmtre_to = DecimalUtil.ZERO ;
      AV31TFBarAlbMtrE_To = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      P09WY2_A1265BarAlbPie = new int[1] ;
      P09WY2_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09WY2_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09WY2_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      P09WY2_A30AlbProCod = new long[1] ;
      P09WY2_A130BarCodPar = new String[] {""} ;
      P09WY2_A132BarCodReo = new byte[1] ;
      P09WY2_A129BarCod = new int[1] ;
      P09WY2_A396EmprCod = new String[] {""} ;
      AV15HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV18Session = httpContext.getWebSession();
      AV20GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV21GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV43CliNom = "" ;
      AV44PedidoCliente = "" ;
      AV45Barser = "" ;
      AV46BarSerDsc = "" ;
      AV47Barcolnom = "" ;
      AV38BarKgm = DecimalUtil.ZERO ;
      AV39BarMtr = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.consultadeproduccion_albaranesproduccionexportcsv__default(),
         new Object[] {
             new Object[] {
            P09WY2_A1265BarAlbPie, P09WY2_A1263BarAlbMtrE, P09WY2_A1261BarAlbKgmE, P09WY2_A34AlbProfch, P09WY2_A30AlbProCod, P09WY2_A130BarCodPar, P09WY2_A132BarCodReo, P09WY2_A129BarCod, P09WY2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV36BarCodReo ;
   private byte AV54Consultadeproduccion_albaranesproduccionds_3_barcodreo ;
   private byte A132BarCodReo ;
   private short gxcookieaux ;
   private short AV16OrderedBy ;
   private short Gx_err ;
   private int AV35BarCod ;
   private int AV13Random ;
   private int A1265BarAlbPie ;
   private int AV53Consultadeproduccion_albaranesproduccionds_2_barcod ;
   private int AV63Consultadeproduccion_albaranesproduccionds_12_tfbaralbpie ;
   private int AV32TFBarAlbPie ;
   private int AV64Consultadeproduccion_albaranesproduccionds_13_tfbaralbpie_to ;
   private int AV33TFBarAlbPie_To ;
   private int A129BarCod ;
   private int AV65GXV1 ;
   private int AV42Clicod ;
   private int AV48Barcolnum ;
   private long A30AlbProCod ;
   private long AV56Consultadeproduccion_albaranesproduccionds_5_tfalbprocod ;
   private long AV22TFAlbProCod ;
   private long AV57Consultadeproduccion_albaranesproduccionds_6_tfalbprocod_to ;
   private long AV23TFAlbProCod_To ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal AV59Consultadeproduccion_albaranesproduccionds_8_tfbaralbkgme ;
   private java.math.BigDecimal AV28TFBarAlbKgmE ;
   private java.math.BigDecimal AV60Consultadeproduccion_albaranesproduccionds_9_tfbaralbkgme_to ;
   private java.math.BigDecimal AV29TFBarAlbKgmE_To ;
   private java.math.BigDecimal AV61Consultadeproduccion_albaranesproduccionds_10_tfbaralbmtre ;
   private java.math.BigDecimal AV30TFBarAlbMtrE ;
   private java.math.BigDecimal AV62Consultadeproduccion_albaranesproduccionds_11_tfbaralbmtre_to ;
   private java.math.BigDecimal AV31TFBarAlbMtrE_To ;
   private java.math.BigDecimal AV38BarKgm ;
   private java.math.BigDecimal AV39BarMtr ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV40Var_Hdr ;
   private String AV34EmprCod ;
   private String AV37BarCodPar ;
   private String AV52Consultadeproduccion_albaranesproduccionds_1_emprcod ;
   private String AV55Consultadeproduccion_albaranesproduccionds_4_barcodpar ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV43CliNom ;
   private String AV44PedidoCliente ;
   private String AV45Barser ;
   private String AV46BarSerDsc ;
   private String AV47Barcolnom ;
   private java.util.Date A34AlbProfch ;
   private java.util.Date AV58Consultadeproduccion_albaranesproduccionds_7_tfalbprofch ;
   private java.util.Date AV24TFAlbProfch ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private String AV14TextFileLine ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV41WebSession ;
   private com.genexus.webpanels.WebSession AV18Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private int[] P09WY2_A1265BarAlbPie ;
   private java.math.BigDecimal[] P09WY2_A1263BarAlbMtrE ;
   private java.math.BigDecimal[] P09WY2_A1261BarAlbKgmE ;
   private java.util.Date[] P09WY2_A34AlbProfch ;
   private long[] P09WY2_A30AlbProCod ;
   private String[] P09WY2_A130BarCodPar ;
   private byte[] P09WY2_A132BarCodReo ;
   private int[] P09WY2_A129BarCod ;
   private String[] P09WY2_A396EmprCod ;
   private com.genexus.internet.HttpResponse AV15HttpResponse ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV20GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV21GridStateFilterValue ;
}

final  class consultadeproduccion_albaranesproduccionexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09WY2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          long AV56Consultadeproduccion_albaranesproduccionds_5_tfalbprocod ,
                                          long AV57Consultadeproduccion_albaranesproduccionds_6_tfalbprocod_to ,
                                          java.util.Date AV58Consultadeproduccion_albaranesproduccionds_7_tfalbprofch ,
                                          java.math.BigDecimal AV59Consultadeproduccion_albaranesproduccionds_8_tfbaralbkgme ,
                                          java.math.BigDecimal AV60Consultadeproduccion_albaranesproduccionds_9_tfbaralbkgme_to ,
                                          java.math.BigDecimal AV61Consultadeproduccion_albaranesproduccionds_10_tfbaralbmtre ,
                                          java.math.BigDecimal AV62Consultadeproduccion_albaranesproduccionds_11_tfbaralbmtre_to ,
                                          int AV63Consultadeproduccion_albaranesproduccionds_12_tfbaralbpie ,
                                          int AV64Consultadeproduccion_albaranesproduccionds_13_tfbaralbpie_to ,
                                          long A30AlbProCod ,
                                          java.util.Date A34AlbProfch ,
                                          java.math.BigDecimal A1261BarAlbKgmE ,
                                          java.math.BigDecimal A1263BarAlbMtrE ,
                                          int A1265BarAlbPie ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String A396EmprCod ,
                                          String AV34EmprCod ,
                                          int A129BarCod ,
                                          int AV35BarCod ,
                                          byte A132BarCodReo ,
                                          byte AV36BarCodReo ,
                                          String A130BarCodPar ,
                                          String AV37BarCodPar ,
                                          String AV52Consultadeproduccion_albaranesproduccionds_1_emprcod ,
                                          int AV53Consultadeproduccion_albaranesproduccionds_2_barcod ,
                                          byte AV54Consultadeproduccion_albaranesproduccionds_3_barcodreo ,
                                          String AV55Consultadeproduccion_albaranesproduccionds_4_barcodpar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[17];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.BarAlbPie, T1.BarAlbMtrE, T1.BarAlbKgmE, T2.AlbProfch, T1.AlbProCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod FROM (TXPALBBAR T1 INNER JOIN TXPCALPRD" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbProCod = T1.AlbProCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      if ( ! (0==AV56Consultadeproduccion_albaranesproduccionds_5_tfalbprocod) )
      {
         addWhere(sWhereString, "(T1.AlbProCod >= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (0==AV57Consultadeproduccion_albaranesproduccionds_6_tfalbprocod_to) )
      {
         addWhere(sWhereString, "(T1.AlbProCod <= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV58Consultadeproduccion_albaranesproduccionds_7_tfalbprofch)) )
      {
         addWhere(sWhereString, "(T2.AlbProfch >= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV59Consultadeproduccion_albaranesproduccionds_8_tfbaralbkgme)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbKgmE >= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV60Consultadeproduccion_albaranesproduccionds_9_tfbaralbkgme_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbKgmE <= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV61Consultadeproduccion_albaranesproduccionds_10_tfbaralbmtre)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbMtrE >= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV62Consultadeproduccion_albaranesproduccionds_11_tfbaralbmtre_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbMtrE <= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (0==AV63Consultadeproduccion_albaranesproduccionds_12_tfbaralbpie) )
      {
         addWhere(sWhereString, "(T1.BarAlbPie >= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (0==AV64Consultadeproduccion_albaranesproduccionds_13_tfbaralbpie_to) )
      {
         addWhere(sWhereString, "(T1.BarAlbPie <= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV16OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.AlbProCod" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.AlbProCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.AlbProfch" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T2.AlbProfch DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarAlbKgmE" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.BarAlbKgmE DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarAlbMtrE" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.BarAlbMtrE DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarAlbPie" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.BarAlbPie DESC" ;
      }
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
                  return conditional_P09WY2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).longValue() , ((Number) dynConstraints[1]).longValue() , (java.util.Date)dynConstraints[2] , (java.math.BigDecimal)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).longValue() , (java.util.Date)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).shortValue() , ((Boolean) dynConstraints[15]).booleanValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).byteValue() , (String)dynConstraints[27] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09WY2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((long[]) buf[4])[0] = rslt.getLong(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 3);
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
                  stmt.setString(sIdx, (String)parms[17], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[19]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 3);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[22]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[23]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 1);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[25]).longValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[26]).longValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[27]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[28], 2);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 2);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[30], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[31], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               return;
      }
   }

}

