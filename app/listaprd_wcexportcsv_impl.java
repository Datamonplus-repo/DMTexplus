package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class listaprd_wcexportcsv_impl extends GXWebProcedure
{
   public listaprd_wcexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "ListaPrd_WCExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("ListaPrd_WCColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("ListaPrd_WCColumnsSelector") ;
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
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Codigo Proveedor", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre Proveedor", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Existencias Almacen", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Existencia Cuarto Color", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Referencia Proveedor", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cantidad Reservada", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Unid.Medida Prod. en Formula", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion Unidad de Compra", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion Unidad Consumo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Factor de Conversion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Validez", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Codigo Producto Auxiliar", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Precio Actual", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Ficha Tecnica?", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha Ficha Tecnica", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Hoja Seguridad?", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha Hoja Seguridad", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "REACH", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "OEKO-TEX", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "GOTS", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "H&M", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+24)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Demanda Quimica Oxigeno", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+25)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "AOX (adsorbable organic halogens)", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+26)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Color Index", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+27)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Tipo Producto", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+28)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+29)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Numero de CAS (Chemical Abstracts Service)", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+30)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Manual RTM (Requirement Tracability Matrix)", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+31)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Formaldeido", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+32)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Airlaminas", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+33)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Apeo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+34)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "PFC", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+35)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "List by Inditex ", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+36)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "N EINECS", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+37)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Funcion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+38)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre Substancia Quimica", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+39)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Densidad Sal Muera (g/l)", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+40)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Tanque", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV51Listaprd_wcds_1_filterfulltext = AV30FilterFullText ;
      AV52Listaprd_wcds_2_tfprdnum = AV35TFPrdNum ;
      AV53Listaprd_wcds_3_tfprdnum_sel = AV36TFPrdNum_Sel ;
      AV54Listaprd_wcds_4_tfprdnom = AV37TFPrdNom ;
      AV55Listaprd_wcds_5_tfprdnom_sel = AV38TFPrdNom_Sel ;
      AV56Listaprd_wcds_6_tfprvnum = AV39TFPrvNum ;
      AV57Listaprd_wcds_7_tfprvnum_to = AV40TFPrvNum_To ;
      AV58Listaprd_wcds_8_tfprvnom = AV41TFPrvNom ;
      AV59Listaprd_wcds_9_tfprvnom_sel = AV42TFPrvNom_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV53Listaprd_wcds_3_tfprdnum_sel ,
                                           AV52Listaprd_wcds_2_tfprdnum ,
                                           AV55Listaprd_wcds_5_tfprdnom_sel ,
                                           AV54Listaprd_wcds_4_tfprdnom ,
                                           Integer.valueOf(AV56Listaprd_wcds_6_tfprvnum) ,
                                           Integer.valueOf(AV57Listaprd_wcds_7_tfprvnum_to) ,
                                           AV59Listaprd_wcds_9_tfprvnom_sel ,
                                           AV58Listaprd_wcds_8_tfprvnom ,
                                           AV43EmprCod ,
                                           AV44PrdNumFrom ,
                                           AV45PrdNumTo ,
                                           Integer.valueOf(AV46PrvNumFrom) ,
                                           Integer.valueOf(AV47PrvNumTo) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           Integer.valueOf(A795PrvNum) ,
                                           A794PrvNom ,
                                           A396EmprCod ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) ,
                                           AV51Listaprd_wcds_1_filterfulltext ,
                                           A704PrdExiAlm ,
                                           A705PrdExiCC ,
                                           A728PrdRefPrv ,
                                           A685PrdCanRes ,
                                           Byte.valueOf(A4338PrdUMeFo) ,
                                           A737PrdUcpDsc ,
                                           A736PrdUcoDsc ,
                                           A707PrdFacCon ,
                                           A857ValDsc ,
                                           A4693PrdNum2 ,
                                           A724PrdPreAct ,
                                           A9739PrdFT ,
                                           A9741PrdHS ,
                                           A5887PrdReach ,
                                           A5888PrdOkotex ,
                                           A11363PrdGots ,
                                           A11364PrdHm ,
                                           Short.valueOf(A1644PrdDqo) ,
                                           A9733PrdAox ,
                                           A10119PrdColIdx ,
                                           Short.valueOf(A6301TipPrdCod) ,
                                           A6302TipPrdDsc ,
                                           A11196PrdNroCAS ,
                                           A10935PrdRTM ,
                                           A10936PrdCtw1 ,
                                           A10937PrdCtw2 ,
                                           A10938PrdCtw3 ,
                                           A11663PrdCtw4 ,
                                           A11687PrdList ,
                                           A11614PrdEINECS ,
                                           A11615PrdFuncion ,
                                           A11616PrdNmQu ,
                                           A5416PrdDensS ,
                                           Byte.valueOf(A3273PrdTnq) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.BYTE
                                           }
      });
      lV52Listaprd_wcds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV52Listaprd_wcds_2_tfprdnum), 6, "%") ;
      lV54Listaprd_wcds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV54Listaprd_wcds_4_tfprdnom), 26, "%") ;
      lV58Listaprd_wcds_8_tfprvnom = GXutil.padr( GXutil.rtrim( AV58Listaprd_wcds_8_tfprvnom), 30, "%") ;
      /* Using cursor P09FB2 */
      pr_default.execute(0, new Object[] {lV52Listaprd_wcds_2_tfprdnum, AV53Listaprd_wcds_3_tfprdnum_sel, lV54Listaprd_wcds_4_tfprdnom, AV55Listaprd_wcds_5_tfprdnom_sel, Integer.valueOf(AV56Listaprd_wcds_6_tfprvnum), Integer.valueOf(AV57Listaprd_wcds_7_tfprvnum_to), lV58Listaprd_wcds_8_tfprvnom, AV59Listaprd_wcds_9_tfprvnom_sel, AV43EmprCod, AV44PrdNumFrom, AV45PrdNumTo, Integer.valueOf(AV46PrvNumFrom), Integer.valueOf(AV47PrvNumTo)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A742PrdUniCom = P09FB2_A742PrdUniCom[0] ;
         A743PrdUniCon = P09FB2_A743PrdUniCon[0] ;
         A856ValCod = P09FB2_A856ValCod[0] ;
         A396EmprCod = P09FB2_A396EmprCod[0] ;
         A3273PrdTnq = P09FB2_A3273PrdTnq[0] ;
         A5416PrdDensS = P09FB2_A5416PrdDensS[0] ;
         A11616PrdNmQu = P09FB2_A11616PrdNmQu[0] ;
         A11615PrdFuncion = P09FB2_A11615PrdFuncion[0] ;
         A11614PrdEINECS = P09FB2_A11614PrdEINECS[0] ;
         A11663PrdCtw4 = P09FB2_A11663PrdCtw4[0] ;
         A10938PrdCtw3 = P09FB2_A10938PrdCtw3[0] ;
         A10937PrdCtw2 = P09FB2_A10937PrdCtw2[0] ;
         A10936PrdCtw1 = P09FB2_A10936PrdCtw1[0] ;
         A10935PrdRTM = P09FB2_A10935PrdRTM[0] ;
         A11196PrdNroCAS = P09FB2_A11196PrdNroCAS[0] ;
         A6302TipPrdDsc = P09FB2_A6302TipPrdDsc[0] ;
         n6302TipPrdDsc = P09FB2_n6302TipPrdDsc[0] ;
         A6301TipPrdCod = P09FB2_A6301TipPrdCod[0] ;
         n6301TipPrdCod = P09FB2_n6301TipPrdCod[0] ;
         A10119PrdColIdx = P09FB2_A10119PrdColIdx[0] ;
         A9733PrdAox = P09FB2_A9733PrdAox[0] ;
         A1644PrdDqo = P09FB2_A1644PrdDqo[0] ;
         A11364PrdHm = P09FB2_A11364PrdHm[0] ;
         A11363PrdGots = P09FB2_A11363PrdGots[0] ;
         A5887PrdReach = P09FB2_A5887PrdReach[0] ;
         A9741PrdHS = P09FB2_A9741PrdHS[0] ;
         A9739PrdFT = P09FB2_A9739PrdFT[0] ;
         A724PrdPreAct = P09FB2_A724PrdPreAct[0] ;
         A4693PrdNum2 = P09FB2_A4693PrdNum2[0] ;
         A857ValDsc = P09FB2_A857ValDsc[0] ;
         n857ValDsc = P09FB2_n857ValDsc[0] ;
         A707PrdFacCon = P09FB2_A707PrdFacCon[0] ;
         A736PrdUcoDsc = P09FB2_A736PrdUcoDsc[0] ;
         n736PrdUcoDsc = P09FB2_n736PrdUcoDsc[0] ;
         A737PrdUcpDsc = P09FB2_A737PrdUcpDsc[0] ;
         n737PrdUcpDsc = P09FB2_n737PrdUcpDsc[0] ;
         A4338PrdUMeFo = P09FB2_A4338PrdUMeFo[0] ;
         A685PrdCanRes = P09FB2_A685PrdCanRes[0] ;
         A728PrdRefPrv = P09FB2_A728PrdRefPrv[0] ;
         A705PrdExiCC = P09FB2_A705PrdExiCC[0] ;
         A704PrdExiAlm = P09FB2_A704PrdExiAlm[0] ;
         A794PrvNom = P09FB2_A794PrvNom[0] ;
         n794PrvNom = P09FB2_n794PrvNom[0] ;
         A795PrvNum = P09FB2_A795PrvNum[0] ;
         A718PrdNom = P09FB2_A718PrdNom[0] ;
         A719PrdNum = P09FB2_A719PrdNum[0] ;
         A11687PrdList = P09FB2_A11687PrdList[0] ;
         A5888PrdOkotex = P09FB2_A5888PrdOkotex[0] ;
         A9742PrdFHS = P09FB2_A9742PrdFHS[0] ;
         A9740PrdFFT = P09FB2_A9740PrdFFT[0] ;
         A737PrdUcpDsc = P09FB2_A737PrdUcpDsc[0] ;
         n737PrdUcpDsc = P09FB2_n737PrdUcpDsc[0] ;
         A736PrdUcoDsc = P09FB2_A736PrdUcoDsc[0] ;
         n736PrdUcoDsc = P09FB2_n736PrdUcoDsc[0] ;
         A857ValDsc = P09FB2_A857ValDsc[0] ;
         n857ValDsc = P09FB2_n857ValDsc[0] ;
         A6302TipPrdDsc = P09FB2_A6302TipPrdDsc[0] ;
         n6302TipPrdDsc = P09FB2_n6302TipPrdDsc[0] ;
         A794PrvNom = P09FB2_A794PrvNom[0] ;
         n794PrvNom = P09FB2_n794PrvNom[0] ;
         if ( (GXutil.strcmp("", AV51Listaprd_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A719PrdNum) , GXutil.padr( "%" + GXutil.upper( AV51Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A718PrdNom) , GXutil.padr( "%" + GXutil.upper( AV51Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A795PrvNum, 6, 0) , GXutil.padr( "%" + AV51Listaprd_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A794PrvNom) , GXutil.padr( "%" + GXutil.upper( AV51Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A704PrdExiAlm, 12, 4) , GXutil.padr( "%" + AV51Listaprd_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A705PrdExiCC, 12, 4) , GXutil.padr( "%" + AV51Listaprd_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A728PrdRefPrv) , GXutil.padr( "%" + GXutil.upper( AV51Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A685PrdCanRes, 12, 4) , GXutil.padr( "%" + AV51Listaprd_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A4338PrdUMeFo, 1, 0) , GXutil.padr( "%" + AV51Listaprd_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A737PrdUcpDsc) , GXutil.padr( "%" + GXutil.upper( AV51Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A736PrdUcoDsc) , GXutil.padr( "%" + GXutil.upper( AV51Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A707PrdFacCon, 7, 4) , GXutil.padr( "%" + AV51Listaprd_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A857ValDsc) , GXutil.padr( "%" + GXutil.upper( AV51Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A4693PrdNum2) , GXutil.padr( "%" + GXutil.upper( AV51Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A724PrdPreAct, 14, 5) , GXutil.padr( "%" + AV51Listaprd_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9739PrdFT) , GXutil.padr( "%" + GXutil.upper( AV51Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9741PrdHS) , GXutil.padr( "%" + GXutil.upper( AV51Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5887PrdReach) , GXutil.padr( "%" + GXutil.upper( AV51Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "n", ""), "") , GXutil.padr( "%" + GXutil.lower( AV51Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A5888PrdOkotex, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "s", ""), "") , GXutil.padr( "%" + GXutil.lower( AV51Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A5888PrdOkotex, httpContext.getMessage( "S", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A11363PrdGots) , GXutil.padr( "%" + GXutil.upper( AV51Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A11364PrdHm) , GXutil.padr( "%" + GXutil.upper( AV51Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1644PrdDqo, 4, 0) , GXutil.padr( "%" + AV51Listaprd_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9733PrdAox, 6, 2) , GXutil.padr( "%" + AV51Listaprd_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A10119PrdColIdx) , GXutil.padr( "%" + GXutil.upper( AV51Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A6301TipPrdCod, 4, 0) , GXutil.padr( "%" + AV51Listaprd_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6302TipPrdDsc) , GXutil.padr( "%" + GXutil.upper( AV51Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A11196PrdNroCAS) , GXutil.padr( "%" + GXutil.upper( AV51Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A10935PrdRTM) , GXutil.padr( "%" + GXutil.upper( AV51Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A10936PrdCtw1) , GXutil.padr( "%" + GXutil.upper( AV51Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A10937PrdCtw2) , GXutil.padr( "%" + GXutil.upper( AV51Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A10938PrdCtw3) , GXutil.padr( "%" + GXutil.upper( AV51Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A11663PrdCtw4) , GXutil.padr( "%" + GXutil.upper( AV51Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "s", ""), "") , GXutil.padr( "%" + GXutil.lower( AV51Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11687PrdList, httpContext.getMessage( "S", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "n", ""), "") , GXutil.padr( "%" + GXutil.lower( AV51Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11687PrdList, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A11614PrdEINECS) , GXutil.padr( "%" + GXutil.upper( AV51Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A11615PrdFuncion) , GXutil.padr( "%" + GXutil.upper( AV51Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A11616PrdNmQu) , GXutil.padr( "%" + GXutil.upper( AV51Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A5416PrdDensS, 7, 3) , GXutil.padr( "%" + AV51Listaprd_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A3273PrdTnq, 2, 0) , GXutil.padr( "%" + AV51Listaprd_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
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
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A719PrdNum, ";", ","), GXv_char3) ;
               listaprd_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A718PrdNom, ";", ","), GXv_char3) ;
               listaprd_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A795PrvNum, 6, 0) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A794PrvNom, ";", ","), GXv_char3) ;
               listaprd_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A704PrdExiAlm, 12, 4) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A705PrdExiCC, 12, 4) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A728PrdRefPrv, ";", ","), GXv_char3) ;
               listaprd_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A685PrdCanRes, 12, 4) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A4338PrdUMeFo, 1, 0) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A737PrdUcpDsc, ";", ","), GXv_char3) ;
               listaprd_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A736PrdUcoDsc, ";", ","), GXv_char3) ;
               listaprd_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A707PrdFacCon, 7, 4) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A857ValDsc, ";", ","), GXv_char3) ;
               listaprd_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A4693PrdNum2, ";", ","), GXv_char3) ;
               listaprd_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A724PrdPreAct, 14, 5) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A9739PrdFT, ";", ","), GXv_char3) ;
               listaprd_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += localUtil.dtoc( A9740PrdFFT, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A9741PrdHS, ";", ","), GXv_char3) ;
               listaprd_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += localUtil.dtoc( A9742PrdFHS, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A5887PrdReach, ";", ","), GXv_char3) ;
               listaprd_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               if ( GXutil.strcmp(GXutil.trim( A5888PrdOkotex), "N") == 0 )
               {
                  AV14TextFileLine += httpContext.getMessage( "N", "") ;
               }
               else if ( GXutil.strcmp(GXutil.trim( A5888PrdOkotex), "S") == 0 )
               {
                  AV14TextFileLine += httpContext.getMessage( "S", "") ;
               }
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A11363PrdGots, ";", ","), GXv_char3) ;
               listaprd_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A11364PrdHm, ";", ","), GXv_char3) ;
               listaprd_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+24)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A1644PrdDqo, 4, 0) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+25)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A9733PrdAox, 6, 2) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+26)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A10119PrdColIdx, ";", ","), GXv_char3) ;
               listaprd_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+27)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A6301TipPrdCod, 4, 0) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+28)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A6302TipPrdDsc, ";", ","), GXv_char3) ;
               listaprd_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+29)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A11196PrdNroCAS, ";", ","), GXv_char3) ;
               listaprd_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+30)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A10935PrdRTM, ";", ","), GXv_char3) ;
               listaprd_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+31)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A10936PrdCtw1, ";", ","), GXv_char3) ;
               listaprd_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+32)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A10937PrdCtw2, ";", ","), GXv_char3) ;
               listaprd_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+33)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A10938PrdCtw3, ";", ","), GXv_char3) ;
               listaprd_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+34)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A11663PrdCtw4, ";", ","), GXv_char3) ;
               listaprd_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+35)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               if ( GXutil.strcmp(GXutil.trim( A11687PrdList), "S") == 0 )
               {
                  AV14TextFileLine += httpContext.getMessage( "S", "") ;
               }
               else if ( GXutil.strcmp(GXutil.trim( A11687PrdList), "N") == 0 )
               {
                  AV14TextFileLine += httpContext.getMessage( "N", "") ;
               }
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+36)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A11614PrdEINECS, ";", ","), GXv_char3) ;
               listaprd_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+37)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A11615PrdFuncion, ";", ","), GXv_char3) ;
               listaprd_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+38)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV31NewLine = GXutil.chr( (short)(10)) ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( GXutil.strReplace( A11616PrdNmQu, ";", ","), AV31NewLine, " "), GXv_char3) ;
               listaprd_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+39)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A5416PrdDensS, 7, 3) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+40)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A3273PrdTnq, 2, 0) ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=ListaPrd_WCExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdNum", "", "Producto", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdNom", "", "Descripcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrvNum", "", "Codigo Proveedor", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrvNom", "", "Nombre Proveedor", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdExiAlm", "", "Existencias Almacen", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdExiCC", "", "Existencia Cuarto Color", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdRefPrv", "", "Referencia Proveedor", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdCanRes", "", "Cantidad Reservada", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdUMeFo", "", "Unid.Medida Prod. en Formula", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdUcpDsc", "", "Descripcion Unidad de Compra", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdUcoDsc", "", "Descripcion Unidad Consumo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdFacCon", "", "Factor de Conversion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ValDsc", "", "Validez", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdNum2", "", "Codigo Producto Auxiliar", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdPreAct", "", "Precio Actual", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdFT", "", "Ficha Tecnica?", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdFFT", "", "Fecha Ficha Tecnica", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdHS", "", "Hoja Seguridad?", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdFHS", "", "Fecha Hoja Seguridad", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdReach", "", "REACH", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdOkotex", "", "OEKO-TEX", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdGots", "", "GOTS", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdHm", "", "H&M", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdDqo", "", "Demanda Quimica Oxigeno", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdAox", "", "AOX (adsorbable organic halogens)", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdColIdx", "", "Color Index", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "TipPrdCod", "", "Tipo Producto", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "TipPrdDsc", "", "Descripcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdNroCAS", "", "Numero de CAS (Chemical Abstracts Service)", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdRTM", "", "Manual RTM (Requirement Tracability Matrix)", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdCtw1", "", "Formaldeido", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdCtw2", "", "Airlaminas", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdCtw3", "", "Apeo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdCtw4", "", "PFC", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdList", "", "List by Inditex ", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdEINECS", "", "N EINECS", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdFuncion", "", "Funcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdNmQu", "", "Nombre Substancia Quimica", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdDensS", "", "Densidad Sal Muera (g/l)", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdTnq", "", "Tanque", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "ListaPrd_WCColumnsSelector", GXv_char3) ;
      listaprd_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("ListaPrd_WCGridState"), "") == 0 )
      {
         AV33GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "ListaPrd_WCGridState"), null, null);
      }
      else
      {
         AV33GridState.fromxml(AV19Session.getValue("ListaPrd_WCGridState"), null, null);
      }
      AV28OrderedBy = AV33GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV33GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV60GXV1 = 1 ;
      while ( AV60GXV1 <= AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV34GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV60GXV1));
         if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV30FilterFullText = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV35TFPrdNum = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV36TFPrdNum_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV37TFPrdNom = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV38TFPrdNom_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNUM") == 0 )
         {
            AV39TFPrvNum = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV40TFPrvNum_To = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNOM") == 0 )
         {
            AV41TFPrvNom = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNOM_SEL") == 0 )
         {
            AV42TFPrvNom_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV60GXV1 = (int)(AV60GXV1+1) ;
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
      A794PrvNom = "" ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A705PrdExiCC = DecimalUtil.ZERO ;
      A728PrdRefPrv = "" ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      A737PrdUcpDsc = "" ;
      A736PrdUcoDsc = "" ;
      A707PrdFacCon = DecimalUtil.ZERO ;
      A857ValDsc = "" ;
      A4693PrdNum2 = "" ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A9739PrdFT = "" ;
      A9740PrdFFT = GXutil.nullDate() ;
      A9741PrdHS = "" ;
      A9742PrdFHS = GXutil.nullDate() ;
      A5887PrdReach = "" ;
      A5888PrdOkotex = "" ;
      A11363PrdGots = "" ;
      A11364PrdHm = "" ;
      A9733PrdAox = DecimalUtil.ZERO ;
      A10119PrdColIdx = "" ;
      A6302TipPrdDsc = "" ;
      A11196PrdNroCAS = "" ;
      A10935PrdRTM = "" ;
      A10936PrdCtw1 = "" ;
      A10937PrdCtw2 = "" ;
      A10938PrdCtw3 = "" ;
      A11663PrdCtw4 = "" ;
      A11687PrdList = "" ;
      A11614PrdEINECS = "" ;
      A11615PrdFuncion = "" ;
      A11616PrdNmQu = "" ;
      A5416PrdDensS = DecimalUtil.ZERO ;
      AV51Listaprd_wcds_1_filterfulltext = "" ;
      AV30FilterFullText = "" ;
      AV52Listaprd_wcds_2_tfprdnum = "" ;
      AV35TFPrdNum = "" ;
      AV53Listaprd_wcds_3_tfprdnum_sel = "" ;
      AV36TFPrdNum_Sel = "" ;
      AV54Listaprd_wcds_4_tfprdnom = "" ;
      AV37TFPrdNom = "" ;
      AV55Listaprd_wcds_5_tfprdnom_sel = "" ;
      AV38TFPrdNom_Sel = "" ;
      AV58Listaprd_wcds_8_tfprvnom = "" ;
      AV41TFPrvNom = "" ;
      AV59Listaprd_wcds_9_tfprvnom_sel = "" ;
      AV42TFPrvNom_Sel = "" ;
      lV51Listaprd_wcds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV52Listaprd_wcds_2_tfprdnum = "" ;
      lV54Listaprd_wcds_4_tfprdnom = "" ;
      lV58Listaprd_wcds_8_tfprvnom = "" ;
      AV43EmprCod = "" ;
      AV44PrdNumFrom = "" ;
      AV45PrdNumTo = "" ;
      A396EmprCod = "" ;
      P09FB2_A742PrdUniCom = new byte[1] ;
      P09FB2_A743PrdUniCon = new byte[1] ;
      P09FB2_A856ValCod = new byte[1] ;
      P09FB2_A396EmprCod = new String[] {""} ;
      P09FB2_A3273PrdTnq = new byte[1] ;
      P09FB2_A5416PrdDensS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09FB2_A11616PrdNmQu = new String[] {""} ;
      P09FB2_A11615PrdFuncion = new String[] {""} ;
      P09FB2_A11614PrdEINECS = new String[] {""} ;
      P09FB2_A11663PrdCtw4 = new String[] {""} ;
      P09FB2_A10938PrdCtw3 = new String[] {""} ;
      P09FB2_A10937PrdCtw2 = new String[] {""} ;
      P09FB2_A10936PrdCtw1 = new String[] {""} ;
      P09FB2_A10935PrdRTM = new String[] {""} ;
      P09FB2_A11196PrdNroCAS = new String[] {""} ;
      P09FB2_A6302TipPrdDsc = new String[] {""} ;
      P09FB2_n6302TipPrdDsc = new boolean[] {false} ;
      P09FB2_A6301TipPrdCod = new short[1] ;
      P09FB2_n6301TipPrdCod = new boolean[] {false} ;
      P09FB2_A10119PrdColIdx = new String[] {""} ;
      P09FB2_A9733PrdAox = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09FB2_A1644PrdDqo = new short[1] ;
      P09FB2_A11364PrdHm = new String[] {""} ;
      P09FB2_A11363PrdGots = new String[] {""} ;
      P09FB2_A5887PrdReach = new String[] {""} ;
      P09FB2_A9741PrdHS = new String[] {""} ;
      P09FB2_A9739PrdFT = new String[] {""} ;
      P09FB2_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09FB2_A4693PrdNum2 = new String[] {""} ;
      P09FB2_A857ValDsc = new String[] {""} ;
      P09FB2_n857ValDsc = new boolean[] {false} ;
      P09FB2_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09FB2_A736PrdUcoDsc = new String[] {""} ;
      P09FB2_n736PrdUcoDsc = new boolean[] {false} ;
      P09FB2_A737PrdUcpDsc = new String[] {""} ;
      P09FB2_n737PrdUcpDsc = new boolean[] {false} ;
      P09FB2_A4338PrdUMeFo = new byte[1] ;
      P09FB2_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09FB2_A728PrdRefPrv = new String[] {""} ;
      P09FB2_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09FB2_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09FB2_A794PrvNom = new String[] {""} ;
      P09FB2_n794PrvNom = new boolean[] {false} ;
      P09FB2_A795PrvNum = new int[1] ;
      P09FB2_A718PrdNom = new String[] {""} ;
      P09FB2_A719PrdNum = new String[] {""} ;
      P09FB2_A11687PrdList = new String[] {""} ;
      P09FB2_A5888PrdOkotex = new String[] {""} ;
      P09FB2_A9742PrdFHS = new java.util.Date[] {GXutil.nullDate()} ;
      P09FB2_A9740PrdFFT = new java.util.Date[] {GXutil.nullDate()} ;
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
      pr_default = new DataStoreProvider(context, remoteHandle, new app.listaprd_wcexportcsv__default(),
         new Object[] {
             new Object[] {
            P09FB2_A742PrdUniCom, P09FB2_A743PrdUniCon, P09FB2_A856ValCod, P09FB2_A396EmprCod, P09FB2_A3273PrdTnq, P09FB2_A5416PrdDensS, P09FB2_A11616PrdNmQu, P09FB2_A11615PrdFuncion, P09FB2_A11614PrdEINECS, P09FB2_A11663PrdCtw4,
            P09FB2_A10938PrdCtw3, P09FB2_A10937PrdCtw2, P09FB2_A10936PrdCtw1, P09FB2_A10935PrdRTM, P09FB2_A11196PrdNroCAS, P09FB2_A6302TipPrdDsc, P09FB2_n6302TipPrdDsc, P09FB2_A6301TipPrdCod, P09FB2_n6301TipPrdCod, P09FB2_A10119PrdColIdx,
            P09FB2_A9733PrdAox, P09FB2_A1644PrdDqo, P09FB2_A11364PrdHm, P09FB2_A11363PrdGots, P09FB2_A5887PrdReach, P09FB2_A9741PrdHS, P09FB2_A9739PrdFT, P09FB2_A724PrdPreAct, P09FB2_A4693PrdNum2, P09FB2_A857ValDsc,
            P09FB2_n857ValDsc, P09FB2_A707PrdFacCon, P09FB2_A736PrdUcoDsc, P09FB2_n736PrdUcoDsc, P09FB2_A737PrdUcpDsc, P09FB2_n737PrdUcpDsc, P09FB2_A4338PrdUMeFo, P09FB2_A685PrdCanRes, P09FB2_A728PrdRefPrv, P09FB2_A705PrdExiCC,
            P09FB2_A704PrdExiAlm, P09FB2_A794PrvNom, P09FB2_n794PrvNom, P09FB2_A795PrvNum, P09FB2_A718PrdNom, P09FB2_A719PrdNum, P09FB2_A11687PrdList, P09FB2_A5888PrdOkotex, P09FB2_A9742PrdFHS, P09FB2_A9740PrdFFT
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A4338PrdUMeFo ;
   private byte A3273PrdTnq ;
   private byte A742PrdUniCom ;
   private byte A743PrdUniCon ;
   private byte A856ValCod ;
   private short gxcookieaux ;
   private short A1644PrdDqo ;
   private short A6301TipPrdCod ;
   private short AV28OrderedBy ;
   private short Gx_err ;
   private int AV13Random ;
   private int A795PrvNum ;
   private int AV56Listaprd_wcds_6_tfprvnum ;
   private int AV39TFPrvNum ;
   private int AV57Listaprd_wcds_7_tfprvnum_to ;
   private int AV40TFPrvNum_To ;
   private int AV46PrvNumFrom ;
   private int AV47PrvNumTo ;
   private int AV60GXV1 ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A705PrdExiCC ;
   private java.math.BigDecimal A685PrdCanRes ;
   private java.math.BigDecimal A707PrdFacCon ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal A9733PrdAox ;
   private java.math.BigDecimal A5416PrdDensS ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String A794PrvNom ;
   private String A728PrdRefPrv ;
   private String A737PrdUcpDsc ;
   private String A736PrdUcoDsc ;
   private String A857ValDsc ;
   private String A4693PrdNum2 ;
   private String A9739PrdFT ;
   private String A9741PrdHS ;
   private String A5887PrdReach ;
   private String A5888PrdOkotex ;
   private String A11363PrdGots ;
   private String A11364PrdHm ;
   private String A10119PrdColIdx ;
   private String A6302TipPrdDsc ;
   private String A11196PrdNroCAS ;
   private String A10935PrdRTM ;
   private String A10936PrdCtw1 ;
   private String A10937PrdCtw2 ;
   private String A10938PrdCtw3 ;
   private String A11663PrdCtw4 ;
   private String A11687PrdList ;
   private String A11614PrdEINECS ;
   private String A11615PrdFuncion ;
   private String AV52Listaprd_wcds_2_tfprdnum ;
   private String AV35TFPrdNum ;
   private String AV53Listaprd_wcds_3_tfprdnum_sel ;
   private String AV36TFPrdNum_Sel ;
   private String AV54Listaprd_wcds_4_tfprdnom ;
   private String AV37TFPrdNom ;
   private String AV55Listaprd_wcds_5_tfprdnom_sel ;
   private String AV38TFPrdNom_Sel ;
   private String AV58Listaprd_wcds_8_tfprvnom ;
   private String AV41TFPrvNom ;
   private String AV59Listaprd_wcds_9_tfprvnom_sel ;
   private String AV42TFPrvNom_Sel ;
   private String scmdbuf ;
   private String lV52Listaprd_wcds_2_tfprdnum ;
   private String lV54Listaprd_wcds_4_tfprdnom ;
   private String lV58Listaprd_wcds_8_tfprvnom ;
   private String AV43EmprCod ;
   private String AV44PrdNumFrom ;
   private String AV45PrdNumTo ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private java.util.Date A9740PrdFFT ;
   private java.util.Date A9742PrdFHS ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean n6302TipPrdDsc ;
   private boolean n6301TipPrdCod ;
   private boolean n857ValDsc ;
   private boolean n736PrdUcoDsc ;
   private boolean n737PrdUcpDsc ;
   private boolean n794PrvNom ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String A11616PrdNmQu ;
   private String AV51Listaprd_wcds_1_filterfulltext ;
   private String AV30FilterFullText ;
   private String lV51Listaprd_wcds_1_filterfulltext ;
   private String AV31NewLine ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private byte[] P09FB2_A742PrdUniCom ;
   private byte[] P09FB2_A743PrdUniCon ;
   private byte[] P09FB2_A856ValCod ;
   private String[] P09FB2_A396EmprCod ;
   private byte[] P09FB2_A3273PrdTnq ;
   private java.math.BigDecimal[] P09FB2_A5416PrdDensS ;
   private String[] P09FB2_A11616PrdNmQu ;
   private String[] P09FB2_A11615PrdFuncion ;
   private String[] P09FB2_A11614PrdEINECS ;
   private String[] P09FB2_A11663PrdCtw4 ;
   private String[] P09FB2_A10938PrdCtw3 ;
   private String[] P09FB2_A10937PrdCtw2 ;
   private String[] P09FB2_A10936PrdCtw1 ;
   private String[] P09FB2_A10935PrdRTM ;
   private String[] P09FB2_A11196PrdNroCAS ;
   private String[] P09FB2_A6302TipPrdDsc ;
   private boolean[] P09FB2_n6302TipPrdDsc ;
   private short[] P09FB2_A6301TipPrdCod ;
   private boolean[] P09FB2_n6301TipPrdCod ;
   private String[] P09FB2_A10119PrdColIdx ;
   private java.math.BigDecimal[] P09FB2_A9733PrdAox ;
   private short[] P09FB2_A1644PrdDqo ;
   private String[] P09FB2_A11364PrdHm ;
   private String[] P09FB2_A11363PrdGots ;
   private String[] P09FB2_A5887PrdReach ;
   private String[] P09FB2_A9741PrdHS ;
   private String[] P09FB2_A9739PrdFT ;
   private java.math.BigDecimal[] P09FB2_A724PrdPreAct ;
   private String[] P09FB2_A4693PrdNum2 ;
   private String[] P09FB2_A857ValDsc ;
   private boolean[] P09FB2_n857ValDsc ;
   private java.math.BigDecimal[] P09FB2_A707PrdFacCon ;
   private String[] P09FB2_A736PrdUcoDsc ;
   private boolean[] P09FB2_n736PrdUcoDsc ;
   private String[] P09FB2_A737PrdUcpDsc ;
   private boolean[] P09FB2_n737PrdUcpDsc ;
   private byte[] P09FB2_A4338PrdUMeFo ;
   private java.math.BigDecimal[] P09FB2_A685PrdCanRes ;
   private String[] P09FB2_A728PrdRefPrv ;
   private java.math.BigDecimal[] P09FB2_A705PrdExiCC ;
   private java.math.BigDecimal[] P09FB2_A704PrdExiAlm ;
   private String[] P09FB2_A794PrvNom ;
   private boolean[] P09FB2_n794PrvNom ;
   private int[] P09FB2_A795PrvNum ;
   private String[] P09FB2_A718PrdNom ;
   private String[] P09FB2_A719PrdNum ;
   private String[] P09FB2_A11687PrdList ;
   private String[] P09FB2_A5888PrdOkotex ;
   private java.util.Date[] P09FB2_A9742PrdFHS ;
   private java.util.Date[] P09FB2_A9740PrdFFT ;
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

final  class listaprd_wcexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09FB2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV53Listaprd_wcds_3_tfprdnum_sel ,
                                          String AV52Listaprd_wcds_2_tfprdnum ,
                                          String AV55Listaprd_wcds_5_tfprdnom_sel ,
                                          String AV54Listaprd_wcds_4_tfprdnom ,
                                          int AV56Listaprd_wcds_6_tfprvnum ,
                                          int AV57Listaprd_wcds_7_tfprvnum_to ,
                                          String AV59Listaprd_wcds_9_tfprvnom_sel ,
                                          String AV58Listaprd_wcds_8_tfprvnom ,
                                          String AV43EmprCod ,
                                          String AV44PrdNumFrom ,
                                          String AV45PrdNumTo ,
                                          int AV46PrvNumFrom ,
                                          int AV47PrvNumTo ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          int A795PrvNum ,
                                          String A794PrvNom ,
                                          String A396EmprCod ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc ,
                                          String AV51Listaprd_wcds_1_filterfulltext ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          java.math.BigDecimal A705PrdExiCC ,
                                          String A728PrdRefPrv ,
                                          java.math.BigDecimal A685PrdCanRes ,
                                          byte A4338PrdUMeFo ,
                                          String A737PrdUcpDsc ,
                                          String A736PrdUcoDsc ,
                                          java.math.BigDecimal A707PrdFacCon ,
                                          String A857ValDsc ,
                                          String A4693PrdNum2 ,
                                          java.math.BigDecimal A724PrdPreAct ,
                                          String A9739PrdFT ,
                                          String A9741PrdHS ,
                                          String A5887PrdReach ,
                                          String A5888PrdOkotex ,
                                          String A11363PrdGots ,
                                          String A11364PrdHm ,
                                          short A1644PrdDqo ,
                                          java.math.BigDecimal A9733PrdAox ,
                                          String A10119PrdColIdx ,
                                          short A6301TipPrdCod ,
                                          String A6302TipPrdDsc ,
                                          String A11196PrdNroCAS ,
                                          String A10935PrdRTM ,
                                          String A10936PrdCtw1 ,
                                          String A10937PrdCtw2 ,
                                          String A10938PrdCtw3 ,
                                          String A11663PrdCtw4 ,
                                          String A11687PrdList ,
                                          String A11614PrdEINECS ,
                                          String A11615PrdFuncion ,
                                          String A11616PrdNmQu ,
                                          java.math.BigDecimal A5416PrdDensS ,
                                          byte A3273PrdTnq )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[13];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.PrdUniCom AS PrdUniCom, T1.PrdUniCon AS PrdUniCon, T1.ValCod, T1.EmprCod, T1.PrdTnq, T1.PrdDensS, T1.PrdNmQu, T1.PrdFuncion, T1.PrdEINECS, T1.PrdCtw4," ;
      scmdbuf += " T1.PrdCtw3, T1.PrdCtw2, T1.PrdCtw1, T1.PrdRTM, T1.PrdNroCAS, T5.TipPrdDsc, T1.TipPrdCod, T1.PrdColIdx, T1.PrdAox, T1.PrdDqo, T1.PrdHm, T1.PrdGots, T1.PrdReach," ;
      scmdbuf += " T1.PrdHS, T1.PrdFT, T1.PrdPreAct, T1.PrdNum2, T4.ValDsc, T1.PrdFacCon, T3.UniDsc AS PrdUcoDsc, T2.UniDsc AS PrdUcpDsc, T1.PrdUMeFo, T1.PrdCanRes, T1.PrdRefPrv," ;
      scmdbuf += " T1.PrdExiCC, T1.PrdExiAlm, T6.PrvNom, T1.PrvNum, T1.PrdNom, T1.PrdNum, T1.PrdList, T1.PrdOkotex, T1.PrdFHS, T1.PrdFFT FROM (((((TXPPRODUC T1 INNER JOIN TXPTIPUNI" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.UniCod = T1.PrdUniCom) INNER JOIN TXPTIPUNI T3 ON T3.EmprCod = T1.EmprCod AND T3.UniCod = T1.PrdUniCon) INNER JOIN TXPTIPVAL" ;
      scmdbuf += " T4 ON T4.EmprCod = T1.EmprCod AND T4.ValCod = T1.ValCod) LEFT JOIN TXPTIPPRD T5 ON T5.EmprCod = T1.EmprCod AND T5.TipPrdCod = T1.TipPrdCod) INNER JOIN TXPPRVGEN" ;
      scmdbuf += " T6 ON T6.EmprCod = T1.EmprCod AND T6.PrvNum = T1.PrvNum)" ;
      if ( (GXutil.strcmp("", AV53Listaprd_wcds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV52Listaprd_wcds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53Listaprd_wcds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int6[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55Listaprd_wcds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV54Listaprd_wcds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Listaprd_wcds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom = ?)");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( ! (0==AV56Listaprd_wcds_6_tfprvnum) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( ! (0==AV57Listaprd_wcds_7_tfprvnum_to) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Listaprd_wcds_9_tfprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV58Listaprd_wcds_8_tfprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T6.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Listaprd_wcds_9_tfprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T6.PrvNom = ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV43EmprCod)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV44PrdNumFrom)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum >= ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV45PrdNumTo)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum <= ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (0==AV46PrvNumFrom) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (0==AV47PrvNumTo) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNom" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNum" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNum DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvNum" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvNum DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T6.PrvNom" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T6.PrvNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdExiAlm" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdExiAlm DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdExiCC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdExiCC DESC" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdRefPrv" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdRefPrv DESC" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdCanRes" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdCanRes DESC" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdUMeFo" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdUMeFo DESC" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.UniDsc" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.UniDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.UniDsc" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.UniDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 12 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdFacCon" ;
      }
      else if ( ( AV28OrderedBy == 12 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdFacCon DESC" ;
      }
      else if ( ( AV28OrderedBy == 13 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T4.ValDsc" ;
      }
      else if ( ( AV28OrderedBy == 13 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.ValDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 14 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNum2" ;
      }
      else if ( ( AV28OrderedBy == 14 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNum2 DESC" ;
      }
      else if ( ( AV28OrderedBy == 15 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdPreAct" ;
      }
      else if ( ( AV28OrderedBy == 15 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdPreAct DESC" ;
      }
      else if ( ( AV28OrderedBy == 16 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdFT" ;
      }
      else if ( ( AV28OrderedBy == 16 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdFT DESC" ;
      }
      else if ( ( AV28OrderedBy == 17 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdFFT" ;
      }
      else if ( ( AV28OrderedBy == 17 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdFFT DESC" ;
      }
      else if ( ( AV28OrderedBy == 18 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdHS" ;
      }
      else if ( ( AV28OrderedBy == 18 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdHS DESC" ;
      }
      else if ( ( AV28OrderedBy == 19 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdFHS" ;
      }
      else if ( ( AV28OrderedBy == 19 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdFHS DESC" ;
      }
      else if ( ( AV28OrderedBy == 20 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdReach" ;
      }
      else if ( ( AV28OrderedBy == 20 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdReach DESC" ;
      }
      else if ( ( AV28OrderedBy == 21 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdOkotex" ;
      }
      else if ( ( AV28OrderedBy == 21 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdOkotex DESC" ;
      }
      else if ( ( AV28OrderedBy == 22 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdGots" ;
      }
      else if ( ( AV28OrderedBy == 22 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdGots DESC" ;
      }
      else if ( ( AV28OrderedBy == 23 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdHm" ;
      }
      else if ( ( AV28OrderedBy == 23 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdHm DESC" ;
      }
      else if ( ( AV28OrderedBy == 24 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdDqo" ;
      }
      else if ( ( AV28OrderedBy == 24 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdDqo DESC" ;
      }
      else if ( ( AV28OrderedBy == 25 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdAox" ;
      }
      else if ( ( AV28OrderedBy == 25 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdAox DESC" ;
      }
      else if ( ( AV28OrderedBy == 26 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdColIdx" ;
      }
      else if ( ( AV28OrderedBy == 26 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdColIdx DESC" ;
      }
      else if ( ( AV28OrderedBy == 27 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.TipPrdCod" ;
      }
      else if ( ( AV28OrderedBy == 27 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.TipPrdCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 28 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T5.TipPrdDsc" ;
      }
      else if ( ( AV28OrderedBy == 28 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T5.TipPrdDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 29 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNroCAS" ;
      }
      else if ( ( AV28OrderedBy == 29 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNroCAS DESC" ;
      }
      else if ( ( AV28OrderedBy == 30 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdRTM" ;
      }
      else if ( ( AV28OrderedBy == 30 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdRTM DESC" ;
      }
      else if ( ( AV28OrderedBy == 31 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdCtw1" ;
      }
      else if ( ( AV28OrderedBy == 31 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdCtw1 DESC" ;
      }
      else if ( ( AV28OrderedBy == 32 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdCtw2" ;
      }
      else if ( ( AV28OrderedBy == 32 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdCtw2 DESC" ;
      }
      else if ( ( AV28OrderedBy == 33 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdCtw3" ;
      }
      else if ( ( AV28OrderedBy == 33 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdCtw3 DESC" ;
      }
      else if ( ( AV28OrderedBy == 34 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdCtw4" ;
      }
      else if ( ( AV28OrderedBy == 34 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdCtw4 DESC" ;
      }
      else if ( ( AV28OrderedBy == 35 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdList" ;
      }
      else if ( ( AV28OrderedBy == 35 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdList DESC" ;
      }
      else if ( ( AV28OrderedBy == 36 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdEINECS" ;
      }
      else if ( ( AV28OrderedBy == 36 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdEINECS DESC" ;
      }
      else if ( ( AV28OrderedBy == 37 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdFuncion" ;
      }
      else if ( ( AV28OrderedBy == 37 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdFuncion DESC" ;
      }
      else if ( ( AV28OrderedBy == 38 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNmQu" ;
      }
      else if ( ( AV28OrderedBy == 38 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNmQu DESC" ;
      }
      else if ( ( AV28OrderedBy == 39 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdDensS" ;
      }
      else if ( ( AV28OrderedBy == 39 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdDensS DESC" ;
      }
      else if ( ( AV28OrderedBy == 40 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdTnq" ;
      }
      else if ( ( AV28OrderedBy == 40 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdTnq DESC" ;
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
                  return conditional_P09FB2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , ((Boolean) dynConstraints[19]).booleanValue() , (String)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (String)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , ((Number) dynConstraints[25]).byteValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).shortValue() , (java.math.BigDecimal)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).shortValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (java.math.BigDecimal)dynConstraints[53] , ((Number) dynConstraints[54]).byteValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09FB2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,3);
               ((String[]) buf[6])[0] = rslt.getVarchar(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 50);
               ((String[]) buf[8])[0] = rslt.getString(9, 40);
               ((String[]) buf[9])[0] = rslt.getString(10, 3);
               ((String[]) buf[10])[0] = rslt.getString(11, 3);
               ((String[]) buf[11])[0] = rslt.getString(12, 20);
               ((String[]) buf[12])[0] = rslt.getString(13, 3);
               ((String[]) buf[13])[0] = rslt.getString(14, 10);
               ((String[]) buf[14])[0] = rslt.getString(15, 40);
               ((String[]) buf[15])[0] = rslt.getString(16, 40);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(17);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(18, 10);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(19,2);
               ((short[]) buf[21])[0] = rslt.getShort(20);
               ((String[]) buf[22])[0] = rslt.getString(21, 1);
               ((String[]) buf[23])[0] = rslt.getString(22, 1);
               ((String[]) buf[24])[0] = rslt.getString(23, 1);
               ((String[]) buf[25])[0] = rslt.getString(24, 1);
               ((String[]) buf[26])[0] = rslt.getString(25, 1);
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(26,5);
               ((String[]) buf[28])[0] = rslt.getString(27, 16);
               ((String[]) buf[29])[0] = rslt.getString(28, 16);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(29,4);
               ((String[]) buf[32])[0] = rslt.getString(30, 8);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getString(31, 8);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((byte[]) buf[36])[0] = rslt.getByte(32);
               ((java.math.BigDecimal[]) buf[37])[0] = rslt.getBigDecimal(33,4);
               ((String[]) buf[38])[0] = rslt.getString(34, 30);
               ((java.math.BigDecimal[]) buf[39])[0] = rslt.getBigDecimal(35,4);
               ((java.math.BigDecimal[]) buf[40])[0] = rslt.getBigDecimal(36,4);
               ((String[]) buf[41])[0] = rslt.getString(37, 30);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((int[]) buf[43])[0] = rslt.getInt(38);
               ((String[]) buf[44])[0] = rslt.getString(39, 26);
               ((String[]) buf[45])[0] = rslt.getString(40, 6);
               ((String[]) buf[46])[0] = rslt.getString(41, 1);
               ((String[]) buf[47])[0] = rslt.getString(42, 1);
               ((java.util.Date[]) buf[48])[0] = rslt.getGXDate(43);
               ((java.util.Date[]) buf[49])[0] = rslt.getGXDate(44);
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
                  stmt.setString(sIdx, (String)parms[13], 6);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 26);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 26);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 3);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               return;
      }
   }

}

