package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tfasprowwexportcsv_impl extends GXWebProcedure
{
   public tfasprowwexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "TFASPROWWExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("TFASPROWWColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("TFASPROWWColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Activa?", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fase", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Siglas", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Maquina", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Decalage ", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Decalage 2", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "T prepysal", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "T prepppza", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Vel (mts/m)", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "N pases", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "T?", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "C?", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "A?", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "F?", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "P?", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV97Tfasprowwds_1_filterfulltext = AV89FilterFullText ;
      AV98Tfasprowwds_2_tffasactiva_sel = AV93TFFasActiva_Sel ;
      AV99Tfasprowwds_3_tffascod = AV51TFFasCod ;
      AV100Tfasprowwds_4_tffascod_sel = AV52TFFasCod_Sel ;
      AV101Tfasprowwds_5_tffasdsc = AV53TFFasDsc ;
      AV102Tfasprowwds_6_tffasdsc_sel = AV54TFFasDsc_Sel ;
      AV103Tfasprowwds_7_tffassigla = AV55TFFasSigla ;
      AV104Tfasprowwds_8_tffassigla_sel = AV56TFFasSigla_Sel ;
      AV105Tfasprowwds_9_tfmaqcod = AV57TFMaqCod ;
      AV106Tfasprowwds_10_tfmaqcod_sel = AV58TFMaqCod_Sel ;
      AV107Tfasprowwds_11_tfmaqdsc = AV59TFMaqDsc ;
      AV108Tfasprowwds_12_tfmaqdsc_sel = AV60TFMaqDsc_Sel ;
      AV109Tfasprowwds_13_tffasdec = AV61TFFasDec ;
      AV110Tfasprowwds_14_tffasdec_to = AV62TFFasDec_To ;
      AV111Tfasprowwds_15_tffasdec2 = AV63TFFasDec2 ;
      AV112Tfasprowwds_16_tffasdec2_to = AV64TFFasDec2_To ;
      AV113Tfasprowwds_17_tffaspresal = AV65TFFasPreSal ;
      AV114Tfasprowwds_18_tffaspresal_to = AV66TFFasPreSal_To ;
      AV115Tfasprowwds_19_tffasprepie = AV67TFFasPrePie ;
      AV116Tfasprowwds_20_tffasprepie_to = AV68TFFasPrePie_To ;
      AV117Tfasprowwds_21_tffasvelpro = AV69TFFasVelPro ;
      AV118Tfasprowwds_22_tffasvelpro_to = AV70TFFasVelPro_To ;
      AV119Tfasprowwds_23_tffasnumpas = AV71TFFasNumPas ;
      AV120Tfasprowwds_24_tffasnumpas_to = AV72TFFasNumPas_To ;
      AV121Tfasprowwds_25_tffasacttin = AV73TFFasActTin ;
      AV122Tfasprowwds_26_tffasacttin_sel = AV74TFFasActTin_Sel ;
      AV123Tfasprowwds_27_tffascon = AV75TFFasCon ;
      AV124Tfasprowwds_28_tffascon_sel = AV76TFFasCon_Sel ;
      AV125Tfasprowwds_29_tffasacab = AV77TFFasAcab ;
      AV126Tfasprowwds_30_tffasacab_sel = AV78TFFasAcab_Sel ;
      AV127Tfasprowwds_31_tffasformul = AV79TFFasForMul ;
      AV128Tfasprowwds_32_tffasformul_sel = AV80TFFasForMul_Sel ;
      AV129Tfasprowwds_33_tffasconpla = AV81TFFasConPla ;
      AV130Tfasprowwds_34_tffasconpla_sel = AV82TFFasConPla_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV97Tfasprowwds_1_filterfulltext ,
                                           AV98Tfasprowwds_2_tffasactiva_sel ,
                                           AV100Tfasprowwds_4_tffascod_sel ,
                                           AV99Tfasprowwds_3_tffascod ,
                                           AV102Tfasprowwds_6_tffasdsc_sel ,
                                           AV101Tfasprowwds_5_tffasdsc ,
                                           AV104Tfasprowwds_8_tffassigla_sel ,
                                           AV103Tfasprowwds_7_tffassigla ,
                                           AV106Tfasprowwds_10_tfmaqcod_sel ,
                                           AV105Tfasprowwds_9_tfmaqcod ,
                                           AV108Tfasprowwds_12_tfmaqdsc_sel ,
                                           AV107Tfasprowwds_11_tfmaqdsc ,
                                           AV109Tfasprowwds_13_tffasdec ,
                                           AV110Tfasprowwds_14_tffasdec_to ,
                                           AV111Tfasprowwds_15_tffasdec2 ,
                                           AV112Tfasprowwds_16_tffasdec2_to ,
                                           Short.valueOf(AV113Tfasprowwds_17_tffaspresal) ,
                                           Short.valueOf(AV114Tfasprowwds_18_tffaspresal_to) ,
                                           Short.valueOf(AV115Tfasprowwds_19_tffasprepie) ,
                                           Short.valueOf(AV116Tfasprowwds_20_tffasprepie_to) ,
                                           AV117Tfasprowwds_21_tffasvelpro ,
                                           AV118Tfasprowwds_22_tffasvelpro_to ,
                                           Short.valueOf(AV119Tfasprowwds_23_tffasnumpas) ,
                                           Short.valueOf(AV120Tfasprowwds_24_tffasnumpas_to) ,
                                           AV122Tfasprowwds_26_tffasacttin_sel ,
                                           AV121Tfasprowwds_25_tffasacttin ,
                                           AV124Tfasprowwds_28_tffascon_sel ,
                                           AV123Tfasprowwds_27_tffascon ,
                                           AV126Tfasprowwds_30_tffasacab_sel ,
                                           AV125Tfasprowwds_29_tffasacab ,
                                           AV128Tfasprowwds_32_tffasformul_sel ,
                                           AV127Tfasprowwds_31_tffasformul ,
                                           AV130Tfasprowwds_34_tffasconpla_sel ,
                                           AV129Tfasprowwds_33_tffasconpla ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A7070FasSigla ,
                                           A602MaqCod ,
                                           A606MaqDsc ,
                                           A459FasDec ,
                                           A5990FasDec2 ,
                                           Short.valueOf(A469FasPreSal) ,
                                           Short.valueOf(A468FasPrePie) ,
                                           A472FasVelPro ,
                                           Short.valueOf(A464FasNumPas) ,
                                           A456FasActTin ,
                                           A458FasCon ,
                                           A4903FasAcab ,
                                           A4286FasForMul ,
                                           A4299FasConPla ,
                                           A14042FasActiva ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV97Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tfasprowwds_1_filterfulltext), "%", "") ;
      lV97Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tfasprowwds_1_filterfulltext), "%", "") ;
      lV97Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tfasprowwds_1_filterfulltext), "%", "") ;
      lV97Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tfasprowwds_1_filterfulltext), "%", "") ;
      lV97Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tfasprowwds_1_filterfulltext), "%", "") ;
      lV97Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tfasprowwds_1_filterfulltext), "%", "") ;
      lV97Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tfasprowwds_1_filterfulltext), "%", "") ;
      lV97Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tfasprowwds_1_filterfulltext), "%", "") ;
      lV97Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tfasprowwds_1_filterfulltext), "%", "") ;
      lV97Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tfasprowwds_1_filterfulltext), "%", "") ;
      lV97Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tfasprowwds_1_filterfulltext), "%", "") ;
      lV97Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tfasprowwds_1_filterfulltext), "%", "") ;
      lV97Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tfasprowwds_1_filterfulltext), "%", "") ;
      lV97Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tfasprowwds_1_filterfulltext), "%", "") ;
      lV97Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tfasprowwds_1_filterfulltext), "%", "") ;
      lV97Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tfasprowwds_1_filterfulltext), "%", "") ;
      lV99Tfasprowwds_3_tffascod = GXutil.padr( GXutil.rtrim( AV99Tfasprowwds_3_tffascod), 8, "%") ;
      lV101Tfasprowwds_5_tffasdsc = GXutil.padr( GXutil.rtrim( AV101Tfasprowwds_5_tffasdsc), 28, "%") ;
      lV103Tfasprowwds_7_tffassigla = GXutil.padr( GXutil.rtrim( AV103Tfasprowwds_7_tffassigla), 4, "%") ;
      lV105Tfasprowwds_9_tfmaqcod = GXutil.padr( GXutil.rtrim( AV105Tfasprowwds_9_tfmaqcod), 6, "%") ;
      lV107Tfasprowwds_11_tfmaqdsc = GXutil.padr( GXutil.rtrim( AV107Tfasprowwds_11_tfmaqdsc), 16, "%") ;
      lV121Tfasprowwds_25_tffasacttin = GXutil.padr( GXutil.rtrim( AV121Tfasprowwds_25_tffasacttin), 1, "%") ;
      lV123Tfasprowwds_27_tffascon = GXutil.padr( GXutil.rtrim( AV123Tfasprowwds_27_tffascon), 1, "%") ;
      lV125Tfasprowwds_29_tffasacab = GXutil.padr( GXutil.rtrim( AV125Tfasprowwds_29_tffasacab), 1, "%") ;
      lV127Tfasprowwds_31_tffasformul = GXutil.padr( GXutil.rtrim( AV127Tfasprowwds_31_tffasformul), 1, "%") ;
      lV129Tfasprowwds_33_tffasconpla = GXutil.padr( GXutil.rtrim( AV129Tfasprowwds_33_tffasconpla), 1, "%") ;
      /* Using cursor P081Y2 */
      pr_default.execute(0, new Object[] {lV97Tfasprowwds_1_filterfulltext, lV97Tfasprowwds_1_filterfulltext, lV97Tfasprowwds_1_filterfulltext, lV97Tfasprowwds_1_filterfulltext, lV97Tfasprowwds_1_filterfulltext, lV97Tfasprowwds_1_filterfulltext, lV97Tfasprowwds_1_filterfulltext, lV97Tfasprowwds_1_filterfulltext, lV97Tfasprowwds_1_filterfulltext, lV97Tfasprowwds_1_filterfulltext, lV97Tfasprowwds_1_filterfulltext, lV97Tfasprowwds_1_filterfulltext, lV97Tfasprowwds_1_filterfulltext, lV97Tfasprowwds_1_filterfulltext, lV97Tfasprowwds_1_filterfulltext, lV97Tfasprowwds_1_filterfulltext, AV98Tfasprowwds_2_tffasactiva_sel, lV99Tfasprowwds_3_tffascod, AV100Tfasprowwds_4_tffascod_sel, lV101Tfasprowwds_5_tffasdsc, AV102Tfasprowwds_6_tffasdsc_sel, lV103Tfasprowwds_7_tffassigla, AV104Tfasprowwds_8_tffassigla_sel, lV105Tfasprowwds_9_tfmaqcod, AV106Tfasprowwds_10_tfmaqcod_sel, lV107Tfasprowwds_11_tfmaqdsc, AV108Tfasprowwds_12_tfmaqdsc_sel, AV109Tfasprowwds_13_tffasdec, AV110Tfasprowwds_14_tffasdec_to, AV111Tfasprowwds_15_tffasdec2, AV112Tfasprowwds_16_tffasdec2_to, Short.valueOf(AV113Tfasprowwds_17_tffaspresal), Short.valueOf(AV114Tfasprowwds_18_tffaspresal_to), Short.valueOf(AV115Tfasprowwds_19_tffasprepie), Short.valueOf(AV116Tfasprowwds_20_tffasprepie_to), AV117Tfasprowwds_21_tffasvelpro, AV118Tfasprowwds_22_tffasvelpro_to, Short.valueOf(AV119Tfasprowwds_23_tffasnumpas), Short.valueOf(AV120Tfasprowwds_24_tffasnumpas_to), lV121Tfasprowwds_25_tffasacttin, AV122Tfasprowwds_26_tffasacttin_sel, lV123Tfasprowwds_27_tffascon, AV124Tfasprowwds_28_tffascon_sel, lV125Tfasprowwds_29_tffasacab, AV126Tfasprowwds_30_tffasacab_sel, lV127Tfasprowwds_31_tffasformul, AV128Tfasprowwds_32_tffasformul_sel, lV129Tfasprowwds_33_tffasconpla, AV130Tfasprowwds_34_tffasconpla_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P081Y2_A396EmprCod[0] ;
         A4299FasConPla = P081Y2_A4299FasConPla[0] ;
         n4299FasConPla = P081Y2_n4299FasConPla[0] ;
         A4286FasForMul = P081Y2_A4286FasForMul[0] ;
         n4286FasForMul = P081Y2_n4286FasForMul[0] ;
         A4903FasAcab = P081Y2_A4903FasAcab[0] ;
         n4903FasAcab = P081Y2_n4903FasAcab[0] ;
         A458FasCon = P081Y2_A458FasCon[0] ;
         n458FasCon = P081Y2_n458FasCon[0] ;
         A456FasActTin = P081Y2_A456FasActTin[0] ;
         n456FasActTin = P081Y2_n456FasActTin[0] ;
         A464FasNumPas = P081Y2_A464FasNumPas[0] ;
         n464FasNumPas = P081Y2_n464FasNumPas[0] ;
         A472FasVelPro = P081Y2_A472FasVelPro[0] ;
         n472FasVelPro = P081Y2_n472FasVelPro[0] ;
         A468FasPrePie = P081Y2_A468FasPrePie[0] ;
         n468FasPrePie = P081Y2_n468FasPrePie[0] ;
         A469FasPreSal = P081Y2_A469FasPreSal[0] ;
         n469FasPreSal = P081Y2_n469FasPreSal[0] ;
         A5990FasDec2 = P081Y2_A5990FasDec2[0] ;
         n5990FasDec2 = P081Y2_n5990FasDec2[0] ;
         A459FasDec = P081Y2_A459FasDec[0] ;
         n459FasDec = P081Y2_n459FasDec[0] ;
         A606MaqDsc = P081Y2_A606MaqDsc[0] ;
         n606MaqDsc = P081Y2_n606MaqDsc[0] ;
         A602MaqCod = P081Y2_A602MaqCod[0] ;
         n602MaqCod = P081Y2_n602MaqCod[0] ;
         A7070FasSigla = P081Y2_A7070FasSigla[0] ;
         n7070FasSigla = P081Y2_n7070FasSigla[0] ;
         A460FasDsc = P081Y2_A460FasDsc[0] ;
         A457FasCod = P081Y2_A457FasCod[0] ;
         A14042FasActiva = P081Y2_A14042FasActiva[0] ;
         A606MaqDsc = P081Y2_A606MaqDsc[0] ;
         n606MaqDsc = P081Y2_n606MaqDsc[0] ;
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
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A14042FasActiva, ";", ","), GXv_char3) ;
            tfasprowwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A457FasCod, ";", ","), GXv_char3) ;
            tfasprowwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A460FasDsc, ";", ","), GXv_char3) ;
            tfasprowwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A7070FasSigla, ";", ","), GXv_char3) ;
            tfasprowwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A602MaqCod, ";", ","), GXv_char3) ;
            tfasprowwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A606MaqDsc, ";", ","), GXv_char3) ;
            tfasprowwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A459FasDec, 5, 1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A5990FasDec2, 7, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A469FasPreSal, 4, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A468FasPrePie, 4, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A472FasVelPro, 5, 1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A464FasNumPas, 3, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A456FasActTin, ";", ","), GXv_char3) ;
            tfasprowwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A458FasCon, ";", ","), GXv_char3) ;
            tfasprowwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A4903FasAcab, ";", ","), GXv_char3) ;
            tfasprowwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A4286FasForMul, ";", ","), GXv_char3) ;
            tfasprowwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A4299FasConPla, ";", ","), GXv_char3) ;
            tfasprowwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=TFASPROWWExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "FasActiva", "", "Activa?", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "FasCod", "", "Fase", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "FasDsc", "", "Descripcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "FasSigla", "", "Siglas", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MaqCod", "", "Maquina", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MaqDsc", "", "Descripcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "FasDec", "", "Decalage ", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "FasDec2", "", "Decalage 2", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "FasPreSal", "", "T prepysal", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "FasPrePie", "", "T prepppza", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "FasVelPro", "", "Vel (mts/m)", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "FasNumPas", "", "N pases", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "FasActTin", "", "T?", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "FasCon", "", "C?", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "FasAcab", "", "A?", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "FasForMul", "", "F?", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "FasConPla", "", "P?", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "TFASPROWWColumnsSelector", GXv_char3) ;
      tfasprowwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("TFASPROWWGridState"), "") == 0 )
      {
         AV49GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TFASPROWWGridState"), null, null);
      }
      else
      {
         AV49GridState.fromxml(AV19Session.getValue("TFASPROWWGridState"), null, null);
      }
      AV28OrderedBy = AV49GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV49GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV131GXV1 = 1 ;
      while ( AV131GXV1 <= AV49GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV50GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV49GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV131GXV1));
         if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV89FilterFullText = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASACTIVA_SEL") == 0 )
         {
            AV93TFFasActiva_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD") == 0 )
         {
            AV51TFFasCod = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD_SEL") == 0 )
         {
            AV52TFFasCod_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC") == 0 )
         {
            AV53TFFasDsc = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC_SEL") == 0 )
         {
            AV54TFFasDsc_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASSIGLA") == 0 )
         {
            AV55TFFasSigla = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASSIGLA_SEL") == 0 )
         {
            AV56TFFasSigla_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD") == 0 )
         {
            AV57TFMaqCod = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD_SEL") == 0 )
         {
            AV58TFMaqCod_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQDSC") == 0 )
         {
            AV59TFMaqDsc = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQDSC_SEL") == 0 )
         {
            AV60TFMaqDsc_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDEC") == 0 )
         {
            AV61TFFasDec = CommonUtil.decimalVal( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV62TFFasDec_To = CommonUtil.decimalVal( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDEC2") == 0 )
         {
            AV63TFFasDec2 = CommonUtil.decimalVal( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV64TFFasDec2_To = CommonUtil.decimalVal( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASPRESAL") == 0 )
         {
            AV65TFFasPreSal = (short)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV66TFFasPreSal_To = (short)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASPREPIE") == 0 )
         {
            AV67TFFasPrePie = (short)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV68TFFasPrePie_To = (short)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASVELPRO") == 0 )
         {
            AV69TFFasVelPro = CommonUtil.decimalVal( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV70TFFasVelPro_To = CommonUtil.decimalVal( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASNUMPAS") == 0 )
         {
            AV71TFFasNumPas = (short)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV72TFFasNumPas_To = (short)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASACTTIN") == 0 )
         {
            AV73TFFasActTin = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASACTTIN_SEL") == 0 )
         {
            AV74TFFasActTin_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCON") == 0 )
         {
            AV75TFFasCon = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCON_SEL") == 0 )
         {
            AV76TFFasCon_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASACAB") == 0 )
         {
            AV77TFFasAcab = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASACAB_SEL") == 0 )
         {
            AV78TFFasAcab_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASFORMUL") == 0 )
         {
            AV79TFFasForMul = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASFORMUL_SEL") == 0 )
         {
            AV80TFFasForMul_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCONPLA") == 0 )
         {
            AV81TFFasConPla = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCONPLA_SEL") == 0 )
         {
            AV82TFFasConPla_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV131GXV1 = (int)(AV131GXV1+1) ;
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
      A14042FasActiva = "" ;
      A457FasCod = "" ;
      A460FasDsc = "" ;
      A7070FasSigla = "" ;
      A602MaqCod = "" ;
      A606MaqDsc = "" ;
      A459FasDec = DecimalUtil.ZERO ;
      A5990FasDec2 = DecimalUtil.ZERO ;
      A472FasVelPro = DecimalUtil.ZERO ;
      A456FasActTin = "" ;
      A458FasCon = "" ;
      A4903FasAcab = "" ;
      A4286FasForMul = "" ;
      A4299FasConPla = "" ;
      AV97Tfasprowwds_1_filterfulltext = "" ;
      AV89FilterFullText = "" ;
      AV98Tfasprowwds_2_tffasactiva_sel = "" ;
      AV93TFFasActiva_Sel = "" ;
      AV99Tfasprowwds_3_tffascod = "" ;
      AV51TFFasCod = "" ;
      AV100Tfasprowwds_4_tffascod_sel = "" ;
      AV52TFFasCod_Sel = "" ;
      AV101Tfasprowwds_5_tffasdsc = "" ;
      AV53TFFasDsc = "" ;
      AV102Tfasprowwds_6_tffasdsc_sel = "" ;
      AV54TFFasDsc_Sel = "" ;
      AV103Tfasprowwds_7_tffassigla = "" ;
      AV55TFFasSigla = "" ;
      AV104Tfasprowwds_8_tffassigla_sel = "" ;
      AV56TFFasSigla_Sel = "" ;
      AV105Tfasprowwds_9_tfmaqcod = "" ;
      AV57TFMaqCod = "" ;
      AV106Tfasprowwds_10_tfmaqcod_sel = "" ;
      AV58TFMaqCod_Sel = "" ;
      AV107Tfasprowwds_11_tfmaqdsc = "" ;
      AV59TFMaqDsc = "" ;
      AV108Tfasprowwds_12_tfmaqdsc_sel = "" ;
      AV60TFMaqDsc_Sel = "" ;
      AV109Tfasprowwds_13_tffasdec = DecimalUtil.ZERO ;
      AV61TFFasDec = DecimalUtil.ZERO ;
      AV110Tfasprowwds_14_tffasdec_to = DecimalUtil.ZERO ;
      AV62TFFasDec_To = DecimalUtil.ZERO ;
      AV111Tfasprowwds_15_tffasdec2 = DecimalUtil.ZERO ;
      AV63TFFasDec2 = DecimalUtil.ZERO ;
      AV112Tfasprowwds_16_tffasdec2_to = DecimalUtil.ZERO ;
      AV64TFFasDec2_To = DecimalUtil.ZERO ;
      AV117Tfasprowwds_21_tffasvelpro = DecimalUtil.ZERO ;
      AV69TFFasVelPro = DecimalUtil.ZERO ;
      AV118Tfasprowwds_22_tffasvelpro_to = DecimalUtil.ZERO ;
      AV70TFFasVelPro_To = DecimalUtil.ZERO ;
      AV121Tfasprowwds_25_tffasacttin = "" ;
      AV73TFFasActTin = "" ;
      AV122Tfasprowwds_26_tffasacttin_sel = "" ;
      AV74TFFasActTin_Sel = "" ;
      AV123Tfasprowwds_27_tffascon = "" ;
      AV75TFFasCon = "" ;
      AV124Tfasprowwds_28_tffascon_sel = "" ;
      AV76TFFasCon_Sel = "" ;
      AV125Tfasprowwds_29_tffasacab = "" ;
      AV77TFFasAcab = "" ;
      AV126Tfasprowwds_30_tffasacab_sel = "" ;
      AV78TFFasAcab_Sel = "" ;
      AV127Tfasprowwds_31_tffasformul = "" ;
      AV79TFFasForMul = "" ;
      AV128Tfasprowwds_32_tffasformul_sel = "" ;
      AV80TFFasForMul_Sel = "" ;
      AV129Tfasprowwds_33_tffasconpla = "" ;
      AV81TFFasConPla = "" ;
      AV130Tfasprowwds_34_tffasconpla_sel = "" ;
      AV82TFFasConPla_Sel = "" ;
      scmdbuf = "" ;
      lV97Tfasprowwds_1_filterfulltext = "" ;
      lV99Tfasprowwds_3_tffascod = "" ;
      lV101Tfasprowwds_5_tffasdsc = "" ;
      lV103Tfasprowwds_7_tffassigla = "" ;
      lV105Tfasprowwds_9_tfmaqcod = "" ;
      lV107Tfasprowwds_11_tfmaqdsc = "" ;
      lV121Tfasprowwds_25_tffasacttin = "" ;
      lV123Tfasprowwds_27_tffascon = "" ;
      lV125Tfasprowwds_29_tffasacab = "" ;
      lV127Tfasprowwds_31_tffasformul = "" ;
      lV129Tfasprowwds_33_tffasconpla = "" ;
      P081Y2_A396EmprCod = new String[] {""} ;
      P081Y2_A4299FasConPla = new String[] {""} ;
      P081Y2_n4299FasConPla = new boolean[] {false} ;
      P081Y2_A4286FasForMul = new String[] {""} ;
      P081Y2_n4286FasForMul = new boolean[] {false} ;
      P081Y2_A4903FasAcab = new String[] {""} ;
      P081Y2_n4903FasAcab = new boolean[] {false} ;
      P081Y2_A458FasCon = new String[] {""} ;
      P081Y2_n458FasCon = new boolean[] {false} ;
      P081Y2_A456FasActTin = new String[] {""} ;
      P081Y2_n456FasActTin = new boolean[] {false} ;
      P081Y2_A464FasNumPas = new short[1] ;
      P081Y2_n464FasNumPas = new boolean[] {false} ;
      P081Y2_A472FasVelPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P081Y2_n472FasVelPro = new boolean[] {false} ;
      P081Y2_A468FasPrePie = new short[1] ;
      P081Y2_n468FasPrePie = new boolean[] {false} ;
      P081Y2_A469FasPreSal = new short[1] ;
      P081Y2_n469FasPreSal = new boolean[] {false} ;
      P081Y2_A5990FasDec2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P081Y2_n5990FasDec2 = new boolean[] {false} ;
      P081Y2_A459FasDec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P081Y2_n459FasDec = new boolean[] {false} ;
      P081Y2_A606MaqDsc = new String[] {""} ;
      P081Y2_n606MaqDsc = new boolean[] {false} ;
      P081Y2_A602MaqCod = new String[] {""} ;
      P081Y2_n602MaqCod = new boolean[] {false} ;
      P081Y2_A7070FasSigla = new String[] {""} ;
      P081Y2_n7070FasSigla = new boolean[] {false} ;
      P081Y2_A460FasDsc = new String[] {""} ;
      P081Y2_A457FasCod = new String[] {""} ;
      P081Y2_A14042FasActiva = new String[] {""} ;
      A396EmprCod = "" ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector5 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV49GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV50GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tfasprowwexportcsv__default(),
         new Object[] {
             new Object[] {
            P081Y2_A396EmprCod, P081Y2_A4299FasConPla, P081Y2_n4299FasConPla, P081Y2_A4286FasForMul, P081Y2_n4286FasForMul, P081Y2_A4903FasAcab, P081Y2_n4903FasAcab, P081Y2_A458FasCon, P081Y2_n458FasCon, P081Y2_A456FasActTin,
            P081Y2_n456FasActTin, P081Y2_A464FasNumPas, P081Y2_n464FasNumPas, P081Y2_A472FasVelPro, P081Y2_n472FasVelPro, P081Y2_A468FasPrePie, P081Y2_n468FasPrePie, P081Y2_A469FasPreSal, P081Y2_n469FasPreSal, P081Y2_A5990FasDec2,
            P081Y2_n5990FasDec2, P081Y2_A459FasDec, P081Y2_n459FasDec, P081Y2_A606MaqDsc, P081Y2_n606MaqDsc, P081Y2_A602MaqCod, P081Y2_n602MaqCod, P081Y2_A7070FasSigla, P081Y2_n7070FasSigla, P081Y2_A460FasDsc,
            P081Y2_A457FasCod, P081Y2_A14042FasActiva
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short A469FasPreSal ;
   private short A468FasPrePie ;
   private short A464FasNumPas ;
   private short AV113Tfasprowwds_17_tffaspresal ;
   private short AV65TFFasPreSal ;
   private short AV114Tfasprowwds_18_tffaspresal_to ;
   private short AV66TFFasPreSal_To ;
   private short AV115Tfasprowwds_19_tffasprepie ;
   private short AV67TFFasPrePie ;
   private short AV116Tfasprowwds_20_tffasprepie_to ;
   private short AV68TFFasPrePie_To ;
   private short AV119Tfasprowwds_23_tffasnumpas ;
   private short AV71TFFasNumPas ;
   private short AV120Tfasprowwds_24_tffasnumpas_to ;
   private short AV72TFFasNumPas_To ;
   private short AV28OrderedBy ;
   private short Gx_err ;
   private int AV13Random ;
   private int AV131GXV1 ;
   private java.math.BigDecimal A459FasDec ;
   private java.math.BigDecimal A5990FasDec2 ;
   private java.math.BigDecimal A472FasVelPro ;
   private java.math.BigDecimal AV109Tfasprowwds_13_tffasdec ;
   private java.math.BigDecimal AV61TFFasDec ;
   private java.math.BigDecimal AV110Tfasprowwds_14_tffasdec_to ;
   private java.math.BigDecimal AV62TFFasDec_To ;
   private java.math.BigDecimal AV111Tfasprowwds_15_tffasdec2 ;
   private java.math.BigDecimal AV63TFFasDec2 ;
   private java.math.BigDecimal AV112Tfasprowwds_16_tffasdec2_to ;
   private java.math.BigDecimal AV64TFFasDec2_To ;
   private java.math.BigDecimal AV117Tfasprowwds_21_tffasvelpro ;
   private java.math.BigDecimal AV69TFFasVelPro ;
   private java.math.BigDecimal AV118Tfasprowwds_22_tffasvelpro_to ;
   private java.math.BigDecimal AV70TFFasVelPro_To ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A14042FasActiva ;
   private String A457FasCod ;
   private String A460FasDsc ;
   private String A7070FasSigla ;
   private String A602MaqCod ;
   private String A606MaqDsc ;
   private String A456FasActTin ;
   private String A458FasCon ;
   private String A4903FasAcab ;
   private String A4286FasForMul ;
   private String A4299FasConPla ;
   private String AV98Tfasprowwds_2_tffasactiva_sel ;
   private String AV93TFFasActiva_Sel ;
   private String AV99Tfasprowwds_3_tffascod ;
   private String AV51TFFasCod ;
   private String AV100Tfasprowwds_4_tffascod_sel ;
   private String AV52TFFasCod_Sel ;
   private String AV101Tfasprowwds_5_tffasdsc ;
   private String AV53TFFasDsc ;
   private String AV102Tfasprowwds_6_tffasdsc_sel ;
   private String AV54TFFasDsc_Sel ;
   private String AV103Tfasprowwds_7_tffassigla ;
   private String AV55TFFasSigla ;
   private String AV104Tfasprowwds_8_tffassigla_sel ;
   private String AV56TFFasSigla_Sel ;
   private String AV105Tfasprowwds_9_tfmaqcod ;
   private String AV57TFMaqCod ;
   private String AV106Tfasprowwds_10_tfmaqcod_sel ;
   private String AV58TFMaqCod_Sel ;
   private String AV107Tfasprowwds_11_tfmaqdsc ;
   private String AV59TFMaqDsc ;
   private String AV108Tfasprowwds_12_tfmaqdsc_sel ;
   private String AV60TFMaqDsc_Sel ;
   private String AV121Tfasprowwds_25_tffasacttin ;
   private String AV73TFFasActTin ;
   private String AV122Tfasprowwds_26_tffasacttin_sel ;
   private String AV74TFFasActTin_Sel ;
   private String AV123Tfasprowwds_27_tffascon ;
   private String AV75TFFasCon ;
   private String AV124Tfasprowwds_28_tffascon_sel ;
   private String AV76TFFasCon_Sel ;
   private String AV125Tfasprowwds_29_tffasacab ;
   private String AV77TFFasAcab ;
   private String AV126Tfasprowwds_30_tffasacab_sel ;
   private String AV78TFFasAcab_Sel ;
   private String AV127Tfasprowwds_31_tffasformul ;
   private String AV79TFFasForMul ;
   private String AV128Tfasprowwds_32_tffasformul_sel ;
   private String AV80TFFasForMul_Sel ;
   private String AV129Tfasprowwds_33_tffasconpla ;
   private String AV81TFFasConPla ;
   private String AV130Tfasprowwds_34_tffasconpla_sel ;
   private String AV82TFFasConPla_Sel ;
   private String scmdbuf ;
   private String lV99Tfasprowwds_3_tffascod ;
   private String lV101Tfasprowwds_5_tffasdsc ;
   private String lV103Tfasprowwds_7_tffassigla ;
   private String lV105Tfasprowwds_9_tfmaqcod ;
   private String lV107Tfasprowwds_11_tfmaqdsc ;
   private String lV121Tfasprowwds_25_tffasacttin ;
   private String lV123Tfasprowwds_27_tffascon ;
   private String lV125Tfasprowwds_29_tffasacab ;
   private String lV127Tfasprowwds_31_tffasformul ;
   private String lV129Tfasprowwds_33_tffasconpla ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean n4299FasConPla ;
   private boolean n4286FasForMul ;
   private boolean n4903FasAcab ;
   private boolean n458FasCon ;
   private boolean n456FasActTin ;
   private boolean n464FasNumPas ;
   private boolean n472FasVelPro ;
   private boolean n468FasPrePie ;
   private boolean n469FasPreSal ;
   private boolean n5990FasDec2 ;
   private boolean n459FasDec ;
   private boolean n606MaqDsc ;
   private boolean n602MaqCod ;
   private boolean n7070FasSigla ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV97Tfasprowwds_1_filterfulltext ;
   private String AV89FilterFullText ;
   private String lV97Tfasprowwds_1_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private String[] P081Y2_A396EmprCod ;
   private String[] P081Y2_A4299FasConPla ;
   private boolean[] P081Y2_n4299FasConPla ;
   private String[] P081Y2_A4286FasForMul ;
   private boolean[] P081Y2_n4286FasForMul ;
   private String[] P081Y2_A4903FasAcab ;
   private boolean[] P081Y2_n4903FasAcab ;
   private String[] P081Y2_A458FasCon ;
   private boolean[] P081Y2_n458FasCon ;
   private String[] P081Y2_A456FasActTin ;
   private boolean[] P081Y2_n456FasActTin ;
   private short[] P081Y2_A464FasNumPas ;
   private boolean[] P081Y2_n464FasNumPas ;
   private java.math.BigDecimal[] P081Y2_A472FasVelPro ;
   private boolean[] P081Y2_n472FasVelPro ;
   private short[] P081Y2_A468FasPrePie ;
   private boolean[] P081Y2_n468FasPrePie ;
   private short[] P081Y2_A469FasPreSal ;
   private boolean[] P081Y2_n469FasPreSal ;
   private java.math.BigDecimal[] P081Y2_A5990FasDec2 ;
   private boolean[] P081Y2_n5990FasDec2 ;
   private java.math.BigDecimal[] P081Y2_A459FasDec ;
   private boolean[] P081Y2_n459FasDec ;
   private String[] P081Y2_A606MaqDsc ;
   private boolean[] P081Y2_n606MaqDsc ;
   private String[] P081Y2_A602MaqCod ;
   private boolean[] P081Y2_n602MaqCod ;
   private String[] P081Y2_A7070FasSigla ;
   private boolean[] P081Y2_n7070FasSigla ;
   private String[] P081Y2_A460FasDsc ;
   private String[] P081Y2_A457FasCod ;
   private String[] P081Y2_A14042FasActiva ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV49GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV50GridStateFilterValue ;
}

final  class tfasprowwexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P081Y2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV97Tfasprowwds_1_filterfulltext ,
                                          String AV98Tfasprowwds_2_tffasactiva_sel ,
                                          String AV100Tfasprowwds_4_tffascod_sel ,
                                          String AV99Tfasprowwds_3_tffascod ,
                                          String AV102Tfasprowwds_6_tffasdsc_sel ,
                                          String AV101Tfasprowwds_5_tffasdsc ,
                                          String AV104Tfasprowwds_8_tffassigla_sel ,
                                          String AV103Tfasprowwds_7_tffassigla ,
                                          String AV106Tfasprowwds_10_tfmaqcod_sel ,
                                          String AV105Tfasprowwds_9_tfmaqcod ,
                                          String AV108Tfasprowwds_12_tfmaqdsc_sel ,
                                          String AV107Tfasprowwds_11_tfmaqdsc ,
                                          java.math.BigDecimal AV109Tfasprowwds_13_tffasdec ,
                                          java.math.BigDecimal AV110Tfasprowwds_14_tffasdec_to ,
                                          java.math.BigDecimal AV111Tfasprowwds_15_tffasdec2 ,
                                          java.math.BigDecimal AV112Tfasprowwds_16_tffasdec2_to ,
                                          short AV113Tfasprowwds_17_tffaspresal ,
                                          short AV114Tfasprowwds_18_tffaspresal_to ,
                                          short AV115Tfasprowwds_19_tffasprepie ,
                                          short AV116Tfasprowwds_20_tffasprepie_to ,
                                          java.math.BigDecimal AV117Tfasprowwds_21_tffasvelpro ,
                                          java.math.BigDecimal AV118Tfasprowwds_22_tffasvelpro_to ,
                                          short AV119Tfasprowwds_23_tffasnumpas ,
                                          short AV120Tfasprowwds_24_tffasnumpas_to ,
                                          String AV122Tfasprowwds_26_tffasacttin_sel ,
                                          String AV121Tfasprowwds_25_tffasacttin ,
                                          String AV124Tfasprowwds_28_tffascon_sel ,
                                          String AV123Tfasprowwds_27_tffascon ,
                                          String AV126Tfasprowwds_30_tffasacab_sel ,
                                          String AV125Tfasprowwds_29_tffasacab ,
                                          String AV128Tfasprowwds_32_tffasformul_sel ,
                                          String AV127Tfasprowwds_31_tffasformul ,
                                          String AV130Tfasprowwds_34_tffasconpla_sel ,
                                          String AV129Tfasprowwds_33_tffasconpla ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String A7070FasSigla ,
                                          String A602MaqCod ,
                                          String A606MaqDsc ,
                                          java.math.BigDecimal A459FasDec ,
                                          java.math.BigDecimal A5990FasDec2 ,
                                          short A469FasPreSal ,
                                          short A468FasPrePie ,
                                          java.math.BigDecimal A472FasVelPro ,
                                          short A464FasNumPas ,
                                          String A456FasActTin ,
                                          String A458FasCon ,
                                          String A4903FasAcab ,
                                          String A4286FasForMul ,
                                          String A4299FasConPla ,
                                          String A14042FasActiva ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[49];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.FasConPla, T1.FasForMul, T1.FasAcab, T1.FasCon, T1.FasActTin, T1.FasNumPas, T1.FasVelPro, T1.FasPrePie, T1.FasPreSal, T1.FasDec2, T1.FasDec," ;
      scmdbuf += " T2.MaqDsc, T1.MaqCod, T1.FasSigla, T1.FasDsc, T1.FasCod, T1.FasActiva FROM (TXPFASPRO T1 LEFT JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod)" ;
      if ( ! (GXutil.strcmp("", AV97Tfasprowwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.FasCod) like '%' || UPPER(?)) or ( UPPER(T1.FasDsc) like '%' || UPPER(?)) or ( UPPER(T1.FasSigla) like '%' || UPPER(?)) or ( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( UPPER(T2.MaqDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.FasDec,'990.9'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.FasDec2,'9990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.FasPreSal,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.FasPrePie,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.FasVelPro,'990.9'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.FasNumPas,'990'), 2) like '%' || ?) or ( UPPER(T1.FasActTin) like '%' || UPPER(?)) or ( UPPER(T1.FasCon) like '%' || UPPER(?)) or ( UPPER(T1.FasAcab) like '%' || UPPER(?)) or ( UPPER(T1.FasForMul) like '%' || UPPER(?)) or ( UPPER(T1.FasConPla) like '%' || UPPER(?)))");
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
         GXv_int6[13] = (byte)(1) ;
         GXv_int6[14] = (byte)(1) ;
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Tfasprowwds_2_tffasactiva_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasActiva = ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV100Tfasprowwds_4_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV99Tfasprowwds_3_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Tfasprowwds_4_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Tfasprowwds_6_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV101Tfasprowwds_5_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Tfasprowwds_6_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasDsc = ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Tfasprowwds_8_tffassigla_sel)==0) && ( ! (GXutil.strcmp("", AV103Tfasprowwds_7_tffassigla)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasSigla) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Tfasprowwds_8_tffassigla_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasSigla = ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Tfasprowwds_10_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV105Tfasprowwds_9_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Tfasprowwds_10_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Tfasprowwds_12_tfmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV107Tfasprowwds_11_tfmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Tfasprowwds_12_tfmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV109Tfasprowwds_13_tffasdec)==0) )
      {
         addWhere(sWhereString, "(T1.FasDec >= ?)");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV110Tfasprowwds_14_tffasdec_to)==0) )
      {
         addWhere(sWhereString, "(T1.FasDec <= ?)");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV111Tfasprowwds_15_tffasdec2)==0) )
      {
         addWhere(sWhereString, "(T1.FasDec2 >= ?)");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV112Tfasprowwds_16_tffasdec2_to)==0) )
      {
         addWhere(sWhereString, "(T1.FasDec2 <= ?)");
      }
      else
      {
         GXv_int6[30] = (byte)(1) ;
      }
      if ( ! (0==AV113Tfasprowwds_17_tffaspresal) )
      {
         addWhere(sWhereString, "(T1.FasPreSal >= ?)");
      }
      else
      {
         GXv_int6[31] = (byte)(1) ;
      }
      if ( ! (0==AV114Tfasprowwds_18_tffaspresal_to) )
      {
         addWhere(sWhereString, "(T1.FasPreSal <= ?)");
      }
      else
      {
         GXv_int6[32] = (byte)(1) ;
      }
      if ( ! (0==AV115Tfasprowwds_19_tffasprepie) )
      {
         addWhere(sWhereString, "(T1.FasPrePie >= ?)");
      }
      else
      {
         GXv_int6[33] = (byte)(1) ;
      }
      if ( ! (0==AV116Tfasprowwds_20_tffasprepie_to) )
      {
         addWhere(sWhereString, "(T1.FasPrePie <= ?)");
      }
      else
      {
         GXv_int6[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV117Tfasprowwds_21_tffasvelpro)==0) )
      {
         addWhere(sWhereString, "(T1.FasVelPro >= ?)");
      }
      else
      {
         GXv_int6[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV118Tfasprowwds_22_tffasvelpro_to)==0) )
      {
         addWhere(sWhereString, "(T1.FasVelPro <= ?)");
      }
      else
      {
         GXv_int6[36] = (byte)(1) ;
      }
      if ( ! (0==AV119Tfasprowwds_23_tffasnumpas) )
      {
         addWhere(sWhereString, "(T1.FasNumPas >= ?)");
      }
      else
      {
         GXv_int6[37] = (byte)(1) ;
      }
      if ( ! (0==AV120Tfasprowwds_24_tffasnumpas_to) )
      {
         addWhere(sWhereString, "(T1.FasNumPas <= ?)");
      }
      else
      {
         GXv_int6[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV122Tfasprowwds_26_tffasacttin_sel)==0) && ( ! (GXutil.strcmp("", AV121Tfasprowwds_25_tffasacttin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasActTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV122Tfasprowwds_26_tffasacttin_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasActTin = ?)");
      }
      else
      {
         GXv_int6[40] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV124Tfasprowwds_28_tffascon_sel)==0) && ( ! (GXutil.strcmp("", AV123Tfasprowwds_27_tffascon)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCon) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV124Tfasprowwds_28_tffascon_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCon = ?)");
      }
      else
      {
         GXv_int6[42] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV126Tfasprowwds_30_tffasacab_sel)==0) && ( ! (GXutil.strcmp("", AV125Tfasprowwds_29_tffasacab)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasAcab) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV126Tfasprowwds_30_tffasacab_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasAcab = ?)");
      }
      else
      {
         GXv_int6[44] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV128Tfasprowwds_32_tffasformul_sel)==0) && ( ! (GXutil.strcmp("", AV127Tfasprowwds_31_tffasformul)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasForMul) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV128Tfasprowwds_32_tffasformul_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasForMul = ?)");
      }
      else
      {
         GXv_int6[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV130Tfasprowwds_34_tffasconpla_sel)==0) && ( ! (GXutil.strcmp("", AV129Tfasprowwds_33_tffasconpla)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasConPla) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV130Tfasprowwds_34_tffasconpla_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasConPla = ?)");
      }
      else
      {
         GXv_int6[48] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FasDsc" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FasDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FasActiva" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FasActiva DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FasCod" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FasCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FasSigla" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FasSigla DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MaqCod" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MaqCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.MaqDsc" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.MaqDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FasDec" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FasDec DESC" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FasDec2" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FasDec2 DESC" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FasPreSal" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FasPreSal DESC" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FasPrePie" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FasPrePie DESC" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FasVelPro" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FasVelPro DESC" ;
      }
      else if ( ( AV28OrderedBy == 12 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FasNumPas" ;
      }
      else if ( ( AV28OrderedBy == 12 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FasNumPas DESC" ;
      }
      else if ( ( AV28OrderedBy == 13 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FasActTin" ;
      }
      else if ( ( AV28OrderedBy == 13 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FasActTin DESC" ;
      }
      else if ( ( AV28OrderedBy == 14 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FasCon" ;
      }
      else if ( ( AV28OrderedBy == 14 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FasCon DESC" ;
      }
      else if ( ( AV28OrderedBy == 15 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FasAcab" ;
      }
      else if ( ( AV28OrderedBy == 15 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FasAcab DESC" ;
      }
      else if ( ( AV28OrderedBy == 16 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FasForMul" ;
      }
      else if ( ( AV28OrderedBy == 16 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FasForMul DESC" ;
      }
      else if ( ( AV28OrderedBy == 17 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FasConPla" ;
      }
      else if ( ( AV28OrderedBy == 17 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FasConPla DESC" ;
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
                  return conditional_P081Y2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).shortValue() , ((Number) dynConstraints[18]).shortValue() , ((Number) dynConstraints[19]).shortValue() , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , ((Number) dynConstraints[22]).shortValue() , ((Number) dynConstraints[23]).shortValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (java.math.BigDecimal)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , ((Number) dynConstraints[41]).shortValue() , ((Number) dynConstraints[42]).shortValue() , (java.math.BigDecimal)dynConstraints[43] , ((Number) dynConstraints[44]).shortValue() , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , ((Number) dynConstraints[51]).shortValue() , ((Boolean) dynConstraints[52]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P081Y2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(8,1);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(12,1);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 16);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 6);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 4);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 28);
               ((String[]) buf[30])[0] = rslt.getString(17, 8);
               ((String[]) buf[31])[0] = rslt.getString(18, 1);
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
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 8);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 8);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 28);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 28);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 4);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 4);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 6);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 6);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 16);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 16);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[76], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[77], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[78], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[79], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[80]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[81]).shortValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[82]).shortValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[83]).shortValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[84], 1);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[85], 1);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[86]).shortValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[87]).shortValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 1);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 1);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 1);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 1);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 1);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 1);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 1);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[95], 1);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 1);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 1);
               }
               return;
      }
   }

}

