package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wc_tminvstexportcsv_impl extends GXWebProcedure
{
   public wc_tminvstexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "WC_TMInvStExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("MantenimientoMaquina.WC_TMInvStColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("MantenimientoMaquina.WC_TMInvStColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Repuesto", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Repuesto", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Stock Actual", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Stock Teorico", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Stock Real", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Diferencia de Stock", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV67Mantenimientomaquina_wc_tminvstds_1_emprcod = AV50EmprCod ;
      AV68Mantenimientomaquina_wc_tminvstds_2_miscod = AV51MISCod ;
      AV69Mantenimientomaquina_wc_tminvstds_3_filterfulltext = AV30FilterFullText ;
      AV70Mantenimientomaquina_wc_tminvstds_4_tfmisrcod = AV52TFMISRCod ;
      AV71Mantenimientomaquina_wc_tminvstds_5_tfmisrcod_to = AV53TFMISRCod_To ;
      AV72Mantenimientomaquina_wc_tminvstds_6_tfmisrnom = AV54TFMISRNom ;
      AV73Mantenimientomaquina_wc_tminvstds_7_tfmisrnom_sel = AV55TFMISRNom_Sel ;
      AV74Mantenimientomaquina_wc_tminvstds_8_tfmisrstkact = AV56TFMISRStkAct ;
      AV75Mantenimientomaquina_wc_tminvstds_9_tfmisrstkact_to = AV57TFMISRStkAct_To ;
      AV76Mantenimientomaquina_wc_tminvstds_10_tfmisrstkteo = AV58TFMISRStkTeo ;
      AV77Mantenimientomaquina_wc_tminvstds_11_tfmisrstkteo_to = AV59TFMISRStkTeo_To ;
      AV78Mantenimientomaquina_wc_tminvstds_12_tfmisrstkrea = AV60TFMISRStkRea ;
      AV79Mantenimientomaquina_wc_tminvstds_13_tfmisrstkrea_to = AV61TFMISRStkRea_To ;
      AV80Mantenimientomaquina_wc_tminvstds_14_tfmisrstkdif = AV62TFMISRStkDif ;
      AV81Mantenimientomaquina_wc_tminvstds_15_tfmisrstkdif_to = AV63TFMISRStkDif_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV69Mantenimientomaquina_wc_tminvstds_3_filterfulltext ,
                                           Integer.valueOf(AV70Mantenimientomaquina_wc_tminvstds_4_tfmisrcod) ,
                                           Integer.valueOf(AV71Mantenimientomaquina_wc_tminvstds_5_tfmisrcod_to) ,
                                           AV73Mantenimientomaquina_wc_tminvstds_7_tfmisrnom_sel ,
                                           AV72Mantenimientomaquina_wc_tminvstds_6_tfmisrnom ,
                                           AV74Mantenimientomaquina_wc_tminvstds_8_tfmisrstkact ,
                                           AV75Mantenimientomaquina_wc_tminvstds_9_tfmisrstkact_to ,
                                           AV76Mantenimientomaquina_wc_tminvstds_10_tfmisrstkteo ,
                                           AV77Mantenimientomaquina_wc_tminvstds_11_tfmisrstkteo_to ,
                                           AV78Mantenimientomaquina_wc_tminvstds_12_tfmisrstkrea ,
                                           AV79Mantenimientomaquina_wc_tminvstds_13_tfmisrstkrea_to ,
                                           AV80Mantenimientomaquina_wc_tminvstds_14_tfmisrstkdif ,
                                           AV81Mantenimientomaquina_wc_tminvstds_15_tfmisrstkdif_to ,
                                           Integer.valueOf(A9403MISRCod) ,
                                           A9404MISRNom ,
                                           A9405MISRStkAct ,
                                           A9406MISRStkTeo ,
                                           A9407MISRStkRea ,
                                           A9408MISRStkDif ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) ,
                                           AV67Mantenimientomaquina_wc_tminvstds_1_emprcod ,
                                           Integer.valueOf(AV68Mantenimientomaquina_wc_tminvstds_2_miscod) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A9398MISCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV69Mantenimientomaquina_wc_tminvstds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Mantenimientomaquina_wc_tminvstds_3_filterfulltext), "%", "") ;
      lV69Mantenimientomaquina_wc_tminvstds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Mantenimientomaquina_wc_tminvstds_3_filterfulltext), "%", "") ;
      lV69Mantenimientomaquina_wc_tminvstds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Mantenimientomaquina_wc_tminvstds_3_filterfulltext), "%", "") ;
      lV69Mantenimientomaquina_wc_tminvstds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Mantenimientomaquina_wc_tminvstds_3_filterfulltext), "%", "") ;
      lV69Mantenimientomaquina_wc_tminvstds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Mantenimientomaquina_wc_tminvstds_3_filterfulltext), "%", "") ;
      lV69Mantenimientomaquina_wc_tminvstds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Mantenimientomaquina_wc_tminvstds_3_filterfulltext), "%", "") ;
      lV72Mantenimientomaquina_wc_tminvstds_6_tfmisrnom = GXutil.padr( GXutil.rtrim( AV72Mantenimientomaquina_wc_tminvstds_6_tfmisrnom), 100, "%") ;
      /* Using cursor P08WR2 */
      pr_default.execute(0, new Object[] {AV67Mantenimientomaquina_wc_tminvstds_1_emprcod, Integer.valueOf(AV68Mantenimientomaquina_wc_tminvstds_2_miscod), lV69Mantenimientomaquina_wc_tminvstds_3_filterfulltext, lV69Mantenimientomaquina_wc_tminvstds_3_filterfulltext, lV69Mantenimientomaquina_wc_tminvstds_3_filterfulltext, lV69Mantenimientomaquina_wc_tminvstds_3_filterfulltext, lV69Mantenimientomaquina_wc_tminvstds_3_filterfulltext, lV69Mantenimientomaquina_wc_tminvstds_3_filterfulltext, Integer.valueOf(AV70Mantenimientomaquina_wc_tminvstds_4_tfmisrcod), Integer.valueOf(AV71Mantenimientomaquina_wc_tminvstds_5_tfmisrcod_to), lV72Mantenimientomaquina_wc_tminvstds_6_tfmisrnom, AV73Mantenimientomaquina_wc_tminvstds_7_tfmisrnom_sel, AV74Mantenimientomaquina_wc_tminvstds_8_tfmisrstkact, AV75Mantenimientomaquina_wc_tminvstds_9_tfmisrstkact_to, AV76Mantenimientomaquina_wc_tminvstds_10_tfmisrstkteo, AV77Mantenimientomaquina_wc_tminvstds_11_tfmisrstkteo_to, AV78Mantenimientomaquina_wc_tminvstds_12_tfmisrstkrea, AV79Mantenimientomaquina_wc_tminvstds_13_tfmisrstkrea_to, AV80Mantenimientomaquina_wc_tminvstds_14_tfmisrstkdif, AV81Mantenimientomaquina_wc_tminvstds_15_tfmisrstkdif_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A9408MISRStkDif = P08WR2_A9408MISRStkDif[0] ;
         A9407MISRStkRea = P08WR2_A9407MISRStkRea[0] ;
         A9406MISRStkTeo = P08WR2_A9406MISRStkTeo[0] ;
         A9405MISRStkAct = P08WR2_A9405MISRStkAct[0] ;
         n9405MISRStkAct = P08WR2_n9405MISRStkAct[0] ;
         A9404MISRNom = P08WR2_A9404MISRNom[0] ;
         n9404MISRNom = P08WR2_n9404MISRNom[0] ;
         A9403MISRCod = P08WR2_A9403MISRCod[0] ;
         A9398MISCod = P08WR2_A9398MISCod[0] ;
         A396EmprCod = P08WR2_A396EmprCod[0] ;
         A9399MISFch = P08WR2_A9399MISFch[0] ;
         n9399MISFch = P08WR2_n9399MISFch[0] ;
         A9399MISFch = P08WR2_A9399MISFch[0] ;
         n9399MISFch = P08WR2_n9399MISFch[0] ;
         A9405MISRStkAct = P08WR2_A9405MISRStkAct[0] ;
         n9405MISRStkAct = P08WR2_n9405MISRStkAct[0] ;
         A9404MISRNom = P08WR2_A9404MISRNom[0] ;
         n9404MISRNom = P08WR2_n9404MISRNom[0] ;
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
            AV14TextFileLine += GXutil.str( A9403MISRCod, 8, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A9404MISRNom, ";", ","), GXv_char3) ;
            wc_tminvstexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A9405MISRStkAct, 10, 3) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A9406MISRStkTeo, 12, 3) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A9407MISRStkRea, 10, 3) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A9408MISRStkDif, 10, 3) ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=WC_TMInvStExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MISRCod", "", "Repuesto", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MISRNom", "", "Repuesto", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MISRStkAct", "", "Stock Actual", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MISRStkTeo", "", "Stock Teorico", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MISRStkRea", "", "Stock Real", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MISRStkDif", "", "Diferencia de Stock", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "MantenimientoMaquina.WC_TMInvStColumnsSelector", GXv_char3) ;
      wc_tminvstexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("MantenimientoMaquina.WC_TMInvStGridState"), "") == 0 )
      {
         AV32GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "MantenimientoMaquina.WC_TMInvStGridState"), null, null);
      }
      else
      {
         AV32GridState.fromxml(AV19Session.getValue("MantenimientoMaquina.WC_TMInvStGridState"), null, null);
      }
      AV28OrderedBy = AV32GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV32GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV82GXV1 = 1 ;
      while ( AV82GXV1 <= AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV82GXV1));
         if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV30FilterFullText = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMISRCOD") == 0 )
         {
            AV52TFMISRCod = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV53TFMISRCod_To = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMISRNOM") == 0 )
         {
            AV54TFMISRNom = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMISRNOM_SEL") == 0 )
         {
            AV55TFMISRNom_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMISRSTKACT") == 0 )
         {
            AV56TFMISRStkAct = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV57TFMISRStkAct_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMISRSTKTEO") == 0 )
         {
            AV58TFMISRStkTeo = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV59TFMISRStkTeo_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMISRSTKREA") == 0 )
         {
            AV60TFMISRStkRea = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV61TFMISRStkRea_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMISRSTKDIF") == 0 )
         {
            AV62TFMISRStkDif = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV63TFMISRStkDif_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV50EmprCod = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MISCOD") == 0 )
         {
            AV51MISCod = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV82GXV1 = (int)(AV82GXV1+1) ;
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
      A9404MISRNom = "" ;
      A9405MISRStkAct = DecimalUtil.ZERO ;
      A9406MISRStkTeo = DecimalUtil.ZERO ;
      A9407MISRStkRea = DecimalUtil.ZERO ;
      A9408MISRStkDif = DecimalUtil.ZERO ;
      AV67Mantenimientomaquina_wc_tminvstds_1_emprcod = "" ;
      AV50EmprCod = "" ;
      AV69Mantenimientomaquina_wc_tminvstds_3_filterfulltext = "" ;
      AV30FilterFullText = "" ;
      AV72Mantenimientomaquina_wc_tminvstds_6_tfmisrnom = "" ;
      AV54TFMISRNom = "" ;
      AV73Mantenimientomaquina_wc_tminvstds_7_tfmisrnom_sel = "" ;
      AV55TFMISRNom_Sel = "" ;
      AV74Mantenimientomaquina_wc_tminvstds_8_tfmisrstkact = DecimalUtil.ZERO ;
      AV56TFMISRStkAct = DecimalUtil.ZERO ;
      AV75Mantenimientomaquina_wc_tminvstds_9_tfmisrstkact_to = DecimalUtil.ZERO ;
      AV57TFMISRStkAct_To = DecimalUtil.ZERO ;
      AV76Mantenimientomaquina_wc_tminvstds_10_tfmisrstkteo = DecimalUtil.ZERO ;
      AV58TFMISRStkTeo = DecimalUtil.ZERO ;
      AV77Mantenimientomaquina_wc_tminvstds_11_tfmisrstkteo_to = DecimalUtil.ZERO ;
      AV59TFMISRStkTeo_To = DecimalUtil.ZERO ;
      AV78Mantenimientomaquina_wc_tminvstds_12_tfmisrstkrea = DecimalUtil.ZERO ;
      AV60TFMISRStkRea = DecimalUtil.ZERO ;
      AV79Mantenimientomaquina_wc_tminvstds_13_tfmisrstkrea_to = DecimalUtil.ZERO ;
      AV61TFMISRStkRea_To = DecimalUtil.ZERO ;
      AV80Mantenimientomaquina_wc_tminvstds_14_tfmisrstkdif = DecimalUtil.ZERO ;
      AV62TFMISRStkDif = DecimalUtil.ZERO ;
      AV81Mantenimientomaquina_wc_tminvstds_15_tfmisrstkdif_to = DecimalUtil.ZERO ;
      AV63TFMISRStkDif_To = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV69Mantenimientomaquina_wc_tminvstds_3_filterfulltext = "" ;
      lV72Mantenimientomaquina_wc_tminvstds_6_tfmisrnom = "" ;
      A396EmprCod = "" ;
      P08WR2_A9408MISRStkDif = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08WR2_A9407MISRStkRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08WR2_A9406MISRStkTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08WR2_A9405MISRStkAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08WR2_n9405MISRStkAct = new boolean[] {false} ;
      P08WR2_A9404MISRNom = new String[] {""} ;
      P08WR2_n9404MISRNom = new boolean[] {false} ;
      P08WR2_A9403MISRCod = new int[1] ;
      P08WR2_A9398MISCod = new int[1] ;
      P08WR2_A396EmprCod = new String[] {""} ;
      P08WR2_A9399MISFch = new java.util.Date[] {GXutil.nullDate()} ;
      P08WR2_n9399MISFch = new boolean[] {false} ;
      A9399MISFch = GXutil.nullDate() ;
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
      pr_default = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.wc_tminvstexportcsv__default(),
         new Object[] {
             new Object[] {
            P08WR2_A9408MISRStkDif, P08WR2_A9407MISRStkRea, P08WR2_A9406MISRStkTeo, P08WR2_A9405MISRStkAct, P08WR2_n9405MISRStkAct, P08WR2_A9404MISRNom, P08WR2_n9404MISRNom, P08WR2_A9403MISRCod, P08WR2_A9398MISCod, P08WR2_A396EmprCod,
            P08WR2_A9399MISFch, P08WR2_n9399MISFch
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
   private int A9403MISRCod ;
   private int AV68Mantenimientomaquina_wc_tminvstds_2_miscod ;
   private int AV51MISCod ;
   private int AV70Mantenimientomaquina_wc_tminvstds_4_tfmisrcod ;
   private int AV52TFMISRCod ;
   private int AV71Mantenimientomaquina_wc_tminvstds_5_tfmisrcod_to ;
   private int AV53TFMISRCod_To ;
   private int A9398MISCod ;
   private int AV82GXV1 ;
   private java.math.BigDecimal A9405MISRStkAct ;
   private java.math.BigDecimal A9406MISRStkTeo ;
   private java.math.BigDecimal A9407MISRStkRea ;
   private java.math.BigDecimal A9408MISRStkDif ;
   private java.math.BigDecimal AV74Mantenimientomaquina_wc_tminvstds_8_tfmisrstkact ;
   private java.math.BigDecimal AV56TFMISRStkAct ;
   private java.math.BigDecimal AV75Mantenimientomaquina_wc_tminvstds_9_tfmisrstkact_to ;
   private java.math.BigDecimal AV57TFMISRStkAct_To ;
   private java.math.BigDecimal AV76Mantenimientomaquina_wc_tminvstds_10_tfmisrstkteo ;
   private java.math.BigDecimal AV58TFMISRStkTeo ;
   private java.math.BigDecimal AV77Mantenimientomaquina_wc_tminvstds_11_tfmisrstkteo_to ;
   private java.math.BigDecimal AV59TFMISRStkTeo_To ;
   private java.math.BigDecimal AV78Mantenimientomaquina_wc_tminvstds_12_tfmisrstkrea ;
   private java.math.BigDecimal AV60TFMISRStkRea ;
   private java.math.BigDecimal AV79Mantenimientomaquina_wc_tminvstds_13_tfmisrstkrea_to ;
   private java.math.BigDecimal AV61TFMISRStkRea_To ;
   private java.math.BigDecimal AV80Mantenimientomaquina_wc_tminvstds_14_tfmisrstkdif ;
   private java.math.BigDecimal AV62TFMISRStkDif ;
   private java.math.BigDecimal AV81Mantenimientomaquina_wc_tminvstds_15_tfmisrstkdif_to ;
   private java.math.BigDecimal AV63TFMISRStkDif_To ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A9404MISRNom ;
   private String AV67Mantenimientomaquina_wc_tminvstds_1_emprcod ;
   private String AV50EmprCod ;
   private String AV72Mantenimientomaquina_wc_tminvstds_6_tfmisrnom ;
   private String AV54TFMISRNom ;
   private String AV73Mantenimientomaquina_wc_tminvstds_7_tfmisrnom_sel ;
   private String AV55TFMISRNom_Sel ;
   private String scmdbuf ;
   private String lV72Mantenimientomaquina_wc_tminvstds_6_tfmisrnom ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private java.util.Date A9399MISFch ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean n9405MISRStkAct ;
   private boolean n9404MISRNom ;
   private boolean n9399MISFch ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV69Mantenimientomaquina_wc_tminvstds_3_filterfulltext ;
   private String AV30FilterFullText ;
   private String lV69Mantenimientomaquina_wc_tminvstds_3_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] P08WR2_A9408MISRStkDif ;
   private java.math.BigDecimal[] P08WR2_A9407MISRStkRea ;
   private java.math.BigDecimal[] P08WR2_A9406MISRStkTeo ;
   private java.math.BigDecimal[] P08WR2_A9405MISRStkAct ;
   private boolean[] P08WR2_n9405MISRStkAct ;
   private String[] P08WR2_A9404MISRNom ;
   private boolean[] P08WR2_n9404MISRNom ;
   private int[] P08WR2_A9403MISRCod ;
   private int[] P08WR2_A9398MISCod ;
   private String[] P08WR2_A396EmprCod ;
   private java.util.Date[] P08WR2_A9399MISFch ;
   private boolean[] P08WR2_n9399MISFch ;
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

final  class wc_tminvstexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08WR2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV69Mantenimientomaquina_wc_tminvstds_3_filterfulltext ,
                                          int AV70Mantenimientomaquina_wc_tminvstds_4_tfmisrcod ,
                                          int AV71Mantenimientomaquina_wc_tminvstds_5_tfmisrcod_to ,
                                          String AV73Mantenimientomaquina_wc_tminvstds_7_tfmisrnom_sel ,
                                          String AV72Mantenimientomaquina_wc_tminvstds_6_tfmisrnom ,
                                          java.math.BigDecimal AV74Mantenimientomaquina_wc_tminvstds_8_tfmisrstkact ,
                                          java.math.BigDecimal AV75Mantenimientomaquina_wc_tminvstds_9_tfmisrstkact_to ,
                                          java.math.BigDecimal AV76Mantenimientomaquina_wc_tminvstds_10_tfmisrstkteo ,
                                          java.math.BigDecimal AV77Mantenimientomaquina_wc_tminvstds_11_tfmisrstkteo_to ,
                                          java.math.BigDecimal AV78Mantenimientomaquina_wc_tminvstds_12_tfmisrstkrea ,
                                          java.math.BigDecimal AV79Mantenimientomaquina_wc_tminvstds_13_tfmisrstkrea_to ,
                                          java.math.BigDecimal AV80Mantenimientomaquina_wc_tminvstds_14_tfmisrstkdif ,
                                          java.math.BigDecimal AV81Mantenimientomaquina_wc_tminvstds_15_tfmisrstkdif_to ,
                                          int A9403MISRCod ,
                                          String A9404MISRNom ,
                                          java.math.BigDecimal A9405MISRStkAct ,
                                          java.math.BigDecimal A9406MISRStkTeo ,
                                          java.math.BigDecimal A9407MISRStkRea ,
                                          java.math.BigDecimal A9408MISRStkDif ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc ,
                                          String AV67Mantenimientomaquina_wc_tminvstds_1_emprcod ,
                                          int AV68Mantenimientomaquina_wc_tminvstds_2_miscod ,
                                          String A396EmprCod ,
                                          int A9398MISCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[20];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.MISRStkDif, T1.MISRStkRea, T1.MISRStkTeo, T3.MRStkAct AS MISRStkAct, T3.MRNom AS MISRNom, T1.MISRCod AS MISRCod, T1.MISCod, T1.EmprCod, T2.MISFch FROM" ;
      scmdbuf += " ((TXPMInSRe T1 INNER JOIN TXPMINVST T2 ON T2.EmprCod = T1.EmprCod AND T2.MISCod = T1.MISCod) INNER JOIN TXPMREPUE T3 ON T3.EmprCod = T1.EmprCod AND T3.MRCod = T1.MISRCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.MISCod = ?)");
      if ( ! (GXutil.strcmp("", AV69Mantenimientomaquina_wc_tminvstds_3_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.MISRCod,'99999990'), 2) like '%' || ?) or ( UPPER(T3.MRNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T3.MRStkAct,'999990.999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MISRStkTeo,'99999990.999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MISRStkRea,'999990.999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MISRStkDif,'999990.999'), 2) like '%' || ?))");
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
      if ( ! (0==AV70Mantenimientomaquina_wc_tminvstds_4_tfmisrcod) )
      {
         addWhere(sWhereString, "(T1.MISRCod >= ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (0==AV71Mantenimientomaquina_wc_tminvstds_5_tfmisrcod_to) )
      {
         addWhere(sWhereString, "(T1.MISRCod <= ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Mantenimientomaquina_wc_tminvstds_7_tfmisrnom_sel)==0) && ( ! (GXutil.strcmp("", AV72Mantenimientomaquina_wc_tminvstds_6_tfmisrnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.MRNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Mantenimientomaquina_wc_tminvstds_7_tfmisrnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.MRNom = ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Mantenimientomaquina_wc_tminvstds_8_tfmisrstkact)==0) )
      {
         addWhere(sWhereString, "(T3.MRStkAct >= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Mantenimientomaquina_wc_tminvstds_9_tfmisrstkact_to)==0) )
      {
         addWhere(sWhereString, "(T3.MRStkAct <= ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Mantenimientomaquina_wc_tminvstds_10_tfmisrstkteo)==0) )
      {
         addWhere(sWhereString, "(T1.MISRStkTeo >= ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Mantenimientomaquina_wc_tminvstds_11_tfmisrstkteo_to)==0) )
      {
         addWhere(sWhereString, "(T1.MISRStkTeo <= ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Mantenimientomaquina_wc_tminvstds_12_tfmisrstkrea)==0) )
      {
         addWhere(sWhereString, "(T1.MISRStkRea >= ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Mantenimientomaquina_wc_tminvstds_13_tfmisrstkrea_to)==0) )
      {
         addWhere(sWhereString, "(T1.MISRStkRea <= ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Mantenimientomaquina_wc_tminvstds_14_tfmisrstkdif)==0) )
      {
         addWhere(sWhereString, "(T1.MISRStkDif >= ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Mantenimientomaquina_wc_tminvstds_15_tfmisrstkdif_to)==0) )
      {
         addWhere(sWhereString, "(T1.MISRStkDif <= ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV28OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T2.MISFch" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MISCod, T1.MISRCod" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MISCod DESC, T1.MISRCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MISCod, T3.MRNom" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MISCod DESC, T3.MRNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MISCod, T3.MRStkAct" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MISCod DESC, T3.MRStkAct DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MISCod, T1.MISRStkTeo" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MISCod DESC, T1.MISRStkTeo DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MISCod, T1.MISRStkRea" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MISCod DESC, T1.MISRStkRea DESC" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MISCod, T1.MISRStkDif" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MISCod DESC, T1.MISRStkDif DESC" ;
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
                  return conditional_P08WR2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Boolean) dynConstraints[20]).booleanValue() , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08WR2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,3);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 100);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(6);
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((String[]) buf[9])[0] = rslt.getString(8, 3);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
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
                  stmt.setInt(sIdx, ((Number) parms[21]).intValue());
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
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[32], 3);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[33], 3);
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
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 3);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 3);
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

