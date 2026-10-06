package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttohost0", "/app.ttohost0"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttohost0 extends GXWebObjectStub
{
   public ttohost0( )
   {
   }

   public ttohost0( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttohost0.class ));
   }

   public ttohost0( int remoteHandle ,
                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttohost0_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttohost0_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TOHOST0";
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

