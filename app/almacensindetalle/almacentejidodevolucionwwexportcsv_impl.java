package app.almacensindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class almacentejidodevolucionwwexportcsv_impl extends GXWebProcedure
{
   public almacentejidodevolucionwwexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "AlmacenTejidoDevolucionWWExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("AlmacenSinDetalle.AlmacenTejidoDevolucionWWColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("AlmacenSinDetalle.AlmacenTejidoDevolucionWWColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Devolucion Id", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha-Hora", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cod Transp", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Transportista", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Matricula", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "ATDocCodeID", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Status", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Codigo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV66Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext = AV30FilterFullText ;
      AV67Almacensindetalle_almacentejidodevolucionwwds_2_tfdevcruid = AV35TFDevCruId ;
      AV68Almacensindetalle_almacentejidodevolucionwwds_3_tfdevcruid_to = AV36TFDevCruId_To ;
      AV69Almacensindetalle_almacentejidodevolucionwwds_4_tfdevcrufec = AV37TFDevCruFec ;
      AV70Almacensindetalle_almacentejidodevolucionwwds_5_tfdevcrusal = AV39TFDevCruSal ;
      AV71Almacensindetalle_almacentejidodevolucionwwds_6_tfclicod = AV41TFCliCod ;
      AV72Almacensindetalle_almacentejidodevolucionwwds_7_tfclicod_to = AV42TFCliCod_To ;
      AV73Almacensindetalle_almacentejidodevolucionwwds_8_tfclinom = AV43TFCliNom ;
      AV74Almacensindetalle_almacentejidodevolucionwwds_9_tfclinom_sel = AV44TFCliNom_Sel ;
      AV75Almacensindetalle_almacentejidodevolucionwwds_10_tftrncod = AV45TFTrnCod ;
      AV76Almacensindetalle_almacentejidodevolucionwwds_11_tftrncod_to = AV46TFTrnCod_To ;
      AV77Almacensindetalle_almacentejidodevolucionwwds_12_tftrnnom = AV47TFTrnNom ;
      AV78Almacensindetalle_almacentejidodevolucionwwds_13_tftrnnom_sel = AV48TFTrnNom_Sel ;
      AV79Almacensindetalle_almacentejidodevolucionwwds_14_tfdevcrumat = AV49TFDevCruMat ;
      AV80Almacensindetalle_almacentejidodevolucionwwds_15_tfdevcrumat_sel = AV50TFDevCruMat_Sel ;
      AV81Almacensindetalle_almacentejidodevolucionwwds_16_tfdevcruatid = AV51TFDevCruAtId ;
      AV82Almacensindetalle_almacentejidodevolucionwwds_17_tfdevcruatid_sel = AV52TFDevCruAtId_Sel ;
      AV83Almacensindetalle_almacentejidodevolucionwwds_18_tfdevcrustt_sels = AV54TFDevCruStt_Sels ;
      AV84Almacensindetalle_almacentejidodevolucionwwds_19_tfdevcruhash = AV57TFDevCruHash ;
      AV85Almacensindetalle_almacentejidodevolucionwwds_20_tfdevcruhash_sel = AV58TFDevCruHash_Sel ;
      AV86Almacensindetalle_almacentejidodevolucionwwds_21_tfdevcrudesc = AV59TFDevCruDesc ;
      AV87Almacensindetalle_almacentejidodevolucionwwds_22_tfdevcrudesc_sel = AV60TFDevCruDesc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A11678DevCruStt ,
                                           AV83Almacensindetalle_almacentejidodevolucionwwds_18_tfdevcrustt_sels ,
                                           AV66Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext ,
                                           Integer.valueOf(AV67Almacensindetalle_almacentejidodevolucionwwds_2_tfdevcruid) ,
                                           Integer.valueOf(AV68Almacensindetalle_almacentejidodevolucionwwds_3_tfdevcruid_to) ,
                                           AV69Almacensindetalle_almacentejidodevolucionwwds_4_tfdevcrufec ,
                                           AV70Almacensindetalle_almacentejidodevolucionwwds_5_tfdevcrusal ,
                                           Integer.valueOf(AV71Almacensindetalle_almacentejidodevolucionwwds_6_tfclicod) ,
                                           Integer.valueOf(AV72Almacensindetalle_almacentejidodevolucionwwds_7_tfclicod_to) ,
                                           AV74Almacensindetalle_almacentejidodevolucionwwds_9_tfclinom_sel ,
                                           AV73Almacensindetalle_almacentejidodevolucionwwds_8_tfclinom ,
                                           Short.valueOf(AV75Almacensindetalle_almacentejidodevolucionwwds_10_tftrncod) ,
                                           Short.valueOf(AV76Almacensindetalle_almacentejidodevolucionwwds_11_tftrncod_to) ,
                                           AV78Almacensindetalle_almacentejidodevolucionwwds_13_tftrnnom_sel ,
                                           AV77Almacensindetalle_almacentejidodevolucionwwds_12_tftrnnom ,
                                           AV80Almacensindetalle_almacentejidodevolucionwwds_15_tfdevcrumat_sel ,
                                           AV79Almacensindetalle_almacentejidodevolucionwwds_14_tfdevcrumat ,
                                           AV82Almacensindetalle_almacentejidodevolucionwwds_17_tfdevcruatid_sel ,
                                           AV81Almacensindetalle_almacentejidodevolucionwwds_16_tfdevcruatid ,
                                           Integer.valueOf(AV83Almacensindetalle_almacentejidodevolucionwwds_18_tfdevcrustt_sels.size()) ,
                                           AV85Almacensindetalle_almacentejidodevolucionwwds_20_tfdevcruhash_sel ,
                                           AV84Almacensindetalle_almacentejidodevolucionwwds_19_tfdevcruhash ,
                                           AV87Almacensindetalle_almacentejidodevolucionwwds_22_tfdevcrudesc_sel ,
                                           AV86Almacensindetalle_almacentejidodevolucionwwds_21_tfdevcrudesc ,
                                           Integer.valueOf(A11669DevCruId) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Short.valueOf(A840TrnCod) ,
                                           A841TrnNom ,
                                           A11672DevCruMat ,
                                           A11680DevCruAtId ,
                                           A11674DevCruHash ,
                                           A11675DevCruDesc ,
                                           A11670DevCruFec ,
                                           A11673DevCruSal ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV66Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext), "%", "") ;
      lV66Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext), "%", "") ;
      lV66Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext), "%", "") ;
      lV66Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext), "%", "") ;
      lV66Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext), "%", "") ;
      lV66Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext), "%", "") ;
      lV66Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext), "%", "") ;
      lV66Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext), "%", "") ;
      lV66Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext), "%", "") ;
      lV66Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext), "%", "") ;
      lV73Almacensindetalle_almacentejidodevolucionwwds_8_tfclinom = GXutil.padr( GXutil.rtrim( AV73Almacensindetalle_almacentejidodevolucionwwds_8_tfclinom), 30, "%") ;
      lV77Almacensindetalle_almacentejidodevolucionwwds_12_tftrnnom = GXutil.padr( GXutil.rtrim( AV77Almacensindetalle_almacentejidodevolucionwwds_12_tftrnnom), 30, "%") ;
      lV79Almacensindetalle_almacentejidodevolucionwwds_14_tfdevcrumat = GXutil.padr( GXutil.rtrim( AV79Almacensindetalle_almacentejidodevolucionwwds_14_tfdevcrumat), 20, "%") ;
      lV81Almacensindetalle_almacentejidodevolucionwwds_16_tfdevcruatid = GXutil.padr( GXutil.rtrim( AV81Almacensindetalle_almacentejidodevolucionwwds_16_tfdevcruatid), 20, "%") ;
      lV84Almacensindetalle_almacentejidodevolucionwwds_19_tfdevcruhash = GXutil.padr( GXutil.rtrim( AV84Almacensindetalle_almacentejidodevolucionwwds_19_tfdevcruhash), 200, "%") ;
      lV86Almacensindetalle_almacentejidodevolucionwwds_21_tfdevcrudesc = GXutil.padr( GXutil.rtrim( AV86Almacensindetalle_almacentejidodevolucionwwds_21_tfdevcrudesc), 300, "%") ;
      /* Using cursor P09JE2 */
      pr_default.execute(0, new Object[] {lV66Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext, lV66Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext, lV66Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext, lV66Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext, lV66Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext, lV66Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext, lV66Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext, lV66Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext, lV66Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext, lV66Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext, Integer.valueOf(AV67Almacensindetalle_almacentejidodevolucionwwds_2_tfdevcruid), Integer.valueOf(AV68Almacensindetalle_almacentejidodevolucionwwds_3_tfdevcruid_to), AV69Almacensindetalle_almacentejidodevolucionwwds_4_tfdevcrufec, AV70Almacensindetalle_almacentejidodevolucionwwds_5_tfdevcrusal, Integer.valueOf(AV71Almacensindetalle_almacentejidodevolucionwwds_6_tfclicod), Integer.valueOf(AV72Almacensindetalle_almacentejidodevolucionwwds_7_tfclicod_to), lV73Almacensindetalle_almacentejidodevolucionwwds_8_tfclinom, AV74Almacensindetalle_almacentejidodevolucionwwds_9_tfclinom_sel, Short.valueOf(AV75Almacensindetalle_almacentejidodevolucionwwds_10_tftrncod), Short.valueOf(AV76Almacensindetalle_almacentejidodevolucionwwds_11_tftrncod_to), lV77Almacensindetalle_almacentejidodevolucionwwds_12_tftrnnom, AV78Almacensindetalle_almacentejidodevolucionwwds_13_tftrnnom_sel, lV79Almacensindetalle_almacentejidodevolucionwwds_14_tfdevcrumat, AV80Almacensindetalle_almacentejidodevolucionwwds_15_tfdevcrumat_sel, lV81Almacensindetalle_almacentejidodevolucionwwds_16_tfdevcruatid, AV82Almacensindetalle_almacentejidodevolucionwwds_17_tfdevcruatid_sel, lV84Almacensindetalle_almacentejidodevolucionwwds_19_tfdevcruhash, AV85Almacensindetalle_almacentejidodevolucionwwds_20_tfdevcruhash_sel, lV86Almacensindetalle_almacentejidodevolucionwwds_21_tfdevcrudesc, AV87Almacensindetalle_almacentejidodevolucionwwds_22_tfdevcrudesc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P09JE2_A396EmprCod[0] ;
         A11675DevCruDesc = P09JE2_A11675DevCruDesc[0] ;
         A11674DevCruHash = P09JE2_A11674DevCruHash[0] ;
         A11678DevCruStt = P09JE2_A11678DevCruStt[0] ;
         A11680DevCruAtId = P09JE2_A11680DevCruAtId[0] ;
         A11672DevCruMat = P09JE2_A11672DevCruMat[0] ;
         A841TrnNom = P09JE2_A841TrnNom[0] ;
         n841TrnNom = P09JE2_n841TrnNom[0] ;
         A840TrnCod = P09JE2_A840TrnCod[0] ;
         n840TrnCod = P09JE2_n840TrnCod[0] ;
         A279CliNom = P09JE2_A279CliNom[0] ;
         A252CliCod = P09JE2_A252CliCod[0] ;
         A11673DevCruSal = P09JE2_A11673DevCruSal[0] ;
         A11670DevCruFec = P09JE2_A11670DevCruFec[0] ;
         A11669DevCruId = P09JE2_A11669DevCruId[0] ;
         A841TrnNom = P09JE2_A841TrnNom[0] ;
         n841TrnNom = P09JE2_n841TrnNom[0] ;
         A279CliNom = P09JE2_A279CliNom[0] ;
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
            AV14TextFileLine += localUtil.ttoc( A11673DevCruSal, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A252CliCod, 6, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A279CliNom, ";", ","), GXv_char3) ;
            almacentejidodevolucionwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A840TrnCod, 4, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A841TrnNom, ";", ","), GXv_char3) ;
            almacentejidodevolucionwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A11672DevCruMat, ";", ","), GXv_char3) ;
            almacentejidodevolucionwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A11680DevCruAtId, ";", ","), GXv_char3) ;
            almacentejidodevolucionwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            if ( GXutil.strcmp(GXutil.trim( A11678DevCruStt), "") == 0 )
            {
               AV14TextFileLine += httpContext.getMessage( "Activo", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( A11678DevCruStt), "A") == 0 )
            {
               AV14TextFileLine += httpContext.getMessage( "Anulado", "") ;
            }
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV31NewLine = GXutil.chr( (short)(10)) ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( GXutil.strReplace( A11674DevCruHash, ";", ","), AV31NewLine, " "), GXv_char3) ;
            almacentejidodevolucionwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV31NewLine = GXutil.chr( (short)(10)) ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( GXutil.strReplace( A11675DevCruDesc, ";", ","), AV31NewLine, " "), GXv_char3) ;
            almacentejidodevolucionwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=AlmacenTejidoDevolucionWWExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "DevCruFec", "", "Fecha", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "DevCruSal", "Salida", "Fecha-Hora", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CliCod", "", "Cliente", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CliNom", "", "Cliente", true, "") ;
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "DevCruAtId", "", "ATDocCodeID", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "DevCruStt", "", "Status", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "DevCruHash", "Hash", "Codigo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "DevCruDesc", "Hash", "Descripcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "AlmacenSinDetalle.AlmacenTejidoDevolucionWWColumnsSelector", GXv_char3) ;
      almacentejidodevolucionwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("AlmacenSinDetalle.AlmacenTejidoDevolucionWWGridState"), "") == 0 )
      {
         AV33GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "AlmacenSinDetalle.AlmacenTejidoDevolucionWWGridState"), null, null);
      }
      else
      {
         AV33GridState.fromxml(AV19Session.getValue("AlmacenSinDetalle.AlmacenTejidoDevolucionWWGridState"), null, null);
      }
      AV28OrderedBy = AV33GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV33GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV88GXV1 = 1 ;
      while ( AV88GXV1 <= AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV34GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV88GXV1));
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
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUSAL") == 0 )
         {
            AV39TFDevCruSal = localUtil.ctot( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV41TFCliCod = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV42TFCliCod_To = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV43TFCliNom = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV44TFCliNom_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNCOD") == 0 )
         {
            AV45TFTrnCod = (short)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV46TFTrnCod_To = (short)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNNOM") == 0 )
         {
            AV47TFTrnNom = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNNOM_SEL") == 0 )
         {
            AV48TFTrnNom_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUMAT") == 0 )
         {
            AV49TFDevCruMat = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUMAT_SEL") == 0 )
         {
            AV50TFDevCruMat_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUATID") == 0 )
         {
            AV51TFDevCruAtId = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUATID_SEL") == 0 )
         {
            AV52TFDevCruAtId_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUSTT_SEL") == 0 )
         {
            AV53TFDevCruStt_SelsJson = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV54TFDevCruStt_Sels.fromJSonString(AV53TFDevCruStt_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUHASH") == 0 )
         {
            AV57TFDevCruHash = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUHASH_SEL") == 0 )
         {
            AV58TFDevCruHash_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUDESC") == 0 )
         {
            AV59TFDevCruDesc = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUDESC_SEL") == 0 )
         {
            AV60TFDevCruDesc_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV88GXV1 = (int)(AV88GXV1+1) ;
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
      A11673DevCruSal = GXutil.resetTime( GXutil.nullDate() );
      A279CliNom = "" ;
      A841TrnNom = "" ;
      A11672DevCruMat = "" ;
      A11680DevCruAtId = "" ;
      A11678DevCruStt = "" ;
      A11674DevCruHash = "" ;
      A11675DevCruDesc = "" ;
      AV66Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext = "" ;
      AV30FilterFullText = "" ;
      AV69Almacensindetalle_almacentejidodevolucionwwds_4_tfdevcrufec = GXutil.nullDate() ;
      AV37TFDevCruFec = GXutil.nullDate() ;
      AV70Almacensindetalle_almacentejidodevolucionwwds_5_tfdevcrusal = GXutil.resetTime( GXutil.nullDate() );
      AV39TFDevCruSal = GXutil.resetTime( GXutil.nullDate() );
      AV73Almacensindetalle_almacentejidodevolucionwwds_8_tfclinom = "" ;
      AV43TFCliNom = "" ;
      AV74Almacensindetalle_almacentejidodevolucionwwds_9_tfclinom_sel = "" ;
      AV44TFCliNom_Sel = "" ;
      AV77Almacensindetalle_almacentejidodevolucionwwds_12_tftrnnom = "" ;
      AV47TFTrnNom = "" ;
      AV78Almacensindetalle_almacentejidodevolucionwwds_13_tftrnnom_sel = "" ;
      AV48TFTrnNom_Sel = "" ;
      AV79Almacensindetalle_almacentejidodevolucionwwds_14_tfdevcrumat = "" ;
      AV49TFDevCruMat = "" ;
      AV80Almacensindetalle_almacentejidodevolucionwwds_15_tfdevcrumat_sel = "" ;
      AV50TFDevCruMat_Sel = "" ;
      AV81Almacensindetalle_almacentejidodevolucionwwds_16_tfdevcruatid = "" ;
      AV51TFDevCruAtId = "" ;
      AV82Almacensindetalle_almacentejidodevolucionwwds_17_tfdevcruatid_sel = "" ;
      AV52TFDevCruAtId_Sel = "" ;
      AV83Almacensindetalle_almacentejidodevolucionwwds_18_tfdevcrustt_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV54TFDevCruStt_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV84Almacensindetalle_almacentejidodevolucionwwds_19_tfdevcruhash = "" ;
      AV57TFDevCruHash = "" ;
      AV85Almacensindetalle_almacentejidodevolucionwwds_20_tfdevcruhash_sel = "" ;
      AV58TFDevCruHash_Sel = "" ;
      AV86Almacensindetalle_almacentejidodevolucionwwds_21_tfdevcrudesc = "" ;
      AV59TFDevCruDesc = "" ;
      AV87Almacensindetalle_almacentejidodevolucionwwds_22_tfdevcrudesc_sel = "" ;
      AV60TFDevCruDesc_Sel = "" ;
      scmdbuf = "" ;
      lV66Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext = "" ;
      lV73Almacensindetalle_almacentejidodevolucionwwds_8_tfclinom = "" ;
      lV77Almacensindetalle_almacentejidodevolucionwwds_12_tftrnnom = "" ;
      lV79Almacensindetalle_almacentejidodevolucionwwds_14_tfdevcrumat = "" ;
      lV81Almacensindetalle_almacentejidodevolucionwwds_16_tfdevcruatid = "" ;
      lV84Almacensindetalle_almacentejidodevolucionwwds_19_tfdevcruhash = "" ;
      lV86Almacensindetalle_almacentejidodevolucionwwds_21_tfdevcrudesc = "" ;
      P09JE2_A396EmprCod = new String[] {""} ;
      P09JE2_A11675DevCruDesc = new String[] {""} ;
      P09JE2_A11674DevCruHash = new String[] {""} ;
      P09JE2_A11678DevCruStt = new String[] {""} ;
      P09JE2_A11680DevCruAtId = new String[] {""} ;
      P09JE2_A11672DevCruMat = new String[] {""} ;
      P09JE2_A841TrnNom = new String[] {""} ;
      P09JE2_n841TrnNom = new boolean[] {false} ;
      P09JE2_A840TrnCod = new short[1] ;
      P09JE2_n840TrnCod = new boolean[] {false} ;
      P09JE2_A279CliNom = new String[] {""} ;
      P09JE2_A252CliCod = new int[1] ;
      P09JE2_A11673DevCruSal = new java.util.Date[] {GXutil.nullDate()} ;
      P09JE2_A11670DevCruFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09JE2_A11669DevCruId = new int[1] ;
      A396EmprCod = "" ;
      AV31NewLine = "" ;
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
      AV53TFDevCruStt_SelsJson = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.almacensindetalle.almacentejidodevolucionwwexportcsv__default(),
         new Object[] {
             new Object[] {
            P09JE2_A396EmprCod, P09JE2_A11675DevCruDesc, P09JE2_A11674DevCruHash, P09JE2_A11678DevCruStt, P09JE2_A11680DevCruAtId, P09JE2_A11672DevCruMat, P09JE2_A841TrnNom, P09JE2_n841TrnNom, P09JE2_A840TrnCod, P09JE2_n840TrnCod,
            P09JE2_A279CliNom, P09JE2_A252CliCod, P09JE2_A11673DevCruSal, P09JE2_A11670DevCruFec, P09JE2_A11669DevCruId
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short A840TrnCod ;
   private short AV75Almacensindetalle_almacentejidodevolucionwwds_10_tftrncod ;
   private short AV45TFTrnCod ;
   private short AV76Almacensindetalle_almacentejidodevolucionwwds_11_tftrncod_to ;
   private short AV46TFTrnCod_To ;
   private short AV28OrderedBy ;
   private short Gx_err ;
   private int AV13Random ;
   private int A11669DevCruId ;
   private int A252CliCod ;
   private int AV67Almacensindetalle_almacentejidodevolucionwwds_2_tfdevcruid ;
   private int AV35TFDevCruId ;
   private int AV68Almacensindetalle_almacentejidodevolucionwwds_3_tfdevcruid_to ;
   private int AV36TFDevCruId_To ;
   private int AV71Almacensindetalle_almacentejidodevolucionwwds_6_tfclicod ;
   private int AV41TFCliCod ;
   private int AV72Almacensindetalle_almacentejidodevolucionwwds_7_tfclicod_to ;
   private int AV42TFCliCod_To ;
   private int AV83Almacensindetalle_almacentejidodevolucionwwds_18_tfdevcrustt_sels_size ;
   private int AV88GXV1 ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A279CliNom ;
   private String A841TrnNom ;
   private String A11672DevCruMat ;
   private String A11680DevCruAtId ;
   private String A11678DevCruStt ;
   private String A11674DevCruHash ;
   private String A11675DevCruDesc ;
   private String AV73Almacensindetalle_almacentejidodevolucionwwds_8_tfclinom ;
   private String AV43TFCliNom ;
   private String AV74Almacensindetalle_almacentejidodevolucionwwds_9_tfclinom_sel ;
   private String AV44TFCliNom_Sel ;
   private String AV77Almacensindetalle_almacentejidodevolucionwwds_12_tftrnnom ;
   private String AV47TFTrnNom ;
   private String AV78Almacensindetalle_almacentejidodevolucionwwds_13_tftrnnom_sel ;
   private String AV48TFTrnNom_Sel ;
   private String AV79Almacensindetalle_almacentejidodevolucionwwds_14_tfdevcrumat ;
   private String AV49TFDevCruMat ;
   private String AV80Almacensindetalle_almacentejidodevolucionwwds_15_tfdevcrumat_sel ;
   private String AV50TFDevCruMat_Sel ;
   private String AV81Almacensindetalle_almacentejidodevolucionwwds_16_tfdevcruatid ;
   private String AV51TFDevCruAtId ;
   private String AV82Almacensindetalle_almacentejidodevolucionwwds_17_tfdevcruatid_sel ;
   private String AV52TFDevCruAtId_Sel ;
   private String AV84Almacensindetalle_almacentejidodevolucionwwds_19_tfdevcruhash ;
   private String AV57TFDevCruHash ;
   private String AV85Almacensindetalle_almacentejidodevolucionwwds_20_tfdevcruhash_sel ;
   private String AV58TFDevCruHash_Sel ;
   private String AV86Almacensindetalle_almacentejidodevolucionwwds_21_tfdevcrudesc ;
   private String AV59TFDevCruDesc ;
   private String AV87Almacensindetalle_almacentejidodevolucionwwds_22_tfdevcrudesc_sel ;
   private String AV60TFDevCruDesc_Sel ;
   private String scmdbuf ;
   private String lV73Almacensindetalle_almacentejidodevolucionwwds_8_tfclinom ;
   private String lV77Almacensindetalle_almacentejidodevolucionwwds_12_tftrnnom ;
   private String lV79Almacensindetalle_almacentejidodevolucionwwds_14_tfdevcrumat ;
   private String lV81Almacensindetalle_almacentejidodevolucionwwds_16_tfdevcruatid ;
   private String lV84Almacensindetalle_almacentejidodevolucionwwds_19_tfdevcruhash ;
   private String lV86Almacensindetalle_almacentejidodevolucionwwds_21_tfdevcrudesc ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private java.util.Date A11673DevCruSal ;
   private java.util.Date AV70Almacensindetalle_almacentejidodevolucionwwds_5_tfdevcrusal ;
   private java.util.Date AV39TFDevCruSal ;
   private java.util.Date A11670DevCruFec ;
   private java.util.Date AV69Almacensindetalle_almacentejidodevolucionwwds_4_tfdevcrufec ;
   private java.util.Date AV37TFDevCruFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean n841TrnNom ;
   private boolean n840TrnCod ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV53TFDevCruStt_SelsJson ;
   private String AV11Filename ;
   private String AV66Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext ;
   private String AV30FilterFullText ;
   private String lV66Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext ;
   private String AV31NewLine ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private String[] P09JE2_A396EmprCod ;
   private String[] P09JE2_A11675DevCruDesc ;
   private String[] P09JE2_A11674DevCruHash ;
   private String[] P09JE2_A11678DevCruStt ;
   private String[] P09JE2_A11680DevCruAtId ;
   private String[] P09JE2_A11672DevCruMat ;
   private String[] P09JE2_A841TrnNom ;
   private boolean[] P09JE2_n841TrnNom ;
   private short[] P09JE2_A840TrnCod ;
   private boolean[] P09JE2_n840TrnCod ;
   private String[] P09JE2_A279CliNom ;
   private int[] P09JE2_A252CliCod ;
   private java.util.Date[] P09JE2_A11673DevCruSal ;
   private java.util.Date[] P09JE2_A11670DevCruFec ;
   private int[] P09JE2_A11669DevCruId ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private GXSimpleCollection<String> AV83Almacensindetalle_almacentejidodevolucionwwds_18_tfdevcrustt_sels ;
   private GXSimpleCollection<String> AV54TFDevCruStt_Sels ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV33GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV34GridStateFilterValue ;
}

final  class almacentejidodevolucionwwexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09JE2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A11678DevCruStt ,
                                          GXSimpleCollection<String> AV83Almacensindetalle_almacentejidodevolucionwwds_18_tfdevcrustt_sels ,
                                          String AV66Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext ,
                                          int AV67Almacensindetalle_almacentejidodevolucionwwds_2_tfdevcruid ,
                                          int AV68Almacensindetalle_almacentejidodevolucionwwds_3_tfdevcruid_to ,
                                          java.util.Date AV69Almacensindetalle_almacentejidodevolucionwwds_4_tfdevcrufec ,
                                          java.util.Date AV70Almacensindetalle_almacentejidodevolucionwwds_5_tfdevcrusal ,
                                          int AV71Almacensindetalle_almacentejidodevolucionwwds_6_tfclicod ,
                                          int AV72Almacensindetalle_almacentejidodevolucionwwds_7_tfclicod_to ,
                                          String AV74Almacensindetalle_almacentejidodevolucionwwds_9_tfclinom_sel ,
                                          String AV73Almacensindetalle_almacentejidodevolucionwwds_8_tfclinom ,
                                          short AV75Almacensindetalle_almacentejidodevolucionwwds_10_tftrncod ,
                                          short AV76Almacensindetalle_almacentejidodevolucionwwds_11_tftrncod_to ,
                                          String AV78Almacensindetalle_almacentejidodevolucionwwds_13_tftrnnom_sel ,
                                          String AV77Almacensindetalle_almacentejidodevolucionwwds_12_tftrnnom ,
                                          String AV80Almacensindetalle_almacentejidodevolucionwwds_15_tfdevcrumat_sel ,
                                          String AV79Almacensindetalle_almacentejidodevolucionwwds_14_tfdevcrumat ,
                                          String AV82Almacensindetalle_almacentejidodevolucionwwds_17_tfdevcruatid_sel ,
                                          String AV81Almacensindetalle_almacentejidodevolucionwwds_16_tfdevcruatid ,
                                          int AV83Almacensindetalle_almacentejidodevolucionwwds_18_tfdevcrustt_sels_size ,
                                          String AV85Almacensindetalle_almacentejidodevolucionwwds_20_tfdevcruhash_sel ,
                                          String AV84Almacensindetalle_almacentejidodevolucionwwds_19_tfdevcruhash ,
                                          String AV87Almacensindetalle_almacentejidodevolucionwwds_22_tfdevcrudesc_sel ,
                                          String AV86Almacensindetalle_almacentejidodevolucionwwds_21_tfdevcrudesc ,
                                          int A11669DevCruId ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          short A840TrnCod ,
                                          String A841TrnNom ,
                                          String A11672DevCruMat ,
                                          String A11680DevCruAtId ,
                                          String A11674DevCruHash ,
                                          String A11675DevCruDesc ,
                                          java.util.Date A11670DevCruFec ,
                                          java.util.Date A11673DevCruSal ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[30];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.DevCruDesc, T1.DevCruHash, T1.DevCruStt, T1.DevCruAtId, T1.DevCruMat, T2.TrnNom, T1.TrnCod, T3.CliNom, T1.CliCod, T1.DevCruSal, T1.DevCruFec," ;
      scmdbuf += " T1.DevCruId FROM ((TXPDEVCRU T1 LEFT JOIN TXPTRANSP T2 ON T2.EmprCod = T1.EmprCod AND T2.TrnCod = T1.TrnCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.CliCod = T1.CliCod)" ;
      if ( ! (GXutil.strcmp("", AV66Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.DevCruId,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.TrnCod,'9990'), 2) like '%' || ?) or ( UPPER(T2.TrnNom) like '%' || UPPER(?)) or ( UPPER(T1.DevCruMat) like '%' || UPPER(?)) or ( UPPER(T1.DevCruAtId) like '%' || UPPER(?)) or ( UPPER(T1.DevCruStt) like '%' || UPPER(?)) or ( UPPER(T1.DevCruHash) like '%' || UPPER(?)) or ( UPPER(T1.DevCruDesc) like '%' || UPPER(?)))");
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
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (0==AV67Almacensindetalle_almacentejidodevolucionwwds_2_tfdevcruid) )
      {
         addWhere(sWhereString, "(T1.DevCruId >= ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (0==AV68Almacensindetalle_almacentejidodevolucionwwds_3_tfdevcruid_to) )
      {
         addWhere(sWhereString, "(T1.DevCruId <= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV69Almacensindetalle_almacentejidodevolucionwwds_4_tfdevcrufec)) )
      {
         addWhere(sWhereString, "(T1.DevCruFec >= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV70Almacensindetalle_almacentejidodevolucionwwds_5_tfdevcrusal) )
      {
         addWhere(sWhereString, "(T1.DevCruSal >= ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (0==AV71Almacensindetalle_almacentejidodevolucionwwds_6_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (0==AV72Almacensindetalle_almacentejidodevolucionwwds_7_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Almacensindetalle_almacentejidodevolucionwwds_9_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV73Almacensindetalle_almacentejidodevolucionwwds_8_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Almacensindetalle_almacentejidodevolucionwwds_9_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (0==AV75Almacensindetalle_almacentejidodevolucionwwds_10_tftrncod) )
      {
         addWhere(sWhereString, "(T1.TrnCod >= ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (0==AV76Almacensindetalle_almacentejidodevolucionwwds_11_tftrncod_to) )
      {
         addWhere(sWhereString, "(T1.TrnCod <= ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78Almacensindetalle_almacentejidodevolucionwwds_13_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV77Almacensindetalle_almacentejidodevolucionwwds_12_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Almacensindetalle_almacentejidodevolucionwwds_13_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TrnNom = ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Almacensindetalle_almacentejidodevolucionwwds_15_tfdevcrumat_sel)==0) && ( ! (GXutil.strcmp("", AV79Almacensindetalle_almacentejidodevolucionwwds_14_tfdevcrumat)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruMat) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Almacensindetalle_almacentejidodevolucionwwds_15_tfdevcrumat_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruMat = ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Almacensindetalle_almacentejidodevolucionwwds_17_tfdevcruatid_sel)==0) && ( ! (GXutil.strcmp("", AV81Almacensindetalle_almacentejidodevolucionwwds_16_tfdevcruatid)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruAtId) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Almacensindetalle_almacentejidodevolucionwwds_17_tfdevcruatid_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruAtId = ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( AV83Almacensindetalle_almacentejidodevolucionwwds_18_tfdevcrustt_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV83Almacensindetalle_almacentejidodevolucionwwds_18_tfdevcrustt_sels, "T1.DevCruStt IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV85Almacensindetalle_almacentejidodevolucionwwds_20_tfdevcruhash_sel)==0) && ( ! (GXutil.strcmp("", AV84Almacensindetalle_almacentejidodevolucionwwds_19_tfdevcruhash)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruHash) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Almacensindetalle_almacentejidodevolucionwwds_20_tfdevcruhash_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruHash = ?)");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Almacensindetalle_almacentejidodevolucionwwds_22_tfdevcrudesc_sel)==0) && ( ! (GXutil.strcmp("", AV86Almacensindetalle_almacentejidodevolucionwwds_21_tfdevcrudesc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruDesc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Almacensindetalle_almacentejidodevolucionwwds_22_tfdevcrudesc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruDesc = ?)");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DevCruFec" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DevCruFec DESC" ;
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
         scmdbuf += " ORDER BY T1.DevCruSal" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DevCruSal DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.CliNom" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.CliNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.TrnCod" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.TrnCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.TrnNom" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.TrnNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DevCruMat" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DevCruMat DESC" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DevCruAtId" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DevCruAtId DESC" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DevCruStt" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DevCruStt DESC" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DevCruHash" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DevCruHash DESC" ;
      }
      else if ( ( AV28OrderedBy == 12 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DevCruDesc" ;
      }
      else if ( ( AV28OrderedBy == 12 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DevCruDesc DESC" ;
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
                  return conditional_P09JE2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (java.util.Date)dynConstraints[5] , (java.util.Date)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).intValue() , (String)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (java.util.Date)dynConstraints[33] , (java.util.Date)dynConstraints[34] , ((Number) dynConstraints[35]).shortValue() , ((Boolean) dynConstraints[36]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09JE2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 300);
               ((String[]) buf[2])[0] = rslt.getString(3, 200);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 20);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 30);
               ((int[]) buf[11])[0] = rslt.getInt(10);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(11);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(12);
               ((int[]) buf[14])[0] = rslt.getInt(13);
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
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[42]);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[43], false);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[48]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[49]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 20);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 20);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 20);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 20);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 200);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 200);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 300);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 300);
               }
               return;
      }
   }

}

