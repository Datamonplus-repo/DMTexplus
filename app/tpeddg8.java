package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tpeddg8", "/app.tpeddg8"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tpeddg8 extends GXWebObjectStub
{
   public tpeddg8( )
   {
   }

   public tpeddg8( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tpeddg8.class ));
   }

   public tpeddg8( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tpeddg8_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tpeddg8_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Obervaciones";
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

