package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.consultaloteproductoexportcsv", "/app.consultaloteproductoexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class consultaloteproductoexportcsv extends GXWebObjectStub
{
   public consultaloteproductoexportcsv( )
   {
   }

   public consultaloteproductoexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( consultaloteproductoexportcsv.class ));
   }

   public consultaloteproductoexportcsv( int remoteHandle ,
                                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new consultaloteproductoexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new consultaloteproductoexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Consulta Lote Producto Export CSV";
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

