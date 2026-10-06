package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webwuti014", "/app.webwuti014"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwuti014 extends GXWebObjectStub
{
   public webwuti014( )
   {
   }

   public webwuti014( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwuti014.class ));
   }

   public webwuti014( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwuti014_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwuti014_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Modificacion LOTE Recuentos";
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

