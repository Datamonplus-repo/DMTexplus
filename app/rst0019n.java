package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.rst0019n", "/app.rst0019n"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rst0019n extends GXWebObjectStub
{
   public rst0019n( )
   {
   }

   public rst0019n( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rst0019n.class ));
   }

   public rst0019n( int remoteHandle ,
                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rst0019n_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rst0019n_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "LTDO PRODUCTOS RECONTAR,NOMBRE";
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

