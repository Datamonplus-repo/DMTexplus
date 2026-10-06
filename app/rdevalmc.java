package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.rdevalmc", "/app.rdevalmc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rdevalmc extends GXWebObjectStub
{
   public rdevalmc( )
   {
   }

   public rdevalmc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rdevalmc.class ));
   }

   public rdevalmc( int remoteHandle ,
                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rdevalmc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rdevalmc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "DEVOLUCION PRODUCTO";
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

