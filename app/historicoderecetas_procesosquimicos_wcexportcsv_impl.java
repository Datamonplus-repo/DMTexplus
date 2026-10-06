package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class historicoderecetas_procesosquimicos_wcexportcsv_impl extends GXWebProcedure
{
   public historicoderecetas_procesosquimicos_wcexportcsv_impl( com.genexus.internet.HttpContext context )
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
      S191 ();
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
      S151 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'CLOSEDOCUMENT' */
      S181 ();
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
      AV11Filename = "./PrivateTempStorage/" + "HistoricodeRecetas_ProcesosQuimicos_WCExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("HistoricodeRecetas_ProcesosQuimicos_WCColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("HistoricodeRecetas_ProcesosQuimicos_WCColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+"#" : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Codigo Proceso", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion Proceso", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Tiempo", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV52Historicoderecetas_procesosquimicos_wcds_1_filterfulltext = AV36FilterFullText ;
      AV53Historicoderecetas_procesosquimicos_wcds_2_tfhrelinpro = AV40TFHreLinPro ;
      AV54Historicoderecetas_procesosquimicos_wcds_3_tfhrelinpro_to = AV41TFHreLinPro_To ;
      AV55Historicoderecetas_procesosquimicos_wcds_4_tfhreprocod = AV42TFHreProCod ;
      AV56Historicoderecetas_procesosquimicos_wcds_5_tfhreprocod_sel = AV43TFHreProCod_Sel ;
      AV57Historicoderecetas_procesosquimicos_wcds_6_tfhreprodsc = AV44TFHreProDsc ;
      AV58Historicoderecetas_procesosquimicos_wcds_7_tfhreprodsc_sel = AV45TFHreProDsc_Sel ;
      AV59Historicoderecetas_procesosquimicos_wcds_8_tfhreprotie = AV46TFHreProTie ;
      AV60Historicoderecetas_procesosquimicos_wcds_9_tfhreprotie_to = AV47TFHreProTie_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV52Historicoderecetas_procesosquimicos_wcds_1_filterfulltext ,
                                           Byte.valueOf(AV53Historicoderecetas_procesosquimicos_wcds_2_tfhrelinpro) ,
                                           Byte.valueOf(AV54Historicoderecetas_procesosquimicos_wcds_3_tfhrelinpro_to) ,
                                           AV56Historicoderecetas_procesosquimicos_wcds_5_tfhreprocod_sel ,
                                           AV55Historicoderecetas_procesosquimicos_wcds_4_tfhreprocod ,
                                           AV58Historicoderecetas_procesosquimicos_wcds_7_tfhreprodsc_sel ,
                                           AV57Historicoderecetas_procesosquimicos_wcds_6_tfhreprodsc ,
                                           Short.valueOf(AV59Historicoderecetas_procesosquimicos_wcds_8_tfhreprotie) ,
                                           Short.valueOf(AV60Historicoderecetas_procesosquimicos_wcds_9_tfhreprotie_to) ,
                                           Byte.valueOf(A4550HreLinPro) ,
                                           A4551HreProCod ,
                                           A4552HreProDsc ,
                                           Short.valueOf(A4553HreProTie) ,
                                           Short.valueOf(AV34OrderedBy) ,
                                           Boolean.valueOf(AV35OrderedDsc) ,
                                           AV28EmprCod ,
                                           Integer.valueOf(AV29HreBarCod) ,
                                           Byte.valueOf(AV30HreBarReo) ,
                                           AV31HreBarPar ,
                                           Byte.valueOf(AV32HreNumCie) ,
                                           Short.valueOf(AV33HreLinMaq) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A4492HreBarCod) ,
                                           Byte.valueOf(A4493HreBarReo) ,
                                           A4494HreBarPar ,
                                           Byte.valueOf(A4495HreNumCie) ,
                                           Short.valueOf(A4545HreLinMaq) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.SHORT
                                           }
      });
      lV52Historicoderecetas_procesosquimicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Historicoderecetas_procesosquimicos_wcds_1_filterfulltext), "%", "") ;
      lV52Historicoderecetas_procesosquimicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Historicoderecetas_procesosquimicos_wcds_1_filterfulltext), "%", "") ;
      lV52Historicoderecetas_procesosquimicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Historicoderecetas_procesosquimicos_wcds_1_filterfulltext), "%", "") ;
      lV52Historicoderecetas_procesosquimicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Historicoderecetas_procesosquimicos_wcds_1_filterfulltext), "%", "") ;
      lV55Historicoderecetas_procesosquimicos_wcds_4_tfhreprocod = GXutil.padr( GXutil.rtrim( AV55Historicoderecetas_procesosquimicos_wcds_4_tfhreprocod), 6, "%") ;
      lV57Historicoderecetas_procesosquimicos_wcds_6_tfhreprodsc = GXutil.padr( GXutil.rtrim( AV57Historicoderecetas_procesosquimicos_wcds_6_tfhreprodsc), 30, "%") ;
      /* Using cursor P09A22 */
      pr_default.execute(0, new Object[] {AV28EmprCod, Integer.valueOf(AV29HreBarCod), Byte.valueOf(AV30HreBarReo), AV31HreBarPar, Byte.valueOf(AV32HreNumCie), Short.valueOf(AV33HreLinMaq), lV52Historicoderecetas_procesosquimicos_wcds_1_filterfulltext, lV52Historicoderecetas_procesosquimicos_wcds_1_filterfulltext, lV52Historicoderecetas_procesosquimicos_wcds_1_filterfulltext, lV52Historicoderecetas_procesosquimicos_wcds_1_filterfulltext, Byte.valueOf(AV53Historicoderecetas_procesosquimicos_wcds_2_tfhrelinpro), Byte.valueOf(AV54Historicoderecetas_procesosquimicos_wcds_3_tfhrelinpro_to), lV55Historicoderecetas_procesosquimicos_wcds_4_tfhreprocod, AV56Historicoderecetas_procesosquimicos_wcds_5_tfhreprocod_sel, lV57Historicoderecetas_procesosquimicos_wcds_6_tfhreprodsc, AV58Historicoderecetas_procesosquimicos_wcds_7_tfhreprodsc_sel, Short.valueOf(AV59Historicoderecetas_procesosquimicos_wcds_8_tfhreprotie), Short.valueOf(AV60Historicoderecetas_procesosquimicos_wcds_9_tfhreprotie_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4545HreLinMaq = P09A22_A4545HreLinMaq[0] ;
         A4495HreNumCie = P09A22_A4495HreNumCie[0] ;
         A4494HreBarPar = P09A22_A4494HreBarPar[0] ;
         A4493HreBarReo = P09A22_A4493HreBarReo[0] ;
         A4492HreBarCod = P09A22_A4492HreBarCod[0] ;
         A396EmprCod = P09A22_A396EmprCod[0] ;
         A4553HreProTie = P09A22_A4553HreProTie[0] ;
         A4552HreProDsc = P09A22_A4552HreProDsc[0] ;
         A4551HreProCod = P09A22_A4551HreProCod[0] ;
         A4550HreLinPro = P09A22_A4550HreLinPro[0] ;
         AV14TextFileLine = "" ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S162 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A4550HreLinPro, 2, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A4551HreProCod, ";", ","), GXv_char3) ;
            historicoderecetas_procesosquimicos_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A4552HreProDsc, ";", ","), GXv_char3) ;
            historicoderecetas_procesosquimicos_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A4553HreProTie, 4, 0) ;
         }
         /* Execute user subroutine: 'AFTERWRITELINE' */
         S172 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         if ( GXutil.len( AV14TextFileLine) > 0 )
         {
            AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S181( )
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=HistoricodeRecetas_ProcesosQuimicos_WCExportCSV.csv");
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

   public void S141( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV15ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "HreLinPro", "", "#", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "HreProCod", "", "Codigo Proceso", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "HreProDsc", "", "Descripcion Proceso", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "HreProTie", "", "Tiempo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "HistoricodeRecetas_ProcesosQuimicos_WCColumnsSelector", GXv_char3) ;
      historicoderecetas_procesosquimicos_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
      AV20UserCustomValue = GXt_char2 ;
      if ( ! ( (GXutil.strcmp("", AV20UserCustomValue)==0) ) )
      {
         AV16ColumnsSelectorAux.fromxml(AV20UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector4[0] = AV16ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector5[0] = AV15ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, GXv_SdtWWPColumnsSelector5) ;
         AV16ColumnsSelectorAux = GXv_SdtWWPColumnsSelector4[0] ;
         AV15ColumnsSelector = GXv_SdtWWPColumnsSelector5[0] ;
      }
   }

   public void S191( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue("HistoricodeRecetas_ProcesosQuimicos_WCGridState"), "") == 0 )
      {
         AV38GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "HistoricodeRecetas_ProcesosQuimicos_WCGridState"), null, null);
      }
      else
      {
         AV38GridState.fromxml(AV19Session.getValue("HistoricodeRecetas_ProcesosQuimicos_WCGridState"), null, null);
      }
      AV34OrderedBy = AV38GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV35OrderedDsc = AV38GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV61GXV1 = 1 ;
      while ( AV61GXV1 <= AV38GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV39GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV38GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV61GXV1));
         if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV36FilterFullText = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRELINPRO") == 0 )
         {
            AV40TFHreLinPro = (byte)(GXutil.lval( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV41TFHreLinPro_To = (byte)(GXutil.lval( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPROCOD") == 0 )
         {
            AV42TFHreProCod = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPROCOD_SEL") == 0 )
         {
            AV43TFHreProCod_Sel = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRODSC") == 0 )
         {
            AV44TFHreProDsc = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRODSC_SEL") == 0 )
         {
            AV45TFHreProDsc_Sel = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPROTIE") == 0 )
         {
            AV46TFHreProTie = (short)(GXutil.lval( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV47TFHreProTie_To = (short)(GXutil.lval( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV28EmprCod = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HREBARCOD") == 0 )
         {
            AV29HreBarCod = (int)(GXutil.lval( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HREBARREO") == 0 )
         {
            AV30HreBarReo = (byte)(GXutil.lval( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HREBARPAR") == 0 )
         {
            AV31HreBarPar = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HRENUMCIE") == 0 )
         {
            AV32HreNumCie = (byte)(GXutil.lval( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HRELINMAQ") == 0 )
         {
            AV33HreLinMaq = (short)(GXutil.lval( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV61GXV1 = (int)(AV61GXV1+1) ;
      }
   }

   public void S162( )
   {
      /* 'BEFOREWRITELINE' Routine */
      returnInSub = false ;
   }

   public void S172( )
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
      AV19Session = httpContext.getWebSession();
      AV18ColumnsSelectorXML = "" ;
      AV15ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      A4551HreProCod = "" ;
      A4552HreProDsc = "" ;
      AV52Historicoderecetas_procesosquimicos_wcds_1_filterfulltext = "" ;
      AV36FilterFullText = "" ;
      AV55Historicoderecetas_procesosquimicos_wcds_4_tfhreprocod = "" ;
      AV42TFHreProCod = "" ;
      AV56Historicoderecetas_procesosquimicos_wcds_5_tfhreprocod_sel = "" ;
      AV43TFHreProCod_Sel = "" ;
      AV57Historicoderecetas_procesosquimicos_wcds_6_tfhreprodsc = "" ;
      AV44TFHreProDsc = "" ;
      AV58Historicoderecetas_procesosquimicos_wcds_7_tfhreprodsc_sel = "" ;
      AV45TFHreProDsc_Sel = "" ;
      scmdbuf = "" ;
      lV52Historicoderecetas_procesosquimicos_wcds_1_filterfulltext = "" ;
      lV55Historicoderecetas_procesosquimicos_wcds_4_tfhreprocod = "" ;
      lV57Historicoderecetas_procesosquimicos_wcds_6_tfhreprodsc = "" ;
      AV28EmprCod = "" ;
      AV31HreBarPar = "" ;
      A396EmprCod = "" ;
      A4494HreBarPar = "" ;
      P09A22_A4545HreLinMaq = new short[1] ;
      P09A22_A4495HreNumCie = new byte[1] ;
      P09A22_A4494HreBarPar = new String[] {""} ;
      P09A22_A4493HreBarReo = new byte[1] ;
      P09A22_A4492HreBarCod = new int[1] ;
      P09A22_A396EmprCod = new String[] {""} ;
      P09A22_A4553HreProTie = new short[1] ;
      P09A22_A4552HreProDsc = new String[] {""} ;
      P09A22_A4551HreProCod = new String[] {""} ;
      P09A22_A4550HreLinPro = new byte[1] ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector5 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV38GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV39GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.historicoderecetas_procesosquimicos_wcexportcsv__default(),
         new Object[] {
             new Object[] {
            P09A22_A4545HreLinMaq, P09A22_A4495HreNumCie, P09A22_A4494HreBarPar, P09A22_A4493HreBarReo, P09A22_A4492HreBarCod, P09A22_A396EmprCod, P09A22_A4553HreProTie, P09A22_A4552HreProDsc, P09A22_A4551HreProCod, P09A22_A4550HreLinPro
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A4550HreLinPro ;
   private byte AV53Historicoderecetas_procesosquimicos_wcds_2_tfhrelinpro ;
   private byte AV40TFHreLinPro ;
   private byte AV54Historicoderecetas_procesosquimicos_wcds_3_tfhrelinpro_to ;
   private byte AV41TFHreLinPro_To ;
   private byte AV30HreBarReo ;
   private byte AV32HreNumCie ;
   private byte A4493HreBarReo ;
   private byte A4495HreNumCie ;
   private short gxcookieaux ;
   private short A4553HreProTie ;
   private short AV59Historicoderecetas_procesosquimicos_wcds_8_tfhreprotie ;
   private short AV46TFHreProTie ;
   private short AV60Historicoderecetas_procesosquimicos_wcds_9_tfhreprotie_to ;
   private short AV47TFHreProTie_To ;
   private short AV34OrderedBy ;
   private short AV33HreLinMaq ;
   private short A4545HreLinMaq ;
   private short Gx_err ;
   private int AV13Random ;
   private int AV29HreBarCod ;
   private int A4492HreBarCod ;
   private int AV61GXV1 ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A4551HreProCod ;
   private String A4552HreProDsc ;
   private String AV55Historicoderecetas_procesosquimicos_wcds_4_tfhreprocod ;
   private String AV42TFHreProCod ;
   private String AV56Historicoderecetas_procesosquimicos_wcds_5_tfhreprocod_sel ;
   private String AV43TFHreProCod_Sel ;
   private String AV57Historicoderecetas_procesosquimicos_wcds_6_tfhreprodsc ;
   private String AV44TFHreProDsc ;
   private String AV58Historicoderecetas_procesosquimicos_wcds_7_tfhreprodsc_sel ;
   private String AV45TFHreProDsc_Sel ;
   private String scmdbuf ;
   private String lV55Historicoderecetas_procesosquimicos_wcds_4_tfhreprocod ;
   private String lV57Historicoderecetas_procesosquimicos_wcds_6_tfhreprodsc ;
   private String AV28EmprCod ;
   private String AV31HreBarPar ;
   private String A396EmprCod ;
   private String A4494HreBarPar ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV35OrderedDsc ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV52Historicoderecetas_procesosquimicos_wcds_1_filterfulltext ;
   private String AV36FilterFullText ;
   private String lV52Historicoderecetas_procesosquimicos_wcds_1_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private short[] P09A22_A4545HreLinMaq ;
   private byte[] P09A22_A4495HreNumCie ;
   private String[] P09A22_A4494HreBarPar ;
   private byte[] P09A22_A4493HreBarReo ;
   private int[] P09A22_A4492HreBarCod ;
   private String[] P09A22_A396EmprCod ;
   private short[] P09A22_A4553HreProTie ;
   private String[] P09A22_A4552HreProDsc ;
   private String[] P09A22_A4551HreProCod ;
   private byte[] P09A22_A4550HreLinPro ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV38GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV39GridStateFilterValue ;
}

final  class historicoderecetas_procesosquimicos_wcexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09A22( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV52Historicoderecetas_procesosquimicos_wcds_1_filterfulltext ,
                                          byte AV53Historicoderecetas_procesosquimicos_wcds_2_tfhrelinpro ,
                                          byte AV54Historicoderecetas_procesosquimicos_wcds_3_tfhrelinpro_to ,
                                          String AV56Historicoderecetas_procesosquimicos_wcds_5_tfhreprocod_sel ,
                                          String AV55Historicoderecetas_procesosquimicos_wcds_4_tfhreprocod ,
                                          String AV58Historicoderecetas_procesosquimicos_wcds_7_tfhreprodsc_sel ,
                                          String AV57Historicoderecetas_procesosquimicos_wcds_6_tfhreprodsc ,
                                          short AV59Historicoderecetas_procesosquimicos_wcds_8_tfhreprotie ,
                                          short AV60Historicoderecetas_procesosquimicos_wcds_9_tfhreprotie_to ,
                                          byte A4550HreLinPro ,
                                          String A4551HreProCod ,
                                          String A4552HreProDsc ,
                                          short A4553HreProTie ,
                                          short AV34OrderedBy ,
                                          boolean AV35OrderedDsc ,
                                          String AV28EmprCod ,
                                          int AV29HreBarCod ,
                                          byte AV30HreBarReo ,
                                          String AV31HreBarPar ,
                                          byte AV32HreNumCie ,
                                          short AV33HreLinMaq ,
                                          String A396EmprCod ,
                                          int A4492HreBarCod ,
                                          byte A4493HreBarReo ,
                                          String A4494HreBarPar ,
                                          byte A4495HreNumCie ,
                                          short A4545HreLinMaq )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[18];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT HreLinMaq, HreNumCie, HreBarPar, HreBarReo, HreBarCod, EmprCod, HreProTie, HreProDsc, HreProCod, HreLinPro FROM TXPHISREC" ;
      addWhere(sWhereString, "(EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ? and HreLinMaq = ?)");
      if ( ! (GXutil.strcmp("", AV52Historicoderecetas_procesosquimicos_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(HreLinPro,'90'), 2) like '%' || ?) or ( UPPER(HreProCod) like '%' || UPPER(?)) or ( UPPER(HreProDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(HreProTie,'9990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
         GXv_int6[7] = (byte)(1) ;
         GXv_int6[8] = (byte)(1) ;
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (0==AV53Historicoderecetas_procesosquimicos_wcds_2_tfhrelinpro) )
      {
         addWhere(sWhereString, "(HreLinPro >= ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (0==AV54Historicoderecetas_procesosquimicos_wcds_3_tfhrelinpro_to) )
      {
         addWhere(sWhereString, "(HreLinPro <= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV56Historicoderecetas_procesosquimicos_wcds_5_tfhreprocod_sel)==0) && ( ! (GXutil.strcmp("", AV55Historicoderecetas_procesosquimicos_wcds_4_tfhreprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Historicoderecetas_procesosquimicos_wcds_5_tfhreprocod_sel)==0) )
      {
         addWhere(sWhereString, "(HreProCod = ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV58Historicoderecetas_procesosquimicos_wcds_7_tfhreprodsc_sel)==0) && ( ! (GXutil.strcmp("", AV57Historicoderecetas_procesosquimicos_wcds_6_tfhreprodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreProDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Historicoderecetas_procesosquimicos_wcds_7_tfhreprodsc_sel)==0) )
      {
         addWhere(sWhereString, "(HreProDsc = ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (0==AV59Historicoderecetas_procesosquimicos_wcds_8_tfhreprotie) )
      {
         addWhere(sWhereString, "(HreProTie >= ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (0==AV60Historicoderecetas_procesosquimicos_wcds_9_tfhreprotie_to) )
      {
         addWhere(sWhereString, "(HreProTie <= ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV34OrderedBy == 1 ) && ! AV35OrderedDsc )
      {
         scmdbuf += " ORDER BY HreLinPro" ;
      }
      else if ( ( AV34OrderedBy == 1 ) && ( AV35OrderedDsc ) )
      {
         scmdbuf += " ORDER BY HreLinPro DESC" ;
      }
      else if ( ( AV34OrderedBy == 2 ) && ! AV35OrderedDsc )
      {
         scmdbuf += " ORDER BY HreProCod" ;
      }
      else if ( ( AV34OrderedBy == 2 ) && ( AV35OrderedDsc ) )
      {
         scmdbuf += " ORDER BY HreProCod DESC" ;
      }
      else if ( ( AV34OrderedBy == 3 ) && ! AV35OrderedDsc )
      {
         scmdbuf += " ORDER BY HreProDsc" ;
      }
      else if ( ( AV34OrderedBy == 3 ) && ( AV35OrderedDsc ) )
      {
         scmdbuf += " ORDER BY HreProDsc DESC" ;
      }
      else if ( ( AV34OrderedBy == 4 ) && ! AV35OrderedDsc )
      {
         scmdbuf += " ORDER BY HreProTie" ;
      }
      else if ( ( AV34OrderedBy == 4 ) && ( AV35OrderedDsc ) )
      {
         scmdbuf += " ORDER BY HreProTie DESC" ;
      }
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
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
                  return conditional_P09A22(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).byteValue() , ((Number) dynConstraints[2]).byteValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , ((Number) dynConstraints[9]).byteValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).shortValue() , ((Boolean) dynConstraints[14]).booleanValue() , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).byteValue() , (String)dynConstraints[18] , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).byteValue() , (String)dynConstraints[24] , ((Number) dynConstraints[25]).byteValue() , ((Number) dynConstraints[26]).shortValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09A22", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((String[]) buf[8])[0] = rslt.getString(9, 6);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
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
                  stmt.setString(sIdx, (String)parms[18], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[19]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[20]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[22]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[23]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[24], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[25], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[28]).byteValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[29]).byteValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 6);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[34]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[35]).shortValue());
               }
               return;
      }
   }

}

