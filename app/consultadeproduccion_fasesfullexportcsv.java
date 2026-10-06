package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.consultadeproduccion_fasesfullexportcsv", "/app.consultadeproduccion_fasesfullexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class consultadeproduccion_fasesfullexportcsv extends GXWebObjectStub
{
   public consultadeproduccion_fasesfullexportcsv( )
   {
   }

   public consultadeproduccion_fasesfullexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( consultadeproduccion_fasesfullexportcsv.class ));
   }

   public consultadeproduccion_fasesfullexportcsv( int remoteHandle ,
                                                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new consultadeproduccion_fasesfullexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new consultadeproduccion_fasesfullexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Consulta de Producción";
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

