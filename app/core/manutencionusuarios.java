package app.core ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.core.manutencionusuarios", "/app.core.manutencionusuarios"})
@jakarta.servlet.annotation.MultipartConfig
public final  class manutencionusuarios extends GXWebObjectStub
{
   public manutencionusuarios( )
   {
   }

   public manutencionusuarios( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( manutencionusuarios.class ));
   }

   public manutencionusuarios( int remoteHandle ,
                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new manutencionusuarios_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new manutencionusuarios_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " USUARIOS";
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

