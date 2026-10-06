package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wc_analisiscostesquimicosexportcsv", "/app.wc_analisiscostesquimicosexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wc_analisiscostesquimicosexportcsv extends GXWebObjectStub
{
   public wc_analisiscostesquimicosexportcsv( )
   {
   }

   public wc_analisiscostesquimicosexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wc_analisiscostesquimicosexportcsv.class ));
   }

   public wc_analisiscostesquimicosexportcsv( int remoteHandle ,
                                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wc_analisiscostesquimicosexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wc_analisiscostesquimicosexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WC_Analisis Costes Quimicos Export CSV";
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

}

