package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.tcmfiww", "/app.facturacion.tcmfiww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tcmfiww extends GXWebObjectStub
{
   public tcmfiww( )
   {
   }

   public tcmfiww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tcmfiww.class ));
   }

   public tcmfiww( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tcmfiww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tcmfiww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " CmFi";
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

