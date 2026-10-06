package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class listadodeprecios_wcexportcsv_impl extends GXWebProcedure
{
   public listadodeprecios_wcexportcsv_impl( com.genexus.internet.HttpContext context )
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
      GXv_SdtWWPContext1[0] = AV54WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext1) ;
      AV54WWPContext = GXv_SdtWWPContext1[0] ;
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
      AV32Random = (int)(GXutil.random( )*10000) ;
      AV18Filename = "./PrivateTempStorage/" + "ListadodePrecios_WCExportCSV-" + GXutil.trim( GXutil.str( AV32Random, 8, 0)) + ".csv" ;
      AV34TextFile.setSource( AV18Filename );
      AV34TextFile.create();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      AV34TextFile.openWrite("");
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
   }

   public void S131( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV35TextFileLine = "" ;
      if ( GXutil.strcmp(AV33Session.getValue("ListadodePrecios_WCColumnsSelector"), "") != 0 )
      {
         AV12ColumnsSelectorXML = AV33Session.getValue("ListadodePrecios_WCColumnsSelector") ;
         AV9ColumnsSelector.fromxml(AV12ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV35TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV9ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Producto", "") : "") ;
      AV35TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV9ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      AV35TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV9ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Proveedor", "") : "") ;
      AV35TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV9ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre", "") : "") ;
      AV35TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV9ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Referencia", "") : "") ;
      AV35TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV9ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Precio", "") : "") ;
      AV35TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV9ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha", "") : "") ;
      AV35TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV9ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Validez", "") : "") ;
      if ( GXutil.len( AV35TextFileLine) > 0 )
      {
         AV34TextFile.writeLine(GXutil.substring( AV35TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV58Listadodeprecios_wcds_1_filterfulltext = AV19FilterFullText ;
      AV59Listadodeprecios_wcds_2_tfprdnum = AV40TFPrdNum ;
      AV60Listadodeprecios_wcds_3_tfprdnum_sel = AV41TFPrdNum_Sel ;
      AV61Listadodeprecios_wcds_4_tfprdnom = AV38TFPrdNom ;
      AV62Listadodeprecios_wcds_5_tfprdnom_sel = AV39TFPrdNom_Sel ;
      AV63Listadodeprecios_wcds_6_tfprvnum = AV48TFPrvNum ;
      AV64Listadodeprecios_wcds_7_tfprvnum_to = AV49TFPrvNum_To ;
      AV65Listadodeprecios_wcds_8_tfprvnom = AV46TFPrvNom ;
      AV66Listadodeprecios_wcds_9_tfprvnom_sel = AV47TFPrvNom_Sel ;
      AV67Listadodeprecios_wcds_10_tfprdrefprv = AV44TFPrdRefPrv ;
      AV68Listadodeprecios_wcds_11_tfprdrefprv_sel = AV45TFPrdRefPrv_Sel ;
      AV69Listadodeprecios_wcds_12_tfprdpreact = AV42TFPrdPreAct ;
      AV70Listadodeprecios_wcds_13_tfprdpreact_to = AV43TFPrdPreAct_To ;
      AV71Listadodeprecios_wcds_14_tfprdfecpre = AV36TFPrdFecPre ;
      AV72Listadodeprecios_wcds_15_tfvaldsc = AV50TFValDsc ;
      AV73Listadodeprecios_wcds_16_tfvaldsc_sel = AV51TFValDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV58Listadodeprecios_wcds_1_filterfulltext ,
                                           AV60Listadodeprecios_wcds_3_tfprdnum_sel ,
                                           AV59Listadodeprecios_wcds_2_tfprdnum ,
                                           AV62Listadodeprecios_wcds_5_tfprdnom_sel ,
                                           AV61Listadodeprecios_wcds_4_tfprdnom ,
                                           Integer.valueOf(AV63Listadodeprecios_wcds_6_tfprvnum) ,
                                           Integer.valueOf(AV64Listadodeprecios_wcds_7_tfprvnum_to) ,
                                           AV66Listadodeprecios_wcds_9_tfprvnom_sel ,
                                           AV65Listadodeprecios_wcds_8_tfprvnom ,
                                           AV68Listadodeprecios_wcds_11_tfprdrefprv_sel ,
                                           AV67Listadodeprecios_wcds_10_tfprdrefprv ,
                                           AV69Listadodeprecios_wcds_12_tfprdpreact ,
                                           AV70Listadodeprecios_wcds_13_tfprdpreact_to ,
                                           AV71Listadodeprecios_wcds_14_tfprdfecpre ,
                                           AV73Listadodeprecios_wcds_16_tfvaldsc_sel ,
                                           AV72Listadodeprecios_wcds_15_tfvaldsc ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           Integer.valueOf(A795PrvNum) ,
                                           A794PrvNom ,
                                           A728PrdRefPrv ,
                                           A724PrdPreAct ,
                                           A857ValDsc ,
                                           A709PrdFecPre ,
                                           Short.valueOf(AV26OrderedBy) ,
                                           Boolean.valueOf(AV27OrderedDsc) ,
                                           Integer.valueOf(AV30PrvNum) ,
                                           Integer.valueOf(AV31PrvNum_to) ,
                                           AV16Emprcod ,
                                           AV28Prdnum ,
                                           A396EmprCod ,
                                           AV29Prdnum_to } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV58Listadodeprecios_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV58Listadodeprecios_wcds_1_filterfulltext), "%", "") ;
      lV58Listadodeprecios_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV58Listadodeprecios_wcds_1_filterfulltext), "%", "") ;
      lV58Listadodeprecios_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV58Listadodeprecios_wcds_1_filterfulltext), "%", "") ;
      lV58Listadodeprecios_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV58Listadodeprecios_wcds_1_filterfulltext), "%", "") ;
      lV58Listadodeprecios_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV58Listadodeprecios_wcds_1_filterfulltext), "%", "") ;
      lV58Listadodeprecios_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV58Listadodeprecios_wcds_1_filterfulltext), "%", "") ;
      lV58Listadodeprecios_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV58Listadodeprecios_wcds_1_filterfulltext), "%", "") ;
      lV59Listadodeprecios_wcds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV59Listadodeprecios_wcds_2_tfprdnum), 6, "%") ;
      lV61Listadodeprecios_wcds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV61Listadodeprecios_wcds_4_tfprdnom), 26, "%") ;
      lV65Listadodeprecios_wcds_8_tfprvnom = GXutil.padr( GXutil.rtrim( AV65Listadodeprecios_wcds_8_tfprvnom), 30, "%") ;
      lV67Listadodeprecios_wcds_10_tfprdrefprv = GXutil.padr( GXutil.rtrim( AV67Listadodeprecios_wcds_10_tfprdrefprv), 30, "%") ;
      lV72Listadodeprecios_wcds_15_tfvaldsc = GXutil.padr( GXutil.rtrim( AV72Listadodeprecios_wcds_15_tfvaldsc), 16, "%") ;
      /* Using cursor P09RZ2 */
      pr_default.execute(0, new Object[] {AV16Emprcod, AV28Prdnum, Integer.valueOf(AV30PrvNum), Integer.valueOf(AV31PrvNum_to), AV29Prdnum_to, lV58Listadodeprecios_wcds_1_filterfulltext, lV58Listadodeprecios_wcds_1_filterfulltext, lV58Listadodeprecios_wcds_1_filterfulltext, lV58Listadodeprecios_wcds_1_filterfulltext, lV58Listadodeprecios_wcds_1_filterfulltext, lV58Listadodeprecios_wcds_1_filterfulltext, lV58Listadodeprecios_wcds_1_filterfulltext, lV59Listadodeprecios_wcds_2_tfprdnum, AV60Listadodeprecios_wcds_3_tfprdnum_sel, lV61Listadodeprecios_wcds_4_tfprdnom, AV62Listadodeprecios_wcds_5_tfprdnom_sel, Integer.valueOf(AV63Listadodeprecios_wcds_6_tfprvnum), Integer.valueOf(AV64Listadodeprecios_wcds_7_tfprvnum_to), lV65Listadodeprecios_wcds_8_tfprvnom, AV66Listadodeprecios_wcds_9_tfprvnom_sel, lV67Listadodeprecios_wcds_10_tfprdrefprv, AV68Listadodeprecios_wcds_11_tfprdrefprv_sel, AV69Listadodeprecios_wcds_12_tfprdpreact, AV70Listadodeprecios_wcds_13_tfprdpreact_to, AV71Listadodeprecios_wcds_14_tfprdfecpre, lV72Listadodeprecios_wcds_15_tfvaldsc, AV73Listadodeprecios_wcds_16_tfvaldsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A856ValCod = P09RZ2_A856ValCod[0] ;
         A396EmprCod = P09RZ2_A396EmprCod[0] ;
         A857ValDsc = P09RZ2_A857ValDsc[0] ;
         n857ValDsc = P09RZ2_n857ValDsc[0] ;
         A709PrdFecPre = P09RZ2_A709PrdFecPre[0] ;
         A724PrdPreAct = P09RZ2_A724PrdPreAct[0] ;
         A728PrdRefPrv = P09RZ2_A728PrdRefPrv[0] ;
         A794PrvNom = P09RZ2_A794PrvNom[0] ;
         n794PrvNom = P09RZ2_n794PrvNom[0] ;
         A795PrvNum = P09RZ2_A795PrvNum[0] ;
         A718PrdNom = P09RZ2_A718PrdNom[0] ;
         A719PrdNum = P09RZ2_A719PrdNum[0] ;
         A857ValDsc = P09RZ2_A857ValDsc[0] ;
         n857ValDsc = P09RZ2_n857ValDsc[0] ;
         A794PrvNom = P09RZ2_A794PrvNom[0] ;
         n794PrvNom = P09RZ2_n794PrvNom[0] ;
         AV35TextFileLine = "" ;
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
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV9ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV35TextFileLine += ";" ;
            GXt_char2 = AV35TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A719PrdNum, ";", ","), GXv_char3) ;
            listadodeprecios_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV35TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV9ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV35TextFileLine += ";" ;
            GXt_char2 = AV35TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A718PrdNom, ";", ","), GXv_char3) ;
            listadodeprecios_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV35TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV9ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV35TextFileLine += ";" ;
            AV35TextFileLine += GXutil.str( A795PrvNum, 6, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV9ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV35TextFileLine += ";" ;
            GXt_char2 = AV35TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A794PrvNom, ";", ","), GXv_char3) ;
            listadodeprecios_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV35TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV9ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV35TextFileLine += ";" ;
            GXt_char2 = AV35TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A728PrdRefPrv, ";", ","), GXv_char3) ;
            listadodeprecios_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV35TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV9ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV35TextFileLine += ";" ;
            AV35TextFileLine += GXutil.str( A724PrdPreAct, 14, 5) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV9ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV35TextFileLine += ";" ;
            AV35TextFileLine += localUtil.dtoc( A709PrdFecPre, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV9ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV35TextFileLine += ";" ;
            GXt_char2 = AV35TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A857ValDsc, ";", ","), GXv_char3) ;
            listadodeprecios_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV35TextFileLine += GXt_char2 ;
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
         if ( GXutil.len( AV35TextFileLine) > 0 )
         {
            AV34TextFile.writeLine(GXutil.substring( AV35TextFileLine, 2, -1));
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S181( )
   {
      /* 'CLOSEDOCUMENT' Routine */
      returnInSub = false ;
      AV34TextFile.close();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      if ( AV34TextFile.getErrCode() == 0 )
      {
         if ( ! httpContext.isAjaxRequest( ) )
         {
            AV23HttpResponse.addHeader("Content-Type", "text/csv");
         }
         if ( ! httpContext.isAjaxRequest( ) )
         {
            AV23HttpResponse.addHeader("Content-Disposition", "attachment;filename=ListadodePrecios_WCExportCSV.csv");
         }
         AV23HttpResponse.addFile(AV34TextFile.getAbsoluteName());
      }
   }

   public void S121( )
   {
      /* 'CHECKSTATUS' Routine */
      returnInSub = false ;
      if ( AV34TextFile.getErrCode() != 0 )
      {
         AV18Filename = "" ;
         AV17ErrorMessage = AV34TextFile.getErrDescription() ;
         AV34TextFile.close();
         AV23HttpResponse.addString(AV17ErrorMessage);
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
      AV9ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4[0] = AV9ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdNum", "", "Producto", true, "") ;
      AV9ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV9ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdNom", "", "Descripcion", true, "") ;
      AV9ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV9ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrvNum", "", "Proveedor", true, "") ;
      AV9ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV9ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrvNom", "", "Nombre", true, "") ;
      AV9ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV9ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdRefPrv", "", "Referencia", true, "") ;
      AV9ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV9ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdPreAct", "", "Precio", true, "") ;
      AV9ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV9ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdFecPre", "", "Fecha", true, "") ;
      AV9ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV9ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ValDsc", "", "Validez", true, "") ;
      AV9ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV52UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "ListadodePrecios_WCColumnsSelector", GXv_char3) ;
      listadodeprecios_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
      AV52UserCustomValue = GXt_char2 ;
      if ( ! ( (GXutil.strcmp("", AV52UserCustomValue)==0) ) )
      {
         AV11ColumnsSelectorAux.fromxml(AV52UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector4[0] = AV11ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector5[0] = AV9ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, GXv_SdtWWPColumnsSelector5) ;
         AV11ColumnsSelectorAux = GXv_SdtWWPColumnsSelector4[0] ;
         AV9ColumnsSelector = GXv_SdtWWPColumnsSelector5[0] ;
      }
   }

   public void S191( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV33Session.getValue("ListadodePrecios_WCGridState"), "") == 0 )
      {
         AV20GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "ListadodePrecios_WCGridState"), null, null);
      }
      else
      {
         AV20GridState.fromxml(AV33Session.getValue("ListadodePrecios_WCGridState"), null, null);
      }
      AV26OrderedBy = AV20GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV27OrderedDsc = AV20GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV74GXV1 = 1 ;
      while ( AV74GXV1 <= AV20GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV21GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV20GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV74GXV1));
         if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV19FilterFullText = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV40TFPrdNum = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV41TFPrdNum_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV38TFPrdNom = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV39TFPrdNom_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNUM") == 0 )
         {
            AV48TFPrvNum = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV49TFPrvNum_To = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNOM") == 0 )
         {
            AV46TFPrvNom = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNOM_SEL") == 0 )
         {
            AV47TFPrvNom_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDREFPRV") == 0 )
         {
            AV44TFPrdRefPrv = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDREFPRV_SEL") == 0 )
         {
            AV45TFPrdRefPrv_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDPREACT") == 0 )
         {
            AV42TFPrdPreAct = CommonUtil.decimalVal( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV43TFPrdPreAct_To = CommonUtil.decimalVal( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDFECPRE") == 0 )
         {
            AV36TFPrdFecPre = localUtil.ctod( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFVALDSC") == 0 )
         {
            AV50TFValDsc = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFVALDSC_SEL") == 0 )
         {
            AV51TFValDsc_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV16Emprcod = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRDNUM") == 0 )
         {
            AV28Prdnum = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRDNUM_TO") == 0 )
         {
            AV29Prdnum_to = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRVNUM") == 0 )
         {
            AV30PrvNum = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRVNUM_TO") == 0 )
         {
            AV31PrvNum_to = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV74GXV1 = (int)(AV74GXV1+1) ;
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
      AV54WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV18Filename = "" ;
      AV34TextFile = new com.genexus.util.GXFile();
      AV35TextFileLine = "" ;
      AV33Session = httpContext.getWebSession();
      AV12ColumnsSelectorXML = "" ;
      AV9ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      A794PrvNom = "" ;
      A728PrdRefPrv = "" ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A709PrdFecPre = GXutil.nullDate() ;
      A857ValDsc = "" ;
      AV58Listadodeprecios_wcds_1_filterfulltext = "" ;
      AV19FilterFullText = "" ;
      AV59Listadodeprecios_wcds_2_tfprdnum = "" ;
      AV40TFPrdNum = "" ;
      AV60Listadodeprecios_wcds_3_tfprdnum_sel = "" ;
      AV41TFPrdNum_Sel = "" ;
      AV61Listadodeprecios_wcds_4_tfprdnom = "" ;
      AV38TFPrdNom = "" ;
      AV62Listadodeprecios_wcds_5_tfprdnom_sel = "" ;
      AV39TFPrdNom_Sel = "" ;
      AV65Listadodeprecios_wcds_8_tfprvnom = "" ;
      AV46TFPrvNom = "" ;
      AV66Listadodeprecios_wcds_9_tfprvnom_sel = "" ;
      AV47TFPrvNom_Sel = "" ;
      AV67Listadodeprecios_wcds_10_tfprdrefprv = "" ;
      AV44TFPrdRefPrv = "" ;
      AV68Listadodeprecios_wcds_11_tfprdrefprv_sel = "" ;
      AV45TFPrdRefPrv_Sel = "" ;
      AV69Listadodeprecios_wcds_12_tfprdpreact = DecimalUtil.ZERO ;
      AV42TFPrdPreAct = DecimalUtil.ZERO ;
      AV70Listadodeprecios_wcds_13_tfprdpreact_to = DecimalUtil.ZERO ;
      AV43TFPrdPreAct_To = DecimalUtil.ZERO ;
      AV71Listadodeprecios_wcds_14_tfprdfecpre = GXutil.nullDate() ;
      AV36TFPrdFecPre = GXutil.nullDate() ;
      AV72Listadodeprecios_wcds_15_tfvaldsc = "" ;
      AV50TFValDsc = "" ;
      AV73Listadodeprecios_wcds_16_tfvaldsc_sel = "" ;
      AV51TFValDsc_Sel = "" ;
      scmdbuf = "" ;
      lV58Listadodeprecios_wcds_1_filterfulltext = "" ;
      lV59Listadodeprecios_wcds_2_tfprdnum = "" ;
      lV61Listadodeprecios_wcds_4_tfprdnom = "" ;
      lV65Listadodeprecios_wcds_8_tfprvnom = "" ;
      lV67Listadodeprecios_wcds_10_tfprdrefprv = "" ;
      lV72Listadodeprecios_wcds_15_tfvaldsc = "" ;
      AV16Emprcod = "" ;
      AV28Prdnum = "" ;
      A396EmprCod = "" ;
      AV29Prdnum_to = "" ;
      P09RZ2_A856ValCod = new byte[1] ;
      P09RZ2_A396EmprCod = new String[] {""} ;
      P09RZ2_A857ValDsc = new String[] {""} ;
      P09RZ2_n857ValDsc = new boolean[] {false} ;
      P09RZ2_A709PrdFecPre = new java.util.Date[] {GXutil.nullDate()} ;
      P09RZ2_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09RZ2_A728PrdRefPrv = new String[] {""} ;
      P09RZ2_A794PrvNom = new String[] {""} ;
      P09RZ2_n794PrvNom = new boolean[] {false} ;
      P09RZ2_A795PrvNum = new int[1] ;
      P09RZ2_A718PrdNom = new String[] {""} ;
      P09RZ2_A719PrdNum = new String[] {""} ;
      AV23HttpResponse = httpContext.getHttpResponse();
      AV17ErrorMessage = "" ;
      AV52UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV11ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector5 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV20GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV21GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.listadodeprecios_wcexportcsv__default(),
         new Object[] {
             new Object[] {
            P09RZ2_A856ValCod, P09RZ2_A396EmprCod, P09RZ2_A857ValDsc, P09RZ2_n857ValDsc, P09RZ2_A709PrdFecPre, P09RZ2_A724PrdPreAct, P09RZ2_A728PrdRefPrv, P09RZ2_A794PrvNom, P09RZ2_n794PrvNom, P09RZ2_A795PrvNum,
            P09RZ2_A718PrdNom, P09RZ2_A719PrdNum
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A856ValCod ;
   private short gxcookieaux ;
   private short AV26OrderedBy ;
   private short Gx_err ;
   private int AV32Random ;
   private int A795PrvNum ;
   private int AV63Listadodeprecios_wcds_6_tfprvnum ;
   private int AV48TFPrvNum ;
   private int AV64Listadodeprecios_wcds_7_tfprvnum_to ;
   private int AV49TFPrvNum_To ;
   private int AV30PrvNum ;
   private int AV31PrvNum_to ;
   private int AV74GXV1 ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal AV69Listadodeprecios_wcds_12_tfprdpreact ;
   private java.math.BigDecimal AV42TFPrdPreAct ;
   private java.math.BigDecimal AV70Listadodeprecios_wcds_13_tfprdpreact_to ;
   private java.math.BigDecimal AV43TFPrdPreAct_To ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String A794PrvNom ;
   private String A728PrdRefPrv ;
   private String A857ValDsc ;
   private String AV59Listadodeprecios_wcds_2_tfprdnum ;
   private String AV40TFPrdNum ;
   private String AV60Listadodeprecios_wcds_3_tfprdnum_sel ;
   private String AV41TFPrdNum_Sel ;
   private String AV61Listadodeprecios_wcds_4_tfprdnom ;
   private String AV38TFPrdNom ;
   private String AV62Listadodeprecios_wcds_5_tfprdnom_sel ;
   private String AV39TFPrdNom_Sel ;
   private String AV65Listadodeprecios_wcds_8_tfprvnom ;
   private String AV46TFPrvNom ;
   private String AV66Listadodeprecios_wcds_9_tfprvnom_sel ;
   private String AV47TFPrvNom_Sel ;
   private String AV67Listadodeprecios_wcds_10_tfprdrefprv ;
   private String AV44TFPrdRefPrv ;
   private String AV68Listadodeprecios_wcds_11_tfprdrefprv_sel ;
   private String AV45TFPrdRefPrv_Sel ;
   private String AV72Listadodeprecios_wcds_15_tfvaldsc ;
   private String AV50TFValDsc ;
   private String AV73Listadodeprecios_wcds_16_tfvaldsc_sel ;
   private String AV51TFValDsc_Sel ;
   private String scmdbuf ;
   private String lV59Listadodeprecios_wcds_2_tfprdnum ;
   private String lV61Listadodeprecios_wcds_4_tfprdnom ;
   private String lV65Listadodeprecios_wcds_8_tfprvnom ;
   private String lV67Listadodeprecios_wcds_10_tfprdrefprv ;
   private String lV72Listadodeprecios_wcds_15_tfvaldsc ;
   private String AV16Emprcod ;
   private String AV28Prdnum ;
   private String A396EmprCod ;
   private String AV29Prdnum_to ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private java.util.Date A709PrdFecPre ;
   private java.util.Date AV71Listadodeprecios_wcds_14_tfprdfecpre ;
   private java.util.Date AV36TFPrdFecPre ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV27OrderedDsc ;
   private boolean n857ValDsc ;
   private boolean n794PrvNom ;
   private String AV35TextFileLine ;
   private String AV12ColumnsSelectorXML ;
   private String AV52UserCustomValue ;
   private String AV18Filename ;
   private String AV58Listadodeprecios_wcds_1_filterfulltext ;
   private String AV19FilterFullText ;
   private String lV58Listadodeprecios_wcds_1_filterfulltext ;
   private String AV17ErrorMessage ;
   private com.genexus.webpanels.WebSession AV33Session ;
   private com.genexus.util.GXFile AV34TextFile ;
   private IDataStoreProvider pr_default ;
   private byte[] P09RZ2_A856ValCod ;
   private String[] P09RZ2_A396EmprCod ;
   private String[] P09RZ2_A857ValDsc ;
   private boolean[] P09RZ2_n857ValDsc ;
   private java.util.Date[] P09RZ2_A709PrdFecPre ;
   private java.math.BigDecimal[] P09RZ2_A724PrdPreAct ;
   private String[] P09RZ2_A728PrdRefPrv ;
   private String[] P09RZ2_A794PrvNom ;
   private boolean[] P09RZ2_n794PrvNom ;
   private int[] P09RZ2_A795PrvNum ;
   private String[] P09RZ2_A718PrdNom ;
   private String[] P09RZ2_A719PrdNum ;
   private com.genexus.internet.HttpResponse AV23HttpResponse ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV9ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV11ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV20GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV21GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPContext AV54WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
}

final  class listadodeprecios_wcexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09RZ2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV58Listadodeprecios_wcds_1_filterfulltext ,
                                          String AV60Listadodeprecios_wcds_3_tfprdnum_sel ,
                                          String AV59Listadodeprecios_wcds_2_tfprdnum ,
                                          String AV62Listadodeprecios_wcds_5_tfprdnom_sel ,
                                          String AV61Listadodeprecios_wcds_4_tfprdnom ,
                                          int AV63Listadodeprecios_wcds_6_tfprvnum ,
                                          int AV64Listadodeprecios_wcds_7_tfprvnum_to ,
                                          String AV66Listadodeprecios_wcds_9_tfprvnom_sel ,
                                          String AV65Listadodeprecios_wcds_8_tfprvnom ,
                                          String AV68Listadodeprecios_wcds_11_tfprdrefprv_sel ,
                                          String AV67Listadodeprecios_wcds_10_tfprdrefprv ,
                                          java.math.BigDecimal AV69Listadodeprecios_wcds_12_tfprdpreact ,
                                          java.math.BigDecimal AV70Listadodeprecios_wcds_13_tfprdpreact_to ,
                                          java.util.Date AV71Listadodeprecios_wcds_14_tfprdfecpre ,
                                          String AV73Listadodeprecios_wcds_16_tfvaldsc_sel ,
                                          String AV72Listadodeprecios_wcds_15_tfvaldsc ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          int A795PrvNum ,
                                          String A794PrvNom ,
                                          String A728PrdRefPrv ,
                                          java.math.BigDecimal A724PrdPreAct ,
                                          String A857ValDsc ,
                                          java.util.Date A709PrdFecPre ,
                                          short AV26OrderedBy ,
                                          boolean AV27OrderedDsc ,
                                          int AV30PrvNum ,
                                          int AV31PrvNum_to ,
                                          String AV16Emprcod ,
                                          String AV28Prdnum ,
                                          String A396EmprCod ,
                                          String AV29Prdnum_to )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[27];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.ValCod, T1.EmprCod, T2.ValDsc, T1.PrdFecPre, T1.PrdPreAct, T1.PrdRefPrv, T3.PrvNom, T1.PrvNum, T1.PrdNom, T1.PrdNum FROM ((TXPPRODUC T1 INNER JOIN TXPTIPVAL" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.ValCod = T1.ValCod) INNER JOIN TXPPRVGEN T3 ON T3.EmprCod = T1.EmprCod AND T3.PrvNum = T1.PrvNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.PrdNum >= ?)");
      addWhere(sWhereString, "(T1.PrvNum >= ?)");
      addWhere(sWhereString, "(T1.PrvNum <= ?)");
      addWhere(sWhereString, "(T1.PrdNum <= ?)");
      if ( ! (GXutil.strcmp("", AV58Listadodeprecios_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T1.PrdNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrvNum,'999990'), 2) like '%' || ?) or ( UPPER(T3.PrvNom) like '%' || UPPER(?)) or ( UPPER(T1.PrdRefPrv) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrdPreAct,'99999990.99999'), 2) like '%' || ?) or ( UPPER(T2.ValDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
         GXv_int6[6] = (byte)(1) ;
         GXv_int6[7] = (byte)(1) ;
         GXv_int6[8] = (byte)(1) ;
         GXv_int6[9] = (byte)(1) ;
         GXv_int6[10] = (byte)(1) ;
         GXv_int6[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Listadodeprecios_wcds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV59Listadodeprecios_wcds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Listadodeprecios_wcds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Listadodeprecios_wcds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV61Listadodeprecios_wcds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Listadodeprecios_wcds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom = ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (0==AV63Listadodeprecios_wcds_6_tfprvnum) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (0==AV64Listadodeprecios_wcds_7_tfprvnum_to) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Listadodeprecios_wcds_9_tfprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV65Listadodeprecios_wcds_8_tfprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Listadodeprecios_wcds_9_tfprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.PrvNom = ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Listadodeprecios_wcds_11_tfprdrefprv_sel)==0) && ( ! (GXutil.strcmp("", AV67Listadodeprecios_wcds_10_tfprdrefprv)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdRefPrv) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Listadodeprecios_wcds_11_tfprdrefprv_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdRefPrv = ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV69Listadodeprecios_wcds_12_tfprdpreact)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct >= ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV70Listadodeprecios_wcds_13_tfprdpreact_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct <= ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV71Listadodeprecios_wcds_14_tfprdfecpre)) )
      {
         addWhere(sWhereString, "(T1.PrdFecPre >= ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Listadodeprecios_wcds_16_tfvaldsc_sel)==0) && ( ! (GXutil.strcmp("", AV72Listadodeprecios_wcds_15_tfvaldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ValDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Listadodeprecios_wcds_16_tfvaldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ValDsc = ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV26OrderedBy == 1 ) && ! AV27OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvNum" ;
      }
      else if ( ( AV26OrderedBy == 1 ) && ( AV27OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvNum DESC" ;
      }
      else if ( ( AV26OrderedBy == 2 ) && ! AV27OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNum" ;
      }
      else if ( ( AV26OrderedBy == 2 ) && ( AV27OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNum DESC" ;
      }
      else if ( ( AV26OrderedBy == 3 ) && ! AV27OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNom" ;
      }
      else if ( ( AV26OrderedBy == 3 ) && ( AV27OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNom DESC" ;
      }
      else if ( ( AV26OrderedBy == 4 ) && ! AV27OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.PrvNom" ;
      }
      else if ( ( AV26OrderedBy == 4 ) && ( AV27OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.PrvNom DESC" ;
      }
      else if ( ( AV26OrderedBy == 5 ) && ! AV27OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdRefPrv" ;
      }
      else if ( ( AV26OrderedBy == 5 ) && ( AV27OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdRefPrv DESC" ;
      }
      else if ( ( AV26OrderedBy == 6 ) && ! AV27OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdPreAct" ;
      }
      else if ( ( AV26OrderedBy == 6 ) && ( AV27OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdPreAct DESC" ;
      }
      else if ( ( AV26OrderedBy == 7 ) && ! AV27OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdFecPre" ;
      }
      else if ( ( AV26OrderedBy == 7 ) && ( AV27OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdFecPre DESC" ;
      }
      else if ( ( AV26OrderedBy == 8 ) && ! AV27OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.ValDsc" ;
      }
      else if ( ( AV26OrderedBy == 8 ) && ( AV27OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.ValDsc DESC" ;
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
                  return conditional_P09RZ2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (String)dynConstraints[22] , (java.util.Date)dynConstraints[23] , ((Number) dynConstraints[24]).shortValue() , ((Boolean) dynConstraints[25]).booleanValue() , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09RZ2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,5);
               ((String[]) buf[6])[0] = rslt.getString(6, 30);
               ((String[]) buf[7])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(8);
               ((String[]) buf[10])[0] = rslt.getString(9, 26);
               ((String[]) buf[11])[0] = rslt.getString(10, 6);
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
                  stmt.setString(sIdx, (String)parms[27], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 6);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 5);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[50], 5);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[51]);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 16);
               }
               return;
      }
   }

}

