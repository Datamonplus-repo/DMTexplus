package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tterpeswwexportcsv_impl extends GXWebProcedure
{
   public tterpeswwexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "TTERPESWWExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("TTERPESWWColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("TTERPESWWColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Código del Terminal", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripción", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Tipo de Bascula", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Ultimo Rango", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Protocolo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Pesaje Colorantes?", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV53Tterpeswwds_1_filterfulltext = AV30FilterFullText ;
      AV54Tterpeswwds_2_tftermcod = AV34TFTermCod ;
      AV55Tterpeswwds_3_tftermcod_sel = AV35TFTermCod_Sel ;
      AV56Tterpeswwds_4_tftermdsc = AV36TFTermDsc ;
      AV57Tterpeswwds_5_tftermdsc_sel = AV37TFTermDsc_Sel ;
      AV58Tterpeswwds_6_tftermpestpo_sels = AV43TFTermPesTpo_Sels ;
      AV59Tterpeswwds_7_tftermpesult = AV45TFTermPesUlt ;
      AV60Tterpeswwds_8_tftermpesult_to = AV46TFTermPesUlt_To ;
      AV61Tterpeswwds_9_tftermpespro = AV47TFTermPesPro ;
      AV62Tterpeswwds_10_tftermpespro_sel = AV48TFTermPesPro_Sel ;
      AV63Tterpeswwds_11_tftermpes_sel = AV49TFTermPes_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A10177TermPesTpo ,
                                           AV58Tterpeswwds_6_tftermpestpo_sels ,
                                           AV55Tterpeswwds_3_tftermcod_sel ,
                                           AV54Tterpeswwds_2_tftermcod ,
                                           AV57Tterpeswwds_5_tftermdsc_sel ,
                                           AV56Tterpeswwds_4_tftermdsc ,
                                           Integer.valueOf(AV58Tterpeswwds_6_tftermpestpo_sels.size()) ,
                                           Long.valueOf(AV59Tterpeswwds_7_tftermpesult) ,
                                           Long.valueOf(AV60Tterpeswwds_8_tftermpesult_to) ,
                                           AV62Tterpeswwds_10_tftermpespro_sel ,
                                           AV61Tterpeswwds_9_tftermpespro ,
                                           Byte.valueOf(AV63Tterpeswwds_11_tftermpes_sel) ,
                                           A942TermCod ,
                                           A8898TermDsc ,
                                           Long.valueOf(A8901TermPesUlt) ,
                                           A8900TermPesPro ,
                                           Byte.valueOf(A8899TermPes) ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) ,
                                           AV53Tterpeswwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BOOLEAN,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV54Tterpeswwds_2_tftermcod = GXutil.padr( GXutil.rtrim( AV54Tterpeswwds_2_tftermcod), 10, "%") ;
      lV56Tterpeswwds_4_tftermdsc = GXutil.padr( GXutil.rtrim( AV56Tterpeswwds_4_tftermdsc), 30, "%") ;
      lV61Tterpeswwds_9_tftermpespro = GXutil.padr( GXutil.rtrim( AV61Tterpeswwds_9_tftermpespro), 20, "%") ;
      /* Using cursor P097R2 */
      pr_default.execute(0, new Object[] {lV54Tterpeswwds_2_tftermcod, AV55Tterpeswwds_3_tftermcod_sel, lV56Tterpeswwds_4_tftermdsc, AV57Tterpeswwds_5_tftermdsc_sel, Long.valueOf(AV59Tterpeswwds_7_tftermpesult), Long.valueOf(AV60Tterpeswwds_8_tftermpesult_to), lV61Tterpeswwds_9_tftermpespro, AV62Tterpeswwds_10_tftermpespro_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A8899TermPes = P097R2_A8899TermPes[0] ;
         n8899TermPes = P097R2_n8899TermPes[0] ;
         A8900TermPesPro = P097R2_A8900TermPesPro[0] ;
         A8901TermPesUlt = P097R2_A8901TermPesUlt[0] ;
         n8901TermPesUlt = P097R2_n8901TermPesUlt[0] ;
         A8898TermDsc = P097R2_A8898TermDsc[0] ;
         n8898TermDsc = P097R2_n8898TermDsc[0] ;
         A942TermCod = P097R2_A942TermCod[0] ;
         A10177TermPesTpo = P097R2_A10177TermPesTpo[0] ;
         n10177TermPesTpo = P097R2_n10177TermPesTpo[0] ;
         A8899TermPes = P097R2_A8899TermPes[0] ;
         n8899TermPes = P097R2_n8899TermPes[0] ;
         A8898TermDsc = P097R2_A8898TermDsc[0] ;
         n8898TermDsc = P097R2_n8898TermDsc[0] ;
         if ( (GXutil.strcmp("", AV53Tterpeswwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A942TermCod) , GXutil.padr( "%" + GXutil.upper( AV53Tterpeswwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A8898TermDsc) , GXutil.padr( "%" + GXutil.upper( AV53Tterpeswwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "colorantes", ""), "") , GXutil.padr( "%" + GXutil.lower( AV53Tterpeswwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A10177TermPesTpo, httpContext.getMessage( "C", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "auxiliares", ""), "") , GXutil.padr( "%" + GXutil.lower( AV53Tterpeswwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A10177TermPesTpo, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "todos", ""), "") , GXutil.padr( "%" + GXutil.lower( AV53Tterpeswwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A10177TermPesTpo, httpContext.getMessage( "T", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A8901TermPesUlt, 10, 0) , GXutil.padr( "%" + AV53Tterpeswwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A8900TermPesPro) , GXutil.padr( "%" + GXutil.upper( AV53Tterpeswwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
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
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A942TermCod, ";", ","), GXv_char3) ;
               tterpeswwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A8898TermDsc, ";", ","), GXv_char3) ;
               tterpeswwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               if ( GXutil.strcmp(GXutil.trim( A10177TermPesTpo), "C") == 0 )
               {
                  AV14TextFileLine += httpContext.getMessage( "Colorantes", "") ;
               }
               else if ( GXutil.strcmp(GXutil.trim( A10177TermPesTpo), "A") == 0 )
               {
                  AV14TextFileLine += httpContext.getMessage( "Auxiliares", "") ;
               }
               else if ( GXutil.strcmp(GXutil.trim( A10177TermPesTpo), "T") == 0 )
               {
                  AV14TextFileLine += httpContext.getMessage( "Todos", "") ;
               }
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A8901TermPesUlt, 10, 0) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A8900TermPesPro, ";", ","), GXv_char3) ;
               tterpeswwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A8899TermPes, 1, 0) ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=TTERPESWWExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "TermCod", "", "Código del Terminal", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "TermDsc", "", "Descripción", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "TermPesTpo", "", "Tipo de Bascula", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "TermPesUlt", "", "Ultimo Rango", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "TermPesPro", "", "Protocolo", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "TermPes", "", "Pesaje Colorantes?", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "TTERPESWWColumnsSelector", GXv_char3) ;
      tterpeswwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("TTERPESWWGridState"), "") == 0 )
      {
         AV32GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TTERPESWWGridState"), null, null);
      }
      else
      {
         AV32GridState.fromxml(AV19Session.getValue("TTERPESWWGridState"), null, null);
      }
      AV28OrderedBy = AV32GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV32GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV64GXV1 = 1 ;
      while ( AV64GXV1 <= AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV64GXV1));
         if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV30FilterFullText = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTERMCOD") == 0 )
         {
            AV34TFTermCod = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTERMCOD_SEL") == 0 )
         {
            AV35TFTermCod_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTERMDSC") == 0 )
         {
            AV36TFTermDsc = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTERMDSC_SEL") == 0 )
         {
            AV37TFTermDsc_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTERMPESTPO_SEL") == 0 )
         {
            AV42TFTermPesTpo_SelsJson = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV43TFTermPesTpo_Sels.fromJSonString(AV42TFTermPesTpo_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTERMPESULT") == 0 )
         {
            AV45TFTermPesUlt = GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            AV46TFTermPesUlt_To = GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTERMPESPRO") == 0 )
         {
            AV47TFTermPesPro = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTERMPESPRO_SEL") == 0 )
         {
            AV48TFTermPesPro_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTERMPES_SEL") == 0 )
         {
            AV49TFTermPes_Sel = (byte)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV64GXV1 = (int)(AV64GXV1+1) ;
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
      A942TermCod = "" ;
      A8898TermDsc = "" ;
      A10177TermPesTpo = "" ;
      A8900TermPesPro = "" ;
      AV53Tterpeswwds_1_filterfulltext = "" ;
      AV30FilterFullText = "" ;
      AV54Tterpeswwds_2_tftermcod = "" ;
      AV34TFTermCod = "" ;
      AV55Tterpeswwds_3_tftermcod_sel = "" ;
      AV35TFTermCod_Sel = "" ;
      AV56Tterpeswwds_4_tftermdsc = "" ;
      AV36TFTermDsc = "" ;
      AV57Tterpeswwds_5_tftermdsc_sel = "" ;
      AV37TFTermDsc_Sel = "" ;
      AV58Tterpeswwds_6_tftermpestpo_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV43TFTermPesTpo_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV61Tterpeswwds_9_tftermpespro = "" ;
      AV47TFTermPesPro = "" ;
      AV62Tterpeswwds_10_tftermpespro_sel = "" ;
      AV48TFTermPesPro_Sel = "" ;
      lV53Tterpeswwds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV54Tterpeswwds_2_tftermcod = "" ;
      lV56Tterpeswwds_4_tftermdsc = "" ;
      lV61Tterpeswwds_9_tftermpespro = "" ;
      P097R2_A8899TermPes = new byte[1] ;
      P097R2_n8899TermPes = new boolean[] {false} ;
      P097R2_A8900TermPesPro = new String[] {""} ;
      P097R2_A8901TermPesUlt = new long[1] ;
      P097R2_n8901TermPesUlt = new boolean[] {false} ;
      P097R2_A8898TermDsc = new String[] {""} ;
      P097R2_n8898TermDsc = new boolean[] {false} ;
      P097R2_A942TermCod = new String[] {""} ;
      P097R2_A10177TermPesTpo = new String[] {""} ;
      P097R2_n10177TermPesTpo = new boolean[] {false} ;
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
      AV42TFTermPesTpo_SelsJson = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tterpeswwexportcsv__default(),
         new Object[] {
             new Object[] {
            P097R2_A8899TermPes, P097R2_n8899TermPes, P097R2_A8900TermPesPro, P097R2_A8901TermPesUlt, P097R2_n8901TermPesUlt, P097R2_A8898TermDsc, P097R2_n8898TermDsc, P097R2_A942TermCod, P097R2_A10177TermPesTpo, P097R2_n10177TermPesTpo
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A8899TermPes ;
   private byte AV63Tterpeswwds_11_tftermpes_sel ;
   private byte AV49TFTermPes_Sel ;
   private short gxcookieaux ;
   private short AV28OrderedBy ;
   private short Gx_err ;
   private int AV13Random ;
   private int AV58Tterpeswwds_6_tftermpestpo_sels_size ;
   private int AV64GXV1 ;
   private long A8901TermPesUlt ;
   private long AV59Tterpeswwds_7_tftermpesult ;
   private long AV45TFTermPesUlt ;
   private long AV60Tterpeswwds_8_tftermpesult_to ;
   private long AV46TFTermPesUlt_To ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A942TermCod ;
   private String A8898TermDsc ;
   private String A10177TermPesTpo ;
   private String A8900TermPesPro ;
   private String AV54Tterpeswwds_2_tftermcod ;
   private String AV34TFTermCod ;
   private String AV55Tterpeswwds_3_tftermcod_sel ;
   private String AV35TFTermCod_Sel ;
   private String AV56Tterpeswwds_4_tftermdsc ;
   private String AV36TFTermDsc ;
   private String AV57Tterpeswwds_5_tftermdsc_sel ;
   private String AV37TFTermDsc_Sel ;
   private String AV61Tterpeswwds_9_tftermpespro ;
   private String AV47TFTermPesPro ;
   private String AV62Tterpeswwds_10_tftermpespro_sel ;
   private String AV48TFTermPesPro_Sel ;
   private String scmdbuf ;
   private String lV54Tterpeswwds_2_tftermcod ;
   private String lV56Tterpeswwds_4_tftermdsc ;
   private String lV61Tterpeswwds_9_tftermpespro ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean n8899TermPes ;
   private boolean n8901TermPesUlt ;
   private boolean n8898TermDsc ;
   private boolean n10177TermPesTpo ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV42TFTermPesTpo_SelsJson ;
   private String AV11Filename ;
   private String AV53Tterpeswwds_1_filterfulltext ;
   private String AV30FilterFullText ;
   private String lV53Tterpeswwds_1_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private byte[] P097R2_A8899TermPes ;
   private boolean[] P097R2_n8899TermPes ;
   private String[] P097R2_A8900TermPesPro ;
   private long[] P097R2_A8901TermPesUlt ;
   private boolean[] P097R2_n8901TermPesUlt ;
   private String[] P097R2_A8898TermDsc ;
   private boolean[] P097R2_n8898TermDsc ;
   private String[] P097R2_A942TermCod ;
   private String[] P097R2_A10177TermPesTpo ;
   private boolean[] P097R2_n10177TermPesTpo ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private GXSimpleCollection<String> AV58Tterpeswwds_6_tftermpestpo_sels ;
   private GXSimpleCollection<String> AV43TFTermPesTpo_Sels ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV32GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV33GridStateFilterValue ;
}

final  class tterpeswwexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P097R2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A10177TermPesTpo ,
                                          GXSimpleCollection<String> AV58Tterpeswwds_6_tftermpestpo_sels ,
                                          String AV55Tterpeswwds_3_tftermcod_sel ,
                                          String AV54Tterpeswwds_2_tftermcod ,
                                          String AV57Tterpeswwds_5_tftermdsc_sel ,
                                          String AV56Tterpeswwds_4_tftermdsc ,
                                          int AV58Tterpeswwds_6_tftermpestpo_sels_size ,
                                          long AV59Tterpeswwds_7_tftermpesult ,
                                          long AV60Tterpeswwds_8_tftermpesult_to ,
                                          String AV62Tterpeswwds_10_tftermpespro_sel ,
                                          String AV61Tterpeswwds_9_tftermpespro ,
                                          byte AV63Tterpeswwds_11_tftermpes_sel ,
                                          String A942TermCod ,
                                          String A8898TermDsc ,
                                          long A8901TermPesUlt ,
                                          String A8900TermPesPro ,
                                          byte A8899TermPes ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc ,
                                          String AV53Tterpeswwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[8];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T2.TermPes, T1.TermPesPro, T1.TermPesUlt, T2.TermDsc, T1.TermCod, T1.TermPesTpo FROM (TXPTERMI1 T1 INNER JOIN TXPTERMIN T2 ON T2.TermCod = T1.TermCod)" ;
      if ( (GXutil.strcmp("", AV55Tterpeswwds_3_tftermcod_sel)==0) && ( ! (GXutil.strcmp("", AV54Tterpeswwds_2_tftermcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.TermCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Tterpeswwds_3_tftermcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.TermCod = ?)");
      }
      else
      {
         GXv_int6[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Tterpeswwds_5_tftermdsc_sel)==0) && ( ! (GXutil.strcmp("", AV56Tterpeswwds_4_tftermdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TermDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Tterpeswwds_5_tftermdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TermDsc = ?)");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( AV58Tterpeswwds_6_tftermpestpo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV58Tterpeswwds_6_tftermpestpo_sels, "T1.TermPesTpo IN (", ")")+")");
      }
      if ( ! (0==AV59Tterpeswwds_7_tftermpesult) )
      {
         addWhere(sWhereString, "(T1.TermPesUlt >= ?)");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( ! (0==AV60Tterpeswwds_8_tftermpesult_to) )
      {
         addWhere(sWhereString, "(T1.TermPesUlt <= ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Tterpeswwds_10_tftermpespro_sel)==0) && ( ! (GXutil.strcmp("", AV61Tterpeswwds_9_tftermpespro)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.TermPesPro) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Tterpeswwds_10_tftermpespro_sel)==0) )
      {
         addWhere(sWhereString, "(T1.TermPesPro = ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( AV63Tterpeswwds_11_tftermpes_sel == 1 )
      {
         addWhere(sWhereString, "(T2.TermPes = 1)");
      }
      if ( AV63Tterpeswwds_11_tftermpes_sel == 2 )
      {
         addWhere(sWhereString, "(T2.TermPes = 0)");
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.TermPesUlt" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.TermPesUlt DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.TermCod" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.TermCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.TermDsc" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.TermDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.TermPesTpo" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.TermPesTpo DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.TermPesPro" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.TermPesPro DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.TermPes" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.TermPes DESC" ;
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
                  return conditional_P097R2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).longValue() , ((Number) dynConstraints[8]).longValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).byteValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).longValue() , (String)dynConstraints[15] , ((Number) dynConstraints[16]).byteValue() , ((Number) dynConstraints[17]).shortValue() , ((Boolean) dynConstraints[18]).booleanValue() , (String)dynConstraints[19] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P097R2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 20);
               ((long[]) buf[3])[0] = rslt.getLong(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 10);
               ((String[]) buf[8])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
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
                  stmt.setString(sIdx, (String)parms[8], 10);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 10);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[12]).longValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[13]).longValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 20);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 20);
               }
               return;
      }
   }

}

