package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wctablaalbfasexportcsv_impl extends GXWebProcedure
{
   public wctablaalbfasexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "WCTablaAlbfasExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("WCTablaAlbfasColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("WCTablaAlbfasColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Línea Fase", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Linha", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Codigo Fase", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descriçao", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Quilos", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Preço", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Metros", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Preço", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV78Wctablaalbfasds_1_emprcod = AV47Emprcod ;
      AV79Wctablaalbfasds_2_albprocod = AV48AlbProcod ;
      AV80Wctablaalbfasds_3_barcod = AV49Barcod ;
      AV81Wctablaalbfasds_4_barcodreo = AV50Barcodreo ;
      AV82Wctablaalbfasds_5_tfguifasmaxlin = AV52TFGuiFasMaxLin ;
      AV83Wctablaalbfasds_6_tfguifasmaxlin_to = AV53TFGuiFasMaxLin_To ;
      AV84Wctablaalbfasds_7_tfguifaslin = AV32TFGuiFasLin ;
      AV85Wctablaalbfasds_8_tfguifaslin_to = AV33TFGuiFasLin_To ;
      AV86Wctablaalbfasds_9_tffascod = AV35TFFasCod ;
      AV87Wctablaalbfasds_10_tffascod_sel = AV36TFFasCod_Sel ;
      AV88Wctablaalbfasds_11_tffasdsc = AV37TFFasDsc ;
      AV89Wctablaalbfasds_12_tffasdsc_sel = AV38TFFasDsc_Sel ;
      AV90Wctablaalbfasds_13_tffaskgm = AV39TFFasKgm ;
      AV91Wctablaalbfasds_14_tffaskgm_to = AV40TFFasKgm_To ;
      AV92Wctablaalbfasds_15_tfguifaspkg = AV41TFGuiFasPKg ;
      AV93Wctablaalbfasds_16_tfguifaspkg_to = AV42TFGuiFasPKg_To ;
      AV94Wctablaalbfasds_17_tffasmtr = AV43TFFasMtr ;
      AV95Wctablaalbfasds_18_tffasmtr_to = AV44TFFasMtr_To ;
      AV96Wctablaalbfasds_19_tfguifaspmt = AV45TFGuiFasPMt ;
      AV97Wctablaalbfasds_20_tfguifaspmt_to = AV46TFGuiFasPMt_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Short.valueOf(AV84Wctablaalbfasds_7_tfguifaslin) ,
                                           Short.valueOf(AV85Wctablaalbfasds_8_tfguifaslin_to) ,
                                           AV87Wctablaalbfasds_10_tffascod_sel ,
                                           AV86Wctablaalbfasds_9_tffascod ,
                                           AV89Wctablaalbfasds_12_tffasdsc_sel ,
                                           AV88Wctablaalbfasds_11_tffasdsc ,
                                           AV90Wctablaalbfasds_13_tffaskgm ,
                                           AV91Wctablaalbfasds_14_tffaskgm_to ,
                                           AV92Wctablaalbfasds_15_tfguifaspkg ,
                                           AV93Wctablaalbfasds_16_tfguifaspkg_to ,
                                           AV94Wctablaalbfasds_17_tffasmtr ,
                                           AV95Wctablaalbfasds_18_tffasmtr_to ,
                                           AV96Wctablaalbfasds_19_tfguifaspmt ,
                                           AV97Wctablaalbfasds_20_tfguifaspmt_to ,
                                           Short.valueOf(A1240GuiFasLin) ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A1275FasKgm ,
                                           A1241GuiFasPKg ,
                                           A1276FasMtr ,
                                           A1242GuiFasPMt ,
                                           Short.valueOf(AV34OrderedBy) ,
                                           Boolean.valueOf(AV28OrderedDsc) ,
                                           Short.valueOf(AV82Wctablaalbfasds_5_tfguifasmaxlin) ,
                                           Short.valueOf(A13786GuiFasMaxL) ,
                                           Short.valueOf(AV83Wctablaalbfasds_6_tfguifasmaxlin_to) ,
                                           AV78Wctablaalbfasds_1_emprcod ,
                                           Long.valueOf(AV79Wctablaalbfasds_2_albprocod) ,
                                           Integer.valueOf(AV80Wctablaalbfasds_3_barcod) ,
                                           Byte.valueOf(AV81Wctablaalbfasds_4_barcodreo) ,
                                           A396EmprCod ,
                                           Long.valueOf(A30AlbProCod) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.INT, TypeConstants.BYTE
                                           }
      });
      lV86Wctablaalbfasds_9_tffascod = GXutil.padr( GXutil.rtrim( AV86Wctablaalbfasds_9_tffascod), 8, "%") ;
      lV88Wctablaalbfasds_11_tffasdsc = GXutil.padr( GXutil.rtrim( AV88Wctablaalbfasds_11_tffasdsc), 28, "%") ;
      /* Using cursor P08F93 */
      pr_default.execute(0, new Object[] {AV78Wctablaalbfasds_1_emprcod, Long.valueOf(AV79Wctablaalbfasds_2_albprocod), Integer.valueOf(AV80Wctablaalbfasds_3_barcod), Byte.valueOf(AV81Wctablaalbfasds_4_barcodreo), Short.valueOf(AV82Wctablaalbfasds_5_tfguifasmaxlin), Short.valueOf(AV82Wctablaalbfasds_5_tfguifasmaxlin), Short.valueOf(AV83Wctablaalbfasds_6_tfguifasmaxlin_to), Short.valueOf(AV83Wctablaalbfasds_6_tfguifasmaxlin_to), Short.valueOf(AV84Wctablaalbfasds_7_tfguifaslin), Short.valueOf(AV85Wctablaalbfasds_8_tfguifaslin_to), lV86Wctablaalbfasds_9_tffascod, AV87Wctablaalbfasds_10_tffascod_sel, lV88Wctablaalbfasds_11_tffasdsc, AV89Wctablaalbfasds_12_tffasdsc_sel, AV90Wctablaalbfasds_13_tffaskgm, AV91Wctablaalbfasds_14_tffaskgm_to, AV92Wctablaalbfasds_15_tfguifaspkg, AV93Wctablaalbfasds_16_tfguifaspkg_to, AV94Wctablaalbfasds_17_tffasmtr, AV95Wctablaalbfasds_18_tffasmtr_to, AV96Wctablaalbfasds_19_tfguifaspmt, AV97Wctablaalbfasds_20_tfguifaspmt_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P08F93_A130BarCodPar[0] ;
         A1242GuiFasPMt = P08F93_A1242GuiFasPMt[0] ;
         A1276FasMtr = P08F93_A1276FasMtr[0] ;
         A1241GuiFasPKg = P08F93_A1241GuiFasPKg[0] ;
         A1275FasKgm = P08F93_A1275FasKgm[0] ;
         A460FasDsc = P08F93_A460FasDsc[0] ;
         A457FasCod = P08F93_A457FasCod[0] ;
         A1240GuiFasLin = P08F93_A1240GuiFasLin[0] ;
         A132BarCodReo = P08F93_A132BarCodReo[0] ;
         A129BarCod = P08F93_A129BarCod[0] ;
         A30AlbProCod = P08F93_A30AlbProCod[0] ;
         A396EmprCod = P08F93_A396EmprCod[0] ;
         A13786GuiFasMaxL = P08F93_A13786GuiFasMaxL[0] ;
         n13786GuiFasMaxL = P08F93_n13786GuiFasMaxL[0] ;
         A460FasDsc = P08F93_A460FasDsc[0] ;
         A13786GuiFasMaxL = P08F93_A13786GuiFasMaxL[0] ;
         n13786GuiFasMaxL = P08F93_n13786GuiFasMaxL[0] ;
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
            AV14TextFileLine += GXutil.str( A13786GuiFasMaxL, 4, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A1240GuiFasLin, 4, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A457FasCod, ";", ","), GXv_char3) ;
            wctablaalbfasexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A460FasDsc, ";", ","), GXv_char3) ;
            wctablaalbfasexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A1275FasKgm, 9, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A1241GuiFasPKg, 13, 5) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A1276FasMtr, 9, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A1242GuiFasPMt, 13, 5) ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=WCTablaAlbfasExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "GuiFasMaxLin", "", "Línea Fase", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "GuiFasLin", "", "Linha", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "FasCod", "", "Codigo Fase", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "FasDsc", "", "Descriçao", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "FasKgm", "", "Quilos", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "GuiFasPKg", "", "Preço", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "FasMtr", "", "Metros", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "GuiFasPMt", "", "Preço", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WCTablaAlbfasColumnsSelector", GXv_char3) ;
      wctablaalbfasexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("WCTablaAlbfasGridState"), "") == 0 )
      {
         AV30GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCTablaAlbfasGridState"), null, null);
      }
      else
      {
         AV30GridState.fromxml(AV19Session.getValue("WCTablaAlbfasGridState"), null, null);
      }
      AV34OrderedBy = AV30GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV28OrderedDsc = AV30GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV98GXV1 = 1 ;
      while ( AV98GXV1 <= AV30GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV31GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV30GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV98GXV1));
         if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGUIFASMAXLIN") == 0 )
         {
            AV52TFGuiFasMaxLin = (short)(GXutil.lval( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV53TFGuiFasMaxLin_To = (short)(GXutil.lval( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGUIFASLIN") == 0 )
         {
            AV32TFGuiFasLin = (short)(GXutil.lval( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV33TFGuiFasLin_To = (short)(GXutil.lval( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD") == 0 )
         {
            AV35TFFasCod = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD_SEL") == 0 )
         {
            AV36TFFasCod_Sel = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC") == 0 )
         {
            AV37TFFasDsc = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC_SEL") == 0 )
         {
            AV38TFFasDsc_Sel = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASKGM") == 0 )
         {
            AV39TFFasKgm = CommonUtil.decimalVal( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV40TFFasKgm_To = CommonUtil.decimalVal( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGUIFASPKG") == 0 )
         {
            AV41TFGuiFasPKg = CommonUtil.decimalVal( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV42TFGuiFasPKg_To = CommonUtil.decimalVal( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASMTR") == 0 )
         {
            AV43TFFasMtr = CommonUtil.decimalVal( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV44TFFasMtr_To = CommonUtil.decimalVal( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGUIFASPMT") == 0 )
         {
            AV45TFGuiFasPMt = CommonUtil.decimalVal( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV46TFGuiFasPMt_To = CommonUtil.decimalVal( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV47Emprcod = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBPROCOD") == 0 )
         {
            AV48AlbProcod = GXutil.lval( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOD") == 0 )
         {
            AV49Barcod = (int)(GXutil.lval( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODREO") == 0 )
         {
            AV50Barcodreo = (byte)(GXutil.lval( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV98GXV1 = (int)(AV98GXV1+1) ;
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
      A457FasCod = "" ;
      A460FasDsc = "" ;
      A1275FasKgm = DecimalUtil.ZERO ;
      A1241GuiFasPKg = DecimalUtil.ZERO ;
      A1276FasMtr = DecimalUtil.ZERO ;
      A1242GuiFasPMt = DecimalUtil.ZERO ;
      AV78Wctablaalbfasds_1_emprcod = "" ;
      AV47Emprcod = "" ;
      AV86Wctablaalbfasds_9_tffascod = "" ;
      AV35TFFasCod = "" ;
      AV87Wctablaalbfasds_10_tffascod_sel = "" ;
      AV36TFFasCod_Sel = "" ;
      AV88Wctablaalbfasds_11_tffasdsc = "" ;
      AV37TFFasDsc = "" ;
      AV89Wctablaalbfasds_12_tffasdsc_sel = "" ;
      AV38TFFasDsc_Sel = "" ;
      AV90Wctablaalbfasds_13_tffaskgm = DecimalUtil.ZERO ;
      AV39TFFasKgm = DecimalUtil.ZERO ;
      AV91Wctablaalbfasds_14_tffaskgm_to = DecimalUtil.ZERO ;
      AV40TFFasKgm_To = DecimalUtil.ZERO ;
      AV92Wctablaalbfasds_15_tfguifaspkg = DecimalUtil.ZERO ;
      AV41TFGuiFasPKg = DecimalUtil.ZERO ;
      AV93Wctablaalbfasds_16_tfguifaspkg_to = DecimalUtil.ZERO ;
      AV42TFGuiFasPKg_To = DecimalUtil.ZERO ;
      AV94Wctablaalbfasds_17_tffasmtr = DecimalUtil.ZERO ;
      AV43TFFasMtr = DecimalUtil.ZERO ;
      AV95Wctablaalbfasds_18_tffasmtr_to = DecimalUtil.ZERO ;
      AV44TFFasMtr_To = DecimalUtil.ZERO ;
      AV96Wctablaalbfasds_19_tfguifaspmt = DecimalUtil.ZERO ;
      AV45TFGuiFasPMt = DecimalUtil.ZERO ;
      AV97Wctablaalbfasds_20_tfguifaspmt_to = DecimalUtil.ZERO ;
      AV46TFGuiFasPMt_To = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV86Wctablaalbfasds_9_tffascod = "" ;
      lV88Wctablaalbfasds_11_tffasdsc = "" ;
      A396EmprCod = "" ;
      P08F93_A130BarCodPar = new String[] {""} ;
      P08F93_A1242GuiFasPMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08F93_A1276FasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08F93_A1241GuiFasPKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08F93_A1275FasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08F93_A460FasDsc = new String[] {""} ;
      P08F93_A457FasCod = new String[] {""} ;
      P08F93_A1240GuiFasLin = new short[1] ;
      P08F93_A132BarCodReo = new byte[1] ;
      P08F93_A129BarCod = new int[1] ;
      P08F93_A30AlbProCod = new long[1] ;
      P08F93_A396EmprCod = new String[] {""} ;
      P08F93_A13786GuiFasMaxL = new short[1] ;
      P08F93_n13786GuiFasMaxL = new boolean[] {false} ;
      A130BarCodPar = "" ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector5 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV30GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV31GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wctablaalbfasexportcsv__default(),
         new Object[] {
             new Object[] {
            P08F93_A130BarCodPar, P08F93_A1242GuiFasPMt, P08F93_A1276FasMtr, P08F93_A1241GuiFasPKg, P08F93_A1275FasKgm, P08F93_A460FasDsc, P08F93_A457FasCod, P08F93_A1240GuiFasLin, P08F93_A132BarCodReo, P08F93_A129BarCod,
            P08F93_A30AlbProCod, P08F93_A396EmprCod, P08F93_A13786GuiFasMaxL, P08F93_n13786GuiFasMaxL
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV81Wctablaalbfasds_4_barcodreo ;
   private byte AV50Barcodreo ;
   private byte A132BarCodReo ;
   private short gxcookieaux ;
   private short A13786GuiFasMaxL ;
   private short A1240GuiFasLin ;
   private short AV82Wctablaalbfasds_5_tfguifasmaxlin ;
   private short AV52TFGuiFasMaxLin ;
   private short AV83Wctablaalbfasds_6_tfguifasmaxlin_to ;
   private short AV53TFGuiFasMaxLin_To ;
   private short AV84Wctablaalbfasds_7_tfguifaslin ;
   private short AV32TFGuiFasLin ;
   private short AV85Wctablaalbfasds_8_tfguifaslin_to ;
   private short AV33TFGuiFasLin_To ;
   private short AV34OrderedBy ;
   private short Gx_err ;
   private int AV13Random ;
   private int AV80Wctablaalbfasds_3_barcod ;
   private int AV49Barcod ;
   private int A129BarCod ;
   private int AV98GXV1 ;
   private long AV79Wctablaalbfasds_2_albprocod ;
   private long AV48AlbProcod ;
   private long A30AlbProCod ;
   private java.math.BigDecimal A1275FasKgm ;
   private java.math.BigDecimal A1241GuiFasPKg ;
   private java.math.BigDecimal A1276FasMtr ;
   private java.math.BigDecimal A1242GuiFasPMt ;
   private java.math.BigDecimal AV90Wctablaalbfasds_13_tffaskgm ;
   private java.math.BigDecimal AV39TFFasKgm ;
   private java.math.BigDecimal AV91Wctablaalbfasds_14_tffaskgm_to ;
   private java.math.BigDecimal AV40TFFasKgm_To ;
   private java.math.BigDecimal AV92Wctablaalbfasds_15_tfguifaspkg ;
   private java.math.BigDecimal AV41TFGuiFasPKg ;
   private java.math.BigDecimal AV93Wctablaalbfasds_16_tfguifaspkg_to ;
   private java.math.BigDecimal AV42TFGuiFasPKg_To ;
   private java.math.BigDecimal AV94Wctablaalbfasds_17_tffasmtr ;
   private java.math.BigDecimal AV43TFFasMtr ;
   private java.math.BigDecimal AV95Wctablaalbfasds_18_tffasmtr_to ;
   private java.math.BigDecimal AV44TFFasMtr_To ;
   private java.math.BigDecimal AV96Wctablaalbfasds_19_tfguifaspmt ;
   private java.math.BigDecimal AV45TFGuiFasPMt ;
   private java.math.BigDecimal AV97Wctablaalbfasds_20_tfguifaspmt_to ;
   private java.math.BigDecimal AV46TFGuiFasPMt_To ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A457FasCod ;
   private String A460FasDsc ;
   private String AV78Wctablaalbfasds_1_emprcod ;
   private String AV47Emprcod ;
   private String AV86Wctablaalbfasds_9_tffascod ;
   private String AV35TFFasCod ;
   private String AV87Wctablaalbfasds_10_tffascod_sel ;
   private String AV36TFFasCod_Sel ;
   private String AV88Wctablaalbfasds_11_tffasdsc ;
   private String AV37TFFasDsc ;
   private String AV89Wctablaalbfasds_12_tffasdsc_sel ;
   private String AV38TFFasDsc_Sel ;
   private String scmdbuf ;
   private String lV86Wctablaalbfasds_9_tffascod ;
   private String lV88Wctablaalbfasds_11_tffasdsc ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV28OrderedDsc ;
   private boolean n13786GuiFasMaxL ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private String[] P08F93_A130BarCodPar ;
   private java.math.BigDecimal[] P08F93_A1242GuiFasPMt ;
   private java.math.BigDecimal[] P08F93_A1276FasMtr ;
   private java.math.BigDecimal[] P08F93_A1241GuiFasPKg ;
   private java.math.BigDecimal[] P08F93_A1275FasKgm ;
   private String[] P08F93_A460FasDsc ;
   private String[] P08F93_A457FasCod ;
   private short[] P08F93_A1240GuiFasLin ;
   private byte[] P08F93_A132BarCodReo ;
   private int[] P08F93_A129BarCod ;
   private long[] P08F93_A30AlbProCod ;
   private String[] P08F93_A396EmprCod ;
   private short[] P08F93_A13786GuiFasMaxL ;
   private boolean[] P08F93_n13786GuiFasMaxL ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV30GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV31GridStateFilterValue ;
}

final  class wctablaalbfasexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08F93( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV84Wctablaalbfasds_7_tfguifaslin ,
                                          short AV85Wctablaalbfasds_8_tfguifaslin_to ,
                                          String AV87Wctablaalbfasds_10_tffascod_sel ,
                                          String AV86Wctablaalbfasds_9_tffascod ,
                                          String AV89Wctablaalbfasds_12_tffasdsc_sel ,
                                          String AV88Wctablaalbfasds_11_tffasdsc ,
                                          java.math.BigDecimal AV90Wctablaalbfasds_13_tffaskgm ,
                                          java.math.BigDecimal AV91Wctablaalbfasds_14_tffaskgm_to ,
                                          java.math.BigDecimal AV92Wctablaalbfasds_15_tfguifaspkg ,
                                          java.math.BigDecimal AV93Wctablaalbfasds_16_tfguifaspkg_to ,
                                          java.math.BigDecimal AV94Wctablaalbfasds_17_tffasmtr ,
                                          java.math.BigDecimal AV95Wctablaalbfasds_18_tffasmtr_to ,
                                          java.math.BigDecimal AV96Wctablaalbfasds_19_tfguifaspmt ,
                                          java.math.BigDecimal AV97Wctablaalbfasds_20_tfguifaspmt_to ,
                                          short A1240GuiFasLin ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          java.math.BigDecimal A1275FasKgm ,
                                          java.math.BigDecimal A1241GuiFasPKg ,
                                          java.math.BigDecimal A1276FasMtr ,
                                          java.math.BigDecimal A1242GuiFasPMt ,
                                          short AV34OrderedBy ,
                                          boolean AV28OrderedDsc ,
                                          short AV82Wctablaalbfasds_5_tfguifasmaxlin ,
                                          short A13786GuiFasMaxL ,
                                          short AV83Wctablaalbfasds_6_tfguifasmaxlin_to ,
                                          String AV78Wctablaalbfasds_1_emprcod ,
                                          long AV79Wctablaalbfasds_2_albprocod ,
                                          int AV80Wctablaalbfasds_3_barcod ,
                                          byte AV81Wctablaalbfasds_4_barcodreo ,
                                          String A396EmprCod ,
                                          long A30AlbProCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[22];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.BarCodPar, T1.GuiFasPMt, T1.FasMtr, T1.GuiFasPKg, T1.FasKgm, T2.FasDsc, T1.FasCod, T1.GuiFasLin, T1.BarCodReo, T1.BarCod, T1.AlbProCod, T1.EmprCod, COALESCE(" ;
      scmdbuf += " T3.GuiFasMaxL, 0) AS GuiFasMaxL FROM ((TXPALBFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) LEFT JOIN (SELECT MAX(GuiFasLin)" ;
      scmdbuf += " AS GuiFasMaxL, EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPALBFAS GROUP BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.AlbProCod = T1.AlbProCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.AlbProCod = ? and T1.BarCod = ? and T1.BarCodReo = ?)");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.GuiFasMaxL, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.GuiFasMaxL, 0) <= ?))");
      if ( ! (0==AV84Wctablaalbfasds_7_tfguifaslin) )
      {
         addWhere(sWhereString, "(T1.GuiFasLin >= ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (0==AV85Wctablaalbfasds_8_tfguifaslin_to) )
      {
         addWhere(sWhereString, "(T1.GuiFasLin <= ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Wctablaalbfasds_10_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV86Wctablaalbfasds_9_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Wctablaalbfasds_10_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Wctablaalbfasds_12_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV88Wctablaalbfasds_11_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Wctablaalbfasds_12_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Wctablaalbfasds_13_tffaskgm)==0) )
      {
         addWhere(sWhereString, "(T1.FasKgm >= ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Wctablaalbfasds_14_tffaskgm_to)==0) )
      {
         addWhere(sWhereString, "(T1.FasKgm <= ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV92Wctablaalbfasds_15_tfguifaspkg)==0) )
      {
         addWhere(sWhereString, "(T1.GuiFasPKg >= ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV93Wctablaalbfasds_16_tfguifaspkg_to)==0) )
      {
         addWhere(sWhereString, "(T1.GuiFasPKg <= ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV94Wctablaalbfasds_17_tffasmtr)==0) )
      {
         addWhere(sWhereString, "(T1.FasMtr >= ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV95Wctablaalbfasds_18_tffasmtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.FasMtr <= ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV96Wctablaalbfasds_19_tfguifaspmt)==0) )
      {
         addWhere(sWhereString, "(T1.GuiFasPMt >= ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV97Wctablaalbfasds_20_tfguifaspmt_to)==0) )
      {
         addWhere(sWhereString, "(T1.GuiFasPMt <= ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV34OrderedBy == 1 ) && ! AV28OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.GuiFasLin" ;
      }
      else if ( ( AV34OrderedBy == 1 ) && ( AV28OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.AlbProCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.GuiFasLin DESC" ;
      }
      else if ( ( AV34OrderedBy == 2 ) && ! AV28OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.FasCod" ;
      }
      else if ( ( AV34OrderedBy == 2 ) && ( AV28OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.AlbProCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.FasCod DESC" ;
      }
      else if ( ( AV34OrderedBy == 3 ) && ! AV28OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T2.FasDsc" ;
      }
      else if ( ( AV34OrderedBy == 3 ) && ( AV28OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.AlbProCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T2.FasDsc DESC" ;
      }
      else if ( ( AV34OrderedBy == 4 ) && ! AV28OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.FasKgm" ;
      }
      else if ( ( AV34OrderedBy == 4 ) && ( AV28OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.AlbProCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.FasKgm DESC" ;
      }
      else if ( ( AV34OrderedBy == 5 ) && ! AV28OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.GuiFasPKg" ;
      }
      else if ( ( AV34OrderedBy == 5 ) && ( AV28OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.AlbProCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.GuiFasPKg DESC" ;
      }
      else if ( ( AV34OrderedBy == 6 ) && ! AV28OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.FasMtr" ;
      }
      else if ( ( AV34OrderedBy == 6 ) && ( AV28OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.AlbProCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.FasMtr DESC" ;
      }
      else if ( ( AV34OrderedBy == 7 ) && ! AV28OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.GuiFasPMt" ;
      }
      else if ( ( AV34OrderedBy == 7 ) && ( AV28OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.AlbProCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.GuiFasPMt DESC" ;
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
                  return conditional_P08F93(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , ((Number) dynConstraints[14]).shortValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , ((Number) dynConstraints[21]).shortValue() , ((Boolean) dynConstraints[22]).booleanValue() , ((Number) dynConstraints[23]).shortValue() , ((Number) dynConstraints[24]).shortValue() , ((Number) dynConstraints[25]).shortValue() , (String)dynConstraints[26] , ((Number) dynConstraints[27]).longValue() , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).byteValue() , (String)dynConstraints[30] , ((Number) dynConstraints[31]).longValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).byteValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08F93", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((String[]) buf[5])[0] = rslt.getString(6, 28);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((long[]) buf[10])[0] = rslt.getLong(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 3);
               ((short[]) buf[12])[0] = rslt.getShort(13);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
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
                  stmt.setString(sIdx, (String)parms[22], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[23]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[25]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[26]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[27]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[28]).shortValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[29]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[30]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[31]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 8);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 8);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 28);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 28);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 5);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 5);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[42], 5);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[43], 5);
               }
               return;
      }
   }

}

