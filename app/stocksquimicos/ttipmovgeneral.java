package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.ttipmovgeneral", "/app.stocksquimicos.ttipmovgeneral"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttipmovgeneral extends GXWebObjectStub
{
   public ttipmovgeneral( )
   {
   }

   public ttipmovgeneral( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttipmovgeneral.class ));
   }

   public ttipmovgeneral( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttipmovgeneral_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttipmovgeneral_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TTIPMOVGeneral";
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

