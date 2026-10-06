package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class listadodeformulas_impl extends GXWebProcedure
{
   public listadodeformulas_impl( com.genexus.internet.HttpContext context )
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
      gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( ! entryPointCalled )
      {
         A396EmprCod = gxfirstwebparm ;
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            AV9CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
            AV9CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
            AV10ForSer = httpContext.GetPar( "ForSer") ;
            AV10ForSer = httpContext.GetPar( "ForSer") ;
            AV11ForColNum = (int)(GXutil.lval( httpContext.GetPar( "ForColNum"))) ;
            AV11ForColNum = (int)(GXutil.lval( httpContext.GetPar( "ForColNum"))) ;
            AV12ForColNom = httpContext.GetPar( "ForColNom") ;
            AV12ForColNom = httpContext.GetPar( "ForColNom") ;
            AV13ForRelBan = CommonUtil.decimalVal( httpContext.GetPar( "ForRelBan"), ".") ;
            AV14ForNumCol = (int)(GXutil.lval( httpContext.GetPar( "ForNumCol"))) ;
            AV15TipColCod = (byte)(GXutil.lval( httpContext.GetPar( "TipColCod"))) ;
            AV8Station = httpContext.GetPar( "Station") ;
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
      GXt_int1 = (byte)(AV16FlagModa21) ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MOD005", ""), GXv_int2) ;
      listadodeformulas_impl.this.GXt_int1 = GXv_int2[0] ;
      AV16FlagModa21 = GXt_int1 ;
      if ( AV16FlagModa21 == 1 )
      {
         callWebObject(formatLink("app.formulaciontinte.rmod005", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV9CliCod,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV9CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV10ForSer)),GXutil.URLEncode(GXutil.rtrim(AV10ForSer)),GXutil.URLEncode(GXutil.ltrimstr(AV11ForColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV11ForColNum,6,0)),GXutil.URLEncode(GXutil.rtrim(AV12ForColNom)),GXutil.URLEncode(GXutil.rtrim(AV12ForColNom)),GXutil.URLEncode(GXutil.ltrimstr(AV15TipColCod,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV15TipColCod,2,0)),GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "SCR", "")))}, new String[] {"EmprCod","PCliCod","UCliCod","PSerie","Userie","PNumCol","UNumCol","PColor","UColor","Tipcolcodfrom","tipcolcodto","Output"}) );
         httpContext.wjLocDisableFrm = (byte)(2) ;
         httpContext.nUserReturn = (byte)(1) ;
         if ( httpContext.willRedirect( ) )
         {
            httpContext.redirect( httpContext.wjLoc );
            httpContext.wjLoc = "" ;
         }
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      if ( httpContext.willRedirect( ) )
      {
         httpContext.redirect( httpContext.wjLoc );
         httpContext.wjLoc = "" ;
      }
      cleanup();
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
      A396EmprCod = "" ;
      AV10ForSer = "" ;
      AV12ForColNom = "" ;
      AV13ForRelBan = DecimalUtil.ZERO ;
      AV8Station = "" ;
      GXv_int2 = new byte[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV15TipColCod ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private short gxcookieaux ;
   private short AV16FlagModa21 ;
   private short Gx_err ;
   private int AV9CliCod ;
   private int AV11ForColNum ;
   private int AV14ForNumCol ;
   private java.math.BigDecimal AV13ForRelBan ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV10ForSer ;
   private String AV12ForColNom ;
   private String AV8Station ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
}

