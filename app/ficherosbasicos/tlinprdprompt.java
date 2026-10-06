package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tlinprdprompt", "/app.ficherosbasicos.tlinprdprompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tlinprdprompt extends GXWebObjectStub
{
   public tlinprdprompt( )
   {
   }

   public tlinprdprompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tlinprdprompt.class ));
   }

   public tlinprdprompt( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tlinprdprompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tlinprdprompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona LINEAS DE PRODUCCION";
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

