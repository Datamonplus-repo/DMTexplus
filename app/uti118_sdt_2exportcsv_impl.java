package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class uti118_sdt_2exportcsv_impl extends GXWebProcedure
{
   public uti118_sdt_2exportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV13InformeInditex = AV26WebSession.getValue(httpContext.getMessage( "InformeInditex", "")) ;
      /* Execute user subroutine: 'OPENDOCUMENT' */
      S131 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITECOLUMNTITLES' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITEDATA' */
      S121 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'CLOSEDOCUMENT' */
      S151 ();
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
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV14TextFileLine = "" ;
      AV14TextFileLine = httpContext.getMessage( "Codigo Producto", "") + ";" ;
      AV14TextFileLine += httpContext.getMessage( "Descripcion Producto", "") + ";" ;
      AV14TextFileLine += httpContext.getMessage( "Categoria", "") + ";" ;
      AV14TextFileLine += httpContext.getMessage( "Funcion", "") + ";" ;
      AV14TextFileLine += httpContext.getMessage( "CAS", "") + ";" ;
      AV14TextFileLine += httpContext.getMessage( "Nº EINECS", "") + ";" ;
      AV14TextFileLine += httpContext.getMessage( "Nombre Quimico Sustancia", "") + ";" ;
      AV14TextFileLine += httpContext.getMessage( "ZDHC", "") + ";" ;
      AV14TextFileLine += httpContext.getMessage( "Lote", "") + ";" ;
      AV14TextFileLine += httpContext.getMessage( "Fabricante", "") + ";" ;
      AV14TextFileLine += httpContext.getMessage( "Distribuidor", "") + ";" ;
      AV14TextFileLine += httpContext.getMessage( "Consumos", "") + ";" ;
      AV14TextFileLine += httpContext.getMessage( "Compras", "") + ";" ;
      AV14TextFileLine += httpContext.getMessage( "Stock Inicial", "") + ";" ;
      AV14TextFileLine += httpContext.getMessage( "Stock Final", "") ;
      AV14TextFileLine += httpContext.getMessage( "Fecha Seguridad", "") ;
      AV14TextFileLine += httpContext.getMessage( "Utilizacion", "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 1, -1));
      }
   }

   public void S121( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV14TextFileLine = "" ;
      AV15SdtInformeInditexCollection.fromJSonString(AV13InformeInditex, null);
      AV37GXV1 = 1 ;
      while ( AV37GXV1 <= AV15SdtInformeInditexCollection.size() )
      {
         AV16sdtInformeInditex = (app.SdtSDTInformeInditex)((app.SdtSDTInformeInditex)AV15SdtInformeInditexCollection.elementAt(-1+AV37GXV1));
         AV17PrdNum = AV16sdtInformeInditex.getgxTv_SdtSDTInformeInditex_Producto() ;
         AV18Prdnom = AV16sdtInformeInditex.getgxTv_SdtSDTInformeInditex_Descripcion() ;
         AV27Categoria = AV16sdtInformeInditex.getgxTv_SdtSDTInformeInditex_Categoria() ;
         AV28PrdFuncion = AV16sdtInformeInditex.getgxTv_SdtSDTInformeInditex_Prdfuncion() ;
         AV29PrdNroCAS = AV16sdtInformeInditex.getgxTv_SdtSDTInformeInditex_Prdnrocas() ;
         AV30PrdEINECS = AV16sdtInformeInditex.getgxTv_SdtSDTInformeInditex_Prdeinecs() ;
         AV31PrdNmQu = AV16sdtInformeInditex.getgxTv_SdtSDTInformeInditex_Prdnmqu() ;
         AV32PrdZDHC = AV16sdtInformeInditex.getgxTv_SdtSDTInformeInditex_Prdzdhc() ;
         AV19Lote = AV16sdtInformeInditex.getgxTv_SdtSDTInformeInditex_Lote() ;
         AV20PrdFabNm = AV16sdtInformeInditex.getgxTv_SdtSDTInformeInditex_Fabricante() ;
         AV21PrvNom = AV16sdtInformeInditex.getgxTv_SdtSDTInformeInditex_Proveedor() ;
         AV22CantC = AV16sdtInformeInditex.getgxTv_SdtSDTInformeInditex_Cantc() ;
         AV23CantCm = AV16sdtInformeInditex.getgxTv_SdtSDTInformeInditex_Cantcm() ;
         AV24Stockfinal = AV16sdtInformeInditex.getgxTv_SdtSDTInformeInditex_Stockfinal() ;
         AV25StockInicial = AV16sdtInformeInditex.getgxTv_SdtSDTInformeInditex_Stockinicial() ;
         AV33PrdFHS = AV16sdtInformeInditex.getgxTv_SdtSDTInformeInditex_Prdfhs() ;
         AV34LocUtiDc = AV16sdtInformeInditex.getgxTv_SdtSDTInformeInditex_Locutidc() ;
         AV14TextFileLine = "" ;
         AV14TextFileLine = AV17PrdNum + ";" ;
         AV14TextFileLine += AV18Prdnom + ";" ;
         AV14TextFileLine += AV27Categoria + ";" ;
         AV14TextFileLine += AV28PrdFuncion + ";" ;
         AV14TextFileLine += AV29PrdNroCAS + ";" ;
         AV14TextFileLine += AV30PrdEINECS + ";" ;
         AV14TextFileLine += AV31PrdNmQu + ";" ;
         AV14TextFileLine += AV32PrdZDHC + ";" ;
         AV14TextFileLine += AV19Lote + ";" ;
         AV14TextFileLine += AV20PrdFabNm + ";" ;
         AV14TextFileLine += AV18Prdnom + ";" ;
         AV14TextFileLine += GXutil.trim( GXutil.str( AV22CantC, 11, 3)) + ";" ;
         AV14TextFileLine += GXutil.trim( GXutil.str( AV23CantCm, 11, 3)) + ";" ;
         AV14TextFileLine += GXutil.trim( GXutil.str( AV25StockInicial, 11, 3)) + ";" ;
         AV14TextFileLine += GXutil.trim( GXutil.str( AV24Stockfinal, 11, 3)) + ";" ;
         AV14TextFileLine += GXutil.trim( localUtil.dtoc( AV33PrdFHS, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) + ";" ;
         AV14TextFileLine += GXutil.trim( AV34LocUtiDc) ;
         if ( GXutil.len( AV14TextFileLine) > 0 )
         {
            AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 1, -1));
         }
         AV37GXV1 = (int)(AV37GXV1+1) ;
      }
   }

   public void S131( )
   {
      /* 'OPENDOCUMENT' Routine */
      returnInSub = false ;
      AV8Random = (int)(GXutil.random( )*10000) ;
      AV9Filename = "WWUti118_SDT_2ExportCSV-" + GXutil.trim( GXutil.str( AV8Random, 8, 0)) + ".csv" ;
      AV10TextFile.setSource( AV9Filename );
      AV10TextFile.create();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S141 ();
      if (returnInSub) return;
      AV10TextFile.openWrite("");
      /* Execute user subroutine: 'CHECKSTATUS' */
      S141 ();
      if (returnInSub) return;
   }

   public void S151( )
   {
      /* 'CLOSEDOCUMENT' Routine */
      returnInSub = false ;
      AV10TextFile.close();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S141 ();
      if (returnInSub) return;
      if ( AV10TextFile.getErrCode() == 0 )
      {
         if ( ! httpContext.isAjaxRequest( ) )
         {
            AV12HttpResponse.addHeader("Content-Type", "text/csv");
         }
         if ( ! httpContext.isAjaxRequest( ) )
         {
            AV12HttpResponse.addHeader("Content-Disposition", "attachment;filename=WWUti118_SDT_2ExportCSV.csv");
         }
         AV12HttpResponse.addFile(AV10TextFile.getAbsoluteName());
      }
   }

   public void S141( )
   {
      /* 'CHECKSTATUS' Routine */
      returnInSub = false ;
      if ( AV10TextFile.getErrCode() != 0 )
      {
         AV9Filename = "" ;
         AV11ErrorMessage = AV10TextFile.getErrDescription() ;
         AV10TextFile.close();
         AV12HttpResponse.addString(AV11ErrorMessage);
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
      AV13InformeInditex = "" ;
      AV26WebSession = httpContext.getWebSession();
      AV14TextFileLine = "" ;
      AV10TextFile = new com.genexus.util.GXFile();
      AV15SdtInformeInditexCollection = new GXBaseCollection<app.SdtSDTInformeInditex>(app.SdtSDTInformeInditex.class, "SDTInformeInditex", "TexplusNET", remoteHandle);
      AV16sdtInformeInditex = new app.SdtSDTInformeInditex(remoteHandle, context);
      AV17PrdNum = "" ;
      AV18Prdnom = "" ;
      AV27Categoria = "" ;
      AV28PrdFuncion = "" ;
      AV29PrdNroCAS = "" ;
      AV30PrdEINECS = "" ;
      AV31PrdNmQu = "" ;
      AV32PrdZDHC = "" ;
      AV19Lote = "" ;
      AV20PrdFabNm = "" ;
      AV21PrvNom = "" ;
      AV22CantC = DecimalUtil.ZERO ;
      AV23CantCm = DecimalUtil.ZERO ;
      AV24Stockfinal = DecimalUtil.ZERO ;
      AV25StockInicial = DecimalUtil.ZERO ;
      AV33PrdFHS = GXutil.nullDate() ;
      AV34LocUtiDc = "" ;
      AV9Filename = "" ;
      AV12HttpResponse = httpContext.getHttpResponse();
      AV11ErrorMessage = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short Gx_err ;
   private int AV37GXV1 ;
   private int AV8Random ;
   private java.math.BigDecimal AV22CantC ;
   private java.math.BigDecimal AV23CantCm ;
   private java.math.BigDecimal AV24Stockfinal ;
   private java.math.BigDecimal AV25StockInicial ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV17PrdNum ;
   private String AV18Prdnom ;
   private String AV27Categoria ;
   private String AV28PrdFuncion ;
   private String AV29PrdNroCAS ;
   private String AV30PrdEINECS ;
   private String AV32PrdZDHC ;
   private String AV19Lote ;
   private String AV20PrdFabNm ;
   private String AV21PrvNom ;
   private String AV34LocUtiDc ;
   private java.util.Date AV33PrdFHS ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private String AV14TextFileLine ;
   private String AV13InformeInditex ;
   private String AV31PrdNmQu ;
   private String AV9Filename ;
   private String AV11ErrorMessage ;
   private com.genexus.webpanels.WebSession AV26WebSession ;
   private com.genexus.internet.HttpResponse AV12HttpResponse ;
   private com.genexus.util.GXFile AV10TextFile ;
   private GXBaseCollection<app.SdtSDTInformeInditex> AV15SdtInformeInditexCollection ;
   private app.SdtSDTInformeInditex AV16sdtInformeInditex ;
}

