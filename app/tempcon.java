package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tempcon", "/app.tempcon"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tempcon extends GXWebObjectStub
{
   public tempcon( )
   {
   }

   public tempcon( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tempcon.class ));
   }

   public tempcon( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tempcon_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tempcon_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "EMPRESAS EN CONTABILIDAD";
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

