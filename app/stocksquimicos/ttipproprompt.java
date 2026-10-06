package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.ttipproprompt", "/app.stocksquimicos.ttipproprompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttipproprompt extends GXWebObjectStub
{
   public ttipproprompt( )
   {
   }

   public ttipproprompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttipproprompt.class ));
   }

   public ttipproprompt( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttipproprompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttipproprompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona SUBFAMILIAS";
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

