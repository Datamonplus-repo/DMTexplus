package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.tcmfi", "/app.facturacion.tcmfi"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tcmfi extends GXWebObjectStub
{
   public tcmfi( )
   {
   }

   public tcmfi( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tcmfi.class ));
   }

   public tcmfi( int remoteHandle ,
                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tcmfi_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tcmfi_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "CmFi";
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

