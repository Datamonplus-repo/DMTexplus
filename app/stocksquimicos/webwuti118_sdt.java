package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.webwuti118_sdt", "/app.stocksquimicos.webwuti118_sdt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwuti118_sdt extends GXWebObjectStub
{
   public webwuti118_sdt( )
   {
   }

   public webwuti118_sdt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwuti118_sdt.class ));
   }

   public webwuti118_sdt( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwuti118_sdt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwuti118_sdt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Analisis Consumos, Compras, Stock final";
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

