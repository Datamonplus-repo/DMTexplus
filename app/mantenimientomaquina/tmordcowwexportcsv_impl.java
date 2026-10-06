package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tmordcowwexportcsv_impl extends GXWebProcedure
{
   public tmordcowwexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "TMOrdCoWWExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("MantenimientoMaquina.TMOrdCoWWColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("MantenimientoMaquina.TMOrdCoWWColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cod de Orden de Mantto", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Operario Mantenimiento", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre Operario", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Tipo de Línea", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cantidad Consumo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Ultimo Control", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV53Mantenimientomaquina_tmordcowwds_1_filterfulltext = AV30FilterFullText ;
      AV54Mantenimientomaquina_tmordcowwds_2_tfomcod = AV38TFOMCod ;
      AV55Mantenimientomaquina_tmordcowwds_3_tfomcod_to = AV39TFOMCod_To ;
      AV56Mantenimientomaquina_tmordcowwds_4_tfomopecod = AV40TFOMOpeCod ;
      AV57Mantenimientomaquina_tmordcowwds_5_tfomopecod_to = AV41TFOMOpeCod_To ;
      AV58Mantenimientomaquina_tmordcowwds_6_tfomopenom = AV42TFOMOpeNom ;
      AV59Mantenimientomaquina_tmordcowwds_7_tfomopenom_sel = AV43TFOMOpeNom_Sel ;
      AV60Mantenimientomaquina_tmordcowwds_8_tfommtpo_sels = AV45TFOMMTpo_Sels ;
      AV61Mantenimientomaquina_tmordcowwds_9_tfommccnt = AV46TFOMMCCnt ;
      AV62Mantenimientomaquina_tmordcowwds_10_tfommccnt_to = AV47TFOMMCCnt_To ;
      AV63Mantenimientomaquina_tmordcowwds_11_tfommcult = AV48TFOMMCUlt ;
      AV64Mantenimientomaquina_tmordcowwds_12_tfommcult_to = AV49TFOMMCUlt_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A9458OMMTpo ,
                                           AV60Mantenimientomaquina_tmordcowwds_8_tfommtpo_sels ,
                                           Integer.valueOf(AV54Mantenimientomaquina_tmordcowwds_2_tfomcod) ,
                                           Integer.valueOf(AV55Mantenimientomaquina_tmordcowwds_3_tfomcod_to) ,
                                           Integer.valueOf(AV56Mantenimientomaquina_tmordcowwds_4_tfomopecod) ,
                                           Integer.valueOf(AV57Mantenimientomaquina_tmordcowwds_5_tfomopecod_to) ,
                                           AV59Mantenimientomaquina_tmordcowwds_7_tfomopenom_sel ,
                                           AV58Mantenimientomaquina_tmordcowwds_6_tfomopenom ,
                                           Integer.valueOf(AV60Mantenimientomaquina_tmordcowwds_8_tfommtpo_sels.size()) ,
                                           AV61Mantenimientomaquina_tmordcowwds_9_tfommccnt ,
                                           AV62Mantenimientomaquina_tmordcowwds_10_tfommccnt_to ,
                                           Short.valueOf(AV63Mantenimientomaquina_tmordcowwds_11_tfommcult) ,
                                           Short.valueOf(AV64Mantenimientomaquina_tmordcowwds_12_tfommcult_to) ,
                                           Integer.valueOf(A9425OMCod) ,
                                           Integer.valueOf(A9455OMOpeCod) ,
                                           A9456OMOpeNom ,
                                           A9461OMMCCnt ,
                                           Short.valueOf(A9465OMMCUlt) ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) ,
                                           AV53Mantenimientomaquina_tmordcowwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV58Mantenimientomaquina_tmordcowwds_6_tfomopenom = GXutil.padr( GXutil.rtrim( AV58Mantenimientomaquina_tmordcowwds_6_tfomopenom), 30, "%") ;
      /* Using cursor P08XR2 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV54Mantenimientomaquina_tmordcowwds_2_tfomcod), Integer.valueOf(AV55Mantenimientomaquina_tmordcowwds_3_tfomcod_to), Integer.valueOf(AV56Mantenimientomaquina_tmordcowwds_4_tfomopecod), Integer.valueOf(AV57Mantenimientomaquina_tmordcowwds_5_tfomopecod_to), lV58Mantenimientomaquina_tmordcowwds_6_tfomopenom, AV59Mantenimientomaquina_tmordcowwds_7_tfomopenom_sel, AV61Mantenimientomaquina_tmordcowwds_9_tfommccnt, AV62Mantenimientomaquina_tmordcowwds_10_tfommccnt_to, Short.valueOf(AV63Mantenimientomaquina_tmordcowwds_11_tfommcult), Short.valueOf(AV64Mantenimientomaquina_tmordcowwds_12_tfommcult_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P08XR2_A396EmprCod[0] ;
         A9465OMMCUlt = P08XR2_A9465OMMCUlt[0] ;
         n9465OMMCUlt = P08XR2_n9465OMMCUlt[0] ;
         A9461OMMCCnt = P08XR2_A9461OMMCCnt[0] ;
         A9456OMOpeNom = P08XR2_A9456OMOpeNom[0] ;
         n9456OMOpeNom = P08XR2_n9456OMOpeNom[0] ;
         A9455OMOpeCod = P08XR2_A9455OMOpeCod[0] ;
         A9425OMCod = P08XR2_A9425OMCod[0] ;
         A9458OMMTpo = P08XR2_A9458OMMTpo[0] ;
         A9456OMOpeNom = P08XR2_A9456OMOpeNom[0] ;
         n9456OMOpeNom = P08XR2_n9456OMOpeNom[0] ;
         if ( (GXutil.strcmp("", AV53Mantenimientomaquina_tmordcowwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A9425OMCod, 8, 0) , GXutil.padr( "%" + AV53Mantenimientomaquina_tmordcowwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9455OMOpeCod, 6, 0) , GXutil.padr( "%" + AV53Mantenimientomaquina_tmordcowwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9456OMOpeNom) , GXutil.padr( "%" + GXutil.upper( AV53Mantenimientomaquina_tmordcowwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "reserva", ""), "") , GXutil.padr( "%" + GXutil.lower( AV53Mantenimientomaquina_tmordcowwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9458OMMTpo, httpContext.getMessage( "R", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "consumo", ""), "") , GXutil.padr( "%" + GXutil.lower( AV53Mantenimientomaquina_tmordcowwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9458OMMTpo, httpContext.getMessage( "C", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A9461OMMCCnt, 12, 3) , GXutil.padr( "%" + AV53Mantenimientomaquina_tmordcowwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9465OMMCUlt, 4, 0) , GXutil.padr( "%" + AV53Mantenimientomaquina_tmordcowwds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
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
               AV14TextFileLine += GXutil.str( A9425OMCod, 8, 0) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A9455OMOpeCod, 6, 0) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A9456OMOpeNom, ";", ","), GXv_char3) ;
               tmordcowwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               if ( GXutil.strcmp(GXutil.trim( A9458OMMTpo), "R") == 0 )
               {
                  AV14TextFileLine += httpContext.getMessage( "Reserva", "") ;
               }
               else if ( GXutil.strcmp(GXutil.trim( A9458OMMTpo), "C") == 0 )
               {
                  AV14TextFileLine += httpContext.getMessage( "Consumo", "") ;
               }
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A9461OMMCCnt, 12, 3) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A9465OMMCUlt, 4, 0) ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=TMOrdCoWWExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "OMCod", "", "Cod de Orden de Mantto", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "OMOpeCod", "", "Operario Mantenimiento", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "OMOpeNom", "", "Nombre Operario", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "OMMTpo", "", "Tipo de Línea", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "OMMCCnt", "", "Cantidad Consumo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "OMMCUlt", "", "Ultimo Control", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "MantenimientoMaquina.TMOrdCoWWColumnsSelector", GXv_char3) ;
      tmordcowwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("MantenimientoMaquina.TMOrdCoWWGridState"), "") == 0 )
      {
         AV32GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "MantenimientoMaquina.TMOrdCoWWGridState"), null, null);
      }
      else
      {
         AV32GridState.fromxml(AV19Session.getValue("MantenimientoMaquina.TMOrdCoWWGridState"), null, null);
      }
      AV28OrderedBy = AV32GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV32GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV65GXV1 = 1 ;
      while ( AV65GXV1 <= AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV65GXV1));
         if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV30FilterFullText = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMCOD") == 0 )
         {
            AV38TFOMCod = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV39TFOMCod_To = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMOPECOD") == 0 )
         {
            AV40TFOMOpeCod = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV41TFOMOpeCod_To = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMOPENOM") == 0 )
         {
            AV42TFOMOpeNom = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMOPENOM_SEL") == 0 )
         {
            AV43TFOMOpeNom_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMMTPO_SEL") == 0 )
         {
            AV44TFOMMTpo_SelsJson = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV45TFOMMTpo_Sels.fromJSonString(AV44TFOMMTpo_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMMCCNT") == 0 )
         {
            AV46TFOMMCCnt = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV47TFOMMCCnt_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMMCULT") == 0 )
         {
            AV48TFOMMCUlt = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV49TFOMMCUlt_To = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         AV65GXV1 = (int)(AV65GXV1+1) ;
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
      A9456OMOpeNom = "" ;
      A9458OMMTpo = "" ;
      A9461OMMCCnt = DecimalUtil.ZERO ;
      AV53Mantenimientomaquina_tmordcowwds_1_filterfulltext = "" ;
      AV30FilterFullText = "" ;
      AV58Mantenimientomaquina_tmordcowwds_6_tfomopenom = "" ;
      AV42TFOMOpeNom = "" ;
      AV59Mantenimientomaquina_tmordcowwds_7_tfomopenom_sel = "" ;
      AV43TFOMOpeNom_Sel = "" ;
      AV60Mantenimientomaquina_tmordcowwds_8_tfommtpo_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV45TFOMMTpo_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV61Mantenimientomaquina_tmordcowwds_9_tfommccnt = DecimalUtil.ZERO ;
      AV46TFOMMCCnt = DecimalUtil.ZERO ;
      AV62Mantenimientomaquina_tmordcowwds_10_tfommccnt_to = DecimalUtil.ZERO ;
      AV47TFOMMCCnt_To = DecimalUtil.ZERO ;
      lV53Mantenimientomaquina_tmordcowwds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV58Mantenimientomaquina_tmordcowwds_6_tfomopenom = "" ;
      P08XR2_A396EmprCod = new String[] {""} ;
      P08XR2_A9465OMMCUlt = new short[1] ;
      P08XR2_n9465OMMCUlt = new boolean[] {false} ;
      P08XR2_A9461OMMCCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08XR2_A9456OMOpeNom = new String[] {""} ;
      P08XR2_n9456OMOpeNom = new boolean[] {false} ;
      P08XR2_A9455OMOpeCod = new int[1] ;
      P08XR2_A9425OMCod = new int[1] ;
      P08XR2_A9458OMMTpo = new String[] {""} ;
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
      AV44TFOMMTpo_SelsJson = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.tmordcowwexportcsv__default(),
         new Object[] {
             new Object[] {
            P08XR2_A396EmprCod, P08XR2_A9465OMMCUlt, P08XR2_n9465OMMCUlt, P08XR2_A9461OMMCCnt, P08XR2_A9456OMOpeNom, P08XR2_n9456OMOpeNom, P08XR2_A9455OMOpeCod, P08XR2_A9425OMCod, P08XR2_A9458OMMTpo
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short A9465OMMCUlt ;
   private short AV63Mantenimientomaquina_tmordcowwds_11_tfommcult ;
   private short AV48TFOMMCUlt ;
   private short AV64Mantenimientomaquina_tmordcowwds_12_tfommcult_to ;
   private short AV49TFOMMCUlt_To ;
   private short AV28OrderedBy ;
   private short Gx_err ;
   private int AV13Random ;
   private int A9425OMCod ;
   private int A9455OMOpeCod ;
   private int AV54Mantenimientomaquina_tmordcowwds_2_tfomcod ;
   private int AV38TFOMCod ;
   private int AV55Mantenimientomaquina_tmordcowwds_3_tfomcod_to ;
   private int AV39TFOMCod_To ;
   private int AV56Mantenimientomaquina_tmordcowwds_4_tfomopecod ;
   private int AV40TFOMOpeCod ;
   private int AV57Mantenimientomaquina_tmordcowwds_5_tfomopecod_to ;
   private int AV41TFOMOpeCod_To ;
   private int AV60Mantenimientomaquina_tmordcowwds_8_tfommtpo_sels_size ;
   private int AV65GXV1 ;
   private java.math.BigDecimal A9461OMMCCnt ;
   private java.math.BigDecimal AV61Mantenimientomaquina_tmordcowwds_9_tfommccnt ;
   private java.math.BigDecimal AV46TFOMMCCnt ;
   private java.math.BigDecimal AV62Mantenimientomaquina_tmordcowwds_10_tfommccnt_to ;
   private java.math.BigDecimal AV47TFOMMCCnt_To ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A9456OMOpeNom ;
   private String A9458OMMTpo ;
   private String AV58Mantenimientomaquina_tmordcowwds_6_tfomopenom ;
   private String AV42TFOMOpeNom ;
   private String AV59Mantenimientomaquina_tmordcowwds_7_tfomopenom_sel ;
   private String AV43TFOMOpeNom_Sel ;
   private String scmdbuf ;
   private String lV58Mantenimientomaquina_tmordcowwds_6_tfomopenom ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean n9465OMMCUlt ;
   private boolean n9456OMOpeNom ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV44TFOMMTpo_SelsJson ;
   private String AV11Filename ;
   private String AV53Mantenimientomaquina_tmordcowwds_1_filterfulltext ;
   private String AV30FilterFullText ;
   private String lV53Mantenimientomaquina_tmordcowwds_1_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private String[] P08XR2_A396EmprCod ;
   private short[] P08XR2_A9465OMMCUlt ;
   private boolean[] P08XR2_n9465OMMCUlt ;
   private java.math.BigDecimal[] P08XR2_A9461OMMCCnt ;
   private String[] P08XR2_A9456OMOpeNom ;
   private boolean[] P08XR2_n9456OMOpeNom ;
   private int[] P08XR2_A9455OMOpeCod ;
   private int[] P08XR2_A9425OMCod ;
   private String[] P08XR2_A9458OMMTpo ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private GXSimpleCollection<String> AV60Mantenimientomaquina_tmordcowwds_8_tfommtpo_sels ;
   private GXSimpleCollection<String> AV45TFOMMTpo_Sels ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV32GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV33GridStateFilterValue ;
}

final  class tmordcowwexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08XR2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A9458OMMTpo ,
                                          GXSimpleCollection<String> AV60Mantenimientomaquina_tmordcowwds_8_tfommtpo_sels ,
                                          int AV54Mantenimientomaquina_tmordcowwds_2_tfomcod ,
                                          int AV55Mantenimientomaquina_tmordcowwds_3_tfomcod_to ,
                                          int AV56Mantenimientomaquina_tmordcowwds_4_tfomopecod ,
                                          int AV57Mantenimientomaquina_tmordcowwds_5_tfomopecod_to ,
                                          String AV59Mantenimientomaquina_tmordcowwds_7_tfomopenom_sel ,
                                          String AV58Mantenimientomaquina_tmordcowwds_6_tfomopenom ,
                                          int AV60Mantenimientomaquina_tmordcowwds_8_tfommtpo_sels_size ,
                                          java.math.BigDecimal AV61Mantenimientomaquina_tmordcowwds_9_tfommccnt ,
                                          java.math.BigDecimal AV62Mantenimientomaquina_tmordcowwds_10_tfommccnt_to ,
                                          short AV63Mantenimientomaquina_tmordcowwds_11_tfommcult ,
                                          short AV64Mantenimientomaquina_tmordcowwds_12_tfommcult_to ,
                                          int A9425OMCod ,
                                          int A9455OMOpeCod ,
                                          String A9456OMOpeNom ,
                                          java.math.BigDecimal A9461OMMCCnt ,
                                          short A9465OMMCUlt ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc ,
                                          String AV53Mantenimientomaquina_tmordcowwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[10];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.OMMCUlt, T1.OMMCCnt, T2.OpeNom AS OMOpeNom, T1.OMOpeCod AS OMOpeCod, T1.OMCod, T1.OMMTpo FROM (TXPMOrMO T1 INNER JOIN TXPOPERAR T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.OpeCod = T1.OMOpeCod)" ;
      if ( ! (0==AV54Mantenimientomaquina_tmordcowwds_2_tfomcod) )
      {
         addWhere(sWhereString, "(T1.OMCod >= ?)");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
      }
      if ( ! (0==AV55Mantenimientomaquina_tmordcowwds_3_tfomcod_to) )
      {
         addWhere(sWhereString, "(T1.OMCod <= ?)");
      }
      else
      {
         GXv_int6[1] = (byte)(1) ;
      }
      if ( ! (0==AV56Mantenimientomaquina_tmordcowwds_4_tfomopecod) )
      {
         addWhere(sWhereString, "(T1.OMOpeCod >= ?)");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
      }
      if ( ! (0==AV57Mantenimientomaquina_tmordcowwds_5_tfomopecod_to) )
      {
         addWhere(sWhereString, "(T1.OMOpeCod <= ?)");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Mantenimientomaquina_tmordcowwds_7_tfomopenom_sel)==0) && ( ! (GXutil.strcmp("", AV58Mantenimientomaquina_tmordcowwds_6_tfomopenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.OpeNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Mantenimientomaquina_tmordcowwds_7_tfomopenom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.OpeNom = ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( AV60Mantenimientomaquina_tmordcowwds_8_tfommtpo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV60Mantenimientomaquina_tmordcowwds_8_tfommtpo_sels, "T1.OMMTpo IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV61Mantenimientomaquina_tmordcowwds_9_tfommccnt)==0) )
      {
         addWhere(sWhereString, "(T1.OMMCCnt >= ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV62Mantenimientomaquina_tmordcowwds_10_tfommccnt_to)==0) )
      {
         addWhere(sWhereString, "(T1.OMMCCnt <= ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (0==AV63Mantenimientomaquina_tmordcowwds_11_tfommcult) )
      {
         addWhere(sWhereString, "(T1.OMMCUlt >= ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (0==AV64Mantenimientomaquina_tmordcowwds_12_tfommcult_to) )
      {
         addWhere(sWhereString, "(T1.OMMCUlt <= ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.OpeNom" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.OpeNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.OMCod" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.OMCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.OMOpeCod" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.OMOpeCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.OMMTpo" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.OMMTpo DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.OMMCCnt" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.OMMCCnt DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.OMMCUlt" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.OMMCUlt DESC" ;
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
                  return conditional_P08XR2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , ((Number) dynConstraints[17]).shortValue() , ((Number) dynConstraints[18]).shortValue() , ((Boolean) dynConstraints[19]).booleanValue() , (String)dynConstraints[20] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08XR2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,3);
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((int[]) buf[7])[0] = rslt.getInt(6);
               ((String[]) buf[8])[0] = rslt.getString(7, 1);
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
                  stmt.setInt(sIdx, ((Number) parms[10]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[11]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[12]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[13]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[16], 3);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[17], 3);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[18]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[19]).shortValue());
               }
               return;
      }
   }

}

