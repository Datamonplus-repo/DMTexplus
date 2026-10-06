package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class weboperariosexportcsv_impl extends GXWebProcedure
{
   public weboperariosexportcsv_impl( com.genexus.internet.HttpContext context )
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
      S201 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITECOLUMNTITLES' */
      S141 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITEDATA' */
      S161 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'CLOSEDOCUMENT' */
      S191 ();
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
      AV11Filename = "./PrivateTempStorage/" + "WebOperariosExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      /* 'LOADDYNAMICFILTERS' Routine */
      returnInSub = false ;
      if ( AV43GridState.getgxTv_SdtWWPGridState_Dynamicfilters().size() >= 1 )
      {
         AV41GridStateDynamicFilter = (app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)((app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)AV43GridState.getgxTv_SdtWWPGridState_Dynamicfilters().elementAt(-1+1));
         AV30DynamicFiltersSelector1 = AV41GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Selected() ;
         if ( GXutil.strcmp(AV30DynamicFiltersSelector1, "OPENOM") == 0 )
         {
            AV31DynamicFiltersOperator1 = AV41GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Operator() ;
            AV32OpeNom1 = AV41GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Value() ;
         }
         if ( AV43GridState.getgxTv_SdtWWPGridState_Dynamicfilters().size() >= 2 )
         {
            AV33DynamicFiltersEnabled2 = true ;
            AV41GridStateDynamicFilter = (app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)((app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)AV43GridState.getgxTv_SdtWWPGridState_Dynamicfilters().elementAt(-1+2));
            AV34DynamicFiltersSelector2 = AV41GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Selected() ;
            if ( GXutil.strcmp(AV34DynamicFiltersSelector2, "OPENOM") == 0 )
            {
               AV35DynamicFiltersOperator2 = AV41GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Operator() ;
               AV36OpeNom2 = AV41GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Value() ;
            }
            if ( AV43GridState.getgxTv_SdtWWPGridState_Dynamicfilters().size() >= 3 )
            {
               AV37DynamicFiltersEnabled3 = true ;
               AV41GridStateDynamicFilter = (app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)((app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)AV43GridState.getgxTv_SdtWWPGridState_Dynamicfilters().elementAt(-1+3));
               AV38DynamicFiltersSelector3 = AV41GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Selected() ;
               if ( GXutil.strcmp(AV38DynamicFiltersSelector3, "OPENOM") == 0 )
               {
                  AV39DynamicFiltersOperator3 = AV41GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Operator() ;
                  AV40OpeNom3 = AV41GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Value() ;
               }
            }
         }
      }
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV14TextFileLine = "" ;
      if ( GXutil.strcmp(AV19Session.getValue("WebOperariosColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("WebOperariosColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+"" : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Operario", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre II", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "A/I", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV60Weboperariosds_1_filterfulltext = AV54FilterFullText ;
      AV61Weboperariosds_2_dynamicfiltersselector1 = AV30DynamicFiltersSelector1 ;
      AV62Weboperariosds_3_dynamicfiltersoperator1 = AV31DynamicFiltersOperator1 ;
      AV63Weboperariosds_4_openom1 = AV32OpeNom1 ;
      AV64Weboperariosds_5_dynamicfiltersenabled2 = AV33DynamicFiltersEnabled2 ;
      AV65Weboperariosds_6_dynamicfiltersselector2 = AV34DynamicFiltersSelector2 ;
      AV66Weboperariosds_7_dynamicfiltersoperator2 = AV35DynamicFiltersOperator2 ;
      AV67Weboperariosds_8_openom2 = AV36OpeNom2 ;
      AV68Weboperariosds_9_dynamicfiltersenabled3 = AV37DynamicFiltersEnabled3 ;
      AV69Weboperariosds_10_dynamicfiltersselector3 = AV38DynamicFiltersSelector3 ;
      AV70Weboperariosds_11_dynamicfiltersoperator3 = AV39DynamicFiltersOperator3 ;
      AV71Weboperariosds_12_openom3 = AV40OpeNom3 ;
      AV72Weboperariosds_13_tfopecod = AV45TFOpeCod ;
      AV73Weboperariosds_14_tfopecod_to = AV46TFOpeCod_To ;
      AV74Weboperariosds_15_tfopenom = AV47TFOpeNom ;
      AV75Weboperariosds_16_tfopenom_sel = AV48TFOpeNom_Sel ;
      AV76Weboperariosds_17_tfopenom2 = AV49TFOpeNom2 ;
      AV77Weboperariosds_18_tfopenom2_sel = AV50TFOpeNom2_Sel ;
      AV78Weboperariosds_19_tfopeact = AV51TFOpeAct ;
      AV79Weboperariosds_20_tfopeact_sel = AV52TFOpeAct_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV60Weboperariosds_1_filterfulltext ,
                                           AV61Weboperariosds_2_dynamicfiltersselector1 ,
                                           Short.valueOf(AV62Weboperariosds_3_dynamicfiltersoperator1) ,
                                           AV63Weboperariosds_4_openom1 ,
                                           Boolean.valueOf(AV64Weboperariosds_5_dynamicfiltersenabled2) ,
                                           AV65Weboperariosds_6_dynamicfiltersselector2 ,
                                           Short.valueOf(AV66Weboperariosds_7_dynamicfiltersoperator2) ,
                                           AV67Weboperariosds_8_openom2 ,
                                           Boolean.valueOf(AV68Weboperariosds_9_dynamicfiltersenabled3) ,
                                           AV69Weboperariosds_10_dynamicfiltersselector3 ,
                                           Short.valueOf(AV70Weboperariosds_11_dynamicfiltersoperator3) ,
                                           AV71Weboperariosds_12_openom3 ,
                                           Integer.valueOf(AV72Weboperariosds_13_tfopecod) ,
                                           Integer.valueOf(AV73Weboperariosds_14_tfopecod_to) ,
                                           AV75Weboperariosds_16_tfopenom_sel ,
                                           AV74Weboperariosds_15_tfopenom ,
                                           AV77Weboperariosds_18_tfopenom2_sel ,
                                           AV76Weboperariosds_17_tfopenom2 ,
                                           AV79Weboperariosds_20_tfopeact_sel ,
                                           AV78Weboperariosds_19_tfopeact ,
                                           Integer.valueOf(A652OpeCod) ,
                                           A653OpeNom ,
                                           A6869OpeNom2 ,
                                           A8482OpeAct ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV60Weboperariosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Weboperariosds_1_filterfulltext), "%", "") ;
      lV60Weboperariosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Weboperariosds_1_filterfulltext), "%", "") ;
      lV60Weboperariosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Weboperariosds_1_filterfulltext), "%", "") ;
      lV60Weboperariosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Weboperariosds_1_filterfulltext), "%", "") ;
      lV63Weboperariosds_4_openom1 = GXutil.padr( GXutil.rtrim( AV63Weboperariosds_4_openom1), 30, "%") ;
      lV63Weboperariosds_4_openom1 = GXutil.padr( GXutil.rtrim( AV63Weboperariosds_4_openom1), 30, "%") ;
      lV67Weboperariosds_8_openom2 = GXutil.padr( GXutil.rtrim( AV67Weboperariosds_8_openom2), 30, "%") ;
      lV67Weboperariosds_8_openom2 = GXutil.padr( GXutil.rtrim( AV67Weboperariosds_8_openom2), 30, "%") ;
      lV71Weboperariosds_12_openom3 = GXutil.padr( GXutil.rtrim( AV71Weboperariosds_12_openom3), 30, "%") ;
      lV71Weboperariosds_12_openom3 = GXutil.padr( GXutil.rtrim( AV71Weboperariosds_12_openom3), 30, "%") ;
      lV74Weboperariosds_15_tfopenom = GXutil.padr( GXutil.rtrim( AV74Weboperariosds_15_tfopenom), 30, "%") ;
      lV76Weboperariosds_17_tfopenom2 = GXutil.padr( GXutil.rtrim( AV76Weboperariosds_17_tfopenom2), 30, "%") ;
      lV78Weboperariosds_19_tfopeact = GXutil.padr( GXutil.rtrim( AV78Weboperariosds_19_tfopeact), 1, "%") ;
      /* Using cursor P08B42 */
      pr_default.execute(0, new Object[] {lV60Weboperariosds_1_filterfulltext, lV60Weboperariosds_1_filterfulltext, lV60Weboperariosds_1_filterfulltext, lV60Weboperariosds_1_filterfulltext, lV63Weboperariosds_4_openom1, lV63Weboperariosds_4_openom1, lV67Weboperariosds_8_openom2, lV67Weboperariosds_8_openom2, lV71Weboperariosds_12_openom3, lV71Weboperariosds_12_openom3, Integer.valueOf(AV72Weboperariosds_13_tfopecod), Integer.valueOf(AV73Weboperariosds_14_tfopecod_to), lV74Weboperariosds_15_tfopenom, AV75Weboperariosds_16_tfopenom_sel, lV76Weboperariosds_17_tfopenom2, AV77Weboperariosds_18_tfopenom2_sel, lV78Weboperariosds_19_tfopeact, AV79Weboperariosds_20_tfopeact_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A8482OpeAct = P08B42_A8482OpeAct[0] ;
         n8482OpeAct = P08B42_n8482OpeAct[0] ;
         A6869OpeNom2 = P08B42_A6869OpeNom2[0] ;
         n6869OpeNom2 = P08B42_n6869OpeNom2[0] ;
         A652OpeCod = P08B42_A652OpeCod[0] ;
         A653OpeNom = P08B42_A653OpeNom[0] ;
         n653OpeNom = P08B42_n653OpeNom[0] ;
         A396EmprCod = P08B42_A396EmprCod[0] ;
         AV14TextFileLine = "" ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S172 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV53Seleccion = "N" ;
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV53Seleccion, ";", ","), GXv_char3) ;
            weboperariosexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A652OpeCod, 6, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A653OpeNom, ";", ","), GXv_char3) ;
            weboperariosexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A6869OpeNom2, ";", ","), GXv_char3) ;
            weboperariosexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A8482OpeAct, ";", ","), GXv_char3) ;
            weboperariosexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         /* Execute user subroutine: 'AFTERWRITELINE' */
         S182 ();
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

   public void S191( )
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=WebOperariosExportCSV.csv");
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

   public void S151( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV15ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&Seleccion", "", "", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "OpeCod", "", "Operario", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "OpeNom", "", "Nombre", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "OpeNom2", "", "Nombre II", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "OpeAct", "", "A/I", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WebOperariosColumnsSelector", GXv_char3) ;
      weboperariosexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue("WebOperariosGridState"), "") == 0 )
      {
         AV43GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WebOperariosGridState"), null, null);
      }
      else
      {
         AV43GridState.fromxml(AV19Session.getValue("WebOperariosGridState"), null, null);
      }
      AV28OrderedBy = AV43GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV43GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV80GXV1 = 1 ;
      while ( AV80GXV1 <= AV43GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV44GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV43GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV80GXV1));
         if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV54FilterFullText = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOPECOD") == 0 )
         {
            AV45TFOpeCod = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV46TFOpeCod_To = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOPENOM") == 0 )
         {
            AV47TFOpeNom = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOPENOM_SEL") == 0 )
         {
            AV48TFOpeNom_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOPENOM2") == 0 )
         {
            AV49TFOpeNom2 = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOPENOM2_SEL") == 0 )
         {
            AV50TFOpeNom2_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOPEACT") == 0 )
         {
            AV51TFOpeAct = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOPEACT_SEL") == 0 )
         {
            AV52TFOpeAct_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV80GXV1 = (int)(AV80GXV1+1) ;
      }
      /* Execute user subroutine: 'LOADDYNAMICFILTERS' */
      S131 ();
      if (returnInSub) return;
   }

   public void S172( )
   {
      /* 'BEFOREWRITELINE' Routine */
      returnInSub = false ;
   }

   public void S182( )
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
      AV43GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV41GridStateDynamicFilter = new app.wwpbaseobjects.SdtWWPGridState_DynamicFilter(remoteHandle, context);
      AV30DynamicFiltersSelector1 = "" ;
      AV32OpeNom1 = "" ;
      AV34DynamicFiltersSelector2 = "" ;
      AV36OpeNom2 = "" ;
      AV38DynamicFiltersSelector3 = "" ;
      AV40OpeNom3 = "" ;
      AV14TextFileLine = "" ;
      AV19Session = httpContext.getWebSession();
      AV18ColumnsSelectorXML = "" ;
      AV15ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      A653OpeNom = "" ;
      A6869OpeNom2 = "" ;
      A8482OpeAct = "" ;
      AV60Weboperariosds_1_filterfulltext = "" ;
      AV54FilterFullText = "" ;
      AV61Weboperariosds_2_dynamicfiltersselector1 = "" ;
      AV63Weboperariosds_4_openom1 = "" ;
      AV65Weboperariosds_6_dynamicfiltersselector2 = "" ;
      AV67Weboperariosds_8_openom2 = "" ;
      AV69Weboperariosds_10_dynamicfiltersselector3 = "" ;
      AV71Weboperariosds_12_openom3 = "" ;
      AV74Weboperariosds_15_tfopenom = "" ;
      AV47TFOpeNom = "" ;
      AV75Weboperariosds_16_tfopenom_sel = "" ;
      AV48TFOpeNom_Sel = "" ;
      AV76Weboperariosds_17_tfopenom2 = "" ;
      AV49TFOpeNom2 = "" ;
      AV77Weboperariosds_18_tfopenom2_sel = "" ;
      AV50TFOpeNom2_Sel = "" ;
      AV78Weboperariosds_19_tfopeact = "" ;
      AV51TFOpeAct = "" ;
      AV79Weboperariosds_20_tfopeact_sel = "" ;
      AV52TFOpeAct_Sel = "" ;
      scmdbuf = "" ;
      lV60Weboperariosds_1_filterfulltext = "" ;
      lV63Weboperariosds_4_openom1 = "" ;
      lV67Weboperariosds_8_openom2 = "" ;
      lV71Weboperariosds_12_openom3 = "" ;
      lV74Weboperariosds_15_tfopenom = "" ;
      lV76Weboperariosds_17_tfopenom2 = "" ;
      lV78Weboperariosds_19_tfopeact = "" ;
      P08B42_A8482OpeAct = new String[] {""} ;
      P08B42_n8482OpeAct = new boolean[] {false} ;
      P08B42_A6869OpeNom2 = new String[] {""} ;
      P08B42_n6869OpeNom2 = new boolean[] {false} ;
      P08B42_A652OpeCod = new int[1] ;
      P08B42_A653OpeNom = new String[] {""} ;
      P08B42_n653OpeNom = new boolean[] {false} ;
      P08B42_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV53Seleccion = "" ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector5 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV44GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.weboperariosexportcsv__default(),
         new Object[] {
             new Object[] {
            P08B42_A8482OpeAct, P08B42_n8482OpeAct, P08B42_A6869OpeNom2, P08B42_n6869OpeNom2, P08B42_A652OpeCod, P08B42_A653OpeNom, P08B42_n653OpeNom, P08B42_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short AV31DynamicFiltersOperator1 ;
   private short AV35DynamicFiltersOperator2 ;
   private short AV39DynamicFiltersOperator3 ;
   private short AV62Weboperariosds_3_dynamicfiltersoperator1 ;
   private short AV66Weboperariosds_7_dynamicfiltersoperator2 ;
   private short AV70Weboperariosds_11_dynamicfiltersoperator3 ;
   private short AV28OrderedBy ;
   private short Gx_err ;
   private int AV13Random ;
   private int A652OpeCod ;
   private int AV72Weboperariosds_13_tfopecod ;
   private int AV45TFOpeCod ;
   private int AV73Weboperariosds_14_tfopecod_to ;
   private int AV46TFOpeCod_To ;
   private int AV80GXV1 ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV32OpeNom1 ;
   private String AV36OpeNom2 ;
   private String AV40OpeNom3 ;
   private String A653OpeNom ;
   private String A6869OpeNom2 ;
   private String A8482OpeAct ;
   private String AV63Weboperariosds_4_openom1 ;
   private String AV67Weboperariosds_8_openom2 ;
   private String AV71Weboperariosds_12_openom3 ;
   private String AV74Weboperariosds_15_tfopenom ;
   private String AV47TFOpeNom ;
   private String AV75Weboperariosds_16_tfopenom_sel ;
   private String AV48TFOpeNom_Sel ;
   private String AV76Weboperariosds_17_tfopenom2 ;
   private String AV49TFOpeNom2 ;
   private String AV77Weboperariosds_18_tfopenom2_sel ;
   private String AV50TFOpeNom2_Sel ;
   private String AV78Weboperariosds_19_tfopeact ;
   private String AV51TFOpeAct ;
   private String AV79Weboperariosds_20_tfopeact_sel ;
   private String AV52TFOpeAct_Sel ;
   private String scmdbuf ;
   private String lV63Weboperariosds_4_openom1 ;
   private String lV67Weboperariosds_8_openom2 ;
   private String lV71Weboperariosds_12_openom3 ;
   private String lV74Weboperariosds_15_tfopenom ;
   private String lV76Weboperariosds_17_tfopenom2 ;
   private String lV78Weboperariosds_19_tfopeact ;
   private String A396EmprCod ;
   private String AV53Seleccion ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV33DynamicFiltersEnabled2 ;
   private boolean AV37DynamicFiltersEnabled3 ;
   private boolean AV64Weboperariosds_5_dynamicfiltersenabled2 ;
   private boolean AV68Weboperariosds_9_dynamicfiltersenabled3 ;
   private boolean AV29OrderedDsc ;
   private boolean n8482OpeAct ;
   private boolean n6869OpeNom2 ;
   private boolean n653OpeNom ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV30DynamicFiltersSelector1 ;
   private String AV34DynamicFiltersSelector2 ;
   private String AV38DynamicFiltersSelector3 ;
   private String AV60Weboperariosds_1_filterfulltext ;
   private String AV54FilterFullText ;
   private String AV61Weboperariosds_2_dynamicfiltersselector1 ;
   private String AV65Weboperariosds_6_dynamicfiltersselector2 ;
   private String AV69Weboperariosds_10_dynamicfiltersselector3 ;
   private String lV60Weboperariosds_1_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private String[] P08B42_A8482OpeAct ;
   private boolean[] P08B42_n8482OpeAct ;
   private String[] P08B42_A6869OpeNom2 ;
   private boolean[] P08B42_n6869OpeNom2 ;
   private int[] P08B42_A652OpeCod ;
   private String[] P08B42_A653OpeNom ;
   private boolean[] P08B42_n653OpeNom ;
   private String[] P08B42_A396EmprCod ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV43GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV44GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPGridState_DynamicFilter AV41GridStateDynamicFilter ;
}

final  class weboperariosexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08B42( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV60Weboperariosds_1_filterfulltext ,
                                          String AV61Weboperariosds_2_dynamicfiltersselector1 ,
                                          short AV62Weboperariosds_3_dynamicfiltersoperator1 ,
                                          String AV63Weboperariosds_4_openom1 ,
                                          boolean AV64Weboperariosds_5_dynamicfiltersenabled2 ,
                                          String AV65Weboperariosds_6_dynamicfiltersselector2 ,
                                          short AV66Weboperariosds_7_dynamicfiltersoperator2 ,
                                          String AV67Weboperariosds_8_openom2 ,
                                          boolean AV68Weboperariosds_9_dynamicfiltersenabled3 ,
                                          String AV69Weboperariosds_10_dynamicfiltersselector3 ,
                                          short AV70Weboperariosds_11_dynamicfiltersoperator3 ,
                                          String AV71Weboperariosds_12_openom3 ,
                                          int AV72Weboperariosds_13_tfopecod ,
                                          int AV73Weboperariosds_14_tfopecod_to ,
                                          String AV75Weboperariosds_16_tfopenom_sel ,
                                          String AV74Weboperariosds_15_tfopenom ,
                                          String AV77Weboperariosds_18_tfopenom2_sel ,
                                          String AV76Weboperariosds_17_tfopenom2 ,
                                          String AV79Weboperariosds_20_tfopeact_sel ,
                                          String AV78Weboperariosds_19_tfopeact ,
                                          int A652OpeCod ,
                                          String A653OpeNom ,
                                          String A6869OpeNom2 ,
                                          String A8482OpeAct ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[18];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT OpeAct, OpeNom2, OpeCod, OpeNom, EmprCod FROM TXPOPERAR" ;
      if ( ! (GXutil.strcmp("", AV60Weboperariosds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(OpeCod,'999990'), 2) like '%' || ?) or ( UPPER(OpeNom) like '%' || UPPER(?)) or ( UPPER(OpeNom2) like '%' || UPPER(?)) or ( UPPER(OpeAct) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
         GXv_int6[1] = (byte)(1) ;
         GXv_int6[2] = (byte)(1) ;
         GXv_int6[3] = (byte)(1) ;
      }
      if ( ( GXutil.strcmp(AV61Weboperariosds_2_dynamicfiltersselector1, httpContext.getMessage( "OPENOM", "")) == 0 ) && ( AV62Weboperariosds_3_dynamicfiltersoperator1 == 0 ) && ( ! (GXutil.strcmp("", AV63Weboperariosds_4_openom1)==0) ) )
      {
         addWhere(sWhereString, "(OpeNom like '%' || ?)");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( ( GXutil.strcmp(AV61Weboperariosds_2_dynamicfiltersselector1, httpContext.getMessage( "OPENOM", "")) == 0 ) && ( AV62Weboperariosds_3_dynamicfiltersoperator1 == 1 ) && ( ! (GXutil.strcmp("", AV63Weboperariosds_4_openom1)==0) ) )
      {
         addWhere(sWhereString, "(OpeNom like ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( AV64Weboperariosds_5_dynamicfiltersenabled2 && ( GXutil.strcmp(AV65Weboperariosds_6_dynamicfiltersselector2, httpContext.getMessage( "OPENOM", "")) == 0 ) && ( AV66Weboperariosds_7_dynamicfiltersoperator2 == 0 ) && ( ! (GXutil.strcmp("", AV67Weboperariosds_8_openom2)==0) ) )
      {
         addWhere(sWhereString, "(OpeNom like '%' || ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( AV64Weboperariosds_5_dynamicfiltersenabled2 && ( GXutil.strcmp(AV65Weboperariosds_6_dynamicfiltersselector2, httpContext.getMessage( "OPENOM", "")) == 0 ) && ( AV66Weboperariosds_7_dynamicfiltersoperator2 == 1 ) && ( ! (GXutil.strcmp("", AV67Weboperariosds_8_openom2)==0) ) )
      {
         addWhere(sWhereString, "(OpeNom like ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( AV68Weboperariosds_9_dynamicfiltersenabled3 && ( GXutil.strcmp(AV69Weboperariosds_10_dynamicfiltersselector3, httpContext.getMessage( "OPENOM", "")) == 0 ) && ( AV70Weboperariosds_11_dynamicfiltersoperator3 == 0 ) && ( ! (GXutil.strcmp("", AV71Weboperariosds_12_openom3)==0) ) )
      {
         addWhere(sWhereString, "(OpeNom like '%' || ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( AV68Weboperariosds_9_dynamicfiltersenabled3 && ( GXutil.strcmp(AV69Weboperariosds_10_dynamicfiltersselector3, httpContext.getMessage( "OPENOM", "")) == 0 ) && ( AV70Weboperariosds_11_dynamicfiltersoperator3 == 1 ) && ( ! (GXutil.strcmp("", AV71Weboperariosds_12_openom3)==0) ) )
      {
         addWhere(sWhereString, "(OpeNom like ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (0==AV72Weboperariosds_13_tfopecod) )
      {
         addWhere(sWhereString, "(OpeCod >= ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (0==AV73Weboperariosds_14_tfopecod_to) )
      {
         addWhere(sWhereString, "(OpeCod <= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Weboperariosds_16_tfopenom_sel)==0) && ( ! (GXutil.strcmp("", AV74Weboperariosds_15_tfopenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(OpeNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Weboperariosds_16_tfopenom_sel)==0) )
      {
         addWhere(sWhereString, "(OpeNom = ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Weboperariosds_18_tfopenom2_sel)==0) && ( ! (GXutil.strcmp("", AV76Weboperariosds_17_tfopenom2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(OpeNom2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Weboperariosds_18_tfopenom2_sel)==0) )
      {
         addWhere(sWhereString, "(OpeNom2 = ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Weboperariosds_20_tfopeact_sel)==0) && ( ! (GXutil.strcmp("", AV78Weboperariosds_19_tfopeact)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(OpeAct) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Weboperariosds_20_tfopeact_sel)==0) )
      {
         addWhere(sWhereString, "(OpeAct = ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY OpeNom" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY OpeNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY OpeCod" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY OpeCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY OpeNom2" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY OpeNom2 DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY OpeAct" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY OpeAct DESC" ;
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
                  return conditional_P08B42(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , ((Boolean) dynConstraints[4]).booleanValue() , (String)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , (String)dynConstraints[7] , ((Boolean) dynConstraints[8]).booleanValue() , (String)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).shortValue() , ((Boolean) dynConstraints[25]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08B42", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(3);
               ((String[]) buf[5])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 3);
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
                  stmt.setVarchar(sIdx, (String)parms[18], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[19], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[20], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[21], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 30);
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
                  stmt.setString(sIdx, (String)parms[34], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 1);
               }
               return;
      }
   }

}

