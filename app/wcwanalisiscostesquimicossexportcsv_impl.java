package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wcwanalisiscostesquimicossexportcsv_impl extends GXWebProcedure
{
   public wcwanalisiscostesquimicossexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "WCWAnalisisCostesQuimicossExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("WCWAnalisisCostesQuimicossColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("WCWAnalisisCostesQuimicossColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha Cierre", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+"" : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "N Hdr", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Agr?", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Kilos", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Kilos Tot", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Maquina", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Volumen", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Rb", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Coste I", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Coste T", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Dif", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+"%" : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Coste kg", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Articulo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Tipo articulo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Color", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Numero", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "TC", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Intensidad", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+24)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Proceso", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+25)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+26)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+"" : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+27)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Inicio", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+28)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fin", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+29)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Disp Cliente", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV105Wcwanalisiscostesquimicossds_1_filterfulltext = AV101FilterFullText ;
      AV106Wcwanalisiscostesquimicossds_2_tfhrefectin = AV33TFHreFecTin ;
      AV107Wcwanalisiscostesquimicossds_3_tfhrebarkgm = AV38TFHreBarKgm ;
      AV108Wcwanalisiscostesquimicossds_4_tfhrebarkgm_to = AV39TFHreBarKgm_To ;
      AV109Wcwanalisiscostesquimicossds_5_tfhretotkgm = AV40TFHreTotKgm ;
      AV110Wcwanalisiscostesquimicossds_6_tfhretotkgm_to = AV41TFHreTotKgm_To ;
      AV111Wcwanalisiscostesquimicossds_7_tfhremaqcod = AV42TFHreMaqCod ;
      AV112Wcwanalisiscostesquimicossds_8_tfhremaqcod_sel = AV43TFHreMaqCod_Sel ;
      AV113Wcwanalisiscostesquimicossds_9_tfhrevolprd = AV44TFHreVolPrd ;
      AV114Wcwanalisiscostesquimicossds_10_tfhrevolprd_to = AV45TFHreVolPrd_To ;
      AV115Wcwanalisiscostesquimicossds_11_tfclicod = AV52TFCliCod ;
      AV116Wcwanalisiscostesquimicossds_12_tfclicod_to = AV53TFCliCod_To ;
      AV117Wcwanalisiscostesquimicossds_13_tfclinom = AV54TFCliNom ;
      AV118Wcwanalisiscostesquimicossds_14_tfclinom_sel = AV55TFCliNom_Sel ;
      AV119Wcwanalisiscostesquimicossds_15_tfhrebarser = AV56TFHreBarSer ;
      AV120Wcwanalisiscostesquimicossds_16_tfhrebarser_sel = AV57TFHreBarSer_Sel ;
      AV121Wcwanalisiscostesquimicossds_17_tfhrebardsc = AV58TFHreBarDsc ;
      AV122Wcwanalisiscostesquimicossds_18_tfhrebardsc_sel = AV59TFHreBarDsc_Sel ;
      AV123Wcwanalisiscostesquimicossds_19_tfhretipartd = AV60TFHreTipArtD ;
      AV124Wcwanalisiscostesquimicossds_20_tfhretipartd_sel = AV61TFHreTipArtD_Sel ;
      AV125Wcwanalisiscostesquimicossds_21_tfhrecolnom = AV62TFHreColNom ;
      AV126Wcwanalisiscostesquimicossds_22_tfhrecolnom_sel = AV63TFHreColNom_Sel ;
      AV127Wcwanalisiscostesquimicossds_23_tfhrecolnum = AV64TFHreColNum ;
      AV128Wcwanalisiscostesquimicossds_24_tfhrecolnum_to = AV65TFHreColNum_To ;
      AV129Wcwanalisiscostesquimicossds_25_tfhretipcoln = AV66TFHreTipColN ;
      AV130Wcwanalisiscostesquimicossds_26_tfhretipcoln_sel = AV67TFHreTipColN_Sel ;
      AV131Wcwanalisiscostesquimicossds_27_tfhreintdsc = AV70TFHreIntDsc ;
      AV132Wcwanalisiscostesquimicossds_28_tfhreintdsc_sel = AV71TFHreIntDsc_Sel ;
      AV133Wcwanalisiscostesquimicossds_29_tfhredti = AV97TFHreDti ;
      AV134Wcwanalisiscostesquimicossds_30_tfhredtf = AV99TFHreDtf ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV105Wcwanalisiscostesquimicossds_1_filterfulltext ,
                                           AV106Wcwanalisiscostesquimicossds_2_tfhrefectin ,
                                           AV107Wcwanalisiscostesquimicossds_3_tfhrebarkgm ,
                                           AV108Wcwanalisiscostesquimicossds_4_tfhrebarkgm_to ,
                                           AV109Wcwanalisiscostesquimicossds_5_tfhretotkgm ,
                                           AV110Wcwanalisiscostesquimicossds_6_tfhretotkgm_to ,
                                           AV112Wcwanalisiscostesquimicossds_8_tfhremaqcod_sel ,
                                           AV111Wcwanalisiscostesquimicossds_7_tfhremaqcod ,
                                           Integer.valueOf(AV113Wcwanalisiscostesquimicossds_9_tfhrevolprd) ,
                                           Integer.valueOf(AV114Wcwanalisiscostesquimicossds_10_tfhrevolprd_to) ,
                                           Integer.valueOf(AV115Wcwanalisiscostesquimicossds_11_tfclicod) ,
                                           Integer.valueOf(AV116Wcwanalisiscostesquimicossds_12_tfclicod_to) ,
                                           AV118Wcwanalisiscostesquimicossds_14_tfclinom_sel ,
                                           AV117Wcwanalisiscostesquimicossds_13_tfclinom ,
                                           AV120Wcwanalisiscostesquimicossds_16_tfhrebarser_sel ,
                                           AV119Wcwanalisiscostesquimicossds_15_tfhrebarser ,
                                           AV122Wcwanalisiscostesquimicossds_18_tfhrebardsc_sel ,
                                           AV121Wcwanalisiscostesquimicossds_17_tfhrebardsc ,
                                           AV124Wcwanalisiscostesquimicossds_20_tfhretipartd_sel ,
                                           AV123Wcwanalisiscostesquimicossds_19_tfhretipartd ,
                                           AV126Wcwanalisiscostesquimicossds_22_tfhrecolnom_sel ,
                                           AV125Wcwanalisiscostesquimicossds_21_tfhrecolnom ,
                                           Integer.valueOf(AV127Wcwanalisiscostesquimicossds_23_tfhrecolnum) ,
                                           Integer.valueOf(AV128Wcwanalisiscostesquimicossds_24_tfhrecolnum_to) ,
                                           AV130Wcwanalisiscostesquimicossds_26_tfhretipcoln_sel ,
                                           AV129Wcwanalisiscostesquimicossds_25_tfhretipcoln ,
                                           AV132Wcwanalisiscostesquimicossds_28_tfhreintdsc_sel ,
                                           AV131Wcwanalisiscostesquimicossds_27_tfhreintdsc ,
                                           AV133Wcwanalisiscostesquimicossds_29_tfhredti ,
                                           AV134Wcwanalisiscostesquimicossds_30_tfhredtf ,
                                           A4532HreBarKgm ,
                                           A4542HreTotKgm ,
                                           A4546HreMaqCod ,
                                           Integer.valueOf(A4547HreVolPrd) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A4517HreBarSer ,
                                           A4518HreBarDsc ,
                                           A4520HreTipArtD ,
                                           A4521HreColNom ,
                                           Integer.valueOf(A4522HreColNum) ,
                                           A4526HreTipColN ,
                                           A4540HreIntDsc ,
                                           A4529HreFecTin ,
                                           A10103HreDti ,
                                           A10104HreDtf ,
                                           Short.valueOf(AV37OrderedBy) ,
                                           Boolean.valueOf(AV28OrderedDsc) ,
                                           AV79Fec1 ,
                                           AV80Fec2 ,
                                           A9808HreRacab ,
                                           AV75HreRacab ,
                                           Integer.valueOf(AV88Clicod1) ,
                                           Integer.valueOf(AV89Clicod3) ,
                                           AV82ARtcod1 ,
                                           AV83ARtcod3 ,
                                           Short.valueOf(A4519HreTipArt) ,
                                           Short.valueOf(AV92TipArtCod1) ,
                                           Short.valueOf(AV93TipArtCod3) ,
                                           AV84Barcolnom1 ,
                                           AV85Barcolnom3 ,
                                           Integer.valueOf(AV86Barcolnum1) ,
                                           Integer.valueOf(AV87Barcolnum3) ,
                                           Byte.valueOf(A4525HreTipCol) ,
                                           Byte.valueOf(AV94Tipcolcod1) ,
                                           Byte.valueOf(AV95Tipcolcod3) ,
                                           Byte.valueOf(A4539HreIntCod) ,
                                           Byte.valueOf(AV90Intcod1) ,
                                           Byte.valueOf(AV91Intcod3) ,
                                           Integer.valueOf(A4492HreBarCod) ,
                                           Integer.valueOf(AV76barcod) ,
                                           Byte.valueOf(A4493HreBarReo) ,
                                           Byte.valueOf(AV77barcodreo) ,
                                           A4494HreBarPar ,
                                           AV78barcodpar ,
                                           AV74Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV117Wcwanalisiscostesquimicossds_13_tfclinom = GXutil.padr( GXutil.rtrim( AV117Wcwanalisiscostesquimicossds_13_tfclinom), 30, "%") ;
      lV119Wcwanalisiscostesquimicossds_15_tfhrebarser = GXutil.padr( GXutil.rtrim( AV119Wcwanalisiscostesquimicossds_15_tfhrebarser), 16, "%") ;
      lV121Wcwanalisiscostesquimicossds_17_tfhrebardsc = GXutil.padr( GXutil.rtrim( AV121Wcwanalisiscostesquimicossds_17_tfhrebardsc), 26, "%") ;
      lV123Wcwanalisiscostesquimicossds_19_tfhretipartd = GXutil.padr( GXutil.rtrim( AV123Wcwanalisiscostesquimicossds_19_tfhretipartd), 30, "%") ;
      lV125Wcwanalisiscostesquimicossds_21_tfhrecolnom = GXutil.padr( GXutil.rtrim( AV125Wcwanalisiscostesquimicossds_21_tfhrecolnom), 13, "%") ;
      lV129Wcwanalisiscostesquimicossds_25_tfhretipcoln = GXutil.padr( GXutil.rtrim( AV129Wcwanalisiscostesquimicossds_25_tfhretipcoln), 26, "%") ;
      lV131Wcwanalisiscostesquimicossds_27_tfhreintdsc = GXutil.padr( GXutil.rtrim( AV131Wcwanalisiscostesquimicossds_27_tfhreintdsc), 30, "%") ;
      /* Using cursor P08L22 */
      pr_default.execute(0, new Object[] {AV74Emprcod, AV79Fec1, AV80Fec2, Integer.valueOf(AV88Clicod1), Integer.valueOf(AV89Clicod3), AV82ARtcod1, AV83ARtcod3, Short.valueOf(AV92TipArtCod1), Short.valueOf(AV93TipArtCod3), AV84Barcolnom1, AV85Barcolnom3, Integer.valueOf(AV86Barcolnum1), Integer.valueOf(AV87Barcolnum3), Byte.valueOf(AV94Tipcolcod1), Byte.valueOf(AV95Tipcolcod3), Byte.valueOf(AV90Intcod1), Byte.valueOf(AV91Intcod3), Integer.valueOf(AV76barcod), Integer.valueOf(AV76barcod), Byte.valueOf(AV77barcodreo), Byte.valueOf(AV77barcodreo), AV78barcodpar, AV78barcodpar, AV106Wcwanalisiscostesquimicossds_2_tfhrefectin, AV107Wcwanalisiscostesquimicossds_3_tfhrebarkgm, AV108Wcwanalisiscostesquimicossds_4_tfhrebarkgm_to, AV109Wcwanalisiscostesquimicossds_5_tfhretotkgm, AV110Wcwanalisiscostesquimicossds_6_tfhretotkgm_to, Integer.valueOf(AV115Wcwanalisiscostesquimicossds_11_tfclicod), Integer.valueOf(AV116Wcwanalisiscostesquimicossds_12_tfclicod_to), lV117Wcwanalisiscostesquimicossds_13_tfclinom, AV118Wcwanalisiscostesquimicossds_14_tfclinom_sel, lV119Wcwanalisiscostesquimicossds_15_tfhrebarser, AV120Wcwanalisiscostesquimicossds_16_tfhrebarser_sel, lV121Wcwanalisiscostesquimicossds_17_tfhrebardsc, AV122Wcwanalisiscostesquimicossds_18_tfhrebardsc_sel, lV123Wcwanalisiscostesquimicossds_19_tfhretipartd, AV124Wcwanalisiscostesquimicossds_20_tfhretipartd_sel, lV125Wcwanalisiscostesquimicossds_21_tfhrecolnom, AV126Wcwanalisiscostesquimicossds_22_tfhrecolnom_sel, Integer.valueOf(AV127Wcwanalisiscostesquimicossds_23_tfhrecolnum), Integer.valueOf(AV128Wcwanalisiscostesquimicossds_24_tfhrecolnum_to), lV129Wcwanalisiscostesquimicossds_25_tfhretipcoln, AV130Wcwanalisiscostesquimicossds_26_tfhretipcoln_sel, lV131Wcwanalisiscostesquimicossds_27_tfhreintdsc, AV132Wcwanalisiscostesquimicossds_28_tfhreintdsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4495HreNumCie = P08L22_A4495HreNumCie[0] ;
         A4494HreBarPar = P08L22_A4494HreBarPar[0] ;
         A4493HreBarReo = P08L22_A4493HreBarReo[0] ;
         A4492HreBarCod = P08L22_A4492HreBarCod[0] ;
         A396EmprCod = P08L22_A396EmprCod[0] ;
         A4539HreIntCod = P08L22_A4539HreIntCod[0] ;
         n4539HreIntCod = P08L22_n4539HreIntCod[0] ;
         A4525HreTipCol = P08L22_A4525HreTipCol[0] ;
         n4525HreTipCol = P08L22_n4525HreTipCol[0] ;
         A4519HreTipArt = P08L22_A4519HreTipArt[0] ;
         n4519HreTipArt = P08L22_n4519HreTipArt[0] ;
         A9808HreRacab = P08L22_A9808HreRacab[0] ;
         n9808HreRacab = P08L22_n9808HreRacab[0] ;
         A4540HreIntDsc = P08L22_A4540HreIntDsc[0] ;
         n4540HreIntDsc = P08L22_n4540HreIntDsc[0] ;
         A4526HreTipColN = P08L22_A4526HreTipColN[0] ;
         n4526HreTipColN = P08L22_n4526HreTipColN[0] ;
         A4522HreColNum = P08L22_A4522HreColNum[0] ;
         n4522HreColNum = P08L22_n4522HreColNum[0] ;
         A4521HreColNom = P08L22_A4521HreColNom[0] ;
         n4521HreColNom = P08L22_n4521HreColNom[0] ;
         A4520HreTipArtD = P08L22_A4520HreTipArtD[0] ;
         n4520HreTipArtD = P08L22_n4520HreTipArtD[0] ;
         A4518HreBarDsc = P08L22_A4518HreBarDsc[0] ;
         n4518HreBarDsc = P08L22_n4518HreBarDsc[0] ;
         A4517HreBarSer = P08L22_A4517HreBarSer[0] ;
         n4517HreBarSer = P08L22_n4517HreBarSer[0] ;
         A279CliNom = P08L22_A279CliNom[0] ;
         A252CliCod = P08L22_A252CliCod[0] ;
         n252CliCod = P08L22_n252CliCod[0] ;
         A4542HreTotKgm = P08L22_A4542HreTotKgm[0] ;
         n4542HreTotKgm = P08L22_n4542HreTotKgm[0] ;
         A4532HreBarKgm = P08L22_A4532HreBarKgm[0] ;
         n4532HreBarKgm = P08L22_n4532HreBarKgm[0] ;
         A4529HreFecTin = P08L22_A4529HreFecTin[0] ;
         n4529HreFecTin = P08L22_n4529HreFecTin[0] ;
         A4516HreDisCli = P08L22_A4516HreDisCli[0] ;
         n4516HreDisCli = P08L22_n4516HreDisCli[0] ;
         A11318HreDispCli = P08L22_A11318HreDispCli[0] ;
         n11318HreDispCli = P08L22_n11318HreDispCli[0] ;
         A279CliNom = P08L22_A279CliNom[0] ;
         if ( ( GXutil.strcmp(A9808HreRacab, AV75HreRacab) == 0 ) || ( GXutil.strcmp(AV75HreRacab, httpContext.getMessage( "T", "")) == 0 ) )
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
               AV14TextFileLine += localUtil.dtoc( A4529HreFecTin, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV29ToA = ((GXutil.strcmp(A9808HreRacab, httpContext.getMessage( "S", ""))==0) ? httpContext.getMessage( "A", "") : httpContext.getMessage( "T", "")) ;
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV29ToA, ";", ","), GXv_char3) ;
               wcwanalisiscostesquimicossexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV35Hdr = GXutil.str( A4492HreBarCod, 8, 0) + "-" + GXutil.str( A4493HreBarReo, 1, 0) + A4494HreBarPar ;
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV35Hdr, ";", ","), GXv_char3) ;
               wcwanalisiscostesquimicossexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV36BarAgrEst = httpContext.getMessage( "N", "") ;
               if ( GXutil.strcmp(AV29ToA, httpContext.getMessage( "T", "")) == 0 )
               {
                  /* Using cursor P08L23 */
                  pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie)});
                  while ( (pr_default.getStatus(1) != 101) )
                  {
                     A4497HreAgrCod = P08L23_A4497HreAgrCod[0] ;
                     A4498HreAgrReo = P08L23_A4498HreAgrReo[0] ;
                     A4499HreAgrPar = P08L23_A4499HreAgrPar[0] ;
                     AV36BarAgrEst = httpContext.getMessage( "S", "") ;
                     pr_default.readNext(1);
                  }
                  pr_default.close(1);
               }
               else
               {
                  /* Using cursor P08L24 */
                  pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie)});
                  while ( (pr_default.getStatus(2) != 101) )
                  {
                     A9985HreAcCod = P08L24_A9985HreAcCod[0] ;
                     A9986HreAcReo = P08L24_A9986HreAcReo[0] ;
                     A9987HreAcPar = P08L24_A9987HreAcPar[0] ;
                     AV36BarAgrEst = httpContext.getMessage( "S", "") ;
                     pr_default.readNext(2);
                  }
                  pr_default.close(2);
               }
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV36BarAgrEst, ";", ","), GXv_char3) ;
               wcwanalisiscostesquimicossexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A4532HreBarKgm, 9, 2) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A4542HreTotKgm, 9, 2) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A4546HreMaqCod, ";", ","), GXv_char3) ;
               wcwanalisiscostesquimicossexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A4547HreVolPrd, 5, 0) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV46Rb = ((A4542HreTotKgm.doubleValue()>0)&&(GXutil.strcmp(AV29ToA, httpContext.getMessage( "T", ""))==0) ? DecimalUtil.doubleToDec(A4547HreVolPrd).divide(A4542HreTotKgm, 18, java.math.RoundingMode.DOWN) : DecimalUtil.doubleToDec(0)) ;
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( AV46Rb, 7, 2) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV48CosteT = ((A4542HreTotKgm.doubleValue()==0) ? DecimalUtil.doubleToDec(0) : A4532HreBarKgm.multiply((A8602HreCosAA.add(A8603HrecosAd).add(A8604HreCosAnc).add(A8605HreCosCol).add(A8606HreCosPA).add(A8607HreCosPD))).divide(A4542HreTotKgm, 18, java.math.RoundingMode.DOWN)) ;
               AV47Costei = ((A4542HreTotKgm.doubleValue()==0) ? DecimalUtil.doubleToDec(0) : A4532HreBarKgm.multiply((A8605HreCosCol.add(A8606HreCosPA).add(A8607HreCosPD))).divide(A4542HreTotKgm, 18, java.math.RoundingMode.DOWN)) ;
               AV49Dif = AV47Costei.subtract(AV48CosteT) ;
               AV73Porc = ((AV47Costei.doubleValue()!=0) ? GXutil.roundDecimal( (AV49Dif.divide(AV47Costei, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)), 2) : DecimalUtil.doubleToDec(0)) ;
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( AV47Costei, 10, 2) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( AV48CosteT, 10, 2) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( AV49Dif, 10, 2) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( AV73Porc, 6, 2) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV51CosteK = ((A4532HreBarKgm.doubleValue()>0) ? GXutil.roundDecimal( AV48CosteT.divide(A4532HreBarKgm, 18, java.math.RoundingMode.DOWN), 2) : DecimalUtil.doubleToDec(0)) ;
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( AV51CosteK, 10, 2) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A252CliCod, 6, 0) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A279CliNom, ";", ","), GXv_char3) ;
               wcwanalisiscostesquimicossexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A4517HreBarSer, ";", ","), GXv_char3) ;
               wcwanalisiscostesquimicossexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A4518HreBarDsc, ";", ","), GXv_char3) ;
               wcwanalisiscostesquimicossexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A4520HreTipArtD, ";", ","), GXv_char3) ;
               wcwanalisiscostesquimicossexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A4521HreColNom, ";", ","), GXv_char3) ;
               wcwanalisiscostesquimicossexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A4522HreColNum, 6, 0) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A4526HreTipColN, ";", ","), GXv_char3) ;
               wcwanalisiscostesquimicossexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A4540HreIntDsc, ";", ","), GXv_char3) ;
               wcwanalisiscostesquimicossexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+24)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               if ( GXutil.strcmp(AV29ToA, httpContext.getMessage( "T", "")) != 0 )
               {
                  /* Using cursor P08L25 */
                  pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie)});
                  while ( (pr_default.getStatus(3) != 101) )
                  {
                     A4551HreProCod = P08L25_A4551HreProCod[0] ;
                     A4552HreProDsc = P08L25_A4552HreProDsc[0] ;
                     A4545HreLinMaq = P08L25_A4545HreLinMaq[0] ;
                     A4550HreLinPro = P08L25_A4550HreLinPro[0] ;
                     AV68HreProCod = A4551HreProCod ;
                     AV69HreProDsc = A4552HreProDsc ;
                     pr_default.readNext(3);
                  }
                  pr_default.close(3);
               }
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV68HreProCod, ";", ","), GXv_char3) ;
               wcwanalisiscostesquimicossexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+25)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV69HreProDsc, ";", ","), GXv_char3) ;
               wcwanalisiscostesquimicossexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+26)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               if ( GXutil.strcmp(AV36BarAgrEst, httpContext.getMessage( "S", "")) == 0 )
               {
                  if ( GXutil.strcmp(AV29ToA, httpContext.getMessage( "T", "")) == 0 )
                  {
                     AV72TablaA = (byte)(0) ;
                     /* Using cursor P08L26 */
                     pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie)});
                     while ( (pr_default.getStatus(4) != 101) )
                     {
                        A4497HreAgrCod = P08L26_A4497HreAgrCod[0] ;
                        A4498HreAgrReo = P08L26_A4498HreAgrReo[0] ;
                        A4499HreAgrPar = P08L26_A4499HreAgrPar[0] ;
                        AV72TablaA = (byte)(1) ;
                        pr_default.readNext(4);
                     }
                     pr_default.close(4);
                  }
                  if ( GXutil.strcmp(AV29ToA, httpContext.getMessage( "A", "")) == 0 )
                  {
                     AV72TablaA = (byte)(0) ;
                     /* Using cursor P08L27 */
                     pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie)});
                     while ( (pr_default.getStatus(5) != 101) )
                     {
                        A9985HreAcCod = P08L27_A9985HreAcCod[0] ;
                        A9986HreAcReo = P08L27_A9986HreAcReo[0] ;
                        A9987HreAcPar = P08L27_A9987HreAcPar[0] ;
                        AV72TablaA = (byte)(1) ;
                        pr_default.readNext(5);
                     }
                     pr_default.close(5);
                  }
               }
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( AV72TablaA, 1, 0) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+27)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += localUtil.ttoc( A10103HreDti, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+28)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += localUtil.ttoc( A10104HreDtf, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+29)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV96BarEncCli = ((GXutil.strcmp("", A11318HreDispCli)==0) ? A4516HreDisCli : A11318HreDispCli) ;
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV96BarEncCli, ";", ","), GXv_char3) ;
               wcwanalisiscostesquimicossexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=WCWAnalisisCostesQuimicossExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "HreFecTin", "", "Fecha Cierre", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&ToA", "", "", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&Hdr", "", "N Hdr", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&BarAgrEst", "", "Agr?", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "HreBarKgm", "", "Kilos", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "HreTotKgm", "", "Kilos Tot", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "HreMaqCod", "", "Maquina", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "HreVolPrd", "", "Volumen", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&Rb", "", "Rb", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&Costei", "", "Coste I", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&CosteT", "", "Coste T", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&Dif", "", "Dif", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&Porc", "", "%", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&CosteK", "", "Coste kg", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CliCod", "", "Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CliNom", "", "Nombre Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "HreBarSer", "", "Articulo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "HreBarDsc", "", "Descripcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "HreTipArtD", "", "Tipo articulo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "HreColNom", "", "Color", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "HreColNum", "", "Numero", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "HreTipColN", "", "TC", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "HreIntDsc", "", "Intensidad", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&HreProCod", "", "Proceso", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&HreProDsc", "", "Descripcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&TablaA", "", "", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "HreDti", "", "Inicio", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "HreDtf", "", "Fin", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&BarEncCli", "", "Disp Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WCWAnalisisCostesQuimicossColumnsSelector", GXv_char3) ;
      wcwanalisiscostesquimicossexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("WCWAnalisisCostesQuimicossGridState"), "") == 0 )
      {
         AV31GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCWAnalisisCostesQuimicossGridState"), null, null);
      }
      else
      {
         AV31GridState.fromxml(AV19Session.getValue("WCWAnalisisCostesQuimicossGridState"), null, null);
      }
      AV37OrderedBy = AV31GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV28OrderedDsc = AV31GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV140GXV1 = 1 ;
      while ( AV140GXV1 <= AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV32GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV140GXV1));
         if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV101FilterFullText = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREFECTIN") == 0 )
         {
            AV33TFHreFecTin = localUtil.ctod( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREBARKGM") == 0 )
         {
            AV38TFHreBarKgm = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV39TFHreBarKgm_To = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRETOTKGM") == 0 )
         {
            AV40TFHreTotKgm = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV41TFHreTotKgm_To = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREMAQCOD") == 0 )
         {
            AV42TFHreMaqCod = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREMAQCOD_SEL") == 0 )
         {
            AV43TFHreMaqCod_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREVOLPRD") == 0 )
         {
            AV44TFHreVolPrd = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV45TFHreVolPrd_To = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV52TFCliCod = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV53TFCliCod_To = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV54TFCliNom = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV55TFCliNom_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREBARSER") == 0 )
         {
            AV56TFHreBarSer = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREBARSER_SEL") == 0 )
         {
            AV57TFHreBarSer_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREBARDSC") == 0 )
         {
            AV58TFHreBarDsc = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREBARDSC_SEL") == 0 )
         {
            AV59TFHreBarDsc_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRETIPARTD") == 0 )
         {
            AV60TFHreTipArtD = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRETIPARTD_SEL") == 0 )
         {
            AV61TFHreTipArtD_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRECOLNOM") == 0 )
         {
            AV62TFHreColNom = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRECOLNOM_SEL") == 0 )
         {
            AV63TFHreColNom_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRECOLNUM") == 0 )
         {
            AV64TFHreColNum = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV65TFHreColNum_To = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRETIPCOLN") == 0 )
         {
            AV66TFHreTipColN = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRETIPCOLN_SEL") == 0 )
         {
            AV67TFHreTipColN_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREINTDSC") == 0 )
         {
            AV70TFHreIntDsc = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREINTDSC_SEL") == 0 )
         {
            AV71TFHreIntDsc_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREDTI") == 0 )
         {
            AV97TFHreDti = localUtil.ctot( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREDTF") == 0 )
         {
            AV99TFHreDtf = localUtil.ctot( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV74Emprcod = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HRERACAB") == 0 )
         {
            AV75HreRacab = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FEC1") == 0 )
         {
            AV79Fec1 = localUtil.ctod( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FEC2") == 0 )
         {
            AV80Fec2 = localUtil.ctod( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CALCULO") == 0 )
         {
            AV81Calculo = (byte)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOD") == 0 )
         {
            AV76barcod = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODREO") == 0 )
         {
            AV77barcodreo = (byte)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODPAR") == 0 )
         {
            AV78barcodpar = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ARTCOD1") == 0 )
         {
            AV82ARtcod1 = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ARTCOD3") == 0 )
         {
            AV83ARtcod3 = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOLNOM1") == 0 )
         {
            AV84Barcolnom1 = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOLNOM3") == 0 )
         {
            AV85Barcolnom3 = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOLNUM1") == 0 )
         {
            AV86Barcolnum1 = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOLNUM3") == 0 )
         {
            AV87Barcolnum3 = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD1") == 0 )
         {
            AV88Clicod1 = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD3") == 0 )
         {
            AV89Clicod3 = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&INTCOD1") == 0 )
         {
            AV90Intcod1 = (byte)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&INTCOD3") == 0 )
         {
            AV91Intcod3 = (byte)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&TIPARTCOD1") == 0 )
         {
            AV92TipArtCod1 = (short)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&TIPARTCOD3") == 0 )
         {
            AV93TipArtCod3 = (short)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&TIPCOLCOD1") == 0 )
         {
            AV94Tipcolcod1 = (byte)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&TIPCOLCOD3") == 0 )
         {
            AV95Tipcolcod3 = (byte)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV140GXV1 = (int)(AV140GXV1+1) ;
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
      A4529HreFecTin = GXutil.nullDate() ;
      A9808HreRacab = "" ;
      A4494HreBarPar = "" ;
      A4532HreBarKgm = DecimalUtil.ZERO ;
      A4542HreTotKgm = DecimalUtil.ZERO ;
      A4546HreMaqCod = "" ;
      A8602HreCosAA = DecimalUtil.ZERO ;
      A8603HrecosAd = DecimalUtil.ZERO ;
      A8604HreCosAnc = DecimalUtil.ZERO ;
      A8605HreCosCol = DecimalUtil.ZERO ;
      A8606HreCosPA = DecimalUtil.ZERO ;
      A8607HreCosPD = DecimalUtil.ZERO ;
      A279CliNom = "" ;
      A4517HreBarSer = "" ;
      A4518HreBarDsc = "" ;
      A4520HreTipArtD = "" ;
      A4521HreColNom = "" ;
      A4526HreTipColN = "" ;
      A4540HreIntDsc = "" ;
      A10103HreDti = GXutil.resetTime( GXutil.nullDate() );
      A10104HreDtf = GXutil.resetTime( GXutil.nullDate() );
      A11318HreDispCli = "" ;
      A4516HreDisCli = "" ;
      AV105Wcwanalisiscostesquimicossds_1_filterfulltext = "" ;
      AV101FilterFullText = "" ;
      AV106Wcwanalisiscostesquimicossds_2_tfhrefectin = GXutil.nullDate() ;
      AV33TFHreFecTin = GXutil.nullDate() ;
      AV107Wcwanalisiscostesquimicossds_3_tfhrebarkgm = DecimalUtil.ZERO ;
      AV38TFHreBarKgm = DecimalUtil.ZERO ;
      AV108Wcwanalisiscostesquimicossds_4_tfhrebarkgm_to = DecimalUtil.ZERO ;
      AV39TFHreBarKgm_To = DecimalUtil.ZERO ;
      AV109Wcwanalisiscostesquimicossds_5_tfhretotkgm = DecimalUtil.ZERO ;
      AV40TFHreTotKgm = DecimalUtil.ZERO ;
      AV110Wcwanalisiscostesquimicossds_6_tfhretotkgm_to = DecimalUtil.ZERO ;
      AV41TFHreTotKgm_To = DecimalUtil.ZERO ;
      AV111Wcwanalisiscostesquimicossds_7_tfhremaqcod = "" ;
      AV42TFHreMaqCod = "" ;
      AV112Wcwanalisiscostesquimicossds_8_tfhremaqcod_sel = "" ;
      AV43TFHreMaqCod_Sel = "" ;
      AV117Wcwanalisiscostesquimicossds_13_tfclinom = "" ;
      AV54TFCliNom = "" ;
      AV118Wcwanalisiscostesquimicossds_14_tfclinom_sel = "" ;
      AV55TFCliNom_Sel = "" ;
      AV119Wcwanalisiscostesquimicossds_15_tfhrebarser = "" ;
      AV56TFHreBarSer = "" ;
      AV120Wcwanalisiscostesquimicossds_16_tfhrebarser_sel = "" ;
      AV57TFHreBarSer_Sel = "" ;
      AV121Wcwanalisiscostesquimicossds_17_tfhrebardsc = "" ;
      AV58TFHreBarDsc = "" ;
      AV122Wcwanalisiscostesquimicossds_18_tfhrebardsc_sel = "" ;
      AV59TFHreBarDsc_Sel = "" ;
      AV123Wcwanalisiscostesquimicossds_19_tfhretipartd = "" ;
      AV60TFHreTipArtD = "" ;
      AV124Wcwanalisiscostesquimicossds_20_tfhretipartd_sel = "" ;
      AV61TFHreTipArtD_Sel = "" ;
      AV125Wcwanalisiscostesquimicossds_21_tfhrecolnom = "" ;
      AV62TFHreColNom = "" ;
      AV126Wcwanalisiscostesquimicossds_22_tfhrecolnom_sel = "" ;
      AV63TFHreColNom_Sel = "" ;
      AV129Wcwanalisiscostesquimicossds_25_tfhretipcoln = "" ;
      AV66TFHreTipColN = "" ;
      AV130Wcwanalisiscostesquimicossds_26_tfhretipcoln_sel = "" ;
      AV67TFHreTipColN_Sel = "" ;
      AV131Wcwanalisiscostesquimicossds_27_tfhreintdsc = "" ;
      AV70TFHreIntDsc = "" ;
      AV132Wcwanalisiscostesquimicossds_28_tfhreintdsc_sel = "" ;
      AV71TFHreIntDsc_Sel = "" ;
      AV133Wcwanalisiscostesquimicossds_29_tfhredti = GXutil.resetTime( GXutil.nullDate() );
      AV97TFHreDti = GXutil.resetTime( GXutil.nullDate() );
      AV134Wcwanalisiscostesquimicossds_30_tfhredtf = GXutil.resetTime( GXutil.nullDate() );
      AV99TFHreDtf = GXutil.resetTime( GXutil.nullDate() );
      scmdbuf = "" ;
      lV105Wcwanalisiscostesquimicossds_1_filterfulltext = "" ;
      lV117Wcwanalisiscostesquimicossds_13_tfclinom = "" ;
      lV119Wcwanalisiscostesquimicossds_15_tfhrebarser = "" ;
      lV121Wcwanalisiscostesquimicossds_17_tfhrebardsc = "" ;
      lV123Wcwanalisiscostesquimicossds_19_tfhretipartd = "" ;
      lV125Wcwanalisiscostesquimicossds_21_tfhrecolnom = "" ;
      lV129Wcwanalisiscostesquimicossds_25_tfhretipcoln = "" ;
      lV131Wcwanalisiscostesquimicossds_27_tfhreintdsc = "" ;
      AV79Fec1 = GXutil.nullDate() ;
      AV80Fec2 = GXutil.nullDate() ;
      AV75HreRacab = "" ;
      AV82ARtcod1 = "" ;
      AV83ARtcod3 = "" ;
      AV84Barcolnom1 = "" ;
      AV85Barcolnom3 = "" ;
      AV78barcodpar = "" ;
      AV74Emprcod = "" ;
      A396EmprCod = "" ;
      P08L22_A4495HreNumCie = new byte[1] ;
      P08L22_A4494HreBarPar = new String[] {""} ;
      P08L22_A4493HreBarReo = new byte[1] ;
      P08L22_A4492HreBarCod = new int[1] ;
      P08L22_A396EmprCod = new String[] {""} ;
      P08L22_A4539HreIntCod = new byte[1] ;
      P08L22_n4539HreIntCod = new boolean[] {false} ;
      P08L22_A4525HreTipCol = new byte[1] ;
      P08L22_n4525HreTipCol = new boolean[] {false} ;
      P08L22_A4519HreTipArt = new short[1] ;
      P08L22_n4519HreTipArt = new boolean[] {false} ;
      P08L22_A9808HreRacab = new String[] {""} ;
      P08L22_n9808HreRacab = new boolean[] {false} ;
      P08L22_A4540HreIntDsc = new String[] {""} ;
      P08L22_n4540HreIntDsc = new boolean[] {false} ;
      P08L22_A4526HreTipColN = new String[] {""} ;
      P08L22_n4526HreTipColN = new boolean[] {false} ;
      P08L22_A4522HreColNum = new int[1] ;
      P08L22_n4522HreColNum = new boolean[] {false} ;
      P08L22_A4521HreColNom = new String[] {""} ;
      P08L22_n4521HreColNom = new boolean[] {false} ;
      P08L22_A4520HreTipArtD = new String[] {""} ;
      P08L22_n4520HreTipArtD = new boolean[] {false} ;
      P08L22_A4518HreBarDsc = new String[] {""} ;
      P08L22_n4518HreBarDsc = new boolean[] {false} ;
      P08L22_A4517HreBarSer = new String[] {""} ;
      P08L22_n4517HreBarSer = new boolean[] {false} ;
      P08L22_A279CliNom = new String[] {""} ;
      P08L22_A252CliCod = new int[1] ;
      P08L22_n252CliCod = new boolean[] {false} ;
      P08L22_A4542HreTotKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08L22_n4542HreTotKgm = new boolean[] {false} ;
      P08L22_A4532HreBarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08L22_n4532HreBarKgm = new boolean[] {false} ;
      P08L22_A4529HreFecTin = new java.util.Date[] {GXutil.nullDate()} ;
      P08L22_n4529HreFecTin = new boolean[] {false} ;
      P08L22_A4516HreDisCli = new String[] {""} ;
      P08L22_n4516HreDisCli = new boolean[] {false} ;
      P08L22_A11318HreDispCli = new String[] {""} ;
      P08L22_n11318HreDispCli = new boolean[] {false} ;
      AV29ToA = "" ;
      AV35Hdr = "" ;
      AV36BarAgrEst = "" ;
      P08L23_A396EmprCod = new String[] {""} ;
      P08L23_A4492HreBarCod = new int[1] ;
      P08L23_A4493HreBarReo = new byte[1] ;
      P08L23_A4494HreBarPar = new String[] {""} ;
      P08L23_A4495HreNumCie = new byte[1] ;
      P08L23_A4497HreAgrCod = new int[1] ;
      P08L23_A4498HreAgrReo = new byte[1] ;
      P08L23_A4499HreAgrPar = new String[] {""} ;
      A4499HreAgrPar = "" ;
      P08L24_A396EmprCod = new String[] {""} ;
      P08L24_A4492HreBarCod = new int[1] ;
      P08L24_A4493HreBarReo = new byte[1] ;
      P08L24_A4494HreBarPar = new String[] {""} ;
      P08L24_A4495HreNumCie = new byte[1] ;
      P08L24_A9985HreAcCod = new int[1] ;
      P08L24_A9986HreAcReo = new byte[1] ;
      P08L24_A9987HreAcPar = new String[] {""} ;
      A9987HreAcPar = "" ;
      AV46Rb = DecimalUtil.ZERO ;
      AV48CosteT = DecimalUtil.ZERO ;
      AV47Costei = DecimalUtil.ZERO ;
      AV49Dif = DecimalUtil.ZERO ;
      AV73Porc = DecimalUtil.ZERO ;
      AV51CosteK = DecimalUtil.ZERO ;
      P08L25_A396EmprCod = new String[] {""} ;
      P08L25_A4492HreBarCod = new int[1] ;
      P08L25_A4493HreBarReo = new byte[1] ;
      P08L25_A4494HreBarPar = new String[] {""} ;
      P08L25_A4495HreNumCie = new byte[1] ;
      P08L25_A4551HreProCod = new String[] {""} ;
      P08L25_A4552HreProDsc = new String[] {""} ;
      P08L25_A4545HreLinMaq = new short[1] ;
      P08L25_A4550HreLinPro = new byte[1] ;
      A4551HreProCod = "" ;
      A4552HreProDsc = "" ;
      AV68HreProCod = "" ;
      AV69HreProDsc = "" ;
      P08L26_A396EmprCod = new String[] {""} ;
      P08L26_A4492HreBarCod = new int[1] ;
      P08L26_A4493HreBarReo = new byte[1] ;
      P08L26_A4494HreBarPar = new String[] {""} ;
      P08L26_A4495HreNumCie = new byte[1] ;
      P08L26_A4497HreAgrCod = new int[1] ;
      P08L26_A4498HreAgrReo = new byte[1] ;
      P08L26_A4499HreAgrPar = new String[] {""} ;
      P08L27_A396EmprCod = new String[] {""} ;
      P08L27_A4492HreBarCod = new int[1] ;
      P08L27_A4493HreBarReo = new byte[1] ;
      P08L27_A4494HreBarPar = new String[] {""} ;
      P08L27_A4495HreNumCie = new byte[1] ;
      P08L27_A9985HreAcCod = new int[1] ;
      P08L27_A9986HreAcReo = new byte[1] ;
      P08L27_A9987HreAcPar = new String[] {""} ;
      AV96BarEncCli = "" ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector5 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV31GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV32GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcwanalisiscostesquimicossexportcsv__default(),
         new Object[] {
             new Object[] {
            P08L22_A4495HreNumCie, P08L22_A4494HreBarPar, P08L22_A4493HreBarReo, P08L22_A4492HreBarCod, P08L22_A396EmprCod, P08L22_A4539HreIntCod, P08L22_n4539HreIntCod, P08L22_A4525HreTipCol, P08L22_n4525HreTipCol, P08L22_A4519HreTipArt,
            P08L22_n4519HreTipArt, P08L22_A9808HreRacab, P08L22_n9808HreRacab, P08L22_A4540HreIntDsc, P08L22_n4540HreIntDsc, P08L22_A4526HreTipColN, P08L22_n4526HreTipColN, P08L22_A4522HreColNum, P08L22_n4522HreColNum, P08L22_A4521HreColNom,
            P08L22_n4521HreColNom, P08L22_A4520HreTipArtD, P08L22_n4520HreTipArtD, P08L22_A4518HreBarDsc, P08L22_n4518HreBarDsc, P08L22_A4517HreBarSer, P08L22_n4517HreBarSer, P08L22_A279CliNom, P08L22_A252CliCod, P08L22_n252CliCod,
            P08L22_A4542HreTotKgm, P08L22_n4542HreTotKgm, P08L22_A4532HreBarKgm, P08L22_n4532HreBarKgm, P08L22_A4529HreFecTin, P08L22_n4529HreFecTin, P08L22_A4516HreDisCli, P08L22_n4516HreDisCli, P08L22_A11318HreDispCli, P08L22_n11318HreDispCli
            }
            , new Object[] {
            P08L23_A396EmprCod, P08L23_A4492HreBarCod, P08L23_A4493HreBarReo, P08L23_A4494HreBarPar, P08L23_A4495HreNumCie, P08L23_A4497HreAgrCod, P08L23_A4498HreAgrReo, P08L23_A4499HreAgrPar
            }
            , new Object[] {
            P08L24_A396EmprCod, P08L24_A4492HreBarCod, P08L24_A4493HreBarReo, P08L24_A4494HreBarPar, P08L24_A4495HreNumCie, P08L24_A9985HreAcCod, P08L24_A9986HreAcReo, P08L24_A9987HreAcPar
            }
            , new Object[] {
            P08L25_A396EmprCod, P08L25_A4492HreBarCod, P08L25_A4493HreBarReo, P08L25_A4494HreBarPar, P08L25_A4495HreNumCie, P08L25_A4551HreProCod, P08L25_A4552HreProDsc, P08L25_A4545HreLinMaq, P08L25_A4550HreLinPro
            }
            , new Object[] {
            P08L26_A396EmprCod, P08L26_A4492HreBarCod, P08L26_A4493HreBarReo, P08L26_A4494HreBarPar, P08L26_A4495HreNumCie, P08L26_A4497HreAgrCod, P08L26_A4498HreAgrReo, P08L26_A4499HreAgrPar
            }
            , new Object[] {
            P08L27_A396EmprCod, P08L27_A4492HreBarCod, P08L27_A4493HreBarReo, P08L27_A4494HreBarPar, P08L27_A4495HreNumCie, P08L27_A9985HreAcCod, P08L27_A9986HreAcReo, P08L27_A9987HreAcPar
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A4493HreBarReo ;
   private byte A4525HreTipCol ;
   private byte AV94Tipcolcod1 ;
   private byte AV95Tipcolcod3 ;
   private byte A4539HreIntCod ;
   private byte AV90Intcod1 ;
   private byte AV91Intcod3 ;
   private byte AV77barcodreo ;
   private byte A4495HreNumCie ;
   private byte A4498HreAgrReo ;
   private byte A9986HreAcReo ;
   private byte A4550HreLinPro ;
   private byte AV72TablaA ;
   private byte AV81Calculo ;
   private short gxcookieaux ;
   private short AV37OrderedBy ;
   private short A4519HreTipArt ;
   private short AV92TipArtCod1 ;
   private short AV93TipArtCod3 ;
   private short A4545HreLinMaq ;
   private short Gx_err ;
   private int AV13Random ;
   private int A4492HreBarCod ;
   private int A4547HreVolPrd ;
   private int A252CliCod ;
   private int A4522HreColNum ;
   private int AV113Wcwanalisiscostesquimicossds_9_tfhrevolprd ;
   private int AV44TFHreVolPrd ;
   private int AV114Wcwanalisiscostesquimicossds_10_tfhrevolprd_to ;
   private int AV45TFHreVolPrd_To ;
   private int AV115Wcwanalisiscostesquimicossds_11_tfclicod ;
   private int AV52TFCliCod ;
   private int AV116Wcwanalisiscostesquimicossds_12_tfclicod_to ;
   private int AV53TFCliCod_To ;
   private int AV127Wcwanalisiscostesquimicossds_23_tfhrecolnum ;
   private int AV64TFHreColNum ;
   private int AV128Wcwanalisiscostesquimicossds_24_tfhrecolnum_to ;
   private int AV65TFHreColNum_To ;
   private int AV88Clicod1 ;
   private int AV89Clicod3 ;
   private int AV86Barcolnum1 ;
   private int AV87Barcolnum3 ;
   private int AV76barcod ;
   private int A4497HreAgrCod ;
   private int A9985HreAcCod ;
   private int AV140GXV1 ;
   private java.math.BigDecimal A4532HreBarKgm ;
   private java.math.BigDecimal A4542HreTotKgm ;
   private java.math.BigDecimal A8602HreCosAA ;
   private java.math.BigDecimal A8603HrecosAd ;
   private java.math.BigDecimal A8604HreCosAnc ;
   private java.math.BigDecimal A8605HreCosCol ;
   private java.math.BigDecimal A8606HreCosPA ;
   private java.math.BigDecimal A8607HreCosPD ;
   private java.math.BigDecimal AV107Wcwanalisiscostesquimicossds_3_tfhrebarkgm ;
   private java.math.BigDecimal AV38TFHreBarKgm ;
   private java.math.BigDecimal AV108Wcwanalisiscostesquimicossds_4_tfhrebarkgm_to ;
   private java.math.BigDecimal AV39TFHreBarKgm_To ;
   private java.math.BigDecimal AV109Wcwanalisiscostesquimicossds_5_tfhretotkgm ;
   private java.math.BigDecimal AV40TFHreTotKgm ;
   private java.math.BigDecimal AV110Wcwanalisiscostesquimicossds_6_tfhretotkgm_to ;
   private java.math.BigDecimal AV41TFHreTotKgm_To ;
   private java.math.BigDecimal AV46Rb ;
   private java.math.BigDecimal AV48CosteT ;
   private java.math.BigDecimal AV47Costei ;
   private java.math.BigDecimal AV49Dif ;
   private java.math.BigDecimal AV73Porc ;
   private java.math.BigDecimal AV51CosteK ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A9808HreRacab ;
   private String A4494HreBarPar ;
   private String A4546HreMaqCod ;
   private String A279CliNom ;
   private String A4517HreBarSer ;
   private String A4518HreBarDsc ;
   private String A4520HreTipArtD ;
   private String A4521HreColNom ;
   private String A4526HreTipColN ;
   private String A4540HreIntDsc ;
   private String A11318HreDispCli ;
   private String A4516HreDisCli ;
   private String AV111Wcwanalisiscostesquimicossds_7_tfhremaqcod ;
   private String AV42TFHreMaqCod ;
   private String AV112Wcwanalisiscostesquimicossds_8_tfhremaqcod_sel ;
   private String AV43TFHreMaqCod_Sel ;
   private String AV117Wcwanalisiscostesquimicossds_13_tfclinom ;
   private String AV54TFCliNom ;
   private String AV118Wcwanalisiscostesquimicossds_14_tfclinom_sel ;
   private String AV55TFCliNom_Sel ;
   private String AV119Wcwanalisiscostesquimicossds_15_tfhrebarser ;
   private String AV56TFHreBarSer ;
   private String AV120Wcwanalisiscostesquimicossds_16_tfhrebarser_sel ;
   private String AV57TFHreBarSer_Sel ;
   private String AV121Wcwanalisiscostesquimicossds_17_tfhrebardsc ;
   private String AV58TFHreBarDsc ;
   private String AV122Wcwanalisiscostesquimicossds_18_tfhrebardsc_sel ;
   private String AV59TFHreBarDsc_Sel ;
   private String AV123Wcwanalisiscostesquimicossds_19_tfhretipartd ;
   private String AV60TFHreTipArtD ;
   private String AV124Wcwanalisiscostesquimicossds_20_tfhretipartd_sel ;
   private String AV61TFHreTipArtD_Sel ;
   private String AV125Wcwanalisiscostesquimicossds_21_tfhrecolnom ;
   private String AV62TFHreColNom ;
   private String AV126Wcwanalisiscostesquimicossds_22_tfhrecolnom_sel ;
   private String AV63TFHreColNom_Sel ;
   private String AV129Wcwanalisiscostesquimicossds_25_tfhretipcoln ;
   private String AV66TFHreTipColN ;
   private String AV130Wcwanalisiscostesquimicossds_26_tfhretipcoln_sel ;
   private String AV67TFHreTipColN_Sel ;
   private String AV131Wcwanalisiscostesquimicossds_27_tfhreintdsc ;
   private String AV70TFHreIntDsc ;
   private String AV132Wcwanalisiscostesquimicossds_28_tfhreintdsc_sel ;
   private String AV71TFHreIntDsc_Sel ;
   private String scmdbuf ;
   private String lV117Wcwanalisiscostesquimicossds_13_tfclinom ;
   private String lV119Wcwanalisiscostesquimicossds_15_tfhrebarser ;
   private String lV121Wcwanalisiscostesquimicossds_17_tfhrebardsc ;
   private String lV123Wcwanalisiscostesquimicossds_19_tfhretipartd ;
   private String lV125Wcwanalisiscostesquimicossds_21_tfhrecolnom ;
   private String lV129Wcwanalisiscostesquimicossds_25_tfhretipcoln ;
   private String lV131Wcwanalisiscostesquimicossds_27_tfhreintdsc ;
   private String AV75HreRacab ;
   private String AV82ARtcod1 ;
   private String AV83ARtcod3 ;
   private String AV84Barcolnom1 ;
   private String AV85Barcolnom3 ;
   private String AV78barcodpar ;
   private String AV74Emprcod ;
   private String A396EmprCod ;
   private String AV29ToA ;
   private String AV35Hdr ;
   private String AV36BarAgrEst ;
   private String A4499HreAgrPar ;
   private String A9987HreAcPar ;
   private String A4551HreProCod ;
   private String A4552HreProDsc ;
   private String AV68HreProCod ;
   private String AV69HreProDsc ;
   private String AV96BarEncCli ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private java.util.Date A10103HreDti ;
   private java.util.Date A10104HreDtf ;
   private java.util.Date AV133Wcwanalisiscostesquimicossds_29_tfhredti ;
   private java.util.Date AV97TFHreDti ;
   private java.util.Date AV134Wcwanalisiscostesquimicossds_30_tfhredtf ;
   private java.util.Date AV99TFHreDtf ;
   private java.util.Date A4529HreFecTin ;
   private java.util.Date AV106Wcwanalisiscostesquimicossds_2_tfhrefectin ;
   private java.util.Date AV33TFHreFecTin ;
   private java.util.Date AV79Fec1 ;
   private java.util.Date AV80Fec2 ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV28OrderedDsc ;
   private boolean n4539HreIntCod ;
   private boolean n4525HreTipCol ;
   private boolean n4519HreTipArt ;
   private boolean n9808HreRacab ;
   private boolean n4540HreIntDsc ;
   private boolean n4526HreTipColN ;
   private boolean n4522HreColNum ;
   private boolean n4521HreColNom ;
   private boolean n4520HreTipArtD ;
   private boolean n4518HreBarDsc ;
   private boolean n4517HreBarSer ;
   private boolean n252CliCod ;
   private boolean n4542HreTotKgm ;
   private boolean n4532HreBarKgm ;
   private boolean n4529HreFecTin ;
   private boolean n4516HreDisCli ;
   private boolean n11318HreDispCli ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV105Wcwanalisiscostesquimicossds_1_filterfulltext ;
   private String AV101FilterFullText ;
   private String lV105Wcwanalisiscostesquimicossds_1_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private byte[] P08L22_A4495HreNumCie ;
   private String[] P08L22_A4494HreBarPar ;
   private byte[] P08L22_A4493HreBarReo ;
   private int[] P08L22_A4492HreBarCod ;
   private String[] P08L22_A396EmprCod ;
   private byte[] P08L22_A4539HreIntCod ;
   private boolean[] P08L22_n4539HreIntCod ;
   private byte[] P08L22_A4525HreTipCol ;
   private boolean[] P08L22_n4525HreTipCol ;
   private short[] P08L22_A4519HreTipArt ;
   private boolean[] P08L22_n4519HreTipArt ;
   private String[] P08L22_A9808HreRacab ;
   private boolean[] P08L22_n9808HreRacab ;
   private String[] P08L22_A4540HreIntDsc ;
   private boolean[] P08L22_n4540HreIntDsc ;
   private String[] P08L22_A4526HreTipColN ;
   private boolean[] P08L22_n4526HreTipColN ;
   private int[] P08L22_A4522HreColNum ;
   private boolean[] P08L22_n4522HreColNum ;
   private String[] P08L22_A4521HreColNom ;
   private boolean[] P08L22_n4521HreColNom ;
   private String[] P08L22_A4520HreTipArtD ;
   private boolean[] P08L22_n4520HreTipArtD ;
   private String[] P08L22_A4518HreBarDsc ;
   private boolean[] P08L22_n4518HreBarDsc ;
   private String[] P08L22_A4517HreBarSer ;
   private boolean[] P08L22_n4517HreBarSer ;
   private String[] P08L22_A279CliNom ;
   private int[] P08L22_A252CliCod ;
   private boolean[] P08L22_n252CliCod ;
   private java.math.BigDecimal[] P08L22_A4542HreTotKgm ;
   private boolean[] P08L22_n4542HreTotKgm ;
   private java.math.BigDecimal[] P08L22_A4532HreBarKgm ;
   private boolean[] P08L22_n4532HreBarKgm ;
   private java.util.Date[] P08L22_A4529HreFecTin ;
   private boolean[] P08L22_n4529HreFecTin ;
   private String[] P08L22_A4516HreDisCli ;
   private boolean[] P08L22_n4516HreDisCli ;
   private String[] P08L22_A11318HreDispCli ;
   private boolean[] P08L22_n11318HreDispCli ;
   private String[] P08L23_A396EmprCod ;
   private int[] P08L23_A4492HreBarCod ;
   private byte[] P08L23_A4493HreBarReo ;
   private String[] P08L23_A4494HreBarPar ;
   private byte[] P08L23_A4495HreNumCie ;
   private int[] P08L23_A4497HreAgrCod ;
   private byte[] P08L23_A4498HreAgrReo ;
   private String[] P08L23_A4499HreAgrPar ;
   private String[] P08L24_A396EmprCod ;
   private int[] P08L24_A4492HreBarCod ;
   private byte[] P08L24_A4493HreBarReo ;
   private String[] P08L24_A4494HreBarPar ;
   private byte[] P08L24_A4495HreNumCie ;
   private int[] P08L24_A9985HreAcCod ;
   private byte[] P08L24_A9986HreAcReo ;
   private String[] P08L24_A9987HreAcPar ;
   private String[] P08L25_A396EmprCod ;
   private int[] P08L25_A4492HreBarCod ;
   private byte[] P08L25_A4493HreBarReo ;
   private String[] P08L25_A4494HreBarPar ;
   private byte[] P08L25_A4495HreNumCie ;
   private String[] P08L25_A4551HreProCod ;
   private String[] P08L25_A4552HreProDsc ;
   private short[] P08L25_A4545HreLinMaq ;
   private byte[] P08L25_A4550HreLinPro ;
   private String[] P08L26_A396EmprCod ;
   private int[] P08L26_A4492HreBarCod ;
   private byte[] P08L26_A4493HreBarReo ;
   private String[] P08L26_A4494HreBarPar ;
   private byte[] P08L26_A4495HreNumCie ;
   private int[] P08L26_A4497HreAgrCod ;
   private byte[] P08L26_A4498HreAgrReo ;
   private String[] P08L26_A4499HreAgrPar ;
   private String[] P08L27_A396EmprCod ;
   private int[] P08L27_A4492HreBarCod ;
   private byte[] P08L27_A4493HreBarReo ;
   private String[] P08L27_A4494HreBarPar ;
   private byte[] P08L27_A4495HreNumCie ;
   private int[] P08L27_A9985HreAcCod ;
   private byte[] P08L27_A9986HreAcReo ;
   private String[] P08L27_A9987HreAcPar ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV31GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV32GridStateFilterValue ;
}

final  class wcwanalisiscostesquimicossexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08L22( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV105Wcwanalisiscostesquimicossds_1_filterfulltext ,
                                          java.util.Date AV106Wcwanalisiscostesquimicossds_2_tfhrefectin ,
                                          java.math.BigDecimal AV107Wcwanalisiscostesquimicossds_3_tfhrebarkgm ,
                                          java.math.BigDecimal AV108Wcwanalisiscostesquimicossds_4_tfhrebarkgm_to ,
                                          java.math.BigDecimal AV109Wcwanalisiscostesquimicossds_5_tfhretotkgm ,
                                          java.math.BigDecimal AV110Wcwanalisiscostesquimicossds_6_tfhretotkgm_to ,
                                          String AV112Wcwanalisiscostesquimicossds_8_tfhremaqcod_sel ,
                                          String AV111Wcwanalisiscostesquimicossds_7_tfhremaqcod ,
                                          int AV113Wcwanalisiscostesquimicossds_9_tfhrevolprd ,
                                          int AV114Wcwanalisiscostesquimicossds_10_tfhrevolprd_to ,
                                          int AV115Wcwanalisiscostesquimicossds_11_tfclicod ,
                                          int AV116Wcwanalisiscostesquimicossds_12_tfclicod_to ,
                                          String AV118Wcwanalisiscostesquimicossds_14_tfclinom_sel ,
                                          String AV117Wcwanalisiscostesquimicossds_13_tfclinom ,
                                          String AV120Wcwanalisiscostesquimicossds_16_tfhrebarser_sel ,
                                          String AV119Wcwanalisiscostesquimicossds_15_tfhrebarser ,
                                          String AV122Wcwanalisiscostesquimicossds_18_tfhrebardsc_sel ,
                                          String AV121Wcwanalisiscostesquimicossds_17_tfhrebardsc ,
                                          String AV124Wcwanalisiscostesquimicossds_20_tfhretipartd_sel ,
                                          String AV123Wcwanalisiscostesquimicossds_19_tfhretipartd ,
                                          String AV126Wcwanalisiscostesquimicossds_22_tfhrecolnom_sel ,
                                          String AV125Wcwanalisiscostesquimicossds_21_tfhrecolnom ,
                                          int AV127Wcwanalisiscostesquimicossds_23_tfhrecolnum ,
                                          int AV128Wcwanalisiscostesquimicossds_24_tfhrecolnum_to ,
                                          String AV130Wcwanalisiscostesquimicossds_26_tfhretipcoln_sel ,
                                          String AV129Wcwanalisiscostesquimicossds_25_tfhretipcoln ,
                                          String AV132Wcwanalisiscostesquimicossds_28_tfhreintdsc_sel ,
                                          String AV131Wcwanalisiscostesquimicossds_27_tfhreintdsc ,
                                          java.util.Date AV133Wcwanalisiscostesquimicossds_29_tfhredti ,
                                          java.util.Date AV134Wcwanalisiscostesquimicossds_30_tfhredtf ,
                                          java.math.BigDecimal A4532HreBarKgm ,
                                          java.math.BigDecimal A4542HreTotKgm ,
                                          String A4546HreMaqCod ,
                                          int A4547HreVolPrd ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A4517HreBarSer ,
                                          String A4518HreBarDsc ,
                                          String A4520HreTipArtD ,
                                          String A4521HreColNom ,
                                          int A4522HreColNum ,
                                          String A4526HreTipColN ,
                                          String A4540HreIntDsc ,
                                          java.util.Date A4529HreFecTin ,
                                          java.util.Date A10103HreDti ,
                                          java.util.Date A10104HreDtf ,
                                          short AV37OrderedBy ,
                                          boolean AV28OrderedDsc ,
                                          java.util.Date AV79Fec1 ,
                                          java.util.Date AV80Fec2 ,
                                          String A9808HreRacab ,
                                          String AV75HreRacab ,
                                          int AV88Clicod1 ,
                                          int AV89Clicod3 ,
                                          String AV82ARtcod1 ,
                                          String AV83ARtcod3 ,
                                          short A4519HreTipArt ,
                                          short AV92TipArtCod1 ,
                                          short AV93TipArtCod3 ,
                                          String AV84Barcolnom1 ,
                                          String AV85Barcolnom3 ,
                                          int AV86Barcolnum1 ,
                                          int AV87Barcolnum3 ,
                                          byte A4525HreTipCol ,
                                          byte AV94Tipcolcod1 ,
                                          byte AV95Tipcolcod3 ,
                                          byte A4539HreIntCod ,
                                          byte AV90Intcod1 ,
                                          byte AV91Intcod3 ,
                                          int A4492HreBarCod ,
                                          int AV76barcod ,
                                          byte A4493HreBarReo ,
                                          byte AV77barcodreo ,
                                          String A4494HreBarPar ,
                                          String AV78barcodpar ,
                                          String AV74Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[46];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.HreNumCie, T1.HreBarPar, T1.HreBarReo, T1.HreBarCod, T1.EmprCod, T1.HreIntCod, T1.HreTipCol, T1.HreTipArt, T1.HreRacab, T1.HreIntDsc, T1.HreTipColN, T1.HreColNum," ;
      scmdbuf += " T1.HreColNom, T1.HreTipArtD, T1.HreBarDsc, T1.HreBarSer, T2.CliNom, T1.CliCod, T1.HreTotKgm, T1.HreBarKgm, T1.HreFecTin, T1.HreDisCli, T1.HreDispCli FROM (TXPHISREH" ;
      scmdbuf += " T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.HreFecTin >= ?)");
      addWhere(sWhereString, "(T1.HreFecTin <= ?)");
      addWhere(sWhereString, "(T1.CliCod >= ?)");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      addWhere(sWhereString, "(T1.HreBarSer >= ?)");
      addWhere(sWhereString, "(T1.HreBarSer <= ?)");
      addWhere(sWhereString, "(T1.HreTipArt >= ?)");
      addWhere(sWhereString, "(T1.HreTipArt <= ?)");
      addWhere(sWhereString, "(T1.HreColNom >= ?)");
      addWhere(sWhereString, "(T1.HreColNom <= ?)");
      addWhere(sWhereString, "(T1.HreColNum >= ?)");
      addWhere(sWhereString, "(T1.HreColNum <= ?)");
      addWhere(sWhereString, "(T1.HreTipCol >= ?)");
      addWhere(sWhereString, "(T1.HreTipCol <= ?)");
      addWhere(sWhereString, "(T1.HreIntCod >= ?)");
      addWhere(sWhereString, "(T1.HreIntCod <= ?)");
      addWhere(sWhereString, "(T1.HreBarCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.HreBarReo = ? or (? = 0))");
      addWhere(sWhereString, "(T1.HreBarPar = ? or (rtrim(?) IS NULL))");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV106Wcwanalisiscostesquimicossds_2_tfhrefectin)) )
      {
         addWhere(sWhereString, "(T1.HreFecTin >= ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV107Wcwanalisiscostesquimicossds_3_tfhrebarkgm)==0) )
      {
         addWhere(sWhereString, "(T1.HreBarKgm >= ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV108Wcwanalisiscostesquimicossds_4_tfhrebarkgm_to)==0) )
      {
         addWhere(sWhereString, "(T1.HreBarKgm <= ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV109Wcwanalisiscostesquimicossds_5_tfhretotkgm)==0) )
      {
         addWhere(sWhereString, "(T1.HreTotKgm >= ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV110Wcwanalisiscostesquimicossds_6_tfhretotkgm_to)==0) )
      {
         addWhere(sWhereString, "(T1.HreTotKgm <= ?)");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( ! (0==AV115Wcwanalisiscostesquimicossds_11_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( ! (0==AV116Wcwanalisiscostesquimicossds_12_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV118Wcwanalisiscostesquimicossds_14_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV117Wcwanalisiscostesquimicossds_13_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV118Wcwanalisiscostesquimicossds_14_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int6[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV120Wcwanalisiscostesquimicossds_16_tfhrebarser_sel)==0) && ( ! (GXutil.strcmp("", AV119Wcwanalisiscostesquimicossds_15_tfhrebarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HreBarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV120Wcwanalisiscostesquimicossds_16_tfhrebarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HreBarSer = ?)");
      }
      else
      {
         GXv_int6[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV122Wcwanalisiscostesquimicossds_18_tfhrebardsc_sel)==0) && ( ! (GXutil.strcmp("", AV121Wcwanalisiscostesquimicossds_17_tfhrebardsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HreBarDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV122Wcwanalisiscostesquimicossds_18_tfhrebardsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HreBarDsc = ?)");
      }
      else
      {
         GXv_int6[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV124Wcwanalisiscostesquimicossds_20_tfhretipartd_sel)==0) && ( ! (GXutil.strcmp("", AV123Wcwanalisiscostesquimicossds_19_tfhretipartd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HreTipArtD) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV124Wcwanalisiscostesquimicossds_20_tfhretipartd_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HreTipArtD = ?)");
      }
      else
      {
         GXv_int6[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV126Wcwanalisiscostesquimicossds_22_tfhrecolnom_sel)==0) && ( ! (GXutil.strcmp("", AV125Wcwanalisiscostesquimicossds_21_tfhrecolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HreColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV126Wcwanalisiscostesquimicossds_22_tfhrecolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HreColNom = ?)");
      }
      else
      {
         GXv_int6[39] = (byte)(1) ;
      }
      if ( ! (0==AV127Wcwanalisiscostesquimicossds_23_tfhrecolnum) )
      {
         addWhere(sWhereString, "(T1.HreColNum >= ?)");
      }
      else
      {
         GXv_int6[40] = (byte)(1) ;
      }
      if ( ! (0==AV128Wcwanalisiscostesquimicossds_24_tfhrecolnum_to) )
      {
         addWhere(sWhereString, "(T1.HreColNum <= ?)");
      }
      else
      {
         GXv_int6[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV130Wcwanalisiscostesquimicossds_26_tfhretipcoln_sel)==0) && ( ! (GXutil.strcmp("", AV129Wcwanalisiscostesquimicossds_25_tfhretipcoln)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HreTipColN) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV130Wcwanalisiscostesquimicossds_26_tfhretipcoln_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HreTipColN = ?)");
      }
      else
      {
         GXv_int6[43] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV132Wcwanalisiscostesquimicossds_28_tfhreintdsc_sel)==0) && ( ! (GXutil.strcmp("", AV131Wcwanalisiscostesquimicossds_27_tfhreintdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HreIntDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV132Wcwanalisiscostesquimicossds_28_tfhreintdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HreIntDsc = ?)");
      }
      else
      {
         GXv_int6[45] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV37OrderedBy == 1 ) && ! AV28OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HreFecTin" ;
      }
      else if ( ( AV37OrderedBy == 1 ) && ( AV28OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HreFecTin DESC" ;
      }
      else if ( ( AV37OrderedBy == 2 ) && ! AV28OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HreBarKgm" ;
      }
      else if ( ( AV37OrderedBy == 2 ) && ( AV28OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HreBarKgm DESC" ;
      }
      else if ( ( AV37OrderedBy == 3 ) && ! AV28OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HreTotKgm" ;
      }
      else if ( ( AV37OrderedBy == 3 ) && ( AV28OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HreTotKgm DESC" ;
      }
      else if ( ( AV37OrderedBy == 4 ) && ! AV28OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV37OrderedBy == 4 ) && ( AV28OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV37OrderedBy == 5 ) && ! AV28OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV37OrderedBy == 5 ) && ( AV28OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV37OrderedBy == 6 ) && ! AV28OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV37OrderedBy == 6 ) && ( AV28OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV37OrderedBy == 7 ) && ! AV28OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.CliNom" ;
      }
      else if ( ( AV37OrderedBy == 7 ) && ( AV28OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.CliNom DESC" ;
      }
      else if ( ( AV37OrderedBy == 8 ) && ! AV28OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HreBarSer" ;
      }
      else if ( ( AV37OrderedBy == 8 ) && ( AV28OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HreBarSer DESC" ;
      }
      else if ( ( AV37OrderedBy == 9 ) && ! AV28OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HreBarDsc" ;
      }
      else if ( ( AV37OrderedBy == 9 ) && ( AV28OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HreBarDsc DESC" ;
      }
      else if ( ( AV37OrderedBy == 10 ) && ! AV28OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HreTipArtD" ;
      }
      else if ( ( AV37OrderedBy == 10 ) && ( AV28OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HreTipArtD DESC" ;
      }
      else if ( ( AV37OrderedBy == 11 ) && ! AV28OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HreColNom" ;
      }
      else if ( ( AV37OrderedBy == 11 ) && ( AV28OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HreColNom DESC" ;
      }
      else if ( ( AV37OrderedBy == 12 ) && ! AV28OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HreColNum" ;
      }
      else if ( ( AV37OrderedBy == 12 ) && ( AV28OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HreColNum DESC" ;
      }
      else if ( ( AV37OrderedBy == 13 ) && ! AV28OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HreTipColN" ;
      }
      else if ( ( AV37OrderedBy == 13 ) && ( AV28OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HreTipColN DESC" ;
      }
      else if ( ( AV37OrderedBy == 14 ) && ! AV28OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HreIntDsc" ;
      }
      else if ( ( AV37OrderedBy == 14 ) && ( AV28OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HreIntDsc DESC" ;
      }
      else if ( ( AV37OrderedBy == 15 ) && ! AV28OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV37OrderedBy == 15 ) && ( AV28OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV37OrderedBy == 16 ) && ! AV28OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV37OrderedBy == 16 ) && ( AV28OrderedDsc ) )
      {
         scmdbuf += "" ;
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
                  return conditional_P08L22(context, remoteHandle, httpContext, (String)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (java.math.BigDecimal)dynConstraints[2] , (java.math.BigDecimal)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (java.util.Date)dynConstraints[28] , (java.util.Date)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , (java.util.Date)dynConstraints[43] , (java.util.Date)dynConstraints[44] , (java.util.Date)dynConstraints[45] , ((Number) dynConstraints[46]).shortValue() , ((Boolean) dynConstraints[47]).booleanValue() , (java.util.Date)dynConstraints[48] , (java.util.Date)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , ((Number) dynConstraints[52]).intValue() , ((Number) dynConstraints[53]).intValue() , (String)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).shortValue() , ((Number) dynConstraints[57]).shortValue() , ((Number) dynConstraints[58]).shortValue() , (String)dynConstraints[59] , (String)dynConstraints[60] , ((Number) dynConstraints[61]).intValue() , ((Number) dynConstraints[62]).intValue() , ((Number) dynConstraints[63]).byteValue() , ((Number) dynConstraints[64]).byteValue() , ((Number) dynConstraints[65]).byteValue() , ((Number) dynConstraints[66]).byteValue() , ((Number) dynConstraints[67]).byteValue() , ((Number) dynConstraints[68]).byteValue() , ((Number) dynConstraints[69]).intValue() , ((Number) dynConstraints[70]).intValue() , ((Number) dynConstraints[71]).byteValue() , ((Number) dynConstraints[72]).byteValue() , (String)dynConstraints[73] , (String)dynConstraints[74] , (String)dynConstraints[75] , (String)dynConstraints[76] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08L22", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08L23", "SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAgrCod, HreAgrReo, HreAgrPar FROM TXPHISRAG WHERE EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ? ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAgrCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08L24", "SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAcCod, HreAcReo, HreAcPar FROM TXPHISHRA WHERE EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ? ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAcCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08L25", "SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreProCod, HreProDsc, HreLinMaq, HreLinPro FROM TXPHISREC WHERE EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ? ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08L26", "SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAgrCod, HreAgrReo, HreAgrPar FROM TXPHISRAG WHERE EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ? ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAgrCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08L27", "SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAcCod, HreAcReo, HreAcPar FROM TXPHISHRA WHERE EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ? ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAcCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(11, 26);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(12);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(13, 13);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(14, 30);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(15, 26);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(16, 16);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(17, 30);
               ((int[]) buf[28])[0] = rslt.getInt(18);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[30])[0] = rslt.getBigDecimal(19,2);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[32])[0] = rslt.getBigDecimal(20,2);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[34])[0] = rslt.getGXDate(21);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((String[]) buf[36])[0] = rslt.getString(22, 8);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getString(23, 20);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
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
                  stmt.setString(sIdx, (String)parms[46], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[47]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[48]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[53]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[54]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 13);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 13);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[59]).byteValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[60]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[61]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[62]).byteValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[65]).byteValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[66]).byteValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 1);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 1);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[69]);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[72], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[73], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[74]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[75]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 30);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 16);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 16);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 26);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 26);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 30);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 30);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 13);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 13);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[86]).intValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[87]).intValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 26);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 26);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 30);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 30);
               }
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
      }
   }

}

