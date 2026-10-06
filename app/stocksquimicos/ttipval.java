package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.ttipval", "/app.stocksquimicos.ttipval"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttipval extends GXWebObjectStub
{
   public ttipval( )
   {
   }

   public ttipval( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttipval.class ));
   }

   public ttipval( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttipval_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttipval_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Tipo Validez";
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

