package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tmrepuewwexportcsv_impl extends GXWebProcedure
{
   public tmrepuewwexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "TMRepueWWExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("MantenimientoMaquina.TMRepueWWColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("MantenimientoMaquina.TMRepueWWColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre Repuesto", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cód", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Externo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Precio", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Stock Actual", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Stock Reservado", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Stock Mínimo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Stock Crítico", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Código Proveedor", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Activo S/N", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV70Mantenimientomaquina_tmrepuewwds_1_filterfulltext = AV30FilterFullText ;
      AV71Mantenimientomaquina_tmrepuewwds_2_tfmrnom = AV36TFMRNom ;
      AV72Mantenimientomaquina_tmrepuewwds_3_tfmrnom_sel = AV37TFMRNom_Sel ;
      AV73Mantenimientomaquina_tmrepuewwds_4_tfmrcod = AV34TFMRCod ;
      AV74Mantenimientomaquina_tmrepuewwds_5_tfmrcod_to = AV35TFMRCod_To ;
      AV75Mantenimientomaquina_tmrepuewwds_6_tfmrcodext = AV38TFMRCodExt ;
      AV76Mantenimientomaquina_tmrepuewwds_7_tfmrcodext_sel = AV39TFMRCodExt_Sel ;
      AV77Mantenimientomaquina_tmrepuewwds_8_tfmrstkpre = AV50TFMRStkPre ;
      AV78Mantenimientomaquina_tmrepuewwds_9_tfmrstkpre_to = AV51TFMRStkPre_To ;
      AV79Mantenimientomaquina_tmrepuewwds_10_tfmrstkact = AV42TFMRStkAct ;
      AV80Mantenimientomaquina_tmrepuewwds_11_tfmrstkact_to = AV43TFMRStkAct_To ;
      AV81Mantenimientomaquina_tmrepuewwds_12_tfmrstkres = AV44TFMRStkRes ;
      AV82Mantenimientomaquina_tmrepuewwds_13_tfmrstkres_to = AV45TFMRStkRes_To ;
      AV83Mantenimientomaquina_tmrepuewwds_14_tfmrstkmin = AV46TFMRStkMin ;
      AV84Mantenimientomaquina_tmrepuewwds_15_tfmrstkmin_to = AV47TFMRStkMin_To ;
      AV85Mantenimientomaquina_tmrepuewwds_16_tfmrstkcri = AV48TFMRStkCri ;
      AV86Mantenimientomaquina_tmrepuewwds_17_tfmrstkcri_to = AV49TFMRStkCri_To ;
      AV87Mantenimientomaquina_tmrepuewwds_18_tfmrcodprv = AV40TFMRCodPrv ;
      AV88Mantenimientomaquina_tmrepuewwds_19_tfmrcodprv_sel = AV41TFMRCodPrv_Sel ;
      AV89Mantenimientomaquina_tmrepuewwds_20_tfmractivo_sel = AV57TFMRActivo_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV70Mantenimientomaquina_tmrepuewwds_1_filterfulltext ,
                                           AV72Mantenimientomaquina_tmrepuewwds_3_tfmrnom_sel ,
                                           AV71Mantenimientomaquina_tmrepuewwds_2_tfmrnom ,
                                           Integer.valueOf(AV73Mantenimientomaquina_tmrepuewwds_4_tfmrcod) ,
                                           Integer.valueOf(AV74Mantenimientomaquina_tmrepuewwds_5_tfmrcod_to) ,
                                           AV76Mantenimientomaquina_tmrepuewwds_7_tfmrcodext_sel ,
                                           AV75Mantenimientomaquina_tmrepuewwds_6_tfmrcodext ,
                                           AV77Mantenimientomaquina_tmrepuewwds_8_tfmrstkpre ,
                                           AV78Mantenimientomaquina_tmrepuewwds_9_tfmrstkpre_to ,
                                           AV79Mantenimientomaquina_tmrepuewwds_10_tfmrstkact ,
                                           AV80Mantenimientomaquina_tmrepuewwds_11_tfmrstkact_to ,
                                           AV81Mantenimientomaquina_tmrepuewwds_12_tfmrstkres ,
                                           AV82Mantenimientomaquina_tmrepuewwds_13_tfmrstkres_to ,
                                           AV83Mantenimientomaquina_tmrepuewwds_14_tfmrstkmin ,
                                           AV84Mantenimientomaquina_tmrepuewwds_15_tfmrstkmin_to ,
                                           AV85Mantenimientomaquina_tmrepuewwds_16_tfmrstkcri ,
                                           AV86Mantenimientomaquina_tmrepuewwds_17_tfmrstkcri_to ,
                                           AV88Mantenimientomaquina_tmrepuewwds_19_tfmrcodprv_sel ,
                                           AV87Mantenimientomaquina_tmrepuewwds_18_tfmrcodprv ,
                                           AV89Mantenimientomaquina_tmrepuewwds_20_tfmractivo_sel ,
                                           A9493MRNom ,
                                           Integer.valueOf(A9492MRCod) ,
                                           A9494MRCodExt ,
                                           A9499MRStkPre ,
                                           A9495MRStkAct ,
                                           A9496MRStkRes ,
                                           A9497MRStkMin ,
                                           A9498MRStkCri ,
                                           A11458MRCodPrv ,
                                           A12850MRActivo ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                           TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN
                                           }
      });
      lV70Mantenimientomaquina_tmrepuewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Mantenimientomaquina_tmrepuewwds_1_filterfulltext), "%", "") ;
      lV70Mantenimientomaquina_tmrepuewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Mantenimientomaquina_tmrepuewwds_1_filterfulltext), "%", "") ;
      lV70Mantenimientomaquina_tmrepuewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Mantenimientomaquina_tmrepuewwds_1_filterfulltext), "%", "") ;
      lV70Mantenimientomaquina_tmrepuewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Mantenimientomaquina_tmrepuewwds_1_filterfulltext), "%", "") ;
      lV70Mantenimientomaquina_tmrepuewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Mantenimientomaquina_tmrepuewwds_1_filterfulltext), "%", "") ;
      lV70Mantenimientomaquina_tmrepuewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Mantenimientomaquina_tmrepuewwds_1_filterfulltext), "%", "") ;
      lV70Mantenimientomaquina_tmrepuewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Mantenimientomaquina_tmrepuewwds_1_filterfulltext), "%", "") ;
      lV70Mantenimientomaquina_tmrepuewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Mantenimientomaquina_tmrepuewwds_1_filterfulltext), "%", "") ;
      lV70Mantenimientomaquina_tmrepuewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Mantenimientomaquina_tmrepuewwds_1_filterfulltext), "%", "") ;
      lV71Mantenimientomaquina_tmrepuewwds_2_tfmrnom = GXutil.padr( GXutil.rtrim( AV71Mantenimientomaquina_tmrepuewwds_2_tfmrnom), 100, "%") ;
      lV75Mantenimientomaquina_tmrepuewwds_6_tfmrcodext = GXutil.padr( GXutil.rtrim( AV75Mantenimientomaquina_tmrepuewwds_6_tfmrcodext), 20, "%") ;
      lV87Mantenimientomaquina_tmrepuewwds_18_tfmrcodprv = GXutil.padr( GXutil.rtrim( AV87Mantenimientomaquina_tmrepuewwds_18_tfmrcodprv), 20, "%") ;
      /* Using cursor P08BV2 */
      pr_default.execute(0, new Object[] {lV70Mantenimientomaquina_tmrepuewwds_1_filterfulltext, lV70Mantenimientomaquina_tmrepuewwds_1_filterfulltext, lV70Mantenimientomaquina_tmrepuewwds_1_filterfulltext, lV70Mantenimientomaquina_tmrepuewwds_1_filterfulltext, lV70Mantenimientomaquina_tmrepuewwds_1_filterfulltext, lV70Mantenimientomaquina_tmrepuewwds_1_filterfulltext, lV70Mantenimientomaquina_tmrepuewwds_1_filterfulltext, lV70Mantenimientomaquina_tmrepuewwds_1_filterfulltext, lV70Mantenimientomaquina_tmrepuewwds_1_filterfulltext, lV71Mantenimientomaquina_tmrepuewwds_2_tfmrnom, AV72Mantenimientomaquina_tmrepuewwds_3_tfmrnom_sel, Integer.valueOf(AV73Mantenimientomaquina_tmrepuewwds_4_tfmrcod), Integer.valueOf(AV74Mantenimientomaquina_tmrepuewwds_5_tfmrcod_to), lV75Mantenimientomaquina_tmrepuewwds_6_tfmrcodext, AV76Mantenimientomaquina_tmrepuewwds_7_tfmrcodext_sel, AV77Mantenimientomaquina_tmrepuewwds_8_tfmrstkpre, AV78Mantenimientomaquina_tmrepuewwds_9_tfmrstkpre_to, AV79Mantenimientomaquina_tmrepuewwds_10_tfmrstkact, AV80Mantenimientomaquina_tmrepuewwds_11_tfmrstkact_to, AV81Mantenimientomaquina_tmrepuewwds_12_tfmrstkres, AV82Mantenimientomaquina_tmrepuewwds_13_tfmrstkres_to, AV83Mantenimientomaquina_tmrepuewwds_14_tfmrstkmin, AV84Mantenimientomaquina_tmrepuewwds_15_tfmrstkmin_to, AV85Mantenimientomaquina_tmrepuewwds_16_tfmrstkcri, AV86Mantenimientomaquina_tmrepuewwds_17_tfmrstkcri_to, lV87Mantenimientomaquina_tmrepuewwds_18_tfmrcodprv, AV88Mantenimientomaquina_tmrepuewwds_19_tfmrcodprv_sel, AV89Mantenimientomaquina_tmrepuewwds_20_tfmractivo_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A12850MRActivo = P08BV2_A12850MRActivo[0] ;
         n12850MRActivo = P08BV2_n12850MRActivo[0] ;
         A11458MRCodPrv = P08BV2_A11458MRCodPrv[0] ;
         n11458MRCodPrv = P08BV2_n11458MRCodPrv[0] ;
         A9498MRStkCri = P08BV2_A9498MRStkCri[0] ;
         n9498MRStkCri = P08BV2_n9498MRStkCri[0] ;
         A9497MRStkMin = P08BV2_A9497MRStkMin[0] ;
         n9497MRStkMin = P08BV2_n9497MRStkMin[0] ;
         A9496MRStkRes = P08BV2_A9496MRStkRes[0] ;
         n9496MRStkRes = P08BV2_n9496MRStkRes[0] ;
         A9495MRStkAct = P08BV2_A9495MRStkAct[0] ;
         n9495MRStkAct = P08BV2_n9495MRStkAct[0] ;
         A9499MRStkPre = P08BV2_A9499MRStkPre[0] ;
         n9499MRStkPre = P08BV2_n9499MRStkPre[0] ;
         A9494MRCodExt = P08BV2_A9494MRCodExt[0] ;
         n9494MRCodExt = P08BV2_n9494MRCodExt[0] ;
         A9492MRCod = P08BV2_A9492MRCod[0] ;
         A9493MRNom = P08BV2_A9493MRNom[0] ;
         n9493MRNom = P08BV2_n9493MRNom[0] ;
         A396EmprCod = P08BV2_A396EmprCod[0] ;
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
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A9493MRNom, ";", ","), GXv_char3) ;
            tmrepuewwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A9492MRCod, 8, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A9494MRCodExt, ";", ","), GXv_char3) ;
            tmrepuewwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A9499MRStkPre, 12, 3) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A9495MRStkAct, 10, 3) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A9496MRStkRes, 10, 3) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A9497MRStkMin, 12, 3) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A9498MRStkCri, 12, 3) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A11458MRCodPrv, ";", ","), GXv_char3) ;
            tmrepuewwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A12850MRActivo, ";", ","), GXv_char3) ;
            tmrepuewwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=TMRepueWWExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MRNom", "", "Nombre Repuesto", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MRCod", "", "Cód", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MRCodExt", "", "Externo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MRStkPre", "", "Precio", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MRStkAct", "", "Stock Actual", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MRStkRes", "", "Stock Reservado", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MRStkMin", "", "Stock Mínimo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MRStkCri", "", "Stock Crítico", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MRCodPrv", "", "Código Proveedor", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MRActivo", "", "Activo S/N", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "MantenimientoMaquina.TMRepueWWColumnsSelector", GXv_char3) ;
      tmrepuewwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("MantenimientoMaquina.TMRepueWWGridState"), "") == 0 )
      {
         AV32GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "MantenimientoMaquina.TMRepueWWGridState"), null, null);
      }
      else
      {
         AV32GridState.fromxml(AV19Session.getValue("MantenimientoMaquina.TMRepueWWGridState"), null, null);
      }
      AV28OrderedBy = AV32GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV32GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV90GXV1 = 1 ;
      while ( AV90GXV1 <= AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV90GXV1));
         if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV30FilterFullText = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRNOM") == 0 )
         {
            AV36TFMRNom = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRNOM_SEL") == 0 )
         {
            AV37TFMRNom_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRCOD") == 0 )
         {
            AV34TFMRCod = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV35TFMRCod_To = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRCODEXT") == 0 )
         {
            AV38TFMRCodExt = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRCODEXT_SEL") == 0 )
         {
            AV39TFMRCodExt_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRSTKPRE") == 0 )
         {
            AV50TFMRStkPre = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV51TFMRStkPre_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRSTKACT") == 0 )
         {
            AV42TFMRStkAct = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV43TFMRStkAct_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRSTKRES") == 0 )
         {
            AV44TFMRStkRes = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV45TFMRStkRes_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRSTKMIN") == 0 )
         {
            AV46TFMRStkMin = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV47TFMRStkMin_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRSTKCRI") == 0 )
         {
            AV48TFMRStkCri = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV49TFMRStkCri_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRCODPRV") == 0 )
         {
            AV40TFMRCodPrv = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRCODPRV_SEL") == 0 )
         {
            AV41TFMRCodPrv_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRACTIVO_SEL") == 0 )
         {
            AV57TFMRActivo_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV90GXV1 = (int)(AV90GXV1+1) ;
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
      A9493MRNom = "" ;
      A9494MRCodExt = "" ;
      A9499MRStkPre = DecimalUtil.ZERO ;
      A9495MRStkAct = DecimalUtil.ZERO ;
      A9496MRStkRes = DecimalUtil.ZERO ;
      A9497MRStkMin = DecimalUtil.ZERO ;
      A9498MRStkCri = DecimalUtil.ZERO ;
      A11458MRCodPrv = "" ;
      A12850MRActivo = "" ;
      AV70Mantenimientomaquina_tmrepuewwds_1_filterfulltext = "" ;
      AV30FilterFullText = "" ;
      AV71Mantenimientomaquina_tmrepuewwds_2_tfmrnom = "" ;
      AV36TFMRNom = "" ;
      AV72Mantenimientomaquina_tmrepuewwds_3_tfmrnom_sel = "" ;
      AV37TFMRNom_Sel = "" ;
      AV75Mantenimientomaquina_tmrepuewwds_6_tfmrcodext = "" ;
      AV38TFMRCodExt = "" ;
      AV76Mantenimientomaquina_tmrepuewwds_7_tfmrcodext_sel = "" ;
      AV39TFMRCodExt_Sel = "" ;
      AV77Mantenimientomaquina_tmrepuewwds_8_tfmrstkpre = DecimalUtil.ZERO ;
      AV50TFMRStkPre = DecimalUtil.ZERO ;
      AV78Mantenimientomaquina_tmrepuewwds_9_tfmrstkpre_to = DecimalUtil.ZERO ;
      AV51TFMRStkPre_To = DecimalUtil.ZERO ;
      AV79Mantenimientomaquina_tmrepuewwds_10_tfmrstkact = DecimalUtil.ZERO ;
      AV42TFMRStkAct = DecimalUtil.ZERO ;
      AV80Mantenimientomaquina_tmrepuewwds_11_tfmrstkact_to = DecimalUtil.ZERO ;
      AV43TFMRStkAct_To = DecimalUtil.ZERO ;
      AV81Mantenimientomaquina_tmrepuewwds_12_tfmrstkres = DecimalUtil.ZERO ;
      AV44TFMRStkRes = DecimalUtil.ZERO ;
      AV82Mantenimientomaquina_tmrepuewwds_13_tfmrstkres_to = DecimalUtil.ZERO ;
      AV45TFMRStkRes_To = DecimalUtil.ZERO ;
      AV83Mantenimientomaquina_tmrepuewwds_14_tfmrstkmin = DecimalUtil.ZERO ;
      AV46TFMRStkMin = DecimalUtil.ZERO ;
      AV84Mantenimientomaquina_tmrepuewwds_15_tfmrstkmin_to = DecimalUtil.ZERO ;
      AV47TFMRStkMin_To = DecimalUtil.ZERO ;
      AV85Mantenimientomaquina_tmrepuewwds_16_tfmrstkcri = DecimalUtil.ZERO ;
      AV48TFMRStkCri = DecimalUtil.ZERO ;
      AV86Mantenimientomaquina_tmrepuewwds_17_tfmrstkcri_to = DecimalUtil.ZERO ;
      AV49TFMRStkCri_To = DecimalUtil.ZERO ;
      AV87Mantenimientomaquina_tmrepuewwds_18_tfmrcodprv = "" ;
      AV40TFMRCodPrv = "" ;
      AV88Mantenimientomaquina_tmrepuewwds_19_tfmrcodprv_sel = "" ;
      AV41TFMRCodPrv_Sel = "" ;
      AV89Mantenimientomaquina_tmrepuewwds_20_tfmractivo_sel = "" ;
      AV57TFMRActivo_Sel = "" ;
      scmdbuf = "" ;
      lV70Mantenimientomaquina_tmrepuewwds_1_filterfulltext = "" ;
      lV71Mantenimientomaquina_tmrepuewwds_2_tfmrnom = "" ;
      lV75Mantenimientomaquina_tmrepuewwds_6_tfmrcodext = "" ;
      lV87Mantenimientomaquina_tmrepuewwds_18_tfmrcodprv = "" ;
      P08BV2_A12850MRActivo = new String[] {""} ;
      P08BV2_n12850MRActivo = new boolean[] {false} ;
      P08BV2_A11458MRCodPrv = new String[] {""} ;
      P08BV2_n11458MRCodPrv = new boolean[] {false} ;
      P08BV2_A9498MRStkCri = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08BV2_n9498MRStkCri = new boolean[] {false} ;
      P08BV2_A9497MRStkMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08BV2_n9497MRStkMin = new boolean[] {false} ;
      P08BV2_A9496MRStkRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08BV2_n9496MRStkRes = new boolean[] {false} ;
      P08BV2_A9495MRStkAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08BV2_n9495MRStkAct = new boolean[] {false} ;
      P08BV2_A9499MRStkPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08BV2_n9499MRStkPre = new boolean[] {false} ;
      P08BV2_A9494MRCodExt = new String[] {""} ;
      P08BV2_n9494MRCodExt = new boolean[] {false} ;
      P08BV2_A9492MRCod = new int[1] ;
      P08BV2_A9493MRNom = new String[] {""} ;
      P08BV2_n9493MRNom = new boolean[] {false} ;
      P08BV2_A396EmprCod = new String[] {""} ;
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
      pr_default = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.tmrepuewwexportcsv__default(),
         new Object[] {
             new Object[] {
            P08BV2_A12850MRActivo, P08BV2_n12850MRActivo, P08BV2_A11458MRCodPrv, P08BV2_n11458MRCodPrv, P08BV2_A9498MRStkCri, P08BV2_n9498MRStkCri, P08BV2_A9497MRStkMin, P08BV2_n9497MRStkMin, P08BV2_A9496MRStkRes, P08BV2_n9496MRStkRes,
            P08BV2_A9495MRStkAct, P08BV2_n9495MRStkAct, P08BV2_A9499MRStkPre, P08BV2_n9499MRStkPre, P08BV2_A9494MRCodExt, P08BV2_n9494MRCodExt, P08BV2_A9492MRCod, P08BV2_A9493MRNom, P08BV2_n9493MRNom, P08BV2_A396EmprCod
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
   private int A9492MRCod ;
   private int AV73Mantenimientomaquina_tmrepuewwds_4_tfmrcod ;
   private int AV34TFMRCod ;
   private int AV74Mantenimientomaquina_tmrepuewwds_5_tfmrcod_to ;
   private int AV35TFMRCod_To ;
   private int AV90GXV1 ;
   private java.math.BigDecimal A9499MRStkPre ;
   private java.math.BigDecimal A9495MRStkAct ;
   private java.math.BigDecimal A9496MRStkRes ;
   private java.math.BigDecimal A9497MRStkMin ;
   private java.math.BigDecimal A9498MRStkCri ;
   private java.math.BigDecimal AV77Mantenimientomaquina_tmrepuewwds_8_tfmrstkpre ;
   private java.math.BigDecimal AV50TFMRStkPre ;
   private java.math.BigDecimal AV78Mantenimientomaquina_tmrepuewwds_9_tfmrstkpre_to ;
   private java.math.BigDecimal AV51TFMRStkPre_To ;
   private java.math.BigDecimal AV79Mantenimientomaquina_tmrepuewwds_10_tfmrstkact ;
   private java.math.BigDecimal AV42TFMRStkAct ;
   private java.math.BigDecimal AV80Mantenimientomaquina_tmrepuewwds_11_tfmrstkact_to ;
   private java.math.BigDecimal AV43TFMRStkAct_To ;
   private java.math.BigDecimal AV81Mantenimientomaquina_tmrepuewwds_12_tfmrstkres ;
   private java.math.BigDecimal AV44TFMRStkRes ;
   private java.math.BigDecimal AV82Mantenimientomaquina_tmrepuewwds_13_tfmrstkres_to ;
   private java.math.BigDecimal AV45TFMRStkRes_To ;
   private java.math.BigDecimal AV83Mantenimientomaquina_tmrepuewwds_14_tfmrstkmin ;
   private java.math.BigDecimal AV46TFMRStkMin ;
   private java.math.BigDecimal AV84Mantenimientomaquina_tmrepuewwds_15_tfmrstkmin_to ;
   private java.math.BigDecimal AV47TFMRStkMin_To ;
   private java.math.BigDecimal AV85Mantenimientomaquina_tmrepuewwds_16_tfmrstkcri ;
   private java.math.BigDecimal AV48TFMRStkCri ;
   private java.math.BigDecimal AV86Mantenimientomaquina_tmrepuewwds_17_tfmrstkcri_to ;
   private java.math.BigDecimal AV49TFMRStkCri_To ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A9493MRNom ;
   private String A9494MRCodExt ;
   private String A11458MRCodPrv ;
   private String A12850MRActivo ;
   private String AV71Mantenimientomaquina_tmrepuewwds_2_tfmrnom ;
   private String AV36TFMRNom ;
   private String AV72Mantenimientomaquina_tmrepuewwds_3_tfmrnom_sel ;
   private String AV37TFMRNom_Sel ;
   private String AV75Mantenimientomaquina_tmrepuewwds_6_tfmrcodext ;
   private String AV38TFMRCodExt ;
   private String AV76Mantenimientomaquina_tmrepuewwds_7_tfmrcodext_sel ;
   private String AV39TFMRCodExt_Sel ;
   private String AV87Mantenimientomaquina_tmrepuewwds_18_tfmrcodprv ;
   private String AV40TFMRCodPrv ;
   private String AV88Mantenimientomaquina_tmrepuewwds_19_tfmrcodprv_sel ;
   private String AV41TFMRCodPrv_Sel ;
   private String AV89Mantenimientomaquina_tmrepuewwds_20_tfmractivo_sel ;
   private String AV57TFMRActivo_Sel ;
   private String scmdbuf ;
   private String lV71Mantenimientomaquina_tmrepuewwds_2_tfmrnom ;
   private String lV75Mantenimientomaquina_tmrepuewwds_6_tfmrcodext ;
   private String lV87Mantenimientomaquina_tmrepuewwds_18_tfmrcodprv ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean n12850MRActivo ;
   private boolean n11458MRCodPrv ;
   private boolean n9498MRStkCri ;
   private boolean n9497MRStkMin ;
   private boolean n9496MRStkRes ;
   private boolean n9495MRStkAct ;
   private boolean n9499MRStkPre ;
   private boolean n9494MRCodExt ;
   private boolean n9493MRNom ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV70Mantenimientomaquina_tmrepuewwds_1_filterfulltext ;
   private String AV30FilterFullText ;
   private String lV70Mantenimientomaquina_tmrepuewwds_1_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private String[] P08BV2_A12850MRActivo ;
   private boolean[] P08BV2_n12850MRActivo ;
   private String[] P08BV2_A11458MRCodPrv ;
   private boolean[] P08BV2_n11458MRCodPrv ;
   private java.math.BigDecimal[] P08BV2_A9498MRStkCri ;
   private boolean[] P08BV2_n9498MRStkCri ;
   private java.math.BigDecimal[] P08BV2_A9497MRStkMin ;
   private boolean[] P08BV2_n9497MRStkMin ;
   private java.math.BigDecimal[] P08BV2_A9496MRStkRes ;
   private boolean[] P08BV2_n9496MRStkRes ;
   private java.math.BigDecimal[] P08BV2_A9495MRStkAct ;
   private boolean[] P08BV2_n9495MRStkAct ;
   private java.math.BigDecimal[] P08BV2_A9499MRStkPre ;
   private boolean[] P08BV2_n9499MRStkPre ;
   private String[] P08BV2_A9494MRCodExt ;
   private boolean[] P08BV2_n9494MRCodExt ;
   private int[] P08BV2_A9492MRCod ;
   private String[] P08BV2_A9493MRNom ;
   private boolean[] P08BV2_n9493MRNom ;
   private String[] P08BV2_A396EmprCod ;
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

final  class tmrepuewwexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08BV2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV70Mantenimientomaquina_tmrepuewwds_1_filterfulltext ,
                                          String AV72Mantenimientomaquina_tmrepuewwds_3_tfmrnom_sel ,
                                          String AV71Mantenimientomaquina_tmrepuewwds_2_tfmrnom ,
                                          int AV73Mantenimientomaquina_tmrepuewwds_4_tfmrcod ,
                                          int AV74Mantenimientomaquina_tmrepuewwds_5_tfmrcod_to ,
                                          String AV76Mantenimientomaquina_tmrepuewwds_7_tfmrcodext_sel ,
                                          String AV75Mantenimientomaquina_tmrepuewwds_6_tfmrcodext ,
                                          java.math.BigDecimal AV77Mantenimientomaquina_tmrepuewwds_8_tfmrstkpre ,
                                          java.math.BigDecimal AV78Mantenimientomaquina_tmrepuewwds_9_tfmrstkpre_to ,
                                          java.math.BigDecimal AV79Mantenimientomaquina_tmrepuewwds_10_tfmrstkact ,
                                          java.math.BigDecimal AV80Mantenimientomaquina_tmrepuewwds_11_tfmrstkact_to ,
                                          java.math.BigDecimal AV81Mantenimientomaquina_tmrepuewwds_12_tfmrstkres ,
                                          java.math.BigDecimal AV82Mantenimientomaquina_tmrepuewwds_13_tfmrstkres_to ,
                                          java.math.BigDecimal AV83Mantenimientomaquina_tmrepuewwds_14_tfmrstkmin ,
                                          java.math.BigDecimal AV84Mantenimientomaquina_tmrepuewwds_15_tfmrstkmin_to ,
                                          java.math.BigDecimal AV85Mantenimientomaquina_tmrepuewwds_16_tfmrstkcri ,
                                          java.math.BigDecimal AV86Mantenimientomaquina_tmrepuewwds_17_tfmrstkcri_to ,
                                          String AV88Mantenimientomaquina_tmrepuewwds_19_tfmrcodprv_sel ,
                                          String AV87Mantenimientomaquina_tmrepuewwds_18_tfmrcodprv ,
                                          String AV89Mantenimientomaquina_tmrepuewwds_20_tfmractivo_sel ,
                                          String A9493MRNom ,
                                          int A9492MRCod ,
                                          String A9494MRCodExt ,
                                          java.math.BigDecimal A9499MRStkPre ,
                                          java.math.BigDecimal A9495MRStkAct ,
                                          java.math.BigDecimal A9496MRStkRes ,
                                          java.math.BigDecimal A9497MRStkMin ,
                                          java.math.BigDecimal A9498MRStkCri ,
                                          String A11458MRCodPrv ,
                                          String A12850MRActivo ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[28];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT MRActivo, MRCodPrv, MRStkCri, MRStkMin, MRStkRes, MRStkAct, MRStkPre, MRCodExt, MRCod, MRNom, EmprCod FROM TXPMREPUE" ;
      if ( ! (GXutil.strcmp("", AV70Mantenimientomaquina_tmrepuewwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(MRNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MRCod,'99999990'), 2) like '%' || ?) or ( UPPER(MRCodExt) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MRStkPre,'99999990.999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MRStkAct,'999990.999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MRStkRes,'999990.999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MRStkMin,'99999990.999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MRStkCri,'99999990.999'), 2) like '%' || ?) or ( UPPER(MRCodPrv) like '%' || UPPER(?)))");
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
      if ( (GXutil.strcmp("", AV72Mantenimientomaquina_tmrepuewwds_3_tfmrnom_sel)==0) && ( ! (GXutil.strcmp("", AV71Mantenimientomaquina_tmrepuewwds_2_tfmrnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Mantenimientomaquina_tmrepuewwds_3_tfmrnom_sel)==0) )
      {
         addWhere(sWhereString, "(MRNom = ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (0==AV73Mantenimientomaquina_tmrepuewwds_4_tfmrcod) )
      {
         addWhere(sWhereString, "(MRCod >= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (0==AV74Mantenimientomaquina_tmrepuewwds_5_tfmrcod_to) )
      {
         addWhere(sWhereString, "(MRCod <= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Mantenimientomaquina_tmrepuewwds_7_tfmrcodext_sel)==0) && ( ! (GXutil.strcmp("", AV75Mantenimientomaquina_tmrepuewwds_6_tfmrcodext)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRCodExt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Mantenimientomaquina_tmrepuewwds_7_tfmrcodext_sel)==0) )
      {
         addWhere(sWhereString, "(MRCodExt = ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Mantenimientomaquina_tmrepuewwds_8_tfmrstkpre)==0) )
      {
         addWhere(sWhereString, "(MRStkPre >= ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Mantenimientomaquina_tmrepuewwds_9_tfmrstkpre_to)==0) )
      {
         addWhere(sWhereString, "(MRStkPre <= ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Mantenimientomaquina_tmrepuewwds_10_tfmrstkact)==0) )
      {
         addWhere(sWhereString, "(MRStkAct >= ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Mantenimientomaquina_tmrepuewwds_11_tfmrstkact_to)==0) )
      {
         addWhere(sWhereString, "(MRStkAct <= ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Mantenimientomaquina_tmrepuewwds_12_tfmrstkres)==0) )
      {
         addWhere(sWhereString, "(MRStkRes >= ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82Mantenimientomaquina_tmrepuewwds_13_tfmrstkres_to)==0) )
      {
         addWhere(sWhereString, "(MRStkRes <= ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Mantenimientomaquina_tmrepuewwds_14_tfmrstkmin)==0) )
      {
         addWhere(sWhereString, "(MRStkMin >= ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Mantenimientomaquina_tmrepuewwds_15_tfmrstkmin_to)==0) )
      {
         addWhere(sWhereString, "(MRStkMin <= ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Mantenimientomaquina_tmrepuewwds_16_tfmrstkcri)==0) )
      {
         addWhere(sWhereString, "(MRStkCri >= ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV86Mantenimientomaquina_tmrepuewwds_17_tfmrstkcri_to)==0) )
      {
         addWhere(sWhereString, "(MRStkCri <= ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Mantenimientomaquina_tmrepuewwds_19_tfmrcodprv_sel)==0) && ( ! (GXutil.strcmp("", AV87Mantenimientomaquina_tmrepuewwds_18_tfmrcodprv)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRCodPrv) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Mantenimientomaquina_tmrepuewwds_19_tfmrcodprv_sel)==0) )
      {
         addWhere(sWhereString, "(MRCodPrv = ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Mantenimientomaquina_tmrepuewwds_20_tfmractivo_sel)==0) )
      {
         addWhere(sWhereString, "(MRActivo = ?)");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY MRCod" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MRCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY MRNom" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MRNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY MRCodExt" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MRCodExt DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY MRStkPre" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MRStkPre DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY MRStkAct" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MRStkAct DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY MRStkRes" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MRStkRes DESC" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY MRStkMin" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MRStkMin DESC" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY MRStkCri" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MRStkCri DESC" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY MRCodPrv" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MRCodPrv DESC" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY MRActivo" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MRActivo DESC" ;
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
                  return conditional_P08BV2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , (String)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , ((Boolean) dynConstraints[31]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08BV2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 20);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(3,3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(4,3);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(5,3);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(6,3);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(7,3);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(8, 20);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((int[]) buf[16])[0] = rslt.getInt(9);
               ((String[]) buf[17])[0] = rslt.getString(10, 100);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 3);
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
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[39]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 20);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[43], 3);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[44], 3);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[45], 3);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 3);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 3);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 3);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 3);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[50], 3);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[51], 3);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 3);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 20);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 20);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 1);
               }
               return;
      }
   }

}

