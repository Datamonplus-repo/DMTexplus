package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.rfo0014", "/app.formulaciontinte.rfo0014"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rfo0014 extends GXWebObjectStub
{
   public rfo0014( )
   {
   }

   public rfo0014( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rfo0014.class ));
   }

   public rfo0014( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rfo0014_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rfo0014_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Listado Procesos Quimicos";
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

