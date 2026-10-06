package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.temppar", "/app.temppar"})
@jakarta.servlet.annotation.MultipartConfig
public final  class temppar extends GXWebObjectStub
{
   public temppar( )
   {
   }

   public temppar( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( temppar.class ));
   }

   public temppar( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new temppar_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new temppar_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "PARAMETROS EMPRESA";
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

