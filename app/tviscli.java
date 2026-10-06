package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tviscli", "/app.tviscli"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tviscli extends GXWebObjectStub
{
   public tviscli( )
   {
   }

   public tviscli( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tviscli.class ));
   }

   public tviscli( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tviscli_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tviscli_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "CONTROL VISITAS CLIENTES";
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

