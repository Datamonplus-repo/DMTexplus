package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ttrmwwexportcsv_impl extends GXWebProcedure
{
   public ttrmwwexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "TTRMWWExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("FicherosBasicos.TTRMWWColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("FicherosBasicos.TTRMWWColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Divisa", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "$ compra", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "$ venta", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Registración", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV49Ficherosbasicos_ttrmwwds_1_filterfulltext = AV30FilterFullText ;
      AV50Ficherosbasicos_ttrmwwds_2_tftrmdivid = AV34TFTRMDivID ;
      AV51Ficherosbasicos_ttrmwwds_3_tftrmdivid_to = AV35TFTRMDivID_To ;
      AV52Ficherosbasicos_ttrmwwds_4_tftrmdivnom = AV36TFTRMDivNom ;
      AV53Ficherosbasicos_ttrmwwds_5_tftrmdivnom_sel = AV37TFTRMDivNom_Sel ;
      AV54Ficherosbasicos_ttrmwwds_6_tftrmfecha = AV38TFTRMFecha ;
      AV55Ficherosbasicos_ttrmwwds_7_tftrmcompra = AV40TFTRMCompra ;
      AV56Ficherosbasicos_ttrmwwds_8_tftrmcompra_to = AV41TFTRMCompra_To ;
      AV57Ficherosbasicos_ttrmwwds_9_tftrmventa = AV42TFTRMVenta ;
      AV58Ficherosbasicos_ttrmwwds_10_tftrmventa_to = AV43TFTRMVenta_To ;
      AV59Ficherosbasicos_ttrmwwds_11_tftrmautman_sels = AV45TFTRMAutMan_Sels ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A14110TRMAutMan ,
                                           AV59Ficherosbasicos_ttrmwwds_11_tftrmautman_sels ,
                                           Byte.valueOf(AV50Ficherosbasicos_ttrmwwds_2_tftrmdivid) ,
                                           Byte.valueOf(AV51Ficherosbasicos_ttrmwwds_3_tftrmdivid_to) ,
                                           AV53Ficherosbasicos_ttrmwwds_5_tftrmdivnom_sel ,
                                           AV52Ficherosbasicos_ttrmwwds_4_tftrmdivnom ,
                                           AV54Ficherosbasicos_ttrmwwds_6_tftrmfecha ,
                                           AV55Ficherosbasicos_ttrmwwds_7_tftrmcompra ,
                                           AV56Ficherosbasicos_ttrmwwds_8_tftrmcompra_to ,
                                           AV57Ficherosbasicos_ttrmwwds_9_tftrmventa ,
                                           AV58Ficherosbasicos_ttrmwwds_10_tftrmventa_to ,
                                           Integer.valueOf(AV59Ficherosbasicos_ttrmwwds_11_tftrmautman_sels.size()) ,
                                           Byte.valueOf(A14105TRMDivID) ,
                                           A14107TRMDivNom ,
                                           A14106TRMFecha ,
                                           A14108TRMCompra ,
                                           A14109TRMVenta ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) ,
                                           AV49Ficherosbasicos_ttrmwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV52Ficherosbasicos_ttrmwwds_4_tftrmdivnom = GXutil.padr( GXutil.rtrim( AV52Ficherosbasicos_ttrmwwds_4_tftrmdivnom), 30, "%") ;
      /* Using cursor P09QM2 */
      pr_default.execute(0, new Object[] {Byte.valueOf(AV50Ficherosbasicos_ttrmwwds_2_tftrmdivid), Byte.valueOf(AV51Ficherosbasicos_ttrmwwds_3_tftrmdivid_to), lV52Ficherosbasicos_ttrmwwds_4_tftrmdivnom, AV53Ficherosbasicos_ttrmwwds_5_tftrmdivnom_sel, AV54Ficherosbasicos_ttrmwwds_6_tftrmfecha, AV55Ficherosbasicos_ttrmwwds_7_tftrmcompra, AV56Ficherosbasicos_ttrmwwds_8_tftrmcompra_to, AV57Ficherosbasicos_ttrmwwds_9_tftrmventa, AV58Ficherosbasicos_ttrmwwds_10_tftrmventa_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A14109TRMVenta = P09QM2_A14109TRMVenta[0] ;
         A14108TRMCompra = P09QM2_A14108TRMCompra[0] ;
         A14106TRMFecha = P09QM2_A14106TRMFecha[0] ;
         A14107TRMDivNom = P09QM2_A14107TRMDivNom[0] ;
         n14107TRMDivNom = P09QM2_n14107TRMDivNom[0] ;
         A14105TRMDivID = P09QM2_A14105TRMDivID[0] ;
         A14110TRMAutMan = P09QM2_A14110TRMAutMan[0] ;
         A396EmprCod = P09QM2_A396EmprCod[0] ;
         A14107TRMDivNom = P09QM2_A14107TRMDivNom[0] ;
         n14107TRMDivNom = P09QM2_n14107TRMDivNom[0] ;
         if ( (GXutil.strcmp("", AV49Ficherosbasicos_ttrmwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A14105TRMDivID, 2, 0) , GXutil.padr( "%" + AV49Ficherosbasicos_ttrmwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14107TRMDivNom) , GXutil.padr( "%" + GXutil.upper( AV49Ficherosbasicos_ttrmwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A14108TRMCompra, 11, 2) , GXutil.padr( "%" + AV49Ficherosbasicos_ttrmwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A14109TRMVenta, 11, 2) , GXutil.padr( "%" + AV49Ficherosbasicos_ttrmwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "automática", ""), "") , GXutil.padr( "%" + GXutil.lower( AV49Ficherosbasicos_ttrmwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A14110TRMAutMan, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "manual", ""), "") , GXutil.padr( "%" + GXutil.lower( AV49Ficherosbasicos_ttrmwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A14110TRMAutMan, httpContext.getMessage( "M", "")) == 0 ) ) ) )
         {
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
               AV14TextFileLine += GXutil.str( A14105TRMDivID, 2, 0) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A14107TRMDivNom, ";", ","), GXv_char3) ;
               ttrmwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += localUtil.ttoc( A14106TRMFecha, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A14108TRMCompra, 11, 2) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A14109TRMVenta, 11, 2) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               if ( GXutil.strcmp(GXutil.trim( A14110TRMAutMan), "A") == 0 )
               {
                  AV14TextFileLine += httpContext.getMessage( "Automática", "") ;
               }
               else if ( GXutil.strcmp(GXutil.trim( A14110TRMAutMan), "M") == 0 )
               {
                  AV14TextFileLine += httpContext.getMessage( "Manual", "") ;
               }
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=TTRMWWExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "TRMDivID", "", "Divisa", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "TRMDivNom", "", "Nombre", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "TRMFecha", "", "Fecha", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "TRMCompra", "", "$ compra", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "TRMVenta", "", "$ venta", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "TRMAutMan", "", "Registración", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "FicherosBasicos.TTRMWWColumnsSelector", GXv_char3) ;
      ttrmwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("FicherosBasicos.TTRMWWGridState"), "") == 0 )
      {
         AV32GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FicherosBasicos.TTRMWWGridState"), null, null);
      }
      else
      {
         AV32GridState.fromxml(AV19Session.getValue("FicherosBasicos.TTRMWWGridState"), null, null);
      }
      AV28OrderedBy = AV32GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV32GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV60GXV1 = 1 ;
      while ( AV60GXV1 <= AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV60GXV1));
         if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV30FilterFullText = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRMDIVID") == 0 )
         {
            AV34TFTRMDivID = (byte)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV35TFTRMDivID_To = (byte)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRMDIVNOM") == 0 )
         {
            AV36TFTRMDivNom = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRMDIVNOM_SEL") == 0 )
         {
            AV37TFTRMDivNom_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRMFECHA") == 0 )
         {
            AV38TFTRMFecha = localUtil.ctot( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRMCOMPRA") == 0 )
         {
            AV40TFTRMCompra = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV41TFTRMCompra_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRMVENTA") == 0 )
         {
            AV42TFTRMVenta = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV43TFTRMVenta_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRMAUTMAN_SEL") == 0 )
         {
            AV44TFTRMAutMan_SelsJson = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV45TFTRMAutMan_Sels.fromJSonString(AV44TFTRMAutMan_SelsJson, null);
         }
         AV60GXV1 = (int)(AV60GXV1+1) ;
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
      A14107TRMDivNom = "" ;
      A14106TRMFecha = GXutil.resetTime( GXutil.nullDate() );
      A14108TRMCompra = DecimalUtil.ZERO ;
      A14109TRMVenta = DecimalUtil.ZERO ;
      A14110TRMAutMan = "" ;
      AV49Ficherosbasicos_ttrmwwds_1_filterfulltext = "" ;
      AV30FilterFullText = "" ;
      AV52Ficherosbasicos_ttrmwwds_4_tftrmdivnom = "" ;
      AV36TFTRMDivNom = "" ;
      AV53Ficherosbasicos_ttrmwwds_5_tftrmdivnom_sel = "" ;
      AV37TFTRMDivNom_Sel = "" ;
      AV54Ficherosbasicos_ttrmwwds_6_tftrmfecha = GXutil.resetTime( GXutil.nullDate() );
      AV38TFTRMFecha = GXutil.resetTime( GXutil.nullDate() );
      AV55Ficherosbasicos_ttrmwwds_7_tftrmcompra = DecimalUtil.ZERO ;
      AV40TFTRMCompra = DecimalUtil.ZERO ;
      AV56Ficherosbasicos_ttrmwwds_8_tftrmcompra_to = DecimalUtil.ZERO ;
      AV41TFTRMCompra_To = DecimalUtil.ZERO ;
      AV57Ficherosbasicos_ttrmwwds_9_tftrmventa = DecimalUtil.ZERO ;
      AV42TFTRMVenta = DecimalUtil.ZERO ;
      AV58Ficherosbasicos_ttrmwwds_10_tftrmventa_to = DecimalUtil.ZERO ;
      AV43TFTRMVenta_To = DecimalUtil.ZERO ;
      AV59Ficherosbasicos_ttrmwwds_11_tftrmautman_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV45TFTRMAutMan_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      scmdbuf = "" ;
      lV52Ficherosbasicos_ttrmwwds_4_tftrmdivnom = "" ;
      P09QM2_A14109TRMVenta = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09QM2_A14108TRMCompra = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09QM2_A14106TRMFecha = new java.util.Date[] {GXutil.nullDate()} ;
      P09QM2_A14107TRMDivNom = new String[] {""} ;
      P09QM2_n14107TRMDivNom = new boolean[] {false} ;
      P09QM2_A14105TRMDivID = new byte[1] ;
      P09QM2_A14110TRMAutMan = new String[] {""} ;
      P09QM2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
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
      AV44TFTRMAutMan_SelsJson = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.ttrmwwexportcsv__default(),
         new Object[] {
             new Object[] {
            P09QM2_A14109TRMVenta, P09QM2_A14108TRMCompra, P09QM2_A14106TRMFecha, P09QM2_A14107TRMDivNom, P09QM2_n14107TRMDivNom, P09QM2_A14105TRMDivID, P09QM2_A14110TRMAutMan, P09QM2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A14105TRMDivID ;
   private byte AV50Ficherosbasicos_ttrmwwds_2_tftrmdivid ;
   private byte AV34TFTRMDivID ;
   private byte AV51Ficherosbasicos_ttrmwwds_3_tftrmdivid_to ;
   private byte AV35TFTRMDivID_To ;
   private short gxcookieaux ;
   private short AV28OrderedBy ;
   private short Gx_err ;
   private int AV13Random ;
   private int AV59Ficherosbasicos_ttrmwwds_11_tftrmautman_sels_size ;
   private int AV60GXV1 ;
   private java.math.BigDecimal A14108TRMCompra ;
   private java.math.BigDecimal A14109TRMVenta ;
   private java.math.BigDecimal AV55Ficherosbasicos_ttrmwwds_7_tftrmcompra ;
   private java.math.BigDecimal AV40TFTRMCompra ;
   private java.math.BigDecimal AV56Ficherosbasicos_ttrmwwds_8_tftrmcompra_to ;
   private java.math.BigDecimal AV41TFTRMCompra_To ;
   private java.math.BigDecimal AV57Ficherosbasicos_ttrmwwds_9_tftrmventa ;
   private java.math.BigDecimal AV42TFTRMVenta ;
   private java.math.BigDecimal AV58Ficherosbasicos_ttrmwwds_10_tftrmventa_to ;
   private java.math.BigDecimal AV43TFTRMVenta_To ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A14107TRMDivNom ;
   private String A14110TRMAutMan ;
   private String AV52Ficherosbasicos_ttrmwwds_4_tftrmdivnom ;
   private String AV36TFTRMDivNom ;
   private String AV53Ficherosbasicos_ttrmwwds_5_tftrmdivnom_sel ;
   private String AV37TFTRMDivNom_Sel ;
   private String scmdbuf ;
   private String lV52Ficherosbasicos_ttrmwwds_4_tftrmdivnom ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private java.util.Date A14106TRMFecha ;
   private java.util.Date AV54Ficherosbasicos_ttrmwwds_6_tftrmfecha ;
   private java.util.Date AV38TFTRMFecha ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean n14107TRMDivNom ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV44TFTRMAutMan_SelsJson ;
   private String AV11Filename ;
   private String AV49Ficherosbasicos_ttrmwwds_1_filterfulltext ;
   private String AV30FilterFullText ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] P09QM2_A14109TRMVenta ;
   private java.math.BigDecimal[] P09QM2_A14108TRMCompra ;
   private java.util.Date[] P09QM2_A14106TRMFecha ;
   private String[] P09QM2_A14107TRMDivNom ;
   private boolean[] P09QM2_n14107TRMDivNom ;
   private byte[] P09QM2_A14105TRMDivID ;
   private String[] P09QM2_A14110TRMAutMan ;
   private String[] P09QM2_A396EmprCod ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private GXSimpleCollection<String> AV59Ficherosbasicos_ttrmwwds_11_tftrmautman_sels ;
   private GXSimpleCollection<String> AV45TFTRMAutMan_Sels ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV32GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV33GridStateFilterValue ;
}

final  class ttrmwwexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09QM2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A14110TRMAutMan ,
                                          GXSimpleCollection<String> AV59Ficherosbasicos_ttrmwwds_11_tftrmautman_sels ,
                                          byte AV50Ficherosbasicos_ttrmwwds_2_tftrmdivid ,
                                          byte AV51Ficherosbasicos_ttrmwwds_3_tftrmdivid_to ,
                                          String AV53Ficherosbasicos_ttrmwwds_5_tftrmdivnom_sel ,
                                          String AV52Ficherosbasicos_ttrmwwds_4_tftrmdivnom ,
                                          java.util.Date AV54Ficherosbasicos_ttrmwwds_6_tftrmfecha ,
                                          java.math.BigDecimal AV55Ficherosbasicos_ttrmwwds_7_tftrmcompra ,
                                          java.math.BigDecimal AV56Ficherosbasicos_ttrmwwds_8_tftrmcompra_to ,
                                          java.math.BigDecimal AV57Ficherosbasicos_ttrmwwds_9_tftrmventa ,
                                          java.math.BigDecimal AV58Ficherosbasicos_ttrmwwds_10_tftrmventa_to ,
                                          int AV59Ficherosbasicos_ttrmwwds_11_tftrmautman_sels_size ,
                                          byte A14105TRMDivID ,
                                          String A14107TRMDivNom ,
                                          java.util.Date A14106TRMFecha ,
                                          java.math.BigDecimal A14108TRMCompra ,
                                          java.math.BigDecimal A14109TRMVenta ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc ,
                                          String AV49Ficherosbasicos_ttrmwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[9];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.TRMVenta, T1.TRMCompra, T1.TRMFecha, T2.DivNom AS TRMDivNom, T1.TRMDivID AS TRMDivID, T1.TRMAutMan, T1.EmprCod FROM (TXPTRM T1 INNER JOIN TXPDIVISA T2" ;
      scmdbuf += " ON T2.DivCod = T1.TRMDivID)" ;
      if ( ! (0==AV50Ficherosbasicos_ttrmwwds_2_tftrmdivid) )
      {
         addWhere(sWhereString, "(T1.TRMDivID >= ?)");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
      }
      if ( ! (0==AV51Ficherosbasicos_ttrmwwds_3_tftrmdivid_to) )
      {
         addWhere(sWhereString, "(T1.TRMDivID <= ?)");
      }
      else
      {
         GXv_int6[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV53Ficherosbasicos_ttrmwwds_5_tftrmdivnom_sel)==0) && ( ! (GXutil.strcmp("", AV52Ficherosbasicos_ttrmwwds_4_tftrmdivnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.DivNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53Ficherosbasicos_ttrmwwds_5_tftrmdivnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.DivNom = ?)");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV54Ficherosbasicos_ttrmwwds_6_tftrmfecha) )
      {
         addWhere(sWhereString, "(T1.TRMFecha >= ?)");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV55Ficherosbasicos_ttrmwwds_7_tftrmcompra)==0) )
      {
         addWhere(sWhereString, "(T1.TRMCompra >= ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV56Ficherosbasicos_ttrmwwds_8_tftrmcompra_to)==0) )
      {
         addWhere(sWhereString, "(T1.TRMCompra <= ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV57Ficherosbasicos_ttrmwwds_9_tftrmventa)==0) )
      {
         addWhere(sWhereString, "(T1.TRMVenta >= ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV58Ficherosbasicos_ttrmwwds_10_tftrmventa_to)==0) )
      {
         addWhere(sWhereString, "(T1.TRMVenta <= ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( AV59Ficherosbasicos_ttrmwwds_11_tftrmautman_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV59Ficherosbasicos_ttrmwwds_11_tftrmautman_sels, "T1.TRMAutMan IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.TRMFecha" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.TRMFecha DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.TRMDivID" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.TRMDivID DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.DivNom" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.DivNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.TRMCompra" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.TRMCompra DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.TRMVenta" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.TRMVenta DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.TRMAutMan" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.TRMAutMan DESC" ;
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
                  return conditional_P09QM2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).byteValue() , ((Number) dynConstraints[3]).byteValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.util.Date)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).byteValue() , (String)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , ((Number) dynConstraints[17]).shortValue() , ((Boolean) dynConstraints[18]).booleanValue() , (String)dynConstraints[19] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09QM2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((String[]) buf[7])[0] = rslt.getString(7, 3);
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
                  stmt.setByte(sIdx, ((Number) parms[9]).byteValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[10]).byteValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[13], false);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[14], 2);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[15], 2);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[16], 2);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[17], 2);
               }
               return;
      }
   }

}

