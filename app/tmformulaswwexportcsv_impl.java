package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tmformulaswwexportcsv_impl extends GXWebProcedure
{
   public tmformulaswwexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "TMFormulasWWExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("TMFormulasWWColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("TMFormulasWWColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Articulo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Color", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Numero", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Color Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Tc", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha Formula", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha Ult Uti", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nº Interno F.", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Rb", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV136Tmformulaswwds_1_forfec = AV114ForFec ;
      AV137Tmformulaswwds_2_forfec_to = AV115ForFec_To ;
      AV138Tmformulaswwds_3_filterfulltext = AV132FilterFullText ;
      AV139Tmformulaswwds_4_tfclicod = AV66TFCliCod ;
      AV140Tmformulaswwds_5_tfclicod_to = AV67TFCliCod_To ;
      AV141Tmformulaswwds_6_tfclinom = AV68TFCliNom ;
      AV142Tmformulaswwds_7_tfclinom_sel = AV69TFCliNom_Sel ;
      AV143Tmformulaswwds_8_tfforser = AV70TFForSer ;
      AV144Tmformulaswwds_9_tfforser_sel = AV71TFForSer_Sel ;
      AV145Tmformulaswwds_10_tfforserdsc = AV72TFForSerDsc ;
      AV146Tmformulaswwds_11_tfforserdsc_sel = AV73TFForSerDsc_Sel ;
      AV147Tmformulaswwds_12_tfforcolnom = AV74TFForColNom ;
      AV148Tmformulaswwds_13_tfforcolnom_sel = AV75TFForColNom_Sel ;
      AV149Tmformulaswwds_14_tfforcolnum = AV76TFForColNum ;
      AV150Tmformulaswwds_15_tfforcolnum_to = AV77TFForColNum_To ;
      AV151Tmformulaswwds_16_tffornomcli = AV106TFForNomCli ;
      AV152Tmformulaswwds_17_tffornomcli_sel = AV107TFForNomCli_Sel ;
      AV153Tmformulaswwds_18_tftipcolcod = AV78TFTipColCod ;
      AV154Tmformulaswwds_19_tftipcolcod_to = AV79TFTipColCod_To ;
      AV155Tmformulaswwds_20_tftipcoldsc = AV80TFTipColDsc ;
      AV156Tmformulaswwds_21_tftipcoldsc_sel = AV81TFTipColDsc_Sel ;
      AV157Tmformulaswwds_22_tfforfec = AV116TFForFec ;
      AV158Tmformulaswwds_23_tfforultuti = AV118TFForUltUti ;
      AV159Tmformulaswwds_24_tffornumcol = AV120TFForNumCol ;
      AV160Tmformulaswwds_25_tffornumcol_to = AV121TFForNumCol_To ;
      AV161Tmformulaswwds_26_tfforrelban = AV130TFForRelBan ;
      AV162Tmformulaswwds_27_tfforrelban_to = AV131TFForRelBan_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV136Tmformulaswwds_1_forfec ,
                                           AV137Tmformulaswwds_2_forfec_to ,
                                           AV138Tmformulaswwds_3_filterfulltext ,
                                           Integer.valueOf(AV139Tmformulaswwds_4_tfclicod) ,
                                           Integer.valueOf(AV140Tmformulaswwds_5_tfclicod_to) ,
                                           AV142Tmformulaswwds_7_tfclinom_sel ,
                                           AV141Tmformulaswwds_6_tfclinom ,
                                           AV144Tmformulaswwds_9_tfforser_sel ,
                                           AV143Tmformulaswwds_8_tfforser ,
                                           AV146Tmformulaswwds_11_tfforserdsc_sel ,
                                           AV145Tmformulaswwds_10_tfforserdsc ,
                                           AV148Tmformulaswwds_13_tfforcolnom_sel ,
                                           AV147Tmformulaswwds_12_tfforcolnom ,
                                           Integer.valueOf(AV149Tmformulaswwds_14_tfforcolnum) ,
                                           Integer.valueOf(AV150Tmformulaswwds_15_tfforcolnum_to) ,
                                           AV152Tmformulaswwds_17_tffornomcli_sel ,
                                           AV151Tmformulaswwds_16_tffornomcli ,
                                           Byte.valueOf(AV153Tmformulaswwds_18_tftipcolcod) ,
                                           Byte.valueOf(AV154Tmformulaswwds_19_tftipcolcod_to) ,
                                           AV156Tmformulaswwds_21_tftipcoldsc_sel ,
                                           AV155Tmformulaswwds_20_tftipcoldsc ,
                                           AV157Tmformulaswwds_22_tfforfec ,
                                           AV158Tmformulaswwds_23_tfforultuti ,
                                           Integer.valueOf(AV159Tmformulaswwds_24_tffornumcol) ,
                                           Integer.valueOf(AV160Tmformulaswwds_25_tffornumcol_to) ,
                                           AV161Tmformulaswwds_26_tfforrelban ,
                                           AV162Tmformulaswwds_27_tfforrelban_to ,
                                           A485ForFec ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A494ForSer ,
                                           A5742ForSerDsc ,
                                           A482ForColNom ,
                                           Integer.valueOf(A483ForColNum) ,
                                           A1191ForNomCli ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A832TipColDsc ,
                                           Integer.valueOf(A486ForNumCol) ,
                                           A2838ForRelBan ,
                                           A496ForUltUti ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV138Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV138Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV138Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV138Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV138Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV138Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV138Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV138Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV138Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV138Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV138Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV138Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV138Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV138Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV138Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV138Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV138Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV138Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV138Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV138Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV138Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV138Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV141Tmformulaswwds_6_tfclinom = GXutil.padr( GXutil.rtrim( AV141Tmformulaswwds_6_tfclinom), 30, "%") ;
      lV143Tmformulaswwds_8_tfforser = GXutil.padr( GXutil.rtrim( AV143Tmformulaswwds_8_tfforser), 16, "%") ;
      lV145Tmformulaswwds_10_tfforserdsc = GXutil.padr( GXutil.rtrim( AV145Tmformulaswwds_10_tfforserdsc), 26, "%") ;
      lV147Tmformulaswwds_12_tfforcolnom = GXutil.padr( GXutil.rtrim( AV147Tmformulaswwds_12_tfforcolnom), 13, "%") ;
      lV151Tmformulaswwds_16_tffornomcli = GXutil.padr( GXutil.rtrim( AV151Tmformulaswwds_16_tffornomcli), 13, "%") ;
      lV155Tmformulaswwds_20_tftipcoldsc = GXutil.padr( GXutil.rtrim( AV155Tmformulaswwds_20_tftipcoldsc), 30, "%") ;
      /* Using cursor P08JR2 */
      pr_default.execute(0, new Object[] {AV136Tmformulaswwds_1_forfec, AV137Tmformulaswwds_2_forfec_to, lV138Tmformulaswwds_3_filterfulltext, lV138Tmformulaswwds_3_filterfulltext, lV138Tmformulaswwds_3_filterfulltext, lV138Tmformulaswwds_3_filterfulltext, lV138Tmformulaswwds_3_filterfulltext, lV138Tmformulaswwds_3_filterfulltext, lV138Tmformulaswwds_3_filterfulltext, lV138Tmformulaswwds_3_filterfulltext, lV138Tmformulaswwds_3_filterfulltext, lV138Tmformulaswwds_3_filterfulltext, lV138Tmformulaswwds_3_filterfulltext, Integer.valueOf(AV139Tmformulaswwds_4_tfclicod), Integer.valueOf(AV140Tmformulaswwds_5_tfclicod_to), lV141Tmformulaswwds_6_tfclinom, AV142Tmformulaswwds_7_tfclinom_sel, lV143Tmformulaswwds_8_tfforser, AV144Tmformulaswwds_9_tfforser_sel, lV145Tmformulaswwds_10_tfforserdsc, AV146Tmformulaswwds_11_tfforserdsc_sel, lV147Tmformulaswwds_12_tfforcolnom, AV148Tmformulaswwds_13_tfforcolnom_sel, Integer.valueOf(AV149Tmformulaswwds_14_tfforcolnum), Integer.valueOf(AV150Tmformulaswwds_15_tfforcolnum_to), lV151Tmformulaswwds_16_tffornomcli, AV152Tmformulaswwds_17_tffornomcli_sel, Byte.valueOf(AV153Tmformulaswwds_18_tftipcolcod), Byte.valueOf(AV154Tmformulaswwds_19_tftipcolcod_to), lV155Tmformulaswwds_20_tftipcoldsc, AV156Tmformulaswwds_21_tftipcoldsc_sel, AV157Tmformulaswwds_22_tfforfec, AV158Tmformulaswwds_23_tfforultuti, Integer.valueOf(AV159Tmformulaswwds_24_tffornumcol), Integer.valueOf(AV160Tmformulaswwds_25_tffornumcol_to), AV161Tmformulaswwds_26_tfforrelban, AV162Tmformulaswwds_27_tfforrelban_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P08JR2_A396EmprCod[0] ;
         A2838ForRelBan = P08JR2_A2838ForRelBan[0] ;
         n2838ForRelBan = P08JR2_n2838ForRelBan[0] ;
         A486ForNumCol = P08JR2_A486ForNumCol[0] ;
         A496ForUltUti = P08JR2_A496ForUltUti[0] ;
         n496ForUltUti = P08JR2_n496ForUltUti[0] ;
         A832TipColDsc = P08JR2_A832TipColDsc[0] ;
         n832TipColDsc = P08JR2_n832TipColDsc[0] ;
         A831TipColCod = P08JR2_A831TipColCod[0] ;
         A1191ForNomCli = P08JR2_A1191ForNomCli[0] ;
         n1191ForNomCli = P08JR2_n1191ForNomCli[0] ;
         A483ForColNum = P08JR2_A483ForColNum[0] ;
         A482ForColNom = P08JR2_A482ForColNom[0] ;
         A5742ForSerDsc = P08JR2_A5742ForSerDsc[0] ;
         n5742ForSerDsc = P08JR2_n5742ForSerDsc[0] ;
         A494ForSer = P08JR2_A494ForSer[0] ;
         A279CliNom = P08JR2_A279CliNom[0] ;
         A252CliCod = P08JR2_A252CliCod[0] ;
         A485ForFec = P08JR2_A485ForFec[0] ;
         n485ForFec = P08JR2_n485ForFec[0] ;
         A832TipColDsc = P08JR2_A832TipColDsc[0] ;
         n832TipColDsc = P08JR2_n832TipColDsc[0] ;
         A279CliNom = P08JR2_A279CliNom[0] ;
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
            AV14TextFileLine += GXutil.str( A252CliCod, 6, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A279CliNom, ";", ","), GXv_char3) ;
            tmformulaswwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A494ForSer, ";", ","), GXv_char3) ;
            tmformulaswwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A5742ForSerDsc, ";", ","), GXv_char3) ;
            tmformulaswwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A482ForColNom, ";", ","), GXv_char3) ;
            tmformulaswwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A483ForColNum, 6, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A1191ForNomCli, ";", ","), GXv_char3) ;
            tmformulaswwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A831TipColCod, 2, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A832TipColDsc, ";", ","), GXv_char3) ;
            tmformulaswwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += localUtil.dtoc( A485ForFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += localUtil.dtoc( A496ForUltUti, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A486ForNumCol, 8, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A2838ForRelBan, 7, 2) ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=TMFormulasWWExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CliCod", "", "Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CliNom", "", "Nombre Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ForSer", "", "Articulo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ForSerDsc", "", "Descripcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ForColNom", "", "Color", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ForColNum", "", "Numero", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ForNomCli", "", "Color Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "TipColCod", "", "Tc", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "TipColDsc", "", "Descripcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ForFec", "", "Fecha Formula", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ForUltUti", "", "Fecha Ult Uti", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ForNumCol", "", "Nº Interno F.", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ForRelBan", "", "Rb", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "TMFormulasWWColumnsSelector", GXv_char3) ;
      tmformulaswwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("TMFormulasWWGridState"), "") == 0 )
      {
         AV64GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TMFormulasWWGridState"), null, null);
      }
      else
      {
         AV64GridState.fromxml(AV19Session.getValue("TMFormulasWWGridState"), null, null);
      }
      AV28OrderedBy = AV64GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV64GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV163GXV1 = 1 ;
      while ( AV163GXV1 <= AV64GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV65GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV64GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV163GXV1));
         if ( GXutil.strcmp(AV65GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FORFEC") == 0 )
         {
            AV114ForFec = localUtil.ctod( AV65GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV115ForFec_To = localUtil.ctod( AV65GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV65GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV132FilterFullText = AV65GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV65GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV66TFCliCod = (int)(GXutil.lval( AV65GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV67TFCliCod_To = (int)(GXutil.lval( AV65GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV65GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV68TFCliNom = AV65GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV65GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV69TFCliNom_Sel = AV65GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV65GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSER") == 0 )
         {
            AV70TFForSer = AV65GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV65GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSER_SEL") == 0 )
         {
            AV71TFForSer_Sel = AV65GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV65GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSERDSC") == 0 )
         {
            AV72TFForSerDsc = AV65GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV65GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSERDSC_SEL") == 0 )
         {
            AV73TFForSerDsc_Sel = AV65GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV65GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNOM") == 0 )
         {
            AV74TFForColNom = AV65GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV65GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNOM_SEL") == 0 )
         {
            AV75TFForColNom_Sel = AV65GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV65GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNUM") == 0 )
         {
            AV76TFForColNum = (int)(GXutil.lval( AV65GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV77TFForColNum_To = (int)(GXutil.lval( AV65GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV65GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORNOMCLI") == 0 )
         {
            AV106TFForNomCli = AV65GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV65GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORNOMCLI_SEL") == 0 )
         {
            AV107TFForNomCli_Sel = AV65GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV65GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLCOD") == 0 )
         {
            AV78TFTipColCod = (byte)(GXutil.lval( AV65GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV79TFTipColCod_To = (byte)(GXutil.lval( AV65GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV65GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLDSC") == 0 )
         {
            AV80TFTipColDsc = AV65GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV65GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLDSC_SEL") == 0 )
         {
            AV81TFTipColDsc_Sel = AV65GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV65GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORFEC") == 0 )
         {
            AV116TFForFec = localUtil.ctod( AV65GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV65GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORULTUTI") == 0 )
         {
            AV118TFForUltUti = localUtil.ctod( AV65GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV65GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORNUMCOL") == 0 )
         {
            AV120TFForNumCol = (int)(GXutil.lval( AV65GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV121TFForNumCol_To = (int)(GXutil.lval( AV65GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV65GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORRELBAN") == 0 )
         {
            AV130TFForRelBan = CommonUtil.decimalVal( AV65GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV131TFForRelBan_To = CommonUtil.decimalVal( AV65GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         AV163GXV1 = (int)(AV163GXV1+1) ;
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
      A279CliNom = "" ;
      A494ForSer = "" ;
      A5742ForSerDsc = "" ;
      A482ForColNom = "" ;
      A1191ForNomCli = "" ;
      A832TipColDsc = "" ;
      A485ForFec = GXutil.nullDate() ;
      A496ForUltUti = GXutil.nullDate() ;
      A2838ForRelBan = DecimalUtil.ZERO ;
      AV136Tmformulaswwds_1_forfec = GXutil.nullDate() ;
      AV114ForFec = GXutil.nullDate() ;
      AV137Tmformulaswwds_2_forfec_to = GXutil.nullDate() ;
      AV115ForFec_To = GXutil.nullDate() ;
      AV138Tmformulaswwds_3_filterfulltext = "" ;
      AV132FilterFullText = "" ;
      AV141Tmformulaswwds_6_tfclinom = "" ;
      AV68TFCliNom = "" ;
      AV142Tmformulaswwds_7_tfclinom_sel = "" ;
      AV69TFCliNom_Sel = "" ;
      AV143Tmformulaswwds_8_tfforser = "" ;
      AV70TFForSer = "" ;
      AV144Tmformulaswwds_9_tfforser_sel = "" ;
      AV71TFForSer_Sel = "" ;
      AV145Tmformulaswwds_10_tfforserdsc = "" ;
      AV72TFForSerDsc = "" ;
      AV146Tmformulaswwds_11_tfforserdsc_sel = "" ;
      AV73TFForSerDsc_Sel = "" ;
      AV147Tmformulaswwds_12_tfforcolnom = "" ;
      AV74TFForColNom = "" ;
      AV148Tmformulaswwds_13_tfforcolnom_sel = "" ;
      AV75TFForColNom_Sel = "" ;
      AV151Tmformulaswwds_16_tffornomcli = "" ;
      AV106TFForNomCli = "" ;
      AV152Tmformulaswwds_17_tffornomcli_sel = "" ;
      AV107TFForNomCli_Sel = "" ;
      AV155Tmformulaswwds_20_tftipcoldsc = "" ;
      AV80TFTipColDsc = "" ;
      AV156Tmformulaswwds_21_tftipcoldsc_sel = "" ;
      AV81TFTipColDsc_Sel = "" ;
      AV157Tmformulaswwds_22_tfforfec = GXutil.nullDate() ;
      AV116TFForFec = GXutil.nullDate() ;
      AV158Tmformulaswwds_23_tfforultuti = GXutil.nullDate() ;
      AV118TFForUltUti = GXutil.nullDate() ;
      AV161Tmformulaswwds_26_tfforrelban = DecimalUtil.ZERO ;
      AV130TFForRelBan = DecimalUtil.ZERO ;
      AV162Tmformulaswwds_27_tfforrelban_to = DecimalUtil.ZERO ;
      AV131TFForRelBan_To = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV138Tmformulaswwds_3_filterfulltext = "" ;
      lV141Tmformulaswwds_6_tfclinom = "" ;
      lV143Tmformulaswwds_8_tfforser = "" ;
      lV145Tmformulaswwds_10_tfforserdsc = "" ;
      lV147Tmformulaswwds_12_tfforcolnom = "" ;
      lV151Tmformulaswwds_16_tffornomcli = "" ;
      lV155Tmformulaswwds_20_tftipcoldsc = "" ;
      P08JR2_A396EmprCod = new String[] {""} ;
      P08JR2_A2838ForRelBan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08JR2_n2838ForRelBan = new boolean[] {false} ;
      P08JR2_A486ForNumCol = new int[1] ;
      P08JR2_A496ForUltUti = new java.util.Date[] {GXutil.nullDate()} ;
      P08JR2_n496ForUltUti = new boolean[] {false} ;
      P08JR2_A832TipColDsc = new String[] {""} ;
      P08JR2_n832TipColDsc = new boolean[] {false} ;
      P08JR2_A831TipColCod = new byte[1] ;
      P08JR2_A1191ForNomCli = new String[] {""} ;
      P08JR2_n1191ForNomCli = new boolean[] {false} ;
      P08JR2_A483ForColNum = new int[1] ;
      P08JR2_A482ForColNom = new String[] {""} ;
      P08JR2_A5742ForSerDsc = new String[] {""} ;
      P08JR2_n5742ForSerDsc = new boolean[] {false} ;
      P08JR2_A494ForSer = new String[] {""} ;
      P08JR2_A279CliNom = new String[] {""} ;
      P08JR2_A252CliCod = new int[1] ;
      P08JR2_A485ForFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08JR2_n485ForFec = new boolean[] {false} ;
      A396EmprCod = "" ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector5 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV64GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV65GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tmformulaswwexportcsv__default(),
         new Object[] {
             new Object[] {
            P08JR2_A396EmprCod, P08JR2_A2838ForRelBan, P08JR2_n2838ForRelBan, P08JR2_A486ForNumCol, P08JR2_A496ForUltUti, P08JR2_n496ForUltUti, P08JR2_A832TipColDsc, P08JR2_n832TipColDsc, P08JR2_A831TipColCod, P08JR2_A1191ForNomCli,
            P08JR2_n1191ForNomCli, P08JR2_A483ForColNum, P08JR2_A482ForColNom, P08JR2_A5742ForSerDsc, P08JR2_n5742ForSerDsc, P08JR2_A494ForSer, P08JR2_A279CliNom, P08JR2_A252CliCod, P08JR2_A485ForFec, P08JR2_n485ForFec
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A831TipColCod ;
   private byte AV153Tmformulaswwds_18_tftipcolcod ;
   private byte AV78TFTipColCod ;
   private byte AV154Tmformulaswwds_19_tftipcolcod_to ;
   private byte AV79TFTipColCod_To ;
   private short gxcookieaux ;
   private short AV28OrderedBy ;
   private short Gx_err ;
   private int AV13Random ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private int A486ForNumCol ;
   private int AV139Tmformulaswwds_4_tfclicod ;
   private int AV66TFCliCod ;
   private int AV140Tmformulaswwds_5_tfclicod_to ;
   private int AV67TFCliCod_To ;
   private int AV149Tmformulaswwds_14_tfforcolnum ;
   private int AV76TFForColNum ;
   private int AV150Tmformulaswwds_15_tfforcolnum_to ;
   private int AV77TFForColNum_To ;
   private int AV159Tmformulaswwds_24_tffornumcol ;
   private int AV120TFForNumCol ;
   private int AV160Tmformulaswwds_25_tffornumcol_to ;
   private int AV121TFForNumCol_To ;
   private int AV163GXV1 ;
   private java.math.BigDecimal A2838ForRelBan ;
   private java.math.BigDecimal AV161Tmformulaswwds_26_tfforrelban ;
   private java.math.BigDecimal AV130TFForRelBan ;
   private java.math.BigDecimal AV162Tmformulaswwds_27_tfforrelban_to ;
   private java.math.BigDecimal AV131TFForRelBan_To ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A279CliNom ;
   private String A494ForSer ;
   private String A5742ForSerDsc ;
   private String A482ForColNom ;
   private String A1191ForNomCli ;
   private String A832TipColDsc ;
   private String AV141Tmformulaswwds_6_tfclinom ;
   private String AV68TFCliNom ;
   private String AV142Tmformulaswwds_7_tfclinom_sel ;
   private String AV69TFCliNom_Sel ;
   private String AV143Tmformulaswwds_8_tfforser ;
   private String AV70TFForSer ;
   private String AV144Tmformulaswwds_9_tfforser_sel ;
   private String AV71TFForSer_Sel ;
   private String AV145Tmformulaswwds_10_tfforserdsc ;
   private String AV72TFForSerDsc ;
   private String AV146Tmformulaswwds_11_tfforserdsc_sel ;
   private String AV73TFForSerDsc_Sel ;
   private String AV147Tmformulaswwds_12_tfforcolnom ;
   private String AV74TFForColNom ;
   private String AV148Tmformulaswwds_13_tfforcolnom_sel ;
   private String AV75TFForColNom_Sel ;
   private String AV151Tmformulaswwds_16_tffornomcli ;
   private String AV106TFForNomCli ;
   private String AV152Tmformulaswwds_17_tffornomcli_sel ;
   private String AV107TFForNomCli_Sel ;
   private String AV155Tmformulaswwds_20_tftipcoldsc ;
   private String AV80TFTipColDsc ;
   private String AV156Tmformulaswwds_21_tftipcoldsc_sel ;
   private String AV81TFTipColDsc_Sel ;
   private String scmdbuf ;
   private String lV141Tmformulaswwds_6_tfclinom ;
   private String lV143Tmformulaswwds_8_tfforser ;
   private String lV145Tmformulaswwds_10_tfforserdsc ;
   private String lV147Tmformulaswwds_12_tfforcolnom ;
   private String lV151Tmformulaswwds_16_tffornomcli ;
   private String lV155Tmformulaswwds_20_tftipcoldsc ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private java.util.Date A485ForFec ;
   private java.util.Date A496ForUltUti ;
   private java.util.Date AV136Tmformulaswwds_1_forfec ;
   private java.util.Date AV114ForFec ;
   private java.util.Date AV137Tmformulaswwds_2_forfec_to ;
   private java.util.Date AV115ForFec_To ;
   private java.util.Date AV157Tmformulaswwds_22_tfforfec ;
   private java.util.Date AV116TFForFec ;
   private java.util.Date AV158Tmformulaswwds_23_tfforultuti ;
   private java.util.Date AV118TFForUltUti ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean n2838ForRelBan ;
   private boolean n496ForUltUti ;
   private boolean n832TipColDsc ;
   private boolean n1191ForNomCli ;
   private boolean n5742ForSerDsc ;
   private boolean n485ForFec ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV138Tmformulaswwds_3_filterfulltext ;
   private String AV132FilterFullText ;
   private String lV138Tmformulaswwds_3_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private String[] P08JR2_A396EmprCod ;
   private java.math.BigDecimal[] P08JR2_A2838ForRelBan ;
   private boolean[] P08JR2_n2838ForRelBan ;
   private int[] P08JR2_A486ForNumCol ;
   private java.util.Date[] P08JR2_A496ForUltUti ;
   private boolean[] P08JR2_n496ForUltUti ;
   private String[] P08JR2_A832TipColDsc ;
   private boolean[] P08JR2_n832TipColDsc ;
   private byte[] P08JR2_A831TipColCod ;
   private String[] P08JR2_A1191ForNomCli ;
   private boolean[] P08JR2_n1191ForNomCli ;
   private int[] P08JR2_A483ForColNum ;
   private String[] P08JR2_A482ForColNom ;
   private String[] P08JR2_A5742ForSerDsc ;
   private boolean[] P08JR2_n5742ForSerDsc ;
   private String[] P08JR2_A494ForSer ;
   private String[] P08JR2_A279CliNom ;
   private int[] P08JR2_A252CliCod ;
   private java.util.Date[] P08JR2_A485ForFec ;
   private boolean[] P08JR2_n485ForFec ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV64GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV65GridStateFilterValue ;
}

final  class tmformulaswwexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08JR2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV136Tmformulaswwds_1_forfec ,
                                          java.util.Date AV137Tmformulaswwds_2_forfec_to ,
                                          String AV138Tmformulaswwds_3_filterfulltext ,
                                          int AV139Tmformulaswwds_4_tfclicod ,
                                          int AV140Tmformulaswwds_5_tfclicod_to ,
                                          String AV142Tmformulaswwds_7_tfclinom_sel ,
                                          String AV141Tmformulaswwds_6_tfclinom ,
                                          String AV144Tmformulaswwds_9_tfforser_sel ,
                                          String AV143Tmformulaswwds_8_tfforser ,
                                          String AV146Tmformulaswwds_11_tfforserdsc_sel ,
                                          String AV145Tmformulaswwds_10_tfforserdsc ,
                                          String AV148Tmformulaswwds_13_tfforcolnom_sel ,
                                          String AV147Tmformulaswwds_12_tfforcolnom ,
                                          int AV149Tmformulaswwds_14_tfforcolnum ,
                                          int AV150Tmformulaswwds_15_tfforcolnum_to ,
                                          String AV152Tmformulaswwds_17_tffornomcli_sel ,
                                          String AV151Tmformulaswwds_16_tffornomcli ,
                                          byte AV153Tmformulaswwds_18_tftipcolcod ,
                                          byte AV154Tmformulaswwds_19_tftipcolcod_to ,
                                          String AV156Tmformulaswwds_21_tftipcoldsc_sel ,
                                          String AV155Tmformulaswwds_20_tftipcoldsc ,
                                          java.util.Date AV157Tmformulaswwds_22_tfforfec ,
                                          java.util.Date AV158Tmformulaswwds_23_tfforultuti ,
                                          int AV159Tmformulaswwds_24_tffornumcol ,
                                          int AV160Tmformulaswwds_25_tffornumcol_to ,
                                          java.math.BigDecimal AV161Tmformulaswwds_26_tfforrelban ,
                                          java.math.BigDecimal AV162Tmformulaswwds_27_tfforrelban_to ,
                                          java.util.Date A485ForFec ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A494ForSer ,
                                          String A5742ForSerDsc ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          String A1191ForNomCli ,
                                          byte A831TipColCod ,
                                          String A832TipColDsc ,
                                          int A486ForNumCol ,
                                          java.math.BigDecimal A2838ForRelBan ,
                                          java.util.Date A496ForUltUti ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[37];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ForRelBan, T1.ForNumCol, T1.ForUltUti, T2.TipColDsc, T1.TipColCod, T1.ForNomCli, T1.ForColNum, T1.ForColNom, T1.ForSerDsc, T1.ForSer, T3.CliNom," ;
      scmdbuf += " T1.CliCod, T1.ForFec FROM ((TXPCFORMU T1 INNER JOIN TXPTIPCOL T2 ON T2.EmprCod = T1.EmprCod AND T2.TipColCod = T1.TipColCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV136Tmformulaswwds_1_forfec)) )
      {
         addWhere(sWhereString, "(T1.ForFec >= ?)");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV137Tmformulaswwds_2_forfec_to)) )
      {
         addWhere(sWhereString, "(T1.ForFec <= ?)");
      }
      else
      {
         GXv_int6[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV138Tmformulaswwds_3_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ForSer) like '%' || UPPER(?)) or ( UPPER(T1.ForSerDsc) like '%' || UPPER(?)) or ( UPPER(T1.ForColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ForColNum,'999990'), 2) like '%' || ?) or ( UPPER(T1.ForNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.TipColCod,'90'), 2) like '%' || ?) or ( UPPER(T2.TipColDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ForNumCol,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.ForRelBan,'9990.99'), 2) like '%' || ?))");
      }
      else
      {
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
      if ( ! (0==AV139Tmformulaswwds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (0==AV140Tmformulaswwds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV142Tmformulaswwds_7_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV141Tmformulaswwds_6_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV142Tmformulaswwds_7_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV144Tmformulaswwds_9_tfforser_sel)==0) && ( ! (GXutil.strcmp("", AV143Tmformulaswwds_8_tfforser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV144Tmformulaswwds_9_tfforser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer = ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV146Tmformulaswwds_11_tfforserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV145Tmformulaswwds_10_tfforserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV146Tmformulaswwds_11_tfforserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSerDsc = ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV148Tmformulaswwds_13_tfforcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV147Tmformulaswwds_12_tfforcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV148Tmformulaswwds_13_tfforcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom = ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (0==AV149Tmformulaswwds_14_tfforcolnum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (0==AV150Tmformulaswwds_15_tfforcolnum_to) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV152Tmformulaswwds_17_tffornomcli_sel)==0) && ( ! (GXutil.strcmp("", AV151Tmformulaswwds_16_tffornomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV152Tmformulaswwds_17_tffornomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForNomCli = ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( ! (0==AV153Tmformulaswwds_18_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( ! (0==AV154Tmformulaswwds_19_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV156Tmformulaswwds_21_tftipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV155Tmformulaswwds_20_tftipcoldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipColDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV156Tmformulaswwds_21_tftipcoldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipColDsc = ?)");
      }
      else
      {
         GXv_int6[30] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV157Tmformulaswwds_22_tfforfec)) )
      {
         addWhere(sWhereString, "(T1.ForFec >= ?)");
      }
      else
      {
         GXv_int6[31] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV158Tmformulaswwds_23_tfforultuti)) )
      {
         addWhere(sWhereString, "(T1.ForUltUti >= ?)");
      }
      else
      {
         GXv_int6[32] = (byte)(1) ;
      }
      if ( ! (0==AV159Tmformulaswwds_24_tffornumcol) )
      {
         addWhere(sWhereString, "(T1.ForNumCol >= ?)");
      }
      else
      {
         GXv_int6[33] = (byte)(1) ;
      }
      if ( ! (0==AV160Tmformulaswwds_25_tffornumcol_to) )
      {
         addWhere(sWhereString, "(T1.ForNumCol <= ?)");
      }
      else
      {
         GXv_int6[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV161Tmformulaswwds_26_tfforrelban)==0) )
      {
         addWhere(sWhereString, "(T1.ForRelBan >= ?)");
      }
      else
      {
         GXv_int6[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV162Tmformulaswwds_27_tfforrelban_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForRelBan <= ?)");
      }
      else
      {
         GXv_int6[36] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForFec" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForFec DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.CliNom" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.CliNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForSer" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForSer DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForSerDsc" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForSerDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForColNom" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForColNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForColNum" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForColNum DESC" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForNomCli" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForNomCli DESC" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.TipColCod" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.TipColCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.TipColDsc" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.TipColDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForUltUti" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForUltUti DESC" ;
      }
      else if ( ( AV28OrderedBy == 12 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForNumCol" ;
      }
      else if ( ( AV28OrderedBy == 12 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForNumCol DESC" ;
      }
      else if ( ( AV28OrderedBy == 13 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForRelBan" ;
      }
      else if ( ( AV28OrderedBy == 13 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForRelBan DESC" ;
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
                  return conditional_P08JR2(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.util.Date)dynConstraints[21] , (java.util.Date)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).intValue() , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.util.Date)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , ((Number) dynConstraints[35]).byteValue() , (String)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , (java.math.BigDecimal)dynConstraints[38] , (java.util.Date)dynConstraints[39] , ((Number) dynConstraints[40]).shortValue() , ((Boolean) dynConstraints[41]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08JR2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(6);
               ((String[]) buf[9])[0] = rslt.getString(7, 13);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(8);
               ((String[]) buf[12])[0] = rslt.getString(9, 13);
               ((String[]) buf[13])[0] = rslt.getString(10, 26);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(11, 16);
               ((String[]) buf[16])[0] = rslt.getString(12, 30);
               ((int[]) buf[17])[0] = rslt.getInt(13);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(14);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
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
                  stmt.setDate(sIdx, (java.util.Date)parms[37]);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[38]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 26);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 26);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 13);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 13);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[64]).byteValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[65]).byteValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 30);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[68]);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[69]);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[70]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[72], 2);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[73], 2);
               }
               return;
      }
   }

}

