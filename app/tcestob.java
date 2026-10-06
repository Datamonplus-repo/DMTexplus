package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tcestob", "/app.tcestob"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tcestob extends GXWebObjectStub
{
   public tcestob( )
   {
   }

   public tcestob( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tcestob.class ));
   }

   public tcestob( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tcestob_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tcestob_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "CESTOBS";
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

