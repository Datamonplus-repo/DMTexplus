package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.presuos", "/app.presuos"})
@jakarta.servlet.annotation.MultipartConfig
public final  class presuos extends GXWebObjectStub
{
   public presuos( )
   {
   }

   public presuos( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( presuos.class ));
   }

   public presuos( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new presuos_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new presuos_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Resumen Ordenes Serviço";
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

