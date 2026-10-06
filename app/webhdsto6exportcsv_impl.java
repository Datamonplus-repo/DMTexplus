package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class webhdsto6exportcsv_impl extends GXWebProcedure
{
   public webhdsto6exportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "WebHDSTO6ExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("WebHDSTO6ColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("WebHDSTO6ColumnsSelector") ;
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
      AV84Webhdsto6ds_1_filterfulltext = AV48FilterFullText ;
      AV85Webhdsto6ds_2_tfstphdr = AV38TFStpHdr ;
      AV86Webhdsto6ds_3_tfstphdr_sel = AV39TFStpHdr_Sel ;
      AV87Webhdsto6ds_4_tfstpclicod = AV49TFStpClicod ;
      AV88Webhdsto6ds_5_tfstpclicod_to = AV50TFStpClicod_To ;
      AV89Webhdsto6ds_6_tfstpclinom = AV51TFStpCliNom ;
      AV90Webhdsto6ds_7_tfstpclinom_sel = AV52TFStpCliNom_Sel ;
      AV91Webhdsto6ds_8_tfstpbarser = AV53TFStpBarser ;
      AV92Webhdsto6ds_9_tfstpbarser_sel = AV54TFStpBarser_Sel ;
      AV93Webhdsto6ds_10_tfstpbarserdsc = AV55TFStpBarserDsc ;
      AV94Webhdsto6ds_11_tfstpbarserdsc_sel = AV56TFStpBarserDsc_Sel ;
      AV95Webhdsto6ds_12_tfstpcolor = AV57TFStpColor ;
      AV96Webhdsto6ds_13_tfstpcolor_sel = AV58TFStpColor_Sel ;
      AV97Webhdsto6ds_14_tfstp_dia = AV40TFStp_Dia ;
      AV98Webhdsto6ds_15_tfstp_mot = AV42TFStp_Mot ;
      AV99Webhdsto6ds_16_tfstp_mot_sel = AV43TFStp_Mot_Sel ;
      AV100Webhdsto6ds_17_tfstp_diaa = AV44TFStp_DiaA ;
      AV101Webhdsto6ds_18_tfstp_mota = AV46TFStp_MotA ;
      AV102Webhdsto6ds_19_tfstp_mota_sel = AV47TFStp_MotA_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV86Webhdsto6ds_3_tfstphdr_sel ,
                                           AV85Webhdsto6ds_2_tfstphdr ,
                                           AV97Webhdsto6ds_14_tfstp_dia ,
                                           AV99Webhdsto6ds_16_tfstp_mot_sel ,
                                           AV98Webhdsto6ds_15_tfstp_mot ,
                                           AV100Webhdsto6ds_17_tfstp_diaa ,
                                           AV102Webhdsto6ds_19_tfstp_mota_sel ,
                                           AV101Webhdsto6ds_18_tfstp_mota ,
                                           Integer.valueOf(A10746Stp_hdr) ,
                                           Byte.valueOf(A10747Stp_r) ,
                                           A10748Stp_p ,
                                           A10751Stp_Dia ,
                                           A10752Stp_Mot ,
                                           A10756Stp_DiaA ,
                                           A10757Stp_MotA ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) ,
                                           AV84Webhdsto6ds_1_filterfulltext ,
                                           A13723StpHdr ,
                                           Integer.valueOf(A13726StpClicod) ,
                                           A13727StpCliNom ,
                                           A13724StpBarser ,
                                           A13725StpBarserD ,
                                           A13728StpColor ,
                                           Integer.valueOf(AV87Webhdsto6ds_4_tfstpclicod) ,
                                           Integer.valueOf(AV88Webhdsto6ds_5_tfstpclicod_to) ,
                                           AV90Webhdsto6ds_7_tfstpclinom_sel ,
                                           AV89Webhdsto6ds_6_tfstpclinom ,
                                           AV92Webhdsto6ds_9_tfstpbarser_sel ,
                                           AV91Webhdsto6ds_8_tfstpbarser ,
                                           AV94Webhdsto6ds_11_tfstpbarserdsc_sel ,
                                           AV93Webhdsto6ds_10_tfstpbarserdsc ,
                                           AV96Webhdsto6ds_13_tfstpcolor_sel ,
                                           AV95Webhdsto6ds_12_tfstpcolor } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV84Webhdsto6ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV84Webhdsto6ds_1_filterfulltext), "%", "") ;
      lV84Webhdsto6ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV84Webhdsto6ds_1_filterfulltext), "%", "") ;
      lV84Webhdsto6ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV84Webhdsto6ds_1_filterfulltext), "%", "") ;
      lV84Webhdsto6ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV84Webhdsto6ds_1_filterfulltext), "%", "") ;
      lV84Webhdsto6ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV84Webhdsto6ds_1_filterfulltext), "%", "") ;
      lV84Webhdsto6ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV84Webhdsto6ds_1_filterfulltext), "%", "") ;
      lV84Webhdsto6ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV84Webhdsto6ds_1_filterfulltext), "%", "") ;
      lV84Webhdsto6ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV84Webhdsto6ds_1_filterfulltext), "%", "") ;
      lV89Webhdsto6ds_6_tfstpclinom = GXutil.padr( GXutil.rtrim( AV89Webhdsto6ds_6_tfstpclinom), 30, "%") ;
      lV91Webhdsto6ds_8_tfstpbarser = GXutil.padr( GXutil.rtrim( AV91Webhdsto6ds_8_tfstpbarser), 16, "%") ;
      lV93Webhdsto6ds_10_tfstpbarserdsc = GXutil.padr( GXutil.rtrim( AV93Webhdsto6ds_10_tfstpbarserdsc), 26, "%") ;
      lV95Webhdsto6ds_12_tfstpcolor = GXutil.padr( GXutil.rtrim( AV95Webhdsto6ds_12_tfstpcolor), 13, "%") ;
      lV85Webhdsto6ds_2_tfstphdr = GXutil.padr( GXutil.rtrim( AV85Webhdsto6ds_2_tfstphdr), 11, "%") ;
      lV98Webhdsto6ds_15_tfstp_mot = GXutil.concat( GXutil.rtrim( AV98Webhdsto6ds_15_tfstp_mot), "%", "") ;
      lV101Webhdsto6ds_18_tfstp_mota = GXutil.concat( GXutil.rtrim( AV101Webhdsto6ds_18_tfstp_mota), "%", "") ;
      /* Using cursor P08DO3 */
      pr_default.execute(0, new Object[] {AV84Webhdsto6ds_1_filterfulltext, lV84Webhdsto6ds_1_filterfulltext, lV84Webhdsto6ds_1_filterfulltext, lV84Webhdsto6ds_1_filterfulltext, lV84Webhdsto6ds_1_filterfulltext, lV84Webhdsto6ds_1_filterfulltext, lV84Webhdsto6ds_1_filterfulltext, lV84Webhdsto6ds_1_filterfulltext, lV84Webhdsto6ds_1_filterfulltext, Integer.valueOf(AV87Webhdsto6ds_4_tfstpclicod), Integer.valueOf(AV87Webhdsto6ds_4_tfstpclicod), Integer.valueOf(AV88Webhdsto6ds_5_tfstpclicod_to), Integer.valueOf(AV88Webhdsto6ds_5_tfstpclicod_to), AV90Webhdsto6ds_7_tfstpclinom_sel, AV89Webhdsto6ds_6_tfstpclinom, lV89Webhdsto6ds_6_tfstpclinom, AV90Webhdsto6ds_7_tfstpclinom_sel, AV90Webhdsto6ds_7_tfstpclinom_sel, AV92Webhdsto6ds_9_tfstpbarser_sel, AV91Webhdsto6ds_8_tfstpbarser, lV91Webhdsto6ds_8_tfstpbarser, AV92Webhdsto6ds_9_tfstpbarser_sel, AV92Webhdsto6ds_9_tfstpbarser_sel, AV94Webhdsto6ds_11_tfstpbarserdsc_sel, AV93Webhdsto6ds_10_tfstpbarserdsc, lV93Webhdsto6ds_10_tfstpbarserdsc, AV94Webhdsto6ds_11_tfstpbarserdsc_sel, AV94Webhdsto6ds_11_tfstpbarserdsc_sel, AV96Webhdsto6ds_13_tfstpcolor_sel, AV95Webhdsto6ds_12_tfstpcolor, lV95Webhdsto6ds_12_tfstpcolor, AV96Webhdsto6ds_13_tfstpcolor_sel, AV96Webhdsto6ds_13_tfstpcolor_sel, lV85Webhdsto6ds_2_tfstphdr, AV86Webhdsto6ds_3_tfstphdr_sel, AV97Webhdsto6ds_14_tfstp_dia, lV98Webhdsto6ds_15_tfstp_mot, AV99Webhdsto6ds_16_tfstp_mot_sel, AV100Webhdsto6ds_17_tfstp_diaa, lV101Webhdsto6ds_18_tfstp_mota, AV102Webhdsto6ds_19_tfstp_mota_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P08DO3_A396EmprCod[0] ;
         A10757Stp_MotA = P08DO3_A10757Stp_MotA[0] ;
         A10756Stp_DiaA = P08DO3_A10756Stp_DiaA[0] ;
         A10752Stp_Mot = P08DO3_A10752Stp_Mot[0] ;
         A10751Stp_Dia = P08DO3_A10751Stp_Dia[0] ;
         A13723StpHdr = P08DO3_A13723StpHdr[0] ;
         A13728StpColor = P08DO3_A13728StpColor[0] ;
         n13728StpColor = P08DO3_n13728StpColor[0] ;
         A13725StpBarserD = P08DO3_A13725StpBarserD[0] ;
         n13725StpBarserD = P08DO3_n13725StpBarserD[0] ;
         A13724StpBarser = P08DO3_A13724StpBarser[0] ;
         n13724StpBarser = P08DO3_n13724StpBarser[0] ;
         A13727StpCliNom = P08DO3_A13727StpCliNom[0] ;
         n13727StpCliNom = P08DO3_n13727StpCliNom[0] ;
         A13726StpClicod = P08DO3_A13726StpClicod[0] ;
         n13726StpClicod = P08DO3_n13726StpClicod[0] ;
         A10746Stp_hdr = P08DO3_A10746Stp_hdr[0] ;
         A10747Stp_r = P08DO3_A10747Stp_r[0] ;
         A10748Stp_p = P08DO3_A10748Stp_p[0] ;
         A10750Stp_Lin = P08DO3_A10750Stp_Lin[0] ;
         A13723StpHdr = P08DO3_A13723StpHdr[0] ;
         A13728StpColor = P08DO3_A13728StpColor[0] ;
         n13728StpColor = P08DO3_n13728StpColor[0] ;
         A13725StpBarserD = P08DO3_A13725StpBarserD[0] ;
         n13725StpBarserD = P08DO3_n13725StpBarserD[0] ;
         A13724StpBarser = P08DO3_A13724StpBarser[0] ;
         n13724StpBarser = P08DO3_n13724StpBarser[0] ;
         A13726StpClicod = P08DO3_A13726StpClicod[0] ;
         n13726StpClicod = P08DO3_n13726StpClicod[0] ;
         A13727StpCliNom = P08DO3_A13727StpCliNom[0] ;
         n13727StpCliNom = P08DO3_n13727StpCliNom[0] ;
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
            webhdsto6exportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
            webhdsto6exportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13724StpBarser, ";", ","), GXv_char3) ;
            webhdsto6exportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13725StpBarserD, ";", ","), GXv_char3) ;
            webhdsto6exportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13728StpColor, ";", ","), GXv_char3) ;
            webhdsto6exportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
            AV34NewLine = GXutil.chr( (short)(10)) ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( GXutil.strReplace( A10752Stp_Mot, ";", ","), AV34NewLine, " "), GXv_char3) ;
            webhdsto6exportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
            AV34NewLine = GXutil.chr( (short)(10)) ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( GXutil.strReplace( A10757Stp_MotA, ";", ","), AV34NewLine, " "), GXv_char3) ;
            webhdsto6exportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=WebHDSTO6ExportCSV.csv");
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
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WebHDSTO6ColumnsSelector", GXv_char3) ;
      webhdsto6exportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("WebHDSTO6GridState"), "") == 0 )
      {
         AV36GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WebHDSTO6GridState"), null, null);
      }
      else
      {
         AV36GridState.fromxml(AV19Session.getValue("WebHDSTO6GridState"), null, null);
      }
      AV28OrderedBy = AV36GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV36GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV103GXV1 = 1 ;
      while ( AV103GXV1 <= AV36GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV37GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV36GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV103GXV1));
         if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV48FilterFullText = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPHDR") == 0 )
         {
            AV38TFStpHdr = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPHDR_SEL") == 0 )
         {
            AV39TFStpHdr_Sel = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPCLICOD") == 0 )
         {
            AV49TFStpClicod = (int)(GXutil.lval( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV50TFStpClicod_To = (int)(GXutil.lval( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPCLINOM") == 0 )
         {
            AV51TFStpCliNom = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPCLINOM_SEL") == 0 )
         {
            AV52TFStpCliNom_Sel = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPBARSER") == 0 )
         {
            AV53TFStpBarser = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPBARSER_SEL") == 0 )
         {
            AV54TFStpBarser_Sel = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPBARSERDSC") == 0 )
         {
            AV55TFStpBarserDsc = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPBARSERDSC_SEL") == 0 )
         {
            AV56TFStpBarserDsc_Sel = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPCOLOR") == 0 )
         {
            AV57TFStpColor = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPCOLOR_SEL") == 0 )
         {
            AV58TFStpColor_Sel = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
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
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTP_DIAA") == 0 )
         {
            AV44TFStp_DiaA = localUtil.ctot( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTP_MOTA") == 0 )
         {
            AV46TFStp_MotA = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTP_MOTA_SEL") == 0 )
         {
            AV47TFStp_MotA_Sel = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV103GXV1 = (int)(AV103GXV1+1) ;
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
      AV84Webhdsto6ds_1_filterfulltext = "" ;
      AV48FilterFullText = "" ;
      AV85Webhdsto6ds_2_tfstphdr = "" ;
      AV38TFStpHdr = "" ;
      AV86Webhdsto6ds_3_tfstphdr_sel = "" ;
      AV39TFStpHdr_Sel = "" ;
      AV89Webhdsto6ds_6_tfstpclinom = "" ;
      AV51TFStpCliNom = "" ;
      AV90Webhdsto6ds_7_tfstpclinom_sel = "" ;
      AV52TFStpCliNom_Sel = "" ;
      AV91Webhdsto6ds_8_tfstpbarser = "" ;
      AV53TFStpBarser = "" ;
      AV92Webhdsto6ds_9_tfstpbarser_sel = "" ;
      AV54TFStpBarser_Sel = "" ;
      AV93Webhdsto6ds_10_tfstpbarserdsc = "" ;
      AV55TFStpBarserDsc = "" ;
      AV94Webhdsto6ds_11_tfstpbarserdsc_sel = "" ;
      AV56TFStpBarserDsc_Sel = "" ;
      AV95Webhdsto6ds_12_tfstpcolor = "" ;
      AV57TFStpColor = "" ;
      AV96Webhdsto6ds_13_tfstpcolor_sel = "" ;
      AV58TFStpColor_Sel = "" ;
      AV97Webhdsto6ds_14_tfstp_dia = GXutil.resetTime( GXutil.nullDate() );
      AV40TFStp_Dia = GXutil.resetTime( GXutil.nullDate() );
      AV98Webhdsto6ds_15_tfstp_mot = "" ;
      AV42TFStp_Mot = "" ;
      AV99Webhdsto6ds_16_tfstp_mot_sel = "" ;
      AV43TFStp_Mot_Sel = "" ;
      AV100Webhdsto6ds_17_tfstp_diaa = GXutil.resetTime( GXutil.nullDate() );
      AV44TFStp_DiaA = GXutil.resetTime( GXutil.nullDate() );
      AV101Webhdsto6ds_18_tfstp_mota = "" ;
      AV46TFStp_MotA = "" ;
      AV102Webhdsto6ds_19_tfstp_mota_sel = "" ;
      AV47TFStp_MotA_Sel = "" ;
      lV84Webhdsto6ds_1_filterfulltext = "" ;
      lV89Webhdsto6ds_6_tfstpclinom = "" ;
      lV91Webhdsto6ds_8_tfstpbarser = "" ;
      lV93Webhdsto6ds_10_tfstpbarserdsc = "" ;
      lV95Webhdsto6ds_12_tfstpcolor = "" ;
      scmdbuf = "" ;
      lV85Webhdsto6ds_2_tfstphdr = "" ;
      lV98Webhdsto6ds_15_tfstp_mot = "" ;
      lV101Webhdsto6ds_18_tfstp_mota = "" ;
      A10748Stp_p = "" ;
      P08DO3_A129BarCod = new int[1] ;
      P08DO3_A132BarCodReo = new byte[1] ;
      P08DO3_A130BarCodPar = new String[] {""} ;
      P08DO3_A396EmprCod = new String[] {""} ;
      P08DO3_A10757Stp_MotA = new String[] {""} ;
      P08DO3_A10756Stp_DiaA = new java.util.Date[] {GXutil.nullDate()} ;
      P08DO3_A10752Stp_Mot = new String[] {""} ;
      P08DO3_A10751Stp_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      P08DO3_A13723StpHdr = new String[] {""} ;
      P08DO3_A13728StpColor = new String[] {""} ;
      P08DO3_n13728StpColor = new boolean[] {false} ;
      P08DO3_A13725StpBarserD = new String[] {""} ;
      P08DO3_n13725StpBarserD = new boolean[] {false} ;
      P08DO3_A13724StpBarser = new String[] {""} ;
      P08DO3_n13724StpBarser = new boolean[] {false} ;
      P08DO3_A13727StpCliNom = new String[] {""} ;
      P08DO3_n13727StpCliNom = new boolean[] {false} ;
      P08DO3_A13726StpClicod = new int[1] ;
      P08DO3_n13726StpClicod = new boolean[] {false} ;
      P08DO3_A10746Stp_hdr = new int[1] ;
      P08DO3_A10747Stp_r = new byte[1] ;
      P08DO3_A10748Stp_p = new String[] {""} ;
      P08DO3_A10750Stp_Lin = new short[1] ;
      A396EmprCod = "" ;
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
      pr_default = new DataStoreProvider(context, remoteHandle, new app.webhdsto6exportcsv__default(),
         new Object[] {
             new Object[] {
            P08DO3_A129BarCod, P08DO3_A132BarCodReo, P08DO3_A130BarCodPar, P08DO3_A396EmprCod, P08DO3_A10757Stp_MotA, P08DO3_A10756Stp_DiaA, P08DO3_A10752Stp_Mot, P08DO3_A10751Stp_Dia, P08DO3_A13723StpHdr, P08DO3_A13728StpColor,
            P08DO3_n13728StpColor, P08DO3_A13725StpBarserD, P08DO3_n13725StpBarserD, P08DO3_A13724StpBarser, P08DO3_n13724StpBarser, P08DO3_A13727StpCliNom, P08DO3_n13727StpCliNom, P08DO3_A13726StpClicod, P08DO3_n13726StpClicod, P08DO3_A10746Stp_hdr,
            P08DO3_A10747Stp_r, P08DO3_A10748Stp_p, P08DO3_A10750Stp_Lin
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
   private int AV87Webhdsto6ds_4_tfstpclicod ;
   private int AV49TFStpClicod ;
   private int AV88Webhdsto6ds_5_tfstpclicod_to ;
   private int AV50TFStpClicod_To ;
   private int A10746Stp_hdr ;
   private int AV103GXV1 ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A13723StpHdr ;
   private String A13727StpCliNom ;
   private String A13724StpBarser ;
   private String A13725StpBarserD ;
   private String A13728StpColor ;
   private String AV85Webhdsto6ds_2_tfstphdr ;
   private String AV38TFStpHdr ;
   private String AV86Webhdsto6ds_3_tfstphdr_sel ;
   private String AV39TFStpHdr_Sel ;
   private String AV89Webhdsto6ds_6_tfstpclinom ;
   private String AV51TFStpCliNom ;
   private String AV90Webhdsto6ds_7_tfstpclinom_sel ;
   private String AV52TFStpCliNom_Sel ;
   private String AV91Webhdsto6ds_8_tfstpbarser ;
   private String AV53TFStpBarser ;
   private String AV92Webhdsto6ds_9_tfstpbarser_sel ;
   private String AV54TFStpBarser_Sel ;
   private String AV93Webhdsto6ds_10_tfstpbarserdsc ;
   private String AV55TFStpBarserDsc ;
   private String AV94Webhdsto6ds_11_tfstpbarserdsc_sel ;
   private String AV56TFStpBarserDsc_Sel ;
   private String AV95Webhdsto6ds_12_tfstpcolor ;
   private String AV57TFStpColor ;
   private String AV96Webhdsto6ds_13_tfstpcolor_sel ;
   private String AV58TFStpColor_Sel ;
   private String lV89Webhdsto6ds_6_tfstpclinom ;
   private String lV91Webhdsto6ds_8_tfstpbarser ;
   private String lV93Webhdsto6ds_10_tfstpbarserdsc ;
   private String lV95Webhdsto6ds_12_tfstpcolor ;
   private String scmdbuf ;
   private String lV85Webhdsto6ds_2_tfstphdr ;
   private String A10748Stp_p ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private java.util.Date A10751Stp_Dia ;
   private java.util.Date A10756Stp_DiaA ;
   private java.util.Date AV97Webhdsto6ds_14_tfstp_dia ;
   private java.util.Date AV40TFStp_Dia ;
   private java.util.Date AV100Webhdsto6ds_17_tfstp_diaa ;
   private java.util.Date AV44TFStp_DiaA ;
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
   private String AV84Webhdsto6ds_1_filterfulltext ;
   private String AV48FilterFullText ;
   private String AV98Webhdsto6ds_15_tfstp_mot ;
   private String AV42TFStp_Mot ;
   private String AV99Webhdsto6ds_16_tfstp_mot_sel ;
   private String AV43TFStp_Mot_Sel ;
   private String AV101Webhdsto6ds_18_tfstp_mota ;
   private String AV46TFStp_MotA ;
   private String AV102Webhdsto6ds_19_tfstp_mota_sel ;
   private String AV47TFStp_MotA_Sel ;
   private String lV84Webhdsto6ds_1_filterfulltext ;
   private String lV98Webhdsto6ds_15_tfstp_mot ;
   private String lV101Webhdsto6ds_18_tfstp_mota ;
   private String AV34NewLine ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private int[] P08DO3_A129BarCod ;
   private byte[] P08DO3_A132BarCodReo ;
   private String[] P08DO3_A130BarCodPar ;
   private String[] P08DO3_A396EmprCod ;
   private String[] P08DO3_A10757Stp_MotA ;
   private java.util.Date[] P08DO3_A10756Stp_DiaA ;
   private String[] P08DO3_A10752Stp_Mot ;
   private java.util.Date[] P08DO3_A10751Stp_Dia ;
   private String[] P08DO3_A13723StpHdr ;
   private String[] P08DO3_A13728StpColor ;
   private boolean[] P08DO3_n13728StpColor ;
   private String[] P08DO3_A13725StpBarserD ;
   private boolean[] P08DO3_n13725StpBarserD ;
   private String[] P08DO3_A13724StpBarser ;
   private boolean[] P08DO3_n13724StpBarser ;
   private String[] P08DO3_A13727StpCliNom ;
   private boolean[] P08DO3_n13727StpCliNom ;
   private int[] P08DO3_A13726StpClicod ;
   private boolean[] P08DO3_n13726StpClicod ;
   private int[] P08DO3_A10746Stp_hdr ;
   private byte[] P08DO3_A10747Stp_r ;
   private String[] P08DO3_A10748Stp_p ;
   private short[] P08DO3_A10750Stp_Lin ;
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

final  class webhdsto6exportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08DO3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV86Webhdsto6ds_3_tfstphdr_sel ,
                                          String AV85Webhdsto6ds_2_tfstphdr ,
                                          java.util.Date AV97Webhdsto6ds_14_tfstp_dia ,
                                          String AV99Webhdsto6ds_16_tfstp_mot_sel ,
                                          String AV98Webhdsto6ds_15_tfstp_mot ,
                                          java.util.Date AV100Webhdsto6ds_17_tfstp_diaa ,
                                          String AV102Webhdsto6ds_19_tfstp_mota_sel ,
                                          String AV101Webhdsto6ds_18_tfstp_mota ,
                                          int A10746Stp_hdr ,
                                          byte A10747Stp_r ,
                                          String A10748Stp_p ,
                                          java.util.Date A10751Stp_Dia ,
                                          String A10752Stp_Mot ,
                                          java.util.Date A10756Stp_DiaA ,
                                          String A10757Stp_MotA ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc ,
                                          String AV84Webhdsto6ds_1_filterfulltext ,
                                          String A13723StpHdr ,
                                          int A13726StpClicod ,
                                          String A13727StpCliNom ,
                                          String A13724StpBarser ,
                                          String A13725StpBarserD ,
                                          String A13728StpColor ,
                                          int AV87Webhdsto6ds_4_tfstpclicod ,
                                          int AV88Webhdsto6ds_5_tfstpclicod_to ,
                                          String AV90Webhdsto6ds_7_tfstpclinom_sel ,
                                          String AV89Webhdsto6ds_6_tfstpclinom ,
                                          String AV92Webhdsto6ds_9_tfstpbarser_sel ,
                                          String AV91Webhdsto6ds_8_tfstpbarser ,
                                          String AV94Webhdsto6ds_11_tfstpbarserdsc_sel ,
                                          String AV93Webhdsto6ds_10_tfstpbarserdsc ,
                                          String AV96Webhdsto6ds_13_tfstpcolor_sel ,
                                          String AV95Webhdsto6ds_12_tfstpcolor )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[41];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T3.BarCod, T3.BarCodReo, T3.BarCodPar, T1.EmprCod, T1.Stp_MotA, T1.Stp_DiaA, T1.Stp_Mot, T1.Stp_Dia, RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.Stp_hdr,'99999990'), 2)))" ;
      scmdbuf += " || '-' || SUBSTR(TO_CHAR(T2.Stp_r,'90'), 2) || T2.Stp_p AS StpHdr, COALESCE( T3.BarColNom, ' ') AS StpColor, COALESCE( T3.BarSerDsc, ' ') AS StpBarserD, COALESCE(" ;
      scmdbuf += " T3.BarSer, ' ') AS StpBarser, COALESCE( T4.StpCliNom, ' ') AS StpCliNom, COALESCE( T3.CliCod, 0) AS StpClicod, T1.Stp_hdr, T1.Stp_r, T1.Stp_p, T1.Stp_Lin FROM (((TXPHDSTO1" ;
      scmdbuf += " T1 INNER JOIN TXPHDSTOP T2 ON T2.EmprCod = T1.EmprCod AND T2.Stp_hdr = T1.Stp_hdr AND T2.Stp_r = T1.Stp_r AND T2.Stp_p = T1.Stp_p) LEFT JOIN TXPBARCAD T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.BarCod = T1.Stp_hdr AND T3.BarCodReo = T1.Stp_r AND T3.BarCodPar = T1.Stp_p) LEFT JOIN (SELECT T6.CliNom AS StpCliNom, T5.EmprCod, T5.BarCod," ;
      scmdbuf += " T7.Stp_hdr, T5.BarCodReo, T7.Stp_r, T5.BarCodPar, T7.Stp_p FROM ((TXPBARCAD T5 LEFT JOIN TXPCLIENT T6 ON T6.EmprCod = T5.EmprCod AND T6.CliCod = T5.CliCod) INNER" ;
      scmdbuf += " JOIN TXPHDSTOP T7 ON T7.EmprCod = T5.EmprCod) WHERE T5.BarCod = T7.Stp_hdr and T5.BarCodReo = T7.Stp_r and T5.BarCodPar = T7.Stp_p ) T4 ON T4.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T4.Stp_hdr = T1.Stp_hdr AND T4.Stp_r = T1.Stp_r AND T4.Stp_p = T1.Stp_p)" ;
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
      if ( (GXutil.strcmp("", AV86Webhdsto6ds_3_tfstphdr_sel)==0) && ( ! (GXutil.strcmp("", AV85Webhdsto6ds_2_tfstphdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T1.Stp_r,'90'), 2) || T1.Stp_p) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Webhdsto6ds_3_tfstphdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T1.Stp_r,'90'), 2) || T1.Stp_p = ?)");
      }
      else
      {
         GXv_int6[34] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV97Webhdsto6ds_14_tfstp_dia) )
      {
         addWhere(sWhereString, "(T1.Stp_Dia >= ?)");
      }
      else
      {
         GXv_int6[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Webhdsto6ds_16_tfstp_mot_sel)==0) && ( ! (GXutil.strcmp("", AV98Webhdsto6ds_15_tfstp_mot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Stp_Mot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Webhdsto6ds_16_tfstp_mot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Stp_Mot = ?)");
      }
      else
      {
         GXv_int6[37] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV100Webhdsto6ds_17_tfstp_diaa) )
      {
         addWhere(sWhereString, "(T1.Stp_DiaA >= ?)");
      }
      else
      {
         GXv_int6[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Webhdsto6ds_19_tfstp_mota_sel)==0) && ( ! (GXutil.strcmp("", AV101Webhdsto6ds_18_tfstp_mota)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Stp_MotA) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Webhdsto6ds_19_tfstp_mota_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Stp_MotA = ?)");
      }
      else
      {
         GXv_int6[40] = (byte)(1) ;
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
                  return conditional_P08DO3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (java.util.Date)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.util.Date)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).byteValue() , (String)dynConstraints[10] , (java.util.Date)dynConstraints[11] , (String)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).shortValue() , ((Boolean) dynConstraints[16]).booleanValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).intValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08DO3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
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
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
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
                  stmt.setString(sIdx, (String)parms[54], 30);
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
                  stmt.setString(sIdx, (String)parms[59], 16);
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
                  stmt.setString(sIdx, (String)parms[64], 26);
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
                  stmt.setString(sIdx, (String)parms[69], 13);
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
                  stmt.setString(sIdx, (String)parms[74], 11);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 11);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[76], false);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 300);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 300);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[79], false);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 300);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 300);
               }
               return;
      }
   }

}

