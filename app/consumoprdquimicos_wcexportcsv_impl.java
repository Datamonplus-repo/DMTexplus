package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class consumoprdquimicos_wcexportcsv_impl extends GXWebProcedure
{
   public consumoprdquimicos_wcexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "ConsumoPrdQuimicos_WCExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("ConsumoPrdQuimicos_WCColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("ConsumoPrdQuimicos_WCColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Código Empresa", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Producto", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Año estadistica Productos", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Mes de la Estadistica de Prod.", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Acumulado Unidades Compra Año", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Acumulado Unidades Consumo Año", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Valor Compra Productos Año", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Valor Consumo Productos Año", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "orden ascendente val. con. año", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV63Consumoprdquimicos_wcds_1_filterfulltext = AV30FilterFullText ;
      AV64Consumoprdquimicos_wcds_2_tfemprcod = AV34TFEmprCod ;
      AV65Consumoprdquimicos_wcds_3_tfemprcod_sel = AV35TFEmprCod_Sel ;
      AV66Consumoprdquimicos_wcds_4_tfprdnum = AV36TFPrdNum ;
      AV67Consumoprdquimicos_wcds_5_tfprdnum_sel = AV37TFPrdNum_Sel ;
      AV68Consumoprdquimicos_wcds_6_tfprdany = AV38TFPrdAny ;
      AV69Consumoprdquimicos_wcds_7_tfprdany_to = AV39TFPrdAny_To ;
      AV70Consumoprdquimicos_wcds_8_tfprdnummes = AV40TFPrdNumMes ;
      AV71Consumoprdquimicos_wcds_9_tfprdnummes_to = AV41TFPrdNumMes_To ;
      AV72Consumoprdquimicos_wcds_10_tfprdacucpra = AV42TFPrdAcuCprA ;
      AV73Consumoprdquimicos_wcds_11_tfprdacucpra_to = AV43TFPrdAcuCprA_To ;
      AV74Consumoprdquimicos_wcds_12_tfprdacucona = AV44TFPrdAcuConA ;
      AV75Consumoprdquimicos_wcds_13_tfprdacucona_to = AV45TFPrdAcuConA_To ;
      AV76Consumoprdquimicos_wcds_14_tfprdvalcpra = AV46TFPrdValCprA ;
      AV77Consumoprdquimicos_wcds_15_tfprdvalcpra_to = AV47TFPrdValCprA_To ;
      AV78Consumoprdquimicos_wcds_16_tfprdvalcona = AV48TFPrdValConA ;
      AV79Consumoprdquimicos_wcds_17_tfprdvalcona_to = AV49TFPrdValConA_To ;
      AV80Consumoprdquimicos_wcds_18_tfdifvalcona = AV50TFDifValConA ;
      AV81Consumoprdquimicos_wcds_19_tfdifvalcona_to = AV51TFDifValConA_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV63Consumoprdquimicos_wcds_1_filterfulltext ,
                                           AV65Consumoprdquimicos_wcds_3_tfemprcod_sel ,
                                           AV64Consumoprdquimicos_wcds_2_tfemprcod ,
                                           AV67Consumoprdquimicos_wcds_5_tfprdnum_sel ,
                                           AV66Consumoprdquimicos_wcds_4_tfprdnum ,
                                           Short.valueOf(AV68Consumoprdquimicos_wcds_6_tfprdany) ,
                                           Short.valueOf(AV69Consumoprdquimicos_wcds_7_tfprdany_to) ,
                                           Byte.valueOf(AV70Consumoprdquimicos_wcds_8_tfprdnummes) ,
                                           Byte.valueOf(AV71Consumoprdquimicos_wcds_9_tfprdnummes_to) ,
                                           AV72Consumoprdquimicos_wcds_10_tfprdacucpra ,
                                           AV73Consumoprdquimicos_wcds_11_tfprdacucpra_to ,
                                           AV74Consumoprdquimicos_wcds_12_tfprdacucona ,
                                           AV75Consumoprdquimicos_wcds_13_tfprdacucona_to ,
                                           AV76Consumoprdquimicos_wcds_14_tfprdvalcpra ,
                                           AV77Consumoprdquimicos_wcds_15_tfprdvalcpra_to ,
                                           AV78Consumoprdquimicos_wcds_16_tfprdvalcona ,
                                           AV79Consumoprdquimicos_wcds_17_tfprdvalcona_to ,
                                           AV80Consumoprdquimicos_wcds_18_tfdifvalcona ,
                                           AV81Consumoprdquimicos_wcds_19_tfdifvalcona_to ,
                                           Short.valueOf(AV52Anyo) ,
                                           Byte.valueOf(AV53MesI) ,
                                           Byte.valueOf(AV54MesF) ,
                                           Byte.valueOf(AV59Opcion) ,
                                           A396EmprCod ,
                                           A719PrdNum ,
                                           Short.valueOf(A681PrdAny) ,
                                           Byte.valueOf(A720PrdNumMes) ,
                                           A677PrdAcuCprA ,
                                           A676PrdAcuConA ,
                                           A748PrdValCprA ,
                                           A746PrdValConA ,
                                           A331DifValConA ,
                                           AV57PrdNumFrom ,
                                           AV58PrdNumTo ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV64Consumoprdquimicos_wcds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV64Consumoprdquimicos_wcds_2_tfemprcod), 3, "%") ;
      lV66Consumoprdquimicos_wcds_4_tfprdnum = GXutil.padr( GXutil.rtrim( AV66Consumoprdquimicos_wcds_4_tfprdnum), 6, "%") ;
      /* Using cursor P09GB3 */
      pr_default.execute(0, new Object[] {lV64Consumoprdquimicos_wcds_2_tfemprcod, AV65Consumoprdquimicos_wcds_3_tfemprcod_sel, lV66Consumoprdquimicos_wcds_4_tfprdnum, AV67Consumoprdquimicos_wcds_5_tfprdnum_sel, Short.valueOf(AV68Consumoprdquimicos_wcds_6_tfprdany), Short.valueOf(AV69Consumoprdquimicos_wcds_7_tfprdany_to), AV72Consumoprdquimicos_wcds_10_tfprdacucpra, AV73Consumoprdquimicos_wcds_11_tfprdacucpra_to, AV74Consumoprdquimicos_wcds_12_tfprdacucona, AV75Consumoprdquimicos_wcds_13_tfprdacucona_to, AV76Consumoprdquimicos_wcds_14_tfprdvalcpra, AV77Consumoprdquimicos_wcds_15_tfprdvalcpra_to, AV78Consumoprdquimicos_wcds_16_tfprdvalcona, AV79Consumoprdquimicos_wcds_17_tfprdvalcona_to, AV80Consumoprdquimicos_wcds_18_tfdifvalcona, AV81Consumoprdquimicos_wcds_19_tfdifvalcona_to, AV57PrdNumFrom, AV58PrdNumTo});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A331DifValConA = P09GB3_A331DifValConA[0] ;
         n331DifValConA = P09GB3_n331DifValConA[0] ;
         A676PrdAcuConA = P09GB3_A676PrdAcuConA[0] ;
         A681PrdAny = P09GB3_A681PrdAny[0] ;
         A719PrdNum = P09GB3_A719PrdNum[0] ;
         A396EmprCod = P09GB3_A396EmprCod[0] ;
         A746PrdValConA = P09GB3_A746PrdValConA[0] ;
         A748PrdValCprA = P09GB3_A748PrdValCprA[0] ;
         A677PrdAcuCprA = P09GB3_A677PrdAcuCprA[0] ;
         A746PrdValConA = P09GB3_A746PrdValConA[0] ;
         A748PrdValCprA = P09GB3_A748PrdValCprA[0] ;
         A677PrdAcuCprA = P09GB3_A677PrdAcuCprA[0] ;
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
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A396EmprCod, ";", ","), GXv_char3) ;
            consumoprdquimicos_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A719PrdNum, ";", ","), GXv_char3) ;
            consumoprdquimicos_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A681PrdAny, 4, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A720PrdNumMes, 2, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A677PrdAcuCprA, 10, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A676PrdAcuConA, 12, 4) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A748PrdValCprA, 12, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A746PrdValConA, 12, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A331DifValConA, 12, 2) ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=ConsumoPrdQuimicos_WCExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "EmprCod", "", "Código Empresa", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdNum", "", "Producto", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdAny", "", "Año estadistica Productos", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdNumMes", "", "Mes de la Estadistica de Prod.", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdAcuCprA", "", "Acumulado Unidades Compra Año", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdAcuConA", "", "Acumulado Unidades Consumo Año", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdValCprA", "", "Valor Compra Productos Año", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdValConA", "", "Valor Consumo Productos Año", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "DifValConA", "", "orden ascendente val. con. año", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "ConsumoPrdQuimicos_WCColumnsSelector", GXv_char3) ;
      consumoprdquimicos_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("ConsumoPrdQuimicos_WCGridState"), "") == 0 )
      {
         AV32GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "ConsumoPrdQuimicos_WCGridState"), null, null);
      }
      else
      {
         AV32GridState.fromxml(AV19Session.getValue("ConsumoPrdQuimicos_WCGridState"), null, null);
      }
      AV28OrderedBy = AV32GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV32GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV82GXV1 = 1 ;
      while ( AV82GXV1 <= AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV82GXV1));
         if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV30FilterFullText = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD") == 0 )
         {
            AV34TFEmprCod = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD_SEL") == 0 )
         {
            AV35TFEmprCod_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV36TFPrdNum = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV37TFPrdNum_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDANY") == 0 )
         {
            AV38TFPrdAny = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV39TFPrdAny_To = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUMMES") == 0 )
         {
            AV40TFPrdNumMes = (byte)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV41TFPrdNumMes_To = (byte)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDACUCPRA") == 0 )
         {
            AV42TFPrdAcuCprA = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV43TFPrdAcuCprA_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDACUCONA") == 0 )
         {
            AV44TFPrdAcuConA = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV45TFPrdAcuConA_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDVALCPRA") == 0 )
         {
            AV46TFPrdValCprA = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV47TFPrdValCprA_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDVALCONA") == 0 )
         {
            AV48TFPrdValConA = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV49TFPrdValConA_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDIFVALCONA") == 0 )
         {
            AV50TFDifValConA = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV51TFDifValConA_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         AV82GXV1 = (int)(AV82GXV1+1) ;
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
      A396EmprCod = "" ;
      A719PrdNum = "" ;
      A677PrdAcuCprA = DecimalUtil.ZERO ;
      A676PrdAcuConA = DecimalUtil.ZERO ;
      A748PrdValCprA = DecimalUtil.ZERO ;
      A746PrdValConA = DecimalUtil.ZERO ;
      A331DifValConA = DecimalUtil.ZERO ;
      AV63Consumoprdquimicos_wcds_1_filterfulltext = "" ;
      AV30FilterFullText = "" ;
      AV64Consumoprdquimicos_wcds_2_tfemprcod = "" ;
      AV34TFEmprCod = "" ;
      AV65Consumoprdquimicos_wcds_3_tfemprcod_sel = "" ;
      AV35TFEmprCod_Sel = "" ;
      AV66Consumoprdquimicos_wcds_4_tfprdnum = "" ;
      AV36TFPrdNum = "" ;
      AV67Consumoprdquimicos_wcds_5_tfprdnum_sel = "" ;
      AV37TFPrdNum_Sel = "" ;
      AV72Consumoprdquimicos_wcds_10_tfprdacucpra = DecimalUtil.ZERO ;
      AV42TFPrdAcuCprA = DecimalUtil.ZERO ;
      AV73Consumoprdquimicos_wcds_11_tfprdacucpra_to = DecimalUtil.ZERO ;
      AV43TFPrdAcuCprA_To = DecimalUtil.ZERO ;
      AV74Consumoprdquimicos_wcds_12_tfprdacucona = DecimalUtil.ZERO ;
      AV44TFPrdAcuConA = DecimalUtil.ZERO ;
      AV75Consumoprdquimicos_wcds_13_tfprdacucona_to = DecimalUtil.ZERO ;
      AV45TFPrdAcuConA_To = DecimalUtil.ZERO ;
      AV76Consumoprdquimicos_wcds_14_tfprdvalcpra = DecimalUtil.ZERO ;
      AV46TFPrdValCprA = DecimalUtil.ZERO ;
      AV77Consumoprdquimicos_wcds_15_tfprdvalcpra_to = DecimalUtil.ZERO ;
      AV47TFPrdValCprA_To = DecimalUtil.ZERO ;
      AV78Consumoprdquimicos_wcds_16_tfprdvalcona = DecimalUtil.ZERO ;
      AV48TFPrdValConA = DecimalUtil.ZERO ;
      AV79Consumoprdquimicos_wcds_17_tfprdvalcona_to = DecimalUtil.ZERO ;
      AV49TFPrdValConA_To = DecimalUtil.ZERO ;
      AV80Consumoprdquimicos_wcds_18_tfdifvalcona = DecimalUtil.ZERO ;
      AV50TFDifValConA = DecimalUtil.ZERO ;
      AV81Consumoprdquimicos_wcds_19_tfdifvalcona_to = DecimalUtil.ZERO ;
      AV51TFDifValConA_To = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV63Consumoprdquimicos_wcds_1_filterfulltext = "" ;
      lV64Consumoprdquimicos_wcds_2_tfemprcod = "" ;
      lV66Consumoprdquimicos_wcds_4_tfprdnum = "" ;
      AV57PrdNumFrom = "" ;
      AV58PrdNumTo = "" ;
      P09GB3_A331DifValConA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09GB3_n331DifValConA = new boolean[] {false} ;
      P09GB3_A676PrdAcuConA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09GB3_A681PrdAny = new short[1] ;
      P09GB3_A719PrdNum = new String[] {""} ;
      P09GB3_A396EmprCod = new String[] {""} ;
      P09GB3_A746PrdValConA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09GB3_A748PrdValCprA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09GB3_A677PrdAcuCprA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
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
      pr_default = new DataStoreProvider(context, remoteHandle, new app.consumoprdquimicos_wcexportcsv__default(),
         new Object[] {
             new Object[] {
            P09GB3_A331DifValConA, P09GB3_n331DifValConA, P09GB3_A676PrdAcuConA, P09GB3_A681PrdAny, P09GB3_A719PrdNum, P09GB3_A396EmprCod, P09GB3_A746PrdValConA, P09GB3_A748PrdValCprA, P09GB3_A677PrdAcuCprA
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A720PrdNumMes ;
   private byte AV70Consumoprdquimicos_wcds_8_tfprdnummes ;
   private byte AV40TFPrdNumMes ;
   private byte AV71Consumoprdquimicos_wcds_9_tfprdnummes_to ;
   private byte AV41TFPrdNumMes_To ;
   private byte AV53MesI ;
   private byte AV54MesF ;
   private byte AV59Opcion ;
   private short gxcookieaux ;
   private short A681PrdAny ;
   private short AV68Consumoprdquimicos_wcds_6_tfprdany ;
   private short AV38TFPrdAny ;
   private short AV69Consumoprdquimicos_wcds_7_tfprdany_to ;
   private short AV39TFPrdAny_To ;
   private short AV52Anyo ;
   private short AV28OrderedBy ;
   private short Gx_err ;
   private int AV13Random ;
   private int AV82GXV1 ;
   private java.math.BigDecimal A677PrdAcuCprA ;
   private java.math.BigDecimal A676PrdAcuConA ;
   private java.math.BigDecimal A748PrdValCprA ;
   private java.math.BigDecimal A746PrdValConA ;
   private java.math.BigDecimal A331DifValConA ;
   private java.math.BigDecimal AV72Consumoprdquimicos_wcds_10_tfprdacucpra ;
   private java.math.BigDecimal AV42TFPrdAcuCprA ;
   private java.math.BigDecimal AV73Consumoprdquimicos_wcds_11_tfprdacucpra_to ;
   private java.math.BigDecimal AV43TFPrdAcuCprA_To ;
   private java.math.BigDecimal AV74Consumoprdquimicos_wcds_12_tfprdacucona ;
   private java.math.BigDecimal AV44TFPrdAcuConA ;
   private java.math.BigDecimal AV75Consumoprdquimicos_wcds_13_tfprdacucona_to ;
   private java.math.BigDecimal AV45TFPrdAcuConA_To ;
   private java.math.BigDecimal AV76Consumoprdquimicos_wcds_14_tfprdvalcpra ;
   private java.math.BigDecimal AV46TFPrdValCprA ;
   private java.math.BigDecimal AV77Consumoprdquimicos_wcds_15_tfprdvalcpra_to ;
   private java.math.BigDecimal AV47TFPrdValCprA_To ;
   private java.math.BigDecimal AV78Consumoprdquimicos_wcds_16_tfprdvalcona ;
   private java.math.BigDecimal AV48TFPrdValConA ;
   private java.math.BigDecimal AV79Consumoprdquimicos_wcds_17_tfprdvalcona_to ;
   private java.math.BigDecimal AV49TFPrdValConA_To ;
   private java.math.BigDecimal AV80Consumoprdquimicos_wcds_18_tfdifvalcona ;
   private java.math.BigDecimal AV50TFDifValConA ;
   private java.math.BigDecimal AV81Consumoprdquimicos_wcds_19_tfdifvalcona_to ;
   private java.math.BigDecimal AV51TFDifValConA_To ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String AV64Consumoprdquimicos_wcds_2_tfemprcod ;
   private String AV34TFEmprCod ;
   private String AV65Consumoprdquimicos_wcds_3_tfemprcod_sel ;
   private String AV35TFEmprCod_Sel ;
   private String AV66Consumoprdquimicos_wcds_4_tfprdnum ;
   private String AV36TFPrdNum ;
   private String AV67Consumoprdquimicos_wcds_5_tfprdnum_sel ;
   private String AV37TFPrdNum_Sel ;
   private String scmdbuf ;
   private String lV64Consumoprdquimicos_wcds_2_tfemprcod ;
   private String lV66Consumoprdquimicos_wcds_4_tfprdnum ;
   private String AV57PrdNumFrom ;
   private String AV58PrdNumTo ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean n331DifValConA ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV63Consumoprdquimicos_wcds_1_filterfulltext ;
   private String AV30FilterFullText ;
   private String lV63Consumoprdquimicos_wcds_1_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] P09GB3_A331DifValConA ;
   private boolean[] P09GB3_n331DifValConA ;
   private java.math.BigDecimal[] P09GB3_A676PrdAcuConA ;
   private short[] P09GB3_A681PrdAny ;
   private String[] P09GB3_A719PrdNum ;
   private String[] P09GB3_A396EmprCod ;
   private java.math.BigDecimal[] P09GB3_A746PrdValConA ;
   private java.math.BigDecimal[] P09GB3_A748PrdValCprA ;
   private java.math.BigDecimal[] P09GB3_A677PrdAcuCprA ;
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

final  class consumoprdquimicos_wcexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09GB3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV63Consumoprdquimicos_wcds_1_filterfulltext ,
                                          String AV65Consumoprdquimicos_wcds_3_tfemprcod_sel ,
                                          String AV64Consumoprdquimicos_wcds_2_tfemprcod ,
                                          String AV67Consumoprdquimicos_wcds_5_tfprdnum_sel ,
                                          String AV66Consumoprdquimicos_wcds_4_tfprdnum ,
                                          short AV68Consumoprdquimicos_wcds_6_tfprdany ,
                                          short AV69Consumoprdquimicos_wcds_7_tfprdany_to ,
                                          byte AV70Consumoprdquimicos_wcds_8_tfprdnummes ,
                                          byte AV71Consumoprdquimicos_wcds_9_tfprdnummes_to ,
                                          java.math.BigDecimal AV72Consumoprdquimicos_wcds_10_tfprdacucpra ,
                                          java.math.BigDecimal AV73Consumoprdquimicos_wcds_11_tfprdacucpra_to ,
                                          java.math.BigDecimal AV74Consumoprdquimicos_wcds_12_tfprdacucona ,
                                          java.math.BigDecimal AV75Consumoprdquimicos_wcds_13_tfprdacucona_to ,
                                          java.math.BigDecimal AV76Consumoprdquimicos_wcds_14_tfprdvalcpra ,
                                          java.math.BigDecimal AV77Consumoprdquimicos_wcds_15_tfprdvalcpra_to ,
                                          java.math.BigDecimal AV78Consumoprdquimicos_wcds_16_tfprdvalcona ,
                                          java.math.BigDecimal AV79Consumoprdquimicos_wcds_17_tfprdvalcona_to ,
                                          java.math.BigDecimal AV80Consumoprdquimicos_wcds_18_tfdifvalcona ,
                                          java.math.BigDecimal AV81Consumoprdquimicos_wcds_19_tfdifvalcona_to ,
                                          short AV52Anyo ,
                                          byte AV53MesI ,
                                          byte AV54MesF ,
                                          byte AV59Opcion ,
                                          String A396EmprCod ,
                                          String A719PrdNum ,
                                          short A681PrdAny ,
                                          byte A720PrdNumMes ,
                                          java.math.BigDecimal A677PrdAcuCprA ,
                                          java.math.BigDecimal A676PrdAcuConA ,
                                          java.math.BigDecimal A748PrdValCprA ,
                                          java.math.BigDecimal A746PrdValConA ,
                                          java.math.BigDecimal A331DifValConA ,
                                          String AV57PrdNumFrom ,
                                          String AV58PrdNumTo ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[18];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.DifValConA, T1.PrdAcuConA, T1.PrdAny, T1.PrdNum, T1.EmprCod, COALESCE( T2.PrdValConA, 0) AS PrdValConA, COALESCE( T2.PrdValCprA, 0) AS PrdValCprA, COALESCE(" ;
      scmdbuf += " T2.PrdAcuCprA, 0) AS PrdAcuCprA FROM (TXPCPRDES T1 LEFT JOIN (SELECT SUM(PrdValConM) AS PrdValConA, EmprCod, PrdNum, PrdAny, SUM(PrdValCprM) AS PrdValCprA, SUM(PrdUniCprM)" ;
      scmdbuf += " AS PrdAcuCprA FROM TXPLPRDES GROUP BY EmprCod, PrdNum, PrdAny ) T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum AND T2.PrdAny = T1.PrdAny)" ;
      if ( (GXutil.strcmp("", AV65Consumoprdquimicos_wcds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV64Consumoprdquimicos_wcds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Consumoprdquimicos_wcds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int6[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Consumoprdquimicos_wcds_5_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV66Consumoprdquimicos_wcds_4_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Consumoprdquimicos_wcds_5_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( ! (0==AV68Consumoprdquimicos_wcds_6_tfprdany) )
      {
         addWhere(sWhereString, "(T1.PrdAny >= ?)");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( ! (0==AV69Consumoprdquimicos_wcds_7_tfprdany_to) )
      {
         addWhere(sWhereString, "(T1.PrdAny <= ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Consumoprdquimicos_wcds_10_tfprdacucpra)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T2.PrdAcuCprA, 0) >= ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73Consumoprdquimicos_wcds_11_tfprdacucpra_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T2.PrdAcuCprA, 0) <= ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Consumoprdquimicos_wcds_12_tfprdacucona)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAcuConA >= ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Consumoprdquimicos_wcds_13_tfprdacucona_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAcuConA <= ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Consumoprdquimicos_wcds_14_tfprdvalcpra)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T2.PrdValCprA, 0) >= ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Consumoprdquimicos_wcds_15_tfprdvalcpra_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T2.PrdValCprA, 0) <= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Consumoprdquimicos_wcds_16_tfprdvalcona)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T2.PrdValConA, 0) >= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Consumoprdquimicos_wcds_17_tfprdvalcona_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T2.PrdValConA, 0) <= ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Consumoprdquimicos_wcds_18_tfdifvalcona)==0) )
      {
         addWhere(sWhereString, "(T1.DifValConA >= ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Consumoprdquimicos_wcds_19_tfdifvalcona_to)==0) )
      {
         addWhere(sWhereString, "(T1.DifValConA <= ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( AV59Opcion > 1 )
      {
         addWhere(sWhereString, "(T1.PrdNum >= ? and T1.PrdNum <= ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
         GXv_int6[17] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNum" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNum DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdAny" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdAny DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdAcuConA" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdAcuConA DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DifValConA" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DifValConA DESC" ;
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
                  return conditional_P09GB3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).shortValue() , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).byteValue() , ((Number) dynConstraints[8]).byteValue() , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).byteValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Number) dynConstraints[26]).byteValue() , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).shortValue() , ((Boolean) dynConstraints[36]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09GB3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,4);
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 6);
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
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
                  stmt.setString(sIdx, (String)parms[18], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 3);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[22]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[23]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[24], 2);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[25], 2);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[26], 4);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[27], 4);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[28], 2);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 2);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[30], 2);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[31], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[32], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[33], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 6);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 6);
               }
               return;
      }
   }

}

