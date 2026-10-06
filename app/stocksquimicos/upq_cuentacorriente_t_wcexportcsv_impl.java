package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class upq_cuentacorriente_t_wcexportcsv_impl extends GXWebProcedure
{
   public upq_cuentacorriente_t_wcexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "UPQ_CuentaCorriente_t_WCExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("StocksQuimicos.UPQ_CuentaCorriente_t_WCColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("StocksQuimicos.UPQ_CuentaCorriente_t_WCColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Linea", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Dia Hora", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Tipo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Entrada", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Salida", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Precio", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Saldo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Lote", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "N Hdr", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Usuario", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Hora", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV70Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext = AV30FilterFullText ;
      AV71Stocksquimicos_upq_cuentacorriente_t_wcds_2_tfccstklin = AV39TFCCStkLin ;
      AV72Stocksquimicos_upq_cuentacorriente_t_wcds_3_tfccstklin_to = AV40TFCCStkLin_To ;
      AV73Stocksquimicos_upq_cuentacorriente_t_wcds_4_tftipmovcc = AV41TFTipMovCc ;
      AV74Stocksquimicos_upq_cuentacorriente_t_wcds_5_tftipmovcc_sel = AV42TFTipMovCc_Sel ;
      AV75Stocksquimicos_upq_cuentacorriente_t_wcds_6_tfccstkdsc = AV43TFCCStkDsc ;
      AV76Stocksquimicos_upq_cuentacorriente_t_wcds_7_tfccstkdsc_sel = AV44TFCCStkDsc_Sel ;
      AV77Stocksquimicos_upq_cuentacorriente_t_wcds_8_tfccstkpre = AV45TFCCStkPre ;
      AV78Stocksquimicos_upq_cuentacorriente_t_wcds_9_tfccstkpre_to = AV46TFCCStkPre_To ;
      AV79Stocksquimicos_upq_cuentacorriente_t_wcds_10_tfccstklot = AV47TFCCStkLot ;
      AV80Stocksquimicos_upq_cuentacorriente_t_wcds_11_tfccstklot_sel = AV48TFCCStkLot_Sel ;
      AV81Stocksquimicos_upq_cuentacorriente_t_wcds_12_tfccstkusu = AV49TFCCStkUsu ;
      AV82Stocksquimicos_upq_cuentacorriente_t_wcds_13_tfccstkusu_sel = AV50TFCCStkUsu_Sel ;
      AV83Stocksquimicos_upq_cuentacorriente_t_wcds_14_tfccstkfec = AV55TFCCStkFec ;
      AV84Stocksquimicos_upq_cuentacorriente_t_wcds_15_tfccstkhor = AV57TFCCStkHor ;
      AV85Stocksquimicos_upq_cuentacorriente_t_wcds_16_tfccstkhor_sel = AV58TFCCStkHor_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV70Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext ,
                                           Long.valueOf(AV71Stocksquimicos_upq_cuentacorriente_t_wcds_2_tfccstklin) ,
                                           Long.valueOf(AV72Stocksquimicos_upq_cuentacorriente_t_wcds_3_tfccstklin_to) ,
                                           AV74Stocksquimicos_upq_cuentacorriente_t_wcds_5_tftipmovcc_sel ,
                                           AV73Stocksquimicos_upq_cuentacorriente_t_wcds_4_tftipmovcc ,
                                           AV76Stocksquimicos_upq_cuentacorriente_t_wcds_7_tfccstkdsc_sel ,
                                           AV75Stocksquimicos_upq_cuentacorriente_t_wcds_6_tfccstkdsc ,
                                           AV77Stocksquimicos_upq_cuentacorriente_t_wcds_8_tfccstkpre ,
                                           AV78Stocksquimicos_upq_cuentacorriente_t_wcds_9_tfccstkpre_to ,
                                           AV80Stocksquimicos_upq_cuentacorriente_t_wcds_11_tfccstklot_sel ,
                                           AV79Stocksquimicos_upq_cuentacorriente_t_wcds_10_tfccstklot ,
                                           AV82Stocksquimicos_upq_cuentacorriente_t_wcds_13_tfccstkusu_sel ,
                                           AV81Stocksquimicos_upq_cuentacorriente_t_wcds_12_tfccstkusu ,
                                           AV83Stocksquimicos_upq_cuentacorriente_t_wcds_14_tfccstkfec ,
                                           AV85Stocksquimicos_upq_cuentacorriente_t_wcds_16_tfccstkhor_sel ,
                                           AV84Stocksquimicos_upq_cuentacorriente_t_wcds_15_tfccstkhor ,
                                           AV52CCstkfecfrom ,
                                           AV53CCstkfecto ,
                                           Long.valueOf(A3342CCStkLin) ,
                                           A3345TipMovCc ,
                                           A3357CCStkDsc ,
                                           A3349CCStkPre ,
                                           A5722CCStkLot ,
                                           A3355CCStkUsu ,
                                           A3356CCStkHor ,
                                           A3348CCStkFec ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) ,
                                           AV51Emprcod ,
                                           AV54Prdnum ,
                                           A396EmprCod ,
                                           A719PrdNum } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.LONG, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV70Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext), "%", "") ;
      lV70Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext), "%", "") ;
      lV70Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext), "%", "") ;
      lV70Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext), "%", "") ;
      lV70Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext), "%", "") ;
      lV70Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext), "%", "") ;
      lV70Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext), "%", "") ;
      lV73Stocksquimicos_upq_cuentacorriente_t_wcds_4_tftipmovcc = GXutil.padr( GXutil.rtrim( AV73Stocksquimicos_upq_cuentacorriente_t_wcds_4_tftipmovcc), 2, "%") ;
      lV75Stocksquimicos_upq_cuentacorriente_t_wcds_6_tfccstkdsc = GXutil.padr( GXutil.rtrim( AV75Stocksquimicos_upq_cuentacorriente_t_wcds_6_tfccstkdsc), 30, "%") ;
      lV79Stocksquimicos_upq_cuentacorriente_t_wcds_10_tfccstklot = GXutil.padr( GXutil.rtrim( AV79Stocksquimicos_upq_cuentacorriente_t_wcds_10_tfccstklot), 26, "%") ;
      lV81Stocksquimicos_upq_cuentacorriente_t_wcds_12_tfccstkusu = GXutil.padr( GXutil.rtrim( AV81Stocksquimicos_upq_cuentacorriente_t_wcds_12_tfccstkusu), 8, "%") ;
      lV84Stocksquimicos_upq_cuentacorriente_t_wcds_15_tfccstkhor = GXutil.padr( GXutil.rtrim( AV84Stocksquimicos_upq_cuentacorriente_t_wcds_15_tfccstkhor), 8, "%") ;
      /* Using cursor P09MQ2 */
      pr_default.execute(0, new Object[] {AV51Emprcod, AV54Prdnum, lV70Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext, lV70Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext, lV70Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext, lV70Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext, lV70Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext, lV70Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext, lV70Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext, Long.valueOf(AV71Stocksquimicos_upq_cuentacorriente_t_wcds_2_tfccstklin), Long.valueOf(AV72Stocksquimicos_upq_cuentacorriente_t_wcds_3_tfccstklin_to), lV73Stocksquimicos_upq_cuentacorriente_t_wcds_4_tftipmovcc, AV74Stocksquimicos_upq_cuentacorriente_t_wcds_5_tftipmovcc_sel, lV75Stocksquimicos_upq_cuentacorriente_t_wcds_6_tfccstkdsc, AV76Stocksquimicos_upq_cuentacorriente_t_wcds_7_tfccstkdsc_sel, AV77Stocksquimicos_upq_cuentacorriente_t_wcds_8_tfccstkpre, AV78Stocksquimicos_upq_cuentacorriente_t_wcds_9_tfccstkpre_to, lV79Stocksquimicos_upq_cuentacorriente_t_wcds_10_tfccstklot, AV80Stocksquimicos_upq_cuentacorriente_t_wcds_11_tfccstklot_sel, lV81Stocksquimicos_upq_cuentacorriente_t_wcds_12_tfccstkusu, AV82Stocksquimicos_upq_cuentacorriente_t_wcds_13_tfccstkusu_sel, AV83Stocksquimicos_upq_cuentacorriente_t_wcds_14_tfccstkfec, lV84Stocksquimicos_upq_cuentacorriente_t_wcds_15_tfccstkhor, AV85Stocksquimicos_upq_cuentacorriente_t_wcds_16_tfccstkhor_sel, AV52CCstkfecfrom, AV53CCstkfecto});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A719PrdNum = P09MQ2_A719PrdNum[0] ;
         A396EmprCod = P09MQ2_A396EmprCod[0] ;
         A3356CCStkHor = P09MQ2_A3356CCStkHor[0] ;
         A3348CCStkFec = P09MQ2_A3348CCStkFec[0] ;
         A3355CCStkUsu = P09MQ2_A3355CCStkUsu[0] ;
         A5722CCStkLot = P09MQ2_A5722CCStkLot[0] ;
         A3349CCStkPre = P09MQ2_A3349CCStkPre[0] ;
         A3357CCStkDsc = P09MQ2_A3357CCStkDsc[0] ;
         A3345TipMovCc = P09MQ2_A3345TipMovCc[0] ;
         A3342CCStkLin = P09MQ2_A3342CCStkLin[0] ;
         A3343CCStkCanE = P09MQ2_A3343CCStkCanE[0] ;
         A3344CCStkCanS = P09MQ2_A3344CCStkCanS[0] ;
         A3352CCStkPar = P09MQ2_A3352CCStkPar[0] ;
         A3351CCStkReo = P09MQ2_A3351CCStkReo[0] ;
         A3350CCStkBar = P09MQ2_A3350CCStkBar[0] ;
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
            AV14TextFileLine += GXutil.str( A3342CCStkLin, 12, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV31DiaHora = localUtil.dtoc( A3348CCStkFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + " " + A3356CCStkHor ;
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV31DiaHora, ";", ","), GXv_char3) ;
            upq_cuentacorriente_t_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A3345TipMovCc, ";", ","), GXv_char3) ;
            upq_cuentacorriente_t_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A3357CCStkDsc, ";", ","), GXv_char3) ;
            upq_cuentacorriente_t_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV32CCStkCanE = ((GXutil.strcmp(A3345TipMovCc, "SR")==0) ? DecimalUtil.doubleToDec(0) : A3343CCStkCanE) ;
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( AV32CCStkCanE, 12, 4) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV33CCStkCanS = ((GXutil.strcmp(A3345TipMovCc, "SR")==0) ? DecimalUtil.doubleToDec(0) : A3344CCStkCanS) ;
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( AV33CCStkCanS, 12, 4) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A3349CCStkPre, 14, 5) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV34Exis = AV34Exis.add((A3343CCStkCanE.subtract(A3344CCStkCanS))) ;
            GXt_decimal4 = AV34Exis ;
            GXv_decimal5[0] = GXt_decimal4 ;
            new app.stocksquimicos.upq_cuentacorriente_recuento(remoteHandle, context).execute( AV51Emprcod, AV54Prdnum, A3348CCStkFec, GXv_decimal5) ;
            upq_cuentacorriente_t_wcexportcsv_impl.this.GXt_decimal4 = GXv_decimal5[0] ;
            AV34Exis = ((GXutil.strcmp(A3345TipMovCc, "SR")==0) ? GXt_decimal4 : AV34Exis) ;
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( AV34Exis, 12, 4) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A5722CCStkLot, ";", ","), GXv_char3) ;
            upq_cuentacorriente_t_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV35Hdr = ((A3350CCStkBar==0) ? " " : GXutil.str( A3350CCStkBar, 8, 0)+"-"+GXutil.str( A3351CCStkReo, 1, 0)+A3352CCStkPar) ;
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV35Hdr, ";", ","), GXv_char3) ;
            upq_cuentacorriente_t_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A3355CCStkUsu, ";", ","), GXv_char3) ;
            upq_cuentacorriente_t_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += localUtil.dtoc( A3348CCStkFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A3356CCStkHor, ";", ","), GXv_char3) ;
            upq_cuentacorriente_t_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=UPQ_CuentaCorriente_t_WCExportCSV.csv");
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
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "CCStkLin", "", "Linea", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "&DiaHora", "", "Dia Hora", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "TipMovCc", "", "Tipo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "CCStkDsc", "", "Descripcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "&CCStkCanE", "Cantidad", "Entrada", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "&CCStkCanS", "Cantidad", "Salida", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "CCStkPre", "", "Precio", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "&Exis", "", "Saldo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "CCStkLot", "", "Lote", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "&Hdr", "", "N Hdr", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "CCStkUsu", "", "Usuario", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "CCStkFec", "", "Fecha", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "CCStkHor", "", "Hora", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "StocksQuimicos.UPQ_CuentaCorriente_t_WCColumnsSelector", GXv_char3) ;
      upq_cuentacorriente_t_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
      AV20UserCustomValue = GXt_char2 ;
      if ( ! ( (GXutil.strcmp("", AV20UserCustomValue)==0) ) )
      {
         AV16ColumnsSelectorAux.fromxml(AV20UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector6[0] = AV16ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, GXv_SdtWWPColumnsSelector7) ;
         AV16ColumnsSelectorAux = GXv_SdtWWPColumnsSelector6[0] ;
         AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      }
   }

   public void S191( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue("StocksQuimicos.UPQ_CuentaCorriente_t_WCGridState"), "") == 0 )
      {
         AV37GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "StocksQuimicos.UPQ_CuentaCorriente_t_WCGridState"), null, null);
      }
      else
      {
         AV37GridState.fromxml(AV19Session.getValue("StocksQuimicos.UPQ_CuentaCorriente_t_WCGridState"), null, null);
      }
      AV28OrderedBy = AV37GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV37GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV86GXV1 = 1 ;
      while ( AV86GXV1 <= AV37GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV38GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV37GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV86GXV1));
         if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV30FilterFullText = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKLIN") == 0 )
         {
            AV39TFCCStkLin = GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            AV40TFCCStkLin_To = GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPMOVCC") == 0 )
         {
            AV41TFTipMovCc = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPMOVCC_SEL") == 0 )
         {
            AV42TFTipMovCc_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKDSC") == 0 )
         {
            AV43TFCCStkDsc = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKDSC_SEL") == 0 )
         {
            AV44TFCCStkDsc_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKPRE") == 0 )
         {
            AV45TFCCStkPre = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV46TFCCStkPre_To = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKLOT") == 0 )
         {
            AV47TFCCStkLot = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKLOT_SEL") == 0 )
         {
            AV48TFCCStkLot_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKUSU") == 0 )
         {
            AV49TFCCStkUsu = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKUSU_SEL") == 0 )
         {
            AV50TFCCStkUsu_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKFEC") == 0 )
         {
            AV55TFCCStkFec = localUtil.ctod( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKHOR") == 0 )
         {
            AV57TFCCStkHor = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKHOR_SEL") == 0 )
         {
            AV58TFCCStkHor_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV51Emprcod = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRDNUM") == 0 )
         {
            AV54Prdnum = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CCSTKFECFROM") == 0 )
         {
            AV52CCstkfecfrom = localUtil.ctod( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CCSTKFECTO") == 0 )
         {
            AV53CCstkfecto = localUtil.ctod( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&COMPRAS") == 0 )
         {
            AV59compras = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CONSUMOS") == 0 )
         {
            AV60consumos = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&DEVOLUCIONES") == 0 )
         {
            AV61devoluciones = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&SALDOINICIAL") == 0 )
         {
            AV62SaldoInicial = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EXISTENCIASCUENTACORRIENTE") == 0 )
         {
            AV63Existenciascuentacorriente = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRDEXIALM") == 0 )
         {
            AV64PrdExialm = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRDCANRES") == 0 )
         {
            AV65PrdCanres = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRDNOM") == 0 )
         {
            AV66PrdNom = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV86GXV1 = (int)(AV86GXV1+1) ;
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
      A3348CCStkFec = GXutil.nullDate() ;
      A3356CCStkHor = "" ;
      A3345TipMovCc = "" ;
      A3357CCStkDsc = "" ;
      A3343CCStkCanE = DecimalUtil.ZERO ;
      A3344CCStkCanS = DecimalUtil.ZERO ;
      A3349CCStkPre = DecimalUtil.ZERO ;
      A5722CCStkLot = "" ;
      A3352CCStkPar = "" ;
      A3355CCStkUsu = "" ;
      AV70Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext = "" ;
      AV30FilterFullText = "" ;
      AV73Stocksquimicos_upq_cuentacorriente_t_wcds_4_tftipmovcc = "" ;
      AV41TFTipMovCc = "" ;
      AV74Stocksquimicos_upq_cuentacorriente_t_wcds_5_tftipmovcc_sel = "" ;
      AV42TFTipMovCc_Sel = "" ;
      AV75Stocksquimicos_upq_cuentacorriente_t_wcds_6_tfccstkdsc = "" ;
      AV43TFCCStkDsc = "" ;
      AV76Stocksquimicos_upq_cuentacorriente_t_wcds_7_tfccstkdsc_sel = "" ;
      AV44TFCCStkDsc_Sel = "" ;
      AV77Stocksquimicos_upq_cuentacorriente_t_wcds_8_tfccstkpre = DecimalUtil.ZERO ;
      AV45TFCCStkPre = DecimalUtil.ZERO ;
      AV78Stocksquimicos_upq_cuentacorriente_t_wcds_9_tfccstkpre_to = DecimalUtil.ZERO ;
      AV46TFCCStkPre_To = DecimalUtil.ZERO ;
      AV79Stocksquimicos_upq_cuentacorriente_t_wcds_10_tfccstklot = "" ;
      AV47TFCCStkLot = "" ;
      AV80Stocksquimicos_upq_cuentacorriente_t_wcds_11_tfccstklot_sel = "" ;
      AV48TFCCStkLot_Sel = "" ;
      AV81Stocksquimicos_upq_cuentacorriente_t_wcds_12_tfccstkusu = "" ;
      AV49TFCCStkUsu = "" ;
      AV82Stocksquimicos_upq_cuentacorriente_t_wcds_13_tfccstkusu_sel = "" ;
      AV50TFCCStkUsu_Sel = "" ;
      AV83Stocksquimicos_upq_cuentacorriente_t_wcds_14_tfccstkfec = GXutil.nullDate() ;
      AV55TFCCStkFec = GXutil.nullDate() ;
      AV84Stocksquimicos_upq_cuentacorriente_t_wcds_15_tfccstkhor = "" ;
      AV57TFCCStkHor = "" ;
      AV85Stocksquimicos_upq_cuentacorriente_t_wcds_16_tfccstkhor_sel = "" ;
      AV58TFCCStkHor_Sel = "" ;
      scmdbuf = "" ;
      lV70Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext = "" ;
      lV73Stocksquimicos_upq_cuentacorriente_t_wcds_4_tftipmovcc = "" ;
      lV75Stocksquimicos_upq_cuentacorriente_t_wcds_6_tfccstkdsc = "" ;
      lV79Stocksquimicos_upq_cuentacorriente_t_wcds_10_tfccstklot = "" ;
      lV81Stocksquimicos_upq_cuentacorriente_t_wcds_12_tfccstkusu = "" ;
      lV84Stocksquimicos_upq_cuentacorriente_t_wcds_15_tfccstkhor = "" ;
      AV52CCstkfecfrom = GXutil.nullDate() ;
      AV53CCstkfecto = GXutil.nullDate() ;
      AV51Emprcod = "" ;
      AV54Prdnum = "" ;
      A396EmprCod = "" ;
      A719PrdNum = "" ;
      P09MQ2_A719PrdNum = new String[] {""} ;
      P09MQ2_A396EmprCod = new String[] {""} ;
      P09MQ2_A3356CCStkHor = new String[] {""} ;
      P09MQ2_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09MQ2_A3355CCStkUsu = new String[] {""} ;
      P09MQ2_A5722CCStkLot = new String[] {""} ;
      P09MQ2_A3349CCStkPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09MQ2_A3357CCStkDsc = new String[] {""} ;
      P09MQ2_A3345TipMovCc = new String[] {""} ;
      P09MQ2_A3342CCStkLin = new long[1] ;
      P09MQ2_A3343CCStkCanE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09MQ2_A3344CCStkCanS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09MQ2_A3352CCStkPar = new String[] {""} ;
      P09MQ2_A3351CCStkReo = new byte[1] ;
      P09MQ2_A3350CCStkBar = new int[1] ;
      AV31DiaHora = "" ;
      AV32CCStkCanE = DecimalUtil.ZERO ;
      AV33CCStkCanS = DecimalUtil.ZERO ;
      AV34Exis = DecimalUtil.ZERO ;
      GXt_decimal4 = DecimalUtil.ZERO ;
      GXv_decimal5 = new java.math.BigDecimal[1] ;
      AV35Hdr = "" ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV37GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV38GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV59compras = DecimalUtil.ZERO ;
      AV60consumos = DecimalUtil.ZERO ;
      AV61devoluciones = DecimalUtil.ZERO ;
      AV62SaldoInicial = DecimalUtil.ZERO ;
      AV63Existenciascuentacorriente = DecimalUtil.ZERO ;
      AV64PrdExialm = DecimalUtil.ZERO ;
      AV65PrdCanres = DecimalUtil.ZERO ;
      AV66PrdNom = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.upq_cuentacorriente_t_wcexportcsv__default(),
         new Object[] {
             new Object[] {
            P09MQ2_A719PrdNum, P09MQ2_A396EmprCod, P09MQ2_A3356CCStkHor, P09MQ2_A3348CCStkFec, P09MQ2_A3355CCStkUsu, P09MQ2_A5722CCStkLot, P09MQ2_A3349CCStkPre, P09MQ2_A3357CCStkDsc, P09MQ2_A3345TipMovCc, P09MQ2_A3342CCStkLin,
            P09MQ2_A3343CCStkCanE, P09MQ2_A3344CCStkCanS, P09MQ2_A3352CCStkPar, P09MQ2_A3351CCStkReo, P09MQ2_A3350CCStkBar
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A3351CCStkReo ;
   private short gxcookieaux ;
   private short AV28OrderedBy ;
   private short Gx_err ;
   private int AV13Random ;
   private int A3350CCStkBar ;
   private int AV86GXV1 ;
   private long A3342CCStkLin ;
   private long AV71Stocksquimicos_upq_cuentacorriente_t_wcds_2_tfccstklin ;
   private long AV39TFCCStkLin ;
   private long AV72Stocksquimicos_upq_cuentacorriente_t_wcds_3_tfccstklin_to ;
   private long AV40TFCCStkLin_To ;
   private java.math.BigDecimal A3343CCStkCanE ;
   private java.math.BigDecimal A3344CCStkCanS ;
   private java.math.BigDecimal A3349CCStkPre ;
   private java.math.BigDecimal AV77Stocksquimicos_upq_cuentacorriente_t_wcds_8_tfccstkpre ;
   private java.math.BigDecimal AV45TFCCStkPre ;
   private java.math.BigDecimal AV78Stocksquimicos_upq_cuentacorriente_t_wcds_9_tfccstkpre_to ;
   private java.math.BigDecimal AV46TFCCStkPre_To ;
   private java.math.BigDecimal AV32CCStkCanE ;
   private java.math.BigDecimal AV33CCStkCanS ;
   private java.math.BigDecimal AV34Exis ;
   private java.math.BigDecimal GXt_decimal4 ;
   private java.math.BigDecimal GXv_decimal5[] ;
   private java.math.BigDecimal AV59compras ;
   private java.math.BigDecimal AV60consumos ;
   private java.math.BigDecimal AV61devoluciones ;
   private java.math.BigDecimal AV62SaldoInicial ;
   private java.math.BigDecimal AV63Existenciascuentacorriente ;
   private java.math.BigDecimal AV64PrdExialm ;
   private java.math.BigDecimal AV65PrdCanres ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A3356CCStkHor ;
   private String A3345TipMovCc ;
   private String A3357CCStkDsc ;
   private String A5722CCStkLot ;
   private String A3352CCStkPar ;
   private String A3355CCStkUsu ;
   private String AV73Stocksquimicos_upq_cuentacorriente_t_wcds_4_tftipmovcc ;
   private String AV41TFTipMovCc ;
   private String AV74Stocksquimicos_upq_cuentacorriente_t_wcds_5_tftipmovcc_sel ;
   private String AV42TFTipMovCc_Sel ;
   private String AV75Stocksquimicos_upq_cuentacorriente_t_wcds_6_tfccstkdsc ;
   private String AV43TFCCStkDsc ;
   private String AV76Stocksquimicos_upq_cuentacorriente_t_wcds_7_tfccstkdsc_sel ;
   private String AV44TFCCStkDsc_Sel ;
   private String AV79Stocksquimicos_upq_cuentacorriente_t_wcds_10_tfccstklot ;
   private String AV47TFCCStkLot ;
   private String AV80Stocksquimicos_upq_cuentacorriente_t_wcds_11_tfccstklot_sel ;
   private String AV48TFCCStkLot_Sel ;
   private String AV81Stocksquimicos_upq_cuentacorriente_t_wcds_12_tfccstkusu ;
   private String AV49TFCCStkUsu ;
   private String AV82Stocksquimicos_upq_cuentacorriente_t_wcds_13_tfccstkusu_sel ;
   private String AV50TFCCStkUsu_Sel ;
   private String AV84Stocksquimicos_upq_cuentacorriente_t_wcds_15_tfccstkhor ;
   private String AV57TFCCStkHor ;
   private String AV85Stocksquimicos_upq_cuentacorriente_t_wcds_16_tfccstkhor_sel ;
   private String AV58TFCCStkHor_Sel ;
   private String scmdbuf ;
   private String lV73Stocksquimicos_upq_cuentacorriente_t_wcds_4_tftipmovcc ;
   private String lV75Stocksquimicos_upq_cuentacorriente_t_wcds_6_tfccstkdsc ;
   private String lV79Stocksquimicos_upq_cuentacorriente_t_wcds_10_tfccstklot ;
   private String lV81Stocksquimicos_upq_cuentacorriente_t_wcds_12_tfccstkusu ;
   private String lV84Stocksquimicos_upq_cuentacorriente_t_wcds_15_tfccstkhor ;
   private String AV51Emprcod ;
   private String AV54Prdnum ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String AV31DiaHora ;
   private String AV35Hdr ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private String AV66PrdNom ;
   private java.util.Date A3348CCStkFec ;
   private java.util.Date AV83Stocksquimicos_upq_cuentacorriente_t_wcds_14_tfccstkfec ;
   private java.util.Date AV55TFCCStkFec ;
   private java.util.Date AV52CCstkfecfrom ;
   private java.util.Date AV53CCstkfecto ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV70Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext ;
   private String AV30FilterFullText ;
   private String lV70Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private String[] P09MQ2_A719PrdNum ;
   private String[] P09MQ2_A396EmprCod ;
   private String[] P09MQ2_A3356CCStkHor ;
   private java.util.Date[] P09MQ2_A3348CCStkFec ;
   private String[] P09MQ2_A3355CCStkUsu ;
   private String[] P09MQ2_A5722CCStkLot ;
   private java.math.BigDecimal[] P09MQ2_A3349CCStkPre ;
   private String[] P09MQ2_A3357CCStkDsc ;
   private String[] P09MQ2_A3345TipMovCc ;
   private long[] P09MQ2_A3342CCStkLin ;
   private java.math.BigDecimal[] P09MQ2_A3343CCStkCanE ;
   private java.math.BigDecimal[] P09MQ2_A3344CCStkCanS ;
   private String[] P09MQ2_A3352CCStkPar ;
   private byte[] P09MQ2_A3351CCStkReo ;
   private int[] P09MQ2_A3350CCStkBar ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector6[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV37GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV38GridStateFilterValue ;
}

final  class upq_cuentacorriente_t_wcexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09MQ2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV70Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext ,
                                          long AV71Stocksquimicos_upq_cuentacorriente_t_wcds_2_tfccstklin ,
                                          long AV72Stocksquimicos_upq_cuentacorriente_t_wcds_3_tfccstklin_to ,
                                          String AV74Stocksquimicos_upq_cuentacorriente_t_wcds_5_tftipmovcc_sel ,
                                          String AV73Stocksquimicos_upq_cuentacorriente_t_wcds_4_tftipmovcc ,
                                          String AV76Stocksquimicos_upq_cuentacorriente_t_wcds_7_tfccstkdsc_sel ,
                                          String AV75Stocksquimicos_upq_cuentacorriente_t_wcds_6_tfccstkdsc ,
                                          java.math.BigDecimal AV77Stocksquimicos_upq_cuentacorriente_t_wcds_8_tfccstkpre ,
                                          java.math.BigDecimal AV78Stocksquimicos_upq_cuentacorriente_t_wcds_9_tfccstkpre_to ,
                                          String AV80Stocksquimicos_upq_cuentacorriente_t_wcds_11_tfccstklot_sel ,
                                          String AV79Stocksquimicos_upq_cuentacorriente_t_wcds_10_tfccstklot ,
                                          String AV82Stocksquimicos_upq_cuentacorriente_t_wcds_13_tfccstkusu_sel ,
                                          String AV81Stocksquimicos_upq_cuentacorriente_t_wcds_12_tfccstkusu ,
                                          java.util.Date AV83Stocksquimicos_upq_cuentacorriente_t_wcds_14_tfccstkfec ,
                                          String AV85Stocksquimicos_upq_cuentacorriente_t_wcds_16_tfccstkhor_sel ,
                                          String AV84Stocksquimicos_upq_cuentacorriente_t_wcds_15_tfccstkhor ,
                                          java.util.Date AV52CCstkfecfrom ,
                                          java.util.Date AV53CCstkfecto ,
                                          long A3342CCStkLin ,
                                          String A3345TipMovCc ,
                                          String A3357CCStkDsc ,
                                          java.math.BigDecimal A3349CCStkPre ,
                                          String A5722CCStkLot ,
                                          String A3355CCStkUsu ,
                                          String A3356CCStkHor ,
                                          java.util.Date A3348CCStkFec ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc ,
                                          String AV51Emprcod ,
                                          String AV54Prdnum ,
                                          String A396EmprCod ,
                                          String A719PrdNum )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[26];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT PrdNum, EmprCod, CCStkHor, CCStkFec, CCStkUsu, CCStkLot, CCStkPre, CCStkDsc, TipMovCc, CCStkLin, CCStkCanE, CCStkCanS, CCStkPar, CCStkReo, CCStkBar FROM TXPCCSTKS" ;
      addWhere(sWhereString, "(EmprCod = ? and PrdNum = ?)");
      addWhere(sWhereString, "(TipMovCc <> 'EC')");
      if ( ! (GXutil.strcmp("", AV70Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(CCStkLin,'999999999990'), 2) like '%' || ?) or ( UPPER(TipMovCc) like '%' || UPPER(?)) or ( UPPER(CCStkDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(CCStkPre,'99999990.99999'), 2) like '%' || ?) or ( UPPER(CCStkLot) like '%' || UPPER(?)) or ( UPPER(CCStkUsu) like '%' || UPPER(?)) or ( UPPER(CCStkHor) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
         GXv_int8[3] = (byte)(1) ;
         GXv_int8[4] = (byte)(1) ;
         GXv_int8[5] = (byte)(1) ;
         GXv_int8[6] = (byte)(1) ;
         GXv_int8[7] = (byte)(1) ;
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (0==AV71Stocksquimicos_upq_cuentacorriente_t_wcds_2_tfccstklin) )
      {
         addWhere(sWhereString, "(CCStkLin >= ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! (0==AV72Stocksquimicos_upq_cuentacorriente_t_wcds_3_tfccstklin_to) )
      {
         addWhere(sWhereString, "(CCStkLin <= ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Stocksquimicos_upq_cuentacorriente_t_wcds_5_tftipmovcc_sel)==0) && ( ! (GXutil.strcmp("", AV73Stocksquimicos_upq_cuentacorriente_t_wcds_4_tftipmovcc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(TipMovCc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Stocksquimicos_upq_cuentacorriente_t_wcds_5_tftipmovcc_sel)==0) )
      {
         addWhere(sWhereString, "(TipMovCc = ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Stocksquimicos_upq_cuentacorriente_t_wcds_7_tfccstkdsc_sel)==0) && ( ! (GXutil.strcmp("", AV75Stocksquimicos_upq_cuentacorriente_t_wcds_6_tfccstkdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CCStkDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Stocksquimicos_upq_cuentacorriente_t_wcds_7_tfccstkdsc_sel)==0) )
      {
         addWhere(sWhereString, "(CCStkDsc = ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Stocksquimicos_upq_cuentacorriente_t_wcds_8_tfccstkpre)==0) )
      {
         addWhere(sWhereString, "(CCStkPre >= ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Stocksquimicos_upq_cuentacorriente_t_wcds_9_tfccstkpre_to)==0) )
      {
         addWhere(sWhereString, "(CCStkPre <= ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Stocksquimicos_upq_cuentacorriente_t_wcds_11_tfccstklot_sel)==0) && ( ! (GXutil.strcmp("", AV79Stocksquimicos_upq_cuentacorriente_t_wcds_10_tfccstklot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CCStkLot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Stocksquimicos_upq_cuentacorriente_t_wcds_11_tfccstklot_sel)==0) )
      {
         addWhere(sWhereString, "(CCStkLot = ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Stocksquimicos_upq_cuentacorriente_t_wcds_13_tfccstkusu_sel)==0) && ( ! (GXutil.strcmp("", AV81Stocksquimicos_upq_cuentacorriente_t_wcds_12_tfccstkusu)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CCStkUsu) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Stocksquimicos_upq_cuentacorriente_t_wcds_13_tfccstkusu_sel)==0) )
      {
         addWhere(sWhereString, "(CCStkUsu = ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV83Stocksquimicos_upq_cuentacorriente_t_wcds_14_tfccstkfec)) )
      {
         addWhere(sWhereString, "(CCStkFec >= ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Stocksquimicos_upq_cuentacorriente_t_wcds_16_tfccstkhor_sel)==0) && ( ! (GXutil.strcmp("", AV84Stocksquimicos_upq_cuentacorriente_t_wcds_15_tfccstkhor)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CCStkHor) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Stocksquimicos_upq_cuentacorriente_t_wcds_16_tfccstkhor_sel)==0) )
      {
         addWhere(sWhereString, "(CCStkHor = ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV52CCstkfecfrom)) )
      {
         addWhere(sWhereString, "(CCStkFec >= ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV53CCstkfecto)) )
      {
         addWhere(sWhereString, "(CCStkFec <= ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV28OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY EmprCod" ;
      }
      else if ( AV28OrderedBy == 2 )
      {
         scmdbuf += " ORDER BY PrdNum" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY CCStkFec" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CCStkFec DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY CCStkHor" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CCStkHor DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY CCStkLin" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CCStkLin DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY TipMovCc" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY TipMovCc DESC" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY CCStkDsc" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CCStkDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY CCStkPre" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CCStkPre DESC" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY CCStkLot" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CCStkLot DESC" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY CCStkUsu" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CCStkUsu DESC" ;
      }
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
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
                  return conditional_P09MQ2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).longValue() , ((Number) dynConstraints[2]).longValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.util.Date)dynConstraints[16] , (java.util.Date)dynConstraints[17] , ((Number) dynConstraints[18]).longValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (java.util.Date)dynConstraints[25] , ((Number) dynConstraints[26]).shortValue() , ((Boolean) dynConstraints[27]).booleanValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09MQ2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((String[]) buf[8])[0] = rslt.getString(9, 2);
               ((long[]) buf[9])[0] = rslt.getLong(10);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,4);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,4);
               ((String[]) buf[12])[0] = rslt.getString(13, 1);
               ((byte[]) buf[13])[0] = rslt.getByte(14);
               ((int[]) buf[14])[0] = rslt.getInt(15);
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
                  stmt.setString(sIdx, (String)parms[26], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[35]).longValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[36]).longValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 2);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 2);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 5);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[42], 5);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 8);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 8);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[47]);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 8);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 8);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[50]);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[51]);
               }
               return;
      }
   }

}

