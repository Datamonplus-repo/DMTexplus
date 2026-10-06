package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tern2", "/app.tern2"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tern2 extends GXWebObjectStub
{
   public tern2( )
   {
   }

   public tern2( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tern2.class ));
   }

   public tern2( int remoteHandle ,
                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tern2_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tern2_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "CONCEPTO N2";
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

