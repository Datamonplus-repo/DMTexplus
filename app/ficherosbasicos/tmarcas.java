package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tmarcas", "/app.ficherosbasicos.tmarcas"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmarcas extends GXWebObjectStub
{
   public tmarcas( )
   {
   }

   public tmarcas( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmarcas.class ));
   }

   public tmarcas( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmarcas_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmarcas_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Marcas Cliente";
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

