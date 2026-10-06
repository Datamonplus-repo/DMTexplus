package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tcatdefgeneral", "/app.tcatdefgeneral"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tcatdefgeneral extends GXWebObjectStub
{
   public tcatdefgeneral( )
   {
   }

   public tcatdefgeneral( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tcatdefgeneral.class ));
   }

   public tcatdefgeneral( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tcatdefgeneral_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tcatdefgeneral_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TCat Def General";
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

