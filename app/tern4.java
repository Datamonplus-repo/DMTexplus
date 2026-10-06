package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tern4", "/app.tern4"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tern4 extends GXWebObjectStub
{
   public tern4( )
   {
   }

   public tern4( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tern4.class ));
   }

   public tern4( int remoteHandle ,
                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tern4_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tern4_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "CONCEPTO N4";
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

