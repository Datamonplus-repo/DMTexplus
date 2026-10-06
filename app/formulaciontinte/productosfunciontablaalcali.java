package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.productosfunciontablaalcali", "/app.formulaciontinte.productosfunciontablaalcali"})
@jakarta.servlet.annotation.MultipartConfig
public final  class productosfunciontablaalcali extends GXWebObjectStub
{
   public productosfunciontablaalcali( )
   {
   }

   public productosfunciontablaalcali( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( productosfunciontablaalcali.class ));
   }

   public productosfunciontablaalcali( int remoteHandle ,
                                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new productosfunciontablaalcali_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new productosfunciontablaalcali_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Productos en funcion de Tabla Alcali";
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

