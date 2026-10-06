package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.rlprepr3", "/app.rlprepr3"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rlprepr3 extends GXWebObjectStub
{
   public rlprepr3( )
   {
   }

   public rlprepr3( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rlprepr3.class ));
   }

   public rlprepr3( int remoteHandle ,
                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rlprepr3_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rlprepr3_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "LTDO.PRECIOS PROVEED/PROD.Alfa";
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

