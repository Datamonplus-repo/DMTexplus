package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tern1", "/app.tern1"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tern1 extends GXWebObjectStub
{
   public tern1( )
   {
   }

   public tern1( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tern1.class ));
   }

   public tern1( int remoteHandle ,
                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tern1_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tern1_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "CONCEPTO N1";
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

