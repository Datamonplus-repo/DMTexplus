package app.albaranes ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.albaranes.creacionhashww", "/app.albaranes.creacionhashww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class creacionhashww extends GXWebObjectStub
{
   public creacionhashww( )
   {
   }

   public creacionhashww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( creacionhashww.class ));
   }

   public creacionhashww( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new creacionhashww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new creacionhashww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Creación Código Hash";
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

