package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tprvgenprompt", "/app.tprvgenprompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tprvgenprompt extends GXWebObjectStub
{
   public tprvgenprompt( )
   {
   }

   public tprvgenprompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tprvgenprompt.class ));
   }

   public tprvgenprompt( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tprvgenprompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tprvgenprompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona Mantenimiento de Proveedores";
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

