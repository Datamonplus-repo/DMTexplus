package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tproesp", "/app.tproesp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tproesp extends GXWebObjectStub
{
   public tproesp( )
   {
   }

   public tproesp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tproesp.class ));
   }

   public tproesp( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tproesp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tproesp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Procesos Especiales";
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

