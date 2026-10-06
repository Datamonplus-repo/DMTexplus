package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.webwst0011", "/app.stocksquimicos.webwst0011"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwst0011 extends GXWebObjectStub
{
   public webwst0011( )
   {
   }

   public webwst0011( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwst0011.class ));
   }

   public webwst0011( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwst0011_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwst0011_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Estadisticas";
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

