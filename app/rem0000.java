package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.rem0000", "/app.rem0000"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rem0000 extends GXWebObjectStub
{
   public rem0000( )
   {
   }

   public rem0000( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rem0000.class ));
   }

   public rem0000( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rem0000_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rem0000_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "LISTADO DE EMPESAS";
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

