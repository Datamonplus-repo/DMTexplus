package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.informediferenciasrecuento", "/app.informediferenciasrecuento"})
@jakarta.servlet.annotation.MultipartConfig
public final  class informediferenciasrecuento extends GXWebObjectStub
{
   public informediferenciasrecuento( )
   {
   }

   public informediferenciasrecuento( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( informediferenciasrecuento.class ));
   }

   public informediferenciasrecuento( int remoteHandle ,
                                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new informediferenciasrecuento_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new informediferenciasrecuento_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Informe Diferencias Recuento";
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

