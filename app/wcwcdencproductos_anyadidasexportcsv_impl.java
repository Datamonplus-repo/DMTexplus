package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wcwcdencproductos_anyadidasexportcsv_impl extends GXWebProcedure
{
   public wcwcdencproductos_anyadidasexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "WCWcdencproductos_AnyadidasExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("WCWcdencproductos_AnyadidasColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("WCWcdencproductos_AnyadidasColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "N Hdr", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Producto", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Lote", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV52Wcwcdencproductos_anyadidasds_1_filterfulltext = AV30FilterFullText ;
      AV53Wcwcdencproductos_anyadidasds_2_tfprdnum = AV43TFPrdNum ;
      AV54Wcwcdencproductos_anyadidasds_3_tfprdnum_sel = AV44TFPrdNum_Sel ;
      AV55Wcwcdencproductos_anyadidasds_4_tfhrdprddsc = AV45TFHrdPrdDsc ;
      AV56Wcwcdencproductos_anyadidasds_5_tfhrdprddsc_sel = AV46TFHrdPrdDsc_Sel ;
      AV57Wcwcdencproductos_anyadidasds_6_tfhrelanylot = AV47TFHreLanyLot ;
      AV58Wcwcdencproductos_anyadidasds_7_tfhrelanylot_sel = AV48TFHreLanyLot_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV52Wcwcdencproductos_anyadidasds_1_filterfulltext ,
                                           AV54Wcwcdencproductos_anyadidasds_3_tfprdnum_sel ,
                                           AV53Wcwcdencproductos_anyadidasds_2_tfprdnum ,
                                           AV56Wcwcdencproductos_anyadidasds_5_tfhrdprddsc_sel ,
                                           AV55Wcwcdencproductos_anyadidasds_4_tfhrdprddsc ,
                                           AV58Wcwcdencproductos_anyadidasds_7_tfhrelanylot_sel ,
                                           AV57Wcwcdencproductos_anyadidasds_6_tfhrelanylot ,
                                           A719PrdNum ,
                                           A4510HrdPrdDsc ,
                                           A5808HreLanyLot ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) ,
                                           Short.valueOf(AV40Tb1_cod) ,
                                           A4529HreFecTin ,
                                           AV41HreFecTin ,
                                           AV42HreFecTin_to ,
                                           Short.valueOf(A12535HreCencId) ,
                                           AV39Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV52Wcwcdencproductos_anyadidasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Wcwcdencproductos_anyadidasds_1_filterfulltext), "%", "") ;
      lV52Wcwcdencproductos_anyadidasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Wcwcdencproductos_anyadidasds_1_filterfulltext), "%", "") ;
      lV52Wcwcdencproductos_anyadidasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Wcwcdencproductos_anyadidasds_1_filterfulltext), "%", "") ;
      lV53Wcwcdencproductos_anyadidasds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV53Wcwcdencproductos_anyadidasds_2_tfprdnum), 6, "%") ;
      lV55Wcwcdencproductos_anyadidasds_4_tfhrdprddsc = GXutil.padr( GXutil.rtrim( AV55Wcwcdencproductos_anyadidasds_4_tfhrdprddsc), 26, "%") ;
      lV57Wcwcdencproductos_anyadidasds_6_tfhrelanylot = GXutil.padr( GXutil.rtrim( AV57Wcwcdencproductos_anyadidasds_6_tfhrelanylot), 26, "%") ;
      /* Using cursor P095K2 */
      pr_default.execute(0, new Object[] {AV39Emprcod, Short.valueOf(AV40Tb1_cod), AV41HreFecTin, AV42HreFecTin_to, Short.valueOf(AV40Tb1_cod), lV52Wcwcdencproductos_anyadidasds_1_filterfulltext, lV52Wcwcdencproductos_anyadidasds_1_filterfulltext, lV52Wcwcdencproductos_anyadidasds_1_filterfulltext, lV53Wcwcdencproductos_anyadidasds_2_tfprdnum, AV54Wcwcdencproductos_anyadidasds_3_tfprdnum_sel, lV55Wcwcdencproductos_anyadidasds_4_tfhrdprddsc, AV56Wcwcdencproductos_anyadidasds_5_tfhrdprddsc_sel, lV57Wcwcdencproductos_anyadidasds_6_tfhrelanylot, AV58Wcwcdencproductos_anyadidasds_7_tfhrelanylot_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4495HreNumCie = P095K2_A4495HreNumCie[0] ;
         A4529HreFecTin = P095K2_A4529HreFecTin[0] ;
         n4529HreFecTin = P095K2_n4529HreFecTin[0] ;
         A12535HreCencId = P095K2_A12535HreCencId[0] ;
         n12535HreCencId = P095K2_n12535HreCencId[0] ;
         A396EmprCod = P095K2_A396EmprCod[0] ;
         A5808HreLanyLot = P095K2_A5808HreLanyLot[0] ;
         n5808HreLanyLot = P095K2_n5808HreLanyLot[0] ;
         A4510HrdPrdDsc = P095K2_A4510HrdPrdDsc[0] ;
         n4510HrdPrdDsc = P095K2_n4510HrdPrdDsc[0] ;
         A719PrdNum = P095K2_A719PrdNum[0] ;
         A4494HreBarPar = P095K2_A4494HreBarPar[0] ;
         A4493HreBarReo = P095K2_A4493HreBarReo[0] ;
         A4492HreBarCod = P095K2_A4492HreBarCod[0] ;
         A4508HreLinMAL = P095K2_A4508HreLinMAL[0] ;
         A4509HreNumAny = P095K2_A4509HreNumAny[0] ;
         A4529HreFecTin = P095K2_A4529HreFecTin[0] ;
         n4529HreFecTin = P095K2_n4529HreFecTin[0] ;
         A12535HreCencId = P095K2_A12535HreCencId[0] ;
         n12535HreCencId = P095K2_n12535HreCencId[0] ;
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
            AV31BarNHdr = GXutil.str( A4492HreBarCod, 8, 0) + "-" + GXutil.str( A4493HreBarReo, 1, 0) + A4494HreBarPar ;
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV31BarNHdr, ";", ","), GXv_char3) ;
            wcwcdencproductos_anyadidasexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A719PrdNum, ";", ","), GXv_char3) ;
            wcwcdencproductos_anyadidasexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A4510HrdPrdDsc, ";", ","), GXv_char3) ;
            wcwcdencproductos_anyadidasexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A5808HreLanyLot, ";", ","), GXv_char3) ;
            wcwcdencproductos_anyadidasexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=WCWcdencproductos_AnyadidasExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&BarNHdr", "", "N Hdr", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdNum", "", "Producto", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "HrdPrdDsc", "", "Descripcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "HreLanyLot", "", "Lote", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WCWcdencproductos_AnyadidasColumnsSelector", GXv_char3) ;
      wcwcdencproductos_anyadidasexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("WCWcdencproductos_AnyadidasGridState"), "") == 0 )
      {
         AV33GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCWcdencproductos_AnyadidasGridState"), null, null);
      }
      else
      {
         AV33GridState.fromxml(AV19Session.getValue("WCWcdencproductos_AnyadidasGridState"), null, null);
      }
      AV28OrderedBy = AV33GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV33GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV59GXV1 = 1 ;
      while ( AV59GXV1 <= AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV34GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV59GXV1));
         if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV30FilterFullText = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV43TFPrdNum = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV44TFPrdNum_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRDPRDDSC") == 0 )
         {
            AV45TFHrdPrdDsc = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRDPRDDSC_SEL") == 0 )
         {
            AV46TFHrdPrdDsc_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRELANYLOT") == 0 )
         {
            AV47TFHreLanyLot = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRELANYLOT_SEL") == 0 )
         {
            AV48TFHreLanyLot_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV39Emprcod = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&TB1_COD") == 0 )
         {
            AV40Tb1_cod = (short)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HREFECTIN") == 0 )
         {
            AV41HreFecTin = localUtil.ctod( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HREFECTIN_TO") == 0 )
         {
            AV42HreFecTin_to = localUtil.ctod( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         AV59GXV1 = (int)(AV59GXV1+1) ;
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
      A4494HreBarPar = "" ;
      A719PrdNum = "" ;
      A4510HrdPrdDsc = "" ;
      A5808HreLanyLot = "" ;
      AV52Wcwcdencproductos_anyadidasds_1_filterfulltext = "" ;
      AV30FilterFullText = "" ;
      AV53Wcwcdencproductos_anyadidasds_2_tfprdnum = "" ;
      AV43TFPrdNum = "" ;
      AV54Wcwcdencproductos_anyadidasds_3_tfprdnum_sel = "" ;
      AV44TFPrdNum_Sel = "" ;
      AV55Wcwcdencproductos_anyadidasds_4_tfhrdprddsc = "" ;
      AV45TFHrdPrdDsc = "" ;
      AV56Wcwcdencproductos_anyadidasds_5_tfhrdprddsc_sel = "" ;
      AV46TFHrdPrdDsc_Sel = "" ;
      AV57Wcwcdencproductos_anyadidasds_6_tfhrelanylot = "" ;
      AV47TFHreLanyLot = "" ;
      AV58Wcwcdencproductos_anyadidasds_7_tfhrelanylot_sel = "" ;
      AV48TFHreLanyLot_Sel = "" ;
      scmdbuf = "" ;
      lV52Wcwcdencproductos_anyadidasds_1_filterfulltext = "" ;
      lV53Wcwcdencproductos_anyadidasds_2_tfprdnum = "" ;
      lV55Wcwcdencproductos_anyadidasds_4_tfhrdprddsc = "" ;
      lV57Wcwcdencproductos_anyadidasds_6_tfhrelanylot = "" ;
      A4529HreFecTin = GXutil.nullDate() ;
      AV41HreFecTin = GXutil.nullDate() ;
      AV42HreFecTin_to = GXutil.nullDate() ;
      AV39Emprcod = "" ;
      A396EmprCod = "" ;
      P095K2_A4495HreNumCie = new byte[1] ;
      P095K2_A4529HreFecTin = new java.util.Date[] {GXutil.nullDate()} ;
      P095K2_n4529HreFecTin = new boolean[] {false} ;
      P095K2_A12535HreCencId = new short[1] ;
      P095K2_n12535HreCencId = new boolean[] {false} ;
      P095K2_A396EmprCod = new String[] {""} ;
      P095K2_A5808HreLanyLot = new String[] {""} ;
      P095K2_n5808HreLanyLot = new boolean[] {false} ;
      P095K2_A4510HrdPrdDsc = new String[] {""} ;
      P095K2_n4510HrdPrdDsc = new boolean[] {false} ;
      P095K2_A719PrdNum = new String[] {""} ;
      P095K2_A4494HreBarPar = new String[] {""} ;
      P095K2_A4493HreBarReo = new byte[1] ;
      P095K2_A4492HreBarCod = new int[1] ;
      P095K2_A4508HreLinMAL = new short[1] ;
      P095K2_A4509HreNumAny = new byte[1] ;
      AV31BarNHdr = "" ;
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
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcwcdencproductos_anyadidasexportcsv__default(),
         new Object[] {
             new Object[] {
            P095K2_A4495HreNumCie, P095K2_A4529HreFecTin, P095K2_n4529HreFecTin, P095K2_A12535HreCencId, P095K2_n12535HreCencId, P095K2_A396EmprCod, P095K2_A5808HreLanyLot, P095K2_n5808HreLanyLot, P095K2_A4510HrdPrdDsc, P095K2_n4510HrdPrdDsc,
            P095K2_A719PrdNum, P095K2_A4494HreBarPar, P095K2_A4493HreBarReo, P095K2_A4492HreBarCod, P095K2_A4508HreLinMAL, P095K2_A4509HreNumAny
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A4493HreBarReo ;
   private byte A4495HreNumCie ;
   private byte A4509HreNumAny ;
   private short gxcookieaux ;
   private short AV28OrderedBy ;
   private short AV40Tb1_cod ;
   private short A12535HreCencId ;
   private short A4508HreLinMAL ;
   private short Gx_err ;
   private int AV13Random ;
   private int A4492HreBarCod ;
   private int AV59GXV1 ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A4494HreBarPar ;
   private String A719PrdNum ;
   private String A4510HrdPrdDsc ;
   private String A5808HreLanyLot ;
   private String AV53Wcwcdencproductos_anyadidasds_2_tfprdnum ;
   private String AV43TFPrdNum ;
   private String AV54Wcwcdencproductos_anyadidasds_3_tfprdnum_sel ;
   private String AV44TFPrdNum_Sel ;
   private String AV55Wcwcdencproductos_anyadidasds_4_tfhrdprddsc ;
   private String AV45TFHrdPrdDsc ;
   private String AV56Wcwcdencproductos_anyadidasds_5_tfhrdprddsc_sel ;
   private String AV46TFHrdPrdDsc_Sel ;
   private String AV57Wcwcdencproductos_anyadidasds_6_tfhrelanylot ;
   private String AV47TFHreLanyLot ;
   private String AV58Wcwcdencproductos_anyadidasds_7_tfhrelanylot_sel ;
   private String AV48TFHreLanyLot_Sel ;
   private String scmdbuf ;
   private String lV53Wcwcdencproductos_anyadidasds_2_tfprdnum ;
   private String lV55Wcwcdencproductos_anyadidasds_4_tfhrdprddsc ;
   private String lV57Wcwcdencproductos_anyadidasds_6_tfhrelanylot ;
   private String AV39Emprcod ;
   private String A396EmprCod ;
   private String AV31BarNHdr ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private java.util.Date A4529HreFecTin ;
   private java.util.Date AV41HreFecTin ;
   private java.util.Date AV42HreFecTin_to ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean n4529HreFecTin ;
   private boolean n12535HreCencId ;
   private boolean n5808HreLanyLot ;
   private boolean n4510HrdPrdDsc ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV52Wcwcdencproductos_anyadidasds_1_filterfulltext ;
   private String AV30FilterFullText ;
   private String lV52Wcwcdencproductos_anyadidasds_1_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private byte[] P095K2_A4495HreNumCie ;
   private java.util.Date[] P095K2_A4529HreFecTin ;
   private boolean[] P095K2_n4529HreFecTin ;
   private short[] P095K2_A12535HreCencId ;
   private boolean[] P095K2_n12535HreCencId ;
   private String[] P095K2_A396EmprCod ;
   private String[] P095K2_A5808HreLanyLot ;
   private boolean[] P095K2_n5808HreLanyLot ;
   private String[] P095K2_A4510HrdPrdDsc ;
   private boolean[] P095K2_n4510HrdPrdDsc ;
   private String[] P095K2_A719PrdNum ;
   private String[] P095K2_A4494HreBarPar ;
   private byte[] P095K2_A4493HreBarReo ;
   private int[] P095K2_A4492HreBarCod ;
   private short[] P095K2_A4508HreLinMAL ;
   private byte[] P095K2_A4509HreNumAny ;
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

final  class wcwcdencproductos_anyadidasexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P095K2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV52Wcwcdencproductos_anyadidasds_1_filterfulltext ,
                                          String AV54Wcwcdencproductos_anyadidasds_3_tfprdnum_sel ,
                                          String AV53Wcwcdencproductos_anyadidasds_2_tfprdnum ,
                                          String AV56Wcwcdencproductos_anyadidasds_5_tfhrdprddsc_sel ,
                                          String AV55Wcwcdencproductos_anyadidasds_4_tfhrdprddsc ,
                                          String AV58Wcwcdencproductos_anyadidasds_7_tfhrelanylot_sel ,
                                          String AV57Wcwcdencproductos_anyadidasds_6_tfhrelanylot ,
                                          String A719PrdNum ,
                                          String A4510HrdPrdDsc ,
                                          String A5808HreLanyLot ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc ,
                                          short AV40Tb1_cod ,
                                          java.util.Date A4529HreFecTin ,
                                          java.util.Date AV41HreFecTin ,
                                          java.util.Date AV42HreFecTin_to ,
                                          short A12535HreCencId ,
                                          String AV39Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[14];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.HreNumCie, T2.HreFecTin, T2.HreCencId, T1.EmprCod, T1.HreLanyLot, T1.HrdPrdDsc, T1.PrdNum, T1.HreBarPar, T1.HreBarReo, T1.HreBarCod, T1.HreLinMAL, T1.HreNumAny" ;
      scmdbuf += " FROM (TXPHISREA T1 INNER JOIN TXPHISREH T2 ON T2.EmprCod = T1.EmprCod AND T2.HreBarCod = T1.HreBarCod AND T2.HreBarReo = T1.HreBarReo AND T2.HreBarPar = T1.HreBarPar" ;
      scmdbuf += " AND T2.HreNumCie = T1.HreNumCie)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(Not (? = 0))");
      addWhere(sWhereString, "(T2.HreFecTin >= ?)");
      addWhere(sWhereString, "(T2.HreFecTin <= ?)");
      addWhere(sWhereString, "(T1.PrdNum >= '100000')");
      addWhere(sWhereString, "(T1.PrdNum <= '999999')");
      addWhere(sWhereString, "(T2.HreCencId = ?)");
      if ( ! (GXutil.strcmp("", AV52Wcwcdencproductos_anyadidasds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T1.HrdPrdDsc) like '%' || UPPER(?)) or ( UPPER(T1.HreLanyLot) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
         GXv_int6[6] = (byte)(1) ;
         GXv_int6[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV54Wcwcdencproductos_anyadidasds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV53Wcwcdencproductos_anyadidasds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54Wcwcdencproductos_anyadidasds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV56Wcwcdencproductos_anyadidasds_5_tfhrdprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV55Wcwcdencproductos_anyadidasds_4_tfhrdprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HrdPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Wcwcdencproductos_anyadidasds_5_tfhrdprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HrdPrdDsc = ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV58Wcwcdencproductos_anyadidasds_7_tfhrelanylot_sel)==0) && ( ! (GXutil.strcmp("", AV57Wcwcdencproductos_anyadidasds_6_tfhrelanylot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HreLanyLot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Wcwcdencproductos_anyadidasds_7_tfhrelanylot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HreLanyLot = ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HrdPrdDsc" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HrdPrdDsc DESC" ;
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
         scmdbuf += " ORDER BY T1.HreLanyLot" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HreLanyLot DESC" ;
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
                  return conditional_P095K2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , ((Boolean) dynConstraints[11]).booleanValue() , ((Number) dynConstraints[12]).shortValue() , (java.util.Date)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (java.util.Date)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , (String)dynConstraints[17] , (String)dynConstraints[18] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P095K2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((String[]) buf[6])[0] = rslt.getString(5, 26);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 26);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 6);
               ((String[]) buf[11])[0] = rslt.getString(8, 1);
               ((byte[]) buf[12])[0] = rslt.getByte(9);
               ((int[]) buf[13])[0] = rslt.getInt(10);
               ((short[]) buf[14])[0] = rslt.getShort(11);
               ((byte[]) buf[15])[0] = rslt.getByte(12);
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
                  stmt.setString(sIdx, (String)parms[14], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[15]).shortValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[16]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[17]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[18]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[19], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[20], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[21], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 26);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 26);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 26);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 26);
               }
               return;
      }
   }

}

