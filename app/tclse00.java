package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tclse00", "/app.tclse00"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tclse00 extends GXWebObjectStub
{
   public tclse00( )
   {
   }

   public tclse00( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tclse00.class ));
   }

   public tclse00( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tclse00_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tclse00_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Mantenimiento Productos desde Cierre";
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

