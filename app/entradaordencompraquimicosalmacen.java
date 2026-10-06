package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.entradaordencompraquimicosalmacen", "/app.entradaordencompraquimicosalmacen"})
@jakarta.servlet.annotation.MultipartConfig
public final  class entradaordencompraquimicosalmacen extends GXWebObjectStub
{
   public entradaordencompraquimicosalmacen( )
   {
   }

   public entradaordencompraquimicosalmacen( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( entradaordencompraquimicosalmacen.class ));
   }

   public entradaordencompraquimicosalmacen( int remoteHandle ,
                                             ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new entradaordencompraquimicosalmacen_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new entradaordencompraquimicosalmacen_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Entrada Orden Compra Quimicos Almacen";
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

