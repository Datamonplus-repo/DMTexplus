package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tdevcruprompt", "/app.tdevcruprompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tdevcruprompt extends GXWebObjectStub
{
   public tdevcruprompt( )
   {
   }

   public tdevcruprompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tdevcruprompt.class ));
   }

   public tdevcruprompt( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tdevcruprompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tdevcruprompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona Devolucion Entradas en Almacen";
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

