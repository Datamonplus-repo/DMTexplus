package app.produccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.produccion.consultadeproduccion_modfecent", "/app.produccion.consultadeproduccion_modfecent"})
@jakarta.servlet.annotation.MultipartConfig
public final  class consultadeproduccion_modfecent extends GXWebObjectStub
{
   public consultadeproduccion_modfecent( )
   {
   }

   public consultadeproduccion_modfecent( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( consultadeproduccion_modfecent.class ));
   }

   public consultadeproduccion_modfecent( int remoteHandle ,
                                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new consultadeproduccion_modfecent_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new consultadeproduccion_modfecent_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Modificacion Fecha Entrega";
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

