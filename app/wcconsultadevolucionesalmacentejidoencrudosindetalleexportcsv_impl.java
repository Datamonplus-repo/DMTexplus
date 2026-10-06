package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wcconsultadevolucionesalmacentejidoencrudosindetalleexportcsv_impl extends GXWebProcedure
{
   public wcconsultadevolucionesalmacentejidoencrudosindetalleexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "WCConsultaDevolucionesAlmacenTejidoencrudosindetalleExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("WCConsultaDevolucionesAlmacenTejidoencrudosindetalleColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("WCConsultaDevolucionesAlmacenTejidoencrudosindetalleColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Devolucion Id", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha Devolucion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cod Transp", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Transportista", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Matricula", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Observaciones", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Unidades", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Piezas", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext = AV30FilterFullText ;
      AV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_2_tfdevcruid = AV35TFDevCruId ;
      AV66Wcconsultadevolucionesalmacentejidoencrudosindetalleds_3_tfdevcruid_to = AV36TFDevCruId_To ;
      AV67Wcconsultadevolucionesalmacentejidoencrudosindetalleds_4_tfdevcrufec = AV37TFDevCruFec ;
      AV68Wcconsultadevolucionesalmacentejidoencrudosindetalleds_5_tfclicod = AV39TFCliCod ;
      AV69Wcconsultadevolucionesalmacentejidoencrudosindetalleds_6_tfclicod_to = AV40TFCliCod_To ;
      AV70Wcconsultadevolucionesalmacentejidoencrudosindetalleds_7_tfclinom = AV41TFCliNom ;
      AV71Wcconsultadevolucionesalmacentejidoencrudosindetalleds_8_tfclinom_sel = AV42TFCliNom_Sel ;
      AV72Wcconsultadevolucionesalmacentejidoencrudosindetalleds_9_tftrncod = AV43TFTrnCod ;
      AV73Wcconsultadevolucionesalmacentejidoencrudosindetalleds_10_tftrncod_to = AV44TFTrnCod_To ;
      AV74Wcconsultadevolucionesalmacentejidoencrudosindetalleds_11_tftrnnom = AV45TFTrnNom ;
      AV75Wcconsultadevolucionesalmacentejidoencrudosindetalleds_12_tftrnnom_sel = AV46TFTrnNom_Sel ;
      AV76Wcconsultadevolucionesalmacentejidoencrudosindetalleds_13_tfdevcrumat = AV47TFDevCruMat ;
      AV77Wcconsultadevolucionesalmacentejidoencrudosindetalleds_14_tfdevcrumat_sel = AV48TFDevCruMat_Sel ;
      AV78Wcconsultadevolucionesalmacentejidoencrudosindetalleds_15_tfdevcruobs = AV49TFDevCruObs ;
      AV79Wcconsultadevolucionesalmacentejidoencrudosindetalleds_16_tfdevcruobs_sel = AV50TFDevCruObs_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext ,
                                           Integer.valueOf(AV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_2_tfdevcruid) ,
                                           Integer.valueOf(AV66Wcconsultadevolucionesalmacentejidoencrudosindetalleds_3_tfdevcruid_to) ,
                                           AV67Wcconsultadevolucionesalmacentejidoencrudosindetalleds_4_tfdevcrufec ,
                                           Integer.valueOf(AV68Wcconsultadevolucionesalmacentejidoencrudosindetalleds_5_tfclicod) ,
                                           Integer.valueOf(AV69Wcconsultadevolucionesalmacentejidoencrudosindetalleds_6_tfclicod_to) ,
                                           AV71Wcconsultadevolucionesalmacentejidoencrudosindetalleds_8_tfclinom_sel ,
                                           AV70Wcconsultadevolucionesalmacentejidoencrudosindetalleds_7_tfclinom ,
                                           Short.valueOf(AV72Wcconsultadevolucionesalmacentejidoencrudosindetalleds_9_tftrncod) ,
                                           Short.valueOf(AV73Wcconsultadevolucionesalmacentejidoencrudosindetalleds_10_tftrncod_to) ,
                                           AV75Wcconsultadevolucionesalmacentejidoencrudosindetalleds_12_tftrnnom_sel ,
                                           AV74Wcconsultadevolucionesalmacentejidoencrudosindetalleds_11_tftrnnom ,
                                           AV77Wcconsultadevolucionesalmacentejidoencrudosindetalleds_14_tfdevcrumat_sel ,
                                           AV76Wcconsultadevolucionesalmacentejidoencrudosindetalleds_13_tfdevcrumat ,
                                           AV79Wcconsultadevolucionesalmacentejidoencrudosindetalleds_16_tfdevcruobs_sel ,
                                           AV78Wcconsultadevolucionesalmacentejidoencrudosindetalleds_15_tfdevcruobs ,
                                           Integer.valueOf(AV54CliCod) ,
                                           Integer.valueOf(AV55CliCod_to) ,
                                           AV52DevCruFec ,
                                           AV53DevCruFec_to ,
                                           Integer.valueOf(AV60AlbRecCod) ,
                                           AV58AlbRef ,
                                           AV59AlbREnt ,
                                           Integer.valueOf(A11669DevCruId) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Short.valueOf(A840TrnCod) ,
                                           A841TrnNom ,
                                           A11672DevCruMat ,
                                           A11682DevCruObs ,
                                           A11670DevCruFec ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A45AlbRef ,
                                           A46AlbREnt ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) ,
                                           AV51Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext), "%", "") ;
      lV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext), "%", "") ;
      lV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext), "%", "") ;
      lV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext), "%", "") ;
      lV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext), "%", "") ;
      lV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext), "%", "") ;
      lV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext), "%", "") ;
      lV70Wcconsultadevolucionesalmacentejidoencrudosindetalleds_7_tfclinom = GXutil.padr( GXutil.rtrim( AV70Wcconsultadevolucionesalmacentejidoencrudosindetalleds_7_tfclinom), 30, "%") ;
      lV74Wcconsultadevolucionesalmacentejidoencrudosindetalleds_11_tftrnnom = GXutil.padr( GXutil.rtrim( AV74Wcconsultadevolucionesalmacentejidoencrudosindetalleds_11_tftrnnom), 30, "%") ;
      lV76Wcconsultadevolucionesalmacentejidoencrudosindetalleds_13_tfdevcrumat = GXutil.padr( GXutil.rtrim( AV76Wcconsultadevolucionesalmacentejidoencrudosindetalleds_13_tfdevcrumat), 20, "%") ;
      lV78Wcconsultadevolucionesalmacentejidoencrudosindetalleds_15_tfdevcruobs = GXutil.concat( GXutil.rtrim( AV78Wcconsultadevolucionesalmacentejidoencrudosindetalleds_15_tfdevcruobs), "%", "") ;
      lV58AlbRef = GXutil.padr( GXutil.rtrim( AV58AlbRef), 16, "%") ;
      lV59AlbREnt = GXutil.padr( GXutil.rtrim( AV59AlbREnt), 8, "%") ;
      /* Using cursor P090A3 */
      pr_default.execute(0, new Object[] {AV31NewLine, AV51Emprcod, lV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext, lV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext, lV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext, lV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext, lV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext, lV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext, lV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext, Integer.valueOf(AV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_2_tfdevcruid), Integer.valueOf(AV66Wcconsultadevolucionesalmacentejidoencrudosindetalleds_3_tfdevcruid_to), AV67Wcconsultadevolucionesalmacentejidoencrudosindetalleds_4_tfdevcrufec, Integer.valueOf(AV68Wcconsultadevolucionesalmacentejidoencrudosindetalleds_5_tfclicod), Integer.valueOf(AV69Wcconsultadevolucionesalmacentejidoencrudosindetalleds_6_tfclicod_to), lV70Wcconsultadevolucionesalmacentejidoencrudosindetalleds_7_tfclinom, AV71Wcconsultadevolucionesalmacentejidoencrudosindetalleds_8_tfclinom_sel, Short.valueOf(AV72Wcconsultadevolucionesalmacentejidoencrudosindetalleds_9_tftrncod), Short.valueOf(AV73Wcconsultadevolucionesalmacentejidoencrudosindetalleds_10_tftrncod_to), lV74Wcconsultadevolucionesalmacentejidoencrudosindetalleds_11_tftrnnom, AV75Wcconsultadevolucionesalmacentejidoencrudosindetalleds_12_tftrnnom_sel, lV76Wcconsultadevolucionesalmacentejidoencrudosindetalleds_13_tfdevcrumat, AV77Wcconsultadevolucionesalmacentejidoencrudosindetalleds_14_tfdevcrumat_sel, lV78Wcconsultadevolucionesalmacentejidoencrudosindetalleds_15_tfdevcruobs, AV79Wcconsultadevolucionesalmacentejidoencrudosindetalleds_16_tfdevcruobs_sel, Integer.valueOf(AV54CliCod), Integer.valueOf(AV55CliCod_to), AV52DevCruFec, AV53DevCruFec_to, Integer.valueOf(AV60AlbRecCod), lV58AlbRef, lV59AlbREnt});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A46AlbREnt = P090A3_A46AlbREnt[0] ;
         A45AlbRef = P090A3_A45AlbRef[0] ;
         A44AlbRecCod = P090A3_A44AlbRecCod[0] ;
         A396EmprCod = P090A3_A396EmprCod[0] ;
         A11682DevCruObs = P090A3_A11682DevCruObs[0] ;
         A11672DevCruMat = P090A3_A11672DevCruMat[0] ;
         A841TrnNom = P090A3_A841TrnNom[0] ;
         n841TrnNom = P090A3_n841TrnNom[0] ;
         A840TrnCod = P090A3_A840TrnCod[0] ;
         n840TrnCod = P090A3_n840TrnCod[0] ;
         A279CliNom = P090A3_A279CliNom[0] ;
         A252CliCod = P090A3_A252CliCod[0] ;
         A11670DevCruFec = P090A3_A11670DevCruFec[0] ;
         A11669DevCruId = P090A3_A11669DevCruId[0] ;
         A40000GXC1 = P090A3_A40000GXC1[0] ;
         n40000GXC1 = P090A3_n40000GXC1[0] ;
         A40001GXC2 = P090A3_A40001GXC2[0] ;
         n40001GXC2 = P090A3_n40001GXC2[0] ;
         A40002GXC3 = P090A3_A40002GXC3[0] ;
         A40003GXC4 = P090A3_A40003GXC4[0] ;
         A40004GXC5 = P090A3_A40004GXC5[0] ;
         A40005GXC6 = P090A3_A40005GXC6[0] ;
         A46AlbREnt = P090A3_A46AlbREnt[0] ;
         A45AlbRef = P090A3_A45AlbRef[0] ;
         A840TrnCod = P090A3_A840TrnCod[0] ;
         n840TrnCod = P090A3_n840TrnCod[0] ;
         A252CliCod = P090A3_A252CliCod[0] ;
         A279CliNom = P090A3_A279CliNom[0] ;
         A841TrnNom = P090A3_A841TrnNom[0] ;
         n841TrnNom = P090A3_n841TrnNom[0] ;
         A11682DevCruObs = P090A3_A11682DevCruObs[0] ;
         A11672DevCruMat = P090A3_A11672DevCruMat[0] ;
         A11670DevCruFec = P090A3_A11670DevCruFec[0] ;
         A40000GXC1 = P090A3_A40000GXC1[0] ;
         n40000GXC1 = P090A3_n40000GXC1[0] ;
         A40001GXC2 = P090A3_A40001GXC2[0] ;
         n40001GXC2 = P090A3_n40001GXC2[0] ;
         AV14TextFileLine = "" ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S162 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
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
            AV14TextFileLine += GXutil.str( A11669DevCruId, 8, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += localUtil.dtoc( A11670DevCruFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A252CliCod, 6, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A40002GXC3, GXv_char3) ;
            wcconsultadevolucionesalmacentejidoencrudosindetalleexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A840TrnCod, 4, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A40003GXC4, GXv_char3) ;
            wcconsultadevolucionesalmacentejidoencrudosindetalleexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A40004GXC5, GXv_char3) ;
            wcconsultadevolucionesalmacentejidoencrudosindetalleexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV31NewLine = GXutil.chr( (short)(10)) ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A40005GXC6, GXv_char3) ;
            wcconsultadevolucionesalmacentejidoencrudosindetalleexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV56DevCruUnd = A40000GXC1 ;
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( AV56DevCruUnd, 9, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV57DevCruPzs = A40001GXC2 ;
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( AV57DevCruPzs, 6, 0) ;
         }
         /* Execute user subroutine: 'AFTERWRITELINE' */
         S172 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=WCConsultaDevolucionesAlmacenTejidoencrudosindetalleExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "DevCruId", "", "Devolucion Id", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "DevCruFec", "", "Fecha Devolucion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CliCod", "", "Cliente", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CliNom", "", "Nombre Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "TrnCod", "", "Cod Transp", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "TrnNom", "", "Transportista", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "DevCruMat", "", "Matricula", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "DevCruObs", "", "Observaciones", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&DevCruUnd", "Devolucion", "Unidades", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&DevCruPzs", "Devolucion", "Piezas", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WCConsultaDevolucionesAlmacenTejidoencrudosindetalleColumnsSelector", GXv_char3) ;
      wcconsultadevolucionesalmacentejidoencrudosindetalleexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("WCConsultaDevolucionesAlmacenTejidoencrudosindetalleGridState"), "") == 0 )
      {
         AV33GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCConsultaDevolucionesAlmacenTejidoencrudosindetalleGridState"), null, null);
      }
      else
      {
         AV33GridState.fromxml(AV19Session.getValue("WCConsultaDevolucionesAlmacenTejidoencrudosindetalleGridState"), null, null);
      }
      AV28OrderedBy = AV33GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV33GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV80GXV1 = 1 ;
      while ( AV80GXV1 <= AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV34GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV80GXV1));
         if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV30FilterFullText = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUID") == 0 )
         {
            AV35TFDevCruId = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV36TFDevCruId_To = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUFEC") == 0 )
         {
            AV37TFDevCruFec = localUtil.ctod( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV39TFCliCod = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV40TFCliCod_To = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV41TFCliNom = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV42TFCliNom_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNCOD") == 0 )
         {
            AV43TFTrnCod = (short)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV44TFTrnCod_To = (short)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNNOM") == 0 )
         {
            AV45TFTrnNom = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNNOM_SEL") == 0 )
         {
            AV46TFTrnNom_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUMAT") == 0 )
         {
            AV47TFDevCruMat = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUMAT_SEL") == 0 )
         {
            AV48TFDevCruMat_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUOBS") == 0 )
         {
            AV49TFDevCruObs = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUOBS_SEL") == 0 )
         {
            AV50TFDevCruObs_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV51Emprcod = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&DEVCRUFEC") == 0 )
         {
            AV52DevCruFec = localUtil.ctod( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&DEVCRUFEC_TO") == 0 )
         {
            AV53DevCruFec_to = localUtil.ctod( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD") == 0 )
         {
            AV54CliCod = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD_TO") == 0 )
         {
            AV55CliCod_to = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBREF") == 0 )
         {
            AV58AlbRef = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBRENT") == 0 )
         {
            AV59AlbREnt = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBRECCOD") == 0 )
         {
            AV60AlbRecCod = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV80GXV1 = (int)(AV80GXV1+1) ;
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
      A11670DevCruFec = GXutil.nullDate() ;
      A40002GXC3 = "" ;
      A40003GXC4 = "" ;
      A40004GXC5 = "" ;
      A40005GXC6 = "" ;
      A40000GXC1 = DecimalUtil.ZERO ;
      AV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext = "" ;
      AV30FilterFullText = "" ;
      AV67Wcconsultadevolucionesalmacentejidoencrudosindetalleds_4_tfdevcrufec = GXutil.nullDate() ;
      AV37TFDevCruFec = GXutil.nullDate() ;
      AV70Wcconsultadevolucionesalmacentejidoencrudosindetalleds_7_tfclinom = "" ;
      AV41TFCliNom = "" ;
      AV71Wcconsultadevolucionesalmacentejidoencrudosindetalleds_8_tfclinom_sel = "" ;
      AV42TFCliNom_Sel = "" ;
      AV74Wcconsultadevolucionesalmacentejidoencrudosindetalleds_11_tftrnnom = "" ;
      AV45TFTrnNom = "" ;
      AV75Wcconsultadevolucionesalmacentejidoencrudosindetalleds_12_tftrnnom_sel = "" ;
      AV46TFTrnNom_Sel = "" ;
      AV76Wcconsultadevolucionesalmacentejidoencrudosindetalleds_13_tfdevcrumat = "" ;
      AV47TFDevCruMat = "" ;
      AV77Wcconsultadevolucionesalmacentejidoencrudosindetalleds_14_tfdevcrumat_sel = "" ;
      AV48TFDevCruMat_Sel = "" ;
      AV78Wcconsultadevolucionesalmacentejidoencrudosindetalleds_15_tfdevcruobs = "" ;
      AV49TFDevCruObs = "" ;
      AV79Wcconsultadevolucionesalmacentejidoencrudosindetalleds_16_tfdevcruobs_sel = "" ;
      AV50TFDevCruObs_Sel = "" ;
      scmdbuf = "" ;
      lV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext = "" ;
      lV70Wcconsultadevolucionesalmacentejidoencrudosindetalleds_7_tfclinom = "" ;
      lV74Wcconsultadevolucionesalmacentejidoencrudosindetalleds_11_tftrnnom = "" ;
      lV76Wcconsultadevolucionesalmacentejidoencrudosindetalleds_13_tfdevcrumat = "" ;
      lV78Wcconsultadevolucionesalmacentejidoencrudosindetalleds_15_tfdevcruobs = "" ;
      lV58AlbRef = "" ;
      lV59AlbREnt = "" ;
      AV52DevCruFec = GXutil.nullDate() ;
      AV53DevCruFec_to = GXutil.nullDate() ;
      AV58AlbRef = "" ;
      AV59AlbREnt = "" ;
      A279CliNom = "" ;
      A841TrnNom = "" ;
      A11672DevCruMat = "" ;
      A11682DevCruObs = "" ;
      A45AlbRef = "" ;
      A46AlbREnt = "" ;
      AV51Emprcod = "" ;
      A396EmprCod = "" ;
      AV31NewLine = "" ;
      P090A3_A46AlbREnt = new String[] {""} ;
      P090A3_A45AlbRef = new String[] {""} ;
      P090A3_A44AlbRecCod = new int[1] ;
      P090A3_A396EmprCod = new String[] {""} ;
      P090A3_A11682DevCruObs = new String[] {""} ;
      P090A3_A11672DevCruMat = new String[] {""} ;
      P090A3_A841TrnNom = new String[] {""} ;
      P090A3_n841TrnNom = new boolean[] {false} ;
      P090A3_A840TrnCod = new short[1] ;
      P090A3_n840TrnCod = new boolean[] {false} ;
      P090A3_A279CliNom = new String[] {""} ;
      P090A3_A252CliCod = new int[1] ;
      P090A3_A11670DevCruFec = new java.util.Date[] {GXutil.nullDate()} ;
      P090A3_A11669DevCruId = new int[1] ;
      P090A3_A40000GXC1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P090A3_n40000GXC1 = new boolean[] {false} ;
      P090A3_A40001GXC2 = new int[1] ;
      P090A3_n40001GXC2 = new boolean[] {false} ;
      P090A3_A40002GXC3 = new String[] {""} ;
      P090A3_A40003GXC4 = new String[] {""} ;
      P090A3_A40004GXC5 = new String[] {""} ;
      P090A3_A40005GXC6 = new String[] {""} ;
      AV56DevCruUnd = DecimalUtil.ZERO ;
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
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcconsultadevolucionesalmacentejidoencrudosindetalleexportcsv__default(),
         new Object[] {
             new Object[] {
            P090A3_A46AlbREnt, P090A3_A45AlbRef, P090A3_A44AlbRecCod, P090A3_A396EmprCod, P090A3_A11682DevCruObs, P090A3_A11672DevCruMat, P090A3_A841TrnNom, P090A3_n841TrnNom, P090A3_A840TrnCod, P090A3_n840TrnCod,
            P090A3_A279CliNom, P090A3_A252CliCod, P090A3_A11670DevCruFec, P090A3_A11669DevCruId, P090A3_A40000GXC1, P090A3_n40000GXC1, P090A3_A40001GXC2, P090A3_n40001GXC2, P090A3_A40002GXC3, P090A3_A40003GXC4,
            P090A3_A40004GXC5, P090A3_A40005GXC6
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short A840TrnCod ;
   private short AV72Wcconsultadevolucionesalmacentejidoencrudosindetalleds_9_tftrncod ;
   private short AV43TFTrnCod ;
   private short AV73Wcconsultadevolucionesalmacentejidoencrudosindetalleds_10_tftrncod_to ;
   private short AV44TFTrnCod_To ;
   private short AV28OrderedBy ;
   private short Gx_err ;
   private int AV13Random ;
   private int A11669DevCruId ;
   private int A252CliCod ;
   private int A40001GXC2 ;
   private int AV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_2_tfdevcruid ;
   private int AV35TFDevCruId ;
   private int AV66Wcconsultadevolucionesalmacentejidoencrudosindetalleds_3_tfdevcruid_to ;
   private int AV36TFDevCruId_To ;
   private int AV68Wcconsultadevolucionesalmacentejidoencrudosindetalleds_5_tfclicod ;
   private int AV39TFCliCod ;
   private int AV69Wcconsultadevolucionesalmacentejidoencrudosindetalleds_6_tfclicod_to ;
   private int AV40TFCliCod_To ;
   private int AV54CliCod ;
   private int AV55CliCod_to ;
   private int AV60AlbRecCod ;
   private int A44AlbRecCod ;
   private int AV57DevCruPzs ;
   private int AV80GXV1 ;
   private java.math.BigDecimal A40000GXC1 ;
   private java.math.BigDecimal AV56DevCruUnd ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A40002GXC3 ;
   private String A40003GXC4 ;
   private String A40004GXC5 ;
   private String A40005GXC6 ;
   private String AV70Wcconsultadevolucionesalmacentejidoencrudosindetalleds_7_tfclinom ;
   private String AV41TFCliNom ;
   private String AV71Wcconsultadevolucionesalmacentejidoencrudosindetalleds_8_tfclinom_sel ;
   private String AV42TFCliNom_Sel ;
   private String AV74Wcconsultadevolucionesalmacentejidoencrudosindetalleds_11_tftrnnom ;
   private String AV45TFTrnNom ;
   private String AV75Wcconsultadevolucionesalmacentejidoencrudosindetalleds_12_tftrnnom_sel ;
   private String AV46TFTrnNom_Sel ;
   private String AV76Wcconsultadevolucionesalmacentejidoencrudosindetalleds_13_tfdevcrumat ;
   private String AV47TFDevCruMat ;
   private String AV77Wcconsultadevolucionesalmacentejidoencrudosindetalleds_14_tfdevcrumat_sel ;
   private String AV48TFDevCruMat_Sel ;
   private String scmdbuf ;
   private String lV70Wcconsultadevolucionesalmacentejidoencrudosindetalleds_7_tfclinom ;
   private String lV74Wcconsultadevolucionesalmacentejidoencrudosindetalleds_11_tftrnnom ;
   private String lV76Wcconsultadevolucionesalmacentejidoencrudosindetalleds_13_tfdevcrumat ;
   private String lV58AlbRef ;
   private String lV59AlbREnt ;
   private String AV58AlbRef ;
   private String AV59AlbREnt ;
   private String A279CliNom ;
   private String A841TrnNom ;
   private String A11672DevCruMat ;
   private String A45AlbRef ;
   private String A46AlbREnt ;
   private String AV51Emprcod ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private java.util.Date A11670DevCruFec ;
   private java.util.Date AV67Wcconsultadevolucionesalmacentejidoencrudosindetalleds_4_tfdevcrufec ;
   private java.util.Date AV37TFDevCruFec ;
   private java.util.Date AV52DevCruFec ;
   private java.util.Date AV53DevCruFec_to ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean n841TrnNom ;
   private boolean n840TrnCod ;
   private boolean n40000GXC1 ;
   private boolean n40001GXC2 ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext ;
   private String AV30FilterFullText ;
   private String AV78Wcconsultadevolucionesalmacentejidoencrudosindetalleds_15_tfdevcruobs ;
   private String AV49TFDevCruObs ;
   private String AV79Wcconsultadevolucionesalmacentejidoencrudosindetalleds_16_tfdevcruobs_sel ;
   private String AV50TFDevCruObs_Sel ;
   private String lV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext ;
   private String lV78Wcconsultadevolucionesalmacentejidoencrudosindetalleds_15_tfdevcruobs ;
   private String A11682DevCruObs ;
   private String AV31NewLine ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private String[] P090A3_A46AlbREnt ;
   private String[] P090A3_A45AlbRef ;
   private int[] P090A3_A44AlbRecCod ;
   private String[] P090A3_A396EmprCod ;
   private String[] P090A3_A11682DevCruObs ;
   private String[] P090A3_A11672DevCruMat ;
   private String[] P090A3_A841TrnNom ;
   private boolean[] P090A3_n841TrnNom ;
   private short[] P090A3_A840TrnCod ;
   private boolean[] P090A3_n840TrnCod ;
   private String[] P090A3_A279CliNom ;
   private int[] P090A3_A252CliCod ;
   private java.util.Date[] P090A3_A11670DevCruFec ;
   private int[] P090A3_A11669DevCruId ;
   private java.math.BigDecimal[] P090A3_A40000GXC1 ;
   private boolean[] P090A3_n40000GXC1 ;
   private int[] P090A3_A40001GXC2 ;
   private boolean[] P090A3_n40001GXC2 ;
   private String[] P090A3_A40002GXC3 ;
   private String[] P090A3_A40003GXC4 ;
   private String[] P090A3_A40004GXC5 ;
   private String[] P090A3_A40005GXC6 ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV33GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV34GridStateFilterValue ;
}

final  class wcconsultadevolucionesalmacentejidoencrudosindetalleexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P090A3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext ,
                                          int AV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_2_tfdevcruid ,
                                          int AV66Wcconsultadevolucionesalmacentejidoencrudosindetalleds_3_tfdevcruid_to ,
                                          java.util.Date AV67Wcconsultadevolucionesalmacentejidoencrudosindetalleds_4_tfdevcrufec ,
                                          int AV68Wcconsultadevolucionesalmacentejidoencrudosindetalleds_5_tfclicod ,
                                          int AV69Wcconsultadevolucionesalmacentejidoencrudosindetalleds_6_tfclicod_to ,
                                          String AV71Wcconsultadevolucionesalmacentejidoencrudosindetalleds_8_tfclinom_sel ,
                                          String AV70Wcconsultadevolucionesalmacentejidoencrudosindetalleds_7_tfclinom ,
                                          short AV72Wcconsultadevolucionesalmacentejidoencrudosindetalleds_9_tftrncod ,
                                          short AV73Wcconsultadevolucionesalmacentejidoencrudosindetalleds_10_tftrncod_to ,
                                          String AV75Wcconsultadevolucionesalmacentejidoencrudosindetalleds_12_tftrnnom_sel ,
                                          String AV74Wcconsultadevolucionesalmacentejidoencrudosindetalleds_11_tftrnnom ,
                                          String AV77Wcconsultadevolucionesalmacentejidoencrudosindetalleds_14_tfdevcrumat_sel ,
                                          String AV76Wcconsultadevolucionesalmacentejidoencrudosindetalleds_13_tfdevcrumat ,
                                          String AV79Wcconsultadevolucionesalmacentejidoencrudosindetalleds_16_tfdevcruobs_sel ,
                                          String AV78Wcconsultadevolucionesalmacentejidoencrudosindetalleds_15_tfdevcruobs ,
                                          int AV54CliCod ,
                                          int AV55CliCod_to ,
                                          java.util.Date AV52DevCruFec ,
                                          java.util.Date AV53DevCruFec_to ,
                                          int AV60AlbRecCod ,
                                          String AV58AlbRef ,
                                          String AV59AlbREnt ,
                                          int A11669DevCruId ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          short A840TrnCod ,
                                          String A841TrnNom ,
                                          String A11672DevCruMat ,
                                          String A11682DevCruObs ,
                                          java.util.Date A11670DevCruFec ,
                                          int A44AlbRecCod ,
                                          String A45AlbRef ,
                                          String A46AlbREnt ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc ,
                                          String AV51Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[31];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT DISTINCT NULL AS AlbREnt, NULL AS AlbRef, NULL AS AlbRecCod, NULL AS EmprCod, DevCruObs, DevCruMat, TrnNom, TrnCod, CliNom, CliCod, DevCruFec, DevCruId, GXC1," ;
      scmdbuf += " GXC2, GXC3, GXC4, GXC5, GXC6 FROM ( SELECT T2.AlbREnt, T2.AlbRef, T1.AlbRecCod, T1.EmprCod, T5.DevCruObs, T5.DevCruMat, T4.TrnNom, T2.TrnCod, T3.CliNom, T2.CliCod," ;
      scmdbuf += " T5.DevCruFec, T1.DevCruId, COALESCE( T6.GXC1, 0) AS GXC1, COALESCE( T6.GXC2, 0) AS GXC2, REPLACE(T3.CliNom, ';', ',') AS GXC3, REPLACE(T4.TrnNom, ';', ',') AS GXC4," ;
      scmdbuf += " REPLACE(T5.DevCruMat, ';', ',') AS GXC5, REPLACE(REPLACE(T5.DevCruObs, ';', ','), ?, ' ') AS GXC6 FROM (((((TXPDEVCR1 T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod =" ;
      scmdbuf += " T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T2.CliCod) LEFT JOIN TXPTRANSP T4 ON T4.EmprCod =" ;
      scmdbuf += " T1.EmprCod AND T4.TrnCod = T2.TrnCod) INNER JOIN TXPDEVCRU T5 ON T5.EmprCod = T1.EmprCod AND T5.DevCruId = T1.DevCruId) LEFT JOIN (SELECT SUM(T7.DevCruUnd) AS GXC1," ;
      scmdbuf += " T7.DevCruId, SUM(T7.DevCruPzs) AS GXC2 FROM ((((TXPDEVCR1 T7 INNER JOIN TXPALBREC T8 ON T8.EmprCod = T7.EmprCod AND T8.AlbRecCod = T7.AlbRecCod) LEFT JOIN TXPCLIENT" ;
      scmdbuf += " T9 ON T9.EmprCod = T7.EmprCod AND T9.CliCod = T8.CliCod) LEFT JOIN TXPTRANSP T10 ON T10.EmprCod = T7.EmprCod AND T10.TrnCod = T8.TrnCod) INNER JOIN TXPDEVCRU T11" ;
      scmdbuf += " ON T11.EmprCod = T7.EmprCod AND T11.DevCruId = T7.DevCruId) GROUP BY T7.DevCruId ) T6 ON T6.DevCruId = T1.DevCruId)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.DevCruId,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.TrnCod,'9990'), 2) like '%' || ?) or ( UPPER(T4.TrnNom) like '%' || UPPER(?)) or ( UPPER(T5.DevCruMat) like '%' || UPPER(?)) or ( UPPER(T5.DevCruObs) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
         GXv_int6[3] = (byte)(1) ;
         GXv_int6[4] = (byte)(1) ;
         GXv_int6[5] = (byte)(1) ;
         GXv_int6[6] = (byte)(1) ;
         GXv_int6[7] = (byte)(1) ;
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (0==AV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_2_tfdevcruid) )
      {
         addWhere(sWhereString, "(T1.DevCruId >= ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (0==AV66Wcconsultadevolucionesalmacentejidoencrudosindetalleds_3_tfdevcruid_to) )
      {
         addWhere(sWhereString, "(T1.DevCruId <= ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV67Wcconsultadevolucionesalmacentejidoencrudosindetalleds_4_tfdevcrufec)) )
      {
         addWhere(sWhereString, "(T5.DevCruFec >= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (0==AV68Wcconsultadevolucionesalmacentejidoencrudosindetalleds_5_tfclicod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (0==AV69Wcconsultadevolucionesalmacentejidoencrudosindetalleds_6_tfclicod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Wcconsultadevolucionesalmacentejidoencrudosindetalleds_8_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV70Wcconsultadevolucionesalmacentejidoencrudosindetalleds_7_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Wcconsultadevolucionesalmacentejidoencrudosindetalleds_8_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (0==AV72Wcconsultadevolucionesalmacentejidoencrudosindetalleds_9_tftrncod) )
      {
         addWhere(sWhereString, "(T2.TrnCod >= ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (0==AV73Wcconsultadevolucionesalmacentejidoencrudosindetalleds_10_tftrncod_to) )
      {
         addWhere(sWhereString, "(T2.TrnCod <= ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Wcconsultadevolucionesalmacentejidoencrudosindetalleds_12_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV74Wcconsultadevolucionesalmacentejidoencrudosindetalleds_11_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Wcconsultadevolucionesalmacentejidoencrudosindetalleds_12_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.TrnNom = ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Wcconsultadevolucionesalmacentejidoencrudosindetalleds_14_tfdevcrumat_sel)==0) && ( ! (GXutil.strcmp("", AV76Wcconsultadevolucionesalmacentejidoencrudosindetalleds_13_tfdevcrumat)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.DevCruMat) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Wcconsultadevolucionesalmacentejidoencrudosindetalleds_14_tfdevcrumat_sel)==0) )
      {
         addWhere(sWhereString, "(T5.DevCruMat = ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Wcconsultadevolucionesalmacentejidoencrudosindetalleds_16_tfdevcruobs_sel)==0) && ( ! (GXutil.strcmp("", AV78Wcconsultadevolucionesalmacentejidoencrudosindetalleds_15_tfdevcruobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.DevCruObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Wcconsultadevolucionesalmacentejidoencrudosindetalleds_16_tfdevcruobs_sel)==0) )
      {
         addWhere(sWhereString, "(T5.DevCruObs = ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (0==AV54CliCod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! (0==AV55CliCod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV52DevCruFec)) )
      {
         addWhere(sWhereString, "(T5.DevCruFec >= ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV53DevCruFec_to)) )
      {
         addWhere(sWhereString, "(T5.DevCruFec <= ?)");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( ! (0==AV60AlbRecCod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod = ?)");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58AlbRef)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRef like ?)");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59AlbREnt)==0) )
      {
         addWhere(sWhereString, "(T2.AlbREnt like ?)");
      }
      else
      {
         GXv_int6[30] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T5.DevCruFec" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T5.DevCruFec DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DevCruId" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DevCruId DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.CliCod" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.CliCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.CliNom" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.CliNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.TrnCod" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.TrnCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T4.TrnNom" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.TrnNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T5.DevCruMat" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T5.DevCruMat DESC" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T5.DevCruObs" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T5.DevCruObs DESC" ;
      }
      scmdbuf += ") DistinctT" ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY DevCruFec" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY DevCruFec DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY DevCruId" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY DevCruId DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY CliCod" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CliCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY CliNom" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CliNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY TrnCod" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY TrnCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY TrnNom" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY TrnNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY DevCruMat" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY DevCruMat DESC" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY DevCruObs" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY DevCruObs DESC" ;
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
                  return conditional_P090A3(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (java.util.Date)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).shortValue() , ((Number) dynConstraints[9]).shortValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).intValue() , (java.util.Date)dynConstraints[18] , (java.util.Date)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).intValue() , (String)dynConstraints[25] , ((Number) dynConstraints[26]).shortValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (java.util.Date)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , ((Number) dynConstraints[34]).shortValue() , ((Boolean) dynConstraints[35]).booleanValue() , (String)dynConstraints[36] , (String)dynConstraints[37] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P090A3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 30);
               ((int[]) buf[11])[0] = rslt.getInt(10);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(11);
               ((int[]) buf[13])[0] = rslt.getInt(12);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((int[]) buf[16])[0] = rslt.getInt(14);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(15, 10);
               ((String[]) buf[19])[0] = rslt.getString(16, 10);
               ((String[]) buf[20])[0] = rslt.getString(17, 10);
               ((String[]) buf[21])[0] = rslt.getString(18, 10);
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
                  stmt.setVarchar(sIdx, (String)parms[31], 40);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 3);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[42]);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[47]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[48]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 20);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 20);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 200);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 200);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[57]);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[58]);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 16);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 8);
               }
               return;
      }
   }

}

