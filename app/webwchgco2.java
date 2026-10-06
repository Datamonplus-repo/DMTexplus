package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webwchgco2", "/app.webwchgco2"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwchgco2 extends GXWebObjectStub
{
   public webwchgco2( )
   {
   }

   public webwchgco2( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwchgco2.class ));
   }

   public webwchgco2( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwchgco2_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwchgco2_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Duplico COLOR para otros Clientes-Articulo";
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

