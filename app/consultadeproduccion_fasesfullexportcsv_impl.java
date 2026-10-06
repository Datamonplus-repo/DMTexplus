package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class consultadeproduccion_fasesfullexportcsv_impl extends GXWebProcedure
{
   public consultadeproduccion_fasesfullexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV59Var_Hdr = AV60WebSession.getValue("&Var_Hdr") ;
      AV55EmprCod = GXutil.substring( AV59Var_Hdr, 1, 3) ;
      AV56BarCod = (int)(GXutil.lval( GXutil.substring( AV59Var_Hdr, 4, 8))) ;
      AV57BarCodReo = (byte)(GXutil.lval( GXutil.substring( AV59Var_Hdr, 12, 1))) ;
      AV58BarCodPar = GXutil.substring( AV59Var_Hdr, 13, 1) ;
      AV60WebSession.remove("&Var_Hdr");
      if ( 1 == 0 )
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
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      GXv_SdtWWPContext1[0] = AV9WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext1) ;
      AV9WWPContext = GXv_SdtWWPContext1[0] ;
      /* Execute user subroutine: 'CARGADATOSFILTROS' */
      S201 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
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
      /* Execute user subroutine: 'TITULODATOSFILTROS' */
      S211 ();
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
      AV11Filename = "./PrivateTempStorage/" + "ConsultadeProduccion_FasesFullExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("ConsultadeProduccion_FasesFullColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("ConsultadeProduccion_FasesFullColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Orden", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Codigo Fase", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion de Fase", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Maquina", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion ", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Inicio", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fin", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "HhMm", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "E", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Unidades", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Metros", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Operario", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "PP", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV75Consultadeproduccion_fasesfullds_1_emprcod = AV55EmprCod ;
      AV76Consultadeproduccion_fasesfullds_2_barcod = AV56BarCod ;
      AV77Consultadeproduccion_fasesfullds_3_barcodreo = AV57BarCodReo ;
      AV78Consultadeproduccion_fasesfullds_4_barcodpar = AV58BarCodPar ;
      AV79Consultadeproduccion_fasesfullds_5_tfbarordlin = AV35TFBarOrdLin ;
      AV80Consultadeproduccion_fasesfullds_6_tfbarordlin_to = AV36TFBarOrdLin_To ;
      AV81Consultadeproduccion_fasesfullds_7_tffascod = AV37TFFasCod ;
      AV82Consultadeproduccion_fasesfullds_8_tffascod_sel = AV38TFFasCod_Sel ;
      AV83Consultadeproduccion_fasesfullds_9_tffasdsc = AV39TFFasDsc ;
      AV84Consultadeproduccion_fasesfullds_10_tffasdsc_sel = AV40TFFasDsc_Sel ;
      AV85Consultadeproduccion_fasesfullds_11_tfmaqcodbis = AV41TFMaqCodBis ;
      AV86Consultadeproduccion_fasesfullds_12_tfmaqcodbis_sel = AV42TFMaqCodBis_Sel ;
      AV87Consultadeproduccion_fasesfullds_13_tfbarfasdti = AV43TFBarFasDTI ;
      AV88Consultadeproduccion_fasesfullds_14_tfbartierea = AV47TFBarTieRea ;
      AV89Consultadeproduccion_fasesfullds_15_tfbartierea_to = AV48TFBarTieRea_To ;
      AV90Consultadeproduccion_fasesfullds_16_tfbarfasest_sels = AV50TFBarFasEst_Sels ;
      AV91Consultadeproduccion_fasesfullds_17_tfbarfaskgm = AV51TFBarFasKgm ;
      AV92Consultadeproduccion_fasesfullds_18_tfbarfaskgm_to = AV52TFBarFasKgm_To ;
      AV93Consultadeproduccion_fasesfullds_19_tfbarfasmtr = AV53TFBarFasMtr ;
      AV94Consultadeproduccion_fasesfullds_20_tfbarfasmtr_to = AV54TFBarFasMtr_To ;
      AV95Consultadeproduccion_fasesfullds_21_tfbarfaspri = AV64TFBarFasPri ;
      AV96Consultadeproduccion_fasesfullds_22_tfbarfaspri_to = AV65TFBarFasPri_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(A153BarFasEst) ,
                                           AV90Consultadeproduccion_fasesfullds_16_tfbarfasest_sels ,
                                           Short.valueOf(AV79Consultadeproduccion_fasesfullds_5_tfbarordlin) ,
                                           Short.valueOf(AV80Consultadeproduccion_fasesfullds_6_tfbarordlin_to) ,
                                           AV82Consultadeproduccion_fasesfullds_8_tffascod_sel ,
                                           AV81Consultadeproduccion_fasesfullds_7_tffascod ,
                                           AV84Consultadeproduccion_fasesfullds_10_tffasdsc_sel ,
                                           AV83Consultadeproduccion_fasesfullds_9_tffasdsc ,
                                           AV86Consultadeproduccion_fasesfullds_12_tfmaqcodbis_sel ,
                                           AV85Consultadeproduccion_fasesfullds_11_tfmaqcodbis ,
                                           AV87Consultadeproduccion_fasesfullds_13_tfbarfasdti ,
                                           AV88Consultadeproduccion_fasesfullds_14_tfbartierea ,
                                           AV89Consultadeproduccion_fasesfullds_15_tfbartierea_to ,
                                           Integer.valueOf(AV90Consultadeproduccion_fasesfullds_16_tfbarfasest_sels.size()) ,
                                           AV91Consultadeproduccion_fasesfullds_17_tfbarfaskgm ,
                                           AV92Consultadeproduccion_fasesfullds_18_tfbarfaskgm_to ,
                                           AV93Consultadeproduccion_fasesfullds_19_tfbarfasmtr ,
                                           AV94Consultadeproduccion_fasesfullds_20_tfbarfasmtr_to ,
                                           Byte.valueOf(AV95Consultadeproduccion_fasesfullds_21_tfbarfaspri) ,
                                           Byte.valueOf(AV96Consultadeproduccion_fasesfullds_22_tfbarfaspri_to) ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A603MaqCodBis ,
                                           A4442BarFasDTI ,
                                           A215BarTieRea ,
                                           A3837BarFasKgm ,
                                           A3838BarFasMtr ,
                                           Byte.valueOf(A3836BarFasPri) ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) ,
                                           A396EmprCod ,
                                           AV55EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV56BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV57BarCodReo) ,
                                           A130BarCodPar ,
                                           AV58BarCodPar ,
                                           AV75Consultadeproduccion_fasesfullds_1_emprcod ,
                                           Integer.valueOf(AV76Consultadeproduccion_fasesfullds_2_barcod) ,
                                           Byte.valueOf(AV77Consultadeproduccion_fasesfullds_3_barcodreo) ,
                                           AV78Consultadeproduccion_fasesfullds_4_barcodpar } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                           TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BOOLEAN,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV81Consultadeproduccion_fasesfullds_7_tffascod = GXutil.padr( GXutil.rtrim( AV81Consultadeproduccion_fasesfullds_7_tffascod), 8, "%") ;
      lV83Consultadeproduccion_fasesfullds_9_tffasdsc = GXutil.padr( GXutil.rtrim( AV83Consultadeproduccion_fasesfullds_9_tffasdsc), 28, "%") ;
      lV85Consultadeproduccion_fasesfullds_11_tfmaqcodbis = GXutil.padr( GXutil.rtrim( AV85Consultadeproduccion_fasesfullds_11_tfmaqcodbis), 6, "%") ;
      /* Using cursor P0A402 */
      pr_default.execute(0, new Object[] {AV75Consultadeproduccion_fasesfullds_1_emprcod, Integer.valueOf(AV76Consultadeproduccion_fasesfullds_2_barcod), Byte.valueOf(AV77Consultadeproduccion_fasesfullds_3_barcodreo), AV78Consultadeproduccion_fasesfullds_4_barcodpar, AV55EmprCod, Integer.valueOf(AV56BarCod), Byte.valueOf(AV57BarCodReo), AV58BarCodPar, Short.valueOf(AV79Consultadeproduccion_fasesfullds_5_tfbarordlin), Short.valueOf(AV80Consultadeproduccion_fasesfullds_6_tfbarordlin_to), lV81Consultadeproduccion_fasesfullds_7_tffascod, AV82Consultadeproduccion_fasesfullds_8_tffascod_sel, lV83Consultadeproduccion_fasesfullds_9_tffasdsc, AV84Consultadeproduccion_fasesfullds_10_tffasdsc_sel, lV85Consultadeproduccion_fasesfullds_11_tfmaqcodbis, AV86Consultadeproduccion_fasesfullds_12_tfmaqcodbis_sel, AV87Consultadeproduccion_fasesfullds_13_tfbarfasdti, AV88Consultadeproduccion_fasesfullds_14_tfbartierea, AV89Consultadeproduccion_fasesfullds_15_tfbartierea_to, AV91Consultadeproduccion_fasesfullds_17_tfbarfaskgm, AV92Consultadeproduccion_fasesfullds_18_tfbarfaskgm_to, AV93Consultadeproduccion_fasesfullds_19_tfbarfasmtr, AV94Consultadeproduccion_fasesfullds_20_tfbarfasmtr_to, Byte.valueOf(AV95Consultadeproduccion_fasesfullds_21_tfbarfaspri), Byte.valueOf(AV96Consultadeproduccion_fasesfullds_22_tfbarfaspri_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P0A402_A396EmprCod[0] ;
         A129BarCod = P0A402_A129BarCod[0] ;
         n129BarCod = P0A402_n129BarCod[0] ;
         A132BarCodReo = P0A402_A132BarCodReo[0] ;
         n132BarCodReo = P0A402_n132BarCodReo[0] ;
         A130BarCodPar = P0A402_A130BarCodPar[0] ;
         n130BarCodPar = P0A402_n130BarCodPar[0] ;
         A3836BarFasPri = P0A402_A3836BarFasPri[0] ;
         A3838BarFasMtr = P0A402_A3838BarFasMtr[0] ;
         n3838BarFasMtr = P0A402_n3838BarFasMtr[0] ;
         A3837BarFasKgm = P0A402_A3837BarFasKgm[0] ;
         n3837BarFasKgm = P0A402_n3837BarFasKgm[0] ;
         A153BarFasEst = P0A402_A153BarFasEst[0] ;
         A215BarTieRea = P0A402_A215BarTieRea[0] ;
         A4442BarFasDTI = P0A402_A4442BarFasDTI[0] ;
         n4442BarFasDTI = P0A402_n4442BarFasDTI[0] ;
         A603MaqCodBis = P0A402_A603MaqCodBis[0] ;
         A460FasDsc = P0A402_A460FasDsc[0] ;
         A457FasCod = P0A402_A457FasCod[0] ;
         A194BarOrdLin = P0A402_A194BarOrdLin[0] ;
         A4443BarFasDTF = P0A402_A4443BarFasDTF[0] ;
         n4443BarFasDTF = P0A402_n4443BarFasDTF[0] ;
         A2265BarExt = P0A402_A2265BarExt[0] ;
         n2265BarExt = P0A402_n2265BarExt[0] ;
         A148BarEstReo = P0A402_A148BarEstReo[0] ;
         A6173BarFasSec = P0A402_A6173BarFasSec[0] ;
         n6173BarFasSec = P0A402_n6173BarFasSec[0] ;
         A934BarReoCod = P0A402_A934BarReoCod[0] ;
         A936BarReoReo = P0A402_A936BarReoReo[0] ;
         A935BarReoPar = P0A402_A935BarReoPar[0] ;
         A758ProCod = P0A402_A758ProCod[0] ;
         A2265BarExt = P0A402_A2265BarExt[0] ;
         n2265BarExt = P0A402_n2265BarExt[0] ;
         A148BarEstReo = P0A402_A148BarEstReo[0] ;
         A934BarReoCod = P0A402_A934BarReoCod[0] ;
         A936BarReoReo = P0A402_A936BarReoReo[0] ;
         A935BarReoPar = P0A402_A935BarReoPar[0] ;
         A460FasDsc = P0A402_A460FasDsc[0] ;
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
            AV14TextFileLine += GXutil.str( A194BarOrdLin, 4, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A457FasCod, ";", ","), GXv_char3) ;
            consultadeproduccion_fasesfullexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A460FasDsc, ";", ","), GXv_char3) ;
            consultadeproduccion_fasesfullexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A603MaqCodBis, ";", ","), GXv_char3) ;
            consultadeproduccion_fasesfullexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char2 = AV30MaqDsc ;
            GXv_char3[0] = A396EmprCod ;
            GXv_char4[0] = A603MaqCodBis ;
            GXv_char5[0] = GXt_char2 ;
            new app.pmaqdsc(remoteHandle, context).execute( GXv_char3, GXv_char4, GXv_char5) ;
            consultadeproduccion_fasesfullexportcsv_impl.this.A396EmprCod = GXv_char3[0] ;
            consultadeproduccion_fasesfullexportcsv_impl.this.A603MaqCodBis = GXv_char4[0] ;
            consultadeproduccion_fasesfullexportcsv_impl.this.GXt_char2 = GXv_char5[0] ;
            AV30MaqDsc = GXt_char2 ;
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char5[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV30MaqDsc, ";", ","), GXv_char5) ;
            consultadeproduccion_fasesfullexportcsv_impl.this.GXt_char2 = GXv_char5[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += localUtil.ttoc( A4442BarFasDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV66BarFasDTF = "" ;
            if ( ( ( A153BarFasEst > 0 ) ) || ( ! (0==A3836BarFasPri) ) )
            {
               if ( ! GXutil.dateCompare(GXutil.nullDate(), A4442BarFasDTI) )
               {
                  AV66BarFasDTF = localUtil.ttoc( A4443BarFasDTF, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
               }
            }
            if ( ( ( A153BarFasEst >= 2 ) ) || ( ! (0==A3836BarFasPri) ) )
            {
               AV66BarFasDTF = localUtil.ttoc( A4443BarFasDTF, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
            }
            if ( A2265BarExt != 0 )
            {
               AV97Lexmvh = (byte)(0) ;
               /* Using cursor P0A403 */
               pr_default.execute(1, new Object[] {AV55EmprCod, Integer.valueOf(AV56BarCod), Byte.valueOf(AV57BarCodReo), AV58BarCodPar, AV99Fascod});
               while ( (pr_default.getStatus(1) != 101) )
               {
                  A396EmprCod = P0A403_A396EmprCod[0] ;
                  A129BarCod = P0A403_A129BarCod[0] ;
                  n129BarCod = P0A403_n129BarCod[0] ;
                  A132BarCodReo = P0A403_A132BarCodReo[0] ;
                  n132BarCodReo = P0A403_n132BarCodReo[0] ;
                  A130BarCodPar = P0A403_A130BarCodPar[0] ;
                  n130BarCodPar = P0A403_n130BarCodPar[0] ;
                  A2689ExHdrFas = P0A403_A2689ExHdrFas[0] ;
                  A2697ExHdrFeE = P0A403_A2697ExHdrFeE[0] ;
                  n2697ExHdrFeE = P0A403_n2697ExHdrFeE[0] ;
                  A2700ExHdrFeR = P0A403_A2700ExHdrFeR[0] ;
                  n2700ExHdrFeR = P0A403_n2700ExHdrFeR[0] ;
                  A2248ManCod = P0A403_A2248ManCod[0] ;
                  A2692ExHdrLin = P0A403_A2692ExHdrLin[0] ;
                  AV100Exhdrfee = A2697ExHdrFeE ;
                  AV101Exhdrfer = A2700ExHdrFeR ;
                  AV97Lexmvh = (byte)(1) ;
                  pr_default.readNext(1);
               }
               pr_default.close(1);
               AV66BarFasDTF = (!GXutil.dateCompare(GXutil.nullDate(), A4443BarFasDTF) ? localUtil.ttoc( A4443BarFasDTF, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") : localUtil.dtoc( AV101Exhdrfer, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) ;
            }
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char5[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV66BarFasDTF, ";", ","), GXv_char5) ;
            consultadeproduccion_fasesfullexportcsv_impl.this.GXt_char2 = GXv_char5[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A215BarTieRea, 5, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            if ( A153BarFasEst == 0 )
            {
               AV14TextFileLine += httpContext.getMessage( "Pendiente", "") ;
            }
            else if ( A153BarFasEst == 1 )
            {
               AV14TextFileLine += httpContext.getMessage( "En Proceso", "") ;
            }
            else if ( A153BarFasEst == 2 )
            {
               AV14TextFileLine += httpContext.getMessage( "Finalizada", "") ;
            }
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A3837BarFasKgm, 9, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A3838BarFasMtr, 9, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            if ( ( GXutil.strcmp(A6173BarFasSec, httpContext.getMessage( "OR", "")) == 0 ) && ( A148BarEstReo == 1 ) )
            {
               GXt_char2 = AV31OpeNom ;
               GXv_char5[0] = A396EmprCod ;
               GXv_int6[0] = A934BarReoCod ;
               GXv_int7[0] = A936BarReoReo ;
               GXv_char4[0] = A935BarReoPar ;
               GXv_int8[0] = A194BarOrdLin ;
               GXv_char3[0] = GXt_char2 ;
               new app.pjln001(remoteHandle, context).execute( GXv_char5, GXv_int6, GXv_int7, GXv_char4, GXv_int8, GXv_char3) ;
               consultadeproduccion_fasesfullexportcsv_impl.this.A396EmprCod = GXv_char5[0] ;
               consultadeproduccion_fasesfullexportcsv_impl.this.A934BarReoCod = GXv_int6[0] ;
               consultadeproduccion_fasesfullexportcsv_impl.this.A936BarReoReo = GXv_int7[0] ;
               consultadeproduccion_fasesfullexportcsv_impl.this.A935BarReoPar = GXv_char4[0] ;
               consultadeproduccion_fasesfullexportcsv_impl.this.A194BarOrdLin = GXv_int8[0] ;
               consultadeproduccion_fasesfullexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV31OpeNom = GXt_char2 ;
            }
            else
            {
               GXt_char2 = AV31OpeNom ;
               GXv_char5[0] = A396EmprCod ;
               GXv_int6[0] = A129BarCod ;
               GXv_int7[0] = A132BarCodReo ;
               GXv_char4[0] = A130BarCodPar ;
               GXv_int8[0] = A194BarOrdLin ;
               GXv_char3[0] = GXt_char2 ;
               new app.pjln001(remoteHandle, context).execute( GXv_char5, GXv_int6, GXv_int7, GXv_char4, GXv_int8, GXv_char3) ;
               consultadeproduccion_fasesfullexportcsv_impl.this.A396EmprCod = GXv_char5[0] ;
               consultadeproduccion_fasesfullexportcsv_impl.this.A129BarCod = GXv_int6[0] ;
               consultadeproduccion_fasesfullexportcsv_impl.this.A132BarCodReo = GXv_int7[0] ;
               consultadeproduccion_fasesfullexportcsv_impl.this.A130BarCodPar = GXv_char4[0] ;
               consultadeproduccion_fasesfullexportcsv_impl.this.A194BarOrdLin = GXv_int8[0] ;
               consultadeproduccion_fasesfullexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV31OpeNom = GXt_char2 ;
            }
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char5[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV31OpeNom, ";", ","), GXv_char5) ;
            consultadeproduccion_fasesfullexportcsv_impl.this.GXt_char2 = GXv_char5[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A3836BarFasPri, 2, 0) ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=ConsultadeProduccion_FasesFullExportCSV.csv");
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
      GXv_SdtWWPColumnsSelector9[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarOrdLin", "", "Orden", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "FasCod", "", "Codigo Fase", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "FasDsc", "", "Descripcion de Fase", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "MaqCodBis", "", "Maquina", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "&MaqDsc", "", "Descripcion ", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarFasDTI", "", "Inicio", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "&BarFasDTF", "", "Fin", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarTieRea", "", "HhMm", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarFasEst", "", "E", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarFasKgm", "", "Unidades", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarFasMtr", "", "Metros", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "&OpeNom", "", "Operario", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarFasPri", "", "PP", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char5[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "ConsultadeProduccion_FasesFullColumnsSelector", GXv_char5) ;
      consultadeproduccion_fasesfullexportcsv_impl.this.GXt_char2 = GXv_char5[0] ;
      AV20UserCustomValue = GXt_char2 ;
      if ( ! ( (GXutil.strcmp("", AV20UserCustomValue)==0) ) )
      {
         AV16ColumnsSelectorAux.fromxml(AV20UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector9[0] = AV16ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector10[0] = AV15ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, GXv_SdtWWPColumnsSelector10) ;
         AV16ColumnsSelectorAux = GXv_SdtWWPColumnsSelector9[0] ;
         AV15ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      }
   }

   public void S191( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue("ConsultadeProduccion_FasesFullGridState"), "") == 0 )
      {
         AV33GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "ConsultadeProduccion_FasesFullGridState"), null, null);
      }
      else
      {
         AV33GridState.fromxml(AV19Session.getValue("ConsultadeProduccion_FasesFullGridState"), null, null);
      }
      AV28OrderedBy = AV33GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV33GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV102GXV1 = 1 ;
      while ( AV102GXV1 <= AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV34GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV102GXV1));
         if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARORDLIN") == 0 )
         {
            AV35TFBarOrdLin = (short)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV36TFBarOrdLin_To = (short)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD") == 0 )
         {
            AV37TFFasCod = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD_SEL") == 0 )
         {
            AV38TFFasCod_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC") == 0 )
         {
            AV39TFFasDsc = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC_SEL") == 0 )
         {
            AV40TFFasDsc_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCODBIS") == 0 )
         {
            AV41TFMaqCodBis = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCODBIS_SEL") == 0 )
         {
            AV42TFMaqCodBis_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASDTI") == 0 )
         {
            AV43TFBarFasDTI = localUtil.ctot( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIEREA") == 0 )
         {
            AV47TFBarTieRea = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV48TFBarTieRea_To = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASEST_SEL") == 0 )
         {
            AV49TFBarFasEst_SelsJson = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV50TFBarFasEst_Sels.fromJSonString(AV49TFBarFasEst_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASKGM") == 0 )
         {
            AV51TFBarFasKgm = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV52TFBarFasKgm_To = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASMTR") == 0 )
         {
            AV53TFBarFasMtr = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV54TFBarFasMtr_To = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASPRI") == 0 )
         {
            AV64TFBarFasPri = (byte)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV65TFBarFasPri_To = (byte)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV55EmprCod = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOD") == 0 )
         {
            AV56BarCod = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODREO") == 0 )
         {
            AV57BarCodReo = (byte)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODPAR") == 0 )
         {
            AV58BarCodPar = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV102GXV1 = (int)(AV102GXV1+1) ;
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

   public void S201( )
   {
      /* 'CARGADATOSFILTROS' Routine */
      returnInSub = false ;
      GXt_char2 = AV68Station ;
      GXv_char5[0] = GXt_char2 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char5) ;
      consultadeproduccion_fasesfullexportcsv_impl.this.GXt_char2 = GXv_char5[0] ;
      AV68Station = GXt_char2 ;
      GXv_char5[0] = AV55EmprCod ;
      GXv_char4[0] = AV69EmprNom ;
      GXv_char3[0] = AV70UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV68Station, GXv_char5, GXv_char4, GXv_char3) ;
      consultadeproduccion_fasesfullexportcsv_impl.this.AV55EmprCod = GXv_char5[0] ;
      consultadeproduccion_fasesfullexportcsv_impl.this.AV69EmprNom = GXv_char4[0] ;
      consultadeproduccion_fasesfullexportcsv_impl.this.AV70UsurCod = GXv_char3[0] ;
   }

   public void S211( )
   {
      /* 'TITULODATOSFILTROS' Routine */
      returnInSub = false ;
      AV14TextFileLine += AV69EmprNom + " " + "(" + AV103Pgmdesc + ")" ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(AV14TextFileLine);
         AV10TextFile.writeLine(" ");
      }
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
      AV59Var_Hdr = "" ;
      AV60WebSession = httpContext.getWebSession();
      AV55EmprCod = "" ;
      AV58BarCodPar = "" ;
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV11Filename = "" ;
      AV10TextFile = new com.genexus.util.GXFile();
      AV14TextFileLine = "" ;
      AV19Session = httpContext.getWebSession();
      AV18ColumnsSelectorXML = "" ;
      AV15ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      A457FasCod = "" ;
      A460FasDsc = "" ;
      A603MaqCodBis = "" ;
      A396EmprCod = "" ;
      A4442BarFasDTI = GXutil.resetTime( GXutil.nullDate() );
      A4443BarFasDTF = GXutil.resetTime( GXutil.nullDate() );
      A215BarTieRea = DecimalUtil.ZERO ;
      A3837BarFasKgm = DecimalUtil.ZERO ;
      A3838BarFasMtr = DecimalUtil.ZERO ;
      A6173BarFasSec = "" ;
      A935BarReoPar = "" ;
      A130BarCodPar = "" ;
      AV75Consultadeproduccion_fasesfullds_1_emprcod = "" ;
      AV78Consultadeproduccion_fasesfullds_4_barcodpar = "" ;
      AV81Consultadeproduccion_fasesfullds_7_tffascod = "" ;
      AV37TFFasCod = "" ;
      AV82Consultadeproduccion_fasesfullds_8_tffascod_sel = "" ;
      AV38TFFasCod_Sel = "" ;
      AV83Consultadeproduccion_fasesfullds_9_tffasdsc = "" ;
      AV39TFFasDsc = "" ;
      AV84Consultadeproduccion_fasesfullds_10_tffasdsc_sel = "" ;
      AV40TFFasDsc_Sel = "" ;
      AV85Consultadeproduccion_fasesfullds_11_tfmaqcodbis = "" ;
      AV41TFMaqCodBis = "" ;
      AV86Consultadeproduccion_fasesfullds_12_tfmaqcodbis_sel = "" ;
      AV42TFMaqCodBis_Sel = "" ;
      AV87Consultadeproduccion_fasesfullds_13_tfbarfasdti = GXutil.resetTime( GXutil.nullDate() );
      AV43TFBarFasDTI = GXutil.resetTime( GXutil.nullDate() );
      AV88Consultadeproduccion_fasesfullds_14_tfbartierea = DecimalUtil.ZERO ;
      AV47TFBarTieRea = DecimalUtil.ZERO ;
      AV89Consultadeproduccion_fasesfullds_15_tfbartierea_to = DecimalUtil.ZERO ;
      AV48TFBarTieRea_To = DecimalUtil.ZERO ;
      AV90Consultadeproduccion_fasesfullds_16_tfbarfasest_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV50TFBarFasEst_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV91Consultadeproduccion_fasesfullds_17_tfbarfaskgm = DecimalUtil.ZERO ;
      AV51TFBarFasKgm = DecimalUtil.ZERO ;
      AV92Consultadeproduccion_fasesfullds_18_tfbarfaskgm_to = DecimalUtil.ZERO ;
      AV52TFBarFasKgm_To = DecimalUtil.ZERO ;
      AV93Consultadeproduccion_fasesfullds_19_tfbarfasmtr = DecimalUtil.ZERO ;
      AV53TFBarFasMtr = DecimalUtil.ZERO ;
      AV94Consultadeproduccion_fasesfullds_20_tfbarfasmtr_to = DecimalUtil.ZERO ;
      AV54TFBarFasMtr_To = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV81Consultadeproduccion_fasesfullds_7_tffascod = "" ;
      lV83Consultadeproduccion_fasesfullds_9_tffasdsc = "" ;
      lV85Consultadeproduccion_fasesfullds_11_tfmaqcodbis = "" ;
      P0A402_A396EmprCod = new String[] {""} ;
      P0A402_A129BarCod = new int[1] ;
      P0A402_n129BarCod = new boolean[] {false} ;
      P0A402_A132BarCodReo = new byte[1] ;
      P0A402_n132BarCodReo = new boolean[] {false} ;
      P0A402_A130BarCodPar = new String[] {""} ;
      P0A402_n130BarCodPar = new boolean[] {false} ;
      P0A402_A3836BarFasPri = new byte[1] ;
      P0A402_A3838BarFasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A402_n3838BarFasMtr = new boolean[] {false} ;
      P0A402_A3837BarFasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A402_n3837BarFasKgm = new boolean[] {false} ;
      P0A402_A153BarFasEst = new byte[1] ;
      P0A402_A215BarTieRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A402_A4442BarFasDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P0A402_n4442BarFasDTI = new boolean[] {false} ;
      P0A402_A603MaqCodBis = new String[] {""} ;
      P0A402_A460FasDsc = new String[] {""} ;
      P0A402_A457FasCod = new String[] {""} ;
      P0A402_A194BarOrdLin = new short[1] ;
      P0A402_A4443BarFasDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P0A402_n4443BarFasDTF = new boolean[] {false} ;
      P0A402_A2265BarExt = new byte[1] ;
      P0A402_n2265BarExt = new boolean[] {false} ;
      P0A402_A148BarEstReo = new byte[1] ;
      P0A402_A6173BarFasSec = new String[] {""} ;
      P0A402_n6173BarFasSec = new boolean[] {false} ;
      P0A402_A934BarReoCod = new int[1] ;
      P0A402_A936BarReoReo = new byte[1] ;
      P0A402_A935BarReoPar = new String[] {""} ;
      P0A402_A758ProCod = new String[] {""} ;
      A758ProCod = "" ;
      AV30MaqDsc = "" ;
      AV66BarFasDTF = "" ;
      AV99Fascod = "" ;
      P0A403_A396EmprCod = new String[] {""} ;
      P0A403_A129BarCod = new int[1] ;
      P0A403_n129BarCod = new boolean[] {false} ;
      P0A403_A132BarCodReo = new byte[1] ;
      P0A403_n132BarCodReo = new boolean[] {false} ;
      P0A403_A130BarCodPar = new String[] {""} ;
      P0A403_n130BarCodPar = new boolean[] {false} ;
      P0A403_A2689ExHdrFas = new String[] {""} ;
      P0A403_A2697ExHdrFeE = new java.util.Date[] {GXutil.nullDate()} ;
      P0A403_n2697ExHdrFeE = new boolean[] {false} ;
      P0A403_A2700ExHdrFeR = new java.util.Date[] {GXutil.nullDate()} ;
      P0A403_n2700ExHdrFeR = new boolean[] {false} ;
      P0A403_A2248ManCod = new short[1] ;
      P0A403_A2692ExHdrLin = new int[1] ;
      A2689ExHdrFas = "" ;
      A2697ExHdrFeE = GXutil.nullDate() ;
      A2700ExHdrFeR = GXutil.nullDate() ;
      AV100Exhdrfee = GXutil.nullDate() ;
      AV101Exhdrfer = GXutil.nullDate() ;
      AV31OpeNom = "" ;
      GXv_int6 = new int[1] ;
      GXv_int7 = new byte[1] ;
      GXv_int8 = new short[1] ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector9 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector10 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV33GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV34GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV49TFBarFasEst_SelsJson = "" ;
      AV68Station = "" ;
      GXt_char2 = "" ;
      GXv_char5 = new String[1] ;
      AV69EmprNom = "" ;
      GXv_char4 = new String[1] ;
      AV70UsurCod = "" ;
      GXv_char3 = new String[1] ;
      AV103Pgmdesc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.consultadeproduccion_fasesfullexportcsv__default(),
         new Object[] {
             new Object[] {
            P0A402_A396EmprCod, P0A402_A129BarCod, P0A402_A132BarCodReo, P0A402_A130BarCodPar, P0A402_A3836BarFasPri, P0A402_A3838BarFasMtr, P0A402_n3838BarFasMtr, P0A402_A3837BarFasKgm, P0A402_n3837BarFasKgm, P0A402_A153BarFasEst,
            P0A402_A215BarTieRea, P0A402_A4442BarFasDTI, P0A402_n4442BarFasDTI, P0A402_A603MaqCodBis, P0A402_A460FasDsc, P0A402_A457FasCod, P0A402_A194BarOrdLin, P0A402_A4443BarFasDTF, P0A402_n4443BarFasDTF, P0A402_A2265BarExt,
            P0A402_n2265BarExt, P0A402_A148BarEstReo, P0A402_A6173BarFasSec, P0A402_n6173BarFasSec, P0A402_A934BarReoCod, P0A402_A936BarReoReo, P0A402_A935BarReoPar, P0A402_A758ProCod
            }
            , new Object[] {
            P0A403_A396EmprCod, P0A403_A129BarCod, P0A403_n129BarCod, P0A403_A132BarCodReo, P0A403_n132BarCodReo, P0A403_A130BarCodPar, P0A403_n130BarCodPar, P0A403_A2689ExHdrFas, P0A403_A2697ExHdrFeE, P0A403_n2697ExHdrFeE,
            P0A403_A2700ExHdrFeR, P0A403_n2700ExHdrFeR, P0A403_A2248ManCod, P0A403_A2692ExHdrLin
            }
         }
      );
      AV103Pgmdesc = httpContext.getMessage( "Consulta de Producción", "") ;
      /* GeneXus formulas. */
      AV103Pgmdesc = httpContext.getMessage( "Consulta de Producción", "") ;
      Gx_err = (short)(0) ;
   }

   private byte AV57BarCodReo ;
   private byte A153BarFasEst ;
   private byte A3836BarFasPri ;
   private byte A2265BarExt ;
   private byte A148BarEstReo ;
   private byte A936BarReoReo ;
   private byte A132BarCodReo ;
   private byte AV77Consultadeproduccion_fasesfullds_3_barcodreo ;
   private byte AV95Consultadeproduccion_fasesfullds_21_tfbarfaspri ;
   private byte AV64TFBarFasPri ;
   private byte AV96Consultadeproduccion_fasesfullds_22_tfbarfaspri_to ;
   private byte AV65TFBarFasPri_To ;
   private byte AV97Lexmvh ;
   private byte GXv_int7[] ;
   private short gxcookieaux ;
   private short A194BarOrdLin ;
   private short AV79Consultadeproduccion_fasesfullds_5_tfbarordlin ;
   private short AV35TFBarOrdLin ;
   private short AV80Consultadeproduccion_fasesfullds_6_tfbarordlin_to ;
   private short AV36TFBarOrdLin_To ;
   private short AV28OrderedBy ;
   private short A2248ManCod ;
   private short GXv_int8[] ;
   private short Gx_err ;
   private int AV56BarCod ;
   private int AV13Random ;
   private int A934BarReoCod ;
   private int A129BarCod ;
   private int AV76Consultadeproduccion_fasesfullds_2_barcod ;
   private int AV90Consultadeproduccion_fasesfullds_16_tfbarfasest_sels_size ;
   private int A2692ExHdrLin ;
   private int GXv_int6[] ;
   private int AV102GXV1 ;
   private java.math.BigDecimal A215BarTieRea ;
   private java.math.BigDecimal A3837BarFasKgm ;
   private java.math.BigDecimal A3838BarFasMtr ;
   private java.math.BigDecimal AV88Consultadeproduccion_fasesfullds_14_tfbartierea ;
   private java.math.BigDecimal AV47TFBarTieRea ;
   private java.math.BigDecimal AV89Consultadeproduccion_fasesfullds_15_tfbartierea_to ;
   private java.math.BigDecimal AV48TFBarTieRea_To ;
   private java.math.BigDecimal AV91Consultadeproduccion_fasesfullds_17_tfbarfaskgm ;
   private java.math.BigDecimal AV51TFBarFasKgm ;
   private java.math.BigDecimal AV92Consultadeproduccion_fasesfullds_18_tfbarfaskgm_to ;
   private java.math.BigDecimal AV52TFBarFasKgm_To ;
   private java.math.BigDecimal AV93Consultadeproduccion_fasesfullds_19_tfbarfasmtr ;
   private java.math.BigDecimal AV53TFBarFasMtr ;
   private java.math.BigDecimal AV94Consultadeproduccion_fasesfullds_20_tfbarfasmtr_to ;
   private java.math.BigDecimal AV54TFBarFasMtr_To ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV59Var_Hdr ;
   private String AV55EmprCod ;
   private String AV58BarCodPar ;
   private String A457FasCod ;
   private String A460FasDsc ;
   private String A603MaqCodBis ;
   private String A396EmprCod ;
   private String A6173BarFasSec ;
   private String A935BarReoPar ;
   private String A130BarCodPar ;
   private String AV75Consultadeproduccion_fasesfullds_1_emprcod ;
   private String AV78Consultadeproduccion_fasesfullds_4_barcodpar ;
   private String AV81Consultadeproduccion_fasesfullds_7_tffascod ;
   private String AV37TFFasCod ;
   private String AV82Consultadeproduccion_fasesfullds_8_tffascod_sel ;
   private String AV38TFFasCod_Sel ;
   private String AV83Consultadeproduccion_fasesfullds_9_tffasdsc ;
   private String AV39TFFasDsc ;
   private String AV84Consultadeproduccion_fasesfullds_10_tffasdsc_sel ;
   private String AV40TFFasDsc_Sel ;
   private String AV85Consultadeproduccion_fasesfullds_11_tfmaqcodbis ;
   private String AV41TFMaqCodBis ;
   private String AV86Consultadeproduccion_fasesfullds_12_tfmaqcodbis_sel ;
   private String AV42TFMaqCodBis_Sel ;
   private String scmdbuf ;
   private String lV81Consultadeproduccion_fasesfullds_7_tffascod ;
   private String lV83Consultadeproduccion_fasesfullds_9_tffasdsc ;
   private String lV85Consultadeproduccion_fasesfullds_11_tfmaqcodbis ;
   private String A758ProCod ;
   private String AV30MaqDsc ;
   private String AV66BarFasDTF ;
   private String AV99Fascod ;
   private String A2689ExHdrFas ;
   private String AV31OpeNom ;
   private String AV68Station ;
   private String GXt_char2 ;
   private String GXv_char5[] ;
   private String AV69EmprNom ;
   private String GXv_char4[] ;
   private String AV70UsurCod ;
   private String GXv_char3[] ;
   private String AV103Pgmdesc ;
   private java.util.Date A4442BarFasDTI ;
   private java.util.Date A4443BarFasDTF ;
   private java.util.Date AV87Consultadeproduccion_fasesfullds_13_tfbarfasdti ;
   private java.util.Date AV43TFBarFasDTI ;
   private java.util.Date A2697ExHdrFeE ;
   private java.util.Date A2700ExHdrFeR ;
   private java.util.Date AV100Exhdrfee ;
   private java.util.Date AV101Exhdrfer ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean n129BarCod ;
   private boolean n132BarCodReo ;
   private boolean n130BarCodPar ;
   private boolean n3838BarFasMtr ;
   private boolean n3837BarFasKgm ;
   private boolean n4442BarFasDTI ;
   private boolean n4443BarFasDTF ;
   private boolean n2265BarExt ;
   private boolean n6173BarFasSec ;
   private boolean n2697ExHdrFeE ;
   private boolean n2700ExHdrFeR ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV49TFBarFasEst_SelsJson ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private GXSimpleCollection<Byte> AV90Consultadeproduccion_fasesfullds_16_tfbarfasest_sels ;
   private GXSimpleCollection<Byte> AV50TFBarFasEst_Sels ;
   private com.genexus.webpanels.WebSession AV60WebSession ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private String[] P0A402_A396EmprCod ;
   private int[] P0A402_A129BarCod ;
   private boolean[] P0A402_n129BarCod ;
   private byte[] P0A402_A132BarCodReo ;
   private boolean[] P0A402_n132BarCodReo ;
   private String[] P0A402_A130BarCodPar ;
   private boolean[] P0A402_n130BarCodPar ;
   private byte[] P0A402_A3836BarFasPri ;
   private java.math.BigDecimal[] P0A402_A3838BarFasMtr ;
   private boolean[] P0A402_n3838BarFasMtr ;
   private java.math.BigDecimal[] P0A402_A3837BarFasKgm ;
   private boolean[] P0A402_n3837BarFasKgm ;
   private byte[] P0A402_A153BarFasEst ;
   private java.math.BigDecimal[] P0A402_A215BarTieRea ;
   private java.util.Date[] P0A402_A4442BarFasDTI ;
   private boolean[] P0A402_n4442BarFasDTI ;
   private String[] P0A402_A603MaqCodBis ;
   private String[] P0A402_A460FasDsc ;
   private String[] P0A402_A457FasCod ;
   private short[] P0A402_A194BarOrdLin ;
   private java.util.Date[] P0A402_A4443BarFasDTF ;
   private boolean[] P0A402_n4443BarFasDTF ;
   private byte[] P0A402_A2265BarExt ;
   private boolean[] P0A402_n2265BarExt ;
   private byte[] P0A402_A148BarEstReo ;
   private String[] P0A402_A6173BarFasSec ;
   private boolean[] P0A402_n6173BarFasSec ;
   private int[] P0A402_A934BarReoCod ;
   private byte[] P0A402_A936BarReoReo ;
   private String[] P0A402_A935BarReoPar ;
   private String[] P0A402_A758ProCod ;
   private String[] P0A403_A396EmprCod ;
   private int[] P0A403_A129BarCod ;
   private boolean[] P0A403_n129BarCod ;
   private byte[] P0A403_A132BarCodReo ;
   private boolean[] P0A403_n132BarCodReo ;
   private String[] P0A403_A130BarCodPar ;
   private boolean[] P0A403_n130BarCodPar ;
   private String[] P0A403_A2689ExHdrFas ;
   private java.util.Date[] P0A403_A2697ExHdrFeE ;
   private boolean[] P0A403_n2697ExHdrFeE ;
   private java.util.Date[] P0A403_A2700ExHdrFeR ;
   private boolean[] P0A403_n2700ExHdrFeR ;
   private short[] P0A403_A2248ManCod ;
   private int[] P0A403_A2692ExHdrLin ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector9[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector10[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV33GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV34GridStateFilterValue ;
}

final  class consultadeproduccion_fasesfullexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0A402( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A153BarFasEst ,
                                          GXSimpleCollection<Byte> AV90Consultadeproduccion_fasesfullds_16_tfbarfasest_sels ,
                                          short AV79Consultadeproduccion_fasesfullds_5_tfbarordlin ,
                                          short AV80Consultadeproduccion_fasesfullds_6_tfbarordlin_to ,
                                          String AV82Consultadeproduccion_fasesfullds_8_tffascod_sel ,
                                          String AV81Consultadeproduccion_fasesfullds_7_tffascod ,
                                          String AV84Consultadeproduccion_fasesfullds_10_tffasdsc_sel ,
                                          String AV83Consultadeproduccion_fasesfullds_9_tffasdsc ,
                                          String AV86Consultadeproduccion_fasesfullds_12_tfmaqcodbis_sel ,
                                          String AV85Consultadeproduccion_fasesfullds_11_tfmaqcodbis ,
                                          java.util.Date AV87Consultadeproduccion_fasesfullds_13_tfbarfasdti ,
                                          java.math.BigDecimal AV88Consultadeproduccion_fasesfullds_14_tfbartierea ,
                                          java.math.BigDecimal AV89Consultadeproduccion_fasesfullds_15_tfbartierea_to ,
                                          int AV90Consultadeproduccion_fasesfullds_16_tfbarfasest_sels_size ,
                                          java.math.BigDecimal AV91Consultadeproduccion_fasesfullds_17_tfbarfaskgm ,
                                          java.math.BigDecimal AV92Consultadeproduccion_fasesfullds_18_tfbarfaskgm_to ,
                                          java.math.BigDecimal AV93Consultadeproduccion_fasesfullds_19_tfbarfasmtr ,
                                          java.math.BigDecimal AV94Consultadeproduccion_fasesfullds_20_tfbarfasmtr_to ,
                                          byte AV95Consultadeproduccion_fasesfullds_21_tfbarfaspri ,
                                          byte AV96Consultadeproduccion_fasesfullds_22_tfbarfaspri_to ,
                                          short A194BarOrdLin ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String A603MaqCodBis ,
                                          java.util.Date A4442BarFasDTI ,
                                          java.math.BigDecimal A215BarTieRea ,
                                          java.math.BigDecimal A3837BarFasKgm ,
                                          java.math.BigDecimal A3838BarFasMtr ,
                                          byte A3836BarFasPri ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc ,
                                          String A396EmprCod ,
                                          String AV55EmprCod ,
                                          int A129BarCod ,
                                          int AV56BarCod ,
                                          byte A132BarCodReo ,
                                          byte AV57BarCodReo ,
                                          String A130BarCodPar ,
                                          String AV58BarCodPar ,
                                          String AV75Consultadeproduccion_fasesfullds_1_emprcod ,
                                          int AV76Consultadeproduccion_fasesfullds_2_barcod ,
                                          byte AV77Consultadeproduccion_fasesfullds_3_barcodreo ,
                                          String AV78Consultadeproduccion_fasesfullds_4_barcodpar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int11 = new byte[25];
      Object[] GXv_Object12 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarFasPri, T1.BarFasMtr, T1.BarFasKgm, T1.BarFasEst, T1.BarTieRea, T1.BarFasDTI, T1.MaqCodBis, T3.FasDsc," ;
      scmdbuf += " T1.FasCod, T1.BarOrdLin, T1.BarFasDTF, T2.BarExt, T2.BarEstReo, T1.BarFasSec, T2.BarReoCod, T2.BarReoReo, T2.BarReoPar, T1.ProCod FROM ((TXPBARFAS T1 INNER JOIN" ;
      scmdbuf += " TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) INNER JOIN TXPFASPRO T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.FasCod = T1.FasCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      if ( ! (0==AV79Consultadeproduccion_fasesfullds_5_tfbarordlin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int11[8] = (byte)(1) ;
      }
      if ( ! (0==AV80Consultadeproduccion_fasesfullds_6_tfbarordlin_to) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int11[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Consultadeproduccion_fasesfullds_8_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV81Consultadeproduccion_fasesfullds_7_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Consultadeproduccion_fasesfullds_8_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int11[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Consultadeproduccion_fasesfullds_10_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV83Consultadeproduccion_fasesfullds_9_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Consultadeproduccion_fasesfullds_10_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.FasDsc = ?)");
      }
      else
      {
         GXv_int11[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Consultadeproduccion_fasesfullds_12_tfmaqcodbis_sel)==0) && ( ! (GXutil.strcmp("", AV85Consultadeproduccion_fasesfullds_11_tfmaqcodbis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodBis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Consultadeproduccion_fasesfullds_12_tfmaqcodbis_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodBis = ?)");
      }
      else
      {
         GXv_int11[15] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV87Consultadeproduccion_fasesfullds_13_tfbarfasdti) )
      {
         addWhere(sWhereString, "(T1.BarFasDTI >= ?)");
      }
      else
      {
         GXv_int11[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV88Consultadeproduccion_fasesfullds_14_tfbartierea)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieRea >= ?)");
      }
      else
      {
         GXv_int11[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV89Consultadeproduccion_fasesfullds_15_tfbartierea_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieRea <= ?)");
      }
      else
      {
         GXv_int11[18] = (byte)(1) ;
      }
      if ( AV90Consultadeproduccion_fasesfullds_16_tfbarfasest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV90Consultadeproduccion_fasesfullds_16_tfbarfasest_sels, "T1.BarFasEst IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Consultadeproduccion_fasesfullds_17_tfbarfaskgm)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasKgm >= ?)");
      }
      else
      {
         GXv_int11[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV92Consultadeproduccion_fasesfullds_18_tfbarfaskgm_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasKgm <= ?)");
      }
      else
      {
         GXv_int11[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV93Consultadeproduccion_fasesfullds_19_tfbarfasmtr)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasMtr >= ?)");
      }
      else
      {
         GXv_int11[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV94Consultadeproduccion_fasesfullds_20_tfbarfasmtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasMtr <= ?)");
      }
      else
      {
         GXv_int11[22] = (byte)(1) ;
      }
      if ( ! (0==AV95Consultadeproduccion_fasesfullds_21_tfbarfaspri) )
      {
         addWhere(sWhereString, "(T1.BarFasPri >= ?)");
      }
      else
      {
         GXv_int11[23] = (byte)(1) ;
      }
      if ( ! (0==AV96Consultadeproduccion_fasesfullds_22_tfbarfaspri_to) )
      {
         addWhere(sWhereString, "(T1.BarFasPri <= ?)");
      }
      else
      {
         GXv_int11[24] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarOrdLin" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.BarOrdLin DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.FasCod" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.FasCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T3.FasDsc" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T3.FasDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.MaqCodBis" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.MaqCodBis DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarFasDTI" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.BarFasDTI DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarTieRea" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.BarTieRea DESC" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarFasEst" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.BarFasEst DESC" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarFasKgm" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.BarFasKgm DESC" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarFasMtr" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.BarFasMtr DESC" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarFasPri" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.BarFasPri DESC" ;
      }
      GXv_Object12[0] = scmdbuf ;
      GXv_Object12[1] = GXv_int11 ;
      return GXv_Object12 ;
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
                  return conditional_P0A402(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).shortValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.util.Date)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (java.util.Date)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , ((Number) dynConstraints[28]).byteValue() , ((Number) dynConstraints[29]).shortValue() , ((Boolean) dynConstraints[30]).booleanValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).intValue() , ((Number) dynConstraints[35]).byteValue() , ((Number) dynConstraints[36]).byteValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A402", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A403", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ExHdrFas, ExHdrFeE, ExHdrFeR, ManCod, ExHdrLin FROM TXPLEXMVH WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ExHdrFas = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ExHdrFas ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(8);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,2);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(11, 6);
               ((String[]) buf[14])[0] = rslt.getString(12, 28);
               ((String[]) buf[15])[0] = rslt.getString(13, 8);
               ((short[]) buf[16])[0] = rslt.getShort(14);
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDateTime(15);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((byte[]) buf[19])[0] = rslt.getByte(16);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((byte[]) buf[21])[0] = rslt.getByte(17);
               ((String[]) buf[22])[0] = rslt.getString(18, 2);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((int[]) buf[24])[0] = rslt.getInt(19);
               ((byte[]) buf[25])[0] = rslt.getByte(20);
               ((String[]) buf[26])[0] = rslt.getString(21, 1);
               ((String[]) buf[27])[0] = rslt.getString(22, 8);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 8);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(8);
               ((int[]) buf[13])[0] = rslt.getInt(9);
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
                  stmt.setString(sIdx, (String)parms[25], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[26]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[27]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 3);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[31]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 1);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[33]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[34]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 8);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 8);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 28);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 28);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 6);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[41], false);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[42], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[43], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[44], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[45], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[48]).byteValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[49]).byteValue());
               }
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               return;
      }
   }

}

