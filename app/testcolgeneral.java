package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.testcolgeneral", "/app.testcolgeneral"})
@jakarta.servlet.annotation.MultipartConfig
public final  class testcolgeneral extends GXWebObjectStub
{
   public testcolgeneral( )
   {
   }

   public testcolgeneral( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( testcolgeneral.class ));
   }

   public testcolgeneral( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new testcolgeneral_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new testcolgeneral_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TEst Col General";
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

