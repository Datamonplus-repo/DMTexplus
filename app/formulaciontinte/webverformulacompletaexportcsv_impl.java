package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class webverformulacompletaexportcsv_impl extends GXWebProcedure
{
   public webverformulacompletaexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV61Clave = AV62WebSession.getValue("&Clave") ;
      AV56CliCod = (int)(GXutil.lval( GXutil.substring( AV61Clave, 1, 6))) ;
      AV57ForSer = GXutil.substring( AV61Clave, 7, 16) ;
      AV58ForColNom = GXutil.substring( AV61Clave, 23, 13) ;
      AV59ForColNum = (int)(GXutil.lval( GXutil.substring( AV61Clave, 36, 6))) ;
      AV60TipColCod = (byte)(GXutil.lval( GXutil.substring( AV61Clave, 42, 2))) ;
      AV62WebSession.remove("&Clave");
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
      AV11Filename = "./PrivateTempStorage/" + "WebVerFormulaCompletaExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      AV14TextFileLine += ";" ;
      AV14TextFileLine += httpContext.getMessage( "Cliente", "") ;
      AV14TextFileLine += ";" ;
      AV14TextFileLine += GXutil.trim( GXutil.str( AV56CliCod, 6, 0)) ;
      AV14TextFileLine += ";" ;
      AV14TextFileLine += httpContext.getMessage( "Articulo", "") ;
      AV14TextFileLine += ";" ;
      AV14TextFileLine += GXutil.trim( AV57ForSer) ;
      AV14TextFileLine += ";" ;
      AV14TextFileLine += httpContext.getMessage( "Color", "") ;
      AV14TextFileLine += ";" ;
      AV14TextFileLine += GXutil.trim( AV58ForColNom) ;
      AV14TextFileLine += ";" ;
      AV14TextFileLine += httpContext.getMessage( "Numero", "") ;
      AV14TextFileLine += ";" ;
      AV14TextFileLine += GXutil.trim( GXutil.str( AV59ForColNum, 6, 0)) ;
      AV14TextFileLine += ";" ;
      AV14TextFileLine += httpContext.getMessage( "TC", "") ;
      AV14TextFileLine += ";" ;
      AV14TextFileLine += GXutil.str( AV60TipColCod, 2, 0) ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
      AV14TextFileLine = "" ;
      if ( GXutil.strcmp(AV19Session.getValue("FormulacionTinte.WebVerFormulaCompletaColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("FormulacionTinte.WebVerFormulaCompletaColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+"#" : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Proceso", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Producto", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Factor", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Unidad", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cantidad", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV66Formulaciontinte_webverformulacompletads_1_tfescmlin = AV33TFEscMLin ;
      AV67Formulaciontinte_webverformulacompletads_2_tfescmlin_to = AV34TFEscMLin_To ;
      AV68Formulaciontinte_webverformulacompletads_3_tfproforcod = AV35TFProForCod ;
      AV69Formulaciontinte_webverformulacompletads_4_tfproforcod_sel = AV36TFProForCod_Sel ;
      AV70Formulaciontinte_webverformulacompletads_5_tfprofordsc = AV37TFProForDsc ;
      AV71Formulaciontinte_webverformulacompletads_6_tfprofordsc_sel = AV38TFProForDsc_Sel ;
      AV72Formulaciontinte_webverformulacompletads_7_tfprdnum = AV39TFPrdNum ;
      AV73Formulaciontinte_webverformulacompletads_8_tfprdnum_sel = AV40TFPrdNum_Sel ;
      AV74Formulaciontinte_webverformulacompletads_9_tfprdnom = AV41TFPrdNom ;
      AV75Formulaciontinte_webverformulacompletads_10_tfprdnom_sel = AV42TFPrdNom_Sel ;
      AV76Formulaciontinte_webverformulacompletads_11_tfescmfaccon = AV43TFEscMFacCon ;
      AV77Formulaciontinte_webverformulacompletads_12_tfescmfaccon_to = AV44TFEscMFacCon_To ;
      AV78Formulaciontinte_webverformulacompletads_13_tfforprddsc = AV45TFForPrdDsc ;
      AV79Formulaciontinte_webverformulacompletads_14_tfforprddsc_sel = AV46TFForPrdDsc_Sel ;
      AV80Formulaciontinte_webverformulacompletads_15_tfescmcan = AV47TFEscMCan ;
      AV81Formulaciontinte_webverformulacompletads_16_tfescmcan_to = AV48TFEscMCan_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV66Formulaciontinte_webverformulacompletads_1_tfescmlin) ,
                                           Integer.valueOf(AV67Formulaciontinte_webverformulacompletads_2_tfescmlin_to) ,
                                           AV69Formulaciontinte_webverformulacompletads_4_tfproforcod_sel ,
                                           AV68Formulaciontinte_webverformulacompletads_3_tfproforcod ,
                                           AV71Formulaciontinte_webverformulacompletads_6_tfprofordsc_sel ,
                                           AV70Formulaciontinte_webverformulacompletads_5_tfprofordsc ,
                                           AV73Formulaciontinte_webverformulacompletads_8_tfprdnum_sel ,
                                           AV72Formulaciontinte_webverformulacompletads_7_tfprdnum ,
                                           AV75Formulaciontinte_webverformulacompletads_10_tfprdnom_sel ,
                                           AV74Formulaciontinte_webverformulacompletads_9_tfprdnom ,
                                           AV76Formulaciontinte_webverformulacompletads_11_tfescmfaccon ,
                                           AV77Formulaciontinte_webverformulacompletads_12_tfescmfaccon_to ,
                                           AV79Formulaciontinte_webverformulacompletads_14_tfforprddsc_sel ,
                                           AV78Formulaciontinte_webverformulacompletads_13_tfforprddsc ,
                                           AV80Formulaciontinte_webverformulacompletads_15_tfescmcan ,
                                           AV81Formulaciontinte_webverformulacompletads_16_tfescmcan_to ,
                                           Integer.valueOf(A887EscMLin) ,
                                           A764ProForCod ,
                                           A766ProForDsc ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A4712EscMFacCon ,
                                           A488ForPrdDsc ,
                                           A890EscMCan ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) ,
                                           AV51Emprcod ,
                                           AV52Station ,
                                           A396EmprCod ,
                                           A910Workstat } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV68Formulaciontinte_webverformulacompletads_3_tfproforcod = GXutil.padr( GXutil.rtrim( AV68Formulaciontinte_webverformulacompletads_3_tfproforcod), 6, "%") ;
      lV70Formulaciontinte_webverformulacompletads_5_tfprofordsc = GXutil.padr( GXutil.rtrim( AV70Formulaciontinte_webverformulacompletads_5_tfprofordsc), 30, "%") ;
      lV72Formulaciontinte_webverformulacompletads_7_tfprdnum = GXutil.padr( GXutil.rtrim( AV72Formulaciontinte_webverformulacompletads_7_tfprdnum), 6, "%") ;
      lV74Formulaciontinte_webverformulacompletads_9_tfprdnom = GXutil.padr( GXutil.rtrim( AV74Formulaciontinte_webverformulacompletads_9_tfprdnom), 26, "%") ;
      lV78Formulaciontinte_webverformulacompletads_13_tfforprddsc = GXutil.padr( GXutil.rtrim( AV78Formulaciontinte_webverformulacompletads_13_tfforprddsc), 5, "%") ;
      /* Using cursor P08KF2 */
      pr_default.execute(0, new Object[] {AV51Emprcod, AV52Station, Integer.valueOf(AV66Formulaciontinte_webverformulacompletads_1_tfescmlin), Integer.valueOf(AV67Formulaciontinte_webverformulacompletads_2_tfescmlin_to), lV68Formulaciontinte_webverformulacompletads_3_tfproforcod, AV69Formulaciontinte_webverformulacompletads_4_tfproforcod_sel, lV70Formulaciontinte_webverformulacompletads_5_tfprofordsc, AV71Formulaciontinte_webverformulacompletads_6_tfprofordsc_sel, lV72Formulaciontinte_webverformulacompletads_7_tfprdnum, AV73Formulaciontinte_webverformulacompletads_8_tfprdnum_sel, lV74Formulaciontinte_webverformulacompletads_9_tfprdnom, AV75Formulaciontinte_webverformulacompletads_10_tfprdnom_sel, AV76Formulaciontinte_webverformulacompletads_11_tfescmfaccon, AV77Formulaciontinte_webverformulacompletads_12_tfescmfaccon_to, lV78Formulaciontinte_webverformulacompletads_13_tfforprddsc, AV79Formulaciontinte_webverformulacompletads_14_tfforprddsc_sel, AV80Formulaciontinte_webverformulacompletads_15_tfescmcan, AV81Formulaciontinte_webverformulacompletads_16_tfescmcan_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A490ForPrdUMe = P08KF2_A490ForPrdUMe[0] ;
         A910Workstat = P08KF2_A910Workstat[0] ;
         A396EmprCod = P08KF2_A396EmprCod[0] ;
         A890EscMCan = P08KF2_A890EscMCan[0] ;
         A488ForPrdDsc = P08KF2_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P08KF2_n488ForPrdDsc[0] ;
         A4712EscMFacCon = P08KF2_A4712EscMFacCon[0] ;
         A718PrdNom = P08KF2_A718PrdNom[0] ;
         A719PrdNum = P08KF2_A719PrdNum[0] ;
         A766ProForDsc = P08KF2_A766ProForDsc[0] ;
         A764ProForCod = P08KF2_A764ProForCod[0] ;
         A887EscMLin = P08KF2_A887EscMLin[0] ;
         A488ForPrdDsc = P08KF2_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P08KF2_n488ForPrdDsc[0] ;
         A718PrdNom = P08KF2_A718PrdNom[0] ;
         A766ProForDsc = P08KF2_A766ProForDsc[0] ;
         AV14TextFileLine = "" ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S162 ();
         if ( returnInSub )
         {
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
            AV14TextFileLine += GXutil.str( A887EscMLin, 8, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A764ProForCod, ";", ","), GXv_char3) ;
            webverformulacompletaexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A766ProForDsc, ";", ","), GXv_char3) ;
            webverformulacompletaexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A719PrdNum, ";", ","), GXv_char3) ;
            webverformulacompletaexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A718PrdNom, ";", ","), GXv_char3) ;
            webverformulacompletaexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A4712EscMFacCon, 12, 5) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A488ForPrdDsc, ";", ","), GXv_char3) ;
            webverformulacompletaexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A890EscMCan, 11, 4) ;
         }
         /* Execute user subroutine: 'AFTERWRITELINE' */
         S172 ();
         if ( returnInSub )
         {
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=WebVerFormulaCompletaExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "EscMLin", "", "#", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ProForCod", "", "Proceso", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ProForDsc", "", "Descripcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdNum", "", "Producto", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdNom", "", "Descripcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "EscMFacCon", "", "Factor", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ForPrdDsc", "", "Unidad", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "EscMCan", "", "Cantidad", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "FormulacionTinte.WebVerFormulaCompletaColumnsSelector", GXv_char3) ;
      webverformulacompletaexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("FormulacionTinte.WebVerFormulaCompletaGridState"), "") == 0 )
      {
         AV31GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.WebVerFormulaCompletaGridState"), null, null);
      }
      else
      {
         AV31GridState.fromxml(AV19Session.getValue("FormulacionTinte.WebVerFormulaCompletaGridState"), null, null);
      }
      AV28OrderedBy = AV31GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV31GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV82GXV1 = 1 ;
      while ( AV82GXV1 <= AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV32GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV82GXV1));
         if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFESCMLIN") == 0 )
         {
            AV33TFEscMLin = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV34TFEscMLin_To = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORCOD") == 0 )
         {
            AV35TFProForCod = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORCOD_SEL") == 0 )
         {
            AV36TFProForCod_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORDSC") == 0 )
         {
            AV37TFProForDsc = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORDSC_SEL") == 0 )
         {
            AV38TFProForDsc_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV39TFPrdNum = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV40TFPrdNum_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV41TFPrdNom = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV42TFPrdNom_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFESCMFACCON") == 0 )
         {
            AV43TFEscMFacCon = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV44TFEscMFacCon_To = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDDSC") == 0 )
         {
            AV45TFForPrdDsc = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDDSC_SEL") == 0 )
         {
            AV46TFForPrdDsc_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFESCMCAN") == 0 )
         {
            AV47TFEscMCan = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV48TFEscMCan_To = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV51Emprcod = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD") == 0 )
         {
            AV56CliCod = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORSER") == 0 )
         {
            AV57ForSer = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORCOLNOM") == 0 )
         {
            AV58ForColNom = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORCOLNUM") == 0 )
         {
            AV59ForColNum = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&TIPCOLCOD") == 0 )
         {
            AV60TipColCod = (byte)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&STATION") == 0 )
         {
            AV52Station = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORRELBAN") == 0 )
         {
            AV53ForRelBan = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
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
      AV61Clave = "" ;
      AV62WebSession = httpContext.getWebSession();
      AV57ForSer = "" ;
      AV58ForColNom = "" ;
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV11Filename = "" ;
      AV10TextFile = new com.genexus.util.GXFile();
      AV14TextFileLine = "" ;
      AV19Session = httpContext.getWebSession();
      AV18ColumnsSelectorXML = "" ;
      AV15ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      A764ProForCod = "" ;
      A766ProForDsc = "" ;
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      A4712EscMFacCon = DecimalUtil.ZERO ;
      A488ForPrdDsc = "" ;
      A890EscMCan = DecimalUtil.ZERO ;
      AV68Formulaciontinte_webverformulacompletads_3_tfproforcod = "" ;
      AV35TFProForCod = "" ;
      AV69Formulaciontinte_webverformulacompletads_4_tfproforcod_sel = "" ;
      AV36TFProForCod_Sel = "" ;
      AV70Formulaciontinte_webverformulacompletads_5_tfprofordsc = "" ;
      AV37TFProForDsc = "" ;
      AV71Formulaciontinte_webverformulacompletads_6_tfprofordsc_sel = "" ;
      AV38TFProForDsc_Sel = "" ;
      AV72Formulaciontinte_webverformulacompletads_7_tfprdnum = "" ;
      AV39TFPrdNum = "" ;
      AV73Formulaciontinte_webverformulacompletads_8_tfprdnum_sel = "" ;
      AV40TFPrdNum_Sel = "" ;
      AV74Formulaciontinte_webverformulacompletads_9_tfprdnom = "" ;
      AV41TFPrdNom = "" ;
      AV75Formulaciontinte_webverformulacompletads_10_tfprdnom_sel = "" ;
      AV42TFPrdNom_Sel = "" ;
      AV76Formulaciontinte_webverformulacompletads_11_tfescmfaccon = DecimalUtil.ZERO ;
      AV43TFEscMFacCon = DecimalUtil.ZERO ;
      AV77Formulaciontinte_webverformulacompletads_12_tfescmfaccon_to = DecimalUtil.ZERO ;
      AV44TFEscMFacCon_To = DecimalUtil.ZERO ;
      AV78Formulaciontinte_webverformulacompletads_13_tfforprddsc = "" ;
      AV45TFForPrdDsc = "" ;
      AV79Formulaciontinte_webverformulacompletads_14_tfforprddsc_sel = "" ;
      AV46TFForPrdDsc_Sel = "" ;
      AV80Formulaciontinte_webverformulacompletads_15_tfescmcan = DecimalUtil.ZERO ;
      AV47TFEscMCan = DecimalUtil.ZERO ;
      AV81Formulaciontinte_webverformulacompletads_16_tfescmcan_to = DecimalUtil.ZERO ;
      AV48TFEscMCan_To = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV68Formulaciontinte_webverformulacompletads_3_tfproforcod = "" ;
      lV70Formulaciontinte_webverformulacompletads_5_tfprofordsc = "" ;
      lV72Formulaciontinte_webverformulacompletads_7_tfprdnum = "" ;
      lV74Formulaciontinte_webverformulacompletads_9_tfprdnom = "" ;
      lV78Formulaciontinte_webverformulacompletads_13_tfforprddsc = "" ;
      AV51Emprcod = "" ;
      AV52Station = "" ;
      A396EmprCod = "" ;
      A910Workstat = "" ;
      P08KF2_A490ForPrdUMe = new byte[1] ;
      P08KF2_A910Workstat = new String[] {""} ;
      P08KF2_A396EmprCod = new String[] {""} ;
      P08KF2_A890EscMCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08KF2_A488ForPrdDsc = new String[] {""} ;
      P08KF2_n488ForPrdDsc = new boolean[] {false} ;
      P08KF2_A4712EscMFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08KF2_A718PrdNom = new String[] {""} ;
      P08KF2_A719PrdNum = new String[] {""} ;
      P08KF2_A766ProForDsc = new String[] {""} ;
      P08KF2_A764ProForCod = new String[] {""} ;
      P08KF2_A887EscMLin = new int[1] ;
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
      AV53ForRelBan = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.webverformulacompletaexportcsv__default(),
         new Object[] {
             new Object[] {
            P08KF2_A490ForPrdUMe, P08KF2_A910Workstat, P08KF2_A396EmprCod, P08KF2_A890EscMCan, P08KF2_A488ForPrdDsc, P08KF2_n488ForPrdDsc, P08KF2_A4712EscMFacCon, P08KF2_A718PrdNom, P08KF2_A719PrdNum, P08KF2_A766ProForDsc,
            P08KF2_A764ProForCod, P08KF2_A887EscMLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV60TipColCod ;
   private byte A490ForPrdUMe ;
   private short gxcookieaux ;
   private short AV28OrderedBy ;
   private short Gx_err ;
   private int AV56CliCod ;
   private int AV59ForColNum ;
   private int AV13Random ;
   private int A887EscMLin ;
   private int AV66Formulaciontinte_webverformulacompletads_1_tfescmlin ;
   private int AV33TFEscMLin ;
   private int AV67Formulaciontinte_webverformulacompletads_2_tfescmlin_to ;
   private int AV34TFEscMLin_To ;
   private int AV82GXV1 ;
   private java.math.BigDecimal A4712EscMFacCon ;
   private java.math.BigDecimal A890EscMCan ;
   private java.math.BigDecimal AV76Formulaciontinte_webverformulacompletads_11_tfescmfaccon ;
   private java.math.BigDecimal AV43TFEscMFacCon ;
   private java.math.BigDecimal AV77Formulaciontinte_webverformulacompletads_12_tfescmfaccon_to ;
   private java.math.BigDecimal AV44TFEscMFacCon_To ;
   private java.math.BigDecimal AV80Formulaciontinte_webverformulacompletads_15_tfescmcan ;
   private java.math.BigDecimal AV47TFEscMCan ;
   private java.math.BigDecimal AV81Formulaciontinte_webverformulacompletads_16_tfescmcan_to ;
   private java.math.BigDecimal AV48TFEscMCan_To ;
   private java.math.BigDecimal AV53ForRelBan ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV61Clave ;
   private String AV57ForSer ;
   private String AV58ForColNom ;
   private String A764ProForCod ;
   private String A766ProForDsc ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String A488ForPrdDsc ;
   private String AV68Formulaciontinte_webverformulacompletads_3_tfproforcod ;
   private String AV35TFProForCod ;
   private String AV69Formulaciontinte_webverformulacompletads_4_tfproforcod_sel ;
   private String AV36TFProForCod_Sel ;
   private String AV70Formulaciontinte_webverformulacompletads_5_tfprofordsc ;
   private String AV37TFProForDsc ;
   private String AV71Formulaciontinte_webverformulacompletads_6_tfprofordsc_sel ;
   private String AV38TFProForDsc_Sel ;
   private String AV72Formulaciontinte_webverformulacompletads_7_tfprdnum ;
   private String AV39TFPrdNum ;
   private String AV73Formulaciontinte_webverformulacompletads_8_tfprdnum_sel ;
   private String AV40TFPrdNum_Sel ;
   private String AV74Formulaciontinte_webverformulacompletads_9_tfprdnom ;
   private String AV41TFPrdNom ;
   private String AV75Formulaciontinte_webverformulacompletads_10_tfprdnom_sel ;
   private String AV42TFPrdNom_Sel ;
   private String AV78Formulaciontinte_webverformulacompletads_13_tfforprddsc ;
   private String AV45TFForPrdDsc ;
   private String AV79Formulaciontinte_webverformulacompletads_14_tfforprddsc_sel ;
   private String AV46TFForPrdDsc_Sel ;
   private String scmdbuf ;
   private String lV68Formulaciontinte_webverformulacompletads_3_tfproforcod ;
   private String lV70Formulaciontinte_webverformulacompletads_5_tfprofordsc ;
   private String lV72Formulaciontinte_webverformulacompletads_7_tfprdnum ;
   private String lV74Formulaciontinte_webverformulacompletads_9_tfprdnom ;
   private String lV78Formulaciontinte_webverformulacompletads_13_tfforprddsc ;
   private String AV51Emprcod ;
   private String AV52Station ;
   private String A396EmprCod ;
   private String A910Workstat ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean n488ForPrdDsc ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV62WebSession ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private byte[] P08KF2_A490ForPrdUMe ;
   private String[] P08KF2_A910Workstat ;
   private String[] P08KF2_A396EmprCod ;
   private java.math.BigDecimal[] P08KF2_A890EscMCan ;
   private String[] P08KF2_A488ForPrdDsc ;
   private boolean[] P08KF2_n488ForPrdDsc ;
   private java.math.BigDecimal[] P08KF2_A4712EscMFacCon ;
   private String[] P08KF2_A718PrdNom ;
   private String[] P08KF2_A719PrdNum ;
   private String[] P08KF2_A766ProForDsc ;
   private String[] P08KF2_A764ProForCod ;
   private int[] P08KF2_A887EscMLin ;
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

final  class webverformulacompletaexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08KF2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV66Formulaciontinte_webverformulacompletads_1_tfescmlin ,
                                          int AV67Formulaciontinte_webverformulacompletads_2_tfescmlin_to ,
                                          String AV69Formulaciontinte_webverformulacompletads_4_tfproforcod_sel ,
                                          String AV68Formulaciontinte_webverformulacompletads_3_tfproforcod ,
                                          String AV71Formulaciontinte_webverformulacompletads_6_tfprofordsc_sel ,
                                          String AV70Formulaciontinte_webverformulacompletads_5_tfprofordsc ,
                                          String AV73Formulaciontinte_webverformulacompletads_8_tfprdnum_sel ,
                                          String AV72Formulaciontinte_webverformulacompletads_7_tfprdnum ,
                                          String AV75Formulaciontinte_webverformulacompletads_10_tfprdnom_sel ,
                                          String AV74Formulaciontinte_webverformulacompletads_9_tfprdnom ,
                                          java.math.BigDecimal AV76Formulaciontinte_webverformulacompletads_11_tfescmfaccon ,
                                          java.math.BigDecimal AV77Formulaciontinte_webverformulacompletads_12_tfescmfaccon_to ,
                                          String AV79Formulaciontinte_webverformulacompletads_14_tfforprddsc_sel ,
                                          String AV78Formulaciontinte_webverformulacompletads_13_tfforprddsc ,
                                          java.math.BigDecimal AV80Formulaciontinte_webverformulacompletads_15_tfescmcan ,
                                          java.math.BigDecimal AV81Formulaciontinte_webverformulacompletads_16_tfescmcan_to ,
                                          int A887EscMLin ,
                                          String A764ProForCod ,
                                          String A766ProForDsc ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A4712EscMFacCon ,
                                          String A488ForPrdDsc ,
                                          java.math.BigDecimal A890EscMCan ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc ,
                                          String AV51Emprcod ,
                                          String AV52Station ,
                                          String A396EmprCod ,
                                          String A910Workstat )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[18];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.ForPrdUMe, T1.Workstat, T1.EmprCod, T1.EscMCan, T2.ForPrdDsc, T1.EscMFacCon, T3.PrdNom, T1.PrdNum, T4.ProForDsc, T1.ProForCod, T1.EscMLin FROM (((TXPESCMAN" ;
      scmdbuf += " T1 INNER JOIN TXPUNMEPR T2 ON T2.EmprCod = T1.EmprCod AND T2.ForPrdUMe = T1.ForPrdUMe) INNER JOIN TXPPRODUC T3 ON T3.EmprCod = T1.EmprCod AND T3.PrdNum = T1.PrdNum)" ;
      scmdbuf += " INNER JOIN TXPCPROFO T4 ON T4.EmprCod = T1.EmprCod AND T4.ProForCod = T1.ProForCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.Workstat = ?)");
      if ( ! (0==AV66Formulaciontinte_webverformulacompletads_1_tfescmlin) )
      {
         addWhere(sWhereString, "(T1.EscMLin >= ?)");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
      }
      if ( ! (0==AV67Formulaciontinte_webverformulacompletads_2_tfescmlin_to) )
      {
         addWhere(sWhereString, "(T1.EscMLin <= ?)");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Formulaciontinte_webverformulacompletads_4_tfproforcod_sel)==0) && ( ! (GXutil.strcmp("", AV68Formulaciontinte_webverformulacompletads_3_tfproforcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProForCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Formulaciontinte_webverformulacompletads_4_tfproforcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProForCod = ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Formulaciontinte_webverformulacompletads_6_tfprofordsc_sel)==0) && ( ! (GXutil.strcmp("", AV70Formulaciontinte_webverformulacompletads_5_tfprofordsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProForDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Formulaciontinte_webverformulacompletads_6_tfprofordsc_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProForDsc = ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Formulaciontinte_webverformulacompletads_8_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV72Formulaciontinte_webverformulacompletads_7_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Formulaciontinte_webverformulacompletads_8_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Formulaciontinte_webverformulacompletads_10_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV74Formulaciontinte_webverformulacompletads_9_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Formulaciontinte_webverformulacompletads_10_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.PrdNom = ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Formulaciontinte_webverformulacompletads_11_tfescmfaccon)==0) )
      {
         addWhere(sWhereString, "(T1.EscMFacCon >= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Formulaciontinte_webverformulacompletads_12_tfescmfaccon_to)==0) )
      {
         addWhere(sWhereString, "(T1.EscMFacCon <= ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Formulaciontinte_webverformulacompletads_14_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV78Formulaciontinte_webverformulacompletads_13_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Formulaciontinte_webverformulacompletads_14_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Formulaciontinte_webverformulacompletads_15_tfescmcan)==0) )
      {
         addWhere(sWhereString, "(T1.EscMCan >= ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Formulaciontinte_webverformulacompletads_16_tfescmcan_to)==0) )
      {
         addWhere(sWhereString, "(T1.EscMCan <= ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EscMLin" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EscMLin DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ProForCod" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ProForCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T4.ProForDsc" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.ProForDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNum" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNum DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.PrdNom" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.PrdNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EscMFacCon" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EscMFacCon DESC" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.ForPrdDsc" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.ForPrdDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EscMCan" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EscMCan DESC" ;
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
                  return conditional_P08KF2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (String)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , ((Number) dynConstraints[24]).shortValue() , ((Boolean) dynConstraints[25]).booleanValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08KF2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((String[]) buf[4])[0] = rslt.getString(5, 5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,5);
               ((String[]) buf[7])[0] = rslt.getString(7, 26);
               ((String[]) buf[8])[0] = rslt.getString(8, 6);
               ((String[]) buf[9])[0] = rslt.getString(9, 30);
               ((String[]) buf[10])[0] = rslt.getString(10, 6);
               ((int[]) buf[11])[0] = rslt.getInt(11);
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
                  stmt.setString(sIdx, (String)parms[19], 10);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[20]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[21]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 26);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 26);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[30], 5);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[31], 5);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 5);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 5);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 4);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 4);
               }
               return;
      }
   }

}

