package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.seleccioncolortinte", "/app.formulaciontinte.seleccioncolortinte"})
@jakarta.servlet.annotation.MultipartConfig
public final  class seleccioncolortinte extends GXWebObjectStub
{
   public seleccioncolortinte( )
   {
   }

   public seleccioncolortinte( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( seleccioncolortinte.class ));
   }

   public seleccioncolortinte( int remoteHandle ,
                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new seleccioncolortinte_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new seleccioncolortinte_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona Mto Formulas Tinte";
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

