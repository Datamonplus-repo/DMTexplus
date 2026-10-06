package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class entradarecuentos__wcexportcsv_impl extends GXWebProcedure
{
   public entradarecuentos__wcexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "EntradaRecuentos__WCExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      AV14TextFileLine += httpContext.getMessage( "Producto", "") ;
      AV14TextFileLine += ";" ;
      AV14TextFileLine += httpContext.getMessage( "Descripcion", "") ;
      AV14TextFileLine += ";" ;
      AV14TextFileLine += httpContext.getMessage( "Cant. Teo.", "") ;
      AV14TextFileLine += ";" ;
      AV14TextFileLine += httpContext.getMessage( "Cant. Real", "") ;
      AV14TextFileLine += ";" ;
      AV14TextFileLine += httpContext.getMessage( "Dif.", "") ;
      AV14TextFileLine += ";" ;
      AV14TextFileLine += httpContext.getMessage( "Lote", "") ;
      AV10TextFile.writeLine(AV14TextFileLine);
   }

   public void S141( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV45Entradarecuentos__wcds_1_filterfulltext = AV20FilterFullText ;
      AV46Entradarecuentos__wcds_2_tfprdnum = AV30TFPrdNum ;
      AV47Entradarecuentos__wcds_3_tfprdnum_sel = AV31TFPrdNum_Sel ;
      AV48Entradarecuentos__wcds_4_tfprdnom = AV32TFPrdNom ;
      AV49Entradarecuentos__wcds_5_tfprdnom_sel = AV33TFPrdNom_Sel ;
      AV50Entradarecuentos__wcds_6_tfrecexiteo = AV34TFRecExiTeo ;
      AV51Entradarecuentos__wcds_7_tfrecexiteo_to = AV35TFRecExiTeo_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV45Entradarecuentos__wcds_1_filterfulltext ,
                                           AV47Entradarecuentos__wcds_3_tfprdnum_sel ,
                                           AV46Entradarecuentos__wcds_2_tfprdnum ,
                                           AV49Entradarecuentos__wcds_5_tfprdnom_sel ,
                                           AV48Entradarecuentos__wcds_4_tfprdnom ,
                                           AV50Entradarecuentos__wcds_6_tfrecexiteo ,
                                           AV51Entradarecuentos__wcds_7_tfrecexiteo_to ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A809RecExiTeo ,
                                           Short.valueOf(AV18OrderedBy) ,
                                           Boolean.valueOf(AV19OrderedDsc) ,
                                           A727PrdRec ,
                                           Byte.valueOf(A13416RecEstInv) ,
                                           AV16Emprcod ,
                                           AV17RecFec ,
                                           A396EmprCod ,
                                           A810RecFec } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.DATE
                                           }
      });
      lV45Entradarecuentos__wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV45Entradarecuentos__wcds_1_filterfulltext), "%", "") ;
      lV45Entradarecuentos__wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV45Entradarecuentos__wcds_1_filterfulltext), "%", "") ;
      lV45Entradarecuentos__wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV45Entradarecuentos__wcds_1_filterfulltext), "%", "") ;
      lV46Entradarecuentos__wcds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV46Entradarecuentos__wcds_2_tfprdnum), 6, "%") ;
      lV48Entradarecuentos__wcds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV48Entradarecuentos__wcds_4_tfprdnom), 26, "%") ;
      /* Using cursor P09LS2 */
      pr_default.execute(0, new Object[] {AV16Emprcod, AV17RecFec, lV45Entradarecuentos__wcds_1_filterfulltext, lV45Entradarecuentos__wcds_1_filterfulltext, lV45Entradarecuentos__wcds_1_filterfulltext, lV46Entradarecuentos__wcds_2_tfprdnum, AV47Entradarecuentos__wcds_3_tfprdnum_sel, lV48Entradarecuentos__wcds_4_tfprdnom, AV49Entradarecuentos__wcds_5_tfprdnom_sel, AV50Entradarecuentos__wcds_6_tfrecexiteo, AV51Entradarecuentos__wcds_7_tfrecexiteo_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13416RecEstInv = P09LS2_A13416RecEstInv[0] ;
         A727PrdRec = P09LS2_A727PrdRec[0] ;
         A810RecFec = P09LS2_A810RecFec[0] ;
         A396EmprCod = P09LS2_A396EmprCod[0] ;
         A809RecExiTeo = P09LS2_A809RecExiTeo[0] ;
         A718PrdNom = P09LS2_A718PrdNom[0] ;
         A719PrdNum = P09LS2_A719PrdNum[0] ;
         A12285RecLot = P09LS2_A12285RecLot[0] ;
         A727PrdRec = P09LS2_A727PrdRec[0] ;
         A718PrdNom = P09LS2_A718PrdNom[0] ;
         if ( GXutil.strcmp(A727PrdRec, httpContext.getMessage( "S", "")) == 0 )
         {
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
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A719PrdNum, ";", ","), GXv_char3) ;
            entradarecuentos__wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A718PrdNom, ";", ","), GXv_char3) ;
            entradarecuentos__wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A809RecExiTeo, 12, 4) ;
            AV21RecExiRea = A809RecExiTeo ;
            /* * Property Backcolor not supported in */
            /* * Property Backcolor not supported in */
            /* * Property Backcolor not supported in */
            /* * Property Backcolor not supported in */
            /*
               Assignment error:
               ================
               Expression: [ t('rgb(',1),t('255',3),t(',',7),t('0',3),t(',',7),t('0',3),t(')',4) ]
               Target    : [ t('Recexirea',23),t('Backcolor',3) ]
               ForType   : 29
               Type      : []
            */
            /* * Property Forecolor not supported in */
            /* * Property Forecolor not supported in */
            /* * Property Forecolor not supported in */
            /* * Property Forecolor not supported in */
            /*
               Assignment error:
               ================
               Expression: [ t('rgb(',1),t('0',3),t(',',7),t('0',3),t(',',7),t('0',3),t(')',4) ]
               Target    : [ t('Recexirea',23),t('Forecolor',3) ]
               ForType   : 29
               Type      : []
            */
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( AV21RecExiRea, 12, 4) ;
            AV22Difer = A809RecExiTeo.subtract(AV21RecExiRea) ;
            /* * Property Backcolor not supported in */
            /* * Property Backcolor not supported in */
            /* * Property Backcolor not supported in */
            /* * Property Backcolor not supported in */
            /*
               Assignment error:
               ================
               Expression: [ t('rgb(',1),t('0',3),t(',',7),t('255',3),t(',',7),t('0',3),t(')',4) ]
               Target    : [ t('Difer',23),t('Backcolor',3) ]
               ForType   : 29
               Type      : []
            */
            /* * Property Forecolor not supported in */
            /* * Property Forecolor not supported in */
            /* * Property Forecolor not supported in */
            /* * Property Forecolor not supported in */
            /*
               Assignment error:
               ================
               Expression: [ t('rgb(',1),t('0',3),t(',',7),t('0',3),t(',',7),t('0',3),t(')',4) ]
               Target    : [ t('Difer',23),t('Forecolor',3) ]
               ForType   : 29
               Type      : []
            */
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( AV22Difer, 12, 4) ;
            AV25RecLot = A12285RecLot ;
            /* * Property Backcolor not supported in */
            /* * Property Backcolor not supported in */
            /* * Property Backcolor not supported in */
            /* * Property Backcolor not supported in */
            /*
               Assignment error:
               ================
               Expression: [ t('rgb(',1),t('255',3),t(',',7),t('0',3),t(',',7),t('0',3),t(')',4) ]
               Target    : [ t('Reclot',23),t('Backcolor',3) ]
               ForType   : 29
               Type      : []
            */
            /* * Property Forecolor not supported in */
            /* * Property Forecolor not supported in */
            /* * Property Forecolor not supported in */
            /* * Property Forecolor not supported in */
            /*
               Assignment error:
               ================
               Expression: [ t('rgb(',1),t('0',3),t(',',7),t('0',3),t(',',7),t('0',3),t(')',4) ]
               Target    : [ t('Reclot',23),t('Forecolor',3) ]
               ForType   : 29
               Type      : []
            */
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV25RecLot, ";", ","), GXv_char3) ;
            entradarecuentos__wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
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
            AV15HttpResponse.addHeader("Content-Type", "text/csv");
         }
         if ( ! httpContext.isAjaxRequest( ) )
         {
            AV15HttpResponse.addHeader("Content-Disposition", "attachment;filename=EntradaRecuentos__WCExportCSV.csv");
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
      if ( GXutil.strcmp(AV26Session.getValue("EntradaRecuentos__WCGridState"), "") == 0 )
      {
         AV28GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "EntradaRecuentos__WCGridState"), null, null);
      }
      else
      {
         AV28GridState.fromxml(AV26Session.getValue("EntradaRecuentos__WCGridState"), null, null);
      }
      AV18OrderedBy = AV28GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV19OrderedDsc = AV28GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV52GXV1 = 1 ;
      while ( AV52GXV1 <= AV28GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV29GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV28GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV52GXV1));
         if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV20FilterFullText = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV30TFPrdNum = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV31TFPrdNum_Sel = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV32TFPrdNom = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV33TFPrdNom_Sel = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECEXITEO") == 0 )
         {
            AV34TFRecExiTeo = CommonUtil.decimalVal( AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV35TFRecExiTeo_To = CommonUtil.decimalVal( AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV16Emprcod = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&RECFEC") == 0 )
         {
            AV17RecFec = localUtil.ctod( AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         AV52GXV1 = (int)(AV52GXV1+1) ;
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
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      A809RecExiTeo = DecimalUtil.ZERO ;
      A12285RecLot = "" ;
      AV45Entradarecuentos__wcds_1_filterfulltext = "" ;
      AV20FilterFullText = "" ;
      AV46Entradarecuentos__wcds_2_tfprdnum = "" ;
      AV30TFPrdNum = "" ;
      AV47Entradarecuentos__wcds_3_tfprdnum_sel = "" ;
      AV31TFPrdNum_Sel = "" ;
      AV48Entradarecuentos__wcds_4_tfprdnom = "" ;
      AV32TFPrdNom = "" ;
      AV49Entradarecuentos__wcds_5_tfprdnom_sel = "" ;
      AV33TFPrdNom_Sel = "" ;
      AV50Entradarecuentos__wcds_6_tfrecexiteo = DecimalUtil.ZERO ;
      AV34TFRecExiTeo = DecimalUtil.ZERO ;
      AV51Entradarecuentos__wcds_7_tfrecexiteo_to = DecimalUtil.ZERO ;
      AV35TFRecExiTeo_To = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV45Entradarecuentos__wcds_1_filterfulltext = "" ;
      lV46Entradarecuentos__wcds_2_tfprdnum = "" ;
      lV48Entradarecuentos__wcds_4_tfprdnom = "" ;
      A727PrdRec = "" ;
      AV16Emprcod = "" ;
      AV17RecFec = GXutil.nullDate() ;
      A396EmprCod = "" ;
      A810RecFec = GXutil.nullDate() ;
      P09LS2_A13416RecEstInv = new byte[1] ;
      P09LS2_A727PrdRec = new String[] {""} ;
      P09LS2_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09LS2_A396EmprCod = new String[] {""} ;
      P09LS2_A809RecExiTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LS2_A718PrdNom = new String[] {""} ;
      P09LS2_A719PrdNum = new String[] {""} ;
      P09LS2_A12285RecLot = new String[] {""} ;
      AV21RecExiRea = DecimalUtil.ZERO ;
      AV22Difer = DecimalUtil.ZERO ;
      AV25RecLot = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV15HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV26Session = httpContext.getWebSession();
      AV28GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV29GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.entradarecuentos__wcexportcsv__default(),
         new Object[] {
             new Object[] {
            P09LS2_A13416RecEstInv, P09LS2_A727PrdRec, P09LS2_A810RecFec, P09LS2_A396EmprCod, P09LS2_A809RecExiTeo, P09LS2_A718PrdNom, P09LS2_A719PrdNum, P09LS2_A12285RecLot
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A13416RecEstInv ;
   private short gxcookieaux ;
   private short AV18OrderedBy ;
   private short Gx_err ;
   private int AV13Random ;
   private int AV52GXV1 ;
   private java.math.BigDecimal A809RecExiTeo ;
   private java.math.BigDecimal AV50Entradarecuentos__wcds_6_tfrecexiteo ;
   private java.math.BigDecimal AV34TFRecExiTeo ;
   private java.math.BigDecimal AV51Entradarecuentos__wcds_7_tfrecexiteo_to ;
   private java.math.BigDecimal AV35TFRecExiTeo_To ;
   private java.math.BigDecimal AV21RecExiRea ;
   private java.math.BigDecimal AV22Difer ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String A12285RecLot ;
   private String AV46Entradarecuentos__wcds_2_tfprdnum ;
   private String AV30TFPrdNum ;
   private String AV47Entradarecuentos__wcds_3_tfprdnum_sel ;
   private String AV31TFPrdNum_Sel ;
   private String AV48Entradarecuentos__wcds_4_tfprdnom ;
   private String AV32TFPrdNom ;
   private String AV49Entradarecuentos__wcds_5_tfprdnom_sel ;
   private String AV33TFPrdNom_Sel ;
   private String scmdbuf ;
   private String lV46Entradarecuentos__wcds_2_tfprdnum ;
   private String lV48Entradarecuentos__wcds_4_tfprdnom ;
   private String A727PrdRec ;
   private String AV16Emprcod ;
   private String A396EmprCod ;
   private String AV25RecLot ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private java.util.Date AV17RecFec ;
   private java.util.Date A810RecFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV19OrderedDsc ;
   private String AV14TextFileLine ;
   private String AV11Filename ;
   private String AV45Entradarecuentos__wcds_1_filterfulltext ;
   private String AV20FilterFullText ;
   private String lV45Entradarecuentos__wcds_1_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV26Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private byte[] P09LS2_A13416RecEstInv ;
   private String[] P09LS2_A727PrdRec ;
   private java.util.Date[] P09LS2_A810RecFec ;
   private String[] P09LS2_A396EmprCod ;
   private java.math.BigDecimal[] P09LS2_A809RecExiTeo ;
   private String[] P09LS2_A718PrdNom ;
   private String[] P09LS2_A719PrdNum ;
   private String[] P09LS2_A12285RecLot ;
   private com.genexus.internet.HttpResponse AV15HttpResponse ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV28GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV29GridStateFilterValue ;
}

final  class entradarecuentos__wcexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09LS2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV45Entradarecuentos__wcds_1_filterfulltext ,
                                          String AV47Entradarecuentos__wcds_3_tfprdnum_sel ,
                                          String AV46Entradarecuentos__wcds_2_tfprdnum ,
                                          String AV49Entradarecuentos__wcds_5_tfprdnom_sel ,
                                          String AV48Entradarecuentos__wcds_4_tfprdnom ,
                                          java.math.BigDecimal AV50Entradarecuentos__wcds_6_tfrecexiteo ,
                                          java.math.BigDecimal AV51Entradarecuentos__wcds_7_tfrecexiteo_to ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A809RecExiTeo ,
                                          short AV18OrderedBy ,
                                          boolean AV19OrderedDsc ,
                                          String A727PrdRec ,
                                          byte A13416RecEstInv ,
                                          String AV16Emprcod ,
                                          java.util.Date AV17RecFec ,
                                          String A396EmprCod ,
                                          java.util.Date A810RecFec )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[11];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.RecEstInv, T2.PrdRec, T1.RecFec, T1.EmprCod, T1.RecExiTeo, T2.PrdNom, T1.PrdNum, T1.RecLot FROM (TXPRECUEN T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.RecFec = ?)");
      addWhere(sWhereString, "(T1.RecEstInv = 0)");
      if ( ! (GXutil.strcmp("", AV45Entradarecuentos__wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T2.PrdNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.RecExiTeo,'9999990.9999'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
         GXv_int4[3] = (byte)(1) ;
         GXv_int4[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV47Entradarecuentos__wcds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV46Entradarecuentos__wcds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV47Entradarecuentos__wcds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV49Entradarecuentos__wcds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV48Entradarecuentos__wcds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV49Entradarecuentos__wcds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV50Entradarecuentos__wcds_6_tfrecexiteo)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTeo >= ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV51Entradarecuentos__wcds_7_tfrecexiteo_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTeo <= ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV18OrderedBy == 1 ) && ! AV19OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNum" ;
      }
      else if ( ( AV18OrderedBy == 1 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNum DESC" ;
      }
      else if ( ( AV18OrderedBy == 2 ) && ! AV19OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.PrdNom" ;
      }
      else if ( ( AV18OrderedBy == 2 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.PrdNom DESC" ;
      }
      else if ( ( AV18OrderedBy == 3 ) && ! AV19OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecExiTeo" ;
      }
      else if ( ( AV18OrderedBy == 3 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecExiTeo DESC" ;
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
                  return conditional_P09LS2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , ((Boolean) dynConstraints[11]).booleanValue() , (String)dynConstraints[12] , ((Number) dynConstraints[13]).byteValue() , (String)dynConstraints[14] , (java.util.Date)dynConstraints[15] , (String)dynConstraints[16] , (java.util.Date)dynConstraints[17] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09LS2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((String[]) buf[7])[0] = rslt.getString(8, 26);
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
                  stmt.setString(sIdx, (String)parms[11], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[12]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[13], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[14], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[20], 4);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[21], 4);
               }
               return;
      }
   }

}

