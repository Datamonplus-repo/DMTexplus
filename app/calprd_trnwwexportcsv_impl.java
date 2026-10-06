package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class calprd_trnwwexportcsv_impl extends GXWebProcedure
{
   public calprd_trnwwexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "Calprd_TRNWWExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("Calprd_TRNWWColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("Calprd_TRNWWColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Numero Albaran Produccion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "P", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Estado", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha Salida", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Hora Salida", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+"" : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Codigo AT", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV94Calprd_trnwwds_1_filterfulltext = AV30FilterFullText ;
      AV95Calprd_trnwwds_2_tfalbprocod = AV37TFAlbProCod ;
      AV96Calprd_trnwwds_3_tfalbprocod_to = AV38TFAlbProCod_To ;
      AV97Calprd_trnwwds_4_tfalbpropri = AV39TFAlbProPri ;
      AV98Calprd_trnwwds_5_tfalbpropri_sel = AV40TFAlbProPri_Sel ;
      AV99Calprd_trnwwds_6_tfalbproest_sels = AV86TFAlbProEst_Sels ;
      AV100Calprd_trnwwds_7_tfalbprofch = AV43TFAlbProfch ;
      AV101Calprd_trnwwds_8_tfalbfecsal = AV45TFAlbFecSal ;
      AV102Calprd_trnwwds_9_tfalbhorsal = AV47TFAlbHorSal ;
      AV103Calprd_trnwwds_10_tfalbhorsal_sel = AV48TFAlbHorSal_Sel ;
      AV104Calprd_trnwwds_11_tfalbmarca_sels = AV90TFAlbMarca_Sels ;
      AV105Calprd_trnwwds_12_tfalblic = AV69TFAlbLic ;
      AV106Calprd_trnwwds_13_tfalblic_sel = AV70TFAlbLic_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(A33AlbProEst) ,
                                           AV99Calprd_trnwwds_6_tfalbproest_sels ,
                                           A5140AlbMarca ,
                                           AV104Calprd_trnwwds_11_tfalbmarca_sels ,
                                           Long.valueOf(AV95Calprd_trnwwds_2_tfalbprocod) ,
                                           Long.valueOf(AV96Calprd_trnwwds_3_tfalbprocod_to) ,
                                           AV98Calprd_trnwwds_5_tfalbpropri_sel ,
                                           AV97Calprd_trnwwds_4_tfalbpropri ,
                                           Integer.valueOf(AV99Calprd_trnwwds_6_tfalbproest_sels.size()) ,
                                           AV100Calprd_trnwwds_7_tfalbprofch ,
                                           AV101Calprd_trnwwds_8_tfalbfecsal ,
                                           AV103Calprd_trnwwds_10_tfalbhorsal_sel ,
                                           AV102Calprd_trnwwds_9_tfalbhorsal ,
                                           Integer.valueOf(AV104Calprd_trnwwds_11_tfalbmarca_sels.size()) ,
                                           AV106Calprd_trnwwds_13_tfalblic_sel ,
                                           AV105Calprd_trnwwds_12_tfalblic ,
                                           Long.valueOf(A30AlbProCod) ,
                                           A39AlbProPri ,
                                           A34AlbProfch ,
                                           A4023AlbFecSal ,
                                           A3865AlbHorSal ,
                                           A7101AlbLic ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) ,
                                           AV94Calprd_trnwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV97Calprd_trnwwds_4_tfalbpropri = GXutil.padr( GXutil.rtrim( AV97Calprd_trnwwds_4_tfalbpropri), 1, "%") ;
      lV102Calprd_trnwwds_9_tfalbhorsal = GXutil.padr( GXutil.rtrim( AV102Calprd_trnwwds_9_tfalbhorsal), 8, "%") ;
      lV105Calprd_trnwwds_12_tfalblic = GXutil.padr( GXutil.rtrim( AV105Calprd_trnwwds_12_tfalblic), 20, "%") ;
      /* Using cursor P09302 */
      pr_default.execute(0, new Object[] {Long.valueOf(AV95Calprd_trnwwds_2_tfalbprocod), Long.valueOf(AV96Calprd_trnwwds_3_tfalbprocod_to), lV97Calprd_trnwwds_4_tfalbpropri, AV98Calprd_trnwwds_5_tfalbpropri_sel, AV100Calprd_trnwwds_7_tfalbprofch, AV101Calprd_trnwwds_8_tfalbfecsal, lV102Calprd_trnwwds_9_tfalbhorsal, AV103Calprd_trnwwds_10_tfalbhorsal_sel, lV105Calprd_trnwwds_12_tfalblic, AV106Calprd_trnwwds_13_tfalblic_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A7101AlbLic = P09302_A7101AlbLic[0] ;
         A3865AlbHorSal = P09302_A3865AlbHorSal[0] ;
         A4023AlbFecSal = P09302_A4023AlbFecSal[0] ;
         A34AlbProfch = P09302_A34AlbProfch[0] ;
         A33AlbProEst = P09302_A33AlbProEst[0] ;
         A39AlbProPri = P09302_A39AlbProPri[0] ;
         A30AlbProCod = P09302_A30AlbProCod[0] ;
         A5140AlbMarca = P09302_A5140AlbMarca[0] ;
         A396EmprCod = P09302_A396EmprCod[0] ;
         if ( (GXutil.strcmp("", AV94Calprd_trnwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A30AlbProCod, 10, 0) , GXutil.padr( "%" + AV94Calprd_trnwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A39AlbProPri) , GXutil.padr( "%" + GXutil.upper( AV94Calprd_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A33AlbProEst, 1, 0) , GXutil.padr( "%" + AV94Calprd_trnwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3865AlbHorSal) , GXutil.padr( "%" + GXutil.upper( AV94Calprd_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "activo", ""), "") , GXutil.padr( "%" + GXutil.lower( AV94Calprd_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A5140AlbMarca, "") == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "anulado", ""), "") , GXutil.padr( "%" + GXutil.lower( AV94Calprd_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A5140AlbMarca, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A7101AlbLic) , GXutil.padr( "%" + GXutil.upper( AV94Calprd_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            AV14TextFileLine = "" ;
            /* Execute user subroutine: 'BEFOREWRITELINE' */
            S162 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               returnInSub = true;
               if (true) return;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A30AlbProCod, 10, 0) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A39AlbProPri, ";", ","), GXv_char3) ;
               calprd_trnwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               if ( A33AlbProEst == 0 )
               {
                  AV14TextFileLine += httpContext.getMessage( "Pdte Imprimir", "") ;
               }
               else if ( A33AlbProEst == 1 )
               {
                  AV14TextFileLine += httpContext.getMessage( "Imprimido", "") ;
               }
               else if ( A33AlbProEst == 2 )
               {
                  AV14TextFileLine += httpContext.getMessage( "Facturado", "") ;
               }
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += localUtil.dtoc( A34AlbProfch, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += localUtil.dtoc( A4023AlbFecSal, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A3865AlbHorSal, ";", ","), GXv_char3) ;
               calprd_trnwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               if ( GXutil.strcmp(GXutil.trim( A5140AlbMarca), "") == 0 )
               {
                  AV14TextFileLine += httpContext.getMessage( "Activo", "") ;
               }
               else if ( GXutil.strcmp(GXutil.trim( A5140AlbMarca), "A") == 0 )
               {
                  AV14TextFileLine += httpContext.getMessage( "Anulado", "") ;
               }
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A7101AlbLic, ";", ","), GXv_char3) ;
               calprd_trnwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            /* Execute user subroutine: 'AFTERWRITELINE' */
            S172 ();
            if ( returnInSub )
            {
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=Calprd_TRNWWExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbProCod", "", "Numero Albaran Produccion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbProPri", "", "P", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbProEst", "", "Estado", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbProfch", "", "Fecha", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbFecSal", "", "Fecha Salida", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbHorSal", "", "Hora Salida", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbMarca", "", "", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbLic", "", "Codigo AT", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "Calprd_TRNWWColumnsSelector", GXv_char3) ;
      calprd_trnwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("Calprd_TRNWWGridState"), "") == 0 )
      {
         AV33GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Calprd_TRNWWGridState"), null, null);
      }
      else
      {
         AV33GridState.fromxml(AV19Session.getValue("Calprd_TRNWWGridState"), null, null);
      }
      AV28OrderedBy = AV33GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV33GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV107GXV1 = 1 ;
      while ( AV107GXV1 <= AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV34GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV107GXV1));
         if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV30FilterFullText = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROCOD") == 0 )
         {
            AV37TFAlbProCod = GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            AV38TFAlbProCod_To = GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROPRI") == 0 )
         {
            AV39TFAlbProPri = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROPRI_SEL") == 0 )
         {
            AV40TFAlbProPri_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROEST_SEL") == 0 )
         {
            AV85TFAlbProEst_SelsJson = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV86TFAlbProEst_Sels.fromJSonString(AV85TFAlbProEst_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROFCH") == 0 )
         {
            AV43TFAlbProfch = localUtil.ctod( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBFECSAL") == 0 )
         {
            AV45TFAlbFecSal = localUtil.ctod( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBHORSAL") == 0 )
         {
            AV47TFAlbHorSal = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBHORSAL_SEL") == 0 )
         {
            AV48TFAlbHorSal_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBMARCA_SEL") == 0 )
         {
            AV89TFAlbMarca_SelsJson = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV90TFAlbMarca_Sels.fromJSonString(AV89TFAlbMarca_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBLIC") == 0 )
         {
            AV69TFAlbLic = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBLIC_SEL") == 0 )
         {
            AV70TFAlbLic_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV107GXV1 = (int)(AV107GXV1+1) ;
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
      A39AlbProPri = "" ;
      A34AlbProfch = GXutil.nullDate() ;
      A4023AlbFecSal = GXutil.nullDate() ;
      A3865AlbHorSal = "" ;
      A5140AlbMarca = "" ;
      A7101AlbLic = "" ;
      AV94Calprd_trnwwds_1_filterfulltext = "" ;
      AV30FilterFullText = "" ;
      AV97Calprd_trnwwds_4_tfalbpropri = "" ;
      AV39TFAlbProPri = "" ;
      AV98Calprd_trnwwds_5_tfalbpropri_sel = "" ;
      AV40TFAlbProPri_Sel = "" ;
      AV99Calprd_trnwwds_6_tfalbproest_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV86TFAlbProEst_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV100Calprd_trnwwds_7_tfalbprofch = GXutil.nullDate() ;
      AV43TFAlbProfch = GXutil.nullDate() ;
      AV101Calprd_trnwwds_8_tfalbfecsal = GXutil.nullDate() ;
      AV45TFAlbFecSal = GXutil.nullDate() ;
      AV102Calprd_trnwwds_9_tfalbhorsal = "" ;
      AV47TFAlbHorSal = "" ;
      AV103Calprd_trnwwds_10_tfalbhorsal_sel = "" ;
      AV48TFAlbHorSal_Sel = "" ;
      AV104Calprd_trnwwds_11_tfalbmarca_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV90TFAlbMarca_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV105Calprd_trnwwds_12_tfalblic = "" ;
      AV69TFAlbLic = "" ;
      AV106Calprd_trnwwds_13_tfalblic_sel = "" ;
      AV70TFAlbLic_Sel = "" ;
      lV94Calprd_trnwwds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV97Calprd_trnwwds_4_tfalbpropri = "" ;
      lV102Calprd_trnwwds_9_tfalbhorsal = "" ;
      lV105Calprd_trnwwds_12_tfalblic = "" ;
      P09302_A7101AlbLic = new String[] {""} ;
      P09302_A3865AlbHorSal = new String[] {""} ;
      P09302_A4023AlbFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P09302_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      P09302_A33AlbProEst = new byte[1] ;
      P09302_A39AlbProPri = new String[] {""} ;
      P09302_A30AlbProCod = new long[1] ;
      P09302_A5140AlbMarca = new String[] {""} ;
      P09302_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector5 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV33GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV34GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV85TFAlbProEst_SelsJson = "" ;
      AV89TFAlbMarca_SelsJson = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.calprd_trnwwexportcsv__default(),
         new Object[] {
             new Object[] {
            P09302_A7101AlbLic, P09302_A3865AlbHorSal, P09302_A4023AlbFecSal, P09302_A34AlbProfch, P09302_A33AlbProEst, P09302_A39AlbProPri, P09302_A30AlbProCod, P09302_A5140AlbMarca, P09302_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A33AlbProEst ;
   private short gxcookieaux ;
   private short AV28OrderedBy ;
   private short Gx_err ;
   private int AV13Random ;
   private int AV99Calprd_trnwwds_6_tfalbproest_sels_size ;
   private int AV104Calprd_trnwwds_11_tfalbmarca_sels_size ;
   private int AV107GXV1 ;
   private long A30AlbProCod ;
   private long AV95Calprd_trnwwds_2_tfalbprocod ;
   private long AV37TFAlbProCod ;
   private long AV96Calprd_trnwwds_3_tfalbprocod_to ;
   private long AV38TFAlbProCod_To ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A39AlbProPri ;
   private String A3865AlbHorSal ;
   private String A5140AlbMarca ;
   private String A7101AlbLic ;
   private String AV97Calprd_trnwwds_4_tfalbpropri ;
   private String AV39TFAlbProPri ;
   private String AV98Calprd_trnwwds_5_tfalbpropri_sel ;
   private String AV40TFAlbProPri_Sel ;
   private String AV102Calprd_trnwwds_9_tfalbhorsal ;
   private String AV47TFAlbHorSal ;
   private String AV103Calprd_trnwwds_10_tfalbhorsal_sel ;
   private String AV48TFAlbHorSal_Sel ;
   private String AV105Calprd_trnwwds_12_tfalblic ;
   private String AV69TFAlbLic ;
   private String AV106Calprd_trnwwds_13_tfalblic_sel ;
   private String AV70TFAlbLic_Sel ;
   private String scmdbuf ;
   private String lV97Calprd_trnwwds_4_tfalbpropri ;
   private String lV102Calprd_trnwwds_9_tfalbhorsal ;
   private String lV105Calprd_trnwwds_12_tfalblic ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private java.util.Date A34AlbProfch ;
   private java.util.Date A4023AlbFecSal ;
   private java.util.Date AV100Calprd_trnwwds_7_tfalbprofch ;
   private java.util.Date AV43TFAlbProfch ;
   private java.util.Date AV101Calprd_trnwwds_8_tfalbfecsal ;
   private java.util.Date AV45TFAlbFecSal ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV85TFAlbProEst_SelsJson ;
   private String AV89TFAlbMarca_SelsJson ;
   private String AV11Filename ;
   private String AV94Calprd_trnwwds_1_filterfulltext ;
   private String AV30FilterFullText ;
   private String lV94Calprd_trnwwds_1_filterfulltext ;
   private String AV12ErrorMessage ;
   private GXSimpleCollection<Byte> AV99Calprd_trnwwds_6_tfalbproest_sels ;
   private GXSimpleCollection<Byte> AV86TFAlbProEst_Sels ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private String[] P09302_A7101AlbLic ;
   private String[] P09302_A3865AlbHorSal ;
   private java.util.Date[] P09302_A4023AlbFecSal ;
   private java.util.Date[] P09302_A34AlbProfch ;
   private byte[] P09302_A33AlbProEst ;
   private String[] P09302_A39AlbProPri ;
   private long[] P09302_A30AlbProCod ;
   private String[] P09302_A5140AlbMarca ;
   private String[] P09302_A396EmprCod ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private GXSimpleCollection<String> AV104Calprd_trnwwds_11_tfalbmarca_sels ;
   private GXSimpleCollection<String> AV90TFAlbMarca_Sels ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV33GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV34GridStateFilterValue ;
}

final  class calprd_trnwwexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09302( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A33AlbProEst ,
                                          GXSimpleCollection<Byte> AV99Calprd_trnwwds_6_tfalbproest_sels ,
                                          String A5140AlbMarca ,
                                          GXSimpleCollection<String> AV104Calprd_trnwwds_11_tfalbmarca_sels ,
                                          long AV95Calprd_trnwwds_2_tfalbprocod ,
                                          long AV96Calprd_trnwwds_3_tfalbprocod_to ,
                                          String AV98Calprd_trnwwds_5_tfalbpropri_sel ,
                                          String AV97Calprd_trnwwds_4_tfalbpropri ,
                                          int AV99Calprd_trnwwds_6_tfalbproest_sels_size ,
                                          java.util.Date AV100Calprd_trnwwds_7_tfalbprofch ,
                                          java.util.Date AV101Calprd_trnwwds_8_tfalbfecsal ,
                                          String AV103Calprd_trnwwds_10_tfalbhorsal_sel ,
                                          String AV102Calprd_trnwwds_9_tfalbhorsal ,
                                          int AV104Calprd_trnwwds_11_tfalbmarca_sels_size ,
                                          String AV106Calprd_trnwwds_13_tfalblic_sel ,
                                          String AV105Calprd_trnwwds_12_tfalblic ,
                                          long A30AlbProCod ,
                                          String A39AlbProPri ,
                                          java.util.Date A34AlbProfch ,
                                          java.util.Date A4023AlbFecSal ,
                                          String A3865AlbHorSal ,
                                          String A7101AlbLic ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc ,
                                          String AV94Calprd_trnwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[10];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT AlbLic, AlbHorSal, AlbFecSal, AlbProfch, AlbProEst, AlbProPri, AlbProCod, AlbMarca, EmprCod FROM TXPCALPRD" ;
      if ( ! (0==AV95Calprd_trnwwds_2_tfalbprocod) )
      {
         addWhere(sWhereString, "(AlbProCod >= ?)");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
      }
      if ( ! (0==AV96Calprd_trnwwds_3_tfalbprocod_to) )
      {
         addWhere(sWhereString, "(AlbProCod <= ?)");
      }
      else
      {
         GXv_int6[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV98Calprd_trnwwds_5_tfalbpropri_sel)==0) && ( ! (GXutil.strcmp("", AV97Calprd_trnwwds_4_tfalbpropri)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbProPri) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Calprd_trnwwds_5_tfalbpropri_sel)==0) )
      {
         addWhere(sWhereString, "(AlbProPri = ?)");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( AV99Calprd_trnwwds_6_tfalbproest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV99Calprd_trnwwds_6_tfalbproest_sels, "AlbProEst IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV100Calprd_trnwwds_7_tfalbprofch)) )
      {
         addWhere(sWhereString, "(AlbProfch >= ?)");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV101Calprd_trnwwds_8_tfalbfecsal)) )
      {
         addWhere(sWhereString, "(AlbFecSal >= ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Calprd_trnwwds_10_tfalbhorsal_sel)==0) && ( ! (GXutil.strcmp("", AV102Calprd_trnwwds_9_tfalbhorsal)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbHorSal) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Calprd_trnwwds_10_tfalbhorsal_sel)==0) )
      {
         addWhere(sWhereString, "(AlbHorSal = ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( AV104Calprd_trnwwds_11_tfalbmarca_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV104Calprd_trnwwds_11_tfalbmarca_sels, "AlbMarca IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV106Calprd_trnwwds_13_tfalblic_sel)==0) && ( ! (GXutil.strcmp("", AV105Calprd_trnwwds_12_tfalblic)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbLic) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Calprd_trnwwds_13_tfalblic_sel)==0) )
      {
         addWhere(sWhereString, "(AlbLic = ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY AlbProfch" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY AlbProfch DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY AlbProCod" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY AlbProCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY AlbProPri" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY AlbProPri DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY AlbProEst" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY AlbProEst DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY AlbFecSal" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY AlbFecSal DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY AlbHorSal" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY AlbHorSal DESC" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY AlbMarca" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY AlbMarca DESC" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY AlbLic" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY AlbLic DESC" ;
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
                  return conditional_P09302(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).longValue() , ((Number) dynConstraints[5]).longValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , (java.util.Date)dynConstraints[9] , (java.util.Date)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).longValue() , (String)dynConstraints[17] , (java.util.Date)dynConstraints[18] , (java.util.Date)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).shortValue() , ((Boolean) dynConstraints[23]).booleanValue() , (String)dynConstraints[24] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09302", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((long[]) buf[6])[0] = rslt.getLong(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((String[]) buf[8])[0] = rslt.getString(9, 3);
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
                  stmt.setLong(sIdx, ((Number) parms[10]).longValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[11]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[14]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[15]);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 8);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 8);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 20);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 20);
               }
               return;
      }
   }

}

