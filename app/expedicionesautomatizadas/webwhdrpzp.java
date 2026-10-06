package app.expedicionesautomatizadas ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.expedicionesautomatizadas.webwhdrpzp", "/app.expedicionesautomatizadas.webwhdrpzp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwhdrpzp extends GXWebObjectStub
{
   public webwhdrpzp( )
   {
   }

   public webwhdrpzp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwhdrpzp.class ));
   }

   public webwhdrpzp( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwhdrpzp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwhdrpzp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Web WHDRPZP";
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

