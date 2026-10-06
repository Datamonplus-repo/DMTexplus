package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.entradadeproductosalmacen_trn", "/app.stocksquimicos.entradadeproductosalmacen_trn"})
@jakarta.servlet.annotation.MultipartConfig
public final  class entradadeproductosalmacen_trn extends GXWebObjectStub
{
   public entradadeproductosalmacen_trn( )
   {
   }

   public entradadeproductosalmacen_trn( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( entradadeproductosalmacen_trn.class ));
   }

   public entradadeproductosalmacen_trn( int remoteHandle ,
                                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new entradadeproductosalmacen_trn_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new entradadeproductosalmacen_trn_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Entrada de Productos Almacen";
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

