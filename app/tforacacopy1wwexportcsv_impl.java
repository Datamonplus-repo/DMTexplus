package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tforacacopy1wwexportcsv_impl extends GXWebProcedure
{
   public tforacacopy1wwexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "TFORACACopy1WWExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("TFORACACopy1WWColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("TFORACACopy1WWColumnsSelector") ;
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
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cód. Art.", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Artículo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cód. Proc.", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Proceso", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Codigo Fase", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion de Fase", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Formula?", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Ultima Línea", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Factor", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV71Tforacacopy1wwds_1_filterfulltext = AV67FilterFullText ;
      AV72Tforacacopy1wwds_2_tfclicod = AV45TFCliCod ;
      AV73Tforacacopy1wwds_3_tfclicod_to = AV46TFCliCod_To ;
      AV74Tforacacopy1wwds_4_tfclinom = AV47TFCliNom ;
      AV75Tforacacopy1wwds_5_tfclinom_sel = AV48TFCliNom_Sel ;
      AV76Tforacacopy1wwds_6_tfartcod = AV49TFArtCod ;
      AV77Tforacacopy1wwds_7_tfartcod_sel = AV50TFArtCod_Sel ;
      AV78Tforacacopy1wwds_8_tfartdsc = AV51TFArtDsc ;
      AV79Tforacacopy1wwds_9_tfartdsc_sel = AV52TFArtDsc_Sel ;
      AV80Tforacacopy1wwds_10_tfprocod = AV53TFProCod ;
      AV81Tforacacopy1wwds_11_tfprocod_sel = AV54TFProCod_Sel ;
      AV82Tforacacopy1wwds_12_tfprodsc = AV55TFProDsc ;
      AV83Tforacacopy1wwds_13_tfprodsc_sel = AV56TFProDsc_Sel ;
      AV84Tforacacopy1wwds_14_tffascod = AV57TFFasCod ;
      AV85Tforacacopy1wwds_15_tffascod_sel = AV58TFFasCod_Sel ;
      AV86Tforacacopy1wwds_16_tffasdsc = AV59TFFasDsc ;
      AV87Tforacacopy1wwds_17_tffasdsc_sel = AV60TFFasDsc_Sel ;
      AV88Tforacacopy1wwds_18_tffasformul = AV61TFFasForMul ;
      AV89Tforacacopy1wwds_19_tffasformul_sel = AV62TFFasForMul_Sel ;
      AV90Tforacacopy1wwds_20_tfartproulin = AV63TFArtProULin ;
      AV91Tforacacopy1wwds_21_tfartproulin_to = AV64TFArtProULin_To ;
      AV92Tforacacopy1wwds_22_tfartprofac = AV65TFArtProFac ;
      AV93Tforacacopy1wwds_23_tfartprofac_to = AV66TFArtProFac_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV71Tforacacopy1wwds_1_filterfulltext ,
                                           Integer.valueOf(AV72Tforacacopy1wwds_2_tfclicod) ,
                                           Integer.valueOf(AV73Tforacacopy1wwds_3_tfclicod_to) ,
                                           AV75Tforacacopy1wwds_5_tfclinom_sel ,
                                           AV74Tforacacopy1wwds_4_tfclinom ,
                                           AV77Tforacacopy1wwds_7_tfartcod_sel ,
                                           AV76Tforacacopy1wwds_6_tfartcod ,
                                           AV79Tforacacopy1wwds_9_tfartdsc_sel ,
                                           AV78Tforacacopy1wwds_8_tfartdsc ,
                                           AV81Tforacacopy1wwds_11_tfprocod_sel ,
                                           AV80Tforacacopy1wwds_10_tfprocod ,
                                           AV83Tforacacopy1wwds_13_tfprodsc_sel ,
                                           AV82Tforacacopy1wwds_12_tfprodsc ,
                                           AV85Tforacacopy1wwds_15_tffascod_sel ,
                                           AV84Tforacacopy1wwds_14_tffascod ,
                                           AV87Tforacacopy1wwds_17_tffasdsc_sel ,
                                           AV86Tforacacopy1wwds_16_tffasdsc ,
                                           AV89Tforacacopy1wwds_19_tffasformul_sel ,
                                           AV88Tforacacopy1wwds_18_tffasformul ,
                                           Short.valueOf(AV90Tforacacopy1wwds_20_tfartproulin) ,
                                           Short.valueOf(AV91Tforacacopy1wwds_21_tfartproulin_to) ,
                                           AV92Tforacacopy1wwds_22_tfartprofac ,
                                           AV93Tforacacopy1wwds_23_tfartprofac_to ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A65ArtCod ,
                                           A69ArtDsc ,
                                           A758ProCod ,
                                           A759ProDsc ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A4286FasForMul ,
                                           Short.valueOf(A4894ArtProULin) ,
                                           A4896ArtProFac ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV71Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV71Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV71Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV71Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV71Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV71Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV71Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV71Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV71Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV71Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV71Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV74Tforacacopy1wwds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV74Tforacacopy1wwds_4_tfclinom), 30, "%") ;
      lV76Tforacacopy1wwds_6_tfartcod = GXutil.padr( GXutil.rtrim( AV76Tforacacopy1wwds_6_tfartcod), 16, "%") ;
      lV78Tforacacopy1wwds_8_tfartdsc = GXutil.padr( GXutil.rtrim( AV78Tforacacopy1wwds_8_tfartdsc), 26, "%") ;
      lV80Tforacacopy1wwds_10_tfprocod = GXutil.padr( GXutil.rtrim( AV80Tforacacopy1wwds_10_tfprocod), 8, "%") ;
      lV82Tforacacopy1wwds_12_tfprodsc = GXutil.padr( GXutil.rtrim( AV82Tforacacopy1wwds_12_tfprodsc), 40, "%") ;
      lV84Tforacacopy1wwds_14_tffascod = GXutil.padr( GXutil.rtrim( AV84Tforacacopy1wwds_14_tffascod), 8, "%") ;
      lV86Tforacacopy1wwds_16_tffasdsc = GXutil.padr( GXutil.rtrim( AV86Tforacacopy1wwds_16_tffasdsc), 28, "%") ;
      lV88Tforacacopy1wwds_18_tffasformul = GXutil.padr( GXutil.rtrim( AV88Tforacacopy1wwds_18_tffasformul), 1, "%") ;
      /* Using cursor P08GI2 */
      pr_default.execute(0, new Object[] {lV71Tforacacopy1wwds_1_filterfulltext, lV71Tforacacopy1wwds_1_filterfulltext, lV71Tforacacopy1wwds_1_filterfulltext, lV71Tforacacopy1wwds_1_filterfulltext, lV71Tforacacopy1wwds_1_filterfulltext, lV71Tforacacopy1wwds_1_filterfulltext, lV71Tforacacopy1wwds_1_filterfulltext, lV71Tforacacopy1wwds_1_filterfulltext, lV71Tforacacopy1wwds_1_filterfulltext, lV71Tforacacopy1wwds_1_filterfulltext, lV71Tforacacopy1wwds_1_filterfulltext, Integer.valueOf(AV72Tforacacopy1wwds_2_tfclicod), Integer.valueOf(AV73Tforacacopy1wwds_3_tfclicod_to), lV74Tforacacopy1wwds_4_tfclinom, AV75Tforacacopy1wwds_5_tfclinom_sel, lV76Tforacacopy1wwds_6_tfartcod, AV77Tforacacopy1wwds_7_tfartcod_sel, lV78Tforacacopy1wwds_8_tfartdsc, AV79Tforacacopy1wwds_9_tfartdsc_sel, lV80Tforacacopy1wwds_10_tfprocod, AV81Tforacacopy1wwds_11_tfprocod_sel, lV82Tforacacopy1wwds_12_tfprodsc, AV83Tforacacopy1wwds_13_tfprodsc_sel, lV84Tforacacopy1wwds_14_tffascod, AV85Tforacacopy1wwds_15_tffascod_sel, lV86Tforacacopy1wwds_16_tffasdsc, AV87Tforacacopy1wwds_17_tffasdsc_sel, lV88Tforacacopy1wwds_18_tffasformul, AV89Tforacacopy1wwds_19_tffasformul_sel, Short.valueOf(AV90Tforacacopy1wwds_20_tfartproulin), Short.valueOf(AV91Tforacacopy1wwds_21_tfartproulin_to), AV92Tforacacopy1wwds_22_tfartprofac, AV93Tforacacopy1wwds_23_tfartprofac_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P08GI2_A396EmprCod[0] ;
         A4896ArtProFac = P08GI2_A4896ArtProFac[0] ;
         n4896ArtProFac = P08GI2_n4896ArtProFac[0] ;
         A4894ArtProULin = P08GI2_A4894ArtProULin[0] ;
         n4894ArtProULin = P08GI2_n4894ArtProULin[0] ;
         A4286FasForMul = P08GI2_A4286FasForMul[0] ;
         n4286FasForMul = P08GI2_n4286FasForMul[0] ;
         A460FasDsc = P08GI2_A460FasDsc[0] ;
         A457FasCod = P08GI2_A457FasCod[0] ;
         A759ProDsc = P08GI2_A759ProDsc[0] ;
         A758ProCod = P08GI2_A758ProCod[0] ;
         A69ArtDsc = P08GI2_A69ArtDsc[0] ;
         n69ArtDsc = P08GI2_n69ArtDsc[0] ;
         A65ArtCod = P08GI2_A65ArtCod[0] ;
         A279CliNom = P08GI2_A279CliNom[0] ;
         A252CliCod = P08GI2_A252CliCod[0] ;
         A4286FasForMul = P08GI2_A4286FasForMul[0] ;
         n4286FasForMul = P08GI2_n4286FasForMul[0] ;
         A460FasDsc = P08GI2_A460FasDsc[0] ;
         A759ProDsc = P08GI2_A759ProDsc[0] ;
         A279CliNom = P08GI2_A279CliNom[0] ;
         A69ArtDsc = P08GI2_A69ArtDsc[0] ;
         n69ArtDsc = P08GI2_n69ArtDsc[0] ;
         AV14TextFileLine = "" ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S162 ();
         if ( returnInSub )
         {
            pr_default.close(0);
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
            AV14TextFileLine += GXutil.str( A252CliCod, 6, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A279CliNom, ";", ","), GXv_char3) ;
            tforacacopy1wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A65ArtCod, ";", ","), GXv_char3) ;
            tforacacopy1wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A69ArtDsc, ";", ","), GXv_char3) ;
            tforacacopy1wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A758ProCod, ";", ","), GXv_char3) ;
            tforacacopy1wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A759ProDsc, ";", ","), GXv_char3) ;
            tforacacopy1wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A457FasCod, ";", ","), GXv_char3) ;
            tforacacopy1wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A460FasDsc, ";", ","), GXv_char3) ;
            tforacacopy1wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A4286FasForMul, ";", ","), GXv_char3) ;
            tforacacopy1wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A4894ArtProULin, 4, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A4896ArtProFac, 8, 2) ;
         }
         /* Execute user subroutine: 'AFTERWRITELINE' */
         S172 ();
         if ( returnInSub )
         {
            pr_default.close(0);
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=TFORACACopy1WWExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ArtCod", "", "Cód. Art.", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ArtDsc", "", "Artículo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ProCod", "", "Cód. Proc.", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ProDsc", "", "Proceso", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "FasCod", "", "Codigo Fase", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "FasDsc", "", "Descripcion de Fase", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "FasForMul", "", "Formula?", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ArtProULin", "", "Ultima Línea", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ArtProFac", "", "Factor", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "TFORACACopy1WWColumnsSelector", GXv_char3) ;
      tforacacopy1wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("TFORACACopy1WWGridState"), "") == 0 )
      {
         AV43GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TFORACACopy1WWGridState"), null, null);
      }
      else
      {
         AV43GridState.fromxml(AV19Session.getValue("TFORACACopy1WWGridState"), null, null);
      }
      AV28OrderedBy = AV43GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV43GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV94GXV1 = 1 ;
      while ( AV94GXV1 <= AV43GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV44GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV43GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV94GXV1));
         if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV67FilterFullText = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV45TFCliCod = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV46TFCliCod_To = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV47TFCliNom = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV48TFCliNom_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTCOD") == 0 )
         {
            AV49TFArtCod = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTCOD_SEL") == 0 )
         {
            AV50TFArtCod_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTDSC") == 0 )
         {
            AV51TFArtDsc = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTDSC_SEL") == 0 )
         {
            AV52TFArtDsc_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCOD") == 0 )
         {
            AV53TFProCod = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCOD_SEL") == 0 )
         {
            AV54TFProCod_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRODSC") == 0 )
         {
            AV55TFProDsc = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRODSC_SEL") == 0 )
         {
            AV56TFProDsc_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD") == 0 )
         {
            AV57TFFasCod = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD_SEL") == 0 )
         {
            AV58TFFasCod_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC") == 0 )
         {
            AV59TFFasDsc = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC_SEL") == 0 )
         {
            AV60TFFasDsc_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASFORMUL") == 0 )
         {
            AV61TFFasForMul = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASFORMUL_SEL") == 0 )
         {
            AV62TFFasForMul_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTPROULIN") == 0 )
         {
            AV63TFArtProULin = (short)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV64TFArtProULin_To = (short)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTPROFAC") == 0 )
         {
            AV65TFArtProFac = CommonUtil.decimalVal( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV66TFArtProFac_To = CommonUtil.decimalVal( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
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
      A279CliNom = "" ;
      A65ArtCod = "" ;
      A69ArtDsc = "" ;
      A758ProCod = "" ;
      A759ProDsc = "" ;
      A457FasCod = "" ;
      A460FasDsc = "" ;
      A4286FasForMul = "" ;
      A4896ArtProFac = DecimalUtil.ZERO ;
      AV71Tforacacopy1wwds_1_filterfulltext = "" ;
      AV67FilterFullText = "" ;
      AV74Tforacacopy1wwds_4_tfclinom = "" ;
      AV47TFCliNom = "" ;
      AV75Tforacacopy1wwds_5_tfclinom_sel = "" ;
      AV48TFCliNom_Sel = "" ;
      AV76Tforacacopy1wwds_6_tfartcod = "" ;
      AV49TFArtCod = "" ;
      AV77Tforacacopy1wwds_7_tfartcod_sel = "" ;
      AV50TFArtCod_Sel = "" ;
      AV78Tforacacopy1wwds_8_tfartdsc = "" ;
      AV51TFArtDsc = "" ;
      AV79Tforacacopy1wwds_9_tfartdsc_sel = "" ;
      AV52TFArtDsc_Sel = "" ;
      AV80Tforacacopy1wwds_10_tfprocod = "" ;
      AV53TFProCod = "" ;
      AV81Tforacacopy1wwds_11_tfprocod_sel = "" ;
      AV54TFProCod_Sel = "" ;
      AV82Tforacacopy1wwds_12_tfprodsc = "" ;
      AV55TFProDsc = "" ;
      AV83Tforacacopy1wwds_13_tfprodsc_sel = "" ;
      AV56TFProDsc_Sel = "" ;
      AV84Tforacacopy1wwds_14_tffascod = "" ;
      AV57TFFasCod = "" ;
      AV85Tforacacopy1wwds_15_tffascod_sel = "" ;
      AV58TFFasCod_Sel = "" ;
      AV86Tforacacopy1wwds_16_tffasdsc = "" ;
      AV59TFFasDsc = "" ;
      AV87Tforacacopy1wwds_17_tffasdsc_sel = "" ;
      AV60TFFasDsc_Sel = "" ;
      AV88Tforacacopy1wwds_18_tffasformul = "" ;
      AV61TFFasForMul = "" ;
      AV89Tforacacopy1wwds_19_tffasformul_sel = "" ;
      AV62TFFasForMul_Sel = "" ;
      AV92Tforacacopy1wwds_22_tfartprofac = DecimalUtil.ZERO ;
      AV65TFArtProFac = DecimalUtil.ZERO ;
      AV93Tforacacopy1wwds_23_tfartprofac_to = DecimalUtil.ZERO ;
      AV66TFArtProFac_To = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV71Tforacacopy1wwds_1_filterfulltext = "" ;
      lV74Tforacacopy1wwds_4_tfclinom = "" ;
      lV76Tforacacopy1wwds_6_tfartcod = "" ;
      lV78Tforacacopy1wwds_8_tfartdsc = "" ;
      lV80Tforacacopy1wwds_10_tfprocod = "" ;
      lV82Tforacacopy1wwds_12_tfprodsc = "" ;
      lV84Tforacacopy1wwds_14_tffascod = "" ;
      lV86Tforacacopy1wwds_16_tffasdsc = "" ;
      lV88Tforacacopy1wwds_18_tffasformul = "" ;
      P08GI2_A396EmprCod = new String[] {""} ;
      P08GI2_A4896ArtProFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08GI2_n4896ArtProFac = new boolean[] {false} ;
      P08GI2_A4894ArtProULin = new short[1] ;
      P08GI2_n4894ArtProULin = new boolean[] {false} ;
      P08GI2_A4286FasForMul = new String[] {""} ;
      P08GI2_n4286FasForMul = new boolean[] {false} ;
      P08GI2_A460FasDsc = new String[] {""} ;
      P08GI2_A457FasCod = new String[] {""} ;
      P08GI2_A759ProDsc = new String[] {""} ;
      P08GI2_A758ProCod = new String[] {""} ;
      P08GI2_A69ArtDsc = new String[] {""} ;
      P08GI2_n69ArtDsc = new boolean[] {false} ;
      P08GI2_A65ArtCod = new String[] {""} ;
      P08GI2_A279CliNom = new String[] {""} ;
      P08GI2_A252CliCod = new int[1] ;
      A396EmprCod = "" ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector5 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV43GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV44GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tforacacopy1wwexportcsv__default(),
         new Object[] {
             new Object[] {
            P08GI2_A396EmprCod, P08GI2_A4896ArtProFac, P08GI2_n4896ArtProFac, P08GI2_A4894ArtProULin, P08GI2_n4894ArtProULin, P08GI2_A4286FasForMul, P08GI2_n4286FasForMul, P08GI2_A460FasDsc, P08GI2_A457FasCod, P08GI2_A759ProDsc,
            P08GI2_A758ProCod, P08GI2_A69ArtDsc, P08GI2_n69ArtDsc, P08GI2_A65ArtCod, P08GI2_A279CliNom, P08GI2_A252CliCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short A4894ArtProULin ;
   private short AV90Tforacacopy1wwds_20_tfartproulin ;
   private short AV63TFArtProULin ;
   private short AV91Tforacacopy1wwds_21_tfartproulin_to ;
   private short AV64TFArtProULin_To ;
   private short AV28OrderedBy ;
   private short Gx_err ;
   private int AV13Random ;
   private int A252CliCod ;
   private int AV72Tforacacopy1wwds_2_tfclicod ;
   private int AV45TFCliCod ;
   private int AV73Tforacacopy1wwds_3_tfclicod_to ;
   private int AV46TFCliCod_To ;
   private int AV94GXV1 ;
   private java.math.BigDecimal A4896ArtProFac ;
   private java.math.BigDecimal AV92Tforacacopy1wwds_22_tfartprofac ;
   private java.math.BigDecimal AV65TFArtProFac ;
   private java.math.BigDecimal AV93Tforacacopy1wwds_23_tfartprofac_to ;
   private java.math.BigDecimal AV66TFArtProFac_To ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A279CliNom ;
   private String A65ArtCod ;
   private String A69ArtDsc ;
   private String A758ProCod ;
   private String A759ProDsc ;
   private String A457FasCod ;
   private String A460FasDsc ;
   private String A4286FasForMul ;
   private String AV74Tforacacopy1wwds_4_tfclinom ;
   private String AV47TFCliNom ;
   private String AV75Tforacacopy1wwds_5_tfclinom_sel ;
   private String AV48TFCliNom_Sel ;
   private String AV76Tforacacopy1wwds_6_tfartcod ;
   private String AV49TFArtCod ;
   private String AV77Tforacacopy1wwds_7_tfartcod_sel ;
   private String AV50TFArtCod_Sel ;
   private String AV78Tforacacopy1wwds_8_tfartdsc ;
   private String AV51TFArtDsc ;
   private String AV79Tforacacopy1wwds_9_tfartdsc_sel ;
   private String AV52TFArtDsc_Sel ;
   private String AV80Tforacacopy1wwds_10_tfprocod ;
   private String AV53TFProCod ;
   private String AV81Tforacacopy1wwds_11_tfprocod_sel ;
   private String AV54TFProCod_Sel ;
   private String AV82Tforacacopy1wwds_12_tfprodsc ;
   private String AV55TFProDsc ;
   private String AV83Tforacacopy1wwds_13_tfprodsc_sel ;
   private String AV56TFProDsc_Sel ;
   private String AV84Tforacacopy1wwds_14_tffascod ;
   private String AV57TFFasCod ;
   private String AV85Tforacacopy1wwds_15_tffascod_sel ;
   private String AV58TFFasCod_Sel ;
   private String AV86Tforacacopy1wwds_16_tffasdsc ;
   private String AV59TFFasDsc ;
   private String AV87Tforacacopy1wwds_17_tffasdsc_sel ;
   private String AV60TFFasDsc_Sel ;
   private String AV88Tforacacopy1wwds_18_tffasformul ;
   private String AV61TFFasForMul ;
   private String AV89Tforacacopy1wwds_19_tffasformul_sel ;
   private String AV62TFFasForMul_Sel ;
   private String scmdbuf ;
   private String lV74Tforacacopy1wwds_4_tfclinom ;
   private String lV76Tforacacopy1wwds_6_tfartcod ;
   private String lV78Tforacacopy1wwds_8_tfartdsc ;
   private String lV80Tforacacopy1wwds_10_tfprocod ;
   private String lV82Tforacacopy1wwds_12_tfprodsc ;
   private String lV84Tforacacopy1wwds_14_tffascod ;
   private String lV86Tforacacopy1wwds_16_tffasdsc ;
   private String lV88Tforacacopy1wwds_18_tffasformul ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean n4896ArtProFac ;
   private boolean n4894ArtProULin ;
   private boolean n4286FasForMul ;
   private boolean n69ArtDsc ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV71Tforacacopy1wwds_1_filterfulltext ;
   private String AV67FilterFullText ;
   private String lV71Tforacacopy1wwds_1_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private String[] P08GI2_A396EmprCod ;
   private java.math.BigDecimal[] P08GI2_A4896ArtProFac ;
   private boolean[] P08GI2_n4896ArtProFac ;
   private short[] P08GI2_A4894ArtProULin ;
   private boolean[] P08GI2_n4894ArtProULin ;
   private String[] P08GI2_A4286FasForMul ;
   private boolean[] P08GI2_n4286FasForMul ;
   private String[] P08GI2_A460FasDsc ;
   private String[] P08GI2_A457FasCod ;
   private String[] P08GI2_A759ProDsc ;
   private String[] P08GI2_A758ProCod ;
   private String[] P08GI2_A69ArtDsc ;
   private boolean[] P08GI2_n69ArtDsc ;
   private String[] P08GI2_A65ArtCod ;
   private String[] P08GI2_A279CliNom ;
   private int[] P08GI2_A252CliCod ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV43GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV44GridStateFilterValue ;
}

final  class tforacacopy1wwexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08GI2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV71Tforacacopy1wwds_1_filterfulltext ,
                                          int AV72Tforacacopy1wwds_2_tfclicod ,
                                          int AV73Tforacacopy1wwds_3_tfclicod_to ,
                                          String AV75Tforacacopy1wwds_5_tfclinom_sel ,
                                          String AV74Tforacacopy1wwds_4_tfclinom ,
                                          String AV77Tforacacopy1wwds_7_tfartcod_sel ,
                                          String AV76Tforacacopy1wwds_6_tfartcod ,
                                          String AV79Tforacacopy1wwds_9_tfartdsc_sel ,
                                          String AV78Tforacacopy1wwds_8_tfartdsc ,
                                          String AV81Tforacacopy1wwds_11_tfprocod_sel ,
                                          String AV80Tforacacopy1wwds_10_tfprocod ,
                                          String AV83Tforacacopy1wwds_13_tfprodsc_sel ,
                                          String AV82Tforacacopy1wwds_12_tfprodsc ,
                                          String AV85Tforacacopy1wwds_15_tffascod_sel ,
                                          String AV84Tforacacopy1wwds_14_tffascod ,
                                          String AV87Tforacacopy1wwds_17_tffasdsc_sel ,
                                          String AV86Tforacacopy1wwds_16_tffasdsc ,
                                          String AV89Tforacacopy1wwds_19_tffasformul_sel ,
                                          String AV88Tforacacopy1wwds_18_tffasformul ,
                                          short AV90Tforacacopy1wwds_20_tfartproulin ,
                                          short AV91Tforacacopy1wwds_21_tfartproulin_to ,
                                          java.math.BigDecimal AV92Tforacacopy1wwds_22_tfartprofac ,
                                          java.math.BigDecimal AV93Tforacacopy1wwds_23_tfartprofac_to ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A65ArtCod ,
                                          String A69ArtDsc ,
                                          String A758ProCod ,
                                          String A759ProDsc ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String A4286FasForMul ,
                                          short A4894ArtProULin ,
                                          java.math.BigDecimal A4896ArtProFac ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[33];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ArtProFac, T1.ArtProULin, T2.FasForMul, T2.FasDsc, T1.FasCod, T3.ProDsc, T1.ProCod, T5.ArtDsc, T1.ArtCod, T4.CliNom, T1.CliCod FROM ((((TXPSERPAU" ;
      scmdbuf += " T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) INNER JOIN TXPPROCES T3 ON T3.EmprCod = T1.EmprCod AND T3.ProCod = T1.ProCod) INNER" ;
      scmdbuf += " JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T1.CliCod) INNER JOIN TXPARTICU T5 ON T5.EmprCod = T1.EmprCod AND T5.CliCod = T1.CliCod AND T5.ArtCod" ;
      scmdbuf += " = T1.ArtCod)" ;
      if ( ! (GXutil.strcmp("", AV71Tforacacopy1wwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T4.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ArtCod) like '%' || UPPER(?)) or ( UPPER(T5.ArtDsc) like '%' || UPPER(?)) or ( UPPER(T1.ProCod) like '%' || UPPER(?)) or ( UPPER(T3.ProDsc) like '%' || UPPER(?)) or ( UPPER(T1.FasCod) like '%' || UPPER(?)) or ( UPPER(T2.FasDsc) like '%' || UPPER(?)) or ( UPPER(T2.FasForMul) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ArtProULin,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.ArtProFac,'99990.99'), 2) like '%' || ?))");
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
      }
      if ( ! (0==AV72Tforacacopy1wwds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (0==AV73Tforacacopy1wwds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Tforacacopy1wwds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV74Tforacacopy1wwds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Tforacacopy1wwds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Tforacacopy1wwds_7_tfartcod_sel)==0) && ( ! (GXutil.strcmp("", AV76Tforacacopy1wwds_6_tfartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Tforacacopy1wwds_7_tfartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtCod = ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Tforacacopy1wwds_9_tfartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV78Tforacacopy1wwds_8_tfartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Tforacacopy1wwds_9_tfartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T5.ArtDsc = ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Tforacacopy1wwds_11_tfprocod_sel)==0) && ( ! (GXutil.strcmp("", AV80Tforacacopy1wwds_10_tfprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Tforacacopy1wwds_11_tfprocod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProCod = ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Tforacacopy1wwds_13_tfprodsc_sel)==0) && ( ! (GXutil.strcmp("", AV82Tforacacopy1wwds_12_tfprodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ProDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Tforacacopy1wwds_13_tfprodsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ProDsc = ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Tforacacopy1wwds_15_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV84Tforacacopy1wwds_14_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Tforacacopy1wwds_15_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Tforacacopy1wwds_17_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV86Tforacacopy1wwds_16_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Tforacacopy1wwds_17_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Tforacacopy1wwds_19_tffasformul_sel)==0) && ( ! (GXutil.strcmp("", AV88Tforacacopy1wwds_18_tffasformul)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasForMul) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Tforacacopy1wwds_19_tffasformul_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasForMul = ?)");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( ! (0==AV90Tforacacopy1wwds_20_tfartproulin) )
      {
         addWhere(sWhereString, "(T1.ArtProULin >= ?)");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      if ( ! (0==AV91Tforacacopy1wwds_21_tfartproulin_to) )
      {
         addWhere(sWhereString, "(T1.ArtProULin <= ?)");
      }
      else
      {
         GXv_int6[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV92Tforacacopy1wwds_22_tfartprofac)==0) )
      {
         addWhere(sWhereString, "(T1.ArtProFac >= ?)");
      }
      else
      {
         GXv_int6[31] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV93Tforacacopy1wwds_23_tfartprofac_to)==0) )
      {
         addWhere(sWhereString, "(T1.ArtProFac <= ?)");
      }
      else
      {
         GXv_int6[32] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ArtProULin" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ArtProULin DESC" ;
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
         scmdbuf += " ORDER BY T4.CliNom" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.CliNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ArtCod" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ArtCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T5.ArtDsc" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T5.ArtDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ProCod" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ProCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.ProDsc" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.ProDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FasCod" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FasCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.FasDsc" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.FasDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.FasForMul" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.FasForMul DESC" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ArtProFac" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ArtProFac DESC" ;
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
                  return conditional_P08GI2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).shortValue() , (java.math.BigDecimal)dynConstraints[33] , ((Number) dynConstraints[34]).shortValue() , ((Boolean) dynConstraints[35]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08GI2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 28);
               ((String[]) buf[8])[0] = rslt.getString(6, 8);
               ((String[]) buf[9])[0] = rslt.getString(7, 40);
               ((String[]) buf[10])[0] = rslt.getString(8, 8);
               ((String[]) buf[11])[0] = rslt.getString(9, 26);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(10, 16);
               ((String[]) buf[14])[0] = rslt.getString(11, 30);
               ((int[]) buf[15])[0] = rslt.getInt(12);
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
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 8);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 8);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 40);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 40);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 8);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 8);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 28);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 28);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[62]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[63]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[64], 2);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[65], 2);
               }
               return;
      }
   }

}

