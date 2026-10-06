package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.ttipdefprompt", "/app.ficherosbasicos.ttipdefprompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttipdefprompt extends GXWebObjectStub
{
   public ttipdefprompt( )
   {
   }

   public ttipdefprompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttipdefprompt.class ));
   }

   public ttipdefprompt( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttipdefprompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttipdefprompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona Tipo Defecto";
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

