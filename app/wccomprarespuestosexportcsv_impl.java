package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wccomprarespuestosexportcsv_impl extends GXWebProcedure
{
   public wccomprarespuestosexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "WCCompraRespuestosExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("WCCompraRespuestosColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("WCCompraRespuestosColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Repuesto", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Codigo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cantidad", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Precio", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cantidad Entrada", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Precio entrada", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV51Wccomprarespuestosds_1_emprcod = AV28EmprCod ;
      AV52Wccomprarespuestosds_2_mcomcod = AV29MComCod ;
      AV53Wccomprarespuestosds_3_filterfulltext = AV47FilterFullText ;
      AV54Wccomprarespuestosds_4_tfmrnom = AV37TFMRNom ;
      AV55Wccomprarespuestosds_5_tfmrnom_sel = AV38TFMRNom_Sel ;
      AV56Wccomprarespuestosds_6_tfmrcod = AV35TFMRCod ;
      AV57Wccomprarespuestosds_7_tfmrcod_to = AV36TFMRCod_To ;
      AV58Wccomprarespuestosds_8_tfmcomsolcnt = AV39TFMComSolCnt ;
      AV59Wccomprarespuestosds_9_tfmcomsolcnt_to = AV40TFMComSolCnt_To ;
      AV60Wccomprarespuestosds_10_tfmcomsolpre = AV41TFMComSolPre ;
      AV61Wccomprarespuestosds_11_tfmcomsolpre_to = AV42TFMComSolPre_To ;
      AV62Wccomprarespuestosds_12_tfmcomentcnt = AV43TFMComEntCnt ;
      AV63Wccomprarespuestosds_13_tfmcomentcnt_to = AV44TFMComEntCnt_To ;
      AV64Wccomprarespuestosds_14_tfmcomentpre = AV45TFMComEntPre ;
      AV65Wccomprarespuestosds_15_tfmcomentpre_to = AV46TFMComEntPre_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV53Wccomprarespuestosds_3_filterfulltext ,
                                           AV55Wccomprarespuestosds_5_tfmrnom_sel ,
                                           AV54Wccomprarespuestosds_4_tfmrnom ,
                                           Integer.valueOf(AV56Wccomprarespuestosds_6_tfmrcod) ,
                                           Integer.valueOf(AV57Wccomprarespuestosds_7_tfmrcod_to) ,
                                           AV58Wccomprarespuestosds_8_tfmcomsolcnt ,
                                           AV59Wccomprarespuestosds_9_tfmcomsolcnt_to ,
                                           AV60Wccomprarespuestosds_10_tfmcomsolpre ,
                                           AV61Wccomprarespuestosds_11_tfmcomsolpre_to ,
                                           AV62Wccomprarespuestosds_12_tfmcomentcnt ,
                                           AV63Wccomprarespuestosds_13_tfmcomentcnt_to ,
                                           AV64Wccomprarespuestosds_14_tfmcomentpre ,
                                           AV65Wccomprarespuestosds_15_tfmcomentpre_to ,
                                           A9493MRNom ,
                                           Integer.valueOf(A9492MRCod) ,
                                           A11051MComSolCnt ,
                                           A11052MComSolPre ,
                                           A11053MComEntCnt ,
                                           A11054MComEntPre ,
                                           Short.valueOf(AV30OrderedBy) ,
                                           Boolean.valueOf(AV31OrderedDsc) ,
                                           AV51Wccomprarespuestosds_1_emprcod ,
                                           Long.valueOf(AV52Wccomprarespuestosds_2_mcomcod) ,
                                           A396EmprCod ,
                                           Long.valueOf(A11055MComCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.LONG
                                           }
      });
      lV53Wccomprarespuestosds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Wccomprarespuestosds_3_filterfulltext), "%", "") ;
      lV53Wccomprarespuestosds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Wccomprarespuestosds_3_filterfulltext), "%", "") ;
      lV53Wccomprarespuestosds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Wccomprarespuestosds_3_filterfulltext), "%", "") ;
      lV53Wccomprarespuestosds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Wccomprarespuestosds_3_filterfulltext), "%", "") ;
      lV53Wccomprarespuestosds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Wccomprarespuestosds_3_filterfulltext), "%", "") ;
      lV53Wccomprarespuestosds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Wccomprarespuestosds_3_filterfulltext), "%", "") ;
      lV54Wccomprarespuestosds_4_tfmrnom = GXutil.padr( GXutil.rtrim( AV54Wccomprarespuestosds_4_tfmrnom), 100, "%") ;
      /* Using cursor P08WH2 */
      pr_default.execute(0, new Object[] {AV51Wccomprarespuestosds_1_emprcod, Long.valueOf(AV52Wccomprarespuestosds_2_mcomcod), lV53Wccomprarespuestosds_3_filterfulltext, lV53Wccomprarespuestosds_3_filterfulltext, lV53Wccomprarespuestosds_3_filterfulltext, lV53Wccomprarespuestosds_3_filterfulltext, lV53Wccomprarespuestosds_3_filterfulltext, lV53Wccomprarespuestosds_3_filterfulltext, lV54Wccomprarespuestosds_4_tfmrnom, AV55Wccomprarespuestosds_5_tfmrnom_sel, Integer.valueOf(AV56Wccomprarespuestosds_6_tfmrcod), Integer.valueOf(AV57Wccomprarespuestosds_7_tfmrcod_to), AV58Wccomprarespuestosds_8_tfmcomsolcnt, AV59Wccomprarespuestosds_9_tfmcomsolcnt_to, AV60Wccomprarespuestosds_10_tfmcomsolpre, AV61Wccomprarespuestosds_11_tfmcomsolpre_to, AV62Wccomprarespuestosds_12_tfmcomentcnt, AV63Wccomprarespuestosds_13_tfmcomentcnt_to, AV64Wccomprarespuestosds_14_tfmcomentpre, AV65Wccomprarespuestosds_15_tfmcomentpre_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A11054MComEntPre = P08WH2_A11054MComEntPre[0] ;
         A11053MComEntCnt = P08WH2_A11053MComEntCnt[0] ;
         A11052MComSolPre = P08WH2_A11052MComSolPre[0] ;
         A11051MComSolCnt = P08WH2_A11051MComSolCnt[0] ;
         A9492MRCod = P08WH2_A9492MRCod[0] ;
         A9493MRNom = P08WH2_A9493MRNom[0] ;
         n9493MRNom = P08WH2_n9493MRNom[0] ;
         A11055MComCod = P08WH2_A11055MComCod[0] ;
         A396EmprCod = P08WH2_A396EmprCod[0] ;
         A9493MRNom = P08WH2_A9493MRNom[0] ;
         n9493MRNom = P08WH2_n9493MRNom[0] ;
         AV14TextFileLine = "" ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S162 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A9493MRNom, ";", ","), GXv_char3) ;
            wccomprarespuestosexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A9492MRCod, 8, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A11051MComSolCnt, 9, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A11052MComSolPre, 12, 3) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A11053MComEntCnt, 9, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A11054MComEntPre, 12, 3) ;
         }
         /* Execute user subroutine: 'AFTERWRITELINE' */
         S172 ();
         if ( returnInSub )
         {
            pr_default.close(0);
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=WCCompraRespuestosExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MRNom", "", "Repuesto", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MRCod", "", "Codigo", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MComSolCnt", "", "Cantidad", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MComSolPre", "", "Precio", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MComEntCnt", "", "Cantidad Entrada", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MComEntPre", "", "Precio entrada", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WCCompraRespuestosColumnsSelector", GXv_char3) ;
      wccomprarespuestosexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("WCCompraRespuestosGridState"), "") == 0 )
      {
         AV33GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCCompraRespuestosGridState"), null, null);
      }
      else
      {
         AV33GridState.fromxml(AV19Session.getValue("WCCompraRespuestosGridState"), null, null);
      }
      AV30OrderedBy = AV33GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV31OrderedDsc = AV33GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV66GXV1 = 1 ;
      while ( AV66GXV1 <= AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV34GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV66GXV1));
         if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV47FilterFullText = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRNOM") == 0 )
         {
            AV37TFMRNom = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRNOM_SEL") == 0 )
         {
            AV38TFMRNom_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRCOD") == 0 )
         {
            AV35TFMRCod = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV36TFMRCod_To = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMCOMSOLCNT") == 0 )
         {
            AV39TFMComSolCnt = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV40TFMComSolCnt_To = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMCOMSOLPRE") == 0 )
         {
            AV41TFMComSolPre = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV42TFMComSolPre_To = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMCOMENTCNT") == 0 )
         {
            AV43TFMComEntCnt = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV44TFMComEntCnt_To = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMCOMENTPRE") == 0 )
         {
            AV45TFMComEntPre = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV46TFMComEntPre_To = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV28EmprCod = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MCOMCOD") == 0 )
         {
            AV29MComCod = GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
         }
         AV66GXV1 = (int)(AV66GXV1+1) ;
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
      A9493MRNom = "" ;
      A11051MComSolCnt = DecimalUtil.ZERO ;
      A11052MComSolPre = DecimalUtil.ZERO ;
      A11053MComEntCnt = DecimalUtil.ZERO ;
      A11054MComEntPre = DecimalUtil.ZERO ;
      AV51Wccomprarespuestosds_1_emprcod = "" ;
      AV28EmprCod = "" ;
      AV53Wccomprarespuestosds_3_filterfulltext = "" ;
      AV47FilterFullText = "" ;
      AV54Wccomprarespuestosds_4_tfmrnom = "" ;
      AV37TFMRNom = "" ;
      AV55Wccomprarespuestosds_5_tfmrnom_sel = "" ;
      AV38TFMRNom_Sel = "" ;
      AV58Wccomprarespuestosds_8_tfmcomsolcnt = DecimalUtil.ZERO ;
      AV39TFMComSolCnt = DecimalUtil.ZERO ;
      AV59Wccomprarespuestosds_9_tfmcomsolcnt_to = DecimalUtil.ZERO ;
      AV40TFMComSolCnt_To = DecimalUtil.ZERO ;
      AV60Wccomprarespuestosds_10_tfmcomsolpre = DecimalUtil.ZERO ;
      AV41TFMComSolPre = DecimalUtil.ZERO ;
      AV61Wccomprarespuestosds_11_tfmcomsolpre_to = DecimalUtil.ZERO ;
      AV42TFMComSolPre_To = DecimalUtil.ZERO ;
      AV62Wccomprarespuestosds_12_tfmcomentcnt = DecimalUtil.ZERO ;
      AV43TFMComEntCnt = DecimalUtil.ZERO ;
      AV63Wccomprarespuestosds_13_tfmcomentcnt_to = DecimalUtil.ZERO ;
      AV44TFMComEntCnt_To = DecimalUtil.ZERO ;
      AV64Wccomprarespuestosds_14_tfmcomentpre = DecimalUtil.ZERO ;
      AV45TFMComEntPre = DecimalUtil.ZERO ;
      AV65Wccomprarespuestosds_15_tfmcomentpre_to = DecimalUtil.ZERO ;
      AV46TFMComEntPre_To = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV53Wccomprarespuestosds_3_filterfulltext = "" ;
      lV54Wccomprarespuestosds_4_tfmrnom = "" ;
      A396EmprCod = "" ;
      P08WH2_A11054MComEntPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08WH2_A11053MComEntCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08WH2_A11052MComSolPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08WH2_A11051MComSolCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08WH2_A9492MRCod = new int[1] ;
      P08WH2_A9493MRNom = new String[] {""} ;
      P08WH2_n9493MRNom = new boolean[] {false} ;
      P08WH2_A11055MComCod = new long[1] ;
      P08WH2_A396EmprCod = new String[] {""} ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector5 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV33GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV34GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wccomprarespuestosexportcsv__default(),
         new Object[] {
             new Object[] {
            P08WH2_A11054MComEntPre, P08WH2_A11053MComEntCnt, P08WH2_A11052MComSolPre, P08WH2_A11051MComSolCnt, P08WH2_A9492MRCod, P08WH2_A9493MRNom, P08WH2_n9493MRNom, P08WH2_A11055MComCod, P08WH2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short AV30OrderedBy ;
   private short Gx_err ;
   private int AV13Random ;
   private int A9492MRCod ;
   private int AV56Wccomprarespuestosds_6_tfmrcod ;
   private int AV35TFMRCod ;
   private int AV57Wccomprarespuestosds_7_tfmrcod_to ;
   private int AV36TFMRCod_To ;
   private int AV66GXV1 ;
   private long AV52Wccomprarespuestosds_2_mcomcod ;
   private long AV29MComCod ;
   private long A11055MComCod ;
   private java.math.BigDecimal A11051MComSolCnt ;
   private java.math.BigDecimal A11052MComSolPre ;
   private java.math.BigDecimal A11053MComEntCnt ;
   private java.math.BigDecimal A11054MComEntPre ;
   private java.math.BigDecimal AV58Wccomprarespuestosds_8_tfmcomsolcnt ;
   private java.math.BigDecimal AV39TFMComSolCnt ;
   private java.math.BigDecimal AV59Wccomprarespuestosds_9_tfmcomsolcnt_to ;
   private java.math.BigDecimal AV40TFMComSolCnt_To ;
   private java.math.BigDecimal AV60Wccomprarespuestosds_10_tfmcomsolpre ;
   private java.math.BigDecimal AV41TFMComSolPre ;
   private java.math.BigDecimal AV61Wccomprarespuestosds_11_tfmcomsolpre_to ;
   private java.math.BigDecimal AV42TFMComSolPre_To ;
   private java.math.BigDecimal AV62Wccomprarespuestosds_12_tfmcomentcnt ;
   private java.math.BigDecimal AV43TFMComEntCnt ;
   private java.math.BigDecimal AV63Wccomprarespuestosds_13_tfmcomentcnt_to ;
   private java.math.BigDecimal AV44TFMComEntCnt_To ;
   private java.math.BigDecimal AV64Wccomprarespuestosds_14_tfmcomentpre ;
   private java.math.BigDecimal AV45TFMComEntPre ;
   private java.math.BigDecimal AV65Wccomprarespuestosds_15_tfmcomentpre_to ;
   private java.math.BigDecimal AV46TFMComEntPre_To ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A9493MRNom ;
   private String AV51Wccomprarespuestosds_1_emprcod ;
   private String AV28EmprCod ;
   private String AV54Wccomprarespuestosds_4_tfmrnom ;
   private String AV37TFMRNom ;
   private String AV55Wccomprarespuestosds_5_tfmrnom_sel ;
   private String AV38TFMRNom_Sel ;
   private String scmdbuf ;
   private String lV54Wccomprarespuestosds_4_tfmrnom ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV31OrderedDsc ;
   private boolean n9493MRNom ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV53Wccomprarespuestosds_3_filterfulltext ;
   private String AV47FilterFullText ;
   private String lV53Wccomprarespuestosds_3_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] P08WH2_A11054MComEntPre ;
   private java.math.BigDecimal[] P08WH2_A11053MComEntCnt ;
   private java.math.BigDecimal[] P08WH2_A11052MComSolPre ;
   private java.math.BigDecimal[] P08WH2_A11051MComSolCnt ;
   private int[] P08WH2_A9492MRCod ;
   private String[] P08WH2_A9493MRNom ;
   private boolean[] P08WH2_n9493MRNom ;
   private long[] P08WH2_A11055MComCod ;
   private String[] P08WH2_A396EmprCod ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV33GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV34GridStateFilterValue ;
}

final  class wccomprarespuestosexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08WH2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV53Wccomprarespuestosds_3_filterfulltext ,
                                          String AV55Wccomprarespuestosds_5_tfmrnom_sel ,
                                          String AV54Wccomprarespuestosds_4_tfmrnom ,
                                          int AV56Wccomprarespuestosds_6_tfmrcod ,
                                          int AV57Wccomprarespuestosds_7_tfmrcod_to ,
                                          java.math.BigDecimal AV58Wccomprarespuestosds_8_tfmcomsolcnt ,
                                          java.math.BigDecimal AV59Wccomprarespuestosds_9_tfmcomsolcnt_to ,
                                          java.math.BigDecimal AV60Wccomprarespuestosds_10_tfmcomsolpre ,
                                          java.math.BigDecimal AV61Wccomprarespuestosds_11_tfmcomsolpre_to ,
                                          java.math.BigDecimal AV62Wccomprarespuestosds_12_tfmcomentcnt ,
                                          java.math.BigDecimal AV63Wccomprarespuestosds_13_tfmcomentcnt_to ,
                                          java.math.BigDecimal AV64Wccomprarespuestosds_14_tfmcomentpre ,
                                          java.math.BigDecimal AV65Wccomprarespuestosds_15_tfmcomentpre_to ,
                                          String A9493MRNom ,
                                          int A9492MRCod ,
                                          java.math.BigDecimal A11051MComSolCnt ,
                                          java.math.BigDecimal A11052MComSolPre ,
                                          java.math.BigDecimal A11053MComEntCnt ,
                                          java.math.BigDecimal A11054MComEntPre ,
                                          short AV30OrderedBy ,
                                          boolean AV31OrderedDsc ,
                                          String AV51Wccomprarespuestosds_1_emprcod ,
                                          long AV52Wccomprarespuestosds_2_mcomcod ,
                                          String A396EmprCod ,
                                          long A11055MComCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[20];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.MComEntPre, T1.MComEntCnt, T1.MComSolPre, T1.MComSolCnt, T1.MRCod, T2.MRNom, T1.MComCod, T1.EmprCod FROM (TXPMRepC1 T1 INNER JOIN TXPMREPUE T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.MRCod = T1.MRCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.MComCod = ?)");
      if ( ! (GXutil.strcmp("", AV53Wccomprarespuestosds_3_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T2.MRNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.MRCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MComSolCnt,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MComSolPre,'99999990.999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MComEntCnt,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MComEntPre,'99999990.999'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
         GXv_int6[3] = (byte)(1) ;
         GXv_int6[4] = (byte)(1) ;
         GXv_int6[5] = (byte)(1) ;
         GXv_int6[6] = (byte)(1) ;
         GXv_int6[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55Wccomprarespuestosds_5_tfmrnom_sel)==0) && ( ! (GXutil.strcmp("", AV54Wccomprarespuestosds_4_tfmrnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MRNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Wccomprarespuestosds_5_tfmrnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MRNom = ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (0==AV56Wccomprarespuestosds_6_tfmrcod) )
      {
         addWhere(sWhereString, "(T1.MRCod >= ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (0==AV57Wccomprarespuestosds_7_tfmrcod_to) )
      {
         addWhere(sWhereString, "(T1.MRCod <= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV58Wccomprarespuestosds_8_tfmcomsolcnt)==0) )
      {
         addWhere(sWhereString, "(T1.MComSolCnt >= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV59Wccomprarespuestosds_9_tfmcomsolcnt_to)==0) )
      {
         addWhere(sWhereString, "(T1.MComSolCnt <= ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV60Wccomprarespuestosds_10_tfmcomsolpre)==0) )
      {
         addWhere(sWhereString, "(T1.MComSolPre >= ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV61Wccomprarespuestosds_11_tfmcomsolpre_to)==0) )
      {
         addWhere(sWhereString, "(T1.MComSolPre <= ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV62Wccomprarespuestosds_12_tfmcomentcnt)==0) )
      {
         addWhere(sWhereString, "(T1.MComEntCnt >= ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV63Wccomprarespuestosds_13_tfmcomentcnt_to)==0) )
      {
         addWhere(sWhereString, "(T1.MComEntCnt <= ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV64Wccomprarespuestosds_14_tfmcomentpre)==0) )
      {
         addWhere(sWhereString, "(T1.MComEntPre >= ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV65Wccomprarespuestosds_15_tfmcomentpre_to)==0) )
      {
         addWhere(sWhereString, "(T1.MComEntPre <= ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV30OrderedBy == 1 ) && ! AV31OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MComCod, T2.MRNom" ;
      }
      else if ( ( AV30OrderedBy == 1 ) && ( AV31OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MComCod DESC, T2.MRNom DESC" ;
      }
      else if ( ( AV30OrderedBy == 2 ) && ! AV31OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MComCod, T1.MRCod" ;
      }
      else if ( ( AV30OrderedBy == 2 ) && ( AV31OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MComCod DESC, T1.MRCod DESC" ;
      }
      else if ( ( AV30OrderedBy == 3 ) && ! AV31OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MComCod, T1.MComSolCnt" ;
      }
      else if ( ( AV30OrderedBy == 3 ) && ( AV31OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MComCod DESC, T1.MComSolCnt DESC" ;
      }
      else if ( ( AV30OrderedBy == 4 ) && ! AV31OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MComCod, T1.MComSolPre" ;
      }
      else if ( ( AV30OrderedBy == 4 ) && ( AV31OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MComCod DESC, T1.MComSolPre DESC" ;
      }
      else if ( ( AV30OrderedBy == 5 ) && ! AV31OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MComCod, T1.MComEntCnt" ;
      }
      else if ( ( AV30OrderedBy == 5 ) && ( AV31OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MComCod DESC, T1.MComEntCnt DESC" ;
      }
      else if ( ( AV30OrderedBy == 6 ) && ! AV31OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MComCod, T1.MComEntPre" ;
      }
      else if ( ( AV30OrderedBy == 6 ) && ( AV31OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MComCod DESC, T1.MComEntPre DESC" ;
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
                  return conditional_P08WH2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Boolean) dynConstraints[20]).booleanValue() , (String)dynConstraints[21] , ((Number) dynConstraints[22]).longValue() , (String)dynConstraints[23] , ((Number) dynConstraints[24]).longValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08WH2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,3);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 100);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((long[]) buf[7])[0] = rslt.getLong(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 3);
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
                  stmt.setString(sIdx, (String)parms[20], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[21]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[22], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[24], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[25], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[32], 2);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[33], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 3);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 3);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 3);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 3);
               }
               return;
      }
   }

}

