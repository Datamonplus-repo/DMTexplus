package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class listconsultaprodexportcsv_impl extends GXWebProcedure
{
   public listconsultaprodexportcsv_impl( com.genexus.internet.HttpContext context )
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
      gxfirstwebparm = httpContext.GetFirstPar( "Emprcod") ;
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( ! entryPointCalled )
      {
         AV32Emprcod = gxfirstwebparm ;
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            AV35CliCodfrom = (int)(GXutil.lval( httpContext.GetPar( "CliCodfrom"))) ;
            AV36CliCodto = (int)(GXutil.lval( httpContext.GetPar( "CliCodto"))) ;
            AV33bardisnumfrom = httpContext.GetPar( "bardisnumfrom") ;
            AV34bardisnumto = httpContext.GetPar( "bardisnumto") ;
            AV39barfecgenfrom = localUtil.parseDateParm( httpContext.GetPar( "barfecgenfrom")) ;
            AV40barfecgento = localUtil.parseDateParm( httpContext.GetPar( "barfecgento")) ;
            AV37BarSitfrom = (byte)(GXutil.lval( httpContext.GetPar( "BarSitfrom"))) ;
            AV38BarSitto = (byte)(GXutil.lval( httpContext.GetPar( "BarSitto"))) ;
            AV43BarFecClifrom = localUtil.parseDateParm( httpContext.GetPar( "BarFecClifrom")) ;
            AV44barfecclito = localUtil.parseDateParm( httpContext.GetPar( "barfecclito")) ;
            AV45BarFecFprfrom = localUtil.parseDateParm( httpContext.GetPar( "BarFecFprfrom")) ;
            AV46barfecfprto = localUtil.parseDateParm( httpContext.GetPar( "barfecfprto")) ;
            AV41barfecsalfrom = localUtil.parseDateParm( httpContext.GetPar( "barfecsalfrom")) ;
            AV42barfecsalto = localUtil.parseDateParm( httpContext.GetPar( "barfecsalto")) ;
            AV47BarSerfrom = httpContext.GetPar( "BarSerfrom") ;
            AV48BarSerto = httpContext.GetPar( "BarSerto") ;
            AV57BarTipArtfrom = (short)(GXutil.lval( httpContext.GetPar( "BarTipArtfrom"))) ;
            AV58BarTipArtto = (short)(GXutil.lval( httpContext.GetPar( "BarTipArtto"))) ;
            AV49BarColNomfrom = httpContext.GetPar( "BarColNomfrom") ;
            AV50BarColNomto = httpContext.GetPar( "BarColNomto") ;
            AV51BarColnumfrom = (int)(GXutil.lval( httpContext.GetPar( "BarColnumfrom"))) ;
            AV52BarColNumto = (int)(GXutil.lval( httpContext.GetPar( "BarColNumto"))) ;
            AV53BarNomClifrom = httpContext.GetPar( "BarNomClifrom") ;
            AV54BarNomClito = httpContext.GetPar( "BarNomClito") ;
            AV55BarNumClifrom = (int)(GXutil.lval( httpContext.GetPar( "BarNumClifrom"))) ;
            AV56Barnumclito = (int)(GXutil.lval( httpContext.GetPar( "Barnumclito"))) ;
            AV57BarTipArtfrom = (short)(GXutil.lval( httpContext.GetPar( "BarTipArtfrom"))) ;
            AV58BarTipArtto = (short)(GXutil.lval( httpContext.GetPar( "BarTipArtto"))) ;
            AV67muestras = httpContext.GetPar( "muestras") ;
            AV59BarCodfrom = (int)(GXutil.lval( httpContext.GetPar( "BarCodfrom"))) ;
            AV60BarCodto = (int)(GXutil.lval( httpContext.GetPar( "BarCodto"))) ;
            AV61BarCodreofrom = (byte)(GXutil.lval( httpContext.GetPar( "BarCodreofrom"))) ;
            AV62BarCodreoto = (byte)(GXutil.lval( httpContext.GetPar( "BarCodreoto"))) ;
            AV63BarCodparfrom = httpContext.GetPar( "BarCodparfrom") ;
            AV64BarCodparto = httpContext.GetPar( "BarCodparto") ;
            AV65Cod_idtx = httpContext.GetPar( "Cod_idtx") ;
            AV66BarGirar = httpContext.GetPar( "BarGirar") ;
         }
      }
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
      AV11Filename = "./PrivateTempStorage/" + "ListConsultaProdExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("ListConsultaProdColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("ListConsultaProdColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Ped. Cli.", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Tipo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nº Hdr", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "R", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "P", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "A?", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Articulo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Tip. Art.", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Color", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Numero", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Color Cli.", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "KIlos", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Metros", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Piezas", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Sit.", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha HDR", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Ped. Cli.", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Ent. Prev.", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Salida", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+27)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Kgs. Sal.", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+28)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Mts. Sal.", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+30)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Coleccion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+31)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Ctw", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+32)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+33)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Usuario", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+34)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Maquina", "") : "") ;
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
                                           AV28FilterFullText ,
                                           AV33bardisnumfrom ,
                                           AV34bardisnumto ,
                                           Integer.valueOf(AV35CliCodfrom) ,
                                           Integer.valueOf(AV36CliCodto) ,
                                           Byte.valueOf(AV37BarSitfrom) ,
                                           Byte.valueOf(AV38BarSitto) ,
                                           AV39barfecgenfrom ,
                                           AV40barfecgento ,
                                           AV41barfecsalfrom ,
                                           AV42barfecsalto ,
                                           AV43BarFecClifrom ,
                                           AV44barfecclito ,
                                           AV45BarFecFprfrom ,
                                           AV46barfecfprto ,
                                           AV47BarSerfrom ,
                                           AV48BarSerto ,
                                           AV49BarColNomfrom ,
                                           AV50BarColNomto ,
                                           Integer.valueOf(AV51BarColnumfrom) ,
                                           Integer.valueOf(AV52BarColNumto) ,
                                           AV53BarNomClifrom ,
                                           AV54BarNomClito ,
                                           Integer.valueOf(AV55BarNumClifrom) ,
                                           Integer.valueOf(AV56Barnumclito) ,
                                           Short.valueOf(AV57BarTipArtfrom) ,
                                           Short.valueOf(AV58BarTipArtto) ,
                                           Integer.valueOf(AV59BarCodfrom) ,
                                           Integer.valueOf(AV60BarCodto) ,
                                           Byte.valueOf(AV61BarCodreofrom) ,
                                           Byte.valueOf(AV62BarCodreoto) ,
                                           AV63BarCodparfrom ,
                                           AV64BarCodparto ,
                                           AV65Cod_idtx ,
                                           AV66BarGirar ,
                                           AV67muestras ,
                                           Integer.valueOf(A14326CP_CLICOD) ,
                                           A14327CP_CLINOM ,
                                           A14324CP_BARDISN ,
                                           Byte.valueOf(A14352CP_BARESTR) ,
                                           Integer.valueOf(A14301CP_BARCOD) ,
                                           Byte.valueOf(A14302CP_BARCODR) ,
                                           A14303CP_BARCODP ,
                                           A14319CP_BARAGRE ,
                                           A14311CP_BARSER ,
                                           A14312CP_BARSERD ,
                                           Short.valueOf(A14316CP_BARTIPA) ,
                                           A14343CP_TARTDSC ,
                                           A14331CP_BARCOLO ,
                                           Integer.valueOf(A14332CP_BARCOLU) ,
                                           A14315CP_BARNOMC ,
                                           A14336CP_BARKGM ,
                                           A14337CP_BARMTR ,
                                           Integer.valueOf(A14338CP_BARPIE) ,
                                           Byte.valueOf(A14307CP_BARSIT) ,
                                           A14339CP_BARALBK ,
                                           A14340CP_BARALBM ,
                                           A14317CP_BARGIRA ,
                                           A14323CP_BARPROP ,
                                           A14334CP_DSC_BAR ,
                                           A14341CP_DISUSRC ,
                                           A14351CP_BARMAQC ,
                                           A14308CP_BARFECG ,
                                           A14310CP_BARFECS ,
                                           A14309CP_BARFECC ,
                                           A14304CP_BARFECF ,
                                           Integer.valueOf(A14305CP_BARNUMC) ,
                                           A14306CP_BARPLF ,
                                           Short.valueOf(AV68OrderedBy) ,
                                           Boolean.valueOf(AV69OrderedDsc) ,
                                           AV32Emprcod ,
                                           A14328CP_EMPRCOD } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV28FilterFullText = GXutil.concat( GXutil.rtrim( AV28FilterFullText), "%", "") ;
      lV28FilterFullText = GXutil.concat( GXutil.rtrim( AV28FilterFullText), "%", "") ;
      lV28FilterFullText = GXutil.concat( GXutil.rtrim( AV28FilterFullText), "%", "") ;
      lV28FilterFullText = GXutil.concat( GXutil.rtrim( AV28FilterFullText), "%", "") ;
      lV28FilterFullText = GXutil.concat( GXutil.rtrim( AV28FilterFullText), "%", "") ;
      lV28FilterFullText = GXutil.concat( GXutil.rtrim( AV28FilterFullText), "%", "") ;
      lV28FilterFullText = GXutil.concat( GXutil.rtrim( AV28FilterFullText), "%", "") ;
      lV28FilterFullText = GXutil.concat( GXutil.rtrim( AV28FilterFullText), "%", "") ;
      lV28FilterFullText = GXutil.concat( GXutil.rtrim( AV28FilterFullText), "%", "") ;
      lV28FilterFullText = GXutil.concat( GXutil.rtrim( AV28FilterFullText), "%", "") ;
      lV28FilterFullText = GXutil.concat( GXutil.rtrim( AV28FilterFullText), "%", "") ;
      lV28FilterFullText = GXutil.concat( GXutil.rtrim( AV28FilterFullText), "%", "") ;
      lV28FilterFullText = GXutil.concat( GXutil.rtrim( AV28FilterFullText), "%", "") ;
      lV28FilterFullText = GXutil.concat( GXutil.rtrim( AV28FilterFullText), "%", "") ;
      lV28FilterFullText = GXutil.concat( GXutil.rtrim( AV28FilterFullText), "%", "") ;
      lV28FilterFullText = GXutil.concat( GXutil.rtrim( AV28FilterFullText), "%", "") ;
      lV28FilterFullText = GXutil.concat( GXutil.rtrim( AV28FilterFullText), "%", "") ;
      lV28FilterFullText = GXutil.concat( GXutil.rtrim( AV28FilterFullText), "%", "") ;
      lV28FilterFullText = GXutil.concat( GXutil.rtrim( AV28FilterFullText), "%", "") ;
      lV28FilterFullText = GXutil.concat( GXutil.rtrim( AV28FilterFullText), "%", "") ;
      lV28FilterFullText = GXutil.concat( GXutil.rtrim( AV28FilterFullText), "%", "") ;
      lV28FilterFullText = GXutil.concat( GXutil.rtrim( AV28FilterFullText), "%", "") ;
      lV28FilterFullText = GXutil.concat( GXutil.rtrim( AV28FilterFullText), "%", "") ;
      lV28FilterFullText = GXutil.concat( GXutil.rtrim( AV28FilterFullText), "%", "") ;
      lV28FilterFullText = GXutil.concat( GXutil.rtrim( AV28FilterFullText), "%", "") ;
      lV28FilterFullText = GXutil.concat( GXutil.rtrim( AV28FilterFullText), "%", "") ;
      /* Using cursor P0AD62 */
      pr_default.execute(0, new Object[] {AV32Emprcod, lV28FilterFullText, lV28FilterFullText, lV28FilterFullText, lV28FilterFullText, lV28FilterFullText, lV28FilterFullText, lV28FilterFullText, lV28FilterFullText, lV28FilterFullText, lV28FilterFullText, lV28FilterFullText, lV28FilterFullText, lV28FilterFullText, lV28FilterFullText, lV28FilterFullText, lV28FilterFullText, lV28FilterFullText, lV28FilterFullText, lV28FilterFullText, lV28FilterFullText, lV28FilterFullText, lV28FilterFullText, lV28FilterFullText, lV28FilterFullText, lV28FilterFullText, lV28FilterFullText, AV33bardisnumfrom, AV34bardisnumto, Integer.valueOf(AV35CliCodfrom), Integer.valueOf(AV36CliCodto), Byte.valueOf(AV37BarSitfrom), Byte.valueOf(AV38BarSitto), AV39barfecgenfrom, AV40barfecgento, AV41barfecsalfrom, AV42barfecsalto, AV43BarFecClifrom, AV44barfecclito, AV45BarFecFprfrom, AV46barfecfprto, AV47BarSerfrom, AV48BarSerto, AV49BarColNomfrom, AV50BarColNomto, Integer.valueOf(AV51BarColnumfrom), Integer.valueOf(AV52BarColNumto), AV53BarNomClifrom, AV54BarNomClito, Integer.valueOf(AV55BarNumClifrom), Integer.valueOf(AV56Barnumclito), Short.valueOf(AV57BarTipArtfrom), Short.valueOf(AV58BarTipArtto), Integer.valueOf(AV59BarCodfrom), Integer.valueOf(AV60BarCodto), Byte.valueOf(AV61BarCodreofrom), Byte.valueOf(AV62BarCodreoto), AV63BarCodparfrom, AV64BarCodparto, AV65Cod_idtx, AV66BarGirar, AV67muestras});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A14306CP_BARPLF = P0AD62_A14306CP_BARPLF[0] ;
         A14305CP_BARNUMC = P0AD62_A14305CP_BARNUMC[0] ;
         A14304CP_BARFECF = P0AD62_A14304CP_BARFECF[0] ;
         A14309CP_BARFECC = P0AD62_A14309CP_BARFECC[0] ;
         A14310CP_BARFECS = P0AD62_A14310CP_BARFECS[0] ;
         A14308CP_BARFECG = P0AD62_A14308CP_BARFECG[0] ;
         A14328CP_EMPRCOD = P0AD62_A14328CP_EMPRCOD[0] ;
         A14351CP_BARMAQC = P0AD62_A14351CP_BARMAQC[0] ;
         A14341CP_DISUSRC = P0AD62_A14341CP_DISUSRC[0] ;
         A14334CP_DSC_BAR = P0AD62_A14334CP_DSC_BAR[0] ;
         A14323CP_BARPROP = P0AD62_A14323CP_BARPROP[0] ;
         A14317CP_BARGIRA = P0AD62_A14317CP_BARGIRA[0] ;
         A14340CP_BARALBM = P0AD62_A14340CP_BARALBM[0] ;
         A14339CP_BARALBK = P0AD62_A14339CP_BARALBK[0] ;
         A14307CP_BARSIT = P0AD62_A14307CP_BARSIT[0] ;
         A14338CP_BARPIE = P0AD62_A14338CP_BARPIE[0] ;
         A14337CP_BARMTR = P0AD62_A14337CP_BARMTR[0] ;
         A14336CP_BARKGM = P0AD62_A14336CP_BARKGM[0] ;
         A14315CP_BARNOMC = P0AD62_A14315CP_BARNOMC[0] ;
         A14332CP_BARCOLU = P0AD62_A14332CP_BARCOLU[0] ;
         A14331CP_BARCOLO = P0AD62_A14331CP_BARCOLO[0] ;
         A14343CP_TARTDSC = P0AD62_A14343CP_TARTDSC[0] ;
         A14316CP_BARTIPA = P0AD62_A14316CP_BARTIPA[0] ;
         A14312CP_BARSERD = P0AD62_A14312CP_BARSERD[0] ;
         A14311CP_BARSER = P0AD62_A14311CP_BARSER[0] ;
         A14319CP_BARAGRE = P0AD62_A14319CP_BARAGRE[0] ;
         A14303CP_BARCODP = P0AD62_A14303CP_BARCODP[0] ;
         A14302CP_BARCODR = P0AD62_A14302CP_BARCODR[0] ;
         A14301CP_BARCOD = P0AD62_A14301CP_BARCOD[0] ;
         A14352CP_BARESTR = P0AD62_A14352CP_BARESTR[0] ;
         A14324CP_BARDISN = P0AD62_A14324CP_BARDISN[0] ;
         A14327CP_CLINOM = P0AD62_A14327CP_CLINOM[0] ;
         A14326CP_CLICOD = P0AD62_A14326CP_CLICOD[0] ;
         A14297CP_ID = P0AD62_A14297CP_ID[0] ;
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
            AV14TextFileLine += GXutil.str( A14326CP_CLICOD, 6, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A14327CP_CLINOM, ";", ","), GXv_char3) ;
            listconsultaprodexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A14324CP_BARDISN, ";", ","), GXv_char3) ;
            listconsultaprodexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            if ( A14352CP_BARESTR == 0 )
            {
               AV14TextFileLine += "- " ;
            }
            else if ( A14352CP_BARESTR == 1 )
            {
               AV14TextFileLine += "-" ;
            }
            else if ( A14352CP_BARESTR == 2 )
            {
               AV14TextFileLine += httpContext.getMessage( "RC", "") ;
            }
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A14301CP_BARCOD, 8, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A14302CP_BARCODR, 1, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A14303CP_BARCODP, ";", ","), GXv_char3) ;
            listconsultaprodexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A14319CP_BARAGRE, ";", ","), GXv_char3) ;
            listconsultaprodexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A14311CP_BARSER, ";", ","), GXv_char3) ;
            listconsultaprodexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A14312CP_BARSERD, ";", ","), GXv_char3) ;
            listconsultaprodexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A14316CP_BARTIPA, 4, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A14343CP_TARTDSC, ";", ","), GXv_char3) ;
            listconsultaprodexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A14331CP_BARCOLO, ";", ","), GXv_char3) ;
            listconsultaprodexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A14332CP_BARCOLU, 6, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A14315CP_BARNOMC, ";", ","), GXv_char3) ;
            listconsultaprodexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A14336CP_BARKGM, 9, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A14337CP_BARMTR, 9, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A14338CP_BARPIE, 6, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A14307CP_BARSIT, 2, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += localUtil.dtoc( A14308CP_BARFECG, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += localUtil.dtoc( A14309CP_BARFECC, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += localUtil.dtoc( A14304CP_BARFECF, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += localUtil.dtoc( A14310CP_BARFECS, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+27)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A14339CP_BARALBK, 9, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+28)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A14340CP_BARALBM, 9, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+30)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A14317CP_BARGIRA, ";", ","), GXv_char3) ;
            listconsultaprodexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+31)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A14323CP_BARPROP, ";", ","), GXv_char3) ;
            listconsultaprodexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+32)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A14334CP_DSC_BAR, ";", ","), GXv_char3) ;
            listconsultaprodexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+33)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A14341CP_DISUSRC, ";", ","), GXv_char3) ;
            listconsultaprodexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+34)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A14351CP_BARMAQC, ";", ","), GXv_char3) ;
            listconsultaprodexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=ListConsultaProdExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CP_CLICOD", "", "Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CP_CLINOM", "", "Nombre", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CP_BARDISNUM", "", "Ped. Cli.", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CP_BARESTR", "", "Tipo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CP_BARCOD", "", "Nº Hdr", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CP_BARCODREO", "", "R", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CP_BARCODPAR", "", "P", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CP_BARAGREST", "", "A?", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CP_BARSER", "", "Articulo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CP_BARSERDSC", "", "Descripcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CP_BARTIPART", "", "Tip. Art.", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CP_TARTDSC", "", "Descripcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CP_BARCOLO", "", "Color", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CP_BARCOLU", "", "Numero", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CP_BARNOMCLI", "", "Color Cli.", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CP_BARKGM", "", "KIlos", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CP_BARMTR", "", "Metros", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CP_BARPIE", "", "Piezas", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CP_BARSIT", "", "Sit.", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CP_BARFECGEN", "Fecha", "Fecha HDR", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CP_BARFECCLI", "Fecha", "Ped. Cli.", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CP_BARFECFPR", "Fecha", "Ent. Prev.", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CP_BARFECSAL", "", "Salida", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&BarFasCod", "", "Ult. Fase", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&BarFasSig", "", "Sig. Fase", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&BarAlbUltimo", "", "Ultimo Alb.", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CP_BARALBK", "", "Kgs. Sal.", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CP_BARALBM", "", "Mts. Sal.", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&BarAlbFact", "", "Factura", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CP_BARGIRAR", "", "Coleccion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CP_BARPROPER", "", "Ctw", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CP_DSC_BAR", "", "Descripcion", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CP_DISUSRC", "", "Usuario", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CP_BARMAQCD", "", "Maquina", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "ListConsultaProdColumnsSelector", GXv_char3) ;
      listconsultaprodexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("ListConsultaProdGridState"), "") == 0 )
      {
         AV30GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "ListConsultaProdGridState"), null, null);
      }
      else
      {
         AV30GridState.fromxml(AV19Session.getValue("ListConsultaProdGridState"), null, null);
      }
      AV68OrderedBy = AV30GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV69OrderedDsc = AV30GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV81GXV1 = 1 ;
      while ( AV81GXV1 <= AV30GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV31GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV30GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV81GXV1));
         if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV28FilterFullText = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV81GXV1 = (int)(AV81GXV1+1) ;
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
      AV32Emprcod = "" ;
      AV33bardisnumfrom = "" ;
      AV34bardisnumto = "" ;
      AV39barfecgenfrom = GXutil.nullDate() ;
      AV40barfecgento = GXutil.nullDate() ;
      AV43BarFecClifrom = GXutil.nullDate() ;
      AV44barfecclito = GXutil.nullDate() ;
      AV45BarFecFprfrom = GXutil.nullDate() ;
      AV46barfecfprto = GXutil.nullDate() ;
      AV41barfecsalfrom = GXutil.nullDate() ;
      AV42barfecsalto = GXutil.nullDate() ;
      AV47BarSerfrom = "" ;
      AV48BarSerto = "" ;
      AV49BarColNomfrom = "" ;
      AV50BarColNomto = "" ;
      AV53BarNomClifrom = "" ;
      AV54BarNomClito = "" ;
      AV67muestras = "" ;
      AV63BarCodparfrom = "" ;
      AV64BarCodparto = "" ;
      AV65Cod_idtx = "" ;
      AV66BarGirar = "" ;
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV11Filename = "" ;
      AV10TextFile = new com.genexus.util.GXFile();
      AV14TextFileLine = "" ;
      AV19Session = httpContext.getWebSession();
      AV18ColumnsSelectorXML = "" ;
      AV15ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      scmdbuf = "" ;
      lV28FilterFullText = "" ;
      AV28FilterFullText = "" ;
      A14327CP_CLINOM = "" ;
      A14324CP_BARDISN = "" ;
      A14303CP_BARCODP = "" ;
      A14319CP_BARAGRE = "" ;
      A14311CP_BARSER = "" ;
      A14312CP_BARSERD = "" ;
      A14343CP_TARTDSC = "" ;
      A14331CP_BARCOLO = "" ;
      A14315CP_BARNOMC = "" ;
      A14336CP_BARKGM = DecimalUtil.ZERO ;
      A14337CP_BARMTR = DecimalUtil.ZERO ;
      A14339CP_BARALBK = DecimalUtil.ZERO ;
      A14340CP_BARALBM = DecimalUtil.ZERO ;
      A14317CP_BARGIRA = "" ;
      A14323CP_BARPROP = "" ;
      A14334CP_DSC_BAR = "" ;
      A14341CP_DISUSRC = "" ;
      A14351CP_BARMAQC = "" ;
      A14308CP_BARFECG = GXutil.nullDate() ;
      A14310CP_BARFECS = GXutil.nullDate() ;
      A14309CP_BARFECC = GXutil.nullDate() ;
      A14304CP_BARFECF = GXutil.nullDate() ;
      A14306CP_BARPLF = "" ;
      A14328CP_EMPRCOD = "" ;
      P0AD62_A14306CP_BARPLF = new String[] {""} ;
      P0AD62_A14305CP_BARNUMC = new int[1] ;
      P0AD62_A14304CP_BARFECF = new java.util.Date[] {GXutil.nullDate()} ;
      P0AD62_A14309CP_BARFECC = new java.util.Date[] {GXutil.nullDate()} ;
      P0AD62_A14310CP_BARFECS = new java.util.Date[] {GXutil.nullDate()} ;
      P0AD62_A14308CP_BARFECG = new java.util.Date[] {GXutil.nullDate()} ;
      P0AD62_A14328CP_EMPRCOD = new String[] {""} ;
      P0AD62_A14351CP_BARMAQC = new String[] {""} ;
      P0AD62_A14341CP_DISUSRC = new String[] {""} ;
      P0AD62_A14334CP_DSC_BAR = new String[] {""} ;
      P0AD62_A14323CP_BARPROP = new String[] {""} ;
      P0AD62_A14317CP_BARGIRA = new String[] {""} ;
      P0AD62_A14340CP_BARALBM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AD62_A14339CP_BARALBK = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AD62_A14307CP_BARSIT = new byte[1] ;
      P0AD62_A14338CP_BARPIE = new int[1] ;
      P0AD62_A14337CP_BARMTR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AD62_A14336CP_BARKGM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AD62_A14315CP_BARNOMC = new String[] {""} ;
      P0AD62_A14332CP_BARCOLU = new int[1] ;
      P0AD62_A14331CP_BARCOLO = new String[] {""} ;
      P0AD62_A14343CP_TARTDSC = new String[] {""} ;
      P0AD62_A14316CP_BARTIPA = new short[1] ;
      P0AD62_A14312CP_BARSERD = new String[] {""} ;
      P0AD62_A14311CP_BARSER = new String[] {""} ;
      P0AD62_A14319CP_BARAGRE = new String[] {""} ;
      P0AD62_A14303CP_BARCODP = new String[] {""} ;
      P0AD62_A14302CP_BARCODR = new byte[1] ;
      P0AD62_A14301CP_BARCOD = new int[1] ;
      P0AD62_A14352CP_BARESTR = new byte[1] ;
      P0AD62_A14324CP_BARDISN = new String[] {""} ;
      P0AD62_A14327CP_CLINOM = new String[] {""} ;
      P0AD62_A14326CP_CLICOD = new int[1] ;
      P0AD62_A14297CP_ID = new long[1] ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector5 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV30GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV31GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.listconsultaprodexportcsv__default(),
         new Object[] {
             new Object[] {
            P0AD62_A14306CP_BARPLF, P0AD62_A14305CP_BARNUMC, P0AD62_A14304CP_BARFECF, P0AD62_A14309CP_BARFECC, P0AD62_A14310CP_BARFECS, P0AD62_A14308CP_BARFECG, P0AD62_A14328CP_EMPRCOD, P0AD62_A14351CP_BARMAQC, P0AD62_A14341CP_DISUSRC, P0AD62_A14334CP_DSC_BAR,
            P0AD62_A14323CP_BARPROP, P0AD62_A14317CP_BARGIRA, P0AD62_A14340CP_BARALBM, P0AD62_A14339CP_BARALBK, P0AD62_A14307CP_BARSIT, P0AD62_A14338CP_BARPIE, P0AD62_A14337CP_BARMTR, P0AD62_A14336CP_BARKGM, P0AD62_A14315CP_BARNOMC, P0AD62_A14332CP_BARCOLU,
            P0AD62_A14331CP_BARCOLO, P0AD62_A14343CP_TARTDSC, P0AD62_A14316CP_BARTIPA, P0AD62_A14312CP_BARSERD, P0AD62_A14311CP_BARSER, P0AD62_A14319CP_BARAGRE, P0AD62_A14303CP_BARCODP, P0AD62_A14302CP_BARCODR, P0AD62_A14301CP_BARCOD, P0AD62_A14352CP_BARESTR,
            P0AD62_A14324CP_BARDISN, P0AD62_A14327CP_CLINOM, P0AD62_A14326CP_CLICOD, P0AD62_A14297CP_ID
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV37BarSitfrom ;
   private byte AV38BarSitto ;
   private byte AV61BarCodreofrom ;
   private byte AV62BarCodreoto ;
   private byte A14352CP_BARESTR ;
   private byte A14302CP_BARCODR ;
   private byte A14307CP_BARSIT ;
   private short gxcookieaux ;
   private short AV57BarTipArtfrom ;
   private short AV58BarTipArtto ;
   private short A14316CP_BARTIPA ;
   private short AV68OrderedBy ;
   private short Gx_err ;
   private int AV35CliCodfrom ;
   private int AV36CliCodto ;
   private int AV51BarColnumfrom ;
   private int AV52BarColNumto ;
   private int AV55BarNumClifrom ;
   private int AV56Barnumclito ;
   private int AV59BarCodfrom ;
   private int AV60BarCodto ;
   private int AV13Random ;
   private int A14326CP_CLICOD ;
   private int A14301CP_BARCOD ;
   private int A14332CP_BARCOLU ;
   private int A14338CP_BARPIE ;
   private int A14305CP_BARNUMC ;
   private int AV81GXV1 ;
   private long A14297CP_ID ;
   private java.math.BigDecimal A14336CP_BARKGM ;
   private java.math.BigDecimal A14337CP_BARMTR ;
   private java.math.BigDecimal A14339CP_BARALBK ;
   private java.math.BigDecimal A14340CP_BARALBM ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV32Emprcod ;
   private String AV33bardisnumfrom ;
   private String AV34bardisnumto ;
   private String AV47BarSerfrom ;
   private String AV48BarSerto ;
   private String AV49BarColNomfrom ;
   private String AV50BarColNomto ;
   private String AV53BarNomClifrom ;
   private String AV54BarNomClito ;
   private String AV67muestras ;
   private String AV63BarCodparfrom ;
   private String AV64BarCodparto ;
   private String AV65Cod_idtx ;
   private String AV66BarGirar ;
   private String scmdbuf ;
   private String A14324CP_BARDISN ;
   private String A14303CP_BARCODP ;
   private String A14319CP_BARAGRE ;
   private String A14311CP_BARSER ;
   private String A14331CP_BARCOLO ;
   private String A14323CP_BARPROP ;
   private String A14341CP_DISUSRC ;
   private String A14351CP_BARMAQC ;
   private String A14306CP_BARPLF ;
   private String A14328CP_EMPRCOD ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private java.util.Date AV39barfecgenfrom ;
   private java.util.Date AV40barfecgento ;
   private java.util.Date AV43BarFecClifrom ;
   private java.util.Date AV44barfecclito ;
   private java.util.Date AV45BarFecFprfrom ;
   private java.util.Date AV46barfecfprto ;
   private java.util.Date AV41barfecsalfrom ;
   private java.util.Date AV42barfecsalto ;
   private java.util.Date A14308CP_BARFECG ;
   private java.util.Date A14310CP_BARFECS ;
   private java.util.Date A14309CP_BARFECC ;
   private java.util.Date A14304CP_BARFECF ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV69OrderedDsc ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String lV28FilterFullText ;
   private String AV28FilterFullText ;
   private String A14327CP_CLINOM ;
   private String A14312CP_BARSERD ;
   private String A14343CP_TARTDSC ;
   private String A14315CP_BARNOMC ;
   private String A14317CP_BARGIRA ;
   private String A14334CP_DSC_BAR ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private String[] P0AD62_A14306CP_BARPLF ;
   private int[] P0AD62_A14305CP_BARNUMC ;
   private java.util.Date[] P0AD62_A14304CP_BARFECF ;
   private java.util.Date[] P0AD62_A14309CP_BARFECC ;
   private java.util.Date[] P0AD62_A14310CP_BARFECS ;
   private java.util.Date[] P0AD62_A14308CP_BARFECG ;
   private String[] P0AD62_A14328CP_EMPRCOD ;
   private String[] P0AD62_A14351CP_BARMAQC ;
   private String[] P0AD62_A14341CP_DISUSRC ;
   private String[] P0AD62_A14334CP_DSC_BAR ;
   private String[] P0AD62_A14323CP_BARPROP ;
   private String[] P0AD62_A14317CP_BARGIRA ;
   private java.math.BigDecimal[] P0AD62_A14340CP_BARALBM ;
   private java.math.BigDecimal[] P0AD62_A14339CP_BARALBK ;
   private byte[] P0AD62_A14307CP_BARSIT ;
   private int[] P0AD62_A14338CP_BARPIE ;
   private java.math.BigDecimal[] P0AD62_A14337CP_BARMTR ;
   private java.math.BigDecimal[] P0AD62_A14336CP_BARKGM ;
   private String[] P0AD62_A14315CP_BARNOMC ;
   private int[] P0AD62_A14332CP_BARCOLU ;
   private String[] P0AD62_A14331CP_BARCOLO ;
   private String[] P0AD62_A14343CP_TARTDSC ;
   private short[] P0AD62_A14316CP_BARTIPA ;
   private String[] P0AD62_A14312CP_BARSERD ;
   private String[] P0AD62_A14311CP_BARSER ;
   private String[] P0AD62_A14319CP_BARAGRE ;
   private String[] P0AD62_A14303CP_BARCODP ;
   private byte[] P0AD62_A14302CP_BARCODR ;
   private int[] P0AD62_A14301CP_BARCOD ;
   private byte[] P0AD62_A14352CP_BARESTR ;
   private String[] P0AD62_A14324CP_BARDISN ;
   private String[] P0AD62_A14327CP_CLINOM ;
   private int[] P0AD62_A14326CP_CLICOD ;
   private long[] P0AD62_A14297CP_ID ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV30GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV31GridStateFilterValue ;
}

final  class listconsultaprodexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0AD62( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV28FilterFullText ,
                                          String AV33bardisnumfrom ,
                                          String AV34bardisnumto ,
                                          int AV35CliCodfrom ,
                                          int AV36CliCodto ,
                                          byte AV37BarSitfrom ,
                                          byte AV38BarSitto ,
                                          java.util.Date AV39barfecgenfrom ,
                                          java.util.Date AV40barfecgento ,
                                          java.util.Date AV41barfecsalfrom ,
                                          java.util.Date AV42barfecsalto ,
                                          java.util.Date AV43BarFecClifrom ,
                                          java.util.Date AV44barfecclito ,
                                          java.util.Date AV45BarFecFprfrom ,
                                          java.util.Date AV46barfecfprto ,
                                          String AV47BarSerfrom ,
                                          String AV48BarSerto ,
                                          String AV49BarColNomfrom ,
                                          String AV50BarColNomto ,
                                          int AV51BarColnumfrom ,
                                          int AV52BarColNumto ,
                                          String AV53BarNomClifrom ,
                                          String AV54BarNomClito ,
                                          int AV55BarNumClifrom ,
                                          int AV56Barnumclito ,
                                          short AV57BarTipArtfrom ,
                                          short AV58BarTipArtto ,
                                          int AV59BarCodfrom ,
                                          int AV60BarCodto ,
                                          byte AV61BarCodreofrom ,
                                          byte AV62BarCodreoto ,
                                          String AV63BarCodparfrom ,
                                          String AV64BarCodparto ,
                                          String AV65Cod_idtx ,
                                          String AV66BarGirar ,
                                          String AV67muestras ,
                                          int A14326CP_CLICOD ,
                                          String A14327CP_CLINOM ,
                                          String A14324CP_BARDISN ,
                                          byte A14352CP_BARESTR ,
                                          int A14301CP_BARCOD ,
                                          byte A14302CP_BARCODR ,
                                          String A14303CP_BARCODP ,
                                          String A14319CP_BARAGRE ,
                                          String A14311CP_BARSER ,
                                          String A14312CP_BARSERD ,
                                          short A14316CP_BARTIPA ,
                                          String A14343CP_TARTDSC ,
                                          String A14331CP_BARCOLO ,
                                          int A14332CP_BARCOLU ,
                                          String A14315CP_BARNOMC ,
                                          java.math.BigDecimal A14336CP_BARKGM ,
                                          java.math.BigDecimal A14337CP_BARMTR ,
                                          int A14338CP_BARPIE ,
                                          byte A14307CP_BARSIT ,
                                          java.math.BigDecimal A14339CP_BARALBK ,
                                          java.math.BigDecimal A14340CP_BARALBM ,
                                          String A14317CP_BARGIRA ,
                                          String A14323CP_BARPROP ,
                                          String A14334CP_DSC_BAR ,
                                          String A14341CP_DISUSRC ,
                                          String A14351CP_BARMAQC ,
                                          java.util.Date A14308CP_BARFECG ,
                                          java.util.Date A14310CP_BARFECS ,
                                          java.util.Date A14309CP_BARFECC ,
                                          java.util.Date A14304CP_BARFECF ,
                                          int A14305CP_BARNUMC ,
                                          String A14306CP_BARPLF ,
                                          short AV68OrderedBy ,
                                          boolean AV69OrderedDsc ,
                                          String AV32Emprcod ,
                                          String A14328CP_EMPRCOD )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[62];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT CP_BARPLF, CP_BARNUMC, CP_BARFECF, CP_BARFECC, CP_BARFECS, CP_BARFECG, CP_EMPRCOD, CP_BARMAQC, CP_DISUSRC, CP_DSC_BAR, CP_BARPROP, CP_BARGIRA, CP_BARALBM," ;
      scmdbuf += " CP_BARALBK, CP_BARSIT, CP_BARPIE, CP_BARMTR, CP_BARKGM, CP_BARNOMC, CP_BARCOLU, CP_BARCOLO, CP_TARTDSC, CP_BARTIPA, CP_BARSERD, CP_BARSER, CP_BARAGRE, CP_BARCODP," ;
      scmdbuf += " CP_BARCODR, CP_BARCOD, CP_BARESTR, CP_BARDISN, CP_CLINOM, CP_CLICOD, CP_ID FROM TXPCONPRO" ;
      addWhere(sWhereString, "(CP_EMPRCOD = ?)");
      if ( ! (GXutil.strcmp("", AV28FilterFullText)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(CP_CLICOD,'999990'), 2) like '%' || ?) or ( UPPER(CP_CLINOM) like '%' || UPPER(?)) or ( UPPER(CP_BARDISN) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(CP_BARESTR,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(CP_BARCOD,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(CP_BARCODR,'90'), 2) like '%' || ?) or ( UPPER(CP_BARCODP) like '%' || UPPER(?)) or ( UPPER(CP_BARAGRE) like '%' || UPPER(?)) or ( UPPER(CP_BARSER) like '%' || UPPER(?)) or ( UPPER(CP_BARSERD) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(CP_BARTIPA,'9990'), 2) like '%' || ?) or ( UPPER(CP_TARTDSC) like '%' || UPPER(?)) or ( UPPER(CP_BARCOLO) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(CP_BARCOLU,'999990'), 2) like '%' || ?) or ( UPPER(CP_BARNOMC) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(CP_BARKGM,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(CP_BARMTR,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(CP_BARPIE,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(CP_BARSIT,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(CP_BARALBK,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(CP_BARALBM,'999990.99'), 2) like '%' || ?) or ( UPPER(CP_BARGIRA) like '%' || UPPER(?)) or ( UPPER(CP_BARPROP) like '%' || UPPER(?)) or ( UPPER(CP_DSC_BAR) like '%' || UPPER(?)) or ( UPPER(CP_DISUSRC) like '%' || UPPER(?)) or ( UPPER(CP_BARMAQC) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int6[1] = (byte)(1) ;
         GXv_int6[2] = (byte)(1) ;
         GXv_int6[3] = (byte)(1) ;
         GXv_int6[4] = (byte)(1) ;
         GXv_int6[5] = (byte)(1) ;
         GXv_int6[6] = (byte)(1) ;
         GXv_int6[7] = (byte)(1) ;
         GXv_int6[8] = (byte)(1) ;
         GXv_int6[9] = (byte)(1) ;
         GXv_int6[10] = (byte)(1) ;
         GXv_int6[11] = (byte)(1) ;
         GXv_int6[12] = (byte)(1) ;
         GXv_int6[13] = (byte)(1) ;
         GXv_int6[14] = (byte)(1) ;
         GXv_int6[15] = (byte)(1) ;
         GXv_int6[16] = (byte)(1) ;
         GXv_int6[17] = (byte)(1) ;
         GXv_int6[18] = (byte)(1) ;
         GXv_int6[19] = (byte)(1) ;
         GXv_int6[20] = (byte)(1) ;
         GXv_int6[21] = (byte)(1) ;
         GXv_int6[22] = (byte)(1) ;
         GXv_int6[23] = (byte)(1) ;
         GXv_int6[24] = (byte)(1) ;
         GXv_int6[25] = (byte)(1) ;
         GXv_int6[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV33bardisnumfrom)==0) )
      {
         addWhere(sWhereString, "(CP_BARDISN >= ?)");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV34bardisnumto)==0) )
      {
         addWhere(sWhereString, "(CP_BARDISN <= ?)");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( ! (0==AV35CliCodfrom) )
      {
         addWhere(sWhereString, "(CP_CLICOD >= ?)");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      if ( ! (0==AV36CliCodto) )
      {
         addWhere(sWhereString, "(CP_CLICOD <= ?)");
      }
      else
      {
         GXv_int6[30] = (byte)(1) ;
      }
      if ( ! (0==AV37BarSitfrom) )
      {
         addWhere(sWhereString, "(CP_BARSIT >= ?)");
      }
      else
      {
         GXv_int6[31] = (byte)(1) ;
      }
      if ( ! (0==AV38BarSitto) )
      {
         addWhere(sWhereString, "(CP_BARSIT <= ?)");
      }
      else
      {
         GXv_int6[32] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV39barfecgenfrom)) )
      {
         addWhere(sWhereString, "(CP_BARFECG >= ?)");
      }
      else
      {
         GXv_int6[33] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV40barfecgento)) )
      {
         addWhere(sWhereString, "(CP_BARFECG <= ?)");
      }
      else
      {
         GXv_int6[34] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV41barfecsalfrom)) )
      {
         addWhere(sWhereString, "(CP_BARFECS >= ?)");
      }
      else
      {
         GXv_int6[35] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV42barfecsalto)) )
      {
         addWhere(sWhereString, "(CP_BARFECS <= ?)");
      }
      else
      {
         GXv_int6[36] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV43BarFecClifrom)) )
      {
         addWhere(sWhereString, "(CP_BARFECC >= ?)");
      }
      else
      {
         GXv_int6[37] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV44barfecclito)) )
      {
         addWhere(sWhereString, "(CP_BARFECC <= ?)");
      }
      else
      {
         GXv_int6[38] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV45BarFecFprfrom)) )
      {
         addWhere(sWhereString, "(CP_BARFECF >= ?)");
      }
      else
      {
         GXv_int6[39] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV46barfecfprto)) )
      {
         addWhere(sWhereString, "(CP_BARFECF <= ?)");
      }
      else
      {
         GXv_int6[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV47BarSerfrom)==0) )
      {
         addWhere(sWhereString, "(CP_BARSER >= ?)");
      }
      else
      {
         GXv_int6[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV48BarSerto)==0) )
      {
         addWhere(sWhereString, "(CP_BARSER <= ?)");
      }
      else
      {
         GXv_int6[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV49BarColNomfrom)==0) )
      {
         addWhere(sWhereString, "(CP_BARCOLO >= ?)");
      }
      else
      {
         GXv_int6[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV50BarColNomto)==0) )
      {
         addWhere(sWhereString, "(CP_BARCOLO <= ?)");
      }
      else
      {
         GXv_int6[44] = (byte)(1) ;
      }
      if ( ! (0==AV51BarColnumfrom) )
      {
         addWhere(sWhereString, "(CP_BARCOLU >= ?)");
      }
      else
      {
         GXv_int6[45] = (byte)(1) ;
      }
      if ( ! (0==AV52BarColNumto) )
      {
         addWhere(sWhereString, "(CP_BARCOLU <= ?)");
      }
      else
      {
         GXv_int6[46] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53BarNomClifrom)==0) )
      {
         addWhere(sWhereString, "(CP_BARNOMC >= ?)");
      }
      else
      {
         GXv_int6[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54BarNomClito)==0) )
      {
         addWhere(sWhereString, "(CP_BARNOMC <= ?)");
      }
      else
      {
         GXv_int6[48] = (byte)(1) ;
      }
      if ( ! (0==AV55BarNumClifrom) )
      {
         addWhere(sWhereString, "(CP_BARNUMC >= ?)");
      }
      else
      {
         GXv_int6[49] = (byte)(1) ;
      }
      if ( ! (0==AV56Barnumclito) )
      {
         addWhere(sWhereString, "(CP_BARNUMC <= ?)");
      }
      else
      {
         GXv_int6[50] = (byte)(1) ;
      }
      if ( ! (0==AV57BarTipArtfrom) )
      {
         addWhere(sWhereString, "(CP_BARTIPA >= ?)");
      }
      else
      {
         GXv_int6[51] = (byte)(1) ;
      }
      if ( ! (0==AV58BarTipArtto) )
      {
         addWhere(sWhereString, "(CP_BARTIPA <= ?)");
      }
      else
      {
         GXv_int6[52] = (byte)(1) ;
      }
      if ( ! (0==AV59BarCodfrom) )
      {
         addWhere(sWhereString, "(CP_BARCOD >= ?)");
      }
      else
      {
         GXv_int6[53] = (byte)(1) ;
      }
      if ( ! (0==AV60BarCodto) )
      {
         addWhere(sWhereString, "(CP_BARCOD <= ?)");
      }
      else
      {
         GXv_int6[54] = (byte)(1) ;
      }
      if ( ! (0==AV61BarCodreofrom) )
      {
         addWhere(sWhereString, "(CP_BARCODR >= ?)");
      }
      else
      {
         GXv_int6[55] = (byte)(1) ;
      }
      if ( ! (0==AV62BarCodreoto) )
      {
         addWhere(sWhereString, "(CP_BARCODR <= ?)");
      }
      else
      {
         GXv_int6[56] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63BarCodparfrom)==0) )
      {
         addWhere(sWhereString, "(CP_BARCODP >= ?)");
      }
      else
      {
         GXv_int6[57] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64BarCodparto)==0) )
      {
         addWhere(sWhereString, "(CP_BARCODP <= ?)");
      }
      else
      {
         GXv_int6[58] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Cod_idtx)==0) )
      {
         addWhere(sWhereString, "(CP_BARPROP = ?)");
      }
      else
      {
         GXv_int6[59] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66BarGirar)==0) )
      {
         addWhere(sWhereString, "(CP_BARGIRA = ?)");
      }
      else
      {
         GXv_int6[60] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67muestras)==0) )
      {
         addWhere(sWhereString, "(CP_BARPLF = ?)");
      }
      else
      {
         GXv_int6[61] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV68OrderedBy == 1 ) && ! AV69OrderedDsc )
      {
         scmdbuf += " ORDER BY CP_CLICOD" ;
      }
      else if ( ( AV68OrderedBy == 1 ) && ( AV69OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CP_CLICOD DESC" ;
      }
      else if ( ( AV68OrderedBy == 2 ) && ! AV69OrderedDsc )
      {
         scmdbuf += " ORDER BY CP_CLINOM" ;
      }
      else if ( ( AV68OrderedBy == 2 ) && ( AV69OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CP_CLINOM DESC" ;
      }
      else if ( ( AV68OrderedBy == 3 ) && ! AV69OrderedDsc )
      {
         scmdbuf += " ORDER BY CP_BARDISN" ;
      }
      else if ( ( AV68OrderedBy == 3 ) && ( AV69OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CP_BARDISN DESC" ;
      }
      else if ( ( AV68OrderedBy == 4 ) && ! AV69OrderedDsc )
      {
         scmdbuf += " ORDER BY CP_BARESTR" ;
      }
      else if ( ( AV68OrderedBy == 4 ) && ( AV69OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CP_BARESTR DESC" ;
      }
      else if ( ( AV68OrderedBy == 5 ) && ! AV69OrderedDsc )
      {
         scmdbuf += " ORDER BY CP_BARCOD" ;
      }
      else if ( ( AV68OrderedBy == 5 ) && ( AV69OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CP_BARCOD DESC" ;
      }
      else if ( ( AV68OrderedBy == 6 ) && ! AV69OrderedDsc )
      {
         scmdbuf += " ORDER BY CP_BARCODR" ;
      }
      else if ( ( AV68OrderedBy == 6 ) && ( AV69OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CP_BARCODR DESC" ;
      }
      else if ( ( AV68OrderedBy == 7 ) && ! AV69OrderedDsc )
      {
         scmdbuf += " ORDER BY CP_BARCODP" ;
      }
      else if ( ( AV68OrderedBy == 7 ) && ( AV69OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CP_BARCODP DESC" ;
      }
      else if ( ( AV68OrderedBy == 8 ) && ! AV69OrderedDsc )
      {
         scmdbuf += " ORDER BY CP_BARAGRE" ;
      }
      else if ( ( AV68OrderedBy == 8 ) && ( AV69OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CP_BARAGRE DESC" ;
      }
      else if ( ( AV68OrderedBy == 9 ) && ! AV69OrderedDsc )
      {
         scmdbuf += " ORDER BY CP_BARSER" ;
      }
      else if ( ( AV68OrderedBy == 9 ) && ( AV69OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CP_BARSER DESC" ;
      }
      else if ( ( AV68OrderedBy == 10 ) && ! AV69OrderedDsc )
      {
         scmdbuf += " ORDER BY CP_BARSERD" ;
      }
      else if ( ( AV68OrderedBy == 10 ) && ( AV69OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CP_BARSERD DESC" ;
      }
      else if ( ( AV68OrderedBy == 11 ) && ! AV69OrderedDsc )
      {
         scmdbuf += " ORDER BY CP_BARTIPA" ;
      }
      else if ( ( AV68OrderedBy == 11 ) && ( AV69OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CP_BARTIPA DESC" ;
      }
      else if ( ( AV68OrderedBy == 12 ) && ! AV69OrderedDsc )
      {
         scmdbuf += " ORDER BY CP_TARTDSC" ;
      }
      else if ( ( AV68OrderedBy == 12 ) && ( AV69OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CP_TARTDSC DESC" ;
      }
      else if ( ( AV68OrderedBy == 13 ) && ! AV69OrderedDsc )
      {
         scmdbuf += " ORDER BY CP_BARCOLO" ;
      }
      else if ( ( AV68OrderedBy == 13 ) && ( AV69OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CP_BARCOLO DESC" ;
      }
      else if ( ( AV68OrderedBy == 14 ) && ! AV69OrderedDsc )
      {
         scmdbuf += " ORDER BY CP_BARCOLU" ;
      }
      else if ( ( AV68OrderedBy == 14 ) && ( AV69OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CP_BARCOLU DESC" ;
      }
      else if ( ( AV68OrderedBy == 15 ) && ! AV69OrderedDsc )
      {
         scmdbuf += " ORDER BY CP_BARNOMC" ;
      }
      else if ( ( AV68OrderedBy == 15 ) && ( AV69OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CP_BARNOMC DESC" ;
      }
      else if ( ( AV68OrderedBy == 16 ) && ! AV69OrderedDsc )
      {
         scmdbuf += " ORDER BY CP_BARKGM" ;
      }
      else if ( ( AV68OrderedBy == 16 ) && ( AV69OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CP_BARKGM DESC" ;
      }
      else if ( ( AV68OrderedBy == 17 ) && ! AV69OrderedDsc )
      {
         scmdbuf += " ORDER BY CP_BARMTR" ;
      }
      else if ( ( AV68OrderedBy == 17 ) && ( AV69OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CP_BARMTR DESC" ;
      }
      else if ( ( AV68OrderedBy == 18 ) && ! AV69OrderedDsc )
      {
         scmdbuf += " ORDER BY CP_BARPIE" ;
      }
      else if ( ( AV68OrderedBy == 18 ) && ( AV69OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CP_BARPIE DESC" ;
      }
      else if ( ( AV68OrderedBy == 19 ) && ! AV69OrderedDsc )
      {
         scmdbuf += " ORDER BY CP_BARSIT" ;
      }
      else if ( ( AV68OrderedBy == 19 ) && ( AV69OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CP_BARSIT DESC" ;
      }
      else if ( ( AV68OrderedBy == 20 ) && ! AV69OrderedDsc )
      {
         scmdbuf += " ORDER BY CP_BARFECG" ;
      }
      else if ( ( AV68OrderedBy == 20 ) && ( AV69OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CP_BARFECG DESC" ;
      }
      else if ( ( AV68OrderedBy == 21 ) && ! AV69OrderedDsc )
      {
         scmdbuf += " ORDER BY CP_BARFECC" ;
      }
      else if ( ( AV68OrderedBy == 21 ) && ( AV69OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CP_BARFECC DESC" ;
      }
      else if ( ( AV68OrderedBy == 22 ) && ! AV69OrderedDsc )
      {
         scmdbuf += " ORDER BY CP_BARFECF" ;
      }
      else if ( ( AV68OrderedBy == 22 ) && ( AV69OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CP_BARFECF DESC" ;
      }
      else if ( ( AV68OrderedBy == 23 ) && ! AV69OrderedDsc )
      {
         scmdbuf += " ORDER BY CP_BARFECS" ;
      }
      else if ( ( AV68OrderedBy == 23 ) && ( AV69OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CP_BARFECS DESC" ;
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
                  return conditional_P0AD62(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).byteValue() , ((Number) dynConstraints[6]).byteValue() , (java.util.Date)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (java.util.Date)dynConstraints[10] , (java.util.Date)dynConstraints[11] , (java.util.Date)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).shortValue() , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).byteValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , ((Number) dynConstraints[39]).byteValue() , ((Number) dynConstraints[40]).intValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).shortValue() , (String)dynConstraints[47] , (String)dynConstraints[48] , ((Number) dynConstraints[49]).intValue() , (String)dynConstraints[50] , (java.math.BigDecimal)dynConstraints[51] , (java.math.BigDecimal)dynConstraints[52] , ((Number) dynConstraints[53]).intValue() , ((Number) dynConstraints[54]).byteValue() , (java.math.BigDecimal)dynConstraints[55] , (java.math.BigDecimal)dynConstraints[56] , (String)dynConstraints[57] , (String)dynConstraints[58] , (String)dynConstraints[59] , (String)dynConstraints[60] , (String)dynConstraints[61] , (java.util.Date)dynConstraints[62] , (java.util.Date)dynConstraints[63] , (java.util.Date)dynConstraints[64] , (java.util.Date)dynConstraints[65] , ((Number) dynConstraints[66]).intValue() , (String)dynConstraints[67] , ((Number) dynConstraints[68]).shortValue() , ((Boolean) dynConstraints[69]).booleanValue() , (String)dynConstraints[70] , (String)dynConstraints[71] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AD62", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               ((String[]) buf[8])[0] = rslt.getString(9, 8);
               ((String[]) buf[9])[0] = rslt.getVarchar(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 8);
               ((String[]) buf[11])[0] = rslt.getVarchar(12);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,2);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(14,2);
               ((byte[]) buf[14])[0] = rslt.getByte(15);
               ((int[]) buf[15])[0] = rslt.getInt(16);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(17,2);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(18,2);
               ((String[]) buf[18])[0] = rslt.getVarchar(19);
               ((int[]) buf[19])[0] = rslt.getInt(20);
               ((String[]) buf[20])[0] = rslt.getString(21, 13);
               ((String[]) buf[21])[0] = rslt.getVarchar(22);
               ((short[]) buf[22])[0] = rslt.getShort(23);
               ((String[]) buf[23])[0] = rslt.getVarchar(24);
               ((String[]) buf[24])[0] = rslt.getString(25, 16);
               ((String[]) buf[25])[0] = rslt.getString(26, 1);
               ((String[]) buf[26])[0] = rslt.getString(27, 1);
               ((byte[]) buf[27])[0] = rslt.getByte(28);
               ((int[]) buf[28])[0] = rslt.getInt(29);
               ((byte[]) buf[29])[0] = rslt.getByte(30);
               ((String[]) buf[30])[0] = rslt.getString(31, 8);
               ((String[]) buf[31])[0] = rslt.getVarchar(32);
               ((int[]) buf[32])[0] = rslt.getInt(33);
               ((long[]) buf[33])[0] = rslt.getLong(34);
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
                  stmt.setString(sIdx, (String)parms[62], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[65], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[66], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[67], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[68], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[69], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[70], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[71], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[72], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[73], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[74], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[75], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[82], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[83], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[84], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[85], 100);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[86], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[87], 100);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[88], 100);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 8);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 8);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[91]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[92]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[93]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[94]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[95]);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[96]);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[97]);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[98]);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[99]);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[100]);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[101]);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[102]);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[103], 16);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[104], 16);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[105], 13);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[106], 13);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[107]).intValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[108]).intValue());
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[109], 13);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[110], 13);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[111]).intValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[112]).intValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[113]).shortValue());
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[114]).shortValue());
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[115]).intValue());
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[116]).intValue());
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[117]).byteValue());
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[118]).byteValue());
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[119], 1);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[120], 1);
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[121], 4);
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[122], 20);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[123], 1);
               }
               return;
      }
   }

}

