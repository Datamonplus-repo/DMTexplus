package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tactab", "/app.tactab"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tactab extends GXWebObjectStub
{
   public tactab( )
   {
   }

   public tactab( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tactab.class ));
   }

   public tactab( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tactab_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tactab_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "CALCULO ACTIVIDAD ABRIR";
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

