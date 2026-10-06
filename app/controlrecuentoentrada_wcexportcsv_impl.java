package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class controlrecuentoentrada_wcexportcsv_impl extends GXWebProcedure
{
   public controlrecuentoentrada_wcexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "ControlRecuentoEntrada_WCExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      AV14TextFileLine += httpContext.getMessage( "Teorica", "") ;
      AV14TextFileLine += ";" ;
      AV14TextFileLine += httpContext.getMessage( "Real", "") ;
      AV14TextFileLine += ";" ;
      AV14TextFileLine += httpContext.getMessage( "Dif", "") ;
      AV14TextFileLine += ";" ;
      AV14TextFileLine += httpContext.getMessage( "Lote", "") ;
      AV14TextFileLine += ";" ;
      AV14TextFileLine += httpContext.getMessage( "R?", "") ;
      AV10TextFile.writeLine(AV14TextFileLine);
   }

   public void S141( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV78Controlrecuentoentrada_wcds_1_filterfulltext = AV30FilterFullText ;
      AV79Controlrecuentoentrada_wcds_2_tfprdnum = AV36TFPrdNum ;
      AV80Controlrecuentoentrada_wcds_3_tfprdnum_sel = AV37TFPrdNum_Sel ;
      AV81Controlrecuentoentrada_wcds_4_tfprdnom = AV38TFPrdNom ;
      AV82Controlrecuentoentrada_wcds_5_tfprdnom_sel = AV39TFPrdNom_Sel ;
      AV83Controlrecuentoentrada_wcds_6_tfrecexiteo = AV42TFRecExiTeo ;
      AV84Controlrecuentoentrada_wcds_7_tfrecexiteo_to = AV43TFRecExiTeo_To ;
      AV85Controlrecuentoentrada_wcds_8_tfprdrec = AV71TFPrdRec ;
      AV86Controlrecuentoentrada_wcds_9_tfprdrec_sel = AV72TFPrdRec_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV78Controlrecuentoentrada_wcds_1_filterfulltext ,
                                           AV80Controlrecuentoentrada_wcds_3_tfprdnum_sel ,
                                           AV79Controlrecuentoentrada_wcds_2_tfprdnum ,
                                           AV82Controlrecuentoentrada_wcds_5_tfprdnom_sel ,
                                           AV81Controlrecuentoentrada_wcds_4_tfprdnom ,
                                           AV83Controlrecuentoentrada_wcds_6_tfrecexiteo ,
                                           AV84Controlrecuentoentrada_wcds_7_tfrecexiteo_to ,
                                           AV86Controlrecuentoentrada_wcds_9_tfprdrec_sel ,
                                           AV85Controlrecuentoentrada_wcds_8_tfprdrec ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A809RecExiTeo ,
                                           A727PrdRec ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV78Controlrecuentoentrada_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV78Controlrecuentoentrada_wcds_1_filterfulltext), "%", "") ;
      lV78Controlrecuentoentrada_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV78Controlrecuentoentrada_wcds_1_filterfulltext), "%", "") ;
      lV78Controlrecuentoentrada_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV78Controlrecuentoentrada_wcds_1_filterfulltext), "%", "") ;
      lV78Controlrecuentoentrada_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV78Controlrecuentoentrada_wcds_1_filterfulltext), "%", "") ;
      lV79Controlrecuentoentrada_wcds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV79Controlrecuentoentrada_wcds_2_tfprdnum), 6, "%") ;
      lV81Controlrecuentoentrada_wcds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV81Controlrecuentoentrada_wcds_4_tfprdnom), 26, "%") ;
      lV85Controlrecuentoentrada_wcds_8_tfprdrec = GXutil.padr( GXutil.rtrim( AV85Controlrecuentoentrada_wcds_8_tfprdrec), 1, "%") ;
      /* Using cursor P09MU2 */
      pr_default.execute(0, new Object[] {lV78Controlrecuentoentrada_wcds_1_filterfulltext, lV78Controlrecuentoentrada_wcds_1_filterfulltext, lV78Controlrecuentoentrada_wcds_1_filterfulltext, lV78Controlrecuentoentrada_wcds_1_filterfulltext, lV79Controlrecuentoentrada_wcds_2_tfprdnum, AV80Controlrecuentoentrada_wcds_3_tfprdnum_sel, lV81Controlrecuentoentrada_wcds_4_tfprdnom, AV82Controlrecuentoentrada_wcds_5_tfprdnom_sel, AV83Controlrecuentoentrada_wcds_6_tfrecexiteo, AV84Controlrecuentoentrada_wcds_7_tfrecexiteo_to, lV85Controlrecuentoentrada_wcds_8_tfprdrec, AV86Controlrecuentoentrada_wcds_9_tfprdrec_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P09MU2_A396EmprCod[0] ;
         A727PrdRec = P09MU2_A727PrdRec[0] ;
         A809RecExiTeo = P09MU2_A809RecExiTeo[0] ;
         A718PrdNom = P09MU2_A718PrdNom[0] ;
         A719PrdNum = P09MU2_A719PrdNum[0] ;
         A807RecExiRea = P09MU2_A807RecExiRea[0] ;
         A11624RecMemCant = P09MU2_A11624RecMemCant[0] ;
         A12285RecLot = P09MU2_A12285RecLot[0] ;
         A810RecFec = P09MU2_A810RecFec[0] ;
         A727PrdRec = P09MU2_A727PrdRec[0] ;
         A718PrdNom = P09MU2_A718PrdNom[0] ;
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
         controlrecuentoentrada_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
         AV14TextFileLine += GXt_char2 ;
         AV14TextFileLine += ";" ;
         GXt_char2 = AV14TextFileLine ;
         GXv_char3[0] = GXt_char2 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A718PrdNom, ";", ","), GXv_char3) ;
         controlrecuentoentrada_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
         AV14TextFileLine += GXt_char2 ;
         AV14TextFileLine += ";" ;
         AV14TextFileLine += GXutil.str( A809RecExiTeo, 12, 4) ;
         AV66RecExiRea = ((A11624RecMemCant==1) ? A807RecExiRea : ((DecimalUtil.compareTo(DecimalUtil.ZERO, A807RecExiRea)==0) ? A809RecExiTeo : A807RecExiRea)) ;
         /* * Property Backcolor not supported in */
         /* * Property Backcolor not supported in */
         /* * Property Backcolor not supported in */
         /* * Property Backcolor not supported in */
         /*
            Assignment error:
            ================
            Expression: [ t('rgb(',1),t('0',3),t(',',7),t('255',3),t(',',7),t('0',3),t(')',4) ]
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
         AV14TextFileLine += GXutil.str( AV66RecExiRea, 12, 4) ;
         AV67Difer = A809RecExiTeo.subtract(AV66RecExiRea) ;
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
         AV14TextFileLine += GXutil.str( AV67Difer, 12, 4) ;
         AV70RecLot = A12285RecLot ;
         /* * Property Backcolor not supported in */
         /* * Property Backcolor not supported in */
         /* * Property Backcolor not supported in */
         /* * Property Backcolor not supported in */
         /*
            Assignment error:
            ================
            Expression: [ t('rgb(',1),t('0',3),t(',',7),t('255',3),t(',',7),t('0',3),t(')',4) ]
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
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV70RecLot, ";", ","), GXv_char3) ;
         controlrecuentoentrada_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
         AV14TextFileLine += GXt_char2 ;
         AV14TextFileLine += ";" ;
         GXt_char2 = AV14TextFileLine ;
         GXv_char3[0] = GXt_char2 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A727PrdRec, ";", ","), GXv_char3) ;
         controlrecuentoentrada_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=ControlRecuentoEntrada_WCExportCSV.csv");
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
      if ( GXutil.strcmp(AV19Session.getValue("ControlRecuentoEntrada_WCGridState"), "") == 0 )
      {
         AV32GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "ControlRecuentoEntrada_WCGridState"), null, null);
      }
      else
      {
         AV32GridState.fromxml(AV19Session.getValue("ControlRecuentoEntrada_WCGridState"), null, null);
      }
      AV28OrderedBy = AV32GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV32GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV87GXV1 = 1 ;
      while ( AV87GXV1 <= AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV87GXV1));
         if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV30FilterFullText = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV36TFPrdNum = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV37TFPrdNum_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV38TFPrdNom = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV39TFPrdNom_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECEXITEO") == 0 )
         {
            AV42TFRecExiTeo = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV43TFRecExiTeo_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDREC") == 0 )
         {
            AV71TFPrdRec = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDREC_SEL") == 0 )
         {
            AV72TFPrdRec_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV73Emprcod = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&RECFEC") == 0 )
         {
            AV74RecFec = localUtil.ctod( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         AV87GXV1 = (int)(AV87GXV1+1) ;
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
      A807RecExiRea = DecimalUtil.ZERO ;
      A12285RecLot = "" ;
      A727PrdRec = "" ;
      AV78Controlrecuentoentrada_wcds_1_filterfulltext = "" ;
      AV30FilterFullText = "" ;
      AV79Controlrecuentoentrada_wcds_2_tfprdnum = "" ;
      AV36TFPrdNum = "" ;
      AV80Controlrecuentoentrada_wcds_3_tfprdnum_sel = "" ;
      AV37TFPrdNum_Sel = "" ;
      AV81Controlrecuentoentrada_wcds_4_tfprdnom = "" ;
      AV38TFPrdNom = "" ;
      AV82Controlrecuentoentrada_wcds_5_tfprdnom_sel = "" ;
      AV39TFPrdNom_Sel = "" ;
      AV83Controlrecuentoentrada_wcds_6_tfrecexiteo = DecimalUtil.ZERO ;
      AV42TFRecExiTeo = DecimalUtil.ZERO ;
      AV84Controlrecuentoentrada_wcds_7_tfrecexiteo_to = DecimalUtil.ZERO ;
      AV43TFRecExiTeo_To = DecimalUtil.ZERO ;
      AV85Controlrecuentoentrada_wcds_8_tfprdrec = "" ;
      AV71TFPrdRec = "" ;
      AV86Controlrecuentoentrada_wcds_9_tfprdrec_sel = "" ;
      AV72TFPrdRec_Sel = "" ;
      scmdbuf = "" ;
      lV78Controlrecuentoentrada_wcds_1_filterfulltext = "" ;
      lV79Controlrecuentoentrada_wcds_2_tfprdnum = "" ;
      lV81Controlrecuentoentrada_wcds_4_tfprdnom = "" ;
      lV85Controlrecuentoentrada_wcds_8_tfprdrec = "" ;
      P09MU2_A396EmprCod = new String[] {""} ;
      P09MU2_A727PrdRec = new String[] {""} ;
      P09MU2_A809RecExiTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09MU2_A718PrdNom = new String[] {""} ;
      P09MU2_A719PrdNum = new String[] {""} ;
      P09MU2_A807RecExiRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09MU2_A11624RecMemCant = new byte[1] ;
      P09MU2_A12285RecLot = new String[] {""} ;
      P09MU2_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      A396EmprCod = "" ;
      A810RecFec = GXutil.nullDate() ;
      AV66RecExiRea = DecimalUtil.ZERO ;
      AV67Difer = DecimalUtil.ZERO ;
      AV70RecLot = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV19Session = httpContext.getWebSession();
      AV32GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV33GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV73Emprcod = "" ;
      AV74RecFec = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlrecuentoentrada_wcexportcsv__default(),
         new Object[] {
             new Object[] {
            P09MU2_A396EmprCod, P09MU2_A727PrdRec, P09MU2_A809RecExiTeo, P09MU2_A718PrdNom, P09MU2_A719PrdNum, P09MU2_A807RecExiRea, P09MU2_A11624RecMemCant, P09MU2_A12285RecLot, P09MU2_A810RecFec
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A11624RecMemCant ;
   private short gxcookieaux ;
   private short AV28OrderedBy ;
   private short Gx_err ;
   private int AV13Random ;
   private int AV87GXV1 ;
   private java.math.BigDecimal A809RecExiTeo ;
   private java.math.BigDecimal A807RecExiRea ;
   private java.math.BigDecimal AV83Controlrecuentoentrada_wcds_6_tfrecexiteo ;
   private java.math.BigDecimal AV42TFRecExiTeo ;
   private java.math.BigDecimal AV84Controlrecuentoentrada_wcds_7_tfrecexiteo_to ;
   private java.math.BigDecimal AV43TFRecExiTeo_To ;
   private java.math.BigDecimal AV66RecExiRea ;
   private java.math.BigDecimal AV67Difer ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String A12285RecLot ;
   private String A727PrdRec ;
   private String AV79Controlrecuentoentrada_wcds_2_tfprdnum ;
   private String AV36TFPrdNum ;
   private String AV80Controlrecuentoentrada_wcds_3_tfprdnum_sel ;
   private String AV37TFPrdNum_Sel ;
   private String AV81Controlrecuentoentrada_wcds_4_tfprdnom ;
   private String AV38TFPrdNom ;
   private String AV82Controlrecuentoentrada_wcds_5_tfprdnom_sel ;
   private String AV39TFPrdNom_Sel ;
   private String AV85Controlrecuentoentrada_wcds_8_tfprdrec ;
   private String AV71TFPrdRec ;
   private String AV86Controlrecuentoentrada_wcds_9_tfprdrec_sel ;
   private String AV72TFPrdRec_Sel ;
   private String scmdbuf ;
   private String lV79Controlrecuentoentrada_wcds_2_tfprdnum ;
   private String lV81Controlrecuentoentrada_wcds_4_tfprdnom ;
   private String lV85Controlrecuentoentrada_wcds_8_tfprdrec ;
   private String A396EmprCod ;
   private String AV70RecLot ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private String AV73Emprcod ;
   private java.util.Date A810RecFec ;
   private java.util.Date AV74RecFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private String AV14TextFileLine ;
   private String AV11Filename ;
   private String AV78Controlrecuentoentrada_wcds_1_filterfulltext ;
   private String AV30FilterFullText ;
   private String lV78Controlrecuentoentrada_wcds_1_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private String[] P09MU2_A396EmprCod ;
   private String[] P09MU2_A727PrdRec ;
   private java.math.BigDecimal[] P09MU2_A809RecExiTeo ;
   private String[] P09MU2_A718PrdNom ;
   private String[] P09MU2_A719PrdNum ;
   private java.math.BigDecimal[] P09MU2_A807RecExiRea ;
   private byte[] P09MU2_A11624RecMemCant ;
   private String[] P09MU2_A12285RecLot ;
   private java.util.Date[] P09MU2_A810RecFec ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV32GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV33GridStateFilterValue ;
}

final  class controlrecuentoentrada_wcexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09MU2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV78Controlrecuentoentrada_wcds_1_filterfulltext ,
                                          String AV80Controlrecuentoentrada_wcds_3_tfprdnum_sel ,
                                          String AV79Controlrecuentoentrada_wcds_2_tfprdnum ,
                                          String AV82Controlrecuentoentrada_wcds_5_tfprdnom_sel ,
                                          String AV81Controlrecuentoentrada_wcds_4_tfprdnom ,
                                          java.math.BigDecimal AV83Controlrecuentoentrada_wcds_6_tfrecexiteo ,
                                          java.math.BigDecimal AV84Controlrecuentoentrada_wcds_7_tfrecexiteo_to ,
                                          String AV86Controlrecuentoentrada_wcds_9_tfprdrec_sel ,
                                          String AV85Controlrecuentoentrada_wcds_8_tfprdrec ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A809RecExiTeo ,
                                          String A727PrdRec ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[12];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T2.PrdRec, T1.RecExiTeo, T2.PrdNom, T1.PrdNum, T1.RecExiRea, T1.RecMemCant, T1.RecLot, T1.RecFec FROM (TXPRECUEN T1 INNER JOIN TXPPRODUC T2 ON" ;
      scmdbuf += " T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum)" ;
      if ( ! (GXutil.strcmp("", AV78Controlrecuentoentrada_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T2.PrdNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.RecExiTeo,'9999990.9999'), 2) like '%' || ?) or ( UPPER(T2.PrdRec) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int4[0] = (byte)(1) ;
         GXv_int4[1] = (byte)(1) ;
         GXv_int4[2] = (byte)(1) ;
         GXv_int4[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Controlrecuentoentrada_wcds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV79Controlrecuentoentrada_wcds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Controlrecuentoentrada_wcds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Controlrecuentoentrada_wcds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV81Controlrecuentoentrada_wcds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Controlrecuentoentrada_wcds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Controlrecuentoentrada_wcds_6_tfrecexiteo)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTeo >= ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Controlrecuentoentrada_wcds_7_tfrecexiteo_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTeo <= ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Controlrecuentoentrada_wcds_9_tfprdrec_sel)==0) && ( ! (GXutil.strcmp("", AV85Controlrecuentoentrada_wcds_8_tfprdrec)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdRec) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Controlrecuentoentrada_wcds_9_tfprdrec_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdRec = ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNum" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNum DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.PrdNom" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.PrdNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecExiTeo" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecExiTeo DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.PrdRec" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.PrdRec DESC" ;
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
                  return conditional_P09MU2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).shortValue() , ((Boolean) dynConstraints[14]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09MU2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 26);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9);
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
                  stmt.setVarchar(sIdx, (String)parms[12], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[13], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[14], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[20], 4);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[21], 4);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 1);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 1);
               }
               return;
      }
   }

}

