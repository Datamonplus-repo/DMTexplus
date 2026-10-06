package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tmcomentwwexportcsv_impl extends GXWebProcedure
{
   public tmcomentwwexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "TMComEntWWExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("MantenimientoMaquina.TMComEntWWColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("MantenimientoMaquina.TMComEntWWColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Compra", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nro Externo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Codigo Proveedor", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre Proveedor", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha Solicitada", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha Entrada", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Estado", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Origen", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV59Mantenimientomaquina_tmcomentwwds_1_filterfulltext = AV30FilterFullText ;
      AV60Mantenimientomaquina_tmcomentwwds_2_tfmcomcod = AV38TFMComCod ;
      AV61Mantenimientomaquina_tmcomentwwds_3_tfmcomcod_to = AV39TFMComCod_To ;
      AV62Mantenimientomaquina_tmcomentwwds_4_tfmcomext = AV40TFMComExt ;
      AV63Mantenimientomaquina_tmcomentwwds_5_tfmcomext_sel = AV41TFMComExt_Sel ;
      AV64Mantenimientomaquina_tmcomentwwds_6_tfmcomfch = AV42TFMComFch ;
      AV65Mantenimientomaquina_tmcomentwwds_7_tfprvnum = AV44TFPrvNum ;
      AV66Mantenimientomaquina_tmcomentwwds_8_tfprvnum_to = AV45TFPrvNum_To ;
      AV67Mantenimientomaquina_tmcomentwwds_9_tfprvnom = AV46TFPrvNom ;
      AV68Mantenimientomaquina_tmcomentwwds_10_tfprvnom_sel = AV47TFPrvNom_Sel ;
      AV69Mantenimientomaquina_tmcomentwwds_11_tfmcomsolfch = AV48TFMComSolFch ;
      AV70Mantenimientomaquina_tmcomentwwds_12_tfmcomentfch = AV50TFMComEntFch ;
      AV71Mantenimientomaquina_tmcomentwwds_13_tfmcomest_sels = AV53TFMComEst_Sels ;
      AV72Mantenimientomaquina_tmcomentwwds_14_tfmcomori_sels = AV55TFMComOri_Sels ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A11049MComEst ,
                                           AV71Mantenimientomaquina_tmcomentwwds_13_tfmcomest_sels ,
                                           A11050MComOri ,
                                           AV72Mantenimientomaquina_tmcomentwwds_14_tfmcomori_sels ,
                                           Long.valueOf(AV60Mantenimientomaquina_tmcomentwwds_2_tfmcomcod) ,
                                           Long.valueOf(AV61Mantenimientomaquina_tmcomentwwds_3_tfmcomcod_to) ,
                                           AV63Mantenimientomaquina_tmcomentwwds_5_tfmcomext_sel ,
                                           AV62Mantenimientomaquina_tmcomentwwds_4_tfmcomext ,
                                           AV64Mantenimientomaquina_tmcomentwwds_6_tfmcomfch ,
                                           Integer.valueOf(AV65Mantenimientomaquina_tmcomentwwds_7_tfprvnum) ,
                                           Integer.valueOf(AV66Mantenimientomaquina_tmcomentwwds_8_tfprvnum_to) ,
                                           AV68Mantenimientomaquina_tmcomentwwds_10_tfprvnom_sel ,
                                           AV67Mantenimientomaquina_tmcomentwwds_9_tfprvnom ,
                                           AV69Mantenimientomaquina_tmcomentwwds_11_tfmcomsolfch ,
                                           AV70Mantenimientomaquina_tmcomentwwds_12_tfmcomentfch ,
                                           Integer.valueOf(AV71Mantenimientomaquina_tmcomentwwds_13_tfmcomest_sels.size()) ,
                                           Integer.valueOf(AV72Mantenimientomaquina_tmcomentwwds_14_tfmcomori_sels.size()) ,
                                           Long.valueOf(A11055MComCod) ,
                                           A11045MComExt ,
                                           A11046MComFch ,
                                           Integer.valueOf(A795PrvNum) ,
                                           A794PrvNom ,
                                           A11047MComSolFch ,
                                           A11048MComEntFch ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) ,
                                           AV59Mantenimientomaquina_tmcomentwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV62Mantenimientomaquina_tmcomentwwds_4_tfmcomext = GXutil.padr( GXutil.rtrim( AV62Mantenimientomaquina_tmcomentwwds_4_tfmcomext), 20, "%") ;
      lV67Mantenimientomaquina_tmcomentwwds_9_tfprvnom = GXutil.padr( GXutil.rtrim( AV67Mantenimientomaquina_tmcomentwwds_9_tfprvnom), 30, "%") ;
      /* Using cursor P08K32 */
      pr_default.execute(0, new Object[] {Long.valueOf(AV60Mantenimientomaquina_tmcomentwwds_2_tfmcomcod), Long.valueOf(AV61Mantenimientomaquina_tmcomentwwds_3_tfmcomcod_to), lV62Mantenimientomaquina_tmcomentwwds_4_tfmcomext, AV63Mantenimientomaquina_tmcomentwwds_5_tfmcomext_sel, AV64Mantenimientomaquina_tmcomentwwds_6_tfmcomfch, Integer.valueOf(AV65Mantenimientomaquina_tmcomentwwds_7_tfprvnum), Integer.valueOf(AV66Mantenimientomaquina_tmcomentwwds_8_tfprvnum_to), lV67Mantenimientomaquina_tmcomentwwds_9_tfprvnom, AV68Mantenimientomaquina_tmcomentwwds_10_tfprvnom_sel, AV69Mantenimientomaquina_tmcomentwwds_11_tfmcomsolfch, AV70Mantenimientomaquina_tmcomentwwds_12_tfmcomentfch});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P08K32_A396EmprCod[0] ;
         A11048MComEntFch = P08K32_A11048MComEntFch[0] ;
         A11047MComSolFch = P08K32_A11047MComSolFch[0] ;
         A794PrvNom = P08K32_A794PrvNom[0] ;
         n794PrvNom = P08K32_n794PrvNom[0] ;
         A795PrvNum = P08K32_A795PrvNum[0] ;
         n795PrvNum = P08K32_n795PrvNum[0] ;
         A11046MComFch = P08K32_A11046MComFch[0] ;
         A11045MComExt = P08K32_A11045MComExt[0] ;
         A11055MComCod = P08K32_A11055MComCod[0] ;
         A11050MComOri = P08K32_A11050MComOri[0] ;
         A11049MComEst = P08K32_A11049MComEst[0] ;
         A794PrvNom = P08K32_A794PrvNom[0] ;
         n794PrvNom = P08K32_n794PrvNom[0] ;
         if ( (GXutil.strcmp("", AV59Mantenimientomaquina_tmcomentwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A11055MComCod, 10, 0) , GXutil.padr( "%" + AV59Mantenimientomaquina_tmcomentwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A11045MComExt) , GXutil.padr( "%" + GXutil.upper( AV59Mantenimientomaquina_tmcomentwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A795PrvNum, 6, 0) , GXutil.padr( "%" + AV59Mantenimientomaquina_tmcomentwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A794PrvNom) , GXutil.padr( "%" + GXutil.upper( AV59Mantenimientomaquina_tmcomentwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "pendiente", ""), "") , GXutil.padr( "%" + GXutil.lower( AV59Mantenimientomaquina_tmcomentwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11049MComEst, httpContext.getMessage( "P", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "confirmada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV59Mantenimientomaquina_tmcomentwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11049MComEst, httpContext.getMessage( "C", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "enviada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV59Mantenimientomaquina_tmcomentwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11049MComEst, httpContext.getMessage( "E", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "cancelada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV59Mantenimientomaquina_tmcomentwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11049MComEst, "X") == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "recibida", ""), "") , GXutil.padr( "%" + GXutil.lower( AV59Mantenimientomaquina_tmcomentwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11049MComEst, httpContext.getMessage( "R", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "manual", ""), "") , GXutil.padr( "%" + GXutil.lower( AV59Mantenimientomaquina_tmcomentwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11050MComOri, httpContext.getMessage( "M", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "automático", ""), "") , GXutil.padr( "%" + GXutil.lower( AV59Mantenimientomaquina_tmcomentwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11050MComOri, httpContext.getMessage( "A", "")) == 0 ) ) ) )
         {
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
               AV14TextFileLine += GXutil.str( A11055MComCod, 10, 0) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A11045MComExt, ";", ","), GXv_char3) ;
               tmcomentwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += localUtil.dtoc( A11046MComFch, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A795PrvNum, 6, 0) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A794PrvNom, ";", ","), GXv_char3) ;
               tmcomentwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += localUtil.dtoc( A11047MComSolFch, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += localUtil.dtoc( A11048MComEntFch, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               if ( GXutil.strcmp(GXutil.trim( A11049MComEst), "P") == 0 )
               {
                  AV14TextFileLine += httpContext.getMessage( "Pendiente", "") ;
               }
               else if ( GXutil.strcmp(GXutil.trim( A11049MComEst), "C") == 0 )
               {
                  AV14TextFileLine += httpContext.getMessage( "Confirmada", "") ;
               }
               else if ( GXutil.strcmp(GXutil.trim( A11049MComEst), "E") == 0 )
               {
                  AV14TextFileLine += httpContext.getMessage( "Enviada", "") ;
               }
               else if ( GXutil.strcmp(GXutil.trim( A11049MComEst), "X") == 0 )
               {
                  AV14TextFileLine += httpContext.getMessage( "Cancelada", "") ;
               }
               else if ( GXutil.strcmp(GXutil.trim( A11049MComEst), "R") == 0 )
               {
                  AV14TextFileLine += httpContext.getMessage( "Recibida", "") ;
               }
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               if ( GXutil.strcmp(GXutil.trim( A11050MComOri), "M") == 0 )
               {
                  AV14TextFileLine += httpContext.getMessage( "Manual", "") ;
               }
               else if ( GXutil.strcmp(GXutil.trim( A11050MComOri), "A") == 0 )
               {
                  AV14TextFileLine += httpContext.getMessage( "Automático", "") ;
               }
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=TMComEntWWExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MComCod", "", "Compra", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MComExt", "", "Nro Externo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MComFch", "", "Fecha", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrvNum", "", "Codigo Proveedor", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrvNom", "", "Nombre Proveedor", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MComSolFch", "", "Fecha Solicitada", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MComEntFch", "", "Fecha Entrada", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MComEst", "", "Estado", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MComOri", "", "Origen", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "MantenimientoMaquina.TMComEntWWColumnsSelector", GXv_char3) ;
      tmcomentwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("MantenimientoMaquina.TMComEntWWGridState"), "") == 0 )
      {
         AV32GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "MantenimientoMaquina.TMComEntWWGridState"), null, null);
      }
      else
      {
         AV32GridState.fromxml(AV19Session.getValue("MantenimientoMaquina.TMComEntWWGridState"), null, null);
      }
      AV28OrderedBy = AV32GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV32GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV73GXV1 = 1 ;
      while ( AV73GXV1 <= AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV73GXV1));
         if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV30FilterFullText = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMCOMCOD") == 0 )
         {
            AV38TFMComCod = GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            AV39TFMComCod_To = GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMCOMEXT") == 0 )
         {
            AV40TFMComExt = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMCOMEXT_SEL") == 0 )
         {
            AV41TFMComExt_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMCOMFCH") == 0 )
         {
            AV42TFMComFch = localUtil.ctod( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNUM") == 0 )
         {
            AV44TFPrvNum = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV45TFPrvNum_To = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNOM") == 0 )
         {
            AV46TFPrvNom = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNOM_SEL") == 0 )
         {
            AV47TFPrvNom_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMCOMSOLFCH") == 0 )
         {
            AV48TFMComSolFch = localUtil.ctod( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMCOMENTFCH") == 0 )
         {
            AV50TFMComEntFch = localUtil.ctod( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMCOMEST_SEL") == 0 )
         {
            AV52TFMComEst_SelsJson = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV53TFMComEst_Sels.fromJSonString(AV52TFMComEst_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMCOMORI_SEL") == 0 )
         {
            AV54TFMComOri_SelsJson = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV55TFMComOri_Sels.fromJSonString(AV54TFMComOri_SelsJson, null);
         }
         AV73GXV1 = (int)(AV73GXV1+1) ;
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
      A11045MComExt = "" ;
      A11046MComFch = GXutil.nullDate() ;
      A794PrvNom = "" ;
      A11047MComSolFch = GXutil.nullDate() ;
      A11048MComEntFch = GXutil.nullDate() ;
      A11049MComEst = "" ;
      A11050MComOri = "" ;
      AV59Mantenimientomaquina_tmcomentwwds_1_filterfulltext = "" ;
      AV30FilterFullText = "" ;
      AV62Mantenimientomaquina_tmcomentwwds_4_tfmcomext = "" ;
      AV40TFMComExt = "" ;
      AV63Mantenimientomaquina_tmcomentwwds_5_tfmcomext_sel = "" ;
      AV41TFMComExt_Sel = "" ;
      AV64Mantenimientomaquina_tmcomentwwds_6_tfmcomfch = GXutil.nullDate() ;
      AV42TFMComFch = GXutil.nullDate() ;
      AV67Mantenimientomaquina_tmcomentwwds_9_tfprvnom = "" ;
      AV46TFPrvNom = "" ;
      AV68Mantenimientomaquina_tmcomentwwds_10_tfprvnom_sel = "" ;
      AV47TFPrvNom_Sel = "" ;
      AV69Mantenimientomaquina_tmcomentwwds_11_tfmcomsolfch = GXutil.nullDate() ;
      AV48TFMComSolFch = GXutil.nullDate() ;
      AV70Mantenimientomaquina_tmcomentwwds_12_tfmcomentfch = GXutil.nullDate() ;
      AV50TFMComEntFch = GXutil.nullDate() ;
      AV71Mantenimientomaquina_tmcomentwwds_13_tfmcomest_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV53TFMComEst_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV72Mantenimientomaquina_tmcomentwwds_14_tfmcomori_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV55TFMComOri_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      scmdbuf = "" ;
      lV62Mantenimientomaquina_tmcomentwwds_4_tfmcomext = "" ;
      lV67Mantenimientomaquina_tmcomentwwds_9_tfprvnom = "" ;
      P08K32_A396EmprCod = new String[] {""} ;
      P08K32_A11048MComEntFch = new java.util.Date[] {GXutil.nullDate()} ;
      P08K32_A11047MComSolFch = new java.util.Date[] {GXutil.nullDate()} ;
      P08K32_A794PrvNom = new String[] {""} ;
      P08K32_n794PrvNom = new boolean[] {false} ;
      P08K32_A795PrvNum = new int[1] ;
      P08K32_n795PrvNum = new boolean[] {false} ;
      P08K32_A11046MComFch = new java.util.Date[] {GXutil.nullDate()} ;
      P08K32_A11045MComExt = new String[] {""} ;
      P08K32_A11055MComCod = new long[1] ;
      P08K32_A11050MComOri = new String[] {""} ;
      P08K32_A11049MComEst = new String[] {""} ;
      A396EmprCod = "" ;
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
      AV52TFMComEst_SelsJson = "" ;
      AV54TFMComOri_SelsJson = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.tmcomentwwexportcsv__default(),
         new Object[] {
             new Object[] {
            P08K32_A396EmprCod, P08K32_A11048MComEntFch, P08K32_A11047MComSolFch, P08K32_A794PrvNom, P08K32_n794PrvNom, P08K32_A795PrvNum, P08K32_n795PrvNum, P08K32_A11046MComFch, P08K32_A11045MComExt, P08K32_A11055MComCod,
            P08K32_A11050MComOri, P08K32_A11049MComEst
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short AV28OrderedBy ;
   private short Gx_err ;
   private int AV13Random ;
   private int A795PrvNum ;
   private int AV65Mantenimientomaquina_tmcomentwwds_7_tfprvnum ;
   private int AV44TFPrvNum ;
   private int AV66Mantenimientomaquina_tmcomentwwds_8_tfprvnum_to ;
   private int AV45TFPrvNum_To ;
   private int AV71Mantenimientomaquina_tmcomentwwds_13_tfmcomest_sels_size ;
   private int AV72Mantenimientomaquina_tmcomentwwds_14_tfmcomori_sels_size ;
   private int AV73GXV1 ;
   private long A11055MComCod ;
   private long AV60Mantenimientomaquina_tmcomentwwds_2_tfmcomcod ;
   private long AV38TFMComCod ;
   private long AV61Mantenimientomaquina_tmcomentwwds_3_tfmcomcod_to ;
   private long AV39TFMComCod_To ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A11045MComExt ;
   private String A794PrvNom ;
   private String A11049MComEst ;
   private String A11050MComOri ;
   private String AV62Mantenimientomaquina_tmcomentwwds_4_tfmcomext ;
   private String AV40TFMComExt ;
   private String AV63Mantenimientomaquina_tmcomentwwds_5_tfmcomext_sel ;
   private String AV41TFMComExt_Sel ;
   private String AV67Mantenimientomaquina_tmcomentwwds_9_tfprvnom ;
   private String AV46TFPrvNom ;
   private String AV68Mantenimientomaquina_tmcomentwwds_10_tfprvnom_sel ;
   private String AV47TFPrvNom_Sel ;
   private String scmdbuf ;
   private String lV62Mantenimientomaquina_tmcomentwwds_4_tfmcomext ;
   private String lV67Mantenimientomaquina_tmcomentwwds_9_tfprvnom ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private java.util.Date A11046MComFch ;
   private java.util.Date A11047MComSolFch ;
   private java.util.Date A11048MComEntFch ;
   private java.util.Date AV64Mantenimientomaquina_tmcomentwwds_6_tfmcomfch ;
   private java.util.Date AV42TFMComFch ;
   private java.util.Date AV69Mantenimientomaquina_tmcomentwwds_11_tfmcomsolfch ;
   private java.util.Date AV48TFMComSolFch ;
   private java.util.Date AV70Mantenimientomaquina_tmcomentwwds_12_tfmcomentfch ;
   private java.util.Date AV50TFMComEntFch ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean n794PrvNom ;
   private boolean n795PrvNum ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV52TFMComEst_SelsJson ;
   private String AV54TFMComOri_SelsJson ;
   private String AV11Filename ;
   private String AV59Mantenimientomaquina_tmcomentwwds_1_filterfulltext ;
   private String AV30FilterFullText ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private String[] P08K32_A396EmprCod ;
   private java.util.Date[] P08K32_A11048MComEntFch ;
   private java.util.Date[] P08K32_A11047MComSolFch ;
   private String[] P08K32_A794PrvNom ;
   private boolean[] P08K32_n794PrvNom ;
   private int[] P08K32_A795PrvNum ;
   private boolean[] P08K32_n795PrvNum ;
   private java.util.Date[] P08K32_A11046MComFch ;
   private String[] P08K32_A11045MComExt ;
   private long[] P08K32_A11055MComCod ;
   private String[] P08K32_A11050MComOri ;
   private String[] P08K32_A11049MComEst ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private GXSimpleCollection<String> AV71Mantenimientomaquina_tmcomentwwds_13_tfmcomest_sels ;
   private GXSimpleCollection<String> AV53TFMComEst_Sels ;
   private GXSimpleCollection<String> AV72Mantenimientomaquina_tmcomentwwds_14_tfmcomori_sels ;
   private GXSimpleCollection<String> AV55TFMComOri_Sels ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV32GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV33GridStateFilterValue ;
}

final  class tmcomentwwexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08K32( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A11049MComEst ,
                                          GXSimpleCollection<String> AV71Mantenimientomaquina_tmcomentwwds_13_tfmcomest_sels ,
                                          String A11050MComOri ,
                                          GXSimpleCollection<String> AV72Mantenimientomaquina_tmcomentwwds_14_tfmcomori_sels ,
                                          long AV60Mantenimientomaquina_tmcomentwwds_2_tfmcomcod ,
                                          long AV61Mantenimientomaquina_tmcomentwwds_3_tfmcomcod_to ,
                                          String AV63Mantenimientomaquina_tmcomentwwds_5_tfmcomext_sel ,
                                          String AV62Mantenimientomaquina_tmcomentwwds_4_tfmcomext ,
                                          java.util.Date AV64Mantenimientomaquina_tmcomentwwds_6_tfmcomfch ,
                                          int AV65Mantenimientomaquina_tmcomentwwds_7_tfprvnum ,
                                          int AV66Mantenimientomaquina_tmcomentwwds_8_tfprvnum_to ,
                                          String AV68Mantenimientomaquina_tmcomentwwds_10_tfprvnom_sel ,
                                          String AV67Mantenimientomaquina_tmcomentwwds_9_tfprvnom ,
                                          java.util.Date AV69Mantenimientomaquina_tmcomentwwds_11_tfmcomsolfch ,
                                          java.util.Date AV70Mantenimientomaquina_tmcomentwwds_12_tfmcomentfch ,
                                          int AV71Mantenimientomaquina_tmcomentwwds_13_tfmcomest_sels_size ,
                                          int AV72Mantenimientomaquina_tmcomentwwds_14_tfmcomori_sels_size ,
                                          long A11055MComCod ,
                                          String A11045MComExt ,
                                          java.util.Date A11046MComFch ,
                                          int A795PrvNum ,
                                          String A794PrvNom ,
                                          java.util.Date A11047MComSolFch ,
                                          java.util.Date A11048MComEntFch ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc ,
                                          String AV59Mantenimientomaquina_tmcomentwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[11];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.MComEntFch, T1.MComSolFch, T2.PrvNom, T1.PrvNum, T1.MComFch, T1.MComExt, T1.MComCod, T1.MComOri, T1.MComEst FROM (TXPMRepCo T1 LEFT JOIN TXPPRVGEN" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.PrvNum = T1.PrvNum)" ;
      if ( ! (0==AV60Mantenimientomaquina_tmcomentwwds_2_tfmcomcod) )
      {
         addWhere(sWhereString, "(T1.MComCod >= ?)");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
      }
      if ( ! (0==AV61Mantenimientomaquina_tmcomentwwds_3_tfmcomcod_to) )
      {
         addWhere(sWhereString, "(T1.MComCod <= ?)");
      }
      else
      {
         GXv_int6[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Mantenimientomaquina_tmcomentwwds_5_tfmcomext_sel)==0) && ( ! (GXutil.strcmp("", AV62Mantenimientomaquina_tmcomentwwds_4_tfmcomext)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MComExt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Mantenimientomaquina_tmcomentwwds_5_tfmcomext_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MComExt = ?)");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV64Mantenimientomaquina_tmcomentwwds_6_tfmcomfch)) )
      {
         addWhere(sWhereString, "(T1.MComFch >= ?)");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( ! (0==AV65Mantenimientomaquina_tmcomentwwds_7_tfprvnum) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( ! (0==AV66Mantenimientomaquina_tmcomentwwds_8_tfprvnum_to) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Mantenimientomaquina_tmcomentwwds_10_tfprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV67Mantenimientomaquina_tmcomentwwds_9_tfprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Mantenimientomaquina_tmcomentwwds_10_tfprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvNom = ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV69Mantenimientomaquina_tmcomentwwds_11_tfmcomsolfch)) )
      {
         addWhere(sWhereString, "(T1.MComSolFch >= ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV70Mantenimientomaquina_tmcomentwwds_12_tfmcomentfch)) )
      {
         addWhere(sWhereString, "(T1.MComEntFch >= ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( AV71Mantenimientomaquina_tmcomentwwds_13_tfmcomest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV71Mantenimientomaquina_tmcomentwwds_13_tfmcomest_sels, "T1.MComEst IN (", ")")+")");
      }
      if ( AV72Mantenimientomaquina_tmcomentwwds_14_tfmcomori_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV72Mantenimientomaquina_tmcomentwwds_14_tfmcomori_sels, "T1.MComOri IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MComExt" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MComExt DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MComCod" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MComCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MComFch" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MComFch DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvNum" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvNum DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.PrvNom" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.PrvNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MComSolFch" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MComSolFch DESC" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MComEntFch" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MComEntFch DESC" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MComEst" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MComEst DESC" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MComOri" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MComOri DESC" ;
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
                  return conditional_P08K32(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).longValue() , ((Number) dynConstraints[5]).longValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (java.util.Date)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (java.util.Date)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).longValue() , (String)dynConstraints[18] , (java.util.Date)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (java.util.Date)dynConstraints[23] , ((Number) dynConstraints[24]).shortValue() , ((Boolean) dynConstraints[25]).booleanValue() , (String)dynConstraints[26] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08K32", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(6);
               ((String[]) buf[8])[0] = rslt.getString(7, 20);
               ((long[]) buf[9])[0] = rslt.getLong(8);
               ((String[]) buf[10])[0] = rslt.getString(9, 1);
               ((String[]) buf[11])[0] = rslt.getString(10, 1);
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
                  stmt.setLong(sIdx, ((Number) parms[11]).longValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[12]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 20);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 20);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[15]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[16]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[20]);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[21]);
               }
               return;
      }
   }

}

