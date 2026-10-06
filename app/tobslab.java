package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tobslab", "/app.tobslab"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tobslab extends GXWebObjectStub
{
   public tobslab( )
   {
   }

   public tobslab( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tobslab.class ));
   }

   public tobslab( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tobslab_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tobslab_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "OBSERVACIONES LAB";
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

