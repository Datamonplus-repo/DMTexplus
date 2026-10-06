package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class recetasdeacabado03_wpexportcsv_impl extends GXWebProcedure
{
   public recetasdeacabado03_wpexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "RecetasdeAcabado03_WPExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("RecetasdeAcabado03_WPColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("RecetasdeAcabado03_WPColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "N Hdr", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Articulo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+"#" : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Código Máquina", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Kilos", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fact.Abs.", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Volumen", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Usuario", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Usuario", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV71Recetasdeacabado03_wpds_1_filterfulltext = AV30FilterFullText ;
      AV72Recetasdeacabado03_wpds_2_tfbarnhdr = AV34TFBarNHdr ;
      AV73Recetasdeacabado03_wpds_3_tfbarnhdr_sel = AV35TFBarNHdr_Sel ;
      AV74Recetasdeacabado03_wpds_4_tfbarser = AV36TFBarSer ;
      AV75Recetasdeacabado03_wpds_5_tfbarser_sel = AV37TFBarSer_Sel ;
      AV76Recetasdeacabado03_wpds_6_tfbarserdsc = AV38TFBarSerDsc ;
      AV77Recetasdeacabado03_wpds_7_tfbarserdsc_sel = AV39TFBarSerDsc_Sel ;
      AV78Recetasdeacabado03_wpds_8_tfreclinmaq = AV50TFRecLinMaq ;
      AV79Recetasdeacabado03_wpds_9_tfreclinmaq_to = AV51TFRecLinMaq_To ;
      AV80Recetasdeacabado03_wpds_10_tfmaqcod = AV52TFMaqCod ;
      AV81Recetasdeacabado03_wpds_11_tfmaqcod_sel = AV53TFMaqCod_Sel ;
      AV82Recetasdeacabado03_wpds_12_tfrectotkgs = AV64TFRecTotKgs ;
      AV83Recetasdeacabado03_wpds_13_tfrectotkgs_to = AV65TFRecTotKgs_To ;
      AV84Recetasdeacabado03_wpds_14_tfrecfa = AV66TFRecFA ;
      AV85Recetasdeacabado03_wpds_15_tfrecfa_to = AV67TFRecFA_To ;
      AV86Recetasdeacabado03_wpds_16_tfrecvolprd = AV54TFRecVolPrd ;
      AV87Recetasdeacabado03_wpds_17_tfrecvolprd_to = AV55TFRecVolPrd_To ;
      AV88Recetasdeacabado03_wpds_18_tfrecfecalt = AV56TFRecFecAlt ;
      AV89Recetasdeacabado03_wpds_19_tfrecusrcod = AV58TFRecUsrCod ;
      AV90Recetasdeacabado03_wpds_20_tfrecusrcod_sel = AV59TFRecUsrCod_Sel ;
      AV91Recetasdeacabado03_wpds_21_tfrecfecmod = AV60TFRecFecMod ;
      AV92Recetasdeacabado03_wpds_22_tfrecusrmod = AV62TFRecUsrMod ;
      AV93Recetasdeacabado03_wpds_23_tfrecusrmod_sel = AV63TFRecUsrMod_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV71Recetasdeacabado03_wpds_1_filterfulltext ,
                                           AV73Recetasdeacabado03_wpds_3_tfbarnhdr_sel ,
                                           AV72Recetasdeacabado03_wpds_2_tfbarnhdr ,
                                           AV75Recetasdeacabado03_wpds_5_tfbarser_sel ,
                                           AV74Recetasdeacabado03_wpds_4_tfbarser ,
                                           AV77Recetasdeacabado03_wpds_7_tfbarserdsc_sel ,
                                           AV76Recetasdeacabado03_wpds_6_tfbarserdsc ,
                                           Short.valueOf(AV78Recetasdeacabado03_wpds_8_tfreclinmaq) ,
                                           Short.valueOf(AV79Recetasdeacabado03_wpds_9_tfreclinmaq_to) ,
                                           AV81Recetasdeacabado03_wpds_11_tfmaqcod_sel ,
                                           AV80Recetasdeacabado03_wpds_10_tfmaqcod ,
                                           AV82Recetasdeacabado03_wpds_12_tfrectotkgs ,
                                           AV83Recetasdeacabado03_wpds_13_tfrectotkgs_to ,
                                           AV84Recetasdeacabado03_wpds_14_tfrecfa ,
                                           AV85Recetasdeacabado03_wpds_15_tfrecfa_to ,
                                           Integer.valueOf(AV86Recetasdeacabado03_wpds_16_tfrecvolprd) ,
                                           Integer.valueOf(AV87Recetasdeacabado03_wpds_17_tfrecvolprd_to) ,
                                           AV88Recetasdeacabado03_wpds_18_tfrecfecalt ,
                                           AV90Recetasdeacabado03_wpds_20_tfrecusrcod_sel ,
                                           AV89Recetasdeacabado03_wpds_19_tfrecusrcod ,
                                           AV91Recetasdeacabado03_wpds_21_tfrecfecmod ,
                                           AV93Recetasdeacabado03_wpds_23_tfrecusrmod_sel ,
                                           AV92Recetasdeacabado03_wpds_22_tfrecusrmod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           Short.valueOf(A2804RecLinMaq) ,
                                           A602MaqCod ,
                                           A4259RecTotKgs ,
                                           A2806RecFA ,
                                           Integer.valueOf(A2805RecVolPrd) ,
                                           A4402RecUsrCod ,
                                           A4868RecUsrMod ,
                                           A4866RecFecAlt ,
                                           A4867RecFecMod ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) ,
                                           A6039RecAcab } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV71Recetasdeacabado03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Recetasdeacabado03_wpds_1_filterfulltext), "%", "") ;
      lV71Recetasdeacabado03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Recetasdeacabado03_wpds_1_filterfulltext), "%", "") ;
      lV71Recetasdeacabado03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Recetasdeacabado03_wpds_1_filterfulltext), "%", "") ;
      lV71Recetasdeacabado03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Recetasdeacabado03_wpds_1_filterfulltext), "%", "") ;
      lV71Recetasdeacabado03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Recetasdeacabado03_wpds_1_filterfulltext), "%", "") ;
      lV71Recetasdeacabado03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Recetasdeacabado03_wpds_1_filterfulltext), "%", "") ;
      lV71Recetasdeacabado03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Recetasdeacabado03_wpds_1_filterfulltext), "%", "") ;
      lV71Recetasdeacabado03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Recetasdeacabado03_wpds_1_filterfulltext), "%", "") ;
      lV71Recetasdeacabado03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Recetasdeacabado03_wpds_1_filterfulltext), "%", "") ;
      lV71Recetasdeacabado03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Recetasdeacabado03_wpds_1_filterfulltext), "%", "") ;
      lV72Recetasdeacabado03_wpds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV72Recetasdeacabado03_wpds_2_tfbarnhdr), 11, "%") ;
      lV74Recetasdeacabado03_wpds_4_tfbarser = GXutil.padr( GXutil.rtrim( AV74Recetasdeacabado03_wpds_4_tfbarser), 16, "%") ;
      lV76Recetasdeacabado03_wpds_6_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV76Recetasdeacabado03_wpds_6_tfbarserdsc), 26, "%") ;
      lV80Recetasdeacabado03_wpds_10_tfmaqcod = GXutil.padr( GXutil.rtrim( AV80Recetasdeacabado03_wpds_10_tfmaqcod), 6, "%") ;
      lV89Recetasdeacabado03_wpds_19_tfrecusrcod = GXutil.padr( GXutil.rtrim( AV89Recetasdeacabado03_wpds_19_tfrecusrcod), 8, "%") ;
      lV92Recetasdeacabado03_wpds_22_tfrecusrmod = GXutil.padr( GXutil.rtrim( AV92Recetasdeacabado03_wpds_22_tfrecusrmod), 8, "%") ;
      /* Using cursor P09BG2 */
      pr_default.execute(0, new Object[] {lV71Recetasdeacabado03_wpds_1_filterfulltext, lV71Recetasdeacabado03_wpds_1_filterfulltext, lV71Recetasdeacabado03_wpds_1_filterfulltext, lV71Recetasdeacabado03_wpds_1_filterfulltext, lV71Recetasdeacabado03_wpds_1_filterfulltext, lV71Recetasdeacabado03_wpds_1_filterfulltext, lV71Recetasdeacabado03_wpds_1_filterfulltext, lV71Recetasdeacabado03_wpds_1_filterfulltext, lV71Recetasdeacabado03_wpds_1_filterfulltext, lV71Recetasdeacabado03_wpds_1_filterfulltext, lV72Recetasdeacabado03_wpds_2_tfbarnhdr, AV73Recetasdeacabado03_wpds_3_tfbarnhdr_sel, lV74Recetasdeacabado03_wpds_4_tfbarser, AV75Recetasdeacabado03_wpds_5_tfbarser_sel, lV76Recetasdeacabado03_wpds_6_tfbarserdsc, AV77Recetasdeacabado03_wpds_7_tfbarserdsc_sel, Short.valueOf(AV78Recetasdeacabado03_wpds_8_tfreclinmaq), Short.valueOf(AV79Recetasdeacabado03_wpds_9_tfreclinmaq_to), lV80Recetasdeacabado03_wpds_10_tfmaqcod, AV81Recetasdeacabado03_wpds_11_tfmaqcod_sel, AV82Recetasdeacabado03_wpds_12_tfrectotkgs, AV83Recetasdeacabado03_wpds_13_tfrectotkgs_to, AV84Recetasdeacabado03_wpds_14_tfrecfa, AV85Recetasdeacabado03_wpds_15_tfrecfa_to, Integer.valueOf(AV86Recetasdeacabado03_wpds_16_tfrecvolprd), Integer.valueOf(AV87Recetasdeacabado03_wpds_17_tfrecvolprd_to), AV88Recetasdeacabado03_wpds_18_tfrecfecalt, lV89Recetasdeacabado03_wpds_19_tfrecusrcod, AV90Recetasdeacabado03_wpds_20_tfrecusrcod_sel, AV91Recetasdeacabado03_wpds_21_tfrecfecmod, lV92Recetasdeacabado03_wpds_22_tfrecusrmod, AV93Recetasdeacabado03_wpds_23_tfrecusrmod_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P09BG2_A396EmprCod[0] ;
         A6039RecAcab = P09BG2_A6039RecAcab[0] ;
         n6039RecAcab = P09BG2_n6039RecAcab[0] ;
         A4868RecUsrMod = P09BG2_A4868RecUsrMod[0] ;
         n4868RecUsrMod = P09BG2_n4868RecUsrMod[0] ;
         A4867RecFecMod = P09BG2_A4867RecFecMod[0] ;
         n4867RecFecMod = P09BG2_n4867RecFecMod[0] ;
         A4402RecUsrCod = P09BG2_A4402RecUsrCod[0] ;
         A4866RecFecAlt = P09BG2_A4866RecFecAlt[0] ;
         n4866RecFecAlt = P09BG2_n4866RecFecAlt[0] ;
         A2805RecVolPrd = P09BG2_A2805RecVolPrd[0] ;
         A2806RecFA = P09BG2_A2806RecFA[0] ;
         A4259RecTotKgs = P09BG2_A4259RecTotKgs[0] ;
         A602MaqCod = P09BG2_A602MaqCod[0] ;
         A2804RecLinMaq = P09BG2_A2804RecLinMaq[0] ;
         A1652BarSerDsc = P09BG2_A1652BarSerDsc[0] ;
         A212BarSer = P09BG2_A212BarSer[0] ;
         A130BarCodPar = P09BG2_A130BarCodPar[0] ;
         A132BarCodReo = P09BG2_A132BarCodReo[0] ;
         A129BarCod = P09BG2_A129BarCod[0] ;
         A1652BarSerDsc = P09BG2_A1652BarSerDsc[0] ;
         A212BarSer = P09BG2_A212BarSer[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
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
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13696BarNHdr, ";", ","), GXv_char3) ;
            recetasdeacabado03_wpexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A212BarSer, ";", ","), GXv_char3) ;
            recetasdeacabado03_wpexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A1652BarSerDsc, ";", ","), GXv_char3) ;
            recetasdeacabado03_wpexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A2804RecLinMaq, 4, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A602MaqCod, ";", ","), GXv_char3) ;
            recetasdeacabado03_wpexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A4259RecTotKgs, 10, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A2806RecFA, 6, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A2805RecVolPrd, 5, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += localUtil.ttoc( A4866RecFecAlt, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A4402RecUsrCod, ";", ","), GXv_char3) ;
            recetasdeacabado03_wpexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += localUtil.ttoc( A4867RecFecMod, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A4868RecUsrMod, ";", ","), GXv_char3) ;
            recetasdeacabado03_wpexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=RecetasdeAcabado03_WPExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarNHdr", "", "N Hdr", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarSer", "", "Articulo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarSerDsc", "", "Descripcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "RecLinMaq", "", "#", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MaqCod", "", "Código Máquina", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "RecTotKgs", "Total", "Kilos", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "RecFA", "", "Fact.Abs.", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "RecVolPrd", "", "Volumen", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "RecFecAlt", "Alta", "Fecha", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "RecUsrCod", "Alta", "Usuario", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "RecFecMod", "Modificacion", "Fecha", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "RecUsrMod", "Modificacion", "Usuario", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "RecetasdeAcabado03_WPColumnsSelector", GXv_char3) ;
      recetasdeacabado03_wpexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("RecetasdeAcabado03_WPGridState"), "") == 0 )
      {
         AV32GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "RecetasdeAcabado03_WPGridState"), null, null);
      }
      else
      {
         AV32GridState.fromxml(AV19Session.getValue("RecetasdeAcabado03_WPGridState"), null, null);
      }
      AV28OrderedBy = AV32GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV32GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV94GXV1 = 1 ;
      while ( AV94GXV1 <= AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV94GXV1));
         if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV30FilterFullText = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV34TFBarNHdr = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV35TFBarNHdr_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV36TFBarSer = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV37TFBarSer_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV38TFBarSerDsc = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV39TFBarSerDsc_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLINMAQ") == 0 )
         {
            AV50TFRecLinMaq = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV51TFRecLinMaq_To = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD") == 0 )
         {
            AV52TFMaqCod = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD_SEL") == 0 )
         {
            AV53TFMaqCod_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECTOTKGS") == 0 )
         {
            AV64TFRecTotKgs = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV65TFRecTotKgs_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECFA") == 0 )
         {
            AV66TFRecFA = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV67TFRecFA_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECVOLPRD") == 0 )
         {
            AV54TFRecVolPrd = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV55TFRecVolPrd_To = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECFECALT") == 0 )
         {
            AV56TFRecFecAlt = localUtil.ctot( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECUSRCOD") == 0 )
         {
            AV58TFRecUsrCod = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECUSRCOD_SEL") == 0 )
         {
            AV59TFRecUsrCod_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECFECMOD") == 0 )
         {
            AV60TFRecFecMod = localUtil.ctot( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECUSRMOD") == 0 )
         {
            AV62TFRecUsrMod = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECUSRMOD_SEL") == 0 )
         {
            AV63TFRecUsrMod_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV94GXV1 = (int)(AV94GXV1+1) ;
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
      A13696BarNHdr = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A602MaqCod = "" ;
      A4259RecTotKgs = DecimalUtil.ZERO ;
      A2806RecFA = DecimalUtil.ZERO ;
      A4866RecFecAlt = GXutil.resetTime( GXutil.nullDate() );
      A4402RecUsrCod = "" ;
      A4867RecFecMod = GXutil.resetTime( GXutil.nullDate() );
      A4868RecUsrMod = "" ;
      AV71Recetasdeacabado03_wpds_1_filterfulltext = "" ;
      AV30FilterFullText = "" ;
      AV72Recetasdeacabado03_wpds_2_tfbarnhdr = "" ;
      AV34TFBarNHdr = "" ;
      AV73Recetasdeacabado03_wpds_3_tfbarnhdr_sel = "" ;
      AV35TFBarNHdr_Sel = "" ;
      AV74Recetasdeacabado03_wpds_4_tfbarser = "" ;
      AV36TFBarSer = "" ;
      AV75Recetasdeacabado03_wpds_5_tfbarser_sel = "" ;
      AV37TFBarSer_Sel = "" ;
      AV76Recetasdeacabado03_wpds_6_tfbarserdsc = "" ;
      AV38TFBarSerDsc = "" ;
      AV77Recetasdeacabado03_wpds_7_tfbarserdsc_sel = "" ;
      AV39TFBarSerDsc_Sel = "" ;
      AV80Recetasdeacabado03_wpds_10_tfmaqcod = "" ;
      AV52TFMaqCod = "" ;
      AV81Recetasdeacabado03_wpds_11_tfmaqcod_sel = "" ;
      AV53TFMaqCod_Sel = "" ;
      AV82Recetasdeacabado03_wpds_12_tfrectotkgs = DecimalUtil.ZERO ;
      AV64TFRecTotKgs = DecimalUtil.ZERO ;
      AV83Recetasdeacabado03_wpds_13_tfrectotkgs_to = DecimalUtil.ZERO ;
      AV65TFRecTotKgs_To = DecimalUtil.ZERO ;
      AV84Recetasdeacabado03_wpds_14_tfrecfa = DecimalUtil.ZERO ;
      AV66TFRecFA = DecimalUtil.ZERO ;
      AV85Recetasdeacabado03_wpds_15_tfrecfa_to = DecimalUtil.ZERO ;
      AV67TFRecFA_To = DecimalUtil.ZERO ;
      AV88Recetasdeacabado03_wpds_18_tfrecfecalt = GXutil.resetTime( GXutil.nullDate() );
      AV56TFRecFecAlt = GXutil.resetTime( GXutil.nullDate() );
      AV89Recetasdeacabado03_wpds_19_tfrecusrcod = "" ;
      AV58TFRecUsrCod = "" ;
      AV90Recetasdeacabado03_wpds_20_tfrecusrcod_sel = "" ;
      AV59TFRecUsrCod_Sel = "" ;
      AV91Recetasdeacabado03_wpds_21_tfrecfecmod = GXutil.resetTime( GXutil.nullDate() );
      AV60TFRecFecMod = GXutil.resetTime( GXutil.nullDate() );
      AV92Recetasdeacabado03_wpds_22_tfrecusrmod = "" ;
      AV62TFRecUsrMod = "" ;
      AV93Recetasdeacabado03_wpds_23_tfrecusrmod_sel = "" ;
      AV63TFRecUsrMod_Sel = "" ;
      scmdbuf = "" ;
      lV71Recetasdeacabado03_wpds_1_filterfulltext = "" ;
      lV72Recetasdeacabado03_wpds_2_tfbarnhdr = "" ;
      lV74Recetasdeacabado03_wpds_4_tfbarser = "" ;
      lV76Recetasdeacabado03_wpds_6_tfbarserdsc = "" ;
      lV80Recetasdeacabado03_wpds_10_tfmaqcod = "" ;
      lV89Recetasdeacabado03_wpds_19_tfrecusrcod = "" ;
      lV92Recetasdeacabado03_wpds_22_tfrecusrmod = "" ;
      A130BarCodPar = "" ;
      A6039RecAcab = "" ;
      P09BG2_A396EmprCod = new String[] {""} ;
      P09BG2_A6039RecAcab = new String[] {""} ;
      P09BG2_n6039RecAcab = new boolean[] {false} ;
      P09BG2_A4868RecUsrMod = new String[] {""} ;
      P09BG2_n4868RecUsrMod = new boolean[] {false} ;
      P09BG2_A4867RecFecMod = new java.util.Date[] {GXutil.nullDate()} ;
      P09BG2_n4867RecFecMod = new boolean[] {false} ;
      P09BG2_A4402RecUsrCod = new String[] {""} ;
      P09BG2_A4866RecFecAlt = new java.util.Date[] {GXutil.nullDate()} ;
      P09BG2_n4866RecFecAlt = new boolean[] {false} ;
      P09BG2_A2805RecVolPrd = new int[1] ;
      P09BG2_A2806RecFA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09BG2_A4259RecTotKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09BG2_A602MaqCod = new String[] {""} ;
      P09BG2_A2804RecLinMaq = new short[1] ;
      P09BG2_A1652BarSerDsc = new String[] {""} ;
      P09BG2_A212BarSer = new String[] {""} ;
      P09BG2_A130BarCodPar = new String[] {""} ;
      P09BG2_A132BarCodReo = new byte[1] ;
      P09BG2_A129BarCod = new int[1] ;
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
      pr_default = new DataStoreProvider(context, remoteHandle, new app.recetasdeacabado03_wpexportcsv__default(),
         new Object[] {
             new Object[] {
            P09BG2_A396EmprCod, P09BG2_A6039RecAcab, P09BG2_n6039RecAcab, P09BG2_A4868RecUsrMod, P09BG2_n4868RecUsrMod, P09BG2_A4867RecFecMod, P09BG2_n4867RecFecMod, P09BG2_A4402RecUsrCod, P09BG2_A4866RecFecAlt, P09BG2_n4866RecFecAlt,
            P09BG2_A2805RecVolPrd, P09BG2_A2806RecFA, P09BG2_A4259RecTotKgs, P09BG2_A602MaqCod, P09BG2_A2804RecLinMaq, P09BG2_A1652BarSerDsc, P09BG2_A212BarSer, P09BG2_A130BarCodPar, P09BG2_A132BarCodReo, P09BG2_A129BarCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short gxcookieaux ;
   private short A2804RecLinMaq ;
   private short AV78Recetasdeacabado03_wpds_8_tfreclinmaq ;
   private short AV50TFRecLinMaq ;
   private short AV79Recetasdeacabado03_wpds_9_tfreclinmaq_to ;
   private short AV51TFRecLinMaq_To ;
   private short AV28OrderedBy ;
   private short Gx_err ;
   private int AV13Random ;
   private int A2805RecVolPrd ;
   private int AV86Recetasdeacabado03_wpds_16_tfrecvolprd ;
   private int AV54TFRecVolPrd ;
   private int AV87Recetasdeacabado03_wpds_17_tfrecvolprd_to ;
   private int AV55TFRecVolPrd_To ;
   private int A129BarCod ;
   private int AV94GXV1 ;
   private java.math.BigDecimal A4259RecTotKgs ;
   private java.math.BigDecimal A2806RecFA ;
   private java.math.BigDecimal AV82Recetasdeacabado03_wpds_12_tfrectotkgs ;
   private java.math.BigDecimal AV64TFRecTotKgs ;
   private java.math.BigDecimal AV83Recetasdeacabado03_wpds_13_tfrectotkgs_to ;
   private java.math.BigDecimal AV65TFRecTotKgs_To ;
   private java.math.BigDecimal AV84Recetasdeacabado03_wpds_14_tfrecfa ;
   private java.math.BigDecimal AV66TFRecFA ;
   private java.math.BigDecimal AV85Recetasdeacabado03_wpds_15_tfrecfa_to ;
   private java.math.BigDecimal AV67TFRecFA_To ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A13696BarNHdr ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A602MaqCod ;
   private String A4402RecUsrCod ;
   private String A4868RecUsrMod ;
   private String AV72Recetasdeacabado03_wpds_2_tfbarnhdr ;
   private String AV34TFBarNHdr ;
   private String AV73Recetasdeacabado03_wpds_3_tfbarnhdr_sel ;
   private String AV35TFBarNHdr_Sel ;
   private String AV74Recetasdeacabado03_wpds_4_tfbarser ;
   private String AV36TFBarSer ;
   private String AV75Recetasdeacabado03_wpds_5_tfbarser_sel ;
   private String AV37TFBarSer_Sel ;
   private String AV76Recetasdeacabado03_wpds_6_tfbarserdsc ;
   private String AV38TFBarSerDsc ;
   private String AV77Recetasdeacabado03_wpds_7_tfbarserdsc_sel ;
   private String AV39TFBarSerDsc_Sel ;
   private String AV80Recetasdeacabado03_wpds_10_tfmaqcod ;
   private String AV52TFMaqCod ;
   private String AV81Recetasdeacabado03_wpds_11_tfmaqcod_sel ;
   private String AV53TFMaqCod_Sel ;
   private String AV89Recetasdeacabado03_wpds_19_tfrecusrcod ;
   private String AV58TFRecUsrCod ;
   private String AV90Recetasdeacabado03_wpds_20_tfrecusrcod_sel ;
   private String AV59TFRecUsrCod_Sel ;
   private String AV92Recetasdeacabado03_wpds_22_tfrecusrmod ;
   private String AV62TFRecUsrMod ;
   private String AV93Recetasdeacabado03_wpds_23_tfrecusrmod_sel ;
   private String AV63TFRecUsrMod_Sel ;
   private String scmdbuf ;
   private String lV72Recetasdeacabado03_wpds_2_tfbarnhdr ;
   private String lV74Recetasdeacabado03_wpds_4_tfbarser ;
   private String lV76Recetasdeacabado03_wpds_6_tfbarserdsc ;
   private String lV80Recetasdeacabado03_wpds_10_tfmaqcod ;
   private String lV89Recetasdeacabado03_wpds_19_tfrecusrcod ;
   private String lV92Recetasdeacabado03_wpds_22_tfrecusrmod ;
   private String A130BarCodPar ;
   private String A6039RecAcab ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private java.util.Date A4866RecFecAlt ;
   private java.util.Date A4867RecFecMod ;
   private java.util.Date AV88Recetasdeacabado03_wpds_18_tfrecfecalt ;
   private java.util.Date AV56TFRecFecAlt ;
   private java.util.Date AV91Recetasdeacabado03_wpds_21_tfrecfecmod ;
   private java.util.Date AV60TFRecFecMod ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean n6039RecAcab ;
   private boolean n4868RecUsrMod ;
   private boolean n4867RecFecMod ;
   private boolean n4866RecFecAlt ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV71Recetasdeacabado03_wpds_1_filterfulltext ;
   private String AV30FilterFullText ;
   private String lV71Recetasdeacabado03_wpds_1_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private String[] P09BG2_A396EmprCod ;
   private String[] P09BG2_A6039RecAcab ;
   private boolean[] P09BG2_n6039RecAcab ;
   private String[] P09BG2_A4868RecUsrMod ;
   private boolean[] P09BG2_n4868RecUsrMod ;
   private java.util.Date[] P09BG2_A4867RecFecMod ;
   private boolean[] P09BG2_n4867RecFecMod ;
   private String[] P09BG2_A4402RecUsrCod ;
   private java.util.Date[] P09BG2_A4866RecFecAlt ;
   private boolean[] P09BG2_n4866RecFecAlt ;
   private int[] P09BG2_A2805RecVolPrd ;
   private java.math.BigDecimal[] P09BG2_A2806RecFA ;
   private java.math.BigDecimal[] P09BG2_A4259RecTotKgs ;
   private String[] P09BG2_A602MaqCod ;
   private short[] P09BG2_A2804RecLinMaq ;
   private String[] P09BG2_A1652BarSerDsc ;
   private String[] P09BG2_A212BarSer ;
   private String[] P09BG2_A130BarCodPar ;
   private byte[] P09BG2_A132BarCodReo ;
   private int[] P09BG2_A129BarCod ;
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

final  class recetasdeacabado03_wpexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09BG2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV71Recetasdeacabado03_wpds_1_filterfulltext ,
                                          String AV73Recetasdeacabado03_wpds_3_tfbarnhdr_sel ,
                                          String AV72Recetasdeacabado03_wpds_2_tfbarnhdr ,
                                          String AV75Recetasdeacabado03_wpds_5_tfbarser_sel ,
                                          String AV74Recetasdeacabado03_wpds_4_tfbarser ,
                                          String AV77Recetasdeacabado03_wpds_7_tfbarserdsc_sel ,
                                          String AV76Recetasdeacabado03_wpds_6_tfbarserdsc ,
                                          short AV78Recetasdeacabado03_wpds_8_tfreclinmaq ,
                                          short AV79Recetasdeacabado03_wpds_9_tfreclinmaq_to ,
                                          String AV81Recetasdeacabado03_wpds_11_tfmaqcod_sel ,
                                          String AV80Recetasdeacabado03_wpds_10_tfmaqcod ,
                                          java.math.BigDecimal AV82Recetasdeacabado03_wpds_12_tfrectotkgs ,
                                          java.math.BigDecimal AV83Recetasdeacabado03_wpds_13_tfrectotkgs_to ,
                                          java.math.BigDecimal AV84Recetasdeacabado03_wpds_14_tfrecfa ,
                                          java.math.BigDecimal AV85Recetasdeacabado03_wpds_15_tfrecfa_to ,
                                          int AV86Recetasdeacabado03_wpds_16_tfrecvolprd ,
                                          int AV87Recetasdeacabado03_wpds_17_tfrecvolprd_to ,
                                          java.util.Date AV88Recetasdeacabado03_wpds_18_tfrecfecalt ,
                                          String AV90Recetasdeacabado03_wpds_20_tfrecusrcod_sel ,
                                          String AV89Recetasdeacabado03_wpds_19_tfrecusrcod ,
                                          java.util.Date AV91Recetasdeacabado03_wpds_21_tfrecfecmod ,
                                          String AV93Recetasdeacabado03_wpds_23_tfrecusrmod_sel ,
                                          String AV92Recetasdeacabado03_wpds_22_tfrecusrmod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          short A2804RecLinMaq ,
                                          String A602MaqCod ,
                                          java.math.BigDecimal A4259RecTotKgs ,
                                          java.math.BigDecimal A2806RecFA ,
                                          int A2805RecVolPrd ,
                                          String A4402RecUsrCod ,
                                          String A4868RecUsrMod ,
                                          java.util.Date A4866RecFecAlt ,
                                          java.util.Date A4867RecFecMod ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc ,
                                          String A6039RecAcab )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[32];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.RecAcab, T1.RecUsrMod, T1.RecFecMod, T1.RecUsrCod, T1.RecFecAlt, T1.RecVolPrd, T1.RecFA, T1.RecTotKgs, T1.MaqCod, T1.RecLinMaq, T2.BarSerDsc," ;
      scmdbuf += " T2.BarSer, T1.BarCodPar, T1.BarCodReo, T1.BarCod FROM (TXPRECMAQ T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo" ;
      scmdbuf += " = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.RecAcab = 'S')");
      if ( ! (GXutil.strcmp("", AV71Recetasdeacabado03_wpds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?)) or ( UPPER(T2.BarSer) like '%' || UPPER(?)) or ( UPPER(T2.BarSerDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.RecLinMaq,'9990'), 2) like '%' || ?) or ( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.RecTotKgs,'9999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.RecFA,'990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.RecVolPrd,'99990'), 2) like '%' || ?) or ( UPPER(T1.RecUsrCod) like '%' || UPPER(?)) or ( UPPER(T1.RecUsrMod) like '%' || UPPER(?)))");
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
      }
      if ( (GXutil.strcmp("", AV73Recetasdeacabado03_wpds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV72Recetasdeacabado03_wpds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Recetasdeacabado03_wpds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Recetasdeacabado03_wpds_5_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV74Recetasdeacabado03_wpds_4_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Recetasdeacabado03_wpds_5_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Recetasdeacabado03_wpds_7_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV76Recetasdeacabado03_wpds_6_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Recetasdeacabado03_wpds_7_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (0==AV78Recetasdeacabado03_wpds_8_tfreclinmaq) )
      {
         addWhere(sWhereString, "(T1.RecLinMaq >= ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (0==AV79Recetasdeacabado03_wpds_9_tfreclinmaq_to) )
      {
         addWhere(sWhereString, "(T1.RecLinMaq <= ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Recetasdeacabado03_wpds_11_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV80Recetasdeacabado03_wpds_10_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Recetasdeacabado03_wpds_11_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82Recetasdeacabado03_wpds_12_tfrectotkgs)==0) )
      {
         addWhere(sWhereString, "(T1.RecTotKgs >= ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Recetasdeacabado03_wpds_13_tfrectotkgs_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecTotKgs <= ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Recetasdeacabado03_wpds_14_tfrecfa)==0) )
      {
         addWhere(sWhereString, "(T1.RecFA >= ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Recetasdeacabado03_wpds_15_tfrecfa_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecFA <= ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (0==AV86Recetasdeacabado03_wpds_16_tfrecvolprd) )
      {
         addWhere(sWhereString, "(T1.RecVolPrd >= ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! (0==AV87Recetasdeacabado03_wpds_17_tfrecvolprd_to) )
      {
         addWhere(sWhereString, "(T1.RecVolPrd <= ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV88Recetasdeacabado03_wpds_18_tfrecfecalt) )
      {
         addWhere(sWhereString, "(T1.RecFecAlt >= ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Recetasdeacabado03_wpds_20_tfrecusrcod_sel)==0) && ( ! (GXutil.strcmp("", AV89Recetasdeacabado03_wpds_19_tfrecusrcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecUsrCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Recetasdeacabado03_wpds_20_tfrecusrcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecUsrCod = ?)");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV91Recetasdeacabado03_wpds_21_tfrecfecmod) )
      {
         addWhere(sWhereString, "(T1.RecFecMod >= ?)");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Recetasdeacabado03_wpds_23_tfrecusrmod_sel)==0) && ( ! (GXutil.strcmp("", AV92Recetasdeacabado03_wpds_22_tfrecusrmod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecUsrMod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Recetasdeacabado03_wpds_23_tfrecusrmod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecUsrMod = ?)");
      }
      else
      {
         GXv_int6[31] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MaqCod" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MaqCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarSer" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarSer DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarSerDsc" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarSerDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecLinMaq" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecLinMaq DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecTotKgs" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecTotKgs DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecFA" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecFA DESC" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecVolPrd" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecVolPrd DESC" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecFecAlt" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecFecAlt DESC" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecUsrCod" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecUsrCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecFecMod" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecFecMod DESC" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecUsrMod" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecUsrMod DESC" ;
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
                  return conditional_P09BG2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (java.util.Date)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).shortValue() , (String)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , (String)dynConstraints[34] , (java.util.Date)dynConstraints[35] , (java.util.Date)dynConstraints[36] , ((Number) dynConstraints[37]).shortValue() , ((Boolean) dynConstraints[38]).booleanValue() , (String)dynConstraints[39] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09BG2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 8);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 8);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(9,2);
               ((String[]) buf[13])[0] = rslt.getString(10, 6);
               ((short[]) buf[14])[0] = rslt.getShort(11);
               ((String[]) buf[15])[0] = rslt.getString(12, 26);
               ((String[]) buf[16])[0] = rslt.getString(13, 16);
               ((String[]) buf[17])[0] = rslt.getString(14, 1);
               ((byte[]) buf[18])[0] = rslt.getByte(15);
               ((int[]) buf[19])[0] = rslt.getInt(16);
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
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 11);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 11);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[48]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[49]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 6);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 6);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[54], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[55], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[58], false);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 8);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 8);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[61], false);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 8);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 8);
               }
               return;
      }
   }

}

