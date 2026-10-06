package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.rst1013", "/app.rst1013"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rst1013 extends GXWebObjectStub
{
   public rst1013( )
   {
   }

   public rst1013( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rst1013.class ));
   }

   public rst1013( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rst1013_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rst1013_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Listado Productos Bajos Minimos";
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

