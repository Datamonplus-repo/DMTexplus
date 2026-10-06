package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.tmetpedgeneral", "/app.stocksquimicos.tmetpedgeneral"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmetpedgeneral extends GXWebObjectStub
{
   public tmetpedgeneral( )
   {
   }

   public tmetpedgeneral( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmetpedgeneral.class ));
   }

   public tmetpedgeneral( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmetpedgeneral_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmetpedgeneral_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TMETPEDGeneral";
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

