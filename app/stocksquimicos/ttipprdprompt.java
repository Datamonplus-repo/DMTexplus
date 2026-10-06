package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.ttipprdprompt", "/app.stocksquimicos.ttipprdprompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttipprdprompt extends GXWebObjectStub
{
   public ttipprdprompt( )
   {
   }

   public ttipprdprompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttipprdprompt.class ));
   }

   public ttipprdprompt( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttipprdprompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttipprdprompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona TIPO DE PRODUCTO";
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

