package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tminvstwwexportcsv_impl extends GXWebProcedure
{
   public tminvstwwexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "TMInvStWWExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("MantenimientoMaquina.TMInvStWWColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("MantenimientoMaquina.TMInvStWWColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Inventario de Stock", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha del Inventario", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha Aplicado", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Estado", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Usuario que creo el Inventario", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha de Creación del Invent.", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV53Mantenimientomaquina_tminvstwwds_1_filterfulltext = AV30FilterFullText ;
      AV54Mantenimientomaquina_tminvstwwds_2_tfmiscod = AV38TFMISCod ;
      AV55Mantenimientomaquina_tminvstwwds_3_tfmiscod_to = AV39TFMISCod_To ;
      AV56Mantenimientomaquina_tminvstwwds_4_tfmisfch = AV40TFMISFch ;
      AV57Mantenimientomaquina_tminvstwwds_5_tfmisfchapl = AV48TFMISFchApl ;
      AV58Mantenimientomaquina_tminvstwwds_6_tfmisest_sels = AV47TFMISEst_Sels ;
      AV59Mantenimientomaquina_tminvstwwds_7_tfmisusucre = AV42TFMISUsuCre ;
      AV60Mantenimientomaquina_tminvstwwds_8_tfmisusucre_sel = AV43TFMISUsuCre_Sel ;
      AV61Mantenimientomaquina_tminvstwwds_9_tfmisfchcre = AV44TFMISFchCre ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A9402MISEst ,
                                           AV58Mantenimientomaquina_tminvstwwds_6_tfmisest_sels ,
                                           Integer.valueOf(AV54Mantenimientomaquina_tminvstwwds_2_tfmiscod) ,
                                           Integer.valueOf(AV55Mantenimientomaquina_tminvstwwds_3_tfmiscod_to) ,
                                           AV56Mantenimientomaquina_tminvstwwds_4_tfmisfch ,
                                           AV57Mantenimientomaquina_tminvstwwds_5_tfmisfchapl ,
                                           Integer.valueOf(AV58Mantenimientomaquina_tminvstwwds_6_tfmisest_sels.size()) ,
                                           AV60Mantenimientomaquina_tminvstwwds_8_tfmisusucre_sel ,
                                           AV59Mantenimientomaquina_tminvstwwds_7_tfmisusucre ,
                                           AV61Mantenimientomaquina_tminvstwwds_9_tfmisfchcre ,
                                           Integer.valueOf(A9398MISCod) ,
                                           A9399MISFch ,
                                           A11303MISFchApl ,
                                           A9400MISUsuCre ,
                                           A9401MISFchCre ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) ,
                                           AV53Mantenimientomaquina_tminvstwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.INT, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV59Mantenimientomaquina_tminvstwwds_7_tfmisusucre = GXutil.padr( GXutil.rtrim( AV59Mantenimientomaquina_tminvstwwds_7_tfmisusucre), 10, "%") ;
      /* Using cursor P08EL2 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV54Mantenimientomaquina_tminvstwwds_2_tfmiscod), Integer.valueOf(AV55Mantenimientomaquina_tminvstwwds_3_tfmiscod_to), AV56Mantenimientomaquina_tminvstwwds_4_tfmisfch, AV57Mantenimientomaquina_tminvstwwds_5_tfmisfchapl, lV59Mantenimientomaquina_tminvstwwds_7_tfmisusucre, AV60Mantenimientomaquina_tminvstwwds_8_tfmisusucre_sel, AV61Mantenimientomaquina_tminvstwwds_9_tfmisfchcre});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A9401MISFchCre = P08EL2_A9401MISFchCre[0] ;
         n9401MISFchCre = P08EL2_n9401MISFchCre[0] ;
         A9400MISUsuCre = P08EL2_A9400MISUsuCre[0] ;
         n9400MISUsuCre = P08EL2_n9400MISUsuCre[0] ;
         A11303MISFchApl = P08EL2_A11303MISFchApl[0] ;
         n11303MISFchApl = P08EL2_n11303MISFchApl[0] ;
         A9399MISFch = P08EL2_A9399MISFch[0] ;
         n9399MISFch = P08EL2_n9399MISFch[0] ;
         A9398MISCod = P08EL2_A9398MISCod[0] ;
         A9402MISEst = P08EL2_A9402MISEst[0] ;
         n9402MISEst = P08EL2_n9402MISEst[0] ;
         A396EmprCod = P08EL2_A396EmprCod[0] ;
         if ( (GXutil.strcmp("", AV53Mantenimientomaquina_tminvstwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A9398MISCod, 8, 0) , GXutil.padr( "%" + AV53Mantenimientomaquina_tminvstwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "en ingreso", ""), "") , GXutil.padr( "%" + GXutil.lower( AV53Mantenimientomaquina_tminvstwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9402MISEst, httpContext.getMessage( "E", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "aplicado", ""), "") , GXutil.padr( "%" + GXutil.lower( AV53Mantenimientomaquina_tminvstwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9402MISEst, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "cancelado", ""), "") , GXutil.padr( "%" + GXutil.lower( AV53Mantenimientomaquina_tminvstwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9402MISEst, httpContext.getMessage( "C", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A9400MISUsuCre) , GXutil.padr( "%" + GXutil.upper( AV53Mantenimientomaquina_tminvstwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
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
               AV14TextFileLine += GXutil.str( A9398MISCod, 8, 0) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += localUtil.dtoc( A9399MISFch, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += localUtil.dtoc( A11303MISFchApl, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               if ( GXutil.strcmp(GXutil.trim( A9402MISEst), "E") == 0 )
               {
                  AV14TextFileLine += httpContext.getMessage( "En ingreso", "") ;
               }
               else if ( GXutil.strcmp(GXutil.trim( A9402MISEst), "A") == 0 )
               {
                  AV14TextFileLine += httpContext.getMessage( "Aplicado", "") ;
               }
               else if ( GXutil.strcmp(GXutil.trim( A9402MISEst), "C") == 0 )
               {
                  AV14TextFileLine += httpContext.getMessage( "Cancelado", "") ;
               }
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A9400MISUsuCre, ";", ","), GXv_char3) ;
               tminvstwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += localUtil.ttoc( A9401MISFchCre, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=TMInvStWWExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MISCod", "", "Inventario de Stock", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MISFch", "", "Fecha del Inventario", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MISFchApl", "", "Fecha Aplicado", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MISEst", "", "Estado", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MISUsuCre", "", "Usuario que creo el Inventario", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MISFchCre", "", "Fecha de Creación del Invent.", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "MantenimientoMaquina.TMInvStWWColumnsSelector", GXv_char3) ;
      tminvstwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("MantenimientoMaquina.TMInvStWWGridState"), "") == 0 )
      {
         AV32GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "MantenimientoMaquina.TMInvStWWGridState"), null, null);
      }
      else
      {
         AV32GridState.fromxml(AV19Session.getValue("MantenimientoMaquina.TMInvStWWGridState"), null, null);
      }
      AV28OrderedBy = AV32GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV32GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV62GXV1 = 1 ;
      while ( AV62GXV1 <= AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV62GXV1));
         if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV30FilterFullText = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMISCOD") == 0 )
         {
            AV38TFMISCod = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV39TFMISCod_To = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMISFCH") == 0 )
         {
            AV40TFMISFch = localUtil.ctod( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMISFCHAPL") == 0 )
         {
            AV48TFMISFchApl = localUtil.ctod( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMISEST_SEL") == 0 )
         {
            AV46TFMISEst_SelsJson = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV47TFMISEst_Sels.fromJSonString(AV46TFMISEst_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMISUSUCRE") == 0 )
         {
            AV42TFMISUsuCre = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMISUSUCRE_SEL") == 0 )
         {
            AV43TFMISUsuCre_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMISFCHCRE") == 0 )
         {
            AV44TFMISFchCre = localUtil.ctot( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         AV62GXV1 = (int)(AV62GXV1+1) ;
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
      A9399MISFch = GXutil.nullDate() ;
      A11303MISFchApl = GXutil.nullDate() ;
      A9402MISEst = "" ;
      A9400MISUsuCre = "" ;
      A9401MISFchCre = GXutil.resetTime( GXutil.nullDate() );
      AV53Mantenimientomaquina_tminvstwwds_1_filterfulltext = "" ;
      AV30FilterFullText = "" ;
      AV56Mantenimientomaquina_tminvstwwds_4_tfmisfch = GXutil.nullDate() ;
      AV40TFMISFch = GXutil.nullDate() ;
      AV57Mantenimientomaquina_tminvstwwds_5_tfmisfchapl = GXutil.nullDate() ;
      AV48TFMISFchApl = GXutil.nullDate() ;
      AV58Mantenimientomaquina_tminvstwwds_6_tfmisest_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV47TFMISEst_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV59Mantenimientomaquina_tminvstwwds_7_tfmisusucre = "" ;
      AV42TFMISUsuCre = "" ;
      AV60Mantenimientomaquina_tminvstwwds_8_tfmisusucre_sel = "" ;
      AV43TFMISUsuCre_Sel = "" ;
      AV61Mantenimientomaquina_tminvstwwds_9_tfmisfchcre = GXutil.resetTime( GXutil.nullDate() );
      AV44TFMISFchCre = GXutil.resetTime( GXutil.nullDate() );
      lV53Mantenimientomaquina_tminvstwwds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV59Mantenimientomaquina_tminvstwwds_7_tfmisusucre = "" ;
      P08EL2_A9401MISFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      P08EL2_n9401MISFchCre = new boolean[] {false} ;
      P08EL2_A9400MISUsuCre = new String[] {""} ;
      P08EL2_n9400MISUsuCre = new boolean[] {false} ;
      P08EL2_A11303MISFchApl = new java.util.Date[] {GXutil.nullDate()} ;
      P08EL2_n11303MISFchApl = new boolean[] {false} ;
      P08EL2_A9399MISFch = new java.util.Date[] {GXutil.nullDate()} ;
      P08EL2_n9399MISFch = new boolean[] {false} ;
      P08EL2_A9398MISCod = new int[1] ;
      P08EL2_A9402MISEst = new String[] {""} ;
      P08EL2_n9402MISEst = new boolean[] {false} ;
      P08EL2_A396EmprCod = new String[] {""} ;
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
      AV46TFMISEst_SelsJson = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.tminvstwwexportcsv__default(),
         new Object[] {
             new Object[] {
            P08EL2_A9401MISFchCre, P08EL2_n9401MISFchCre, P08EL2_A9400MISUsuCre, P08EL2_n9400MISUsuCre, P08EL2_A11303MISFchApl, P08EL2_n11303MISFchApl, P08EL2_A9399MISFch, P08EL2_n9399MISFch, P08EL2_A9398MISCod, P08EL2_A9402MISEst,
            P08EL2_n9402MISEst, P08EL2_A396EmprCod
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
   private int A9398MISCod ;
   private int AV54Mantenimientomaquina_tminvstwwds_2_tfmiscod ;
   private int AV38TFMISCod ;
   private int AV55Mantenimientomaquina_tminvstwwds_3_tfmiscod_to ;
   private int AV39TFMISCod_To ;
   private int AV58Mantenimientomaquina_tminvstwwds_6_tfmisest_sels_size ;
   private int AV62GXV1 ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A9402MISEst ;
   private String A9400MISUsuCre ;
   private String AV59Mantenimientomaquina_tminvstwwds_7_tfmisusucre ;
   private String AV42TFMISUsuCre ;
   private String AV60Mantenimientomaquina_tminvstwwds_8_tfmisusucre_sel ;
   private String AV43TFMISUsuCre_Sel ;
   private String scmdbuf ;
   private String lV59Mantenimientomaquina_tminvstwwds_7_tfmisusucre ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private java.util.Date A9401MISFchCre ;
   private java.util.Date AV61Mantenimientomaquina_tminvstwwds_9_tfmisfchcre ;
   private java.util.Date AV44TFMISFchCre ;
   private java.util.Date A9399MISFch ;
   private java.util.Date A11303MISFchApl ;
   private java.util.Date AV56Mantenimientomaquina_tminvstwwds_4_tfmisfch ;
   private java.util.Date AV40TFMISFch ;
   private java.util.Date AV57Mantenimientomaquina_tminvstwwds_5_tfmisfchapl ;
   private java.util.Date AV48TFMISFchApl ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean n9401MISFchCre ;
   private boolean n9400MISUsuCre ;
   private boolean n11303MISFchApl ;
   private boolean n9399MISFch ;
   private boolean n9402MISEst ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV46TFMISEst_SelsJson ;
   private String AV11Filename ;
   private String AV53Mantenimientomaquina_tminvstwwds_1_filterfulltext ;
   private String AV30FilterFullText ;
   private String lV53Mantenimientomaquina_tminvstwwds_1_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] P08EL2_A9401MISFchCre ;
   private boolean[] P08EL2_n9401MISFchCre ;
   private String[] P08EL2_A9400MISUsuCre ;
   private boolean[] P08EL2_n9400MISUsuCre ;
   private java.util.Date[] P08EL2_A11303MISFchApl ;
   private boolean[] P08EL2_n11303MISFchApl ;
   private java.util.Date[] P08EL2_A9399MISFch ;
   private boolean[] P08EL2_n9399MISFch ;
   private int[] P08EL2_A9398MISCod ;
   private String[] P08EL2_A9402MISEst ;
   private boolean[] P08EL2_n9402MISEst ;
   private String[] P08EL2_A396EmprCod ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private GXSimpleCollection<String> AV58Mantenimientomaquina_tminvstwwds_6_tfmisest_sels ;
   private GXSimpleCollection<String> AV47TFMISEst_Sels ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV32GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV33GridStateFilterValue ;
}

final  class tminvstwwexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08EL2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A9402MISEst ,
                                          GXSimpleCollection<String> AV58Mantenimientomaquina_tminvstwwds_6_tfmisest_sels ,
                                          int AV54Mantenimientomaquina_tminvstwwds_2_tfmiscod ,
                                          int AV55Mantenimientomaquina_tminvstwwds_3_tfmiscod_to ,
                                          java.util.Date AV56Mantenimientomaquina_tminvstwwds_4_tfmisfch ,
                                          java.util.Date AV57Mantenimientomaquina_tminvstwwds_5_tfmisfchapl ,
                                          int AV58Mantenimientomaquina_tminvstwwds_6_tfmisest_sels_size ,
                                          String AV60Mantenimientomaquina_tminvstwwds_8_tfmisusucre_sel ,
                                          String AV59Mantenimientomaquina_tminvstwwds_7_tfmisusucre ,
                                          java.util.Date AV61Mantenimientomaquina_tminvstwwds_9_tfmisfchcre ,
                                          int A9398MISCod ,
                                          java.util.Date A9399MISFch ,
                                          java.util.Date A11303MISFchApl ,
                                          String A9400MISUsuCre ,
                                          java.util.Date A9401MISFchCre ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc ,
                                          String AV53Mantenimientomaquina_tminvstwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[7];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT MISFchCre, MISUsuCre, MISFchApl, MISFch, MISCod, MISEst, EmprCod FROM TXPMINVST" ;
      if ( ! (0==AV54Mantenimientomaquina_tminvstwwds_2_tfmiscod) )
      {
         addWhere(sWhereString, "(MISCod >= ?)");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
      }
      if ( ! (0==AV55Mantenimientomaquina_tminvstwwds_3_tfmiscod_to) )
      {
         addWhere(sWhereString, "(MISCod <= ?)");
      }
      else
      {
         GXv_int6[1] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV56Mantenimientomaquina_tminvstwwds_4_tfmisfch)) )
      {
         addWhere(sWhereString, "(MISFch >= ?)");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV57Mantenimientomaquina_tminvstwwds_5_tfmisfchapl)) )
      {
         addWhere(sWhereString, "(MISFchApl >= ?)");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( AV58Mantenimientomaquina_tminvstwwds_6_tfmisest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV58Mantenimientomaquina_tminvstwwds_6_tfmisest_sels, "MISEst IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV60Mantenimientomaquina_tminvstwwds_8_tfmisusucre_sel)==0) && ( ! (GXutil.strcmp("", AV59Mantenimientomaquina_tminvstwwds_7_tfmisusucre)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MISUsuCre) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Mantenimientomaquina_tminvstwwds_8_tfmisusucre_sel)==0) )
      {
         addWhere(sWhereString, "(MISUsuCre = ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV61Mantenimientomaquina_tminvstwwds_9_tfmisfchcre) )
      {
         addWhere(sWhereString, "(MISFchCre >= ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY MISCod" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MISCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY MISFch" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MISFch DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY MISFchApl" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MISFchApl DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY MISEst" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MISEst DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY MISUsuCre" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MISUsuCre DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY MISFchCre" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MISFchCre DESC" ;
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
                  return conditional_P08EL2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (java.util.Date)dynConstraints[4] , (java.util.Date)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (java.util.Date)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , (java.util.Date)dynConstraints[11] , (java.util.Date)dynConstraints[12] , (String)dynConstraints[13] , (java.util.Date)dynConstraints[14] , ((Number) dynConstraints[15]).shortValue() , ((Boolean) dynConstraints[16]).booleanValue() , (String)dynConstraints[17] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08EL2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDateTime(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 10);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(5);
               ((String[]) buf[9])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 3);
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
                  stmt.setInt(sIdx, ((Number) parms[7]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[8]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[9]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[10]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 10);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 10);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[13], false);
               }
               return;
      }
   }

}

