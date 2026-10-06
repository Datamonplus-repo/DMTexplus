package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.barfas", "/app.barfas"})
@jakarta.servlet.annotation.MultipartConfig
public final  class barfas extends GXWebObjectStub
{
   public barfas( )
   {
   }

   public barfas( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( barfas.class ));
   }

   public barfas( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new barfas_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new barfas_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Tabla BARFAS";
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

