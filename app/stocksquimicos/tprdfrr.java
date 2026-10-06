package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.tprdfrr", "/app.stocksquimicos.tprdfrr"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tprdfrr extends GXWebObjectStub
{
   public tprdfrr( )
   {
   }

   public tprdfrr( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tprdfrr.class ));
   }

   public tprdfrr( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tprdfrr_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tprdfrr_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Frases R (riesgos atribuidos a una sustancia o preparado peligroso.)";
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

