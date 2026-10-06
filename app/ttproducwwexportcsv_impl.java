package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ttproducwwexportcsv_impl extends GXWebProcedure
{
   public ttproducwwexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "TTproducWWExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("TTproducWWColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("TTproducWWColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Producto", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Producto", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Exis Alm", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cant Res", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Disponible", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cant Pdte", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Precio", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Validez", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Rec?", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "AOX (adsorbable organic halogens)", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Global Organic Textile Standar", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "REACH", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Oeko Tex", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "HM", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "ZDHC", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "List by Inditex ", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "THELIST", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Hoja Segur", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha Hoja Segur", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Producto Aux", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV107Ttproducwwds_1_tfprdnom = AV54TFPrdNom ;
      AV108Ttproducwwds_2_tfprdnom_sel = AV55TFPrdNom_Sel ;
      AV109Ttproducwwds_3_tfprdnum = AV52TFPrdNum ;
      AV110Ttproducwwds_4_tfprdnum_sel = AV53TFPrdNum_Sel ;
      AV111Ttproducwwds_5_tfprdexialm = AV56TFPrdExiAlm ;
      AV112Ttproducwwds_6_tfprdexialm_to = AV57TFPrdExiAlm_To ;
      AV113Ttproducwwds_7_tfprdcanres = AV60TFPrdCanRes ;
      AV114Ttproducwwds_8_tfprdcanres_to = AV61TFPrdCanRes_To ;
      AV115Ttproducwwds_9_tfprddisponible = AV102TFPrdDisponible ;
      AV116Ttproducwwds_10_tfprddisponible_to = AV103TFPrdDisponible_To ;
      AV117Ttproducwwds_11_tfprdcanpen = AV62TFPrdCanPen ;
      AV118Ttproducwwds_12_tfprdcanpen_to = AV63TFPrdCanPen_To ;
      AV119Ttproducwwds_13_tfprdpreact = AV64TFPrdPreAct ;
      AV120Ttproducwwds_14_tfprdpreact_to = AV65TFPrdPreAct_To ;
      AV121Ttproducwwds_15_tfvaldsc = AV68TFValDsc ;
      AV122Ttproducwwds_16_tfvaldsc_sel = AV69TFValDsc_Sel ;
      AV123Ttproducwwds_17_tfprdrec = AV70TFPrdRec ;
      AV124Ttproducwwds_18_tfprdrec_sel = AV71TFPrdRec_Sel ;
      AV125Ttproducwwds_19_tfprdaox = AV72TFPrdAox ;
      AV126Ttproducwwds_20_tfprdaox_to = AV73TFPrdAox_To ;
      AV127Ttproducwwds_21_tfprdgots = AV100TFPrdGots ;
      AV128Ttproducwwds_22_tfprdgots_sel = AV101TFPrdGots_Sel ;
      AV129Ttproducwwds_23_tfprdreach = AV74TFPrdReach ;
      AV130Ttproducwwds_24_tfprdreach_sel = AV75TFPrdReach_Sel ;
      AV131Ttproducwwds_25_tfprdokotex_sels = AV94TFPrdOkotex_Sels ;
      AV132Ttproducwwds_26_tfprdhm = AV78TFPrdHm ;
      AV133Ttproducwwds_27_tfprdhm_sel = AV79TFPrdHm_Sel ;
      AV134Ttproducwwds_28_tfprdzdhc_sels = AV96TFPrdZDHC_Sels ;
      AV135Ttproducwwds_29_tfprdlist_sels = AV98TFPrdList_Sels ;
      AV136Ttproducwwds_30_tfprdthelist = AV82TFPrdTHELIST ;
      AV137Ttproducwwds_31_tfprdthelist_sel = AV83TFPrdTHELIST_Sel ;
      AV138Ttproducwwds_32_tfprdhs = AV84TFPrdHS ;
      AV139Ttproducwwds_33_tfprdhs_sel = AV85TFPrdHS_Sel ;
      AV140Ttproducwwds_34_tfprdfhs = AV86TFPrdFHS ;
      AV141Ttproducwwds_35_tfprdfhs_to = AV87TFPrdFHS_To ;
      AV142Ttproducwwds_36_tfprdnum2 = AV88TFPrdNum2 ;
      AV143Ttproducwwds_37_tfprdnum2_sel = AV89TFPrdNum2_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A5888PrdOkotex ,
                                           AV131Ttproducwwds_25_tfprdokotex_sels ,
                                           A13301PrdZDHC ,
                                           AV134Ttproducwwds_28_tfprdzdhc_sels ,
                                           A11687PrdList ,
                                           AV135Ttproducwwds_29_tfprdlist_sels ,
                                           AV108Ttproducwwds_2_tfprdnom_sel ,
                                           AV107Ttproducwwds_1_tfprdnom ,
                                           AV110Ttproducwwds_4_tfprdnum_sel ,
                                           AV109Ttproducwwds_3_tfprdnum ,
                                           AV111Ttproducwwds_5_tfprdexialm ,
                                           AV112Ttproducwwds_6_tfprdexialm_to ,
                                           AV113Ttproducwwds_7_tfprdcanres ,
                                           AV114Ttproducwwds_8_tfprdcanres_to ,
                                           AV115Ttproducwwds_9_tfprddisponible ,
                                           AV116Ttproducwwds_10_tfprddisponible_to ,
                                           AV117Ttproducwwds_11_tfprdcanpen ,
                                           AV118Ttproducwwds_12_tfprdcanpen_to ,
                                           AV119Ttproducwwds_13_tfprdpreact ,
                                           AV120Ttproducwwds_14_tfprdpreact_to ,
                                           AV122Ttproducwwds_16_tfvaldsc_sel ,
                                           AV121Ttproducwwds_15_tfvaldsc ,
                                           AV124Ttproducwwds_18_tfprdrec_sel ,
                                           AV123Ttproducwwds_17_tfprdrec ,
                                           AV125Ttproducwwds_19_tfprdaox ,
                                           AV126Ttproducwwds_20_tfprdaox_to ,
                                           AV128Ttproducwwds_22_tfprdgots_sel ,
                                           AV127Ttproducwwds_21_tfprdgots ,
                                           AV130Ttproducwwds_24_tfprdreach_sel ,
                                           AV129Ttproducwwds_23_tfprdreach ,
                                           Integer.valueOf(AV131Ttproducwwds_25_tfprdokotex_sels.size()) ,
                                           AV133Ttproducwwds_27_tfprdhm_sel ,
                                           AV132Ttproducwwds_26_tfprdhm ,
                                           Integer.valueOf(AV134Ttproducwwds_28_tfprdzdhc_sels.size()) ,
                                           Integer.valueOf(AV135Ttproducwwds_29_tfprdlist_sels.size()) ,
                                           AV137Ttproducwwds_31_tfprdthelist_sel ,
                                           AV136Ttproducwwds_30_tfprdthelist ,
                                           AV139Ttproducwwds_33_tfprdhs_sel ,
                                           AV138Ttproducwwds_32_tfprdhs ,
                                           AV140Ttproducwwds_34_tfprdfhs ,
                                           AV141Ttproducwwds_35_tfprdfhs_to ,
                                           AV143Ttproducwwds_37_tfprdnum2_sel ,
                                           AV142Ttproducwwds_36_tfprdnum2 ,
                                           A718PrdNom ,
                                           A719PrdNum ,
                                           A704PrdExiAlm ,
                                           A685PrdCanRes ,
                                           A684PrdCanPen ,
                                           A724PrdPreAct ,
                                           A857ValDsc ,
                                           A727PrdRec ,
                                           A9733PrdAox ,
                                           A11363PrdGots ,
                                           A5887PrdReach ,
                                           A11364PrdHm ,
                                           A13302PrdTHELIST ,
                                           A9741PrdHS ,
                                           A9742PrdFHS ,
                                           A4693PrdNum2 ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV107Ttproducwwds_1_tfprdnom = GXutil.padr( GXutil.rtrim( AV107Ttproducwwds_1_tfprdnom), 26, "%") ;
      lV109Ttproducwwds_3_tfprdnum = GXutil.padr( GXutil.rtrim( AV109Ttproducwwds_3_tfprdnum), 6, "%") ;
      lV121Ttproducwwds_15_tfvaldsc = GXutil.padr( GXutil.rtrim( AV121Ttproducwwds_15_tfvaldsc), 16, "%") ;
      lV123Ttproducwwds_17_tfprdrec = GXutil.padr( GXutil.rtrim( AV123Ttproducwwds_17_tfprdrec), 1, "%") ;
      lV127Ttproducwwds_21_tfprdgots = GXutil.padr( GXutil.rtrim( AV127Ttproducwwds_21_tfprdgots), 1, "%") ;
      lV129Ttproducwwds_23_tfprdreach = GXutil.padr( GXutil.rtrim( AV129Ttproducwwds_23_tfprdreach), 1, "%") ;
      lV132Ttproducwwds_26_tfprdhm = GXutil.padr( GXutil.rtrim( AV132Ttproducwwds_26_tfprdhm), 1, "%") ;
      lV136Ttproducwwds_30_tfprdthelist = GXutil.padr( GXutil.rtrim( AV136Ttproducwwds_30_tfprdthelist), 4, "%") ;
      lV138Ttproducwwds_32_tfprdhs = GXutil.padr( GXutil.rtrim( AV138Ttproducwwds_32_tfprdhs), 1, "%") ;
      lV142Ttproducwwds_36_tfprdnum2 = GXutil.padr( GXutil.rtrim( AV142Ttproducwwds_36_tfprdnum2), 16, "%") ;
      /* Using cursor P08NZ2 */
      pr_default.execute(0, new Object[] {lV107Ttproducwwds_1_tfprdnom, AV108Ttproducwwds_2_tfprdnom_sel, lV109Ttproducwwds_3_tfprdnum, AV110Ttproducwwds_4_tfprdnum_sel, AV111Ttproducwwds_5_tfprdexialm, AV112Ttproducwwds_6_tfprdexialm_to, AV113Ttproducwwds_7_tfprdcanres, AV114Ttproducwwds_8_tfprdcanres_to, AV115Ttproducwwds_9_tfprddisponible, AV116Ttproducwwds_10_tfprddisponible_to, AV117Ttproducwwds_11_tfprdcanpen, AV118Ttproducwwds_12_tfprdcanpen_to, AV119Ttproducwwds_13_tfprdpreact, AV120Ttproducwwds_14_tfprdpreact_to, lV121Ttproducwwds_15_tfvaldsc, AV122Ttproducwwds_16_tfvaldsc_sel, lV123Ttproducwwds_17_tfprdrec, AV124Ttproducwwds_18_tfprdrec_sel, AV125Ttproducwwds_19_tfprdaox, AV126Ttproducwwds_20_tfprdaox_to, lV127Ttproducwwds_21_tfprdgots, AV128Ttproducwwds_22_tfprdgots_sel, lV129Ttproducwwds_23_tfprdreach, AV130Ttproducwwds_24_tfprdreach_sel, lV132Ttproducwwds_26_tfprdhm, AV133Ttproducwwds_27_tfprdhm_sel, lV136Ttproducwwds_30_tfprdthelist, AV137Ttproducwwds_31_tfprdthelist_sel, lV138Ttproducwwds_32_tfprdhs, AV139Ttproducwwds_33_tfprdhs_sel, AV140Ttproducwwds_34_tfprdfhs, AV141Ttproducwwds_35_tfprdfhs_to, lV142Ttproducwwds_36_tfprdnum2, AV143Ttproducwwds_37_tfprdnum2_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P08NZ2_A396EmprCod[0] ;
         A856ValCod = P08NZ2_A856ValCod[0] ;
         A4693PrdNum2 = P08NZ2_A4693PrdNum2[0] ;
         A9742PrdFHS = P08NZ2_A9742PrdFHS[0] ;
         A9741PrdHS = P08NZ2_A9741PrdHS[0] ;
         A13302PrdTHELIST = P08NZ2_A13302PrdTHELIST[0] ;
         n13302PrdTHELIST = P08NZ2_n13302PrdTHELIST[0] ;
         A11687PrdList = P08NZ2_A11687PrdList[0] ;
         A13301PrdZDHC = P08NZ2_A13301PrdZDHC[0] ;
         A11364PrdHm = P08NZ2_A11364PrdHm[0] ;
         A5888PrdOkotex = P08NZ2_A5888PrdOkotex[0] ;
         A5887PrdReach = P08NZ2_A5887PrdReach[0] ;
         A11363PrdGots = P08NZ2_A11363PrdGots[0] ;
         A9733PrdAox = P08NZ2_A9733PrdAox[0] ;
         A727PrdRec = P08NZ2_A727PrdRec[0] ;
         A857ValDsc = P08NZ2_A857ValDsc[0] ;
         n857ValDsc = P08NZ2_n857ValDsc[0] ;
         A724PrdPreAct = P08NZ2_A724PrdPreAct[0] ;
         A684PrdCanPen = P08NZ2_A684PrdCanPen[0] ;
         A719PrdNum = P08NZ2_A719PrdNum[0] ;
         A718PrdNom = P08NZ2_A718PrdNom[0] ;
         A685PrdCanRes = P08NZ2_A685PrdCanRes[0] ;
         A704PrdExiAlm = P08NZ2_A704PrdExiAlm[0] ;
         A857ValDsc = P08NZ2_A857ValDsc[0] ;
         n857ValDsc = P08NZ2_n857ValDsc[0] ;
         A13831PrdDisponi = A704PrdExiAlm.subtract(A685PrdCanRes) ;
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
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A718PrdNom, ";", ","), GXv_char3) ;
            ttproducwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A719PrdNum, ";", ","), GXv_char3) ;
            ttproducwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A704PrdExiAlm, 12, 4) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A685PrdCanRes, 12, 4) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A13831PrdDisponi, 12, 4) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A684PrdCanPen, 12, 4) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A724PrdPreAct, 14, 5) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A857ValDsc, ";", ","), GXv_char3) ;
            ttproducwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A727PrdRec, ";", ","), GXv_char3) ;
            ttproducwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A9733PrdAox, 6, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A11363PrdGots, ";", ","), GXv_char3) ;
            ttproducwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A5887PrdReach, ";", ","), GXv_char3) ;
            ttproducwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            if ( GXutil.strcmp(GXutil.trim( A5888PrdOkotex), "N") == 0 )
            {
               AV14TextFileLine += httpContext.getMessage( "N", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( A5888PrdOkotex), "S") == 0 )
            {
               AV14TextFileLine += httpContext.getMessage( "S", "") ;
            }
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A11364PrdHm, ";", ","), GXv_char3) ;
            ttproducwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            if ( GXutil.strcmp(GXutil.trim( A13301PrdZDHC), "N") == 0 )
            {
               AV14TextFileLine += httpContext.getMessage( "N", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( A13301PrdZDHC), "1") == 0 )
            {
               AV14TextFileLine += httpContext.getMessage( "Nivel 1", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( A13301PrdZDHC), "2") == 0 )
            {
               AV14TextFileLine += httpContext.getMessage( "Nivel 2", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( A13301PrdZDHC), "3") == 0 )
            {
               AV14TextFileLine += httpContext.getMessage( "Nivel 3", "") ;
            }
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            if ( GXutil.strcmp(GXutil.trim( A11687PrdList), "S") == 0 )
            {
               AV14TextFileLine += httpContext.getMessage( "S", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( A11687PrdList), "N") == 0 )
            {
               AV14TextFileLine += httpContext.getMessage( "N", "") ;
            }
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13302PrdTHELIST, ";", ","), GXv_char3) ;
            ttproducwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A9741PrdHS, ";", ","), GXv_char3) ;
            ttproducwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += localUtil.dtoc( A9742PrdFHS, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A4693PrdNum2, ";", ","), GXv_char3) ;
            ttproducwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=TTproducWWExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdNom", "", "Producto", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdNum", "", "Producto", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdExiAlm", "", "Exis Alm", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdCanRes", "", "Cant Res", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdDisponible", "", "Disponible", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdCanPen", "", "Cant Pdte", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdPreAct", "", "Precio", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ValDsc", "", "Validez", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdRec", "", "Rec?", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdAox", "", "AOX (adsorbable organic halogens)", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdGots", "", "Global Organic Textile Standar", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdReach", "", "REACH", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdOkotex", "", "Oeko Tex", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdHm", "", "HM", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdZDHC", "", "ZDHC", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdList", "", "List by Inditex ", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdTHELIST", "", "THELIST", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdHS", "", "Hoja Segur", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdFHS", "", "Fecha Hoja Segur", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdNum2", "", "Producto Aux", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "TTproducWWColumnsSelector", GXv_char3) ;
      ttproducwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("TTproducWWGridState"), "") == 0 )
      {
         AV50GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TTproducWWGridState"), null, null);
      }
      else
      {
         AV50GridState.fromxml(AV19Session.getValue("TTproducWWGridState"), null, null);
      }
      AV28OrderedBy = AV50GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV50GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV144GXV1 = 1 ;
      while ( AV144GXV1 <= AV50GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV51GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV50GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV144GXV1));
         if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV54TFPrdNom = AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV55TFPrdNom_Sel = AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV52TFPrdNum = AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV53TFPrdNum_Sel = AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDEXIALM") == 0 )
         {
            AV56TFPrdExiAlm = CommonUtil.decimalVal( AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV57TFPrdExiAlm_To = CommonUtil.decimalVal( AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDCANRES") == 0 )
         {
            AV60TFPrdCanRes = CommonUtil.decimalVal( AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV61TFPrdCanRes_To = CommonUtil.decimalVal( AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDDISPONIBLE") == 0 )
         {
            AV102TFPrdDisponible = CommonUtil.decimalVal( AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV103TFPrdDisponible_To = CommonUtil.decimalVal( AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDCANPEN") == 0 )
         {
            AV62TFPrdCanPen = CommonUtil.decimalVal( AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV63TFPrdCanPen_To = CommonUtil.decimalVal( AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDPREACT") == 0 )
         {
            AV64TFPrdPreAct = CommonUtil.decimalVal( AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV65TFPrdPreAct_To = CommonUtil.decimalVal( AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFVALDSC") == 0 )
         {
            AV68TFValDsc = AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFVALDSC_SEL") == 0 )
         {
            AV69TFValDsc_Sel = AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDREC") == 0 )
         {
            AV70TFPrdRec = AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDREC_SEL") == 0 )
         {
            AV71TFPrdRec_Sel = AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDAOX") == 0 )
         {
            AV72TFPrdAox = CommonUtil.decimalVal( AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV73TFPrdAox_To = CommonUtil.decimalVal( AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDGOTS") == 0 )
         {
            AV100TFPrdGots = AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDGOTS_SEL") == 0 )
         {
            AV101TFPrdGots_Sel = AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDREACH") == 0 )
         {
            AV74TFPrdReach = AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDREACH_SEL") == 0 )
         {
            AV75TFPrdReach_Sel = AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDOKOTEX_SEL") == 0 )
         {
            AV93TFPrdOkotex_SelsJson = AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV94TFPrdOkotex_Sels.fromJSonString(AV93TFPrdOkotex_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDHM") == 0 )
         {
            AV78TFPrdHm = AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDHM_SEL") == 0 )
         {
            AV79TFPrdHm_Sel = AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDZDHC_SEL") == 0 )
         {
            AV95TFPrdZDHC_SelsJson = AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV96TFPrdZDHC_Sels.fromJSonString(AV95TFPrdZDHC_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDLIST_SEL") == 0 )
         {
            AV97TFPrdList_SelsJson = AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV98TFPrdList_Sels.fromJSonString(AV97TFPrdList_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDTHELIST") == 0 )
         {
            AV82TFPrdTHELIST = AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDTHELIST_SEL") == 0 )
         {
            AV83TFPrdTHELIST_Sel = AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDHS") == 0 )
         {
            AV84TFPrdHS = AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDHS_SEL") == 0 )
         {
            AV85TFPrdHS_Sel = AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDFHS") == 0 )
         {
            AV86TFPrdFHS = localUtil.ctod( AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV87TFPrdFHS_To = localUtil.ctod( AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM2") == 0 )
         {
            AV88TFPrdNum2 = AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM2_SEL") == 0 )
         {
            AV89TFPrdNum2_Sel = AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV144GXV1 = (int)(AV144GXV1+1) ;
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
      A718PrdNom = "" ;
      A719PrdNum = "" ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      A13831PrdDisponi = DecimalUtil.ZERO ;
      A684PrdCanPen = DecimalUtil.ZERO ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A857ValDsc = "" ;
      A727PrdRec = "" ;
      A9733PrdAox = DecimalUtil.ZERO ;
      A11363PrdGots = "" ;
      A5887PrdReach = "" ;
      A5888PrdOkotex = "" ;
      A11364PrdHm = "" ;
      A13301PrdZDHC = "" ;
      A11687PrdList = "" ;
      A13302PrdTHELIST = "" ;
      A9741PrdHS = "" ;
      A9742PrdFHS = GXutil.nullDate() ;
      A4693PrdNum2 = "" ;
      AV107Ttproducwwds_1_tfprdnom = "" ;
      AV54TFPrdNom = "" ;
      AV108Ttproducwwds_2_tfprdnom_sel = "" ;
      AV55TFPrdNom_Sel = "" ;
      AV109Ttproducwwds_3_tfprdnum = "" ;
      AV52TFPrdNum = "" ;
      AV110Ttproducwwds_4_tfprdnum_sel = "" ;
      AV53TFPrdNum_Sel = "" ;
      AV111Ttproducwwds_5_tfprdexialm = DecimalUtil.ZERO ;
      AV56TFPrdExiAlm = DecimalUtil.ZERO ;
      AV112Ttproducwwds_6_tfprdexialm_to = DecimalUtil.ZERO ;
      AV57TFPrdExiAlm_To = DecimalUtil.ZERO ;
      AV113Ttproducwwds_7_tfprdcanres = DecimalUtil.ZERO ;
      AV60TFPrdCanRes = DecimalUtil.ZERO ;
      AV114Ttproducwwds_8_tfprdcanres_to = DecimalUtil.ZERO ;
      AV61TFPrdCanRes_To = DecimalUtil.ZERO ;
      AV115Ttproducwwds_9_tfprddisponible = DecimalUtil.ZERO ;
      AV102TFPrdDisponible = DecimalUtil.ZERO ;
      AV116Ttproducwwds_10_tfprddisponible_to = DecimalUtil.ZERO ;
      AV103TFPrdDisponible_To = DecimalUtil.ZERO ;
      AV117Ttproducwwds_11_tfprdcanpen = DecimalUtil.ZERO ;
      AV62TFPrdCanPen = DecimalUtil.ZERO ;
      AV118Ttproducwwds_12_tfprdcanpen_to = DecimalUtil.ZERO ;
      AV63TFPrdCanPen_To = DecimalUtil.ZERO ;
      AV119Ttproducwwds_13_tfprdpreact = DecimalUtil.ZERO ;
      AV64TFPrdPreAct = DecimalUtil.ZERO ;
      AV120Ttproducwwds_14_tfprdpreact_to = DecimalUtil.ZERO ;
      AV65TFPrdPreAct_To = DecimalUtil.ZERO ;
      AV121Ttproducwwds_15_tfvaldsc = "" ;
      AV68TFValDsc = "" ;
      AV122Ttproducwwds_16_tfvaldsc_sel = "" ;
      AV69TFValDsc_Sel = "" ;
      AV123Ttproducwwds_17_tfprdrec = "" ;
      AV70TFPrdRec = "" ;
      AV124Ttproducwwds_18_tfprdrec_sel = "" ;
      AV71TFPrdRec_Sel = "" ;
      AV125Ttproducwwds_19_tfprdaox = DecimalUtil.ZERO ;
      AV72TFPrdAox = DecimalUtil.ZERO ;
      AV126Ttproducwwds_20_tfprdaox_to = DecimalUtil.ZERO ;
      AV73TFPrdAox_To = DecimalUtil.ZERO ;
      AV127Ttproducwwds_21_tfprdgots = "" ;
      AV100TFPrdGots = "" ;
      AV128Ttproducwwds_22_tfprdgots_sel = "" ;
      AV101TFPrdGots_Sel = "" ;
      AV129Ttproducwwds_23_tfprdreach = "" ;
      AV74TFPrdReach = "" ;
      AV130Ttproducwwds_24_tfprdreach_sel = "" ;
      AV75TFPrdReach_Sel = "" ;
      AV131Ttproducwwds_25_tfprdokotex_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV94TFPrdOkotex_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV132Ttproducwwds_26_tfprdhm = "" ;
      AV78TFPrdHm = "" ;
      AV133Ttproducwwds_27_tfprdhm_sel = "" ;
      AV79TFPrdHm_Sel = "" ;
      AV134Ttproducwwds_28_tfprdzdhc_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV96TFPrdZDHC_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV135Ttproducwwds_29_tfprdlist_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV98TFPrdList_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV136Ttproducwwds_30_tfprdthelist = "" ;
      AV82TFPrdTHELIST = "" ;
      AV137Ttproducwwds_31_tfprdthelist_sel = "" ;
      AV83TFPrdTHELIST_Sel = "" ;
      AV138Ttproducwwds_32_tfprdhs = "" ;
      AV84TFPrdHS = "" ;
      AV139Ttproducwwds_33_tfprdhs_sel = "" ;
      AV85TFPrdHS_Sel = "" ;
      AV140Ttproducwwds_34_tfprdfhs = GXutil.nullDate() ;
      AV86TFPrdFHS = GXutil.nullDate() ;
      AV141Ttproducwwds_35_tfprdfhs_to = GXutil.nullDate() ;
      AV87TFPrdFHS_To = GXutil.nullDate() ;
      AV142Ttproducwwds_36_tfprdnum2 = "" ;
      AV88TFPrdNum2 = "" ;
      AV143Ttproducwwds_37_tfprdnum2_sel = "" ;
      AV89TFPrdNum2_Sel = "" ;
      scmdbuf = "" ;
      lV107Ttproducwwds_1_tfprdnom = "" ;
      lV109Ttproducwwds_3_tfprdnum = "" ;
      lV121Ttproducwwds_15_tfvaldsc = "" ;
      lV123Ttproducwwds_17_tfprdrec = "" ;
      lV127Ttproducwwds_21_tfprdgots = "" ;
      lV129Ttproducwwds_23_tfprdreach = "" ;
      lV132Ttproducwwds_26_tfprdhm = "" ;
      lV136Ttproducwwds_30_tfprdthelist = "" ;
      lV138Ttproducwwds_32_tfprdhs = "" ;
      lV142Ttproducwwds_36_tfprdnum2 = "" ;
      P08NZ2_A396EmprCod = new String[] {""} ;
      P08NZ2_A856ValCod = new byte[1] ;
      P08NZ2_A4693PrdNum2 = new String[] {""} ;
      P08NZ2_A9742PrdFHS = new java.util.Date[] {GXutil.nullDate()} ;
      P08NZ2_A9741PrdHS = new String[] {""} ;
      P08NZ2_A13302PrdTHELIST = new String[] {""} ;
      P08NZ2_n13302PrdTHELIST = new boolean[] {false} ;
      P08NZ2_A11687PrdList = new String[] {""} ;
      P08NZ2_A13301PrdZDHC = new String[] {""} ;
      P08NZ2_A11364PrdHm = new String[] {""} ;
      P08NZ2_A5888PrdOkotex = new String[] {""} ;
      P08NZ2_A5887PrdReach = new String[] {""} ;
      P08NZ2_A11363PrdGots = new String[] {""} ;
      P08NZ2_A9733PrdAox = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08NZ2_A727PrdRec = new String[] {""} ;
      P08NZ2_A857ValDsc = new String[] {""} ;
      P08NZ2_n857ValDsc = new boolean[] {false} ;
      P08NZ2_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08NZ2_A684PrdCanPen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08NZ2_A719PrdNum = new String[] {""} ;
      P08NZ2_A718PrdNom = new String[] {""} ;
      P08NZ2_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08NZ2_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A396EmprCod = "" ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector5 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV50GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV51GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV93TFPrdOkotex_SelsJson = "" ;
      AV95TFPrdZDHC_SelsJson = "" ;
      AV97TFPrdList_SelsJson = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ttproducwwexportcsv__default(),
         new Object[] {
             new Object[] {
            P08NZ2_A396EmprCod, P08NZ2_A856ValCod, P08NZ2_A4693PrdNum2, P08NZ2_A9742PrdFHS, P08NZ2_A9741PrdHS, P08NZ2_A13302PrdTHELIST, P08NZ2_n13302PrdTHELIST, P08NZ2_A11687PrdList, P08NZ2_A13301PrdZDHC, P08NZ2_A11364PrdHm,
            P08NZ2_A5888PrdOkotex, P08NZ2_A5887PrdReach, P08NZ2_A11363PrdGots, P08NZ2_A9733PrdAox, P08NZ2_A727PrdRec, P08NZ2_A857ValDsc, P08NZ2_n857ValDsc, P08NZ2_A724PrdPreAct, P08NZ2_A684PrdCanPen, P08NZ2_A719PrdNum,
            P08NZ2_A718PrdNom, P08NZ2_A685PrdCanRes, P08NZ2_A704PrdExiAlm
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A856ValCod ;
   private short gxcookieaux ;
   private short AV28OrderedBy ;
   private short Gx_err ;
   private int AV13Random ;
   private int AV131Ttproducwwds_25_tfprdokotex_sels_size ;
   private int AV134Ttproducwwds_28_tfprdzdhc_sels_size ;
   private int AV135Ttproducwwds_29_tfprdlist_sels_size ;
   private int AV144GXV1 ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A685PrdCanRes ;
   private java.math.BigDecimal A13831PrdDisponi ;
   private java.math.BigDecimal A684PrdCanPen ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal A9733PrdAox ;
   private java.math.BigDecimal AV111Ttproducwwds_5_tfprdexialm ;
   private java.math.BigDecimal AV56TFPrdExiAlm ;
   private java.math.BigDecimal AV112Ttproducwwds_6_tfprdexialm_to ;
   private java.math.BigDecimal AV57TFPrdExiAlm_To ;
   private java.math.BigDecimal AV113Ttproducwwds_7_tfprdcanres ;
   private java.math.BigDecimal AV60TFPrdCanRes ;
   private java.math.BigDecimal AV114Ttproducwwds_8_tfprdcanres_to ;
   private java.math.BigDecimal AV61TFPrdCanRes_To ;
   private java.math.BigDecimal AV115Ttproducwwds_9_tfprddisponible ;
   private java.math.BigDecimal AV102TFPrdDisponible ;
   private java.math.BigDecimal AV116Ttproducwwds_10_tfprddisponible_to ;
   private java.math.BigDecimal AV103TFPrdDisponible_To ;
   private java.math.BigDecimal AV117Ttproducwwds_11_tfprdcanpen ;
   private java.math.BigDecimal AV62TFPrdCanPen ;
   private java.math.BigDecimal AV118Ttproducwwds_12_tfprdcanpen_to ;
   private java.math.BigDecimal AV63TFPrdCanPen_To ;
   private java.math.BigDecimal AV119Ttproducwwds_13_tfprdpreact ;
   private java.math.BigDecimal AV64TFPrdPreAct ;
   private java.math.BigDecimal AV120Ttproducwwds_14_tfprdpreact_to ;
   private java.math.BigDecimal AV65TFPrdPreAct_To ;
   private java.math.BigDecimal AV125Ttproducwwds_19_tfprdaox ;
   private java.math.BigDecimal AV72TFPrdAox ;
   private java.math.BigDecimal AV126Ttproducwwds_20_tfprdaox_to ;
   private java.math.BigDecimal AV73TFPrdAox_To ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A718PrdNom ;
   private String A719PrdNum ;
   private String A857ValDsc ;
   private String A727PrdRec ;
   private String A11363PrdGots ;
   private String A5887PrdReach ;
   private String A5888PrdOkotex ;
   private String A11364PrdHm ;
   private String A13301PrdZDHC ;
   private String A11687PrdList ;
   private String A13302PrdTHELIST ;
   private String A9741PrdHS ;
   private String A4693PrdNum2 ;
   private String AV107Ttproducwwds_1_tfprdnom ;
   private String AV54TFPrdNom ;
   private String AV108Ttproducwwds_2_tfprdnom_sel ;
   private String AV55TFPrdNom_Sel ;
   private String AV109Ttproducwwds_3_tfprdnum ;
   private String AV52TFPrdNum ;
   private String AV110Ttproducwwds_4_tfprdnum_sel ;
   private String AV53TFPrdNum_Sel ;
   private String AV121Ttproducwwds_15_tfvaldsc ;
   private String AV68TFValDsc ;
   private String AV122Ttproducwwds_16_tfvaldsc_sel ;
   private String AV69TFValDsc_Sel ;
   private String AV123Ttproducwwds_17_tfprdrec ;
   private String AV70TFPrdRec ;
   private String AV124Ttproducwwds_18_tfprdrec_sel ;
   private String AV71TFPrdRec_Sel ;
   private String AV127Ttproducwwds_21_tfprdgots ;
   private String AV100TFPrdGots ;
   private String AV128Ttproducwwds_22_tfprdgots_sel ;
   private String AV101TFPrdGots_Sel ;
   private String AV129Ttproducwwds_23_tfprdreach ;
   private String AV74TFPrdReach ;
   private String AV130Ttproducwwds_24_tfprdreach_sel ;
   private String AV75TFPrdReach_Sel ;
   private String AV132Ttproducwwds_26_tfprdhm ;
   private String AV78TFPrdHm ;
   private String AV133Ttproducwwds_27_tfprdhm_sel ;
   private String AV79TFPrdHm_Sel ;
   private String AV136Ttproducwwds_30_tfprdthelist ;
   private String AV82TFPrdTHELIST ;
   private String AV137Ttproducwwds_31_tfprdthelist_sel ;
   private String AV83TFPrdTHELIST_Sel ;
   private String AV138Ttproducwwds_32_tfprdhs ;
   private String AV84TFPrdHS ;
   private String AV139Ttproducwwds_33_tfprdhs_sel ;
   private String AV85TFPrdHS_Sel ;
   private String AV142Ttproducwwds_36_tfprdnum2 ;
   private String AV88TFPrdNum2 ;
   private String AV143Ttproducwwds_37_tfprdnum2_sel ;
   private String AV89TFPrdNum2_Sel ;
   private String scmdbuf ;
   private String lV107Ttproducwwds_1_tfprdnom ;
   private String lV109Ttproducwwds_3_tfprdnum ;
   private String lV121Ttproducwwds_15_tfvaldsc ;
   private String lV123Ttproducwwds_17_tfprdrec ;
   private String lV127Ttproducwwds_21_tfprdgots ;
   private String lV129Ttproducwwds_23_tfprdreach ;
   private String lV132Ttproducwwds_26_tfprdhm ;
   private String lV136Ttproducwwds_30_tfprdthelist ;
   private String lV138Ttproducwwds_32_tfprdhs ;
   private String lV142Ttproducwwds_36_tfprdnum2 ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private java.util.Date A9742PrdFHS ;
   private java.util.Date AV140Ttproducwwds_34_tfprdfhs ;
   private java.util.Date AV86TFPrdFHS ;
   private java.util.Date AV141Ttproducwwds_35_tfprdfhs_to ;
   private java.util.Date AV87TFPrdFHS_To ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean n13302PrdTHELIST ;
   private boolean n857ValDsc ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV93TFPrdOkotex_SelsJson ;
   private String AV95TFPrdZDHC_SelsJson ;
   private String AV97TFPrdList_SelsJson ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private String[] P08NZ2_A396EmprCod ;
   private byte[] P08NZ2_A856ValCod ;
   private String[] P08NZ2_A4693PrdNum2 ;
   private java.util.Date[] P08NZ2_A9742PrdFHS ;
   private String[] P08NZ2_A9741PrdHS ;
   private String[] P08NZ2_A13302PrdTHELIST ;
   private boolean[] P08NZ2_n13302PrdTHELIST ;
   private String[] P08NZ2_A11687PrdList ;
   private String[] P08NZ2_A13301PrdZDHC ;
   private String[] P08NZ2_A11364PrdHm ;
   private String[] P08NZ2_A5888PrdOkotex ;
   private String[] P08NZ2_A5887PrdReach ;
   private String[] P08NZ2_A11363PrdGots ;
   private java.math.BigDecimal[] P08NZ2_A9733PrdAox ;
   private String[] P08NZ2_A727PrdRec ;
   private String[] P08NZ2_A857ValDsc ;
   private boolean[] P08NZ2_n857ValDsc ;
   private java.math.BigDecimal[] P08NZ2_A724PrdPreAct ;
   private java.math.BigDecimal[] P08NZ2_A684PrdCanPen ;
   private String[] P08NZ2_A719PrdNum ;
   private String[] P08NZ2_A718PrdNom ;
   private java.math.BigDecimal[] P08NZ2_A685PrdCanRes ;
   private java.math.BigDecimal[] P08NZ2_A704PrdExiAlm ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private GXSimpleCollection<String> AV131Ttproducwwds_25_tfprdokotex_sels ;
   private GXSimpleCollection<String> AV94TFPrdOkotex_Sels ;
   private GXSimpleCollection<String> AV134Ttproducwwds_28_tfprdzdhc_sels ;
   private GXSimpleCollection<String> AV96TFPrdZDHC_Sels ;
   private GXSimpleCollection<String> AV135Ttproducwwds_29_tfprdlist_sels ;
   private GXSimpleCollection<String> AV98TFPrdList_Sels ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV50GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV51GridStateFilterValue ;
}

final  class ttproducwwexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08NZ2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A5888PrdOkotex ,
                                          GXSimpleCollection<String> AV131Ttproducwwds_25_tfprdokotex_sels ,
                                          String A13301PrdZDHC ,
                                          GXSimpleCollection<String> AV134Ttproducwwds_28_tfprdzdhc_sels ,
                                          String A11687PrdList ,
                                          GXSimpleCollection<String> AV135Ttproducwwds_29_tfprdlist_sels ,
                                          String AV108Ttproducwwds_2_tfprdnom_sel ,
                                          String AV107Ttproducwwds_1_tfprdnom ,
                                          String AV110Ttproducwwds_4_tfprdnum_sel ,
                                          String AV109Ttproducwwds_3_tfprdnum ,
                                          java.math.BigDecimal AV111Ttproducwwds_5_tfprdexialm ,
                                          java.math.BigDecimal AV112Ttproducwwds_6_tfprdexialm_to ,
                                          java.math.BigDecimal AV113Ttproducwwds_7_tfprdcanres ,
                                          java.math.BigDecimal AV114Ttproducwwds_8_tfprdcanres_to ,
                                          java.math.BigDecimal AV115Ttproducwwds_9_tfprddisponible ,
                                          java.math.BigDecimal AV116Ttproducwwds_10_tfprddisponible_to ,
                                          java.math.BigDecimal AV117Ttproducwwds_11_tfprdcanpen ,
                                          java.math.BigDecimal AV118Ttproducwwds_12_tfprdcanpen_to ,
                                          java.math.BigDecimal AV119Ttproducwwds_13_tfprdpreact ,
                                          java.math.BigDecimal AV120Ttproducwwds_14_tfprdpreact_to ,
                                          String AV122Ttproducwwds_16_tfvaldsc_sel ,
                                          String AV121Ttproducwwds_15_tfvaldsc ,
                                          String AV124Ttproducwwds_18_tfprdrec_sel ,
                                          String AV123Ttproducwwds_17_tfprdrec ,
                                          java.math.BigDecimal AV125Ttproducwwds_19_tfprdaox ,
                                          java.math.BigDecimal AV126Ttproducwwds_20_tfprdaox_to ,
                                          String AV128Ttproducwwds_22_tfprdgots_sel ,
                                          String AV127Ttproducwwds_21_tfprdgots ,
                                          String AV130Ttproducwwds_24_tfprdreach_sel ,
                                          String AV129Ttproducwwds_23_tfprdreach ,
                                          int AV131Ttproducwwds_25_tfprdokotex_sels_size ,
                                          String AV133Ttproducwwds_27_tfprdhm_sel ,
                                          String AV132Ttproducwwds_26_tfprdhm ,
                                          int AV134Ttproducwwds_28_tfprdzdhc_sels_size ,
                                          int AV135Ttproducwwds_29_tfprdlist_sels_size ,
                                          String AV137Ttproducwwds_31_tfprdthelist_sel ,
                                          String AV136Ttproducwwds_30_tfprdthelist ,
                                          String AV139Ttproducwwds_33_tfprdhs_sel ,
                                          String AV138Ttproducwwds_32_tfprdhs ,
                                          java.util.Date AV140Ttproducwwds_34_tfprdfhs ,
                                          java.util.Date AV141Ttproducwwds_35_tfprdfhs_to ,
                                          String AV143Ttproducwwds_37_tfprdnum2_sel ,
                                          String AV142Ttproducwwds_36_tfprdnum2 ,
                                          String A718PrdNom ,
                                          String A719PrdNum ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          java.math.BigDecimal A685PrdCanRes ,
                                          java.math.BigDecimal A684PrdCanPen ,
                                          java.math.BigDecimal A724PrdPreAct ,
                                          String A857ValDsc ,
                                          String A727PrdRec ,
                                          java.math.BigDecimal A9733PrdAox ,
                                          String A11363PrdGots ,
                                          String A5887PrdReach ,
                                          String A11364PrdHm ,
                                          String A13302PrdTHELIST ,
                                          String A9741PrdHS ,
                                          java.util.Date A9742PrdFHS ,
                                          String A4693PrdNum2 ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[34];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ValCod, T1.PrdNum2, T1.PrdFHS, T1.PrdHS, T1.PrdTHELIST, T1.PrdList, T1.PrdZDHC, T1.PrdHm, T1.PrdOkotex, T1.PrdReach, T1.PrdGots, T1.PrdAox," ;
      scmdbuf += " T1.PrdRec, T2.ValDsc, T1.PrdPreAct, T1.PrdCanPen, T1.PrdNum, T1.PrdNom, T1.PrdCanRes, T1.PrdExiAlm FROM (TXPPRODUC T1 INNER JOIN TXPTIPVAL T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.ValCod = T1.ValCod)" ;
      if ( (GXutil.strcmp("", AV108Ttproducwwds_2_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV107Ttproducwwds_1_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Ttproducwwds_2_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom = ?)");
      }
      else
      {
         GXv_int6[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Ttproducwwds_4_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV109Ttproducwwds_3_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Ttproducwwds_4_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV111Ttproducwwds_5_tfprdexialm)==0) )
      {
         addWhere(sWhereString, "(T1.PrdExiAlm >= ?)");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV112Ttproducwwds_6_tfprdexialm_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdExiAlm <= ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV113Ttproducwwds_7_tfprdcanres)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanRes >= ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV114Ttproducwwds_8_tfprdcanres_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanRes <= ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV115Ttproducwwds_9_tfprddisponible)==0) )
      {
         addWhere(sWhereString, "(( T1.PrdExiAlm - T1.PrdCanRes) >= ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV116Ttproducwwds_10_tfprddisponible_to)==0) )
      {
         addWhere(sWhereString, "(( T1.PrdExiAlm - T1.PrdCanRes) <= ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV117Ttproducwwds_11_tfprdcanpen)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanPen >= ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV118Ttproducwwds_12_tfprdcanpen_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanPen <= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV119Ttproducwwds_13_tfprdpreact)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct >= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV120Ttproducwwds_14_tfprdpreact_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct <= ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV122Ttproducwwds_16_tfvaldsc_sel)==0) && ( ! (GXutil.strcmp("", AV121Ttproducwwds_15_tfvaldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ValDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV122Ttproducwwds_16_tfvaldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ValDsc = ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV124Ttproducwwds_18_tfprdrec_sel)==0) && ( ! (GXutil.strcmp("", AV123Ttproducwwds_17_tfprdrec)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdRec) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV124Ttproducwwds_18_tfprdrec_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdRec = ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV125Ttproducwwds_19_tfprdaox)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAox >= ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV126Ttproducwwds_20_tfprdaox_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAox <= ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV128Ttproducwwds_22_tfprdgots_sel)==0) && ( ! (GXutil.strcmp("", AV127Ttproducwwds_21_tfprdgots)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdGots) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV128Ttproducwwds_22_tfprdgots_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdGots = ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV130Ttproducwwds_24_tfprdreach_sel)==0) && ( ! (GXutil.strcmp("", AV129Ttproducwwds_23_tfprdreach)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdReach) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV130Ttproducwwds_24_tfprdreach_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdReach = ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( AV131Ttproducwwds_25_tfprdokotex_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV131Ttproducwwds_25_tfprdokotex_sels, "T1.PrdOkotex IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV133Ttproducwwds_27_tfprdhm_sel)==0) && ( ! (GXutil.strcmp("", AV132Ttproducwwds_26_tfprdhm)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdHm) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV133Ttproducwwds_27_tfprdhm_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdHm = ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( AV134Ttproducwwds_28_tfprdzdhc_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV134Ttproducwwds_28_tfprdzdhc_sels, "T1.PrdZDHC IN (", ")")+")");
      }
      if ( AV135Ttproducwwds_29_tfprdlist_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV135Ttproducwwds_29_tfprdlist_sels, "T1.PrdList IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV137Ttproducwwds_31_tfprdthelist_sel)==0) && ( ! (GXutil.strcmp("", AV136Ttproducwwds_30_tfprdthelist)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdTHELIST) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV137Ttproducwwds_31_tfprdthelist_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdTHELIST = ?)");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV139Ttproducwwds_33_tfprdhs_sel)==0) && ( ! (GXutil.strcmp("", AV138Ttproducwwds_32_tfprdhs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdHS) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV139Ttproducwwds_33_tfprdhs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdHS = ?)");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV140Ttproducwwds_34_tfprdfhs)) )
      {
         addWhere(sWhereString, "(T1.PrdFHS >= ?)");
      }
      else
      {
         GXv_int6[30] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV141Ttproducwwds_35_tfprdfhs_to)) )
      {
         addWhere(sWhereString, "(T1.PrdFHS <= ?)");
      }
      else
      {
         GXv_int6[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV143Ttproducwwds_37_tfprdnum2_sel)==0) && ( ! (GXutil.strcmp("", AV142Ttproducwwds_36_tfprdnum2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV143Ttproducwwds_37_tfprdnum2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum2 = ?)");
      }
      else
      {
         GXv_int6[33] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNum" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNum DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNom" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdGots" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdGots DESC" ;
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
                  return conditional_P08NZ2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (String)dynConstraints[4] , (GXSimpleCollection<String>)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (java.util.Date)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , (java.math.BigDecimal)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (java.math.BigDecimal)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (java.math.BigDecimal)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , (java.util.Date)dynConstraints[57] , (String)dynConstraints[58] , ((Number) dynConstraints[59]).shortValue() , ((Boolean) dynConstraints[60]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08NZ2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((String[]) buf[10])[0] = rslt.getString(10, 1);
               ((String[]) buf[11])[0] = rslt.getString(11, 1);
               ((String[]) buf[12])[0] = rslt.getString(12, 1);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(13,2);
               ((String[]) buf[14])[0] = rslt.getString(14, 1);
               ((String[]) buf[15])[0] = rslt.getString(15, 16);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(16,5);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(17,4);
               ((String[]) buf[19])[0] = rslt.getString(18, 6);
               ((String[]) buf[20])[0] = rslt.getString(19, 26);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(20,4);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(21,4);
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
                  stmt.setString(sIdx, (String)parms[34], 26);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 26);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 4);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 4);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 4);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 4);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[42], 4);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[43], 4);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[44], 4);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[45], 4);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 5);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 5);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 16);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 1);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 1);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 1);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 1);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 1);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 1);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 1);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 4);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 4);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 1);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[64]);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[65]);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 16);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 16);
               }
               return;
      }
   }

}

