package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tmaqui1wwexportcsv_impl extends GXWebProcedure
{
   public tmaqui1wwexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "TMAQUI1WWExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("TMAQUI1WWColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("TMAQUI1WWColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cod.", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "E", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Tipo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Vol Min", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Vol Med", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Vol Tope ( CO )", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Vol Residual", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Kgs Max", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Kgs Med", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Kgs Min", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Tipo MQ", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripción", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV105Tmaqui1wwds_1_filterfulltext = AV90FilterFullText ;
      AV106Tmaqui1wwds_2_tfmaqcod = AV48TFMaqCod ;
      AV107Tmaqui1wwds_3_tfmaqcod_sel = AV49TFMaqCod_Sel ;
      AV108Tmaqui1wwds_4_tfmaqdsc = AV50TFMaqDsc ;
      AV109Tmaqui1wwds_5_tfmaqdsc_sel = AV51TFMaqDsc_Sel ;
      AV110Tmaqui1wwds_6_tfmaqest = AV62TFMaqEst ;
      AV111Tmaqui1wwds_7_tfmaqest_sel = AV63TFMaqEst_Sel ;
      AV112Tmaqui1wwds_8_tfmaqtintip = AV92TFMaqTinTip ;
      AV113Tmaqui1wwds_9_tfmaqtintip_sel = AV93TFMaqTinTip_Sel ;
      AV114Tmaqui1wwds_10_tfmaqvolmin = AV94TFMaqVolMin ;
      AV115Tmaqui1wwds_11_tfmaqvolmin_to = AV95TFMaqVolMin_To ;
      AV116Tmaqui1wwds_12_tfmaqvolmed = AV96TFMaqVolMed ;
      AV117Tmaqui1wwds_13_tfmaqvolmed_to = AV97TFMaqVolMed_To ;
      AV118Tmaqui1wwds_14_tfmaqvoltop = AV98TFMaqVolTop ;
      AV119Tmaqui1wwds_15_tfmaqvoltop_to = AV99TFMaqVolTop_To ;
      AV120Tmaqui1wwds_16_tfmaqvolres = AV100TFMaqVolRes ;
      AV121Tmaqui1wwds_17_tfmaqvolres_to = AV101TFMaqVolRes_To ;
      AV122Tmaqui1wwds_18_tfmaqkgsmax = AV80TFMaqKgsMax ;
      AV123Tmaqui1wwds_19_tfmaqkgsmax_to = AV81TFMaqKgsMax_To ;
      AV124Tmaqui1wwds_20_tfmaqkgsmed = AV78TFMaqKgsMed ;
      AV125Tmaqui1wwds_21_tfmaqkgsmed_to = AV79TFMaqKgsMed_To ;
      AV126Tmaqui1wwds_22_tfmaqkgsmin = AV76TFMaqKgsMin ;
      AV127Tmaqui1wwds_23_tfmaqkgsmin_to = AV77TFMaqKgsMin_To ;
      AV128Tmaqui1wwds_24_tftipmaqcod = AV70TFTipMaqCod ;
      AV129Tmaqui1wwds_25_tftipmaqcod_sel = AV71TFTipMaqCod_Sel ;
      AV130Tmaqui1wwds_26_tftipmaqdsc = AV72TFTipMaqDsc ;
      AV131Tmaqui1wwds_27_tftipmaqdsc_sel = AV73TFTipMaqDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV105Tmaqui1wwds_1_filterfulltext ,
                                           AV107Tmaqui1wwds_3_tfmaqcod_sel ,
                                           AV106Tmaqui1wwds_2_tfmaqcod ,
                                           AV109Tmaqui1wwds_5_tfmaqdsc_sel ,
                                           AV108Tmaqui1wwds_4_tfmaqdsc ,
                                           AV111Tmaqui1wwds_7_tfmaqest_sel ,
                                           AV110Tmaqui1wwds_6_tfmaqest ,
                                           AV113Tmaqui1wwds_9_tfmaqtintip_sel ,
                                           AV112Tmaqui1wwds_8_tfmaqtintip ,
                                           Integer.valueOf(AV114Tmaqui1wwds_10_tfmaqvolmin) ,
                                           Integer.valueOf(AV115Tmaqui1wwds_11_tfmaqvolmin_to) ,
                                           Integer.valueOf(AV116Tmaqui1wwds_12_tfmaqvolmed) ,
                                           Integer.valueOf(AV117Tmaqui1wwds_13_tfmaqvolmed_to) ,
                                           Integer.valueOf(AV118Tmaqui1wwds_14_tfmaqvoltop) ,
                                           Integer.valueOf(AV119Tmaqui1wwds_15_tfmaqvoltop_to) ,
                                           Integer.valueOf(AV120Tmaqui1wwds_16_tfmaqvolres) ,
                                           Integer.valueOf(AV121Tmaqui1wwds_17_tfmaqvolres_to) ,
                                           AV122Tmaqui1wwds_18_tfmaqkgsmax ,
                                           AV123Tmaqui1wwds_19_tfmaqkgsmax_to ,
                                           AV124Tmaqui1wwds_20_tfmaqkgsmed ,
                                           AV125Tmaqui1wwds_21_tfmaqkgsmed_to ,
                                           AV126Tmaqui1wwds_22_tfmaqkgsmin ,
                                           AV127Tmaqui1wwds_23_tfmaqkgsmin_to ,
                                           AV129Tmaqui1wwds_25_tftipmaqcod_sel ,
                                           AV128Tmaqui1wwds_24_tftipmaqcod ,
                                           AV131Tmaqui1wwds_27_tftipmaqdsc_sel ,
                                           AV130Tmaqui1wwds_26_tftipmaqdsc ,
                                           A602MaqCod ,
                                           A606MaqDsc ,
                                           A607MaqEst ,
                                           A619MaqTinTip ,
                                           Integer.valueOf(A625MaqVolMin) ,
                                           Integer.valueOf(A624MaqVolMed) ,
                                           Integer.valueOf(A2802MaqVolTop) ,
                                           Integer.valueOf(A2801MaqVolRes) ,
                                           A4285MaqKgsMax ,
                                           A4284MaqKgsMed ,
                                           A4283MaqKgsMin ,
                                           A1011TipMaqCod ,
                                           A1012TipMaqDsc ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV105Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV105Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV105Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV105Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV105Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV105Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV105Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV105Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV105Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV105Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV105Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV105Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV105Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV106Tmaqui1wwds_2_tfmaqcod = GXutil.padr( GXutil.rtrim( AV106Tmaqui1wwds_2_tfmaqcod), 6, "%") ;
      lV108Tmaqui1wwds_4_tfmaqdsc = GXutil.padr( GXutil.rtrim( AV108Tmaqui1wwds_4_tfmaqdsc), 16, "%") ;
      lV110Tmaqui1wwds_6_tfmaqest = GXutil.padr( GXutil.rtrim( AV110Tmaqui1wwds_6_tfmaqest), 1, "%") ;
      lV112Tmaqui1wwds_8_tfmaqtintip = GXutil.padr( GXutil.rtrim( AV112Tmaqui1wwds_8_tfmaqtintip), 2, "%") ;
      lV128Tmaqui1wwds_24_tftipmaqcod = GXutil.padr( GXutil.rtrim( AV128Tmaqui1wwds_24_tftipmaqcod), 4, "%") ;
      lV130Tmaqui1wwds_26_tftipmaqdsc = GXutil.padr( GXutil.rtrim( AV130Tmaqui1wwds_26_tftipmaqdsc), 30, "%") ;
      /* Using cursor P08332 */
      pr_default.execute(0, new Object[] {lV105Tmaqui1wwds_1_filterfulltext, lV105Tmaqui1wwds_1_filterfulltext, lV105Tmaqui1wwds_1_filterfulltext, lV105Tmaqui1wwds_1_filterfulltext, lV105Tmaqui1wwds_1_filterfulltext, lV105Tmaqui1wwds_1_filterfulltext, lV105Tmaqui1wwds_1_filterfulltext, lV105Tmaqui1wwds_1_filterfulltext, lV105Tmaqui1wwds_1_filterfulltext, lV105Tmaqui1wwds_1_filterfulltext, lV105Tmaqui1wwds_1_filterfulltext, lV105Tmaqui1wwds_1_filterfulltext, lV105Tmaqui1wwds_1_filterfulltext, lV106Tmaqui1wwds_2_tfmaqcod, AV107Tmaqui1wwds_3_tfmaqcod_sel, lV108Tmaqui1wwds_4_tfmaqdsc, AV109Tmaqui1wwds_5_tfmaqdsc_sel, lV110Tmaqui1wwds_6_tfmaqest, AV111Tmaqui1wwds_7_tfmaqest_sel, lV112Tmaqui1wwds_8_tfmaqtintip, AV113Tmaqui1wwds_9_tfmaqtintip_sel, Integer.valueOf(AV114Tmaqui1wwds_10_tfmaqvolmin), Integer.valueOf(AV115Tmaqui1wwds_11_tfmaqvolmin_to), Integer.valueOf(AV116Tmaqui1wwds_12_tfmaqvolmed), Integer.valueOf(AV117Tmaqui1wwds_13_tfmaqvolmed_to), Integer.valueOf(AV118Tmaqui1wwds_14_tfmaqvoltop), Integer.valueOf(AV119Tmaqui1wwds_15_tfmaqvoltop_to), Integer.valueOf(AV120Tmaqui1wwds_16_tfmaqvolres), Integer.valueOf(AV121Tmaqui1wwds_17_tfmaqvolres_to), AV122Tmaqui1wwds_18_tfmaqkgsmax, AV123Tmaqui1wwds_19_tfmaqkgsmax_to, AV124Tmaqui1wwds_20_tfmaqkgsmed, AV125Tmaqui1wwds_21_tfmaqkgsmed_to, AV126Tmaqui1wwds_22_tfmaqkgsmin, AV127Tmaqui1wwds_23_tfmaqkgsmin_to, lV128Tmaqui1wwds_24_tftipmaqcod, AV129Tmaqui1wwds_25_tftipmaqcod_sel, lV130Tmaqui1wwds_26_tftipmaqdsc, AV131Tmaqui1wwds_27_tftipmaqdsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P08332_A396EmprCod[0] ;
         A1012TipMaqDsc = P08332_A1012TipMaqDsc[0] ;
         n1012TipMaqDsc = P08332_n1012TipMaqDsc[0] ;
         A1011TipMaqCod = P08332_A1011TipMaqCod[0] ;
         n1011TipMaqCod = P08332_n1011TipMaqCod[0] ;
         A4283MaqKgsMin = P08332_A4283MaqKgsMin[0] ;
         n4283MaqKgsMin = P08332_n4283MaqKgsMin[0] ;
         A4284MaqKgsMed = P08332_A4284MaqKgsMed[0] ;
         n4284MaqKgsMed = P08332_n4284MaqKgsMed[0] ;
         A4285MaqKgsMax = P08332_A4285MaqKgsMax[0] ;
         n4285MaqKgsMax = P08332_n4285MaqKgsMax[0] ;
         A2801MaqVolRes = P08332_A2801MaqVolRes[0] ;
         n2801MaqVolRes = P08332_n2801MaqVolRes[0] ;
         A2802MaqVolTop = P08332_A2802MaqVolTop[0] ;
         n2802MaqVolTop = P08332_n2802MaqVolTop[0] ;
         A624MaqVolMed = P08332_A624MaqVolMed[0] ;
         n624MaqVolMed = P08332_n624MaqVolMed[0] ;
         A625MaqVolMin = P08332_A625MaqVolMin[0] ;
         n625MaqVolMin = P08332_n625MaqVolMin[0] ;
         A619MaqTinTip = P08332_A619MaqTinTip[0] ;
         n619MaqTinTip = P08332_n619MaqTinTip[0] ;
         A607MaqEst = P08332_A607MaqEst[0] ;
         n607MaqEst = P08332_n607MaqEst[0] ;
         A606MaqDsc = P08332_A606MaqDsc[0] ;
         n606MaqDsc = P08332_n606MaqDsc[0] ;
         A602MaqCod = P08332_A602MaqCod[0] ;
         A1012TipMaqDsc = P08332_A1012TipMaqDsc[0] ;
         n1012TipMaqDsc = P08332_n1012TipMaqDsc[0] ;
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
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A602MaqCod, ";", ","), GXv_char3) ;
            tmaqui1wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A606MaqDsc, ";", ","), GXv_char3) ;
            tmaqui1wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A607MaqEst, ";", ","), GXv_char3) ;
            tmaqui1wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A619MaqTinTip, ";", ","), GXv_char3) ;
            tmaqui1wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A625MaqVolMin, 5, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A624MaqVolMed, 5, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A2802MaqVolTop, 5, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A2801MaqVolRes, 5, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A4285MaqKgsMax, 9, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A4284MaqKgsMed, 9, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A4283MaqKgsMin, 9, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A1011TipMaqCod, ";", ","), GXv_char3) ;
            tmaqui1wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A1012TipMaqDsc, ";", ","), GXv_char3) ;
            tmaqui1wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=TMAQUI1WWExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MaqCod", "", "Cod.", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MaqDsc", "", "Descripcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MaqEst", "", "E", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MaqTinTip", "", "Tipo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MaqVolMin", "", "Vol Min", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MaqVolMed", "", "Vol Med", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MaqVolTop", "", "Vol Tope ( CO )", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MaqVolRes", "", "Vol Residual", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MaqKgsMax", "", "Kgs Max", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MaqKgsMed", "", "Kgs Med", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MaqKgsMin", "", "Kgs Min", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "TipMaqCod", "", "Tipo MQ", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "TipMaqDsc", "", "Descripción", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "TMAQUI1WWColumnsSelector", GXv_char3) ;
      tmaqui1wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("TMAQUI1WWGridState"), "") == 0 )
      {
         AV46GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TMAQUI1WWGridState"), null, null);
      }
      else
      {
         AV46GridState.fromxml(AV19Session.getValue("TMAQUI1WWGridState"), null, null);
      }
      AV28OrderedBy = AV46GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV46GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV132GXV1 = 1 ;
      while ( AV132GXV1 <= AV46GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV47GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV46GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV132GXV1));
         if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV90FilterFullText = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD") == 0 )
         {
            AV48TFMaqCod = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD_SEL") == 0 )
         {
            AV49TFMaqCod_Sel = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQDSC") == 0 )
         {
            AV50TFMaqDsc = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQDSC_SEL") == 0 )
         {
            AV51TFMaqDsc_Sel = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQEST") == 0 )
         {
            AV62TFMaqEst = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQEST_SEL") == 0 )
         {
            AV63TFMaqEst_Sel = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQTINTIP") == 0 )
         {
            AV92TFMaqTinTip = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQTINTIP_SEL") == 0 )
         {
            AV93TFMaqTinTip_Sel = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQVOLMIN") == 0 )
         {
            AV94TFMaqVolMin = (int)(GXutil.lval( AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV95TFMaqVolMin_To = (int)(GXutil.lval( AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQVOLMED") == 0 )
         {
            AV96TFMaqVolMed = (int)(GXutil.lval( AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV97TFMaqVolMed_To = (int)(GXutil.lval( AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQVOLTOP") == 0 )
         {
            AV98TFMaqVolTop = (int)(GXutil.lval( AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV99TFMaqVolTop_To = (int)(GXutil.lval( AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQVOLRES") == 0 )
         {
            AV100TFMaqVolRes = (int)(GXutil.lval( AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV101TFMaqVolRes_To = (int)(GXutil.lval( AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQKGSMAX") == 0 )
         {
            AV80TFMaqKgsMax = CommonUtil.decimalVal( AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV81TFMaqKgsMax_To = CommonUtil.decimalVal( AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQKGSMED") == 0 )
         {
            AV78TFMaqKgsMed = CommonUtil.decimalVal( AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV79TFMaqKgsMed_To = CommonUtil.decimalVal( AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQKGSMIN") == 0 )
         {
            AV76TFMaqKgsMin = CommonUtil.decimalVal( AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV77TFMaqKgsMin_To = CommonUtil.decimalVal( AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPMAQCOD") == 0 )
         {
            AV70TFTipMaqCod = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPMAQCOD_SEL") == 0 )
         {
            AV71TFTipMaqCod_Sel = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPMAQDSC") == 0 )
         {
            AV72TFTipMaqDsc = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPMAQDSC_SEL") == 0 )
         {
            AV73TFTipMaqDsc_Sel = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV132GXV1 = (int)(AV132GXV1+1) ;
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
      A602MaqCod = "" ;
      A606MaqDsc = "" ;
      A607MaqEst = "" ;
      A619MaqTinTip = "" ;
      A4285MaqKgsMax = DecimalUtil.ZERO ;
      A4284MaqKgsMed = DecimalUtil.ZERO ;
      A4283MaqKgsMin = DecimalUtil.ZERO ;
      A1011TipMaqCod = "" ;
      A1012TipMaqDsc = "" ;
      AV105Tmaqui1wwds_1_filterfulltext = "" ;
      AV90FilterFullText = "" ;
      AV106Tmaqui1wwds_2_tfmaqcod = "" ;
      AV48TFMaqCod = "" ;
      AV107Tmaqui1wwds_3_tfmaqcod_sel = "" ;
      AV49TFMaqCod_Sel = "" ;
      AV108Tmaqui1wwds_4_tfmaqdsc = "" ;
      AV50TFMaqDsc = "" ;
      AV109Tmaqui1wwds_5_tfmaqdsc_sel = "" ;
      AV51TFMaqDsc_Sel = "" ;
      AV110Tmaqui1wwds_6_tfmaqest = "" ;
      AV62TFMaqEst = "" ;
      AV111Tmaqui1wwds_7_tfmaqest_sel = "" ;
      AV63TFMaqEst_Sel = "" ;
      AV112Tmaqui1wwds_8_tfmaqtintip = "" ;
      AV92TFMaqTinTip = "" ;
      AV113Tmaqui1wwds_9_tfmaqtintip_sel = "" ;
      AV93TFMaqTinTip_Sel = "" ;
      AV122Tmaqui1wwds_18_tfmaqkgsmax = DecimalUtil.ZERO ;
      AV80TFMaqKgsMax = DecimalUtil.ZERO ;
      AV123Tmaqui1wwds_19_tfmaqkgsmax_to = DecimalUtil.ZERO ;
      AV81TFMaqKgsMax_To = DecimalUtil.ZERO ;
      AV124Tmaqui1wwds_20_tfmaqkgsmed = DecimalUtil.ZERO ;
      AV78TFMaqKgsMed = DecimalUtil.ZERO ;
      AV125Tmaqui1wwds_21_tfmaqkgsmed_to = DecimalUtil.ZERO ;
      AV79TFMaqKgsMed_To = DecimalUtil.ZERO ;
      AV126Tmaqui1wwds_22_tfmaqkgsmin = DecimalUtil.ZERO ;
      AV76TFMaqKgsMin = DecimalUtil.ZERO ;
      AV127Tmaqui1wwds_23_tfmaqkgsmin_to = DecimalUtil.ZERO ;
      AV77TFMaqKgsMin_To = DecimalUtil.ZERO ;
      AV128Tmaqui1wwds_24_tftipmaqcod = "" ;
      AV70TFTipMaqCod = "" ;
      AV129Tmaqui1wwds_25_tftipmaqcod_sel = "" ;
      AV71TFTipMaqCod_Sel = "" ;
      AV130Tmaqui1wwds_26_tftipmaqdsc = "" ;
      AV72TFTipMaqDsc = "" ;
      AV131Tmaqui1wwds_27_tftipmaqdsc_sel = "" ;
      AV73TFTipMaqDsc_Sel = "" ;
      scmdbuf = "" ;
      lV105Tmaqui1wwds_1_filterfulltext = "" ;
      lV106Tmaqui1wwds_2_tfmaqcod = "" ;
      lV108Tmaqui1wwds_4_tfmaqdsc = "" ;
      lV110Tmaqui1wwds_6_tfmaqest = "" ;
      lV112Tmaqui1wwds_8_tfmaqtintip = "" ;
      lV128Tmaqui1wwds_24_tftipmaqcod = "" ;
      lV130Tmaqui1wwds_26_tftipmaqdsc = "" ;
      P08332_A396EmprCod = new String[] {""} ;
      P08332_A1012TipMaqDsc = new String[] {""} ;
      P08332_n1012TipMaqDsc = new boolean[] {false} ;
      P08332_A1011TipMaqCod = new String[] {""} ;
      P08332_n1011TipMaqCod = new boolean[] {false} ;
      P08332_A4283MaqKgsMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08332_n4283MaqKgsMin = new boolean[] {false} ;
      P08332_A4284MaqKgsMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08332_n4284MaqKgsMed = new boolean[] {false} ;
      P08332_A4285MaqKgsMax = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08332_n4285MaqKgsMax = new boolean[] {false} ;
      P08332_A2801MaqVolRes = new int[1] ;
      P08332_n2801MaqVolRes = new boolean[] {false} ;
      P08332_A2802MaqVolTop = new int[1] ;
      P08332_n2802MaqVolTop = new boolean[] {false} ;
      P08332_A624MaqVolMed = new int[1] ;
      P08332_n624MaqVolMed = new boolean[] {false} ;
      P08332_A625MaqVolMin = new int[1] ;
      P08332_n625MaqVolMin = new boolean[] {false} ;
      P08332_A619MaqTinTip = new String[] {""} ;
      P08332_n619MaqTinTip = new boolean[] {false} ;
      P08332_A607MaqEst = new String[] {""} ;
      P08332_n607MaqEst = new boolean[] {false} ;
      P08332_A606MaqDsc = new String[] {""} ;
      P08332_n606MaqDsc = new boolean[] {false} ;
      P08332_A602MaqCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector5 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV46GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV47GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tmaqui1wwexportcsv__default(),
         new Object[] {
             new Object[] {
            P08332_A396EmprCod, P08332_A1012TipMaqDsc, P08332_n1012TipMaqDsc, P08332_A1011TipMaqCod, P08332_n1011TipMaqCod, P08332_A4283MaqKgsMin, P08332_n4283MaqKgsMin, P08332_A4284MaqKgsMed, P08332_n4284MaqKgsMed, P08332_A4285MaqKgsMax,
            P08332_n4285MaqKgsMax, P08332_A2801MaqVolRes, P08332_n2801MaqVolRes, P08332_A2802MaqVolTop, P08332_n2802MaqVolTop, P08332_A624MaqVolMed, P08332_n624MaqVolMed, P08332_A625MaqVolMin, P08332_n625MaqVolMin, P08332_A619MaqTinTip,
            P08332_n619MaqTinTip, P08332_A607MaqEst, P08332_n607MaqEst, P08332_A606MaqDsc, P08332_n606MaqDsc, P08332_A602MaqCod
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
   private int A625MaqVolMin ;
   private int A624MaqVolMed ;
   private int A2802MaqVolTop ;
   private int A2801MaqVolRes ;
   private int AV114Tmaqui1wwds_10_tfmaqvolmin ;
   private int AV94TFMaqVolMin ;
   private int AV115Tmaqui1wwds_11_tfmaqvolmin_to ;
   private int AV95TFMaqVolMin_To ;
   private int AV116Tmaqui1wwds_12_tfmaqvolmed ;
   private int AV96TFMaqVolMed ;
   private int AV117Tmaqui1wwds_13_tfmaqvolmed_to ;
   private int AV97TFMaqVolMed_To ;
   private int AV118Tmaqui1wwds_14_tfmaqvoltop ;
   private int AV98TFMaqVolTop ;
   private int AV119Tmaqui1wwds_15_tfmaqvoltop_to ;
   private int AV99TFMaqVolTop_To ;
   private int AV120Tmaqui1wwds_16_tfmaqvolres ;
   private int AV100TFMaqVolRes ;
   private int AV121Tmaqui1wwds_17_tfmaqvolres_to ;
   private int AV101TFMaqVolRes_To ;
   private int AV132GXV1 ;
   private java.math.BigDecimal A4285MaqKgsMax ;
   private java.math.BigDecimal A4284MaqKgsMed ;
   private java.math.BigDecimal A4283MaqKgsMin ;
   private java.math.BigDecimal AV122Tmaqui1wwds_18_tfmaqkgsmax ;
   private java.math.BigDecimal AV80TFMaqKgsMax ;
   private java.math.BigDecimal AV123Tmaqui1wwds_19_tfmaqkgsmax_to ;
   private java.math.BigDecimal AV81TFMaqKgsMax_To ;
   private java.math.BigDecimal AV124Tmaqui1wwds_20_tfmaqkgsmed ;
   private java.math.BigDecimal AV78TFMaqKgsMed ;
   private java.math.BigDecimal AV125Tmaqui1wwds_21_tfmaqkgsmed_to ;
   private java.math.BigDecimal AV79TFMaqKgsMed_To ;
   private java.math.BigDecimal AV126Tmaqui1wwds_22_tfmaqkgsmin ;
   private java.math.BigDecimal AV76TFMaqKgsMin ;
   private java.math.BigDecimal AV127Tmaqui1wwds_23_tfmaqkgsmin_to ;
   private java.math.BigDecimal AV77TFMaqKgsMin_To ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A602MaqCod ;
   private String A606MaqDsc ;
   private String A607MaqEst ;
   private String A619MaqTinTip ;
   private String A1011TipMaqCod ;
   private String A1012TipMaqDsc ;
   private String AV106Tmaqui1wwds_2_tfmaqcod ;
   private String AV48TFMaqCod ;
   private String AV107Tmaqui1wwds_3_tfmaqcod_sel ;
   private String AV49TFMaqCod_Sel ;
   private String AV108Tmaqui1wwds_4_tfmaqdsc ;
   private String AV50TFMaqDsc ;
   private String AV109Tmaqui1wwds_5_tfmaqdsc_sel ;
   private String AV51TFMaqDsc_Sel ;
   private String AV110Tmaqui1wwds_6_tfmaqest ;
   private String AV62TFMaqEst ;
   private String AV111Tmaqui1wwds_7_tfmaqest_sel ;
   private String AV63TFMaqEst_Sel ;
   private String AV112Tmaqui1wwds_8_tfmaqtintip ;
   private String AV92TFMaqTinTip ;
   private String AV113Tmaqui1wwds_9_tfmaqtintip_sel ;
   private String AV93TFMaqTinTip_Sel ;
   private String AV128Tmaqui1wwds_24_tftipmaqcod ;
   private String AV70TFTipMaqCod ;
   private String AV129Tmaqui1wwds_25_tftipmaqcod_sel ;
   private String AV71TFTipMaqCod_Sel ;
   private String AV130Tmaqui1wwds_26_tftipmaqdsc ;
   private String AV72TFTipMaqDsc ;
   private String AV131Tmaqui1wwds_27_tftipmaqdsc_sel ;
   private String AV73TFTipMaqDsc_Sel ;
   private String scmdbuf ;
   private String lV106Tmaqui1wwds_2_tfmaqcod ;
   private String lV108Tmaqui1wwds_4_tfmaqdsc ;
   private String lV110Tmaqui1wwds_6_tfmaqest ;
   private String lV112Tmaqui1wwds_8_tfmaqtintip ;
   private String lV128Tmaqui1wwds_24_tftipmaqcod ;
   private String lV130Tmaqui1wwds_26_tftipmaqdsc ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean n1012TipMaqDsc ;
   private boolean n1011TipMaqCod ;
   private boolean n4283MaqKgsMin ;
   private boolean n4284MaqKgsMed ;
   private boolean n4285MaqKgsMax ;
   private boolean n2801MaqVolRes ;
   private boolean n2802MaqVolTop ;
   private boolean n624MaqVolMed ;
   private boolean n625MaqVolMin ;
   private boolean n619MaqTinTip ;
   private boolean n607MaqEst ;
   private boolean n606MaqDsc ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV105Tmaqui1wwds_1_filterfulltext ;
   private String AV90FilterFullText ;
   private String lV105Tmaqui1wwds_1_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private String[] P08332_A396EmprCod ;
   private String[] P08332_A1012TipMaqDsc ;
   private boolean[] P08332_n1012TipMaqDsc ;
   private String[] P08332_A1011TipMaqCod ;
   private boolean[] P08332_n1011TipMaqCod ;
   private java.math.BigDecimal[] P08332_A4283MaqKgsMin ;
   private boolean[] P08332_n4283MaqKgsMin ;
   private java.math.BigDecimal[] P08332_A4284MaqKgsMed ;
   private boolean[] P08332_n4284MaqKgsMed ;
   private java.math.BigDecimal[] P08332_A4285MaqKgsMax ;
   private boolean[] P08332_n4285MaqKgsMax ;
   private int[] P08332_A2801MaqVolRes ;
   private boolean[] P08332_n2801MaqVolRes ;
   private int[] P08332_A2802MaqVolTop ;
   private boolean[] P08332_n2802MaqVolTop ;
   private int[] P08332_A624MaqVolMed ;
   private boolean[] P08332_n624MaqVolMed ;
   private int[] P08332_A625MaqVolMin ;
   private boolean[] P08332_n625MaqVolMin ;
   private String[] P08332_A619MaqTinTip ;
   private boolean[] P08332_n619MaqTinTip ;
   private String[] P08332_A607MaqEst ;
   private boolean[] P08332_n607MaqEst ;
   private String[] P08332_A606MaqDsc ;
   private boolean[] P08332_n606MaqDsc ;
   private String[] P08332_A602MaqCod ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV46GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV47GridStateFilterValue ;
}

final  class tmaqui1wwexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08332( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV105Tmaqui1wwds_1_filterfulltext ,
                                          String AV107Tmaqui1wwds_3_tfmaqcod_sel ,
                                          String AV106Tmaqui1wwds_2_tfmaqcod ,
                                          String AV109Tmaqui1wwds_5_tfmaqdsc_sel ,
                                          String AV108Tmaqui1wwds_4_tfmaqdsc ,
                                          String AV111Tmaqui1wwds_7_tfmaqest_sel ,
                                          String AV110Tmaqui1wwds_6_tfmaqest ,
                                          String AV113Tmaqui1wwds_9_tfmaqtintip_sel ,
                                          String AV112Tmaqui1wwds_8_tfmaqtintip ,
                                          int AV114Tmaqui1wwds_10_tfmaqvolmin ,
                                          int AV115Tmaqui1wwds_11_tfmaqvolmin_to ,
                                          int AV116Tmaqui1wwds_12_tfmaqvolmed ,
                                          int AV117Tmaqui1wwds_13_tfmaqvolmed_to ,
                                          int AV118Tmaqui1wwds_14_tfmaqvoltop ,
                                          int AV119Tmaqui1wwds_15_tfmaqvoltop_to ,
                                          int AV120Tmaqui1wwds_16_tfmaqvolres ,
                                          int AV121Tmaqui1wwds_17_tfmaqvolres_to ,
                                          java.math.BigDecimal AV122Tmaqui1wwds_18_tfmaqkgsmax ,
                                          java.math.BigDecimal AV123Tmaqui1wwds_19_tfmaqkgsmax_to ,
                                          java.math.BigDecimal AV124Tmaqui1wwds_20_tfmaqkgsmed ,
                                          java.math.BigDecimal AV125Tmaqui1wwds_21_tfmaqkgsmed_to ,
                                          java.math.BigDecimal AV126Tmaqui1wwds_22_tfmaqkgsmin ,
                                          java.math.BigDecimal AV127Tmaqui1wwds_23_tfmaqkgsmin_to ,
                                          String AV129Tmaqui1wwds_25_tftipmaqcod_sel ,
                                          String AV128Tmaqui1wwds_24_tftipmaqcod ,
                                          String AV131Tmaqui1wwds_27_tftipmaqdsc_sel ,
                                          String AV130Tmaqui1wwds_26_tftipmaqdsc ,
                                          String A602MaqCod ,
                                          String A606MaqDsc ,
                                          String A607MaqEst ,
                                          String A619MaqTinTip ,
                                          int A625MaqVolMin ,
                                          int A624MaqVolMed ,
                                          int A2802MaqVolTop ,
                                          int A2801MaqVolRes ,
                                          java.math.BigDecimal A4285MaqKgsMax ,
                                          java.math.BigDecimal A4284MaqKgsMed ,
                                          java.math.BigDecimal A4283MaqKgsMin ,
                                          String A1011TipMaqCod ,
                                          String A1012TipMaqDsc ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[39];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T2.TipMaqDsc, T1.TipMaqCod, T1.MaqKgsMin, T1.MaqKgsMed, T1.MaqKgsMax, T1.MaqVolRes, T1.MaqVolTop, T1.MaqVolMed, T1.MaqVolMin, T1.MaqTinTip, T1.MaqEst," ;
      scmdbuf += " T1.MaqDsc, T1.MaqCod FROM (TXPMAQUIN T1 LEFT JOIN TXPTIPMAQ T2 ON T2.EmprCod = T1.EmprCod AND T2.TipMaqCod = T1.TipMaqCod)" ;
      if ( ! (GXutil.strcmp("", AV105Tmaqui1wwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( UPPER(T1.MaqDsc) like '%' || UPPER(?)) or ( UPPER(T1.MaqEst) like '%' || UPPER(?)) or ( UPPER(T1.MaqTinTip) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.MaqVolMin,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqVolMed,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqVolTop,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqVolRes,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqKgsMax,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqKgsMed,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqKgsMin,'999990.99'), 2) like '%' || ?) or ( UPPER(T1.TipMaqCod) like '%' || UPPER(?)) or ( UPPER(T2.TipMaqDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
         GXv_int6[1] = (byte)(1) ;
         GXv_int6[2] = (byte)(1) ;
         GXv_int6[3] = (byte)(1) ;
         GXv_int6[4] = (byte)(1) ;
         GXv_int6[5] = (byte)(1) ;
         GXv_int6[6] = (byte)(1) ;
         GXv_int6[7] = (byte)(1) ;
         GXv_int6[8] = (byte)(1) ;
         GXv_int6[9] = (byte)(1) ;
         GXv_int6[10] = (byte)(1) ;
         GXv_int6[11] = (byte)(1) ;
         GXv_int6[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Tmaqui1wwds_3_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV106Tmaqui1wwds_2_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Tmaqui1wwds_3_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Tmaqui1wwds_5_tfmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV108Tmaqui1wwds_4_tfmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Tmaqui1wwds_5_tfmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqDsc = ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV111Tmaqui1wwds_7_tfmaqest_sel)==0) && ( ! (GXutil.strcmp("", AV110Tmaqui1wwds_6_tfmaqest)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111Tmaqui1wwds_7_tfmaqest_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqEst = ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV113Tmaqui1wwds_9_tfmaqtintip_sel)==0) && ( ! (GXutil.strcmp("", AV112Tmaqui1wwds_8_tfmaqtintip)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqTinTip) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV113Tmaqui1wwds_9_tfmaqtintip_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqTinTip = ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (0==AV114Tmaqui1wwds_10_tfmaqvolmin) )
      {
         addWhere(sWhereString, "(T1.MaqVolMin >= ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (0==AV115Tmaqui1wwds_11_tfmaqvolmin_to) )
      {
         addWhere(sWhereString, "(T1.MaqVolMin <= ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (0==AV116Tmaqui1wwds_12_tfmaqvolmed) )
      {
         addWhere(sWhereString, "(T1.MaqVolMed >= ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (0==AV117Tmaqui1wwds_13_tfmaqvolmed_to) )
      {
         addWhere(sWhereString, "(T1.MaqVolMed <= ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! (0==AV118Tmaqui1wwds_14_tfmaqvoltop) )
      {
         addWhere(sWhereString, "(T1.MaqVolTop >= ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! (0==AV119Tmaqui1wwds_15_tfmaqvoltop_to) )
      {
         addWhere(sWhereString, "(T1.MaqVolTop <= ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( ! (0==AV120Tmaqui1wwds_16_tfmaqvolres) )
      {
         addWhere(sWhereString, "(T1.MaqVolRes >= ?)");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( ! (0==AV121Tmaqui1wwds_17_tfmaqvolres_to) )
      {
         addWhere(sWhereString, "(T1.MaqVolRes <= ?)");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV122Tmaqui1wwds_18_tfmaqkgsmax)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMax >= ?)");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV123Tmaqui1wwds_19_tfmaqkgsmax_to)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMax <= ?)");
      }
      else
      {
         GXv_int6[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV124Tmaqui1wwds_20_tfmaqkgsmed)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMed >= ?)");
      }
      else
      {
         GXv_int6[31] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV125Tmaqui1wwds_21_tfmaqkgsmed_to)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMed <= ?)");
      }
      else
      {
         GXv_int6[32] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV126Tmaqui1wwds_22_tfmaqkgsmin)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMin >= ?)");
      }
      else
      {
         GXv_int6[33] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV127Tmaqui1wwds_23_tfmaqkgsmin_to)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMin <= ?)");
      }
      else
      {
         GXv_int6[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV129Tmaqui1wwds_25_tftipmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV128Tmaqui1wwds_24_tftipmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.TipMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Tmaqui1wwds_25_tftipmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.TipMaqCod = ?)");
      }
      else
      {
         GXv_int6[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV131Tmaqui1wwds_27_tftipmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV130Tmaqui1wwds_26_tftipmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipMaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV131Tmaqui1wwds_27_tftipmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipMaqDsc = ?)");
      }
      else
      {
         GXv_int6[38] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MaqDsc" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MaqDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MaqCod" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MaqCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MaqEst" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MaqEst DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MaqTinTip" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MaqTinTip DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MaqVolMin" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MaqVolMin DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MaqVolMed" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MaqVolMed DESC" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MaqVolTop" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MaqVolTop DESC" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MaqVolRes" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MaqVolRes DESC" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MaqKgsMax" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MaqKgsMax DESC" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MaqKgsMed" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MaqKgsMed DESC" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MaqKgsMin" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MaqKgsMin DESC" ;
      }
      else if ( ( AV28OrderedBy == 12 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.TipMaqCod" ;
      }
      else if ( ( AV28OrderedBy == 12 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.TipMaqCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 13 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.TipMaqDsc" ;
      }
      else if ( ( AV28OrderedBy == 13 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.TipMaqDsc DESC" ;
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
                  return conditional_P08332(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).intValue() , (java.math.BigDecimal)dynConstraints[35] , (java.math.BigDecimal)dynConstraints[36] , (java.math.BigDecimal)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).shortValue() , ((Boolean) dynConstraints[41]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08332", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((int[]) buf[15])[0] = rslt.getInt(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 2);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 1);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 16);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 6);
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
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 1);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 1);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[67]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[68], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[69], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 2);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 2);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[72], 2);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[73], 2);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 4);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 4);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 30);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 30);
               }
               return;
      }
   }

}

