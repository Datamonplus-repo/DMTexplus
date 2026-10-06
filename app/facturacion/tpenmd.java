package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.tpenmd", "/app.facturacion.tpenmd"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tpenmd extends GXWebObjectStub
{
   public tpenmd( )
   {
   }

   public tpenmd( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tpenmd.class ));
   }

   public tpenmd( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tpenmd_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tpenmd_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Penalizaciones Moda 21";
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

