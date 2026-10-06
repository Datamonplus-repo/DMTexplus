package app.produccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.produccion.consultadeproduccion_packinglist", "/app.produccion.consultadeproduccion_packinglist"})
@jakarta.servlet.annotation.MultipartConfig
public final  class consultadeproduccion_packinglist extends GXWebObjectStub
{
   public consultadeproduccion_packinglist( )
   {
   }

   public consultadeproduccion_packinglist( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( consultadeproduccion_packinglist.class ));
   }

   public consultadeproduccion_packinglist( int remoteHandle ,
                                            ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new consultadeproduccion_packinglist_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new consultadeproduccion_packinglist_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Packing List";
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

