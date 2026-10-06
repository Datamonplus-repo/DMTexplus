package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.rlprepr1", "/app.rlprepr1"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rlprepr1 extends GXWebObjectStub
{
   public rlprepr1( )
   {
   }

   public rlprepr1( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rlprepr1.class ));
   }

   public rlprepr1( int remoteHandle ,
                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rlprepr1_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rlprepr1_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "LTDO.PRECIOS PRODUCTOS Alfab.";
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

