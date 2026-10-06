package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tdevcru", "/app.tdevcru"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tdevcru extends GXWebObjectStub
{
   public tdevcru( )
   {
   }

   public tdevcru( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tdevcru.class ));
   }

   public tdevcru( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tdevcru_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tdevcru_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Devolucion Entradas en Almacen";
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

