package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wcdetallepiezasexportcsv_impl extends GXWebProcedure
{
   public wcdetallepiezasexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "WCDetallePiezasExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("WCDetallePiezasColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("WCDetallePiezasColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "AlbRecPie", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Kgs Ent", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Kgs Uti", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Mts Ent", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Mts Uti", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Observaciones", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV53Wcdetallepiezasds_1_emprcod = AV28Emprcod ;
      AV54Wcdetallepiezasds_2_albreccod = AV29AlbRecCod ;
      AV55Wcdetallepiezasds_3_filterfulltext = AV49FilterFullText ;
      AV56Wcdetallepiezasds_4_albrecpie = AV32AlbRecPie ;
      AV57Wcdetallepiezasds_5_tfalbrecpie = AV36TFAlbRecPie ;
      AV58Wcdetallepiezasds_6_tfalbrecpie_sel = AV37TFAlbRecPie_Sel ;
      AV59Wcdetallepiezasds_7_tfalbreckgm = AV38TFAlbRecKgm ;
      AV60Wcdetallepiezasds_8_tfalbreckgm_to = AV39TFAlbRecKgm_To ;
      AV61Wcdetallepiezasds_9_tfalbreckgmu = AV40TFAlbRecKgmU ;
      AV62Wcdetallepiezasds_10_tfalbreckgmu_to = AV41TFAlbRecKgmU_To ;
      AV63Wcdetallepiezasds_11_tfalbrecmtr = AV42TFAlbRecMtr ;
      AV64Wcdetallepiezasds_12_tfalbrecmtr_to = AV43TFAlbRecMtr_To ;
      AV65Wcdetallepiezasds_13_tfalbrecmtru = AV44TFAlbRecMtrU ;
      AV66Wcdetallepiezasds_14_tfalbrecmtru_to = AV45TFAlbRecMtrU_To ;
      AV67Wcdetallepiezasds_15_tfalbrecobs = AV46TFAlbRecObs ;
      AV68Wcdetallepiezasds_16_tfalbrecobs_sel = AV47TFAlbRecObs_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Short.valueOf(AV48AlbRecPieOperator) ,
                                           AV56Wcdetallepiezasds_4_albrecpie ,
                                           AV58Wcdetallepiezasds_6_tfalbrecpie_sel ,
                                           AV57Wcdetallepiezasds_5_tfalbrecpie ,
                                           AV59Wcdetallepiezasds_7_tfalbreckgm ,
                                           AV60Wcdetallepiezasds_8_tfalbreckgm_to ,
                                           AV61Wcdetallepiezasds_9_tfalbreckgmu ,
                                           AV62Wcdetallepiezasds_10_tfalbreckgmu_to ,
                                           AV63Wcdetallepiezasds_11_tfalbrecmtr ,
                                           AV64Wcdetallepiezasds_12_tfalbrecmtr_to ,
                                           AV65Wcdetallepiezasds_13_tfalbrecmtru ,
                                           AV66Wcdetallepiezasds_14_tfalbrecmtru_to ,
                                           A2159AlbRecPie ,
                                           A2155AlbRecKgm ,
                                           A2156AlbRecKgmU ,
                                           A2157AlbRecMtr ,
                                           A2158AlbRecMtrU ,
                                           Short.valueOf(AV30OrderedBy) ,
                                           Boolean.valueOf(AV31OrderedDsc) ,
                                           AV55Wcdetallepiezasds_3_filterfulltext ,
                                           A13693AlbRecObs ,
                                           AV68Wcdetallepiezasds_16_tfalbrecobs_sel ,
                                           AV67Wcdetallepiezasds_15_tfalbrecobs ,
                                           AV53Wcdetallepiezasds_1_emprcod ,
                                           Integer.valueOf(AV54Wcdetallepiezasds_2_albreccod) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A44AlbRecCod) } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV55Wcdetallepiezasds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Wcdetallepiezasds_3_filterfulltext), "%", "") ;
      lV55Wcdetallepiezasds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Wcdetallepiezasds_3_filterfulltext), "%", "") ;
      lV55Wcdetallepiezasds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Wcdetallepiezasds_3_filterfulltext), "%", "") ;
      lV55Wcdetallepiezasds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Wcdetallepiezasds_3_filterfulltext), "%", "") ;
      lV55Wcdetallepiezasds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Wcdetallepiezasds_3_filterfulltext), "%", "") ;
      lV55Wcdetallepiezasds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Wcdetallepiezasds_3_filterfulltext), "%", "") ;
      lV67Wcdetallepiezasds_15_tfalbrecobs = GXutil.padr( GXutil.rtrim( AV67Wcdetallepiezasds_15_tfalbrecobs), 80, "%") ;
      /* Using cursor P08C32 */
      pr_default.execute(0, new Object[] {AV53Wcdetallepiezasds_1_emprcod, Integer.valueOf(AV54Wcdetallepiezasds_2_albreccod), AV55Wcdetallepiezasds_3_filterfulltext, A2159AlbRecPie, lV55Wcdetallepiezasds_3_filterfulltext, A2155AlbRecKgm, lV55Wcdetallepiezasds_3_filterfulltext, A2156AlbRecKgmU, lV55Wcdetallepiezasds_3_filterfulltext, A2157AlbRecMtr, lV55Wcdetallepiezasds_3_filterfulltext, A2158AlbRecMtrU, lV55Wcdetallepiezasds_3_filterfulltext, A13693AlbRecObs, lV55Wcdetallepiezasds_3_filterfulltext, AV68Wcdetallepiezasds_16_tfalbrecobs_sel, AV67Wcdetallepiezasds_15_tfalbrecobs, A13693AlbRecObs, lV67Wcdetallepiezasds_15_tfalbrecobs, AV68Wcdetallepiezasds_16_tfalbrecobs_sel, A13693AlbRecObs, AV68Wcdetallepiezasds_16_tfalbrecobs_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A44AlbRecCod = P08C32_A44AlbRecCod[0] ;
         A396EmprCod = P08C32_A396EmprCod[0] ;
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
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A2159AlbRecPie, ";", ","), GXv_char3) ;
            wcdetallepiezasexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A2155AlbRecKgm, 9, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A2156AlbRecKgmU, 9, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A2157AlbRecMtr, 9, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A2158AlbRecMtrU, 9, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13693AlbRecObs, ";", ","), GXv_char3) ;
            wcdetallepiezasexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
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
         /* Exiting from a For First loop. */
         if (true) break;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=WCDetallePiezasExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbRecPie", "", "AlbRecPie", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbRecKgm", "", "Kgs Ent", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbRecKgmU", "", "Kgs Uti", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbRecMtr", "", "Mts Ent", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbRecMtrU", "", "Mts Uti", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbRecObs", "", "Observaciones", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WCDetallePiezasColumnsSelector", GXv_char3) ;
      wcdetallepiezasexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("WCDetallePiezasGridState"), "") == 0 )
      {
         AV34GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCDetallePiezasGridState"), null, null);
      }
      else
      {
         AV34GridState.fromxml(AV19Session.getValue("WCDetallePiezasGridState"), null, null);
      }
      AV30OrderedBy = AV34GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV31OrderedDsc = AV34GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV69GXV1 = 1 ;
      while ( AV69GXV1 <= AV34GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV35GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV34GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV69GXV1));
         if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV49FilterFullText = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "ALBRECPIE") == 0 )
         {
            AV32AlbRecPie = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV48AlbRecPieOperator = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Operator() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRECPIE") == 0 )
         {
            AV36TFAlbRecPie = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRECPIE_SEL") == 0 )
         {
            AV37TFAlbRecPie_Sel = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRECKGM") == 0 )
         {
            AV38TFAlbRecKgm = CommonUtil.decimalVal( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV39TFAlbRecKgm_To = CommonUtil.decimalVal( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRECKGMU") == 0 )
         {
            AV40TFAlbRecKgmU = CommonUtil.decimalVal( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV41TFAlbRecKgmU_To = CommonUtil.decimalVal( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRECMTR") == 0 )
         {
            AV42TFAlbRecMtr = CommonUtil.decimalVal( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV43TFAlbRecMtr_To = CommonUtil.decimalVal( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRECMTRU") == 0 )
         {
            AV44TFAlbRecMtrU = CommonUtil.decimalVal( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV45TFAlbRecMtrU_To = CommonUtil.decimalVal( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRECOBS") == 0 )
         {
            AV46TFAlbRecObs = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRECOBS_SEL") == 0 )
         {
            AV47TFAlbRecObs_Sel = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV28Emprcod = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBRECCOD") == 0 )
         {
            AV29AlbRecCod = (int)(GXutil.lval( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV69GXV1 = (int)(AV69GXV1+1) ;
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
      A2159AlbRecPie = "" ;
      A2155AlbRecKgm = DecimalUtil.ZERO ;
      A2156AlbRecKgmU = DecimalUtil.ZERO ;
      A2157AlbRecMtr = DecimalUtil.ZERO ;
      A2158AlbRecMtrU = DecimalUtil.ZERO ;
      A13693AlbRecObs = "" ;
      AV53Wcdetallepiezasds_1_emprcod = "" ;
      AV28Emprcod = "" ;
      AV55Wcdetallepiezasds_3_filterfulltext = "" ;
      AV49FilterFullText = "" ;
      AV56Wcdetallepiezasds_4_albrecpie = "" ;
      AV32AlbRecPie = "" ;
      AV57Wcdetallepiezasds_5_tfalbrecpie = "" ;
      AV36TFAlbRecPie = "" ;
      AV58Wcdetallepiezasds_6_tfalbrecpie_sel = "" ;
      AV37TFAlbRecPie_Sel = "" ;
      AV59Wcdetallepiezasds_7_tfalbreckgm = DecimalUtil.ZERO ;
      AV38TFAlbRecKgm = DecimalUtil.ZERO ;
      AV60Wcdetallepiezasds_8_tfalbreckgm_to = DecimalUtil.ZERO ;
      AV39TFAlbRecKgm_To = DecimalUtil.ZERO ;
      AV61Wcdetallepiezasds_9_tfalbreckgmu = DecimalUtil.ZERO ;
      AV40TFAlbRecKgmU = DecimalUtil.ZERO ;
      AV62Wcdetallepiezasds_10_tfalbreckgmu_to = DecimalUtil.ZERO ;
      AV41TFAlbRecKgmU_To = DecimalUtil.ZERO ;
      AV63Wcdetallepiezasds_11_tfalbrecmtr = DecimalUtil.ZERO ;
      AV42TFAlbRecMtr = DecimalUtil.ZERO ;
      AV64Wcdetallepiezasds_12_tfalbrecmtr_to = DecimalUtil.ZERO ;
      AV43TFAlbRecMtr_To = DecimalUtil.ZERO ;
      AV65Wcdetallepiezasds_13_tfalbrecmtru = DecimalUtil.ZERO ;
      AV44TFAlbRecMtrU = DecimalUtil.ZERO ;
      AV66Wcdetallepiezasds_14_tfalbrecmtru_to = DecimalUtil.ZERO ;
      AV45TFAlbRecMtrU_To = DecimalUtil.ZERO ;
      AV67Wcdetallepiezasds_15_tfalbrecobs = "" ;
      AV46TFAlbRecObs = "" ;
      AV68Wcdetallepiezasds_16_tfalbrecobs_sel = "" ;
      AV47TFAlbRecObs_Sel = "" ;
      lV55Wcdetallepiezasds_3_filterfulltext = "" ;
      lV67Wcdetallepiezasds_15_tfalbrecobs = "" ;
      scmdbuf = "" ;
      A396EmprCod = "" ;
      P08C32_A44AlbRecCod = new int[1] ;
      P08C32_A396EmprCod = new String[] {""} ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector5 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV34GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV35GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcdetallepiezasexportcsv__default(),
         new Object[] {
             new Object[] {
            P08C32_A44AlbRecCod, P08C32_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short AV48AlbRecPieOperator ;
   private short AV30OrderedBy ;
   private short Gx_err ;
   private int AV13Random ;
   private int AV54Wcdetallepiezasds_2_albreccod ;
   private int AV29AlbRecCod ;
   private int A44AlbRecCod ;
   private int AV69GXV1 ;
   private java.math.BigDecimal A2155AlbRecKgm ;
   private java.math.BigDecimal A2156AlbRecKgmU ;
   private java.math.BigDecimal A2157AlbRecMtr ;
   private java.math.BigDecimal A2158AlbRecMtrU ;
   private java.math.BigDecimal AV59Wcdetallepiezasds_7_tfalbreckgm ;
   private java.math.BigDecimal AV38TFAlbRecKgm ;
   private java.math.BigDecimal AV60Wcdetallepiezasds_8_tfalbreckgm_to ;
   private java.math.BigDecimal AV39TFAlbRecKgm_To ;
   private java.math.BigDecimal AV61Wcdetallepiezasds_9_tfalbreckgmu ;
   private java.math.BigDecimal AV40TFAlbRecKgmU ;
   private java.math.BigDecimal AV62Wcdetallepiezasds_10_tfalbreckgmu_to ;
   private java.math.BigDecimal AV41TFAlbRecKgmU_To ;
   private java.math.BigDecimal AV63Wcdetallepiezasds_11_tfalbrecmtr ;
   private java.math.BigDecimal AV42TFAlbRecMtr ;
   private java.math.BigDecimal AV64Wcdetallepiezasds_12_tfalbrecmtr_to ;
   private java.math.BigDecimal AV43TFAlbRecMtr_To ;
   private java.math.BigDecimal AV65Wcdetallepiezasds_13_tfalbrecmtru ;
   private java.math.BigDecimal AV44TFAlbRecMtrU ;
   private java.math.BigDecimal AV66Wcdetallepiezasds_14_tfalbrecmtru_to ;
   private java.math.BigDecimal AV45TFAlbRecMtrU_To ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A2159AlbRecPie ;
   private String A13693AlbRecObs ;
   private String AV53Wcdetallepiezasds_1_emprcod ;
   private String AV28Emprcod ;
   private String AV56Wcdetallepiezasds_4_albrecpie ;
   private String AV32AlbRecPie ;
   private String AV57Wcdetallepiezasds_5_tfalbrecpie ;
   private String AV36TFAlbRecPie ;
   private String AV58Wcdetallepiezasds_6_tfalbrecpie_sel ;
   private String AV37TFAlbRecPie_Sel ;
   private String AV67Wcdetallepiezasds_15_tfalbrecobs ;
   private String AV46TFAlbRecObs ;
   private String AV68Wcdetallepiezasds_16_tfalbrecobs_sel ;
   private String AV47TFAlbRecObs_Sel ;
   private String lV67Wcdetallepiezasds_15_tfalbrecobs ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV31OrderedDsc ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV55Wcdetallepiezasds_3_filterfulltext ;
   private String AV49FilterFullText ;
   private String lV55Wcdetallepiezasds_3_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private int[] P08C32_A44AlbRecCod ;
   private String[] P08C32_A396EmprCod ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV34GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV35GridStateFilterValue ;
}

final  class wcdetallepiezasexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08C32( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV48AlbRecPieOperator ,
                                          String AV56Wcdetallepiezasds_4_albrecpie ,
                                          String AV58Wcdetallepiezasds_6_tfalbrecpie_sel ,
                                          String AV57Wcdetallepiezasds_5_tfalbrecpie ,
                                          java.math.BigDecimal AV59Wcdetallepiezasds_7_tfalbreckgm ,
                                          java.math.BigDecimal AV60Wcdetallepiezasds_8_tfalbreckgm_to ,
                                          java.math.BigDecimal AV61Wcdetallepiezasds_9_tfalbreckgmu ,
                                          java.math.BigDecimal AV62Wcdetallepiezasds_10_tfalbreckgmu_to ,
                                          java.math.BigDecimal AV63Wcdetallepiezasds_11_tfalbrecmtr ,
                                          java.math.BigDecimal AV64Wcdetallepiezasds_12_tfalbrecmtr_to ,
                                          java.math.BigDecimal AV65Wcdetallepiezasds_13_tfalbrecmtru ,
                                          java.math.BigDecimal AV66Wcdetallepiezasds_14_tfalbrecmtru_to ,
                                          String A2159AlbRecPie ,
                                          java.math.BigDecimal A2155AlbRecKgm ,
                                          java.math.BigDecimal A2156AlbRecKgmU ,
                                          java.math.BigDecimal A2157AlbRecMtr ,
                                          java.math.BigDecimal A2158AlbRecMtrU ,
                                          short AV30OrderedBy ,
                                          boolean AV31OrderedDsc ,
                                          String AV55Wcdetallepiezasds_3_filterfulltext ,
                                          String A13693AlbRecObs ,
                                          String AV68Wcdetallepiezasds_16_tfalbrecobs_sel ,
                                          String AV67Wcdetallepiezasds_15_tfalbrecobs ,
                                          String AV53Wcdetallepiezasds_1_emprcod ,
                                          int AV54Wcdetallepiezasds_2_albreccod ,
                                          String A396EmprCod ,
                                          int A44AlbRecCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[22];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT AlbRecCod, EmprCod FROM TXPALBREC" ;
      addWhere(sWhereString, "(EmprCod = ? and AlbRecCod = ?)");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(?) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(?,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(?,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(?,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(?,'999990.99'), 2) like '%' || ?) or ( UPPER(?) like '%' || UPPER(?))))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(?) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ? = ?))");
      scmdbuf += sWhereString ;
      if ( ( AV30OrderedBy == 1 ) && ! AV31OrderedDsc )
      {
         scmdbuf += " ORDER BY EmprCod, AlbRecCod" ;
      }
      else if ( ( AV30OrderedBy == 1 ) && ( AV31OrderedDsc ) )
      {
         scmdbuf += " ORDER BY EmprCod DESC, AlbRecCod DESC" ;
      }
      else if ( ( AV30OrderedBy == 2 ) && ! AV31OrderedDsc )
      {
         scmdbuf += " ORDER BY EmprCod, AlbRecCod" ;
      }
      else if ( ( AV30OrderedBy == 2 ) && ( AV31OrderedDsc ) )
      {
         scmdbuf += " ORDER BY EmprCod DESC, AlbRecCod DESC" ;
      }
      else if ( ( AV30OrderedBy == 3 ) && ! AV31OrderedDsc )
      {
         scmdbuf += " ORDER BY EmprCod, AlbRecCod" ;
      }
      else if ( ( AV30OrderedBy == 3 ) && ( AV31OrderedDsc ) )
      {
         scmdbuf += " ORDER BY EmprCod DESC, AlbRecCod DESC" ;
      }
      else if ( ( AV30OrderedBy == 4 ) && ! AV31OrderedDsc )
      {
         scmdbuf += " ORDER BY EmprCod, AlbRecCod" ;
      }
      else if ( ( AV30OrderedBy == 4 ) && ( AV31OrderedDsc ) )
      {
         scmdbuf += " ORDER BY EmprCod DESC, AlbRecCod DESC" ;
      }
      else if ( ( AV30OrderedBy == 5 ) && ! AV31OrderedDsc )
      {
         scmdbuf += " ORDER BY EmprCod, AlbRecCod" ;
      }
      else if ( ( AV30OrderedBy == 5 ) && ( AV31OrderedDsc ) )
      {
         scmdbuf += " ORDER BY EmprCod DESC, AlbRecCod DESC" ;
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
                  return conditional_P08C32(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (String)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , ((Number) dynConstraints[17]).shortValue() , ((Boolean) dynConstraints[18]).booleanValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08C32", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
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
                  stmt.setString(sIdx, (String)parms[22], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[24], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 9);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[27], 2);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 2);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[31], 2);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[33], 2);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 80);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 80);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 80);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 80);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 80);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 80);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 80);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 80);
               }
               return;
      }
   }

}

