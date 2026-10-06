package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class webbcprodexportcsv_impl extends GXWebProcedure
{
   public webbcprodexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "WebBCPRODExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("WebBCPRODColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("WebBCPRODColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Producto", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Unidad", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Precio Actual", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Disponible", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "N.I.F.", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV87Webbcprodds_1_tfprdnum = AV69TFPrdNum ;
      AV88Webbcprodds_2_tfprdnum_sel = AV70TFPrdNum_Sel ;
      AV89Webbcprodds_3_tfprdnom = AV71TFPrdNom ;
      AV90Webbcprodds_4_tfprdnom_sel = AV72TFPrdNom_Sel ;
      AV91Webbcprodds_5_tfprducpdsc = AV73TFPrdUcpDsc ;
      AV92Webbcprodds_6_tfprducpdsc_sel = AV74TFPrdUcpDsc_Sel ;
      AV93Webbcprodds_7_tfprdpreact = AV75TFPrdPreAct ;
      AV94Webbcprodds_8_tfprdpreact_to = AV76TFPrdPreAct_To ;
      AV95Webbcprodds_9_tfprddisponible = AV82TFPrdDisponible ;
      AV96Webbcprodds_10_tfprddisponible_to = AV83TFPrdDisponible_To ;
      AV97Webbcprodds_11_tfprvnif = AV77TFPrvNif ;
      AV98Webbcprodds_12_tfprvnif_sel = AV78TFPrvNif_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV88Webbcprodds_2_tfprdnum_sel ,
                                           AV87Webbcprodds_1_tfprdnum ,
                                           AV90Webbcprodds_4_tfprdnom_sel ,
                                           AV89Webbcprodds_3_tfprdnom ,
                                           AV92Webbcprodds_6_tfprducpdsc_sel ,
                                           AV91Webbcprodds_5_tfprducpdsc ,
                                           AV93Webbcprodds_7_tfprdpreact ,
                                           AV94Webbcprodds_8_tfprdpreact_to ,
                                           AV95Webbcprodds_9_tfprddisponible ,
                                           AV96Webbcprodds_10_tfprddisponible_to ,
                                           AV98Webbcprodds_12_tfprvnif_sel ,
                                           AV97Webbcprodds_11_tfprvnif ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A737PrdUcpDsc ,
                                           A724PrdPreAct ,
                                           A704PrdExiAlm ,
                                           A685PrdCanRes ,
                                           A793PrvNif ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) ,
                                           A3936PrdEqLP ,
                                           AV79EmprCod ,
                                           A396EmprCod ,
                                           Byte.valueOf(A856ValCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE
                                           }
      });
      lV87Webbcprodds_1_tfprdnum = GXutil.padr( GXutil.rtrim( AV87Webbcprodds_1_tfprdnum), 6, "%") ;
      lV89Webbcprodds_3_tfprdnom = GXutil.padr( GXutil.rtrim( AV89Webbcprodds_3_tfprdnom), 26, "%") ;
      lV91Webbcprodds_5_tfprducpdsc = GXutil.padr( GXutil.rtrim( AV91Webbcprodds_5_tfprducpdsc), 8, "%") ;
      lV97Webbcprodds_11_tfprvnif = GXutil.padr( GXutil.rtrim( AV97Webbcprodds_11_tfprvnif), 20, "%") ;
      /* Using cursor P07ZT2 */
      pr_default.execute(0, new Object[] {AV79EmprCod, lV87Webbcprodds_1_tfprdnum, AV88Webbcprodds_2_tfprdnum_sel, lV89Webbcprodds_3_tfprdnom, AV90Webbcprodds_4_tfprdnom_sel, lV91Webbcprodds_5_tfprducpdsc, AV92Webbcprodds_6_tfprducpdsc_sel, AV93Webbcprodds_7_tfprdpreact, AV94Webbcprodds_8_tfprdpreact_to, AV95Webbcprodds_9_tfprddisponible, AV96Webbcprodds_10_tfprddisponible_to, lV97Webbcprodds_11_tfprvnif, AV98Webbcprodds_12_tfprvnif_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A795PrvNum = P07ZT2_A795PrvNum[0] ;
         A742PrdUniCom = P07ZT2_A742PrdUniCom[0] ;
         A3936PrdEqLP = P07ZT2_A3936PrdEqLP[0] ;
         A856ValCod = P07ZT2_A856ValCod[0] ;
         A396EmprCod = P07ZT2_A396EmprCod[0] ;
         A793PrvNif = P07ZT2_A793PrvNif[0] ;
         n793PrvNif = P07ZT2_n793PrvNif[0] ;
         A724PrdPreAct = P07ZT2_A724PrdPreAct[0] ;
         A737PrdUcpDsc = P07ZT2_A737PrdUcpDsc[0] ;
         n737PrdUcpDsc = P07ZT2_n737PrdUcpDsc[0] ;
         A718PrdNom = P07ZT2_A718PrdNom[0] ;
         A719PrdNum = P07ZT2_A719PrdNum[0] ;
         A685PrdCanRes = P07ZT2_A685PrdCanRes[0] ;
         A704PrdExiAlm = P07ZT2_A704PrdExiAlm[0] ;
         A793PrvNif = P07ZT2_A793PrvNif[0] ;
         n793PrvNif = P07ZT2_n793PrvNif[0] ;
         A737PrdUcpDsc = P07ZT2_A737PrdUcpDsc[0] ;
         n737PrdUcpDsc = P07ZT2_n737PrdUcpDsc[0] ;
         if ( GXutil.strcmp(A3936PrdEqLP, httpContext.getMessage( "BC", "")) != 0 )
         {
            A13831PrdDisponi = A704PrdExiAlm.subtract(A685PrdCanRes) ;
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
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A719PrdNum, ";", ","), GXv_char3) ;
               webbcprodexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A718PrdNom, ";", ","), GXv_char3) ;
               webbcprodexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A737PrdUcpDsc, ";", ","), GXv_char3) ;
               webbcprodexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A724PrdPreAct, 14, 5) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A13831PrdDisponi, 12, 4) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A793PrvNif, ";", ","), GXv_char3) ;
               webbcprodexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=WebBCPRODExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdNum", "", "Producto", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdNom", "", "Descripcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdUcpDsc", "", "Unidad", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdPreAct", "", "Precio Actual", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdDisponible", "", "Disponible", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrvNif", "", "N.I.F.", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WebBCPRODColumnsSelector", GXv_char3) ;
      webbcprodexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("WebBCPRODGridState"), "") == 0 )
      {
         AV67GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WebBCPRODGridState"), null, null);
      }
      else
      {
         AV67GridState.fromxml(AV19Session.getValue("WebBCPRODGridState"), null, null);
      }
      AV28OrderedBy = AV67GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV67GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV99GXV1 = 1 ;
      while ( AV99GXV1 <= AV67GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV68GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV67GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV99GXV1));
         if ( GXutil.strcmp(AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV69TFPrdNum = AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV70TFPrdNum_Sel = AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV71TFPrdNom = AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV72TFPrdNom_Sel = AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDUCPDSC") == 0 )
         {
            AV73TFPrdUcpDsc = AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDUCPDSC_SEL") == 0 )
         {
            AV74TFPrdUcpDsc_Sel = AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDPREACT") == 0 )
         {
            AV75TFPrdPreAct = CommonUtil.decimalVal( AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV76TFPrdPreAct_To = CommonUtil.decimalVal( AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDDISPONIBLE") == 0 )
         {
            AV82TFPrdDisponible = CommonUtil.decimalVal( AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV83TFPrdDisponible_To = CommonUtil.decimalVal( AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNIF") == 0 )
         {
            AV77TFPrvNif = AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNIF_SEL") == 0 )
         {
            AV78TFPrvNif_Sel = AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV99GXV1 = (int)(AV99GXV1+1) ;
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
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      A737PrdUcpDsc = "" ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A13831PrdDisponi = DecimalUtil.ZERO ;
      A793PrvNif = "" ;
      AV87Webbcprodds_1_tfprdnum = "" ;
      AV69TFPrdNum = "" ;
      AV88Webbcprodds_2_tfprdnum_sel = "" ;
      AV70TFPrdNum_Sel = "" ;
      AV89Webbcprodds_3_tfprdnom = "" ;
      AV71TFPrdNom = "" ;
      AV90Webbcprodds_4_tfprdnom_sel = "" ;
      AV72TFPrdNom_Sel = "" ;
      AV91Webbcprodds_5_tfprducpdsc = "" ;
      AV73TFPrdUcpDsc = "" ;
      AV92Webbcprodds_6_tfprducpdsc_sel = "" ;
      AV74TFPrdUcpDsc_Sel = "" ;
      AV93Webbcprodds_7_tfprdpreact = DecimalUtil.ZERO ;
      AV75TFPrdPreAct = DecimalUtil.ZERO ;
      AV94Webbcprodds_8_tfprdpreact_to = DecimalUtil.ZERO ;
      AV76TFPrdPreAct_To = DecimalUtil.ZERO ;
      AV95Webbcprodds_9_tfprddisponible = DecimalUtil.ZERO ;
      AV82TFPrdDisponible = DecimalUtil.ZERO ;
      AV96Webbcprodds_10_tfprddisponible_to = DecimalUtil.ZERO ;
      AV83TFPrdDisponible_To = DecimalUtil.ZERO ;
      AV97Webbcprodds_11_tfprvnif = "" ;
      AV77TFPrvNif = "" ;
      AV98Webbcprodds_12_tfprvnif_sel = "" ;
      AV78TFPrvNif_Sel = "" ;
      scmdbuf = "" ;
      lV87Webbcprodds_1_tfprdnum = "" ;
      lV89Webbcprodds_3_tfprdnom = "" ;
      lV91Webbcprodds_5_tfprducpdsc = "" ;
      lV97Webbcprodds_11_tfprvnif = "" ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      A3936PrdEqLP = "" ;
      AV79EmprCod = "" ;
      A396EmprCod = "" ;
      P07ZT2_A795PrvNum = new int[1] ;
      P07ZT2_A742PrdUniCom = new byte[1] ;
      P07ZT2_A3936PrdEqLP = new String[] {""} ;
      P07ZT2_A856ValCod = new byte[1] ;
      P07ZT2_A396EmprCod = new String[] {""} ;
      P07ZT2_A793PrvNif = new String[] {""} ;
      P07ZT2_n793PrvNif = new boolean[] {false} ;
      P07ZT2_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07ZT2_A737PrdUcpDsc = new String[] {""} ;
      P07ZT2_n737PrdUcpDsc = new boolean[] {false} ;
      P07ZT2_A718PrdNom = new String[] {""} ;
      P07ZT2_A719PrdNum = new String[] {""} ;
      P07ZT2_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07ZT2_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector5 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV67GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV68GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.webbcprodexportcsv__default(),
         new Object[] {
             new Object[] {
            P07ZT2_A795PrvNum, P07ZT2_A742PrdUniCom, P07ZT2_A3936PrdEqLP, P07ZT2_A856ValCod, P07ZT2_A396EmprCod, P07ZT2_A793PrvNif, P07ZT2_n793PrvNif, P07ZT2_A724PrdPreAct, P07ZT2_A737PrdUcpDsc, P07ZT2_n737PrdUcpDsc,
            P07ZT2_A718PrdNom, P07ZT2_A719PrdNum, P07ZT2_A685PrdCanRes, P07ZT2_A704PrdExiAlm
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A856ValCod ;
   private byte A742PrdUniCom ;
   private short gxcookieaux ;
   private short AV28OrderedBy ;
   private short Gx_err ;
   private int AV13Random ;
   private int A795PrvNum ;
   private int AV99GXV1 ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal A13831PrdDisponi ;
   private java.math.BigDecimal AV93Webbcprodds_7_tfprdpreact ;
   private java.math.BigDecimal AV75TFPrdPreAct ;
   private java.math.BigDecimal AV94Webbcprodds_8_tfprdpreact_to ;
   private java.math.BigDecimal AV76TFPrdPreAct_To ;
   private java.math.BigDecimal AV95Webbcprodds_9_tfprddisponible ;
   private java.math.BigDecimal AV82TFPrdDisponible ;
   private java.math.BigDecimal AV96Webbcprodds_10_tfprddisponible_to ;
   private java.math.BigDecimal AV83TFPrdDisponible_To ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A685PrdCanRes ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String A737PrdUcpDsc ;
   private String A793PrvNif ;
   private String AV87Webbcprodds_1_tfprdnum ;
   private String AV69TFPrdNum ;
   private String AV88Webbcprodds_2_tfprdnum_sel ;
   private String AV70TFPrdNum_Sel ;
   private String AV89Webbcprodds_3_tfprdnom ;
   private String AV71TFPrdNom ;
   private String AV90Webbcprodds_4_tfprdnom_sel ;
   private String AV72TFPrdNom_Sel ;
   private String AV91Webbcprodds_5_tfprducpdsc ;
   private String AV73TFPrdUcpDsc ;
   private String AV92Webbcprodds_6_tfprducpdsc_sel ;
   private String AV74TFPrdUcpDsc_Sel ;
   private String AV97Webbcprodds_11_tfprvnif ;
   private String AV77TFPrvNif ;
   private String AV98Webbcprodds_12_tfprvnif_sel ;
   private String AV78TFPrvNif_Sel ;
   private String scmdbuf ;
   private String lV87Webbcprodds_1_tfprdnum ;
   private String lV89Webbcprodds_3_tfprdnom ;
   private String lV91Webbcprodds_5_tfprducpdsc ;
   private String lV97Webbcprodds_11_tfprvnif ;
   private String A3936PrdEqLP ;
   private String AV79EmprCod ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean n793PrvNif ;
   private boolean n737PrdUcpDsc ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private int[] P07ZT2_A795PrvNum ;
   private byte[] P07ZT2_A742PrdUniCom ;
   private String[] P07ZT2_A3936PrdEqLP ;
   private byte[] P07ZT2_A856ValCod ;
   private String[] P07ZT2_A396EmprCod ;
   private String[] P07ZT2_A793PrvNif ;
   private boolean[] P07ZT2_n793PrvNif ;
   private java.math.BigDecimal[] P07ZT2_A724PrdPreAct ;
   private String[] P07ZT2_A737PrdUcpDsc ;
   private boolean[] P07ZT2_n737PrdUcpDsc ;
   private String[] P07ZT2_A718PrdNom ;
   private String[] P07ZT2_A719PrdNum ;
   private java.math.BigDecimal[] P07ZT2_A685PrdCanRes ;
   private java.math.BigDecimal[] P07ZT2_A704PrdExiAlm ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV67GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV68GridStateFilterValue ;
}

final  class webbcprodexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P07ZT2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV88Webbcprodds_2_tfprdnum_sel ,
                                          String AV87Webbcprodds_1_tfprdnum ,
                                          String AV90Webbcprodds_4_tfprdnom_sel ,
                                          String AV89Webbcprodds_3_tfprdnom ,
                                          String AV92Webbcprodds_6_tfprducpdsc_sel ,
                                          String AV91Webbcprodds_5_tfprducpdsc ,
                                          java.math.BigDecimal AV93Webbcprodds_7_tfprdpreact ,
                                          java.math.BigDecimal AV94Webbcprodds_8_tfprdpreact_to ,
                                          java.math.BigDecimal AV95Webbcprodds_9_tfprddisponible ,
                                          java.math.BigDecimal AV96Webbcprodds_10_tfprddisponible_to ,
                                          String AV98Webbcprodds_12_tfprvnif_sel ,
                                          String AV97Webbcprodds_11_tfprvnif ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          String A737PrdUcpDsc ,
                                          java.math.BigDecimal A724PrdPreAct ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          java.math.BigDecimal A685PrdCanRes ,
                                          String A793PrvNif ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc ,
                                          String A3936PrdEqLP ,
                                          String AV79EmprCod ,
                                          String A396EmprCod ,
                                          byte A856ValCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[13];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.PrvNum, T1.PrdUniCom AS PrdUniCom, T1.PrdEqLP, T1.ValCod, T1.EmprCod, T2.PrvNif, T1.PrdPreAct, T3.UniDsc AS PrdUcpDsc, T1.PrdNom, T1.PrdNum, T1.PrdCanRes," ;
      scmdbuf += " T1.PrdExiAlm FROM ((TXPPRODUC T1 INNER JOIN TXPPRVGEN T2 ON T2.EmprCod = T1.EmprCod AND T2.PrvNum = T1.PrvNum) INNER JOIN TXPTIPUNI T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.UniCod = T1.PrdUniCom)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.ValCod = 1)");
      if ( (GXutil.strcmp("", AV88Webbcprodds_2_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV87Webbcprodds_1_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Webbcprodds_2_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Webbcprodds_4_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV89Webbcprodds_3_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Webbcprodds_4_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom = ?)");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Webbcprodds_6_tfprducpdsc_sel)==0) && ( ! (GXutil.strcmp("", AV91Webbcprodds_5_tfprducpdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.UniDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Webbcprodds_6_tfprducpdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.UniDsc = ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV93Webbcprodds_7_tfprdpreact)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct >= ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV94Webbcprodds_8_tfprdpreact_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct <= ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV95Webbcprodds_9_tfprddisponible)==0) )
      {
         addWhere(sWhereString, "(( T1.PrdExiAlm - T1.PrdCanRes) >= ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV96Webbcprodds_10_tfprddisponible_to)==0) )
      {
         addWhere(sWhereString, "(( T1.PrdExiAlm - T1.PrdCanRes) <= ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV98Webbcprodds_12_tfprvnif_sel)==0) && ( ! (GXutil.strcmp("", AV97Webbcprodds_11_tfprvnif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Webbcprodds_12_tfprvnif_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvNif = ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
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
         scmdbuf += " ORDER BY T3.UniDsc" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.UniDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdPreAct" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdPreAct DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.PrvNif" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.PrvNif DESC" ;
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
                  return conditional_P07ZT2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Boolean) dynConstraints[20]).booleanValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).byteValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P07ZT2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,5);
               ((String[]) buf[8])[0] = rslt.getString(8, 8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 26);
               ((String[]) buf[11])[0] = rslt.getString(10, 6);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(11,4);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(12,4);
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
                  stmt.setString(sIdx, (String)parms[13], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 26);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 26);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 8);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 8);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[20], 5);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[21], 5);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[22], 4);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[23], 4);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 20);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 20);
               }
               return;
      }
   }

}

