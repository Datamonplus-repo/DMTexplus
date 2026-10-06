package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class recuentoinven_wcexportcsv_impl extends GXWebProcedure
{
   public recuentoinven_wcexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "RecuentoInven_WCExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("RecuentoInven_WCColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("RecuentoInven_WCColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Producto", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Codigo Proveedor", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre Proveedor", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Codigo Metodo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion Metodo", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV54Recuentoinven_wcds_1_filterfulltext = AV30FilterFullText ;
      AV55Recuentoinven_wcds_2_tfprdnum = AV34TFPrdNum ;
      AV56Recuentoinven_wcds_3_tfprdnum_sel = AV35TFPrdNum_Sel ;
      AV57Recuentoinven_wcds_4_tfprdnom = AV36TFPrdNom ;
      AV58Recuentoinven_wcds_5_tfprdnom_sel = AV37TFPrdNom_Sel ;
      AV59Recuentoinven_wcds_6_tfprvnum = AV38TFPrvNum ;
      AV60Recuentoinven_wcds_7_tfprvnum_to = AV39TFPrvNum_To ;
      AV61Recuentoinven_wcds_8_tfprvnom = AV40TFPrvNom ;
      AV62Recuentoinven_wcds_9_tfprvnom_sel = AV41TFPrvNom_Sel ;
      AV63Recuentoinven_wcds_10_tfmetcod = AV42TFMetCod ;
      AV64Recuentoinven_wcds_11_tfmetcod_to = AV43TFMetCod_To ;
      AV65Recuentoinven_wcds_12_tfmetdsc = AV44TFMetDsc ;
      AV66Recuentoinven_wcds_13_tfmetdsc_sel = AV45TFMetDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV54Recuentoinven_wcds_1_filterfulltext ,
                                           AV56Recuentoinven_wcds_3_tfprdnum_sel ,
                                           AV55Recuentoinven_wcds_2_tfprdnum ,
                                           AV58Recuentoinven_wcds_5_tfprdnom_sel ,
                                           AV57Recuentoinven_wcds_4_tfprdnom ,
                                           Integer.valueOf(AV59Recuentoinven_wcds_6_tfprvnum) ,
                                           Integer.valueOf(AV60Recuentoinven_wcds_7_tfprvnum_to) ,
                                           AV62Recuentoinven_wcds_9_tfprvnom_sel ,
                                           AV61Recuentoinven_wcds_8_tfprvnom ,
                                           Byte.valueOf(AV63Recuentoinven_wcds_10_tfmetcod) ,
                                           Byte.valueOf(AV64Recuentoinven_wcds_11_tfmetcod_to) ,
                                           AV66Recuentoinven_wcds_13_tfmetdsc_sel ,
                                           AV65Recuentoinven_wcds_12_tfmetdsc ,
                                           AV46EmprCod ,
                                           AV47PrdNumFrom ,
                                           AV48PrdNumTo ,
                                           Integer.valueOf(AV49PrvNumFrom) ,
                                           Integer.valueOf(AV50PrvNumTo) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           Integer.valueOf(A795PrvNum) ,
                                           A794PrvNom ,
                                           Byte.valueOf(A629MetCod) ,
                                           A630MetDsc ,
                                           A396EmprCod ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV54Recuentoinven_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Recuentoinven_wcds_1_filterfulltext), "%", "") ;
      lV54Recuentoinven_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Recuentoinven_wcds_1_filterfulltext), "%", "") ;
      lV54Recuentoinven_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Recuentoinven_wcds_1_filterfulltext), "%", "") ;
      lV54Recuentoinven_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Recuentoinven_wcds_1_filterfulltext), "%", "") ;
      lV54Recuentoinven_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Recuentoinven_wcds_1_filterfulltext), "%", "") ;
      lV54Recuentoinven_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Recuentoinven_wcds_1_filterfulltext), "%", "") ;
      lV55Recuentoinven_wcds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV55Recuentoinven_wcds_2_tfprdnum), 6, "%") ;
      lV57Recuentoinven_wcds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV57Recuentoinven_wcds_4_tfprdnom), 26, "%") ;
      lV61Recuentoinven_wcds_8_tfprvnom = GXutil.padr( GXutil.rtrim( AV61Recuentoinven_wcds_8_tfprvnom), 30, "%") ;
      lV65Recuentoinven_wcds_12_tfmetdsc = GXutil.padr( GXutil.rtrim( AV65Recuentoinven_wcds_12_tfmetdsc), 8, "%") ;
      /* Using cursor P09FF2 */
      pr_default.execute(0, new Object[] {lV54Recuentoinven_wcds_1_filterfulltext, lV54Recuentoinven_wcds_1_filterfulltext, lV54Recuentoinven_wcds_1_filterfulltext, lV54Recuentoinven_wcds_1_filterfulltext, lV54Recuentoinven_wcds_1_filterfulltext, lV54Recuentoinven_wcds_1_filterfulltext, lV55Recuentoinven_wcds_2_tfprdnum, AV56Recuentoinven_wcds_3_tfprdnum_sel, lV57Recuentoinven_wcds_4_tfprdnom, AV58Recuentoinven_wcds_5_tfprdnom_sel, Integer.valueOf(AV59Recuentoinven_wcds_6_tfprvnum), Integer.valueOf(AV60Recuentoinven_wcds_7_tfprvnum_to), lV61Recuentoinven_wcds_8_tfprvnom, AV62Recuentoinven_wcds_9_tfprvnom_sel, Byte.valueOf(AV63Recuentoinven_wcds_10_tfmetcod), Byte.valueOf(AV64Recuentoinven_wcds_11_tfmetcod_to), lV65Recuentoinven_wcds_12_tfmetdsc, AV66Recuentoinven_wcds_13_tfmetdsc_sel, AV46EmprCod, AV47PrdNumFrom, AV48PrdNumTo, Integer.valueOf(AV49PrvNumFrom), Integer.valueOf(AV50PrvNumTo)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P09FF2_A396EmprCod[0] ;
         A630MetDsc = P09FF2_A630MetDsc[0] ;
         n630MetDsc = P09FF2_n630MetDsc[0] ;
         A629MetCod = P09FF2_A629MetCod[0] ;
         n629MetCod = P09FF2_n629MetCod[0] ;
         A794PrvNom = P09FF2_A794PrvNom[0] ;
         n794PrvNom = P09FF2_n794PrvNom[0] ;
         A795PrvNum = P09FF2_A795PrvNum[0] ;
         A718PrdNom = P09FF2_A718PrdNom[0] ;
         A719PrdNum = P09FF2_A719PrdNum[0] ;
         A630MetDsc = P09FF2_A630MetDsc[0] ;
         n630MetDsc = P09FF2_n630MetDsc[0] ;
         A794PrvNom = P09FF2_A794PrvNom[0] ;
         n794PrvNom = P09FF2_n794PrvNom[0] ;
         AV14TextFileLine = "" ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S162 ();
         if ( returnInSub )
         {
            pr_default.close(0);
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
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A719PrdNum, ";", ","), GXv_char3) ;
            recuentoinven_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A718PrdNom, ";", ","), GXv_char3) ;
            recuentoinven_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A795PrvNum, 6, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A794PrvNom, ";", ","), GXv_char3) ;
            recuentoinven_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A629MetCod, 1, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A630MetDsc, ";", ","), GXv_char3) ;
            recuentoinven_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         /* Execute user subroutine: 'AFTERWRITELINE' */
         S172 ();
         if ( returnInSub )
         {
            pr_default.close(0);
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=RecuentoInven_WCExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdNum", "", "Producto", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdNom", "", "Descripcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrvNum", "", "Codigo Proveedor", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrvNom", "", "Nombre Proveedor", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MetCod", "", "Codigo Metodo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MetDsc", "", "Descripcion Metodo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "RecuentoInven_WCColumnsSelector", GXv_char3) ;
      recuentoinven_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("RecuentoInven_WCGridState"), "") == 0 )
      {
         AV32GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "RecuentoInven_WCGridState"), null, null);
      }
      else
      {
         AV32GridState.fromxml(AV19Session.getValue("RecuentoInven_WCGridState"), null, null);
      }
      AV28OrderedBy = AV32GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV32GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV67GXV1 = 1 ;
      while ( AV67GXV1 <= AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV67GXV1));
         if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV30FilterFullText = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV34TFPrdNum = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV35TFPrdNum_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV36TFPrdNom = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV37TFPrdNom_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNUM") == 0 )
         {
            AV38TFPrvNum = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV39TFPrvNum_To = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNOM") == 0 )
         {
            AV40TFPrvNom = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNOM_SEL") == 0 )
         {
            AV41TFPrvNom_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETCOD") == 0 )
         {
            AV42TFMetCod = (byte)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV43TFMetCod_To = (byte)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETDSC") == 0 )
         {
            AV44TFMetDsc = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETDSC_SEL") == 0 )
         {
            AV45TFMetDsc_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV67GXV1 = (int)(AV67GXV1+1) ;
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
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      A794PrvNom = "" ;
      A630MetDsc = "" ;
      AV54Recuentoinven_wcds_1_filterfulltext = "" ;
      AV30FilterFullText = "" ;
      AV55Recuentoinven_wcds_2_tfprdnum = "" ;
      AV34TFPrdNum = "" ;
      AV56Recuentoinven_wcds_3_tfprdnum_sel = "" ;
      AV35TFPrdNum_Sel = "" ;
      AV57Recuentoinven_wcds_4_tfprdnom = "" ;
      AV36TFPrdNom = "" ;
      AV58Recuentoinven_wcds_5_tfprdnom_sel = "" ;
      AV37TFPrdNom_Sel = "" ;
      AV61Recuentoinven_wcds_8_tfprvnom = "" ;
      AV40TFPrvNom = "" ;
      AV62Recuentoinven_wcds_9_tfprvnom_sel = "" ;
      AV41TFPrvNom_Sel = "" ;
      AV65Recuentoinven_wcds_12_tfmetdsc = "" ;
      AV44TFMetDsc = "" ;
      AV66Recuentoinven_wcds_13_tfmetdsc_sel = "" ;
      AV45TFMetDsc_Sel = "" ;
      scmdbuf = "" ;
      lV54Recuentoinven_wcds_1_filterfulltext = "" ;
      lV55Recuentoinven_wcds_2_tfprdnum = "" ;
      lV57Recuentoinven_wcds_4_tfprdnom = "" ;
      lV61Recuentoinven_wcds_8_tfprvnom = "" ;
      lV65Recuentoinven_wcds_12_tfmetdsc = "" ;
      AV46EmprCod = "" ;
      AV47PrdNumFrom = "" ;
      AV48PrdNumTo = "" ;
      A396EmprCod = "" ;
      P09FF2_A396EmprCod = new String[] {""} ;
      P09FF2_A630MetDsc = new String[] {""} ;
      P09FF2_n630MetDsc = new boolean[] {false} ;
      P09FF2_A629MetCod = new byte[1] ;
      P09FF2_n629MetCod = new boolean[] {false} ;
      P09FF2_A794PrvNom = new String[] {""} ;
      P09FF2_n794PrvNom = new boolean[] {false} ;
      P09FF2_A795PrvNum = new int[1] ;
      P09FF2_A718PrdNom = new String[] {""} ;
      P09FF2_A719PrdNum = new String[] {""} ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector5 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV32GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV33GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.recuentoinven_wcexportcsv__default(),
         new Object[] {
             new Object[] {
            P09FF2_A396EmprCod, P09FF2_A630MetDsc, P09FF2_n630MetDsc, P09FF2_A629MetCod, P09FF2_n629MetCod, P09FF2_A794PrvNom, P09FF2_n794PrvNom, P09FF2_A795PrvNum, P09FF2_A718PrdNom, P09FF2_A719PrdNum
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A629MetCod ;
   private byte AV63Recuentoinven_wcds_10_tfmetcod ;
   private byte AV42TFMetCod ;
   private byte AV64Recuentoinven_wcds_11_tfmetcod_to ;
   private byte AV43TFMetCod_To ;
   private short gxcookieaux ;
   private short AV28OrderedBy ;
   private short Gx_err ;
   private int AV13Random ;
   private int A795PrvNum ;
   private int AV59Recuentoinven_wcds_6_tfprvnum ;
   private int AV38TFPrvNum ;
   private int AV60Recuentoinven_wcds_7_tfprvnum_to ;
   private int AV39TFPrvNum_To ;
   private int AV49PrvNumFrom ;
   private int AV50PrvNumTo ;
   private int AV67GXV1 ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String A794PrvNom ;
   private String A630MetDsc ;
   private String AV55Recuentoinven_wcds_2_tfprdnum ;
   private String AV34TFPrdNum ;
   private String AV56Recuentoinven_wcds_3_tfprdnum_sel ;
   private String AV35TFPrdNum_Sel ;
   private String AV57Recuentoinven_wcds_4_tfprdnom ;
   private String AV36TFPrdNom ;
   private String AV58Recuentoinven_wcds_5_tfprdnom_sel ;
   private String AV37TFPrdNom_Sel ;
   private String AV61Recuentoinven_wcds_8_tfprvnom ;
   private String AV40TFPrvNom ;
   private String AV62Recuentoinven_wcds_9_tfprvnom_sel ;
   private String AV41TFPrvNom_Sel ;
   private String AV65Recuentoinven_wcds_12_tfmetdsc ;
   private String AV44TFMetDsc ;
   private String AV66Recuentoinven_wcds_13_tfmetdsc_sel ;
   private String AV45TFMetDsc_Sel ;
   private String scmdbuf ;
   private String lV55Recuentoinven_wcds_2_tfprdnum ;
   private String lV57Recuentoinven_wcds_4_tfprdnom ;
   private String lV61Recuentoinven_wcds_8_tfprvnom ;
   private String lV65Recuentoinven_wcds_12_tfmetdsc ;
   private String AV46EmprCod ;
   private String AV47PrdNumFrom ;
   private String AV48PrdNumTo ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean n630MetDsc ;
   private boolean n629MetCod ;
   private boolean n794PrvNom ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV54Recuentoinven_wcds_1_filterfulltext ;
   private String AV30FilterFullText ;
   private String lV54Recuentoinven_wcds_1_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private String[] P09FF2_A396EmprCod ;
   private String[] P09FF2_A630MetDsc ;
   private boolean[] P09FF2_n630MetDsc ;
   private byte[] P09FF2_A629MetCod ;
   private boolean[] P09FF2_n629MetCod ;
   private String[] P09FF2_A794PrvNom ;
   private boolean[] P09FF2_n794PrvNom ;
   private int[] P09FF2_A795PrvNum ;
   private String[] P09FF2_A718PrdNom ;
   private String[] P09FF2_A719PrdNum ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV32GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV33GridStateFilterValue ;
}

final  class recuentoinven_wcexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09FF2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV54Recuentoinven_wcds_1_filterfulltext ,
                                          String AV56Recuentoinven_wcds_3_tfprdnum_sel ,
                                          String AV55Recuentoinven_wcds_2_tfprdnum ,
                                          String AV58Recuentoinven_wcds_5_tfprdnom_sel ,
                                          String AV57Recuentoinven_wcds_4_tfprdnom ,
                                          int AV59Recuentoinven_wcds_6_tfprvnum ,
                                          int AV60Recuentoinven_wcds_7_tfprvnum_to ,
                                          String AV62Recuentoinven_wcds_9_tfprvnom_sel ,
                                          String AV61Recuentoinven_wcds_8_tfprvnom ,
                                          byte AV63Recuentoinven_wcds_10_tfmetcod ,
                                          byte AV64Recuentoinven_wcds_11_tfmetcod_to ,
                                          String AV66Recuentoinven_wcds_13_tfmetdsc_sel ,
                                          String AV65Recuentoinven_wcds_12_tfmetdsc ,
                                          String AV46EmprCod ,
                                          String AV47PrdNumFrom ,
                                          String AV48PrdNumTo ,
                                          int AV49PrvNumFrom ,
                                          int AV50PrvNumTo ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          int A795PrvNum ,
                                          String A794PrvNom ,
                                          byte A629MetCod ,
                                          String A630MetDsc ,
                                          String A396EmprCod ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[23];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T2.MetDsc, T1.MetCod, T3.PrvNom, T1.PrvNum, T1.PrdNom, T1.PrdNum FROM ((TXPPRODUC T1 LEFT JOIN TXPMETPED T2 ON T2.EmprCod = T1.EmprCod AND T2.MetCod" ;
      scmdbuf += " = T1.MetCod) INNER JOIN TXPPRVGEN T3 ON T3.EmprCod = T1.EmprCod AND T3.PrvNum = T1.PrvNum)" ;
      if ( ! (GXutil.strcmp("", AV54Recuentoinven_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T1.PrdNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrvNum,'999990'), 2) like '%' || ?) or ( UPPER(T3.PrvNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.MetCod,'90'), 2) like '%' || ?) or ( UPPER(T2.MetDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
         GXv_int6[1] = (byte)(1) ;
         GXv_int6[2] = (byte)(1) ;
         GXv_int6[3] = (byte)(1) ;
         GXv_int6[4] = (byte)(1) ;
         GXv_int6[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV56Recuentoinven_wcds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV55Recuentoinven_wcds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Recuentoinven_wcds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV58Recuentoinven_wcds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV57Recuentoinven_wcds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Recuentoinven_wcds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom = ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (0==AV59Recuentoinven_wcds_6_tfprvnum) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (0==AV60Recuentoinven_wcds_7_tfprvnum_to) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Recuentoinven_wcds_9_tfprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV61Recuentoinven_wcds_8_tfprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Recuentoinven_wcds_9_tfprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.PrvNom = ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (0==AV63Recuentoinven_wcds_10_tfmetcod) )
      {
         addWhere(sWhereString, "(T1.MetCod >= ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (0==AV64Recuentoinven_wcds_11_tfmetcod_to) )
      {
         addWhere(sWhereString, "(T1.MetCod <= ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Recuentoinven_wcds_13_tfmetdsc_sel)==0) && ( ! (GXutil.strcmp("", AV65Recuentoinven_wcds_12_tfmetdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MetDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Recuentoinven_wcds_13_tfmetdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MetDsc = ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV46EmprCod)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV47PrdNumFrom)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum >= ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV48PrdNumTo)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum <= ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (0==AV49PrvNumFrom) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (0==AV50PrvNumTo) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNom" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNum" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNum DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvNum" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvNum DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.PrvNom" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.PrvNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MetCod" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MetCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.MetDsc" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.MetDsc DESC" ;
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
                  return conditional_P09FF2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).byteValue() , ((Number) dynConstraints[10]).byteValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Boolean) dynConstraints[26]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09FF2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(5);
               ((String[]) buf[8])[0] = rslt.getString(6, 26);
               ((String[]) buf[9])[0] = rslt.getString(7, 6);
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
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[24], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[25], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[37]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[38]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 8);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 8);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 3);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 6);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 6);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               return;
      }
   }

}

