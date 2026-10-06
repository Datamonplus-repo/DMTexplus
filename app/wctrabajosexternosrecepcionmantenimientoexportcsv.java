package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wctrabajosexternosrecepcionmantenimientoexportcsv", "/app.wctrabajosexternosrecepcionmantenimientoexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wctrabajosexternosrecepcionmantenimientoexportcsv extends GXWebObjectStub
{
   public wctrabajosexternosrecepcionmantenimientoexportcsv( )
   {
   }

   public wctrabajosexternosrecepcionmantenimientoexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wctrabajosexternosrecepcionmantenimientoexportcsv.class ));
   }

   public wctrabajosexternosrecepcionmantenimientoexportcsv( int remoteHandle ,
                                                             ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wctrabajosexternosrecepcionmantenimientoexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wctrabajosexternosrecepcionmantenimientoexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WCTrabajos Externos Recepcion Mantenimiento Export CSV";
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

