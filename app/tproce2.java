package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tproce2", "/app.tproce2"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tproce2 extends GXWebObjectStub
{
   public tproce2( )
   {
   }

   public tproce2( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tproce2.class ));
   }

   public tproce2( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tproce2_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tproce2_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "PROCE2";
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

