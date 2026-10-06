package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.recuen_trn", "/app.stocksquimicos.recuen_trn"})
@jakarta.servlet.annotation.MultipartConfig
public final  class recuen_trn extends GXWebObjectStub
{
   public recuen_trn( )
   {
   }

   public recuen_trn( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( recuen_trn.class ));
   }

   public recuen_trn( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new recuen_trn_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new recuen_trn_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Tabla RECUEN";
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

