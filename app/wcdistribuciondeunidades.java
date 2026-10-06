package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcdistribuciondeunidades", "/app.wcdistribuciondeunidades"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcdistribuciondeunidades extends GXWebObjectStub
{
   public wcdistribuciondeunidades( )
   {
   }

   public wcdistribuciondeunidades( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcdistribuciondeunidades.class ));
   }

   public wcdistribuciondeunidades( int remoteHandle ,
                                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcdistribuciondeunidades_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcdistribuciondeunidades_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WCDistribucionde Unidades";
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

