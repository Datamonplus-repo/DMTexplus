package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class amrec_test_pr_impl extends GXWebProcedure
{
   public amrec_test_pr_impl( com.genexus.internet.HttpContext context )
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
      AV12ValoMx = DecimalUtil.doubleToDec(150) ;
      AV18ValoMx2 = AV12ValoMx.add(DecimalUtil.doubleToDec(5)) ;
      AV11ValoMn = DecimalUtil.doubleToDec(120) ;
      AV19ValoMn2 = AV11ValoMn.subtract(DecimalUtil.doubleToDec(5)) ;
      AV13Valor = DecimalUtil.doubleToDec(135) ;
      AV9PorcError = (short)(10) ;
      AV8Cantidad_repetir = (short)(GXutil.Int( AV9PorcError/ (double) (100)*1000)) ;
      AV17IsRango = true ;
      AV14ValorNuevo = (DecimalUtil.doubleToDec(GXutil.random( )).multiply((AV18ValoMx2.subtract(AV19ValoMn2)))).add(AV19ValoMn2) ;
      if ( ( DecimalUtil.compareTo(AV14ValorNuevo, AV11ValoMn) < 0 ) || ( DecimalUtil.compareTo(AV14ValorNuevo, AV12ValoMx) > 0 ) )
      {
         AV10HTTPResponse.addString(httpContext.getMessage( "<p>El valor ESTA FUERA DE RANGO: ", "")+GXutil.str( AV14ValorNuevo, 12, 2)+httpContext.getMessage( "</p>", ""));
         AV17IsRango = false ;
      }
      if ( AV17IsRango )
      {
         AV10HTTPResponse.addString(httpContext.getMessage( "<p>El valor : ", "")+GXutil.str( AV14ValorNuevo, 12, 2)+httpContext.getMessage( "</p>", ""));
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
      AV12ValoMx = DecimalUtil.ZERO ;
      AV18ValoMx2 = DecimalUtil.ZERO ;
      AV11ValoMn = DecimalUtil.ZERO ;
      AV19ValoMn2 = DecimalUtil.ZERO ;
      AV13Valor = DecimalUtil.ZERO ;
      AV14ValorNuevo = DecimalUtil.ZERO ;
      AV10HTTPResponse = httpContext.getHttpResponse();
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short AV9PorcError ;
   private short AV8Cantidad_repetir ;
   private short Gx_err ;
   private java.math.BigDecimal AV12ValoMx ;
   private java.math.BigDecimal AV18ValoMx2 ;
   private java.math.BigDecimal AV11ValoMn ;
   private java.math.BigDecimal AV19ValoMn2 ;
   private java.math.BigDecimal AV13Valor ;
   private java.math.BigDecimal AV14ValorNuevo ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV17IsRango ;
   private com.genexus.internet.HttpResponse AV10HTTPResponse ;
}

