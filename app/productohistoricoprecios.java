package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.productohistoricoprecios", "/app.productohistoricoprecios"})
@jakarta.servlet.annotation.MultipartConfig
public final  class productohistoricoprecios extends GXWebObjectStub
{
   public productohistoricoprecios( )
   {
   }

   public productohistoricoprecios( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( productohistoricoprecios.class ));
   }

   public productohistoricoprecios( int remoteHandle ,
                                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new productohistoricoprecios_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new productohistoricoprecios_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Movimientos Productos (Entradas)";
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

