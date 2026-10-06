package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tcoscr0", "/app.tcoscr0"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tcoscr0 extends GXWebObjectStub
{
   public tcoscr0( )
   {
   }

   public tcoscr0( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tcoscr0.class ));
   }

   public tcoscr0( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tcoscr0_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tcoscr0_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "COSTE COLOR CON COSTE FABRICA COSTE AGUAS";
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

