package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wcseguimientoproductoexportcsv_impl extends GXWebProcedure
{
   public wcseguimientoproductoexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "WCSeguimientoProductoExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("WCSeguimientoProductoColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("WCSeguimientoProductoColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "N Pedido", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Estado Pedido", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cant Ped", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cant Ent", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha Pedido", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha Entrega Prevista", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Pendiente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Estado Linea", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV98Wcseguimientoproductods_1_filterfulltext = AV50FilterFullText ;
      AV99Wcseguimientoproductods_2_tfpedcod = AV34TFPedCod ;
      AV100Wcseguimientoproductods_3_tfpedcod_to = AV35TFPedCod_To ;
      AV101Wcseguimientoproductods_4_tfpedsit_sels = AV49TFPedSit_Sels ;
      AV102Wcseguimientoproductods_5_tfpeduni = AV36TFPedUni ;
      AV103Wcseguimientoproductods_6_tfpeduni_to = AV37TFPedUni_To ;
      AV104Wcseguimientoproductods_7_tfpedcanent = AV38TFPedCanEnt ;
      AV105Wcseguimientoproductods_8_tfpedcanent_to = AV39TFPedCanEnt_To ;
      AV106Wcseguimientoproductods_9_tfpedfec = AV40TFPedFec ;
      AV107Wcseguimientoproductods_10_tfpedfecent = AV42TFPedFecEnt ;
      AV108Wcseguimientoproductods_11_tfpedcum_sels = AV47TFPedCum_Sels ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A667PedSit ,
                                           AV101Wcseguimientoproductods_4_tfpedsit_sels ,
                                           A659PedCum ,
                                           AV108Wcseguimientoproductods_11_tfpedcum_sels ,
                                           AV98Wcseguimientoproductods_1_filterfulltext ,
                                           Integer.valueOf(AV99Wcseguimientoproductods_2_tfpedcod) ,
                                           Integer.valueOf(AV100Wcseguimientoproductods_3_tfpedcod_to) ,
                                           Integer.valueOf(AV101Wcseguimientoproductods_4_tfpedsit_sels.size()) ,
                                           AV102Wcseguimientoproductods_5_tfpeduni ,
                                           AV103Wcseguimientoproductods_6_tfpeduni_to ,
                                           AV104Wcseguimientoproductods_7_tfpedcanent ,
                                           AV105Wcseguimientoproductods_8_tfpedcanent_to ,
                                           AV106Wcseguimientoproductods_9_tfpedfec ,
                                           AV107Wcseguimientoproductods_10_tfpedfecent ,
                                           Integer.valueOf(AV108Wcseguimientoproductods_11_tfpedcum_sels.size()) ,
                                           Integer.valueOf(A658PedCod) ,
                                           A669PedUni ,
                                           A657PedCanEnt ,
                                           A661PedFec ,
                                           A662PedFecEnt ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) ,
                                           AV44Emprcod ,
                                           AV45Prdnum ,
                                           A396EmprCod ,
                                           A719PrdNum } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV98Wcseguimientoproductods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Wcseguimientoproductods_1_filterfulltext), "%", "") ;
      lV98Wcseguimientoproductods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Wcseguimientoproductods_1_filterfulltext), "%", "") ;
      lV98Wcseguimientoproductods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Wcseguimientoproductods_1_filterfulltext), "%", "") ;
      lV98Wcseguimientoproductods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Wcseguimientoproductods_1_filterfulltext), "%", "") ;
      lV98Wcseguimientoproductods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Wcseguimientoproductods_1_filterfulltext), "%", "") ;
      /* Using cursor P08PU2 */
      pr_default.execute(0, new Object[] {AV44Emprcod, AV45Prdnum, lV98Wcseguimientoproductods_1_filterfulltext, lV98Wcseguimientoproductods_1_filterfulltext, lV98Wcseguimientoproductods_1_filterfulltext, lV98Wcseguimientoproductods_1_filterfulltext, lV98Wcseguimientoproductods_1_filterfulltext, Integer.valueOf(AV99Wcseguimientoproductods_2_tfpedcod), Integer.valueOf(AV100Wcseguimientoproductods_3_tfpedcod_to), AV102Wcseguimientoproductods_5_tfpeduni, AV103Wcseguimientoproductods_6_tfpeduni_to, AV104Wcseguimientoproductods_7_tfpedcanent, AV105Wcseguimientoproductods_8_tfpedcanent_to, AV106Wcseguimientoproductods_9_tfpedfec, AV107Wcseguimientoproductods_10_tfpedfecent});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A719PrdNum = P08PU2_A719PrdNum[0] ;
         A396EmprCod = P08PU2_A396EmprCod[0] ;
         A659PedCum = P08PU2_A659PedCum[0] ;
         A662PedFecEnt = P08PU2_A662PedFecEnt[0] ;
         A661PedFec = P08PU2_A661PedFec[0] ;
         A657PedCanEnt = P08PU2_A657PedCanEnt[0] ;
         A669PedUni = P08PU2_A669PedUni[0] ;
         A667PedSit = P08PU2_A667PedSit[0] ;
         A658PedCod = P08PU2_A658PedCod[0] ;
         A662PedFecEnt = P08PU2_A662PedFecEnt[0] ;
         A661PedFec = P08PU2_A661PedFec[0] ;
         A667PedSit = P08PU2_A667PedSit[0] ;
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
            AV14TextFileLine += GXutil.str( A658PedCod, 8, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            if ( GXutil.strcmp(GXutil.trim( A667PedSit), "S") == 0 )
            {
               AV14TextFileLine += httpContext.getMessage( "Cerrado", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( A667PedSit), "N") == 0 )
            {
               AV14TextFileLine += httpContext.getMessage( "Pendiente", "") ;
            }
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A669PedUni, 9, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A657PedCanEnt, 9, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += localUtil.dtoc( A661PedFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += localUtil.dtoc( A662PedFecEnt, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV30Pendiente = (A669PedUni.subtract(A657PedCanEnt)) ;
            AV30Pendiente = ((AV30Pendiente.doubleValue()<0) ? DecimalUtil.doubleToDec(0) : AV30Pendiente) ;
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( AV30Pendiente, 9, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            if ( GXutil.strcmp(GXutil.trim( A659PedCum), "S") == 0 )
            {
               AV14TextFileLine += httpContext.getMessage( "Cerrado", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( A659PedCum), "N") == 0 )
            {
               AV14TextFileLine += httpContext.getMessage( "Pendiente", "") ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=WCSeguimientoProductoExportCSV.csv");
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
      GXv_SdtWWPColumnsSelector2[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector2, "PedCod", "", "N Pedido", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector2[0] ;
      GXv_SdtWWPColumnsSelector2[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector2, "PedSit", "", "Estado Pedido", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector2[0] ;
      GXv_SdtWWPColumnsSelector2[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector2, "PedUni", "", "Cant Ped", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector2[0] ;
      GXv_SdtWWPColumnsSelector2[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector2, "PedCanEnt", "", "Cant Ent", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector2[0] ;
      GXv_SdtWWPColumnsSelector2[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector2, "PedFec", "", "Fecha Pedido", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector2[0] ;
      GXv_SdtWWPColumnsSelector2[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector2, "PedFecEnt", "", "Fecha Entrega Prevista", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector2[0] ;
      GXv_SdtWWPColumnsSelector2[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector2, "&Pendiente", "", "Pendiente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector2[0] ;
      GXv_SdtWWPColumnsSelector2[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector2, "PedCum", "", "Estado Linea", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector2[0] ;
      GXt_char3 = AV20UserCustomValue ;
      GXv_char4[0] = GXt_char3 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WCSeguimientoProductoColumnsSelector", GXv_char4) ;
      wcseguimientoproductoexportcsv_impl.this.GXt_char3 = GXv_char4[0] ;
      AV20UserCustomValue = GXt_char3 ;
      if ( ! ( (GXutil.strcmp("", AV20UserCustomValue)==0) ) )
      {
         AV16ColumnsSelectorAux.fromxml(AV20UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector2[0] = AV16ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector5[0] = AV15ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector2, GXv_SdtWWPColumnsSelector5) ;
         AV16ColumnsSelectorAux = GXv_SdtWWPColumnsSelector2[0] ;
         AV15ColumnsSelector = GXv_SdtWWPColumnsSelector5[0] ;
      }
   }

   public void S191( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue("WCSeguimientoProductoGridState"), "") == 0 )
      {
         AV32GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCSeguimientoProductoGridState"), null, null);
      }
      else
      {
         AV32GridState.fromxml(AV19Session.getValue("WCSeguimientoProductoGridState"), null, null);
      }
      AV28OrderedBy = AV32GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV32GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV109GXV1 = 1 ;
      while ( AV109GXV1 <= AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV109GXV1));
         if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV50FilterFullText = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDCOD") == 0 )
         {
            AV34TFPedCod = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV35TFPedCod_To = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDSIT_SEL") == 0 )
         {
            AV48TFPedSit_SelsJson = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV49TFPedSit_Sels.fromJSonString(AV48TFPedSit_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDUNI") == 0 )
         {
            AV36TFPedUni = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV37TFPedUni_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDCANENT") == 0 )
         {
            AV38TFPedCanEnt = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV39TFPedCanEnt_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDFEC") == 0 )
         {
            AV40TFPedFec = localUtil.ctod( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDFECENT") == 0 )
         {
            AV42TFPedFecEnt = localUtil.ctod( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDCUM_SEL") == 0 )
         {
            AV46TFPedCum_SelsJson = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV47TFPedCum_Sels.fromJSonString(AV46TFPedCum_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV44Emprcod = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRDNUM") == 0 )
         {
            AV45Prdnum = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV109GXV1 = (int)(AV109GXV1+1) ;
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
      A667PedSit = "" ;
      A669PedUni = DecimalUtil.ZERO ;
      A657PedCanEnt = DecimalUtil.ZERO ;
      A661PedFec = GXutil.nullDate() ;
      A662PedFecEnt = GXutil.nullDate() ;
      A659PedCum = "" ;
      AV98Wcseguimientoproductods_1_filterfulltext = "" ;
      AV50FilterFullText = "" ;
      AV101Wcseguimientoproductods_4_tfpedsit_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV49TFPedSit_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV102Wcseguimientoproductods_5_tfpeduni = DecimalUtil.ZERO ;
      AV36TFPedUni = DecimalUtil.ZERO ;
      AV103Wcseguimientoproductods_6_tfpeduni_to = DecimalUtil.ZERO ;
      AV37TFPedUni_To = DecimalUtil.ZERO ;
      AV104Wcseguimientoproductods_7_tfpedcanent = DecimalUtil.ZERO ;
      AV38TFPedCanEnt = DecimalUtil.ZERO ;
      AV105Wcseguimientoproductods_8_tfpedcanent_to = DecimalUtil.ZERO ;
      AV39TFPedCanEnt_To = DecimalUtil.ZERO ;
      AV106Wcseguimientoproductods_9_tfpedfec = GXutil.nullDate() ;
      AV40TFPedFec = GXutil.nullDate() ;
      AV107Wcseguimientoproductods_10_tfpedfecent = GXutil.nullDate() ;
      AV42TFPedFecEnt = GXutil.nullDate() ;
      AV108Wcseguimientoproductods_11_tfpedcum_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV47TFPedCum_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      scmdbuf = "" ;
      lV98Wcseguimientoproductods_1_filterfulltext = "" ;
      AV44Emprcod = "" ;
      AV45Prdnum = "" ;
      A396EmprCod = "" ;
      A719PrdNum = "" ;
      P08PU2_A719PrdNum = new String[] {""} ;
      P08PU2_A396EmprCod = new String[] {""} ;
      P08PU2_A659PedCum = new String[] {""} ;
      P08PU2_A662PedFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P08PU2_A661PedFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08PU2_A657PedCanEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08PU2_A669PedUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08PU2_A667PedSit = new String[] {""} ;
      P08PU2_A658PedCod = new int[1] ;
      AV30Pendiente = DecimalUtil.ZERO ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char3 = "" ;
      GXv_char4 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector2 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector5 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV32GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV33GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV48TFPedSit_SelsJson = "" ;
      AV46TFPedCum_SelsJson = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcseguimientoproductoexportcsv__default(),
         new Object[] {
             new Object[] {
            P08PU2_A719PrdNum, P08PU2_A396EmprCod, P08PU2_A659PedCum, P08PU2_A662PedFecEnt, P08PU2_A661PedFec, P08PU2_A657PedCanEnt, P08PU2_A669PedUni, P08PU2_A667PedSit, P08PU2_A658PedCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short AV28OrderedBy ;
   private short Gx_err ;
   private int AV13Random ;
   private int A658PedCod ;
   private int AV99Wcseguimientoproductods_2_tfpedcod ;
   private int AV34TFPedCod ;
   private int AV100Wcseguimientoproductods_3_tfpedcod_to ;
   private int AV35TFPedCod_To ;
   private int AV101Wcseguimientoproductods_4_tfpedsit_sels_size ;
   private int AV108Wcseguimientoproductods_11_tfpedcum_sels_size ;
   private int AV109GXV1 ;
   private java.math.BigDecimal A669PedUni ;
   private java.math.BigDecimal A657PedCanEnt ;
   private java.math.BigDecimal AV102Wcseguimientoproductods_5_tfpeduni ;
   private java.math.BigDecimal AV36TFPedUni ;
   private java.math.BigDecimal AV103Wcseguimientoproductods_6_tfpeduni_to ;
   private java.math.BigDecimal AV37TFPedUni_To ;
   private java.math.BigDecimal AV104Wcseguimientoproductods_7_tfpedcanent ;
   private java.math.BigDecimal AV38TFPedCanEnt ;
   private java.math.BigDecimal AV105Wcseguimientoproductods_8_tfpedcanent_to ;
   private java.math.BigDecimal AV39TFPedCanEnt_To ;
   private java.math.BigDecimal AV30Pendiente ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A667PedSit ;
   private String A659PedCum ;
   private String scmdbuf ;
   private String AV44Emprcod ;
   private String AV45Prdnum ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String GXt_char3 ;
   private String GXv_char4[] ;
   private java.util.Date A661PedFec ;
   private java.util.Date A662PedFecEnt ;
   private java.util.Date AV106Wcseguimientoproductods_9_tfpedfec ;
   private java.util.Date AV40TFPedFec ;
   private java.util.Date AV107Wcseguimientoproductods_10_tfpedfecent ;
   private java.util.Date AV42TFPedFecEnt ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV48TFPedSit_SelsJson ;
   private String AV46TFPedCum_SelsJson ;
   private String AV11Filename ;
   private String AV98Wcseguimientoproductods_1_filterfulltext ;
   private String AV50FilterFullText ;
   private String lV98Wcseguimientoproductods_1_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private String[] P08PU2_A719PrdNum ;
   private String[] P08PU2_A396EmprCod ;
   private String[] P08PU2_A659PedCum ;
   private java.util.Date[] P08PU2_A662PedFecEnt ;
   private java.util.Date[] P08PU2_A661PedFec ;
   private java.math.BigDecimal[] P08PU2_A657PedCanEnt ;
   private java.math.BigDecimal[] P08PU2_A669PedUni ;
   private String[] P08PU2_A667PedSit ;
   private int[] P08PU2_A658PedCod ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private GXSimpleCollection<String> AV101Wcseguimientoproductods_4_tfpedsit_sels ;
   private GXSimpleCollection<String> AV49TFPedSit_Sels ;
   private GXSimpleCollection<String> AV108Wcseguimientoproductods_11_tfpedcum_sels ;
   private GXSimpleCollection<String> AV47TFPedCum_Sels ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector2[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV32GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV33GridStateFilterValue ;
}

final  class wcseguimientoproductoexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08PU2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A667PedSit ,
                                          GXSimpleCollection<String> AV101Wcseguimientoproductods_4_tfpedsit_sels ,
                                          String A659PedCum ,
                                          GXSimpleCollection<String> AV108Wcseguimientoproductods_11_tfpedcum_sels ,
                                          String AV98Wcseguimientoproductods_1_filterfulltext ,
                                          int AV99Wcseguimientoproductods_2_tfpedcod ,
                                          int AV100Wcseguimientoproductods_3_tfpedcod_to ,
                                          int AV101Wcseguimientoproductods_4_tfpedsit_sels_size ,
                                          java.math.BigDecimal AV102Wcseguimientoproductods_5_tfpeduni ,
                                          java.math.BigDecimal AV103Wcseguimientoproductods_6_tfpeduni_to ,
                                          java.math.BigDecimal AV104Wcseguimientoproductods_7_tfpedcanent ,
                                          java.math.BigDecimal AV105Wcseguimientoproductods_8_tfpedcanent_to ,
                                          java.util.Date AV106Wcseguimientoproductods_9_tfpedfec ,
                                          java.util.Date AV107Wcseguimientoproductods_10_tfpedfecent ,
                                          int AV108Wcseguimientoproductods_11_tfpedcum_sels_size ,
                                          int A658PedCod ,
                                          java.math.BigDecimal A669PedUni ,
                                          java.math.BigDecimal A657PedCanEnt ,
                                          java.util.Date A661PedFec ,
                                          java.util.Date A662PedFecEnt ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc ,
                                          String AV44Emprcod ,
                                          String AV45Prdnum ,
                                          String A396EmprCod ,
                                          String A719PrdNum )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[15];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.PrdNum, T1.EmprCod, T1.PedCum, T2.PedFecEnt, T2.PedFec, T1.PedCanEnt, T1.PedUni, T2.PedSit, T1.PedCod FROM (TXPLPEDID T1 INNER JOIN TXPCPEDID T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.PedCod = T1.PedCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.PrdNum = ?)");
      if ( ! (GXutil.strcmp("", AV98Wcseguimientoproductods_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.PedCod,'99999990'), 2) like '%' || ?) or ( UPPER(T2.PedSit) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PedUni,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PedCanEnt,'999990.99'), 2) like '%' || ?) or ( UPPER(T1.PedCum) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
         GXv_int6[3] = (byte)(1) ;
         GXv_int6[4] = (byte)(1) ;
         GXv_int6[5] = (byte)(1) ;
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (0==AV99Wcseguimientoproductods_2_tfpedcod) )
      {
         addWhere(sWhereString, "(T1.PedCod >= ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (0==AV100Wcseguimientoproductods_3_tfpedcod_to) )
      {
         addWhere(sWhereString, "(T1.PedCod <= ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( AV101Wcseguimientoproductods_4_tfpedsit_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV101Wcseguimientoproductods_4_tfpedsit_sels, "T2.PedSit IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV102Wcseguimientoproductods_5_tfpeduni)==0) )
      {
         addWhere(sWhereString, "(T1.PedUni >= ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV103Wcseguimientoproductods_6_tfpeduni_to)==0) )
      {
         addWhere(sWhereString, "(T1.PedUni <= ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV104Wcseguimientoproductods_7_tfpedcanent)==0) )
      {
         addWhere(sWhereString, "(T1.PedCanEnt >= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV105Wcseguimientoproductods_8_tfpedcanent_to)==0) )
      {
         addWhere(sWhereString, "(T1.PedCanEnt <= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV106Wcseguimientoproductods_9_tfpedfec)) )
      {
         addWhere(sWhereString, "(T2.PedFec >= ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV107Wcseguimientoproductods_10_tfpedfecent)) )
      {
         addWhere(sWhereString, "(T2.PedFecEnt >= ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( AV108Wcseguimientoproductods_11_tfpedcum_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV108Wcseguimientoproductods_11_tfpedcum_sels, "T1.PedCum IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PedUni" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PedUni DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.PedFec" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.PedFec DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PedCod" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PedCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.PedSit" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.PedSit DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PedCanEnt" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PedCanEnt DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.PedFecEnt" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.PedFecEnt DESC" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PedCum" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PedCum DESC" ;
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
                  return conditional_P08PU2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.util.Date)dynConstraints[12] , (java.util.Date)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.util.Date)dynConstraints[18] , (java.util.Date)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , ((Boolean) dynConstraints[21]).booleanValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08PU2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((int[]) buf[8])[0] = rslt.getInt(9);
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
                  stmt.setString(sIdx, (String)parms[15], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[17], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[18], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[19], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[20], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[21], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[22]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[24], 2);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[25], 2);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[26], 2);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[27], 2);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[28]);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[29]);
               }
               return;
      }
   }

}

