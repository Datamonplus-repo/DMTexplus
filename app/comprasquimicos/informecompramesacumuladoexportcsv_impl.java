package app.comprasquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class informecompramesacumuladoexportcsv_impl extends GXWebProcedure
{
   public informecompramesacumuladoexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "InformeCompraMesAcumuladoExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("ComprasQuimicos.InformeCompraMesAcumuladoColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("ComprasQuimicos.InformeCompraMesAcumuladoColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Mes", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Producto", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Unidades Compradas", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Valor Compras", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV54Comprasquimicos_informecompramesacumuladods_1_filterfulltext = AV30FilterFullText ;
      AV55Comprasquimicos_informecompramesacumuladods_2_tfprdnummes = AV34TFPrdNumMes ;
      AV56Comprasquimicos_informecompramesacumuladods_3_tfprdnummes_to = AV35TFPrdNumMes_To ;
      AV57Comprasquimicos_informecompramesacumuladods_4_tfprdnum = AV36TFPrdNum ;
      AV58Comprasquimicos_informecompramesacumuladods_5_tfprdnum_sel = AV37TFPrdNum_Sel ;
      AV59Comprasquimicos_informecompramesacumuladods_6_tfprdnom = AV38TFPrdNom ;
      AV60Comprasquimicos_informecompramesacumuladods_7_tfprdnom_sel = AV39TFPrdNom_Sel ;
      AV61Comprasquimicos_informecompramesacumuladods_8_tfprdunicprm = AV40TFPrdUniCprM ;
      AV62Comprasquimicos_informecompramesacumuladods_9_tfprdunicprm_to = AV41TFPrdUniCprM_To ;
      AV63Comprasquimicos_informecompramesacumuladods_10_tfprdvalcprm = AV42TFPrdValCprM ;
      AV64Comprasquimicos_informecompramesacumuladods_11_tfprdvalcprm_to = AV43TFPrdValCprM_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV54Comprasquimicos_informecompramesacumuladods_1_filterfulltext ,
                                           Byte.valueOf(AV55Comprasquimicos_informecompramesacumuladods_2_tfprdnummes) ,
                                           Byte.valueOf(AV56Comprasquimicos_informecompramesacumuladods_3_tfprdnummes_to) ,
                                           AV58Comprasquimicos_informecompramesacumuladods_5_tfprdnum_sel ,
                                           AV57Comprasquimicos_informecompramesacumuladods_4_tfprdnum ,
                                           AV60Comprasquimicos_informecompramesacumuladods_7_tfprdnom_sel ,
                                           AV59Comprasquimicos_informecompramesacumuladods_6_tfprdnom ,
                                           AV61Comprasquimicos_informecompramesacumuladods_8_tfprdunicprm ,
                                           AV62Comprasquimicos_informecompramesacumuladods_9_tfprdunicprm_to ,
                                           AV63Comprasquimicos_informecompramesacumuladods_10_tfprdvalcprm ,
                                           AV64Comprasquimicos_informecompramesacumuladods_11_tfprdvalcprm_to ,
                                           Byte.valueOf(A720PrdNumMes) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A745PrdUniCprM ,
                                           A749PrdValCprM ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) ,
                                           Integer.valueOf(A795PrvNum) ,
                                           Integer.valueOf(AV47PrvNum) ,
                                           Integer.valueOf(AV48UProv) ,
                                           AV44Emprcod ,
                                           AV45PrdNum ,
                                           Short.valueOf(AV49Any) ,
                                           Byte.valueOf(AV50Mes) ,
                                           A396EmprCod ,
                                           AV46UProd } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV54Comprasquimicos_informecompramesacumuladods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Comprasquimicos_informecompramesacumuladods_1_filterfulltext), "%", "") ;
      lV54Comprasquimicos_informecompramesacumuladods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Comprasquimicos_informecompramesacumuladods_1_filterfulltext), "%", "") ;
      lV54Comprasquimicos_informecompramesacumuladods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Comprasquimicos_informecompramesacumuladods_1_filterfulltext), "%", "") ;
      lV54Comprasquimicos_informecompramesacumuladods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Comprasquimicos_informecompramesacumuladods_1_filterfulltext), "%", "") ;
      lV54Comprasquimicos_informecompramesacumuladods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Comprasquimicos_informecompramesacumuladods_1_filterfulltext), "%", "") ;
      lV57Comprasquimicos_informecompramesacumuladods_4_tfprdnum = GXutil.padr( GXutil.rtrim( AV57Comprasquimicos_informecompramesacumuladods_4_tfprdnum), 6, "%") ;
      lV59Comprasquimicos_informecompramesacumuladods_6_tfprdnom = GXutil.padr( GXutil.rtrim( AV59Comprasquimicos_informecompramesacumuladods_6_tfprdnom), 26, "%") ;
      /* Using cursor P09GD2 */
      pr_default.execute(0, new Object[] {AV44Emprcod, AV45PrdNum, Short.valueOf(AV49Any), Byte.valueOf(AV50Mes), Integer.valueOf(AV47PrvNum), Integer.valueOf(AV48UProv), AV46UProd, lV54Comprasquimicos_informecompramesacumuladods_1_filterfulltext, lV54Comprasquimicos_informecompramesacumuladods_1_filterfulltext, lV54Comprasquimicos_informecompramesacumuladods_1_filterfulltext, lV54Comprasquimicos_informecompramesacumuladods_1_filterfulltext, lV54Comprasquimicos_informecompramesacumuladods_1_filterfulltext, Byte.valueOf(AV55Comprasquimicos_informecompramesacumuladods_2_tfprdnummes), Byte.valueOf(AV56Comprasquimicos_informecompramesacumuladods_3_tfprdnummes_to), lV57Comprasquimicos_informecompramesacumuladods_4_tfprdnum, AV58Comprasquimicos_informecompramesacumuladods_5_tfprdnum_sel, lV59Comprasquimicos_informecompramesacumuladods_6_tfprdnom, AV60Comprasquimicos_informecompramesacumuladods_7_tfprdnom_sel, AV61Comprasquimicos_informecompramesacumuladods_8_tfprdunicprm, AV62Comprasquimicos_informecompramesacumuladods_9_tfprdunicprm_to, AV63Comprasquimicos_informecompramesacumuladods_10_tfprdvalcprm, AV64Comprasquimicos_informecompramesacumuladods_11_tfprdvalcprm_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A681PrdAny = P09GD2_A681PrdAny[0] ;
         A795PrvNum = P09GD2_A795PrvNum[0] ;
         A396EmprCod = P09GD2_A396EmprCod[0] ;
         A749PrdValCprM = P09GD2_A749PrdValCprM[0] ;
         A745PrdUniCprM = P09GD2_A745PrdUniCprM[0] ;
         A718PrdNom = P09GD2_A718PrdNom[0] ;
         A719PrdNum = P09GD2_A719PrdNum[0] ;
         A720PrdNumMes = P09GD2_A720PrdNumMes[0] ;
         A795PrvNum = P09GD2_A795PrvNum[0] ;
         A718PrdNom = P09GD2_A718PrdNom[0] ;
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
            AV14TextFileLine += GXutil.str( A720PrdNumMes, 2, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A719PrdNum, ";", ","), GXv_char3) ;
            informecompramesacumuladoexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A718PrdNom, ";", ","), GXv_char3) ;
            informecompramesacumuladoexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A745PrdUniCprM, 10, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A749PrdValCprM, 12, 2) ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=InformeCompraMesAcumuladoExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdNumMes", "", "Mes", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdNum", "", "Producto", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdNom", "", "Descripcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdUniCprM", "", "Unidades Compradas", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdValCprM", "", "Valor Compras", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "ComprasQuimicos.InformeCompraMesAcumuladoColumnsSelector", GXv_char3) ;
      informecompramesacumuladoexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("ComprasQuimicos.InformeCompraMesAcumuladoGridState"), "") == 0 )
      {
         AV32GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "ComprasQuimicos.InformeCompraMesAcumuladoGridState"), null, null);
      }
      else
      {
         AV32GridState.fromxml(AV19Session.getValue("ComprasQuimicos.InformeCompraMesAcumuladoGridState"), null, null);
      }
      AV28OrderedBy = AV32GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV32GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV65GXV1 = 1 ;
      while ( AV65GXV1 <= AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV65GXV1));
         if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EmprCod") == 0 )
         {
            AV44Emprcod = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRDNUM") == 0 )
         {
            AV45PrdNum = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&UProd") == 0 )
         {
            AV46UProd = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRVNUM") == 0 )
         {
            AV47PrvNum = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&UProv") == 0 )
         {
            AV48UProv = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&Mes") == 0 )
         {
            AV50Mes = (byte)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&Any") == 0 )
         {
            AV49Any = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV65GXV1 = (int)(AV65GXV1+1) ;
      }
      if ( 1 == 0 )
      {
         if ( GXutil.strcmp(AV19Session.getValue("ComprasQuimicos.InformeCompraMesAcumuladoGridState"), "") == 0 )
         {
            AV32GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "ComprasQuimicos.InformeCompraMesAcumuladoGridState"), null, null);
         }
         else
         {
            AV32GridState.fromxml(AV19Session.getValue("ComprasQuimicos.InformeCompraMesAcumuladoGridState"), null, null);
         }
         AV28OrderedBy = AV32GridState.getgxTv_SdtWWPGridState_Orderedby() ;
         AV29OrderedDsc = AV32GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
         AV66GXV2 = 1 ;
         while ( AV66GXV2 <= AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
         {
            AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV66GXV2));
            if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
            {
               AV30FilterFullText = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            }
            else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUMMES") == 0 )
            {
               AV34TFPrdNumMes = (byte)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
               AV35TFPrdNumMes_To = (byte)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            }
            else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
            {
               AV36TFPrdNum = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            }
            else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
            {
               AV37TFPrdNum_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            }
            else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
            {
               AV38TFPrdNom = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            }
            else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
            {
               AV39TFPrdNom_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            }
            else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDUNICPRM") == 0 )
            {
               AV40TFPrdUniCprM = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
               AV41TFPrdUniCprM_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            }
            else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDVALCPRM") == 0 )
            {
               AV42TFPrdValCprM = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
               AV43TFPrdValCprM_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            }
            AV66GXV2 = (int)(AV66GXV2+1) ;
         }
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
      A745PrdUniCprM = DecimalUtil.ZERO ;
      A749PrdValCprM = DecimalUtil.ZERO ;
      AV54Comprasquimicos_informecompramesacumuladods_1_filterfulltext = "" ;
      AV30FilterFullText = "" ;
      AV57Comprasquimicos_informecompramesacumuladods_4_tfprdnum = "" ;
      AV36TFPrdNum = "" ;
      AV58Comprasquimicos_informecompramesacumuladods_5_tfprdnum_sel = "" ;
      AV37TFPrdNum_Sel = "" ;
      AV59Comprasquimicos_informecompramesacumuladods_6_tfprdnom = "" ;
      AV38TFPrdNom = "" ;
      AV60Comprasquimicos_informecompramesacumuladods_7_tfprdnom_sel = "" ;
      AV39TFPrdNom_Sel = "" ;
      AV61Comprasquimicos_informecompramesacumuladods_8_tfprdunicprm = DecimalUtil.ZERO ;
      AV40TFPrdUniCprM = DecimalUtil.ZERO ;
      AV62Comprasquimicos_informecompramesacumuladods_9_tfprdunicprm_to = DecimalUtil.ZERO ;
      AV41TFPrdUniCprM_To = DecimalUtil.ZERO ;
      AV63Comprasquimicos_informecompramesacumuladods_10_tfprdvalcprm = DecimalUtil.ZERO ;
      AV42TFPrdValCprM = DecimalUtil.ZERO ;
      AV64Comprasquimicos_informecompramesacumuladods_11_tfprdvalcprm_to = DecimalUtil.ZERO ;
      AV43TFPrdValCprM_To = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV54Comprasquimicos_informecompramesacumuladods_1_filterfulltext = "" ;
      lV57Comprasquimicos_informecompramesacumuladods_4_tfprdnum = "" ;
      lV59Comprasquimicos_informecompramesacumuladods_6_tfprdnom = "" ;
      AV44Emprcod = "" ;
      AV45PrdNum = "" ;
      A396EmprCod = "" ;
      AV46UProd = "" ;
      P09GD2_A681PrdAny = new short[1] ;
      P09GD2_A795PrvNum = new int[1] ;
      P09GD2_A396EmprCod = new String[] {""} ;
      P09GD2_A749PrdValCprM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09GD2_A745PrdUniCprM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09GD2_A718PrdNom = new String[] {""} ;
      P09GD2_A719PrdNum = new String[] {""} ;
      P09GD2_A720PrdNumMes = new byte[1] ;
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
      pr_default = new DataStoreProvider(context, remoteHandle, new app.comprasquimicos.informecompramesacumuladoexportcsv__default(),
         new Object[] {
             new Object[] {
            P09GD2_A681PrdAny, P09GD2_A795PrvNum, P09GD2_A396EmprCod, P09GD2_A749PrdValCprM, P09GD2_A745PrdUniCprM, P09GD2_A718PrdNom, P09GD2_A719PrdNum, P09GD2_A720PrdNumMes
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A720PrdNumMes ;
   private byte AV55Comprasquimicos_informecompramesacumuladods_2_tfprdnummes ;
   private byte AV34TFPrdNumMes ;
   private byte AV56Comprasquimicos_informecompramesacumuladods_3_tfprdnummes_to ;
   private byte AV35TFPrdNumMes_To ;
   private byte AV50Mes ;
   private short gxcookieaux ;
   private short AV28OrderedBy ;
   private short AV49Any ;
   private short A681PrdAny ;
   private short Gx_err ;
   private int AV13Random ;
   private int A795PrvNum ;
   private int AV47PrvNum ;
   private int AV48UProv ;
   private int AV65GXV1 ;
   private int AV66GXV2 ;
   private java.math.BigDecimal A745PrdUniCprM ;
   private java.math.BigDecimal A749PrdValCprM ;
   private java.math.BigDecimal AV61Comprasquimicos_informecompramesacumuladods_8_tfprdunicprm ;
   private java.math.BigDecimal AV40TFPrdUniCprM ;
   private java.math.BigDecimal AV62Comprasquimicos_informecompramesacumuladods_9_tfprdunicprm_to ;
   private java.math.BigDecimal AV41TFPrdUniCprM_To ;
   private java.math.BigDecimal AV63Comprasquimicos_informecompramesacumuladods_10_tfprdvalcprm ;
   private java.math.BigDecimal AV42TFPrdValCprM ;
   private java.math.BigDecimal AV64Comprasquimicos_informecompramesacumuladods_11_tfprdvalcprm_to ;
   private java.math.BigDecimal AV43TFPrdValCprM_To ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String AV57Comprasquimicos_informecompramesacumuladods_4_tfprdnum ;
   private String AV36TFPrdNum ;
   private String AV58Comprasquimicos_informecompramesacumuladods_5_tfprdnum_sel ;
   private String AV37TFPrdNum_Sel ;
   private String AV59Comprasquimicos_informecompramesacumuladods_6_tfprdnom ;
   private String AV38TFPrdNom ;
   private String AV60Comprasquimicos_informecompramesacumuladods_7_tfprdnom_sel ;
   private String AV39TFPrdNom_Sel ;
   private String scmdbuf ;
   private String lV57Comprasquimicos_informecompramesacumuladods_4_tfprdnum ;
   private String lV59Comprasquimicos_informecompramesacumuladods_6_tfprdnom ;
   private String AV44Emprcod ;
   private String AV45PrdNum ;
   private String A396EmprCod ;
   private String AV46UProd ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV54Comprasquimicos_informecompramesacumuladods_1_filterfulltext ;
   private String AV30FilterFullText ;
   private String lV54Comprasquimicos_informecompramesacumuladods_1_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private short[] P09GD2_A681PrdAny ;
   private int[] P09GD2_A795PrvNum ;
   private String[] P09GD2_A396EmprCod ;
   private java.math.BigDecimal[] P09GD2_A749PrdValCprM ;
   private java.math.BigDecimal[] P09GD2_A745PrdUniCprM ;
   private String[] P09GD2_A718PrdNom ;
   private String[] P09GD2_A719PrdNum ;
   private byte[] P09GD2_A720PrdNumMes ;
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

final  class informecompramesacumuladoexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09GD2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV54Comprasquimicos_informecompramesacumuladods_1_filterfulltext ,
                                          byte AV55Comprasquimicos_informecompramesacumuladods_2_tfprdnummes ,
                                          byte AV56Comprasquimicos_informecompramesacumuladods_3_tfprdnummes_to ,
                                          String AV58Comprasquimicos_informecompramesacumuladods_5_tfprdnum_sel ,
                                          String AV57Comprasquimicos_informecompramesacumuladods_4_tfprdnum ,
                                          String AV60Comprasquimicos_informecompramesacumuladods_7_tfprdnom_sel ,
                                          String AV59Comprasquimicos_informecompramesacumuladods_6_tfprdnom ,
                                          java.math.BigDecimal AV61Comprasquimicos_informecompramesacumuladods_8_tfprdunicprm ,
                                          java.math.BigDecimal AV62Comprasquimicos_informecompramesacumuladods_9_tfprdunicprm_to ,
                                          java.math.BigDecimal AV63Comprasquimicos_informecompramesacumuladods_10_tfprdvalcprm ,
                                          java.math.BigDecimal AV64Comprasquimicos_informecompramesacumuladods_11_tfprdvalcprm_to ,
                                          byte A720PrdNumMes ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A745PrdUniCprM ,
                                          java.math.BigDecimal A749PrdValCprM ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc ,
                                          int A795PrvNum ,
                                          int AV47PrvNum ,
                                          int AV48UProv ,
                                          String AV44Emprcod ,
                                          String AV45PrdNum ,
                                          short AV49Any ,
                                          byte AV50Mes ,
                                          String A396EmprCod ,
                                          String AV46UProd )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[22];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.PrdAny, T2.PrvNum, T1.EmprCod, T1.PrdValCprM, T1.PrdUniCprM, T2.PrdNom, T1.PrdNum, T1.PrdNumMes FROM (TXPLPRDES T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.PrdNum >= ? and T1.PrdAny = ? and T1.PrdNumMes = ?)");
      addWhere(sWhereString, "(T2.PrvNum >= ?)");
      addWhere(sWhereString, "(T2.PrvNum <= ?)");
      addWhere(sWhereString, "(T1.PrdUniCprM <> 0)");
      addWhere(sWhereString, "(T1.PrdValCprM <> 0)");
      addWhere(sWhereString, "(T1.PrdNum <= ?)");
      if ( ! (GXutil.strcmp("", AV54Comprasquimicos_informecompramesacumuladods_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.PrdNumMes,'90'), 2) like '%' || ?) or ( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T2.PrdNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrdUniCprM,'9999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PrdValCprM,'999999990.99'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
         GXv_int6[8] = (byte)(1) ;
         GXv_int6[9] = (byte)(1) ;
         GXv_int6[10] = (byte)(1) ;
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (0==AV55Comprasquimicos_informecompramesacumuladods_2_tfprdnummes) )
      {
         addWhere(sWhereString, "(T1.PrdNumMes >= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (0==AV56Comprasquimicos_informecompramesacumuladods_3_tfprdnummes_to) )
      {
         addWhere(sWhereString, "(T1.PrdNumMes <= ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV58Comprasquimicos_informecompramesacumuladods_5_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV57Comprasquimicos_informecompramesacumuladods_4_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Comprasquimicos_informecompramesacumuladods_5_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Comprasquimicos_informecompramesacumuladods_7_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV59Comprasquimicos_informecompramesacumuladods_6_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Comprasquimicos_informecompramesacumuladods_7_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV61Comprasquimicos_informecompramesacumuladods_8_tfprdunicprm)==0) )
      {
         addWhere(sWhereString, "(T1.PrdUniCprM >= ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV62Comprasquimicos_informecompramesacumuladods_9_tfprdunicprm_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdUniCprM <= ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV63Comprasquimicos_informecompramesacumuladods_10_tfprdvalcprm)==0) )
      {
         addWhere(sWhereString, "(T1.PrdValCprM >= ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV64Comprasquimicos_informecompramesacumuladods_11_tfprdvalcprm_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdValCprM <= ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdUniCprM" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdUniCprM DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNumMes" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNumMes DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNum" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNum DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.PrdNom" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.PrdNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdValCprM" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdValCprM DESC" ;
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
                  return conditional_P09GD2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).byteValue() , ((Number) dynConstraints[2]).byteValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , ((Number) dynConstraints[11]).byteValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Boolean) dynConstraints[17]).booleanValue() , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).shortValue() , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (String)dynConstraints[26] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09GD2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
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
                  stmt.setString(sIdx, (String)parms[23], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[24]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[25]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[26]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[27]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[34]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[35]).byteValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 6);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 26);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 26);
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
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[42], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[43], 2);
               }
               return;
      }
   }

}

