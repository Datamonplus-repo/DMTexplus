package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class activarhdr_wcexportcsv_impl extends GXWebProcedure
{
   public activarhdr_wcexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "ActivarHdr_WCExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("ActivarHdr_WCColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("ActivarHdr_WCColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+"#" : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Dia", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Motivo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Hdr", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Articulo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Color", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV59Activarhdr_wcds_1_filterfulltext = AV33FilterFullText ;
      AV60Activarhdr_wcds_2_tfstp_lin = AV38TFStp_Lin ;
      AV61Activarhdr_wcds_3_tfstp_lin_to = AV39TFStp_Lin_To ;
      AV62Activarhdr_wcds_4_tfstp_dia = AV40TFStp_Dia ;
      AV63Activarhdr_wcds_5_tfstp_mot = AV42TFStp_Mot ;
      AV64Activarhdr_wcds_6_tfstp_mot_sel = AV43TFStp_Mot_Sel ;
      AV65Activarhdr_wcds_7_tfstphdr = AV44TFStpHdr ;
      AV66Activarhdr_wcds_8_tfstphdr_sel = AV45TFStpHdr_Sel ;
      AV67Activarhdr_wcds_9_tfstpclicod = AV46TFStpClicod ;
      AV68Activarhdr_wcds_10_tfstpclicod_to = AV47TFStpClicod_To ;
      AV69Activarhdr_wcds_11_tfstpclinom = AV48TFStpCliNom ;
      AV70Activarhdr_wcds_12_tfstpclinom_sel = AV49TFStpCliNom_Sel ;
      AV71Activarhdr_wcds_13_tfstpbarser = AV50TFStpBarser ;
      AV72Activarhdr_wcds_14_tfstpbarser_sel = AV51TFStpBarser_Sel ;
      AV73Activarhdr_wcds_15_tfstpbarserdsc = AV52TFStpBarserDsc ;
      AV74Activarhdr_wcds_16_tfstpbarserdsc_sel = AV53TFStpBarserDsc_Sel ;
      AV75Activarhdr_wcds_17_tfstpcolor = AV54TFStpColor ;
      AV76Activarhdr_wcds_18_tfstpcolor_sel = AV55TFStpColor_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Short.valueOf(AV60Activarhdr_wcds_2_tfstp_lin) ,
                                           Short.valueOf(AV61Activarhdr_wcds_3_tfstp_lin_to) ,
                                           AV62Activarhdr_wcds_4_tfstp_dia ,
                                           AV64Activarhdr_wcds_6_tfstp_mot_sel ,
                                           AV63Activarhdr_wcds_5_tfstp_mot ,
                                           AV66Activarhdr_wcds_8_tfstphdr_sel ,
                                           AV65Activarhdr_wcds_7_tfstphdr ,
                                           Short.valueOf(A10750Stp_Lin) ,
                                           A10751Stp_Dia ,
                                           A10752Stp_Mot ,
                                           Integer.valueOf(A10746Stp_hdr) ,
                                           Byte.valueOf(A10747Stp_r) ,
                                           A10748Stp_p ,
                                           Short.valueOf(AV31OrderedBy) ,
                                           Boolean.valueOf(AV32OrderedDsc) ,
                                           AV59Activarhdr_wcds_1_filterfulltext ,
                                           A13723StpHdr ,
                                           Integer.valueOf(A13726StpClicod) ,
                                           A13727StpCliNom ,
                                           A13724StpBarser ,
                                           A13725StpBarserD ,
                                           A13728StpColor ,
                                           Integer.valueOf(AV67Activarhdr_wcds_9_tfstpclicod) ,
                                           Integer.valueOf(AV68Activarhdr_wcds_10_tfstpclicod_to) ,
                                           AV70Activarhdr_wcds_12_tfstpclinom_sel ,
                                           AV69Activarhdr_wcds_11_tfstpclinom ,
                                           AV72Activarhdr_wcds_14_tfstpbarser_sel ,
                                           AV71Activarhdr_wcds_13_tfstpbarser ,
                                           AV74Activarhdr_wcds_16_tfstpbarserdsc_sel ,
                                           AV73Activarhdr_wcds_15_tfstpbarserdsc ,
                                           AV76Activarhdr_wcds_18_tfstpcolor_sel ,
                                           AV75Activarhdr_wcds_17_tfstpcolor ,
                                           AV29DiaInicial ,
                                           AV30DiaInicial_to ,
                                           Byte.valueOf(A10755Stp_Est) ,
                                           AV28Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV59Activarhdr_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Activarhdr_wcds_1_filterfulltext), "%", "") ;
      lV59Activarhdr_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Activarhdr_wcds_1_filterfulltext), "%", "") ;
      lV59Activarhdr_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Activarhdr_wcds_1_filterfulltext), "%", "") ;
      lV59Activarhdr_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Activarhdr_wcds_1_filterfulltext), "%", "") ;
      lV59Activarhdr_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Activarhdr_wcds_1_filterfulltext), "%", "") ;
      lV59Activarhdr_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Activarhdr_wcds_1_filterfulltext), "%", "") ;
      lV59Activarhdr_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Activarhdr_wcds_1_filterfulltext), "%", "") ;
      lV59Activarhdr_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Activarhdr_wcds_1_filterfulltext), "%", "") ;
      lV69Activarhdr_wcds_11_tfstpclinom = GXutil.padr( GXutil.rtrim( AV69Activarhdr_wcds_11_tfstpclinom), 30, "%") ;
      lV71Activarhdr_wcds_13_tfstpbarser = GXutil.padr( GXutil.rtrim( AV71Activarhdr_wcds_13_tfstpbarser), 16, "%") ;
      lV73Activarhdr_wcds_15_tfstpbarserdsc = GXutil.padr( GXutil.rtrim( AV73Activarhdr_wcds_15_tfstpbarserdsc), 26, "%") ;
      lV75Activarhdr_wcds_17_tfstpcolor = GXutil.padr( GXutil.rtrim( AV75Activarhdr_wcds_17_tfstpcolor), 13, "%") ;
      lV63Activarhdr_wcds_5_tfstp_mot = GXutil.concat( GXutil.rtrim( AV63Activarhdr_wcds_5_tfstp_mot), "%", "") ;
      lV65Activarhdr_wcds_7_tfstphdr = GXutil.padr( GXutil.rtrim( AV65Activarhdr_wcds_7_tfstphdr), 11, "%") ;
      /* Using cursor P09603 */
      pr_default.execute(0, new Object[] {AV28Emprcod, AV59Activarhdr_wcds_1_filterfulltext, lV59Activarhdr_wcds_1_filterfulltext, lV59Activarhdr_wcds_1_filterfulltext, lV59Activarhdr_wcds_1_filterfulltext, lV59Activarhdr_wcds_1_filterfulltext, lV59Activarhdr_wcds_1_filterfulltext, lV59Activarhdr_wcds_1_filterfulltext, lV59Activarhdr_wcds_1_filterfulltext, lV59Activarhdr_wcds_1_filterfulltext, Integer.valueOf(AV67Activarhdr_wcds_9_tfstpclicod), Integer.valueOf(AV67Activarhdr_wcds_9_tfstpclicod), Integer.valueOf(AV68Activarhdr_wcds_10_tfstpclicod_to), Integer.valueOf(AV68Activarhdr_wcds_10_tfstpclicod_to), AV70Activarhdr_wcds_12_tfstpclinom_sel, AV69Activarhdr_wcds_11_tfstpclinom, lV69Activarhdr_wcds_11_tfstpclinom, AV70Activarhdr_wcds_12_tfstpclinom_sel, AV70Activarhdr_wcds_12_tfstpclinom_sel, AV72Activarhdr_wcds_14_tfstpbarser_sel, AV71Activarhdr_wcds_13_tfstpbarser, lV71Activarhdr_wcds_13_tfstpbarser, AV72Activarhdr_wcds_14_tfstpbarser_sel, AV72Activarhdr_wcds_14_tfstpbarser_sel, AV74Activarhdr_wcds_16_tfstpbarserdsc_sel, AV73Activarhdr_wcds_15_tfstpbarserdsc, lV73Activarhdr_wcds_15_tfstpbarserdsc, AV74Activarhdr_wcds_16_tfstpbarserdsc_sel, AV74Activarhdr_wcds_16_tfstpbarserdsc_sel, AV76Activarhdr_wcds_18_tfstpcolor_sel, AV75Activarhdr_wcds_17_tfstpcolor, lV75Activarhdr_wcds_17_tfstpcolor, AV76Activarhdr_wcds_18_tfstpcolor_sel, AV76Activarhdr_wcds_18_tfstpcolor_sel, Short.valueOf(AV60Activarhdr_wcds_2_tfstp_lin), Short.valueOf(AV61Activarhdr_wcds_3_tfstp_lin_to), AV62Activarhdr_wcds_4_tfstp_dia, lV63Activarhdr_wcds_5_tfstp_mot, AV64Activarhdr_wcds_6_tfstp_mot_sel, lV65Activarhdr_wcds_7_tfstphdr, AV66Activarhdr_wcds_8_tfstphdr_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A10755Stp_Est = P09603_A10755Stp_Est[0] ;
         A396EmprCod = P09603_A396EmprCod[0] ;
         A13723StpHdr = P09603_A13723StpHdr[0] ;
         A10752Stp_Mot = P09603_A10752Stp_Mot[0] ;
         A10751Stp_Dia = P09603_A10751Stp_Dia[0] ;
         A10750Stp_Lin = P09603_A10750Stp_Lin[0] ;
         A13728StpColor = P09603_A13728StpColor[0] ;
         n13728StpColor = P09603_n13728StpColor[0] ;
         A13725StpBarserD = P09603_A13725StpBarserD[0] ;
         n13725StpBarserD = P09603_n13725StpBarserD[0] ;
         A13724StpBarser = P09603_A13724StpBarser[0] ;
         n13724StpBarser = P09603_n13724StpBarser[0] ;
         A13727StpCliNom = P09603_A13727StpCliNom[0] ;
         n13727StpCliNom = P09603_n13727StpCliNom[0] ;
         A13726StpClicod = P09603_A13726StpClicod[0] ;
         n13726StpClicod = P09603_n13726StpClicod[0] ;
         A10746Stp_hdr = P09603_A10746Stp_hdr[0] ;
         A10747Stp_r = P09603_A10747Stp_r[0] ;
         A10748Stp_p = P09603_A10748Stp_p[0] ;
         A13723StpHdr = P09603_A13723StpHdr[0] ;
         A13728StpColor = P09603_A13728StpColor[0] ;
         n13728StpColor = P09603_n13728StpColor[0] ;
         A13725StpBarserD = P09603_A13725StpBarserD[0] ;
         n13725StpBarserD = P09603_n13725StpBarserD[0] ;
         A13724StpBarser = P09603_A13724StpBarser[0] ;
         n13724StpBarser = P09603_n13724StpBarser[0] ;
         A13726StpClicod = P09603_A13726StpClicod[0] ;
         n13726StpClicod = P09603_n13726StpClicod[0] ;
         A13727StpCliNom = P09603_A13727StpCliNom[0] ;
         n13727StpCliNom = P09603_n13727StpCliNom[0] ;
         if ( (( GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10751Stp_Dia, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))).after( GXutil.resetTime( AV29DiaInicial )) ) || ( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10751Stp_Dia, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV29DiaInicial)) )) )
         {
            if ( (( GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10751Stp_Dia, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))).before( GXutil.resetTime( AV30DiaInicial_to )) ) || ( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10751Stp_Dia, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV30DiaInicial_to)) )) )
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
                  AV14TextFileLine += GXutil.str( A10750Stp_Lin, 4, 0) ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  AV14TextFileLine += ";" ;
                  AV14TextFileLine += localUtil.ttoc( A10751Stp_Dia, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  AV14TextFileLine += ";" ;
                  AV34NewLine = GXutil.chr( (short)(10)) ;
                  GXt_char2 = AV14TextFileLine ;
                  GXv_char3[0] = GXt_char2 ;
                  new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( GXutil.strReplace( A10752Stp_Mot, ";", ","), AV34NewLine, " "), GXv_char3) ;
                  activarhdr_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
                  AV14TextFileLine += GXt_char2 ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  AV14TextFileLine += ";" ;
                  GXt_char2 = AV14TextFileLine ;
                  GXv_char3[0] = GXt_char2 ;
                  new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13723StpHdr, ";", ","), GXv_char3) ;
                  activarhdr_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
                  AV14TextFileLine += GXt_char2 ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  AV14TextFileLine += ";" ;
                  AV14TextFileLine += GXutil.str( A13726StpClicod, 6, 0) ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  AV14TextFileLine += ";" ;
                  GXt_char2 = AV14TextFileLine ;
                  GXv_char3[0] = GXt_char2 ;
                  new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13727StpCliNom, ";", ","), GXv_char3) ;
                  activarhdr_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
                  AV14TextFileLine += GXt_char2 ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  AV14TextFileLine += ";" ;
                  GXt_char2 = AV14TextFileLine ;
                  GXv_char3[0] = GXt_char2 ;
                  new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13724StpBarser, ";", ","), GXv_char3) ;
                  activarhdr_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
                  AV14TextFileLine += GXt_char2 ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  AV14TextFileLine += ";" ;
                  GXt_char2 = AV14TextFileLine ;
                  GXv_char3[0] = GXt_char2 ;
                  new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13725StpBarserD, ";", ","), GXv_char3) ;
                  activarhdr_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
                  AV14TextFileLine += GXt_char2 ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  AV14TextFileLine += ";" ;
                  GXt_char2 = AV14TextFileLine ;
                  GXv_char3[0] = GXt_char2 ;
                  new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13728StpColor, ";", ","), GXv_char3) ;
                  activarhdr_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=ActivarHdr_WCExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Stp_Lin", "", "#", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Stp_Dia", "", "Dia", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Stp_Mot", "", "Motivo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
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
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "ActivarHdr_WCColumnsSelector", GXv_char3) ;
      activarhdr_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("ActivarHdr_WCGridState"), "") == 0 )
      {
         AV36GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "ActivarHdr_WCGridState"), null, null);
      }
      else
      {
         AV36GridState.fromxml(AV19Session.getValue("ActivarHdr_WCGridState"), null, null);
      }
      AV31OrderedBy = AV36GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV32OrderedDsc = AV36GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV77GXV1 = 1 ;
      while ( AV77GXV1 <= AV36GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV37GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV36GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV77GXV1));
         if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV33FilterFullText = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTP_LIN") == 0 )
         {
            AV38TFStp_Lin = (short)(GXutil.lval( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV39TFStp_Lin_To = (short)(GXutil.lval( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTP_DIA") == 0 )
         {
            AV40TFStp_Dia = localUtil.ctot( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTP_MOT") == 0 )
         {
            AV42TFStp_Mot = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTP_MOT_SEL") == 0 )
         {
            AV43TFStp_Mot_Sel = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPHDR") == 0 )
         {
            AV44TFStpHdr = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPHDR_SEL") == 0 )
         {
            AV45TFStpHdr_Sel = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPCLICOD") == 0 )
         {
            AV46TFStpClicod = (int)(GXutil.lval( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV47TFStpClicod_To = (int)(GXutil.lval( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPCLINOM") == 0 )
         {
            AV48TFStpCliNom = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPCLINOM_SEL") == 0 )
         {
            AV49TFStpCliNom_Sel = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPBARSER") == 0 )
         {
            AV50TFStpBarser = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPBARSER_SEL") == 0 )
         {
            AV51TFStpBarser_Sel = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPBARSERDSC") == 0 )
         {
            AV52TFStpBarserDsc = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPBARSERDSC_SEL") == 0 )
         {
            AV53TFStpBarserDsc_Sel = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPCOLOR") == 0 )
         {
            AV54TFStpColor = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPCOLOR_SEL") == 0 )
         {
            AV55TFStpColor_Sel = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV28Emprcod = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&DIAINICIAL") == 0 )
         {
            AV29DiaInicial = localUtil.ctod( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&DIAINICIAL_TO") == 0 )
         {
            AV30DiaInicial_to = localUtil.ctod( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         AV77GXV1 = (int)(AV77GXV1+1) ;
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
      A10751Stp_Dia = GXutil.resetTime( GXutil.nullDate() );
      A10752Stp_Mot = "" ;
      A13723StpHdr = "" ;
      A13727StpCliNom = "" ;
      A13724StpBarser = "" ;
      A13725StpBarserD = "" ;
      A13728StpColor = "" ;
      AV59Activarhdr_wcds_1_filterfulltext = "" ;
      AV33FilterFullText = "" ;
      AV62Activarhdr_wcds_4_tfstp_dia = GXutil.resetTime( GXutil.nullDate() );
      AV40TFStp_Dia = GXutil.resetTime( GXutil.nullDate() );
      AV63Activarhdr_wcds_5_tfstp_mot = "" ;
      AV42TFStp_Mot = "" ;
      AV64Activarhdr_wcds_6_tfstp_mot_sel = "" ;
      AV43TFStp_Mot_Sel = "" ;
      AV65Activarhdr_wcds_7_tfstphdr = "" ;
      AV44TFStpHdr = "" ;
      AV66Activarhdr_wcds_8_tfstphdr_sel = "" ;
      AV45TFStpHdr_Sel = "" ;
      AV69Activarhdr_wcds_11_tfstpclinom = "" ;
      AV48TFStpCliNom = "" ;
      AV70Activarhdr_wcds_12_tfstpclinom_sel = "" ;
      AV49TFStpCliNom_Sel = "" ;
      AV71Activarhdr_wcds_13_tfstpbarser = "" ;
      AV50TFStpBarser = "" ;
      AV72Activarhdr_wcds_14_tfstpbarser_sel = "" ;
      AV51TFStpBarser_Sel = "" ;
      AV73Activarhdr_wcds_15_tfstpbarserdsc = "" ;
      AV52TFStpBarserDsc = "" ;
      AV74Activarhdr_wcds_16_tfstpbarserdsc_sel = "" ;
      AV53TFStpBarserDsc_Sel = "" ;
      AV75Activarhdr_wcds_17_tfstpcolor = "" ;
      AV54TFStpColor = "" ;
      AV76Activarhdr_wcds_18_tfstpcolor_sel = "" ;
      AV55TFStpColor_Sel = "" ;
      lV59Activarhdr_wcds_1_filterfulltext = "" ;
      lV69Activarhdr_wcds_11_tfstpclinom = "" ;
      lV71Activarhdr_wcds_13_tfstpbarser = "" ;
      lV73Activarhdr_wcds_15_tfstpbarserdsc = "" ;
      lV75Activarhdr_wcds_17_tfstpcolor = "" ;
      scmdbuf = "" ;
      lV63Activarhdr_wcds_5_tfstp_mot = "" ;
      lV65Activarhdr_wcds_7_tfstphdr = "" ;
      A10748Stp_p = "" ;
      AV29DiaInicial = GXutil.nullDate() ;
      AV30DiaInicial_to = GXutil.nullDate() ;
      AV28Emprcod = "" ;
      A396EmprCod = "" ;
      P09603_A129BarCod = new int[1] ;
      P09603_A132BarCodReo = new byte[1] ;
      P09603_A130BarCodPar = new String[] {""} ;
      P09603_A10755Stp_Est = new byte[1] ;
      P09603_A396EmprCod = new String[] {""} ;
      P09603_A13723StpHdr = new String[] {""} ;
      P09603_A10752Stp_Mot = new String[] {""} ;
      P09603_A10751Stp_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      P09603_A10750Stp_Lin = new short[1] ;
      P09603_A13728StpColor = new String[] {""} ;
      P09603_n13728StpColor = new boolean[] {false} ;
      P09603_A13725StpBarserD = new String[] {""} ;
      P09603_n13725StpBarserD = new boolean[] {false} ;
      P09603_A13724StpBarser = new String[] {""} ;
      P09603_n13724StpBarser = new boolean[] {false} ;
      P09603_A13727StpCliNom = new String[] {""} ;
      P09603_n13727StpCliNom = new boolean[] {false} ;
      P09603_A13726StpClicod = new int[1] ;
      P09603_n13726StpClicod = new boolean[] {false} ;
      P09603_A10746Stp_hdr = new int[1] ;
      P09603_A10747Stp_r = new byte[1] ;
      P09603_A10748Stp_p = new String[] {""} ;
      AV34NewLine = "" ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector5 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV36GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV37GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.activarhdr_wcexportcsv__default(),
         new Object[] {
             new Object[] {
            P09603_A129BarCod, P09603_A132BarCodReo, P09603_A130BarCodPar, P09603_A10755Stp_Est, P09603_A396EmprCod, P09603_A13723StpHdr, P09603_A10752Stp_Mot, P09603_A10751Stp_Dia, P09603_A10750Stp_Lin, P09603_A13728StpColor,
            P09603_n13728StpColor, P09603_A13725StpBarserD, P09603_n13725StpBarserD, P09603_A13724StpBarser, P09603_n13724StpBarser, P09603_A13727StpCliNom, P09603_n13727StpCliNom, P09603_A13726StpClicod, P09603_n13726StpClicod, P09603_A10746Stp_hdr,
            P09603_A10747Stp_r, P09603_A10748Stp_p
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A10747Stp_r ;
   private byte A10755Stp_Est ;
   private short gxcookieaux ;
   private short A10750Stp_Lin ;
   private short AV60Activarhdr_wcds_2_tfstp_lin ;
   private short AV38TFStp_Lin ;
   private short AV61Activarhdr_wcds_3_tfstp_lin_to ;
   private short AV39TFStp_Lin_To ;
   private short AV31OrderedBy ;
   private short Gx_err ;
   private int AV13Random ;
   private int A13726StpClicod ;
   private int AV67Activarhdr_wcds_9_tfstpclicod ;
   private int AV46TFStpClicod ;
   private int AV68Activarhdr_wcds_10_tfstpclicod_to ;
   private int AV47TFStpClicod_To ;
   private int A10746Stp_hdr ;
   private int AV77GXV1 ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A13723StpHdr ;
   private String A13727StpCliNom ;
   private String A13724StpBarser ;
   private String A13725StpBarserD ;
   private String A13728StpColor ;
   private String AV65Activarhdr_wcds_7_tfstphdr ;
   private String AV44TFStpHdr ;
   private String AV66Activarhdr_wcds_8_tfstphdr_sel ;
   private String AV45TFStpHdr_Sel ;
   private String AV69Activarhdr_wcds_11_tfstpclinom ;
   private String AV48TFStpCliNom ;
   private String AV70Activarhdr_wcds_12_tfstpclinom_sel ;
   private String AV49TFStpCliNom_Sel ;
   private String AV71Activarhdr_wcds_13_tfstpbarser ;
   private String AV50TFStpBarser ;
   private String AV72Activarhdr_wcds_14_tfstpbarser_sel ;
   private String AV51TFStpBarser_Sel ;
   private String AV73Activarhdr_wcds_15_tfstpbarserdsc ;
   private String AV52TFStpBarserDsc ;
   private String AV74Activarhdr_wcds_16_tfstpbarserdsc_sel ;
   private String AV53TFStpBarserDsc_Sel ;
   private String AV75Activarhdr_wcds_17_tfstpcolor ;
   private String AV54TFStpColor ;
   private String AV76Activarhdr_wcds_18_tfstpcolor_sel ;
   private String AV55TFStpColor_Sel ;
   private String lV69Activarhdr_wcds_11_tfstpclinom ;
   private String lV71Activarhdr_wcds_13_tfstpbarser ;
   private String lV73Activarhdr_wcds_15_tfstpbarserdsc ;
   private String lV75Activarhdr_wcds_17_tfstpcolor ;
   private String scmdbuf ;
   private String lV65Activarhdr_wcds_7_tfstphdr ;
   private String A10748Stp_p ;
   private String AV28Emprcod ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private java.util.Date A10751Stp_Dia ;
   private java.util.Date AV62Activarhdr_wcds_4_tfstp_dia ;
   private java.util.Date AV40TFStp_Dia ;
   private java.util.Date AV29DiaInicial ;
   private java.util.Date AV30DiaInicial_to ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV32OrderedDsc ;
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
   private String AV59Activarhdr_wcds_1_filterfulltext ;
   private String AV33FilterFullText ;
   private String AV63Activarhdr_wcds_5_tfstp_mot ;
   private String AV42TFStp_Mot ;
   private String AV64Activarhdr_wcds_6_tfstp_mot_sel ;
   private String AV43TFStp_Mot_Sel ;
   private String lV59Activarhdr_wcds_1_filterfulltext ;
   private String lV63Activarhdr_wcds_5_tfstp_mot ;
   private String AV34NewLine ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private int[] P09603_A129BarCod ;
   private byte[] P09603_A132BarCodReo ;
   private String[] P09603_A130BarCodPar ;
   private byte[] P09603_A10755Stp_Est ;
   private String[] P09603_A396EmprCod ;
   private String[] P09603_A13723StpHdr ;
   private String[] P09603_A10752Stp_Mot ;
   private java.util.Date[] P09603_A10751Stp_Dia ;
   private short[] P09603_A10750Stp_Lin ;
   private String[] P09603_A13728StpColor ;
   private boolean[] P09603_n13728StpColor ;
   private String[] P09603_A13725StpBarserD ;
   private boolean[] P09603_n13725StpBarserD ;
   private String[] P09603_A13724StpBarser ;
   private boolean[] P09603_n13724StpBarser ;
   private String[] P09603_A13727StpCliNom ;
   private boolean[] P09603_n13727StpCliNom ;
   private int[] P09603_A13726StpClicod ;
   private boolean[] P09603_n13726StpClicod ;
   private int[] P09603_A10746Stp_hdr ;
   private byte[] P09603_A10747Stp_r ;
   private String[] P09603_A10748Stp_p ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV36GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV37GridStateFilterValue ;
}

final  class activarhdr_wcexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09603( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV60Activarhdr_wcds_2_tfstp_lin ,
                                          short AV61Activarhdr_wcds_3_tfstp_lin_to ,
                                          java.util.Date AV62Activarhdr_wcds_4_tfstp_dia ,
                                          String AV64Activarhdr_wcds_6_tfstp_mot_sel ,
                                          String AV63Activarhdr_wcds_5_tfstp_mot ,
                                          String AV66Activarhdr_wcds_8_tfstphdr_sel ,
                                          String AV65Activarhdr_wcds_7_tfstphdr ,
                                          short A10750Stp_Lin ,
                                          java.util.Date A10751Stp_Dia ,
                                          String A10752Stp_Mot ,
                                          int A10746Stp_hdr ,
                                          byte A10747Stp_r ,
                                          String A10748Stp_p ,
                                          short AV31OrderedBy ,
                                          boolean AV32OrderedDsc ,
                                          String AV59Activarhdr_wcds_1_filterfulltext ,
                                          String A13723StpHdr ,
                                          int A13726StpClicod ,
                                          String A13727StpCliNom ,
                                          String A13724StpBarser ,
                                          String A13725StpBarserD ,
                                          String A13728StpColor ,
                                          int AV67Activarhdr_wcds_9_tfstpclicod ,
                                          int AV68Activarhdr_wcds_10_tfstpclicod_to ,
                                          String AV70Activarhdr_wcds_12_tfstpclinom_sel ,
                                          String AV69Activarhdr_wcds_11_tfstpclinom ,
                                          String AV72Activarhdr_wcds_14_tfstpbarser_sel ,
                                          String AV71Activarhdr_wcds_13_tfstpbarser ,
                                          String AV74Activarhdr_wcds_16_tfstpbarserdsc_sel ,
                                          String AV73Activarhdr_wcds_15_tfstpbarserdsc ,
                                          String AV76Activarhdr_wcds_18_tfstpcolor_sel ,
                                          String AV75Activarhdr_wcds_17_tfstpcolor ,
                                          java.util.Date AV29DiaInicial ,
                                          java.util.Date AV30DiaInicial_to ,
                                          byte A10755Stp_Est ,
                                          String AV28Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[41];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T3.BarCod, T3.BarCodReo, T3.BarCodPar, T1.Stp_Est, T1.EmprCod, RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T2.Stp_r,'90')," ;
      scmdbuf += " 2) || T2.Stp_p AS StpHdr, T1.Stp_Mot, T1.Stp_Dia, T1.Stp_Lin, COALESCE( T3.BarColNom, ' ') AS StpColor, COALESCE( T3.BarSerDsc, ' ') AS StpBarserD, COALESCE( T3.BarSer," ;
      scmdbuf += " ' ') AS StpBarser, COALESCE( T4.StpCliNom, ' ') AS StpCliNom, COALESCE( T3.CliCod, 0) AS StpClicod, T1.Stp_hdr, T1.Stp_r, T1.Stp_p FROM (((TXPHDSTO1 T1 INNER JOIN" ;
      scmdbuf += " TXPHDSTOP T2 ON T2.EmprCod = T1.EmprCod AND T2.Stp_hdr = T1.Stp_hdr AND T2.Stp_r = T1.Stp_r AND T2.Stp_p = T1.Stp_p) LEFT JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.BarCod = T1.Stp_hdr AND T3.BarCodReo = T1.Stp_r AND T3.BarCodPar = T1.Stp_p) LEFT JOIN (SELECT T6.CliNom AS StpCliNom, T5.EmprCod, T5.BarCod, T7.Stp_hdr," ;
      scmdbuf += " T5.BarCodReo, T7.Stp_r, T5.BarCodPar, T7.Stp_p FROM ((TXPBARCAD T5 LEFT JOIN TXPCLIENT T6 ON T6.EmprCod = T5.EmprCod AND T6.CliCod = T5.CliCod) INNER JOIN TXPHDSTOP" ;
      scmdbuf += " T7 ON T7.EmprCod = T5.EmprCod) WHERE T5.BarCod = T7.Stp_hdr and T5.BarCodReo = T7.Stp_r and T5.BarCodPar = T7.Stp_p ) T4 ON T4.EmprCod = T1.EmprCod AND T4.Stp_hdr" ;
      scmdbuf += " = T1.Stp_hdr AND T4.Stp_r = T1.Stp_r AND T4.Stp_p = T1.Stp_p)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( SUBSTR(TO_CHAR(T1.Stp_Lin,'9990'), 2) like '%' || ?) or ( UPPER(T1.Stp_Mot) like '%' || UPPER(?)) or ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T2.Stp_r,'90'), 2) || T2.Stp_p) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T3.CliCod, 0),'999990'), 2) like '%' || ?) or ( UPPER(COALESCE( T4.StpCliNom, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarSer, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarSerDsc, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarColNom, ' ')) like '%' || UPPER(?))))");
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
      addWhere(sWhereString, "(T1.Stp_Est = 1)");
      if ( ! (0==AV60Activarhdr_wcds_2_tfstp_lin) )
      {
         addWhere(sWhereString, "(T1.Stp_Lin >= ?)");
      }
      else
      {
         GXv_int6[34] = (byte)(1) ;
      }
      if ( ! (0==AV61Activarhdr_wcds_3_tfstp_lin_to) )
      {
         addWhere(sWhereString, "(T1.Stp_Lin <= ?)");
      }
      else
      {
         GXv_int6[35] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV62Activarhdr_wcds_4_tfstp_dia) )
      {
         addWhere(sWhereString, "(T1.Stp_Dia >= ?)");
      }
      else
      {
         GXv_int6[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Activarhdr_wcds_6_tfstp_mot_sel)==0) && ( ! (GXutil.strcmp("", AV63Activarhdr_wcds_5_tfstp_mot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Stp_Mot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Activarhdr_wcds_6_tfstp_mot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Stp_Mot = ?)");
      }
      else
      {
         GXv_int6[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Activarhdr_wcds_8_tfstphdr_sel)==0) && ( ! (GXutil.strcmp("", AV65Activarhdr_wcds_7_tfstphdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T1.Stp_r,'90'), 2) || T1.Stp_p) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Activarhdr_wcds_8_tfstphdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T1.Stp_r,'90'), 2) || T1.Stp_p = ?)");
      }
      else
      {
         GXv_int6[40] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV31OrderedBy == 1 ) && ! AV32OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Stp_Dia" ;
      }
      else if ( ( AV31OrderedBy == 1 ) && ( AV32OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Stp_Dia DESC" ;
      }
      else if ( ( AV31OrderedBy == 2 ) && ! AV32OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Stp_Lin" ;
      }
      else if ( ( AV31OrderedBy == 2 ) && ( AV32OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Stp_Lin DESC" ;
      }
      else if ( ( AV31OrderedBy == 3 ) && ! AV32OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Stp_Mot" ;
      }
      else if ( ( AV31OrderedBy == 3 ) && ( AV32OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Stp_Mot DESC" ;
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
                  return conditional_P09603(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (java.util.Date)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , (java.util.Date)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).byteValue() , (String)dynConstraints[12] , ((Number) dynConstraints[13]).shortValue() , ((Boolean) dynConstraints[14]).booleanValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (java.util.Date)dynConstraints[32] , (java.util.Date)dynConstraints[33] , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , (String)dynConstraints[36] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09603", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((String[]) buf[5])[0] = rslt.getString(6, 11);
               ((String[]) buf[6])[0] = rslt.getVarchar(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
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
                  stmt.setString(sIdx, (String)parms[41], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 16);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 16);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 26);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 26);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 26);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 26);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 13);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 13);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 13);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 13);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[75]).shortValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[76]).shortValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[77], false);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 300);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 300);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 11);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 11);
               }
               return;
      }
   }

}

