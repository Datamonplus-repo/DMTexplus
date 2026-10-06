package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wcwcomproexportcsv_impl extends GXWebProcedure
{
   public wcwcomproexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "WCWcomproExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("WCWcomproColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("WCWcomproColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Proveedor", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Producto", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "N Pedido", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "N Doc", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cantidad", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Precio", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Valor", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Lote", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "N Doc Int", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Observaciones", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV105Wcwcomprods_1_filterfulltext = AV63FilterFullText ;
      AV106Wcwcomprods_2_tfentprvnum = AV36TFEntPrvNum ;
      AV107Wcwcomprods_3_tfentprvnum_to = AV37TFEntPrvNum_To ;
      AV108Wcwcomprods_4_tfentfecent = AV38TFEntFecEnt ;
      AV109Wcwcomprods_5_tfprdnum = AV40TFPrdNum ;
      AV110Wcwcomprods_6_tfprdnum_sel = AV41TFPrdNum_Sel ;
      AV111Wcwcomprods_7_tfprdnom = AV42TFPrdNom ;
      AV112Wcwcomprods_8_tfprdnom_sel = AV43TFPrdNom_Sel ;
      AV113Wcwcomprods_9_tfpedcod = AV44TFPedCod ;
      AV114Wcwcomprods_10_tfpedcod_to = AV45TFPedCod_To ;
      AV115Wcwcomprods_11_tfentunient = AV46TFEntUniEnt ;
      AV116Wcwcomprods_12_tfentunient_to = AV47TFEntUniEnt_To ;
      AV117Wcwcomprods_13_tfentpre = AV48TFEntPre ;
      AV118Wcwcomprods_14_tfentpre_to = AV49TFEntPre_To ;
      AV119Wcwcomprods_15_tfpedvalformula = AV50TFPedValFormula ;
      AV120Wcwcomprods_16_tfpedvalformula_to = AV51TFPedValFormula_To ;
      AV121Wcwcomprods_17_tfentlotn = AV52TFEntLotN ;
      AV122Wcwcomprods_18_tfentlotn_sel = AV53TFEntLotN_Sel ;
      AV123Wcwcomprods_19_tfentremnro = AV54TFEntRemNro ;
      AV124Wcwcomprods_20_tfentremnro_sel = AV55TFEntRemNro_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV105Wcwcomprods_1_filterfulltext ,
                                           Integer.valueOf(AV106Wcwcomprods_2_tfentprvnum) ,
                                           Integer.valueOf(AV107Wcwcomprods_3_tfentprvnum_to) ,
                                           AV108Wcwcomprods_4_tfentfecent ,
                                           AV110Wcwcomprods_6_tfprdnum_sel ,
                                           AV109Wcwcomprods_5_tfprdnum ,
                                           AV112Wcwcomprods_8_tfprdnom_sel ,
                                           AV111Wcwcomprods_7_tfprdnom ,
                                           Integer.valueOf(AV113Wcwcomprods_9_tfpedcod) ,
                                           Integer.valueOf(AV114Wcwcomprods_10_tfpedcod_to) ,
                                           AV115Wcwcomprods_11_tfentunient ,
                                           AV116Wcwcomprods_12_tfentunient_to ,
                                           AV117Wcwcomprods_13_tfentpre ,
                                           AV118Wcwcomprods_14_tfentpre_to ,
                                           AV119Wcwcomprods_15_tfpedvalformula ,
                                           AV120Wcwcomprods_16_tfpedvalformula_to ,
                                           AV122Wcwcomprods_18_tfentlotn_sel ,
                                           AV121Wcwcomprods_17_tfentlotn ,
                                           AV124Wcwcomprods_20_tfentremnro_sel ,
                                           AV123Wcwcomprods_19_tfentremnro ,
                                           Integer.valueOf(A6156EntPrvNum) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           Integer.valueOf(A658PedCod) ,
                                           A418EntUniEnt ,
                                           A417EntPre ,
                                           A669PedUni ,
                                           A665PedPre ,
                                           A660PedDto ,
                                           A5686EntLotN ,
                                           A10187EntRemNro ,
                                           A415EntFecEnt ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) ,
                                           AV57EntFecEnt ,
                                           AV58EntFecEnt_to ,
                                           Integer.valueOf(AV59PrvNum) ,
                                           Integer.valueOf(AV60PrvNum_to) ,
                                           A11Albaran ,
                                           AV56Emprcod ,
                                           AV61Prdnum ,
                                           A396EmprCod ,
                                           AV62Prdnum_to } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV105Wcwcomprods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Wcwcomprods_1_filterfulltext), "%", "") ;
      lV105Wcwcomprods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Wcwcomprods_1_filterfulltext), "%", "") ;
      lV105Wcwcomprods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Wcwcomprods_1_filterfulltext), "%", "") ;
      lV105Wcwcomprods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Wcwcomprods_1_filterfulltext), "%", "") ;
      lV105Wcwcomprods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Wcwcomprods_1_filterfulltext), "%", "") ;
      lV105Wcwcomprods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Wcwcomprods_1_filterfulltext), "%", "") ;
      lV105Wcwcomprods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Wcwcomprods_1_filterfulltext), "%", "") ;
      lV105Wcwcomprods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Wcwcomprods_1_filterfulltext), "%", "") ;
      lV105Wcwcomprods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Wcwcomprods_1_filterfulltext), "%", "") ;
      lV109Wcwcomprods_5_tfprdnum = GXutil.padr( GXutil.rtrim( AV109Wcwcomprods_5_tfprdnum), 6, "%") ;
      lV111Wcwcomprods_7_tfprdnom = GXutil.padr( GXutil.rtrim( AV111Wcwcomprods_7_tfprdnom), 26, "%") ;
      lV121Wcwcomprods_17_tfentlotn = GXutil.padr( GXutil.rtrim( AV121Wcwcomprods_17_tfentlotn), 26, "%") ;
      lV123Wcwcomprods_19_tfentremnro = GXutil.padr( GXutil.rtrim( AV123Wcwcomprods_19_tfentremnro), 12, "%") ;
      /* Using cursor P08PI2 */
      pr_default.execute(0, new Object[] {AV56Emprcod, AV61Prdnum, AV57EntFecEnt, AV58EntFecEnt_to, Integer.valueOf(AV59PrvNum), Integer.valueOf(AV60PrvNum_to), AV62Prdnum_to, lV105Wcwcomprods_1_filterfulltext, lV105Wcwcomprods_1_filterfulltext, lV105Wcwcomprods_1_filterfulltext, lV105Wcwcomprods_1_filterfulltext, lV105Wcwcomprods_1_filterfulltext, lV105Wcwcomprods_1_filterfulltext, lV105Wcwcomprods_1_filterfulltext, lV105Wcwcomprods_1_filterfulltext, lV105Wcwcomprods_1_filterfulltext, Integer.valueOf(AV106Wcwcomprods_2_tfentprvnum), Integer.valueOf(AV107Wcwcomprods_3_tfentprvnum_to), AV108Wcwcomprods_4_tfentfecent, lV109Wcwcomprods_5_tfprdnum, AV110Wcwcomprods_6_tfprdnum_sel, lV111Wcwcomprods_7_tfprdnom, AV112Wcwcomprods_8_tfprdnom_sel, Integer.valueOf(AV113Wcwcomprods_9_tfpedcod), Integer.valueOf(AV114Wcwcomprods_10_tfpedcod_to), AV115Wcwcomprods_11_tfentunient, AV116Wcwcomprods_12_tfentunient_to, AV117Wcwcomprods_13_tfentpre, AV118Wcwcomprods_14_tfentpre_to, AV119Wcwcomprods_15_tfpedvalformula, AV120Wcwcomprods_16_tfpedvalformula_to, lV121Wcwcomprods_17_tfentlotn, AV122Wcwcomprods_18_tfentlotn_sel, lV123Wcwcomprods_19_tfentremnro, AV124Wcwcomprods_20_tfentremnro_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A658PedCod = P08PI2_A658PedCod[0] ;
         n658PedCod = P08PI2_n658PedCod[0] ;
         A396EmprCod = P08PI2_A396EmprCod[0] ;
         A11Albaran = P08PI2_A11Albaran[0] ;
         A10187EntRemNro = P08PI2_A10187EntRemNro[0] ;
         A5686EntLotN = P08PI2_A5686EntLotN[0] ;
         A417EntPre = P08PI2_A417EntPre[0] ;
         A418EntUniEnt = P08PI2_A418EntUniEnt[0] ;
         A718PrdNom = P08PI2_A718PrdNom[0] ;
         A719PrdNum = P08PI2_A719PrdNum[0] ;
         A415EntFecEnt = P08PI2_A415EntFecEnt[0] ;
         A6156EntPrvNum = P08PI2_A6156EntPrvNum[0] ;
         n6156EntPrvNum = P08PI2_n6156EntPrvNum[0] ;
         A12857EntNAlbar = P08PI2_A12857EntNAlbar[0] ;
         A660PedDto = P08PI2_A660PedDto[0] ;
         A665PedPre = P08PI2_A665PedPre[0] ;
         A669PedUni = P08PI2_A669PedUni[0] ;
         A597LinEnt = P08PI2_A597LinEnt[0] ;
         A718PrdNom = P08PI2_A718PrdNom[0] ;
         A660PedDto = P08PI2_A660PedDto[0] ;
         A665PedPre = P08PI2_A665PedPre[0] ;
         A669PedUni = P08PI2_A669PedUni[0] ;
         A13787PedValForm = GXutil.roundDecimal( (A669PedUni.multiply(A665PedPre)).multiply((DecimalUtil.doubleToDec(1).subtract((A660PedDto.divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))))), 2) ;
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
            AV14TextFileLine += GXutil.str( A6156EntPrvNum, 6, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char2 = AV30PrvNom ;
            GXv_char3[0] = A396EmprCod ;
            GXv_int4[0] = A6156EntPrvNum ;
            GXv_char5[0] = GXt_char2 ;
            new app.pprvnom(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_char5) ;
            wcwcomproexportcsv_impl.this.A396EmprCod = GXv_char3[0] ;
            wcwcomproexportcsv_impl.this.A6156EntPrvNum = GXv_int4[0] ;
            wcwcomproexportcsv_impl.this.GXt_char2 = GXv_char5[0] ;
            AV30PrvNom = GXt_char2 ;
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char5[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV30PrvNom, ";", ","), GXv_char5) ;
            wcwcomproexportcsv_impl.this.GXt_char2 = GXv_char5[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += localUtil.dtoc( A415EntFecEnt, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char5[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A719PrdNum, ";", ","), GXv_char5) ;
            wcwcomproexportcsv_impl.this.GXt_char2 = GXv_char5[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char5[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A718PrdNom, ";", ","), GXv_char5) ;
            wcwcomproexportcsv_impl.this.GXt_char2 = GXv_char5[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A658PedCod, 8, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV31EntNAlbar = ((GXutil.strcmp("", A12857EntNAlbar)==0) ? A11Albaran : A12857EntNAlbar) ;
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char5[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV31EntNAlbar, ";", ","), GXv_char5) ;
            wcwcomproexportcsv_impl.this.GXt_char2 = GXv_char5[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A418EntUniEnt, 9, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A417EntPre, 14, 5) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A13787PedValForm, 12, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char5[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A5686EntLotN, ";", ","), GXv_char5) ;
            wcwcomproexportcsv_impl.this.GXt_char2 = GXv_char5[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char5[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A10187EntRemNro, ";", ","), GXv_char5) ;
            wcwcomproexportcsv_impl.this.GXt_char2 = GXv_char5[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV32Observaciones = "" ;
            /* Using cursor P08PI3 */
            pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod)});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A2502PedObsTxt = P08PI3_A2502PedObsTxt[0] ;
               A2501PedObsLin = P08PI3_A2501PedObsLin[0] ;
               if ( GXutil.strcmp(AV32Observaciones, "") == 0 )
               {
                  AV32Observaciones = A2502PedObsTxt + GXutil.newLine( ) ;
               }
               else
               {
                  AV32Observaciones += A2502PedObsTxt + GXutil.newLine( ) ;
               }
               pr_default.readNext(1);
            }
            pr_default.close(1);
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char5[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV32Observaciones, ";", ","), GXv_char5) ;
            wcwcomproexportcsv_impl.this.GXt_char2 = GXv_char5[0] ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=WCWcomproExportCSV.csv");
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
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "EntPrvNum", "", "Proveedor", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "&PrvNom", "", "Nombre", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "EntFecEnt", "", "Fecha", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrdNum", "", "Producto", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrdNom", "", "Descripcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PedCod", "", "N Pedido", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "&EntNAlbar", "", "N Doc", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "EntUniEnt", "", "Cantidad", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "EntPre", "", "Precio", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PedValFormula", "", "Valor", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "EntLotN", "", "Lote", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "EntRemNro", "", "N Doc Int", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "&Observaciones", "", "Observaciones", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char5[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WCWcomproColumnsSelector", GXv_char5) ;
      wcwcomproexportcsv_impl.this.GXt_char2 = GXv_char5[0] ;
      AV20UserCustomValue = GXt_char2 ;
      if ( ! ( (GXutil.strcmp("", AV20UserCustomValue)==0) ) )
      {
         AV16ColumnsSelectorAux.fromxml(AV20UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector6[0] = AV16ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, GXv_SdtWWPColumnsSelector7) ;
         AV16ColumnsSelectorAux = GXv_SdtWWPColumnsSelector6[0] ;
         AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      }
   }

   public void S191( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue("WCWcomproGridState"), "") == 0 )
      {
         AV34GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCWcomproGridState"), null, null);
      }
      else
      {
         AV34GridState.fromxml(AV19Session.getValue("WCWcomproGridState"), null, null);
      }
      AV28OrderedBy = AV34GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV34GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV126GXV1 = 1 ;
      while ( AV126GXV1 <= AV34GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV35GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV34GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV126GXV1));
         if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV63FilterFullText = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFENTPRVNUM") == 0 )
         {
            AV36TFEntPrvNum = (int)(GXutil.lval( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV37TFEntPrvNum_To = (int)(GXutil.lval( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFENTFECENT") == 0 )
         {
            AV38TFEntFecEnt = localUtil.ctod( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV40TFPrdNum = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV41TFPrdNum_Sel = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV42TFPrdNom = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV43TFPrdNom_Sel = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDCOD") == 0 )
         {
            AV44TFPedCod = (int)(GXutil.lval( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV45TFPedCod_To = (int)(GXutil.lval( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFENTUNIENT") == 0 )
         {
            AV46TFEntUniEnt = CommonUtil.decimalVal( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV47TFEntUniEnt_To = CommonUtil.decimalVal( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFENTPRE") == 0 )
         {
            AV48TFEntPre = CommonUtil.decimalVal( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV49TFEntPre_To = CommonUtil.decimalVal( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDVALFORMULA") == 0 )
         {
            AV50TFPedValFormula = CommonUtil.decimalVal( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV51TFPedValFormula_To = CommonUtil.decimalVal( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFENTLOTN") == 0 )
         {
            AV52TFEntLotN = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFENTLOTN_SEL") == 0 )
         {
            AV53TFEntLotN_Sel = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFENTREMNRO") == 0 )
         {
            AV54TFEntRemNro = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFENTREMNRO_SEL") == 0 )
         {
            AV55TFEntRemNro_Sel = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV56Emprcod = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ENTFECENT") == 0 )
         {
            AV57EntFecEnt = localUtil.ctod( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ENTFECENT_TO") == 0 )
         {
            AV58EntFecEnt_to = localUtil.ctod( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRVNUM") == 0 )
         {
            AV59PrvNum = (int)(GXutil.lval( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRVNUM_TO") == 0 )
         {
            AV60PrvNum_to = (int)(GXutil.lval( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRDNUM") == 0 )
         {
            AV61Prdnum = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRDNUM_TO") == 0 )
         {
            AV62Prdnum_to = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV126GXV1 = (int)(AV126GXV1+1) ;
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
      A415EntFecEnt = GXutil.nullDate() ;
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      A12857EntNAlbar = "" ;
      A11Albaran = "" ;
      A418EntUniEnt = DecimalUtil.ZERO ;
      A417EntPre = DecimalUtil.ZERO ;
      A13787PedValForm = DecimalUtil.ZERO ;
      A5686EntLotN = "" ;
      A10187EntRemNro = "" ;
      AV105Wcwcomprods_1_filterfulltext = "" ;
      AV63FilterFullText = "" ;
      AV108Wcwcomprods_4_tfentfecent = GXutil.nullDate() ;
      AV38TFEntFecEnt = GXutil.nullDate() ;
      AV109Wcwcomprods_5_tfprdnum = "" ;
      AV40TFPrdNum = "" ;
      AV110Wcwcomprods_6_tfprdnum_sel = "" ;
      AV41TFPrdNum_Sel = "" ;
      AV111Wcwcomprods_7_tfprdnom = "" ;
      AV42TFPrdNom = "" ;
      AV112Wcwcomprods_8_tfprdnom_sel = "" ;
      AV43TFPrdNom_Sel = "" ;
      AV115Wcwcomprods_11_tfentunient = DecimalUtil.ZERO ;
      AV46TFEntUniEnt = DecimalUtil.ZERO ;
      AV116Wcwcomprods_12_tfentunient_to = DecimalUtil.ZERO ;
      AV47TFEntUniEnt_To = DecimalUtil.ZERO ;
      AV117Wcwcomprods_13_tfentpre = DecimalUtil.ZERO ;
      AV48TFEntPre = DecimalUtil.ZERO ;
      AV118Wcwcomprods_14_tfentpre_to = DecimalUtil.ZERO ;
      AV49TFEntPre_To = DecimalUtil.ZERO ;
      AV119Wcwcomprods_15_tfpedvalformula = DecimalUtil.ZERO ;
      AV50TFPedValFormula = DecimalUtil.ZERO ;
      AV120Wcwcomprods_16_tfpedvalformula_to = DecimalUtil.ZERO ;
      AV51TFPedValFormula_To = DecimalUtil.ZERO ;
      AV121Wcwcomprods_17_tfentlotn = "" ;
      AV52TFEntLotN = "" ;
      AV122Wcwcomprods_18_tfentlotn_sel = "" ;
      AV53TFEntLotN_Sel = "" ;
      AV123Wcwcomprods_19_tfentremnro = "" ;
      AV54TFEntRemNro = "" ;
      AV124Wcwcomprods_20_tfentremnro_sel = "" ;
      AV55TFEntRemNro_Sel = "" ;
      scmdbuf = "" ;
      lV105Wcwcomprods_1_filterfulltext = "" ;
      lV109Wcwcomprods_5_tfprdnum = "" ;
      lV111Wcwcomprods_7_tfprdnom = "" ;
      lV121Wcwcomprods_17_tfentlotn = "" ;
      lV123Wcwcomprods_19_tfentremnro = "" ;
      A669PedUni = DecimalUtil.ZERO ;
      A665PedPre = DecimalUtil.ZERO ;
      A660PedDto = DecimalUtil.ZERO ;
      AV57EntFecEnt = GXutil.nullDate() ;
      AV58EntFecEnt_to = GXutil.nullDate() ;
      AV56Emprcod = "" ;
      AV61Prdnum = "" ;
      AV62Prdnum_to = "" ;
      P08PI2_A658PedCod = new int[1] ;
      P08PI2_n658PedCod = new boolean[] {false} ;
      P08PI2_A396EmprCod = new String[] {""} ;
      P08PI2_A11Albaran = new String[] {""} ;
      P08PI2_A10187EntRemNro = new String[] {""} ;
      P08PI2_A5686EntLotN = new String[] {""} ;
      P08PI2_A417EntPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08PI2_A418EntUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08PI2_A718PrdNom = new String[] {""} ;
      P08PI2_A719PrdNum = new String[] {""} ;
      P08PI2_A415EntFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P08PI2_A6156EntPrvNum = new int[1] ;
      P08PI2_n6156EntPrvNum = new boolean[] {false} ;
      P08PI2_A12857EntNAlbar = new String[] {""} ;
      P08PI2_A660PedDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08PI2_A665PedPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08PI2_A669PedUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08PI2_A597LinEnt = new short[1] ;
      AV30PrvNom = "" ;
      GXv_char3 = new String[1] ;
      GXv_int4 = new int[1] ;
      AV31EntNAlbar = "" ;
      AV32Observaciones = "" ;
      P08PI3_A396EmprCod = new String[] {""} ;
      P08PI3_A658PedCod = new int[1] ;
      P08PI3_n658PedCod = new boolean[] {false} ;
      P08PI3_A2502PedObsTxt = new String[] {""} ;
      P08PI3_A2501PedObsLin = new byte[1] ;
      A2502PedObsTxt = "" ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char5 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV34GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV35GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcwcomproexportcsv__default(),
         new Object[] {
             new Object[] {
            P08PI2_A658PedCod, P08PI2_n658PedCod, P08PI2_A396EmprCod, P08PI2_A11Albaran, P08PI2_A10187EntRemNro, P08PI2_A5686EntLotN, P08PI2_A417EntPre, P08PI2_A418EntUniEnt, P08PI2_A718PrdNom, P08PI2_A719PrdNum,
            P08PI2_A415EntFecEnt, P08PI2_A6156EntPrvNum, P08PI2_n6156EntPrvNum, P08PI2_A12857EntNAlbar, P08PI2_A660PedDto, P08PI2_A665PedPre, P08PI2_A669PedUni, P08PI2_A597LinEnt
            }
            , new Object[] {
            P08PI3_A396EmprCod, P08PI3_A658PedCod, P08PI3_A2502PedObsTxt, P08PI3_A2501PedObsLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A2501PedObsLin ;
   private short gxcookieaux ;
   private short AV28OrderedBy ;
   private short A597LinEnt ;
   private short Gx_err ;
   private int AV13Random ;
   private int A6156EntPrvNum ;
   private int A658PedCod ;
   private int AV106Wcwcomprods_2_tfentprvnum ;
   private int AV36TFEntPrvNum ;
   private int AV107Wcwcomprods_3_tfentprvnum_to ;
   private int AV37TFEntPrvNum_To ;
   private int AV113Wcwcomprods_9_tfpedcod ;
   private int AV44TFPedCod ;
   private int AV114Wcwcomprods_10_tfpedcod_to ;
   private int AV45TFPedCod_To ;
   private int AV59PrvNum ;
   private int AV60PrvNum_to ;
   private int GXv_int4[] ;
   private int AV126GXV1 ;
   private java.math.BigDecimal A418EntUniEnt ;
   private java.math.BigDecimal A417EntPre ;
   private java.math.BigDecimal A13787PedValForm ;
   private java.math.BigDecimal AV115Wcwcomprods_11_tfentunient ;
   private java.math.BigDecimal AV46TFEntUniEnt ;
   private java.math.BigDecimal AV116Wcwcomprods_12_tfentunient_to ;
   private java.math.BigDecimal AV47TFEntUniEnt_To ;
   private java.math.BigDecimal AV117Wcwcomprods_13_tfentpre ;
   private java.math.BigDecimal AV48TFEntPre ;
   private java.math.BigDecimal AV118Wcwcomprods_14_tfentpre_to ;
   private java.math.BigDecimal AV49TFEntPre_To ;
   private java.math.BigDecimal AV119Wcwcomprods_15_tfpedvalformula ;
   private java.math.BigDecimal AV50TFPedValFormula ;
   private java.math.BigDecimal AV120Wcwcomprods_16_tfpedvalformula_to ;
   private java.math.BigDecimal AV51TFPedValFormula_To ;
   private java.math.BigDecimal A669PedUni ;
   private java.math.BigDecimal A665PedPre ;
   private java.math.BigDecimal A660PedDto ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String A12857EntNAlbar ;
   private String A11Albaran ;
   private String A5686EntLotN ;
   private String A10187EntRemNro ;
   private String AV109Wcwcomprods_5_tfprdnum ;
   private String AV40TFPrdNum ;
   private String AV110Wcwcomprods_6_tfprdnum_sel ;
   private String AV41TFPrdNum_Sel ;
   private String AV111Wcwcomprods_7_tfprdnom ;
   private String AV42TFPrdNom ;
   private String AV112Wcwcomprods_8_tfprdnom_sel ;
   private String AV43TFPrdNom_Sel ;
   private String AV121Wcwcomprods_17_tfentlotn ;
   private String AV52TFEntLotN ;
   private String AV122Wcwcomprods_18_tfentlotn_sel ;
   private String AV53TFEntLotN_Sel ;
   private String AV123Wcwcomprods_19_tfentremnro ;
   private String AV54TFEntRemNro ;
   private String AV124Wcwcomprods_20_tfentremnro_sel ;
   private String AV55TFEntRemNro_Sel ;
   private String scmdbuf ;
   private String lV109Wcwcomprods_5_tfprdnum ;
   private String lV111Wcwcomprods_7_tfprdnom ;
   private String lV121Wcwcomprods_17_tfentlotn ;
   private String lV123Wcwcomprods_19_tfentremnro ;
   private String AV56Emprcod ;
   private String AV61Prdnum ;
   private String AV62Prdnum_to ;
   private String AV30PrvNom ;
   private String GXv_char3[] ;
   private String AV31EntNAlbar ;
   private String AV32Observaciones ;
   private String A2502PedObsTxt ;
   private String GXt_char2 ;
   private String GXv_char5[] ;
   private java.util.Date A415EntFecEnt ;
   private java.util.Date AV108Wcwcomprods_4_tfentfecent ;
   private java.util.Date AV38TFEntFecEnt ;
   private java.util.Date AV57EntFecEnt ;
   private java.util.Date AV58EntFecEnt_to ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean n658PedCod ;
   private boolean n6156EntPrvNum ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV105Wcwcomprods_1_filterfulltext ;
   private String AV63FilterFullText ;
   private String lV105Wcwcomprods_1_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private int[] P08PI2_A658PedCod ;
   private boolean[] P08PI2_n658PedCod ;
   private String[] P08PI2_A396EmprCod ;
   private String[] P08PI2_A11Albaran ;
   private String[] P08PI2_A10187EntRemNro ;
   private String[] P08PI2_A5686EntLotN ;
   private java.math.BigDecimal[] P08PI2_A417EntPre ;
   private java.math.BigDecimal[] P08PI2_A418EntUniEnt ;
   private String[] P08PI2_A718PrdNom ;
   private String[] P08PI2_A719PrdNum ;
   private java.util.Date[] P08PI2_A415EntFecEnt ;
   private int[] P08PI2_A6156EntPrvNum ;
   private boolean[] P08PI2_n6156EntPrvNum ;
   private String[] P08PI2_A12857EntNAlbar ;
   private java.math.BigDecimal[] P08PI2_A660PedDto ;
   private java.math.BigDecimal[] P08PI2_A665PedPre ;
   private java.math.BigDecimal[] P08PI2_A669PedUni ;
   private short[] P08PI2_A597LinEnt ;
   private String[] P08PI3_A396EmprCod ;
   private int[] P08PI3_A658PedCod ;
   private boolean[] P08PI3_n658PedCod ;
   private String[] P08PI3_A2502PedObsTxt ;
   private byte[] P08PI3_A2501PedObsLin ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector6[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV34GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV35GridStateFilterValue ;
}

final  class wcwcomproexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08PI2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV105Wcwcomprods_1_filterfulltext ,
                                          int AV106Wcwcomprods_2_tfentprvnum ,
                                          int AV107Wcwcomprods_3_tfentprvnum_to ,
                                          java.util.Date AV108Wcwcomprods_4_tfentfecent ,
                                          String AV110Wcwcomprods_6_tfprdnum_sel ,
                                          String AV109Wcwcomprods_5_tfprdnum ,
                                          String AV112Wcwcomprods_8_tfprdnom_sel ,
                                          String AV111Wcwcomprods_7_tfprdnom ,
                                          int AV113Wcwcomprods_9_tfpedcod ,
                                          int AV114Wcwcomprods_10_tfpedcod_to ,
                                          java.math.BigDecimal AV115Wcwcomprods_11_tfentunient ,
                                          java.math.BigDecimal AV116Wcwcomprods_12_tfentunient_to ,
                                          java.math.BigDecimal AV117Wcwcomprods_13_tfentpre ,
                                          java.math.BigDecimal AV118Wcwcomprods_14_tfentpre_to ,
                                          java.math.BigDecimal AV119Wcwcomprods_15_tfpedvalformula ,
                                          java.math.BigDecimal AV120Wcwcomprods_16_tfpedvalformula_to ,
                                          String AV122Wcwcomprods_18_tfentlotn_sel ,
                                          String AV121Wcwcomprods_17_tfentlotn ,
                                          String AV124Wcwcomprods_20_tfentremnro_sel ,
                                          String AV123Wcwcomprods_19_tfentremnro ,
                                          int A6156EntPrvNum ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          int A658PedCod ,
                                          java.math.BigDecimal A418EntUniEnt ,
                                          java.math.BigDecimal A417EntPre ,
                                          java.math.BigDecimal A669PedUni ,
                                          java.math.BigDecimal A665PedPre ,
                                          java.math.BigDecimal A660PedDto ,
                                          String A5686EntLotN ,
                                          String A10187EntRemNro ,
                                          java.util.Date A415EntFecEnt ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc ,
                                          java.util.Date AV57EntFecEnt ,
                                          java.util.Date AV58EntFecEnt_to ,
                                          int AV59PrvNum ,
                                          int AV60PrvNum_to ,
                                          String A11Albaran ,
                                          String AV56Emprcod ,
                                          String AV61Prdnum ,
                                          String A396EmprCod ,
                                          String AV62Prdnum_to )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[35];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.PedCod, T1.EmprCod, T1.Albaran, T1.EntRemNro, T1.EntLotN, T1.EntPre, T1.EntUniEnt, T2.PrdNom, T1.PrdNum, T1.EntFecEnt, T1.EntPrvNum, T1.EntNAlbar, T3.PedDto," ;
      scmdbuf += " T3.PedPre, T3.PedUni, T1.LinEnt FROM ((TXPENTALM T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) LEFT JOIN TXPLPEDID T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.PedCod = T1.PedCod AND T3.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.PrdNum >= ?)");
      addWhere(sWhereString, "(T1.EntFecEnt >= ?)");
      addWhere(sWhereString, "(T1.EntFecEnt <= ?)");
      addWhere(sWhereString, "(T1.EntPrvNum >= ?)");
      addWhere(sWhereString, "(T1.EntPrvNum <= ?)");
      addWhere(sWhereString, "(SUBSTR(T1.Albaran, 1, 3) <> 'INV')");
      addWhere(sWhereString, "(SUBSTR(T1.Albaran, 1, 3) <> 'REC')");
      addWhere(sWhereString, "(T1.PrdNum <= ?)");
      if ( ! (GXutil.strcmp("", AV105Wcwcomprods_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.EntPrvNum,'999990'), 2) like '%' || ?) or ( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T2.PrdNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PedCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.EntUniEnt,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.EntPre,'99999990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(ROUND(( T3.PedUni * CAST(T3.PedPre AS NUMERIC(24,10))) * CAST(( 1 - ( CAST(T3.PedDto / 100 AS NUMERIC(15,10)))) AS NUMERIC(28,10)), 2),'999999990.99'), 2) like '%' || ?) or ( UPPER(T1.EntLotN) like '%' || UPPER(?)) or ( UPPER(T1.EntRemNro) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
         GXv_int8[8] = (byte)(1) ;
         GXv_int8[9] = (byte)(1) ;
         GXv_int8[10] = (byte)(1) ;
         GXv_int8[11] = (byte)(1) ;
         GXv_int8[12] = (byte)(1) ;
         GXv_int8[13] = (byte)(1) ;
         GXv_int8[14] = (byte)(1) ;
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (0==AV106Wcwcomprods_2_tfentprvnum) )
      {
         addWhere(sWhereString, "(T1.EntPrvNum >= ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (0==AV107Wcwcomprods_3_tfentprvnum_to) )
      {
         addWhere(sWhereString, "(T1.EntPrvNum <= ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV108Wcwcomprods_4_tfentfecent)) )
      {
         addWhere(sWhereString, "(T1.EntFecEnt >= ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Wcwcomprods_6_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV109Wcwcomprods_5_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Wcwcomprods_6_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Wcwcomprods_8_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV111Wcwcomprods_7_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Wcwcomprods_8_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (0==AV113Wcwcomprods_9_tfpedcod) )
      {
         addWhere(sWhereString, "(T1.PedCod >= ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (0==AV114Wcwcomprods_10_tfpedcod_to) )
      {
         addWhere(sWhereString, "(T1.PedCod <= ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV115Wcwcomprods_11_tfentunient)==0) )
      {
         addWhere(sWhereString, "(T1.EntUniEnt >= ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV116Wcwcomprods_12_tfentunient_to)==0) )
      {
         addWhere(sWhereString, "(T1.EntUniEnt <= ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV117Wcwcomprods_13_tfentpre)==0) )
      {
         addWhere(sWhereString, "(T1.EntPre >= ?)");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV118Wcwcomprods_14_tfentpre_to)==0) )
      {
         addWhere(sWhereString, "(T1.EntPre <= ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV119Wcwcomprods_15_tfpedvalformula)==0) )
      {
         addWhere(sWhereString, "(ROUND(( T3.PedUni * CAST(T3.PedPre AS NUMERIC(24,10))) * CAST(( 1 - ( CAST(T3.PedDto / 100 AS NUMERIC(15,10)))) AS NUMERIC(28,10)), 2) >= ?)");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV120Wcwcomprods_16_tfpedvalformula_to)==0) )
      {
         addWhere(sWhereString, "(ROUND(( T3.PedUni * CAST(T3.PedPre AS NUMERIC(24,10))) * CAST(( 1 - ( CAST(T3.PedDto / 100 AS NUMERIC(15,10)))) AS NUMERIC(28,10)), 2) <= ?)");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV122Wcwcomprods_18_tfentlotn_sel)==0) && ( ! (GXutil.strcmp("", AV121Wcwcomprods_17_tfentlotn)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EntLotN) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV122Wcwcomprods_18_tfentlotn_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EntLotN = ?)");
      }
      else
      {
         GXv_int8[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV124Wcwcomprods_20_tfentremnro_sel)==0) && ( ! (GXutil.strcmp("", AV123Wcwcomprods_19_tfentremnro)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EntRemNro) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV124Wcwcomprods_20_tfentremnro_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EntRemNro = ?)");
      }
      else
      {
         GXv_int8[34] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EntPrvNum" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EntPrvNum DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EntFecEnt" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EntFecEnt DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNum" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNum DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.PrdNom" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.PrdNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PedCod" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PedCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EntUniEnt" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EntUniEnt DESC" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EntPre" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EntPre DESC" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EntLotN" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EntLotN DESC" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EntRemNro" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EntRemNro DESC" ;
      }
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
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
                  return conditional_P08PI2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (java.util.Date)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (java.util.Date)dynConstraints[31] , ((Number) dynConstraints[32]).shortValue() , ((Boolean) dynConstraints[33]).booleanValue() , (java.util.Date)dynConstraints[34] , (java.util.Date)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).intValue() , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08PI2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08PI3", "SELECT EmprCod, PedCod, PedObsTxt, PedObsLin FROM TXPOBSPED WHERE EmprCod = ? and PedCod = ? ORDER BY EmprCod, PedCod, PedObsLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((String[]) buf[3])[0] = rslt.getString(3, 10);
               ((String[]) buf[4])[0] = rslt.getString(4, 12);
               ((String[]) buf[5])[0] = rslt.getString(5, 26);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,5);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[8])[0] = rslt.getString(8, 26);
               ((String[]) buf[9])[0] = rslt.getString(9, 6);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(10);
               ((int[]) buf[11])[0] = rslt.getInt(11);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(12, 20);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(13,2);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(14,5);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(15,2);
               ((short[]) buf[17])[0] = rslt.getShort(16);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
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
                  stmt.setString(sIdx, (String)parms[35], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[37]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[38]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[39]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[53]);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 6);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 6);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 26);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 26);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[62], 5);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[63], 5);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[64], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[65], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 26);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 26);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 12);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 12);
               }
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
      }
   }

}

