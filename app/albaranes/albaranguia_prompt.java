package app.albaranes ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.albaranes.albaranguia_prompt", "/app.albaranes.albaranguia_prompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class albaranguia_prompt extends GXWebObjectStub
{
   public albaranguia_prompt( )
   {
   }

   public albaranguia_prompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( albaranguia_prompt.class ));
   }

   public albaranguia_prompt( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new albaranguia_prompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new albaranguia_prompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona MANTENIMIENTO HOJA RUTA";
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

