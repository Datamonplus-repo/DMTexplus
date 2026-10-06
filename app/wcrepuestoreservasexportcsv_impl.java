package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wcrepuestoreservasexportcsv_impl extends GXWebProcedure
{
   public wcrepuestoreservasexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "PrivateTempStorage" + "WCRepuestoReservasExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("WCRepuestoReservasColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("WCRepuestoReservasColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Reserva", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Orden", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Tipo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Desc Tipo Movimiento", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripción", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cantidad", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV58Wcrepuestoreservasds_1_emprcod = AV28EmprCod ;
      AV59Wcrepuestoreservasds_2_mrcod = AV29MrCod ;
      AV60Wcrepuestoreservasds_3_mrnom = AV30MRNom ;
      AV61Wcrepuestoreservasds_4_filterfulltext = AV33FilterFullText ;
      AV62Wcrepuestoreservasds_5_tfmrres = AV41TFMRRes ;
      AV63Wcrepuestoreservasds_6_tfmrres_to = AV42TFMRRes_To ;
      AV64Wcrepuestoreservasds_7_tfmrresord = AV43TFMRResOrd ;
      AV65Wcrepuestoreservasds_8_tfmrresord_to = AV44TFMRResOrd_To ;
      AV66Wcrepuestoreservasds_9_tfmrresfch = AV53TFMRResFch ;
      AV67Wcrepuestoreservasds_10_tfmrrestpo = AV45TFMRResTpo ;
      AV68Wcrepuestoreservasds_11_tfmrrestpo_to = AV46TFMRResTpo_To ;
      AV69Wcrepuestoreservasds_12_tfmrrestpod = AV47TFMRResTpoD ;
      AV70Wcrepuestoreservasds_13_tfmrrestpod_sel = AV48TFMRResTpoD_Sel ;
      AV71Wcrepuestoreservasds_14_tfmrresdsc = AV49TFMRResDsc ;
      AV72Wcrepuestoreservasds_15_tfmrresdsc_sel = AV50TFMRResDsc_Sel ;
      AV73Wcrepuestoreservasds_16_tfmrrescnt = AV51TFMRResCnt ;
      AV74Wcrepuestoreservasds_17_tfmrrescnt_to = AV52TFMRResCnt_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV61Wcrepuestoreservasds_4_filterfulltext ,
                                           Long.valueOf(AV62Wcrepuestoreservasds_5_tfmrres) ,
                                           Long.valueOf(AV63Wcrepuestoreservasds_6_tfmrres_to) ,
                                           Integer.valueOf(AV64Wcrepuestoreservasds_7_tfmrresord) ,
                                           Integer.valueOf(AV65Wcrepuestoreservasds_8_tfmrresord_to) ,
                                           AV66Wcrepuestoreservasds_9_tfmrresfch ,
                                           Integer.valueOf(AV67Wcrepuestoreservasds_10_tfmrrestpo) ,
                                           Integer.valueOf(AV68Wcrepuestoreservasds_11_tfmrrestpo_to) ,
                                           AV70Wcrepuestoreservasds_13_tfmrrestpod_sel ,
                                           AV69Wcrepuestoreservasds_12_tfmrrestpod ,
                                           AV72Wcrepuestoreservasds_15_tfmrresdsc_sel ,
                                           AV71Wcrepuestoreservasds_14_tfmrresdsc ,
                                           AV73Wcrepuestoreservasds_16_tfmrrescnt ,
                                           AV74Wcrepuestoreservasds_17_tfmrrescnt_to ,
                                           Long.valueOf(A9510MRRes) ,
                                           Integer.valueOf(A9511MRResOrd) ,
                                           Integer.valueOf(A9513MRResTpo) ,
                                           A9514MRResTpoD ,
                                           A9515MRResDsc ,
                                           A9516MRResCnt ,
                                           A9512MRResFch ,
                                           Short.valueOf(AV31OrderedBy) ,
                                           Boolean.valueOf(AV32OrderedDsc) ,
                                           A9493MRNom ,
                                           AV60Wcrepuestoreservasds_3_mrnom ,
                                           A396EmprCod ,
                                           AV28EmprCod ,
                                           Integer.valueOf(A9492MRCod) ,
                                           Integer.valueOf(AV29MrCod) ,
                                           AV58Wcrepuestoreservasds_1_emprcod ,
                                           Integer.valueOf(AV59Wcrepuestoreservasds_2_mrcod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.LONG, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV61Wcrepuestoreservasds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcrepuestoreservasds_4_filterfulltext), "%", "") ;
      lV61Wcrepuestoreservasds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcrepuestoreservasds_4_filterfulltext), "%", "") ;
      lV61Wcrepuestoreservasds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcrepuestoreservasds_4_filterfulltext), "%", "") ;
      lV61Wcrepuestoreservasds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcrepuestoreservasds_4_filterfulltext), "%", "") ;
      lV61Wcrepuestoreservasds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcrepuestoreservasds_4_filterfulltext), "%", "") ;
      lV61Wcrepuestoreservasds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcrepuestoreservasds_4_filterfulltext), "%", "") ;
      lV69Wcrepuestoreservasds_12_tfmrrestpod = GXutil.padr( GXutil.rtrim( AV69Wcrepuestoreservasds_12_tfmrrestpod), 30, "%") ;
      lV71Wcrepuestoreservasds_14_tfmrresdsc = GXutil.padr( GXutil.rtrim( AV71Wcrepuestoreservasds_14_tfmrresdsc), 50, "%") ;
      /* Using cursor P08VX2 */
      pr_default.execute(0, new Object[] {AV58Wcrepuestoreservasds_1_emprcod, Integer.valueOf(AV59Wcrepuestoreservasds_2_mrcod), AV60Wcrepuestoreservasds_3_mrnom, AV28EmprCod, Integer.valueOf(AV29MrCod), lV61Wcrepuestoreservasds_4_filterfulltext, lV61Wcrepuestoreservasds_4_filterfulltext, lV61Wcrepuestoreservasds_4_filterfulltext, lV61Wcrepuestoreservasds_4_filterfulltext, lV61Wcrepuestoreservasds_4_filterfulltext, lV61Wcrepuestoreservasds_4_filterfulltext, Long.valueOf(AV62Wcrepuestoreservasds_5_tfmrres), Long.valueOf(AV63Wcrepuestoreservasds_6_tfmrres_to), Integer.valueOf(AV64Wcrepuestoreservasds_7_tfmrresord), Integer.valueOf(AV65Wcrepuestoreservasds_8_tfmrresord_to), AV66Wcrepuestoreservasds_9_tfmrresfch, Integer.valueOf(AV67Wcrepuestoreservasds_10_tfmrrestpo), Integer.valueOf(AV68Wcrepuestoreservasds_11_tfmrrestpo_to), lV69Wcrepuestoreservasds_12_tfmrrestpod, AV70Wcrepuestoreservasds_13_tfmrrestpod_sel, lV71Wcrepuestoreservasds_14_tfmrresdsc, AV72Wcrepuestoreservasds_15_tfmrresdsc_sel, AV73Wcrepuestoreservasds_16_tfmrrescnt, AV74Wcrepuestoreservasds_17_tfmrrescnt_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A9516MRResCnt = P08VX2_A9516MRResCnt[0] ;
         A9515MRResDsc = P08VX2_A9515MRResDsc[0] ;
         A9514MRResTpoD = P08VX2_A9514MRResTpoD[0] ;
         n9514MRResTpoD = P08VX2_n9514MRResTpoD[0] ;
         A9513MRResTpo = P08VX2_A9513MRResTpo[0] ;
         A9512MRResFch = P08VX2_A9512MRResFch[0] ;
         A9511MRResOrd = P08VX2_A9511MRResOrd[0] ;
         A9510MRRes = P08VX2_A9510MRRes[0] ;
         A9493MRNom = P08VX2_A9493MRNom[0] ;
         n9493MRNom = P08VX2_n9493MRNom[0] ;
         A9492MRCod = P08VX2_A9492MRCod[0] ;
         A396EmprCod = P08VX2_A396EmprCod[0] ;
         A9493MRNom = P08VX2_A9493MRNom[0] ;
         n9493MRNom = P08VX2_n9493MRNom[0] ;
         A9514MRResTpoD = P08VX2_A9514MRResTpoD[0] ;
         n9514MRResTpoD = P08VX2_n9514MRResTpoD[0] ;
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
            AV14TextFileLine += GXutil.str( A9510MRRes, 10, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A9511MRResOrd, 8, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += localUtil.ttoc( A9512MRResFch, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A9513MRResTpo, 8, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A9514MRResTpoD, ";", ","), GXv_char3) ;
            wcrepuestoreservasexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A9515MRResDsc, ";", ","), GXv_char3) ;
            wcrepuestoreservasexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A9516MRResCnt, 10, 3) ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=WCRepuestoReservasExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MRRes", "", "Reserva", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MRResOrd", "", "Orden", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MRResFch", "", "Fecha", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MRResTpo", "", "Tipo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MRResTpoD", "", "Desc Tipo Movimiento", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MRResDsc", "", "Descripción", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MRResCnt", "", "Cantidad", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WCRepuestoReservasColumnsSelector", GXv_char3) ;
      wcrepuestoreservasexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("WCRepuestoReservasGridState"), "") == 0 )
      {
         AV35GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCRepuestoReservasGridState"), null, null);
      }
      else
      {
         AV35GridState.fromxml(AV19Session.getValue("WCRepuestoReservasGridState"), null, null);
      }
      AV31OrderedBy = AV35GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV32OrderedDsc = AV35GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV75GXV1 = 1 ;
      while ( AV75GXV1 <= AV35GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV36GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV35GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV75GXV1));
         if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV33FilterFullText = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRRES") == 0 )
         {
            AV41TFMRRes = GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            AV42TFMRRes_To = GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRRESORD") == 0 )
         {
            AV43TFMRResOrd = (int)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV44TFMRResOrd_To = (int)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRRESFCH") == 0 )
         {
            AV53TFMRResFch = localUtil.ctot( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRRESTPO") == 0 )
         {
            AV45TFMRResTpo = (int)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV46TFMRResTpo_To = (int)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRRESTPOD") == 0 )
         {
            AV47TFMRResTpoD = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRRESTPOD_SEL") == 0 )
         {
            AV48TFMRResTpoD_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRRESDSC") == 0 )
         {
            AV49TFMRResDsc = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRRESDSC_SEL") == 0 )
         {
            AV50TFMRResDsc_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRRESCNT") == 0 )
         {
            AV51TFMRResCnt = CommonUtil.decimalVal( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV52TFMRResCnt_To = CommonUtil.decimalVal( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV28EmprCod = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MRCOD") == 0 )
         {
            AV29MrCod = (int)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MRNOM") == 0 )
         {
            AV30MRNom = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV75GXV1 = (int)(AV75GXV1+1) ;
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
      A9512MRResFch = GXutil.resetTime( GXutil.nullDate() );
      A9514MRResTpoD = "" ;
      A9515MRResDsc = "" ;
      A9516MRResCnt = DecimalUtil.ZERO ;
      AV58Wcrepuestoreservasds_1_emprcod = "" ;
      AV28EmprCod = "" ;
      AV60Wcrepuestoreservasds_3_mrnom = "" ;
      AV30MRNom = "" ;
      AV61Wcrepuestoreservasds_4_filterfulltext = "" ;
      AV33FilterFullText = "" ;
      AV66Wcrepuestoreservasds_9_tfmrresfch = GXutil.resetTime( GXutil.nullDate() );
      AV53TFMRResFch = GXutil.resetTime( GXutil.nullDate() );
      AV69Wcrepuestoreservasds_12_tfmrrestpod = "" ;
      AV47TFMRResTpoD = "" ;
      AV70Wcrepuestoreservasds_13_tfmrrestpod_sel = "" ;
      AV48TFMRResTpoD_Sel = "" ;
      AV71Wcrepuestoreservasds_14_tfmrresdsc = "" ;
      AV49TFMRResDsc = "" ;
      AV72Wcrepuestoreservasds_15_tfmrresdsc_sel = "" ;
      AV50TFMRResDsc_Sel = "" ;
      AV73Wcrepuestoreservasds_16_tfmrrescnt = DecimalUtil.ZERO ;
      AV51TFMRResCnt = DecimalUtil.ZERO ;
      AV74Wcrepuestoreservasds_17_tfmrrescnt_to = DecimalUtil.ZERO ;
      AV52TFMRResCnt_To = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV61Wcrepuestoreservasds_4_filterfulltext = "" ;
      lV69Wcrepuestoreservasds_12_tfmrrestpod = "" ;
      lV71Wcrepuestoreservasds_14_tfmrresdsc = "" ;
      A9493MRNom = "" ;
      A396EmprCod = "" ;
      P08VX2_A9516MRResCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08VX2_A9515MRResDsc = new String[] {""} ;
      P08VX2_A9514MRResTpoD = new String[] {""} ;
      P08VX2_n9514MRResTpoD = new boolean[] {false} ;
      P08VX2_A9513MRResTpo = new int[1] ;
      P08VX2_A9512MRResFch = new java.util.Date[] {GXutil.nullDate()} ;
      P08VX2_A9511MRResOrd = new int[1] ;
      P08VX2_A9510MRRes = new long[1] ;
      P08VX2_A9493MRNom = new String[] {""} ;
      P08VX2_n9493MRNom = new boolean[] {false} ;
      P08VX2_A9492MRCod = new int[1] ;
      P08VX2_A396EmprCod = new String[] {""} ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector5 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV35GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV36GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcrepuestoreservasexportcsv__default(),
         new Object[] {
             new Object[] {
            P08VX2_A9516MRResCnt, P08VX2_A9515MRResDsc, P08VX2_A9514MRResTpoD, P08VX2_n9514MRResTpoD, P08VX2_A9513MRResTpo, P08VX2_A9512MRResFch, P08VX2_A9511MRResOrd, P08VX2_A9510MRRes, P08VX2_A9493MRNom, P08VX2_n9493MRNom,
            P08VX2_A9492MRCod, P08VX2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short AV31OrderedBy ;
   private short Gx_err ;
   private int AV13Random ;
   private int A9511MRResOrd ;
   private int A9513MRResTpo ;
   private int AV59Wcrepuestoreservasds_2_mrcod ;
   private int AV29MrCod ;
   private int AV64Wcrepuestoreservasds_7_tfmrresord ;
   private int AV43TFMRResOrd ;
   private int AV65Wcrepuestoreservasds_8_tfmrresord_to ;
   private int AV44TFMRResOrd_To ;
   private int AV67Wcrepuestoreservasds_10_tfmrrestpo ;
   private int AV45TFMRResTpo ;
   private int AV68Wcrepuestoreservasds_11_tfmrrestpo_to ;
   private int AV46TFMRResTpo_To ;
   private int A9492MRCod ;
   private int AV75GXV1 ;
   private long A9510MRRes ;
   private long AV62Wcrepuestoreservasds_5_tfmrres ;
   private long AV41TFMRRes ;
   private long AV63Wcrepuestoreservasds_6_tfmrres_to ;
   private long AV42TFMRRes_To ;
   private java.math.BigDecimal A9516MRResCnt ;
   private java.math.BigDecimal AV73Wcrepuestoreservasds_16_tfmrrescnt ;
   private java.math.BigDecimal AV51TFMRResCnt ;
   private java.math.BigDecimal AV74Wcrepuestoreservasds_17_tfmrrescnt_to ;
   private java.math.BigDecimal AV52TFMRResCnt_To ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A9514MRResTpoD ;
   private String A9515MRResDsc ;
   private String AV58Wcrepuestoreservasds_1_emprcod ;
   private String AV28EmprCod ;
   private String AV60Wcrepuestoreservasds_3_mrnom ;
   private String AV30MRNom ;
   private String AV69Wcrepuestoreservasds_12_tfmrrestpod ;
   private String AV47TFMRResTpoD ;
   private String AV70Wcrepuestoreservasds_13_tfmrrestpod_sel ;
   private String AV48TFMRResTpoD_Sel ;
   private String AV71Wcrepuestoreservasds_14_tfmrresdsc ;
   private String AV49TFMRResDsc ;
   private String AV72Wcrepuestoreservasds_15_tfmrresdsc_sel ;
   private String AV50TFMRResDsc_Sel ;
   private String scmdbuf ;
   private String lV69Wcrepuestoreservasds_12_tfmrrestpod ;
   private String lV71Wcrepuestoreservasds_14_tfmrresdsc ;
   private String A9493MRNom ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private java.util.Date A9512MRResFch ;
   private java.util.Date AV66Wcrepuestoreservasds_9_tfmrresfch ;
   private java.util.Date AV53TFMRResFch ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV32OrderedDsc ;
   private boolean n9514MRResTpoD ;
   private boolean n9493MRNom ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV61Wcrepuestoreservasds_4_filterfulltext ;
   private String AV33FilterFullText ;
   private String lV61Wcrepuestoreservasds_4_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] P08VX2_A9516MRResCnt ;
   private String[] P08VX2_A9515MRResDsc ;
   private String[] P08VX2_A9514MRResTpoD ;
   private boolean[] P08VX2_n9514MRResTpoD ;
   private int[] P08VX2_A9513MRResTpo ;
   private java.util.Date[] P08VX2_A9512MRResFch ;
   private int[] P08VX2_A9511MRResOrd ;
   private long[] P08VX2_A9510MRRes ;
   private String[] P08VX2_A9493MRNom ;
   private boolean[] P08VX2_n9493MRNom ;
   private int[] P08VX2_A9492MRCod ;
   private String[] P08VX2_A396EmprCod ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV35GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV36GridStateFilterValue ;
}

final  class wcrepuestoreservasexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08VX2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV61Wcrepuestoreservasds_4_filterfulltext ,
                                          long AV62Wcrepuestoreservasds_5_tfmrres ,
                                          long AV63Wcrepuestoreservasds_6_tfmrres_to ,
                                          int AV64Wcrepuestoreservasds_7_tfmrresord ,
                                          int AV65Wcrepuestoreservasds_8_tfmrresord_to ,
                                          java.util.Date AV66Wcrepuestoreservasds_9_tfmrresfch ,
                                          int AV67Wcrepuestoreservasds_10_tfmrrestpo ,
                                          int AV68Wcrepuestoreservasds_11_tfmrrestpo_to ,
                                          String AV70Wcrepuestoreservasds_13_tfmrrestpod_sel ,
                                          String AV69Wcrepuestoreservasds_12_tfmrrestpod ,
                                          String AV72Wcrepuestoreservasds_15_tfmrresdsc_sel ,
                                          String AV71Wcrepuestoreservasds_14_tfmrresdsc ,
                                          java.math.BigDecimal AV73Wcrepuestoreservasds_16_tfmrrescnt ,
                                          java.math.BigDecimal AV74Wcrepuestoreservasds_17_tfmrrescnt_to ,
                                          long A9510MRRes ,
                                          int A9511MRResOrd ,
                                          int A9513MRResTpo ,
                                          String A9514MRResTpoD ,
                                          String A9515MRResDsc ,
                                          java.math.BigDecimal A9516MRResCnt ,
                                          java.util.Date A9512MRResFch ,
                                          short AV31OrderedBy ,
                                          boolean AV32OrderedDsc ,
                                          String A9493MRNom ,
                                          String AV60Wcrepuestoreservasds_3_mrnom ,
                                          String A396EmprCod ,
                                          String AV28EmprCod ,
                                          int A9492MRCod ,
                                          int AV29MrCod ,
                                          String AV58Wcrepuestoreservasds_1_emprcod ,
                                          int AV59Wcrepuestoreservasds_2_mrcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[24];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.MRResCnt, T1.MRResDsc, T3.MTMovNom AS MRResTpoD, T1.MRResTpo AS MRResTpo, T1.MRResFch, T1.MRResOrd, T1.MRRes, T2.MRNom, T1.MRCod, T1.EmprCod FROM ((TXPMReRes" ;
      scmdbuf += " T1 INNER JOIN TXPMREPUE T2 ON T2.EmprCod = T1.EmprCod AND T2.MRCod = T1.MRCod) INNER JOIN TXPMTPOMO T3 ON T3.EmprCod = T1.EmprCod AND T3.MTMovCod = T1.MRResTpo)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.MRCod = ?)");
      addWhere(sWhereString, "(T2.MRNom = ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.MRCod = ?)");
      if ( ! (GXutil.strcmp("", AV61Wcrepuestoreservasds_4_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.MRRes,'9999999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MRResOrd,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MRResTpo,'99999990'), 2) like '%' || ?) or ( UPPER(T3.MTMovNom) like '%' || UPPER(?)) or ( UPPER(T1.MRResDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.MRResCnt,'999990.999'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
         GXv_int6[6] = (byte)(1) ;
         GXv_int6[7] = (byte)(1) ;
         GXv_int6[8] = (byte)(1) ;
         GXv_int6[9] = (byte)(1) ;
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (0==AV62Wcrepuestoreservasds_5_tfmrres) )
      {
         addWhere(sWhereString, "(T1.MRRes >= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (0==AV63Wcrepuestoreservasds_6_tfmrres_to) )
      {
         addWhere(sWhereString, "(T1.MRRes <= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (0==AV64Wcrepuestoreservasds_7_tfmrresord) )
      {
         addWhere(sWhereString, "(T1.MRResOrd >= ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (0==AV65Wcrepuestoreservasds_8_tfmrresord_to) )
      {
         addWhere(sWhereString, "(T1.MRResOrd <= ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV66Wcrepuestoreservasds_9_tfmrresfch) )
      {
         addWhere(sWhereString, "(T1.MRResFch >= ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (0==AV67Wcrepuestoreservasds_10_tfmrrestpo) )
      {
         addWhere(sWhereString, "(T1.MRResTpo >= ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (0==AV68Wcrepuestoreservasds_11_tfmrrestpo_to) )
      {
         addWhere(sWhereString, "(T1.MRResTpo <= ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Wcrepuestoreservasds_13_tfmrrestpod_sel)==0) && ( ! (GXutil.strcmp("", AV69Wcrepuestoreservasds_12_tfmrrestpod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.MTMovNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Wcrepuestoreservasds_13_tfmrrestpod_sel)==0) )
      {
         addWhere(sWhereString, "(T3.MTMovNom = ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Wcrepuestoreservasds_15_tfmrresdsc_sel)==0) && ( ! (GXutil.strcmp("", AV71Wcrepuestoreservasds_14_tfmrresdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MRResDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Wcrepuestoreservasds_15_tfmrresdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MRResDsc = ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73Wcrepuestoreservasds_16_tfmrrescnt)==0) )
      {
         addWhere(sWhereString, "(T1.MRResCnt >= ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Wcrepuestoreservasds_17_tfmrrescnt_to)==0) )
      {
         addWhere(sWhereString, "(T1.MRResCnt <= ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV31OrderedBy == 1 ) && ! AV32OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MRCod, T2.MRNom, T1.MRRes" ;
      }
      else if ( ( AV31OrderedBy == 1 ) && ( AV32OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MRCod DESC, T2.MRNom DESC, T1.MRRes DESC" ;
      }
      else if ( ( AV31OrderedBy == 2 ) && ! AV32OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MRCod, T2.MRNom, T1.MRResOrd" ;
      }
      else if ( ( AV31OrderedBy == 2 ) && ( AV32OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MRCod DESC, T2.MRNom DESC, T1.MRResOrd DESC" ;
      }
      else if ( ( AV31OrderedBy == 3 ) && ! AV32OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MRCod, T2.MRNom, T1.MRResFch" ;
      }
      else if ( ( AV31OrderedBy == 3 ) && ( AV32OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MRCod DESC, T2.MRNom DESC, T1.MRResFch DESC" ;
      }
      else if ( ( AV31OrderedBy == 4 ) && ! AV32OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MRCod, T2.MRNom, T1.MRResTpo" ;
      }
      else if ( ( AV31OrderedBy == 4 ) && ( AV32OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MRCod DESC, T2.MRNom DESC, T1.MRResTpo DESC" ;
      }
      else if ( ( AV31OrderedBy == 5 ) && ! AV32OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MRCod, T2.MRNom, T3.MTMovNom" ;
      }
      else if ( ( AV31OrderedBy == 5 ) && ( AV32OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MRCod DESC, T2.MRNom DESC, T3.MTMovNom DESC" ;
      }
      else if ( ( AV31OrderedBy == 6 ) && ! AV32OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MRCod, T2.MRNom, T1.MRResDsc" ;
      }
      else if ( ( AV31OrderedBy == 6 ) && ( AV32OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MRCod DESC, T2.MRNom DESC, T1.MRResDsc DESC" ;
      }
      else if ( ( AV31OrderedBy == 7 ) && ! AV32OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MRCod, T2.MRNom, T1.MRResCnt" ;
      }
      else if ( ( AV31OrderedBy == 7 ) && ( AV32OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MRCod DESC, T2.MRNom DESC, T1.MRResCnt DESC" ;
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
                  return conditional_P08VX2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).longValue() , ((Number) dynConstraints[2]).longValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (java.util.Date)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , ((Number) dynConstraints[14]).longValue() , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.util.Date)dynConstraints[20] , ((Number) dynConstraints[21]).shortValue() , ((Boolean) dynConstraints[22]).booleanValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08VX2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,3);
               ((String[]) buf[1])[0] = rslt.getString(2, 50);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(5);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((long[]) buf[7])[0] = rslt.getLong(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 100);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(9);
               ((String[]) buf[11])[0] = rslt.getString(10, 3);
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
                  stmt.setString(sIdx, (String)parms[24], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 3);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[35]).longValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[36]).longValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[39], false);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 50);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 50);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 3);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 3);
               }
               return;
      }
   }

}

