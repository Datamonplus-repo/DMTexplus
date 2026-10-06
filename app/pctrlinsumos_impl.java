package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class pctrlinsumos_impl extends GXWebProcedure
{
   public pctrlinsumos_impl( com.genexus.internet.HttpContext context )
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
         AV24Emprcod = gxfirstwebparm ;
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            AV46ProductosConsumos = httpContext.GetPar( "ProductosConsumos") ;
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
      AV59UsurCod = " " ;
      GXt_char1 = AV55Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      pctrlinsumos_impl.this.GXt_char1 = GXv_char2[0] ;
      AV55Station = GXt_char1 ;
      GXv_char2[0] = AV24Emprcod ;
      GXv_char3[0] = AV25EmprNom ;
      GXv_char4[0] = AV59UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV55Station, GXv_char2, GXv_char3, GXv_char4) ;
      pctrlinsumos_impl.this.AV24Emprcod = GXv_char2[0] ;
      pctrlinsumos_impl.this.AV25EmprNom = GXv_char3[0] ;
      pctrlinsumos_impl.this.AV59UsurCod = GXv_char4[0] ;
      GXt_int5 = AV21Cotexsur ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV24Emprcod, httpContext.getMessage( "COTEXS", ""), GXv_int6) ;
      pctrlinsumos_impl.this.GXt_int5 = GXv_int6[0] ;
      AV21Cotexsur = GXt_int5 ;
      AV33Hhmmss = GXutil.serverNow( context, remoteHandle, pr_default) ;
      AV11ActDatos = httpContext.getMessage( "S", "") ;
      AV52Siacumular = ((AV21Cotexsur==0) ? httpContext.getMessage( "N", "") : httpContext.getMessage( "S", "")) ;
      AV37Nominf = GXutil.trim( AV64Pgmdesc) + "_" + GXutil.padl( GXutil.trim( GXutil.substring( localUtil.ttoc( AV33Hhmmss, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), 1, 2)), (short)(2), "0") + GXutil.padl( GXutil.trim( GXutil.substring( localUtil.ttoc( AV33Hhmmss, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), 4, 2)), (short)(2), "0") + GXutil.padl( GXutil.trim( GXutil.substring( localUtil.ttoc( AV33Hhmmss, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), 7, 2)), (short)(2), "0") + GXutil.padl( GXutil.trim( GXutil.substring( localUtil.ttoc( AV33Hhmmss, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), 1, 2)), (short)(2), "0") + GXutil.padl( GXutil.trim( GXutil.substring( localUtil.ttoc( AV33Hhmmss, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), 4, 2)), (short)(2), "0") + GXutil.padl( GXutil.trim( GXutil.substring( localUtil.ttoc( AV33Hhmmss, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), 7, 2)), (short)(2), "0") ;
      AV47Random = (int)(GXutil.random( )*10000) ;
      AV32Filename = GXutil.trim( AV37Nominf) + httpContext.getMessage( "_ExportCSV-", "") + GXutil.trim( GXutil.str( AV47Random, 8, 0)) + ".csv" ;
      AV10TextFile.setSource( AV32Filename );
      AV10TextFile.create();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV10TextFile.openWrite("");
      /* Execute user subroutine: 'CHECKSTATUS' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV58TextFileLine = httpContext.getMessage( " Auditoria Productos. Cierre de Recetas ", "") + AV11ActDatos + httpContext.getMessage( "  Acumular Salidas Dia Inventario? = ", "") + AV52Siacumular ;
      if ( GXutil.len( AV58TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(AV58TextFileLine);
      }
      AV58TextFileLine = httpContext.getMessage( "Producto", "") + ";" + httpContext.getMessage( "Descripcion", "") + ";" + httpContext.getMessage( "Compras Antes Inv?", "") + ";" + httpContext.getMessage( "Salidas Antes Inv?", "") + ";" + httpContext.getMessage( "Fecha Inventario", "") + ";" + httpContext.getMessage( "Cantidad Inventario", "") + ";" + httpContext.getMessage( "Compras Periodo", "") + ";" + httpContext.getMessage( "Consumos Periodo", "") + ";" ;
      AV58TextFileLine += httpContext.getMessage( "Existencias Almacen(BaseDatos)", "") + ";" + httpContext.getMessage( "Existencias Calculadas", "") + ";" + httpContext.getMessage( "Diferencia", "") + ";" + httpContext.getMessage( "Saldo Compras", "") + ";" + httpContext.getMessage( "Diferencia", "") + ";" + httpContext.getMessage( "Observacion", "") + ";" + httpContext.getMessage( "Cantidad Consumida Cierre", "") ;
      if ( GXutil.len( AV58TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(AV58TextFileLine);
      }
      AV9SDTProductosConsumosCollection.fromJSonString(AV46ProductosConsumos, null);
      AV65GXV1 = 1 ;
      while ( AV65GXV1 <= AV9SDTProductosConsumosCollection.size() )
      {
         AV51SDTProductosConsumos = (app.SdtSDTProductosConsumos)((app.SdtSDTProductosConsumos)AV9SDTProductosConsumosCollection.elementAt(-1+AV65GXV1));
         AV43Prdnum = AV51SDTProductosConsumos.getgxTv_SdtSDTProductosConsumos_Producto() ;
         AV12Cant = AV51SDTProductosConsumos.getgxTv_SdtSDTProductosConsumos_Cantidad() ;
         GXv_char4[0] = AV24Emprcod ;
         GXv_char3[0] = AV43Prdnum ;
         GXv_decimal7[0] = AV27Entradas ;
         GXv_decimal8[0] = AV50Salidas ;
         GXv_date9[0] = AV49Recfec ;
         GXv_decimal10[0] = AV13CantInv ;
         GXv_decimal11[0] = AV18Compras ;
         GXv_decimal12[0] = AV19Consumos ;
         GXv_decimal13[0] = AV41Prdexialm ;
         GXv_decimal14[0] = AV30ExisCalculadas ;
         GXv_decimal15[0] = AV22Dif ;
         GXv_decimal16[0] = AV28EntUniRem ;
         GXv_decimal17[0] = AV23Dif2 ;
         GXv_char2[0] = AV38Obs ;
         new app.pupq102(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_decimal7, GXv_decimal8, GXv_date9, GXv_decimal10, GXv_decimal11, GXv_decimal12, GXv_decimal13, GXv_decimal14, GXv_decimal15, GXv_decimal16, GXv_decimal17, GXv_char2) ;
         pctrlinsumos_impl.this.AV24Emprcod = GXv_char4[0] ;
         pctrlinsumos_impl.this.AV43Prdnum = GXv_char3[0] ;
         pctrlinsumos_impl.this.AV27Entradas = GXv_decimal7[0] ;
         pctrlinsumos_impl.this.AV50Salidas = GXv_decimal8[0] ;
         pctrlinsumos_impl.this.AV49Recfec = GXv_date9[0] ;
         pctrlinsumos_impl.this.AV13CantInv = GXv_decimal10[0] ;
         pctrlinsumos_impl.this.AV18Compras = GXv_decimal11[0] ;
         pctrlinsumos_impl.this.AV19Consumos = GXv_decimal12[0] ;
         pctrlinsumos_impl.this.AV41Prdexialm = GXv_decimal13[0] ;
         pctrlinsumos_impl.this.AV30ExisCalculadas = GXv_decimal14[0] ;
         pctrlinsumos_impl.this.AV22Dif = GXv_decimal15[0] ;
         pctrlinsumos_impl.this.AV28EntUniRem = GXv_decimal16[0] ;
         pctrlinsumos_impl.this.AV23Dif2 = GXv_decimal17[0] ;
         pctrlinsumos_impl.this.AV38Obs = GXv_char2[0] ;
         GXt_char1 = AV42prdNom ;
         GXv_char4[0] = AV24Emprcod ;
         GXv_char3[0] = AV43Prdnum ;
         GXv_char2[0] = GXt_char1 ;
         new app.pprddsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
         pctrlinsumos_impl.this.AV24Emprcod = GXv_char4[0] ;
         pctrlinsumos_impl.this.AV43Prdnum = GXv_char3[0] ;
         pctrlinsumos_impl.this.GXt_char1 = GXv_char2[0] ;
         AV42prdNom = GXt_char1 ;
         AV58TextFileLine = AV43Prdnum + ";" + AV42prdNom + ";" + GXutil.str( AV27Entradas, 12, 4) + ";" + GXutil.str( AV50Salidas, 12, 4) + ";" + localUtil.dtoc( AV49Recfec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + ";" + GXutil.str( AV13CantInv, 12, 4) + ";" + GXutil.str( AV18Compras, 12, 4) + ";" + GXutil.str( AV19Consumos, 12, 4) + ";" ;
         AV58TextFileLine += GXutil.str( AV41Prdexialm, 12, 4) + ";" + GXutil.str( AV30ExisCalculadas, 12, 4) + ";" + GXutil.str( AV22Dif, 12, 4) + ";" + GXutil.str( AV28EntUniRem, 11, 4) + ";" + GXutil.str( AV23Dif2, 12, 4) + ";" + AV38Obs + ";" + GXutil.str( AV12Cant, 12, 4) ;
         if ( GXutil.len( AV58TextFileLine) > 0 )
         {
            AV10TextFile.writeLine(AV58TextFileLine);
         }
         GXv_char4[0] = AV24Emprcod ;
         GXv_char3[0] = AV43Prdnum ;
         GXv_char2[0] = AV52Siacumular ;
         GXv_decimal17[0] = AV22Dif ;
         GXv_decimal16[0] = AV23Dif2 ;
         GXv_char18[0] = AV38Obs ;
         new app.pupq003(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2, GXv_decimal17, GXv_decimal16, GXv_char18) ;
         pctrlinsumos_impl.this.AV24Emprcod = GXv_char4[0] ;
         pctrlinsumos_impl.this.AV43Prdnum = GXv_char3[0] ;
         pctrlinsumos_impl.this.AV52Siacumular = GXv_char2[0] ;
         pctrlinsumos_impl.this.AV22Dif = GXv_decimal17[0] ;
         pctrlinsumos_impl.this.AV23Dif2 = GXv_decimal16[0] ;
         pctrlinsumos_impl.this.AV38Obs = GXv_char18[0] ;
         GXv_char18[0] = AV24Emprcod ;
         GXv_char4[0] = AV43Prdnum ;
         GXv_decimal17[0] = AV22Dif ;
         GXv_decimal16[0] = AV23Dif2 ;
         GXv_char3[0] = AV38Obs ;
         new app.pupq002(remoteHandle, context).execute( GXv_char18, GXv_char4, GXv_decimal17, GXv_decimal16, GXv_char3) ;
         pctrlinsumos_impl.this.AV24Emprcod = GXv_char18[0] ;
         pctrlinsumos_impl.this.AV43Prdnum = GXv_char4[0] ;
         pctrlinsumos_impl.this.AV22Dif = GXv_decimal17[0] ;
         pctrlinsumos_impl.this.AV23Dif2 = GXv_decimal16[0] ;
         pctrlinsumos_impl.this.AV38Obs = GXv_char3[0] ;
         new app.pcommit(remoteHandle, context).execute( ) ;
         GXv_char18[0] = AV24Emprcod ;
         GXv_char4[0] = AV43Prdnum ;
         GXv_char3[0] = AV52Siacumular ;
         GXv_decimal17[0] = AV22Dif ;
         GXv_decimal16[0] = AV23Dif2 ;
         GXv_char2[0] = AV38Obs ;
         new app.pupq003(remoteHandle, context).execute( GXv_char18, GXv_char4, GXv_char3, GXv_decimal17, GXv_decimal16, GXv_char2) ;
         pctrlinsumos_impl.this.AV24Emprcod = GXv_char18[0] ;
         pctrlinsumos_impl.this.AV43Prdnum = GXv_char4[0] ;
         pctrlinsumos_impl.this.AV52Siacumular = GXv_char3[0] ;
         pctrlinsumos_impl.this.AV22Dif = GXv_decimal17[0] ;
         pctrlinsumos_impl.this.AV23Dif2 = GXv_decimal16[0] ;
         pctrlinsumos_impl.this.AV38Obs = GXv_char2[0] ;
         GXv_char18[0] = AV24Emprcod ;
         GXv_char4[0] = AV43Prdnum ;
         GXv_decimal17[0] = AV22Dif ;
         GXv_decimal16[0] = AV23Dif2 ;
         GXv_char3[0] = AV38Obs ;
         new app.pupq002(remoteHandle, context).execute( GXv_char18, GXv_char4, GXv_decimal17, GXv_decimal16, GXv_char3) ;
         pctrlinsumos_impl.this.AV24Emprcod = GXv_char18[0] ;
         pctrlinsumos_impl.this.AV43Prdnum = GXv_char4[0] ;
         pctrlinsumos_impl.this.AV22Dif = GXv_decimal17[0] ;
         pctrlinsumos_impl.this.AV23Dif2 = GXv_decimal16[0] ;
         pctrlinsumos_impl.this.AV38Obs = GXv_char3[0] ;
         new app.pcommit(remoteHandle, context).execute( ) ;
         AV65GXV1 = (int)(AV65GXV1+1) ;
      }
      AV10TextFile.close();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      if ( AV10TextFile.getErrCode() == 0 )
      {
         if ( ! httpContext.isAjaxRequest( ) )
         {
            AV8HttpResponse.addHeader("Content-Type", "text/csv");
         }
         if ( ! httpContext.isAjaxRequest( ) )
         {
            AV8HttpResponse.addHeader("Content-Disposition", "attachment;filename="+GXutil.trim( AV32Filename));
         }
         AV8HttpResponse.addFile(AV10TextFile.getAbsoluteName());
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
      /* 'CHECKSTATUS' Routine */
      returnInSub = false ;
      if ( AV10TextFile.getErrCode() != 0 )
      {
         AV32Filename = "" ;
         AV61ErrorMessage = AV10TextFile.getErrDescription() ;
         AV10TextFile.close();
         AV8HttpResponse.addString(AV61ErrorMessage);
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
      AV24Emprcod = "" ;
      AV46ProductosConsumos = "" ;
      AV59UsurCod = "" ;
      AV55Station = "" ;
      AV25EmprNom = "" ;
      GXv_int6 = new byte[1] ;
      AV33Hhmmss = GXutil.resetTime( GXutil.nullDate() );
      AV11ActDatos = "" ;
      AV52Siacumular = "" ;
      AV37Nominf = "" ;
      AV64Pgmdesc = "" ;
      AV32Filename = "" ;
      AV10TextFile = new com.genexus.util.GXFile();
      AV58TextFileLine = "" ;
      AV9SDTProductosConsumosCollection = new GXBaseCollection<app.SdtSDTProductosConsumos>(app.SdtSDTProductosConsumos.class, "SDTProductosConsumos", "TexplusNET", remoteHandle);
      AV51SDTProductosConsumos = new app.SdtSDTProductosConsumos(remoteHandle, context);
      AV43Prdnum = "" ;
      AV12Cant = DecimalUtil.ZERO ;
      AV27Entradas = DecimalUtil.ZERO ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      AV50Salidas = DecimalUtil.ZERO ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      AV49Recfec = GXutil.nullDate() ;
      GXv_date9 = new java.util.Date[1] ;
      AV13CantInv = DecimalUtil.ZERO ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      AV18Compras = DecimalUtil.ZERO ;
      GXv_decimal11 = new java.math.BigDecimal[1] ;
      AV19Consumos = DecimalUtil.ZERO ;
      GXv_decimal12 = new java.math.BigDecimal[1] ;
      AV41Prdexialm = DecimalUtil.ZERO ;
      GXv_decimal13 = new java.math.BigDecimal[1] ;
      AV30ExisCalculadas = DecimalUtil.ZERO ;
      GXv_decimal14 = new java.math.BigDecimal[1] ;
      AV22Dif = DecimalUtil.ZERO ;
      GXv_decimal15 = new java.math.BigDecimal[1] ;
      AV28EntUniRem = DecimalUtil.ZERO ;
      AV23Dif2 = DecimalUtil.ZERO ;
      AV38Obs = "" ;
      AV42prdNom = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_char18 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_decimal17 = new java.math.BigDecimal[1] ;
      GXv_decimal16 = new java.math.BigDecimal[1] ;
      GXv_char3 = new String[1] ;
      AV8HttpResponse = httpContext.getHttpResponse();
      AV61ErrorMessage = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pctrlinsumos__default(),
         new Object[] {
         }
      );
      AV64Pgmdesc = httpContext.getMessage( "ConrolProductosCierre", "") ;
      /* GeneXus formulas. */
      AV64Pgmdesc = httpContext.getMessage( "ConrolProductosCierre", "") ;
      Gx_err = (short)(0) ;
   }

   private byte AV21Cotexsur ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int AV47Random ;
   private int AV65GXV1 ;
   private java.math.BigDecimal AV12Cant ;
   private java.math.BigDecimal AV27Entradas ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private java.math.BigDecimal AV50Salidas ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal AV13CantInv ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private java.math.BigDecimal AV18Compras ;
   private java.math.BigDecimal GXv_decimal11[] ;
   private java.math.BigDecimal AV19Consumos ;
   private java.math.BigDecimal GXv_decimal12[] ;
   private java.math.BigDecimal AV41Prdexialm ;
   private java.math.BigDecimal GXv_decimal13[] ;
   private java.math.BigDecimal AV30ExisCalculadas ;
   private java.math.BigDecimal GXv_decimal14[] ;
   private java.math.BigDecimal AV22Dif ;
   private java.math.BigDecimal GXv_decimal15[] ;
   private java.math.BigDecimal AV28EntUniRem ;
   private java.math.BigDecimal AV23Dif2 ;
   private java.math.BigDecimal GXv_decimal17[] ;
   private java.math.BigDecimal GXv_decimal16[] ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV24Emprcod ;
   private String AV59UsurCod ;
   private String AV55Station ;
   private String AV25EmprNom ;
   private String AV11ActDatos ;
   private String AV52Siacumular ;
   private String AV37Nominf ;
   private String AV64Pgmdesc ;
   private String AV43Prdnum ;
   private String AV38Obs ;
   private String AV42prdNom ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXv_char18[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private java.util.Date AV33Hhmmss ;
   private java.util.Date AV49Recfec ;
   private java.util.Date GXv_date9[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private String AV58TextFileLine ;
   private String AV46ProductosConsumos ;
   private String AV32Filename ;
   private String AV61ErrorMessage ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private com.genexus.internet.HttpResponse AV8HttpResponse ;
   private GXBaseCollection<app.SdtSDTProductosConsumos> AV9SDTProductosConsumosCollection ;
   private app.SdtSDTProductosConsumos AV51SDTProductosConsumos ;
}

final  class pctrlinsumos__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

}

