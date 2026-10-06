package app.almacensindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.almacensindetalle.preparoxmldevolucionesenvioat", "/app.almacensindetalle.preparoxmldevolucionesenvioat"})
@jakarta.servlet.annotation.MultipartConfig
public final  class preparoxmldevolucionesenvioat extends GXWebObjectStub
{
   public preparoxmldevolucionesenvioat( )
   {
   }

   public preparoxmldevolucionesenvioat( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( preparoxmldevolucionesenvioat.class ));
   }

   public preparoxmldevolucionesenvioat( int remoteHandle ,
                                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new preparoxmldevolucionesenvioat_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new preparoxmldevolucionesenvioat_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Preparo XML Devoluciones Envio AT";
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

