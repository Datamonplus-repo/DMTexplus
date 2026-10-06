package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.rcvnc000", "/app.rcvnc000"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rcvnc000 extends GXWebObjectStub
{
   public rcvnc000( )
   {
   }

   public rcvnc000( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rcvnc000.class ));
   }

   public rcvnc000( int remoteHandle ,
                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rcvnc000_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rcvnc000_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "No conformidad";
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

