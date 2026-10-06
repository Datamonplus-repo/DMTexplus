package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.consultadeproduccion_agrupadas", "/app.consultadeproduccion_agrupadas"})
@jakarta.servlet.annotation.MultipartConfig
public final  class consultadeproduccion_agrupadas extends GXWebObjectStub
{
   public consultadeproduccion_agrupadas( )
   {
   }

   public consultadeproduccion_agrupadas( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( consultadeproduccion_agrupadas.class ));
   }

   public consultadeproduccion_agrupadas( int remoteHandle ,
                                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new consultadeproduccion_agrupadas_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new consultadeproduccion_agrupadas_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Producciones Agrupadas Tinte";
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

