package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tcrtincprompt", "/app.tcrtincprompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tcrtincprompt extends GXWebObjectStub
{
   public tcrtincprompt( )
   {
   }

   public tcrtincprompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tcrtincprompt.class ));
   }

   public tcrtincprompt( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tcrtincprompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tcrtincprompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona Control de Incidencias";
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

