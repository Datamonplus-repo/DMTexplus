package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.seleccionproductosvariables", "/app.formulaciontinte.seleccionproductosvariables"})
@jakarta.servlet.annotation.MultipartConfig
public final  class seleccionproductosvariables extends GXWebObjectStub
{
   public seleccionproductosvariables( )
   {
   }

   public seleccionproductosvariables( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( seleccionproductosvariables.class ));
   }

   public seleccionproductosvariables( int remoteHandle ,
                                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new seleccionproductosvariables_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new seleccionproductosvariables_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Seleccionar Producto Variable (#)";
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

