package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tprvgengeneral", "/app.tprvgengeneral"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tprvgengeneral extends GXWebObjectStub
{
   public tprvgengeneral( )
   {
   }

   public tprvgengeneral( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tprvgengeneral.class ));
   }

   public tprvgengeneral( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tprvgengeneral_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tprvgengeneral_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TPRVGENGeneral";
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

