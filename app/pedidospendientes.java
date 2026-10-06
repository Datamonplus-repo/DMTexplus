package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.pedidospendientes", "/app.pedidospendientes"})
@jakarta.servlet.annotation.MultipartConfig
public final  class pedidospendientes extends GXWebObjectStub
{
   public pedidospendientes( )
   {
   }

   public pedidospendientes( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( pedidospendientes.class ));
   }

   public pedidospendientes( int remoteHandle ,
                             ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new pedidospendientes_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new pedidospendientes_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Tabla LPEDID";
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

