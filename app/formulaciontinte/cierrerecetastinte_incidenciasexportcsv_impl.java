package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class cierrerecetastinte_incidenciasexportcsv_impl extends GXWebProcedure
{
   public cierrerecetastinte_incidenciasexportcsv_impl( com.genexus.internet.HttpContext context )
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
      S201 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S181 ();
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
      S191 ();
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
      AV11Filename = "./PrivateTempStorage/" + "CierreRecetasTinte_IncidenciasExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("FormulacionTinte.CierreRecetasTinte_IncidenciasColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("FormulacionTinte.CierreRecetasTinte_IncidenciasColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Linea", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Exis", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+"" : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Codigo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Producto", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Factor", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cantidad", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Unidad", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Existencias Almacen", "") : "") ;
      if ( AV63IsAuthorizedPrdExiCC )
      {
         AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Exis C.C.", "") : "") ;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cantidad Reservada", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Lote", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV68Formulaciontinte_cierrerecetastinte_incidenciasds_1_emprcod = AV28emprcod ;
      AV69Formulaciontinte_cierrerecetastinte_incidenciasds_2_barcod = AV29barcod ;
      AV70Formulaciontinte_cierrerecetastinte_incidenciasds_3_barcodreo = AV30barcodreo ;
      AV71Formulaciontinte_cierrerecetastinte_incidenciasds_4_barcodpar = AV31barcodpar ;
      AV72Formulaciontinte_cierrerecetastinte_incidenciasds_5_reclinmaq = AV32reclinmaq ;
      AV73Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext = AV36FilterFullText ;
      AV74Formulaciontinte_cierrerecetastinte_incidenciasds_7_tfreclin = AV40TFRecLin ;
      AV75Formulaciontinte_cierrerecetastinte_incidenciasds_8_tfreclin_to = AV41TFRecLin_To ;
      AV76Formulaciontinte_cierrerecetastinte_incidenciasds_9_tfrecprdnum = AV42TFRecPrdNum ;
      AV77Formulaciontinte_cierrerecetastinte_incidenciasds_10_tfrecprdnum_sel = AV43TFRecPrdNum_Sel ;
      AV78Formulaciontinte_cierrerecetastinte_incidenciasds_11_tfrecprddsc = AV44TFRecPrdDsc ;
      AV79Formulaciontinte_cierrerecetastinte_incidenciasds_12_tfrecprddsc_sel = AV45TFRecPrdDsc_Sel ;
      AV80Formulaciontinte_cierrerecetastinte_incidenciasds_13_tffaccon = AV46TFFacCon ;
      AV81Formulaciontinte_cierrerecetastinte_incidenciasds_14_tffaccon_to = AV47TFFacCon_To ;
      AV82Formulaciontinte_cierrerecetastinte_incidenciasds_15_tfprdexialm = AV52TFPrdExiAlm ;
      AV83Formulaciontinte_cierrerecetastinte_incidenciasds_16_tfprdexialm_to = AV53TFPrdExiAlm_To ;
      AV84Formulaciontinte_cierrerecetastinte_incidenciasds_17_tfprdexicc = AV54TFPrdExiCC ;
      AV85Formulaciontinte_cierrerecetastinte_incidenciasds_18_tfprdexicc_to = AV55TFPrdExiCC_To ;
      AV86Formulaciontinte_cierrerecetastinte_incidenciasds_19_tfprdcanres = AV56TFPrdCanRes ;
      AV87Formulaciontinte_cierrerecetastinte_incidenciasds_20_tfprdcanres_to = AV57TFPrdCanRes_To ;
      AV88Formulaciontinte_cierrerecetastinte_incidenciasds_21_tfreclote = AV58TFRecLote ;
      AV89Formulaciontinte_cierrerecetastinte_incidenciasds_22_tfreclote_sel = AV59TFRecLote_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV73Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext ,
                                           Short.valueOf(AV74Formulaciontinte_cierrerecetastinte_incidenciasds_7_tfreclin) ,
                                           Short.valueOf(AV75Formulaciontinte_cierrerecetastinte_incidenciasds_8_tfreclin_to) ,
                                           AV77Formulaciontinte_cierrerecetastinte_incidenciasds_10_tfrecprdnum_sel ,
                                           AV76Formulaciontinte_cierrerecetastinte_incidenciasds_9_tfrecprdnum ,
                                           AV79Formulaciontinte_cierrerecetastinte_incidenciasds_12_tfrecprddsc_sel ,
                                           AV78Formulaciontinte_cierrerecetastinte_incidenciasds_11_tfrecprddsc ,
                                           AV80Formulaciontinte_cierrerecetastinte_incidenciasds_13_tffaccon ,
                                           AV81Formulaciontinte_cierrerecetastinte_incidenciasds_14_tffaccon_to ,
                                           AV82Formulaciontinte_cierrerecetastinte_incidenciasds_15_tfprdexialm ,
                                           AV83Formulaciontinte_cierrerecetastinte_incidenciasds_16_tfprdexialm_to ,
                                           AV84Formulaciontinte_cierrerecetastinte_incidenciasds_17_tfprdexicc ,
                                           AV85Formulaciontinte_cierrerecetastinte_incidenciasds_18_tfprdexicc_to ,
                                           AV86Formulaciontinte_cierrerecetastinte_incidenciasds_19_tfprdcanres ,
                                           AV87Formulaciontinte_cierrerecetastinte_incidenciasds_20_tfprdcanres_to ,
                                           AV89Formulaciontinte_cierrerecetastinte_incidenciasds_22_tfreclote_sel ,
                                           AV88Formulaciontinte_cierrerecetastinte_incidenciasds_21_tfreclote ,
                                           Short.valueOf(A811RecLin) ,
                                           A872RecPrdNum ,
                                           A875RecPrdDsc ,
                                           A431FacCon ,
                                           A704PrdExiAlm ,
                                           A705PrdExiCC ,
                                           A685PrdCanRes ,
                                           A5725RecLote ,
                                           Short.valueOf(AV34OrderedBy) ,
                                           Boolean.valueOf(AV35OrderedDsc) ,
                                           AV68Formulaciontinte_cierrerecetastinte_incidenciasds_1_emprcod ,
                                           Integer.valueOf(AV69Formulaciontinte_cierrerecetastinte_incidenciasds_2_barcod) ,
                                           Byte.valueOf(AV70Formulaciontinte_cierrerecetastinte_incidenciasds_3_barcodreo) ,
                                           AV71Formulaciontinte_cierrerecetastinte_incidenciasds_4_barcodpar ,
                                           Short.valueOf(AV72Formulaciontinte_cierrerecetastinte_incidenciasds_5_reclinmaq) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Short.valueOf(A2804RecLinMaq) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT
                                           }
      });
      lV73Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext), "%", "") ;
      lV73Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext), "%", "") ;
      lV73Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext), "%", "") ;
      lV73Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext), "%", "") ;
      lV73Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext), "%", "") ;
      lV73Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext), "%", "") ;
      lV73Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext), "%", "") ;
      lV73Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext), "%", "") ;
      lV76Formulaciontinte_cierrerecetastinte_incidenciasds_9_tfrecprdnum = GXutil.padr( GXutil.rtrim( AV76Formulaciontinte_cierrerecetastinte_incidenciasds_9_tfrecprdnum), 6, "%") ;
      lV78Formulaciontinte_cierrerecetastinte_incidenciasds_11_tfrecprddsc = GXutil.padr( GXutil.rtrim( AV78Formulaciontinte_cierrerecetastinte_incidenciasds_11_tfrecprddsc), 26, "%") ;
      lV88Formulaciontinte_cierrerecetastinte_incidenciasds_21_tfreclote = GXutil.padr( GXutil.rtrim( AV88Formulaciontinte_cierrerecetastinte_incidenciasds_21_tfreclote), 26, "%") ;
      /* Using cursor P09EU2 */
      pr_default.execute(0, new Object[] {AV68Formulaciontinte_cierrerecetastinte_incidenciasds_1_emprcod, Integer.valueOf(AV69Formulaciontinte_cierrerecetastinte_incidenciasds_2_barcod), Byte.valueOf(AV70Formulaciontinte_cierrerecetastinte_incidenciasds_3_barcodreo), AV71Formulaciontinte_cierrerecetastinte_incidenciasds_4_barcodpar, Short.valueOf(AV72Formulaciontinte_cierrerecetastinte_incidenciasds_5_reclinmaq), lV73Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext, lV73Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext, lV73Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext, lV73Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext, lV73Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext, lV73Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext, lV73Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext, lV73Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext, Short.valueOf(AV74Formulaciontinte_cierrerecetastinte_incidenciasds_7_tfreclin), Short.valueOf(AV75Formulaciontinte_cierrerecetastinte_incidenciasds_8_tfreclin_to), lV76Formulaciontinte_cierrerecetastinte_incidenciasds_9_tfrecprdnum, AV77Formulaciontinte_cierrerecetastinte_incidenciasds_10_tfrecprdnum_sel, lV78Formulaciontinte_cierrerecetastinte_incidenciasds_11_tfrecprddsc, AV79Formulaciontinte_cierrerecetastinte_incidenciasds_12_tfrecprddsc_sel, AV80Formulaciontinte_cierrerecetastinte_incidenciasds_13_tffaccon, AV81Formulaciontinte_cierrerecetastinte_incidenciasds_14_tffaccon_to, AV82Formulaciontinte_cierrerecetastinte_incidenciasds_15_tfprdexialm, AV83Formulaciontinte_cierrerecetastinte_incidenciasds_16_tfprdexialm_to, AV84Formulaciontinte_cierrerecetastinte_incidenciasds_17_tfprdexicc, AV85Formulaciontinte_cierrerecetastinte_incidenciasds_18_tfprdexicc_to, AV86Formulaciontinte_cierrerecetastinte_incidenciasds_19_tfprdcanres, AV87Formulaciontinte_cierrerecetastinte_incidenciasds_20_tfprdcanres_to, lV88Formulaciontinte_cierrerecetastinte_incidenciasds_21_tfreclote, AV89Formulaciontinte_cierrerecetastinte_incidenciasds_22_tfreclote_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A719PrdNum = P09EU2_A719PrdNum[0] ;
         n719PrdNum = P09EU2_n719PrdNum[0] ;
         A5725RecLote = P09EU2_A5725RecLote[0] ;
         A685PrdCanRes = P09EU2_A685PrdCanRes[0] ;
         A705PrdExiCC = P09EU2_A705PrdExiCC[0] ;
         A704PrdExiAlm = P09EU2_A704PrdExiAlm[0] ;
         A431FacCon = P09EU2_A431FacCon[0] ;
         A875RecPrdDsc = P09EU2_A875RecPrdDsc[0] ;
         A872RecPrdNum = P09EU2_A872RecPrdNum[0] ;
         A811RecLin = P09EU2_A811RecLin[0] ;
         A2804RecLinMaq = P09EU2_A2804RecLinMaq[0] ;
         A130BarCodPar = P09EU2_A130BarCodPar[0] ;
         A132BarCodReo = P09EU2_A132BarCodReo[0] ;
         A129BarCod = P09EU2_A129BarCod[0] ;
         A396EmprCod = P09EU2_A396EmprCod[0] ;
         A707PrdFacCon = P09EU2_A707PrdFacCon[0] ;
         A1797PrdCanAny = P09EU2_A1797PrdCanAny[0] ;
         A686PrdCant = P09EU2_A686PrdCant[0] ;
         A490ForPrdUMe = P09EU2_A490ForPrdUMe[0] ;
         n490ForPrdUMe = P09EU2_n490ForPrdUMe[0] ;
         A488ForPrdDsc = P09EU2_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P09EU2_n488ForPrdDsc[0] ;
         A1273RecLinPro = P09EU2_A1273RecLinPro[0] ;
         A685PrdCanRes = P09EU2_A685PrdCanRes[0] ;
         A705PrdExiCC = P09EU2_A705PrdExiCC[0] ;
         A704PrdExiAlm = P09EU2_A704PrdExiAlm[0] ;
         A707PrdFacCon = P09EU2_A707PrdFacCon[0] ;
         A488ForPrdDsc = P09EU2_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P09EU2_n488ForPrdDsc[0] ;
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
            AV14TextFileLine += GXutil.str( A811RecLin, 4, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV64Existencias = ((A686PrdCant.add(A1797PrdCanAny)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)).multiply(A707PrdFacCon) ;
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( AV64Existencias, 12, 4) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            if ( AV90Consumos.doubleValue() == 1 )
            {
               AV60RecMar = (byte)(((DecimalUtil.compareTo(AV64Existencias, A704PrdExiAlm)>0) ? 1 : 0)) ;
            }
            else
            {
               AV60RecMar = (byte)(((DecimalUtil.compareTo(AV64Existencias, A705PrdExiCC)>0) ? 1 : 0)) ;
            }
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( AV60RecMar, 1, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A872RecPrdNum, ";", ","), GXv_char3) ;
            cierrerecetastinte_incidenciasexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A875RecPrdDsc, ";", ","), GXv_char3) ;
            cierrerecetastinte_incidenciasexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A431FacCon, 11, 5) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV61PrdCant = ((AV91Todosproductos.doubleValue()==0) ? A686PrdCant : A686PrdCant.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)) ;
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( AV61PrdCant, 11, 3) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV62ForPrdDsc = ((AV91Todosproductos.doubleValue()==0) ? A488ForPrdDsc : ((A490ForPrdUMe==2) ? httpContext.getMessage( "Lt", "") : ((A490ForPrdUMe==1) ? httpContext.getMessage( "Kg", "") : httpContext.getMessage( "Kg", "")))) ;
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV62ForPrdDsc, ";", ","), GXv_char3) ;
            cierrerecetastinte_incidenciasexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A704PrdExiAlm, 12, 4) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A705PrdExiCC, 12, 4) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A685PrdCanRes, 12, 4) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A5725RecLote, ";", ","), GXv_char3) ;
            cierrerecetastinte_incidenciasexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      GXt_int4 = 0 ;
      GXv_char3[0] = A396EmprCod ;
      GXv_char5[0] = "011100" ;
      GXv_int6[0] = GXt_int4 ;
      new app.pbuscou(remoteHandle, context).execute( GXv_char3, GXv_char5, GXv_int6) ;
      cierrerecetastinte_incidenciasexportcsv_impl.this.A396EmprCod = GXv_char3[0] ;
      cierrerecetastinte_incidenciasexportcsv_impl.this.GXt_int4 = GXv_int6[0] ;
      AV63IsAuthorizedPrdExiCC = (boolean)(((GXt_int4==0))) ;
   }

   public void S191( )
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=CierreRecetasTinte_IncidenciasExportCSV.csv");
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
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "RecLin", "", "Linea", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&Existencias", "", "Exis", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&RecMar", "", "", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "RecPrdNum", "", "Codigo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "RecPrdDsc", "", "Producto", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "FacCon", "", "Factor", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&PrdCant", "", "Cantidad", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&ForPrdDsc", "", "Unidad", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PrdExiAlm", "", "Existencias Almacen", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_char5[0] = A396EmprCod ;
      GXv_char3[0] = "011100" ;
      if ( new app.pbuscou(remoteHandle, context).executeUdp( GXv_char5, GXv_char3) == 0 )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      cierrerecetastinte_incidenciasexportcsv_impl.this.A396EmprCod = GXv_char5[0] ;
      if ( Cond_result )
      {
         GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PrdExiCC", "", "Exis C.C.", true, "") ;
         AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "", "", "", false, "") ;
         AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      }
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PrdCanRes", "", "Cantidad Reservada", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "RecLote", "", "Lote", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char5[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "FormulacionTinte.CierreRecetasTinte_IncidenciasColumnsSelector", GXv_char5) ;
      cierrerecetastinte_incidenciasexportcsv_impl.this.GXt_char2 = GXv_char5[0] ;
      AV20UserCustomValue = GXt_char2 ;
      if ( ! ( (GXutil.strcmp("", AV20UserCustomValue)==0) ) )
      {
         AV16ColumnsSelectorAux.fromxml(AV20UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector7[0] = AV16ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector8[0] = AV15ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, GXv_SdtWWPColumnsSelector8) ;
         AV16ColumnsSelectorAux = GXv_SdtWWPColumnsSelector7[0] ;
         AV15ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue("FormulacionTinte.CierreRecetasTinte_IncidenciasGridState"), "") == 0 )
      {
         AV38GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.CierreRecetasTinte_IncidenciasGridState"), null, null);
      }
      else
      {
         AV38GridState.fromxml(AV19Session.getValue("FormulacionTinte.CierreRecetasTinte_IncidenciasGridState"), null, null);
      }
      AV34OrderedBy = AV38GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV35OrderedDsc = AV38GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV92GXV1 = 1 ;
      while ( AV92GXV1 <= AV38GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV39GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV38GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV92GXV1));
         if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV36FilterFullText = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLIN") == 0 )
         {
            AV40TFRecLin = (short)(GXutil.lval( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV41TFRecLin_To = (short)(GXutil.lval( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDNUM") == 0 )
         {
            AV42TFRecPrdNum = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDNUM_SEL") == 0 )
         {
            AV43TFRecPrdNum_Sel = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDDSC") == 0 )
         {
            AV44TFRecPrdDsc = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDDSC_SEL") == 0 )
         {
            AV45TFRecPrdDsc_Sel = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACCON") == 0 )
         {
            AV46TFFacCon = CommonUtil.decimalVal( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV47TFFacCon_To = CommonUtil.decimalVal( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDEXIALM") == 0 )
         {
            AV52TFPrdExiAlm = CommonUtil.decimalVal( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV53TFPrdExiAlm_To = CommonUtil.decimalVal( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDEXICC") == 0 )
         {
            AV54TFPrdExiCC = CommonUtil.decimalVal( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV55TFPrdExiCC_To = CommonUtil.decimalVal( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDCANRES") == 0 )
         {
            AV56TFPrdCanRes = CommonUtil.decimalVal( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV57TFPrdCanRes_To = CommonUtil.decimalVal( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLOTE") == 0 )
         {
            AV58TFRecLote = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLOTE_SEL") == 0 )
         {
            AV59TFRecLote_Sel = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV28emprcod = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOD") == 0 )
         {
            AV29barcod = (int)(GXutil.lval( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODREO") == 0 )
         {
            AV30barcodreo = (byte)(GXutil.lval( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODPAR") == 0 )
         {
            AV31barcodpar = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&RECLINMAQ") == 0 )
         {
            AV32reclinmaq = (short)(GXutil.lval( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV92GXV1 = (int)(AV92GXV1+1) ;
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
      A396EmprCod = "" ;
      AV14TextFileLine = "" ;
      AV19Session = httpContext.getWebSession();
      AV18ColumnsSelectorXML = "" ;
      AV15ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      A686PrdCant = DecimalUtil.ZERO ;
      A1797PrdCanAny = DecimalUtil.ZERO ;
      A707PrdFacCon = DecimalUtil.ZERO ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A705PrdExiCC = DecimalUtil.ZERO ;
      A872RecPrdNum = "" ;
      A875RecPrdDsc = "" ;
      A431FacCon = DecimalUtil.ZERO ;
      A488ForPrdDsc = "" ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      A5725RecLote = "" ;
      AV68Formulaciontinte_cierrerecetastinte_incidenciasds_1_emprcod = "" ;
      AV28emprcod = "" ;
      AV71Formulaciontinte_cierrerecetastinte_incidenciasds_4_barcodpar = "" ;
      AV31barcodpar = "" ;
      AV73Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext = "" ;
      AV36FilterFullText = "" ;
      AV76Formulaciontinte_cierrerecetastinte_incidenciasds_9_tfrecprdnum = "" ;
      AV42TFRecPrdNum = "" ;
      AV77Formulaciontinte_cierrerecetastinte_incidenciasds_10_tfrecprdnum_sel = "" ;
      AV43TFRecPrdNum_Sel = "" ;
      AV78Formulaciontinte_cierrerecetastinte_incidenciasds_11_tfrecprddsc = "" ;
      AV44TFRecPrdDsc = "" ;
      AV79Formulaciontinte_cierrerecetastinte_incidenciasds_12_tfrecprddsc_sel = "" ;
      AV45TFRecPrdDsc_Sel = "" ;
      AV80Formulaciontinte_cierrerecetastinte_incidenciasds_13_tffaccon = DecimalUtil.ZERO ;
      AV46TFFacCon = DecimalUtil.ZERO ;
      AV81Formulaciontinte_cierrerecetastinte_incidenciasds_14_tffaccon_to = DecimalUtil.ZERO ;
      AV47TFFacCon_To = DecimalUtil.ZERO ;
      AV82Formulaciontinte_cierrerecetastinte_incidenciasds_15_tfprdexialm = DecimalUtil.ZERO ;
      AV52TFPrdExiAlm = DecimalUtil.ZERO ;
      AV83Formulaciontinte_cierrerecetastinte_incidenciasds_16_tfprdexialm_to = DecimalUtil.ZERO ;
      AV53TFPrdExiAlm_To = DecimalUtil.ZERO ;
      AV84Formulaciontinte_cierrerecetastinte_incidenciasds_17_tfprdexicc = DecimalUtil.ZERO ;
      AV54TFPrdExiCC = DecimalUtil.ZERO ;
      AV85Formulaciontinte_cierrerecetastinte_incidenciasds_18_tfprdexicc_to = DecimalUtil.ZERO ;
      AV55TFPrdExiCC_To = DecimalUtil.ZERO ;
      AV86Formulaciontinte_cierrerecetastinte_incidenciasds_19_tfprdcanres = DecimalUtil.ZERO ;
      AV56TFPrdCanRes = DecimalUtil.ZERO ;
      AV87Formulaciontinte_cierrerecetastinte_incidenciasds_20_tfprdcanres_to = DecimalUtil.ZERO ;
      AV57TFPrdCanRes_To = DecimalUtil.ZERO ;
      AV88Formulaciontinte_cierrerecetastinte_incidenciasds_21_tfreclote = "" ;
      AV58TFRecLote = "" ;
      AV89Formulaciontinte_cierrerecetastinte_incidenciasds_22_tfreclote_sel = "" ;
      AV59TFRecLote_Sel = "" ;
      scmdbuf = "" ;
      lV73Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext = "" ;
      lV76Formulaciontinte_cierrerecetastinte_incidenciasds_9_tfrecprdnum = "" ;
      lV78Formulaciontinte_cierrerecetastinte_incidenciasds_11_tfrecprddsc = "" ;
      lV88Formulaciontinte_cierrerecetastinte_incidenciasds_21_tfreclote = "" ;
      A130BarCodPar = "" ;
      P09EU2_A719PrdNum = new String[] {""} ;
      P09EU2_n719PrdNum = new boolean[] {false} ;
      P09EU2_A5725RecLote = new String[] {""} ;
      P09EU2_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09EU2_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09EU2_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09EU2_A431FacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09EU2_A875RecPrdDsc = new String[] {""} ;
      P09EU2_A872RecPrdNum = new String[] {""} ;
      P09EU2_A811RecLin = new short[1] ;
      P09EU2_A2804RecLinMaq = new short[1] ;
      P09EU2_A130BarCodPar = new String[] {""} ;
      P09EU2_A132BarCodReo = new byte[1] ;
      P09EU2_A129BarCod = new int[1] ;
      P09EU2_A396EmprCod = new String[] {""} ;
      P09EU2_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09EU2_A1797PrdCanAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09EU2_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09EU2_A490ForPrdUMe = new byte[1] ;
      P09EU2_n490ForPrdUMe = new boolean[] {false} ;
      P09EU2_A488ForPrdDsc = new String[] {""} ;
      P09EU2_n488ForPrdDsc = new boolean[] {false} ;
      P09EU2_A1273RecLinPro = new byte[1] ;
      A719PrdNum = "" ;
      AV64Existencias = DecimalUtil.ZERO ;
      AV90Consumos = DecimalUtil.ZERO ;
      AV61PrdCant = DecimalUtil.ZERO ;
      AV91Todosproductos = DecimalUtil.ZERO ;
      AV62ForPrdDsc = "" ;
      GXv_int6 = new int[1] ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      GXv_char3 = new String[1] ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char5 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV38GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV39GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.cierrerecetastinte_incidenciasexportcsv__default(),
         new Object[] {
             new Object[] {
            P09EU2_A719PrdNum, P09EU2_n719PrdNum, P09EU2_A5725RecLote, P09EU2_A685PrdCanRes, P09EU2_A705PrdExiCC, P09EU2_A704PrdExiAlm, P09EU2_A431FacCon, P09EU2_A875RecPrdDsc, P09EU2_A872RecPrdNum, P09EU2_A811RecLin,
            P09EU2_A2804RecLinMaq, P09EU2_A130BarCodPar, P09EU2_A132BarCodReo, P09EU2_A129BarCod, P09EU2_A396EmprCod, P09EU2_A707PrdFacCon, P09EU2_A1797PrdCanAny, P09EU2_A686PrdCant, P09EU2_A490ForPrdUMe, P09EU2_n490ForPrdUMe,
            P09EU2_A488ForPrdDsc, P09EU2_n488ForPrdDsc, P09EU2_A1273RecLinPro
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A490ForPrdUMe ;
   private byte AV70Formulaciontinte_cierrerecetastinte_incidenciasds_3_barcodreo ;
   private byte AV30barcodreo ;
   private byte A132BarCodReo ;
   private byte A1273RecLinPro ;
   private byte AV60RecMar ;
   private short gxcookieaux ;
   private short A811RecLin ;
   private short AV72Formulaciontinte_cierrerecetastinte_incidenciasds_5_reclinmaq ;
   private short AV32reclinmaq ;
   private short AV74Formulaciontinte_cierrerecetastinte_incidenciasds_7_tfreclin ;
   private short AV40TFRecLin ;
   private short AV75Formulaciontinte_cierrerecetastinte_incidenciasds_8_tfreclin_to ;
   private short AV41TFRecLin_To ;
   private short AV34OrderedBy ;
   private short A2804RecLinMaq ;
   private short Gx_err ;
   private int AV13Random ;
   private int AV69Formulaciontinte_cierrerecetastinte_incidenciasds_2_barcod ;
   private int AV29barcod ;
   private int A129BarCod ;
   private int GXt_int4 ;
   private int GXv_int6[] ;
   private int AV92GXV1 ;
   private java.math.BigDecimal A686PrdCant ;
   private java.math.BigDecimal A1797PrdCanAny ;
   private java.math.BigDecimal A707PrdFacCon ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A705PrdExiCC ;
   private java.math.BigDecimal A431FacCon ;
   private java.math.BigDecimal A685PrdCanRes ;
   private java.math.BigDecimal AV80Formulaciontinte_cierrerecetastinte_incidenciasds_13_tffaccon ;
   private java.math.BigDecimal AV46TFFacCon ;
   private java.math.BigDecimal AV81Formulaciontinte_cierrerecetastinte_incidenciasds_14_tffaccon_to ;
   private java.math.BigDecimal AV47TFFacCon_To ;
   private java.math.BigDecimal AV82Formulaciontinte_cierrerecetastinte_incidenciasds_15_tfprdexialm ;
   private java.math.BigDecimal AV52TFPrdExiAlm ;
   private java.math.BigDecimal AV83Formulaciontinte_cierrerecetastinte_incidenciasds_16_tfprdexialm_to ;
   private java.math.BigDecimal AV53TFPrdExiAlm_To ;
   private java.math.BigDecimal AV84Formulaciontinte_cierrerecetastinte_incidenciasds_17_tfprdexicc ;
   private java.math.BigDecimal AV54TFPrdExiCC ;
   private java.math.BigDecimal AV85Formulaciontinte_cierrerecetastinte_incidenciasds_18_tfprdexicc_to ;
   private java.math.BigDecimal AV55TFPrdExiCC_To ;
   private java.math.BigDecimal AV86Formulaciontinte_cierrerecetastinte_incidenciasds_19_tfprdcanres ;
   private java.math.BigDecimal AV56TFPrdCanRes ;
   private java.math.BigDecimal AV87Formulaciontinte_cierrerecetastinte_incidenciasds_20_tfprdcanres_to ;
   private java.math.BigDecimal AV57TFPrdCanRes_To ;
   private java.math.BigDecimal AV64Existencias ;
   private java.math.BigDecimal AV90Consumos ;
   private java.math.BigDecimal AV61PrdCant ;
   private java.math.BigDecimal AV91Todosproductos ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String A872RecPrdNum ;
   private String A875RecPrdDsc ;
   private String A488ForPrdDsc ;
   private String A5725RecLote ;
   private String AV68Formulaciontinte_cierrerecetastinte_incidenciasds_1_emprcod ;
   private String AV28emprcod ;
   private String AV71Formulaciontinte_cierrerecetastinte_incidenciasds_4_barcodpar ;
   private String AV31barcodpar ;
   private String AV76Formulaciontinte_cierrerecetastinte_incidenciasds_9_tfrecprdnum ;
   private String AV42TFRecPrdNum ;
   private String AV77Formulaciontinte_cierrerecetastinte_incidenciasds_10_tfrecprdnum_sel ;
   private String AV43TFRecPrdNum_Sel ;
   private String AV78Formulaciontinte_cierrerecetastinte_incidenciasds_11_tfrecprddsc ;
   private String AV44TFRecPrdDsc ;
   private String AV79Formulaciontinte_cierrerecetastinte_incidenciasds_12_tfrecprddsc_sel ;
   private String AV45TFRecPrdDsc_Sel ;
   private String AV88Formulaciontinte_cierrerecetastinte_incidenciasds_21_tfreclote ;
   private String AV58TFRecLote ;
   private String AV89Formulaciontinte_cierrerecetastinte_incidenciasds_22_tfreclote_sel ;
   private String AV59TFRecLote_Sel ;
   private String scmdbuf ;
   private String lV76Formulaciontinte_cierrerecetastinte_incidenciasds_9_tfrecprdnum ;
   private String lV78Formulaciontinte_cierrerecetastinte_incidenciasds_11_tfrecprddsc ;
   private String lV88Formulaciontinte_cierrerecetastinte_incidenciasds_21_tfreclote ;
   private String A130BarCodPar ;
   private String A719PrdNum ;
   private String AV62ForPrdDsc ;
   private String GXv_char3[] ;
   private String GXt_char2 ;
   private String GXv_char5[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV63IsAuthorizedPrdExiCC ;
   private boolean AV35OrderedDsc ;
   private boolean n719PrdNum ;
   private boolean n490ForPrdUMe ;
   private boolean n488ForPrdDsc ;
   private boolean Cond_result ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV73Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext ;
   private String AV36FilterFullText ;
   private String lV73Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private String[] P09EU2_A719PrdNum ;
   private boolean[] P09EU2_n719PrdNum ;
   private String[] P09EU2_A5725RecLote ;
   private java.math.BigDecimal[] P09EU2_A685PrdCanRes ;
   private java.math.BigDecimal[] P09EU2_A705PrdExiCC ;
   private java.math.BigDecimal[] P09EU2_A704PrdExiAlm ;
   private java.math.BigDecimal[] P09EU2_A431FacCon ;
   private String[] P09EU2_A875RecPrdDsc ;
   private String[] P09EU2_A872RecPrdNum ;
   private short[] P09EU2_A811RecLin ;
   private short[] P09EU2_A2804RecLinMaq ;
   private String[] P09EU2_A130BarCodPar ;
   private byte[] P09EU2_A132BarCodReo ;
   private int[] P09EU2_A129BarCod ;
   private String[] P09EU2_A396EmprCod ;
   private java.math.BigDecimal[] P09EU2_A707PrdFacCon ;
   private java.math.BigDecimal[] P09EU2_A1797PrdCanAny ;
   private java.math.BigDecimal[] P09EU2_A686PrdCant ;
   private byte[] P09EU2_A490ForPrdUMe ;
   private boolean[] P09EU2_n490ForPrdUMe ;
   private String[] P09EU2_A488ForPrdDsc ;
   private boolean[] P09EU2_n488ForPrdDsc ;
   private byte[] P09EU2_A1273RecLinPro ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV38GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV39GridStateFilterValue ;
}

final  class cierrerecetastinte_incidenciasexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09EU2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV73Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext ,
                                          short AV74Formulaciontinte_cierrerecetastinte_incidenciasds_7_tfreclin ,
                                          short AV75Formulaciontinte_cierrerecetastinte_incidenciasds_8_tfreclin_to ,
                                          String AV77Formulaciontinte_cierrerecetastinte_incidenciasds_10_tfrecprdnum_sel ,
                                          String AV76Formulaciontinte_cierrerecetastinte_incidenciasds_9_tfrecprdnum ,
                                          String AV79Formulaciontinte_cierrerecetastinte_incidenciasds_12_tfrecprddsc_sel ,
                                          String AV78Formulaciontinte_cierrerecetastinte_incidenciasds_11_tfrecprddsc ,
                                          java.math.BigDecimal AV80Formulaciontinte_cierrerecetastinte_incidenciasds_13_tffaccon ,
                                          java.math.BigDecimal AV81Formulaciontinte_cierrerecetastinte_incidenciasds_14_tffaccon_to ,
                                          java.math.BigDecimal AV82Formulaciontinte_cierrerecetastinte_incidenciasds_15_tfprdexialm ,
                                          java.math.BigDecimal AV83Formulaciontinte_cierrerecetastinte_incidenciasds_16_tfprdexialm_to ,
                                          java.math.BigDecimal AV84Formulaciontinte_cierrerecetastinte_incidenciasds_17_tfprdexicc ,
                                          java.math.BigDecimal AV85Formulaciontinte_cierrerecetastinte_incidenciasds_18_tfprdexicc_to ,
                                          java.math.BigDecimal AV86Formulaciontinte_cierrerecetastinte_incidenciasds_19_tfprdcanres ,
                                          java.math.BigDecimal AV87Formulaciontinte_cierrerecetastinte_incidenciasds_20_tfprdcanres_to ,
                                          String AV89Formulaciontinte_cierrerecetastinte_incidenciasds_22_tfreclote_sel ,
                                          String AV88Formulaciontinte_cierrerecetastinte_incidenciasds_21_tfreclote ,
                                          short A811RecLin ,
                                          String A872RecPrdNum ,
                                          String A875RecPrdDsc ,
                                          java.math.BigDecimal A431FacCon ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          java.math.BigDecimal A705PrdExiCC ,
                                          java.math.BigDecimal A685PrdCanRes ,
                                          String A5725RecLote ,
                                          short AV34OrderedBy ,
                                          boolean AV35OrderedDsc ,
                                          String AV68Formulaciontinte_cierrerecetastinte_incidenciasds_1_emprcod ,
                                          int AV69Formulaciontinte_cierrerecetastinte_incidenciasds_2_barcod ,
                                          byte AV70Formulaciontinte_cierrerecetastinte_incidenciasds_3_barcodreo ,
                                          String AV71Formulaciontinte_cierrerecetastinte_incidenciasds_4_barcodpar ,
                                          short AV72Formulaciontinte_cierrerecetastinte_incidenciasds_5_reclinmaq ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          short A2804RecLinMaq )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int9 = new byte[29];
      Object[] GXv_Object10 = new Object[2];
      scmdbuf = "SELECT T1.PrdNum, T1.RecLote, T2.PrdCanRes, T2.PrdExiCC, T2.PrdExiAlm, T1.FacCon, T1.RecPrdDsc, T1.RecPrdNum, T1.RecLin, T1.RecLinMaq, T1.BarCodPar, T1.BarCodReo," ;
      scmdbuf += " T1.BarCod, T1.EmprCod, T2.PrdFacCon, T1.PrdCanAny, T1.PrdCant, T1.ForPrdUMe, T3.ForPrdDsc, T1.RecLinPro FROM ((TXPLRECET T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.PrdNum = T1.PrdNum) LEFT JOIN TXPUNMEPR T3 ON T3.EmprCod = T1.EmprCod AND T3.ForPrdUMe = T1.ForPrdUMe)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ?)");
      if ( ! (GXutil.strcmp("", AV73Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.RecLin,'9990'), 2) like '%' || ?) or ( UPPER(T1.RecPrdNum) like '%' || UPPER(?)) or ( UPPER(T1.RecPrdDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.FacCon,'99990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.PrdExiAlm,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.PrdExiCC,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.PrdCanRes,'9999990.9999'), 2) like '%' || ?) or ( UPPER(T1.RecLote) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int9[5] = (byte)(1) ;
         GXv_int9[6] = (byte)(1) ;
         GXv_int9[7] = (byte)(1) ;
         GXv_int9[8] = (byte)(1) ;
         GXv_int9[9] = (byte)(1) ;
         GXv_int9[10] = (byte)(1) ;
         GXv_int9[11] = (byte)(1) ;
         GXv_int9[12] = (byte)(1) ;
      }
      if ( ! (0==AV74Formulaciontinte_cierrerecetastinte_incidenciasds_7_tfreclin) )
      {
         addWhere(sWhereString, "(T1.RecLin >= ?)");
      }
      else
      {
         GXv_int9[13] = (byte)(1) ;
      }
      if ( ! (0==AV75Formulaciontinte_cierrerecetastinte_incidenciasds_8_tfreclin_to) )
      {
         addWhere(sWhereString, "(T1.RecLin <= ?)");
      }
      else
      {
         GXv_int9[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Formulaciontinte_cierrerecetastinte_incidenciasds_10_tfrecprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV76Formulaciontinte_cierrerecetastinte_incidenciasds_9_tfrecprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Formulaciontinte_cierrerecetastinte_incidenciasds_10_tfrecprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdNum = ?)");
      }
      else
      {
         GXv_int9[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Formulaciontinte_cierrerecetastinte_incidenciasds_12_tfrecprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV78Formulaciontinte_cierrerecetastinte_incidenciasds_11_tfrecprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Formulaciontinte_cierrerecetastinte_incidenciasds_12_tfrecprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdDsc = ?)");
      }
      else
      {
         GXv_int9[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Formulaciontinte_cierrerecetastinte_incidenciasds_13_tffaccon)==0) )
      {
         addWhere(sWhereString, "(T1.FacCon >= ?)");
      }
      else
      {
         GXv_int9[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Formulaciontinte_cierrerecetastinte_incidenciasds_14_tffaccon_to)==0) )
      {
         addWhere(sWhereString, "(T1.FacCon <= ?)");
      }
      else
      {
         GXv_int9[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82Formulaciontinte_cierrerecetastinte_incidenciasds_15_tfprdexialm)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiAlm >= ?)");
      }
      else
      {
         GXv_int9[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Formulaciontinte_cierrerecetastinte_incidenciasds_16_tfprdexialm_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiAlm <= ?)");
      }
      else
      {
         GXv_int9[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Formulaciontinte_cierrerecetastinte_incidenciasds_17_tfprdexicc)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiCC >= ?)");
      }
      else
      {
         GXv_int9[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Formulaciontinte_cierrerecetastinte_incidenciasds_18_tfprdexicc_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiCC <= ?)");
      }
      else
      {
         GXv_int9[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV86Formulaciontinte_cierrerecetastinte_incidenciasds_19_tfprdcanres)==0) )
      {
         addWhere(sWhereString, "(T2.PrdCanRes >= ?)");
      }
      else
      {
         GXv_int9[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV87Formulaciontinte_cierrerecetastinte_incidenciasds_20_tfprdcanres_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdCanRes <= ?)");
      }
      else
      {
         GXv_int9[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Formulaciontinte_cierrerecetastinte_incidenciasds_22_tfreclote_sel)==0) && ( ! (GXutil.strcmp("", AV88Formulaciontinte_cierrerecetastinte_incidenciasds_21_tfreclote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Formulaciontinte_cierrerecetastinte_incidenciasds_22_tfreclote_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecLote = ?)");
      }
      else
      {
         GXv_int9[28] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV34OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.RecLinPro" ;
      }
      else if ( ( AV34OrderedBy == 2 ) && ! AV35OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLin" ;
      }
      else if ( ( AV34OrderedBy == 2 ) && ( AV35OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.RecLinMaq DESC, T1.RecLin DESC" ;
      }
      else if ( ( AV34OrderedBy == 3 ) && ! AV35OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecPrdNum" ;
      }
      else if ( ( AV34OrderedBy == 3 ) && ( AV35OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.RecLinMaq DESC, T1.RecPrdNum DESC" ;
      }
      else if ( ( AV34OrderedBy == 4 ) && ! AV35OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecPrdDsc" ;
      }
      else if ( ( AV34OrderedBy == 4 ) && ( AV35OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.RecLinMaq DESC, T1.RecPrdDsc DESC" ;
      }
      else if ( ( AV34OrderedBy == 5 ) && ! AV35OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.FacCon" ;
      }
      else if ( ( AV34OrderedBy == 5 ) && ( AV35OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.RecLinMaq DESC, T1.FacCon DESC" ;
      }
      else if ( ( AV34OrderedBy == 6 ) && ! AV35OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T2.PrdExiAlm" ;
      }
      else if ( ( AV34OrderedBy == 6 ) && ( AV35OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.RecLinMaq DESC, T2.PrdExiAlm DESC" ;
      }
      else if ( ( AV34OrderedBy == 7 ) && ! AV35OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T2.PrdExiCC" ;
      }
      else if ( ( AV34OrderedBy == 7 ) && ( AV35OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.RecLinMaq DESC, T2.PrdExiCC DESC" ;
      }
      else if ( ( AV34OrderedBy == 8 ) && ! AV35OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T2.PrdCanRes" ;
      }
      else if ( ( AV34OrderedBy == 8 ) && ( AV35OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.RecLinMaq DESC, T2.PrdCanRes DESC" ;
      }
      else if ( ( AV34OrderedBy == 9 ) && ! AV35OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLote" ;
      }
      else if ( ( AV34OrderedBy == 9 ) && ( AV35OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.RecLinMaq DESC, T1.RecLote DESC" ;
      }
      GXv_Object10[0] = scmdbuf ;
      GXv_Object10[1] = GXv_int9 ;
      return GXv_Object10 ;
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
                  return conditional_P09EU2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).shortValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Boolean) dynConstraints[26]).booleanValue() , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).byteValue() , (String)dynConstraints[30] , ((Number) dynConstraints[31]).shortValue() , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09EU2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 26);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,4);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,5);
               ((String[]) buf[7])[0] = rslt.getString(7, 26);
               ((String[]) buf[8])[0] = rslt.getString(8, 6);
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((short[]) buf[10])[0] = rslt.getShort(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 1);
               ((byte[]) buf[12])[0] = rslt.getByte(12);
               ((int[]) buf[13])[0] = rslt.getInt(13);
               ((String[]) buf[14])[0] = rslt.getString(14, 3);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(15,4);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(16,3);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(17,3);
               ((byte[]) buf[18])[0] = rslt.getByte(18);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(19, 5);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((byte[]) buf[22])[0] = rslt.getByte(20);
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
                  stmt.setString(sIdx, (String)parms[29], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[31]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[33]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[42]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[43]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 6);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 6);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 5);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 5);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[50], 4);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[51], 4);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 4);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 4);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[54], 4);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[55], 4);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 26);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 26);
               }
               return;
      }
   }

}

