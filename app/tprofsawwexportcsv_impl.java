package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tprofsawwexportcsv_impl extends GXWebProcedure
{
   public tprofsawwexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "TPROFSAWWExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("TPROFSAWWColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("TPROFSAWWColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Código Empresa", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cód. Proc.", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Proceso", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion II", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Ultima linea Proceso Q", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Linea", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Codigo Fase", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion de Fase", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV55Tprofsawwds_1_filterfulltext = AV30FilterFullText ;
      AV56Tprofsawwds_2_tfemprcod = AV34TFEmprCod ;
      AV57Tprofsawwds_3_tfemprcod_sel = AV35TFEmprCod_Sel ;
      AV58Tprofsawwds_4_tfprocod = AV36TFProCod ;
      AV59Tprofsawwds_5_tfprocod_sel = AV37TFProCod_Sel ;
      AV60Tprofsawwds_6_tfprodsc = AV38TFProDsc ;
      AV61Tprofsawwds_7_tfprodsc_sel = AV39TFProDsc_Sel ;
      AV62Tprofsawwds_8_tfprodsc2 = AV40TFProDsc2 ;
      AV63Tprofsawwds_9_tfprodsc2_sel = AV41TFProDsc2_Sel ;
      AV64Tprofsawwds_10_tfemprnom = AV42TFEmprNom ;
      AV65Tprofsawwds_11_tfemprnom_sel = AV43TFEmprNom_Sel ;
      AV66Tprofsawwds_12_tfproultfp = AV44TFProUltFP ;
      AV67Tprofsawwds_13_tfproultfp_to = AV45TFProUltFP_To ;
      AV68Tprofsawwds_14_tfpronumlin = AV46TFProNumLin ;
      AV69Tprofsawwds_15_tfpronumlin_to = AV47TFProNumLin_To ;
      AV70Tprofsawwds_16_tffascod = AV48TFFasCod ;
      AV71Tprofsawwds_17_tffascod_sel = AV49TFFasCod_Sel ;
      AV72Tprofsawwds_18_tffasdsc = AV50TFFasDsc ;
      AV73Tprofsawwds_19_tffasdsc_sel = AV51TFFasDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV55Tprofsawwds_1_filterfulltext ,
                                           AV57Tprofsawwds_3_tfemprcod_sel ,
                                           AV56Tprofsawwds_2_tfemprcod ,
                                           AV59Tprofsawwds_5_tfprocod_sel ,
                                           AV58Tprofsawwds_4_tfprocod ,
                                           AV61Tprofsawwds_7_tfprodsc_sel ,
                                           AV60Tprofsawwds_6_tfprodsc ,
                                           AV63Tprofsawwds_9_tfprodsc2_sel ,
                                           AV62Tprofsawwds_8_tfprodsc2 ,
                                           AV65Tprofsawwds_11_tfemprnom_sel ,
                                           AV64Tprofsawwds_10_tfemprnom ,
                                           Short.valueOf(AV66Tprofsawwds_12_tfproultfp) ,
                                           Short.valueOf(AV67Tprofsawwds_13_tfproultfp_to) ,
                                           Short.valueOf(AV68Tprofsawwds_14_tfpronumlin) ,
                                           Short.valueOf(AV69Tprofsawwds_15_tfpronumlin_to) ,
                                           AV71Tprofsawwds_17_tffascod_sel ,
                                           AV70Tprofsawwds_16_tffascod ,
                                           AV73Tprofsawwds_19_tffasdsc_sel ,
                                           AV72Tprofsawwds_18_tffasdsc ,
                                           A396EmprCod ,
                                           A758ProCod ,
                                           A759ProDsc ,
                                           A4628ProDsc2 ,
                                           A407EmprNom ,
                                           Short.valueOf(A6437ProUltFP) ,
                                           Short.valueOf(A774ProNumLin) ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN
                                           }
      });
      lV55Tprofsawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Tprofsawwds_1_filterfulltext), "%", "") ;
      lV55Tprofsawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Tprofsawwds_1_filterfulltext), "%", "") ;
      lV55Tprofsawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Tprofsawwds_1_filterfulltext), "%", "") ;
      lV55Tprofsawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Tprofsawwds_1_filterfulltext), "%", "") ;
      lV55Tprofsawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Tprofsawwds_1_filterfulltext), "%", "") ;
      lV55Tprofsawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Tprofsawwds_1_filterfulltext), "%", "") ;
      lV55Tprofsawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Tprofsawwds_1_filterfulltext), "%", "") ;
      lV55Tprofsawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Tprofsawwds_1_filterfulltext), "%", "") ;
      lV55Tprofsawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Tprofsawwds_1_filterfulltext), "%", "") ;
      lV56Tprofsawwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV56Tprofsawwds_2_tfemprcod), 3, "%") ;
      lV58Tprofsawwds_4_tfprocod = GXutil.padr( GXutil.rtrim( AV58Tprofsawwds_4_tfprocod), 8, "%") ;
      lV60Tprofsawwds_6_tfprodsc = GXutil.padr( GXutil.rtrim( AV60Tprofsawwds_6_tfprodsc), 40, "%") ;
      lV62Tprofsawwds_8_tfprodsc2 = GXutil.padr( GXutil.rtrim( AV62Tprofsawwds_8_tfprodsc2), 100, "%") ;
      lV64Tprofsawwds_10_tfemprnom = GXutil.padr( GXutil.rtrim( AV64Tprofsawwds_10_tfemprnom), 30, "%") ;
      lV70Tprofsawwds_16_tffascod = GXutil.padr( GXutil.rtrim( AV70Tprofsawwds_16_tffascod), 8, "%") ;
      lV72Tprofsawwds_18_tffasdsc = GXutil.padr( GXutil.rtrim( AV72Tprofsawwds_18_tffasdsc), 28, "%") ;
      /* Using cursor P08NF2 */
      pr_default.execute(0, new Object[] {lV55Tprofsawwds_1_filterfulltext, lV55Tprofsawwds_1_filterfulltext, lV55Tprofsawwds_1_filterfulltext, lV55Tprofsawwds_1_filterfulltext, lV55Tprofsawwds_1_filterfulltext, lV55Tprofsawwds_1_filterfulltext, lV55Tprofsawwds_1_filterfulltext, lV55Tprofsawwds_1_filterfulltext, lV55Tprofsawwds_1_filterfulltext, lV56Tprofsawwds_2_tfemprcod, AV57Tprofsawwds_3_tfemprcod_sel, lV58Tprofsawwds_4_tfprocod, AV59Tprofsawwds_5_tfprocod_sel, lV60Tprofsawwds_6_tfprodsc, AV61Tprofsawwds_7_tfprodsc_sel, lV62Tprofsawwds_8_tfprodsc2, AV63Tprofsawwds_9_tfprodsc2_sel, lV64Tprofsawwds_10_tfemprnom, AV65Tprofsawwds_11_tfemprnom_sel, Short.valueOf(AV66Tprofsawwds_12_tfproultfp), Short.valueOf(AV67Tprofsawwds_13_tfproultfp_to), Short.valueOf(AV68Tprofsawwds_14_tfpronumlin), Short.valueOf(AV69Tprofsawwds_15_tfpronumlin_to), lV70Tprofsawwds_16_tffascod, AV71Tprofsawwds_17_tffascod_sel, lV72Tprofsawwds_18_tffasdsc, AV73Tprofsawwds_19_tffasdsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A460FasDsc = P08NF2_A460FasDsc[0] ;
         A457FasCod = P08NF2_A457FasCod[0] ;
         A774ProNumLin = P08NF2_A774ProNumLin[0] ;
         A6437ProUltFP = P08NF2_A6437ProUltFP[0] ;
         A407EmprNom = P08NF2_A407EmprNom[0] ;
         n407EmprNom = P08NF2_n407EmprNom[0] ;
         A4628ProDsc2 = P08NF2_A4628ProDsc2[0] ;
         A759ProDsc = P08NF2_A759ProDsc[0] ;
         A758ProCod = P08NF2_A758ProCod[0] ;
         A396EmprCod = P08NF2_A396EmprCod[0] ;
         A407EmprNom = P08NF2_A407EmprNom[0] ;
         n407EmprNom = P08NF2_n407EmprNom[0] ;
         A460FasDsc = P08NF2_A460FasDsc[0] ;
         A4628ProDsc2 = P08NF2_A4628ProDsc2[0] ;
         A759ProDsc = P08NF2_A759ProDsc[0] ;
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
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A396EmprCod, ";", ","), GXv_char3) ;
            tprofsawwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A758ProCod, ";", ","), GXv_char3) ;
            tprofsawwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A759ProDsc, ";", ","), GXv_char3) ;
            tprofsawwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A4628ProDsc2, ";", ","), GXv_char3) ;
            tprofsawwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A407EmprNom, ";", ","), GXv_char3) ;
            tprofsawwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A6437ProUltFP, 4, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A774ProNumLin, 4, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A457FasCod, ";", ","), GXv_char3) ;
            tprofsawwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A460FasDsc, ";", ","), GXv_char3) ;
            tprofsawwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=TPROFSAWWExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "EmprCod", "", "Código Empresa", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ProCod", "", "Cód. Proc.", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ProDsc", "", "Proceso", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ProDsc2", "", "Descripcion II", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "EmprNom", "", "Nombre", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ProUltFP", "", "Ultima linea Proceso Q", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ProNumLin", "", "Linea", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "FasCod", "", "Codigo Fase", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "FasDsc", "", "Descripcion de Fase", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "TPROFSAWWColumnsSelector", GXv_char3) ;
      tprofsawwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("TPROFSAWWGridState"), "") == 0 )
      {
         AV32GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TPROFSAWWGridState"), null, null);
      }
      else
      {
         AV32GridState.fromxml(AV19Session.getValue("TPROFSAWWGridState"), null, null);
      }
      AV28OrderedBy = AV32GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV32GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV74GXV1 = 1 ;
      while ( AV74GXV1 <= AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV74GXV1));
         if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV30FilterFullText = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD") == 0 )
         {
            AV34TFEmprCod = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD_SEL") == 0 )
         {
            AV35TFEmprCod_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCOD") == 0 )
         {
            AV36TFProCod = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCOD_SEL") == 0 )
         {
            AV37TFProCod_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRODSC") == 0 )
         {
            AV38TFProDsc = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRODSC_SEL") == 0 )
         {
            AV39TFProDsc_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRODSC2") == 0 )
         {
            AV40TFProDsc2 = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRODSC2_SEL") == 0 )
         {
            AV41TFProDsc2_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRNOM") == 0 )
         {
            AV42TFEmprNom = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRNOM_SEL") == 0 )
         {
            AV43TFEmprNom_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROULTFP") == 0 )
         {
            AV44TFProUltFP = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV45TFProUltFP_To = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRONUMLIN") == 0 )
         {
            AV46TFProNumLin = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV47TFProNumLin_To = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD") == 0 )
         {
            AV48TFFasCod = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD_SEL") == 0 )
         {
            AV49TFFasCod_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC") == 0 )
         {
            AV50TFFasDsc = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC_SEL") == 0 )
         {
            AV51TFFasDsc_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
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
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV11Filename = "" ;
      AV10TextFile = new com.genexus.util.GXFile();
      AV14TextFileLine = "" ;
      AV19Session = httpContext.getWebSession();
      AV18ColumnsSelectorXML = "" ;
      AV15ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      A396EmprCod = "" ;
      A758ProCod = "" ;
      A759ProDsc = "" ;
      A4628ProDsc2 = "" ;
      A407EmprNom = "" ;
      A457FasCod = "" ;
      A460FasDsc = "" ;
      AV55Tprofsawwds_1_filterfulltext = "" ;
      AV30FilterFullText = "" ;
      AV56Tprofsawwds_2_tfemprcod = "" ;
      AV34TFEmprCod = "" ;
      AV57Tprofsawwds_3_tfemprcod_sel = "" ;
      AV35TFEmprCod_Sel = "" ;
      AV58Tprofsawwds_4_tfprocod = "" ;
      AV36TFProCod = "" ;
      AV59Tprofsawwds_5_tfprocod_sel = "" ;
      AV37TFProCod_Sel = "" ;
      AV60Tprofsawwds_6_tfprodsc = "" ;
      AV38TFProDsc = "" ;
      AV61Tprofsawwds_7_tfprodsc_sel = "" ;
      AV39TFProDsc_Sel = "" ;
      AV62Tprofsawwds_8_tfprodsc2 = "" ;
      AV40TFProDsc2 = "" ;
      AV63Tprofsawwds_9_tfprodsc2_sel = "" ;
      AV41TFProDsc2_Sel = "" ;
      AV64Tprofsawwds_10_tfemprnom = "" ;
      AV42TFEmprNom = "" ;
      AV65Tprofsawwds_11_tfemprnom_sel = "" ;
      AV43TFEmprNom_Sel = "" ;
      AV70Tprofsawwds_16_tffascod = "" ;
      AV48TFFasCod = "" ;
      AV71Tprofsawwds_17_tffascod_sel = "" ;
      AV49TFFasCod_Sel = "" ;
      AV72Tprofsawwds_18_tffasdsc = "" ;
      AV50TFFasDsc = "" ;
      AV73Tprofsawwds_19_tffasdsc_sel = "" ;
      AV51TFFasDsc_Sel = "" ;
      scmdbuf = "" ;
      lV55Tprofsawwds_1_filterfulltext = "" ;
      lV56Tprofsawwds_2_tfemprcod = "" ;
      lV58Tprofsawwds_4_tfprocod = "" ;
      lV60Tprofsawwds_6_tfprodsc = "" ;
      lV62Tprofsawwds_8_tfprodsc2 = "" ;
      lV64Tprofsawwds_10_tfemprnom = "" ;
      lV70Tprofsawwds_16_tffascod = "" ;
      lV72Tprofsawwds_18_tffasdsc = "" ;
      P08NF2_A460FasDsc = new String[] {""} ;
      P08NF2_A457FasCod = new String[] {""} ;
      P08NF2_A774ProNumLin = new short[1] ;
      P08NF2_A6437ProUltFP = new short[1] ;
      P08NF2_A407EmprNom = new String[] {""} ;
      P08NF2_n407EmprNom = new boolean[] {false} ;
      P08NF2_A4628ProDsc2 = new String[] {""} ;
      P08NF2_A759ProDsc = new String[] {""} ;
      P08NF2_A758ProCod = new String[] {""} ;
      P08NF2_A396EmprCod = new String[] {""} ;
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
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tprofsawwexportcsv__default(),
         new Object[] {
             new Object[] {
            P08NF2_A460FasDsc, P08NF2_A457FasCod, P08NF2_A774ProNumLin, P08NF2_A6437ProUltFP, P08NF2_A407EmprNom, P08NF2_n407EmprNom, P08NF2_A4628ProDsc2, P08NF2_A759ProDsc, P08NF2_A758ProCod, P08NF2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short A6437ProUltFP ;
   private short A774ProNumLin ;
   private short AV66Tprofsawwds_12_tfproultfp ;
   private short AV44TFProUltFP ;
   private short AV67Tprofsawwds_13_tfproultfp_to ;
   private short AV45TFProUltFP_To ;
   private short AV68Tprofsawwds_14_tfpronumlin ;
   private short AV46TFProNumLin ;
   private short AV69Tprofsawwds_15_tfpronumlin_to ;
   private short AV47TFProNumLin_To ;
   private short AV28OrderedBy ;
   private short Gx_err ;
   private int AV13Random ;
   private int AV74GXV1 ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String A758ProCod ;
   private String A759ProDsc ;
   private String A4628ProDsc2 ;
   private String A407EmprNom ;
   private String A457FasCod ;
   private String A460FasDsc ;
   private String AV56Tprofsawwds_2_tfemprcod ;
   private String AV34TFEmprCod ;
   private String AV57Tprofsawwds_3_tfemprcod_sel ;
   private String AV35TFEmprCod_Sel ;
   private String AV58Tprofsawwds_4_tfprocod ;
   private String AV36TFProCod ;
   private String AV59Tprofsawwds_5_tfprocod_sel ;
   private String AV37TFProCod_Sel ;
   private String AV60Tprofsawwds_6_tfprodsc ;
   private String AV38TFProDsc ;
   private String AV61Tprofsawwds_7_tfprodsc_sel ;
   private String AV39TFProDsc_Sel ;
   private String AV62Tprofsawwds_8_tfprodsc2 ;
   private String AV40TFProDsc2 ;
   private String AV63Tprofsawwds_9_tfprodsc2_sel ;
   private String AV41TFProDsc2_Sel ;
   private String AV64Tprofsawwds_10_tfemprnom ;
   private String AV42TFEmprNom ;
   private String AV65Tprofsawwds_11_tfemprnom_sel ;
   private String AV43TFEmprNom_Sel ;
   private String AV70Tprofsawwds_16_tffascod ;
   private String AV48TFFasCod ;
   private String AV71Tprofsawwds_17_tffascod_sel ;
   private String AV49TFFasCod_Sel ;
   private String AV72Tprofsawwds_18_tffasdsc ;
   private String AV50TFFasDsc ;
   private String AV73Tprofsawwds_19_tffasdsc_sel ;
   private String AV51TFFasDsc_Sel ;
   private String scmdbuf ;
   private String lV56Tprofsawwds_2_tfemprcod ;
   private String lV58Tprofsawwds_4_tfprocod ;
   private String lV60Tprofsawwds_6_tfprodsc ;
   private String lV62Tprofsawwds_8_tfprodsc2 ;
   private String lV64Tprofsawwds_10_tfemprnom ;
   private String lV70Tprofsawwds_16_tffascod ;
   private String lV72Tprofsawwds_18_tffasdsc ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean n407EmprNom ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV55Tprofsawwds_1_filterfulltext ;
   private String AV30FilterFullText ;
   private String lV55Tprofsawwds_1_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private String[] P08NF2_A460FasDsc ;
   private String[] P08NF2_A457FasCod ;
   private short[] P08NF2_A774ProNumLin ;
   private short[] P08NF2_A6437ProUltFP ;
   private String[] P08NF2_A407EmprNom ;
   private boolean[] P08NF2_n407EmprNom ;
   private String[] P08NF2_A4628ProDsc2 ;
   private String[] P08NF2_A759ProDsc ;
   private String[] P08NF2_A758ProCod ;
   private String[] P08NF2_A396EmprCod ;
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

final  class tprofsawwexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08NF2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV55Tprofsawwds_1_filterfulltext ,
                                          String AV57Tprofsawwds_3_tfemprcod_sel ,
                                          String AV56Tprofsawwds_2_tfemprcod ,
                                          String AV59Tprofsawwds_5_tfprocod_sel ,
                                          String AV58Tprofsawwds_4_tfprocod ,
                                          String AV61Tprofsawwds_7_tfprodsc_sel ,
                                          String AV60Tprofsawwds_6_tfprodsc ,
                                          String AV63Tprofsawwds_9_tfprodsc2_sel ,
                                          String AV62Tprofsawwds_8_tfprodsc2 ,
                                          String AV65Tprofsawwds_11_tfemprnom_sel ,
                                          String AV64Tprofsawwds_10_tfemprnom ,
                                          short AV66Tprofsawwds_12_tfproultfp ,
                                          short AV67Tprofsawwds_13_tfproultfp_to ,
                                          short AV68Tprofsawwds_14_tfpronumlin ,
                                          short AV69Tprofsawwds_15_tfpronumlin_to ,
                                          String AV71Tprofsawwds_17_tffascod_sel ,
                                          String AV70Tprofsawwds_16_tffascod ,
                                          String AV73Tprofsawwds_19_tffasdsc_sel ,
                                          String AV72Tprofsawwds_18_tffasdsc ,
                                          String A396EmprCod ,
                                          String A758ProCod ,
                                          String A759ProDsc ,
                                          String A4628ProDsc2 ,
                                          String A407EmprNom ,
                                          short A6437ProUltFP ,
                                          short A774ProNumLin ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[27];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T3.FasDsc, T1.FasCod, T1.ProNumLin, T1.ProUltFP, T2.EmprNom, T4.ProDsc2, T4.ProDsc, T1.ProCod, T1.EmprCod FROM (((TXPPROLIN T1 INNER JOIN TXPEMPRES T2 ON" ;
      scmdbuf += " T2.EmprCod = T1.EmprCod) INNER JOIN TXPFASPRO T3 ON T3.EmprCod = T1.EmprCod AND T3.FasCod = T1.FasCod) INNER JOIN TXPPROCES T4 ON T4.EmprCod = T1.EmprCod AND T4.ProCod" ;
      scmdbuf += " = T1.ProCod)" ;
      if ( ! (GXutil.strcmp("", AV55Tprofsawwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( UPPER(T1.ProCod) like '%' || UPPER(?)) or ( UPPER(T4.ProDsc) like '%' || UPPER(?)) or ( UPPER(T4.ProDsc2) like '%' || UPPER(?)) or ( UPPER(T2.EmprNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ProUltFP,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.ProNumLin,'9990'), 2) like '%' || ?) or ( UPPER(T1.FasCod) like '%' || UPPER(?)) or ( UPPER(T3.FasDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
         GXv_int6[1] = (byte)(1) ;
         GXv_int6[2] = (byte)(1) ;
         GXv_int6[3] = (byte)(1) ;
         GXv_int6[4] = (byte)(1) ;
         GXv_int6[5] = (byte)(1) ;
         GXv_int6[6] = (byte)(1) ;
         GXv_int6[7] = (byte)(1) ;
         GXv_int6[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Tprofsawwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV56Tprofsawwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Tprofsawwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Tprofsawwds_5_tfprocod_sel)==0) && ( ! (GXutil.strcmp("", AV58Tprofsawwds_4_tfprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Tprofsawwds_5_tfprocod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProCod = ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Tprofsawwds_7_tfprodsc_sel)==0) && ( ! (GXutil.strcmp("", AV60Tprofsawwds_6_tfprodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Tprofsawwds_7_tfprodsc_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProDsc = ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Tprofsawwds_9_tfprodsc2_sel)==0) && ( ! (GXutil.strcmp("", AV62Tprofsawwds_8_tfprodsc2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProDsc2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Tprofsawwds_9_tfprodsc2_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProDsc2 = ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Tprofsawwds_11_tfemprnom_sel)==0) && ( ! (GXutil.strcmp("", AV64Tprofsawwds_10_tfemprnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.EmprNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Tprofsawwds_11_tfemprnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.EmprNom = ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (0==AV66Tprofsawwds_12_tfproultfp) )
      {
         addWhere(sWhereString, "(T1.ProUltFP >= ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (0==AV67Tprofsawwds_13_tfproultfp_to) )
      {
         addWhere(sWhereString, "(T1.ProUltFP <= ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (0==AV68Tprofsawwds_14_tfpronumlin) )
      {
         addWhere(sWhereString, "(T1.ProNumLin >= ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (0==AV69Tprofsawwds_15_tfpronumlin_to) )
      {
         addWhere(sWhereString, "(T1.ProNumLin <= ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Tprofsawwds_17_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV70Tprofsawwds_16_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Tprofsawwds_17_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Tprofsawwds_19_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV72Tprofsawwds_18_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Tprofsawwds_19_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.FasDsc = ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ProUltFP" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ProUltFP DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ProCod" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ProCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T4.ProDsc" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.ProDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T4.ProDsc2" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.ProDsc2 DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.EmprNom" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.EmprNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ProNumLin" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ProNumLin DESC" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FasCod" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FasCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.FasDsc" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.FasDsc DESC" ;
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
                  return conditional_P08NF2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).shortValue() , ((Number) dynConstraints[14]).shortValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).shortValue() , ((Number) dynConstraints[25]).shortValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).shortValue() , ((Boolean) dynConstraints[29]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08NF2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 100);
               ((String[]) buf[7])[0] = rslt.getString(7, 40);
               ((String[]) buf[8])[0] = rslt.getString(8, 8);
               ((String[]) buf[9])[0] = rslt.getString(9, 3);
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
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
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
                  stmt.setString(sIdx, (String)parms[36], 3);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 3);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 8);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 8);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 40);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 40);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[46]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[47]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[48]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[49]).shortValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 8);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 8);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 28);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 28);
               }
               return;
      }
   }

}

