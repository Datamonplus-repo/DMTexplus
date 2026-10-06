package app.comprasquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.comprasquimicos.informecompramesacumuladoexportcsv", "/app.comprasquimicos.informecompramesacumuladoexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class informecompramesacumuladoexportcsv extends GXWebObjectStub
{
   public informecompramesacumuladoexportcsv( )
   {
   }

   public informecompramesacumuladoexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( informecompramesacumuladoexportcsv.class ));
   }

   public informecompramesacumuladoexportcsv( int remoteHandle ,
                                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new informecompramesacumuladoexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new informecompramesacumuladoexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Informe Compra Mes Acumulado Export CSV";
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

