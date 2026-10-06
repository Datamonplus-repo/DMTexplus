package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.ttipmaqprompt", "/app.ficherosbasicos.ttipmaqprompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttipmaqprompt extends GXWebObjectStub
{
   public ttipmaqprompt( )
   {
   }

   public ttipmaqprompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttipmaqprompt.class ));
   }

   public ttipmaqprompt( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttipmaqprompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttipmaqprompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona Tipo Maquina";
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

