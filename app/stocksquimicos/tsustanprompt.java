package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.tsustanprompt", "/app.stocksquimicos.tsustanprompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tsustanprompt extends GXWebObjectStub
{
   public tsustanprompt( )
   {
   }

   public tsustanprompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tsustanprompt.class ));
   }

   public tsustanprompt( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tsustanprompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tsustanprompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona Sustancias a controlar";
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

