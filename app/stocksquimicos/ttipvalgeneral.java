package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.ttipvalgeneral", "/app.stocksquimicos.ttipvalgeneral"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttipvalgeneral extends GXWebObjectStub
{
   public ttipvalgeneral( )
   {
   }

   public ttipvalgeneral( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttipvalgeneral.class ));
   }

   public ttipvalgeneral( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttipvalgeneral_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttipvalgeneral_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TTIPVALGeneral";
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

