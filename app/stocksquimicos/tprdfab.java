package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.tprdfab", "/app.stocksquimicos.tprdfab"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tprdfab extends GXWebObjectStub
{
   public tprdfab( )
   {
   }

   public tprdfab( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tprdfab.class ));
   }

   public tprdfab( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tprdfab_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tprdfab_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Fabricantes Productos Quimicos";
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

