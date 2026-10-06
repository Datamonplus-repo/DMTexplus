package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tmsolicprompt", "/app.tmsolicprompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmsolicprompt extends GXWebObjectStub
{
   public tmsolicprompt( )
   {
   }

   public tmsolicprompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmsolicprompt.class ));
   }

   public tmsolicprompt( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmsolicprompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmsolicprompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona Solicitudes de Mantenimiento";
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

