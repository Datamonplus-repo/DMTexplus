package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ralbmod", "/app.ralbmod"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ralbmod extends GXWebObjectStub
{
   public ralbmod( )
   {
   }

   public ralbmod( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ralbmod.class ));
   }

   public ralbmod( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ralbmod_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ralbmod_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "ENTRADA DE MALHA";
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

