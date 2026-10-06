package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tdisob1", "/app.tdisob1"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tdisob1 extends GXWebObjectStub
{
   public tdisob1( )
   {
   }

   public tdisob1( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tdisob1.class ));
   }

   public tdisob1( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tdisob1_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tdisob1_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Observ. HDR (Solo Agregar)";
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

