package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.arst0029c", "/app.arst0029c"})
@jakarta.servlet.annotation.MultipartConfig
public final  class arst0029c extends GXWebObjectStub
{
   public arst0029c( )
   {
   }

   public arst0029c( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( arst0029c.class ));
   }

   public arst0029c( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new arst0029c_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new arst0029c_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "LTD.DIFERENCIA RECUENTOS C.Col";
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

