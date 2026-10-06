package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.rmei001", "/app.facturacion.rmei001"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rmei001 extends GXWebObjectStub
{
   public rmei001( )
   {
   }

   public rmei001( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rmei001.class ));
   }

   public rmei001( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rmei001_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rmei001_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "LISTAGEM TARIFAS ESPECIAL";
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

