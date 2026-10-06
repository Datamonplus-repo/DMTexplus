package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tpeddg6", "/app.tpeddg6"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tpeddg6 extends GXWebObjectStub
{
   public tpeddg6( )
   {
   }

   public tpeddg6( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tpeddg6.class ));
   }

   public tpeddg6( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tpeddg6_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tpeddg6_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Parametros Fases";
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

