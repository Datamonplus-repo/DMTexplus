package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webwuti118", "/app.webwuti118"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwuti118 extends GXWebObjectStub
{
   public webwuti118( )
   {
   }

   public webwuti118( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwuti118.class ));
   }

   public webwuti118( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwuti118_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwuti118_impl(context).cleanup();
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

