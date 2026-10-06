package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tactxx", "/app.tactxx"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tactxx extends GXWebObjectStub
{
   public tactxx( )
   {
   }

   public tactxx( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tactxx.class ));
   }

   public tactxx( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tactxx_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tactxx_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "CALCULO ACTIVIDA PREPARACION";
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

