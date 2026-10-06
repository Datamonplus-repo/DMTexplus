package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wcrepuestomovimientosexportcsv_impl extends GXWebProcedure
{
   public wcrepuestomovimientosexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "PrivateTempStorage" + "WCRepuestoMovimientosExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("WCRepuestoMovimientosColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("WCRepuestoMovimientosColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Movimiento", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Orden", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Tipo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Desc Tipo Movimiento", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripción", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cantidad", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Precio del Mov.", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV58Wcrepuestomovimientosds_1_emprcod = AV28EmprCod ;
      AV59Wcrepuestomovimientosds_2_mrcod = AV29MRCod ;
      AV60Wcrepuestomovimientosds_3_mrnom = AV30MRNom ;
      AV61Wcrepuestomovimientosds_4_filterfulltext = AV33FilterFullText ;
      AV62Wcrepuestomovimientosds_5_tfmrmov = AV39TFMRMov ;
      AV63Wcrepuestomovimientosds_6_tfmrmov_to = AV40TFMRMov_To ;
      AV64Wcrepuestomovimientosds_7_tfmrmovord = AV41TFMRMovOrd ;
      AV65Wcrepuestomovimientosds_8_tfmrmovord_to = AV42TFMRMovOrd_To ;
      AV66Wcrepuestomovimientosds_9_tfmrmovfch = AV43TFMRMovFch ;
      AV67Wcrepuestomovimientosds_10_tfmrmovtpo = AV45TFMRMovTpo ;
      AV68Wcrepuestomovimientosds_11_tfmrmovtpo_to = AV46TFMRMovTpo_To ;
      AV69Wcrepuestomovimientosds_12_tfmrmovtpod = AV47TFMRMovTpoD ;
      AV70Wcrepuestomovimientosds_13_tfmrmovtpod_sel = AV48TFMRMovTpoD_Sel ;
      AV71Wcrepuestomovimientosds_14_tfmrmovdsc = AV49TFMRMovDsc ;
      AV72Wcrepuestomovimientosds_15_tfmrmovdsc_sel = AV50TFMRMovDsc_Sel ;
      AV73Wcrepuestomovimientosds_16_tfmrmovcnt = AV51TFMRMovCnt ;
      AV74Wcrepuestomovimientosds_17_tfmrmovcnt_to = AV52TFMRMovCnt_To ;
      AV75Wcrepuestomovimientosds_18_tfmrmovpre = AV53TFMRMovPre ;
      AV76Wcrepuestomovimientosds_19_tfmrmovpre_to = AV54TFMRMovPre_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV61Wcrepuestomovimientosds_4_filterfulltext ,
                                           Long.valueOf(AV62Wcrepuestomovimientosds_5_tfmrmov) ,
                                           Long.valueOf(AV63Wcrepuestomovimientosds_6_tfmrmov_to) ,
                                           Integer.valueOf(AV64Wcrepuestomovimientosds_7_tfmrmovord) ,
                                           Integer.valueOf(AV65Wcrepuestomovimientosds_8_tfmrmovord_to) ,
                                           AV66Wcrepuestomovimientosds_9_tfmrmovfch ,
                                           Integer.valueOf(AV67Wcrepuestomovimientosds_10_tfmrmovtpo) ,
                                           Integer.valueOf(AV68Wcrepuestomovimientosds_11_tfmrmovtpo_to) ,
                                           AV70Wcrepuestomovimientosds_13_tfmrmovtpod_sel ,
                                           AV69Wcrepuestomovimientosds_12_tfmrmovtpod ,
                                           AV72Wcrepuestomovimientosds_15_tfmrmovdsc_sel ,
                                           AV71Wcrepuestomovimientosds_14_tfmrmovdsc ,
                                           AV73Wcrepuestomovimientosds_16_tfmrmovcnt ,
                                           AV74Wcrepuestomovimientosds_17_tfmrmovcnt_to ,
                                           AV75Wcrepuestomovimientosds_18_tfmrmovpre ,
                                           AV76Wcrepuestomovimientosds_19_tfmrmovpre_to ,
                                           Long.valueOf(A9502MRMov) ,
                                           Integer.valueOf(A9503MRMovOrd) ,
                                           Integer.valueOf(A9505MRMovTpo) ,
                                           A9506MRMovTpoD ,
                                           A9507MRMovDsc ,
                                           A9508MRMovCnt ,
                                           A9509MRMovPre ,
                                           A9504MRMovFch ,
                                           Short.valueOf(AV31OrderedBy) ,
                                           Boolean.valueOf(AV32OrderedDsc) ,
                                           A9493MRNom ,
                                           AV60Wcrepuestomovimientosds_3_mrnom ,
                                           A396EmprCod ,
                                           AV28EmprCod ,
                                           Integer.valueOf(A9492MRCod) ,
                                           Integer.valueOf(AV29MRCod) ,
                                           AV58Wcrepuestomovimientosds_1_emprcod ,
                                           Integer.valueOf(AV59Wcrepuestomovimientosds_2_mrcod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.LONG, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV61Wcrepuestomovimientosds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcrepuestomovimientosds_4_filterfulltext), "%", "") ;
      lV61Wcrepuestomovimientosds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcrepuestomovimientosds_4_filterfulltext), "%", "") ;
      lV61Wcrepuestomovimientosds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcrepuestomovimientosds_4_filterfulltext), "%", "") ;
      lV61Wcrepuestomovimientosds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcrepuestomovimientosds_4_filterfulltext), "%", "") ;
      lV61Wcrepuestomovimientosds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcrepuestomovimientosds_4_filterfulltext), "%", "") ;
      lV61Wcrepuestomovimientosds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcrepuestomovimientosds_4_filterfulltext), "%", "") ;
      lV61Wcrepuestomovimientosds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcrepuestomovimientosds_4_filterfulltext), "%", "") ;
      lV69Wcrepuestomovimientosds_12_tfmrmovtpod = GXutil.padr( GXutil.rtrim( AV69Wcrepuestomovimientosds_12_tfmrmovtpod), 30, "%") ;
      lV71Wcrepuestomovimientosds_14_tfmrmovdsc = GXutil.padr( GXutil.rtrim( AV71Wcrepuestomovimientosds_14_tfmrmovdsc), 30, "%") ;
      /* Using cursor P08W02 */
      pr_default.execute(0, new Object[] {AV58Wcrepuestomovimientosds_1_emprcod, Integer.valueOf(AV59Wcrepuestomovimientosds_2_mrcod), AV60Wcrepuestomovimientosds_3_mrnom, AV28EmprCod, Integer.valueOf(AV29MRCod), lV61Wcrepuestomovimientosds_4_filterfulltext, lV61Wcrepuestomovimientosds_4_filterfulltext, lV61Wcrepuestomovimientosds_4_filterfulltext, lV61Wcrepuestomovimientosds_4_filterfulltext, lV61Wcrepuestomovimientosds_4_filterfulltext, lV61Wcrepuestomovimientosds_4_filterfulltext, lV61Wcrepuestomovimientosds_4_filterfulltext, Long.valueOf(AV62Wcrepuestomovimientosds_5_tfmrmov), Long.valueOf(AV63Wcrepuestomovimientosds_6_tfmrmov_to), Integer.valueOf(AV64Wcrepuestomovimientosds_7_tfmrmovord), Integer.valueOf(AV65Wcrepuestomovimientosds_8_tfmrmovord_to), AV66Wcrepuestomovimientosds_9_tfmrmovfch, Integer.valueOf(AV67Wcrepuestomovimientosds_10_tfmrmovtpo), Integer.valueOf(AV68Wcrepuestomovimientosds_11_tfmrmovtpo_to), lV69Wcrepuestomovimientosds_12_tfmrmovtpod, AV70Wcrepuestomovimientosds_13_tfmrmovtpod_sel, lV71Wcrepuestomovimientosds_14_tfmrmovdsc, AV72Wcrepuestomovimientosds_15_tfmrmovdsc_sel, AV73Wcrepuestomovimientosds_16_tfmrmovcnt, AV74Wcrepuestomovimientosds_17_tfmrmovcnt_to, AV75Wcrepuestomovimientosds_18_tfmrmovpre, AV76Wcrepuestomovimientosds_19_tfmrmovpre_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A9509MRMovPre = P08W02_A9509MRMovPre[0] ;
         A9508MRMovCnt = P08W02_A9508MRMovCnt[0] ;
         A9507MRMovDsc = P08W02_A9507MRMovDsc[0] ;
         A9506MRMovTpoD = P08W02_A9506MRMovTpoD[0] ;
         n9506MRMovTpoD = P08W02_n9506MRMovTpoD[0] ;
         A9505MRMovTpo = P08W02_A9505MRMovTpo[0] ;
         A9504MRMovFch = P08W02_A9504MRMovFch[0] ;
         A9503MRMovOrd = P08W02_A9503MRMovOrd[0] ;
         A9502MRMov = P08W02_A9502MRMov[0] ;
         A9493MRNom = P08W02_A9493MRNom[0] ;
         n9493MRNom = P08W02_n9493MRNom[0] ;
         A9492MRCod = P08W02_A9492MRCod[0] ;
         A396EmprCod = P08W02_A396EmprCod[0] ;
         A9493MRNom = P08W02_A9493MRNom[0] ;
         n9493MRNom = P08W02_n9493MRNom[0] ;
         A9506MRMovTpoD = P08W02_A9506MRMovTpoD[0] ;
         n9506MRMovTpoD = P08W02_n9506MRMovTpoD[0] ;
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
            AV14TextFileLine += GXutil.str( A9502MRMov, 10, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A9503MRMovOrd, 8, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += localUtil.ttoc( A9504MRMovFch, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A9505MRMovTpo, 8, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A9506MRMovTpoD, ";", ","), GXv_char3) ;
            wcrepuestomovimientosexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A9507MRMovDsc, ";", ","), GXv_char3) ;
            wcrepuestomovimientosexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A9508MRMovCnt, 10, 3) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A9509MRMovPre, 12, 3) ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=WCRepuestoMovimientosExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MRMov", "", "Movimiento", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MRMovOrd", "", "Orden", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MRMovFch", "", "Fecha", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MRMovTpo", "", "Tipo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MRMovTpoD", "", "Desc Tipo Movimiento", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MRMovDsc", "", "Descripción", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MRMovCnt", "", "Cantidad", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MRMovPre", "", "Precio del Mov.", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WCRepuestoMovimientosColumnsSelector", GXv_char3) ;
      wcrepuestomovimientosexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("WCRepuestoMovimientosGridState"), "") == 0 )
      {
         AV37GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCRepuestoMovimientosGridState"), null, null);
      }
      else
      {
         AV37GridState.fromxml(AV19Session.getValue("WCRepuestoMovimientosGridState"), null, null);
      }
      AV31OrderedBy = AV37GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV32OrderedDsc = AV37GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV77GXV1 = 1 ;
      while ( AV77GXV1 <= AV37GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV38GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV37GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV77GXV1));
         if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV33FilterFullText = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRMOV") == 0 )
         {
            AV39TFMRMov = GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            AV40TFMRMov_To = GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRMOVORD") == 0 )
         {
            AV41TFMRMovOrd = (int)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV42TFMRMovOrd_To = (int)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRMOVFCH") == 0 )
         {
            AV43TFMRMovFch = localUtil.ctot( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRMOVTPO") == 0 )
         {
            AV45TFMRMovTpo = (int)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV46TFMRMovTpo_To = (int)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRMOVTPOD") == 0 )
         {
            AV47TFMRMovTpoD = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRMOVTPOD_SEL") == 0 )
         {
            AV48TFMRMovTpoD_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRMOVDSC") == 0 )
         {
            AV49TFMRMovDsc = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRMOVDSC_SEL") == 0 )
         {
            AV50TFMRMovDsc_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRMOVCNT") == 0 )
         {
            AV51TFMRMovCnt = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV52TFMRMovCnt_To = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRMOVPRE") == 0 )
         {
            AV53TFMRMovPre = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV54TFMRMovPre_To = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV28EmprCod = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MRCOD") == 0 )
         {
            AV29MRCod = (int)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MRNOM") == 0 )
         {
            AV30MRNom = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV77GXV1 = (int)(AV77GXV1+1) ;
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
      A9504MRMovFch = GXutil.resetTime( GXutil.nullDate() );
      A9506MRMovTpoD = "" ;
      A9507MRMovDsc = "" ;
      A9508MRMovCnt = DecimalUtil.ZERO ;
      A9509MRMovPre = DecimalUtil.ZERO ;
      AV58Wcrepuestomovimientosds_1_emprcod = "" ;
      AV28EmprCod = "" ;
      AV60Wcrepuestomovimientosds_3_mrnom = "" ;
      AV30MRNom = "" ;
      AV61Wcrepuestomovimientosds_4_filterfulltext = "" ;
      AV33FilterFullText = "" ;
      AV66Wcrepuestomovimientosds_9_tfmrmovfch = GXutil.resetTime( GXutil.nullDate() );
      AV43TFMRMovFch = GXutil.resetTime( GXutil.nullDate() );
      AV69Wcrepuestomovimientosds_12_tfmrmovtpod = "" ;
      AV47TFMRMovTpoD = "" ;
      AV70Wcrepuestomovimientosds_13_tfmrmovtpod_sel = "" ;
      AV48TFMRMovTpoD_Sel = "" ;
      AV71Wcrepuestomovimientosds_14_tfmrmovdsc = "" ;
      AV49TFMRMovDsc = "" ;
      AV72Wcrepuestomovimientosds_15_tfmrmovdsc_sel = "" ;
      AV50TFMRMovDsc_Sel = "" ;
      AV73Wcrepuestomovimientosds_16_tfmrmovcnt = DecimalUtil.ZERO ;
      AV51TFMRMovCnt = DecimalUtil.ZERO ;
      AV74Wcrepuestomovimientosds_17_tfmrmovcnt_to = DecimalUtil.ZERO ;
      AV52TFMRMovCnt_To = DecimalUtil.ZERO ;
      AV75Wcrepuestomovimientosds_18_tfmrmovpre = DecimalUtil.ZERO ;
      AV53TFMRMovPre = DecimalUtil.ZERO ;
      AV76Wcrepuestomovimientosds_19_tfmrmovpre_to = DecimalUtil.ZERO ;
      AV54TFMRMovPre_To = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV61Wcrepuestomovimientosds_4_filterfulltext = "" ;
      lV69Wcrepuestomovimientosds_12_tfmrmovtpod = "" ;
      lV71Wcrepuestomovimientosds_14_tfmrmovdsc = "" ;
      A9493MRNom = "" ;
      A396EmprCod = "" ;
      P08W02_A9509MRMovPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08W02_A9508MRMovCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08W02_A9507MRMovDsc = new String[] {""} ;
      P08W02_A9506MRMovTpoD = new String[] {""} ;
      P08W02_n9506MRMovTpoD = new boolean[] {false} ;
      P08W02_A9505MRMovTpo = new int[1] ;
      P08W02_A9504MRMovFch = new java.util.Date[] {GXutil.nullDate()} ;
      P08W02_A9503MRMovOrd = new int[1] ;
      P08W02_A9502MRMov = new long[1] ;
      P08W02_A9493MRNom = new String[] {""} ;
      P08W02_n9493MRNom = new boolean[] {false} ;
      P08W02_A9492MRCod = new int[1] ;
      P08W02_A396EmprCod = new String[] {""} ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector5 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV37GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV38GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcrepuestomovimientosexportcsv__default(),
         new Object[] {
             new Object[] {
            P08W02_A9509MRMovPre, P08W02_A9508MRMovCnt, P08W02_A9507MRMovDsc, P08W02_A9506MRMovTpoD, P08W02_n9506MRMovTpoD, P08W02_A9505MRMovTpo, P08W02_A9504MRMovFch, P08W02_A9503MRMovOrd, P08W02_A9502MRMov, P08W02_A9493MRNom,
            P08W02_n9493MRNom, P08W02_A9492MRCod, P08W02_A396EmprCod
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
   private int A9503MRMovOrd ;
   private int A9505MRMovTpo ;
   private int AV59Wcrepuestomovimientosds_2_mrcod ;
   private int AV29MRCod ;
   private int AV64Wcrepuestomovimientosds_7_tfmrmovord ;
   private int AV41TFMRMovOrd ;
   private int AV65Wcrepuestomovimientosds_8_tfmrmovord_to ;
   private int AV42TFMRMovOrd_To ;
   private int AV67Wcrepuestomovimientosds_10_tfmrmovtpo ;
   private int AV45TFMRMovTpo ;
   private int AV68Wcrepuestomovimientosds_11_tfmrmovtpo_to ;
   private int AV46TFMRMovTpo_To ;
   private int A9492MRCod ;
   private int AV77GXV1 ;
   private long A9502MRMov ;
   private long AV62Wcrepuestomovimientosds_5_tfmrmov ;
   private long AV39TFMRMov ;
   private long AV63Wcrepuestomovimientosds_6_tfmrmov_to ;
   private long AV40TFMRMov_To ;
   private java.math.BigDecimal A9508MRMovCnt ;
   private java.math.BigDecimal A9509MRMovPre ;
   private java.math.BigDecimal AV73Wcrepuestomovimientosds_16_tfmrmovcnt ;
   private java.math.BigDecimal AV51TFMRMovCnt ;
   private java.math.BigDecimal AV74Wcrepuestomovimientosds_17_tfmrmovcnt_to ;
   private java.math.BigDecimal AV52TFMRMovCnt_To ;
   private java.math.BigDecimal AV75Wcrepuestomovimientosds_18_tfmrmovpre ;
   private java.math.BigDecimal AV53TFMRMovPre ;
   private java.math.BigDecimal AV76Wcrepuestomovimientosds_19_tfmrmovpre_to ;
   private java.math.BigDecimal AV54TFMRMovPre_To ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A9506MRMovTpoD ;
   private String A9507MRMovDsc ;
   private String AV58Wcrepuestomovimientosds_1_emprcod ;
   private String AV28EmprCod ;
   private String AV60Wcrepuestomovimientosds_3_mrnom ;
   private String AV30MRNom ;
   private String AV69Wcrepuestomovimientosds_12_tfmrmovtpod ;
   private String AV47TFMRMovTpoD ;
   private String AV70Wcrepuestomovimientosds_13_tfmrmovtpod_sel ;
   private String AV48TFMRMovTpoD_Sel ;
   private String AV71Wcrepuestomovimientosds_14_tfmrmovdsc ;
   private String AV49TFMRMovDsc ;
   private String AV72Wcrepuestomovimientosds_15_tfmrmovdsc_sel ;
   private String AV50TFMRMovDsc_Sel ;
   private String scmdbuf ;
   private String lV69Wcrepuestomovimientosds_12_tfmrmovtpod ;
   private String lV71Wcrepuestomovimientosds_14_tfmrmovdsc ;
   private String A9493MRNom ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private java.util.Date A9504MRMovFch ;
   private java.util.Date AV66Wcrepuestomovimientosds_9_tfmrmovfch ;
   private java.util.Date AV43TFMRMovFch ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV32OrderedDsc ;
   private boolean n9506MRMovTpoD ;
   private boolean n9493MRNom ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV61Wcrepuestomovimientosds_4_filterfulltext ;
   private String AV33FilterFullText ;
   private String lV61Wcrepuestomovimientosds_4_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] P08W02_A9509MRMovPre ;
   private java.math.BigDecimal[] P08W02_A9508MRMovCnt ;
   private String[] P08W02_A9507MRMovDsc ;
   private String[] P08W02_A9506MRMovTpoD ;
   private boolean[] P08W02_n9506MRMovTpoD ;
   private int[] P08W02_A9505MRMovTpo ;
   private java.util.Date[] P08W02_A9504MRMovFch ;
   private int[] P08W02_A9503MRMovOrd ;
   private long[] P08W02_A9502MRMov ;
   private String[] P08W02_A9493MRNom ;
   private boolean[] P08W02_n9493MRNom ;
   private int[] P08W02_A9492MRCod ;
   private String[] P08W02_A396EmprCod ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV37GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV38GridStateFilterValue ;
}

final  class wcrepuestomovimientosexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08W02( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV61Wcrepuestomovimientosds_4_filterfulltext ,
                                          long AV62Wcrepuestomovimientosds_5_tfmrmov ,
                                          long AV63Wcrepuestomovimientosds_6_tfmrmov_to ,
                                          int AV64Wcrepuestomovimientosds_7_tfmrmovord ,
                                          int AV65Wcrepuestomovimientosds_8_tfmrmovord_to ,
                                          java.util.Date AV66Wcrepuestomovimientosds_9_tfmrmovfch ,
                                          int AV67Wcrepuestomovimientosds_10_tfmrmovtpo ,
                                          int AV68Wcrepuestomovimientosds_11_tfmrmovtpo_to ,
                                          String AV70Wcrepuestomovimientosds_13_tfmrmovtpod_sel ,
                                          String AV69Wcrepuestomovimientosds_12_tfmrmovtpod ,
                                          String AV72Wcrepuestomovimientosds_15_tfmrmovdsc_sel ,
                                          String AV71Wcrepuestomovimientosds_14_tfmrmovdsc ,
                                          java.math.BigDecimal AV73Wcrepuestomovimientosds_16_tfmrmovcnt ,
                                          java.math.BigDecimal AV74Wcrepuestomovimientosds_17_tfmrmovcnt_to ,
                                          java.math.BigDecimal AV75Wcrepuestomovimientosds_18_tfmrmovpre ,
                                          java.math.BigDecimal AV76Wcrepuestomovimientosds_19_tfmrmovpre_to ,
                                          long A9502MRMov ,
                                          int A9503MRMovOrd ,
                                          int A9505MRMovTpo ,
                                          String A9506MRMovTpoD ,
                                          String A9507MRMovDsc ,
                                          java.math.BigDecimal A9508MRMovCnt ,
                                          java.math.BigDecimal A9509MRMovPre ,
                                          java.util.Date A9504MRMovFch ,
                                          short AV31OrderedBy ,
                                          boolean AV32OrderedDsc ,
                                          String A9493MRNom ,
                                          String AV60Wcrepuestomovimientosds_3_mrnom ,
                                          String A396EmprCod ,
                                          String AV28EmprCod ,
                                          int A9492MRCod ,
                                          int AV29MRCod ,
                                          String AV58Wcrepuestomovimientosds_1_emprcod ,
                                          int AV59Wcrepuestomovimientosds_2_mrcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[27];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.MRMovPre, T1.MRMovCnt, T1.MRMovDsc, T3.MTMovNom AS MRMovTpoD, T1.MRMovTpo AS MRMovTpo, T1.MRMovFch, T1.MRMovOrd, T1.MRMov, T2.MRNom, T1.MRCod, T1.EmprCod" ;
      scmdbuf += " FROM ((TXPMReMov T1 INNER JOIN TXPMREPUE T2 ON T2.EmprCod = T1.EmprCod AND T2.MRCod = T1.MRCod) INNER JOIN TXPMTPOMO T3 ON T3.EmprCod = T1.EmprCod AND T3.MTMovCod" ;
      scmdbuf += " = T1.MRMovTpo)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.MRCod = ?)");
      addWhere(sWhereString, "(T2.MRNom = ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.MRCod = ?)");
      if ( ! (GXutil.strcmp("", AV61Wcrepuestomovimientosds_4_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.MRMov,'9999999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MRMovOrd,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MRMovTpo,'99999990'), 2) like '%' || ?) or ( UPPER(T3.MTMovNom) like '%' || UPPER(?)) or ( UPPER(T1.MRMovDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.MRMovCnt,'999990.999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MRMovPre,'99999990.999'), 2) like '%' || ?))");
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
      if ( ! (0==AV62Wcrepuestomovimientosds_5_tfmrmov) )
      {
         addWhere(sWhereString, "(T1.MRMov >= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (0==AV63Wcrepuestomovimientosds_6_tfmrmov_to) )
      {
         addWhere(sWhereString, "(T1.MRMov <= ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (0==AV64Wcrepuestomovimientosds_7_tfmrmovord) )
      {
         addWhere(sWhereString, "(T1.MRMovOrd >= ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (0==AV65Wcrepuestomovimientosds_8_tfmrmovord_to) )
      {
         addWhere(sWhereString, "(T1.MRMovOrd <= ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV66Wcrepuestomovimientosds_9_tfmrmovfch) )
      {
         addWhere(sWhereString, "(T1.MRMovFch >= ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (0==AV67Wcrepuestomovimientosds_10_tfmrmovtpo) )
      {
         addWhere(sWhereString, "(T1.MRMovTpo >= ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (0==AV68Wcrepuestomovimientosds_11_tfmrmovtpo_to) )
      {
         addWhere(sWhereString, "(T1.MRMovTpo <= ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Wcrepuestomovimientosds_13_tfmrmovtpod_sel)==0) && ( ! (GXutil.strcmp("", AV69Wcrepuestomovimientosds_12_tfmrmovtpod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.MTMovNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Wcrepuestomovimientosds_13_tfmrmovtpod_sel)==0) )
      {
         addWhere(sWhereString, "(T3.MTMovNom = ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Wcrepuestomovimientosds_15_tfmrmovdsc_sel)==0) && ( ! (GXutil.strcmp("", AV71Wcrepuestomovimientosds_14_tfmrmovdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MRMovDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Wcrepuestomovimientosds_15_tfmrmovdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MRMovDsc = ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73Wcrepuestomovimientosds_16_tfmrmovcnt)==0) )
      {
         addWhere(sWhereString, "(T1.MRMovCnt >= ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Wcrepuestomovimientosds_17_tfmrmovcnt_to)==0) )
      {
         addWhere(sWhereString, "(T1.MRMovCnt <= ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Wcrepuestomovimientosds_18_tfmrmovpre)==0) )
      {
         addWhere(sWhereString, "(T1.MRMovPre >= ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Wcrepuestomovimientosds_19_tfmrmovpre_to)==0) )
      {
         addWhere(sWhereString, "(T1.MRMovPre <= ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV31OrderedBy == 1 ) && ! AV32OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MRCod, T2.MRNom, T1.MRMov" ;
      }
      else if ( ( AV31OrderedBy == 1 ) && ( AV32OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MRCod DESC, T2.MRNom DESC, T1.MRMov DESC" ;
      }
      else if ( ( AV31OrderedBy == 2 ) && ! AV32OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MRCod, T2.MRNom, T1.MRMovOrd" ;
      }
      else if ( ( AV31OrderedBy == 2 ) && ( AV32OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MRCod DESC, T2.MRNom DESC, T1.MRMovOrd DESC" ;
      }
      else if ( ( AV31OrderedBy == 3 ) && ! AV32OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MRCod, T2.MRNom, T1.MRMovFch" ;
      }
      else if ( ( AV31OrderedBy == 3 ) && ( AV32OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MRCod DESC, T2.MRNom DESC, T1.MRMovFch DESC" ;
      }
      else if ( ( AV31OrderedBy == 4 ) && ! AV32OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MRCod, T2.MRNom, T1.MRMovTpo" ;
      }
      else if ( ( AV31OrderedBy == 4 ) && ( AV32OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MRCod DESC, T2.MRNom DESC, T1.MRMovTpo DESC" ;
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
         scmdbuf += " ORDER BY T1.EmprCod, T1.MRCod, T2.MRNom, T1.MRMovDsc" ;
      }
      else if ( ( AV31OrderedBy == 6 ) && ( AV32OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MRCod DESC, T2.MRNom DESC, T1.MRMovDsc DESC" ;
      }
      else if ( ( AV31OrderedBy == 7 ) && ! AV32OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MRCod, T2.MRNom, T1.MRMovCnt" ;
      }
      else if ( ( AV31OrderedBy == 7 ) && ( AV32OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MRCod DESC, T2.MRNom DESC, T1.MRMovCnt DESC" ;
      }
      else if ( ( AV31OrderedBy == 8 ) && ! AV32OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MRCod, T2.MRNom, T1.MRMovPre" ;
      }
      else if ( ( AV31OrderedBy == 8 ) && ( AV32OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MRCod DESC, T2.MRNom DESC, T1.MRMovPre DESC" ;
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
                  return conditional_P08W02(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).longValue() , ((Number) dynConstraints[2]).longValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (java.util.Date)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , ((Number) dynConstraints[16]).longValue() , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.util.Date)dynConstraints[23] , ((Number) dynConstraints[24]).shortValue() , ((Boolean) dynConstraints[25]).booleanValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08W02", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,3);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(6);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((long[]) buf[8])[0] = rslt.getLong(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 100);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(10);
               ((String[]) buf[12])[0] = rslt.getString(11, 3);
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
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 3);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
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
                  stmt.setLong(sIdx, ((Number) parms[39]).longValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[40]).longValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[43], false);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
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
                  stmt.setString(sIdx, (String)parms[49], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[50], 3);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[51], 3);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 3);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 3);
               }
               return;
      }
   }

}

