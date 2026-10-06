package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.tpromd_lineas_wkp", "/app.facturacion.tpromd_lineas_wkp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tpromd_lineas_wkp extends GXWebObjectStub
{
   public tpromd_lineas_wkp( )
   {
   }

   public tpromd_lineas_wkp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tpromd_lineas_wkp.class ));
   }

   public tpromd_lineas_wkp( int remoteHandle ,
                             ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tpromd_lineas_wkp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tpromd_lineas_wkp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Programas, Lineas ";
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

