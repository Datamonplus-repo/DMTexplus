package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.rcvrc000", "/app.rcvrc000"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rcvrc000 extends GXWebObjectStub
{
   public rcvrc000( )
   {
   }

   public rcvrc000( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rcvrc000.class ));
   }

   public rcvrc000( int remoteHandle ,
                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rcvrc000_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rcvrc000_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Reclamacion";
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

