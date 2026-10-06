package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcrelacionensayos", "/app.wcrelacionensayos"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcrelacionensayos extends GXWebObjectStub
{
   public wcrelacionensayos( )
   {
   }

   public wcrelacionensayos( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcrelacionensayos.class ));
   }

   public wcrelacionensayos( int remoteHandle ,
                             ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcrelacionensayos_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcrelacionensayos_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Relacion de Ensayos";
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

