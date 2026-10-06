package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tens103", "/app.tens103"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tens103 extends GXWebObjectStub
{
   public tens103( )
   {
   }

   public tens103( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tens103.class ));
   }

   public tens103( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tens103_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tens103_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "OBSERVACIONES";
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

