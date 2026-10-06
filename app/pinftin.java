package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.pinftin", "/app.pinftin"})
@jakarta.servlet.annotation.MultipartConfig
public final  class pinftin extends GXWebObjectStub
{
   public pinftin( )
   {
   }

   public pinftin( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( pinftin.class ));
   }

   public pinftin( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new pinftin_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new pinftin_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Consumos x Mes y Sección";
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

