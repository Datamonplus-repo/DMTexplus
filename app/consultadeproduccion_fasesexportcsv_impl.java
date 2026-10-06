package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class consultadeproduccion_fasesexportcsv_impl extends GXWebProcedure
{
   public consultadeproduccion_fasesexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV59Var_Hdr = AV60WebSession.getValue("&Var_Hdr") ;
      AV55EmprCod = GXutil.substring( AV59Var_Hdr, 1, 3) ;
      AV56BarCod = (int)(GXutil.lval( GXutil.substring( AV59Var_Hdr, 4, 8))) ;
      AV57BarCodReo = (byte)(GXutil.lval( GXutil.substring( AV59Var_Hdr, 12, 1))) ;
      AV58BarCodPar = GXutil.substring( AV59Var_Hdr, 13, 1) ;
      AV60WebSession.remove("&Var_Hdr");
      if ( 1 == 0 )
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
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      GXv_SdtWWPContext1[0] = AV9WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext1) ;
      AV9WWPContext = GXv_SdtWWPContext1[0] ;
      /* Execute user subroutine: 'CARGADATOSFILTROS' */
      S201 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
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
      /* Execute user subroutine: 'TITULODATOSFILTROS' */
      S211 ();
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
      AV11Filename = "./PrivateTempStorage/" + "ConsultadeProduccion_FasesExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("ConsultadeProduccion_FasesColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("ConsultadeProduccion_FasesColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Orden", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Codigo Fase", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion de Fase", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Maquina", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion ", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Inicio", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fin", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "HhMm", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "E", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Kilos", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Metros", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Operario", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "PP", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(A153BarFasEst) ,
                                           AV50TFBarFasEst_Sels ,
                                           Short.valueOf(AV35TFBarOrdLin) ,
                                           Short.valueOf(AV36TFBarOrdLin_To) ,
                                           AV38TFFasCod_Sel ,
                                           AV37TFFasCod ,
                                           AV40TFFasDsc_Sel ,
                                           AV39TFFasDsc ,
                                           AV42TFMaqCodBis_Sel ,
                                           AV41TFMaqCodBis ,
                                           AV43TFBarFasDTI ,
                                           AV47TFBarTieRea ,
                                           AV48TFBarTieRea_To ,
                                           Integer.valueOf(AV50TFBarFasEst_Sels.size()) ,
                                           AV51TFBarFasKgm ,
                                           AV52TFBarFasKgm_To ,
                                           AV53TFBarFasMtr ,
                                           AV54TFBarFasMtr_To ,
                                           Byte.valueOf(AV64TFBarFasPri) ,
                                           Byte.valueOf(AV65TFBarFasPri_To) ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A603MaqCodBis ,
                                           A4442BarFasDTI ,
                                           A215BarTieRea ,
                                           A3837BarFasKgm ,
                                           A3838BarFasMtr ,
                                           Byte.valueOf(A3836BarFasPri) ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) ,
                                           AV55EmprCod ,
                                           Integer.valueOf(AV56BarCod) ,
                                           Byte.valueOf(AV57BarCodReo) ,
                                           AV58BarCodPar ,
                                           A396EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                           TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING
                                           }
      });
      lV37TFFasCod = GXutil.padr( GXutil.rtrim( AV37TFFasCod), 8, "%") ;
      lV39TFFasDsc = GXutil.padr( GXutil.rtrim( AV39TFFasDsc), 28, "%") ;
      lV41TFMaqCodBis = GXutil.padr( GXutil.rtrim( AV41TFMaqCodBis), 6, "%") ;
      /* Using cursor P09X02 */
      pr_default.execute(0, new Object[] {AV55EmprCod, Integer.valueOf(AV56BarCod), Byte.valueOf(AV57BarCodReo), AV58BarCodPar, Short.valueOf(AV35TFBarOrdLin), Short.valueOf(AV36TFBarOrdLin_To), lV37TFFasCod, AV38TFFasCod_Sel, lV39TFFasDsc, AV40TFFasDsc_Sel, lV41TFMaqCodBis, AV42TFMaqCodBis_Sel, AV43TFBarFasDTI, AV47TFBarTieRea, AV48TFBarTieRea_To, AV51TFBarFasKgm, AV52TFBarFasKgm_To, AV53TFBarFasMtr, AV54TFBarFasMtr_To, Byte.valueOf(AV64TFBarFasPri), Byte.valueOf(AV65TFBarFasPri_To)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A3836BarFasPri = P09X02_A3836BarFasPri[0] ;
         A3838BarFasMtr = P09X02_A3838BarFasMtr[0] ;
         n3838BarFasMtr = P09X02_n3838BarFasMtr[0] ;
         A3837BarFasKgm = P09X02_A3837BarFasKgm[0] ;
         n3837BarFasKgm = P09X02_n3837BarFasKgm[0] ;
         A153BarFasEst = P09X02_A153BarFasEst[0] ;
         A215BarTieRea = P09X02_A215BarTieRea[0] ;
         A4442BarFasDTI = P09X02_A4442BarFasDTI[0] ;
         n4442BarFasDTI = P09X02_n4442BarFasDTI[0] ;
         A603MaqCodBis = P09X02_A603MaqCodBis[0] ;
         A460FasDsc = P09X02_A460FasDsc[0] ;
         A457FasCod = P09X02_A457FasCod[0] ;
         A194BarOrdLin = P09X02_A194BarOrdLin[0] ;
         A130BarCodPar = P09X02_A130BarCodPar[0] ;
         A132BarCodReo = P09X02_A132BarCodReo[0] ;
         A129BarCod = P09X02_A129BarCod[0] ;
         A396EmprCod = P09X02_A396EmprCod[0] ;
         A4443BarFasDTF = P09X02_A4443BarFasDTF[0] ;
         n4443BarFasDTF = P09X02_n4443BarFasDTF[0] ;
         A148BarEstReo = P09X02_A148BarEstReo[0] ;
         A6173BarFasSec = P09X02_A6173BarFasSec[0] ;
         n6173BarFasSec = P09X02_n6173BarFasSec[0] ;
         A934BarReoCod = P09X02_A934BarReoCod[0] ;
         A936BarReoReo = P09X02_A936BarReoReo[0] ;
         A935BarReoPar = P09X02_A935BarReoPar[0] ;
         A758ProCod = P09X02_A758ProCod[0] ;
         A460FasDsc = P09X02_A460FasDsc[0] ;
         A148BarEstReo = P09X02_A148BarEstReo[0] ;
         A934BarReoCod = P09X02_A934BarReoCod[0] ;
         A936BarReoReo = P09X02_A936BarReoReo[0] ;
         A935BarReoPar = P09X02_A935BarReoPar[0] ;
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
            AV14TextFileLine += GXutil.str( A194BarOrdLin, 4, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A457FasCod, ";", ","), GXv_char3) ;
            consultadeproduccion_fasesexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A460FasDsc, ";", ","), GXv_char3) ;
            consultadeproduccion_fasesexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A603MaqCodBis, ";", ","), GXv_char3) ;
            consultadeproduccion_fasesexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char2 = AV30MaqDsc ;
            GXv_char3[0] = A396EmprCod ;
            GXv_char4[0] = A603MaqCodBis ;
            GXv_char5[0] = GXt_char2 ;
            new app.pmaqdsc(remoteHandle, context).execute( GXv_char3, GXv_char4, GXv_char5) ;
            consultadeproduccion_fasesexportcsv_impl.this.A396EmprCod = GXv_char3[0] ;
            consultadeproduccion_fasesexportcsv_impl.this.A603MaqCodBis = GXv_char4[0] ;
            consultadeproduccion_fasesexportcsv_impl.this.GXt_char2 = GXv_char5[0] ;
            AV30MaqDsc = GXt_char2 ;
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char5[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV30MaqDsc, ";", ","), GXv_char5) ;
            consultadeproduccion_fasesexportcsv_impl.this.GXt_char2 = GXv_char5[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += localUtil.ttoc( A4442BarFasDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV66BarFasDtF = "" ;
            if ( ( ( A153BarFasEst > 0 ) ) || ( ! (0==A3836BarFasPri) ) )
            {
               if ( ! GXutil.dateCompare(GXutil.nullDate(), A4442BarFasDTI) )
               {
                  AV66BarFasDtF = localUtil.ttoc( A4443BarFasDTF, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
               }
            }
            if ( ( ( A153BarFasEst >= 2 ) ) || ( ! (0==A3836BarFasPri) ) )
            {
               AV66BarFasDtF = localUtil.ttoc( A4443BarFasDTF, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
            }
            GXt_int6 = AV72Lexmvh ;
            GXv_date7[0] = AV83Exhdrfee ;
            GXv_date8[0] = AV84Exhdrfer ;
            GXv_int9[0] = GXt_int6 ;
            new app.fasetrabajoexterior(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A457FasCod, GXv_date7, GXv_date8, GXv_int9) ;
            consultadeproduccion_fasesexportcsv_impl.this.AV83Exhdrfee = GXv_date7[0] ;
            consultadeproduccion_fasesexportcsv_impl.this.AV84Exhdrfer = GXv_date8[0] ;
            consultadeproduccion_fasesexportcsv_impl.this.GXt_int6 = GXv_int9[0] ;
            AV72Lexmvh = GXt_int6 ;
            if ( AV85Barext != 0 )
            {
               AV66BarFasDtF = (!GXutil.dateCompare(GXutil.nullDate(), A4443BarFasDTF) ? localUtil.ttoc( A4443BarFasDTF, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") : localUtil.dtoc( AV84Exhdrfer, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) ;
            }
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char5[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV66BarFasDtF, ";", ","), GXv_char5) ;
            consultadeproduccion_fasesexportcsv_impl.this.GXt_char2 = GXv_char5[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A215BarTieRea, 5, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            if ( A153BarFasEst == 0 )
            {
               AV14TextFileLine += httpContext.getMessage( "Pendiente", "") ;
            }
            else if ( A153BarFasEst == 1 )
            {
               AV14TextFileLine += httpContext.getMessage( "En Proceso", "") ;
            }
            else if ( A153BarFasEst == 2 )
            {
               AV14TextFileLine += httpContext.getMessage( "Finalizada", "") ;
            }
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A3837BarFasKgm, 9, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A3838BarFasMtr, 9, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            if ( ( GXutil.strcmp(A6173BarFasSec, httpContext.getMessage( "OR", "")) == 0 ) && ( A148BarEstReo == 1 ) )
            {
               GXt_char2 = AV31OpeNom ;
               GXv_char5[0] = A396EmprCod ;
               GXv_int10[0] = A934BarReoCod ;
               GXv_int11[0] = A936BarReoReo ;
               GXv_char4[0] = A935BarReoPar ;
               GXv_int9[0] = A194BarOrdLin ;
               GXv_char3[0] = GXt_char2 ;
               new app.pjln001(remoteHandle, context).execute( GXv_char5, GXv_int10, GXv_int11, GXv_char4, GXv_int9, GXv_char3) ;
               consultadeproduccion_fasesexportcsv_impl.this.A396EmprCod = GXv_char5[0] ;
               consultadeproduccion_fasesexportcsv_impl.this.A934BarReoCod = GXv_int10[0] ;
               consultadeproduccion_fasesexportcsv_impl.this.A936BarReoReo = GXv_int11[0] ;
               consultadeproduccion_fasesexportcsv_impl.this.A935BarReoPar = GXv_char4[0] ;
               consultadeproduccion_fasesexportcsv_impl.this.A194BarOrdLin = GXv_int9[0] ;
               consultadeproduccion_fasesexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV31OpeNom = GXt_char2 ;
            }
            else
            {
               GXt_char2 = AV31OpeNom ;
               GXv_char5[0] = A396EmprCod ;
               GXv_int10[0] = A129BarCod ;
               GXv_int11[0] = A132BarCodReo ;
               GXv_char4[0] = A130BarCodPar ;
               GXv_int9[0] = A194BarOrdLin ;
               GXv_char3[0] = GXt_char2 ;
               new app.pjln001(remoteHandle, context).execute( GXv_char5, GXv_int10, GXv_int11, GXv_char4, GXv_int9, GXv_char3) ;
               consultadeproduccion_fasesexportcsv_impl.this.A396EmprCod = GXv_char5[0] ;
               consultadeproduccion_fasesexportcsv_impl.this.A129BarCod = GXv_int10[0] ;
               consultadeproduccion_fasesexportcsv_impl.this.A132BarCodReo = GXv_int11[0] ;
               consultadeproduccion_fasesexportcsv_impl.this.A130BarCodPar = GXv_char4[0] ;
               consultadeproduccion_fasesexportcsv_impl.this.A194BarOrdLin = GXv_int9[0] ;
               consultadeproduccion_fasesexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV31OpeNom = GXt_char2 ;
            }
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char5[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV31OpeNom, ";", ","), GXv_char5) ;
            consultadeproduccion_fasesexportcsv_impl.this.GXt_char2 = GXv_char5[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A3836BarFasPri, 2, 0) ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=ConsultadeProduccion_FasesExportCSV.csv");
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
      GXv_SdtWWPColumnsSelector12[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "BarOrdLin", "", "Orden", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "FasCod", "", "Codigo Fase", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "FasDsc", "", "Descripcion de Fase", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "MaqCodBis", "", "Maquina", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "&MaqDsc", "", "Descripcion ", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "BarFasDTI", "", "Inicio", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "&BarFasDtF", "", "Fin", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "BarTieRea", "", "HhMm", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "BarFasEst", "", "E", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "BarFasKgm", "", "Kilos", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "BarFasMtr", "", "Metros", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "&OpeNom", "", "Operario", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "BarFasPri", "", "PP", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char5[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "ConsultadeProduccion_FasesColumnsSelector", GXv_char5) ;
      consultadeproduccion_fasesexportcsv_impl.this.GXt_char2 = GXv_char5[0] ;
      AV20UserCustomValue = GXt_char2 ;
      if ( ! ( (GXutil.strcmp("", AV20UserCustomValue)==0) ) )
      {
         AV16ColumnsSelectorAux.fromxml(AV20UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector12[0] = AV16ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector13[0] = AV15ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, GXv_SdtWWPColumnsSelector13) ;
         AV16ColumnsSelectorAux = GXv_SdtWWPColumnsSelector12[0] ;
         AV15ColumnsSelector = GXv_SdtWWPColumnsSelector13[0] ;
      }
   }

   public void S191( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue("ConsultadeProduccion_FasesGridState"), "") == 0 )
      {
         AV33GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "ConsultadeProduccion_FasesGridState"), null, null);
      }
      else
      {
         AV33GridState.fromxml(AV19Session.getValue("ConsultadeProduccion_FasesGridState"), null, null);
      }
      AV28OrderedBy = AV33GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV33GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV86GXV1 = 1 ;
      while ( AV86GXV1 <= AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV34GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV86GXV1));
         if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARORDLIN") == 0 )
         {
            AV35TFBarOrdLin = (short)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV36TFBarOrdLin_To = (short)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD") == 0 )
         {
            AV37TFFasCod = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD_SEL") == 0 )
         {
            AV38TFFasCod_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC") == 0 )
         {
            AV39TFFasDsc = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC_SEL") == 0 )
         {
            AV40TFFasDsc_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCODBIS") == 0 )
         {
            AV41TFMaqCodBis = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCODBIS_SEL") == 0 )
         {
            AV42TFMaqCodBis_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASDTI") == 0 )
         {
            AV43TFBarFasDTI = localUtil.ctot( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIEREA") == 0 )
         {
            AV47TFBarTieRea = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV48TFBarTieRea_To = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASEST_SEL") == 0 )
         {
            AV49TFBarFasEst_SelsJson = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV50TFBarFasEst_Sels.fromJSonString(AV49TFBarFasEst_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASKGM") == 0 )
         {
            AV51TFBarFasKgm = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV52TFBarFasKgm_To = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASMTR") == 0 )
         {
            AV53TFBarFasMtr = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV54TFBarFasMtr_To = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASPRI") == 0 )
         {
            AV64TFBarFasPri = (byte)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV65TFBarFasPri_To = (byte)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV55EmprCod = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOD") == 0 )
         {
            AV56BarCod = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODREO") == 0 )
         {
            AV57BarCodReo = (byte)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODPAR") == 0 )
         {
            AV58BarCodPar = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD") == 0 )
         {
            AV73Clicod = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLINOM") == 0 )
         {
            AV74CliNom = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PEDIDOCLIENTE") == 0 )
         {
            AV75PedidoCliente = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARSER") == 0 )
         {
            AV76Barser = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARSERDSC") == 0 )
         {
            AV77BarSerDsc = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOLNOM") == 0 )
         {
            AV78Barcolnom = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOLNUM") == 0 )
         {
            AV79Barcolnum = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV86GXV1 = (int)(AV86GXV1+1) ;
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

   public void S201( )
   {
      /* 'CARGADATOSFILTROS' Routine */
      returnInSub = false ;
      GXt_char2 = AV68Station ;
      GXv_char5[0] = GXt_char2 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char5) ;
      consultadeproduccion_fasesexportcsv_impl.this.GXt_char2 = GXv_char5[0] ;
      AV68Station = GXt_char2 ;
      GXv_char5[0] = AV55EmprCod ;
      GXv_char4[0] = AV69EmprNom ;
      GXv_char3[0] = AV70UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV68Station, GXv_char5, GXv_char4, GXv_char3) ;
      consultadeproduccion_fasesexportcsv_impl.this.AV55EmprCod = GXv_char5[0] ;
      consultadeproduccion_fasesexportcsv_impl.this.AV69EmprNom = GXv_char4[0] ;
      consultadeproduccion_fasesexportcsv_impl.this.AV70UsurCod = GXv_char3[0] ;
   }

   public void S211( )
   {
      /* 'TITULODATOSFILTROS' Routine */
      returnInSub = false ;
      AV14TextFileLine += AV69EmprNom + " " + "(" + AV87Pgmdesc + ")" ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(AV14TextFileLine);
         AV10TextFile.writeLine(" ");
      }
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
      AV59Var_Hdr = "" ;
      AV60WebSession = httpContext.getWebSession();
      AV55EmprCod = "" ;
      AV58BarCodPar = "" ;
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV11Filename = "" ;
      AV10TextFile = new com.genexus.util.GXFile();
      AV14TextFileLine = "" ;
      AV19Session = httpContext.getWebSession();
      AV18ColumnsSelectorXML = "" ;
      AV15ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV50TFBarFasEst_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      scmdbuf = "" ;
      lV37TFFasCod = "" ;
      lV39TFFasDsc = "" ;
      lV41TFMaqCodBis = "" ;
      AV38TFFasCod_Sel = "" ;
      AV37TFFasCod = "" ;
      AV40TFFasDsc_Sel = "" ;
      AV39TFFasDsc = "" ;
      AV42TFMaqCodBis_Sel = "" ;
      AV41TFMaqCodBis = "" ;
      AV43TFBarFasDTI = GXutil.resetTime( GXutil.nullDate() );
      AV47TFBarTieRea = DecimalUtil.ZERO ;
      AV48TFBarTieRea_To = DecimalUtil.ZERO ;
      AV51TFBarFasKgm = DecimalUtil.ZERO ;
      AV52TFBarFasKgm_To = DecimalUtil.ZERO ;
      AV53TFBarFasMtr = DecimalUtil.ZERO ;
      AV54TFBarFasMtr_To = DecimalUtil.ZERO ;
      A457FasCod = "" ;
      A460FasDsc = "" ;
      A603MaqCodBis = "" ;
      A4442BarFasDTI = GXutil.resetTime( GXutil.nullDate() );
      A215BarTieRea = DecimalUtil.ZERO ;
      A3837BarFasKgm = DecimalUtil.ZERO ;
      A3838BarFasMtr = DecimalUtil.ZERO ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      P09X02_A3836BarFasPri = new byte[1] ;
      P09X02_A3838BarFasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09X02_n3838BarFasMtr = new boolean[] {false} ;
      P09X02_A3837BarFasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09X02_n3837BarFasKgm = new boolean[] {false} ;
      P09X02_A153BarFasEst = new byte[1] ;
      P09X02_A215BarTieRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09X02_A4442BarFasDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P09X02_n4442BarFasDTI = new boolean[] {false} ;
      P09X02_A603MaqCodBis = new String[] {""} ;
      P09X02_A460FasDsc = new String[] {""} ;
      P09X02_A457FasCod = new String[] {""} ;
      P09X02_A194BarOrdLin = new short[1] ;
      P09X02_A130BarCodPar = new String[] {""} ;
      P09X02_A132BarCodReo = new byte[1] ;
      P09X02_A129BarCod = new int[1] ;
      P09X02_A396EmprCod = new String[] {""} ;
      P09X02_A4443BarFasDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P09X02_n4443BarFasDTF = new boolean[] {false} ;
      P09X02_A148BarEstReo = new byte[1] ;
      P09X02_A6173BarFasSec = new String[] {""} ;
      P09X02_n6173BarFasSec = new boolean[] {false} ;
      P09X02_A934BarReoCod = new int[1] ;
      P09X02_A936BarReoReo = new byte[1] ;
      P09X02_A935BarReoPar = new String[] {""} ;
      P09X02_A758ProCod = new String[] {""} ;
      A4443BarFasDTF = GXutil.resetTime( GXutil.nullDate() );
      A6173BarFasSec = "" ;
      A935BarReoPar = "" ;
      A758ProCod = "" ;
      AV30MaqDsc = "" ;
      AV66BarFasDtF = "" ;
      AV83Exhdrfee = GXutil.nullDate() ;
      GXv_date7 = new java.util.Date[1] ;
      AV84Exhdrfer = GXutil.nullDate() ;
      GXv_date8 = new java.util.Date[1] ;
      AV31OpeNom = "" ;
      GXv_int10 = new int[1] ;
      GXv_int11 = new byte[1] ;
      GXv_int9 = new short[1] ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector12 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector13 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV33GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV34GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV49TFBarFasEst_SelsJson = "" ;
      AV74CliNom = "" ;
      AV75PedidoCliente = "" ;
      AV76Barser = "" ;
      AV77BarSerDsc = "" ;
      AV78Barcolnom = "" ;
      AV68Station = "" ;
      GXt_char2 = "" ;
      GXv_char5 = new String[1] ;
      AV69EmprNom = "" ;
      GXv_char4 = new String[1] ;
      AV70UsurCod = "" ;
      GXv_char3 = new String[1] ;
      AV87Pgmdesc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.consultadeproduccion_fasesexportcsv__default(),
         new Object[] {
             new Object[] {
            P09X02_A3836BarFasPri, P09X02_A3838BarFasMtr, P09X02_n3838BarFasMtr, P09X02_A3837BarFasKgm, P09X02_n3837BarFasKgm, P09X02_A153BarFasEst, P09X02_A215BarTieRea, P09X02_A4442BarFasDTI, P09X02_n4442BarFasDTI, P09X02_A603MaqCodBis,
            P09X02_A460FasDsc, P09X02_A457FasCod, P09X02_A194BarOrdLin, P09X02_A130BarCodPar, P09X02_A132BarCodReo, P09X02_A129BarCod, P09X02_A396EmprCod, P09X02_A4443BarFasDTF, P09X02_n4443BarFasDTF, P09X02_A148BarEstReo,
            P09X02_A6173BarFasSec, P09X02_n6173BarFasSec, P09X02_A934BarReoCod, P09X02_A936BarReoReo, P09X02_A935BarReoPar, P09X02_A758ProCod
            }
         }
      );
      AV87Pgmdesc = httpContext.getMessage( "Informe de Consulta Producción por Fase", "") ;
      /* GeneXus formulas. */
      AV87Pgmdesc = httpContext.getMessage( "Informe de Consulta Producción por Fase", "") ;
      Gx_err = (short)(0) ;
   }

   private byte AV57BarCodReo ;
   private byte A153BarFasEst ;
   private byte AV64TFBarFasPri ;
   private byte AV65TFBarFasPri_To ;
   private byte A3836BarFasPri ;
   private byte A132BarCodReo ;
   private byte A148BarEstReo ;
   private byte A936BarReoReo ;
   private byte AV85Barext ;
   private byte GXv_int11[] ;
   private short gxcookieaux ;
   private short AV35TFBarOrdLin ;
   private short AV36TFBarOrdLin_To ;
   private short A194BarOrdLin ;
   private short AV28OrderedBy ;
   private short AV72Lexmvh ;
   private short GXt_int6 ;
   private short GXv_int9[] ;
   private short Gx_err ;
   private int AV56BarCod ;
   private int AV13Random ;
   private int AV50TFBarFasEst_Sels_size ;
   private int A129BarCod ;
   private int A934BarReoCod ;
   private int GXv_int10[] ;
   private int AV86GXV1 ;
   private int AV73Clicod ;
   private int AV79Barcolnum ;
   private java.math.BigDecimal AV47TFBarTieRea ;
   private java.math.BigDecimal AV48TFBarTieRea_To ;
   private java.math.BigDecimal AV51TFBarFasKgm ;
   private java.math.BigDecimal AV52TFBarFasKgm_To ;
   private java.math.BigDecimal AV53TFBarFasMtr ;
   private java.math.BigDecimal AV54TFBarFasMtr_To ;
   private java.math.BigDecimal A215BarTieRea ;
   private java.math.BigDecimal A3837BarFasKgm ;
   private java.math.BigDecimal A3838BarFasMtr ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV59Var_Hdr ;
   private String AV55EmprCod ;
   private String AV58BarCodPar ;
   private String scmdbuf ;
   private String lV37TFFasCod ;
   private String lV39TFFasDsc ;
   private String lV41TFMaqCodBis ;
   private String AV38TFFasCod_Sel ;
   private String AV37TFFasCod ;
   private String AV40TFFasDsc_Sel ;
   private String AV39TFFasDsc ;
   private String AV42TFMaqCodBis_Sel ;
   private String AV41TFMaqCodBis ;
   private String A457FasCod ;
   private String A460FasDsc ;
   private String A603MaqCodBis ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A6173BarFasSec ;
   private String A935BarReoPar ;
   private String A758ProCod ;
   private String AV30MaqDsc ;
   private String AV66BarFasDtF ;
   private String AV31OpeNom ;
   private String AV74CliNom ;
   private String AV75PedidoCliente ;
   private String AV76Barser ;
   private String AV77BarSerDsc ;
   private String AV78Barcolnom ;
   private String AV68Station ;
   private String GXt_char2 ;
   private String GXv_char5[] ;
   private String AV69EmprNom ;
   private String GXv_char4[] ;
   private String AV70UsurCod ;
   private String GXv_char3[] ;
   private String AV87Pgmdesc ;
   private java.util.Date AV43TFBarFasDTI ;
   private java.util.Date A4442BarFasDTI ;
   private java.util.Date A4443BarFasDTF ;
   private java.util.Date AV83Exhdrfee ;
   private java.util.Date GXv_date7[] ;
   private java.util.Date AV84Exhdrfer ;
   private java.util.Date GXv_date8[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean n3838BarFasMtr ;
   private boolean n3837BarFasKgm ;
   private boolean n4442BarFasDTI ;
   private boolean n4443BarFasDTF ;
   private boolean n6173BarFasSec ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV49TFBarFasEst_SelsJson ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private GXSimpleCollection<Byte> AV50TFBarFasEst_Sels ;
   private com.genexus.webpanels.WebSession AV60WebSession ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private byte[] P09X02_A3836BarFasPri ;
   private java.math.BigDecimal[] P09X02_A3838BarFasMtr ;
   private boolean[] P09X02_n3838BarFasMtr ;
   private java.math.BigDecimal[] P09X02_A3837BarFasKgm ;
   private boolean[] P09X02_n3837BarFasKgm ;
   private byte[] P09X02_A153BarFasEst ;
   private java.math.BigDecimal[] P09X02_A215BarTieRea ;
   private java.util.Date[] P09X02_A4442BarFasDTI ;
   private boolean[] P09X02_n4442BarFasDTI ;
   private String[] P09X02_A603MaqCodBis ;
   private String[] P09X02_A460FasDsc ;
   private String[] P09X02_A457FasCod ;
   private short[] P09X02_A194BarOrdLin ;
   private String[] P09X02_A130BarCodPar ;
   private byte[] P09X02_A132BarCodReo ;
   private int[] P09X02_A129BarCod ;
   private String[] P09X02_A396EmprCod ;
   private java.util.Date[] P09X02_A4443BarFasDTF ;
   private boolean[] P09X02_n4443BarFasDTF ;
   private byte[] P09X02_A148BarEstReo ;
   private String[] P09X02_A6173BarFasSec ;
   private boolean[] P09X02_n6173BarFasSec ;
   private int[] P09X02_A934BarReoCod ;
   private byte[] P09X02_A936BarReoReo ;
   private String[] P09X02_A935BarReoPar ;
   private String[] P09X02_A758ProCod ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector12[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector13[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV33GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV34GridStateFilterValue ;
}

final  class consultadeproduccion_fasesexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09X02( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A153BarFasEst ,
                                          GXSimpleCollection<Byte> AV50TFBarFasEst_Sels ,
                                          short AV35TFBarOrdLin ,
                                          short AV36TFBarOrdLin_To ,
                                          String AV38TFFasCod_Sel ,
                                          String AV37TFFasCod ,
                                          String AV40TFFasDsc_Sel ,
                                          String AV39TFFasDsc ,
                                          String AV42TFMaqCodBis_Sel ,
                                          String AV41TFMaqCodBis ,
                                          java.util.Date AV43TFBarFasDTI ,
                                          java.math.BigDecimal AV47TFBarTieRea ,
                                          java.math.BigDecimal AV48TFBarTieRea_To ,
                                          int AV50TFBarFasEst_Sels_size ,
                                          java.math.BigDecimal AV51TFBarFasKgm ,
                                          java.math.BigDecimal AV52TFBarFasKgm_To ,
                                          java.math.BigDecimal AV53TFBarFasMtr ,
                                          java.math.BigDecimal AV54TFBarFasMtr_To ,
                                          byte AV64TFBarFasPri ,
                                          byte AV65TFBarFasPri_To ,
                                          short A194BarOrdLin ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String A603MaqCodBis ,
                                          java.util.Date A4442BarFasDTI ,
                                          java.math.BigDecimal A215BarTieRea ,
                                          java.math.BigDecimal A3837BarFasKgm ,
                                          java.math.BigDecimal A3838BarFasMtr ,
                                          byte A3836BarFasPri ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc ,
                                          String AV55EmprCod ,
                                          int AV56BarCod ,
                                          byte AV57BarCodReo ,
                                          String AV58BarCodPar ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[21];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT T1.BarFasPri, T1.BarFasMtr, T1.BarFasKgm, T1.BarFasEst, T1.BarTieRea, T1.BarFasDTI, T1.MaqCodBis, T2.FasDsc, T1.FasCod, T1.BarOrdLin, T1.BarCodPar, T1.BarCodReo," ;
      scmdbuf += " T1.BarCod, T1.EmprCod, T1.BarFasDTF, T3.BarEstReo, T1.BarFasSec, T3.BarReoCod, T3.BarReoReo, T3.BarReoPar, T1.ProCod FROM ((TXPBARFAS T1 INNER JOIN TXPFASPRO T2" ;
      scmdbuf += " ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo" ;
      scmdbuf += " AND T3.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?)");
      if ( ! (0==AV35TFBarOrdLin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int14[4] = (byte)(1) ;
      }
      if ( ! (0==AV36TFBarOrdLin_To) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int14[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV38TFFasCod_Sel)==0) && ( ! (GXutil.strcmp("", AV37TFFasCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV38TFFasCod_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int14[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV40TFFasDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV39TFFasDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV40TFFasDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int14[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV42TFMaqCodBis_Sel)==0) && ( ! (GXutil.strcmp("", AV41TFMaqCodBis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodBis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV42TFMaqCodBis_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodBis = ?)");
      }
      else
      {
         GXv_int14[11] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV43TFBarFasDTI) )
      {
         addWhere(sWhereString, "(T1.BarFasDTI >= ?)");
      }
      else
      {
         GXv_int14[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV47TFBarTieRea)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieRea >= ?)");
      }
      else
      {
         GXv_int14[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV48TFBarTieRea_To)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieRea <= ?)");
      }
      else
      {
         GXv_int14[14] = (byte)(1) ;
      }
      if ( AV50TFBarFasEst_Sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV50TFBarFasEst_Sels, "T1.BarFasEst IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV51TFBarFasKgm)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasKgm >= ?)");
      }
      else
      {
         GXv_int14[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV52TFBarFasKgm_To)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasKgm <= ?)");
      }
      else
      {
         GXv_int14[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV53TFBarFasMtr)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasMtr >= ?)");
      }
      else
      {
         GXv_int14[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV54TFBarFasMtr_To)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasMtr <= ?)");
      }
      else
      {
         GXv_int14[18] = (byte)(1) ;
      }
      if ( ! (0==AV64TFBarFasPri) )
      {
         addWhere(sWhereString, "(T1.BarFasPri >= ?)");
      }
      else
      {
         GXv_int14[19] = (byte)(1) ;
      }
      if ( ! (0==AV65TFBarFasPri_To) )
      {
         addWhere(sWhereString, "(T1.BarFasPri <= ?)");
      }
      else
      {
         GXv_int14[20] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarOrdLin" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.BarOrdLin DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.FasCod" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.FasCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.FasDsc" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T2.FasDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.MaqCodBis" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.MaqCodBis DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarFasDTI" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.BarFasDTI DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarTieRea" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.BarTieRea DESC" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarFasEst" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.BarFasEst DESC" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarFasKgm" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.BarFasKgm DESC" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarFasMtr" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.BarFasMtr DESC" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarFasPri" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.BarFasPri DESC" ;
      }
      GXv_Object15[0] = scmdbuf ;
      GXv_Object15[1] = GXv_int14 ;
      return GXv_Object15 ;
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
                  return conditional_P09X02(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).shortValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.util.Date)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (java.util.Date)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , ((Number) dynConstraints[28]).byteValue() , ((Number) dynConstraints[29]).shortValue() , ((Boolean) dynConstraints[30]).booleanValue() , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).byteValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).byteValue() , (String)dynConstraints[38] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09X02", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(4);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,2);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 6);
               ((String[]) buf[10])[0] = rslt.getString(8, 28);
               ((String[]) buf[11])[0] = rslt.getString(9, 8);
               ((short[]) buf[12])[0] = rslt.getShort(10);
               ((String[]) buf[13])[0] = rslt.getString(11, 1);
               ((byte[]) buf[14])[0] = rslt.getByte(12);
               ((int[]) buf[15])[0] = rslt.getInt(13);
               ((String[]) buf[16])[0] = rslt.getString(14, 3);
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDateTime(15);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((byte[]) buf[19])[0] = rslt.getByte(16);
               ((String[]) buf[20])[0] = rslt.getString(17, 2);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((int[]) buf[22])[0] = rslt.getInt(18);
               ((byte[]) buf[23])[0] = rslt.getByte(19);
               ((String[]) buf[24])[0] = rslt.getString(20, 1);
               ((String[]) buf[25])[0] = rslt.getString(21, 8);
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
                  stmt.setString(sIdx, (String)parms[21], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[22]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[23]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[25]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[26]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 8);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 8);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 28);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 28);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 6);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[33], false);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[40]).byteValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[41]).byteValue());
               }
               return;
      }
   }

}

