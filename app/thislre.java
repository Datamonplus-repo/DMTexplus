package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.thislre", "/app.thislre"})
@jakarta.servlet.annotation.MultipartConfig
public final  class thislre extends GXWebObjectStub
{
   public thislre( )
   {
   }

   public thislre( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( thislre.class ));
   }

   public thislre( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new thislre_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new thislre_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "HISTORICO RECETAS (LINEAS)";
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

