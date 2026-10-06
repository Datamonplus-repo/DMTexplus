package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.tpromd_www", "/app.facturacion.tpromd_www"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tpromd_www extends GXWebObjectStub
{
   public tpromd_www( )
   {
   }

   public tpromd_www( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tpromd_www.class ));
   }

   public tpromd_www( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tpromd_www_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tpromd_www_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Programas";
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

