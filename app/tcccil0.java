package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tcccil0", "/app.tcccil0"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tcccil0 extends GXWebObjectStub
{
   public tcccil0( )
   {
   }

   public tcccil0( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tcccil0.class ));
   }

   public tcccil0( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tcccil0_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tcccil0_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "ESTADOS CILINDROS";
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

