package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.informealbaranesproducciondetallado_wc", "/app.informealbaranesproducciondetallado_wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class informealbaranesproducciondetallado_wc extends GXWebObjectStub
{
   public informealbaranesproducciondetallado_wc( )
   {
   }

   public informealbaranesproducciondetallado_wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( informealbaranesproducciondetallado_wc.class ));
   }

   public informealbaranesproducciondetallado_wc( int remoteHandle ,
                                                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new informealbaranesproducciondetallado_wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new informealbaranesproducciondetallado_wc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Informe de Albaranes Produccion (Detalle)";
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

