package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webwprdt10", "/app.webwprdt10"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwprdt10 extends GXWebObjectStub
{
   public webwprdt10( )
   {
   }

   public webwprdt10( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwprdt10.class ));
   }

   public webwprdt10( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwprdt10_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwprdt10_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Web Listado Produccion Tinte DataTime";
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

