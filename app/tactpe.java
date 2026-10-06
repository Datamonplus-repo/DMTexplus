package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tactpe", "/app.tactpe"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tactpe extends GXWebObjectStub
{
   public tactpe( )
   {
   }

   public tactpe( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tactpe.class ));
   }

   public tactpe( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tactpe_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tactpe_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "CALCULO DE LA ACTIVIDAD EN PER";
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

