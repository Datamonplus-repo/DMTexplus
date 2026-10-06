package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tobscolm", "/app.tobscolm"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tobscolm extends GXWebObjectStub
{
   public tobscolm( )
   {
   }

   public tobscolm( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tobscolm.class ));
   }

   public tobscolm( int remoteHandle ,
                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tobscolm_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tobscolm_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Observaciones (mas...)";
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

