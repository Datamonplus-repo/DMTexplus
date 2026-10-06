package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.albfas", "/app.albfas"})
@jakarta.servlet.annotation.MultipartConfig
public final  class albfas extends GXWebObjectStub
{
   public albfas( )
   {
   }

   public albfas( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( albfas.class ));
   }

   public albfas( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new albfas_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new albfas_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Tabla ALBFAS";
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

