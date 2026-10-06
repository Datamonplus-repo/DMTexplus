package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tcil000", "/app.tcil000"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tcil000 extends GXWebObjectStub
{
   public tcil000( )
   {
   }

   public tcil000( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tcil000.class ));
   }

   public tcil000( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tcil000_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tcil000_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Orden de GRabacion CILINDROS";
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

