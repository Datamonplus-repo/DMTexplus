package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.gridinifity", "/app.gridinifity"})
@jakarta.servlet.annotation.MultipartConfig
public final  class gridinifity extends GXWebObjectStub
{
   public gridinifity( )
   {
   }

   public gridinifity( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( gridinifity.class ));
   }

   public gridinifity( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new gridinifity_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new gridinifity_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Producto";
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

