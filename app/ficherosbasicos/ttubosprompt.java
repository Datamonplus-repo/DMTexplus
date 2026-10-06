package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.ttubosprompt", "/app.ficherosbasicos.ttubosprompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttubosprompt extends GXWebObjectStub
{
   public ttubosprompt( )
   {
   }

   public ttubosprompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttubosprompt.class ));
   }

   public ttubosprompt( int remoteHandle ,
                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttubosprompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttubosprompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona TUBOS";
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

