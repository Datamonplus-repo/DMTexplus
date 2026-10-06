package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tactse", "/app.tactse"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tactse extends GXWebObjectStub
{
   public tactse( )
   {
   }

   public tactse( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tactse.class ));
   }

   public tactse( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tactse_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tactse_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "CALCULO ACTIVIDAD SECAR";
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

