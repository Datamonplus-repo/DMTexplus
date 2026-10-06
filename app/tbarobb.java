package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tbarobb", "/app.tbarobb"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tbarobb extends GXWebObjectStub
{
   public tbarobb( )
   {
   }

   public tbarobb( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tbarobb.class ));
   }

   public tbarobb( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tbarobb_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tbarobb_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "OBSERVACIONES BLANQUEO";
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

