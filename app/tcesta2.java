package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tcesta2", "/app.tcesta2"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tcesta2 extends GXWebObjectStub
{
   public tcesta2( )
   {
   }

   public tcesta2( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tcesta2.class ));
   }

   public tcesta2( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tcesta2_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tcesta2_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "PRECIO ESTAMPACION";
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

