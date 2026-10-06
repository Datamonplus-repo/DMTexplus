package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.diferenciasderecuento", "/app.diferenciasderecuento"})
@jakarta.servlet.annotation.MultipartConfig
public final  class diferenciasderecuento extends GXWebObjectStub
{
   public diferenciasderecuento( )
   {
   }

   public diferenciasderecuento( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( diferenciasderecuento.class ));
   }

   public diferenciasderecuento( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new diferenciasderecuento_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new diferenciasderecuento_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Diferencias De Recuento";
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

