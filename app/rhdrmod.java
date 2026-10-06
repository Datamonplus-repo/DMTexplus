package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.rhdrmod", "/app.rhdrmod"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rhdrmod extends GXWebObjectStub
{
   public rhdrmod( )
   {
   }

   public rhdrmod( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rhdrmod.class ));
   }

   public rhdrmod( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rhdrmod_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rhdrmod_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "ORDEM DERVIÇO,MODA 21";
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

