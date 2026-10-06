package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.gestionlaboratorio.iluminante", "/app.gestionlaboratorio.iluminante"})
@jakarta.servlet.annotation.MultipartConfig
public final  class iluminante extends GXWebObjectStub
{
   public iluminante( )
   {
   }

   public iluminante( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( iluminante.class ));
   }

   public iluminante( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new iluminante_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new iluminante_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Iluminante";
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

