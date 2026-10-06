package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wclecturasproduccionexportcsv", "/app.wclecturasproduccionexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wclecturasproduccionexportcsv extends GXWebObjectStub
{
   public wclecturasproduccionexportcsv( )
   {
   }

   public wclecturasproduccionexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wclecturasproduccionexportcsv.class ));
   }

   public wclecturasproduccionexportcsv( int remoteHandle ,
                                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wclecturasproduccionexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wclecturasproduccionexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WCLecturas Produccion Export CSV";
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

