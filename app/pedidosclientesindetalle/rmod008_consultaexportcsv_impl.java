package app.pedidosclientesindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class rmod008_consultaexportcsv_impl extends GXWebProcedure
{
   public rmod008_consultaexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV22Data_json = AV23WebSession.getValue(httpContext.getMessage( "&Data_json", "")) ;
      AV17RMOD008_SDT.fromJSonString(AV22Data_json, null);
      AV29BarFecClifrom = localUtil.ctod( AV23WebSession.getValue("&BarFecClifrom"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      AV30BarFecClito = localUtil.ctod( AV23WebSession.getValue("&BarFecClito"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      AV23WebSession.remove("&BarFecClifrom");
      AV23WebSession.remove("&BarFecClito");
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
      S141 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'CLOSEDOCUMENT' */
      S171 ();
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
      if ( 1 == 0 )
      {
         AV14Random = (int)(GXutil.random( )*10000) ;
         AV12Filename = "./PrivateTempStorage/" + "RMOD008_ConsultaExportCSV-" + GXutil.trim( GXutil.str( AV14Random, 8, 0)) + ".csv" ;
         AV11TextFile.setSource( AV12Filename );
         AV11TextFile.create();
         /* Execute user subroutine: 'CHECKSTATUS' */
         S121 ();
         if (returnInSub) return;
         AV11TextFile.openWrite("");
         /* Execute user subroutine: 'CHECKSTATUS' */
         S121 ();
         if (returnInSub) return;
      }
      AV14Random = (int)(GXutil.random( )*10000) ;
      AV12Filename = "ProduccionenCursoExportCSV-" + GXutil.trim( GXutil.str( AV14Random, 8, 0)) + ".csv" ;
      AV11TextFile.setSource( AV12Filename );
      AV11TextFile.create();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      AV11TextFile.openWrite("");
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
   }

   public void S131( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV15TextFileLine = "" ;
      AV15TextFileLine += httpContext.getMessage( "Periodo", "") ;
      AV15TextFileLine += ";" ;
      AV15TextFileLine += GXutil.trim( localUtil.dtoc( AV29BarFecClifrom, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) ;
      AV15TextFileLine += ";" ;
      AV15TextFileLine += GXutil.trim( localUtil.dtoc( AV30BarFecClito, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) ;
      AV11TextFile.writeLine(AV15TextFileLine);
      AV15TextFileLine = "" ;
      AV15TextFileLine += httpContext.getMessage( "Cliente", "") ;
      AV15TextFileLine += ";" ;
      AV15TextFileLine += httpContext.getMessage( "Nombre", "") ;
      AV15TextFileLine += ";" ;
      AV15TextFileLine += httpContext.getMessage( "Almacen", "") ;
      AV15TextFileLine += ";" ;
      AV15TextFileLine += httpContext.getMessage( "Preparado", "") ;
      AV15TextFileLine += ";" ;
      AV15TextFileLine += httpContext.getMessage( "Tinte", "") ;
      AV15TextFileLine += ";" ;
      AV15TextFileLine += httpContext.getMessage( "Acabados", "") ;
      AV15TextFileLine += ";" ;
      AV15TextFileLine += httpContext.getMessage( "Total", "") ;
      AV11TextFile.writeLine(AV15TextFileLine);
   }

   public void S141( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV25Tot_A_k = DecimalUtil.ZERO ;
      AV24Tot_a_a = DecimalUtil.ZERO ;
      AV26Tot_a_p = DecimalUtil.ZERO ;
      AV27Tot_a_t = DecimalUtil.ZERO ;
      AV28Tot_l = DecimalUtil.ZERO ;
      if ( 1 == 0 )
      {
         AV33GXV1 = 1 ;
         while ( AV33GXV1 <= AV17RMOD008_SDT.size() )
         {
            AV10RMOD008_SDTItem = (app.pedidosclientesindetalle.SdtRMOD008_SDT_Item)((app.pedidosclientesindetalle.SdtRMOD008_SDT_Item)AV17RMOD008_SDT.elementAt(-1+AV33GXV1));
            AV15TextFileLine = "" ;
            /* Execute user subroutine: 'BEFOREWRITELINE' */
            S151 ();
            if (returnInSub) return;
            AV15TextFileLine += GXutil.str( AV10RMOD008_SDTItem.getgxTv_SdtRMOD008_SDT_Item_Clicod(), 6, 0) ;
            AV15TextFileLine += ";" ;
            GXt_char2 = AV15TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV10RMOD008_SDTItem.getgxTv_SdtRMOD008_SDT_Item_Clinom(), ";", ","), GXv_char3) ;
            rmod008_consultaexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV15TextFileLine += GXt_char2 ;
            AV15TextFileLine += ";" ;
            AV15TextFileLine += GXutil.str( AV10RMOD008_SDTItem.getgxTv_SdtRMOD008_SDT_Item_Saldo_k(), 12, 2) ;
            AV15TextFileLine += ";" ;
            AV15TextFileLine += GXutil.str( AV10RMOD008_SDTItem.getgxTv_SdtRMOD008_SDT_Item_Tot_p(), 13, 2) ;
            AV15TextFileLine += ";" ;
            AV15TextFileLine += GXutil.str( AV10RMOD008_SDTItem.getgxTv_SdtRMOD008_SDT_Item_Tot_t(), 13, 2) ;
            AV15TextFileLine += ";" ;
            AV15TextFileLine += GXutil.str( AV10RMOD008_SDTItem.getgxTv_SdtRMOD008_SDT_Item_Tot_a(), 13, 2) ;
            AV15TextFileLine += ";" ;
            AV15TextFileLine += GXutil.str( AV10RMOD008_SDTItem.getgxTv_SdtRMOD008_SDT_Item_Tot_l(), 13, 2) ;
            /* Execute user subroutine: 'AFTERWRITELINE' */
            S161 ();
            if (returnInSub) return;
            AV11TextFile.writeLine(AV15TextFileLine);
            AV33GXV1 = (int)(AV33GXV1+1) ;
         }
      }
      AV34GXV2 = 1 ;
      while ( AV34GXV2 <= AV17RMOD008_SDT.size() )
      {
         AV10RMOD008_SDTItem = (app.pedidosclientesindetalle.SdtRMOD008_SDT_Item)((app.pedidosclientesindetalle.SdtRMOD008_SDT_Item)AV17RMOD008_SDT.elementAt(-1+AV34GXV2));
         AV15TextFileLine = "" ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S151 ();
         if (returnInSub) return;
         AV15TextFileLine += GXutil.str( AV10RMOD008_SDTItem.getgxTv_SdtRMOD008_SDT_Item_Clicod(), 6, 0) ;
         AV15TextFileLine += ";" ;
         GXt_char2 = AV15TextFileLine ;
         GXv_char3[0] = GXt_char2 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV10RMOD008_SDTItem.getgxTv_SdtRMOD008_SDT_Item_Clinom(), ";", ","), GXv_char3) ;
         rmod008_consultaexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
         AV15TextFileLine += GXt_char2 ;
         AV15TextFileLine += ";" ;
         AV15TextFileLine += GXutil.str( AV10RMOD008_SDTItem.getgxTv_SdtRMOD008_SDT_Item_Saldo_k(), 12, 2) ;
         AV15TextFileLine += ";" ;
         AV15TextFileLine += GXutil.str( AV10RMOD008_SDTItem.getgxTv_SdtRMOD008_SDT_Item_Tot_p(), 13, 2) ;
         AV15TextFileLine += ";" ;
         AV15TextFileLine += GXutil.str( AV10RMOD008_SDTItem.getgxTv_SdtRMOD008_SDT_Item_Tot_t(), 13, 2) ;
         AV15TextFileLine += ";" ;
         AV15TextFileLine += GXutil.str( AV10RMOD008_SDTItem.getgxTv_SdtRMOD008_SDT_Item_Tot_a(), 13, 2) ;
         AV15TextFileLine += ";" ;
         AV15TextFileLine += GXutil.str( AV10RMOD008_SDTItem.getgxTv_SdtRMOD008_SDT_Item_Tot_l(), 13, 2) ;
         AV25Tot_A_k = AV25Tot_A_k.add((AV10RMOD008_SDTItem.getgxTv_SdtRMOD008_SDT_Item_Saldo_k())) ;
         AV24Tot_a_a = AV24Tot_a_a.add((AV10RMOD008_SDTItem.getgxTv_SdtRMOD008_SDT_Item_Tot_a())) ;
         AV26Tot_a_p = AV26Tot_a_p.add((AV10RMOD008_SDTItem.getgxTv_SdtRMOD008_SDT_Item_Tot_p())) ;
         AV27Tot_a_t = AV27Tot_a_t.add((AV10RMOD008_SDTItem.getgxTv_SdtRMOD008_SDT_Item_Tot_t())) ;
         /* Execute user subroutine: 'AFTERWRITELINE' */
         S161 ();
         if (returnInSub) return;
         AV11TextFile.writeLine(AV15TextFileLine);
         AV34GXV2 = (int)(AV34GXV2+1) ;
      }
      AV28Tot_l = AV24Tot_a_a.add(AV26Tot_a_p).add(AV27Tot_a_t).add(AV25Tot_A_k) ;
      AV15TextFileLine = "" ;
      /* Execute user subroutine: 'BEFOREWRITELINE' */
      S151 ();
      if (returnInSub) return;
      AV15TextFileLine += "" ;
      AV15TextFileLine += ";" ;
      AV15TextFileLine += "" ;
      AV15TextFileLine += ";" ;
      AV15TextFileLine += GXutil.str( AV25Tot_A_k, 14, 2) ;
      AV15TextFileLine += ";" ;
      AV15TextFileLine += GXutil.str( AV26Tot_a_p, 14, 2) ;
      AV15TextFileLine += ";" ;
      AV15TextFileLine += GXutil.str( AV27Tot_a_t, 14, 2) ;
      AV15TextFileLine += ";" ;
      AV15TextFileLine += GXutil.str( AV24Tot_a_a, 14, 2) ;
      AV15TextFileLine += ";" ;
      AV15TextFileLine += GXutil.str( AV28Tot_l, 14, 2) ;
      AV11TextFile.writeLine(AV15TextFileLine);
   }

   public void S171( )
   {
      /* 'CLOSEDOCUMENT' Routine */
      returnInSub = false ;
      if ( 1 == 0 )
      {
         AV11TextFile.close();
         /* Execute user subroutine: 'CHECKSTATUS' */
         S121 ();
         if (returnInSub) return;
         if ( AV11TextFile.getErrCode() == 0 )
         {
            if ( ! httpContext.isAjaxRequest( ) )
            {
               AV16HttpResponse.addHeader("Content-Type", "text/csv");
            }
            if ( ! httpContext.isAjaxRequest( ) )
            {
               AV16HttpResponse.addHeader("Content-Disposition", "attachment;filename=RMOD008_ConsultaExportCSV.csv");
            }
            AV16HttpResponse.addFile(AV11TextFile.getAbsoluteName());
         }
      }
      AV11TextFile.close();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      if ( AV11TextFile.getErrCode() == 0 )
      {
         if ( ! httpContext.isAjaxRequest( ) )
         {
            AV16HttpResponse.addHeader("Content-Type", "text/csv");
         }
         if ( ! httpContext.isAjaxRequest( ) )
         {
            AV16HttpResponse.addHeader("Content-Disposition", "attachment;filename=ProduccionenCursoExportCSV.csv");
         }
         AV16HttpResponse.addFile(AV11TextFile.getAbsoluteName());
      }
   }

   public void S121( )
   {
      /* 'CHECKSTATUS' Routine */
      returnInSub = false ;
      if ( AV11TextFile.getErrCode() != 0 )
      {
         AV12Filename = "" ;
         AV13ErrorMessage = AV11TextFile.getErrDescription() ;
         AV11TextFile.close();
         AV16HttpResponse.addString(AV13ErrorMessage);
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

   public void S181( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV18Session.getValue("PedidosClienteSinDetalle.RMOD008_ConsultaGridState"), "") == 0 )
      {
         AV20GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "PedidosClienteSinDetalle.RMOD008_ConsultaGridState"), null, null);
      }
      else
      {
         AV20GridState.fromxml(AV18Session.getValue("PedidosClienteSinDetalle.RMOD008_ConsultaGridState"), null, null);
      }
   }

   public void S151( )
   {
      /* 'BEFOREWRITELINE' Routine */
      returnInSub = false ;
   }

   public void S161( )
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
      AV22Data_json = "" ;
      AV23WebSession = httpContext.getWebSession();
      AV17RMOD008_SDT = new GXBaseCollection<app.pedidosclientesindetalle.SdtRMOD008_SDT_Item>(app.pedidosclientesindetalle.SdtRMOD008_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      AV29BarFecClifrom = GXutil.nullDate() ;
      AV30BarFecClito = GXutil.nullDate() ;
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV12Filename = "" ;
      AV11TextFile = new com.genexus.util.GXFile();
      AV15TextFileLine = "" ;
      AV25Tot_A_k = DecimalUtil.ZERO ;
      AV24Tot_a_a = DecimalUtil.ZERO ;
      AV26Tot_a_p = DecimalUtil.ZERO ;
      AV27Tot_a_t = DecimalUtil.ZERO ;
      AV28Tot_l = DecimalUtil.ZERO ;
      AV10RMOD008_SDTItem = new app.pedidosclientesindetalle.SdtRMOD008_SDT_Item(remoteHandle, context);
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV16HttpResponse = httpContext.getHttpResponse();
      AV13ErrorMessage = "" ;
      AV18Session = httpContext.getWebSession();
      AV20GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short Gx_err ;
   private int AV14Random ;
   private int AV33GXV1 ;
   private int AV34GXV2 ;
   private java.math.BigDecimal AV25Tot_A_k ;
   private java.math.BigDecimal AV24Tot_a_a ;
   private java.math.BigDecimal AV26Tot_a_p ;
   private java.math.BigDecimal AV27Tot_a_t ;
   private java.math.BigDecimal AV28Tot_l ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private java.util.Date AV29BarFecClifrom ;
   private java.util.Date AV30BarFecClito ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private String AV22Data_json ;
   private String AV15TextFileLine ;
   private String AV12Filename ;
   private String AV13ErrorMessage ;
   private com.genexus.webpanels.WebSession AV23WebSession ;
   private com.genexus.webpanels.WebSession AV18Session ;
   private com.genexus.util.GXFile AV11TextFile ;
   private com.genexus.internet.HttpResponse AV16HttpResponse ;
   private GXBaseCollection<app.pedidosclientesindetalle.SdtRMOD008_SDT_Item> AV17RMOD008_SDT ;
   private app.wwpbaseobjects.SdtWWPGridState AV20GridState ;
   private app.pedidosclientesindetalle.SdtRMOD008_SDT_Item AV10RMOD008_SDTItem ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
}

