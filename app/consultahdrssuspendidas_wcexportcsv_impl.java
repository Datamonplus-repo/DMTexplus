package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class consultahdrssuspendidas_wcexportcsv_impl extends GXWebProcedure
{
   public consultahdrssuspendidas_wcexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "ConsultaHdrsSuspendidas_WCExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("ConsultaHdrsSuspendidas_WCColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("ConsultaHdrsSuspendidas_WCColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Hdr", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Articulo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Color", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Dia Suspension", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Motivo Suspension", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Dia Activacion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Motivo Activacion", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV64Consultahdrssuspendidas_wcds_1_filterfulltext = AV30FilterFullText ;
      AV65Consultahdrssuspendidas_wcds_2_tfstphdr = AV35TFStpHdr ;
      AV66Consultahdrssuspendidas_wcds_3_tfstphdr_sel = AV36TFStpHdr_Sel ;
      AV67Consultahdrssuspendidas_wcds_4_tfstpclicod = AV37TFStpClicod ;
      AV68Consultahdrssuspendidas_wcds_5_tfstpclicod_to = AV38TFStpClicod_To ;
      AV69Consultahdrssuspendidas_wcds_6_tfstpclinom = AV39TFStpCliNom ;
      AV70Consultahdrssuspendidas_wcds_7_tfstpclinom_sel = AV40TFStpCliNom_Sel ;
      AV71Consultahdrssuspendidas_wcds_8_tfstpbarser = AV41TFStpBarser ;
      AV72Consultahdrssuspendidas_wcds_9_tfstpbarser_sel = AV42TFStpBarser_Sel ;
      AV73Consultahdrssuspendidas_wcds_10_tfstpbarserdsc = AV43TFStpBarserDsc ;
      AV74Consultahdrssuspendidas_wcds_11_tfstpbarserdsc_sel = AV44TFStpBarserDsc_Sel ;
      AV75Consultahdrssuspendidas_wcds_12_tfstpcolor = AV45TFStpColor ;
      AV76Consultahdrssuspendidas_wcds_13_tfstpcolor_sel = AV46TFStpColor_Sel ;
      AV77Consultahdrssuspendidas_wcds_14_tfstp_dia = AV47TFStp_Dia ;
      AV78Consultahdrssuspendidas_wcds_15_tfstp_mot = AV49TFStp_Mot ;
      AV79Consultahdrssuspendidas_wcds_16_tfstp_mot_sel = AV50TFStp_Mot_Sel ;
      AV80Consultahdrssuspendidas_wcds_17_tfstp_diaa = AV51TFStp_DiaA ;
      AV81Consultahdrssuspendidas_wcds_18_tfstp_mota = AV53TFStp_MotA ;
      AV82Consultahdrssuspendidas_wcds_19_tfstp_mota_sel = AV54TFStp_MotA_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV66Consultahdrssuspendidas_wcds_3_tfstphdr_sel ,
                                           AV65Consultahdrssuspendidas_wcds_2_tfstphdr ,
                                           AV77Consultahdrssuspendidas_wcds_14_tfstp_dia ,
                                           AV79Consultahdrssuspendidas_wcds_16_tfstp_mot_sel ,
                                           AV78Consultahdrssuspendidas_wcds_15_tfstp_mot ,
                                           AV80Consultahdrssuspendidas_wcds_17_tfstp_diaa ,
                                           AV82Consultahdrssuspendidas_wcds_19_tfstp_mota_sel ,
                                           AV81Consultahdrssuspendidas_wcds_18_tfstp_mota ,
                                           Integer.valueOf(A10746Stp_hdr) ,
                                           Byte.valueOf(A10747Stp_r) ,
                                           A10748Stp_p ,
                                           A10751Stp_Dia ,
                                           A10752Stp_Mot ,
                                           A10756Stp_DiaA ,
                                           A10757Stp_MotA ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) ,
                                           AV64Consultahdrssuspendidas_wcds_1_filterfulltext ,
                                           A13723StpHdr ,
                                           Integer.valueOf(A13726StpClicod) ,
                                           A13727StpCliNom ,
                                           A13724StpBarser ,
                                           A13725StpBarserD ,
                                           A13728StpColor ,
                                           Integer.valueOf(AV67Consultahdrssuspendidas_wcds_4_tfstpclicod) ,
                                           Integer.valueOf(AV68Consultahdrssuspendidas_wcds_5_tfstpclicod_to) ,
                                           AV70Consultahdrssuspendidas_wcds_7_tfstpclinom_sel ,
                                           AV69Consultahdrssuspendidas_wcds_6_tfstpclinom ,
                                           AV72Consultahdrssuspendidas_wcds_9_tfstpbarser_sel ,
                                           AV71Consultahdrssuspendidas_wcds_8_tfstpbarser ,
                                           AV74Consultahdrssuspendidas_wcds_11_tfstpbarserdsc_sel ,
                                           AV73Consultahdrssuspendidas_wcds_10_tfstpbarserdsc ,
                                           AV76Consultahdrssuspendidas_wcds_13_tfstpcolor_sel ,
                                           AV75Consultahdrssuspendidas_wcds_12_tfstpcolor ,
                                           AV56DiaSuspension ,
                                           AV57DiaSuspension_to ,
                                           AV58DiaActivacion ,
                                           AV59DiaActivacion_to ,
                                           AV55Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV64Consultahdrssuspendidas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Consultahdrssuspendidas_wcds_1_filterfulltext), "%", "") ;
      lV64Consultahdrssuspendidas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Consultahdrssuspendidas_wcds_1_filterfulltext), "%", "") ;
      lV64Consultahdrssuspendidas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Consultahdrssuspendidas_wcds_1_filterfulltext), "%", "") ;
      lV64Consultahdrssuspendidas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Consultahdrssuspendidas_wcds_1_filterfulltext), "%", "") ;
      lV64Consultahdrssuspendidas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Consultahdrssuspendidas_wcds_1_filterfulltext), "%", "") ;
      lV64Consultahdrssuspendidas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Consultahdrssuspendidas_wcds_1_filterfulltext), "%", "") ;
      lV64Consultahdrssuspendidas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Consultahdrssuspendidas_wcds_1_filterfulltext), "%", "") ;
      lV64Consultahdrssuspendidas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Consultahdrssuspendidas_wcds_1_filterfulltext), "%", "") ;
      lV69Consultahdrssuspendidas_wcds_6_tfstpclinom = GXutil.padr( GXutil.rtrim( AV69Consultahdrssuspendidas_wcds_6_tfstpclinom), 30, "%") ;
      lV71Consultahdrssuspendidas_wcds_8_tfstpbarser = GXutil.padr( GXutil.rtrim( AV71Consultahdrssuspendidas_wcds_8_tfstpbarser), 16, "%") ;
      lV73Consultahdrssuspendidas_wcds_10_tfstpbarserdsc = GXutil.padr( GXutil.rtrim( AV73Consultahdrssuspendidas_wcds_10_tfstpbarserdsc), 26, "%") ;
      lV75Consultahdrssuspendidas_wcds_12_tfstpcolor = GXutil.padr( GXutil.rtrim( AV75Consultahdrssuspendidas_wcds_12_tfstpcolor), 13, "%") ;
      lV65Consultahdrssuspendidas_wcds_2_tfstphdr = GXutil.padr( GXutil.rtrim( AV65Consultahdrssuspendidas_wcds_2_tfstphdr), 11, "%") ;
      lV78Consultahdrssuspendidas_wcds_15_tfstp_mot = GXutil.concat( GXutil.rtrim( AV78Consultahdrssuspendidas_wcds_15_tfstp_mot), "%", "") ;
      lV81Consultahdrssuspendidas_wcds_18_tfstp_mota = GXutil.concat( GXutil.rtrim( AV81Consultahdrssuspendidas_wcds_18_tfstp_mota), "%", "") ;
      /* Using cursor P09633 */
      pr_default.execute(0, new Object[] {AV55Emprcod, AV64Consultahdrssuspendidas_wcds_1_filterfulltext, lV64Consultahdrssuspendidas_wcds_1_filterfulltext, lV64Consultahdrssuspendidas_wcds_1_filterfulltext, lV64Consultahdrssuspendidas_wcds_1_filterfulltext, lV64Consultahdrssuspendidas_wcds_1_filterfulltext, lV64Consultahdrssuspendidas_wcds_1_filterfulltext, lV64Consultahdrssuspendidas_wcds_1_filterfulltext, lV64Consultahdrssuspendidas_wcds_1_filterfulltext, lV64Consultahdrssuspendidas_wcds_1_filterfulltext, Integer.valueOf(AV67Consultahdrssuspendidas_wcds_4_tfstpclicod), Integer.valueOf(AV67Consultahdrssuspendidas_wcds_4_tfstpclicod), Integer.valueOf(AV68Consultahdrssuspendidas_wcds_5_tfstpclicod_to), Integer.valueOf(AV68Consultahdrssuspendidas_wcds_5_tfstpclicod_to), AV70Consultahdrssuspendidas_wcds_7_tfstpclinom_sel, AV69Consultahdrssuspendidas_wcds_6_tfstpclinom, lV69Consultahdrssuspendidas_wcds_6_tfstpclinom, AV70Consultahdrssuspendidas_wcds_7_tfstpclinom_sel, AV70Consultahdrssuspendidas_wcds_7_tfstpclinom_sel, AV72Consultahdrssuspendidas_wcds_9_tfstpbarser_sel, AV71Consultahdrssuspendidas_wcds_8_tfstpbarser, lV71Consultahdrssuspendidas_wcds_8_tfstpbarser, AV72Consultahdrssuspendidas_wcds_9_tfstpbarser_sel, AV72Consultahdrssuspendidas_wcds_9_tfstpbarser_sel, AV74Consultahdrssuspendidas_wcds_11_tfstpbarserdsc_sel, AV73Consultahdrssuspendidas_wcds_10_tfstpbarserdsc, lV73Consultahdrssuspendidas_wcds_10_tfstpbarserdsc, AV74Consultahdrssuspendidas_wcds_11_tfstpbarserdsc_sel, AV74Consultahdrssuspendidas_wcds_11_tfstpbarserdsc_sel, AV76Consultahdrssuspendidas_wcds_13_tfstpcolor_sel, AV75Consultahdrssuspendidas_wcds_12_tfstpcolor, lV75Consultahdrssuspendidas_wcds_12_tfstpcolor, AV76Consultahdrssuspendidas_wcds_13_tfstpcolor_sel, AV76Consultahdrssuspendidas_wcds_13_tfstpcolor_sel, lV65Consultahdrssuspendidas_wcds_2_tfstphdr, AV66Consultahdrssuspendidas_wcds_3_tfstphdr_sel, AV77Consultahdrssuspendidas_wcds_14_tfstp_dia, lV78Consultahdrssuspendidas_wcds_15_tfstp_mot, AV79Consultahdrssuspendidas_wcds_16_tfstp_mot_sel, AV80Consultahdrssuspendidas_wcds_17_tfstp_diaa, lV81Consultahdrssuspendidas_wcds_18_tfstp_mota, AV82Consultahdrssuspendidas_wcds_19_tfstp_mota_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P09633_A396EmprCod[0] ;
         A10757Stp_MotA = P09633_A10757Stp_MotA[0] ;
         A10756Stp_DiaA = P09633_A10756Stp_DiaA[0] ;
         A10752Stp_Mot = P09633_A10752Stp_Mot[0] ;
         A10751Stp_Dia = P09633_A10751Stp_Dia[0] ;
         A13723StpHdr = P09633_A13723StpHdr[0] ;
         A13728StpColor = P09633_A13728StpColor[0] ;
         n13728StpColor = P09633_n13728StpColor[0] ;
         A13725StpBarserD = P09633_A13725StpBarserD[0] ;
         n13725StpBarserD = P09633_n13725StpBarserD[0] ;
         A13724StpBarser = P09633_A13724StpBarser[0] ;
         n13724StpBarser = P09633_n13724StpBarser[0] ;
         A13727StpCliNom = P09633_A13727StpCliNom[0] ;
         n13727StpCliNom = P09633_n13727StpCliNom[0] ;
         A13726StpClicod = P09633_A13726StpClicod[0] ;
         n13726StpClicod = P09633_n13726StpClicod[0] ;
         A10746Stp_hdr = P09633_A10746Stp_hdr[0] ;
         A10747Stp_r = P09633_A10747Stp_r[0] ;
         A10748Stp_p = P09633_A10748Stp_p[0] ;
         A10750Stp_Lin = P09633_A10750Stp_Lin[0] ;
         A13723StpHdr = P09633_A13723StpHdr[0] ;
         A13728StpColor = P09633_A13728StpColor[0] ;
         n13728StpColor = P09633_n13728StpColor[0] ;
         A13725StpBarserD = P09633_A13725StpBarserD[0] ;
         n13725StpBarserD = P09633_n13725StpBarserD[0] ;
         A13724StpBarser = P09633_A13724StpBarser[0] ;
         n13724StpBarser = P09633_n13724StpBarser[0] ;
         A13726StpClicod = P09633_A13726StpClicod[0] ;
         n13726StpClicod = P09633_n13726StpClicod[0] ;
         A13727StpCliNom = P09633_A13727StpCliNom[0] ;
         n13727StpCliNom = P09633_n13727StpCliNom[0] ;
         if ( (( GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10751Stp_Dia, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))).after( GXutil.resetTime( AV56DiaSuspension )) ) || ( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10751Stp_Dia, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV56DiaSuspension)) )) )
         {
            if ( (( GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10751Stp_Dia, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))).before( GXutil.resetTime( AV57DiaSuspension_to )) ) || ( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10751Stp_Dia, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV57DiaSuspension_to)) )) )
            {
               if ( (( GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10756Stp_DiaA, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))).after( GXutil.resetTime( AV58DiaActivacion )) ) || ( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10756Stp_DiaA, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV58DiaActivacion)) )) || GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV58DiaActivacion)) )
               {
                  if ( (( GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10756Stp_DiaA, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))).before( GXutil.resetTime( AV59DiaActivacion_to )) ) || ( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10756Stp_DiaA, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV59DiaActivacion_to)) )) || GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV59DiaActivacion_to)) )
                  {
                     AV14TextFileLine = "" ;
                     /* Execute user subroutine: 'BEFOREWRITELINE' */
                     S162 ();
                     if ( returnInSub )
                     {
                        pr_default.close(0);
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
                        new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13723StpHdr, ";", ","), GXv_char3) ;
                        consultahdrssuspendidas_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
                        AV14TextFileLine += GXt_char2 ;
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        AV14TextFileLine += ";" ;
                        AV14TextFileLine += GXutil.str( A13726StpClicod, 6, 0) ;
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        AV14TextFileLine += ";" ;
                        GXt_char2 = AV14TextFileLine ;
                        GXv_char3[0] = GXt_char2 ;
                        new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13727StpCliNom, ";", ","), GXv_char3) ;
                        consultahdrssuspendidas_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
                        AV14TextFileLine += GXt_char2 ;
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        AV14TextFileLine += ";" ;
                        GXt_char2 = AV14TextFileLine ;
                        GXv_char3[0] = GXt_char2 ;
                        new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13724StpBarser, ";", ","), GXv_char3) ;
                        consultahdrssuspendidas_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
                        AV14TextFileLine += GXt_char2 ;
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        AV14TextFileLine += ";" ;
                        GXt_char2 = AV14TextFileLine ;
                        GXv_char3[0] = GXt_char2 ;
                        new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13725StpBarserD, ";", ","), GXv_char3) ;
                        consultahdrssuspendidas_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
                        AV14TextFileLine += GXt_char2 ;
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        AV14TextFileLine += ";" ;
                        GXt_char2 = AV14TextFileLine ;
                        GXv_char3[0] = GXt_char2 ;
                        new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13728StpColor, ";", ","), GXv_char3) ;
                        consultahdrssuspendidas_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
                        AV14TextFileLine += GXt_char2 ;
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        AV14TextFileLine += ";" ;
                        AV14TextFileLine += localUtil.ttoc( A10751Stp_Dia, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        AV14TextFileLine += ";" ;
                        AV31NewLine = GXutil.chr( (short)(10)) ;
                        GXt_char2 = AV14TextFileLine ;
                        GXv_char3[0] = GXt_char2 ;
                        new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( GXutil.strReplace( A10752Stp_Mot, ";", ","), AV31NewLine, " "), GXv_char3) ;
                        consultahdrssuspendidas_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
                        AV14TextFileLine += GXt_char2 ;
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        AV14TextFileLine += ";" ;
                        AV14TextFileLine += localUtil.ttoc( A10756Stp_DiaA, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        AV14TextFileLine += ";" ;
                        AV31NewLine = GXutil.chr( (short)(10)) ;
                        GXt_char2 = AV14TextFileLine ;
                        GXv_char3[0] = GXt_char2 ;
                        new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( GXutil.strReplace( A10757Stp_MotA, ";", ","), AV31NewLine, " "), GXv_char3) ;
                        consultahdrssuspendidas_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
                        AV14TextFileLine += GXt_char2 ;
                     }
                     /* Execute user subroutine: 'AFTERWRITELINE' */
                     S172 ();
                     if ( returnInSub )
                     {
                        pr_default.close(0);
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
                  }
               }
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=ConsultaHdrsSuspendidas_WCExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "StpHdr", "", "Hdr", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "StpClicod", "", "Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "StpCliNom", "", "Nombre", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "StpBarser", "", "Articulo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "StpBarserDsc", "", "Descripcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "StpColor", "", "Color", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Stp_Dia", "", "Dia Suspension", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Stp_Mot", "", "Motivo Suspension", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Stp_DiaA", "", "Dia Activacion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Stp_MotA", "", "Motivo Activacion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "ConsultaHdrsSuspendidas_WCColumnsSelector", GXv_char3) ;
      consultahdrssuspendidas_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("ConsultaHdrsSuspendidas_WCGridState"), "") == 0 )
      {
         AV33GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "ConsultaHdrsSuspendidas_WCGridState"), null, null);
      }
      else
      {
         AV33GridState.fromxml(AV19Session.getValue("ConsultaHdrsSuspendidas_WCGridState"), null, null);
      }
      AV28OrderedBy = AV33GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV33GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV83GXV1 = 1 ;
      while ( AV83GXV1 <= AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV34GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV83GXV1));
         if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV30FilterFullText = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPHDR") == 0 )
         {
            AV35TFStpHdr = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPHDR_SEL") == 0 )
         {
            AV36TFStpHdr_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPCLICOD") == 0 )
         {
            AV37TFStpClicod = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV38TFStpClicod_To = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPCLINOM") == 0 )
         {
            AV39TFStpCliNom = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPCLINOM_SEL") == 0 )
         {
            AV40TFStpCliNom_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPBARSER") == 0 )
         {
            AV41TFStpBarser = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPBARSER_SEL") == 0 )
         {
            AV42TFStpBarser_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPBARSERDSC") == 0 )
         {
            AV43TFStpBarserDsc = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPBARSERDSC_SEL") == 0 )
         {
            AV44TFStpBarserDsc_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPCOLOR") == 0 )
         {
            AV45TFStpColor = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPCOLOR_SEL") == 0 )
         {
            AV46TFStpColor_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTP_DIA") == 0 )
         {
            AV47TFStp_Dia = localUtil.ctot( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTP_MOT") == 0 )
         {
            AV49TFStp_Mot = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTP_MOT_SEL") == 0 )
         {
            AV50TFStp_Mot_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTP_DIAA") == 0 )
         {
            AV51TFStp_DiaA = localUtil.ctot( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTP_MOTA") == 0 )
         {
            AV53TFStp_MotA = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTP_MOTA_SEL") == 0 )
         {
            AV54TFStp_MotA_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV55Emprcod = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&DIASUSPENSION") == 0 )
         {
            AV56DiaSuspension = localUtil.ctod( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&DIASUSPENSION_TO") == 0 )
         {
            AV57DiaSuspension_to = localUtil.ctod( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&DIAACTIVACION") == 0 )
         {
            AV58DiaActivacion = localUtil.ctod( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&DIAACTIVACION_TO") == 0 )
         {
            AV59DiaActivacion_to = localUtil.ctod( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         AV83GXV1 = (int)(AV83GXV1+1) ;
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
      A13723StpHdr = "" ;
      A13727StpCliNom = "" ;
      A13724StpBarser = "" ;
      A13725StpBarserD = "" ;
      A13728StpColor = "" ;
      A10751Stp_Dia = GXutil.resetTime( GXutil.nullDate() );
      A10752Stp_Mot = "" ;
      A10756Stp_DiaA = GXutil.resetTime( GXutil.nullDate() );
      A10757Stp_MotA = "" ;
      AV64Consultahdrssuspendidas_wcds_1_filterfulltext = "" ;
      AV30FilterFullText = "" ;
      AV65Consultahdrssuspendidas_wcds_2_tfstphdr = "" ;
      AV35TFStpHdr = "" ;
      AV66Consultahdrssuspendidas_wcds_3_tfstphdr_sel = "" ;
      AV36TFStpHdr_Sel = "" ;
      AV69Consultahdrssuspendidas_wcds_6_tfstpclinom = "" ;
      AV39TFStpCliNom = "" ;
      AV70Consultahdrssuspendidas_wcds_7_tfstpclinom_sel = "" ;
      AV40TFStpCliNom_Sel = "" ;
      AV71Consultahdrssuspendidas_wcds_8_tfstpbarser = "" ;
      AV41TFStpBarser = "" ;
      AV72Consultahdrssuspendidas_wcds_9_tfstpbarser_sel = "" ;
      AV42TFStpBarser_Sel = "" ;
      AV73Consultahdrssuspendidas_wcds_10_tfstpbarserdsc = "" ;
      AV43TFStpBarserDsc = "" ;
      AV74Consultahdrssuspendidas_wcds_11_tfstpbarserdsc_sel = "" ;
      AV44TFStpBarserDsc_Sel = "" ;
      AV75Consultahdrssuspendidas_wcds_12_tfstpcolor = "" ;
      AV45TFStpColor = "" ;
      AV76Consultahdrssuspendidas_wcds_13_tfstpcolor_sel = "" ;
      AV46TFStpColor_Sel = "" ;
      AV77Consultahdrssuspendidas_wcds_14_tfstp_dia = GXutil.resetTime( GXutil.nullDate() );
      AV47TFStp_Dia = GXutil.resetTime( GXutil.nullDate() );
      AV78Consultahdrssuspendidas_wcds_15_tfstp_mot = "" ;
      AV49TFStp_Mot = "" ;
      AV79Consultahdrssuspendidas_wcds_16_tfstp_mot_sel = "" ;
      AV50TFStp_Mot_Sel = "" ;
      AV80Consultahdrssuspendidas_wcds_17_tfstp_diaa = GXutil.resetTime( GXutil.nullDate() );
      AV51TFStp_DiaA = GXutil.resetTime( GXutil.nullDate() );
      AV81Consultahdrssuspendidas_wcds_18_tfstp_mota = "" ;
      AV53TFStp_MotA = "" ;
      AV82Consultahdrssuspendidas_wcds_19_tfstp_mota_sel = "" ;
      AV54TFStp_MotA_Sel = "" ;
      lV64Consultahdrssuspendidas_wcds_1_filterfulltext = "" ;
      lV69Consultahdrssuspendidas_wcds_6_tfstpclinom = "" ;
      lV71Consultahdrssuspendidas_wcds_8_tfstpbarser = "" ;
      lV73Consultahdrssuspendidas_wcds_10_tfstpbarserdsc = "" ;
      lV75Consultahdrssuspendidas_wcds_12_tfstpcolor = "" ;
      scmdbuf = "" ;
      lV65Consultahdrssuspendidas_wcds_2_tfstphdr = "" ;
      lV78Consultahdrssuspendidas_wcds_15_tfstp_mot = "" ;
      lV81Consultahdrssuspendidas_wcds_18_tfstp_mota = "" ;
      A10748Stp_p = "" ;
      AV56DiaSuspension = GXutil.nullDate() ;
      AV57DiaSuspension_to = GXutil.nullDate() ;
      AV58DiaActivacion = GXutil.nullDate() ;
      AV59DiaActivacion_to = GXutil.nullDate() ;
      AV55Emprcod = "" ;
      A396EmprCod = "" ;
      P09633_A129BarCod = new int[1] ;
      P09633_A132BarCodReo = new byte[1] ;
      P09633_A130BarCodPar = new String[] {""} ;
      P09633_A396EmprCod = new String[] {""} ;
      P09633_A10757Stp_MotA = new String[] {""} ;
      P09633_A10756Stp_DiaA = new java.util.Date[] {GXutil.nullDate()} ;
      P09633_A10752Stp_Mot = new String[] {""} ;
      P09633_A10751Stp_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      P09633_A13723StpHdr = new String[] {""} ;
      P09633_A13728StpColor = new String[] {""} ;
      P09633_n13728StpColor = new boolean[] {false} ;
      P09633_A13725StpBarserD = new String[] {""} ;
      P09633_n13725StpBarserD = new boolean[] {false} ;
      P09633_A13724StpBarser = new String[] {""} ;
      P09633_n13724StpBarser = new boolean[] {false} ;
      P09633_A13727StpCliNom = new String[] {""} ;
      P09633_n13727StpCliNom = new boolean[] {false} ;
      P09633_A13726StpClicod = new int[1] ;
      P09633_n13726StpClicod = new boolean[] {false} ;
      P09633_A10746Stp_hdr = new int[1] ;
      P09633_A10747Stp_r = new byte[1] ;
      P09633_A10748Stp_p = new String[] {""} ;
      P09633_A10750Stp_Lin = new short[1] ;
      AV31NewLine = "" ;
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
      pr_default = new DataStoreProvider(context, remoteHandle, new app.consultahdrssuspendidas_wcexportcsv__default(),
         new Object[] {
             new Object[] {
            P09633_A129BarCod, P09633_A132BarCodReo, P09633_A130BarCodPar, P09633_A396EmprCod, P09633_A10757Stp_MotA, P09633_A10756Stp_DiaA, P09633_A10752Stp_Mot, P09633_A10751Stp_Dia, P09633_A13723StpHdr, P09633_A13728StpColor,
            P09633_n13728StpColor, P09633_A13725StpBarserD, P09633_n13725StpBarserD, P09633_A13724StpBarser, P09633_n13724StpBarser, P09633_A13727StpCliNom, P09633_n13727StpCliNom, P09633_A13726StpClicod, P09633_n13726StpClicod, P09633_A10746Stp_hdr,
            P09633_A10747Stp_r, P09633_A10748Stp_p, P09633_A10750Stp_Lin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A10747Stp_r ;
   private short gxcookieaux ;
   private short AV28OrderedBy ;
   private short A10750Stp_Lin ;
   private short Gx_err ;
   private int AV13Random ;
   private int A13726StpClicod ;
   private int AV67Consultahdrssuspendidas_wcds_4_tfstpclicod ;
   private int AV37TFStpClicod ;
   private int AV68Consultahdrssuspendidas_wcds_5_tfstpclicod_to ;
   private int AV38TFStpClicod_To ;
   private int A10746Stp_hdr ;
   private int AV83GXV1 ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A13723StpHdr ;
   private String A13727StpCliNom ;
   private String A13724StpBarser ;
   private String A13725StpBarserD ;
   private String A13728StpColor ;
   private String AV65Consultahdrssuspendidas_wcds_2_tfstphdr ;
   private String AV35TFStpHdr ;
   private String AV66Consultahdrssuspendidas_wcds_3_tfstphdr_sel ;
   private String AV36TFStpHdr_Sel ;
   private String AV69Consultahdrssuspendidas_wcds_6_tfstpclinom ;
   private String AV39TFStpCliNom ;
   private String AV70Consultahdrssuspendidas_wcds_7_tfstpclinom_sel ;
   private String AV40TFStpCliNom_Sel ;
   private String AV71Consultahdrssuspendidas_wcds_8_tfstpbarser ;
   private String AV41TFStpBarser ;
   private String AV72Consultahdrssuspendidas_wcds_9_tfstpbarser_sel ;
   private String AV42TFStpBarser_Sel ;
   private String AV73Consultahdrssuspendidas_wcds_10_tfstpbarserdsc ;
   private String AV43TFStpBarserDsc ;
   private String AV74Consultahdrssuspendidas_wcds_11_tfstpbarserdsc_sel ;
   private String AV44TFStpBarserDsc_Sel ;
   private String AV75Consultahdrssuspendidas_wcds_12_tfstpcolor ;
   private String AV45TFStpColor ;
   private String AV76Consultahdrssuspendidas_wcds_13_tfstpcolor_sel ;
   private String AV46TFStpColor_Sel ;
   private String lV69Consultahdrssuspendidas_wcds_6_tfstpclinom ;
   private String lV71Consultahdrssuspendidas_wcds_8_tfstpbarser ;
   private String lV73Consultahdrssuspendidas_wcds_10_tfstpbarserdsc ;
   private String lV75Consultahdrssuspendidas_wcds_12_tfstpcolor ;
   private String scmdbuf ;
   private String lV65Consultahdrssuspendidas_wcds_2_tfstphdr ;
   private String A10748Stp_p ;
   private String AV55Emprcod ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private java.util.Date A10751Stp_Dia ;
   private java.util.Date A10756Stp_DiaA ;
   private java.util.Date AV77Consultahdrssuspendidas_wcds_14_tfstp_dia ;
   private java.util.Date AV47TFStp_Dia ;
   private java.util.Date AV80Consultahdrssuspendidas_wcds_17_tfstp_diaa ;
   private java.util.Date AV51TFStp_DiaA ;
   private java.util.Date AV56DiaSuspension ;
   private java.util.Date AV57DiaSuspension_to ;
   private java.util.Date AV58DiaActivacion ;
   private java.util.Date AV59DiaActivacion_to ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean n13728StpColor ;
   private boolean n13725StpBarserD ;
   private boolean n13724StpBarser ;
   private boolean n13727StpCliNom ;
   private boolean n13726StpClicod ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String A10752Stp_Mot ;
   private String A10757Stp_MotA ;
   private String AV64Consultahdrssuspendidas_wcds_1_filterfulltext ;
   private String AV30FilterFullText ;
   private String AV78Consultahdrssuspendidas_wcds_15_tfstp_mot ;
   private String AV49TFStp_Mot ;
   private String AV79Consultahdrssuspendidas_wcds_16_tfstp_mot_sel ;
   private String AV50TFStp_Mot_Sel ;
   private String AV81Consultahdrssuspendidas_wcds_18_tfstp_mota ;
   private String AV53TFStp_MotA ;
   private String AV82Consultahdrssuspendidas_wcds_19_tfstp_mota_sel ;
   private String AV54TFStp_MotA_Sel ;
   private String lV64Consultahdrssuspendidas_wcds_1_filterfulltext ;
   private String lV78Consultahdrssuspendidas_wcds_15_tfstp_mot ;
   private String lV81Consultahdrssuspendidas_wcds_18_tfstp_mota ;
   private String AV31NewLine ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private int[] P09633_A129BarCod ;
   private byte[] P09633_A132BarCodReo ;
   private String[] P09633_A130BarCodPar ;
   private String[] P09633_A396EmprCod ;
   private String[] P09633_A10757Stp_MotA ;
   private java.util.Date[] P09633_A10756Stp_DiaA ;
   private String[] P09633_A10752Stp_Mot ;
   private java.util.Date[] P09633_A10751Stp_Dia ;
   private String[] P09633_A13723StpHdr ;
   private String[] P09633_A13728StpColor ;
   private boolean[] P09633_n13728StpColor ;
   private String[] P09633_A13725StpBarserD ;
   private boolean[] P09633_n13725StpBarserD ;
   private String[] P09633_A13724StpBarser ;
   private boolean[] P09633_n13724StpBarser ;
   private String[] P09633_A13727StpCliNom ;
   private boolean[] P09633_n13727StpCliNom ;
   private int[] P09633_A13726StpClicod ;
   private boolean[] P09633_n13726StpClicod ;
   private int[] P09633_A10746Stp_hdr ;
   private byte[] P09633_A10747Stp_r ;
   private String[] P09633_A10748Stp_p ;
   private short[] P09633_A10750Stp_Lin ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV33GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV34GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
}

final  class consultahdrssuspendidas_wcexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09633( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV66Consultahdrssuspendidas_wcds_3_tfstphdr_sel ,
                                          String AV65Consultahdrssuspendidas_wcds_2_tfstphdr ,
                                          java.util.Date AV77Consultahdrssuspendidas_wcds_14_tfstp_dia ,
                                          String AV79Consultahdrssuspendidas_wcds_16_tfstp_mot_sel ,
                                          String AV78Consultahdrssuspendidas_wcds_15_tfstp_mot ,
                                          java.util.Date AV80Consultahdrssuspendidas_wcds_17_tfstp_diaa ,
                                          String AV82Consultahdrssuspendidas_wcds_19_tfstp_mota_sel ,
                                          String AV81Consultahdrssuspendidas_wcds_18_tfstp_mota ,
                                          int A10746Stp_hdr ,
                                          byte A10747Stp_r ,
                                          String A10748Stp_p ,
                                          java.util.Date A10751Stp_Dia ,
                                          String A10752Stp_Mot ,
                                          java.util.Date A10756Stp_DiaA ,
                                          String A10757Stp_MotA ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc ,
                                          String AV64Consultahdrssuspendidas_wcds_1_filterfulltext ,
                                          String A13723StpHdr ,
                                          int A13726StpClicod ,
                                          String A13727StpCliNom ,
                                          String A13724StpBarser ,
                                          String A13725StpBarserD ,
                                          String A13728StpColor ,
                                          int AV67Consultahdrssuspendidas_wcds_4_tfstpclicod ,
                                          int AV68Consultahdrssuspendidas_wcds_5_tfstpclicod_to ,
                                          String AV70Consultahdrssuspendidas_wcds_7_tfstpclinom_sel ,
                                          String AV69Consultahdrssuspendidas_wcds_6_tfstpclinom ,
                                          String AV72Consultahdrssuspendidas_wcds_9_tfstpbarser_sel ,
                                          String AV71Consultahdrssuspendidas_wcds_8_tfstpbarser ,
                                          String AV74Consultahdrssuspendidas_wcds_11_tfstpbarserdsc_sel ,
                                          String AV73Consultahdrssuspendidas_wcds_10_tfstpbarserdsc ,
                                          String AV76Consultahdrssuspendidas_wcds_13_tfstpcolor_sel ,
                                          String AV75Consultahdrssuspendidas_wcds_12_tfstpcolor ,
                                          java.util.Date AV56DiaSuspension ,
                                          java.util.Date AV57DiaSuspension_to ,
                                          java.util.Date AV58DiaActivacion ,
                                          java.util.Date AV59DiaActivacion_to ,
                                          String AV55Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[42];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T3.BarCod, T3.BarCodReo, T3.BarCodPar, T1.EmprCod, T1.Stp_MotA, T1.Stp_DiaA, T1.Stp_Mot, T1.Stp_Dia, RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.Stp_hdr,'99999990'), 2)))" ;
      scmdbuf += " || '-' || SUBSTR(TO_CHAR(T2.Stp_r,'90'), 2) || T2.Stp_p AS StpHdr, COALESCE( T3.BarColNom, ' ') AS StpColor, COALESCE( T3.BarSerDsc, ' ') AS StpBarserD, COALESCE(" ;
      scmdbuf += " T3.BarSer, ' ') AS StpBarser, COALESCE( T4.StpCliNom, ' ') AS StpCliNom, COALESCE( T3.CliCod, 0) AS StpClicod, T1.Stp_hdr, T1.Stp_r, T1.Stp_p, T1.Stp_Lin FROM (((TXPHDSTO1" ;
      scmdbuf += " T1 INNER JOIN TXPHDSTOP T2 ON T2.EmprCod = T1.EmprCod AND T2.Stp_hdr = T1.Stp_hdr AND T2.Stp_r = T1.Stp_r AND T2.Stp_p = T1.Stp_p) LEFT JOIN TXPBARCAD T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.BarCod = T1.Stp_hdr AND T3.BarCodReo = T1.Stp_r AND T3.BarCodPar = T1.Stp_p) LEFT JOIN (SELECT T6.CliNom AS StpCliNom, T5.EmprCod, T5.BarCod," ;
      scmdbuf += " T7.Stp_hdr, T5.BarCodReo, T7.Stp_r, T5.BarCodPar, T7.Stp_p FROM ((TXPBARCAD T5 LEFT JOIN TXPCLIENT T6 ON T6.EmprCod = T5.EmprCod AND T6.CliCod = T5.CliCod) INNER" ;
      scmdbuf += " JOIN TXPHDSTOP T7 ON T7.EmprCod = T5.EmprCod) WHERE T5.BarCod = T7.Stp_hdr and T5.BarCodReo = T7.Stp_r and T5.BarCodPar = T7.Stp_p ) T4 ON T4.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T4.Stp_hdr = T1.Stp_hdr AND T4.Stp_r = T1.Stp_r AND T4.Stp_p = T1.Stp_p)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T2.Stp_r,'90'), 2) || T2.Stp_p) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T3.CliCod, 0),'999990'), 2) like '%' || ?) or ( UPPER(COALESCE( T4.StpCliNom, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarSer, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarSerDsc, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarColNom, ' ')) like '%' || UPPER(?)) or ( UPPER(T1.Stp_Mot) like '%' || UPPER(?)) or ( UPPER(T1.Stp_MotA) like '%' || UPPER(?))))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.CliCod, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.CliCod, 0) <= ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.StpCliNom, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.StpCliNom, ' ') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T3.BarSer, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T3.BarSer, ' ') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T3.BarSerDsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T3.BarSerDsc, ' ') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T3.BarColNom, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T3.BarColNom, ' ') = ?))");
      if ( (GXutil.strcmp("", AV66Consultahdrssuspendidas_wcds_3_tfstphdr_sel)==0) && ( ! (GXutil.strcmp("", AV65Consultahdrssuspendidas_wcds_2_tfstphdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T1.Stp_r,'90'), 2) || T1.Stp_p) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Consultahdrssuspendidas_wcds_3_tfstphdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T1.Stp_r,'90'), 2) || T1.Stp_p = ?)");
      }
      else
      {
         GXv_int6[35] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV77Consultahdrssuspendidas_wcds_14_tfstp_dia) )
      {
         addWhere(sWhereString, "(T1.Stp_Dia >= ?)");
      }
      else
      {
         GXv_int6[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Consultahdrssuspendidas_wcds_16_tfstp_mot_sel)==0) && ( ! (GXutil.strcmp("", AV78Consultahdrssuspendidas_wcds_15_tfstp_mot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Stp_Mot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Consultahdrssuspendidas_wcds_16_tfstp_mot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Stp_Mot = ?)");
      }
      else
      {
         GXv_int6[38] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV80Consultahdrssuspendidas_wcds_17_tfstp_diaa) )
      {
         addWhere(sWhereString, "(T1.Stp_DiaA >= ?)");
      }
      else
      {
         GXv_int6[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Consultahdrssuspendidas_wcds_19_tfstp_mota_sel)==0) && ( ! (GXutil.strcmp("", AV81Consultahdrssuspendidas_wcds_18_tfstp_mota)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Stp_MotA) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Consultahdrssuspendidas_wcds_19_tfstp_mota_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Stp_MotA = ?)");
      }
      else
      {
         GXv_int6[41] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Stp_Dia" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Stp_Dia DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Stp_Mot" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Stp_Mot DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Stp_DiaA" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Stp_DiaA DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Stp_MotA" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Stp_MotA DESC" ;
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
                  return conditional_P09633(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (java.util.Date)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.util.Date)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).byteValue() , (String)dynConstraints[10] , (java.util.Date)dynConstraints[11] , (String)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).shortValue() , ((Boolean) dynConstraints[16]).booleanValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).intValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (java.util.Date)dynConstraints[34] , (java.util.Date)dynConstraints[35] , (java.util.Date)dynConstraints[36] , (java.util.Date)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09633", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6);
               ((String[]) buf[6])[0] = rslt.getVarchar(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 11);
               ((String[]) buf[9])[0] = rslt.getString(10, 13);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(11, 26);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(12, 16);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(14);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((int[]) buf[19])[0] = rslt.getInt(15);
               ((byte[]) buf[20])[0] = rslt.getByte(16);
               ((String[]) buf[21])[0] = rslt.getString(17, 1);
               ((short[]) buf[22])[0] = rslt.getShort(18);
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
                  stmt.setString(sIdx, (String)parms[42], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 16);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 16);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 26);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 26);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 26);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 26);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 13);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 13);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 13);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 13);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 11);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 11);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[78], false);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 300);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 300);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[81], false);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[82], 300);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[83], 300);
               }
               return;
      }
   }

}

