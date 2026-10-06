package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wcwwkp89exportcsv_impl extends GXWebProcedure
{
   public wcwwkp89exportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "WCWWkp89ExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("WCWWkp89ColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("WCWWkp89ColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Producto", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Familia", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Uso", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Ubicacion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Unidades Stock Minimo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Stock Inicial", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Compras", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Consumos", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Stock Piso", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Stock Pesado", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Stock Total", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Reservas", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Stock Disponible", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Precio Actual", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Valor Stock", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Codigo Proveedor", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre Proveedor", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Lote", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Validez", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV76Wcwwkp89ds_1_filterfulltext = AV30FilterFullText ;
      AV77Wcwwkp89ds_2_tfprdnum = AV42TFPrdNum ;
      AV78Wcwwkp89ds_3_tfprdnum_sel = AV43TFPrdNum_Sel ;
      AV79Wcwwkp89ds_4_tfprdnom = AV44TFPrdNom ;
      AV80Wcwwkp89ds_5_tfprdnom_sel = AV45TFPrdNom_Sel ;
      AV81Wcwwkp89ds_6_tftipprddsc = AV46TFTipPrdDsc ;
      AV82Wcwwkp89ds_7_tftipprddsc_sel = AV47TFTipPrdDsc_Sel ;
      AV83Wcwwkp89ds_8_tfprdrefprv = AV48TFPrdRefPrv ;
      AV84Wcwwkp89ds_9_tfprdrefprv_sel = AV49TFPrdRefPrv_Sel ;
      AV85Wcwwkp89ds_10_tfprdubicacion = AV50TFPrdUbicacion ;
      AV86Wcwwkp89ds_11_tfprdubicacion_sel = AV51TFPrdUbicacion_Sel ;
      AV87Wcwwkp89ds_12_tfprdstkminu = AV52TFPrdStkMinU ;
      AV88Wcwwkp89ds_13_tfprdstkminu_to = AV53TFPrdStkMinU_To ;
      AV89Wcwwkp89ds_14_tfprdpreact = AV59TFPrdPreAct ;
      AV90Wcwwkp89ds_15_tfprdpreact_to = AV60TFPrdPreAct_To ;
      AV91Wcwwkp89ds_16_tfprvnum = AV61TFPrvNum ;
      AV92Wcwwkp89ds_17_tfprvnum_to = AV62TFPrvNum_To ;
      AV93Wcwwkp89ds_18_tfprvnom = AV63TFPrvNom ;
      AV94Wcwwkp89ds_19_tfprvnom_sel = AV64TFPrvNom_Sel ;
      AV95Wcwwkp89ds_20_tfprdlote = AV67TFPrdLote ;
      AV96Wcwwkp89ds_21_tfprdlote_sel = AV68TFPrdLote_Sel ;
      AV97Wcwwkp89ds_22_tfvalcod = AV71TFValCod ;
      AV98Wcwwkp89ds_23_tfvalcod_to = AV72TFValCod_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV76Wcwwkp89ds_1_filterfulltext ,
                                           AV78Wcwwkp89ds_3_tfprdnum_sel ,
                                           AV77Wcwwkp89ds_2_tfprdnum ,
                                           AV80Wcwwkp89ds_5_tfprdnom_sel ,
                                           AV79Wcwwkp89ds_4_tfprdnom ,
                                           AV82Wcwwkp89ds_7_tftipprddsc_sel ,
                                           AV81Wcwwkp89ds_6_tftipprddsc ,
                                           AV84Wcwwkp89ds_9_tfprdrefprv_sel ,
                                           AV83Wcwwkp89ds_8_tfprdrefprv ,
                                           AV86Wcwwkp89ds_11_tfprdubicacion_sel ,
                                           AV85Wcwwkp89ds_10_tfprdubicacion ,
                                           AV87Wcwwkp89ds_12_tfprdstkminu ,
                                           AV88Wcwwkp89ds_13_tfprdstkminu_to ,
                                           AV89Wcwwkp89ds_14_tfprdpreact ,
                                           AV90Wcwwkp89ds_15_tfprdpreact_to ,
                                           Integer.valueOf(AV91Wcwwkp89ds_16_tfprvnum) ,
                                           Integer.valueOf(AV92Wcwwkp89ds_17_tfprvnum_to) ,
                                           AV94Wcwwkp89ds_19_tfprvnom_sel ,
                                           AV93Wcwwkp89ds_18_tfprvnom ,
                                           AV96Wcwwkp89ds_21_tfprdlote_sel ,
                                           AV95Wcwwkp89ds_20_tfprdlote ,
                                           Byte.valueOf(AV97Wcwwkp89ds_22_tfvalcod) ,
                                           Byte.valueOf(AV98Wcwwkp89ds_23_tfvalcod_to) ,
                                           Short.valueOf(AV69ValCodfrom) ,
                                           Short.valueOf(AV70ValCodto) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A6302TipPrdDsc ,
                                           A728PrdRefPrv ,
                                           A13457PrdUbicaci ,
                                           A732PrdStkMinU ,
                                           A724PrdPreAct ,
                                           Integer.valueOf(A795PrvNum) ,
                                           A794PrvNom ,
                                           A10881PrdLote ,
                                           Byte.valueOf(A856ValCod) ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) ,
                                           AV54Emprcod ,
                                           AV55Prdnum ,
                                           A396EmprCod ,
                                           AV56Prdnum_to } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV76Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV76Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV76Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV76Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV76Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV76Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV76Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV76Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV76Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV76Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV76Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV77Wcwwkp89ds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV77Wcwwkp89ds_2_tfprdnum), 6, "%") ;
      lV79Wcwwkp89ds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV79Wcwwkp89ds_4_tfprdnom), 26, "%") ;
      lV81Wcwwkp89ds_6_tftipprddsc = GXutil.padr( GXutil.rtrim( AV81Wcwwkp89ds_6_tftipprddsc), 40, "%") ;
      lV83Wcwwkp89ds_8_tfprdrefprv = GXutil.padr( GXutil.rtrim( AV83Wcwwkp89ds_8_tfprdrefprv), 30, "%") ;
      lV85Wcwwkp89ds_10_tfprdubicacion = GXutil.padr( GXutil.rtrim( AV85Wcwwkp89ds_10_tfprdubicacion), 20, "%") ;
      lV93Wcwwkp89ds_18_tfprvnom = GXutil.padr( GXutil.rtrim( AV93Wcwwkp89ds_18_tfprvnom), 30, "%") ;
      lV95Wcwwkp89ds_20_tfprdlote = GXutil.padr( GXutil.rtrim( AV95Wcwwkp89ds_20_tfprdlote), 26, "%") ;
      /* Using cursor P08WA2 */
      pr_default.execute(0, new Object[] {AV54Emprcod, AV55Prdnum, AV56Prdnum_to, lV76Wcwwkp89ds_1_filterfulltext, lV76Wcwwkp89ds_1_filterfulltext, lV76Wcwwkp89ds_1_filterfulltext, lV76Wcwwkp89ds_1_filterfulltext, lV76Wcwwkp89ds_1_filterfulltext, lV76Wcwwkp89ds_1_filterfulltext, lV76Wcwwkp89ds_1_filterfulltext, lV76Wcwwkp89ds_1_filterfulltext, lV76Wcwwkp89ds_1_filterfulltext, lV76Wcwwkp89ds_1_filterfulltext, lV76Wcwwkp89ds_1_filterfulltext, lV77Wcwwkp89ds_2_tfprdnum, AV78Wcwwkp89ds_3_tfprdnum_sel, lV79Wcwwkp89ds_4_tfprdnom, AV80Wcwwkp89ds_5_tfprdnom_sel, lV81Wcwwkp89ds_6_tftipprddsc, AV82Wcwwkp89ds_7_tftipprddsc_sel, lV83Wcwwkp89ds_8_tfprdrefprv, AV84Wcwwkp89ds_9_tfprdrefprv_sel, lV85Wcwwkp89ds_10_tfprdubicacion, AV86Wcwwkp89ds_11_tfprdubicacion_sel, AV87Wcwwkp89ds_12_tfprdstkminu, AV88Wcwwkp89ds_13_tfprdstkminu_to, AV89Wcwwkp89ds_14_tfprdpreact, AV90Wcwwkp89ds_15_tfprdpreact_to, Integer.valueOf(AV91Wcwwkp89ds_16_tfprvnum), Integer.valueOf(AV92Wcwwkp89ds_17_tfprvnum_to), lV93Wcwwkp89ds_18_tfprvnom, AV94Wcwwkp89ds_19_tfprvnom_sel, lV95Wcwwkp89ds_20_tfprdlote, AV96Wcwwkp89ds_21_tfprdlote_sel, Byte.valueOf(AV97Wcwwkp89ds_22_tfvalcod), Byte.valueOf(AV98Wcwwkp89ds_23_tfvalcod_to), Short.valueOf(AV69ValCodfrom), Short.valueOf(AV70ValCodto)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A6301TipPrdCod = P08WA2_A6301TipPrdCod[0] ;
         n6301TipPrdCod = P08WA2_n6301TipPrdCod[0] ;
         A396EmprCod = P08WA2_A396EmprCod[0] ;
         A856ValCod = P08WA2_A856ValCod[0] ;
         A10881PrdLote = P08WA2_A10881PrdLote[0] ;
         A794PrvNom = P08WA2_A794PrvNom[0] ;
         n794PrvNom = P08WA2_n794PrvNom[0] ;
         A795PrvNum = P08WA2_A795PrvNum[0] ;
         A724PrdPreAct = P08WA2_A724PrdPreAct[0] ;
         A732PrdStkMinU = P08WA2_A732PrdStkMinU[0] ;
         A13457PrdUbicaci = P08WA2_A13457PrdUbicaci[0] ;
         A728PrdRefPrv = P08WA2_A728PrdRefPrv[0] ;
         A6302TipPrdDsc = P08WA2_A6302TipPrdDsc[0] ;
         n6302TipPrdDsc = P08WA2_n6302TipPrdDsc[0] ;
         A718PrdNom = P08WA2_A718PrdNom[0] ;
         A719PrdNum = P08WA2_A719PrdNum[0] ;
         A704PrdExiAlm = P08WA2_A704PrdExiAlm[0] ;
         A685PrdCanRes = P08WA2_A685PrdCanRes[0] ;
         A6302TipPrdDsc = P08WA2_A6302TipPrdDsc[0] ;
         n6302TipPrdDsc = P08WA2_n6302TipPrdDsc[0] ;
         A794PrvNom = P08WA2_A794PrvNom[0] ;
         n794PrvNom = P08WA2_n794PrvNom[0] ;
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
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A719PrdNum, ";", ","), GXv_char3) ;
            wcwwkp89exportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A718PrdNom, ";", ","), GXv_char3) ;
            wcwwkp89exportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A6302TipPrdDsc, ";", ","), GXv_char3) ;
            wcwwkp89exportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A728PrdRefPrv, ";", ","), GXv_char3) ;
            wcwwkp89exportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13457PrdUbicaci, ";", ","), GXv_char3) ;
            wcwwkp89exportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A732PrdStkMinU, 8, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXv_char3[0] = A396EmprCod ;
            GXv_char4[0] = A719PrdNum ;
            GXv_char5[0] = A719PrdNum ;
            GXv_decimal6[0] = AV31CantInv ;
            GXv_decimal7[0] = AV32Compras ;
            GXv_decimal8[0] = AV33Consumos ;
            GXv_decimal9[0] = AV99Compras2 ;
            GXv_decimal10[0] = AV100Consumos2 ;
            GXv_char11[0] = AV65obsp ;
            new app.pupq010(remoteHandle, context).execute( GXv_char3, GXv_char4, GXv_char5, GXv_decimal6, GXv_decimal7, GXv_decimal8, GXv_decimal9, GXv_decimal10, GXv_char11) ;
            wcwwkp89exportcsv_impl.this.A396EmprCod = GXv_char3[0] ;
            wcwwkp89exportcsv_impl.this.A719PrdNum = GXv_char4[0] ;
            wcwwkp89exportcsv_impl.this.A719PrdNum = GXv_char5[0] ;
            wcwwkp89exportcsv_impl.this.AV31CantInv = GXv_decimal6[0] ;
            wcwwkp89exportcsv_impl.this.AV32Compras = GXv_decimal7[0] ;
            wcwwkp89exportcsv_impl.this.AV33Consumos = GXv_decimal8[0] ;
            wcwwkp89exportcsv_impl.this.AV99Compras2 = GXv_decimal9[0] ;
            wcwwkp89exportcsv_impl.this.AV100Consumos2 = GXv_decimal10[0] ;
            wcwwkp89exportcsv_impl.this.AV65obsp = GXv_char11[0] ;
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( AV31CantInv, 12, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( AV32Compras, 12, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( AV33Consumos, 12, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXv_char11[0] = A396EmprCod ;
            GXv_char5[0] = A719PrdNum ;
            GXv_decimal10[0] = AV101Cantres ;
            GXv_decimal9[0] = AV35CantPesada ;
            GXv_decimal8[0] = AV102Cantpdte ;
            GXv_char4[0] = AV66Incicpedid ;
            new app.pprc175(remoteHandle, context).execute( GXv_char11, GXv_char5, GXv_decimal10, GXv_decimal9, GXv_decimal8, GXv_char4) ;
            wcwwkp89exportcsv_impl.this.A396EmprCod = GXv_char11[0] ;
            wcwwkp89exportcsv_impl.this.A719PrdNum = GXv_char5[0] ;
            wcwwkp89exportcsv_impl.this.AV101Cantres = GXv_decimal10[0] ;
            wcwwkp89exportcsv_impl.this.AV35CantPesada = GXv_decimal9[0] ;
            wcwwkp89exportcsv_impl.this.AV102Cantpdte = GXv_decimal8[0] ;
            wcwwkp89exportcsv_impl.this.AV66Incicpedid = GXv_char4[0] ;
            AV34PrdExiAlm = A704PrdExiAlm.subtract(AV35CantPesada) ;
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( AV34PrdExiAlm, 12, 4) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( AV35CantPesada, 12, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV36stockTotal = AV34PrdExiAlm.add(AV35CantPesada) ;
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( AV36stockTotal, 12, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV37PrdCanRes = A685PrdCanRes.subtract(AV35CantPesada) ;
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( AV37PrdCanRes, 12, 4) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV38StockDisponible = A704PrdExiAlm.subtract(AV37PrdCanRes) ;
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( AV38StockDisponible, 12, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A724PrdPreAct, 14, 5) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV58valor0 = (AV34PrdExiAlm.add(AV35CantPesada)).multiply(A724PrdPreAct) ;
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( AV58valor0, 10, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A795PrvNum, 6, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char11[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A794PrvNom, ";", ","), GXv_char11) ;
            wcwwkp89exportcsv_impl.this.GXt_char2 = GXv_char11[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char11[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A10881PrdLote, ";", ","), GXv_char11) ;
            wcwwkp89exportcsv_impl.this.GXt_char2 = GXv_char11[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A856ValCod, 1, 0) ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=WCWWkp89ExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "PrdNum", "", "Producto", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "PrdNom", "", "Descripcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "TipPrdDsc", "", "Familia", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "PrdRefPrv", "", "Uso", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "PrdUbicacion", "", "Ubicacion", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "PrdStkMinU", "", "Unidades Stock Minimo", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "&CantInv", "", "Stock Inicial", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "&Compras", "", "Compras", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "&Consumos", "", "Consumos", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "&PrdExiAlm", "", "Stock Piso", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "&CantPesada", "", "Stock Pesado", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "&stockTotal", "", "Stock Total", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "&PrdCanRes", "", "Reservas", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "&StockDisponible", "", "Stock Disponible", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "PrdPreAct", "", "Precio Actual", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "&valor0", "", "Valor Stock", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "PrvNum", "", "Codigo Proveedor", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "PrvNom", "", "Nombre Proveedor", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "PrdLote", "", "Lote", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "ValCod", "", "Validez", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char11[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WCWWkp89ColumnsSelector", GXv_char11) ;
      wcwwkp89exportcsv_impl.this.GXt_char2 = GXv_char11[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("WCWWkp89GridState"), "") == 0 )
      {
         AV40GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCWWkp89GridState"), null, null);
      }
      else
      {
         AV40GridState.fromxml(AV19Session.getValue("WCWWkp89GridState"), null, null);
      }
      AV28OrderedBy = AV40GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV40GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV103GXV1 = 1 ;
      while ( AV103GXV1 <= AV40GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV41GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV40GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV103GXV1));
         if ( GXutil.strcmp(AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV30FilterFullText = AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV42TFPrdNum = AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV43TFPrdNum_Sel = AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV44TFPrdNom = AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV45TFPrdNom_Sel = AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPPRDDSC") == 0 )
         {
            AV46TFTipPrdDsc = AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPPRDDSC_SEL") == 0 )
         {
            AV47TFTipPrdDsc_Sel = AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDREFPRV") == 0 )
         {
            AV48TFPrdRefPrv = AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDREFPRV_SEL") == 0 )
         {
            AV49TFPrdRefPrv_Sel = AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDUBICACION") == 0 )
         {
            AV50TFPrdUbicacion = AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDUBICACION_SEL") == 0 )
         {
            AV51TFPrdUbicacion_Sel = AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDSTKMINU") == 0 )
         {
            AV52TFPrdStkMinU = CommonUtil.decimalVal( AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV53TFPrdStkMinU_To = CommonUtil.decimalVal( AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDPREACT") == 0 )
         {
            AV59TFPrdPreAct = CommonUtil.decimalVal( AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV60TFPrdPreAct_To = CommonUtil.decimalVal( AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNUM") == 0 )
         {
            AV61TFPrvNum = (int)(GXutil.lval( AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV62TFPrvNum_To = (int)(GXutil.lval( AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNOM") == 0 )
         {
            AV63TFPrvNom = AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNOM_SEL") == 0 )
         {
            AV64TFPrvNom_Sel = AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDLOTE") == 0 )
         {
            AV67TFPrdLote = AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDLOTE_SEL") == 0 )
         {
            AV68TFPrdLote_Sel = AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFVALCOD") == 0 )
         {
            AV71TFValCod = (byte)(GXutil.lval( AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV72TFValCod_To = (byte)(GXutil.lval( AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV54Emprcod = AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRDNUM") == 0 )
         {
            AV55Prdnum = AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRDNUM_TO") == 0 )
         {
            AV56Prdnum_to = AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&VALCODFROM") == 0 )
         {
            AV69ValCodfrom = (short)(GXutil.lval( AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&VALCODTO") == 0 )
         {
            AV70ValCodto = (short)(GXutil.lval( AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&SELECCION") == 0 )
         {
            AV57Seleccion = (byte)(GXutil.lval( AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV103GXV1 = (int)(AV103GXV1+1) ;
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
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      A6302TipPrdDsc = "" ;
      A728PrdRefPrv = "" ;
      A13457PrdUbicaci = "" ;
      A732PrdStkMinU = DecimalUtil.ZERO ;
      A396EmprCod = "" ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A794PrvNom = "" ;
      A10881PrdLote = "" ;
      AV76Wcwwkp89ds_1_filterfulltext = "" ;
      AV30FilterFullText = "" ;
      AV77Wcwwkp89ds_2_tfprdnum = "" ;
      AV42TFPrdNum = "" ;
      AV78Wcwwkp89ds_3_tfprdnum_sel = "" ;
      AV43TFPrdNum_Sel = "" ;
      AV79Wcwwkp89ds_4_tfprdnom = "" ;
      AV44TFPrdNom = "" ;
      AV80Wcwwkp89ds_5_tfprdnom_sel = "" ;
      AV45TFPrdNom_Sel = "" ;
      AV81Wcwwkp89ds_6_tftipprddsc = "" ;
      AV46TFTipPrdDsc = "" ;
      AV82Wcwwkp89ds_7_tftipprddsc_sel = "" ;
      AV47TFTipPrdDsc_Sel = "" ;
      AV83Wcwwkp89ds_8_tfprdrefprv = "" ;
      AV48TFPrdRefPrv = "" ;
      AV84Wcwwkp89ds_9_tfprdrefprv_sel = "" ;
      AV49TFPrdRefPrv_Sel = "" ;
      AV85Wcwwkp89ds_10_tfprdubicacion = "" ;
      AV50TFPrdUbicacion = "" ;
      AV86Wcwwkp89ds_11_tfprdubicacion_sel = "" ;
      AV51TFPrdUbicacion_Sel = "" ;
      AV87Wcwwkp89ds_12_tfprdstkminu = DecimalUtil.ZERO ;
      AV52TFPrdStkMinU = DecimalUtil.ZERO ;
      AV88Wcwwkp89ds_13_tfprdstkminu_to = DecimalUtil.ZERO ;
      AV53TFPrdStkMinU_To = DecimalUtil.ZERO ;
      AV89Wcwwkp89ds_14_tfprdpreact = DecimalUtil.ZERO ;
      AV59TFPrdPreAct = DecimalUtil.ZERO ;
      AV90Wcwwkp89ds_15_tfprdpreact_to = DecimalUtil.ZERO ;
      AV60TFPrdPreAct_To = DecimalUtil.ZERO ;
      AV93Wcwwkp89ds_18_tfprvnom = "" ;
      AV63TFPrvNom = "" ;
      AV94Wcwwkp89ds_19_tfprvnom_sel = "" ;
      AV64TFPrvNom_Sel = "" ;
      AV95Wcwwkp89ds_20_tfprdlote = "" ;
      AV67TFPrdLote = "" ;
      AV96Wcwwkp89ds_21_tfprdlote_sel = "" ;
      AV68TFPrdLote_Sel = "" ;
      scmdbuf = "" ;
      lV76Wcwwkp89ds_1_filterfulltext = "" ;
      lV77Wcwwkp89ds_2_tfprdnum = "" ;
      lV79Wcwwkp89ds_4_tfprdnom = "" ;
      lV81Wcwwkp89ds_6_tftipprddsc = "" ;
      lV83Wcwwkp89ds_8_tfprdrefprv = "" ;
      lV85Wcwwkp89ds_10_tfprdubicacion = "" ;
      lV93Wcwwkp89ds_18_tfprvnom = "" ;
      lV95Wcwwkp89ds_20_tfprdlote = "" ;
      AV54Emprcod = "" ;
      AV55Prdnum = "" ;
      AV56Prdnum_to = "" ;
      P08WA2_A6301TipPrdCod = new short[1] ;
      P08WA2_n6301TipPrdCod = new boolean[] {false} ;
      P08WA2_A396EmprCod = new String[] {""} ;
      P08WA2_A856ValCod = new byte[1] ;
      P08WA2_A10881PrdLote = new String[] {""} ;
      P08WA2_A794PrvNom = new String[] {""} ;
      P08WA2_n794PrvNom = new boolean[] {false} ;
      P08WA2_A795PrvNum = new int[1] ;
      P08WA2_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08WA2_A732PrdStkMinU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08WA2_A13457PrdUbicaci = new String[] {""} ;
      P08WA2_A728PrdRefPrv = new String[] {""} ;
      P08WA2_A6302TipPrdDsc = new String[] {""} ;
      P08WA2_n6302TipPrdDsc = new boolean[] {false} ;
      P08WA2_A718PrdNom = new String[] {""} ;
      P08WA2_A719PrdNum = new String[] {""} ;
      P08WA2_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08WA2_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      GXv_char3 = new String[1] ;
      AV31CantInv = DecimalUtil.ZERO ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      AV32Compras = DecimalUtil.ZERO ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      AV33Consumos = DecimalUtil.ZERO ;
      AV99Compras2 = DecimalUtil.ZERO ;
      AV100Consumos2 = DecimalUtil.ZERO ;
      AV65obsp = "" ;
      GXv_char5 = new String[1] ;
      AV101Cantres = DecimalUtil.ZERO ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      AV35CantPesada = DecimalUtil.ZERO ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      AV102Cantpdte = DecimalUtil.ZERO ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      AV66Incicpedid = "" ;
      GXv_char4 = new String[1] ;
      AV34PrdExiAlm = DecimalUtil.ZERO ;
      AV36stockTotal = DecimalUtil.ZERO ;
      AV37PrdCanRes = DecimalUtil.ZERO ;
      AV38StockDisponible = DecimalUtil.ZERO ;
      AV58valor0 = DecimalUtil.ZERO ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char11 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector12 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector13 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV40GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV41GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcwwkp89exportcsv__default(),
         new Object[] {
             new Object[] {
            P08WA2_A6301TipPrdCod, P08WA2_n6301TipPrdCod, P08WA2_A396EmprCod, P08WA2_A856ValCod, P08WA2_A10881PrdLote, P08WA2_A794PrvNom, P08WA2_n794PrvNom, P08WA2_A795PrvNum, P08WA2_A724PrdPreAct, P08WA2_A732PrdStkMinU,
            P08WA2_A13457PrdUbicaci, P08WA2_A728PrdRefPrv, P08WA2_A6302TipPrdDsc, P08WA2_n6302TipPrdDsc, P08WA2_A718PrdNom, P08WA2_A719PrdNum, P08WA2_A704PrdExiAlm, P08WA2_A685PrdCanRes
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A856ValCod ;
   private byte AV97Wcwwkp89ds_22_tfvalcod ;
   private byte AV71TFValCod ;
   private byte AV98Wcwwkp89ds_23_tfvalcod_to ;
   private byte AV72TFValCod_To ;
   private byte AV57Seleccion ;
   private short gxcookieaux ;
   private short AV69ValCodfrom ;
   private short AV70ValCodto ;
   private short AV28OrderedBy ;
   private short A6301TipPrdCod ;
   private short Gx_err ;
   private int AV13Random ;
   private int A795PrvNum ;
   private int AV91Wcwwkp89ds_16_tfprvnum ;
   private int AV61TFPrvNum ;
   private int AV92Wcwwkp89ds_17_tfprvnum_to ;
   private int AV62TFPrvNum_To ;
   private int AV103GXV1 ;
   private java.math.BigDecimal A732PrdStkMinU ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A685PrdCanRes ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal AV87Wcwwkp89ds_12_tfprdstkminu ;
   private java.math.BigDecimal AV52TFPrdStkMinU ;
   private java.math.BigDecimal AV88Wcwwkp89ds_13_tfprdstkminu_to ;
   private java.math.BigDecimal AV53TFPrdStkMinU_To ;
   private java.math.BigDecimal AV89Wcwwkp89ds_14_tfprdpreact ;
   private java.math.BigDecimal AV59TFPrdPreAct ;
   private java.math.BigDecimal AV90Wcwwkp89ds_15_tfprdpreact_to ;
   private java.math.BigDecimal AV60TFPrdPreAct_To ;
   private java.math.BigDecimal AV31CantInv ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private java.math.BigDecimal AV32Compras ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private java.math.BigDecimal AV33Consumos ;
   private java.math.BigDecimal AV99Compras2 ;
   private java.math.BigDecimal AV100Consumos2 ;
   private java.math.BigDecimal AV101Cantres ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private java.math.BigDecimal AV35CantPesada ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal AV102Cantpdte ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal AV34PrdExiAlm ;
   private java.math.BigDecimal AV36stockTotal ;
   private java.math.BigDecimal AV37PrdCanRes ;
   private java.math.BigDecimal AV38StockDisponible ;
   private java.math.BigDecimal AV58valor0 ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String A6302TipPrdDsc ;
   private String A728PrdRefPrv ;
   private String A13457PrdUbicaci ;
   private String A396EmprCod ;
   private String A794PrvNom ;
   private String A10881PrdLote ;
   private String AV77Wcwwkp89ds_2_tfprdnum ;
   private String AV42TFPrdNum ;
   private String AV78Wcwwkp89ds_3_tfprdnum_sel ;
   private String AV43TFPrdNum_Sel ;
   private String AV79Wcwwkp89ds_4_tfprdnom ;
   private String AV44TFPrdNom ;
   private String AV80Wcwwkp89ds_5_tfprdnom_sel ;
   private String AV45TFPrdNom_Sel ;
   private String AV81Wcwwkp89ds_6_tftipprddsc ;
   private String AV46TFTipPrdDsc ;
   private String AV82Wcwwkp89ds_7_tftipprddsc_sel ;
   private String AV47TFTipPrdDsc_Sel ;
   private String AV83Wcwwkp89ds_8_tfprdrefprv ;
   private String AV48TFPrdRefPrv ;
   private String AV84Wcwwkp89ds_9_tfprdrefprv_sel ;
   private String AV49TFPrdRefPrv_Sel ;
   private String AV85Wcwwkp89ds_10_tfprdubicacion ;
   private String AV50TFPrdUbicacion ;
   private String AV86Wcwwkp89ds_11_tfprdubicacion_sel ;
   private String AV51TFPrdUbicacion_Sel ;
   private String AV93Wcwwkp89ds_18_tfprvnom ;
   private String AV63TFPrvNom ;
   private String AV94Wcwwkp89ds_19_tfprvnom_sel ;
   private String AV64TFPrvNom_Sel ;
   private String AV95Wcwwkp89ds_20_tfprdlote ;
   private String AV67TFPrdLote ;
   private String AV96Wcwwkp89ds_21_tfprdlote_sel ;
   private String AV68TFPrdLote_Sel ;
   private String scmdbuf ;
   private String lV77Wcwwkp89ds_2_tfprdnum ;
   private String lV79Wcwwkp89ds_4_tfprdnom ;
   private String lV81Wcwwkp89ds_6_tftipprddsc ;
   private String lV83Wcwwkp89ds_8_tfprdrefprv ;
   private String lV85Wcwwkp89ds_10_tfprdubicacion ;
   private String lV93Wcwwkp89ds_18_tfprvnom ;
   private String lV95Wcwwkp89ds_20_tfprdlote ;
   private String AV54Emprcod ;
   private String AV55Prdnum ;
   private String AV56Prdnum_to ;
   private String GXv_char3[] ;
   private String AV65obsp ;
   private String GXv_char5[] ;
   private String AV66Incicpedid ;
   private String GXv_char4[] ;
   private String GXt_char2 ;
   private String GXv_char11[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean n6301TipPrdCod ;
   private boolean n794PrvNom ;
   private boolean n6302TipPrdDsc ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV76Wcwwkp89ds_1_filterfulltext ;
   private String AV30FilterFullText ;
   private String lV76Wcwwkp89ds_1_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private short[] P08WA2_A6301TipPrdCod ;
   private boolean[] P08WA2_n6301TipPrdCod ;
   private String[] P08WA2_A396EmprCod ;
   private byte[] P08WA2_A856ValCod ;
   private String[] P08WA2_A10881PrdLote ;
   private String[] P08WA2_A794PrvNom ;
   private boolean[] P08WA2_n794PrvNom ;
   private int[] P08WA2_A795PrvNum ;
   private java.math.BigDecimal[] P08WA2_A724PrdPreAct ;
   private java.math.BigDecimal[] P08WA2_A732PrdStkMinU ;
   private String[] P08WA2_A13457PrdUbicaci ;
   private String[] P08WA2_A728PrdRefPrv ;
   private String[] P08WA2_A6302TipPrdDsc ;
   private boolean[] P08WA2_n6302TipPrdDsc ;
   private String[] P08WA2_A718PrdNom ;
   private String[] P08WA2_A719PrdNum ;
   private java.math.BigDecimal[] P08WA2_A704PrdExiAlm ;
   private java.math.BigDecimal[] P08WA2_A685PrdCanRes ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector12[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector13[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV40GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV41GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
}

final  class wcwwkp89exportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08WA2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV76Wcwwkp89ds_1_filterfulltext ,
                                          String AV78Wcwwkp89ds_3_tfprdnum_sel ,
                                          String AV77Wcwwkp89ds_2_tfprdnum ,
                                          String AV80Wcwwkp89ds_5_tfprdnom_sel ,
                                          String AV79Wcwwkp89ds_4_tfprdnom ,
                                          String AV82Wcwwkp89ds_7_tftipprddsc_sel ,
                                          String AV81Wcwwkp89ds_6_tftipprddsc ,
                                          String AV84Wcwwkp89ds_9_tfprdrefprv_sel ,
                                          String AV83Wcwwkp89ds_8_tfprdrefprv ,
                                          String AV86Wcwwkp89ds_11_tfprdubicacion_sel ,
                                          String AV85Wcwwkp89ds_10_tfprdubicacion ,
                                          java.math.BigDecimal AV87Wcwwkp89ds_12_tfprdstkminu ,
                                          java.math.BigDecimal AV88Wcwwkp89ds_13_tfprdstkminu_to ,
                                          java.math.BigDecimal AV89Wcwwkp89ds_14_tfprdpreact ,
                                          java.math.BigDecimal AV90Wcwwkp89ds_15_tfprdpreact_to ,
                                          int AV91Wcwwkp89ds_16_tfprvnum ,
                                          int AV92Wcwwkp89ds_17_tfprvnum_to ,
                                          String AV94Wcwwkp89ds_19_tfprvnom_sel ,
                                          String AV93Wcwwkp89ds_18_tfprvnom ,
                                          String AV96Wcwwkp89ds_21_tfprdlote_sel ,
                                          String AV95Wcwwkp89ds_20_tfprdlote ,
                                          byte AV97Wcwwkp89ds_22_tfvalcod ,
                                          byte AV98Wcwwkp89ds_23_tfvalcod_to ,
                                          short AV69ValCodfrom ,
                                          short AV70ValCodto ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          String A6302TipPrdDsc ,
                                          String A728PrdRefPrv ,
                                          String A13457PrdUbicaci ,
                                          java.math.BigDecimal A732PrdStkMinU ,
                                          java.math.BigDecimal A724PrdPreAct ,
                                          int A795PrvNum ,
                                          String A794PrvNom ,
                                          String A10881PrdLote ,
                                          byte A856ValCod ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc ,
                                          String AV54Emprcod ,
                                          String AV55Prdnum ,
                                          String A396EmprCod ,
                                          String AV56Prdnum_to )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[38];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT T1.TipPrdCod, T1.EmprCod, T1.ValCod, T1.PrdLote, T3.PrvNom, T1.PrvNum, T1.PrdPreAct, T1.PrdStkMinU, T1.PrdUbicaci, T1.PrdRefPrv, T2.TipPrdDsc, T1.PrdNom," ;
      scmdbuf += " T1.PrdNum, T1.PrdExiAlm, T1.PrdCanRes FROM ((TXPPRODUC T1 LEFT JOIN TXPTIPPRD T2 ON T2.EmprCod = T1.EmprCod AND T2.TipPrdCod = T1.TipPrdCod) INNER JOIN TXPPRVGEN" ;
      scmdbuf += " T3 ON T3.EmprCod = T1.EmprCod AND T3.PrvNum = T1.PrvNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.PrdNum >= ?)");
      addWhere(sWhereString, "(LENGTH(RTRIM(RTRIM(LTRIM(T1.PrdNum)))) >= 5)");
      addWhere(sWhereString, "(T1.PrdNum <= ?)");
      if ( ! (GXutil.strcmp("", AV76Wcwwkp89ds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T1.PrdNom) like '%' || UPPER(?)) or ( UPPER(T2.TipPrdDsc) like '%' || UPPER(?)) or ( UPPER(T1.PrdRefPrv) like '%' || UPPER(?)) or ( UPPER(T1.PrdUbicaci) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrdStkMinU,'99990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PrdPreAct,'99999990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PrvNum,'999990'), 2) like '%' || ?) or ( UPPER(T3.PrvNom) like '%' || UPPER(?)) or ( UPPER(T1.PrdLote) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ValCod,'90'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int14[3] = (byte)(1) ;
         GXv_int14[4] = (byte)(1) ;
         GXv_int14[5] = (byte)(1) ;
         GXv_int14[6] = (byte)(1) ;
         GXv_int14[7] = (byte)(1) ;
         GXv_int14[8] = (byte)(1) ;
         GXv_int14[9] = (byte)(1) ;
         GXv_int14[10] = (byte)(1) ;
         GXv_int14[11] = (byte)(1) ;
         GXv_int14[12] = (byte)(1) ;
         GXv_int14[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78Wcwwkp89ds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV77Wcwwkp89ds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Wcwwkp89ds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int14[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Wcwwkp89ds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV79Wcwwkp89ds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Wcwwkp89ds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom = ?)");
      }
      else
      {
         GXv_int14[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Wcwwkp89ds_7_tftipprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV81Wcwwkp89ds_6_tftipprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Wcwwkp89ds_7_tftipprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipPrdDsc = ?)");
      }
      else
      {
         GXv_int14[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Wcwwkp89ds_9_tfprdrefprv_sel)==0) && ( ! (GXutil.strcmp("", AV83Wcwwkp89ds_8_tfprdrefprv)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdRefPrv) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Wcwwkp89ds_9_tfprdrefprv_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdRefPrv = ?)");
      }
      else
      {
         GXv_int14[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Wcwwkp89ds_11_tfprdubicacion_sel)==0) && ( ! (GXutil.strcmp("", AV85Wcwwkp89ds_10_tfprdubicacion)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdUbicaci) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Wcwwkp89ds_11_tfprdubicacion_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdUbicaci = ?)");
      }
      else
      {
         GXv_int14[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV87Wcwwkp89ds_12_tfprdstkminu)==0) )
      {
         addWhere(sWhereString, "(T1.PrdStkMinU >= ?)");
      }
      else
      {
         GXv_int14[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV88Wcwwkp89ds_13_tfprdstkminu_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdStkMinU <= ?)");
      }
      else
      {
         GXv_int14[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV89Wcwwkp89ds_14_tfprdpreact)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct >= ?)");
      }
      else
      {
         GXv_int14[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Wcwwkp89ds_15_tfprdpreact_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct <= ?)");
      }
      else
      {
         GXv_int14[27] = (byte)(1) ;
      }
      if ( ! (0==AV91Wcwwkp89ds_16_tfprvnum) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int14[28] = (byte)(1) ;
      }
      if ( ! (0==AV92Wcwwkp89ds_17_tfprvnum_to) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int14[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Wcwwkp89ds_19_tfprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV93Wcwwkp89ds_18_tfprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Wcwwkp89ds_19_tfprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.PrvNom = ?)");
      }
      else
      {
         GXv_int14[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV96Wcwwkp89ds_21_tfprdlote_sel)==0) && ( ! (GXutil.strcmp("", AV95Wcwwkp89ds_20_tfprdlote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Wcwwkp89ds_21_tfprdlote_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdLote = ?)");
      }
      else
      {
         GXv_int14[33] = (byte)(1) ;
      }
      if ( ! (0==AV97Wcwwkp89ds_22_tfvalcod) )
      {
         addWhere(sWhereString, "(T1.ValCod >= ?)");
      }
      else
      {
         GXv_int14[34] = (byte)(1) ;
      }
      if ( ! (0==AV98Wcwwkp89ds_23_tfvalcod_to) )
      {
         addWhere(sWhereString, "(T1.ValCod <= ?)");
      }
      else
      {
         GXv_int14[35] = (byte)(1) ;
      }
      if ( ! (0==AV69ValCodfrom) )
      {
         addWhere(sWhereString, "(T1.ValCod >= ?)");
      }
      else
      {
         GXv_int14[36] = (byte)(1) ;
      }
      if ( ! (0==AV70ValCodto) )
      {
         addWhere(sWhereString, "(T1.ValCod <= ?)");
      }
      else
      {
         GXv_int14[37] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNum" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNum DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNom" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.TipPrdDsc" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.TipPrdDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdRefPrv" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdRefPrv DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdUbicaci" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdUbicaci DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdStkMinU" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdStkMinU DESC" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdPreAct" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdPreAct DESC" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvNum" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvNum DESC" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.PrvNom" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.PrvNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdLote" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdLote DESC" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ValCod" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ValCod DESC" ;
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
                  return conditional_P08WA2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).byteValue() , ((Number) dynConstraints[22]).byteValue() , ((Number) dynConstraints[23]).shortValue() , ((Number) dynConstraints[24]).shortValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).byteValue() , ((Number) dynConstraints[36]).shortValue() , ((Boolean) dynConstraints[37]).booleanValue() , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08WA2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 26);
               ((String[]) buf[5])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(6);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[10])[0] = rslt.getString(9, 20);
               ((String[]) buf[11])[0] = rslt.getString(10, 30);
               ((String[]) buf[12])[0] = rslt.getString(11, 40);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(12, 26);
               ((String[]) buf[15])[0] = rslt.getString(13, 6);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(14,4);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(15,4);
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
                  stmt.setString(sIdx, (String)parms[38], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 6);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 26);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 40);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 40);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 20);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 20);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[62], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[63], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[64], 5);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[65], 5);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[67]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 30);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 26);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 26);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[72]).byteValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[73]).byteValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[74]).shortValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[75]).shortValue());
               }
               return;
      }
   }

}

